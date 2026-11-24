package defpackage;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEncodingService;
import org.telegram.tgnet.TLRPC;
public final class lp3 implements gk7 {
    public final int a;
    public final File b;
    public k27 c;
    public final jp3 d;
    public final kp3 e;
    public final ip3 f;

    public lp3(int i, f4b f4bVar, File file, jp3 jp3Var, kp3 kp3Var, ip3 ip3Var) {
        this.a = i;
        this.b = file;
        this.d = jp3Var;
        this.e = kp3Var;
        this.f = ip3Var;
        if (this.c != null) {
            return;
        }
        kk7.f(i).a(this, kk7.Z1);
        kk7.f(i).a(this, kk7.a2);
        kk7.f(i).a(this, kk7.b2);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.id = 1;
        tL_message.attachPath = file.getAbsolutePath();
        this.c = new k27(i, tL_message, null, false, false);
        f4bVar.s(new hj3(this, (byte) 4));
    }

    public final void a(boolean z) {
        if (this.c == null) {
            return;
        }
        int i = this.a;
        kk7.f(i).n(this, kk7.Z1);
        kk7.f(i).n(this, kk7.a2);
        kk7.f(i).n(this, kk7.b2);
        if (z) {
            MediaController.w().d(this.c);
        }
        this.c = null;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.Z1) {
            k27 k27Var = (k27) objArr[0];
        } else if (i == kk7.a2) {
            if (((k27) objArr[0]) == this.c) {
                String str = (String) objArr[1];
                ((Long) objArr[2]).getClass();
                long longValue = ((Long) objArr[3]).longValue();
                Float f = (Float) objArr[4];
                f.getClass();
                this.e.a(f);
                if (longValue > 0) {
                    this.d.run();
                    VideoEncodingService videoEncodingService = VideoEncodingService.e;
                    if (videoEncodingService != null) {
                        videoEncodingService.stopSelf();
                    }
                    a(false);
                }
            }
        } else if (i == kk7.b2 && ((k27) objArr[0]) == this.c) {
            a(false);
            try {
                File file = this.b;
                if (file != null) {
                    file.delete();
                }
            } catch (Exception unused) {
            }
            this.f.run();
        }
    }
}
