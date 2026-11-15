package fh;
public final class k {
    public int f11367a;
    public final int[] f11368b = new int[8];
    public float f11369c;
    public float d;
    public int f11370e;
    public int f11371f;
    public int f11372g;
    public int h;
    public int f11373i;
    public boolean f11374j;
    public boolean f11375k;
    public int f11376l;
    public int f11377m;
    public int f11378n;
    public int f11379o;
    public int f11380p;
    public int f11381q;

    public static long b(int i7, long j3) {
        return (j3 ^ i7) * 1099511628211L;
    }

    public final long a() {
        int i7;
        long b10 = b(this.f11367a, -3750763034362895579L);
        for (int i10 : this.f11368b) {
            b10 = b(i10, b10);
        }
        long b11 = b(Float.floatToIntBits(this.d), b(Float.floatToIntBits(this.f11369c), b10));
        int i11 = -1;
        if (this.f11374j) {
            i7 = -1;
        } else {
            i7 = this.h;
        }
        long b12 = b(i7, b11);
        if (!this.f11375k) {
            i11 = this.f11373i;
        }
        return b(this.f11381q, b(this.f11380p, b(this.f11379o, b(this.f11378n, b(this.f11377m, b(this.f11376l, b(i11, b12)))))));
    }
}
