package f7;

import java.io.OutputStream;
public final class f extends OutputStream {
    public final int f5654a;
    public long f5655b;

    @Override
    public final void write(int i9) {
        switch (this.f5654a) {
            case 0:
                this.f5655b++;
                return;
            case 1:
                this.f5655b++;
                return;
            case 2:
                this.f5655b++;
                return;
            case 3:
                this.f5655b++;
                return;
            default:
                this.f5655b++;
                return;
        }
    }

    @Override
    public final void write(byte[] bArr) {
        switch (this.f5654a) {
            case 0:
                this.f5655b += bArr.length;
                return;
            case 1:
                this.f5655b += bArr.length;
                return;
            case 2:
                this.f5655b += bArr.length;
                return;
            case 3:
                this.f5655b += bArr.length;
                return;
            default:
                this.f5655b += bArr.length;
                return;
        }
    }

    @Override
    public final void write(byte[] bArr, int i9, int i10) {
        int length;
        int i11;
        int length2;
        int i12;
        int length3;
        int i13;
        int length4;
        int i14;
        int i15;
        switch (this.f5654a) {
            case 0:
                if (i9 >= 0 && i9 <= (length = bArr.length) && i10 >= 0 && (i11 = i9 + i10) <= length && i11 >= 0) {
                    this.f5655b += i10;
                    return;
                }
                throw new IndexOutOfBoundsException();
            case 1:
                if (i9 >= 0 && i9 <= (length2 = bArr.length) && i10 >= 0 && (i12 = i9 + i10) <= length2 && i12 >= 0) {
                    this.f5655b += i10;
                    return;
                }
                throw new IndexOutOfBoundsException();
            case 2:
                if (i9 >= 0 && i9 <= (length3 = bArr.length) && i10 >= 0 && (i13 = i9 + i10) <= length3 && i13 >= 0) {
                    this.f5655b += i10;
                    return;
                }
                throw new IndexOutOfBoundsException();
            case 3:
                if (i9 >= 0 && i9 <= (length4 = bArr.length) && i10 >= 0 && (i14 = i9 + i10) <= length4 && i14 >= 0) {
                    this.f5655b += i10;
                    return;
                }
                throw new IndexOutOfBoundsException();
            default:
                if (i9 >= 0 && i9 <= bArr.length && i10 >= 0 && (i15 = i9 + i10) <= bArr.length && i15 >= 0) {
                    this.f5655b += i10;
                    return;
                }
                throw new IndexOutOfBoundsException();
        }
    }
}
