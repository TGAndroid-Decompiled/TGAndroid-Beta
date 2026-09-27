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
import org.telegram.ui.Components.d60;
import org.telegram.ui.Components.nv;
import org.telegram.ui.Components.q01;
public final class s0 {
    public boolean A;
    public boolean B;
    public volatile boolean C;
    public long D;
    public long E;
    public long F;
    public long G;
    public long I;
    public long J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public volatile o0 O;
    public volatile t P;
    public volatile File Q;
    public i2.f0 R;
    public final i0 U;
    public final Context f13844a;
    public final TextureView f13845b;
    public final ka.c f13846c;
    public final p0 d;
    public final nv e;
    public final i f13851k;
    public final m f13852l;
    public final q0 f13853m;
    public final long f13854n;
    public l0 f13855o;
    public l0 f13856p;
    public m0 f13857q;
    public n0 f13858r;
    public boolean f13860t;
    public boolean f13861u;
    public boolean v;
    public boolean f13862w;
    public boolean f13863x;
    public boolean f13864y;
    public boolean f13865z;
    public final Object f13847f = new Object();
    public final Matrix f13848g = new Matrix();
    public final Handler h = new Handler(Looper.getMainLooper());
    public final ExecutorService f13849i = Executors.newSingleThreadExecutor(new e2.c0(1));
    public final ExecutorService f13850j = Executors.newSingleThreadExecutor(new e2.c0(2));
    public int V = 1;
    public int W = 1;
    public float f13859s = 1.0f;
    public long H = 1;
    public final b0 S = new b0(this, 1);
    public final q4 T = new q4(this, 24);

    public s0(j0 j0Var) {
        Context context;
        k2.u uVar = new k2.u(this);
        this.U = new i0(this, 0);
        s();
        Context context2 = j0Var.f13751a;
        Context applicationContext = context2.getApplicationContext();
        if (applicationContext == null) {
            context = context2;
        } else {
            context = applicationContext;
        }
        this.f13844a = context;
        TextureView textureView = j0Var.f13752b;
        this.f13845b = textureView;
        this.f13855o = j0Var.f13753c;
        q0 q0Var = j0Var.d;
        this.f13853m = q0Var;
        int i10 = j0Var.f13755g;
        m0 m0Var = j0Var.e;
        n0 n0Var = j0Var.f13754f;
        this.f13854n = 60000L;
        boolean z10 = j0Var.h;
        this.f13846c = j0Var.f13756i;
        this.d = j0Var.f13757j;
        this.e = j0Var.f13758k;
        m mVar = new m();
        this.f13852l = mVar;
        StringBuilder sb2 = new StringBuilder("session created: device=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(" ");
        sb2.append(Build.MODEL);
        sb2.append(", sdk=");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append(", output=");
        sb2.append(q0Var.f13833a);
        sb2.append("x");
        hg.k0.t(sb2, q0Var.f13833a, ", bitrate=", i10, ", cameraMode=");
        sb2.append(m0Var);
        sb2.append(", fps=");
        sb2.append(n0Var.f13799a);
        sb2.append(", composition=");
        sb2.append(z10);
        sb2.append(", facing=");
        sb2.append(this.f13855o);
        sb2.append(", maxDurationMs=60000");
        mVar.b(sb2.toString());
        this.f13851k = new i(context, textureView, q0Var, i10, m0Var, n0Var, z10, mVar, uVar);
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
        int i10 = this.V;
        if (i10 != 10 && i10 != 8) {
            this.f13852l.b("cancel requested: state=".concat(hg.k0.C(i10)));
            if (b(3)) {
                d();
                q();
                u(10);
                if (!this.A && !this.f13851k.D()) {
                    h();
                    return;
                }
                this.A = true;
                this.f13865z = true;
            }
        }
    }

    public final boolean b(int i10) {
        synchronized (this.f13847f) {
            try {
                o0 o0Var = this.O;
                if (o0Var != null && o0Var.e) {
                    return false;
                }
                this.C = true;
                if (o0Var != null && !o0Var.d) {
                    o0Var.d = true;
                    m mVar = this.f13852l;
                    mVar.b("output generation invalidated: id=" + o0Var.f13801a + ", reason=" + hg.k0.B(i10) + ", availableSize=" + o0Var.f13803c);
                    this.f13850j.execute(new e0(this, o0Var, i10, 1));
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(boolean z10) {
        synchronized (this.f13847f) {
            f();
            File createTempFile = File.createTempFile("round_video_", ".mp4", this.f13844a.getCacheDir());
            long j3 = this.H;
            this.H = 1 + j3;
            o0 o0Var = new o0(j3, createTempFile);
            this.O = o0Var;
            this.P = new t(createTempFile, this.f13853m.f13833a, z10, this.f13852l, new ah.b(23, this, o0Var));
            m mVar = this.f13852l;
            mVar.b("output generation started: id=" + j3 + ", includeAudio=" + z10 + ", file=" + createTempFile.getName());
            this.f13850j.execute(new gg.t(this, o0Var, createTempFile, 24));
        }
    }

    public final void d() {
        this.f13860t = false;
        i iVar = this.f13851k;
        iVar.z(0.0f);
        iVar.y(false);
        t(false);
    }

    public final void f() {
        if (!this.C) {
            return;
        }
        throw new IOException("Round-video operation was cancelled");
    }

    public final void g(Exception exc) {
        int i10 = this.V;
        if (i10 != 9 && i10 != 10) {
            this.f13852l.a("fatal error in state=".concat(hg.k0.C(i10)), exc);
            if (b(4)) {
                d();
                q();
                this.h.removeCallbacks(this.S);
                o0 o0Var = this.O;
                if (o0Var != null) {
                    this.f13850j.execute(new e0(this, o0Var, exc));
                }
                u(9);
                l("error");
                d60 d60Var = (d60) this.f13846c.f13554b;
                d60Var.u();
                FileLog.e(exc);
                q01 q01Var = d60Var.T;
                if (q01Var != null) {
                    q01Var.d(true);
                }
                d60Var.T = null;
                NotificationCenter.getInstance(d60Var.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStartError, Integer.valueOf(d60Var.f23560n));
                if (!this.A && !this.f13851k.D()) {
                    h();
                    return;
                }
                this.A = true;
                this.f13865z = true;
            }
        }
    }

    public final void h() {
        if (this.B) {
            return;
        }
        this.B = true;
        l("cancelled");
        b0 b0Var = new b0(this, 0);
        ExecutorService executorService = this.f13849i;
        executorService.execute(b0Var);
        this.f13851k.s();
        this.h.removeCallbacksAndMessages(null);
        executorService.shutdown();
        this.f13850j.shutdown();
    }

    public final long i() {
        s();
        if (this.V != 3) {
            return this.D;
        }
        return Math.min(this.f13854n, (SystemClock.elapsedRealtime() + this.D) - this.E);
    }

    public final void j(o0 o0Var, int i10) {
        synchronized (this.f13847f) {
            try {
                if (!o0Var.d && !o0Var.e) {
                    o0Var.d = true;
                    m mVar = this.f13852l;
                    mVar.b("output generation invalidated: id=" + o0Var.f13801a + ", reason=" + hg.k0.B(i10) + ", availableSize=" + o0Var.f13803c);
                    this.f13850j.execute(new e0(this, o0Var, i10, 0));
                }
            } finally {
            }
        }
    }

    public final boolean k() {
        long j3 = this.J;
        if (j3 <= 0) {
            j3 = this.D;
        }
        if (j3 <= this.f13854n && this.F <= 0 && this.G + 10 >= j3) {
            return false;
        }
        return true;
    }

    public final void l(String str) {
        long j3;
        if (this.N) {
            return;
        }
        this.N = true;
        o0 o0Var = this.O;
        m mVar = this.f13852l;
        StringBuilder v = a4.a.v("session summary: terminal=", str, ", state=");
        v.append(hg.k0.C(this.V));
        v.append(", durationMs=");
        v.append(i());
        v.append(", pauses=");
        v.append(this.K);
        v.append(", resumes=");
        v.append(this.L);
        v.append(", cameraSwitches=");
        v.append(this.M);
        v.append(", facing=");
        v.append(this.f13856p);
        v.append(", cameraMode=");
        v.append(this.f13857q);
        v.append(", generation=");
        long j10 = 0;
        if (o0Var == null) {
            j3 = 0;
        } else {
            j3 = o0Var.f13801a;
        }
        v.append(j3);
        v.append(", availableSize=");
        if (o0Var != null) {
            j10 = o0Var.f13803c;
        }
        v.append(j10);
        mVar.b(v.toString());
    }

    public final void m() {
        l0 l0Var = this.f13855o;
        l0 l0Var2 = this.f13856p;
        k0 k0Var = new k0(l0Var, l0Var2, this.W, this.f13859s);
        d60 d60Var = (d60) this.f13846c.f13554b;
        d60Var.S = k0Var;
        if (l0Var2 != null) {
            qi.e.h.b(l0Var2);
        }
        d60.k(d60Var);
    }

    public final void n() {
        int i10;
        int i11 = this.V;
        long j3 = this.D;
        long j10 = this.E;
        boolean z10 = this.v;
        boolean z11 = this.f13860t;
        long j11 = this.f13854n;
        r0 r0Var = new r0(i11, j3, j10, j11, z10, z11);
        d60 d60Var = (d60) this.f13846c.f13554b;
        r0 r0Var2 = d60Var.R;
        int i12 = d60Var.h;
        if (r0Var2 == null) {
            i10 = 0;
        } else {
            i10 = r0Var2.f13837a;
        }
        d60Var.R = r0Var;
        if (i10 == 3 && i11 != 3) {
            d60Var.s(true);
        }
        d60Var.f23561n0 = Math.max(d60Var.f23561n0, j3);
        if (i11 == 3) {
            if (!d60Var.f23571v0) {
                d60Var.f23571v0 = true;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            }
            d60.l(d60Var);
            d60.m(d60Var, true);
            d60Var.w();
            if (!d60Var.f23551e0) {
                d60Var.f23551e0 = true;
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(d60Var.f23560n), Boolean.FALSE);
            } else if (d60Var.f23553f0) {
                d60Var.f23553f0 = false;
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordResumed, new Object[0]);
            }
        } else {
            d60.m(d60Var, false);
            d60Var.f23572w.setProgress(((float) j3) / ((float) j11));
        }
        if (i11 == 8 || i11 == 9 || i11 == 10) {
            d60Var.u();
        }
        if (i10 == 3 && i11 == 4) {
            d60Var.r(2);
        }
        d60.k(d60Var);
    }

    public final void o() {
        s();
        if (this.V != 3) {
            return;
        }
        this.D = i();
        this.K++;
        this.f13852l.b("pause requested: durationMs=" + this.D);
        d();
        this.h.removeCallbacks(this.S);
        u(4);
        boolean D = this.f13851k.D();
        this.A = D;
        if (!D) {
            g(new IllegalStateException("Unable to stop the camera segment"));
        }
    }

    public final void p() {
        i2.f0 f0Var;
        s();
        if (this.V == 5 && (f0Var = this.R) != null) {
            long J0 = f0Var.J0();
            long j3 = this.F;
            if (J0 < j3 || J0 >= this.G) {
                this.R.W0(5, j3);
            }
            this.R.i();
            w(true);
        }
    }

    public final void q() {
        this.h.removeCallbacks(this.T);
        this.f13862w = false;
        i2.f0 f0Var = this.R;
        if (f0Var == null) {
            return;
        }
        f0Var.D(this.U);
        i2.f0 f0Var2 = this.R;
        f0Var2.B1();
        TextureView textureView = this.f13845b;
        if (textureView != null && textureView == f0Var2.V) {
            f0Var2.B1();
            f0Var2.o1();
            f0Var2.t1(null);
            f0Var2.m1(0, 0);
        }
        this.R.U0();
        this.R = null;
    }

    public final void r(File file, long j3, long j10, boolean z10, int i10) {
        long nanoTime = System.nanoTime();
        m mVar = this.f13852l;
        StringBuilder t10 = a4.a.t(j3, "final range remux started: range=", "..");
        t10.append(j10);
        t10.append(", includeAudio=");
        t10.append(z10);
        t10.append(", reason=");
        t10.append(hg.k0.B(i10));
        mVar.b(t10.toString());
        f();
        j(this.O, i10);
        c(z10);
        f();
        a3.z a2 = w7.k.a(file, this.P, j3, j10, z10);
        this.P.f();
        long e = w7.k.e(this.P.f13866a) / 1000;
        m mVar2 = this.f13852l;
        StringBuilder t11 = a4.a.t(e, "final range remux completed: durationMs=", ", requestedDurationMs=");
        t11.append(a2.f203b);
        t11.append(", actualStartMs=");
        t11.append(a2.f202a);
        t11.append(", size=");
        t11.append(this.P.f13866a.length());
        t11.append(", elapsedMs=");
        t11.append(e(nanoTime));
        mVar2.b(t11.toString());
        f();
        this.f13850j.execute(new f0(this, this.O, this.P.f13866a, e, z10));
    }

    public final void t(boolean z10) {
        if (this.f13861u != z10) {
            this.f13861u = z10;
            nv nvVar = this.e;
            if (nvVar != null) {
                d60.j((d60) nvVar.f26898b, z10);
            }
        }
    }

    public final void u(int i10) {
        int i11 = this.V;
        this.V = i10;
        this.f13852l.b("state: " + hg.k0.C(i11) + " -> " + hg.k0.C(i10) + ", durationMs=" + i());
        n();
    }

    public final void v(float f7) {
        s();
        if (this.V == 3 && !this.v) {
            this.f13851k.z(Math.max(0.0f, Math.min(1.0f, f7)));
        }
    }

    public final void w(boolean z10) {
        if (this.f13862w == z10) {
            return;
        }
        this.f13862w = z10;
        Handler handler = this.h;
        q4 q4Var = this.T;
        handler.removeCallbacks(q4Var);
        if (z10) {
            handler.post(q4Var);
        }
        this.f13846c.getClass();
        n();
    }
}
