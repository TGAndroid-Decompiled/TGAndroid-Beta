package li;

import android.os.SystemClock;
import bi.h4;
import java.io.File;
import java.io.IOException;
public final class f0 implements Runnable {
    public final int f14788a;
    public final u0 f14789b;

    public f0(u0 u0Var, int i10) {
        this.f14788a = i10;
        this.f14789b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f14788a) {
            case 0:
                u0 u0Var = this.f14789b;
                x xVar = u0Var.Q;
                File file = u0Var.R;
                if (xVar != null) {
                    try {
                        synchronized (xVar) {
                            xVar.v = true;
                            try {
                                xVar.g();
                            } finally {
                                xVar.v = false;
                            }
                        }
                    } catch (IOException unused) {
                    }
                    w7.p.c(xVar.f15037a);
                }
                if (file != null) {
                    w7.p.c(file);
                    return;
                }
                return;
            case 1:
                u0 u0Var2 = this.f14789b;
                if (u0Var2.W == 3) {
                    u0Var2.p();
                    return;
                }
                return;
            case 2:
                u0 u0Var3 = this.f14789b;
                int i10 = u0Var3.W;
                if (i10 == 2 || i10 == 6) {
                    u0Var3.F = SystemClock.elapsedRealtime();
                    p pVar = u0Var3.f15015m;
                    pVar.b("recording started: retainedDurationMs=" + u0Var3.E);
                    u0Var3.v(3);
                    long j10 = u0Var3.f15017o - u0Var3.E;
                    if (j10 <= 0) {
                        u0Var3.p();
                        return;
                    } else {
                        u0Var3.f15011i.postDelayed(u0Var3.T, j10);
                        return;
                    }
                }
                return;
            default:
                u0 u0Var4 = this.f14789b;
                u0Var4.B = false;
                p pVar2 = u0Var4.f15015m;
                pVar2.b("recording segment stopped: state=" + i2.d.C(u0Var4.W) + ", retainedDurationMs=" + u0Var4.E);
                if (u0Var4.A) {
                    u0Var4.A = false;
                    u0Var4.i();
                    return;
                } else if (u0Var4.f15026y) {
                    u0Var4.f15026y = false;
                    boolean z10 = u0Var4.f15027z;
                    u0Var4.f15012j.execute(new h4(u0Var4, u0Var4.Q, z10, u0Var4.P, 6));
                    return;
                } else if (u0Var4.W == 4) {
                    try {
                        File d = u0Var4.d("round_video_preview_");
                        u0Var4.R = d;
                        u0Var4.J = System.nanoTime();
                        p pVar3 = u0Var4.f15015m;
                        pVar3.b("preview snapshot started: file=" + d.getName());
                        u0Var4.f15012j.execute(new hg.t(u0Var4, u0Var4.Q, d, 25));
                        return;
                    } catch (IOException e) {
                        u0Var4.h(e);
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
