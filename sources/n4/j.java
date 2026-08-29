package n4;

import com.google.android.exoplayer2.upstream.q;
import com.google.android.exoplayer2.upstream.x0;
import h7.m5;
import j3.t0;
public final class j extends e {
    public final d f17149s;
    public g9.l v;
    public long f17150w;
    public volatile boolean f17151x;

    public j(com.google.android.exoplayer2.upstream.m mVar, q qVar, t0 t0Var, int i10, Object obj, d dVar) {
        super(mVar, qVar, 2, t0Var, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f17149s = dVar;
    }

    @Override
    public final void a() {
        boolean z10;
        if (this.f17150w == 0) {
            this.f17149s.a(this.v, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            q a2 = this.f17128b.a(this.f17150w);
            x0 x0Var = this.f17133r;
            o3.h hVar = new o3.h(x0Var, a2.f3602e, x0Var.open(a2));
            while (!this.f17151x) {
                int d = this.f17149s.f17120a.d(hVar, d.f17119s);
                boolean z11 = false;
                if (d != 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                f5.a.i(z10);
                if (d == 0) {
                    z11 = true;
                    continue;
                }
                if (!z11) {
                    break;
                }
            }
            this.f17150w = hVar.d - this.f17128b.f3602e;
        } finally {
            m5.a(this.f17133r);
        }
    }

    @Override
    public final void q() {
        this.f17151x = true;
    }
}
