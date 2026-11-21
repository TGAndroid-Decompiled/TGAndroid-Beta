package ai;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.mp;
import org.telegram.ui.Dictation.DictationAsr;
public final class p implements Runnable {
    public final int f1374a;
    public final boolean f1375b;
    public final t f1376c;

    public p(boolean z10, t tVar, int i7) {
        this.f1374a = i7;
        this.f1375b = z10;
        this.f1376c = tVar;
    }

    @Override
    public final void run() {
        int i7;
        CountDownLatch e10;
        int i10 = 0;
        boolean z10 = true;
        switch (this.f1374a) {
            case 0:
                final boolean z11 = this.f1375b;
                t tVar = this.f1376c;
                DictationAsr.s().mkdirs();
                if (l1.d() && (e10 = l1.e()) != null) {
                    try {
                        e10.await(20000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException unused) {
                    }
                }
                final ArrayList a10 = l1.a();
                Future submit = DictationAsr.f43068f.submit(new Callable() {
                    @Override
                    public final Object call() {
                        ArrayList arrayList = a10;
                        boolean z12 = z11;
                        t[] tVarArr = DictationAsr.f43064a;
                        return Integer.valueOf(DictationAsr.v("silero_vad.onnx", l1.f(arrayList, "silero-vad"), null, z12));
                    }
                });
                int v = DictationAsr.v(tVar.b(), l1.f(a10, tVar.f1510c), tVar, z11);
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
                tVar.f1515j = false;
                if (z13) {
                    mp.g1().edit().putLong("tinyasr_checked_" + tVar.f1508a, System.currentTimeMillis()).apply();
                }
                if (DictationAsr.y(tVar) && (z12 || tVar.f1512f == 0)) {
                    tVar.f1514i = true;
                    DictationAsr.d.execute(new o(tVar, 1));
                } else if (!DictationAsr.y(tVar)) {
                    org.telegram.messenger.g0.g3(new p(false, tVar, 1));
                }
                DictationAsr.p();
                return;
            default:
                boolean z14 = this.f1375b;
                t tVar2 = this.f1376c;
                t[] tVarArr = DictationAsr.f43064a;
                if (tVar2.f1512f == 0) {
                    z10 = false;
                }
                if (z14 == z10) {
                    ArrayList arrayList = new ArrayList(tVar2.f1517l);
                    tVar2.f1517l.clear();
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
