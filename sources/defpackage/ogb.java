package defpackage;
public final class ogb {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public float[] f;
    public boolean g;

    public final int a(int i) {
        float f;
        if (i <= 0) {
            return Integer.MAX_VALUE;
        }
        int i2 = 0;
        for (float f2 : this.f) {
            if (f2 <= i) {
                i2++;
            } else {
                i2 += (int) Math.ceil((f2 * 1.12f) / f);
            }
        }
        return Math.max(1, i2);
    }

    public final int b(int i) {
        int i2;
        int i3;
        if (!this.g && i > 1 && this.f != null) {
            int i4 = this.d;
            int i5 = this.e;
            if (i4 < i5) {
                if (a(i5) > i) {
                    i2 = this.c;
                    i3 = this.e;
                    return i2 + i3;
                }
                int i6 = this.d;
                int i7 = this.e;
                while (i6 < i7) {
                    int i8 = (i6 + i7) >>> 1;
                    if (a(i8) <= i) {
                        i7 = i8;
                    } else {
                        i6 = i8 + 1;
                    }
                }
                return this.c + i6;
            }
        }
        i2 = this.c;
        i3 = this.e;
        return i2 + i3;
    }
}
