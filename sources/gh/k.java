package gh;
public final class k {
    public int f12347a;
    public final int[] f12348b = new int[8];
    public float f12349c;
    public float d;
    public int f12350e;
    public int f12351f;
    public int f12352g;
    public int h;
    public int f12353i;
    public boolean f12354j;
    public boolean f12355k;
    public int f12356l;
    public int f12357m;
    public int f12358n;
    public int f12359o;
    public int f12360p;
    public int f12361q;

    public static long b(int i3, long j10) {
        return (j10 ^ i3) * 1099511628211L;
    }

    public final long a() {
        int i3;
        long b10 = b(this.f12347a, -3750763034362895579L);
        for (int i10 : this.f12348b) {
            b10 = b(i10, b10);
        }
        long b11 = b(Float.floatToIntBits(this.d), b(Float.floatToIntBits(this.f12349c), b10));
        int i11 = -1;
        if (this.f12354j) {
            i3 = -1;
        } else {
            i3 = this.h;
        }
        long b12 = b(i3, b11);
        if (!this.f12355k) {
            i11 = this.f12353i;
        }
        return b(this.f12361q, b(this.f12360p, b(this.f12359o, b(this.f12358n, b(this.f12357m, b(this.f12356l, b(i11, b12)))))));
    }
}
