package li;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.o60;
import org.telegram.ui.Components.t60;
import org.telegram.ui.Components.x81;
import org.telegram.ui.sk;
import org.telegram.ui.xe;
public final class h0 implements Runnable {
    public final int f14796a;
    public final u0 f14797b;
    public final long f14798c;

    public h0(u0 u0Var, long j10, int i10) {
        this.f14796a = i10;
        this.f14797b = u0Var;
        this.f14798c = j10;
    }

    @Override
    public final void run() {
        File file;
        long j10;
        long j11;
        sk skVar;
        x81 x81Var;
        switch (this.f14796a) {
            case 0:
                u0 u0Var = this.f14797b;
                long j12 = this.f14798c;
                if (u0Var.W == 6) {
                    u0Var.E = j12;
                    u0Var.K = 0L;
                    u0Var.G = 0L;
                    u0Var.H = j12;
                    u0Var.v(2);
                    u0Var.f15014l.X(u0Var.Q, u0Var.E * 1000, u0Var.f15018p);
                    return;
                }
                return;
            default:
                u0 u0Var2 = this.f14797b;
                long j13 = this.f14798c;
                if (u0Var2.W == 4) {
                    u0Var2.K = j13;
                    long min = Math.min(u0Var2.f15017o, j13);
                    u0Var2.E = min;
                    u0Var2.G = 0L;
                    u0Var2.H = min;
                    u0Var2.f15007b.setSurfaceTextureListener(null);
                    u0Var2.f15007b.setTransform(u0Var2.h);
                    i2.h0 a2 = new i2.o(u0Var2.f15006a).a();
                    u0Var2.S = a2;
                    a2.z1(u0Var2.f15007b);
                    u0Var2.S.r0(b2.p0.b(Uri.fromFile(u0Var2.R)));
                    u0Var2.S.j(0);
                    u0Var2.S.U(1.0f);
                    u0Var2.S.p0(u0Var2.V);
                    u0Var2.S.b();
                    u0Var2.S.Z0(5, u0Var2.G);
                    u0Var2.f15015m.b("preview player prepared: durationMs=" + u0Var2.E + ", trim=" + u0Var2.G + ".." + u0Var2.H);
                    u0Var2.v(5);
                    l2.f fVar = u0Var2.d;
                    long j14 = u0Var2.E;
                    long j15 = u0Var2.G;
                    long j16 = u0Var2.H;
                    ((o60) fVar.f14503b).f27885w.setProgress(((float) j14) / 60000.0f);
                    o60 o60Var = (o60) fVar.f14503b;
                    o60Var.f27869i0 = false;
                    o60Var.I.setAlpha(0.0f);
                    u0 u0Var3 = ((o60) fVar.f14503b).P;
                    if (u0Var3 == null) {
                        file = null;
                    } else {
                        u0.t();
                        file = u0Var3.R;
                    }
                    if (file != null) {
                        o60 o60Var2 = (o60) fVar.f14503b;
                        o60Var2.U = o60Var2.r(file, j14, null);
                        o60 o60Var3 = (o60) fVar.f14503b;
                        VideoEditedInfo videoEditedInfo = o60Var3.U;
                        if (j15 > 0) {
                            j10 = j15;
                        } else {
                            j10 = -1;
                        }
                        videoEditedInfo.startTime = j10;
                        if (j16 < j14) {
                            j11 = j16;
                        } else {
                            j11 = -1;
                        }
                        videoEditedInfo.endTime = j11;
                        NotificationCenter.getInstance(o60Var3.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(((o60) fVar.f14503b).f27873n), ((o60) fVar.f14503b).U, file.getAbsolutePath(), new ArrayList());
                        float max = (float) Math.max(1L, j14);
                        float f7 = ((float) j15) / max;
                        float f10 = ((float) j16) / max;
                        t60 t60Var = ((o60) fVar.f14503b).f29588b;
                        if (t60Var != null && (skVar = ((xe) t60Var).f41839b.Y) != null && (x81Var = skVar.f22884f1) != null) {
                            float max2 = Math.max(0.0f, Math.min(1.0f, f7));
                            x81Var.f31199b = max2;
                            x81Var.f31200c = Math.max(max2, Math.min(1.0f, f10));
                            x81Var.invalidate();
                        }
                    }
                    u0Var2.q();
                    return;
                }
                return;
        }
    }
}
