package org.telegram.messenger.audioinfo.mp3;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.telegram.messenger.audioinfo.util.PositionInputStream;

public class MP3Input extends PositionInputStream {
    public int exceptionsCount;

    public MP3Input(InputStream inputStream) {
        super(inputStream);
        this.exceptionsCount = 0;
    }

    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int i4 = read(bArr, i + i3, i2 - i3);
            if (i4 <= 0) {
                throw new EOFException();
            }
            i3 += i4;
        }
    }

    public void skipFully(long j) throws IOException {
        long j2 = 0;
        while (j2 < j) {
            long jSkip = skip(j - j2);
            if (jSkip <= 0) {
                throw new EOFException();
            }
            j2 += jSkip;
        }
    }

    public String toString() {
        return "mp3[pos=" + getPosition() + "]";
    }
}
