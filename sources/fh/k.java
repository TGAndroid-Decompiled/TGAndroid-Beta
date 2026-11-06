package fh;
public final class k {
    public int f11552a;
    public final int[] f11553b = new int[8];
    public float f11554c;
    public float d;
    public int f11555e;
    public int f11556f;
    public int f11557g;
    public int h;
    public int f11558i;
    public boolean f11559j;
    public boolean f11560k;
    public int f11561l;
    public int f11562m;
    public int f11563n;
    public int f11564o;
    public int f11565p;
    public int f11566q;

    public static long b(int i7, long j3) {
        return (j3 ^ i7) * 1099511628211L;
    }

    public final long a() {
        int i7;
        long b10 = b(this.f11552a, -3750763034362895579L);
        for (int i10 : this.f11553b) {
            b10 = b(i10, b10);
        }
        long b11 = b(Float.floatToIntBits(this.d), b(Float.floatToIntBits(this.f11554c), b10));
        int i11 = -1;
        if (this.f11559j) {
            i7 = -1;
        } else {
            i7 = this.h;
        }
        long b12 = b(i7, b11);
        if (!this.f11560k) {
            i11 = this.f11558i;
        }
        return b(this.f11566q, b(this.f11565p, b(this.f11564o, b(this.f11563n, b(this.f11562m, b(this.f11561l, b(i11, b12)))))));
    }
}
