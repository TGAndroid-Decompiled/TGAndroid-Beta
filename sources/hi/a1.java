package hi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEncodingService;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLRPC;
public final class a1 implements fs {
    public final int f14176a;
    public final File f14177b;
    public fj f14178c;
    public final y0 d;
    public final z0 f14179e;
    public final x0 f14180f;

    public a1(int i7, x7 x7Var, File file, y0 y0Var, z0 z0Var, x0 x0Var) {
        this.f14176a = i7;
        this.f14177b = file;
        this.d = y0Var;
        this.f14179e = z0Var;
        this.f14180f = x0Var;
        if (this.f14178c != null) {
            return;
        }
        ks.f(i7).b(this, ks.f25181a2);
        ks.f(i7).b(this, ks.f25188b2);
        ks.f(i7).b(this, ks.f25194c2);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f28513id = 1;
        tL_message.attachPath = file.getAbsolutePath();
        this.f14178c = new fj(i7, tL_message, null, false, false);
        x7Var.s(new ai.d0(this, 23));
    }

    public final void a(boolean z10) {
        if (this.f14178c == null) {
            return;
        }
        int i7 = this.f14176a;
        ks.f(i7).n(this, ks.f25181a2);
        ks.f(i7).n(this, ks.f25188b2);
        ks.f(i7).n(this, ks.f25194c2);
        if (z10) {
            MediaController.B().i(this.f14178c);
        }
        this.f14178c = null;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.f25181a2) {
            fj fjVar = (fj) objArr[0];
        } else if (i7 == ks.f25188b2) {
            if (((fj) objArr[0]) == this.f14178c) {
                String str = (String) objArr[1];
                ((Long) objArr[2]).getClass();
                long longValue = ((Long) objArr[3]).longValue();
                Float f10 = (Float) objArr[4];
                f10.getClass();
                this.f14179e.a(f10);
                if (longValue > 0) {
                    this.d.run();
                    VideoEncodingService videoEncodingService = VideoEncodingService.f22884e;
                    if (videoEncodingService != null) {
                        videoEncodingService.stopSelf();
                    }
                    a(false);
                }
            }
        } else if (i7 == ks.f25194c2 && ((fj) objArr[0]) == this.f14178c) {
            a(false);
            try {
                File file = this.f14177b;
                if (file != null) {
                    file.delete();
                }
            } catch (Exception unused) {
            }
            this.f14180f.run();
        }
    }
}
