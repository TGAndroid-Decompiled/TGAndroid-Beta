package c2;

import java.util.NoSuchElementException;

public final class a1 implements u3.d {

    public int f2229a = 0;

    public int f2230b = -1;

    public int f2231c = 0;
    public int d;

    public Object f2232e;

    public a1() {
        int[] iArr = new int[16];
        this.f2232e = iArr;
        this.d = iArr.length - 1;
    }

    @Override
    public int a() {
        return -1;
    }

    @Override
    public int b() {
        return this.f2229a;
    }

    @Override
    public int c() {
        d5.z zVar = (d5.z) this.f2232e;
        int i10 = this.f2230b;
        if (i10 == 8) {
            return zVar.r();
        }
        if (i10 == 16) {
            return zVar.w();
        }
        int i11 = this.f2231c;
        this.f2231c = i11 + 1;
        if (i11 % 2 != 0) {
            return this.d & 15;
        }
        int iR = zVar.r();
        this.d = iR;
        return (iR & 240) >> 4;
    }

    public void d(int i10) {
        int i11 = this.f2231c;
        int[] iArr = (int[]) this.f2232e;
        if (i11 == iArr.length) {
            int length = iArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i12 = this.f2229a;
            int i13 = length2 - i12;
            System.arraycopy(iArr, i12, iArr2, 0, i13);
            System.arraycopy((int[]) this.f2232e, 0, iArr2, i13, i12);
            this.f2229a = 0;
            this.f2230b = this.f2231c - 1;
            this.f2232e = iArr2;
            this.d = length - 1;
        }
        int i14 = (this.f2230b + 1) & this.d;
        this.f2230b = i14;
        ((int[]) this.f2232e)[i14] = i10;
        this.f2231c++;
    }

    public int e() {
        int i10 = this.f2231c;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = (int[]) this.f2232e;
        int i11 = this.f2229a;
        int i12 = iArr[i11];
        this.f2229a = (i11 + 1) & this.d;
        this.f2231c = i10 - 1;
        return i12;
    }
}
