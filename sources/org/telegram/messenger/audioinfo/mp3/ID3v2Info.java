package org.telegram.messenger.audioinfo.mp3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.stripe.android.Stripe;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.telegram.messenger.audioinfo.AudioInfo;
import org.telegram.messenger.audioinfo.util.RangeInputStream;

public final class ID3v2Info extends AudioInfo {
    public static final Logger LOGGER = Logger.getLogger(ID3v2Info.class.getName());
    public byte coverPictureType;

    public static boolean isID3v2StartPosition(MP3Input mP3Input) {
        mP3Input.mark(3);
        try {
            return mP3Input.read() == 73 && mP3Input.read() == 68 && mP3Input.read() == 51;
        } finally {
            mP3Input.reset();
        }
    }

    public final void parseFrame(ID3v2FrameBody iD3v2FrameBody) throws IOException, ID3v2Exception {
        int i;
        int i2 = 0;
        Level level = Level.FINEST;
        Logger logger = LOGGER;
        boolean zIsLoggable = logger.isLoggable(level);
        ID3v2FrameHeader iD3v2FrameHeader = iD3v2FrameBody.frameHeader;
        if (zIsLoggable) {
            logger.log(level, "Parsing frame: " + ((String) iD3v2FrameHeader.frameId));
        }
        String str = (String) iD3v2FrameHeader.frameId;
        str.getClass();
        RangeInputStream rangeInputStream = iD3v2FrameBody.input;
        switch (str) {
            case "COM":
            case "COMM":
                ID3v2Encoding encoding = iD3v2FrameBody.readEncoding();
                iD3v2FrameBody.readFixedLengthString(3, ID3v2Encoding.ISO_8859_1);
                String zeroTerminatedString = iD3v2FrameBody.readZeroTerminatedString(200, encoding);
                String fixedLengthString = iD3v2FrameBody.readFixedLengthString((int) rangeInputStream.getRemainingLength(), encoding);
                if (this.comment == null || zeroTerminatedString == null || "".equals(zeroTerminatedString)) {
                    this.comment = fixedLengthString;
                    break;
                }
                break;
            case "PIC":
            case "APIC":
                if (this.cover == null || this.coverPictureType != 3) {
                    ID3v2Encoding encoding2 = iD3v2FrameBody.readEncoding();
                    if (iD3v2FrameBody.tagHeader.version == 2) {
                        iD3v2FrameBody.readFixedLengthString(3, ID3v2Encoding.ISO_8859_1).toUpperCase().getClass();
                    } else {
                        iD3v2FrameBody.readZeroTerminatedString(20, ID3v2Encoding.ISO_8859_1);
                    }
                    Stripe stripe = iD3v2FrameBody.data;
                    byte b = stripe.readByte();
                    iD3v2FrameBody.readZeroTerminatedString(200, encoding2);
                    int remainingLength = (int) rangeInputStream.getRemainingLength();
                    byte[] bArr = new byte[remainingLength];
                    stripe.readFully(remainingLength, bArr);
                    if (this.cover == null || b == 3 || b == 0) {
                        try {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            options.inSampleSize = 1;
                            BitmapFactory.decodeByteArray(bArr, 0, remainingLength, options);
                            int i3 = options.outWidth;
                            if (i3 > 800 || options.outHeight > 800) {
                                for (int iMax = Math.max(i3, options.outHeight); iMax > 800; iMax /= 2) {
                                    options.inSampleSize *= 2;
                                }
                            }
                            options.inJustDecodeBounds = false;
                            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, remainingLength, options);
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
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                        this.coverPictureType = b;
                    }
                    break;
                }
                break;
            case "TAL":
            case "TALB":
                this.album = iD3v2FrameBody.readFixedLengthString((int) rangeInputStream.getRemainingLength(), iD3v2FrameBody.readEncoding());
                break;
            case "TCM":
            case "TCOM":
                this.composer = iD3v2FrameBody.readFixedLengthString((int) rangeInputStream.getRemainingLength(), iD3v2FrameBody.readEncoding());
                break;
            case "TCO":
            case "TCON":
                String fixedLengthString2 = iD3v2FrameBody.readFixedLengthString((int) rangeInputStream.getRemainingLength(), iD3v2FrameBody.readEncoding());
                if (fixedLengthString2.length() > 0) {
                    this.genre = fixedLengthString2;
                    try {
                        if (fixedLengthString2.charAt(0) == '(') {
                            int iIndexOf = fixedLengthString2.indexOf(41);
                            if (iIndexOf > 1) {
                                int i4 = Integer.parseInt(fixedLengthString2.substring(1, iIndexOf));
                                int[] iArrValues = ID3v1Genre$EnumUnboxingLocalUtility.values(126);
                                if (i4 >= 0 && i4 < iArrValues.length) {
                                    i2 = iArrValues[i4];
                                }
                                if (i2 == 0 && fixedLengthString2.length() > (i = iIndexOf + 1)) {
                                    this.genre = fixedLengthString2.substring(i);
                                }
                            }
                        } else {
                            int i5 = Integer.parseInt(fixedLengthString2);
                            int[] iArrValues2 = ID3v1Genre$EnumUnboxingLocalUtility.values(126);
                            if (i5 >= 0 && i5 < iArrValues2.length) {
                                i2 = iArrValues2[i5];
                            }
                        }
                        if (i2 != 0) {
                            this.genre = ID3v1Genre$EnumUnboxingLocalUtility.getDescription(i2);
                        }
                    } catch (NumberFormatException unused) {
                        return;
                    }
                    break;
                }
                break;
            case "TCP":
            case "TCMP":
                "1".equals(iD3v2FrameBody.readFixedLengthString((int) rangeInputStream.getRemainingLength(), iD3v2FrameBody.readEncoding()));
                break;
            case "TCR":
            case "TCOP":
                this.copyright = iD3v2FrameBody.readFixedLengthString((int) rangeInputStream.getRemainingLength(), iD3v2FrameBody.readEncoding());
                break;
            case "TLE":
            case "TLEN":
                String fixedLengthString3 = iD3v2FrameBody.readFixedLengthString((int) rangeInputStream.getRemainingLength(), iD3v2FrameBody.readEncoding());
                try {
                    this.duration = Long.valueOf(fixedLengthString3).longValue();
                    break;
                } catch (NumberFormatException unused2) {
                    Level level2 = Level.FINEST;
                    if (logger.isLoggable(level2)) {
                        logger.log(level2, "Could not parse track duration: " + fixedLengthString3);
                        return;
                    }
                    return;
                }
                break;
            case "TP1":
            case "TPE1":
                this.artist = iD3v2FrameBody.readFixedLengthString((int) rangeInputStream.getRemainingLength(), iD3v2FrameBody.readEncoding());
                break;
            case "TP2":
            case "TPE2":
                this.albumArtist = iD3v2FrameBody.readFixedLengthString((int) rangeInputStream.getRemainingLength(), iD3v2FrameBody.readEncoding());
                break;
            case "TPA":
            case "TPOS":
                String fixedLengthString4 = iD3v2FrameBody.readFixedLengthString((int) rangeInputStream.getRemainingLength(), iD3v2FrameBody.readEncoding());
                if (fixedLengthString4.length() > 0) {
                    int iIndexOf2 = fixedLengthString4.indexOf(47);
                    if (iIndexOf2 < 0) {
                        try {
                            this.disc = Short.valueOf(fixedLengthString4).shortValue();
                        } catch (NumberFormatException unused3) {
                            Level level3 = Level.FINEST;
                            if (logger.isLoggable(level3)) {
                                logger.log(level3, "Could not parse disc number: ".concat(fixedLengthString4));
                                return;
                            }
                            return;
                        }
                    } else {
                        try {
                            this.disc = Short.valueOf(fixedLengthString4.substring(0, iIndexOf2)).shortValue();
                        } catch (NumberFormatException unused4) {
                            Level level4 = Level.FINEST;
                            if (logger.isLoggable(level4)) {
                                logger.log(level4, "Could not parse disc number: ".concat(fixedLengthString4));
                            }
                        }
                        try {
                            Short.valueOf(fixedLengthString4.substring(iIndexOf2 + 1)).getClass();
                        } catch (NumberFormatException unused5) {
                            Level level5 = Level.FINEST;
                            if (logger.isLoggable(level5)) {
                                logger.log(level5, "Could not parse number of discs: ".concat(fixedLengthString4));
                                return;
                            }
                            return;
                        }
                    }
                    break;
                }
                break;
            case "TRK":
            case "TRCK":
                String fixedLengthString5 = iD3v2FrameBody.readFixedLengthString((int) rangeInputStream.getRemainingLength(), iD3v2FrameBody.readEncoding());
                if (fixedLengthString5.length() > 0) {
                    int iIndexOf3 = fixedLengthString5.indexOf(47);
                    if (iIndexOf3 < 0) {
                        try {
                            this.track = Short.valueOf(fixedLengthString5).shortValue();
                        } catch (NumberFormatException unused6) {
                            Level level6 = Level.FINEST;
                            if (logger.isLoggable(level6)) {
                                logger.log(level6, "Could not parse track number: ".concat(fixedLengthString5));
                                return;
                            }
                            return;
                        }
                    } else {
                        try {
                            this.track = Short.valueOf(fixedLengthString5.substring(0, iIndexOf3)).shortValue();
                        } catch (NumberFormatException unused7) {
                            Level level7 = Level.FINEST;
                            if (logger.isLoggable(level7)) {
                                logger.log(level7, "Could not parse track number: ".concat(fixedLengthString5));
                            }
                        }
                        try {
                            Short.valueOf(fixedLengthString5.substring(iIndexOf3 + 1)).getClass();
                        } catch (NumberFormatException unused8) {
                            Level level8 = Level.FINEST;
                            if (logger.isLoggable(level8)) {
                                logger.log(level8, "Could not parse number of tracks: ".concat(fixedLengthString5));
                                return;
                            }
                            return;
                        }
                    }
                    break;
                }
                break;
            case "TT1":
            case "TIT1":
                iD3v2FrameBody.readFixedLengthString((int) rangeInputStream.getRemainingLength(), iD3v2FrameBody.readEncoding());
                break;
            case "TT2":
            case "TIT2":
                this.title = iD3v2FrameBody.readFixedLengthString((int) rangeInputStream.getRemainingLength(), iD3v2FrameBody.readEncoding());
                break;
            case "TYE":
            case "TYER":
                String fixedLengthString6 = iD3v2FrameBody.readFixedLengthString((int) rangeInputStream.getRemainingLength(), iD3v2FrameBody.readEncoding());
                if (fixedLengthString6.length() > 0) {
                    try {
                        this.year = Short.valueOf(fixedLengthString6).shortValue();
                    } catch (NumberFormatException unused9) {
                        Level level9 = Level.FINEST;
                        if (logger.isLoggable(level9)) {
                            logger.log(level9, "Could not parse year: ".concat(fixedLengthString6));
                            return;
                        }
                        return;
                    }
                    break;
                }
                break;
            case "ULT":
            case "USLT":
                if (this.lyrics == null) {
                    ID3v2Encoding encoding3 = iD3v2FrameBody.readEncoding();
                    iD3v2FrameBody.readFixedLengthString(3, ID3v2Encoding.ISO_8859_1);
                    iD3v2FrameBody.readZeroTerminatedString(200, encoding3);
                    this.lyrics = iD3v2FrameBody.readFixedLengthString((int) rangeInputStream.getRemainingLength(), encoding3);
                    break;
                }
                break;
            case "TDRC":
                String fixedLengthString7 = iD3v2FrameBody.readFixedLengthString((int) rangeInputStream.getRemainingLength(), iD3v2FrameBody.readEncoding());
                if (fixedLengthString7.length() >= 4) {
                    try {
                        this.year = Short.valueOf(fixedLengthString7.substring(0, 4)).shortValue();
                    } catch (NumberFormatException unused10) {
                        Level level10 = Level.FINEST;
                        if (logger.isLoggable(level10)) {
                            logger.log(level10, "Could not parse year from: ".concat(fixedLengthString7));
                            return;
                        }
                        return;
                    }
                    break;
                }
                break;
        }
    }
}
