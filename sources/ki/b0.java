package ki;

import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.o01;
import org.telegram.ui.Components.p01;
import org.telegram.ui.Components.y50;
import org.telegram.ui.Components.z50;
public final class b0 implements Runnable {
    public final int f13657a = 1;
    public final o0 f13658b;
    public final k0 f13659c;
    public final long d;
    public final File e;
    public final boolean f13660f;

    public b0(o0 o0Var, k0 k0Var, long j3, File file, boolean z10) {
        this.f13658b = o0Var;
        this.f13659c = k0Var;
        this.d = j3;
        this.e = file;
        this.f13660f = z10;
    }

    private final void a() {
        o0 o0Var = this.f13658b;
        k0 k0Var = this.f13659c;
        File file = this.e;
        long j3 = this.d;
        boolean z10 = this.f13660f;
        if (k0Var.d) {
            return;
        }
        l0 l0Var = o0Var.d;
        long j10 = k0Var.f13762a;
        long length = file.length();
        p01 p01Var = (p01) l0Var;
        synchronized (p01Var) {
            n01 n01Var = (n01) p01Var.f27108c.get(Long.valueOf(j10));
            if (!p01Var.d && n01Var != null && !n01Var.e) {
                p01Var.c(n01Var);
                n01Var.f26528b = Math.max(n01Var.f26528b, length);
                n01Var.f26529c = length;
                FileLoader.getInstance(p01Var.f27106a).checkUploadNewDataAvailable(file.getAbsolutePath(), p01Var.f27107b, n01Var.f26528b, length);
            }
        }
        o0Var.h.post(new b0(o0Var, k0Var, j3, file, z10));
    }

    @Override
    public final void run() {
        o01 o01Var;
        o01 o01Var2;
        switch (this.f13657a) {
            case 0:
                a();
                return;
            default:
                o0 o0Var = this.f13658b;
                k0 k0Var = this.f13659c;
                long j3 = this.d;
                File file = this.e;
                boolean z10 = this.f13660f;
                int i10 = o0Var.U;
                if (i10 != 10 && i10 != 9) {
                    o0Var.u(8);
                    o0Var.f13808l.b("output completed: generation=" + k0Var.f13762a + ", durationMs=" + j3 + ", size=" + file.length() + ", hasAudio=" + z10);
                    o0Var.l("completed");
                    l.d dVar = o0Var.f13802c;
                    long j10 = k0Var.f13762a;
                    z50 z50Var = (z50) dVar.f13898a;
                    y50 y50Var = z50Var.Q;
                    if (y50Var != null) {
                        z50Var.Q = null;
                        z50Var.f30717d0 = true;
                        p01 p01Var = z50Var.O;
                        if (p01Var == null) {
                            o01Var2 = null;
                        } else {
                            synchronized (p01Var) {
                                n01 n01Var = (n01) p01Var.f27108c.get(Long.valueOf(j10));
                                if (n01Var != null && !n01Var.e) {
                                    o01Var = new o01(Math.max(n01Var.f26529c, file.length()), n01Var.f26530f, n01Var.f26531g, n01Var.h, n01Var.f26532i);
                                }
                                o01Var = new o01(file.length(), null, null, null, null);
                            }
                            o01Var2 = o01Var;
                        }
                        VideoEditedInfo n10 = z50Var.n(file, j3, o01Var2);
                        n10.muted = !z10;
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, true, 0, 0, 0L);
                        photoEntry.ttl = y50Var.f30459c;
                        photoEntry.effectId = y50Var.d;
                        z50Var.d.q(photoEntry, n10, y50Var.f30457a, y50Var.f30458b, 0, false, y50Var.e);
                        p01 p01Var2 = z50Var.O;
                        if (p01Var2 != null) {
                            p01Var2.b(false);
                        }
                        z50Var.O = null;
                        MediaController.getInstance().requestRecordAudioFocus(false);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public b0(o0 o0Var, k0 k0Var, File file, long j3, boolean z10) {
        this.f13658b = o0Var;
        this.f13659c = k0Var;
        this.e = file;
        this.d = j3;
        this.f13660f = z10;
    }
}
