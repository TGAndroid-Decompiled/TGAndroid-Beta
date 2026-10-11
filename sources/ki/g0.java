package ki;

import android.net.Uri;
import e9.a1;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.b91;
import org.telegram.ui.Components.s60;
import org.telegram.ui.Components.x60;
import org.telegram.ui.ok;
import org.telegram.ui.qe;
public final class g0 implements Runnable {
    public final int f14928a;
    public final v0 f14929b;
    public final long f14930c;

    public g0(v0 v0Var, long j3, int i10) {
        this.f14928a = i10;
        this.f14929b = v0Var;
        this.f14930c = j3;
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
        ok okVar;
        b91 b91Var;
        b2.c0 c0Var;
        switch (this.f14928a) {
            case 0:
                v0 v0Var = this.f14929b;
                long j12 = this.f14930c;
                if (v0Var.W == 6) {
                    v0Var.E = j12;
                    v0Var.K = 0L;
                    v0Var.G = 0L;
                    v0Var.H = j12;
                    v0Var.v(2);
                    v0Var.f15167l.X(v0Var.Q, v0Var.E * 1000, v0Var.f15171p);
                    return;
                }
                return;
            default:
                v0 v0Var2 = this.f14929b;
                long j13 = this.f14930c;
                if (v0Var2.W == 4) {
                    v0Var2.K = j13;
                    long min = Math.min(v0Var2.f15170o, j13);
                    v0Var2.E = min;
                    v0Var2.G = 0L;
                    v0Var2.H = min;
                    v0Var2.f15159b.setSurfaceTextureListener(null);
                    v0Var2.f15159b.setTransform(v0Var2.h);
                    i2.f0 a2 = new i2.p(v0Var2.f15158a).a();
                    v0Var2.S = a2;
                    a2.x1(v0Var2.f15159b);
                    i2.f0 f0Var2 = v0Var2.S;
                    Uri fromFile = Uri.fromFile(v0Var2.R);
                    b2.y yVar = new b2.y();
                    b2.b0 b0Var = new b2.b0();
                    List list = Collections.EMPTY_LIST;
                    a1 a1Var = a1.f8714e;
                    b2.d0 d0Var2 = new b2.d0();
                    b2.g0 g0Var = b2.g0.d;
                    if (b0Var.f3244b != null && b0Var.f3243a == null) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    e2.d.g(z10);
                    if (fromFile != null) {
                        if (b0Var.f3243a != null) {
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
                    v0Var2.S.j(r32);
                    v0Var2.S.U(1.0f);
                    v0Var2.S.n0(v0Var2.V);
                    v0Var2.S.b();
                    v0Var2.S.W0(5, v0Var2.G);
                    v0Var2.f15168m.b("preview player prepared: durationMs=" + v0Var2.E + ", trim=" + v0Var2.G + ".." + v0Var2.H);
                    v0Var2.v(5);
                    m2.t tVar = v0Var2.d;
                    long j14 = v0Var2.E;
                    long j15 = v0Var2.G;
                    long j16 = v0Var2.H;
                    ((s60) tVar.f16033b).f30775w.setProgress(((float) j14) / 60000.0f);
                    s60 s60Var = (s60) tVar.f16033b;
                    s60Var.f30759i0 = r32;
                    s60Var.I.setAlpha(0.0f);
                    v0 v0Var3 = ((s60) tVar.f16033b).P;
                    if (v0Var3 == null) {
                        file = null;
                    } else {
                        v0.t();
                        file = v0Var3.R;
                    }
                    if (file != null) {
                        s60 s60Var2 = (s60) tVar.f16033b;
                        s60Var2.U = s60Var2.r(file, j14, null);
                        s60 s60Var3 = (s60) tVar.f16033b;
                        VideoEditedInfo videoEditedInfo = s60Var3.U;
                        char c11 = r32;
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
                        NotificationCenter notificationCenter = NotificationCenter.getInstance(s60Var3.h);
                        int i10 = NotificationCenter.audioDidSent;
                        Integer valueOf = Integer.valueOf(((s60) tVar.f16033b).f30763n);
                        VideoEditedInfo videoEditedInfo2 = ((s60) tVar.f16033b).U;
                        String absolutePath = file.getAbsolutePath();
                        ArrayList arrayList = new ArrayList();
                        Object[] objArr = new Object[4];
                        objArr[c11] = valueOf;
                        objArr[1] = videoEditedInfo2;
                        objArr[c10] = absolutePath;
                        objArr[3] = arrayList;
                        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, objArr);
                        float max = (float) Math.max(1L, j14);
                        float f7 = ((float) j15) / max;
                        float f10 = ((float) j16) / max;
                        x60 x60Var = ((s60) tVar.f16033b).f33157b;
                        if (x60Var != null && (okVar = ((qe) x60Var).f41190b.Y) != null && (b91Var = okVar.f23914f1) != null) {
                            float max2 = Math.max(0.0f, Math.min(1.0f, f7));
                            b91Var.f24948b = max2;
                            b91Var.f24949c = Math.max(max2, Math.min(1.0f, f10));
                            b91Var.invalidate();
                        }
                    }
                    v0Var2.q();
                    return;
                }
                return;
        }
    }
}
