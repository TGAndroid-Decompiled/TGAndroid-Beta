package org.telegram.messenger.audioinfo.m4a;

import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;
import org.telegram.messenger.audioinfo.util.RangeInputStream;

public class MP4Atom extends MP4Box<RangeInputStream> {
    public MP4Atom(RangeInputStream rangeInputStream, MP4Box<?> mP4Box, String str) {
        super(rangeInputStream, mP4Box, str);
    }

    public long getLength() {
        return getInput().getPosition() + getInput().getRemainingLength();
    }

    public long getOffset() {
        return getParent().getPosition() - getPosition();
    }

    public long getRemaining() {
        return getInput().getRemainingLength();
    }

    public boolean hasMoreChildren() {
        return (getChild() != null ? getChild().getRemaining() : 0L) < getRemaining();
    }

    public MP4Atom nextChildUpTo(String str) throws IOException {
        while (getRemaining() > 0) {
            MP4Atom nextChild = nextChild();
            if (nextChild.getType().matches(str)) {
                return nextChild;
            }
        }
        throw new IOException("atom type mismatch, not found: " + str);
    }

    public boolean readBoolean() throws IOException {
        return this.data.readBoolean();
    }

    public byte readByte() throws IOException {
        return this.data.readByte();
    }

    public short readShort() throws IOException {
        return this.data.readShort();
    }

    public int readInt() throws IOException {
        return this.data.readInt();
    }

    public long readLong() throws IOException {
        return this.data.readLong();
    }

    public byte[] readBytes(int i) throws IOException {
        byte[] bArr = new byte[i];
        this.data.readFully(bArr);
        return bArr;
    }

    public byte[] readBytes() throws IOException {
        return readBytes((int) getRemaining());
    }

    public BigDecimal readShortFixedPoint() throws IOException {
        byte readByte = this.data.readByte();
        int readUnsignedByte = this.data.readUnsignedByte();
        return new BigDecimal(String.valueOf((int) readByte) + "" + String.valueOf(readUnsignedByte));
    }

    public BigDecimal readIntegerFixedPoint() throws IOException {
        short readShort = this.data.readShort();
        int readUnsignedShort = this.data.readUnsignedShort();
        return new BigDecimal(String.valueOf((int) readShort) + "" + String.valueOf(readUnsignedShort));
    }

    public String readString(int i, String str) throws IOException {
        String str2 = new String(readBytes(i), str);
        int indexOf = str2.indexOf(0);
        return indexOf < 0 ? str2 : str2.substring(0, indexOf);
    }

    public String readString(String str) throws IOException {
        return readString((int) getRemaining(), str);
    }

    public void skip(int i) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            int skipBytes = this.data.skipBytes(i - i2);
            if (skipBytes <= 0) {
                throw new EOFException();
            }
            i2 += skipBytes;
        }
    }

    public void skip() throws IOException {
        while (getRemaining() > 0) {
            if (getInput().skip(getRemaining()) == 0) {
                throw new EOFException("Cannot skip atom");
            }
        }
    }

    private StringBuffer appendPath(StringBuffer stringBuffer, MP4Box<?> mP4Box) {
        if (mP4Box.getParent() != null) {
            appendPath(stringBuffer, mP4Box.getParent());
            stringBuffer.append("/");
        }
        stringBuffer.append(mP4Box.getType());
        return stringBuffer;
    }

    public String getPath() {
        return appendPath(new StringBuffer(), this).toString();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        appendPath(stringBuffer, this);
        stringBuffer.append("[off=");
        stringBuffer.append(getOffset());
        stringBuffer.append(",pos=");
        stringBuffer.append(getPosition());
        stringBuffer.append(",len=");
        stringBuffer.append(getLength());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
