package org.telegram.messenger.audioinfo.mp3;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.telegram.messenger.audioinfo.AudioInfo;

public class ID3v2Info extends AudioInfo {
    static final Logger LOGGER = Logger.getLogger(ID3v2Info.class.getName());
    private byte coverPictureType;
    private final Level debugLevel;

    public static class AttachedPicture {
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

    public static class CommentOrUnsynchronizedLyrics {
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
        boolean z;
        inputStream.mark(3);
        try {
            if (inputStream.read() == 73 && inputStream.read() == 68) {
                if (inputStream.read() == 51) {
                    z = true;
                    return z;
                }
            }
            z = false;
            return z;
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
            ID3v2TagBody tagBody = iD3v2TagHeader.tagBody(inputStream);
            while (true) {
                try {
                    if (tagBody.getRemainingLength() <= 10) {
                        break;
                    }
                    ID3v2FrameHeader iD3v2FrameHeader = new ID3v2FrameHeader(tagBody);
                    if (iD3v2FrameHeader.isPadding()) {
                        break;
                    }
                    if (iD3v2FrameHeader.getBodySize() > tagBody.getRemainingLength()) {
                        Logger logger = LOGGER;
                        if (logger.isLoggable(level)) {
                            logger.log(level, "ID3 frame claims to extend frames area");
                        }
                    } else if (iD3v2FrameHeader.isValid() && !iD3v2FrameHeader.isEncryption()) {
                        ID3v2FrameBody frameBody = tagBody.frameBody(iD3v2FrameHeader);
                        try {
                            try {
                                parseFrame(frameBody);
                                data = frameBody.getData();
                            } catch (ID3v2Exception e) {
                                if (LOGGER.isLoggable(level)) {
                                    LOGGER.log(level, String.format("ID3 exception occured in frame %s: %s", iD3v2FrameHeader.getFrameId(), e.getMessage()));
                                }
                                data = frameBody.getData();
                            }
                            data.skipFully(frameBody.getRemainingLength());
                        } catch (Throwable th) {
                            frameBody.getData().skipFully(frameBody.getRemainingLength());
                            throw th;
                        }
                    } else {
                        tagBody.getData().skipFully(iD3v2FrameHeader.getBodySize());
                    }
                } catch (ID3v2Exception e2) {
                    Logger logger2 = LOGGER;
                    if (logger2.isLoggable(level)) {
                        logger2.log(level, "ID3 exception occured: " + e2.getMessage());
                    }
                }
            }
            tagBody.getData().skipFully(tagBody.getRemainingLength());
            if (iD3v2TagHeader.getFooterSize() > 0) {
                inputStream.skip(iD3v2TagHeader.getFooterSize());
            }
        }
    }

    void parseFrame(org.telegram.messenger.audioinfo.mp3.ID3v2FrameBody r9) throws java.io.IOException, org.telegram.messenger.audioinfo.mp3.ID3v2Exception {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.audioinfo.mp3.ID3v2Info.parseFrame(org.telegram.messenger.audioinfo.mp3.ID3v2FrameBody):void");
    }

    String parseTextFrame(ID3v2FrameBody iD3v2FrameBody) throws IOException, ID3v2Exception {
        return iD3v2FrameBody.readFixedLengthString((int) iD3v2FrameBody.getRemainingLength(), iD3v2FrameBody.readEncoding());
    }

    CommentOrUnsynchronizedLyrics parseCommentOrUnsynchronizedLyricsFrame(ID3v2FrameBody iD3v2FrameBody) throws IOException, ID3v2Exception {
        ID3v2Encoding readEncoding = iD3v2FrameBody.readEncoding();
        return new CommentOrUnsynchronizedLyrics(iD3v2FrameBody.readFixedLengthString(3, ID3v2Encoding.ISO_8859_1), iD3v2FrameBody.readZeroTerminatedString(200, readEncoding), iD3v2FrameBody.readFixedLengthString((int) iD3v2FrameBody.getRemainingLength(), readEncoding));
    }

    AttachedPicture parseAttachedPictureFrame(ID3v2FrameBody iD3v2FrameBody) throws IOException, ID3v2Exception {
        String readZeroTerminatedString;
        ID3v2Encoding readEncoding = iD3v2FrameBody.readEncoding();
        if (iD3v2FrameBody.getTagHeader().getVersion() == 2) {
            String upperCase = iD3v2FrameBody.readFixedLengthString(3, ID3v2Encoding.ISO_8859_1).toUpperCase();
            upperCase.hashCode();
            if (upperCase.equals("JPG")) {
                readZeroTerminatedString = "image/jpeg";
            } else if (upperCase.equals("PNG")) {
                readZeroTerminatedString = "image/png";
            } else {
                readZeroTerminatedString = "image/unknown";
            }
        } else {
            readZeroTerminatedString = iD3v2FrameBody.readZeroTerminatedString(20, ID3v2Encoding.ISO_8859_1);
        }
        return new AttachedPicture(iD3v2FrameBody.getData().readByte(), iD3v2FrameBody.readZeroTerminatedString(200, readEncoding), readZeroTerminatedString, iD3v2FrameBody.getData().readFully((int) iD3v2FrameBody.getRemainingLength()));
    }
}
