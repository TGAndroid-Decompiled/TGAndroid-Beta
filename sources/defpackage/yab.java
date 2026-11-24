package defpackage;
public abstract class yab {
    public yzb b;
    public u84 c;
    public oq7 d;
    public long e;
    public long f;
    public long g;
    public byte h;
    public int i;
    public long k;
    public boolean l;
    public boolean m;
    public final mq7 a = new mq7();
    public xab j = new xab((byte) 0, false);

    public void a(long j) {
        this.g = j;
    }

    public long b(yw7 yw7Var) {
        byte[] bArr = yw7Var.a;
        if (bArr[0] == -1) {
            int i = (bArr[2] & 255) >> 4;
            if (i == 6 || i == 7) {
                yw7Var.O(4);
                yw7Var.I();
            }
            int b = oie.b(i, yw7Var);
            yw7Var.N(0);
            return b;
        }
        return -1L;
    }

    public abstract boolean c(yw7 yw7Var, long j, xab xabVar);

    public void d(boolean z) {
        if (z) {
            this.j = new xab((byte) 0, false);
            this.f = 0L;
            this.h = (byte) 0;
        } else {
            this.h = (byte) 1;
        }
        this.e = -1L;
        this.g = 0L;
    }
}
