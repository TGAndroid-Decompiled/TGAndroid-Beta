package defpackage;

import java.util.Arrays;
public final class dyd {
    public static final dyd e = new dyd(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public boolean d;

    public dyd(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.d = z;
    }

    public static dyd b() {
        return new dyd(0, new int[8], new Object[8], true);
    }

    public final void a(int i, Object obj) {
        int i2;
        if (this.d) {
            int i3 = this.a;
            int[] iArr = this.b;
            if (i3 == iArr.length) {
                if (i3 < 4) {
                    i2 = 8;
                } else {
                    i2 = i3 >> 1;
                }
                int i4 = i3 + i2;
                this.b = Arrays.copyOf(iArr, i4);
                this.c = Arrays.copyOf(this.c, i4);
            }
            int[] iArr2 = this.b;
            int i5 = this.a;
            iArr2[i5] = i;
            this.c[i5] = obj;
            this.a = i5 + 1;
            return;
        }
        fvc.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof dyd)) {
            return false;
        }
        dyd dydVar = (dyd) obj;
        int i = this.a;
        if (i == dydVar.a) {
            int[] iArr = this.b;
            int[] iArr2 = dydVar.b;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (iArr[i2] != iArr2[i2]) {
                        break;
                    }
                    i2++;
                } else {
                    Object[] objArr = this.c;
                    Object[] objArr2 = dydVar.c;
                    int i3 = this.a;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}
