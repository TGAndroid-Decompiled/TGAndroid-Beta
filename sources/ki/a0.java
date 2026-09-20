package ki;

import android.net.Uri;
import e9.a1;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.d60;
import org.telegram.ui.Components.j81;
import org.telegram.ui.Components.z50;
import org.telegram.ui.lk;
import org.telegram.ui.qe;
public final class a0 implements Runnable {
    public final int f13652a;
    public final o0 f13653b;
    public final long f13654c;

    public a0(o0 o0Var, long j3, int i10) {
        this.f13652a = i10;
        this.f13653b = o0Var;
        this.f13654c = j3;
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
        lk lkVar;
        j81 j81Var;
        b2.c0 c0Var;
        switch (this.f13652a) {
            case 0:
                o0 o0Var = this.f13653b;
                long j12 = this.f13654c;
                if (o0Var.U == 6) {
                    o0Var.D = j12;
                    o0Var.F = 0L;
                    o0Var.G = j12;
                    o0Var.u(2);
                    o0Var.f13807k.y(o0Var.O, o0Var.D * 1000, o0Var.f13811o);
                    return;
                }
                return;
            default:
                o0 o0Var2 = this.f13653b;
                long j13 = this.f13654c;
                if (o0Var2.U == 4) {
                    long min = Math.min(o0Var2.f13810n, j13);
                    o0Var2.D = min;
                    o0Var2.F = 0L;
                    o0Var2.G = min;
                    o0Var2.f13801b.setSurfaceTextureListener(null);
                    o0Var2.f13801b.setTransform(o0Var2.f13804g);
                    i2.e0 a2 = new i2.p(o0Var2.f13800a).a();
                    o0Var2.Q = a2;
                    a2.v1(o0Var2.f13801b);
                    i2.e0 e0Var = o0Var2.Q;
                    Uri fromFile = Uri.fromFile(o0Var2.P);
                    b2.y yVar = new b2.y();
                    b2.b0 b0Var = new b2.b0();
                    List list = Collections.EMPTY_LIST;
                    a1 a1Var = a1.e;
                    b2.d0 d0Var2 = new b2.d0();
                    b2.g0 g0Var = b2.g0.d;
                    if (b0Var.f2939b != null && b0Var.f2938a == null) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    e2.d.g(z10);
                    if (fromFile != null) {
                        if (b0Var.f2938a != null) {
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
                    o0Var2.Q.j(r32);
                    o0Var2.Q.U(1.0f);
                    o0Var2.Q.n0(o0Var2.T);
                    o0Var2.Q.b();
                    o0Var2.Q.W0(5, o0Var2.F);
                    o0Var2.f13808l.b("preview player prepared: durationMs=" + o0Var2.D + ", trim=" + o0Var2.F + ".." + o0Var2.G);
                    o0Var2.u(5);
                    l.d dVar = o0Var2.f13802c;
                    long j14 = o0Var2.D;
                    long j15 = o0Var2.F;
                    long j16 = o0Var2.G;
                    ((z50) dVar.f13898a).f30734s.setProgress(((float) j14) / 60000.0f);
                    z50 z50Var = (z50) dVar.f13898a;
                    z50Var.f30716c0 = r32;
                    z50Var.G.setAlpha(0.0f);
                    o0 o0Var3 = ((z50) dVar.f13898a).K;
                    if (o0Var3 == null) {
                        file = null;
                    } else {
                        o0.s();
                        file = o0Var3.P;
                    }
                    if (file != null) {
                        z50 z50Var2 = (z50) dVar.f13898a;
                        z50Var2.P = z50Var2.n(file, j14, null);
                        z50 z50Var3 = (z50) dVar.f13898a;
                        VideoEditedInfo videoEditedInfo = z50Var3.P;
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
                        NotificationCenter notificationCenter = NotificationCenter.getInstance(z50Var3.e);
                        int i10 = NotificationCenter.audioDidSent;
                        Integer valueOf = Integer.valueOf(((z50) dVar.f13898a).f30719f);
                        VideoEditedInfo videoEditedInfo2 = ((z50) dVar.f13898a).P;
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
                        d60 d60Var = ((z50) dVar.f13898a).f23749b;
                        if (d60Var != null && (lkVar = ((qe) d60Var).f36891b.Y) != null && (j81Var = lkVar.f21987f1) != null) {
                            float max2 = Math.max(0.0f, Math.min(1.0f, f7));
                            j81Var.f25293b = max2;
                            j81Var.f25294c = Math.max(max2, Math.min(1.0f, f10));
                            j81Var.invalidate();
                        }
                    }
                    o0Var2.p();
                    return;
                }
                return;
        }
    }
}
