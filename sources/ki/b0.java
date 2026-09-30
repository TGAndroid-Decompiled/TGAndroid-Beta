package ki;

import ai.s4;
import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
public final class b0 implements Runnable {
    public final int f13677a;
    public final s0 f13678b;

    public b0(s0 s0Var, int i10) {
        this.f13677a = i10;
        this.f13678b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f13677a) {
            case 0:
                s0 s0Var = this.f13678b;
                t tVar = s0Var.Q;
                File file = s0Var.R;
                if (tVar != null) {
                    try {
                        synchronized (tVar) {
                            tVar.f13897u = true;
                            try {
                                tVar.f();
                            } finally {
                                tVar.f13897u = false;
                            }
                        }
                    } catch (IOException unused) {
                    }
                    w7.k.c(tVar.f13880a);
                }
                if (file != null) {
                    w7.k.c(file);
                    return;
                }
                return;
            case 1:
                s0 s0Var2 = this.f13678b;
                if (s0Var2.W == 3) {
                    s0Var2.p();
                    return;
                }
                return;
            case 2:
                s0 s0Var3 = this.f13678b;
                int i10 = s0Var3.W;
                if (i10 == 2 || i10 == 6) {
                    s0Var3.F = SystemClock.elapsedRealtime();
                    m mVar = s0Var3.f13867m;
                    mVar.b("recording started: retainedDurationMs=" + s0Var3.E);
                    s0Var3.v(3);
                    long j3 = s0Var3.f13869o - s0Var3.E;
                    if (j3 <= 0) {
                        s0Var3.p();
                        return;
                    } else {
                        s0Var3.f13863i.postDelayed(s0Var3.T, j3);
                        return;
                    }
                }
                return;
            default:
                s0 s0Var4 = this.f13678b;
                s0Var4.B = false;
                m mVar2 = s0Var4.f13867m;
                mVar2.b("recording segment stopped: state=" + hg.c.C(s0Var4.W) + ", retainedDurationMs=" + s0Var4.E);
                if (s0Var4.A) {
                    s0Var4.A = false;
                    s0Var4.i();
                    return;
                } else if (s0Var4.f13878y) {
                    s0Var4.f13878y = false;
                    boolean z10 = s0Var4.f13879z;
                    s0Var4.f13864j.execute(new s4(s0Var4, s0Var4.Q, z10, s0Var4.P, 6));
                    return;
                } else if (s0Var4.W == 4) {
                    try {
                        File d = s0Var4.d("round_video_preview_");
                        s0Var4.R = d;
                        s0Var4.J = System.nanoTime();
                        m mVar3 = s0Var4.f13867m;
                        mVar3.b("preview snapshot started: file=" + d.getName());
                        s0Var4.f13864j.execute(new gg.t(s0Var4, s0Var4.Q, d, 23));
                        return;
                    } catch (IOException e) {
                        s0Var4.h(e);
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
