package org.telegram.messenger.audioinfo.mp3;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class ID3v2DataInput {
    private final InputStream input;

    public ID3v2DataInput(InputStream inputStream) {
        this.input = inputStream;
    }

    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int i4 = this.input.read(bArr, i + i3, i2 - i3);
            if (i4 <= 0) {
                throw new EOFException();
            }
            i3 += i4;
        }
    }

    public byte[] readFully(int i) throws IOException {
        byte[] bArr = new byte[i];
        readFully(bArr, 0, i);
        return bArr;
    }

    public void skipFully(long j) throws IOException {
        long j2 = 0;
        while (j2 < j) {
            long jSkip = this.input.skip(j - j2);
            if (jSkip <= 0) {
                throw new EOFException();
            }
            j2 += jSkip;
        }
    }

    public byte readByte() throws IOException {
        int i = this.input.read();
        if (i >= 0) {
            return (byte) i;
        }
        throw new EOFException();
    }

    public int readInt() {
        return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
    }

    public int readSyncsafeInt() {
        return ((readByte() & 127) << 21) | ((readByte() & 127) << 14) | ((readByte() & 127) << 7) | (readByte() & 127);
    }
}
