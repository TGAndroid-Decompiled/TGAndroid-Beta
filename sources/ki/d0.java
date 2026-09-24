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
    public final int f13670a;
    public final r0 f13671b;
    public final long f13672c;

    public d0(r0 r0Var, long j3, int i10) {
        this.f13670a = i10;
        this.f13671b = r0Var;
        this.f13672c = j3;
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
        switch (this.f13670a) {
            case 0:
                r0 r0Var = this.f13671b;
                long j12 = this.f13672c;
                if (r0Var.V == 6) {
                    r0Var.D = j12;
                    r0Var.J = 0L;
                    r0Var.F = 0L;
                    r0Var.G = j12;
                    r0Var.u(2);
                    r0Var.f13839k.B(r0Var.P, r0Var.D * 1000, r0Var.f13843o);
                    return;
                }
                return;
            default:
                r0 r0Var2 = this.f13671b;
                long j13 = this.f13672c;
                if (r0Var2.V == 4) {
                    r0Var2.J = j13;
                    long min = Math.min(r0Var2.f13842n, j13);
                    r0Var2.D = min;
                    r0Var2.F = 0L;
                    r0Var2.G = min;
                    r0Var2.f13833b.setSurfaceTextureListener(null);
                    r0Var2.f13833b.setTransform(r0Var2.f13836g);
                    i2.f0 a2 = new i2.p(r0Var2.f13832a).a();
                    r0Var2.R = a2;
                    a2.v1(r0Var2.f13833b);
                    i2.f0 f0Var2 = r0Var2.R;
                    Uri fromFile = Uri.fromFile(r0Var2.Q);
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
                    r0Var2.R.j(r32);
                    r0Var2.R.U(1.0f);
                    r0Var2.R.n0(r0Var2.U);
                    r0Var2.R.b();
                    r0Var2.R.W0(5, r0Var2.F);
                    r0Var2.f13840l.b("preview player prepared: durationMs=" + r0Var2.D + ", trim=" + r0Var2.F + ".." + r0Var2.G);
                    r0Var2.u(5);
                    l.d dVar = r0Var2.f13834c;
                    long j14 = r0Var2.D;
                    long j15 = r0Var2.F;
                    long j16 = r0Var2.G;
                    ((b60) dVar.f13909a).f22892w.setProgress(((float) j14) / 60000.0f);
                    b60 b60Var = (b60) dVar.f13909a;
                    b60Var.f22871e0 = r32;
                    b60Var.I.setAlpha(0.0f);
                    r0 r0Var3 = ((b60) dVar.f13909a).M;
                    if (r0Var3 == null) {
                        file = null;
                    } else {
                        r0.s();
                        file = r0Var3.Q;
                    }
                    if (file != null) {
                        b60 b60Var2 = (b60) dVar.f13909a;
                        b60Var2.R = b60Var2.o(file, j14, null);
                        b60 b60Var3 = (b60) dVar.f13909a;
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
                        Integer valueOf = Integer.valueOf(((b60) dVar.f13909a).f22880n);
                        VideoEditedInfo videoEditedInfo2 = ((b60) dVar.f13909a).R;
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
                        g60 g60Var = ((b60) dVar.f13909a).f24641b;
                        if (g60Var != null && (jkVar = ((pe) g60Var).f36496b.Y) != null && (i81Var = jkVar.f21973f1) != null) {
                            float max2 = Math.max(0.0f, Math.min(1.0f, f7));
                            i81Var.f24948b = max2;
                            i81Var.f24949c = Math.max(max2, Math.min(1.0f, f10));
                            i81Var.invalidate();
                        }
                    }
                    r0Var2.p();
                    return;
                }
                return;
        }
    }
}
