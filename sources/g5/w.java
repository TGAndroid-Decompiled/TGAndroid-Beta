package g5;

import f5.d0;
import j3.h0;
import j3.k0;
import jh.d3;
import l4.c0;
public final class w implements Runnable {
    public final int f7098a;
    public final ze.b f7099b;
    public final m3.f f7100c;

    public w(ze.b bVar, m3.f fVar, int i10) {
        this.f7098a = i10;
        this.f7099b = bVar;
        this.f7100c = fVar;
    }

    @Override
    public final void run() {
        switch (this.f7098a) {
            case 0:
                ze.b bVar = this.f7099b;
                m3.f fVar = this.f7100c;
                synchronized (fVar) {
                }
                int i10 = d0.f6579a;
                k0 k0Var = ((h0) bVar.f50825b).f10477a;
                k3.f fVar2 = k0Var.f10594r;
                k3.a i11 = fVar2.i((c0) fVar2.d.f2121e);
                fVar2.l(i11, 1020, new eg.n(i11, fVar, 29));
                k0Var.P = null;
                return;
            default:
                ze.b bVar2 = this.f7099b;
                m3.f fVar3 = this.f7100c;
                int i12 = d0.f6579a;
                k3.f fVar4 = ((h0) bVar2.f50825b).f10477a.f10594r;
                k3.a k9 = fVar4.k();
                fVar4.l(k9, 1015, new d3(k9, fVar3, 16));
                return;
        }
    }
}
