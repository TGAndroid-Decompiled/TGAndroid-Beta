package fh;
public final class k {
    public int f11678a;
    public final int[] f11679b = new int[8];
    public float f11680c;
    public float d;
    public int f11681e;
    public int f11682f;
    public int f11683g;
    public int h;
    public int f11684i;
    public boolean f11685j;
    public boolean f11686k;
    public int f11687l;
    public int f11688m;
    public int f11689n;
    public int f11690o;
    public int f11691p;
    public int f11692q;

    public static long b(int i7, long j3) {
        return (j3 ^ i7) * 1099511628211L;
    }

    public final long a() {
        int i7;
        long b10 = b(this.f11678a, -3750763034362895579L);
        for (int i10 : this.f11679b) {
            b10 = b(i10, b10);
        }
        long b11 = b(Float.floatToIntBits(this.d), b(Float.floatToIntBits(this.f11680c), b10));
        int i11 = -1;
        if (this.f11685j) {
            i7 = -1;
        } else {
            i7 = this.h;
        }
        long b12 = b(i7, b11);
        if (!this.f11686k) {
            i11 = this.f11684i;
        }
        return b(this.f11692q, b(this.f11691p, b(this.f11690o, b(this.f11689n, b(this.f11688m, b(this.f11687l, b(i11, b12)))))));
    }
}
