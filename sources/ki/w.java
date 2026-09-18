package ki;

import ai.s4;
import android.os.SystemClock;
import hg.k0;
import java.io.File;
import java.io.IOException;
public final class w implements Runnable {
    public final int f13820a;
    public final h0 f13821b;

    public w(h0 h0Var, int i10) {
        this.f13820a = i10;
        this.f13821b = h0Var;
    }

    @Override
    public final void run() {
        switch (this.f13820a) {
            case 0:
                h0 h0Var = this.f13821b;
                o oVar = h0Var.J;
                File file = h0Var.K;
                if (oVar != null) {
                    try {
                        synchronized (oVar) {
                            oVar.c();
                        }
                    } catch (IOException unused) {
                    }
                    w7.k.c(oVar.f13780a);
                }
                if (file != null) {
                    w7.k.c(file);
                    return;
                }
                return;
            case 1:
                h0 h0Var2 = this.f13821b;
                if (h0Var2.Q == 3) {
                    h0Var2.n();
                    return;
                }
                return;
            case 2:
                h0 h0Var3 = this.f13821b;
                h0Var3.v = false;
                j jVar = h0Var3.f13713l;
                jVar.b("recording segment stopped: state=" + k0.C(h0Var3.Q) + ", retainedDurationMs=" + h0Var3.f13725y);
                if (h0Var3.f13722u) {
                    h0Var3.f13722u = false;
                    h0Var3.h();
                    return;
                } else if (h0Var3.f13720s) {
                    h0Var3.f13720s = false;
                    boolean z10 = h0Var3.f13721t;
                    h0Var3.f13710i.execute(new s4(h0Var3, h0Var3.J, z10, h0Var3.I, 6));
                    return;
                } else if (h0Var3.Q == 4) {
                    try {
                        File createTempFile = File.createTempFile("round_video_preview_", ".mp4", h0Var3.f13705a.getCacheDir());
                        h0Var3.K = createTempFile;
                        h0Var3.D = System.nanoTime();
                        j jVar2 = h0Var3.f13713l;
                        jVar2.b("preview snapshot started: file=" + createTempFile.getName());
                        h0Var3.f13710i.execute(new gg.t(h0Var3, h0Var3.J, createTempFile, 23));
                        return;
                    } catch (IOException e) {
                        h0Var3.g(e);
                        return;
                    }
                } else {
                    return;
                }
            default:
                h0 h0Var4 = this.f13821b;
                int i10 = h0Var4.Q;
                if (i10 == 2 || i10 == 6) {
                    h0Var4.f13726z = SystemClock.elapsedRealtime();
                    j jVar3 = h0Var4.f13713l;
                    jVar3.b("recording started: retainedDurationMs=" + h0Var4.f13725y);
                    h0Var4.u(3);
                    long j3 = h0Var4.f13714m - h0Var4.f13725y;
                    if (j3 <= 0) {
                        h0Var4.n();
                        return;
                    } else {
                        h0Var4.h.postDelayed(h0Var4.M, j3);
                        return;
                    }
                }
                return;
        }
    }
}
