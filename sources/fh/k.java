package fh;
public final class k {
    public int f11557a;
    public final int[] f11558b = new int[8];
    public float f11559c;
    public float d;
    public int f11560e;
    public int f11561f;
    public int f11562g;
    public int h;
    public int f11563i;
    public boolean f11564j;
    public boolean f11565k;
    public int f11566l;
    public int f11567m;
    public int f11568n;
    public int f11569o;
    public int f11570p;
    public int f11571q;

    public static long b(int i7, long j3) {
        return (j3 ^ i7) * 1099511628211L;
    }

    public final long a() {
        int i7;
        long b10 = b(this.f11557a, -3750763034362895579L);
        for (int i10 : this.f11558b) {
            b10 = b(i10, b10);
        }
        long b11 = b(Float.floatToIntBits(this.d), b(Float.floatToIntBits(this.f11559c), b10));
        int i11 = -1;
        if (this.f11564j) {
            i7 = -1;
        } else {
            i7 = this.h;
        }
        long b12 = b(i7, b11);
        if (!this.f11565k) {
            i11 = this.f11563i;
        }
        return b(this.f11571q, b(this.f11570p, b(this.f11569o, b(this.f11568n, b(this.f11567m, b(this.f11566l, b(i11, b12)))))));
    }
}
