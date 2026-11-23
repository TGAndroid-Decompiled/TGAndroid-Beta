package l2;

import android.media.MediaFormat;
public final class b0 implements d3.v, j1 {
    public d3.v f19357a;
    public b0 f19358b;

    @Override
    public final void a(long j3, long j10, e2.u uVar, MediaFormat mediaFormat) {
        d3.v vVar = this.f19357a;
        if (vVar != null) {
            vVar.a(j3, j10, uVar, mediaFormat);
        }
    }

    public final void b() {
        b0 b0Var = this.f19358b;
        if (b0Var != null) {
            b0Var.b();
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
            this.f19358b = (b0) obj;
            return;
        }
        this.f19357a = (d3.v) obj;
    }

    public final void d() {
        b0 b0Var = this.f19358b;
        if (b0Var != null) {
            b0Var.d();
        }
    }
}
