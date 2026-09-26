package ki;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.b60;
import org.telegram.ui.Components.c60;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.o01;
import org.telegram.ui.Components.p01;
public final class f0 implements Runnable {
    public final int f13680a = 1;
    public final s0 f13681b;
    public final o0 f13682c;
    public final long d;
    public final File e;
    public final boolean f13683f;

    public f0(s0 s0Var, o0 o0Var, long j3, File file, boolean z10) {
        this.f13681b = s0Var;
        this.f13682c = o0Var;
        this.d = j3;
        this.e = file;
        this.f13683f = z10;
    }

    private final void a() {
        s0 s0Var = this.f13681b;
        o0 o0Var = this.f13682c;
        File file = this.e;
        long j3 = this.d;
        boolean z10 = this.f13683f;
        synchronized (s0Var.f13845f) {
            if (!s0Var.C && !o0Var.d && !o0Var.e) {
                o0Var.e = true;
                ((p01) s0Var.d).b(o0Var.f13799a, file.length(), file);
                s0Var.h.post(new f0(s0Var, o0Var, j3, file, z10));
            }
        }
    }

    @Override
    public final void run() {
        o01 o01Var;
        o01 o01Var2;
        switch (this.f13680a) {
            case 0:
                a();
                return;
            default:
                s0 s0Var = this.f13681b;
                o0 o0Var = this.f13682c;
                long j3 = this.d;
                File file = this.e;
                boolean z10 = this.f13683f;
                int i10 = s0Var.V;
                if (i10 != 10 && i10 != 9) {
                    s0Var.u(8);
                    s0Var.f13850l.b("output completed: generation=" + o0Var.f13799a + ", durationMs=" + j3 + ", size=" + file.length() + ", hasAudio=" + z10);
                    s0Var.l("completed");
                    l.d dVar = s0Var.f13844c;
                    long j10 = o0Var.f13799a;
                    c60 c60Var = (c60) dVar.f13924a;
                    b60 b60Var = c60Var.V;
                    if (b60Var != null) {
                        c60Var.V = null;
                        c60Var.f23227i0 = true;
                        p01 p01Var = c60Var.T;
                        if (p01Var == null) {
                            o01Var2 = null;
                        } else {
                            synchronized (p01Var) {
                                n01 n01Var = (n01) p01Var.f27181c.get(Long.valueOf(j10));
                                if (n01Var != null && !n01Var.e) {
                                    o01Var = new o01(Math.max(n01Var.f26637c, file.length()), n01Var.f26638f, n01Var.f26639g, n01Var.h, n01Var.f26640i);
                                }
                                o01Var = new o01(file.length(), null, null, null, null);
                            }
                            o01Var2 = o01Var;
                        }
                        VideoEditedInfo p5 = c60Var.p(file, j3, o01Var2);
                        p5.muted = !z10;
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, true, 0, 0, 0L);
                        photoEntry.ttl = b60Var.f22903c;
                        photoEntry.effectId = b60Var.d;
                        c60Var.f23223f.q(photoEntry, p5, b60Var.f22901a, b60Var.f22902b, 0, false, b60Var.e);
                        p01 p01Var2 = c60Var.T;
                        if (p01Var2 != null) {
                            p01Var2.d(false);
                        }
                        c60Var.T = null;
                        MediaController.getInstance().requestRecordAudioFocus(false);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public f0(s0 s0Var, o0 o0Var, File file, long j3, boolean z10) {
        this.f13681b = s0Var;
        this.f13682c = o0Var;
        this.e = file;
        this.d = j3;
        this.f13683f = z10;
    }
}
