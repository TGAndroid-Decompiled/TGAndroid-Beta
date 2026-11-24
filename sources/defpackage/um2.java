package defpackage;
public final class um2 implements vc7 {
    public final byte a;
    public final hd b;
    public final long c;
    public final boolean d;
    public final gk7 e;

    public um2(gk7 gk7Var, hd hdVar, long j, boolean z, byte b) {
        this.a = b;
        this.e = gk7Var;
        this.b = hdVar;
        this.c = j;
        this.d = z;
    }

    @Override
    public final void run(long j) {
        byte b = this.a;
        boolean z = this.d;
        long j2 = this.c;
        hd hdVar = this.b;
        gk7 gk7Var = this.e;
        switch (b) {
            case 0:
                xm2 xm2Var = (xm2) gk7Var;
                hdVar.dismiss();
                if (j != 0) {
                    xm2Var.b = -j;
                    xm2Var.c = xm2Var.getMessagesController().K0(Long.valueOf(j));
                    xm2Var.Z(j2, z);
                    return;
                }
                return;
            default:
                eo2 eo2Var = (eo2) gk7Var;
                hdVar.dismiss();
                if (j != 0) {
                    eo2Var.F0(na7.q1(eo2Var.a).K0(Long.valueOf(j)), j2, z);
                    return;
                }
                return;
        }
    }
}
