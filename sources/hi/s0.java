package hi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEncodingService;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLRPC;
public final class s0 implements fs {
    public final int f15361a;
    public final File f15362b;
    public fj f15363c;
    public final q0 d;
    public final r0 f15364e;
    public final p0 f15365f;

    public s0(int i7, d7 d7Var, File file, q0 q0Var, r0 r0Var, p0 p0Var) {
        this.f15361a = i7;
        this.f15362b = file;
        this.d = q0Var;
        this.f15364e = r0Var;
        this.f15365f = p0Var;
        if (this.f15363c != null) {
            return;
        }
        ks.f(i7).b(this, ks.f25082a2);
        ks.f(i7).b(this, ks.f25089b2);
        ks.f(i7).b(this, ks.f25095c2);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f28424id = 1;
        tL_message.attachPath = file.getAbsolutePath();
        this.f15363c = new fj(i7, tL_message, null, false, false);
        d7Var.s(new ai.g0(this, 23));
    }

    public final void a(boolean z10) {
        if (this.f15363c == null) {
            return;
        }
        int i7 = this.f15361a;
        ks.f(i7).n(this, ks.f25082a2);
        ks.f(i7).n(this, ks.f25089b2);
        ks.f(i7).n(this, ks.f25095c2);
        if (z10) {
            MediaController.B().i(this.f15363c);
        }
        this.f15363c = null;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.f25082a2) {
            fj fjVar = (fj) objArr[0];
        } else if (i7 == ks.f25089b2) {
            if (((fj) objArr[0]) == this.f15363c) {
                String str = (String) objArr[1];
                ((Long) objArr[2]).getClass();
                long longValue = ((Long) objArr[3]).longValue();
                Float f10 = (Float) objArr[4];
                f10.getClass();
                this.f15364e.a(f10);
                if (longValue > 0) {
                    this.d.run();
                    VideoEncodingService videoEncodingService = VideoEncodingService.f22786e;
                    if (videoEncodingService != null) {
                        videoEncodingService.stopSelf();
                    }
                    a(false);
                }
            }
        } else if (i7 == ks.f25095c2 && ((fj) objArr[0]) == this.f15363c) {
            a(false);
            try {
                File file = this.f15362b;
                if (file != null) {
                    file.delete();
                }
            } catch (Exception unused) {
            }
            this.f15365f.run();
        }
    }
}
