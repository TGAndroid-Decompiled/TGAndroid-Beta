package defpackage;
public final class hda implements Runnable {
    public final byte a;
    public final kea b;

    public hda(kea keaVar, byte b) {
        this.a = b;
        this.b = keaVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        kea keaVar = this.b;
        switch (b) {
            case 0:
                keaVar.v2 = true;
                rq4 rq4Var = keaVar.t2;
                rq4Var.r.setText("");
                hl.E3(rq4Var.r);
                return;
            default:
                pg6 pg6Var = new pg6((byte) 24);
                if (keaVar.d) {
                    rq4 rq4Var2 = keaVar.t2;
                    if (rq4Var2 != null) {
                        hl.t1(rq4Var2.r);
                    }
                    hl.d3(pg6Var, 300L);
                    return;
                }
                pg6Var.run();
                return;
        }
    }
}
