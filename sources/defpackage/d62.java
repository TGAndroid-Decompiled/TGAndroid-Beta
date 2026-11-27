package defpackage;
public final class d62 implements pcc {
    public final byte a;
    public final a72 b;
    public final int c;

    public d62(a72 a72Var, int i, byte b) {
        this.a = b;
        this.b = a72Var;
        this.c = i;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        int i = this.c;
        a72 a72Var = this.b;
        switch (b) {
            case 0:
                a72Var.g0(i, (zg8) obj);
                return;
            default:
                a72Var.g0(i, new eh8((String) obj));
                return;
        }
    }
}
