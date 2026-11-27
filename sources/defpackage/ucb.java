package defpackage;
public abstract class ucb {
    public x1c b;
    public g84 c;
    public lr7 d;
    public long e;
    public long f;
    public long g;
    public byte h;
    public int i;
    public long k;
    public boolean l;
    public boolean m;
    public final jr7 a = new jr7();
    public k7b j = new k7b((byte) 1, false);

    public void a(long j) {
        this.g = j;
    }

    public long b(ey7 ey7Var) {
        byte[] bArr = ey7Var.a;
        if (bArr[0] == -1) {
            int i = (bArr[2] & 255) >> 4;
            if (i == 6 || i == 7) {
                ey7Var.O(4);
                ey7Var.I();
            }
            int b = hle.b(i, ey7Var);
            ey7Var.N(0);
            return b;
        }
        return -1L;
    }

    public abstract boolean c(ey7 ey7Var, long j, k7b k7bVar);

    public void d(boolean z) {
        if (z) {
            this.j = new k7b((byte) 1, false);
            this.f = 0L;
            this.h = (byte) 0;
        } else {
            this.h = (byte) 1;
        }
        this.e = -1L;
        this.g = 0L;
    }
}
