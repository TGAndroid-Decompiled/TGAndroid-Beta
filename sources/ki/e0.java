package ki;

import ai.t4;
import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
public final class e0 implements Runnable {
    public final int f14919a;
    public final v0 f14920b;

    public e0(v0 v0Var, int i10) {
        this.f14919a = i10;
        this.f14920b = v0Var;
    }

    @Override
    public final void run() {
        switch (this.f14919a) {
            case 0:
                v0 v0Var = this.f14920b;
                w wVar = v0Var.Q;
                File file = v0Var.R;
                if (wVar != null) {
                    try {
                        synchronized (wVar) {
                            wVar.v = true;
                            try {
                                wVar.g();
                            } finally {
                                wVar.v = false;
                            }
                        }
                    } catch (IOException unused) {
                    }
                    w7.j.c(wVar.f15181a);
                }
                if (file != null) {
                    w7.j.c(file);
                    return;
                }
                return;
            case 1:
                v0 v0Var2 = this.f14920b;
                if (v0Var2.W == 3) {
                    v0Var2.p();
                    return;
                }
                return;
            case 2:
                v0 v0Var3 = this.f14920b;
                int i10 = v0Var3.W;
                if (i10 == 2 || i10 == 6) {
                    v0Var3.F = SystemClock.elapsedRealtime();
                    o oVar = v0Var3.f15168m;
                    oVar.b("recording started: retainedDurationMs=" + v0Var3.E);
                    v0Var3.v(3);
                    long j3 = v0Var3.f15170o - v0Var3.E;
                    if (j3 <= 0) {
                        v0Var3.p();
                        return;
                    } else {
                        v0Var3.f15164i.postDelayed(v0Var3.T, j3);
                        return;
                    }
                }
                return;
            default:
                v0 v0Var4 = this.f14920b;
                v0Var4.B = false;
                o oVar2 = v0Var4.f15168m;
                oVar2.b("recording segment stopped: state=" + hg.c.C(v0Var4.W) + ", retainedDurationMs=" + v0Var4.E);
                if (v0Var4.A) {
                    v0Var4.A = false;
                    v0Var4.i();
                    return;
                } else if (v0Var4.f15179y) {
                    v0Var4.f15179y = false;
                    boolean z10 = v0Var4.f15180z;
                    v0Var4.f15165j.execute(new t4(v0Var4, v0Var4.Q, z10, v0Var4.P, 6));
                    return;
                } else if (v0Var4.W == 4) {
                    try {
                        File d = v0Var4.d("round_video_preview_");
                        v0Var4.R = d;
                        v0Var4.J = System.nanoTime();
                        o oVar3 = v0Var4.f15168m;
                        oVar3.b("preview snapshot started: file=" + d.getName());
                        v0Var4.f15165j.execute(new gg.t(v0Var4, v0Var4.Q, d, 23));
                        return;
                    } catch (IOException e7) {
                        v0Var4.h(e7);
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
