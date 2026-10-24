package k2;
public final class t implements Runnable {
    public final int f14839a;
    public final int f14840b;
    public final long f14841c;
    public final long d;
    public final Object e;

    public t(Object obj, int i10, long j10, long j11, int i11) {
        this.f14839a = i11;
        this.e = obj;
        this.f14840b = i10;
        this.f14841c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        u2.h0 h0Var;
        int i10 = this.f14839a;
        Object obj = this.e;
        switch (i10) {
            case 0:
                String str = e2.m0.f8259a;
                j2.e eVar = ((i2.b0) ((v) ((qf.b) obj).f44864c)).f12353a.f12442s;
                j2.a p5 = eVar.p();
                eVar.q(p5, 1011, new j2.d(p5, this.f14840b, this.f14841c, this.d));
                return;
            default:
                j2.e eVar2 = ((y2.b) obj).f50341b;
                com.google.firebase.messaging.l lVar = eVar2.d;
                if (((e9.n0) lVar.f7658b).isEmpty()) {
                    h0Var = null;
                } else {
                    h0Var = (u2.h0) e9.s.m((e9.n0) lVar.f7658b);
                }
                j2.a n10 = eVar2.n(h0Var);
                eVar2.q(n10, 1006, new j2.c(n10, this.f14840b, this.f14841c, this.d));
                return;
        }
    }
}
