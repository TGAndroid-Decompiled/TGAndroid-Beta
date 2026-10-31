package li;

import android.os.SystemClock;
import bi.n4;
import java.io.File;
import java.io.IOException;
public final class l0 implements Runnable {
    public final int f12172a;
    public final x0 f12173b;

    public l0(x0 x0Var, int i10) {
        this.f12172a = i10;
        this.f12173b = x0Var;
    }

    @Override
    public final void run() {
        switch (this.f12172a) {
            case 0:
                x0 x0Var = this.f12173b;
                if (x0Var.Z == 3) {
                    x0Var.q();
                    return;
                }
                return;
            case 1:
                x0 x0Var2 = this.f12173b;
                z zVar = x0Var2.T;
                File file = x0Var2.U;
                if (zVar != null) {
                    try {
                        synchronized (zVar) {
                            zVar.f12353w = true;
                            try {
                                zVar.g();
                            } finally {
                                zVar.f12353w = false;
                            }
                        }
                    } catch (IOException unused) {
                    }
                    w7.q.c(zVar.f12335a);
                }
                if (file != null) {
                    w7.q.c(file);
                    return;
                }
                return;
            case 2:
                x0 x0Var3 = this.f12173b;
                int i10 = x0Var3.Z;
                if (i10 == 2 || i10 == 6) {
                    x0Var3.I = SystemClock.elapsedRealtime();
                    p pVar = x0Var3.f12316m;
                    pVar.b("recording started: retainedDurationMs=" + x0Var3.H);
                    x0Var3.w(3);
                    long j10 = x0Var3.f12320q - x0Var3.H;
                    if (j10 > 0 && !x0Var3.D) {
                        x0Var3.f12312i.postDelayed(x0Var3.W, j10);
                        return;
                    }
                    x0Var3.D = false;
                    x0Var3.q();
                    return;
                }
                return;
            default:
                x0 x0Var4 = this.f12173b;
                x0Var4.E = false;
                p pVar2 = x0Var4.f12316m;
                pVar2.b("recording segment stopped: state=" + i0.a.A(x0Var4.Z) + ", retainedDurationMs=" + x0Var4.H);
                if (x0Var4.C) {
                    x0Var4.C = false;
                    x0Var4.i();
                    return;
                } else if (x0Var4.A) {
                    x0Var4.A = false;
                    boolean z10 = x0Var4.B;
                    x0Var4.f12313j.execute(new n4(x0Var4, x0Var4.T, z10, x0Var4.S, 3));
                    return;
                } else if (x0Var4.Z == 4) {
                    try {
                        File d = x0Var4.d("round_video_preview_");
                        x0Var4.U = d;
                        x0Var4.M = System.nanoTime();
                        p pVar3 = x0Var4.f12316m;
                        pVar3.b("preview snapshot started: file=" + d.getName());
                        x0Var4.f12313j.execute(new s(x0Var4, x0Var4.T, d, 1));
                        return;
                    } catch (IOException e) {
                        x0Var4.h(e);
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
