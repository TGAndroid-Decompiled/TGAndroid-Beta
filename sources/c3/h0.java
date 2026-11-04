package c3;

import ei.y8;
import g2.n0;
public final class h0 implements Runnable {
    public final int f4042a;
    public final tf.b f4043b;
    public final k2.d f4044c;

    public h0(tf.b bVar, k2.d dVar, int i3) {
        this.f4042a = i3;
        this.f4043b = bVar;
        this.f4044c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f4042a) {
            case 0:
                tf.b bVar = this.f4043b;
                k2.d dVar = this.f4044c;
                String str = n0.f11873a;
                l2.f fVar = ((k2.c0) ((i0) bVar.f55095b)).f16459a.f16572s;
                l2.a U = fVar.U();
                fVar.V(U, 1015, new l2.c(U, dVar, 24));
                return;
            default:
                tf.b bVar2 = this.f4043b;
                k2.d dVar2 = this.f4044c;
                synchronized (dVar2) {
                }
                String str2 = n0.f11873a;
                k2.i0 i0Var = ((k2.c0) ((i0) bVar2.f55095b)).f16459a;
                l2.f fVar2 = i0Var.f16572s;
                l2.a S = fVar2.S((w2.g0) fVar2.d.f17692e);
                fVar2.V(S, 1020, new y8(S, dVar2, 26));
                i0Var.S = null;
                return;
        }
    }
}
