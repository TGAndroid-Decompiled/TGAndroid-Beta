package ki;

import android.net.Uri;
import e9.a1;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.j60;
import org.telegram.ui.Components.s81;
import org.telegram.ui.jk;
import org.telegram.ui.re;
public final class d0 implements Runnable {
    public final int f14863a;
    public final s0 f14864b;
    public final long f14865c;

    public d0(s0 s0Var, long j3, int i10) {
        this.f14863a = i10;
        this.f14864b = s0Var;
        this.f14865c = j3;
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
        s81 s81Var;
        b2.c0 c0Var;
        switch (this.f14863a) {
            case 0:
                s0 s0Var = this.f14864b;
                long j12 = this.f14865c;
                if (s0Var.W == 6) {
                    s0Var.E = j12;
                    s0Var.K = 0L;
                    s0Var.G = 0L;
                    s0Var.H = j12;
                    s0Var.v(2);
                    s0Var.f15052l.C(s0Var.Q, s0Var.E * 1000, s0Var.f15056p);
                    return;
                }
                return;
            default:
                s0 s0Var2 = this.f14864b;
                long j13 = this.f14865c;
                if (s0Var2.W == 4) {
                    s0Var2.K = j13;
                    long min = Math.min(s0Var2.f15055o, j13);
                    s0Var2.E = min;
                    s0Var2.G = 0L;
                    s0Var2.H = min;
                    s0Var2.f15044b.setSurfaceTextureListener(null);
                    s0Var2.f15044b.setTransform(s0Var2.h);
                    i2.f0 a2 = new i2.p(s0Var2.f15043a).a();
                    s0Var2.S = a2;
                    a2.v1(s0Var2.f15044b);
                    i2.f0 f0Var2 = s0Var2.S;
                    Uri fromFile = Uri.fromFile(s0Var2.R);
                    b2.y yVar = new b2.y();
                    b2.b0 b0Var = new b2.b0();
                    List list = Collections.EMPTY_LIST;
                    a1 a1Var = a1.f8720e;
                    b2.d0 d0Var2 = new b2.d0();
                    b2.g0 g0Var = b2.g0.d;
                    if (b0Var.f3165b != null && b0Var.f3164a == null) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    e2.d.g(z10);
                    if (fromFile != null) {
                        if (b0Var.f3164a != null) {
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
                    s0Var2.S.j(r32);
                    s0Var2.S.U(1.0f);
                    s0Var2.S.n0(s0Var2.V);
                    s0Var2.S.b();
                    s0Var2.S.W0(5, s0Var2.G);
                    s0Var2.f15053m.b("preview player prepared: durationMs=" + s0Var2.E + ", trim=" + s0Var2.G + ".." + s0Var2.H);
                    s0Var2.v(5);
                    l2.g gVar = s0Var2.d;
                    long j14 = s0Var2.E;
                    long j15 = s0Var2.G;
                    long j16 = s0Var2.H;
                    ((e60) gVar.f15267b).f25966w.setProgress(((float) j14) / 60000.0f);
                    e60 e60Var = (e60) gVar.f15267b;
                    e60Var.f25949h0 = r32;
                    e60Var.I.setAlpha(0.0f);
                    s0 s0Var3 = ((e60) gVar.f15267b).P;
                    if (s0Var3 == null) {
                        file = null;
                    } else {
                        s0.t();
                        file = s0Var3.R;
                    }
                    if (file != null) {
                        e60 e60Var2 = (e60) gVar.f15267b;
                        e60Var2.U = e60Var2.p(file, j14, null);
                        e60 e60Var3 = (e60) gVar.f15267b;
                        VideoEditedInfo videoEditedInfo = e60Var3.U;
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
                        NotificationCenter notificationCenter = NotificationCenter.getInstance(e60Var3.h);
                        int i10 = NotificationCenter.audioDidSent;
                        Integer valueOf = Integer.valueOf(((e60) gVar.f15267b).f25954n);
                        VideoEditedInfo videoEditedInfo2 = ((e60) gVar.f15267b).U;
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
                        j60 j60Var = ((e60) gVar.f15267b).f27968b;
                        if (j60Var != null && (jkVar = ((re) j60Var).f40103b.W) != null && (s81Var = jkVar.f23883f1) != null) {
                            float max2 = Math.max(0.0f, Math.min(1.0f, f7));
                            s81Var.f30651b = max2;
                            s81Var.f30652c = Math.max(max2, Math.min(1.0f, f10));
                            s81Var.invalidate();
                        }
                    }
                    s0Var2.q();
                    return;
                }
                return;
        }
    }
}
