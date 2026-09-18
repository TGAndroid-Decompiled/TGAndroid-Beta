package ki;

import android.net.Uri;
import b2.k0;
import b2.n0;
import e9.a1;
import e9.i0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.a60;
public final class y implements Runnable {
    public final int f13825a;
    public final h0 f13826b;
    public final long f13827c;

    public y(h0 h0Var, long j3, int i10) {
        this.f13825a = i10;
        this.f13826b = h0Var;
        this.f13827c = j3;
    }

    @Override
    public final void run() {
        boolean z10;
        long j3;
        b2.d0 d0Var;
        ?? r32;
        boolean z11;
        char c10;
        b2.f0 f0Var;
        File file;
        b2.c0 c0Var;
        switch (this.f13825a) {
            case 0:
                h0 h0Var = this.f13826b;
                long j10 = this.f13827c;
                if (h0Var.Q == 6) {
                    h0Var.f13725y = j10;
                    h0Var.A = 0L;
                    h0Var.B = j10;
                    h0Var.u(2);
                    h0Var.f13712k.p(h0Var.J, h0Var.f13725y * 1000, h0Var.R);
                    return;
                }
                return;
            default:
                h0 h0Var2 = this.f13826b;
                long j11 = this.f13827c;
                if (h0Var2.Q == 4) {
                    long min = Math.min(h0Var2.f13714m, j11);
                    h0Var2.f13725y = min;
                    h0Var2.A = 0L;
                    h0Var2.B = min;
                    h0Var2.f13706b.setSurfaceTextureListener(null);
                    h0Var2.f13706b.setTransform(h0Var2.f13709g);
                    i2.e0 a2 = new i2.p(h0Var2.f13705a).a();
                    h0Var2.L = a2;
                    a2.v1(h0Var2.f13706b);
                    i2.e0 e0Var = h0Var2.L;
                    Uri fromFile = Uri.fromFile(h0Var2.K);
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
                        z11 = true;
                        c10 = 2;
                        f0Var = new b2.f0(fromFile, null, c0Var, null, list, null, a1Var, -9223372036854775807L);
                    } else {
                        j3 = 0;
                        d0Var = d0Var2;
                        r32 = 0;
                        z11 = true;
                        c10 = 2;
                        f0Var = null;
                    }
                    k0 k0Var = new k0("", new b2.z(yVar), f0Var, new b2.e0(d0Var), n0.K, g0Var);
                    e0Var.getClass();
                    e0Var.I0(i0.z(k0Var));
                    h0Var2.L.j(r32);
                    h0Var2.L.U(1.0f);
                    h0Var2.L.n0(h0Var2.O);
                    h0Var2.L.b();
                    h0Var2.L.W0(5, h0Var2.A);
                    h0Var2.f13713l.b("preview player prepared: durationMs=" + h0Var2.f13725y + ", trim=" + h0Var2.A + ".." + h0Var2.B);
                    h0Var2.u(5);
                    l.d dVar = h0Var2.f13707c;
                    long j12 = h0Var2.f13725y;
                    long j13 = h0Var2.A;
                    long j14 = h0Var2.B;
                    ((a60) dVar.f13859a).f22526s.setProgress(((float) j12) / 60000.0f);
                    ((a60) dVar.f13859a).f22526s.setTrimEnabled(z11);
                    float f7 = (float) j13;
                    float f10 = (float) j14;
                    ((a60) dVar.f13859a).f22526s.g(f7 / 60000.0f, f10 / 60000.0f);
                    ((a60) dVar.f13859a).f22526s.setLoading(r32);
                    a60 a60Var = (a60) dVar.f13859a;
                    a60Var.f22509a0 = r32;
                    a60Var.F.setAlpha(0.0f);
                    h0 h0Var3 = ((a60) dVar.f13859a).J;
                    if (h0Var3 == null) {
                        file = null;
                    } else {
                        h0.r();
                        file = h0Var3.K;
                    }
                    if (file != null) {
                        ((a60) dVar.f13859a).N = a60.o(file, j12, null);
                        a60 a60Var2 = (a60) dVar.f13859a;
                        VideoEditedInfo videoEditedInfo = a60Var2.N;
                        if (j13 <= j3) {
                            j13 = -1;
                        }
                        videoEditedInfo.startTime = j13;
                        if (j14 >= j12) {
                            j14 = -1;
                        }
                        videoEditedInfo.endTime = j14;
                        NotificationCenter notificationCenter = NotificationCenter.getInstance(a60Var2.e);
                        int i10 = NotificationCenter.audioDidSent;
                        Integer valueOf = Integer.valueOf(((a60) dVar.f13859a).f22514f);
                        VideoEditedInfo videoEditedInfo2 = ((a60) dVar.f13859a).N;
                        String absolutePath = file.getAbsolutePath();
                        ArrayList arrayList = new ArrayList();
                        Object[] objArr = new Object[4];
                        objArr[r32] = valueOf;
                        objArr[1] = videoEditedInfo2;
                        objArr[c10] = absolutePath;
                        objArr[3] = arrayList;
                        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, objArr);
                        float max = (float) Math.max(1L, j12);
                        ((a60) dVar.f13859a).c(f7 / max, f10 / max);
                    }
                    h0Var2.o();
                    return;
                }
                return;
        }
    }
}
