package defpackage;

import java.util.Arrays;
import java.util.Random;
public final class yia {
    public final Random a;
    public final int[] b;
    public final int[] c;

    public yia(int[] iArr, Random random) {
        this.b = iArr;
        this.a = random;
        this.c = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.c[iArr[i]] = i;
        }
    }

    public final yia a() {
        return new yia(new Random(this.a.nextLong()));
    }

    public final yia b(int i, int i2) {
        int[] iArr;
        Random random;
        int[] iArr2 = new int[i2];
        int[] iArr3 = new int[i2];
        int i3 = 0;
        while (true) {
            iArr = this.b;
            random = this.a;
            if (i3 >= i2) {
                break;
            }
            iArr2[i3] = random.nextInt(iArr.length + 1);
            int i4 = i3 + 1;
            int nextInt = random.nextInt(i4);
            iArr3[i3] = iArr3[nextInt];
            iArr3[nextInt] = i3 + i;
            i3 = i4;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i2];
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < iArr.length + i2; i7++) {
            if (i5 < i2 && i6 == iArr2[i5]) {
                iArr4[i7] = iArr3[i5];
                i5++;
            } else {
                int i8 = i6 + 1;
                int i9 = iArr[i6];
                iArr4[i7] = i9;
                if (i9 >= i) {
                    iArr4[i7] = i9 + i2;
                }
                i6 = i8;
            }
        }
        return new yia(iArr4, new Random(random.nextLong()));
    }

    public final int c() {
        return this.b.length;
    }

    public final int d(int i) {
        int i2 = this.c[i] - 1;
        if (i2 < 0) {
            return -1;
        }
        return this.b[i2];
    }

    public yia() {
        this(new Random());
    }

    public yia(Random random) {
        this(new int[0], random);
    }
}
