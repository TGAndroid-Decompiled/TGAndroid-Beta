package hi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEncodingService;
import org.telegram.messenger.gj;
import org.telegram.messenger.gs;
import org.telegram.messenger.ls;
import org.telegram.tgnet.TLRPC;
public final class r0 implements gs {
    public final int f15284a;
    public final File f15285b;
    public gj f15286c;
    public final p0 d;
    public final q0 f15287e;
    public final o0 f15288f;

    public r0(int i7, d7 d7Var, File file, p0 p0Var, q0 q0Var, o0 o0Var) {
        this.f15284a = i7;
        this.f15285b = file;
        this.d = p0Var;
        this.f15287e = q0Var;
        this.f15288f = o0Var;
        if (this.f15286c != null) {
            return;
        }
        ls.f(i7).b(this, ls.f25240a2);
        ls.f(i7).b(this, ls.f25247b2);
        ls.f(i7).b(this, ls.f25253c2);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f28419id = 1;
        tL_message.attachPath = file.getAbsolutePath();
        this.f15286c = new gj(i7, tL_message, null, false, false);
        d7Var.s(new ai.c0(this, 23));
    }

    public final void a(boolean z10) {
        if (this.f15286c == null) {
            return;
        }
        int i7 = this.f15284a;
        ls.f(i7).n(this, ls.f25240a2);
        ls.f(i7).n(this, ls.f25247b2);
        ls.f(i7).n(this, ls.f25253c2);
        if (z10) {
            MediaController.B().i(this.f15286c);
        }
        this.f15286c = null;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.f25240a2) {
            gj gjVar = (gj) objArr[0];
        } else if (i7 == ls.f25247b2) {
            if (((gj) objArr[0]) == this.f15286c) {
                String str = (String) objArr[1];
                ((Long) objArr[2]).getClass();
                long longValue = ((Long) objArr[3]).longValue();
                Float f10 = (Float) objArr[4];
                f10.getClass();
                this.f15287e.a(f10);
                if (longValue > 0) {
                    this.d.run();
                    VideoEncodingService videoEncodingService = VideoEncodingService.f22781e;
                    if (videoEncodingService != null) {
                        videoEncodingService.stopSelf();
                    }
                    a(false);
                }
            }
        } else if (i7 == ls.f25253c2 && ((gj) objArr[0]) == this.f15286c) {
            a(false);
            try {
                File file = this.f15285b;
                if (file != null) {
                    file.delete();
                }
            } catch (Exception unused) {
            }
            this.f15288f.run();
        }
    }
}
