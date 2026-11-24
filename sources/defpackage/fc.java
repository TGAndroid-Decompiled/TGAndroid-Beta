package defpackage;
public final class fc implements Runnable {
    public final byte a;
    public final jc b;

    public fc(jc jcVar, byte b) {
        this.a = b;
        this.b = jcVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        jc jcVar = this.b;
        switch (b) {
            case 0:
                jcVar.Z0();
                return;
            default:
                su3 su3Var = jcVar.g2;
                su3Var.d.requestFocus();
                gm.E3(su3Var.d);
                return;
        }
    }
}
