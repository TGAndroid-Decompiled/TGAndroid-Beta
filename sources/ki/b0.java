package ki;

import ai.s4;
import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
public final class b0 implements Runnable {
    public final int f13662a;
    public final r0 f13663b;

    public b0(r0 r0Var, int i10) {
        this.f13662a = i10;
        this.f13663b = r0Var;
    }

    @Override
    public final void run() {
        switch (this.f13662a) {
            case 0:
                r0 r0Var = this.f13663b;
                t tVar = r0Var.P;
                File file = r0Var.Q;
                if (tVar != null) {
                    try {
                        synchronized (tVar) {
                            tVar.f13874u = true;
                            tVar.f();
                            tVar.f13874u = false;
                        }
                    } catch (IOException unused) {
                    }
                    w7.k.c(tVar.f13857a);
                }
                if (file != null) {
                    w7.k.c(file);
                    return;
                }
                return;
            case 1:
                r0 r0Var2 = this.f13663b;
                if (r0Var2.V == 3) {
                    r0Var2.o();
                    return;
                }
                return;
            case 2:
                r0 r0Var3 = this.f13663b;
                r0Var3.A = false;
                l lVar = r0Var3.f13840l;
                lVar.b("recording segment stopped: state=" + hg.c.C(r0Var3.V) + ", retainedDurationMs=" + r0Var3.D);
                if (r0Var3.f13853z) {
                    r0Var3.f13853z = false;
                    r0Var3.h();
                    return;
                } else if (r0Var3.f13851x) {
                    r0Var3.f13851x = false;
                    boolean z10 = r0Var3.f13852y;
                    r0Var3.f13837i.execute(new s4(r0Var3, r0Var3.P, z10, r0Var3.O, 6));
                    return;
                } else if (r0Var3.V == 4) {
                    try {
                        File createTempFile = File.createTempFile("round_video_preview_", ".mp4", r0Var3.f13832a.getCacheDir());
                        r0Var3.Q = createTempFile;
                        r0Var3.I = System.nanoTime();
                        l lVar2 = r0Var3.f13840l;
                        lVar2.b("preview snapshot started: file=" + createTempFile.getName());
                        r0Var3.f13837i.execute(new gg.t(r0Var3, r0Var3.P, createTempFile, 23));
                        return;
                    } catch (IOException e) {
                        r0Var3.g(e);
                        return;
                    }
                } else {
                    return;
                }
            default:
                r0 r0Var4 = this.f13663b;
                int i10 = r0Var4.V;
                if (i10 == 2 || i10 == 6) {
                    r0Var4.E = SystemClock.elapsedRealtime();
                    l lVar3 = r0Var4.f13840l;
                    lVar3.b("recording started: retainedDurationMs=" + r0Var4.D);
                    r0Var4.u(3);
                    long j3 = r0Var4.f13842n - r0Var4.D;
                    if (j3 <= 0) {
                        r0Var4.o();
                        return;
                    } else {
                        r0Var4.h.postDelayed(r0Var4.S, j3);
                        return;
                    }
                }
                return;
        }
    }
}
