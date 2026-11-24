package defpackage;
public final class go2 implements xe7 {
    public final byte a;
    public final he b;
    public final long c;
    public final boolean d;
    public final jm7 e;

    public go2(jm7 jm7Var, he heVar, long j, boolean z, byte b) {
        this.a = b;
        this.e = jm7Var;
        this.b = heVar;
        this.c = j;
        this.d = z;
    }

    @Override
    public final void run(long j) {
        byte b = this.a;
        boolean z = this.d;
        long j2 = this.c;
        he heVar = this.b;
        jm7 jm7Var = this.e;
        switch (b) {
            case 0:
                io2 io2Var = (io2) jm7Var;
                heVar.dismiss();
                if (j != 0) {
                    io2Var.b = -j;
                    io2Var.c = io2Var.getMessagesController().L0(Long.valueOf(j));
                    io2Var.a0(j2, z);
                    return;
                }
                return;
            default:
                pp2 pp2Var = (pp2) jm7Var;
                heVar.dismiss();
                if (j != 0) {
                    pp2Var.F0(oc7.r1(pp2Var.a).L0(Long.valueOf(j)), j2, z);
                    return;
                }
                return;
        }
    }
}
