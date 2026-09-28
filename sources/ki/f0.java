package ki;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.c60;
import org.telegram.ui.Components.d60;
import org.telegram.ui.Components.o01;
import org.telegram.ui.Components.p01;
import org.telegram.ui.Components.q01;
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
                ((q01) s0Var.d).b(o0Var.f13799a, file.length(), file);
                s0Var.h.post(new f0(s0Var, o0Var, j3, file, z10));
            }
        }
    }

    @Override
    public final void run() {
        p01 p01Var;
        p01 p01Var2;
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
                    d60 d60Var = (d60) dVar.f13924a;
                    c60 c60Var = d60Var.V;
                    if (c60Var != null) {
                        d60Var.V = null;
                        d60Var.f23542i0 = true;
                        q01 q01Var = d60Var.T;
                        if (q01Var == null) {
                            p01Var2 = null;
                        } else {
                            synchronized (q01Var) {
                                o01 o01Var = (o01) q01Var.f27499c.get(Long.valueOf(j10));
                                if (o01Var != null && !o01Var.e) {
                                    p01Var = new p01(Math.max(o01Var.f26894c, file.length()), o01Var.f26895f, o01Var.f26896g, o01Var.h, o01Var.f26897i);
                                }
                                p01Var = new p01(file.length(), null, null, null, null);
                            }
                            p01Var2 = p01Var;
                        }
                        VideoEditedInfo p5 = d60Var.p(file, j3, p01Var2);
                        p5.muted = !z10;
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, true, 0, 0, 0L);
                        photoEntry.ttl = c60Var.f23217c;
                        photoEntry.effectId = c60Var.d;
                        d60Var.f23538f.q(photoEntry, p5, c60Var.f23215a, c60Var.f23216b, 0, false, c60Var.e);
                        q01 q01Var2 = d60Var.T;
                        if (q01Var2 != null) {
                            q01Var2.d(false);
                        }
                        d60Var.T = null;
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
