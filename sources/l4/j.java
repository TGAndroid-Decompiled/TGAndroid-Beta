package l4;

import com.google.android.exoplayer2.upstream.q;
import com.google.android.exoplayer2.upstream.x0;
import f7.f5;
import h3.t0;
public final class j extends e {
    public final d f16682s;
    public g5.b v;
    public long f16683w;
    public volatile boolean f16684x;

    public j(com.google.android.exoplayer2.upstream.m mVar, q qVar, t0 t0Var, int i9, Object obj, d dVar) {
        super(mVar, qVar, 2, t0Var, i9, obj, -9223372036854775807L, -9223372036854775807L);
        this.f16682s = dVar;
    }

    @Override
    public final void K() {
        this.f16684x = true;
    }

    @Override
    public final void a() {
        boolean z10;
        if (this.f16683w == 0) {
            this.f16682s.a(this.v, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            q a2 = this.f16661b.a(this.f16683w);
            x0 x0Var = this.f16666r;
            m3.h hVar = new m3.h(x0Var, a2.f2588e, x0Var.open(a2));
            while (!this.f16684x) {
                int b10 = this.f16682s.f16653a.b(hVar, d.f16652s);
                boolean z11 = false;
                if (b10 != 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                d5.a.i(z10);
                if (b10 == 0) {
                    z11 = true;
                    continue;
                }
                if (!z11) {
                    break;
                }
            }
            this.f16683w = hVar.d - this.f16661b.f2588e;
        } finally {
            f5.a(this.f16666r);
        }
    }
}
