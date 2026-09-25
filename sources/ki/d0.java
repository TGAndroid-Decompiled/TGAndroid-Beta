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
import org.telegram.ui.Components.i81;
import org.telegram.ui.jk;
import org.telegram.ui.pe;
public final class d0 implements Runnable {
    public final int f13672a;
    public final s0 f13673b;
    public final long f13674c;

    public d0(s0 s0Var, long j3, int i10) {
        this.f13672a = i10;
        this.f13673b = s0Var;
        this.f13674c = j3;
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
        jk jkVar;
        i81 i81Var;
        b2.c0 c0Var;
        switch (this.f13672a) {
            case 0:
                s0 s0Var = this.f13673b;
                long j12 = this.f13674c;
                if (s0Var.V == 6) {
                    s0Var.D = j12;
                    s0Var.J = 0L;
                    s0Var.F = 0L;
                    s0Var.G = j12;
                    s0Var.u(2);
                    s0Var.f13849k.C(s0Var.P, s0Var.D * 1000, s0Var.f13853o);
                    return;
                }
                return;
            default:
                s0 s0Var2 = this.f13673b;
                long j13 = this.f13674c;
                if (s0Var2.V == 4) {
                    s0Var2.J = j13;
                    long min = Math.min(s0Var2.f13852n, j13);
                    s0Var2.D = min;
                    s0Var2.F = 0L;
                    s0Var2.G = min;
                    s0Var2.f13843b.setSurfaceTextureListener(null);
                    s0Var2.f13843b.setTransform(s0Var2.f13846g);
                    i2.f0 a2 = new i2.p(s0Var2.f13842a).a();
                    s0Var2.R = a2;
                    a2.v1(s0Var2.f13843b);
                    i2.f0 f0Var2 = s0Var2.R;
                    Uri fromFile = Uri.fromFile(s0Var2.Q);
                    b2.y yVar = new b2.y();
                    b2.b0 b0Var = new b2.b0();
                    List list = Collections.EMPTY_LIST;
                    a1 a1Var = a1.e;
                    b2.d0 d0Var2 = new b2.d0();
                    b2.g0 g0Var = b2.g0.d;
                    if (b0Var.f2931b != null && b0Var.f2930a == null) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    e2.d.g(z10);
                    if (fromFile != null) {
                        if (b0Var.f2930a != null) {
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
                    f0Var2.getClass();
                    f0Var2.I0(e9.i0.z(k0Var));
                    s0Var2.R.j(r32);
                    s0Var2.R.U(1.0f);
                    s0Var2.R.n0(s0Var2.U);
                    s0Var2.R.b();
                    s0Var2.R.W0(5, s0Var2.F);
                    s0Var2.f13850l.b("preview player prepared: durationMs=" + s0Var2.D + ", trim=" + s0Var2.F + ".." + s0Var2.G);
                    s0Var2.u(5);
                    l.d dVar = s0Var2.f13844c;
                    long j14 = s0Var2.D;
                    long j15 = s0Var2.F;
                    long j16 = s0Var2.G;
                    ((b60) dVar.f13924a).f22901w.setProgress(((float) j14) / 60000.0f);
                    b60 b60Var = (b60) dVar.f13924a;
                    b60Var.f22884h0 = r32;
                    b60Var.I.setAlpha(0.0f);
                    s0 s0Var3 = ((b60) dVar.f13924a).P;
                    if (s0Var3 == null) {
                        file = null;
                    } else {
                        s0.s();
                        file = s0Var3.Q;
                    }
                    if (file != null) {
                        b60 b60Var2 = (b60) dVar.f13924a;
                        b60Var2.U = b60Var2.p(file, j14, null);
                        b60 b60Var3 = (b60) dVar.f13924a;
                        VideoEditedInfo videoEditedInfo = b60Var3.U;
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
                        Integer valueOf = Integer.valueOf(((b60) dVar.f13924a).f22889n);
                        VideoEditedInfo videoEditedInfo2 = ((b60) dVar.f13924a).U;
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
                        g60 g60Var = ((b60) dVar.f13924a).f24648b;
                        if (g60Var != null && (jkVar = ((pe) g60Var).f36508b.Y) != null && (i81Var = jkVar.f21988f1) != null) {
                            float max2 = Math.max(0.0f, Math.min(1.0f, f7));
                            i81Var.f24974b = max2;
                            i81Var.f24975c = Math.max(max2, Math.min(1.0f, f10));
                            i81Var.invalidate();
                        }
                    }
                    s0Var2.p();
                    return;
                }
                return;
        }
    }
}
