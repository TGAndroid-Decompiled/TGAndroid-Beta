package ki;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.g11;
import org.telegram.ui.Components.h11;
import org.telegram.ui.Components.r60;
import org.telegram.ui.Components.s60;
public final class i0 implements Runnable {
    public final int f14941a = 1;
    public final v0 f14942b;
    public final r0 f14943c;
    public final long d;
    public final File f14944e;
    public final boolean f14945f;

    public i0(v0 v0Var, r0 r0Var, long j3, File file, boolean z10) {
        this.f14942b = v0Var;
        this.f14943c = r0Var;
        this.d = j3;
        this.f14944e = file;
        this.f14945f = z10;
    }

    private final void a() {
        v0 v0Var = this.f14942b;
        r0 r0Var = this.f14943c;
        File file = this.f14944e;
        long j3 = this.d;
        boolean z10 = this.f14945f;
        synchronized (v0Var.f15163g) {
            if (!v0Var.D && !r0Var.d && !r0Var.f15097e) {
                r0Var.f15097e = true;
                ((h11) v0Var.f15161e).b(r0Var.f15094a, file.length(), file);
                v0Var.f15164i.post(new i0(v0Var, r0Var, j3, file, z10));
            }
        }
    }

    @Override
    public final void run() {
        g11 g11Var;
        g11 g11Var2;
        switch (this.f14941a) {
            case 0:
                a();
                return;
            default:
                v0 v0Var = this.f14942b;
                r0 r0Var = this.f14943c;
                long j3 = this.d;
                File file = this.f14944e;
                boolean z10 = this.f14945f;
                int i10 = v0Var.W;
                if (i10 != 10 && i10 != 9) {
                    v0Var.v(8);
                    v0Var.f15168m.b("output completed: generation=" + r0Var.f15094a + ", durationMs=" + j3 + ", size=" + file.length() + ", hasAudio=" + z10);
                    v0Var.m("completed");
                    m2.t tVar = v0Var.d;
                    long j10 = r0Var.f15094a;
                    s60 s60Var = (s60) tVar.f16033b;
                    r60 r60Var = s60Var.V;
                    if (r60Var != null) {
                        s60Var.V = null;
                        s60Var.f30760j0 = true;
                        h11 h11Var = s60Var.T;
                        if (h11Var == null) {
                            g11Var2 = null;
                        } else {
                            synchronized (h11Var) {
                                f11 f11Var = (f11) h11Var.f26937c.get(Long.valueOf(j10));
                                if (f11Var != null && !f11Var.f26292e) {
                                    g11Var = new g11(Math.max(f11Var.f26291c, file.length()), f11Var.f26293f, f11Var.f26294g, f11Var.h, f11Var.f26295i);
                                }
                                g11Var = new g11(file.length(), null, null, null, null);
                            }
                            g11Var2 = g11Var;
                        }
                        VideoEditedInfo r10 = s60Var.r(file, j3, g11Var2);
                        r10.muted = !z10;
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, true, 0, 0, 0L);
                        photoEntry.ttl = r60Var.f30437c;
                        photoEntry.effectId = r60Var.d;
                        s60Var.f30755f.r(photoEntry, r10, r60Var.f30435a, r60Var.f30436b, 0, false, r60Var.f30438e);
                        h11 h11Var2 = s60Var.T;
                        if (h11Var2 != null) {
                            h11Var2.d(false);
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

    public i0(v0 v0Var, r0 r0Var, File file, long j3, boolean z10) {
        this.f14942b = v0Var;
        this.f14943c = r0Var;
        this.f14944e = file;
        this.d = j3;
        this.f14945f = z10;
    }
}
