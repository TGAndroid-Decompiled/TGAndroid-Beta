package defpackage;
public abstract class w8b {
    public wxb b;
    public l74 c;
    public lo7 d;
    public long e;
    public long f;
    public long g;
    public byte h;
    public int i;
    public long k;
    public boolean l;
    public boolean m;
    public final jo7 a = new jo7();
    public v8b j = new v8b((byte) 0, false);

    public void a(long j) {
        this.g = j;
    }

    public long b(xu7 xu7Var) {
        byte[] bArr = xu7Var.a;
        if (bArr[0] == -1) {
            int i = (bArr[2] & 255) >> 4;
            if (i == 6 || i == 7) {
                xu7Var.O(4);
                xu7Var.I();
            }
            int b = nge.b(i, xu7Var);
            xu7Var.N(0);
            return b;
        }
        return -1L;
    }

    public abstract boolean c(xu7 xu7Var, long j, v8b v8bVar);

    public void d(boolean z) {
        if (z) {
            this.j = new v8b((byte) 0, false);
            this.f = 0L;
            this.h = (byte) 0;
        } else {
            this.h = (byte) 1;
        }
        this.e = -1L;
        this.g = 0L;
    }
}
