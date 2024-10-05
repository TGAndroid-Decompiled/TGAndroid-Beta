package org.telegram.messenger.audioinfo.mp3;

public class ID3v2FrameHeader {
    private int bodySize;
    private boolean compression;
    private int dataLengthIndicator;
    private boolean encryption;
    private String frameId;
    private int headerSize;
    private boolean unsynchronization;

    public ID3v2FrameHeader(ID3v2TagBody iD3v2TagBody) {
        byte b;
        byte b2;
        int i;
        long position = iD3v2TagBody.getPosition();
        ID3v2DataInput data = iD3v2TagBody.getData();
        byte b3 = 2;
        this.frameId = iD3v2TagBody.getTagHeader().getVersion() == 2 ? new String(data.readFully(3), "ISO-8859-1") : new String(data.readFully(4), "ISO-8859-1");
        byte b4 = 8;
        this.bodySize = iD3v2TagBody.getTagHeader().getVersion() == 2 ? ((data.readByte() & 255) << 16) | ((data.readByte() & 255) << 8) | (data.readByte() & 255) : iD3v2TagBody.getTagHeader().getVersion() == 3 ? data.readInt() : data.readSyncsafeInt();
        if (iD3v2TagBody.getTagHeader().getVersion() > 2) {
            data.readByte();
            byte readByte = data.readByte();
            byte b5 = 64;
            if (iD3v2TagBody.getTagHeader().getVersion() == 3) {
                b4 = 128;
                b3 = 0;
                b = 32;
                b2 = 0;
            } else {
                b = 64;
                b5 = 4;
                b2 = 1;
            }
            this.compression = (b4 & readByte) != 0;
            this.unsynchronization = (readByte & b3) != 0;
            this.encryption = (readByte & b5) != 0;
            if (iD3v2TagBody.getTagHeader().getVersion() == 3) {
                if (this.compression) {
                    this.dataLengthIndicator = data.readInt();
                    this.bodySize -= 4;
                }
                if (this.encryption) {
                    data.readByte();
                    this.bodySize--;
                }
                if ((readByte & b) != 0) {
                    data.readByte();
                    i = this.bodySize - 1;
                    this.bodySize = i;
                }
            } else {
                if ((readByte & b) != 0) {
                    data.readByte();
                    this.bodySize--;
                }
                if (this.encryption) {
                    data.readByte();
                    this.bodySize--;
                }
                if ((readByte & b2) != 0) {
                    this.dataLengthIndicator = data.readSyncsafeInt();
                    i = this.bodySize - 4;
                    this.bodySize = i;
                }
            }
        }
        this.headerSize = (int) (iD3v2TagBody.getPosition() - position);
    }

    public int getBodySize() {
        return this.bodySize;
    }

    public int getDataLengthIndicator() {
        return this.dataLengthIndicator;
    }

    public String getFrameId() {
        return this.frameId;
    }

    public int getHeaderSize() {
        return this.headerSize;
    }

    public boolean isCompression() {
        return this.compression;
    }

    public boolean isEncryption() {
        return this.encryption;
    }

    public boolean isPadding() {
        for (int i = 0; i < this.frameId.length(); i++) {
            if (this.frameId.charAt(0) != 0) {
                return false;
            }
        }
        return this.bodySize == 0;
    }

    public boolean isUnsynchronization() {
        return this.unsynchronization;
    }

    public boolean isValid() {
        for (int i = 0; i < this.frameId.length(); i++) {
            if ((this.frameId.charAt(i) < 'A' || this.frameId.charAt(i) > 'Z') && (this.frameId.charAt(i) < '0' || this.frameId.charAt(i) > '9')) {
                return false;
            }
        }
        return this.bodySize > 0;
    }

    public String toString() {
        return String.format("%s[id=%s, bodysize=%d]", getClass().getSimpleName(), this.frameId, Integer.valueOf(this.bodySize));
    }
}
