package ki;

import android.net.Uri;
import e9.a1;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.b60;
import org.telegram.ui.Components.g60;
import org.telegram.ui.Components.l81;
import org.telegram.ui.Components.x50;
import org.telegram.ui.mk;
import org.telegram.ui.qe;
public final class a0 implements Runnable {
    public final int f13650a;
    public final q0 f13651b;
    public final long f13652c;

    public a0(q0 q0Var, long j3, int i10) {
        this.f13650a = i10;
        this.f13651b = q0Var;
        this.f13652c = j3;
    }

    @Override
    public final void run() {
        boolean z10;
        long j3;
        b2.d0 d0Var;
        ?? r32;
        char c10;
        b2.f0 f0Var;
        File file;
        long j10;
        long j11;
        mk mkVar;
        l81 l81Var;
        b2.c0 c0Var;
        switch (this.f13650a) {
            case 0:
                q0 q0Var = this.f13651b;
                long j12 = this.f13652c;
                if (q0Var.U == 6) {
                    q0Var.D = j12;
                    q0Var.F = 0L;
                    q0Var.G = j12;
                    q0Var.u(2);
                    q0Var.f13835k.D(q0Var.O, q0Var.D * 1000, q0Var.f13839o);
                    return;
                }
                return;
            default:
                q0 q0Var2 = this.f13651b;
                long j13 = this.f13652c;
                if (q0Var2.U == 4) {
                    long min = Math.min(q0Var2.f13838n, j13);
                    q0Var2.D = min;
                    q0Var2.F = 0L;
                    q0Var2.G = min;
                    q0Var2.f13829b.setSurfaceTextureListener(null);
                    q0Var2.f13829b.setTransform(q0Var2.f13832g);
                    i2.e0 a2 = new i2.p(q0Var2.f13828a).a();
                    q0Var2.Q = a2;
                    a2.v1(q0Var2.f13829b);
                    i2.e0 e0Var = q0Var2.Q;
                    Uri fromFile = Uri.fromFile(q0Var2.P);
                    b2.y yVar = new b2.y();
                    b2.b0 b0Var = new b2.b0();
                    List list = Collections.EMPTY_LIST;
                    a1 a1Var = a1.e;
                    b2.d0 d0Var2 = new b2.d0();
                    b2.g0 g0Var = b2.g0.d;
                    if (b0Var.f2938b != null && b0Var.f2937a == null) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    e2.d.g(z10);
                    if (fromFile != null) {
                        if (b0Var.f2937a != null) {
                            c0Var = new b2.c0(b0Var);
                        } else {
                            c0Var = null;
                        }
                        j3 = 0;
                        d0Var = d0Var2;
                        r32 = 0;
                        c10 = 2;
                        f0Var = new b2.f0(fromFile, null, c0Var, null, list, null, a1Var, -9223372036854775807L);
                    } else {
                        j3 = 0;
                        d0Var = d0Var2;
                        r32 = 0;
                        c10 = 2;
                        f0Var = null;
                    }
                    b2.k0 k0Var = new b2.k0("", new b2.z(yVar), f0Var, new b2.e0(d0Var), b2.n0.K, g0Var);
                    e0Var.getClass();
                    e0Var.I0(e9.i0.z(k0Var));
                    q0Var2.Q.j(r32);
                    q0Var2.Q.U(1.0f);
                    q0Var2.Q.n0(q0Var2.T);
                    q0Var2.Q.b();
                    q0Var2.Q.W0(5, q0Var2.F);
                    q0Var2.f13836l.b("preview player prepared: durationMs=" + q0Var2.D + ", trim=" + q0Var2.F + ".." + q0Var2.G);
                    q0Var2.u(5);
                    x50 x50Var = q0Var2.f13830c;
                    long j14 = q0Var2.D;
                    long j15 = q0Var2.F;
                    long j16 = q0Var2.G;
                    x50Var.f30225a.f22895w.setProgress(((float) j14) / 60000.0f);
                    b60 b60Var = x50Var.f30225a;
                    b60Var.f22874e0 = r32;
                    b60Var.I.setAlpha(0.0f);
                    q0 q0Var3 = x50Var.f30225a.M;
                    if (q0Var3 == null) {
                        file = null;
                    } else {
                        q0.s();
                        file = q0Var3.P;
                    }
                    if (file != null) {
                        b60 b60Var2 = x50Var.f30225a;
                        b60Var2.R = b60Var2.o(file, j14, null);
                        b60 b60Var3 = x50Var.f30225a;
                        VideoEditedInfo videoEditedInfo = b60Var3.R;
                        if (j15 > j3) {
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
                        NotificationCenter notificationCenter = NotificationCenter.getInstance(b60Var3.h);
                        int i10 = NotificationCenter.audioDidSent;
                        Integer valueOf = Integer.valueOf(x50Var.f30225a.f22883n);
                        VideoEditedInfo videoEditedInfo2 = x50Var.f30225a.R;
                        String absolutePath = file.getAbsolutePath();
                        ArrayList arrayList = new ArrayList();
                        Object[] objArr = new Object[4];
                        objArr[0] = valueOf;
                        objArr[1] = videoEditedInfo2;
                        objArr[c10] = absolutePath;
                        objArr[3] = arrayList;
                        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, objArr);
                        float max = (float) Math.max(1L, j14);
                        float f7 = ((float) j15) / max;
                        float f10 = ((float) j16) / max;
                        g60 g60Var = x50Var.f30225a.f24696b;
                        if (g60Var != null && (mkVar = ((qe) g60Var).f36914b.Y) != null && (l81Var = mkVar.f22002f1) != null) {
                            float max2 = Math.max(0.0f, Math.min(1.0f, f7));
                            l81Var.f26024b = max2;
                            l81Var.f26025c = Math.max(max2, Math.min(1.0f, f10));
                            l81Var.invalidate();
                        }
                    }
                    q0Var2.p();
                    return;
                }
                return;
        }
    }
}
