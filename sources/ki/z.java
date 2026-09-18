package ki;

import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.a60;
import org.telegram.ui.Components.o01;
import org.telegram.ui.Components.p01;
import org.telegram.ui.Components.q01;
import org.telegram.ui.Components.z50;
public final class z implements Runnable {
    public final int f13828a = 1;
    public final h0 f13829b;
    public final e0 f13830c;
    public final long d;
    public final File e;
    public final boolean f13831f;

    public z(h0 h0Var, e0 e0Var, long j3, File file, boolean z10) {
        this.f13829b = h0Var;
        this.f13830c = e0Var;
        this.d = j3;
        this.e = file;
        this.f13831f = z10;
    }

    private final void a() {
        h0 h0Var = this.f13829b;
        e0 e0Var = this.f13830c;
        File file = this.e;
        long j3 = this.d;
        boolean z10 = this.f13831f;
        if (e0Var.d) {
            return;
        }
        f0 f0Var = h0Var.d;
        long j10 = e0Var.f13670a;
        long length = file.length();
        q01 q01Var = (q01) f0Var;
        synchronized (q01Var) {
            o01 o01Var = (o01) q01Var.f27401c.get(Long.valueOf(j10));
            if (!q01Var.d && o01Var != null && !o01Var.e) {
                q01Var.c(o01Var);
                o01Var.f26806b = Math.max(o01Var.f26806b, length);
                o01Var.f26807c = length;
                FileLoader.getInstance(q01Var.f27399a).checkUploadNewDataAvailable(file.getAbsolutePath(), q01Var.f27400b, o01Var.f26806b, length);
            }
        }
        h0Var.h.post(new z(h0Var, e0Var, j3, file, z10));
    }

    @Override
    public final void run() {
        p01 p01Var;
        p01 p01Var2;
        switch (this.f13828a) {
            case 0:
                a();
                return;
            default:
                h0 h0Var = this.f13829b;
                e0 e0Var = this.f13830c;
                long j3 = this.d;
                File file = this.e;
                boolean z10 = this.f13831f;
                int i10 = h0Var.Q;
                if (i10 != 10 && i10 != 9) {
                    h0Var.u(8);
                    h0Var.f13713l.b("output completed: generation=" + e0Var.f13670a + ", durationMs=" + j3 + ", size=" + file.length() + ", hasAudio=" + z10);
                    h0Var.l("completed");
                    l.d dVar = h0Var.f13707c;
                    long j10 = e0Var.f13670a;
                    a60 a60Var = (a60) dVar.f13859a;
                    z50 z50Var = a60Var.O;
                    if (z50Var != null) {
                        a60Var.O = null;
                        a60Var.f22510b0 = true;
                        q01 q01Var = a60Var.M;
                        if (q01Var == null) {
                            p01Var2 = null;
                        } else {
                            synchronized (q01Var) {
                                o01 o01Var = (o01) q01Var.f27401c.get(Long.valueOf(j10));
                                if (o01Var != null && !o01Var.e) {
                                    p01Var = new p01(Math.max(o01Var.f26807c, file.length()), o01Var.f26808f, o01Var.f26809g, o01Var.h, o01Var.f26810i);
                                }
                                p01Var = new p01(file.length(), null, null, null, null);
                            }
                            p01Var2 = p01Var;
                        }
                        VideoEditedInfo o9 = a60.o(file, j3, p01Var2);
                        o9.muted = !z10;
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, true, 0, 0, 0L);
                        photoEntry.ttl = z50Var.f30739c;
                        photoEntry.effectId = z50Var.d;
                        a60Var.d.q(photoEntry, o9, z50Var.f30737a, z50Var.f30738b, 0, false, z50Var.e);
                        q01 q01Var2 = a60Var.M;
                        if (q01Var2 != null) {
                            q01Var2.b(false);
                        }
                        a60Var.M = null;
                        MediaController.getInstance().requestRecordAudioFocus(false);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public z(h0 h0Var, e0 e0Var, File file, long j3, boolean z10) {
        this.f13829b = h0Var;
        this.f13830c = e0Var;
        this.e = file;
        this.d = j3;
        this.f13831f = z10;
    }
}
