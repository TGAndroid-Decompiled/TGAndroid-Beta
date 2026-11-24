package defpackage;
public final class nyb implements Runnable {
    public final byte a;
    public final k27 b;
    public final long c;
    public final String d;

    public nyb(k27 k27Var, long j, String str, byte b) {
        this.a = b;
        this.b = k27Var;
        this.c = j;
        this.d = str;
    }

    @Override
    public final void run() {
        byte b = this.a;
        String str = this.d;
        long j = this.c;
        k27 k27Var = this.b;
        switch (b) {
            case 0:
                kk7 f = kk7.f(k27Var.K1);
                Long valueOf = Long.valueOf(j);
                Boolean bool = Boolean.TRUE;
                f.k(115, k27Var, valueOf, str, bool, bool);
                return;
            default:
                uyb.f(k27Var, j, str);
                return;
        }
    }
}
