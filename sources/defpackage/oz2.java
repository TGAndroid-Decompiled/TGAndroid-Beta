package defpackage;
public final class oz2 implements Runnable {
    public final byte a;
    public final zd1 b;
    public final ex8 c;

    public oz2(zd1 zd1Var, ex8 ex8Var, byte b) {
        this.a = b;
        this.b = zd1Var;
        this.c = ex8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ex8 ex8Var = this.c;
        zd1 zd1Var = this.b;
        switch (b) {
            case 0:
                zd1Var.a(ex8Var);
                return;
            default:
                zd1Var.a(ex8Var);
                return;
        }
    }
}
