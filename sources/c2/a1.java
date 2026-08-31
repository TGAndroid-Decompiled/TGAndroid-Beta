package c2;

import java.util.NoSuchElementException;
public final class a1 implements z3.d {
    public int f2058a = 0;
    public int f2059b = -1;
    public int f2060c = 0;
    public int d;
    public Object f2061e;

    public a1() {
        int[] iArr = new int[16];
        this.f2061e = iArr;
        this.d = iArr.length - 1;
    }

    @Override
    public int a() {
        return -1;
    }

    @Override
    public int b() {
        return this.f2058a;
    }

    @Override
    public int c() {
        h5.w wVar = (h5.w) this.f2061e;
        int i10 = this.f2059b;
        if (i10 == 8) {
            return wVar.u();
        }
        if (i10 == 16) {
            return wVar.z();
        }
        int i11 = this.f2060c;
        this.f2060c = i11 + 1;
        if (i11 % 2 == 0) {
            int u10 = wVar.u();
            this.d = u10;
            return (u10 & 240) >> 4;
        }
        return this.d & 15;
    }

    public void d(int i10) {
        int i11 = this.f2060c;
        int[] iArr = (int[]) this.f2061e;
        if (i11 == iArr.length) {
            int length = iArr.length << 1;
            if (length >= 0) {
                int[] iArr2 = new int[length];
                int length2 = iArr.length;
                int i12 = this.f2058a;
                int i13 = length2 - i12;
                System.arraycopy(iArr, i12, iArr2, 0, i13);
                System.arraycopy((int[]) this.f2061e, 0, iArr2, i13, i12);
                this.f2058a = 0;
                this.f2059b = this.f2060c - 1;
                this.f2061e = iArr2;
                this.d = length - 1;
            } else {
                throw new IllegalStateException();
            }
        }
        int i14 = (this.f2059b + 1) & this.d;
        this.f2059b = i14;
        ((int[]) this.f2061e)[i14] = i10;
        this.f2060c++;
    }

    public int e() {
        int i10 = this.f2060c;
        if (i10 != 0) {
            int i11 = this.f2058a;
            int i12 = ((int[]) this.f2061e)[i11];
            this.f2058a = (i11 + 1) & this.d;
            this.f2060c = i10 - 1;
            return i12;
        }
        throw new NoSuchElementException();
    }
}
