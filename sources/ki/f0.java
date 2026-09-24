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
    public final int f13678a = 1;
    public final r0 f13679b;
    public final n0 f13680c;
    public final long d;
    public final File e;
    public final boolean f13681f;

    public f0(r0 r0Var, n0 n0Var, long j3, File file, boolean z10) {
        this.f13679b = r0Var;
        this.f13680c = n0Var;
        this.d = j3;
        this.e = file;
        this.f13681f = z10;
    }

    private final void a() {
        r0 r0Var = this.f13679b;
        n0 n0Var = this.f13680c;
        File file = this.e;
        long j3 = this.d;
        boolean z10 = this.f13681f;
        synchronized (r0Var.f13835f) {
            if (!r0Var.C && !n0Var.d && !n0Var.e) {
                n0Var.e = true;
                ((o01) r0Var.d).b(n0Var.f13795a, file.length(), file);
                r0Var.h.post(new f0(r0Var, n0Var, j3, file, z10));
            }
        }
    }

    @Override
    public final void run() {
        n01 n01Var;
        n01 n01Var2;
        switch (this.f13678a) {
            case 0:
                a();
                return;
            default:
                r0 r0Var = this.f13679b;
                n0 n0Var = this.f13680c;
                long j3 = this.d;
                File file = this.e;
                boolean z10 = this.f13681f;
                int i10 = r0Var.V;
                if (i10 != 10 && i10 != 9) {
                    r0Var.u(8);
                    r0Var.f13840l.b("output completed: generation=" + n0Var.f13795a + ", durationMs=" + j3 + ", size=" + file.length() + ", hasAudio=" + z10);
                    r0Var.l("completed");
                    l.d dVar = r0Var.f13834c;
                    long j10 = n0Var.f13795a;
                    b60 b60Var = (b60) dVar.f13909a;
                    a60 a60Var = b60Var.S;
                    if (a60Var != null) {
                        b60Var.S = null;
                        b60Var.f22873f0 = true;
                        o01 o01Var = b60Var.Q;
                        if (o01Var == null) {
                            n01Var2 = null;
                        } else {
                            synchronized (o01Var) {
                                m01 m01Var = (m01) o01Var.f26863c.get(Long.valueOf(j10));
                                if (m01Var != null && !m01Var.e) {
                                    n01Var = new n01(Math.max(m01Var.f26317c, file.length()), m01Var.f26318f, m01Var.f26319g, m01Var.h, m01Var.f26320i);
                                }
                                n01Var = new n01(file.length(), null, null, null, null);
                            }
                            n01Var2 = n01Var;
                        }
                        VideoEditedInfo o9 = b60Var.o(file, j3, n01Var2);
                        o9.muted = !z10;
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, true, 0, 0, 0L);
                        photoEntry.ttl = a60Var.f22591c;
                        photoEntry.effectId = a60Var.d;
                        b60Var.f22872f.q(photoEntry, o9, a60Var.f22589a, a60Var.f22590b, 0, false, a60Var.e);
                        o01 o01Var2 = b60Var.Q;
                        if (o01Var2 != null) {
                            o01Var2.d(false);
                        }
                        b60Var.Q = null;
                        MediaController.getInstance().requestRecordAudioFocus(false);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public f0(r0 r0Var, n0 n0Var, File file, long j3, boolean z10) {
        this.f13679b = r0Var;
        this.f13680c = n0Var;
        this.e = file;
        this.d = j3;
        this.f13681f = z10;
    }
}
