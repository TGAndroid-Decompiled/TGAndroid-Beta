package defpackage;
public final class dx4 {
    public byte a;
    public final int[] b = new int[8];
    public float c;
    public float d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;

    public static long b(int i, long j) {
        return (j ^ i) * 1099511628211L;
    }

    public final long a() {
        int i;
        long b = b(this.a, -3750763034362895579L);
        for (int i2 : this.b) {
            b = b(i2, b);
        }
        long b2 = b(Float.floatToIntBits(this.d), b(Float.floatToIntBits(this.c), b));
        int i3 = -1;
        if (this.j) {
            i = -1;
        } else {
            i = this.h;
        }
        long b3 = b(i, b2);
        if (!this.k) {
            i3 = this.i;
        }
        return b(this.q, b(this.p, b(this.o, b(this.n, b(this.m, b(this.l, b(i3, b3)))))));
    }
}
