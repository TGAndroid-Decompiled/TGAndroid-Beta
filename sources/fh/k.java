package fh;
public final class k {
    public int f11716a;
    public final int[] f11717b = new int[8];
    public float f11718c;
    public float d;
    public int f11719e;
    public int f11720f;
    public int f11721g;
    public int h;
    public int f11722i;
    public boolean f11723j;
    public boolean f11724k;
    public int f11725l;
    public int f11726m;
    public int f11727n;
    public int f11728o;
    public int f11729p;
    public int f11730q;

    public static long b(int i7, long j3) {
        return (j3 ^ i7) * 1099511628211L;
    }

    public final long a() {
        int i7;
        long b10 = b(this.f11716a, -3750763034362895579L);
        for (int i10 : this.f11717b) {
            b10 = b(i10, b10);
        }
        long b11 = b(Float.floatToIntBits(this.d), b(Float.floatToIntBits(this.f11718c), b10));
        int i11 = -1;
        if (this.f11723j) {
            i7 = -1;
        } else {
            i7 = this.h;
        }
        long b12 = b(i7, b11);
        if (!this.f11724k) {
            i11 = this.f11722i;
        }
        return b(this.f11730q, b(this.f11729p, b(this.f11728o, b(this.f11727n, b(this.f11726m, b(this.f11725l, b(i11, b12)))))));
    }
}
