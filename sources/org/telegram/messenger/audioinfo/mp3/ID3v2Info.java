package org.telegram.messenger.audioinfo.mp3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.telegram.messenger.audioinfo.AudioInfo;

public class ID3v2Info extends AudioInfo {
    static final Logger LOGGER = Logger.getLogger(ID3v2Info.class.getName());
    private byte coverPictureType;
    private final Level debugLevel;

    static class AttachedPicture {
        final String description;
        final byte[] imageData;
        final String imageType;
        final byte type;

        public AttachedPicture(byte b, String str, String str2, byte[] bArr) {
            this.type = b;
            this.description = str;
            this.imageType = str2;
            this.imageData = bArr;
        }
    }

    static class CommentOrUnsynchronizedLyrics {
        final String description;
        final String language;
        final String text;

        public CommentOrUnsynchronizedLyrics(String str, String str2, String str3) {
            this.language = str;
            this.description = str2;
            this.text = str3;
        }
    }

    public static boolean isID3v2StartPosition(InputStream inputStream) throws IOException {
        inputStream.mark(3);
        try {
            return inputStream.read() == 73 && inputStream.read() == 68 && inputStream.read() == 51;
        } finally {
            inputStream.reset();
        }
    }

    public ID3v2Info(InputStream inputStream, Level level) throws IOException, ID3v2Exception {
        ID3v2DataInput data;
        this.debugLevel = level;
        if (isID3v2StartPosition(inputStream)) {
            ID3v2TagHeader iD3v2TagHeader = new ID3v2TagHeader(inputStream);
            this.brand = "ID3";
            this.version = String.format("2.%d.%d", Integer.valueOf(iD3v2TagHeader.getVersion()), Integer.valueOf(iD3v2TagHeader.getRevision()));
            ID3v2TagBody iD3v2TagBodyTagBody = iD3v2TagHeader.tagBody(inputStream);
            while (iD3v2TagBodyTagBody.getRemainingLength() > 10) {
                try {
                    ID3v2FrameHeader iD3v2FrameHeader = new ID3v2FrameHeader(iD3v2TagBodyTagBody);
                    if (iD3v2FrameHeader.isPadding()) {
                        break;
                    }
                    if (iD3v2FrameHeader.getBodySize() > iD3v2TagBodyTagBody.getRemainingLength()) {
                        Logger logger = LOGGER;
                        if (!logger.isLoggable(level)) {
                            break;
                        }
                        logger.log(level, "ID3 frame claims to extend frames area");
                        break;
                    }
                    if (iD3v2FrameHeader.isValid() && !iD3v2FrameHeader.isEncryption()) {
                        ID3v2FrameBody iD3v2FrameBodyFrameBody = iD3v2TagBodyTagBody.frameBody(iD3v2FrameHeader);
                        try {
                            try {
                                parseFrame(iD3v2FrameBodyFrameBody);
                                data = iD3v2FrameBodyFrameBody.getData();
                            } catch (ID3v2Exception e) {
                                if (LOGGER.isLoggable(level)) {
                                    LOGGER.log(level, String.format("ID3 exception occured in frame %s: %s", iD3v2FrameHeader.getFrameId(), e.getMessage()));
                                }
                                data = iD3v2FrameBodyFrameBody.getData();
                            }
                            data.skipFully(iD3v2FrameBodyFrameBody.getRemainingLength());
                        } catch (Throwable th) {
                            iD3v2FrameBodyFrameBody.getData().skipFully(iD3v2FrameBodyFrameBody.getRemainingLength());
                            throw th;
                        }
                    } else {
                        iD3v2TagBodyTagBody.getData().skipFully(iD3v2FrameHeader.getBodySize());
                    }
                } catch (ID3v2Exception e2) {
                    Logger logger2 = LOGGER;
                    if (logger2.isLoggable(level)) {
                        logger2.log(level, "ID3 exception occured: " + e2.getMessage());
                    }
                }
            }
            iD3v2TagBodyTagBody.getData().skipFully(iD3v2TagBodyTagBody.getRemainingLength());
            if (iD3v2TagHeader.getFooterSize() > 0) {
                inputStream.skip(iD3v2TagHeader.getFooterSize());
            }
        }
    }

    void parseFrame(ID3v2FrameBody iD3v2FrameBody) throws IOException, ID3v2Exception {
        String str;
        byte b;
        ID3v1Genre genre;
        int i;
        Logger logger = LOGGER;
        if (logger.isLoggable(this.debugLevel)) {
            logger.log(this.debugLevel, "Parsing frame: " + iD3v2FrameBody.getFrameHeader().getFrameId());
        }
        String frameId = iD3v2FrameBody.getFrameHeader().getFrameId();
        frameId.getClass();
        switch (frameId) {
            case "COM":
            case "COMM":
                CommentOrUnsynchronizedLyrics commentOrUnsynchronizedLyricsFrame = parseCommentOrUnsynchronizedLyricsFrame(iD3v2FrameBody);
                if (this.comment == null || (str = commentOrUnsynchronizedLyricsFrame.description) == null || "".equals(str)) {
                    this.comment = commentOrUnsynchronizedLyricsFrame.text;
                    break;
                }
                break;
            case "PIC":
            case "APIC":
                if (this.cover == null || this.coverPictureType != 3) {
                    AttachedPicture attachedPictureFrame = parseAttachedPictureFrame(iD3v2FrameBody);
                    if (this.cover == null || (b = attachedPictureFrame.type) == 3 || b == 0) {
                        try {
                            byte[] bArr = attachedPictureFrame.imageData;
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            options.inSampleSize = 1;
                            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                            int i2 = options.outWidth;
                            if (i2 > 800 || options.outHeight > 800) {
                                for (int iMax = Math.max(i2, options.outHeight); iMax > 800; iMax /= 2) {
                                    options.inSampleSize *= 2;
                                }
                            }
                            options.inJustDecodeBounds = false;
                            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
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
                        this.coverPictureType = attachedPictureFrame.type;
                    }
                    break;
                }
                break;
            case "TAL":
            case "TALB":
                this.album = parseTextFrame(iD3v2FrameBody);
                break;
            case "TCM":
            case "TCOM":
                this.composer = parseTextFrame(iD3v2FrameBody);
                break;
            case "TCO":
            case "TCON":
                String textFrame = parseTextFrame(iD3v2FrameBody);
                if (textFrame.length() > 0) {
                    this.genre = textFrame;
                    try {
                        if (textFrame.charAt(0) == '(') {
                            int iIndexOf = textFrame.indexOf(41);
                            if (iIndexOf > 1) {
                                genre = ID3v1Genre.getGenre(Integer.parseInt(textFrame.substring(1, iIndexOf)));
                                if (genre == null && textFrame.length() > (i = iIndexOf + 1)) {
                                    this.genre = textFrame.substring(i);
                                }
                            } else {
                                genre = null;
                            }
                        } else {
                            genre = ID3v1Genre.getGenre(Integer.parseInt(textFrame));
                        }
                        if (genre != null) {
                            this.genre = genre.getDescription();
                        }
                    } catch (NumberFormatException unused) {
                        return;
                    }
                    break;
                }
                break;
            case "TCP":
            case "TCMP":
                this.compilation = "1".equals(parseTextFrame(iD3v2FrameBody));
                break;
            case "TCR":
            case "TCOP":
                this.copyright = parseTextFrame(iD3v2FrameBody);
                break;
            case "TLE":
            case "TLEN":
                String textFrame2 = parseTextFrame(iD3v2FrameBody);
                try {
                    this.duration = Long.valueOf(textFrame2).longValue();
                    break;
                } catch (NumberFormatException unused2) {
                    Logger logger2 = LOGGER;
                    if (logger2.isLoggable(this.debugLevel)) {
                        logger2.log(this.debugLevel, "Could not parse track duration: " + textFrame2);
                        return;
                    }
                    return;
                }
                break;
            case "TP1":
            case "TPE1":
                this.artist = parseTextFrame(iD3v2FrameBody);
                break;
            case "TP2":
            case "TPE2":
                this.albumArtist = parseTextFrame(iD3v2FrameBody);
                break;
            case "TPA":
            case "TPOS":
                String textFrame3 = parseTextFrame(iD3v2FrameBody);
                if (textFrame3.length() > 0) {
                    int iIndexOf2 = textFrame3.indexOf(47);
                    if (iIndexOf2 < 0) {
                        try {
                            this.disc = Short.valueOf(textFrame3).shortValue();
                        } catch (NumberFormatException unused3) {
                            Logger logger3 = LOGGER;
                            if (logger3.isLoggable(this.debugLevel)) {
                                logger3.log(this.debugLevel, "Could not parse disc number: " + textFrame3);
                                return;
                            }
                            return;
                        }
                    } else {
                        try {
                            this.disc = Short.valueOf(textFrame3.substring(0, iIndexOf2)).shortValue();
                        } catch (NumberFormatException unused4) {
                            Logger logger4 = LOGGER;
                            if (logger4.isLoggable(this.debugLevel)) {
                                logger4.log(this.debugLevel, "Could not parse disc number: " + textFrame3);
                            }
                        }
                        try {
                            this.discs = Short.valueOf(textFrame3.substring(iIndexOf2 + 1)).shortValue();
                        } catch (NumberFormatException unused5) {
                            Logger logger5 = LOGGER;
                            if (logger5.isLoggable(this.debugLevel)) {
                                logger5.log(this.debugLevel, "Could not parse number of discs: " + textFrame3);
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
                String textFrame4 = parseTextFrame(iD3v2FrameBody);
                if (textFrame4.length() > 0) {
                    int iIndexOf3 = textFrame4.indexOf(47);
                    if (iIndexOf3 < 0) {
                        try {
                            this.track = Short.valueOf(textFrame4).shortValue();
                        } catch (NumberFormatException unused6) {
                            Logger logger6 = LOGGER;
                            if (logger6.isLoggable(this.debugLevel)) {
                                logger6.log(this.debugLevel, "Could not parse track number: " + textFrame4);
                                return;
                            }
                            return;
                        }
                    } else {
                        try {
                            this.track = Short.valueOf(textFrame4.substring(0, iIndexOf3)).shortValue();
                        } catch (NumberFormatException unused7) {
                            Logger logger7 = LOGGER;
                            if (logger7.isLoggable(this.debugLevel)) {
                                logger7.log(this.debugLevel, "Could not parse track number: " + textFrame4);
                            }
                        }
                        try {
                            this.tracks = Short.valueOf(textFrame4.substring(iIndexOf3 + 1)).shortValue();
                        } catch (NumberFormatException unused8) {
                            Logger logger8 = LOGGER;
                            if (logger8.isLoggable(this.debugLevel)) {
                                logger8.log(this.debugLevel, "Could not parse number of tracks: " + textFrame4);
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
                this.grouping = parseTextFrame(iD3v2FrameBody);
                break;
            case "TT2":
            case "TIT2":
                this.title = parseTextFrame(iD3v2FrameBody);
                break;
            case "TYE":
            case "TYER":
                String textFrame5 = parseTextFrame(iD3v2FrameBody);
                if (textFrame5.length() > 0) {
                    try {
                        this.year = Short.valueOf(textFrame5).shortValue();
                    } catch (NumberFormatException unused9) {
                        Logger logger9 = LOGGER;
                        if (logger9.isLoggable(this.debugLevel)) {
                            logger9.log(this.debugLevel, "Could not parse year: " + textFrame5);
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
                    this.lyrics = parseCommentOrUnsynchronizedLyricsFrame(iD3v2FrameBody).text;
                    break;
                }
                break;
            case "TDRC":
                String textFrame6 = parseTextFrame(iD3v2FrameBody);
                if (textFrame6.length() >= 4) {
                    try {
                        this.year = Short.valueOf(textFrame6.substring(0, 4)).shortValue();
                    } catch (NumberFormatException unused10) {
                        Logger logger10 = LOGGER;
                        if (logger10.isLoggable(this.debugLevel)) {
                            logger10.log(this.debugLevel, "Could not parse year from: " + textFrame6);
                            return;
                        }
                        return;
                    }
                    break;
                }
                break;
        }
    }

    String parseTextFrame(ID3v2FrameBody iD3v2FrameBody) throws IOException, ID3v2Exception {
        return iD3v2FrameBody.readFixedLengthString((int) iD3v2FrameBody.getRemainingLength(), iD3v2FrameBody.readEncoding());
    }

    CommentOrUnsynchronizedLyrics parseCommentOrUnsynchronizedLyricsFrame(ID3v2FrameBody iD3v2FrameBody) throws IOException, ID3v2Exception {
        ID3v2Encoding encoding = iD3v2FrameBody.readEncoding();
        return new CommentOrUnsynchronizedLyrics(iD3v2FrameBody.readFixedLengthString(3, ID3v2Encoding.ISO_8859_1), iD3v2FrameBody.readZeroTerminatedString(200, encoding), iD3v2FrameBody.readFixedLengthString((int) iD3v2FrameBody.getRemainingLength(), encoding));
    }

    AttachedPicture parseAttachedPictureFrame(ID3v2FrameBody iD3v2FrameBody) throws IOException, ID3v2Exception {
        String zeroTerminatedString;
        ID3v2Encoding encoding = iD3v2FrameBody.readEncoding();
        if (iD3v2FrameBody.getTagHeader().getVersion() == 2) {
            String upperCase = iD3v2FrameBody.readFixedLengthString(3, ID3v2Encoding.ISO_8859_1).toUpperCase();
            upperCase.getClass();
            if (upperCase.equals("JPG")) {
                zeroTerminatedString = "image/jpeg";
            } else if (upperCase.equals("PNG")) {
                zeroTerminatedString = "image/png";
            } else {
                zeroTerminatedString = "image/unknown";
            }
        } else {
            zeroTerminatedString = iD3v2FrameBody.readZeroTerminatedString(20, ID3v2Encoding.ISO_8859_1);
        }
        return new AttachedPicture(iD3v2FrameBody.getData().readByte(), iD3v2FrameBody.readZeroTerminatedString(200, encoding), zeroTerminatedString, iD3v2FrameBody.getData().readFully((int) iD3v2FrameBody.getRemainingLength()));
    }
}
