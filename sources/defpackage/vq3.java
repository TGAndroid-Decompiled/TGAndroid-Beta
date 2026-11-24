package defpackage;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEncodingService;
import org.telegram.tgnet.TLRPC;
public final class vq3 implements jm7 {
    public final int a;
    public final File b;
    public k47 c;
    public final tq3 d;
    public final uq3 e;
    public final sq3 f;

    public vq3(int i, g6b g6bVar, File file, tq3 tq3Var, uq3 uq3Var, sq3 sq3Var) {
        this.a = i;
        this.b = file;
        this.d = tq3Var;
        this.e = uq3Var;
        this.f = sq3Var;
        if (this.c != null) {
            return;
        }
        nm7.f(i).a(this, nm7.a2);
        nm7.f(i).a(this, nm7.b2);
        nm7.f(i).a(this, nm7.c2);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.id = 1;
        tL_message.attachPath = file.getAbsolutePath();
        this.c = new k47(i, tL_message, null, false, false);
        g6bVar.s(new sk3(this, (byte) 4));
    }

    public final void a(boolean z) {
        if (this.c == null) {
            return;
        }
        int i = this.a;
        nm7.f(i).n(this, nm7.a2);
        nm7.f(i).n(this, nm7.b2);
        nm7.f(i).n(this, nm7.c2);
        if (z) {
            MediaController.w().d(this.c);
        }
        this.c = null;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.a2) {
            k47 k47Var = (k47) objArr[0];
        } else if (i == nm7.b2) {
            if (((k47) objArr[0]) == this.c) {
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
        } else if (i == nm7.c2 && ((k47) objArr[0]) == this.c) {
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
