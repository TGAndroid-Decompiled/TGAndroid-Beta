package defpackage;

import android.media.MediaFormat;
public final class o64 implements sec, lg8 {
    public sec a;
    public o64 b;

    public final void a() {
        o64 o64Var = this.b;
        if (o64Var != null) {
            o64Var.a();
        }
    }

    @Override
    public final void b(long j, long j2, ko4 ko4Var, MediaFormat mediaFormat) {
        sec secVar = this.a;
        if (secVar != null) {
            secVar.b(j, j2, ko4Var, mediaFormat);
        }
    }

    public final void c() {
        o64 o64Var = this.b;
        if (o64Var != null) {
            o64Var.c();
        }
    }

    @Override
    public final void d(int i, Object obj) {
        if (i != 7) {
            if (i != 8) {
                if (i != 10000 || obj == null) {
                    return;
                }
                grb.o();
                return;
            }
            this.b = (o64) obj;
            return;
        }
        this.a = (sec) obj;
    }
}
