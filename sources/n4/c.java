package n4;

import f5.d0;
import j3.t0;
import j7.l1;
import o3.v;
import o3.w;
public final class c implements w {
    public final int f17114a;
    public final t0 f17115b;
    public final o3.j f17116c = new o3.j();
    public t0 d;
    public w f17117e;
    public long f17118f;

    public c(int i10, int i11, t0 t0Var) {
        this.f17114a = i11;
        this.f17115b = t0Var;
    }

    @Override
    public final int a(com.google.android.exoplayer2.upstream.j jVar, int i10, boolean z10) {
        w wVar = this.f17117e;
        int i11 = d0.f6579a;
        return wVar.a(jVar, i10, z10);
    }

    @Override
    public final void b(t0 t0Var) {
        t0 t0Var2 = this.f17115b;
        if (t0Var2 != null) {
            t0Var = t0Var.c(t0Var2);
        }
        this.d = t0Var;
        w wVar = this.f17117e;
        int i10 = d0.f6579a;
        wVar.b(t0Var);
    }

    @Override
    public final void c(long j10, int i10, int i11, int i12, v vVar) {
        long j11 = this.f17118f;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            this.f17117e = this.f17116c;
        }
        w wVar = this.f17117e;
        int i13 = d0.f6579a;
        wVar.c(j10, i10, i11, i12, vVar);
    }

    @Override
    public final void d(int i10, f5.w wVar) {
        w wVar2 = this.f17117e;
        int i11 = d0.f6579a;
        wVar2.e(i10, wVar);
    }

    @Override
    public final void e(int i10, f5.w wVar) {
        l1.a(this, wVar, i10);
    }
}
