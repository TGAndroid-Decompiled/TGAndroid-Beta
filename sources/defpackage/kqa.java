package defpackage;
public final class kqa implements Runnable {
    public final byte a;
    public final wsa b;
    public final yv1 c;
    public final long d;

    public kqa(wsa wsaVar, yv1 yv1Var, long j, byte b) {
        this.a = b;
        this.b = wsaVar;
        this.c = yv1Var;
        this.d = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        long j = this.d;
        yv1 yv1Var = this.c;
        wsa wsaVar = this.b;
        switch (b) {
            case 0:
                u31 I = c41.b0(yv1Var).I(2131624029, jb6.M0(2131749830, null), gm.S2(jb6.a0(null, null, 2131749831, wsaVar.s1(), pg3.s(j))));
                I.u = true;
                I.j();
                return;
            default:
                u31 I2 = c41.b0(yv1Var).I(2131624029, jb6.M0(2131749830, null), gm.S2(jb6.a0(null, null, 2131749831, wsaVar.s1(), pg3.s(j))));
                I2.u = true;
                I2.j();
                return;
        }
    }
}
