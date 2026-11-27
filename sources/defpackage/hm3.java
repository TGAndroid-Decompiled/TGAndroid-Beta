package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.Dictation.DictationAsr;
public final class hm3 implements Runnable {
    public final byte a;
    public final boolean b;
    public final nm3 c;

    public hm3(boolean z, nm3 nm3Var, byte b) {
        this.a = b;
        this.b = z;
        this.c = nm3Var;
    }

    @Override
    public final void run() {
        int i;
        CountDownLatch e;
        int i2 = 0;
        boolean z = true;
        switch (this.a) {
            case 0:
                boolean z2 = this.b;
                nm3 nm3Var = this.c;
                nm3[] nm3VarArr = DictationAsr.a;
                if (nm3Var.f == 0) {
                    z = false;
                }
                if (z2 == z) {
                    ArrayList arrayList = new ArrayList(nm3Var.l);
                    nm3Var.l.clear();
                    int size = arrayList.size();
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        ((om3) obj).a(z2);
                    }
                    return;
                }
                return;
            default:
                final boolean z3 = this.b;
                nm3 nm3Var2 = this.c;
                DictationAsr.s().mkdirs();
                if (qn3.d() && (e = qn3.e()) != null) {
                    try {
                        e.await(20000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException unused) {
                    }
                }
                final ArrayList a = qn3.a();
                Future submit = DictationAsr.f.submit(new Callable() {
                    @Override
                    public final Object call() {
                        ArrayList arrayList2 = a;
                        boolean z4 = z3;
                        nm3[] nm3VarArr2 = DictationAsr.a;
                        return Integer.valueOf(DictationAsr.v("silero_vad.onnx", qn3.f(arrayList2, "silero-vad"), null, z4));
                    }
                });
                int v = DictationAsr.v(nm3Var2.b(), qn3.f(a, nm3Var2.c), nm3Var2, z3);
                try {
                    i = ((Integer) submit.get()).intValue();
                } catch (Exception unused2) {
                    i = -1;
                }
                int[] iArr = {i, v};
                boolean z4 = false;
                boolean z5 = true;
                for (int i3 = 0; i3 < 2; i3++) {
                    int i4 = iArr[i3];
                    if (i4 < 0) {
                        z5 = false;
                    }
                    if (i4 > 0) {
                        z4 = true;
                    }
                }
                nm3Var2.j = false;
                if (z5) {
                    uc7.e1().edit().putLong("tinyasr_checked_" + nm3Var2.a, System.currentTimeMillis()).apply();
                }
                if (DictationAsr.z(nm3Var2) && (z4 || nm3Var2.f == 0)) {
                    nm3Var2.i = true;
                    DictationAsr.d.execute(new km3(nm3Var2, (byte) 1));
                } else if (!DictationAsr.z(nm3Var2)) {
                    hl.c3(new hm3(false, nm3Var2, (byte) 0));
                }
                DictationAsr.o();
                return;
        }
    }
}
