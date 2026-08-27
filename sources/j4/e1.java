package j4;

import java.util.Arrays;
import java.util.Random;

public final class e1 implements g1 {

    public final Random f12545a;

    public final int[] f12546b;

    public final int[] f12547c;

    public e1() {
        this(new Random());
    }

    @Override
    public final g1 a(int i10, int i11) {
        int i12 = i11 - i10;
        int[] iArr = this.f12546b;
        int[] iArr2 = new int[iArr.length - i12];
        int i13 = 0;
        for (int i14 = 0; i14 < iArr.length; i14++) {
            int i15 = iArr[i14];
            if (i15 < i10 || i15 >= i11) {
                int i16 = i14 - i13;
                if (i15 >= i10) {
                    i15 -= i12;
                }
                iArr2[i16] = i15;
            } else {
                i13++;
            }
        }
        return new e1(iArr2, new Random(this.f12545a.nextLong()));
    }

    @Override
    public final int b() {
        int[] iArr = this.f12546b;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    @Override
    public final int c(int i10) {
        int i11 = this.f12547c[i10] - 1;
        if (i11 >= 0) {
            return this.f12546b[i11];
        }
        return -1;
    }

    @Override
    public final int d(int i10) {
        int i11 = this.f12547c[i10] + 1;
        int[] iArr = this.f12546b;
        if (i11 < iArr.length) {
            return iArr[i11];
        }
        return -1;
    }

    @Override
    public final g1 e(int i10, int i11) {
        int[] iArr;
        Random random;
        int[] iArr2 = new int[i11];
        int[] iArr3 = new int[i11];
        int i12 = 0;
        while (true) {
            iArr = this.f12546b;
            random = this.f12545a;
            if (i12 >= i11) {
                break;
            }
            iArr2[i12] = random.nextInt(iArr.length + 1);
            int i13 = i12 + 1;
            int iNextInt = random.nextInt(i13);
            iArr3[i12] = iArr3[iNextInt];
            iArr3[iNextInt] = i12 + i10;
            i12 = i13;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i11];
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < iArr.length + i11; i16++) {
            if (i14 >= i11 || i15 != iArr2[i14]) {
                int i17 = i15 + 1;
                int i18 = iArr[i15];
                iArr4[i16] = i18;
                if (i18 >= i10) {
                    iArr4[i16] = i18 + i11;
                }
                i15 = i17;
            } else {
                iArr4[i16] = iArr3[i14];
                i14++;
            }
        }
        return new e1(iArr4, new Random(random.nextLong()));
    }

    @Override
    public final int f() {
        int[] iArr = this.f12546b;
        if (iArr.length > 0) {
            return iArr[iArr.length - 1];
        }
        return -1;
    }

    @Override
    public final g1 g() {
        return new e1(new Random(this.f12545a.nextLong()));
    }

    @Override
    public final int getLength() {
        return this.f12546b.length;
    }

    public e1(int[] iArr, Random random) {
        this.f12546b = iArr;
        this.f12545a = random;
        this.f12547c = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.f12547c[iArr[i10]] = i10;
        }
    }

    public e1(Random random) {
        this(new int[0], random);
    }
}
