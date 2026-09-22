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
import org.telegram.messenger.SharedSettings;
import org.telegram.ui.Components.b60;
import org.telegram.ui.Components.mv;
import org.telegram.ui.Components.r01;
import org.telegram.ui.Components.x50;
public final class q0 {
    public boolean A;
    public boolean B;
    public volatile boolean C;
    public long D;
    public long E;
    public long F;
    public long G;
    public long I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public volatile m0 N;
    public volatile q O;
    public volatile File P;
    public i2.e0 Q;
    public final f0 T;
    public final Context f13828a;
    public final TextureView f13829b;
    public final x50 f13830c;
    public final n0 d;
    public final mv e;
    public final h f13835k;
    public final k f13836l;
    public final o0 f13837m;
    public final long f13838n;
    public i0 f13839o;
    public i0 f13840p;
    public j0 f13841q;
    public k0 f13842r;
    public boolean f13844t;
    public boolean f13845u;
    public boolean v;
    public boolean f13846w;
    public boolean f13847x;
    public boolean f13848y;
    public boolean f13849z;
    public final Object f13831f = new Object();
    public final Matrix f13832g = new Matrix();
    public final Handler h = new Handler(Looper.getMainLooper());
    public final ExecutorService f13833i = Executors.newSingleThreadExecutor(new e2.c0(1));
    public final ExecutorService f13834j = Executors.newSingleThreadExecutor(new e2.c0(2));
    public int U = 1;
    public int V = 1;
    public float f13843s = 1.0f;
    public long H = 1;
    public final y R = new y(this, 1);
    public final q4 S = new q4(this, 24);

    public q0(g0 g0Var) {
        Context context;
        e0 e0Var = new e0(this, 0);
        this.T = new f0(this, 0);
        s();
        Context context2 = g0Var.f13681a;
        Context applicationContext = context2.getApplicationContext();
        if (applicationContext == null) {
            context = context2;
        } else {
            context = applicationContext;
        }
        this.f13828a = context;
        TextureView textureView = g0Var.f13682b;
        this.f13829b = textureView;
        this.f13839o = g0Var.f13683c;
        o0 o0Var = g0Var.d;
        this.f13837m = o0Var;
        int i10 = g0Var.f13685g;
        j0 j0Var = g0Var.e;
        k0 k0Var = g0Var.f13684f;
        this.f13838n = 60000L;
        boolean z10 = g0Var.h;
        this.f13830c = g0Var.f13686i;
        this.d = g0Var.f13687j;
        this.e = g0Var.f13688k;
        k kVar = new k();
        this.f13836l = kVar;
        StringBuilder sb2 = new StringBuilder("session created: device=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(" ");
        sb2.append(Build.MODEL);
        sb2.append(", sdk=");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append(", output=");
        sb2.append(o0Var.f13808a);
        sb2.append("x");
        hg.k0.t(sb2, o0Var.f13808a, ", bitrate=", i10, ", cameraMode=");
        sb2.append(j0Var);
        sb2.append(", fps=");
        sb2.append(k0Var.f13774a);
        sb2.append(", composition=");
        sb2.append(z10);
        sb2.append(", facing=");
        sb2.append(this.f13839o);
        sb2.append(", maxDurationMs=60000");
        kVar.b(sb2.toString());
        this.f13835k = new h(context, textureView, o0Var, i10, j0Var, k0Var, z10, kVar, e0Var);
    }

    public static long e(long j3) {
        return (System.nanoTime() - j3) / 1000000;
    }

    public static void s() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("RoundVideoSession must be used from the main thread");
    }

    public final void a() {
        s();
        int i10 = this.U;
        if (i10 != 10 && i10 != 8) {
            this.f13836l.b("cancel requested: state=".concat(hg.k0.C(i10)));
            this.C = true;
            d();
            q();
            m0 m0Var = this.N;
            if (m0Var != null) {
                j(m0Var, 3);
            }
            u(10);
            if (!this.A && !this.f13835k.E()) {
                h();
                return;
            }
            this.A = true;
            this.f13849z = true;
        }
    }

    public final void b(m0 m0Var, File file, long j3, boolean z10) {
        if (!this.C && !m0Var.d) {
            this.f13834j.execute(new b0(this, m0Var, file, j3, z10));
        }
    }

    public final void c(boolean z10) {
        synchronized (this.f13831f) {
            f();
            File createTempFile = File.createTempFile("round_video_", ".mp4", this.f13828a.getCacheDir());
            long j3 = this.H;
            this.H = 1 + j3;
            m0 m0Var = new m0(j3, createTempFile);
            this.N = m0Var;
            this.O = new q(createTempFile, this.f13837m.f13808a, z10, this.f13836l, new ah.b(23, this, m0Var));
            k kVar = this.f13836l;
            kVar.b("output generation started: id=" + j3 + ", includeAudio=" + z10 + ", file=" + createTempFile.getName());
            this.f13834j.execute(new gg.t(this, m0Var, createTempFile, 24));
        }
    }

    public final void d() {
        this.f13844t = false;
        h hVar = this.f13835k;
        hVar.A(0.0f);
        hVar.z(false);
        t(false);
    }

    public final void f() {
        if (!this.C) {
            return;
        }
        throw new IOException("Round-video operation was cancelled");
    }

    public final void g(Exception exc) {
        int i10 = this.U;
        if (i10 != 9 && i10 != 10) {
            this.f13836l.a("fatal error in state=".concat(hg.k0.C(i10)), exc);
            this.C = true;
            d();
            q();
            this.h.removeCallbacks(this.R);
            m0 m0Var = this.N;
            if (m0Var != null) {
                j(m0Var, 4);
            }
            m0 m0Var2 = this.N;
            if (m0Var2 != null) {
                this.f13834j.execute(new c0(this, m0Var2, exc));
            }
            u(9);
            l("error");
            b60 b60Var = this.f13830c.f30225a;
            b60Var.t();
            FileLog.e(exc);
            r01 r01Var = b60Var.Q;
            if (r01Var != null) {
                r01Var.b(true);
            }
            b60Var.Q = null;
            NotificationCenter.getInstance(b60Var.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStartError, Integer.valueOf(b60Var.f22883n));
            if (!this.A && !this.f13835k.E()) {
                h();
                return;
            }
            this.A = true;
            this.f13849z = true;
        }
    }

    public final void h() {
        if (this.B) {
            return;
        }
        this.B = true;
        l("cancelled");
        y yVar = new y(this, 0);
        ExecutorService executorService = this.f13833i;
        executorService.execute(yVar);
        this.f13835k.t();
        this.h.removeCallbacksAndMessages(null);
        executorService.shutdown();
        this.f13834j.shutdown();
    }

    public final long i() {
        s();
        if (this.U != 3) {
            return this.D;
        }
        return Math.min(this.f13838n, (SystemClock.elapsedRealtime() + this.D) - this.E);
    }

    public final void j(m0 m0Var, int i10) {
        synchronized (this.f13831f) {
            try {
                if (m0Var.d) {
                    return;
                }
                m0Var.d = true;
                k kVar = this.f13836l;
                kVar.b("output generation invalidated: id=" + m0Var.f13780a + ", reason=" + hg.k0.B(i10) + ", availableSize=" + m0Var.f13782c);
                this.f13834j.execute(new c0(this, m0Var, i10));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean k() {
        if (this.F <= 0 && this.G + 10 >= this.D) {
            return false;
        }
        return true;
    }

    public final void l(String str) {
        long j3;
        if (this.M) {
            return;
        }
        this.M = true;
        m0 m0Var = this.N;
        k kVar = this.f13836l;
        StringBuilder v = a4.a.v("session summary: terminal=", str, ", state=");
        v.append(hg.k0.C(this.U));
        v.append(", durationMs=");
        v.append(i());
        v.append(", pauses=");
        v.append(this.J);
        v.append(", resumes=");
        v.append(this.K);
        v.append(", cameraSwitches=");
        v.append(this.L);
        v.append(", facing=");
        v.append(this.f13840p);
        v.append(", cameraMode=");
        v.append(this.f13841q);
        v.append(", generation=");
        long j10 = 0;
        if (m0Var == null) {
            j3 = 0;
        } else {
            j3 = m0Var.f13780a;
        }
        v.append(j3);
        v.append(", availableSize=");
        if (m0Var != null) {
            j10 = m0Var.f13782c;
        }
        v.append(j10);
        kVar.b(v.toString());
    }

    public final void m() {
        i0 i0Var = this.f13839o;
        i0 i0Var2 = this.f13840p;
        h0 h0Var = new h0(i0Var, i0Var2, this.V, this.f13843s);
        b60 b60Var = this.f13830c.f30225a;
        b60Var.P = h0Var;
        if (i0Var2 != null) {
            SharedSettings.roundVideoLastCamera.set(i0Var2);
        }
        b60.k(b60Var);
    }

    public final void n() {
        int i10;
        int i11 = this.U;
        long j3 = this.D;
        long j10 = this.E;
        boolean z10 = this.v;
        boolean z11 = this.f13844t;
        long j11 = this.f13838n;
        p0 p0Var = new p0(i11, j3, j10, j11, z10, z11);
        b60 b60Var = this.f13830c.f30225a;
        p0 p0Var2 = b60Var.O;
        int i12 = b60Var.h;
        if (p0Var2 == null) {
            i10 = 0;
        } else {
            i10 = p0Var2.f13812a;
        }
        b60Var.O = p0Var;
        if (i10 == 3 && i11 != 3) {
            b60Var.r(true);
        }
        b60Var.f22881k0 = Math.max(b60Var.f22881k0, j3);
        if (i11 == 3) {
            if (!b60Var.f22891s0) {
                b60Var.f22891s0 = true;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            }
            b60.l(b60Var);
            b60.m(b60Var, true);
            b60Var.v();
            if (!b60Var.f22871b0) {
                b60Var.f22871b0 = true;
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(b60Var.f22883n), Boolean.FALSE);
            } else if (b60Var.f22872c0) {
                b60Var.f22872c0 = false;
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordResumed, new Object[0]);
            }
        } else {
            b60.m(b60Var, false);
            b60Var.f22895w.setProgress(((float) j3) / ((float) j11));
        }
        if (i11 == 8 || i11 == 9 || i11 == 10) {
            b60Var.t();
        }
        if (i10 == 3 && i11 == 4) {
            b60Var.q(2);
        }
        b60.k(b60Var);
    }

    public final void o() {
        s();
        if (this.U != 3) {
            return;
        }
        this.D = i();
        this.J++;
        this.f13836l.b("pause requested: durationMs=" + this.D);
        d();
        this.h.removeCallbacks(this.R);
        u(4);
        boolean E = this.f13835k.E();
        this.A = E;
        if (!E) {
            g(new IllegalStateException("Unable to stop the camera segment"));
        }
    }

    public final void p() {
        i2.e0 e0Var;
        s();
        if (this.U == 5 && (e0Var = this.Q) != null) {
            long J0 = e0Var.J0();
            long j3 = this.F;
            if (J0 < j3 || J0 >= this.G) {
                this.Q.W0(5, j3);
            }
            this.Q.i();
            w(true);
        }
    }

    public final void q() {
        this.h.removeCallbacks(this.S);
        this.f13846w = false;
        i2.e0 e0Var = this.Q;
        if (e0Var == null) {
            return;
        }
        e0Var.D(this.T);
        i2.e0 e0Var2 = this.Q;
        e0Var2.B1();
        TextureView textureView = this.f13829b;
        if (textureView != null && textureView == e0Var2.V) {
            e0Var2.B1();
            e0Var2.o1();
            e0Var2.t1(null);
            e0Var2.m1(0, 0);
        }
        this.Q.U0();
        this.Q = null;
    }

    public final void r(File file, long j3, long j10, boolean z10, int i10) {
        long nanoTime = System.nanoTime();
        k kVar = this.f13836l;
        StringBuilder t10 = a4.a.t(j3, "final range remux started: range=", "..");
        t10.append(j10);
        t10.append(", includeAudio=");
        t10.append(z10);
        t10.append(", reason=");
        t10.append(hg.k0.B(i10));
        kVar.b(t10.toString());
        f();
        j(this.N, i10);
        c(z10);
        f();
        a3.z a2 = w7.k.a(file, this.O, j3, j10, z10);
        this.O.c();
        k kVar2 = this.f13836l;
        kVar2.b("final range remux completed: durationMs=" + a2.f203b + ", actualStartMs=" + a2.f202a + ", size=" + this.O.f13816a.length() + ", elapsedMs=" + e(nanoTime));
        f();
        b(this.N, this.O.f13816a, a2.f203b, z10);
    }

    public final void t(boolean z10) {
        if (this.f13845u != z10) {
            this.f13845u = z10;
            mv mvVar = this.e;
            if (mvVar != null) {
                b60.j((b60) mvVar.f26549b, z10);
            }
        }
    }

    public final void u(int i10) {
        int i11 = this.U;
        this.U = i10;
        this.f13836l.b("state: " + hg.k0.C(i11) + " -> " + hg.k0.C(i10) + ", durationMs=" + i());
        n();
    }

    public final void v(float f7) {
        s();
        if (this.U == 3 && !this.v) {
            this.f13835k.A(Math.max(0.0f, Math.min(1.0f, f7)));
        }
    }

    public final void w(boolean z10) {
        if (this.f13846w == z10) {
            return;
        }
        this.f13846w = z10;
        Handler handler = this.h;
        q4 q4Var = this.S;
        handler.removeCallbacks(q4Var);
        if (z10) {
            handler.post(q4Var);
        }
        this.f13830c.getClass();
        n();
    }
}
