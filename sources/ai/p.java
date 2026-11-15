package ai;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.np;
import org.telegram.ui.Dictation.DictationAsr;
public final class p implements Runnable {
    public final int f1427a;
    public final s f1428b;

    public p(s sVar, int i7) {
        this.f1427a = i7;
        this.f1428b = sVar;
    }

    @Override
    public final void run() {
        int i7;
        CountDownLatch e10;
        switch (this.f1427a) {
            case 0:
                DictationAsr.D(this.f1428b);
                return;
            case 1:
                s sVar = this.f1428b;
                DictationAsr.r().mkdirs();
                if (i1.d() && (e10 = i1.e()) != null) {
                    try {
                        e10.await(20000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException unused) {
                    }
                }
                ArrayList a10 = i1.a();
                Future submit = DictationAsr.f42583f.submit(new aa.s(a10, 1));
                int u10 = DictationAsr.u(sVar.a(), i1.f(a10, sVar.f1531b), sVar);
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
                sVar.h = false;
                if (z10) {
                    np.e1().edit().putLong("tinyasr_checked_" + sVar.f1530a, System.currentTimeMillis()).apply();
                }
                if (DictationAsr.w(sVar) && (z11 || sVar.d == 0)) {
                    sVar.f1535g = true;
                    DictationAsr.d.execute(new p(sVar, 2));
                } else if (!DictationAsr.w(sVar)) {
                    org.telegram.messenger.g0.h3(new q(false, sVar));
                }
                DictationAsr.o();
                return;
            default:
                DictationAsr.D(this.f1428b);
                return;
        }
    }
}
