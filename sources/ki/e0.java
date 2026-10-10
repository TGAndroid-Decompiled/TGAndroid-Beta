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
import org.telegram.ui.Components.t60;
import org.telegram.ui.Components.y60;
import org.telegram.ui.ok;
import org.telegram.ui.re;
public final class e0 implements Runnable {
    public final int f14918a;
    public final t0 f14919b;
    public final long f14920c;

    public e0(t0 t0Var, long j3, int i10) {
        this.f14918a = i10;
        this.f14919b = t0Var;
        this.f14920c = j3;
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
        switch (this.f14918a) {
            case 0:
                t0 t0Var = this.f14919b;
                long j12 = this.f14920c;
                if (t0Var.W == 6) {
                    t0Var.E = j12;
                    t0Var.K = 0L;
                    t0Var.G = 0L;
                    t0Var.H = j12;
                    t0Var.v(2);
                    t0Var.f15126l.R(t0Var.Q, t0Var.E * 1000, t0Var.f15130p);
                    return;
                }
                return;
            default:
                t0 t0Var2 = this.f14919b;
                long j13 = this.f14920c;
                if (t0Var2.W == 4) {
                    t0Var2.K = j13;
                    long min = Math.min(t0Var2.f15129o, j13);
                    t0Var2.E = min;
                    t0Var2.G = 0L;
                    t0Var2.H = min;
                    t0Var2.f15118b.setSurfaceTextureListener(null);
                    t0Var2.f15118b.setTransform(t0Var2.h);
                    i2.f0 a2 = new i2.p(t0Var2.f15117a).a();
                    t0Var2.S = a2;
                    a2.x1(t0Var2.f15118b);
                    i2.f0 f0Var2 = t0Var2.S;
                    Uri fromFile = Uri.fromFile(t0Var2.R);
                    b2.y yVar = new b2.y();
                    b2.b0 b0Var = new b2.b0();
                    List list = Collections.EMPTY_LIST;
                    a1 a1Var = a1.f8715e;
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
                    t0Var2.S.j(r32);
                    t0Var2.S.U(1.0f);
                    t0Var2.S.n0(t0Var2.V);
                    t0Var2.S.b();
                    t0Var2.S.W0(5, t0Var2.G);
                    t0Var2.f15127m.b("preview player prepared: durationMs=" + t0Var2.E + ", trim=" + t0Var2.G + ".." + t0Var2.H);
                    t0Var2.v(5);
                    m2.t tVar = t0Var2.d;
                    long j14 = t0Var2.E;
                    long j15 = t0Var2.G;
                    long j16 = t0Var2.H;
                    ((t60) tVar.f15976b).f31026w.setProgress(((float) j14) / 60000.0f);
                    t60 t60Var = (t60) tVar.f15976b;
                    t60Var.f31009h0 = r32;
                    t60Var.I.setAlpha(0.0f);
                    t0 t0Var3 = ((t60) tVar.f15976b).P;
                    if (t0Var3 == null) {
                        file = null;
                    } else {
                        t0.t();
                        file = t0Var3.R;
                    }
                    if (file != null) {
                        t60 t60Var2 = (t60) tVar.f15976b;
                        t60Var2.U = t60Var2.q(file, j14, null);
                        t60 t60Var3 = (t60) tVar.f15976b;
                        VideoEditedInfo videoEditedInfo = t60Var3.U;
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
                        NotificationCenter notificationCenter = NotificationCenter.getInstance(t60Var3.h);
                        int i10 = NotificationCenter.audioDidSent;
                        Integer valueOf = Integer.valueOf(((t60) tVar.f15976b).f31014n);
                        VideoEditedInfo videoEditedInfo2 = ((t60) tVar.f15976b).U;
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
                        y60 y60Var = ((t60) tVar.f15976b).f33511b;
                        if (y60Var != null && (okVar = ((re) y60Var).f41440b.Y) != null && (b91Var = okVar.f23890f1) != null) {
                            float max2 = Math.max(0.0f, Math.min(1.0f, f7));
                            b91Var.f24894b = max2;
                            b91Var.f24895c = Math.max(max2, Math.min(1.0f, f10));
                            b91Var.invalidate();
                        }
                    }
                    t0Var2.q();
                    return;
                }
                return;
        }
    }
}
