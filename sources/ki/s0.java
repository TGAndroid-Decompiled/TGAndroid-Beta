package ki;

import ai.q4;
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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.ov;
import org.telegram.ui.Components.r01;
public final class s0 {
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
    public volatile o0 P;
    public volatile t Q;
    public volatile File R;
    public i2.f0 S;
    public final i0 V;
    public final Context f13858a;
    public final TextureView f13859b;
    public final File f13860c;
    public final l.d d;
    public final p0 e;
    public final ov f13861f;
    public final i f13866l;
    public final m f13867m;
    public final q0 f13868n;
    public final long f13869o;
    public l0 f13870p;
    public l0 f13871q;
    public m0 f13872r;
    public n0 f13873s;
    public boolean f13875u;
    public boolean v;
    public boolean f13876w;
    public boolean f13877x;
    public boolean f13878y;
    public boolean f13879z;
    public final Object f13862g = new Object();
    public final Matrix h = new Matrix();
    public final Handler f13863i = new Handler(Looper.getMainLooper());
    public final ExecutorService f13864j = Executors.newSingleThreadExecutor(new e2.c0(1));
    public final ExecutorService f13865k = Executors.newSingleThreadExecutor(new e2.c0(2));
    public int W = 1;
    public int X = 1;
    public float f13874t = 1.0f;
    public long I = 1;
    public final b0 T = new b0(this, 1);
    public final q4 U = new q4(this, 24);

    public s0(j0 j0Var) {
        Context context;
        k2.u uVar = new k2.u(this, 1);
        this.V = new i0(this, 0);
        t();
        Context context2 = j0Var.f13764a;
        Context applicationContext = context2.getApplicationContext();
        if (applicationContext == null) {
            context = context2;
        } else {
            context = applicationContext;
        }
        this.f13858a = context;
        TextureView textureView = j0Var.f13765b;
        this.f13859b = textureView;
        File file = j0Var.f13766c;
        this.f13860c = file == null ? context.getCacheDir() : file;
        this.f13870p = j0Var.d;
        q0 q0Var = j0Var.e;
        this.f13868n = q0Var;
        int i10 = j0Var.h;
        m0 m0Var = j0Var.f13767f;
        n0 n0Var = j0Var.f13768g;
        this.f13869o = 60000L;
        boolean z10 = j0Var.f13769i;
        this.d = j0Var.f13770j;
        this.e = j0Var.f13771k;
        this.f13861f = j0Var.f13772l;
        m mVar = new m();
        this.f13867m = mVar;
        StringBuilder sb2 = new StringBuilder("session created: device=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(" ");
        sb2.append(Build.MODEL);
        sb2.append(", sdk=");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append(", output=");
        sb2.append(q0Var.f13847a);
        sb2.append("x");
        hg.c.t(sb2, q0Var.f13847a, ", bitrate=", i10, ", cameraMode=");
        sb2.append(m0Var);
        sb2.append(", fps=");
        sb2.append(n0Var.f13813a);
        sb2.append(", composition=");
        sb2.append(z10);
        sb2.append(", facing=");
        sb2.append(this.f13870p);
        sb2.append(", maxDurationMs=60000");
        mVar.b(sb2.toString());
        this.f13866l = new i(context, textureView, q0Var, i10, m0Var, n0Var, z10, mVar, uVar);
    }

    public static long f(long j3) {
        return (System.nanoTime() - j3) / 1000000;
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
            this.f13867m.b("cancel requested: state=".concat(hg.c.C(i10)));
            if (b(3)) {
                e();
                r();
                v(10);
                if (!this.B && !this.f13866l.D()) {
                    i();
                    return;
                }
                this.B = true;
                this.A = true;
            }
        }
    }

    public final boolean b(int i10) {
        synchronized (this.f13862g) {
            try {
                o0 o0Var = this.P;
                if (o0Var != null && o0Var.e) {
                    return false;
                }
                this.D = true;
                if (o0Var != null && !o0Var.d) {
                    o0Var.d = true;
                    m mVar = this.f13867m;
                    mVar.b("output generation invalidated: id=" + o0Var.f13815a + ", reason=" + hg.c.B(i10) + ", availableSize=" + o0Var.f13817c);
                    this.f13865k.execute(new e0(this, o0Var, i10, 1));
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(boolean z10) {
        synchronized (this.f13862g) {
            g();
            File d = d("round_video_");
            long j3 = this.I;
            this.I = 1 + j3;
            o0 o0Var = new o0(j3, d);
            this.P = o0Var;
            this.Q = new t(d, this.f13868n.f13847a, z10, this.f13867m, new ah.b(23, this, o0Var));
            m mVar = this.f13867m;
            mVar.b("output generation started: id=" + j3 + ", includeAudio=" + z10 + ", file=" + d.getName());
            this.f13865k.execute(new gg.t(this, o0Var, d, 24));
        }
    }

    public final File d(String str) {
        File file = this.f13860c;
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
        this.f13875u = false;
        i iVar = this.f13866l;
        iVar.z(0.0f);
        iVar.y(false);
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
            this.f13867m.a("fatal error in state=".concat(hg.c.C(i10)), exc);
            if (b(4)) {
                e();
                r();
                this.f13863i.removeCallbacks(this.T);
                o0 o0Var = this.P;
                if (o0Var != null) {
                    this.f13865k.execute(new e0(this, o0Var, exc));
                }
                v(9);
                m("error");
                e60 e60Var = (e60) this.d.f13940a;
                e60Var.u();
                FileLog.e(exc);
                r01 r01Var = e60Var.T;
                if (r01Var != null) {
                    r01Var.d(true);
                }
                e60Var.T = null;
                NotificationCenter.getInstance(e60Var.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStartError, Integer.valueOf(e60Var.f23871n));
                if (!this.B && !this.f13866l.D()) {
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
        b0 b0Var = new b0(this, 0);
        ExecutorService executorService = this.f13864j;
        executorService.execute(b0Var);
        this.f13866l.s();
        this.f13863i.removeCallbacksAndMessages(null);
        executorService.shutdown();
        this.f13865k.shutdown();
    }

    public final long j() {
        t();
        if (this.W != 3) {
            return this.E;
        }
        return Math.min(this.f13869o, (SystemClock.elapsedRealtime() + this.E) - this.F);
    }

    public final void k(o0 o0Var, int i10) {
        synchronized (this.f13862g) {
            try {
                if (!o0Var.d && !o0Var.e) {
                    o0Var.d = true;
                    m mVar = this.f13867m;
                    mVar.b("output generation invalidated: id=" + o0Var.f13815a + ", reason=" + hg.c.B(i10) + ", availableSize=" + o0Var.f13817c);
                    this.f13865k.execute(new e0(this, o0Var, i10, 0));
                }
            } finally {
            }
        }
    }

    public final boolean l() {
        long j3 = this.K;
        if (j3 <= 0) {
            j3 = this.E;
        }
        if (j3 <= this.f13869o && this.G <= 0 && this.H + 10 >= j3) {
            return false;
        }
        return true;
    }

    public final void m(String str) {
        long j3;
        if (this.O) {
            return;
        }
        this.O = true;
        o0 o0Var = this.P;
        m mVar = this.f13867m;
        StringBuilder w10 = a4.a.w("session summary: terminal=", str, ", state=");
        w10.append(hg.c.C(this.W));
        w10.append(", durationMs=");
        w10.append(j());
        w10.append(", pauses=");
        w10.append(this.L);
        w10.append(", resumes=");
        w10.append(this.M);
        w10.append(", cameraSwitches=");
        w10.append(this.N);
        w10.append(", facing=");
        w10.append(this.f13871q);
        w10.append(", cameraMode=");
        w10.append(this.f13872r);
        w10.append(", generation=");
        long j10 = 0;
        if (o0Var == null) {
            j3 = 0;
        } else {
            j3 = o0Var.f13815a;
        }
        w10.append(j3);
        w10.append(", availableSize=");
        if (o0Var != null) {
            j10 = o0Var.f13817c;
        }
        w10.append(j10);
        mVar.b(w10.toString());
    }

    public final void n() {
        l0 l0Var = this.f13870p;
        l0 l0Var2 = this.f13871q;
        k0 k0Var = new k0(l0Var, l0Var2, this.X, this.f13874t);
        e60 e60Var = (e60) this.d.f13940a;
        e60Var.S = k0Var;
        if (l0Var2 != null) {
            pi.e.h.b(l0Var2);
        }
        e60.k(e60Var);
    }

    public final void o() {
        int i10;
        int i11 = this.W;
        long j3 = this.E;
        long j10 = this.F;
        boolean z10 = this.f13876w;
        boolean z11 = this.f13875u;
        long j11 = this.f13869o;
        r0 r0Var = new r0(i11, j3, j10, j11, z10, z11);
        e60 e60Var = (e60) this.d.f13940a;
        r0 r0Var2 = e60Var.R;
        int i12 = e60Var.h;
        if (r0Var2 == null) {
            i10 = 0;
        } else {
            i10 = r0Var2.f13851a;
        }
        e60Var.R = r0Var;
        if (i10 == 3 && i11 != 3) {
            e60Var.s(true);
        }
        e60Var.f23872n0 = Math.max(e60Var.f23872n0, j3);
        if (i11 == 3) {
            if (!e60Var.f23882v0) {
                e60Var.f23882v0 = true;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            }
            e60.l(e60Var);
            e60.m(e60Var, true);
            e60Var.w();
            if (!e60Var.f23862e0) {
                e60Var.f23862e0 = true;
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(e60Var.f23871n), Boolean.FALSE);
            } else if (e60Var.f23864f0) {
                e60Var.f23864f0 = false;
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordResumed, new Object[0]);
            }
        } else {
            e60.m(e60Var, false);
            e60Var.f23883w.setProgress(((float) j3) / ((float) j11));
        }
        if (i11 == 8 || i11 == 9 || i11 == 10) {
            e60Var.u();
        }
        if (i10 == 3 && i11 == 4) {
            e60Var.r(2);
        }
        e60.k(e60Var);
    }

    public final void p() {
        t();
        if (this.W != 3) {
            return;
        }
        this.E = j();
        this.L++;
        this.f13867m.b("pause requested: durationMs=" + this.E);
        e();
        this.f13863i.removeCallbacks(this.T);
        v(4);
        boolean D = this.f13866l.D();
        this.B = D;
        if (!D) {
            h(new IllegalStateException("Unable to stop the camera segment"));
        }
    }

    public final void q() {
        i2.f0 f0Var;
        t();
        if (this.W == 5 && (f0Var = this.S) != null) {
            long J0 = f0Var.J0();
            long j3 = this.G;
            if (J0 < j3 || J0 >= this.H) {
                this.S.W0(5, j3);
            }
            this.S.i();
            x(true);
        }
    }

    public final void r() {
        this.f13863i.removeCallbacks(this.U);
        this.f13877x = false;
        i2.f0 f0Var = this.S;
        if (f0Var == null) {
            return;
        }
        f0Var.D(this.V);
        i2.f0 f0Var2 = this.S;
        f0Var2.B1();
        TextureView textureView = this.f13859b;
        if (textureView != null && textureView == f0Var2.V) {
            f0Var2.B1();
            f0Var2.o1();
            f0Var2.t1(null);
            f0Var2.m1(0, 0);
        }
        this.S.U0();
        this.S = null;
    }

    public final void s(File file, long j3, long j10, boolean z10, int i10) {
        long nanoTime = System.nanoTime();
        m mVar = this.f13867m;
        StringBuilder u10 = a4.a.u(j3, "final range remux started: range=", "..");
        u10.append(j10);
        u10.append(", includeAudio=");
        u10.append(z10);
        u10.append(", reason=");
        u10.append(hg.c.B(i10));
        mVar.b(u10.toString());
        g();
        k(this.P, i10);
        c(z10);
        g();
        a3.z a2 = w7.k.a(file, this.Q, j3, j10, z10);
        this.Q.f();
        long e = w7.k.e(this.Q.f13880a) / 1000;
        m mVar2 = this.f13867m;
        StringBuilder u11 = a4.a.u(e, "final range remux completed: durationMs=", ", requestedDurationMs=");
        u11.append(a2.f203b);
        u11.append(", actualStartMs=");
        u11.append(a2.f202a);
        u11.append(", size=");
        u11.append(this.Q.f13880a.length());
        u11.append(", elapsedMs=");
        u11.append(f(nanoTime));
        mVar2.b(u11.toString());
        g();
        this.f13865k.execute(new f0(this, this.P, this.Q.f13880a, e, z10));
    }

    public final void u(boolean z10) {
        if (this.v != z10) {
            this.v = z10;
            ov ovVar = this.f13861f;
            if (ovVar != null) {
                e60.j((e60) ovVar.f27180b, z10);
            }
        }
    }

    public final void v(int i10) {
        int i11 = this.W;
        this.W = i10;
        this.f13867m.b("state: " + hg.c.C(i11) + " -> " + hg.c.C(i10) + ", durationMs=" + j());
        o();
    }

    public final void w(float f7) {
        t();
        if (this.W == 3 && !this.f13876w) {
            this.f13866l.z(Math.max(0.0f, Math.min(1.0f, f7)));
        }
    }

    public final void x(boolean z10) {
        if (this.f13877x == z10) {
            return;
        }
        this.f13877x = z10;
        Handler handler = this.f13863i;
        q4 q4Var = this.U;
        handler.removeCallbacks(q4Var);
        if (z10) {
            handler.post(q4Var);
        }
        this.d.getClass();
        o();
    }
}
