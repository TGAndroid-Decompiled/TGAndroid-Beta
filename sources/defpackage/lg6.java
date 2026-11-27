package defpackage;
public final class lg6 implements Runnable {
    public final byte a;
    public final tg6 b;
    public final int c;

    public lg6(tg6 tg6Var, int i, byte b) {
        this.a = b;
        this.b = tg6Var;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        tg6 tg6Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new lg6(tg6Var, i, (byte) 1));
                return;
            case 1:
                tg6Var.z(i);
                return;
            default:
                tg6Var.f.f[i].D(1.0f);
                return;
        }
    }
}
