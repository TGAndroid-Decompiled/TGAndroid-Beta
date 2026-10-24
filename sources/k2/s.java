package k2;
public final class s implements Runnable {
    public final int f14833a;
    public final qf.b f14834b;
    public final i2.e f14835c;

    public s(qf.b bVar, i2.e eVar, int i10) {
        this.f14833a = i10;
        this.f14834b = bVar;
        this.f14835c = eVar;
    }

    @Override
    public final void run() {
        switch (this.f14833a) {
            case 0:
                qf.b bVar = this.f14834b;
                i2.e eVar = this.f14835c;
                synchronized (eVar) {
                }
                String str = e2.m0.f8259a;
                j2.e eVar2 = ((i2.b0) ((v) bVar.f44864c)).f12353a.f12442s;
                j2.a n10 = eVar2.n((u2.h0) eVar2.d.e);
                eVar2.q(n10, 1013, new j2.d(n10, eVar, 0));
                return;
            default:
                qf.b bVar2 = this.f14834b;
                i2.e eVar3 = this.f14835c;
                String str2 = e2.m0.f8259a;
                j2.e eVar4 = ((i2.b0) ((v) bVar2.f44864c)).f12353a.f12442s;
                j2.a p5 = eVar4.p();
                eVar4.q(p5, 1007, new ih.l(p5, eVar3, 25));
                return;
        }
    }
}
