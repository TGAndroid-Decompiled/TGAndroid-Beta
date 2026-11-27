package defpackage;
public final class n2c implements Runnable {
    public final byte a;
    public final r47 b;
    public final long c;
    public final String d;

    public n2c(r47 r47Var, long j, String str, byte b) {
        this.a = b;
        this.b = r47Var;
        this.c = j;
        this.d = str;
    }

    @Override
    public final void run() {
        byte b = this.a;
        String str = this.d;
        long j = this.c;
        r47 r47Var = this.b;
        switch (b) {
            case 0:
                jn7 f = jn7.f(r47Var.K1);
                Long valueOf = Long.valueOf(j);
                Boolean bool = Boolean.TRUE;
                f.k(116, r47Var, valueOf, str, bool, bool);
                return;
            default:
                u2c.f(r47Var, j, str);
                return;
        }
    }
}
