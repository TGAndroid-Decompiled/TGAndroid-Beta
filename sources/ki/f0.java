package ki;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.a11;
import org.telegram.ui.Components.d60;
import org.telegram.ui.Components.e60;
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
                ((a11) s0Var.f15047e).b(o0Var.f14998a, file.length(), file);
                s0Var.f15050i.post(new f0(s0Var, o0Var, j3, file, z10));
            }
        }
    }

    @Override
    public final void run() {
        z01 z01Var;
        z01 z01Var2;
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
                        e60Var.f26003i0 = true;
                        a11 a11Var = e60Var.T;
                        if (a11Var == null) {
                            z01Var2 = null;
                        } else {
                            synchronized (a11Var) {
                                y01 y01Var = (y01) a11Var.f24427c.get(Long.valueOf(j10));
                                if (y01Var != null && !y01Var.f33145e) {
                                    z01Var = new z01(Math.max(y01Var.f33144c, file.length()), y01Var.f33146f, y01Var.f33147g, y01Var.h, y01Var.f33148i);
                                }
                                z01Var = new z01(file.length(), null, null, null, null);
                            }
                            z01Var2 = z01Var;
                        }
                        VideoEditedInfo p5 = e60Var.p(file, j3, z01Var2);
                        p5.muted = !z10;
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, true, 0, 0, 0L);
                        photoEntry.ttl = d60Var.f25681c;
                        photoEntry.effectId = d60Var.d;
                        e60Var.f25999f.q(photoEntry, p5, d60Var.f25679a, d60Var.f25680b, 0, false, d60Var.f25682e);
                        a11 a11Var2 = e60Var.T;
                        if (a11Var2 != null) {
                            a11Var2.d(false);
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
