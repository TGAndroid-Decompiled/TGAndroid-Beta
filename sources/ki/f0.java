package ki;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.d60;
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.p01;
import org.telegram.ui.Components.q01;
import org.telegram.ui.Components.r01;
public final class f0 implements Runnable {
    public final int f13695a = 1;
    public final s0 f13696b;
    public final o0 f13697c;
    public final long d;
    public final File e;
    public final boolean f13698f;

    public f0(s0 s0Var, o0 o0Var, long j3, File file, boolean z10) {
        this.f13696b = s0Var;
        this.f13697c = o0Var;
        this.d = j3;
        this.e = file;
        this.f13698f = z10;
    }

    private final void a() {
        s0 s0Var = this.f13696b;
        o0 o0Var = this.f13697c;
        File file = this.e;
        long j3 = this.d;
        boolean z10 = this.f13698f;
        synchronized (s0Var.f13862g) {
            if (!s0Var.D && !o0Var.d && !o0Var.e) {
                o0Var.e = true;
                ((r01) s0Var.e).b(o0Var.f13815a, file.length(), file);
                s0Var.f13863i.post(new f0(s0Var, o0Var, j3, file, z10));
            }
        }
    }

    @Override
    public final void run() {
        q01 q01Var;
        q01 q01Var2;
        switch (this.f13695a) {
            case 0:
                a();
                return;
            default:
                s0 s0Var = this.f13696b;
                o0 o0Var = this.f13697c;
                long j3 = this.d;
                File file = this.e;
                boolean z10 = this.f13698f;
                int i10 = s0Var.W;
                if (i10 != 10 && i10 != 9) {
                    s0Var.v(8);
                    s0Var.f13867m.b("output completed: generation=" + o0Var.f13815a + ", durationMs=" + j3 + ", size=" + file.length() + ", hasAudio=" + z10);
                    s0Var.m("completed");
                    l.d dVar = s0Var.d;
                    long j10 = o0Var.f13815a;
                    e60 e60Var = (e60) dVar.f13940a;
                    d60 d60Var = e60Var.V;
                    if (d60Var != null) {
                        e60Var.V = null;
                        e60Var.f23867i0 = true;
                        r01 r01Var = e60Var.T;
                        if (r01Var == null) {
                            q01Var2 = null;
                        } else {
                            synchronized (r01Var) {
                                p01 p01Var = (p01) r01Var.f27800c.get(Long.valueOf(j10));
                                if (p01Var != null && !p01Var.e) {
                                    q01Var = new q01(Math.max(p01Var.f27210c, file.length()), p01Var.f27211f, p01Var.f27212g, p01Var.h, p01Var.f27213i);
                                }
                                q01Var = new q01(file.length(), null, null, null, null);
                            }
                            q01Var2 = q01Var;
                        }
                        VideoEditedInfo p5 = e60Var.p(file, j3, q01Var2);
                        p5.muted = !z10;
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, true, 0, 0, 0L);
                        photoEntry.ttl = d60Var.f23560c;
                        photoEntry.effectId = d60Var.d;
                        e60Var.f23863f.q(photoEntry, p5, d60Var.f23558a, d60Var.f23559b, 0, false, d60Var.e);
                        r01 r01Var2 = e60Var.T;
                        if (r01Var2 != null) {
                            r01Var2.d(false);
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
        this.f13696b = s0Var;
        this.f13697c = o0Var;
        this.e = file;
        this.d = j3;
        this.f13698f = z10;
    }
}
