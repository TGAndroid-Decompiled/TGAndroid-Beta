package oc;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
public final class y extends FilterInputStream {
    public final int f21035a;

    public y(BufferedInputStream bufferedInputStream, int i3) {
        super(bufferedInputStream);
        this.f21035a = i3;
    }

    public static int a(int i3) {
        if (i3 >= 48 && i3 <= 57) {
            return i3 - 48;
        }
        if (i3 >= 65 && i3 <= 70) {
            return i3 - 55;
        }
        if (i3 >= 97 && i3 <= 102) {
            return i3 - 87;
        }
        return 0;
    }

    public void b(int i3, byte[] bArr) {
        int i10 = 0;
        while (i10 < i3) {
            int read = read(bArr, i10, i3 - i10);
            if (read > 0) {
                i10 += read;
            } else {
                throw new j(i10);
            }
        }
    }

    public oc.x c() {
        throw new UnsupportedOperationException("Method not decompiled: oc.y.c():oc.x");
    }

    @Override
    public int read() {
        switch (this.f21035a) {
            case 1:
                int read = ((FilterInputStream) this).in.read();
                if (read == 61) {
                    int read2 = ((FilterInputStream) this).in.read();
                    int read3 = ((FilterInputStream) this).in.read();
                    if (read2 == -1 || read3 == -1) {
                        return -1;
                    }
                    if (read2 == 13 && read3 == 10) {
                        return read();
                    }
                    return (read2 == 10 || read3 == 10) ? read3 : (a(read2) << 4) | a(read3);
                }
                return read;
            default:
                return super.read();
        }
    }

    @Override
    public int read(byte[] bArr, int i3, int i10) {
        switch (this.f21035a) {
            case 1:
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    int read = read();
                    if (read == -1) {
                        if (i11 == 0) {
                            return -1;
                        }
                        return i11;
                    }
                    bArr[i3 + i12] = (byte) read;
                    i11++;
                }
                return i11;
            default:
                return super.read(bArr, i3, i10);
        }
    }
}
