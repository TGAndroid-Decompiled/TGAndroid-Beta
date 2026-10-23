package i2;

import android.media.MediaFormat;
public final class c0 implements a3.y, k1 {
    public a3.y f12358a;
    public c0 f12359b;

    public final void a() {
        c0 c0Var = this.f12359b;
        if (c0Var != null) {
            c0Var.a();
        }
    }

    public final void b() {
        c0 c0Var = this.f12359b;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override
    public final void c(long j10, long j11, b2.w wVar, MediaFormat mediaFormat) {
        a3.y yVar = this.f12358a;
        if (yVar != null) {
            yVar.c(j10, j11, wVar, mediaFormat);
        }
    }

    @Override
    public final void d(int i10, Object obj) {
        if (i10 != 7) {
            if (i10 != 8) {
                if (i10 != 10000 || obj == null) {
                    return;
                }
                throw new ClassCastException();
            }
            this.f12359b = (c0) obj;
            return;
        }
        this.f12358a = (a3.y) obj;
    }
}
