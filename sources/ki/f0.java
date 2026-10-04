package ki;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.d60;
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.x01;
import org.telegram.ui.Components.y01;
import org.telegram.ui.Components.z01;
public final class f0 implements Runnable {
    public final int f14872a = 1;
    public final s0 f14873b;
    public final o0 f14874c;
    public final long d;
    public final File f14875e;
    public final boolean f14876f;

    public f0(s0 s0Var, o0 o0Var, long j3, File file, boolean z10) {
        this.f14873b = s0Var;
        this.f14874c = o0Var;
        this.d = j3;
        this.f14875e = file;
        this.f14876f = z10;
    }

    private final void a() {
        s0 s0Var = this.f14873b;
        o0 o0Var = this.f14874c;
        File file = this.f14875e;
        long j3 = this.d;
        boolean z10 = this.f14876f;
        synchronized (s0Var.f15049g) {
            if (!s0Var.D && !o0Var.d && !o0Var.f15001e) {
                o0Var.f15001e = true;
                ((z01) s0Var.f15047e).b(o0Var.f14998a, file.length(), file);
                s0Var.f15050i.post(new f0(s0Var, o0Var, j3, file, z10));
            }
        }
    }

    @Override
    public final void run() {
        y01 y01Var;
        y01 y01Var2;
        switch (this.f14872a) {
            case 0:
                a();
                return;
            default:
                s0 s0Var = this.f14873b;
                o0 o0Var = this.f14874c;
                long j3 = this.d;
                File file = this.f14875e;
                boolean z10 = this.f14876f;
                int i10 = s0Var.W;
                if (i10 != 10 && i10 != 9) {
                    s0Var.v(8);
                    s0Var.f15054m.b("output completed: generation=" + o0Var.f14998a + ", durationMs=" + j3 + ", size=" + file.length() + ", hasAudio=" + z10);
                    s0Var.m("completed");
                    l2.g gVar = s0Var.d;
                    long j10 = o0Var.f14998a;
                    e60 e60Var = (e60) gVar.f15268b;
                    d60 d60Var = e60Var.V;
                    if (d60Var != null) {
                        e60Var.V = null;
                        e60Var.f25955i0 = true;
                        z01 z01Var = e60Var.T;
                        if (z01Var == null) {
                            y01Var2 = null;
                        } else {
                            synchronized (z01Var) {
                                x01 x01Var = (x01) z01Var.f33334c.get(Long.valueOf(j10));
                                if (x01Var != null && !x01Var.f32690e) {
                                    y01Var = new y01(Math.max(x01Var.f32689c, file.length()), x01Var.f32691f, x01Var.f32692g, x01Var.h, x01Var.f32693i);
                                }
                                y01Var = new y01(file.length(), null, null, null, null);
                            }
                            y01Var2 = y01Var;
                        }
                        VideoEditedInfo p5 = e60Var.p(file, j3, y01Var2);
                        p5.muted = !z10;
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, true, 0, 0, 0L);
                        photoEntry.ttl = d60Var.f25610c;
                        photoEntry.effectId = d60Var.d;
                        e60Var.f25951f.q(photoEntry, p5, d60Var.f25608a, d60Var.f25609b, 0, false, d60Var.f25611e);
                        z01 z01Var2 = e60Var.T;
                        if (z01Var2 != null) {
                            z01Var2.d(false);
                        }
                        e60Var.T = null;
                        MediaController.getInstance().requestRecordAudioFocus(false);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public f0(s0 s0Var, o0 o0Var, File file, long j3, boolean z10) {
        this.f14873b = s0Var;
        this.f14874c = o0Var;
        this.f14875e = file;
        this.d = j3;
        this.f14876f = z10;
    }
}
