package fh;
public final class k {
    public int f11687a;
    public final int[] f11688b = new int[8];
    public float f11689c;
    public float d;
    public int f11690e;
    public int f11691f;
    public int f11692g;
    public int h;
    public int f11693i;
    public boolean f11694j;
    public boolean f11695k;
    public int f11696l;
    public int f11697m;
    public int f11698n;
    public int f11699o;
    public int f11700p;
    public int f11701q;

    public static long b(int i7, long j3) {
        return (j3 ^ i7) * 1099511628211L;
    }

    public final long a() {
        int i7;
        long b10 = b(this.f11687a, -3750763034362895579L);
        for (int i10 : this.f11688b) {
            b10 = b(i10, b10);
        }
        long b11 = b(Float.floatToIntBits(this.d), b(Float.floatToIntBits(this.f11689c), b10));
        int i11 = -1;
        if (this.f11694j) {
            i7 = -1;
        } else {
            i7 = this.h;
        }
        long b12 = b(i7, b11);
        if (!this.f11695k) {
            i11 = this.f11693i;
        }
        return b(this.f11701q, b(this.f11700p, b(this.f11699o, b(this.f11698n, b(this.f11697m, b(this.f11696l, b(i11, b12)))))));
    }
}
