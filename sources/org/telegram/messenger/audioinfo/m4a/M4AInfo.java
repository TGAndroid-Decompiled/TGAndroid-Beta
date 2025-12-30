package org.telegram.messenger.audioinfo.m4a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.telegram.messenger.audioinfo.AudioInfo;
import org.telegram.messenger.audioinfo.mp3.ID3v1Genre;

public class M4AInfo extends AudioInfo {
    static final Logger LOGGER = Logger.getLogger(M4AInfo.class.getName());
    private final Level debugLevel;
    private byte rating;
    private BigDecimal speed;
    private short tempo;
    private BigDecimal volume;

    public M4AInfo(InputStream inputStream) {
        this(inputStream, Level.FINEST);
    }

    public M4AInfo(InputStream inputStream, Level level) {
        this.debugLevel = level;
        MP4Input mP4Input = new MP4Input(inputStream);
        Logger logger = LOGGER;
        if (logger.isLoggable(level)) {
            logger.log(level, mP4Input.toString());
        }
        ftyp(mP4Input.nextChild("ftyp"));
        moov(mP4Input.nextChildUpTo("moov"));
    }

    void ftyp(MP4Atom mP4Atom) {
        Logger logger = LOGGER;
        if (logger.isLoggable(this.debugLevel)) {
            logger.log(this.debugLevel, mP4Atom.toString());
        }
        String strTrim = mP4Atom.readString(4, "ISO8859_1").trim();
        this.brand = strTrim;
        if (strTrim.matches("M4V|MP4|mp42|isom")) {
            logger.warning(mP4Atom.getPath() + ": brand=" + this.brand + " (experimental)");
        } else if (!this.brand.matches("M4A|M4P")) {
            logger.warning(mP4Atom.getPath() + ": brand=" + this.brand + " (expected M4A or M4P)");
        }
        this.version = String.valueOf(mP4Atom.readInt());
    }

    void moov(MP4Atom mP4Atom) {
        MP4Atom mP4AtomNextChild;
        Logger logger = LOGGER;
        if (logger.isLoggable(this.debugLevel)) {
            logger.log(this.debugLevel, mP4Atom.toString());
        }
        while (mP4Atom.hasMoreChildren()) {
            mP4AtomNextChild = mP4Atom.nextChild();
            String type = mP4AtomNextChild.getType();
            type.hashCode();
            switch (type) {
                case "mvhd":
                    mvhd(mP4AtomNextChild);
                    break;
                case "trak":
                    trak(mP4AtomNextChild);
                    break;
                case "udta":
                    udta(mP4AtomNextChild);
                    break;
            }
        }
    }

    void mvhd(MP4Atom mP4Atom) {
        Logger logger = LOGGER;
        if (logger.isLoggable(this.debugLevel)) {
            logger.log(this.debugLevel, mP4Atom.toString());
        }
        byte b = mP4Atom.readByte();
        mP4Atom.skip(3);
        mP4Atom.skip(b == 1 ? 16 : 8);
        int i = mP4Atom.readInt();
        long j = b == 1 ? mP4Atom.readLong() : mP4Atom.readInt();
        if (this.duration == 0) {
            this.duration = (j * 1000) / i;
        } else if (logger.isLoggable(this.debugLevel)) {
            long j2 = (j * 1000) / i;
            if (Math.abs(this.duration - j2) > 2) {
                logger.log(this.debugLevel, "mvhd: duration " + this.duration + " -> " + j2);
            }
        }
        this.speed = mP4Atom.readIntegerFixedPoint();
        this.volume = mP4Atom.readShortFixedPoint();
    }

    void trak(MP4Atom mP4Atom) {
        Logger logger = LOGGER;
        if (logger.isLoggable(this.debugLevel)) {
            logger.log(this.debugLevel, mP4Atom.toString());
        }
        mdia(mP4Atom.nextChildUpTo("mdia"));
    }

    void mdia(MP4Atom mP4Atom) {
        Logger logger = LOGGER;
        if (logger.isLoggable(this.debugLevel)) {
            logger.log(this.debugLevel, mP4Atom.toString());
        }
        mdhd(mP4Atom.nextChild("mdhd"));
    }

    void mdhd(MP4Atom mP4Atom) {
        Logger logger = LOGGER;
        if (logger.isLoggable(this.debugLevel)) {
            logger.log(this.debugLevel, mP4Atom.toString());
        }
        byte b = mP4Atom.readByte();
        mP4Atom.skip(3);
        mP4Atom.skip(b == 1 ? 16 : 8);
        int i = mP4Atom.readInt();
        long j = b == 1 ? mP4Atom.readLong() : mP4Atom.readInt();
        if (this.duration == 0) {
            this.duration = (j * 1000) / i;
            return;
        }
        if (logger.isLoggable(this.debugLevel)) {
            long j2 = (j * 1000) / i;
            if (Math.abs(this.duration - j2) > 2) {
                logger.log(this.debugLevel, "mdhd: duration " + this.duration + " -> " + j2);
            }
        }
    }

    void udta(MP4Atom mP4Atom) {
        Logger logger = LOGGER;
        if (logger.isLoggable(this.debugLevel)) {
            logger.log(this.debugLevel, mP4Atom.toString());
        }
        while (mP4Atom.hasMoreChildren()) {
            MP4Atom mP4AtomNextChild = mP4Atom.nextChild();
            if ("meta".equals(mP4AtomNextChild.getType())) {
                meta(mP4AtomNextChild);
                return;
            }
        }
    }

    void meta(MP4Atom mP4Atom) {
        Logger logger = LOGGER;
        if (logger.isLoggable(this.debugLevel)) {
            logger.log(this.debugLevel, mP4Atom.toString());
        }
        mP4Atom.skip(4);
        while (mP4Atom.hasMoreChildren()) {
            MP4Atom mP4AtomNextChild = mP4Atom.nextChild();
            if ("ilst".equals(mP4AtomNextChild.getType())) {
                ilst(mP4AtomNextChild);
                return;
            }
        }
    }

    void ilst(MP4Atom mP4Atom) {
        Logger logger = LOGGER;
        if (logger.isLoggable(this.debugLevel)) {
            logger.log(this.debugLevel, mP4Atom.toString());
        }
        while (mP4Atom.hasMoreChildren()) {
            MP4Atom mP4AtomNextChild = mP4Atom.nextChild();
            Logger logger2 = LOGGER;
            if (logger2.isLoggable(this.debugLevel)) {
                logger2.log(this.debugLevel, mP4AtomNextChild.toString());
            }
            if (mP4AtomNextChild.getRemaining() == 0) {
                if (logger2.isLoggable(this.debugLevel)) {
                    logger2.log(this.debugLevel, mP4AtomNextChild.getPath() + ": contains no value");
                }
            } else {
                data(mP4AtomNextChild.nextChildUpTo("data"));
            }
        }
    }

    void data(MP4Atom mP4Atom) {
        Logger logger = LOGGER;
        if (logger.isLoggable(this.debugLevel)) {
            logger.log(this.debugLevel, mP4Atom.toString());
        }
        mP4Atom.skip(4);
        mP4Atom.skip(4);
        String type = mP4Atom.getParent().getType();
        type.hashCode();
        switch (type) {
            case "aART":
                this.albumArtist = mP4Atom.readString("UTF-8");
                break;
            case "covr":
                try {
                    byte[] bytes = mP4Atom.readBytes();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    options.inSampleSize = 1;
                    BitmapFactory.decodeByteArray(bytes, 0, bytes.length, options);
                    int i = options.outWidth;
                    if (i > 800 || options.outHeight > 800) {
                        for (int iMax = Math.max(i, options.outHeight); iMax > 800; iMax /= 2) {
                            options.inSampleSize *= 2;
                        }
                    }
                    options.inJustDecodeBounds = false;
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bytes, 0, bytes.length, options);
                    this.cover = bitmapDecodeByteArray;
                    if (bitmapDecodeByteArray != null) {
                        float fMax = Math.max(bitmapDecodeByteArray.getWidth(), this.cover.getHeight()) / 120.0f;
                        if (fMax > 0.0f) {
                            this.smallCover = Bitmap.createScaledBitmap(this.cover, (int) (r0.getWidth() / fMax), (int) (this.cover.getHeight() / fMax), true);
                        } else {
                            this.smallCover = this.cover;
                        }
                        if (this.smallCover == null) {
                            this.smallCover = this.cover;
                            break;
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
                break;
            case "cpil":
                this.compilation = mP4Atom.readBoolean();
                break;
            case "cprt":
            case "©cpy":
                String str = this.copyright;
                if (str == null || str.trim().length() == 0) {
                    this.copyright = mP4Atom.readString("UTF-8");
                    break;
                }
                break;
            case "disk":
                mP4Atom.skip(2);
                this.disc = mP4Atom.readShort();
                this.discs = mP4Atom.readShort();
                break;
            case "gnre":
                String str2 = this.genre;
                if (str2 == null || str2.trim().length() == 0) {
                    if (mP4Atom.getRemaining() == 2) {
                        ID3v1Genre genre = ID3v1Genre.getGenre(mP4Atom.readShort() - 1);
                        if (genre != null) {
                            this.genre = genre.getDescription();
                            break;
                        }
                    } else {
                        this.genre = mP4Atom.readString("UTF-8");
                        break;
                    }
                }
                break;
            case "rtng":
                this.rating = mP4Atom.readByte();
                break;
            case "tmpo":
                this.tempo = mP4Atom.readShort();
                break;
            case "trkn":
                mP4Atom.skip(2);
                this.track = mP4Atom.readShort();
                this.tracks = mP4Atom.readShort();
                break;
            case "©ART":
                this.artist = mP4Atom.readString("UTF-8");
                break;
            case "©alb":
                this.album = mP4Atom.readString("UTF-8");
                break;
            case "©cmt":
                this.comment = mP4Atom.readString("UTF-8");
                break;
            case "©com":
            case "©wrt":
                String str3 = this.composer;
                if (str3 == null || str3.trim().length() == 0) {
                    this.composer = mP4Atom.readString("UTF-8");
                    break;
                }
                break;
            case "©day":
                String strTrim = mP4Atom.readString("UTF-8").trim();
                if (strTrim.length() >= 4) {
                    try {
                        this.year = Short.valueOf(strTrim.substring(0, 4)).shortValue();
                        break;
                    } catch (NumberFormatException unused) {
                        return;
                    }
                }
                break;
            case "©gen":
                String str4 = this.genre;
                if (str4 == null || str4.trim().length() == 0) {
                    this.genre = mP4Atom.readString("UTF-8");
                    break;
                }
                break;
            case "©grp":
                this.grouping = mP4Atom.readString("UTF-8");
                break;
            case "©lyr":
                this.lyrics = mP4Atom.readString("UTF-8");
                break;
            case "©nam":
                this.title = mP4Atom.readString("UTF-8");
                break;
        }
    }
}
