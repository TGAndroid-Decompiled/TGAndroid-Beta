package a4;

import java.util.NoSuchElementException;
public final class k implements w3.d {
    public int f95a = 0;
    public int f96b = -1;
    public int f97c = 0;
    public int d;
    public Object f98e;

    public k() {
        int[] iArr = new int[16];
        this.f98e = iArr;
        this.d = iArr.length - 1;
    }

    @Override
    public int a() {
        return -1;
    }

    @Override
    public int b() {
        return this.f95a;
    }

    @Override
    public int c() {
        f5.w wVar = (f5.w) this.f98e;
        int i10 = this.f96b;
        if (i10 == 8) {
            return wVar.r();
        }
        if (i10 == 16) {
            return wVar.w();
        }
        int i11 = this.f97c;
        this.f97c = i11 + 1;
        if (i11 % 2 == 0) {
            int r6 = wVar.r();
            this.d = r6;
            return (r6 & 240) >> 4;
        }
        return this.d & 15;
    }

    public void d(int i10) {
        int i11 = this.f97c;
        int[] iArr = (int[]) this.f98e;
        if (i11 == iArr.length) {
            int length = iArr.length << 1;
            if (length >= 0) {
                int[] iArr2 = new int[length];
                int length2 = iArr.length;
                int i12 = this.f95a;
                int i13 = length2 - i12;
                System.arraycopy(iArr, i12, iArr2, 0, i13);
                System.arraycopy((int[]) this.f98e, 0, iArr2, i13, i12);
                this.f95a = 0;
                this.f96b = this.f97c - 1;
                this.f98e = iArr2;
                this.d = length - 1;
            } else {
                throw new IllegalStateException();
            }
        }
        int i14 = (this.f96b + 1) & this.d;
        this.f96b = i14;
        ((int[]) this.f98e)[i14] = i10;
        this.f97c++;
    }

    public int e() {
        int i10 = this.f97c;
        if (i10 != 0) {
            int i11 = this.f95a;
            int i12 = ((int[]) this.f98e)[i11];
            this.f95a = (i11 + 1) & this.d;
            this.f97c = i10 - 1;
            return i12;
        }
        throw new NoSuchElementException();
    }
}
