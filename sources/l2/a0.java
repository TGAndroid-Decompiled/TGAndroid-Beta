package l2;

import android.media.MediaFormat;
public final class a0 implements d3.v, i1 {
    public d3.v f18882a;
    public a0 f18883b;

    @Override
    public final void a(long j3, long j10, e2.u uVar, MediaFormat mediaFormat) {
        d3.v vVar = this.f18882a;
        if (vVar != null) {
            vVar.a(j3, j10, uVar, mediaFormat);
        }
    }

    public final void b() {
        a0 a0Var = this.f18883b;
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
            this.f18883b = (a0) obj;
            return;
        }
        this.f18882a = (d3.v) obj;
    }

    public final void d() {
        a0 a0Var = this.f18883b;
        if (a0Var != null) {
            a0Var.d();
        }
    }
}
