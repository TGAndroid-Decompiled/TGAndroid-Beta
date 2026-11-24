package defpackage;

import java.util.ArrayList;
public final class lj {
    public final qj0 a;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final float g;
    public final ArrayList b = new ArrayList(5);
    public final int[] h = new int[3];

    public lj(qj0 qj0Var, int i, int i2, int i3, int i4, float f) {
        this.a = qj0Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = f;
    }

    public final boolean a(int[] iArr) {
        float f = this.g;
        float f2 = f / 2.0f;
        for (int i = 0; i < 3; i++) {
            if (Math.abs(f - iArr[i]) >= f2) {
                return false;
            }
        }
        return true;
    }

    public final kj b(int i, int i2, int[] iArr) {
        int i3;
        int i4 = 0;
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = i5 + i6 + iArr[2];
        float f = (i2 - i3) - (i6 / 2.0f);
        int i8 = (int) f;
        int i9 = i6 << 1;
        qj0 qj0Var = this.a;
        int i10 = qj0Var.b;
        int[] iArr2 = this.h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        int i11 = i;
        while (i11 >= 0 && qj0Var.b(i8, i11)) {
            int i12 = iArr2[1];
            if (i12 > i9) {
                break;
            }
            iArr2[1] = i12 + 1;
            i11--;
        }
        float f2 = Float.NaN;
        if (i11 >= 0 && iArr2[1] <= i9) {
            while (i11 >= 0 && !qj0Var.b(i8, i11)) {
                int i13 = iArr2[0];
                if (i13 > i9) {
                    break;
                }
                iArr2[0] = i13 + 1;
                i11--;
            }
            if (iArr2[0] <= i9) {
                int i14 = i + 1;
                while (i14 < i10 && qj0Var.b(i8, i14)) {
                    int i15 = iArr2[1];
                    if (i15 > i9) {
                        break;
                    }
                    iArr2[1] = i15 + 1;
                    i14++;
                }
                if (i14 != i10 && iArr2[1] <= i9) {
                    while (i14 < i10 && !qj0Var.b(i8, i14)) {
                        int i16 = iArr2[2];
                        if (i16 > i9) {
                            break;
                        }
                        iArr2[2] = i16 + 1;
                        i14++;
                    }
                    int i17 = iArr2[2];
                    if (i17 <= i9 && Math.abs(((iArr2[0] + iArr2[1]) + i17) - i7) * 5 < (i7 << 1) && a(iArr2)) {
                        f2 = (i14 - iArr2[2]) - (iArr2[1] / 2.0f);
                    }
                }
            }
        }
        if (!Float.isNaN(f2)) {
            float f3 = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                kj kjVar = (kj) obj;
                float f4 = kjVar.c;
                float f5 = kjVar.a;
                float f6 = kjVar.b;
                if (Math.abs(f2 - f6) <= f3 && Math.abs(f - f5) <= f3) {
                    float abs = Math.abs(f3 - f4);
                    if (abs <= 1.0f || abs <= f4) {
                        return new kj((f5 + f) / 2.0f, (f6 + f2) / 2.0f, (kjVar.c + f3) / 2.0f);
                    }
                }
            }
            arrayList.add(new kj(f, f2, f3));
            return null;
        }
        return null;
    }
}
