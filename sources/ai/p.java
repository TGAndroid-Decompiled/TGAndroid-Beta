package ai;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.np;
import org.telegram.ui.Dictation.DictationAsr;
public final class p implements Runnable {
    public final int f1424a;
    public final t f1425b;

    public p(t tVar, int i7) {
        this.f1424a = i7;
        this.f1425b = tVar;
    }

    @Override
    public final void run() {
        int i7;
        CountDownLatch e10;
        switch (this.f1424a) {
            case 0:
                DictationAsr.D(this.f1425b);
                return;
            case 1:
                t tVar = this.f1425b;
                DictationAsr.r().mkdirs();
                if (j1.d() && (e10 = j1.e()) != null) {
                    try {
                        e10.await(20000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException unused) {
                    }
                }
                ArrayList a10 = j1.a();
                Future submit = DictationAsr.f42583f.submit(new aa.s(a10, 1));
                int u10 = DictationAsr.u(tVar.a(), j1.f(a10, tVar.f1540b), tVar);
                try {
                    i7 = ((Integer) submit.get()).intValue();
                } catch (Exception unused2) {
                    i7 = -1;
                }
                int[] iArr = {i7, u10};
                boolean z10 = true;
                boolean z11 = false;
                for (int i10 = 0; i10 < 2; i10++) {
                    int i11 = iArr[i10];
                    if (i11 < 0) {
                        z10 = false;
                    }
                    if (i11 > 0) {
                        z11 = true;
                    }
                }
                tVar.h = false;
                if (z10) {
                    np.e1().edit().putLong("tinyasr_checked_" + tVar.f1539a, System.currentTimeMillis()).apply();
                }
                if (DictationAsr.w(tVar) && (z11 || tVar.d == 0)) {
                    tVar.f1544g = true;
                    DictationAsr.d.execute(new p(tVar, 2));
                } else if (!DictationAsr.w(tVar)) {
                    org.telegram.messenger.g0.h3(new q(false, tVar));
                }
                DictationAsr.o();
                return;
            default:
                DictationAsr.D(this.f1425b);
                return;
        }
    }
}
