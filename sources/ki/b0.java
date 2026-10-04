package ki;

import ai.s4;
import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
public final class b0 implements Runnable {
    public final int f14853a;
    public final s0 f14854b;

    public b0(s0 s0Var, int i10) {
        this.f14853a = i10;
        this.f14854b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f14853a) {
            case 0:
                s0 s0Var = this.f14854b;
                t tVar = s0Var.Q;
                File file = s0Var.R;
                if (tVar != null) {
                    try {
                        synchronized (tVar) {
                            tVar.v = true;
                            try {
                                tVar.g();
                            } finally {
                                tVar.v = false;
                            }
                        }
                    } catch (IOException unused) {
                    }
                    w7.k.c(tVar.f15066a);
                }
                if (file != null) {
                    w7.k.c(file);
                    return;
                }
                return;
            case 1:
                s0 s0Var2 = this.f14854b;
                if (s0Var2.W == 3) {
                    s0Var2.p();
                    return;
                }
                return;
            case 2:
                s0 s0Var3 = this.f14854b;
                int i10 = s0Var3.W;
                if (i10 == 2 || i10 == 6) {
                    s0Var3.F = SystemClock.elapsedRealtime();
                    m mVar = s0Var3.f15053m;
                    mVar.b("recording started: retainedDurationMs=" + s0Var3.E);
                    s0Var3.v(3);
                    long j3 = s0Var3.f15055o - s0Var3.E;
                    if (j3 <= 0) {
                        s0Var3.p();
                        return;
                    } else {
                        s0Var3.f15049i.postDelayed(s0Var3.T, j3);
                        return;
                    }
                }
                return;
            default:
                s0 s0Var4 = this.f14854b;
                s0Var4.B = false;
                m mVar2 = s0Var4.f15053m;
                mVar2.b("recording segment stopped: state=" + hg.k0.B(s0Var4.W) + ", retainedDurationMs=" + s0Var4.E);
                if (s0Var4.A) {
                    s0Var4.A = false;
                    s0Var4.i();
                    return;
                } else if (s0Var4.f15064y) {
                    s0Var4.f15064y = false;
                    boolean z10 = s0Var4.f15065z;
                    s0Var4.f15050j.execute(new s4(s0Var4, s0Var4.Q, z10, s0Var4.P, 6));
                    return;
                } else if (s0Var4.W == 4) {
                    try {
                        File d = s0Var4.d("round_video_preview_");
                        s0Var4.R = d;
                        s0Var4.J = System.nanoTime();
                        m mVar3 = s0Var4.f15053m;
                        mVar3.b("preview snapshot started: file=" + d.getName());
                        s0Var4.f15050j.execute(new gg.t(s0Var4, s0Var4.Q, d, 23));
                        return;
                    } catch (IOException e7) {
                        s0Var4.h(e7);
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
