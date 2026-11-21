package fh;
public final class k {
    public int f11713a;
    public final int[] f11714b = new int[8];
    public float f11715c;
    public float d;
    public int f11716e;
    public int f11717f;
    public int f11718g;
    public int h;
    public int f11719i;
    public boolean f11720j;
    public boolean f11721k;
    public int f11722l;
    public int f11723m;
    public int f11724n;
    public int f11725o;
    public int f11726p;
    public int f11727q;

    public static long b(int i7, long j3) {
        return (j3 ^ i7) * 1099511628211L;
    }

    public final long a() {
        int i7;
        long b10 = b(this.f11713a, -3750763034362895579L);
        for (int i10 : this.f11714b) {
            b10 = b(i10, b10);
        }
        long b11 = b(Float.floatToIntBits(this.d), b(Float.floatToIntBits(this.f11715c), b10));
        int i11 = -1;
        if (this.f11720j) {
            i7 = -1;
        } else {
            i7 = this.h;
        }
        long b12 = b(i7, b11);
        if (!this.f11721k) {
            i11 = this.f11719i;
        }
        return b(this.f11727q, b(this.f11726p, b(this.f11725o, b(this.f11724n, b(this.f11723m, b(this.f11722l, b(i11, b12)))))));
    }
}
