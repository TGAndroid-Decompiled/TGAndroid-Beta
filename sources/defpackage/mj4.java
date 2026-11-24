package defpackage;
public final class mj4 implements Runnable {
    public final byte a;
    public final sj4 b;

    public mj4(sj4 sj4Var, byte b) {
        this.a = b;
        this.b = sj4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        sj4 sj4Var = this.b;
        switch (b) {
            case 0:
                sj4Var.q();
                if (sj4Var.b.j()) {
                    gl.d3(this, 500L);
                    return;
                }
                return;
            default:
                if (sj4Var.b.b0()) {
                    gl.d3(this, 1500L);
                    return;
                }
                sj4Var.u = false;
                sj4Var.o(false);
                sj4Var.w = false;
                return;
        }
    }
}
