package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.Dictation.DictationAsr;
public final class dn3 implements Runnable {
    public final byte a;
    public final boolean b;
    public final gn3 c;

    public dn3(boolean z, gn3 gn3Var, byte b) {
        this.a = b;
        this.b = z;
        this.c = gn3Var;
    }

    @Override
    public final void run() {
        int i;
        CountDownLatch e;
        int i2 = 0;
        boolean z = true;
        switch (this.a) {
            case 0:
                final boolean z2 = this.b;
                gn3 gn3Var = this.c;
                DictationAsr.r().mkdirs();
                if (jo3.d() && (e = jo3.e()) != null) {
                    try {
                        e.await(20000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException unused) {
                    }
                }
                final ArrayList a = jo3.a();
                Future submit = DictationAsr.f.submit(new Callable() {
                    @Override
                    public final Object call() {
                        ArrayList arrayList = a;
                        boolean z3 = z2;
                        gn3[] gn3VarArr = DictationAsr.a;
                        return Integer.valueOf(DictationAsr.u("silero_vad.onnx", jo3.f(arrayList, "silero-vad"), null, z3));
                    }
                });
                int u = DictationAsr.u(gn3Var.b(), jo3.f(a, gn3Var.c), gn3Var, z2);
                try {
                    i = ((Integer) submit.get()).intValue();
                } catch (Exception unused2) {
                    i = -1;
                }
                int[] iArr = {i, u};
                boolean z3 = false;
                boolean z4 = true;
                for (int i3 = 0; i3 < 2; i3++) {
                    int i4 = iArr[i3];
                    if (i4 < 0) {
                        z4 = false;
                    }
                    if (i4 > 0) {
                        z3 = true;
                    }
                }
                gn3Var.j = false;
                if (z4) {
                    oc7.d1().edit().putLong("tinyasr_checked_" + gn3Var.a, System.currentTimeMillis()).apply();
                }
                if (DictationAsr.y(gn3Var) && (z3 || gn3Var.f == 0)) {
                    gn3Var.i = true;
                    DictationAsr.d.execute(new cn3(gn3Var, (byte) 1));
                } else if (!DictationAsr.y(gn3Var)) {
                    gm.c3(new dn3(false, gn3Var, (byte) 1));
                }
                DictationAsr.n();
                return;
            default:
                boolean z5 = this.b;
                gn3 gn3Var2 = this.c;
                gn3[] gn3VarArr = DictationAsr.a;
                if (gn3Var2.f == 0) {
                    z = false;
                }
                if (z5 == z) {
                    ArrayList arrayList = new ArrayList(gn3Var2.l);
                    gn3Var2.l.clear();
                    int size = arrayList.size();
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        ((hn3) obj).a(z5);
                    }
                    return;
                }
                return;
        }
    }
}
