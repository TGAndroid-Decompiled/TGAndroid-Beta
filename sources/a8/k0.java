package a8;

import java.io.OutputStream;
public final class k0 extends OutputStream {
    public final int f500a;
    public long f501b;

    @Override
    public final void write(int i7) {
        switch (this.f500a) {
            case 0:
                this.f501b++;
                return;
            case 1:
                this.f501b++;
                return;
            case 2:
                this.f501b++;
                return;
            case 3:
                this.f501b++;
                return;
            default:
                this.f501b++;
                return;
        }
    }

    @Override
    public final void write(byte[] bArr) {
        switch (this.f500a) {
            case 0:
                this.f501b += bArr.length;
                return;
            case 1:
                this.f501b += bArr.length;
                return;
            case 2:
                this.f501b += bArr.length;
                return;
            case 3:
                this.f501b += bArr.length;
                return;
            default:
                this.f501b += bArr.length;
                return;
        }
    }

    @Override
    public final void write(byte[] bArr, int i7, int i10) {
        int length;
        int i11;
        int length2;
        int i12;
        int i13;
        int length3;
        int i14;
        int length4;
        int i15;
        switch (this.f500a) {
            case 0:
                if (i7 >= 0 && i7 <= (length = bArr.length) && i10 >= 0 && (i11 = i7 + i10) <= length && i11 >= 0) {
                    this.f501b += i10;
                    return;
                }
                throw new IndexOutOfBoundsException();
            case 1:
                if (i7 >= 0 && i7 <= (length2 = bArr.length) && i10 >= 0 && (i12 = i7 + i10) <= length2 && i12 >= 0) {
                    this.f501b += i10;
                    return;
                }
                throw new IndexOutOfBoundsException();
            case 2:
                if (i7 >= 0 && i7 <= bArr.length && i10 >= 0 && (i13 = i7 + i10) <= bArr.length && i13 >= 0) {
                    this.f501b += i10;
                    return;
                }
                throw new IndexOutOfBoundsException();
            case 3:
                if (i7 >= 0 && i7 <= (length3 = bArr.length) && i10 >= 0 && (i14 = i7 + i10) <= length3 && i14 >= 0) {
                    this.f501b += i10;
                    return;
                }
                throw new IndexOutOfBoundsException();
            default:
                if (i7 >= 0 && i7 <= (length4 = bArr.length) && i10 >= 0 && (i15 = i7 + i10) <= length4 && i15 >= 0) {
                    this.f501b += i10;
                    return;
                }
                throw new IndexOutOfBoundsException();
        }
    }
}
