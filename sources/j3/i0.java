package j3;

import android.media.MediaFormat;
public final class i0 implements g5.n, d2 {
    public g5.n f10526a;
    public i0 f10527b;

    @Override
    public final void a(long j10, long j11, t0 t0Var, MediaFormat mediaFormat) {
        g5.n nVar = this.f10526a;
        if (nVar != null) {
            nVar.a(j10, j11, t0Var, mediaFormat);
        }
    }

    public final void b() {
        i0 i0Var = this.f10527b;
        if (i0Var != null) {
            i0Var.b();
        }
    }

    public final void c() {
        i0 i0Var = this.f10527b;
        if (i0Var != null) {
            i0Var.c();
        }
    }

    @Override
    public final void handleMessage(int i10, Object obj) {
        if (i10 != 7) {
            if (i10 != 8) {
                if (i10 != 10000 || obj == null) {
                    return;
                }
                throw new ClassCastException();
            }
            this.f10527b = (i0) obj;
            return;
        }
        this.f10526a = (g5.n) obj;
    }
}
