package ai;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.np;
import org.telegram.ui.Dictation.DictationAsr;
public final class k implements Runnable {
    public final int f1310a;
    public final boolean f1311b;
    public final p f1312c;

    public k(boolean z10, p pVar, int i7) {
        this.f1310a = i7;
        this.f1311b = z10;
        this.f1312c = pVar;
    }

    @Override
    public final void run() {
        int i7;
        CountDownLatch e10;
        int i10 = 0;
        boolean z10 = true;
        switch (this.f1310a) {
            case 0:
                final boolean z11 = this.f1311b;
                p pVar = this.f1312c;
                DictationAsr.s().mkdirs();
                if (g1.d() && (e10 = g1.e()) != null) {
                    try {
                        e10.await(20000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException unused) {
                    }
                }
                final ArrayList a10 = g1.a();
                Future submit = DictationAsr.f43037f.submit(new Callable() {
                    @Override
                    public final Object call() {
                        ArrayList arrayList = a10;
                        boolean z12 = z11;
                        p[] pVarArr = DictationAsr.f43033a;
                        return Integer.valueOf(DictationAsr.v("silero_vad.onnx", g1.f(arrayList, "silero-vad"), null, z12));
                    }
                });
                int v = DictationAsr.v(pVar.b(), g1.f(a10, pVar.f1444c), pVar, z11);
                try {
                    i7 = ((Integer) submit.get()).intValue();
                } catch (Exception unused2) {
                    i7 = -1;
                }
                int[] iArr = {i7, v};
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
                pVar.f1449j = false;
                if (z13) {
                    np.g1().edit().putLong("tinyasr_checked_" + pVar.f1442a, System.currentTimeMillis()).apply();
                }
                if (DictationAsr.y(pVar) && (z12 || pVar.f1446f == 0)) {
                    pVar.f1448i = true;
                    DictationAsr.d.execute(new j(pVar, 1));
                } else if (!DictationAsr.y(pVar)) {
                    org.telegram.messenger.g0.g3(new k(false, pVar, 1));
                }
                DictationAsr.p();
                return;
            default:
                boolean z14 = this.f1311b;
                p pVar2 = this.f1312c;
                p[] pVarArr = DictationAsr.f43033a;
                if (pVar2.f1446f == 0) {
                    z10 = false;
                }
                if (z14 == z10) {
                    ArrayList arrayList = new ArrayList(pVar2.f1451l);
                    pVar2.f1451l.clear();
                    int size = arrayList.size();
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((q) obj).a(z14);
                    }
                    return;
                }
                return;
        }
    }
}
