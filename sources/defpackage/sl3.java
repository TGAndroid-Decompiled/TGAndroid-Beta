package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.Dictation.DictationAsr;
public final class sl3 implements Runnable {
    public final byte a;
    public final boolean b;
    public final vl3 c;

    public sl3(boolean z, vl3 vl3Var, byte b) {
        this.a = b;
        this.b = z;
        this.c = vl3Var;
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
                vl3 vl3Var = this.c;
                DictationAsr.r().mkdirs();
                if (zm3.d() && (e = zm3.e()) != null) {
                    try {
                        e.await(20000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException unused) {
                    }
                }
                final ArrayList a = zm3.a();
                Future submit = DictationAsr.f.submit(new Callable() {
                    @Override
                    public final Object call() {
                        ArrayList arrayList = a;
                        boolean z3 = z2;
                        vl3[] vl3VarArr = DictationAsr.a;
                        return Integer.valueOf(DictationAsr.u("silero_vad.onnx", zm3.f(arrayList, "silero-vad"), null, z3));
                    }
                });
                int u = DictationAsr.u(vl3Var.b(), zm3.f(a, vl3Var.c), vl3Var, z2);
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
                vl3Var.j = false;
                if (z4) {
                    na7.c1().edit().putLong("tinyasr_checked_" + vl3Var.a, System.currentTimeMillis()).apply();
                }
                if (DictationAsr.y(vl3Var) && (z3 || vl3Var.f == 0)) {
                    vl3Var.i = true;
                    DictationAsr.d.execute(new rl3(vl3Var, (byte) 1));
                } else if (!DictationAsr.y(vl3Var)) {
                    gl.d3(new sl3(false, vl3Var, (byte) 1));
                }
                DictationAsr.n();
                return;
            default:
                boolean z5 = this.b;
                vl3 vl3Var2 = this.c;
                vl3[] vl3VarArr = DictationAsr.a;
                if (vl3Var2.f == 0) {
                    z = false;
                }
                if (z5 == z) {
                    ArrayList arrayList = new ArrayList(vl3Var2.l);
                    vl3Var2.l.clear();
                    int size = arrayList.size();
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        ((wl3) obj).a(z5);
                    }
                    return;
                }
                return;
        }
    }
}
