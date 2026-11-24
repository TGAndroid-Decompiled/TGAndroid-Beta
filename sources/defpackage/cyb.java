package defpackage;
public final class cyb implements Runnable {
    public final byte a;
    public final oyb b;

    public cyb(oyb oybVar, byte b) {
        this.a = b;
        this.b = oybVar;
    }

    @Override
    public final void run() {
        u46 u46Var;
        byte b = this.a;
        oyb oybVar = this.b;
        switch (b) {
            case 0:
                oybVar.P = null;
                oybVar.j();
                return;
            default:
                long j = oybVar.b;
                if (!oybVar.d && oybVar.y > 0.0f && (u46Var = (u46) oybVar.r.getLayoutManager()) != null && u46Var.M0() >= oybVar.s.c.size() - 3) {
                    if (oybVar.i()) {
                        oybVar.j();
                        return;
                    }
                    qwb qwbVar = oc7.r1(oybVar.a).g4;
                    long j2 = -j;
                    if (!qwbVar.e(j2)) {
                        qwbVar.o(j2);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
