package ai;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.mp;
import org.telegram.ui.Dictation.DictationAsr;
public final class m implements Runnable {
    public final int f1368a;
    public final boolean f1369b;
    public final q f1370c;

    public m(boolean z10, q qVar, int i7) {
        this.f1368a = i7;
        this.f1369b = z10;
        this.f1370c = qVar;
    }

    @Override
    public final void run() {
        int i7;
        CountDownLatch e10;
        int i10 = 0;
        boolean z10 = true;
        switch (this.f1368a) {
            case 0:
                final boolean z11 = this.f1369b;
                q qVar = this.f1370c;
                DictationAsr.u().mkdirs();
                if (h1.d() && (e10 = h1.e()) != null) {
                    try {
                        e10.await(20000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException unused) {
                    }
                }
                final ArrayList a10 = h1.a();
                Future submit = DictationAsr.f43147f.submit(new Callable() {
                    @Override
                    public final Object call() {
                        ArrayList arrayList = a10;
                        boolean z12 = z11;
                        q[] qVarArr = DictationAsr.f43143a;
                        return Integer.valueOf(DictationAsr.x("silero_vad.onnx", h1.f(arrayList, "silero-vad"), null, z12));
                    }
                });
                int x10 = DictationAsr.x(qVar.b(), h1.f(a10, qVar.f1456c), qVar, z11);
                try {
                    i7 = ((Integer) submit.get()).intValue();
                } catch (Exception unused2) {
                    i7 = -1;
                }
                int[] iArr = {i7, x10};
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
                qVar.f1461j = false;
                if (z13) {
                    mp.g1().edit().putLong("tinyasr_checked_" + qVar.f1454a, System.currentTimeMillis()).apply();
                }
                if (DictationAsr.A(qVar) && (z12 || qVar.f1458f == 0)) {
                    qVar.f1460i = true;
                    DictationAsr.d.execute(new l(qVar, 1));
                } else if (!DictationAsr.A(qVar)) {
                    org.telegram.messenger.g0.g3(new m(false, qVar, 1));
                }
                DictationAsr.q();
                return;
            default:
                boolean z14 = this.f1369b;
                q qVar2 = this.f1370c;
                q[] qVarArr = DictationAsr.f43143a;
                if (qVar2.f1458f == 0) {
                    z10 = false;
                }
                if (z14 == z10) {
                    ArrayList arrayList = new ArrayList(qVar2.f1463l);
                    qVar2.f1463l.clear();
                    int size = arrayList.size();
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((r) obj).a(z14);
                    }
                    return;
                }
                return;
        }
    }
}
