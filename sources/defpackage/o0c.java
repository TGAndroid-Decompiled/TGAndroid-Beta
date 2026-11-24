package defpackage;
public final class o0c implements Runnable {
    public final byte a;
    public final k47 b;
    public final long c;
    public final String d;

    public o0c(k47 k47Var, long j, String str, byte b) {
        this.a = b;
        this.b = k47Var;
        this.c = j;
        this.d = str;
    }

    @Override
    public final void run() {
        byte b = this.a;
        String str = this.d;
        long j = this.c;
        k47 k47Var = this.b;
        switch (b) {
            case 0:
                nm7 f = nm7.f(k47Var.K1);
                Long valueOf = Long.valueOf(j);
                Boolean bool = Boolean.TRUE;
                f.k(116, k47Var, valueOf, str, bool, bool);
                return;
            default:
                v0c.f(k47Var, j, str);
                return;
        }
    }
}
