package fh;
public final class k {
    public int f11684a;
    public final int[] f11685b = new int[8];
    public float f11686c;
    public float d;
    public int f11687e;
    public int f11688f;
    public int f11689g;
    public int h;
    public int f11690i;
    public boolean f11691j;
    public boolean f11692k;
    public int f11693l;
    public int f11694m;
    public int f11695n;
    public int f11696o;
    public int f11697p;
    public int f11698q;

    public static long b(int i7, long j3) {
        return (j3 ^ i7) * 1099511628211L;
    }

    public final long a() {
        int i7;
        long b10 = b(this.f11684a, -3750763034362895579L);
        for (int i10 : this.f11685b) {
            b10 = b(i10, b10);
        }
        long b11 = b(Float.floatToIntBits(this.d), b(Float.floatToIntBits(this.f11686c), b10));
        int i11 = -1;
        if (this.f11691j) {
            i7 = -1;
        } else {
            i7 = this.h;
        }
        long b12 = b(i7, b11);
        if (!this.f11692k) {
            i11 = this.f11690i;
        }
        return b(this.f11698q, b(this.f11697p, b(this.f11696o, b(this.f11695n, b(this.f11694m, b(this.f11693l, b(i11, b12)))))));
    }
}
