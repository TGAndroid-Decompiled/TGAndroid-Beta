package org.telegram.messenger.audioinfo.m4a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.commonmark.node.Node;
import org.telegram.messenger.audioinfo.AudioInfo;
import org.telegram.messenger.audioinfo.mp3.ID3v1Genre$EnumUnboxingLocalUtility;
import org.telegram.messenger.audioinfo.util.PositionInputStream;

public final class M4AInfo extends AudioInfo {
    public static final Logger LOGGER = Logger.getLogger(M4AInfo.class.getName());
    public final Level debugLevel;

    public M4AInfo(BufferedInputStream bufferedInputStream) throws IOException {
        MP4Atom mP4AtomNextChild;
        MP4Atom mP4AtomNextChild2;
        MP4Atom mP4AtomNextChild3;
        MP4Atom mP4Atom;
        int i = 3;
        int i2 = 4;
        Level level = Level.FINEST;
        this.debugLevel = level;
        MP4Atom mP4Atom2 = new MP4Atom(new PositionInputStream(bufferedInputStream), null, "", 1);
        Logger logger = LOGGER;
        if (logger.isLoggable(level)) {
            logger.log(level, mP4Atom2.toString());
        }
        MP4Atom mP4AtomNextChild4 = mP4Atom2.nextChild();
        String str = (String) mP4AtomNextChild4.lastChild;
        if (!str.matches("ftyp")) {
            throw new IOException("atom type mismatch, expected ftyp, got ".concat(str));
        }
        if (logger.isLoggable(level)) {
            logger.log(level, mP4AtomNextChild4.toString());
        }
        String strTrim = mP4AtomNextChild4.readString(4, "ISO8859_1").trim();
        this.brand = strTrim;
        if (strTrim.matches("M4V|MP4|mp42|isom")) {
            StringBuilder sb = new StringBuilder();
            StringBuffer stringBuffer = new StringBuffer();
            MP4Atom.appendPath(stringBuffer, mP4AtomNextChild4);
            sb.append(stringBuffer.toString());
            sb.append(": brand=");
            sb.append(this.brand);
            sb.append(" (experimental)");
            logger.warning(sb.toString());
        } else if (!this.brand.matches("M4A|M4P")) {
            StringBuilder sb2 = new StringBuilder();
            StringBuffer stringBuffer2 = new StringBuffer();
            MP4Atom.appendPath(stringBuffer2, mP4AtomNextChild4);
            sb2.append(stringBuffer2.toString());
            sb2.append(": brand=");
            sb2.append(this.brand);
            sb2.append(" (expected M4A or M4P)");
            logger.warning(sb2.toString());
        }
        String.valueOf(((DataInputStream) mP4AtomNextChild4.prev).readInt());
        do {
            mP4AtomNextChild = mP4Atom2.nextChild();
        } while (!((String) mP4AtomNextChild.lastChild).matches("moov"));
        if (logger.isLoggable(this.debugLevel)) {
            logger.log(this.debugLevel, mP4AtomNextChild.toString());
        }
        while (mP4AtomNextChild.hasMoreChildren()) {
            MP4Atom mP4AtomNextChild5 = mP4AtomNextChild.nextChild();
            switch ((String) mP4AtomNextChild5.lastChild) {
                case "mvhd":
                    if (logger.isLoggable(this.debugLevel)) {
                        logger.log(this.debugLevel, mP4AtomNextChild5.toString());
                    }
                    DataInputStream dataInputStream = (DataInputStream) mP4AtomNextChild5.prev;
                    byte b = dataInputStream.readByte();
                    mP4AtomNextChild5.skip(i);
                    mP4AtomNextChild5.skip(b == 1 ? 16 : 8);
                    int i3 = dataInputStream.readInt();
                    long j = b == 1 ? dataInputStream.readLong() : dataInputStream.readInt();
                    if (this.duration == 0) {
                        this.duration = (j * 1000) / ((long) i3);
                    } else if (logger.isLoggable(this.debugLevel)) {
                        long j2 = (j * 1000) / ((long) i3);
                        if (Math.abs(this.duration - j2) > 2) {
                            logger.log(this.debugLevel, "mvhd: duration " + this.duration + " -> " + j2);
                        }
                    }
                    new BigDecimal(String.valueOf((int) dataInputStream.readShort()) + "" + String.valueOf(dataInputStream.readUnsignedShort()));
                    new BigDecimal(String.valueOf((int) dataInputStream.readByte()) + "" + String.valueOf(dataInputStream.readUnsignedByte()));
                    i = 3;
                    break;
                case "trak":
                    if (logger.isLoggable(this.debugLevel)) {
                        logger.log(this.debugLevel, mP4AtomNextChild5.toString());
                    }
                    do {
                        if (mP4AtomNextChild5.getRemaining() <= 0) {
                            throw new IOException("atom type mismatch, not found: ".concat("mdia"));
                        }
                        mP4AtomNextChild2 = mP4AtomNextChild5.nextChild();
                    } while (!((String) mP4AtomNextChild2.lastChild).matches("mdia"));
                    if (logger.isLoggable(this.debugLevel)) {
                        logger.log(this.debugLevel, mP4AtomNextChild2.toString());
                    }
                    MP4Atom mP4AtomNextChild6 = mP4AtomNextChild2.nextChild();
                    String str2 = (String) mP4AtomNextChild6.lastChild;
                    if (!str2.matches("mdhd")) {
                        throw new IOException("atom type mismatch, expected mdhd, got ".concat(str2));
                    }
                    if (logger.isLoggable(this.debugLevel)) {
                        logger.log(this.debugLevel, mP4AtomNextChild6.toString());
                    }
                    DataInputStream dataInputStream2 = (DataInputStream) mP4AtomNextChild6.prev;
                    byte b2 = dataInputStream2.readByte();
                    mP4AtomNextChild6.skip(i);
                    mP4AtomNextChild6.skip(b2 == 1 ? 16 : 8);
                    int i4 = dataInputStream2.readInt();
                    long j3 = b2 == 1 ? dataInputStream2.readLong() : dataInputStream2.readInt();
                    if (this.duration == 0) {
                        this.duration = (j3 * 1000) / ((long) i4);
                    } else if (logger.isLoggable(this.debugLevel)) {
                        long j4 = (j3 * 1000) / ((long) i4);
                        if (Math.abs(this.duration - j4) > 2) {
                            logger.log(this.debugLevel, "mdhd: duration " + this.duration + " -> " + j4);
                        }
                    }
                    break;
                    break;
                case "udta":
                    if (logger.isLoggable(this.debugLevel)) {
                        logger.log(this.debugLevel, mP4AtomNextChild5.toString());
                    }
                    while (true) {
                        if (!mP4AtomNextChild5.hasMoreChildren()) {
                            continue;
                        }
                        MP4Atom mP4AtomNextChild7 = mP4AtomNextChild5.nextChild();
                        if ("meta".equals((String) mP4AtomNextChild7.lastChild)) {
                            if (logger.isLoggable(this.debugLevel)) {
                                logger.log(this.debugLevel, mP4AtomNextChild7.toString());
                            }
                            mP4AtomNextChild7.skip(i2);
                            while (mP4AtomNextChild7.hasMoreChildren()) {
                                MP4Atom mP4AtomNextChild8 = mP4AtomNextChild7.nextChild();
                                if ("ilst".equals((String) mP4AtomNextChild8.lastChild)) {
                                    if (logger.isLoggable(this.debugLevel)) {
                                        logger.log(this.debugLevel, mP4AtomNextChild8.toString());
                                    }
                                    while (mP4AtomNextChild8.hasMoreChildren()) {
                                        MP4Atom mP4AtomNextChild9 = mP4AtomNextChild8.nextChild();
                                        if (logger.isLoggable(this.debugLevel)) {
                                            logger.log(this.debugLevel, mP4AtomNextChild9.toString());
                                        }
                                        if (mP4AtomNextChild9.getRemaining() != 0) {
                                            do {
                                                if (mP4AtomNextChild9.getRemaining() <= 0) {
                                                    throw new IOException("atom type mismatch, not found: ".concat("data"));
                                                }
                                                mP4AtomNextChild3 = mP4AtomNextChild9.nextChild();
                                            } while (!((String) mP4AtomNextChild3.lastChild).matches("data"));
                                            if (logger.isLoggable(this.debugLevel)) {
                                                logger.log(this.debugLevel, mP4AtomNextChild3.toString());
                                            }
                                            mP4AtomNextChild3.skip(i2);
                                            mP4AtomNextChild3.skip(i2);
                                            String str3 = (String) ((Node) mP4AtomNextChild3.firstChild).lastChild;
                                            DataInputStream dataInputStream3 = (DataInputStream) mP4AtomNextChild3.prev;
                                            switch (str3) {
                                                case "aART":
                                                    mP4Atom = mP4AtomNextChild8;
                                                    this.albumArtist = mP4AtomNextChild3.readString((int) mP4AtomNextChild3.getRemaining(), "UTF-8");
                                                    mP4AtomNextChild8 = mP4Atom;
                                                    break;
                                                case "covr":
                                                    mP4Atom = mP4AtomNextChild8;
                                                    try {
                                                        int remaining = (int) mP4AtomNextChild3.getRemaining();
                                                        byte[] bArr = new byte[remaining];
                                                        dataInputStream3.readFully(bArr);
                                                        BitmapFactory.Options options = new BitmapFactory.Options();
                                                        options.inJustDecodeBounds = true;
                                                        options.inSampleSize = 1;
                                                        BitmapFactory.decodeByteArray(bArr, 0, remaining, options);
                                                        int i5 = options.outWidth;
                                                        if (i5 > 800 || options.outHeight > 800) {
                                                            for (int iMax = Math.max(i5, options.outHeight); iMax > 800; iMax /= 2) {
                                                                options.inSampleSize *= 2;
                                                            }
                                                        }
                                                        options.inJustDecodeBounds = false;
                                                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, remaining, options);
                                                        this.cover = bitmapDecodeByteArray;
                                                        if (bitmapDecodeByteArray != null) {
                                                            float fMax = Math.max(bitmapDecodeByteArray.getWidth(), this.cover.getHeight()) / 120.0f;
                                                            if (fMax > 0.0f) {
                                                                Bitmap bitmap = this.cover;
                                                                this.smallCover = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() / fMax), (int) (this.cover.getHeight() / fMax), true);
                                                            } else {
                                                                this.smallCover = this.cover;
                                                            }
                                                            if (this.smallCover == null) {
                                                                this.smallCover = this.cover;
                                                            }
                                                        }
                                                    } catch (Exception e) {
                                                        e.printStackTrace();
                                                    }
                                                    mP4AtomNextChild8 = mP4Atom;
                                                    break;
                                                case "cpil":
                                                    dataInputStream3.readBoolean();
                                                    break;
                                                case "cprt":
                                                case "©cpy":
                                                    mP4Atom = mP4AtomNextChild8;
                                                    String str4 = this.copyright;
                                                    if (str4 == null || str4.trim().length() == 0) {
                                                        this.copyright = mP4AtomNextChild3.readString((int) mP4AtomNextChild3.getRemaining(), "UTF-8");
                                                    }
                                                    mP4AtomNextChild8 = mP4Atom;
                                                    break;
                                                case "disk":
                                                    mP4AtomNextChild3.skip(2);
                                                    this.disc = dataInputStream3.readShort();
                                                    dataInputStream3.readShort();
                                                    break;
                                                case "gnre":
                                                    mP4Atom = mP4AtomNextChild8;
                                                    String str5 = this.genre;
                                                    if (str5 == null || str5.trim().length() == 0) {
                                                        if (mP4AtomNextChild3.getRemaining() == 2) {
                                                            int i6 = dataInputStream3.readShort() - 1;
                                                            int[] iArrValues = ID3v1Genre$EnumUnboxingLocalUtility.values(126);
                                                            int i7 = (i6 < 0 || i6 >= iArrValues.length) ? 0 : iArrValues[i6];
                                                            if (i7 != 0) {
                                                                this.genre = ID3v1Genre$EnumUnboxingLocalUtility.getDescription(i7);
                                                            }
                                                        } else {
                                                            this.genre = mP4AtomNextChild3.readString((int) mP4AtomNextChild3.getRemaining(), "UTF-8");
                                                        }
                                                    }
                                                    mP4AtomNextChild8 = mP4Atom;
                                                    break;
                                                case "rtng":
                                                    dataInputStream3.readByte();
                                                    break;
                                                case "tmpo":
                                                    dataInputStream3.readShort();
                                                    break;
                                                case "trkn":
                                                    mP4AtomNextChild3.skip(2);
                                                    this.track = dataInputStream3.readShort();
                                                    dataInputStream3.readShort();
                                                    break;
                                                case "©ART":
                                                    mP4Atom = mP4AtomNextChild8;
                                                    this.artist = mP4AtomNextChild3.readString((int) mP4AtomNextChild3.getRemaining(), "UTF-8");
                                                    mP4AtomNextChild8 = mP4Atom;
                                                    break;
                                                case "©alb":
                                                    mP4Atom = mP4AtomNextChild8;
                                                    this.album = mP4AtomNextChild3.readString((int) mP4AtomNextChild3.getRemaining(), "UTF-8");
                                                    mP4AtomNextChild8 = mP4Atom;
                                                    break;
                                                case "©cmt":
                                                    mP4Atom = mP4AtomNextChild8;
                                                    this.comment = mP4AtomNextChild3.readString((int) mP4AtomNextChild3.getRemaining(), "UTF-8");
                                                    mP4AtomNextChild8 = mP4Atom;
                                                    break;
                                                case "©com":
                                                case "©wrt":
                                                    mP4Atom = mP4AtomNextChild8;
                                                    String str6 = this.composer;
                                                    if (str6 == null || str6.trim().length() == 0) {
                                                        this.composer = mP4AtomNextChild3.readString((int) mP4AtomNextChild3.getRemaining(), "UTF-8");
                                                    }
                                                    mP4AtomNextChild8 = mP4Atom;
                                                    break;
                                                case "©day":
                                                    mP4Atom = mP4AtomNextChild8;
                                                    String strTrim2 = mP4AtomNextChild3.readString((int) mP4AtomNextChild3.getRemaining(), "UTF-8").trim();
                                                    if (strTrim2.length() >= i2) {
                                                        try {
                                                            this.year = Short.valueOf(strTrim2.substring(0, i2)).shortValue();
                                                            break;
                                                        } catch (NumberFormatException unused) {
                                                        }
                                                    }
                                                    mP4AtomNextChild8 = mP4Atom;
                                                    break;
                                                case "©gen":
                                                    mP4Atom = mP4AtomNextChild8;
                                                    String str7 = this.genre;
                                                    if (str7 == null || str7.trim().length() == 0) {
                                                        this.genre = mP4AtomNextChild3.readString((int) mP4AtomNextChild3.getRemaining(), "UTF-8");
                                                    }
                                                    mP4AtomNextChild8 = mP4Atom;
                                                    break;
                                                case "©grp":
                                                    mP4Atom = mP4AtomNextChild8;
                                                    mP4AtomNextChild3.readString((int) mP4AtomNextChild3.getRemaining(), "UTF-8");
                                                    mP4AtomNextChild8 = mP4Atom;
                                                    break;
                                                case "©lyr":
                                                    mP4Atom = mP4AtomNextChild8;
                                                    this.lyrics = mP4AtomNextChild3.readString((int) mP4AtomNextChild3.getRemaining(), "UTF-8");
                                                    mP4AtomNextChild8 = mP4Atom;
                                                    break;
                                                case "©nam":
                                                    mP4Atom = mP4AtomNextChild8;
                                                    this.title = mP4AtomNextChild3.readString((int) mP4AtomNextChild3.getRemaining(), "UTF-8");
                                                    mP4AtomNextChild8 = mP4Atom;
                                                    break;
                                            }
                                        } else if (logger.isLoggable(this.debugLevel)) {
                                            Level level2 = this.debugLevel;
                                            StringBuilder sb3 = new StringBuilder();
                                            StringBuffer stringBuffer3 = new StringBuffer();
                                            MP4Atom.appendPath(stringBuffer3, mP4AtomNextChild9);
                                            sb3.append(stringBuffer3.toString());
                                            sb3.append(": contains no value");
                                            logger.log(level2, sb3.toString());
                                        }
                                    }
                                }
                            }
                        }
                        break;
                        break;
                    }
                    break;
                default:
                    continue;
                    break;
            }
            i2 = 4;
        }
    }
}
