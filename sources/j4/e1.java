package j4;

import java.util.Arrays;
import java.util.Random;
public final class e1 implements g1 {
    public final Random f13441a;
    public final int[] f13442b;
    public final int[] f13443c;

    public e1() {
        this(new Random());
    }

    @Override
    public final g1 a(int i9, int i10) {
        int i11 = i10 - i9;
        int[] iArr = this.f13442b;
        int[] iArr2 = new int[iArr.length - i11];
        int i12 = 0;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            if (i14 >= i9 && i14 < i10) {
                i12++;
            } else {
                int i15 = i13 - i12;
                if (i14 >= i9) {
                    i14 -= i11;
                }
                iArr2[i15] = i14;
            }
        }
        return new e1(iArr2, new Random(this.f13441a.nextLong()));
    }

    @Override
    public final int b() {
        int[] iArr = this.f13442b;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    @Override
    public final int c(int i9) {
        int i10 = this.f13443c[i9] - 1;
        if (i10 < 0) {
            return -1;
        }
        return this.f13442b[i10];
    }

    @Override
    public final int d(int i9) {
        int i10 = this.f13443c[i9] + 1;
        int[] iArr = this.f13442b;
        if (i10 < iArr.length) {
            return iArr[i10];
        }
        return -1;
    }

    @Override
    public final g1 e(int i9, int i10) {
        int[] iArr;
        Random random;
        int[] iArr2 = new int[i10];
        int[] iArr3 = new int[i10];
        int i11 = 0;
        while (true) {
            iArr = this.f13442b;
            random = this.f13441a;
            if (i11 >= i10) {
                break;
            }
            iArr2[i11] = random.nextInt(iArr.length + 1);
            int i12 = i11 + 1;
            int nextInt = random.nextInt(i12);
            iArr3[i11] = iArr3[nextInt];
            iArr3[nextInt] = i11 + i9;
            i11 = i12;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i10];
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < iArr.length + i10; i15++) {
            if (i13 < i10 && i14 == iArr2[i13]) {
                iArr4[i15] = iArr3[i13];
                i13++;
            } else {
                int i16 = i14 + 1;
                int i17 = iArr[i14];
                iArr4[i15] = i17;
                if (i17 >= i9) {
                    iArr4[i15] = i17 + i10;
                }
                i14 = i16;
            }
        }
        return new e1(iArr4, new Random(random.nextLong()));
    }

    @Override
    public final int f() {
        int[] iArr = this.f13442b;
        if (iArr.length > 0) {
            return iArr[iArr.length - 1];
        }
        return -1;
    }

    @Override
    public final g1 g() {
        return new e1(new Random(this.f13441a.nextLong()));
    }

    @Override
    public final int getLength() {
        return this.f13442b.length;
    }

    public e1(int[] iArr, Random random) {
        this.f13442b = iArr;
        this.f13441a = random;
        this.f13443c = new int[iArr.length];
        for (int i9 = 0; i9 < iArr.length; i9++) {
            this.f13443c[iArr[i9]] = i9;
        }
    }

    public e1(Random random) {
        this(new int[0], random);
    }
}
