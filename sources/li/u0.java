package li;

import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.TextureView;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import ji.d4;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.c11;
import org.telegram.ui.Components.o60;
import org.telegram.ui.Components.xv;
public final class u0 {
    public boolean A;
    public boolean B;
    public boolean C;
    public volatile boolean D;
    public long E;
    public long F;
    public long G;
    public long H;
    public long J;
    public long K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public volatile q0 P;
    public volatile x Q;
    public volatile File R;
    public i2.h0 S;
    public final e2.z V;
    public final Context f15006a;
    public final TextureView f15007b;
    public final File f15008c;
    public final l2.f d;
    public final r0 e;
    public final xv f15009f;
    public final l f15014l;
    public final p f15015m;
    public final s0 f15016n;
    public final long f15017o;
    public n0 f15018p;
    public n0 f15019q;
    public o0 f15020r;
    public p0 f15021s;
    public boolean f15023u;
    public boolean v;
    public boolean f15024w;
    public boolean f15025x;
    public boolean f15026y;
    public boolean f15027z;
    public final Object f15010g = new Object();
    public final Matrix h = new Matrix();
    public final Handler f15011i = new Handler(Looper.getMainLooper());
    public final ExecutorService f15012j = Executors.newSingleThreadExecutor(new e2.l0(1));
    public final ExecutorService f15013k = Executors.newSingleThreadExecutor(new e2.l0(2));
    public int W = 1;
    public int X = 1;
    public float f15022t = 1.0f;
    public long I = 1;
    public final f0 T = new f0(this, 1);
    public final androidx.activity.i U = new androidx.activity.i(this, 24);

    public u0(l0 l0Var) {
        Context context;
        d4 d4Var = new d4(this, 3);
        this.V = new e2.z(this, 1);
        t();
        Context context2 = l0Var.f14893a;
        Context applicationContext = context2.getApplicationContext();
        if (applicationContext == null) {
            context = context2;
        } else {
            context = applicationContext;
        }
        this.f15006a = context;
        TextureView textureView = l0Var.f14894b;
        this.f15007b = textureView;
        File file = l0Var.f14895c;
        this.f15008c = file == null ? context.getCacheDir() : file;
        this.f15018p = l0Var.d;
        s0 s0Var = l0Var.e;
        this.f15016n = s0Var;
        int i10 = l0Var.h;
        o0 o0Var = l0Var.f14896f;
        p0 p0Var = l0Var.f14897g;
        this.f15017o = 60000L;
        boolean z10 = l0Var.f14898i;
        this.d = l0Var.f14899j;
        this.e = l0Var.f14900k;
        this.f15009f = l0Var.f14901l;
        p pVar = new p();
        this.f15015m = pVar;
        StringBuilder sb2 = new StringBuilder("session created: device=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(" ");
        sb2.append(Build.MODEL);
        sb2.append(", sdk=");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append(", output=");
        sb2.append(s0Var.f14956a);
        sb2.append("x");
        i2.d.u(sb2, s0Var.f14956a, ", bitrate=", i10, ", cameraMode=");
        sb2.append(o0Var);
        sb2.append(", fps=");
        sb2.append(p0Var.f14942a);
        sb2.append(", composition=");
        sb2.append(z10);
        sb2.append(", facing=");
        sb2.append(this.f15018p);
        sb2.append(", maxDurationMs=60000");
        pVar.b(sb2.toString());
        this.f15014l = new l(context, textureView, s0Var, i10, o0Var, p0Var, z10, pVar, d4Var);
    }

    public static long f(long j10) {
        return (System.nanoTime() - j10) / 1000000;
    }

    public static void t() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("RoundVideoSession must be used from the main thread");
    }

    public final void a() {
        t();
        int i10 = this.W;
        if (i10 != 10 && i10 != 8) {
            this.f15015m.b("cancel requested: state=".concat(i2.d.C(i10)));
            if (b(3)) {
                e();
                r();
                v(10);
                if (!this.B && !this.f15014l.Y()) {
                    i();
                    return;
                }
                this.B = true;
                this.A = true;
            }
        }
    }

    public final boolean b(int i10) {
        synchronized (this.f15010g) {
            try {
                q0 q0Var = this.P;
                if (q0Var != null && q0Var.e) {
                    return false;
                }
                this.D = true;
                if (q0Var != null && !q0Var.d) {
                    q0Var.d = true;
                    p pVar = this.f15015m;
                    pVar.b("output generation invalidated: id=" + q0Var.f14945a + ", reason=" + i2.d.B(i10) + ", availableSize=" + q0Var.f14947c);
                    this.f15013k.execute(new i0(this, q0Var, i10, 1));
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(boolean z10) {
        synchronized (this.f15010g) {
            g();
            File d = d("round_video_");
            long j10 = this.I;
            this.I = 1 + j10;
            q0 q0Var = new q0(j10, d);
            this.P = q0Var;
            this.Q = new x(d, this.f15016n.f14956a, z10, this.f15015m, new ah.h0(24, this, q0Var));
            p pVar = this.f15015m;
            pVar.b("output generation started: id=" + j10 + ", includeAudio=" + z10 + ", file=" + d.getName());
            this.f15013k.execute(new hg.t(this, q0Var, d, 26));
        }
    }

    public final File d(String str) {
        File file = this.f15008c;
        if (file.exists()) {
            if (!file.isDirectory()) {
                throw new IOException("Round-video output path is not a directory: " + file);
            }
        } else if (!file.mkdirs() && !file.isDirectory()) {
            throw new IOException("Cannot create round-video output directory: " + file);
        }
        return File.createTempFile(str, ".mp4", file);
    }

    public final void e() {
        this.f15023u = false;
        l lVar = this.f15014l;
        lVar.U(0.0f);
        lVar.T(false);
        u(false);
    }

    public final void g() {
        if (!this.D) {
            return;
        }
        throw new IOException("Round-video operation was cancelled");
    }

    public final void h(Exception exc) {
        int i10 = this.W;
        if (i10 != 9 && i10 != 10) {
            this.f15015m.a("fatal error in state=".concat(i2.d.C(i10)), exc);
            if (b(4)) {
                e();
                r();
                this.f15011i.removeCallbacks(this.T);
                q0 q0Var = this.P;
                if (q0Var != null) {
                    this.f15013k.execute(new i0(this, q0Var, exc));
                }
                v(9);
                m("error");
                o60 o60Var = (o60) this.d.f14503b;
                o60Var.x();
                FileLog.e(exc);
                c11 c11Var = o60Var.T;
                if (c11Var != null) {
                    c11Var.d(true);
                }
                o60Var.T = null;
                MediaController.getInstance().requestRecordAudioFocus(false);
                if (o60Var.f27866f0) {
                    o60Var.u(6);
                } else {
                    NotificationCenter.getInstance(o60Var.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStartError, Integer.valueOf(o60Var.f27873n));
                }
                o60Var.w(false, false);
                if (!this.B && !this.f15014l.Y()) {
                    i();
                    return;
                }
                this.B = true;
                this.A = true;
            }
        }
    }

    public final void i() {
        if (this.C) {
            return;
        }
        this.C = true;
        m("cancelled");
        f0 f0Var = new f0(this, 0);
        ExecutorService executorService = this.f15012j;
        executorService.execute(f0Var);
        this.f15014l.M();
        this.f15011i.removeCallbacksAndMessages(null);
        executorService.shutdown();
        this.f15013k.shutdown();
    }

    public final long j() {
        t();
        if (this.W != 3) {
            return this.E;
        }
        return Math.min(this.f15017o, (SystemClock.elapsedRealtime() + this.E) - this.F);
    }

    public final void k(q0 q0Var, int i10) {
        synchronized (this.f15010g) {
            try {
                if (!q0Var.d && !q0Var.e) {
                    q0Var.d = true;
                    p pVar = this.f15015m;
                    pVar.b("output generation invalidated: id=" + q0Var.f14945a + ", reason=" + i2.d.B(i10) + ", availableSize=" + q0Var.f14947c);
                    this.f15013k.execute(new i0(this, q0Var, i10, 0));
                }
            } finally {
            }
        }
    }

    public final boolean l() {
        long j10 = this.K;
        if (j10 <= 0) {
            j10 = this.E;
        }
        if (j10 <= this.f15017o && this.G <= 0 && this.H + 10 >= j10) {
            return false;
        }
        return true;
    }

    public final void m(String str) {
        long j10;
        if (this.O) {
            return;
        }
        this.O = true;
        q0 q0Var = this.P;
        p pVar = this.f15015m;
        StringBuilder v = a1.g.v("session summary: terminal=", str, ", state=");
        v.append(i2.d.C(this.W));
        v.append(", durationMs=");
        v.append(j());
        v.append(", pauses=");
        v.append(this.L);
        v.append(", resumes=");
        v.append(this.M);
        v.append(", cameraSwitches=");
        v.append(this.N);
        v.append(", facing=");
        v.append(this.f15019q);
        v.append(", cameraMode=");
        v.append(this.f15020r);
        v.append(", generation=");
        long j11 = 0;
        if (q0Var == null) {
            j10 = 0;
        } else {
            j10 = q0Var.f14945a;
        }
        v.append(j10);
        v.append(", availableSize=");
        if (q0Var != null) {
            j11 = q0Var.f14947c;
        }
        v.append(j11);
        pVar.b(v.toString());
    }

    public final void n() {
        n0 n0Var = this.f15018p;
        n0 n0Var2 = this.f15019q;
        m0 m0Var = new m0(n0Var, n0Var2, this.X, this.f15022t);
        o60 o60Var = (o60) this.d.f14503b;
        o60Var.S = m0Var;
        if (n0Var2 != null) {
            si.e.f45490j.b(n0Var2);
        }
        o60Var.y();
    }

    public final void o() {
        int i10;
        int i11 = this.W;
        long j10 = this.E;
        long j11 = this.F;
        boolean z10 = this.f15024w;
        boolean z11 = this.f15023u;
        long j12 = this.f15017o;
        t0 t0Var = new t0(i11, j10, j11, j12, z10, z11);
        o60 o60Var = (o60) this.d.f14503b;
        t0 t0Var2 = o60Var.R;
        int i12 = o60Var.h;
        if (t0Var2 == null) {
            i10 = 0;
        } else {
            i10 = t0Var2.f14957a;
        }
        o60Var.R = t0Var;
        if (i10 == 3 && i11 != 3) {
            o60Var.v(true);
        }
        o60Var.f27883u0 = Math.max(o60Var.f27883u0, j10);
        if (i11 == 3) {
            if (!o60Var.C0) {
                o60Var.C0 = true;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            }
            o60.m(o60Var);
            o60.n(o60Var, true);
            o60Var.A();
            if (!o60Var.f27866f0) {
                o60Var.f27866f0 = true;
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(o60Var.f27873n), Boolean.FALSE);
            } else if (o60Var.f27867g0) {
                o60Var.f27867g0 = false;
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordResumed, new Object[0]);
            }
        } else {
            o60.n(o60Var, false);
            o60Var.f27885w.setProgress(((float) j10) / ((float) j12));
        }
        if (i11 == 8 || i11 == 9 || i11 == 10) {
            o60Var.q();
            o60Var.x();
        }
        if (i10 == 3 && i11 == 4) {
            o60Var.u(2);
        }
        o60Var.y();
    }

    public final void p() {
        t();
        if (this.W != 3) {
            return;
        }
        this.E = j();
        this.L++;
        this.f15015m.b("pause requested: durationMs=" + this.E);
        e();
        this.f15011i.removeCallbacks(this.T);
        v(4);
        boolean Y = this.f15014l.Y();
        this.B = Y;
        if (!Y) {
            h(new IllegalStateException("Unable to stop the camera segment"));
        }
    }

    public final void q() {
        i2.h0 h0Var;
        t();
        if (this.W == 5 && (h0Var = this.S) != null) {
            long M0 = h0Var.M0();
            long j10 = this.G;
            if (M0 < j10 || M0 >= this.H) {
                this.S.Z0(5, j10);
            }
            this.S.i();
            x(true);
        }
    }

    public final void r() {
        this.f15011i.removeCallbacks(this.U);
        this.f15025x = false;
        i2.h0 h0Var = this.S;
        if (h0Var == null) {
            return;
        }
        h0Var.C(this.V);
        i2.h0 h0Var2 = this.S;
        h0Var2.F1();
        TextureView textureView = this.f15007b;
        if (textureView != null && textureView == h0Var2.X) {
            h0Var2.F1();
            h0Var2.s1();
            h0Var2.x1(null);
            h0Var2.q1(0, 0);
        }
        this.S.X0();
        this.S = null;
    }

    public final void s(File file, long j10, long j11, boolean z10, int i10) {
        long nanoTime = System.nanoTime();
        p pVar = this.f15015m;
        StringBuilder t10 = a1.g.t(j10, "final range remux started: range=", "..");
        t10.append(j11);
        t10.append(", includeAudio=");
        t10.append(z10);
        t10.append(", reason=");
        t10.append(i2.d.B(i10));
        pVar.b(t10.toString());
        g();
        k(this.P, i10);
        c(z10);
        g();
        a3.z a2 = w7.p.a(file, this.Q, j10, j11, z10);
        this.Q.g();
        long e = w7.p.e(this.Q.f15037a) / 1000;
        p pVar2 = this.f15015m;
        StringBuilder t11 = a1.g.t(e, "final range remux completed: durationMs=", ", requestedDurationMs=");
        t11.append(a2.f207b);
        t11.append(", actualStartMs=");
        t11.append(a2.f206a);
        t11.append(", size=");
        t11.append(this.Q.f15037a.length());
        t11.append(", elapsedMs=");
        t11.append(f(nanoTime));
        pVar2.b(t11.toString());
        g();
        this.f15013k.execute(new j0(this, this.P, this.Q.f15037a, e, z10));
    }

    public final void u(boolean z10) {
        if (this.v != z10) {
            this.v = z10;
            xv xvVar = this.f15009f;
            if (xvVar != null) {
                o60.j((o60) xvVar.f31335b, z10);
            }
        }
    }

    public final void v(int i10) {
        int i11 = this.W;
        this.W = i10;
        this.f15015m.b("state: " + i2.d.C(i11) + " -> " + i2.d.C(i10) + ", durationMs=" + j());
        o();
    }

    public final void w(float f7) {
        t();
        if (this.W == 3 && !this.f15024w) {
            this.f15014l.U(Math.max(0.0f, Math.min(1.0f, f7)));
        }
    }

    public final void x(boolean z10) {
        if (this.f15025x == z10) {
            return;
        }
        this.f15025x = z10;
        Handler handler = this.f15011i;
        androidx.activity.i iVar = this.U;
        handler.removeCallbacks(iVar);
        if (z10) {
            handler.post(iVar);
        }
        this.d.getClass();
        o();
    }
}
