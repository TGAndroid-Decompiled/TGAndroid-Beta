package ki;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.a60;
import org.telegram.ui.Components.b60;
import org.telegram.ui.Components.m01;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.o01;
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
                ((o01) s0Var.d).b(o0Var.f13799a, file.length(), file);
                s0Var.h.post(new f0(s0Var, o0Var, j3, file, z10));
            }
        }
    }

    @Override
    public final void run() {
        n01 n01Var;
        n01 n01Var2;
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
                    b60 b60Var = (b60) dVar.f13924a;
                    a60 a60Var = b60Var.V;
                    if (a60Var != null) {
                        b60Var.V = null;
                        b60Var.f22885i0 = true;
                        o01 o01Var = b60Var.T;
                        if (o01Var == null) {
                            n01Var2 = null;
                        } else {
                            synchronized (o01Var) {
                                m01 m01Var = (m01) o01Var.f26868c.get(Long.valueOf(j10));
                                if (m01Var != null && !m01Var.e) {
                                    n01Var = new n01(Math.max(m01Var.f26325c, file.length()), m01Var.f26326f, m01Var.f26327g, m01Var.h, m01Var.f26328i);
                                }
                                n01Var = new n01(file.length(), null, null, null, null);
                            }
                            n01Var2 = n01Var;
                        }
                        VideoEditedInfo p5 = b60Var.p(file, j3, n01Var2);
                        p5.muted = !z10;
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, true, 0, 0, 0L);
                        photoEntry.ttl = a60Var.f22606c;
                        photoEntry.effectId = a60Var.d;
                        b60Var.f22881f.q(photoEntry, p5, a60Var.f22604a, a60Var.f22605b, 0, false, a60Var.e);
                        o01 o01Var2 = b60Var.T;
                        if (o01Var2 != null) {
                            o01Var2.d(false);
                        }
                        b60Var.T = null;
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
