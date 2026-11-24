package defpackage;
public final class q9a implements Runnable {
    public final byte a;
    public final taa b;

    public q9a(taa taaVar, byte b) {
        this.a = b;
        this.b = taaVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        taa taaVar = this.b;
        switch (b) {
            case 0:
                taaVar.v2 = true;
                no4 no4Var = taaVar.t2;
                no4Var.r.setText("");
                gl.E3(no4Var.r);
                return;
            default:
                am6 am6Var = new am6((byte) 21);
                if (taaVar.d) {
                    no4 no4Var2 = taaVar.t2;
                    if (no4Var2 != null) {
                        gl.t1(no4Var2.r);
                    }
                    gl.d3(am6Var, 300L);
                    return;
                }
                am6Var.run();
                return;
        }
    }
}
