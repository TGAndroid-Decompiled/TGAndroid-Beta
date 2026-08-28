package l4;

import d5.f0;
import d5.y;
import h3.t0;
import j3.r0;
import m3.v;
import m3.w;
public final class c implements w {
    public final int f16647a;
    public final t0 f16648b;
    public final m3.j f16649c = new m3.j();
    public t0 d;
    public w f16650e;
    public long f16651f;

    public c(int i9, int i10, t0 t0Var) {
        this.f16647a = i10;
        this.f16648b = t0Var;
    }

    @Override
    public final void a(int i9, y yVar) {
        r0.a(this, yVar, i9);
    }

    @Override
    public final int b(com.google.android.exoplayer2.upstream.j jVar, int i9, boolean z10) {
        w wVar = this.f16650e;
        int i10 = f0.f4349a;
        return wVar.b(jVar, i9, z10);
    }

    @Override
    public final void c(t0 t0Var) {
        t0 t0Var2 = this.f16648b;
        if (t0Var2 != null) {
            t0Var = t0Var.c(t0Var2);
        }
        this.d = t0Var;
        w wVar = this.f16650e;
        int i9 = f0.f4349a;
        wVar.c(t0Var);
    }

    @Override
    public final void d(int i9, y yVar) {
        w wVar = this.f16650e;
        int i10 = f0.f4349a;
        wVar.a(i9, yVar);
    }

    @Override
    public final void e(long j10, int i9, int i10, int i11, v vVar) {
        long j11 = this.f16651f;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            this.f16650e = this.f16649c;
        }
        w wVar = this.f16650e;
        int i12 = f0.f4349a;
        wVar.e(j10, i9, i10, i11, vVar);
    }
}
