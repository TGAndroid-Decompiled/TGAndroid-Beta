package ki;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.g11;
import org.telegram.ui.Components.h11;
import org.telegram.ui.Components.s60;
import org.telegram.ui.Components.t60;
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
        synchronized (t0Var.f15122g) {
            if (!t0Var.D && !p0Var.d && !p0Var.f15074e) {
                p0Var.f15074e = true;
                ((h11) t0Var.f15120e).b(p0Var.f15071a, file.length(), file);
                t0Var.f15123i.post(new g0(t0Var, p0Var, j3, file, z10));
            }
        }
    }

    @Override
    public final void run() {
        g11 g11Var;
        g11 g11Var2;
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
                    t0Var.f15127m.b("output completed: generation=" + p0Var.f15071a + ", durationMs=" + j3 + ", size=" + file.length() + ", hasAudio=" + z10);
                    t0Var.m("completed");
                    m2.t tVar = t0Var.d;
                    long j10 = p0Var.f15071a;
                    t60 t60Var = (t60) tVar.f15976b;
                    s60 s60Var = t60Var.V;
                    if (s60Var != null) {
                        t60Var.V = null;
                        t60Var.f31010i0 = true;
                        h11 h11Var = t60Var.T;
                        if (h11Var == null) {
                            g11Var2 = null;
                        } else {
                            synchronized (h11Var) {
                                f11 f11Var = (f11) h11Var.f26908c.get(Long.valueOf(j10));
                                if (f11Var != null && !f11Var.f26254e) {
                                    g11Var = new g11(Math.max(f11Var.f26253c, file.length()), f11Var.f26255f, f11Var.f26256g, f11Var.h, f11Var.f26257i);
                                }
                                g11Var = new g11(file.length(), null, null, null, null);
                            }
                            g11Var2 = g11Var;
                        }
                        VideoEditedInfo q6 = t60Var.q(file, j3, g11Var2);
                        q6.muted = !z10;
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, true, 0, 0, 0L);
                        photoEntry.ttl = s60Var.f30693c;
                        photoEntry.effectId = s60Var.d;
                        t60Var.f31006f.r(photoEntry, q6, s60Var.f30691a, s60Var.f30692b, 0, false, s60Var.f30694e);
                        h11 h11Var2 = t60Var.T;
                        if (h11Var2 != null) {
                            h11Var2.d(false);
                        }
                        t60Var.T = null;
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
