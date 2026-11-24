package defpackage;

import android.media.MediaFormat;
public final class u54 implements sac, xc8 {
    public sac a;
    public u54 b;

    public final void a() {
        u54 u54Var = this.b;
        if (u54Var != null) {
            u54Var.a();
        }
    }

    public final void b() {
        u54 u54Var = this.b;
        if (u54Var != null) {
            u54Var.b();
        }
    }

    @Override
    public final void c(long j, long j2, fm4 fm4Var, MediaFormat mediaFormat) {
        sac sacVar = this.a;
        if (sacVar != null) {
            sacVar.c(j, j2, fm4Var, mediaFormat);
        }
    }

    @Override
    public final void d(int i, Object obj) {
        if (i != 7) {
            if (i != 8) {
                if (i != 10000 || obj == null) {
                    return;
                }
                fyb.g();
                return;
            }
            this.b = (u54) obj;
            return;
        }
        this.a = (sac) obj;
    }
}
