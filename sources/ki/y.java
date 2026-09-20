package ki;

import ai.s4;
import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
public final class y implements Runnable {
    public final int f13866a;
    public final o0 f13867b;

    public y(o0 o0Var, int i10) {
        this.f13866a = i10;
        this.f13867b = o0Var;
    }

    @Override
    public final void run() {
        switch (this.f13866a) {
            case 0:
                o0 o0Var = this.f13867b;
                q qVar = o0Var.O;
                File file = o0Var.P;
                if (qVar != null) {
                    try {
                        synchronized (qVar) {
                            qVar.c();
                        }
                    } catch (IOException unused) {
                    }
                    w7.k.c(qVar.f13825a);
                }
                if (file != null) {
                    w7.k.c(file);
                    return;
                }
                return;
            case 1:
                o0 o0Var2 = this.f13867b;
                if (o0Var2.U == 3) {
                    o0Var2.o();
                    return;
                }
                return;
            case 2:
                o0 o0Var3 = this.f13867b;
                o0Var3.A = false;
                k kVar = o0Var3.f13808l;
                kVar.b("recording segment stopped: state=" + hg.k0.C(o0Var3.U) + ", retainedDurationMs=" + o0Var3.D);
                if (o0Var3.f13821z) {
                    o0Var3.f13821z = false;
                    o0Var3.h();
                    return;
                } else if (o0Var3.f13819x) {
                    o0Var3.f13819x = false;
                    boolean z10 = o0Var3.f13820y;
                    o0Var3.f13805i.execute(new s4(o0Var3, o0Var3.O, z10, o0Var3.N, 6));
                    return;
                } else if (o0Var3.U == 4) {
                    try {
                        File createTempFile = File.createTempFile("round_video_preview_", ".mp4", o0Var3.f13800a.getCacheDir());
                        o0Var3.P = createTempFile;
                        o0Var3.I = System.nanoTime();
                        k kVar2 = o0Var3.f13808l;
                        kVar2.b("preview snapshot started: file=" + createTempFile.getName());
                        o0Var3.f13805i.execute(new gg.t(o0Var3, o0Var3.O, createTempFile, 23));
                        return;
                    } catch (IOException e) {
                        o0Var3.g(e);
                        return;
                    }
                } else {
                    return;
                }
            default:
                o0 o0Var4 = this.f13867b;
                int i10 = o0Var4.U;
                if (i10 == 2 || i10 == 6) {
                    o0Var4.E = SystemClock.elapsedRealtime();
                    k kVar3 = o0Var4.f13808l;
                    kVar3.b("recording started: retainedDurationMs=" + o0Var4.D);
                    o0Var4.u(3);
                    long j3 = o0Var4.f13810n - o0Var4.D;
                    if (j3 <= 0) {
                        o0Var4.o();
                        return;
                    } else {
                        o0Var4.h.postDelayed(o0Var4.R, j3);
                        return;
                    }
                }
                return;
        }
    }
}
