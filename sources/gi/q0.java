package gi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEncodingService;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
public final class q0 implements cs {
    public final int f13411a;
    public final File f13412b;
    public zi f13413c;
    public final o0 d;
    public final p0 f13414e;
    public final n0 f13415f;

    public q0(int i3, f7 f7Var, File file, o0 o0Var, p0 p0Var, n0 n0Var) {
        this.f13411a = i3;
        this.f13412b = file;
        this.d = o0Var;
        this.f13414e = p0Var;
        this.f13415f = n0Var;
        if (this.f13413c != null) {
            return;
        }
        hs.f(i3).b(this, hs.f23198a2);
        hs.f(i3).b(this, hs.f23204b2);
        hs.f(i3).b(this, hs.c2);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f27022id = 1;
        tL_message.attachPath = file.getAbsolutePath();
        this.f13413c = new zi(i3, tL_message, null, false, false);
        f7Var.s(new ai.v2(this, 21));
    }

    public final void a(boolean z10) {
        if (this.f13413c == null) {
            return;
        }
        int i3 = this.f13411a;
        hs.f(i3).n(this, hs.f23198a2);
        hs.f(i3).n(this, hs.f23204b2);
        hs.f(i3).n(this, hs.c2);
        if (z10) {
            MediaController.B().i(this.f13413c);
        }
        this.f13413c = null;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.f23198a2) {
            zi ziVar = (zi) objArr[0];
        } else if (i3 == hs.f23204b2) {
            if (((zi) objArr[0]) == this.f13413c) {
                String str = (String) objArr[1];
                ((Long) objArr[2]).getClass();
                long longValue = ((Long) objArr[3]).longValue();
                Float f10 = (Float) objArr[4];
                f10.getClass();
                this.f13414e.a(f10);
                if (longValue > 0) {
                    this.d.run();
                    VideoEncodingService videoEncodingService = VideoEncodingService.f21394e;
                    if (videoEncodingService != null) {
                        videoEncodingService.stopSelf();
                    }
                    a(false);
                }
            }
        } else if (i3 == hs.c2 && ((zi) objArr[0]) == this.f13413c) {
            a(false);
            try {
                File file = this.f13412b;
                if (file != null) {
                    file.delete();
                }
            } catch (Exception unused) {
            }
            this.f13415f.run();
        }
    }
}
