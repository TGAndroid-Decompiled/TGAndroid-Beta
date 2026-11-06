package fi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEncodingService;
import org.telegram.messenger.ij;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
public final class q0 implements ls {
    public final int f12637a;
    public final File f12638b;
    public ij f12639c;
    public final o0 d;
    public final p0 f12640e;
    public final n0 f12641f;

    public q0(int i7, e7 e7Var, File file, o0 o0Var, p0 p0Var, n0 n0Var) {
        this.f12637a = i7;
        this.f12638b = file;
        this.d = o0Var;
        this.f12640e = p0Var;
        this.f12641f = n0Var;
        if (this.f12639c != null) {
            return;
        }
        qs.f(i7).b(this, qs.f24952a2);
        qs.f(i7).b(this, qs.f24958b2);
        qs.f(i7).b(this, qs.f24964c2);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f26973id = 1;
        tL_message.attachPath = file.getAbsolutePath();
        this.f12639c = new ij(i7, tL_message, null, false, false);
        e7Var.s(new ai.i(this, 18));
    }

    public final void a(boolean z9) {
        if (this.f12639c == null) {
            return;
        }
        int i7 = this.f12637a;
        qs.f(i7).n(this, qs.f24952a2);
        qs.f(i7).n(this, qs.f24958b2);
        qs.f(i7).n(this, qs.f24964c2);
        if (z9) {
            MediaController.B().i(this.f12639c);
        }
        this.f12639c = null;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.f24952a2) {
            ij ijVar = (ij) objArr[0];
        } else if (i7 == qs.f24958b2) {
            if (((ij) objArr[0]) == this.f12639c) {
                String str = (String) objArr[1];
                ((Long) objArr[2]).getClass();
                long longValue = ((Long) objArr[3]).longValue();
                Float f10 = (Float) objArr[4];
                f10.getClass();
                this.f12640e.a(f10);
                if (longValue > 0) {
                    this.d.run();
                    VideoEncodingService videoEncodingService = VideoEncodingService.f21340e;
                    if (videoEncodingService != null) {
                        videoEncodingService.stopSelf();
                    }
                    a(false);
                }
            }
        } else if (i7 == qs.f24964c2 && ((ij) objArr[0]) == this.f12639c) {
            a(false);
            try {
                File file = this.f12638b;
                if (file != null) {
                    file.delete();
                }
            } catch (Exception unused) {
            }
            this.f12641f.run();
        }
    }
}
