package ki;

import ai.s4;
import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
public final class y implements Runnable {
    public final int f13879a;
    public final q0 f13880b;

    public y(q0 q0Var, int i10) {
        this.f13879a = i10;
        this.f13880b = q0Var;
    }

    @Override
    public final void run() {
        switch (this.f13879a) {
            case 0:
                q0 q0Var = this.f13880b;
                q qVar = q0Var.O;
                File file = q0Var.P;
                if (qVar != null) {
                    try {
                        synchronized (qVar) {
                            qVar.c();
                        }
                    } catch (IOException unused) {
                    }
                    w7.k.c(qVar.f13816a);
                }
                if (file != null) {
                    w7.k.c(file);
                    return;
                }
                return;
            case 1:
                q0 q0Var2 = this.f13880b;
                if (q0Var2.U == 3) {
                    q0Var2.o();
                    return;
                }
                return;
            case 2:
                q0 q0Var3 = this.f13880b;
                q0Var3.A = false;
                k kVar = q0Var3.f13836l;
                kVar.b("recording segment stopped: state=" + hg.k0.C(q0Var3.U) + ", retainedDurationMs=" + q0Var3.D);
                if (q0Var3.f13849z) {
                    q0Var3.f13849z = false;
                    q0Var3.h();
                    return;
                } else if (q0Var3.f13847x) {
                    q0Var3.f13847x = false;
                    boolean z10 = q0Var3.f13848y;
                    q0Var3.f13833i.execute(new s4(q0Var3, q0Var3.O, z10, q0Var3.N, 6));
                    return;
                } else if (q0Var3.U == 4) {
                    try {
                        File createTempFile = File.createTempFile("round_video_preview_", ".mp4", q0Var3.f13828a.getCacheDir());
                        q0Var3.P = createTempFile;
                        q0Var3.I = System.nanoTime();
                        k kVar2 = q0Var3.f13836l;
                        kVar2.b("preview snapshot started: file=" + createTempFile.getName());
                        q0Var3.f13833i.execute(new gg.t(q0Var3, q0Var3.O, createTempFile, 23));
                        return;
                    } catch (IOException e) {
                        q0Var3.g(e);
                        return;
                    }
                } else {
                    return;
                }
            default:
                q0 q0Var4 = this.f13880b;
                int i10 = q0Var4.U;
                if (i10 == 2 || i10 == 6) {
                    q0Var4.E = SystemClock.elapsedRealtime();
                    k kVar3 = q0Var4.f13836l;
                    kVar3.b("recording started: retainedDurationMs=" + q0Var4.D);
                    q0Var4.u(3);
                    long j3 = q0Var4.f13838n - q0Var4.D;
                    if (j3 <= 0) {
                        q0Var4.o();
                        return;
                    } else {
                        q0Var4.h.postDelayed(q0Var4.R, j3);
                        return;
                    }
                }
                return;
        }
    }
}
