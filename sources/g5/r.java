package g5;

import android.os.SystemClock;
public final class r {
    public final s f6901a;

    public final void a(int i10) {
        int i11;
        s sVar = this.f6901a;
        synchronized (sVar) {
            synchronized (sVar) {
                int i12 = sVar.f6920i;
                if (i12 != 0 && !sVar.f6917e) {
                    return;
                }
                if (i12 == i10) {
                    return;
                }
                sVar.f6920i = i10;
                if (i10 != 1 && i10 != 0 && i10 != 8) {
                    sVar.f6923l = sVar.a(i10);
                    sVar.d.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (sVar.f6918f > 0) {
                        i11 = (int) (elapsedRealtime - sVar.f6919g);
                    } else {
                        i11 = 0;
                    }
                    sVar.c(i11, sVar.h, sVar.f6923l);
                    sVar.f6919g = elapsedRealtime;
                    sVar.h = 0L;
                    sVar.f6922k = 0L;
                    sVar.f6921j = 0L;
                    t0 t0Var = sVar.f6916c;
                    t0Var.f6938b.clear();
                    t0Var.d = -1;
                    t0Var.f6940e = 0;
                    t0Var.f6941f = 0;
                }
            }
        }
    }
}
