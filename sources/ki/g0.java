package ki;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.e11;
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.g11;
import org.telegram.ui.Components.r60;
import org.telegram.ui.Components.s60;
public final class g0 implements Runnable {
    public final int f14926a = 1;
    public final t0 f14927b;
    public final p0 f14928c;
    public final long d;
    public final File f14929e;
    public final boolean f14930f;

    public g0(t0 t0Var, p0 p0Var, long j3, File file, boolean z10) {
        this.f14927b = t0Var;
        this.f14928c = p0Var;
        this.d = j3;
        this.f14929e = file;
        this.f14930f = z10;
    }

    private final void a() {
        t0 t0Var = this.f14927b;
        p0 p0Var = this.f14928c;
        File file = this.f14929e;
        long j3 = this.d;
        boolean z10 = this.f14930f;
        synchronized (t0Var.f15118g) {
            if (!t0Var.D && !p0Var.d && !p0Var.f15070e) {
                p0Var.f15070e = true;
                ((g11) t0Var.f15116e).b(p0Var.f15067a, file.length(), file);
                t0Var.f15119i.post(new g0(t0Var, p0Var, j3, file, z10));
            }
        }
    }

    @Override
    public final void run() {
        f11 f11Var;
        f11 f11Var2;
        switch (this.f14926a) {
            case 0:
                a();
                return;
            default:
                t0 t0Var = this.f14927b;
                p0 p0Var = this.f14928c;
                long j3 = this.d;
                File file = this.f14929e;
                boolean z10 = this.f14930f;
                int i10 = t0Var.W;
                if (i10 != 10 && i10 != 9) {
                    t0Var.v(8);
                    t0Var.f15123m.b("output completed: generation=" + p0Var.f15067a + ", durationMs=" + j3 + ", size=" + file.length() + ", hasAudio=" + z10);
                    t0Var.m("completed");
                    m2.t tVar = t0Var.d;
                    long j10 = p0Var.f15067a;
                    s60 s60Var = (s60) tVar.f15972b;
                    r60 r60Var = s60Var.V;
                    if (r60Var != null) {
                        s60Var.V = null;
                        s60Var.f30682i0 = true;
                        g11 g11Var = s60Var.T;
                        if (g11Var == null) {
                            f11Var2 = null;
                        } else {
                            synchronized (g11Var) {
                                e11 e11Var = (e11) g11Var.f26554c.get(Long.valueOf(j10));
                                if (e11Var != null && !e11Var.f25918e) {
                                    f11Var = new f11(Math.max(e11Var.f25917c, file.length()), e11Var.f25919f, e11Var.f25920g, e11Var.h, e11Var.f25921i);
                                }
                                f11Var = new f11(file.length(), null, null, null, null);
                            }
                            f11Var2 = f11Var;
                        }
                        VideoEditedInfo q6 = s60Var.q(file, j3, f11Var2);
                        q6.muted = !z10;
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, true, 0, 0, 0L);
                        photoEntry.ttl = r60Var.f30371c;
                        photoEntry.effectId = r60Var.d;
                        s60Var.f30678f.r(photoEntry, q6, r60Var.f30369a, r60Var.f30370b, 0, false, r60Var.f30372e);
                        g11 g11Var2 = s60Var.T;
                        if (g11Var2 != null) {
                            g11Var2.d(false);
                        }
                        s60Var.T = null;
                        MediaController.getInstance().requestRecordAudioFocus(false);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public g0(t0 t0Var, p0 p0Var, File file, long j3, boolean z10) {
        this.f14927b = t0Var;
        this.f14928c = p0Var;
        this.f14929e = file;
        this.d = j3;
        this.f14930f = z10;
    }
}
