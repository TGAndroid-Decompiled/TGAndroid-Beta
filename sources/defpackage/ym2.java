package defpackage;
public final class ym2 implements Runnable {
    public final byte a;
    public final en2 b;
    public final long c;

    public ym2(en2 en2Var, long j, byte b) {
        this.a = b;
        this.b = en2Var;
        this.c = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        long j = this.c;
        en2 en2Var = this.b;
        switch (b) {
            case 0:
                en2Var.Z(j);
                return;
            default:
                en2Var.presentFragment(mu1.W9(j));
                return;
        }
    }
}
