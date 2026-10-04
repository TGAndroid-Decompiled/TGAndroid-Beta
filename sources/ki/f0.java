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
    public final int f14871a = 1;
    public final s0 f14872b;
    public final o0 f14873c;
    public final long d;
    public final File f14874e;
    public final boolean f14875f;

    public f0(s0 s0Var, o0 o0Var, long j3, File file, boolean z10) {
        this.f14872b = s0Var;
        this.f14873c = o0Var;
        this.d = j3;
        this.f14874e = file;
        this.f14875f = z10;
    }

    private final void a() {
        s0 s0Var = this.f14872b;
        o0 o0Var = this.f14873c;
        File file = this.f14874e;
        long j3 = this.d;
        boolean z10 = this.f14875f;
        synchronized (s0Var.f15048g) {
            if (!s0Var.D && !o0Var.d && !o0Var.f15000e) {
                o0Var.f15000e = true;
                ((z01) s0Var.f15046e).b(o0Var.f14997a, file.length(), file);
                s0Var.f15049i.post(new f0(s0Var, o0Var, j3, file, z10));
            }
        }
    }

    @Override
    public final void run() {
        y01 y01Var;
        y01 y01Var2;
        switch (this.f14871a) {
            case 0:
                a();
                return;
            default:
                s0 s0Var = this.f14872b;
                o0 o0Var = this.f14873c;
                long j3 = this.d;
                File file = this.f14874e;
                boolean z10 = this.f14875f;
                int i10 = s0Var.W;
                if (i10 != 10 && i10 != 9) {
                    s0Var.v(8);
                    s0Var.f15053m.b("output completed: generation=" + o0Var.f14997a + ", durationMs=" + j3 + ", size=" + file.length() + ", hasAudio=" + z10);
                    s0Var.m("completed");
                    l2.g gVar = s0Var.d;
                    long j10 = o0Var.f14997a;
                    e60 e60Var = (e60) gVar.f15266b;
                    d60 d60Var = e60Var.V;
                    if (d60Var != null) {
                        e60Var.V = null;
                        e60Var.f25949i0 = true;
                        z01 z01Var = e60Var.T;
                        if (z01Var == null) {
                            y01Var2 = null;
                        } else {
                            synchronized (z01Var) {
                                x01 x01Var = (x01) z01Var.f33327c.get(Long.valueOf(j10));
                                if (x01Var != null && !x01Var.f32683e) {
                                    y01Var = new y01(Math.max(x01Var.f32682c, file.length()), x01Var.f32684f, x01Var.f32685g, x01Var.h, x01Var.f32686i);
                                }
                                y01Var = new y01(file.length(), null, null, null, null);
                            }
                            y01Var2 = y01Var;
                        }
                        VideoEditedInfo p5 = e60Var.p(file, j3, y01Var2);
                        p5.muted = !z10;
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, true, 0, 0, 0L);
                        photoEntry.ttl = d60Var.f25604c;
                        photoEntry.effectId = d60Var.d;
                        e60Var.f25945f.q(photoEntry, p5, d60Var.f25602a, d60Var.f25603b, 0, false, d60Var.f25605e);
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
        this.f14872b = s0Var;
        this.f14873c = o0Var;
        this.f14874e = file;
        this.d = j3;
        this.f14875f = z10;
    }
}
