package c2;

import java.util.NoSuchElementException;
public final class b1 implements u3.d {
    public int f2119a = 0;
    public int f2120b = -1;
    public int f2121c = 0;
    public int d;
    public Object f2122e;

    public b1() {
        int[] iArr = new int[16];
        this.f2122e = iArr;
        this.d = iArr.length - 1;
    }

    @Override
    public int a() {
        return -1;
    }

    @Override
    public int b() {
        return this.f2119a;
    }

    @Override
    public int c() {
        d5.y yVar = (d5.y) this.f2122e;
        int i9 = this.f2120b;
        if (i9 == 8) {
            return yVar.r();
        }
        if (i9 == 16) {
            return yVar.w();
        }
        int i10 = this.f2121c;
        this.f2121c = i10 + 1;
        if (i10 % 2 == 0) {
            int r10 = yVar.r();
            this.d = r10;
            return (r10 & 240) >> 4;
        }
        return this.d & 15;
    }

    public void d(int i9) {
        int i10 = this.f2121c;
        int[] iArr = (int[]) this.f2122e;
        if (i10 == iArr.length) {
            int length = iArr.length << 1;
            if (length >= 0) {
                int[] iArr2 = new int[length];
                int length2 = iArr.length;
                int i11 = this.f2119a;
                int i12 = length2 - i11;
                System.arraycopy(iArr, i11, iArr2, 0, i12);
                System.arraycopy((int[]) this.f2122e, 0, iArr2, i12, i11);
                this.f2119a = 0;
                this.f2120b = this.f2121c - 1;
                this.f2122e = iArr2;
                this.d = length - 1;
            } else {
                throw new IllegalStateException();
            }
        }
        int i13 = (this.f2120b + 1) & this.d;
        this.f2120b = i13;
        ((int[]) this.f2122e)[i13] = i9;
        this.f2121c++;
    }

    public int e() {
        int i9 = this.f2121c;
        if (i9 != 0) {
            int i10 = this.f2119a;
            int i11 = ((int[]) this.f2122e)[i10];
            this.f2119a = (i10 + 1) & this.d;
            this.f2121c = i9 - 1;
            return i11;
        }
        throw new NoSuchElementException();
    }
}
