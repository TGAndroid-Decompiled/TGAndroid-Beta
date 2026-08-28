package l4;

import com.google.android.exoplayer2.upstream.q;
import com.google.android.exoplayer2.upstream.x0;
import f7.f5;
import h3.t0;
import j4.a1;
import m3.w;
public final class m extends a {
    public final int A;
    public final t0 B;
    public long C;
    public boolean D;

    public m(com.google.android.exoplayer2.upstream.m mVar, q qVar, t0 t0Var, int i9, Object obj, long j10, long j11, long j12, int i10, t0 t0Var2) {
        super(mVar, qVar, t0Var, i9, obj, j10, j11, -9223372036854775807L, -9223372036854775807L, j12);
        this.A = i10;
        this.B = t0Var2;
    }

    @Override
    public final void a() {
        a1[] a1VarArr;
        x0 x0Var = this.f16666r;
        g5.b bVar = this.f16642x;
        d5.a.j(bVar);
        for (a1 a1Var : (a1[]) bVar.f7112c) {
            if (a1Var.F != 0) {
                a1Var.F = 0L;
                a1Var.f13425z = true;
            }
        }
        w u10 = bVar.u(this.A);
        u10.c(this.B);
        try {
            long open = x0Var.open(this.f16661b.a(this.C));
            if (open != -1) {
                open += this.C;
            }
            m3.h hVar = new m3.h(this.f16666r, this.C, open);
            for (int i9 = 0; i9 != -1; i9 = u10.b(hVar, Integer.MAX_VALUE, true)) {
                this.C += i9;
            }
            u10.e(this.h, 1, (int) this.C, 0, null);
            f5.a(x0Var);
            this.D = true;
        } catch (Throwable th) {
            f5.a(x0Var);
            throw th;
        }
    }

    @Override
    public final boolean c() {
        return this.D;
    }

    @Override
    public final void K() {
    }
}
