package fh;
public final class k {
    public int f11679a;
    public final int[] f11680b = new int[8];
    public float f11681c;
    public float d;
    public int f11682e;
    public int f11683f;
    public int f11684g;
    public int h;
    public int f11685i;
    public boolean f11686j;
    public boolean f11687k;
    public int f11688l;
    public int f11689m;
    public int f11690n;
    public int f11691o;
    public int f11692p;
    public int f11693q;

    public static long b(int i7, long j3) {
        return (j3 ^ i7) * 1099511628211L;
    }

    public final long a() {
        int i7;
        long b10 = b(this.f11679a, -3750763034362895579L);
        for (int i10 : this.f11680b) {
            b10 = b(i10, b10);
        }
        long b11 = b(Float.floatToIntBits(this.d), b(Float.floatToIntBits(this.f11681c), b10));
        int i11 = -1;
        if (this.f11686j) {
            i7 = -1;
        } else {
            i7 = this.h;
        }
        long b12 = b(i7, b11);
        if (!this.f11687k) {
            i11 = this.f11685i;
        }
        return b(this.f11693q, b(this.f11692p, b(this.f11691o, b(this.f11690n, b(this.f11689m, b(this.f11688l, b(i11, b12)))))));
    }
}
