package k2;
public final class s implements Runnable {
    public final int f10759a;
    public final int f10760b;
    public final long f10761c;
    public final long d;
    public final Object e;

    public s(Object obj, int i10, long j10, long j11, int i11) {
        this.f10759a = i11;
        this.e = obj;
        this.f10760b = i10;
        this.f10761c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        u2.g0 g0Var;
        int i10 = this.f10759a;
        Object obj = this.e;
        switch (i10) {
            case 0:
                String str = e2.l0.f6165a;
                j2.g gVar = ((i2.c0) ((w) ((hf.b) obj).f7659c)).f7822a.f7928s;
                j2.a U = gVar.U();
                gVar.V(U, 1011, new j2.e(U, this.f10760b, this.f10761c, this.d));
                return;
            default:
                j2.g gVar2 = ((y2.b) obj).f54152b;
                j2.f fVar = gVar2.d;
                if (((e9.n0) fVar.f9349b).isEmpty()) {
                    g0Var = null;
                } else {
                    g0Var = (u2.g0) e9.s.m((e9.n0) fVar.f9349b);
                }
                j2.a S = gVar2.S(g0Var);
                gVar2.V(S, 1006, new j2.d(S, this.f10760b, this.f10761c, this.d));
                return;
        }
    }
}
