package ki;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.g11;
import org.telegram.ui.Components.h11;
import org.telegram.ui.Components.i11;
import org.telegram.ui.Components.s60;
import org.telegram.ui.Components.t60;
public final class g0 implements Runnable {
    public final int f14925a = 1;
    public final t0 f14926b;
    public final p0 f14927c;
    public final long d;
    public final File f14928e;
    public final boolean f14929f;

    public g0(t0 t0Var, p0 p0Var, long j3, File file, boolean z10) {
        this.f14926b = t0Var;
        this.f14927c = p0Var;
        this.d = j3;
        this.f14928e = file;
        this.f14929f = z10;
    }

    private final void a() {
        t0 t0Var = this.f14926b;
        p0 p0Var = this.f14927c;
        File file = this.f14928e;
        long j3 = this.d;
        boolean z10 = this.f14929f;
        synchronized (t0Var.f15121g) {
            if (!t0Var.D && !p0Var.d && !p0Var.f15073e) {
                p0Var.f15073e = true;
                ((i11) t0Var.f15119e).b(p0Var.f15070a, file.length(), file);
                t0Var.f15122i.post(new g0(t0Var, p0Var, j3, file, z10));
            }
        }
    }

    @Override
    public final void run() {
        h11 h11Var;
        h11 h11Var2;
        switch (this.f14925a) {
            case 0:
                a();
                return;
            default:
                t0 t0Var = this.f14926b;
                p0 p0Var = this.f14927c;
                long j3 = this.d;
                File file = this.f14928e;
                boolean z10 = this.f14929f;
                int i10 = t0Var.W;
                if (i10 != 10 && i10 != 9) {
                    t0Var.v(8);
                    t0Var.f15126m.b("output completed: generation=" + p0Var.f15070a + ", durationMs=" + j3 + ", size=" + file.length() + ", hasAudio=" + z10);
                    t0Var.m("completed");
                    m2.t tVar = t0Var.d;
                    long j10 = p0Var.f15070a;
                    t60 t60Var = (t60) tVar.f15997b;
                    s60 s60Var = t60Var.V;
                    if (s60Var != null) {
                        t60Var.V = null;
                        t60Var.f31015i0 = true;
                        i11 i11Var = t60Var.T;
                        if (i11Var == null) {
                            h11Var2 = null;
                        } else {
                            synchronized (i11Var) {
                                g11 g11Var = (g11) i11Var.f27137c.get(Long.valueOf(j10));
                                if (g11Var != null && !g11Var.f26568e) {
                                    h11Var = new h11(Math.max(g11Var.f26567c, file.length()), g11Var.f26569f, g11Var.f26570g, g11Var.h, g11Var.f26571i);
                                }
                                h11Var = new h11(file.length(), null, null, null, null);
                            }
                            h11Var2 = h11Var;
                        }
                        VideoEditedInfo q6 = t60Var.q(file, j3, h11Var2);
                        q6.muted = !z10;
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, true, 0, 0, 0L);
                        photoEntry.ttl = s60Var.f30652c;
                        photoEntry.effectId = s60Var.d;
                        t60Var.f31011f.r(photoEntry, q6, s60Var.f30650a, s60Var.f30651b, 0, false, s60Var.f30653e);
                        i11 i11Var2 = t60Var.T;
                        if (i11Var2 != null) {
                            i11Var2.d(false);
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
        this.f14926b = t0Var;
        this.f14927c = p0Var;
        this.f14928e = file;
        this.d = j3;
        this.f14929f = z10;
    }
}
