package defpackage;
public final class zvb implements Runnable {
    public final byte a;
    public final lwb b;

    public zvb(lwb lwbVar, byte b) {
        this.a = b;
        this.b = lwbVar;
    }

    @Override
    public final void run() {
        t26 t26Var;
        byte b = this.a;
        lwb lwbVar = this.b;
        switch (b) {
            case 0:
                lwbVar.P = null;
                lwbVar.j();
                return;
            default:
                long j = lwbVar.b;
                if (!lwbVar.d && lwbVar.y > 0.0f && (t26Var = (t26) lwbVar.r.getLayoutManager()) != null && t26Var.M0() >= lwbVar.s.c.size() - 3) {
                    if (lwbVar.i()) {
                        lwbVar.j();
                        return;
                    }
                    pub pubVar = na7.q1(lwbVar.a).g4;
                    long j2 = -j;
                    if (!pubVar.e(j2)) {
                        pubVar.o(j2);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
