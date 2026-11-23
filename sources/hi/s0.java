package hi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEncodingService;
import org.telegram.messenger.gj;
import org.telegram.messenger.gs;
import org.telegram.messenger.ls;
import org.telegram.tgnet.TLRPC;
public final class s0 implements gs {
    public final int f15362a;
    public final File f15363b;
    public gj f15364c;
    public final q0 d;
    public final r0 f15365e;
    public final p0 f15366f;

    public s0(int i7, c7 c7Var, File file, q0 q0Var, r0 r0Var, p0 p0Var) {
        this.f15362a = i7;
        this.f15363b = file;
        this.d = q0Var;
        this.f15365e = r0Var;
        this.f15366f = p0Var;
        if (this.f15364c != null) {
            return;
        }
        ls.f(i7).b(this, ls.f25276a2);
        ls.f(i7).b(this, ls.f25283b2);
        ls.f(i7).b(this, ls.f25289c2);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f28455id = 1;
        tL_message.attachPath = file.getAbsolutePath();
        this.f15364c = new gj(i7, tL_message, null, false, false);
        c7Var.s(new ai.h0(this, 23));
    }

    public final void a(boolean z10) {
        if (this.f15364c == null) {
            return;
        }
        int i7 = this.f15362a;
        ls.f(i7).n(this, ls.f25276a2);
        ls.f(i7).n(this, ls.f25283b2);
        ls.f(i7).n(this, ls.f25289c2);
        if (z10) {
            MediaController.B().i(this.f15364c);
        }
        this.f15364c = null;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.f25276a2) {
            gj gjVar = (gj) objArr[0];
        } else if (i7 == ls.f25283b2) {
            if (((gj) objArr[0]) == this.f15364c) {
                String str = (String) objArr[1];
                ((Long) objArr[2]).getClass();
                long longValue = ((Long) objArr[3]).longValue();
                Float f10 = (Float) objArr[4];
                f10.getClass();
                this.f15365e.a(f10);
                if (longValue > 0) {
                    this.d.run();
                    VideoEncodingService videoEncodingService = VideoEncodingService.f22817e;
                    if (videoEncodingService != null) {
                        videoEncodingService.stopSelf();
                    }
                    a(false);
                }
            }
        } else if (i7 == ls.f25289c2 && ((gj) objArr[0]) == this.f15364c) {
            a(false);
            try {
                File file = this.f15363b;
                if (file != null) {
                    file.delete();
                }
            } catch (Exception unused) {
            }
            this.f15366f.run();
        }
    }
}
