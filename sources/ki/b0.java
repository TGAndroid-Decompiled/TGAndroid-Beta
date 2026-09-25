package ki;

import ai.s4;
import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
public final class b0 implements Runnable {
    public final int f13662a;
    public final s0 f13663b;

    public b0(s0 s0Var, int i10) {
        this.f13662a = i10;
        this.f13663b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f13662a) {
            case 0:
                s0 s0Var = this.f13663b;
                t tVar = s0Var.P;
                File file = s0Var.Q;
                if (tVar != null) {
                    try {
                        synchronized (tVar) {
                            tVar.f13881u = true;
                            tVar.f();
                            tVar.f13881u = false;
                        }
                    } catch (IOException unused) {
                    }
                    w7.k.c(tVar.f13864a);
                }
                if (file != null) {
                    w7.k.c(file);
                    return;
                }
                return;
            case 1:
                s0 s0Var2 = this.f13663b;
                if (s0Var2.V == 3) {
                    s0Var2.o();
                    return;
                }
                return;
            case 2:
                s0 s0Var3 = this.f13663b;
                int i10 = s0Var3.V;
                if (i10 == 2 || i10 == 6) {
                    s0Var3.E = SystemClock.elapsedRealtime();
                    m mVar = s0Var3.f13850l;
                    mVar.b("recording started: retainedDurationMs=" + s0Var3.D);
                    s0Var3.u(3);
                    long j3 = s0Var3.f13852n - s0Var3.D;
                    if (j3 <= 0) {
                        s0Var3.o();
                        return;
                    } else {
                        s0Var3.h.postDelayed(s0Var3.S, j3);
                        return;
                    }
                }
                return;
            default:
                s0 s0Var4 = this.f13663b;
                s0Var4.A = false;
                m mVar2 = s0Var4.f13850l;
                mVar2.b("recording segment stopped: state=" + hg.c.C(s0Var4.V) + ", retainedDurationMs=" + s0Var4.D);
                if (s0Var4.f13863z) {
                    s0Var4.f13863z = false;
                    s0Var4.h();
                    return;
                } else if (s0Var4.f13861x) {
                    s0Var4.f13861x = false;
                    boolean z10 = s0Var4.f13862y;
                    s0Var4.f13847i.execute(new s4(s0Var4, s0Var4.P, z10, s0Var4.O, 6));
                    return;
                } else if (s0Var4.V == 4) {
                    try {
                        File createTempFile = File.createTempFile("round_video_preview_", ".mp4", s0Var4.f13842a.getCacheDir());
                        s0Var4.Q = createTempFile;
                        s0Var4.I = System.nanoTime();
                        m mVar3 = s0Var4.f13850l;
                        mVar3.b("preview snapshot started: file=" + createTempFile.getName());
                        s0Var4.f13847i.execute(new gg.t(s0Var4, s0Var4.P, createTempFile, 23));
                        return;
                    } catch (IOException e) {
                        s0Var4.g(e);
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
