package hi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEncodingService;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLRPC;
public final class s0 implements fs {
    public final int f15364a;
    public final File f15365b;
    public fj f15366c;
    public final q0 d;
    public final r0 f15367e;
    public final p0 f15368f;

    public s0(int i7, d7 d7Var, File file, q0 q0Var, r0 r0Var, p0 p0Var) {
        this.f15364a = i7;
        this.f15365b = file;
        this.d = q0Var;
        this.f15367e = r0Var;
        this.f15368f = p0Var;
        if (this.f15366c != null) {
            return;
        }
        ks.f(i7).b(this, ks.f25085a2);
        ks.f(i7).b(this, ks.f25091b2);
        ks.f(i7).b(this, ks.f25097c2);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f28426id = 1;
        tL_message.attachPath = file.getAbsolutePath();
        this.f15366c = new fj(i7, tL_message, null, false, false);
        d7Var.s(new ai.g0(this, 23));
    }

    public final void a(boolean z10) {
        if (this.f15366c == null) {
            return;
        }
        int i7 = this.f15364a;
        ks.f(i7).n(this, ks.f25085a2);
        ks.f(i7).n(this, ks.f25091b2);
        ks.f(i7).n(this, ks.f25097c2);
        if (z10) {
            MediaController.B().i(this.f15366c);
        }
        this.f15366c = null;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.f25085a2) {
            fj fjVar = (fj) objArr[0];
        } else if (i7 == ks.f25091b2) {
            if (((fj) objArr[0]) == this.f15366c) {
                String str = (String) objArr[1];
                ((Long) objArr[2]).getClass();
                long longValue = ((Long) objArr[3]).longValue();
                Float f10 = (Float) objArr[4];
                f10.getClass();
                this.f15367e.a(f10);
                if (longValue > 0) {
                    this.d.run();
                    VideoEncodingService videoEncodingService = VideoEncodingService.f22789e;
                    if (videoEncodingService != null) {
                        videoEncodingService.stopSelf();
                    }
                    a(false);
                }
            }
        } else if (i7 == ks.f25097c2 && ((fj) objArr[0]) == this.f15366c) {
            a(false);
            try {
                File file = this.f15365b;
                if (file != null) {
                    file.delete();
                }
            } catch (Exception unused) {
            }
            this.f15368f.run();
        }
    }
}
