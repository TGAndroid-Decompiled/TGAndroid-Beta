package b8;

import java.io.OutputStream;
public final class b0 extends OutputStream {
    public final int f2476a;
    public long f2477b;

    @Override
    public final void write(int i3) {
        switch (this.f2476a) {
            case 0:
                this.f2477b++;
                return;
            case 1:
                this.f2477b++;
                return;
            case 2:
                this.f2477b++;
                return;
            case 3:
                this.f2477b++;
                return;
            default:
                this.f2477b++;
                return;
        }
    }

    @Override
    public final void write(byte[] bArr) {
        switch (this.f2476a) {
            case 0:
                this.f2477b += bArr.length;
                return;
            case 1:
                this.f2477b += bArr.length;
                return;
            case 2:
                this.f2477b += bArr.length;
                return;
            case 3:
                this.f2477b += bArr.length;
                return;
            default:
                this.f2477b += bArr.length;
                return;
        }
    }

    @Override
    public final void write(byte[] bArr, int i3, int i10) {
        int length;
        int i11;
        int i12;
        int length2;
        int i13;
        int length3;
        int i14;
        int length4;
        int i15;
        switch (this.f2476a) {
            case 0:
                if (i3 >= 0 && i3 <= (length = bArr.length) && i10 >= 0 && (i11 = i3 + i10) <= length && i11 >= 0) {
                    this.f2477b += i10;
                    return;
                }
                throw new IndexOutOfBoundsException();
            case 1:
                if (i3 >= 0 && i3 <= bArr.length && i10 >= 0 && (i12 = i3 + i10) <= bArr.length && i12 >= 0) {
                    this.f2477b += i10;
                    return;
                }
                throw new IndexOutOfBoundsException();
            case 2:
                if (i3 >= 0 && i3 <= (length2 = bArr.length) && i10 >= 0 && (i13 = i3 + i10) <= length2 && i13 >= 0) {
                    this.f2477b += i10;
                    return;
                }
                throw new IndexOutOfBoundsException();
            case 3:
                if (i3 >= 0 && i3 <= (length3 = bArr.length) && i10 >= 0 && (i14 = i3 + i10) <= length3 && i14 >= 0) {
                    this.f2477b += i10;
                    return;
                }
                throw new IndexOutOfBoundsException();
            default:
                if (i3 >= 0 && i3 <= (length4 = bArr.length) && i10 >= 0 && (i15 = i3 + i10) <= length4 && i15 >= 0) {
                    this.f2477b += i10;
                    return;
                }
                throw new IndexOutOfBoundsException();
        }
    }
}
