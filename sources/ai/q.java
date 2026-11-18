package ai;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.mp;
import org.telegram.ui.Dictation.DictationAsr;
public final class q implements Runnable {
    public final int f1425a;
    public final boolean f1426b;
    public final t f1427c;

    public q(boolean z10, t tVar, int i7) {
        this.f1425a = i7;
        this.f1426b = z10;
        this.f1427c = tVar;
    }

    @Override
    public final void run() {
        int i7;
        CountDownLatch e10;
        int i10 = 0;
        boolean z10 = true;
        switch (this.f1425a) {
            case 0:
                final boolean z11 = this.f1426b;
                t tVar = this.f1427c;
                DictationAsr.q().mkdirs();
                if (j1.d() && (e10 = j1.e()) != null) {
                    try {
                        e10.await(20000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException unused) {
                    }
                }
                final ArrayList a10 = j1.a();
                Future submit = DictationAsr.f43027f.submit(new Callable() {
                    @Override
                    public final Object call() {
                        ArrayList arrayList = a10;
                        boolean z12 = z11;
                        t[] tVarArr = DictationAsr.f43023a;
                        return Integer.valueOf(DictationAsr.t("silero_vad.onnx", j1.f(arrayList, "silero-vad"), null, z12));
                    }
                });
                int t6 = DictationAsr.t(tVar.a(), j1.f(a10, tVar.f1531b), tVar, z11);
                try {
                    i7 = ((Integer) submit.get()).intValue();
                } catch (Exception unused2) {
                    i7 = -1;
                }
                int[] iArr = {i7, t6};
                boolean z12 = false;
                boolean z13 = true;
                for (int i11 = 0; i11 < 2; i11++) {
                    int i12 = iArr[i11];
                    if (i12 < 0) {
                        z13 = false;
                    }
                    if (i12 > 0) {
                        z12 = true;
                    }
                }
                tVar.h = false;
                if (z13) {
                    mp.g1().edit().putLong("tinyasr_checked_" + tVar.f1530a, System.currentTimeMillis()).apply();
                }
                if (DictationAsr.w(tVar) && (z12 || tVar.d == 0)) {
                    tVar.f1535g = true;
                    DictationAsr.d.execute(new p(tVar, 1));
                } else if (!DictationAsr.w(tVar)) {
                    org.telegram.messenger.g0.g3(new q(false, tVar, 1));
                }
                DictationAsr.n();
                return;
            default:
                boolean z14 = this.f1426b;
                t tVar2 = this.f1427c;
                t[] tVarArr = DictationAsr.f43023a;
                if (tVar2.d == 0) {
                    z10 = false;
                }
                if (z14 == z10) {
                    ArrayList arrayList = new ArrayList(tVar2.f1537j);
                    tVar2.f1537j.clear();
                    int size = arrayList.size();
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((u) obj).a(z14);
                    }
                    return;
                }
                return;
        }
    }
}
