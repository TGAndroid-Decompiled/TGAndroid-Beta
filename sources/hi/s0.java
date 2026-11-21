package hi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEncodingService;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLRPC;
public final class s0 implements fs {
    public final int f15359a;
    public final File f15360b;
    public fj f15361c;
    public final q0 d;
    public final r0 f15362e;
    public final p0 f15363f;

    public s0(int i7, c7 c7Var, File file, q0 q0Var, r0 r0Var, p0 p0Var) {
        this.f15359a = i7;
        this.f15360b = file;
        this.d = q0Var;
        this.f15362e = r0Var;
        this.f15363f = p0Var;
        if (this.f15361c != null) {
            return;
        }
        ks.f(i7).b(this, ks.f25110a2);
        ks.f(i7).b(this, ks.f25117b2);
        ks.f(i7).b(this, ks.f25123c2);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f28452id = 1;
        tL_message.attachPath = file.getAbsolutePath();
        this.f15361c = new fj(i7, tL_message, null, false, false);
        c7Var.s(new ai.h0(this, 23));
    }

    public final void a(boolean z10) {
        if (this.f15361c == null) {
            return;
        }
        int i7 = this.f15359a;
        ks.f(i7).n(this, ks.f25110a2);
        ks.f(i7).n(this, ks.f25117b2);
        ks.f(i7).n(this, ks.f25123c2);
        if (z10) {
            MediaController.B().i(this.f15361c);
        }
        this.f15361c = null;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.f25110a2) {
            fj fjVar = (fj) objArr[0];
        } else if (i7 == ks.f25117b2) {
            if (((fj) objArr[0]) == this.f15361c) {
                String str = (String) objArr[1];
                ((Long) objArr[2]).getClass();
                long longValue = ((Long) objArr[3]).longValue();
                Float f10 = (Float) objArr[4];
                f10.getClass();
                this.f15362e.a(f10);
                if (longValue > 0) {
                    this.d.run();
                    VideoEncodingService videoEncodingService = VideoEncodingService.f22814e;
                    if (videoEncodingService != null) {
                        videoEncodingService.stopSelf();
                    }
                    a(false);
                }
            }
        } else if (i7 == ks.f25123c2 && ((fj) objArr[0]) == this.f15361c) {
            a(false);
            try {
                File file = this.f15360b;
                if (file != null) {
                    file.delete();
                }
            } catch (Exception unused) {
            }
            this.f15363f.run();
        }
    }
}
