package org.telegram.messenger.audioinfo.m4a;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.telegram.messenger.audioinfo.AudioInfo;

public class M4AInfo extends AudioInfo {
    static final Logger LOGGER = Logger.getLogger(M4AInfo.class.getName());
    private final Level debugLevel;
    private byte rating;
    private BigDecimal speed;
    private short tempo;
    private BigDecimal volume;

    public M4AInfo(InputStream inputStream) throws IOException {
        this(inputStream, Level.FINEST);
    }

    public M4AInfo(InputStream inputStream, Level level) throws IOException {
        this.debugLevel = level;
        MP4Input mP4Input = new MP4Input(inputStream);
        Logger logger = LOGGER;
        if (logger.isLoggable(level)) {
            logger.log(level, mP4Input.toString());
        }
        ftyp(mP4Input.nextChild("ftyp"));
        moov(mP4Input.nextChildUpTo("moov"));
    }

    void ftyp(MP4Atom mP4Atom) throws IOException {
        Logger logger = LOGGER;
        if (logger.isLoggable(this.debugLevel)) {
            logger.log(this.debugLevel, mP4Atom.toString());
        }
        String trim = mP4Atom.readString(4, "ISO8859_1").trim();
        this.brand = trim;
        if (trim.matches("M4V|MP4|mp42|isom")) {
            logger.warning(mP4Atom.getPath() + ": brand=" + this.brand + " (experimental)");
        } else if (!this.brand.matches("M4A|M4P")) {
            logger.warning(mP4Atom.getPath() + ": brand=" + this.brand + " (expected M4A or M4P)");
        }
        this.version = String.valueOf(mP4Atom.readInt());
    }

    void moov(MP4Atom mP4Atom) throws IOException {
        Logger logger = LOGGER;
        if (logger.isLoggable(this.debugLevel)) {
            logger.log(this.debugLevel, mP4Atom.toString());
        }
        while (mP4Atom.hasMoreChildren()) {
            MP4Atom nextChild = mP4Atom.nextChild();
            String type = nextChild.getType();
            type.hashCode();
            char c = 65535;
            switch (type.hashCode()) {
                case 3363941:
                    if (type.equals("mvhd")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3568424:
                    if (type.equals("trak")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3585340:
                    if (type.equals("udta")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    mvhd(nextChild);
                    break;
                case 1:
                    trak(nextChild);
                    break;
                case 2:
                    udta(nextChild);
                    break;
            }
        }
    }

    void mvhd(MP4Atom mP4Atom) throws IOException {
        Logger logger = LOGGER;
        if (logger.isLoggable(this.debugLevel)) {
            logger.log(this.debugLevel, mP4Atom.toString());
        }
        byte readByte = mP4Atom.readByte();
        mP4Atom.skip(3);
        mP4Atom.skip(readByte == 1 ? 16 : 8);
        int readInt = mP4Atom.readInt();
        long readLong = readByte == 1 ? mP4Atom.readLong() : mP4Atom.readInt();
        if (this.duration == 0) {
            this.duration = (readLong * 1000) / readInt;
        } else if (logger.isLoggable(this.debugLevel)) {
            long j = (readLong * 1000) / readInt;
            if (Math.abs(this.duration - j) > 2) {
                logger.log(this.debugLevel, "mvhd: duration " + this.duration + " -> " + j);
            }
        }
        this.speed = mP4Atom.readIntegerFixedPoint();
        this.volume = mP4Atom.readShortFixedPoint();
    }

    void trak(MP4Atom mP4Atom) throws IOException {
        Logger logger = LOGGER;
        if (logger.isLoggable(this.debugLevel)) {
            logger.log(this.debugLevel, mP4Atom.toString());
        }
        mdia(mP4Atom.nextChildUpTo("mdia"));
    }

    void mdia(MP4Atom mP4Atom) throws IOException {
        Logger logger = LOGGER;
        if (logger.isLoggable(this.debugLevel)) {
            logger.log(this.debugLevel, mP4Atom.toString());
        }
        mdhd(mP4Atom.nextChild("mdhd"));
    }

    void mdhd(MP4Atom mP4Atom) throws IOException {
        Logger logger = LOGGER;
        if (logger.isLoggable(this.debugLevel)) {
            logger.log(this.debugLevel, mP4Atom.toString());
        }
        byte readByte = mP4Atom.readByte();
        mP4Atom.skip(3);
        mP4Atom.skip(readByte == 1 ? 16 : 8);
        int readInt = mP4Atom.readInt();
        long readLong = readByte == 1 ? mP4Atom.readLong() : mP4Atom.readInt();
        if (this.duration == 0) {
            this.duration = (readLong * 1000) / readInt;
            return;
        }
        if (logger.isLoggable(this.debugLevel)) {
            long j = (readLong * 1000) / readInt;
            if (Math.abs(this.duration - j) > 2) {
                logger.log(this.debugLevel, "mdhd: duration " + this.duration + " -> " + j);
            }
        }
    }

    void udta(MP4Atom mP4Atom) throws IOException {
        Logger logger = LOGGER;
        if (logger.isLoggable(this.debugLevel)) {
            logger.log(this.debugLevel, mP4Atom.toString());
        }
        while (mP4Atom.hasMoreChildren()) {
            MP4Atom nextChild = mP4Atom.nextChild();
            if ("meta".equals(nextChild.getType())) {
                meta(nextChild);
                return;
            }
        }
    }

    void meta(MP4Atom mP4Atom) throws IOException {
        Logger logger = LOGGER;
        if (logger.isLoggable(this.debugLevel)) {
            logger.log(this.debugLevel, mP4Atom.toString());
        }
        mP4Atom.skip(4);
        while (mP4Atom.hasMoreChildren()) {
            MP4Atom nextChild = mP4Atom.nextChild();
            if ("ilst".equals(nextChild.getType())) {
                ilst(nextChild);
                return;
            }
        }
    }

    void ilst(MP4Atom mP4Atom) throws IOException {
        Logger logger = LOGGER;
        if (logger.isLoggable(this.debugLevel)) {
            logger.log(this.debugLevel, mP4Atom.toString());
        }
        while (mP4Atom.hasMoreChildren()) {
            MP4Atom nextChild = mP4Atom.nextChild();
            Logger logger2 = LOGGER;
            if (logger2.isLoggable(this.debugLevel)) {
                logger2.log(this.debugLevel, nextChild.toString());
            }
            if (nextChild.getRemaining() == 0) {
                if (logger2.isLoggable(this.debugLevel)) {
                    logger2.log(this.debugLevel, nextChild.getPath() + ": contains no value");
                }
            } else {
                data(nextChild.nextChildUpTo("data"));
            }
        }
    }

    void data(org.telegram.messenger.audioinfo.m4a.MP4Atom r8) throws java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.audioinfo.m4a.M4AInfo.data(org.telegram.messenger.audioinfo.m4a.MP4Atom):void");
    }
}
