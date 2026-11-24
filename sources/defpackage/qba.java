package defpackage;
public final class qba implements Runnable {
    public final byte a;
    public final tca b;

    public qba(tca tcaVar, byte b) {
        this.a = b;
        this.b = tcaVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        tca tcaVar = this.b;
        switch (b) {
            case 0:
                tcaVar.v2 = true;
                oq4 oq4Var = tcaVar.t2;
                oq4Var.r.setText("");
                gm.E3(oq4Var.r);
                return;
            default:
                bo6 bo6Var = new bo6((byte) 21);
                if (tcaVar.d) {
                    oq4 oq4Var2 = tcaVar.t2;
                    if (oq4Var2 != null) {
                        gm.t1(oq4Var2.r);
                    }
                    gm.d3(bo6Var, 300L);
                    return;
                }
                bo6Var.run();
                return;
        }
    }
}
