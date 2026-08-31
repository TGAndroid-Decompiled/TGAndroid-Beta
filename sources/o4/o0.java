package o4;

import java.util.Arrays;
import java.util.Random;
public final class o0 implements q0 {
    public final Random f16540a;
    public final int[] f16541b;
    public final int[] f16542c;

    public o0() {
        this(new Random());
    }

    @Override
    public final int a() {
        int[] iArr = this.f16541b;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    @Override
    public final q0 b(int i10) {
        int[] iArr = this.f16541b;
        int[] iArr2 = new int[iArr.length - i10];
        int i11 = 0;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            int i13 = iArr[i12];
            if (i13 >= 0 && i13 < i10) {
                i11++;
            } else {
                int i14 = i12 - i11;
                if (i13 >= 0) {
                    i13 -= i10;
                }
                iArr2[i14] = i13;
            }
        }
        return new o0(iArr2, new Random(this.f16540a.nextLong()));
    }

    @Override
    public final int c(int i10) {
        int i11 = this.f16542c[i10] - 1;
        if (i11 < 0) {
            return -1;
        }
        return this.f16541b[i11];
    }

    @Override
    public final int d(int i10) {
        int i11 = this.f16542c[i10] + 1;
        int[] iArr = this.f16541b;
        if (i11 < iArr.length) {
            return iArr[i11];
        }
        return -1;
    }

    @Override
    public final q0 e(int i10) {
        int[] iArr;
        Random random;
        int[] iArr2 = new int[i10];
        int[] iArr3 = new int[i10];
        int i11 = 0;
        while (true) {
            iArr = this.f16541b;
            random = this.f16540a;
            if (i11 >= i10) {
                break;
            }
            iArr2[i11] = random.nextInt(iArr.length + 1);
            int i12 = i11 + 1;
            int nextInt = random.nextInt(i12);
            iArr3[i11] = iArr3[nextInt];
            iArr3[nextInt] = i11;
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
                if (i17 >= 0) {
                    iArr4[i15] = i17 + i10;
                }
                i14 = i16;
            }
        }
        return new o0(iArr4, new Random(random.nextLong()));
    }

    @Override
    public final int f() {
        int[] iArr = this.f16541b;
        if (iArr.length > 0) {
            return iArr[iArr.length - 1];
        }
        return -1;
    }

    @Override
    public final q0 g() {
        return new o0(new Random(this.f16540a.nextLong()));
    }

    @Override
    public final int getLength() {
        return this.f16541b.length;
    }

    public o0(int[] iArr, Random random) {
        this.f16541b = iArr;
        this.f16540a = random;
        this.f16542c = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.f16542c[iArr[i10]] = i10;
        }
    }

    public o0(Random random) {
        this(new int[0], random);
    }
}
