package defpackage;
public final class xdc implements Runnable {
    public final byte a;
    public final xab b;
    public final ia3 c;

    public xdc(xab xabVar, ia3 ia3Var, byte b) {
        this.a = b;
        this.b = xabVar;
        this.c = ia3Var;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                xab xabVar = this.b;
                ia3 ia3Var = this.c;
                String str = hac.a;
                xa3 xa3Var = ((c74) ((ydc) xabVar.c)).a.s;
                tk U = xa3Var.U();
                xa3Var.V(U, 1015, new ua3(U, ia3Var, (byte) 17));
                return;
            default:
                xab xabVar2 = this.b;
                ia3 ia3Var2 = this.c;
                synchronized (ia3Var2) {
                }
                String str2 = hac.a;
                h74 h74Var = ((c74) ((ydc) xabVar2.c)).a;
                xa3 xa3Var2 = h74Var.s;
                tk R = xa3Var2.R((rz6) xa3Var2.d.e);
                xa3Var2.V(R, 1020, new wm2(R, ia3Var2, (byte) 18));
                h74Var.S = null;
                return;
        }
    }
}
