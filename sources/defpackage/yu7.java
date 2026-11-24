package defpackage;
public final class yu7 implements Runnable {
    public final byte a;
    public final z8b b;

    public yu7(z8b z8bVar, byte b) {
        this.a = b;
        this.b = z8bVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        z8b z8bVar = this.b;
        switch (b) {
            case 0:
                nv7 nv7Var = z8bVar.e2;
                if (nv7Var != null) {
                    nv7Var.I0();
                    return;
                }
                return;
            default:
                z8bVar.u2.q1.setVisibility(8);
                return;
        }
    }
}
