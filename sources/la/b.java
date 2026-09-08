package la;

import java.io.OutputStream;
public final class b extends OutputStream {
    public final int f15348a;
    public long f15349b;

    @Override
    public final void write(int i10) {
        switch (this.f15348a) {
            case 0:
                this.f15349b++;
                return;
            case 1:
                this.f15349b++;
                return;
            case 2:
                this.f15349b++;
                return;
            case 3:
                this.f15349b++;
                return;
            default:
                this.f15349b++;
                return;
        }
    }

    @Override
    public final void write(byte[] bArr) {
        switch (this.f15348a) {
            case 0:
                this.f15349b += bArr.length;
                return;
            case 1:
                this.f15349b += bArr.length;
                return;
            case 2:
                this.f15349b += bArr.length;
                return;
            case 3:
                this.f15349b += bArr.length;
                return;
            default:
                this.f15349b += bArr.length;
                return;
        }
    }

    @Override
    public final void write(byte[] bArr, int i10, int i11) {
        int i12;
        int length;
        int i13;
        int length2;
        int i14;
        int length3;
        int i15;
        int length4;
        int i16;
        switch (this.f15348a) {
            case 0:
                if (i10 >= 0 && i10 <= bArr.length && i11 >= 0 && (i12 = i10 + i11) <= bArr.length && i12 >= 0) {
                    this.f15349b += i11;
                    return;
                }
                throw new IndexOutOfBoundsException();
            case 1:
                if (i10 >= 0 && i10 <= (length = bArr.length) && i11 >= 0 && (i13 = i10 + i11) <= length && i13 >= 0) {
                    this.f15349b += i11;
                    return;
                }
                throw new IndexOutOfBoundsException();
            case 2:
                if (i10 >= 0 && i10 <= (length2 = bArr.length) && i11 >= 0 && (i14 = i10 + i11) <= length2 && i14 >= 0) {
                    this.f15349b += i11;
                    return;
                }
                throw new IndexOutOfBoundsException();
            case 3:
                if (i10 >= 0 && i10 <= (length3 = bArr.length) && i11 >= 0 && (i15 = i10 + i11) <= length3 && i15 >= 0) {
                    this.f15349b += i11;
                    return;
                }
                throw new IndexOutOfBoundsException();
            default:
                if (i10 >= 0 && i10 <= (length4 = bArr.length) && i11 >= 0 && (i16 = i10 + i11) <= length4 && i16 >= 0) {
                    this.f15349b += i11;
                    return;
                }
                throw new IndexOutOfBoundsException();
        }
    }
}
