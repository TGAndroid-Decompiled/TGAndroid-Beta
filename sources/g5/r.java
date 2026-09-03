package g5;

import android.os.SystemClock;
public final class r {
    public final s f6414a;

    public final void a(int i10) {
        int i11;
        s sVar = this.f6414a;
        synchronized (sVar) {
            synchronized (sVar) {
                int i12 = sVar.f6431i;
                if (i12 != 0 && !sVar.e) {
                    return;
                }
                if (i12 == i10) {
                    return;
                }
                sVar.f6431i = i10;
                if (i10 != 1 && i10 != 0 && i10 != 8) {
                    sVar.f6434l = sVar.a(i10);
                    sVar.d.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (sVar.f6429f > 0) {
                        i11 = (int) (elapsedRealtime - sVar.f6430g);
                    } else {
                        i11 = 0;
                    }
                    sVar.c(i11, sVar.h, sVar.f6434l);
                    sVar.f6430g = elapsedRealtime;
                    sVar.h = 0L;
                    sVar.f6433k = 0L;
                    sVar.f6432j = 0L;
                    t0 t0Var = sVar.f6428c;
                    t0Var.f6448b.clear();
                    t0Var.d = -1;
                    t0Var.e = 0;
                    t0Var.f6450f = 0;
                }
            }
        }
    }
}
