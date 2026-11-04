package c3;

import g2.n0;
public final class g0 implements Runnable {
    public final int f4039a = 0;
    public final tf.b f4040b;
    public final long f4041c;
    public final int d;

    public g0(tf.b bVar, int i3, long j10) {
        this.f4040b = bVar;
        this.d = i3;
        this.f4041c = j10;
    }

    @Override
    public final void run() {
        int i3 = this.f4039a;
        int i10 = this.d;
        long j10 = this.f4041c;
        tf.b bVar = this.f4040b;
        switch (i3) {
            case 0:
                String str = n0.f11873a;
                l2.f fVar = ((k2.c0) ((i0) bVar.f55095b)).f16459a.f16572s;
                l2.a S = fVar.S((w2.g0) fVar.d.f17692e);
                fVar.V(S, 1018, new l2.c(S, i10, j10));
                return;
            default:
                String str2 = n0.f11873a;
                l2.f fVar2 = ((k2.c0) ((i0) bVar.f55095b)).f16459a.f16572s;
                l2.a S2 = fVar2.S((w2.g0) fVar2.d.f17692e);
                fVar2.V(S2, 1021, new l2.c(S2, j10, i10));
                return;
        }
    }

    public g0(tf.b bVar, long j10, int i3) {
        this.f4040b = bVar;
        this.f4041c = j10;
        this.d = i3;
    }
}
