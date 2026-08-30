package c2;

import java.util.NoSuchElementException;
public final class a1 implements z3.d {
    public int f1895a = 0;
    public int f1896b = -1;
    public int f1897c = 0;
    public int d;
    public Object e;

    public a1() {
        int[] iArr = new int[16];
        this.e = iArr;
        this.d = iArr.length - 1;
    }

    @Override
    public int a() {
        return -1;
    }

    @Override
    public int b() {
        return this.f1895a;
    }

    @Override
    public int c() {
        h5.w wVar = (h5.w) this.e;
        int i10 = this.f1896b;
        if (i10 == 8) {
            return wVar.u();
        }
        if (i10 == 16) {
            return wVar.z();
        }
        int i11 = this.f1897c;
        this.f1897c = i11 + 1;
        if (i11 % 2 == 0) {
            int u10 = wVar.u();
            this.d = u10;
            return (u10 & 240) >> 4;
        }
        return this.d & 15;
    }

    public void d(int i10) {
        int i11 = this.f1897c;
        int[] iArr = (int[]) this.e;
        if (i11 == iArr.length) {
            int length = iArr.length << 1;
            if (length >= 0) {
                int[] iArr2 = new int[length];
                int length2 = iArr.length;
                int i12 = this.f1895a;
                int i13 = length2 - i12;
                System.arraycopy(iArr, i12, iArr2, 0, i13);
                System.arraycopy((int[]) this.e, 0, iArr2, i13, i12);
                this.f1895a = 0;
                this.f1896b = this.f1897c - 1;
                this.e = iArr2;
                this.d = length - 1;
            } else {
                throw new IllegalStateException();
            }
        }
        int i14 = (this.f1896b + 1) & this.d;
        this.f1896b = i14;
        ((int[]) this.e)[i14] = i10;
        this.f1897c++;
    }

    public int e() {
        int i10 = this.f1897c;
        if (i10 != 0) {
            int i11 = this.f1895a;
            int i12 = ((int[]) this.e)[i11];
            this.f1895a = (i11 + 1) & this.d;
            this.f1897c = i10 - 1;
            return i12;
        }
        throw new NoSuchElementException();
    }
}
