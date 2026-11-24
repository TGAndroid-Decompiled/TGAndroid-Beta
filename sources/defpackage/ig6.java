package defpackage;
public final class ig6 implements Runnable {
    public final byte a;
    public final rg6 b;
    public final int c;

    public ig6(rg6 rg6Var, int i, byte b) {
        this.a = b;
        this.b = rg6Var;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        rg6 rg6Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new ig6(rg6Var, i, (byte) 1));
                return;
            case 1:
                rg6Var.z(i);
                return;
            default:
                rg6Var.f.f[i].D(1.0f);
                return;
        }
    }
}
