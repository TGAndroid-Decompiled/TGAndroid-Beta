package l4;

import d5.g0;
import d5.z;
import h3.t0;
import m3.v;
import m3.w;

public final class c implements w {

    public final int f15404a;

    public final t0 f15405b;

    public final m3.j f15406c = new m3.j();
    public t0 d;

    public w f15407e;

    public long f15408f;

    public c(int i10, int i11, t0 t0Var) {
        this.f15404a = i11;
        this.f15405b = t0Var;
    }

    @Override
    public final void a(int i10, z zVar) {
        i0.a.a(this, zVar, i10);
    }

    @Override
    public final int b(com.google.android.exoplayer2.upstream.j jVar, int i10, boolean z10) {
        w wVar = this.f15407e;
        int i11 = g0.f4795a;
        return wVar.b(jVar, i10, z10);
    }

    @Override
    public final void c(t0 t0Var) {
        t0 t0Var2 = this.f15405b;
        if (t0Var2 != null) {
            t0Var = t0Var.c(t0Var2);
        }
        this.d = t0Var;
        w wVar = this.f15407e;
        int i10 = g0.f4795a;
        wVar.c(t0Var);
    }

    @Override
    public final void d(int i10, z zVar) {
        w wVar = this.f15407e;
        int i11 = g0.f4795a;
        wVar.a(i10, zVar);
    }

    @Override
    public final void e(long j10, int i10, int i11, int i12, v vVar) {
        long j11 = this.f15408f;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            this.f15407e = this.f15406c;
        }
        w wVar = this.f15407e;
        int i13 = g0.f4795a;
        wVar.e(j10, i10, i11, i12, vVar);
    }
}
