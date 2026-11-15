package hi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEncodingService;
import org.telegram.messenger.gj;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLRPC;
public final class r0 implements is {
    public final int f14959a;
    public final File f14960b;
    public gj f14961c;
    public final p0 d;
    public final q0 f14962e;
    public final o0 f14963f;

    public r0(int i7, d7 d7Var, File file, p0 p0Var, q0 q0Var, o0 o0Var) {
        this.f14959a = i7;
        this.f14960b = file;
        this.d = p0Var;
        this.f14962e = q0Var;
        this.f14963f = o0Var;
        if (this.f14961c != null) {
            return;
        }
        ns.f(i7).b(this, ns.f25465a2);
        ns.f(i7).b(this, ns.f25471b2);
        ns.f(i7).b(this, ns.f25477c2);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f28072id = 1;
        tL_message.attachPath = file.getAbsolutePath();
        this.f14961c = new gj(i7, tL_message, null, false, false);
        d7Var.s(new ai.f0(this, 22));
    }

    public final void a(boolean z10) {
        if (this.f14961c == null) {
            return;
        }
        int i7 = this.f14959a;
        ns.f(i7).n(this, ns.f25465a2);
        ns.f(i7).n(this, ns.f25471b2);
        ns.f(i7).n(this, ns.f25477c2);
        if (z10) {
            MediaController.B().i(this.f14961c);
        }
        this.f14961c = null;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.f25465a2) {
            gj gjVar = (gj) objArr[0];
        } else if (i7 == ns.f25471b2) {
            if (((gj) objArr[0]) == this.f14961c) {
                String str = (String) objArr[1];
                ((Long) objArr[2]).getClass();
                long longValue = ((Long) objArr[3]).longValue();
                Float f10 = (Float) objArr[4];
                f10.getClass();
                this.f14962e.a(f10);
                if (longValue > 0) {
                    this.d.run();
                    VideoEncodingService videoEncodingService = VideoEncodingService.f22423e;
                    if (videoEncodingService != null) {
                        videoEncodingService.stopSelf();
                    }
                    a(false);
                }
            }
        } else if (i7 == ns.f25477c2 && ((gj) objArr[0]) == this.f14961c) {
            a(false);
            try {
                File file = this.f14960b;
                if (file != null) {
                    file.delete();
                }
            } catch (Exception unused) {
            }
            this.f14963f.run();
        }
    }
}
