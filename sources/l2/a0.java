package l2;

import android.media.MediaFormat;
public final class a0 implements d3.v, i1 {
    public d3.v f19249a;
    public a0 f19250b;

    @Override
    public final void a(long j3, long j10, e2.u uVar, MediaFormat mediaFormat) {
        d3.v vVar = this.f19249a;
        if (vVar != null) {
            vVar.a(j3, j10, uVar, mediaFormat);
        }
    }

    public final void b() {
        a0 a0Var = this.f19250b;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    @Override
    public final void c(int i7, Object obj) {
        if (i7 != 7) {
            if (i7 != 8) {
                if (i7 != 10000 || obj == null) {
                    return;
                }
                throw new ClassCastException();
            }
            this.f19250b = (a0) obj;
            return;
        }
        this.f19249a = (d3.v) obj;
    }

    public final void d() {
        a0 a0Var = this.f19250b;
        if (a0Var != null) {
            a0Var.d();
        }
    }
}
