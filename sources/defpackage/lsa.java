package defpackage;
public final class lsa implements Runnable {
    public final byte a;
    public final wua b;
    public final zu1 c;
    public final long d;

    public lsa(wua wuaVar, zu1 zu1Var, long j, byte b) {
        this.a = b;
        this.b = wuaVar;
        this.c = zu1Var;
        this.d = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        long j = this.d;
        zu1 zu1Var = this.c;
        wua wuaVar = this.b;
        switch (b) {
            case 0:
                v21 I = d31.b0(zu1Var).I(2131624029, ob6.M0(2131749843, null), hl.S2(ob6.a0(null, null, 2131749844, wuaVar.t1(), wf3.s(j))));
                I.u = true;
                I.j();
                return;
            default:
                v21 I2 = d31.b0(zu1Var).I(2131624029, ob6.M0(2131749843, null), hl.S2(ob6.a0(null, null, 2131749844, wuaVar.t1(), wf3.s(j))));
                I2.u = true;
                I2.j();
                return;
        }
    }
}
