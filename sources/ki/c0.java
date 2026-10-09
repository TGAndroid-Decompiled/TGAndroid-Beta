package ki;

import ai.t4;
import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
public final class c0 implements Runnable {
    public final int f14909a;
    public final t0 f14910b;

    public c0(t0 t0Var, int i10) {
        this.f14909a = i10;
        this.f14910b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f14909a) {
            case 0:
                t0 t0Var = this.f14910b;
                u uVar = t0Var.Q;
                File file = t0Var.R;
                if (uVar != null) {
                    try {
                        synchronized (uVar) {
                            uVar.v = true;
                            try {
                                uVar.g();
                            } finally {
                                uVar.v = false;
                            }
                        }
                    } catch (IOException unused) {
                    }
                    w7.j.c(uVar.f15136a);
                }
                if (file != null) {
                    w7.j.c(file);
                    return;
                }
                return;
            case 1:
                t0 t0Var2 = this.f14910b;
                if (t0Var2.W == 3) {
                    t0Var2.p();
                    return;
                }
                return;
            case 2:
                t0 t0Var3 = this.f14910b;
                int i10 = t0Var3.W;
                if (i10 == 2 || i10 == 6) {
                    t0Var3.F = SystemClock.elapsedRealtime();
                    n nVar = t0Var3.f15123m;
                    nVar.b("recording started: retainedDurationMs=" + t0Var3.E);
                    t0Var3.v(3);
                    long j3 = t0Var3.f15125o - t0Var3.E;
                    if (j3 <= 0) {
                        t0Var3.p();
                        return;
                    } else {
                        t0Var3.f15119i.postDelayed(t0Var3.T, j3);
                        return;
                    }
                }
                return;
            default:
                t0 t0Var4 = this.f14910b;
                t0Var4.B = false;
                n nVar2 = t0Var4.f15123m;
                nVar2.b("recording segment stopped: state=" + hg.c.C(t0Var4.W) + ", retainedDurationMs=" + t0Var4.E);
                if (t0Var4.A) {
                    t0Var4.A = false;
                    t0Var4.i();
                    return;
                } else if (t0Var4.f15134y) {
                    t0Var4.f15134y = false;
                    boolean z10 = t0Var4.f15135z;
                    t0Var4.f15120j.execute(new t4(t0Var4, t0Var4.Q, z10, t0Var4.P, 6));
                    return;
                } else if (t0Var4.W == 4) {
                    try {
                        File d = t0Var4.d("round_video_preview_");
                        t0Var4.R = d;
                        t0Var4.J = System.nanoTime();
                        n nVar3 = t0Var4.f15123m;
                        nVar3.b("preview snapshot started: file=" + d.getName());
                        t0Var4.f15120j.execute(new gg.t(t0Var4, t0Var4.Q, d, 23));
                        return;
                    } catch (IOException e7) {
                        t0Var4.h(e7);
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
