package l4;

import com.google.android.exoplayer2.upstream.q;
import com.google.android.exoplayer2.upstream.x0;
import f7.f5;
import h3.t0;
import j4.a1;
public final class i extends a {
    public final int A;
    public final long B;
    public final d C;
    public long D;
    public volatile boolean E;
    public boolean F;

    public i(com.google.android.exoplayer2.upstream.m mVar, q qVar, t0 t0Var, int i9, Object obj, long j10, long j11, long j12, long j13, long j14, int i10, long j15, d dVar) {
        super(mVar, qVar, t0Var, i9, obj, j10, j11, j12, j13, j14);
        this.A = i10;
        this.B = j15;
        this.C = dVar;
    }

    @Override
    public final void K() {
        this.E = true;
    }

    @Override
    public final void a() {
        boolean z10;
        boolean z11;
        a1[] a1VarArr;
        long j10;
        if (this.D == 0) {
            g5.b bVar = this.f16642x;
            d5.a.j(bVar);
            long j11 = this.B;
            for (a1 a1Var : (a1[]) bVar.f7112c) {
                if (a1Var.F != j11) {
                    a1Var.F = j11;
                    a1Var.f13425z = true;
                }
            }
            d dVar = this.C;
            long j12 = this.v;
            long j13 = -9223372036854775807L;
            if (j12 == -9223372036854775807L) {
                j10 = -9223372036854775807L;
            } else {
                j10 = j12 - this.B;
            }
            long j14 = this.f16641w;
            if (j14 != -9223372036854775807L) {
                j13 = j14 - this.B;
            }
            dVar.a(bVar, j10, j13);
        }
        try {
            q a2 = this.f16661b.a(this.D);
            x0 x0Var = this.f16666r;
            m3.h hVar = new m3.h(x0Var, a2.f2588e, x0Var.open(a2));
            while (!this.E) {
                int b10 = this.C.f16653a.b(hVar, d.f16652s);
                if (b10 != 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                d5.a.i(z10);
                if (b10 == 0) {
                    z11 = true;
                    continue;
                } else {
                    z11 = false;
                    continue;
                }
                if (!z11) {
                    break;
                }
            }
            this.D = hVar.d - this.f16661b.f2588e;
            f5.a(this.f16666r);
            this.F = !this.E;
        } catch (Throwable th) {
            f5.a(this.f16666r);
            throw th;
        }
    }

    @Override
    public final long b() {
        return this.f16685s + this.A;
    }

    @Override
    public final boolean c() {
        return this.F;
    }
}
