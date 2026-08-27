package h3;

import android.media.MediaFormat;

public final class i0 implements e5.m, d2 {

    public e5.m f7919a;

    public i0 f7920b;

    @Override
    public final void a(long j10, long j11, t0 t0Var, MediaFormat mediaFormat) {
        e5.m mVar = this.f7919a;
        if (mVar != null) {
            mVar.a(j10, j11, t0Var, mediaFormat);
        }
    }

    public final void b() {
        i0 i0Var = this.f7920b;
        if (i0Var != null) {
            i0Var.b();
        }
    }

    public final void c() {
        i0 i0Var = this.f7920b;
        if (i0Var != null) {
            i0Var.c();
        }
    }

    @Override
    public final void handleMessage(int i10, Object obj) {
        if (i10 == 7) {
            this.f7919a = (e5.m) obj;
        } else if (i10 == 8) {
            this.f7920b = (i0) obj;
        } else if (i10 == 10000 && obj != null) {
            throw new ClassCastException();
        }
    }
}
