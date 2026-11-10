package fi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEncodingService;
import org.telegram.messenger.ij;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
public final class q0 implements ls {
    public final int f12641a;
    public final File f12642b;
    public ij f12643c;
    public final o0 d;
    public final p0 f12644e;
    public final n0 f12645f;

    public q0(int i7, e7 e7Var, File file, o0 o0Var, p0 p0Var, n0 n0Var) {
        this.f12641a = i7;
        this.f12642b = file;
        this.d = o0Var;
        this.f12644e = p0Var;
        this.f12645f = n0Var;
        if (this.f12643c != null) {
            return;
        }
        qs.f(i7).b(this, qs.f24973a2);
        qs.f(i7).b(this, qs.f24979b2);
        qs.f(i7).b(this, qs.f24985c2);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f26981id = 1;
        tL_message.attachPath = file.getAbsolutePath();
        this.f12643c = new ij(i7, tL_message, null, false, false);
        e7Var.s(new ai.i(this, 18));
    }

    public final void a(boolean z9) {
        if (this.f12643c == null) {
            return;
        }
        int i7 = this.f12641a;
        qs.f(i7).n(this, qs.f24973a2);
        qs.f(i7).n(this, qs.f24979b2);
        qs.f(i7).n(this, qs.f24985c2);
        if (z9) {
            MediaController.B().i(this.f12643c);
        }
        this.f12643c = null;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.f24973a2) {
            ij ijVar = (ij) objArr[0];
        } else if (i7 == qs.f24979b2) {
            if (((ij) objArr[0]) == this.f12643c) {
                String str = (String) objArr[1];
                ((Long) objArr[2]).getClass();
                long longValue = ((Long) objArr[3]).longValue();
                Float f10 = (Float) objArr[4];
                f10.getClass();
                this.f12644e.a(f10);
                if (longValue > 0) {
                    this.d.run();
                    VideoEncodingService videoEncodingService = VideoEncodingService.f21348e;
                    if (videoEncodingService != null) {
                        videoEncodingService.stopSelf();
                    }
                    a(false);
                }
            }
        } else if (i7 == qs.f24985c2 && ((ij) objArr[0]) == this.f12643c) {
            a(false);
            try {
                File file = this.f12642b;
                if (file != null) {
                    file.delete();
                }
            } catch (Exception unused) {
            }
            this.f12645f.run();
        }
    }
}
