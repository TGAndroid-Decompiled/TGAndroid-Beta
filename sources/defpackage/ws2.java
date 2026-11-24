package defpackage;
public final class ws2 implements Runnable {
    public final byte a;
    public final it2 b;

    public ws2(it2 it2Var, byte b) {
        this.a = b;
        this.b = it2Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        it2 it2Var = this.b;
        switch (b) {
            case 0:
                it2Var.d0();
                return;
            case 1:
                if (it2Var.K) {
                    it2Var.d.d.requestFocus();
                    gl.F3(it2Var.d.d);
                    return;
                }
                return;
            default:
                it2Var.presentFragment(mu1.U9(it2Var.I), true);
                return;
        }
    }
}
