package ki;

import ai.r4;
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
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.cw;
import org.telegram.ui.Components.h11;
import org.telegram.ui.Components.s60;
public final class v0 {
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
    public volatile r0 P;
    public volatile w Q;
    public volatile File R;
    public i2.f0 S;
    public final l0 V;
    public final Context f15158a;
    public final TextureView f15159b;
    public final File f15160c;
    public final m2.t d;
    public final s0 f15161e;
    public final cw f15162f;
    public final k f15167l;
    public final o f15168m;
    public final t0 f15169n;
    public final long f15170o;
    public o0 f15171p;
    public o0 f15172q;
    public p0 f15173r;
    public q0 f15174s;
    public boolean f15176u;
    public boolean v;
    public boolean f15177w;
    public boolean f15178x;
    public boolean f15179y;
    public boolean f15180z;
    public final Object f15163g = new Object();
    public final Matrix h = new Matrix();
    public final Handler f15164i = new Handler(Looper.getMainLooper());
    public final ExecutorService f15165j = Executors.newSingleThreadExecutor(new e2.c0(1));
    public final ExecutorService f15166k = Executors.newSingleThreadExecutor(new e2.c0(2));
    public int W = 1;
    public int X = 1;
    public float f15175t = 1.0f;
    public long I = 1;
    public final e0 T = new e0(this, 1);
    public final r4 U = new r4(this, 24);

    public v0(m0 m0Var) {
        Context context;
        xa.c cVar = new xa.c(this, 29);
        this.V = new l0(this, 0);
        t();
        Context context2 = m0Var.f15037a;
        Context applicationContext = context2.getApplicationContext();
        if (applicationContext == null) {
            context = context2;
        } else {
            context = applicationContext;
        }
        this.f15158a = context;
        TextureView textureView = m0Var.f15038b;
        this.f15159b = textureView;
        File file = m0Var.f15039c;
        this.f15160c = file == null ? context.getCacheDir() : file;
        this.f15171p = m0Var.d;
        t0 t0Var = m0Var.f15040e;
        this.f15169n = t0Var;
        int i10 = m0Var.h;
        p0 p0Var = m0Var.f15041f;
        q0 q0Var = m0Var.f15042g;
        this.f15170o = 60000L;
        boolean z10 = m0Var.f15043i;
        this.d = m0Var.f15044j;
        this.f15161e = m0Var.f15045k;
        this.f15162f = m0Var.f15046l;
        o oVar = new o();
        this.f15168m = oVar;
        StringBuilder sb2 = new StringBuilder("session created: device=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(" ");
        sb2.append(Build.MODEL);
        sb2.append(", sdk=");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append(", output=");
        sb2.append(t0Var.f15146a);
        sb2.append("x");
        hg.c.u(sb2, t0Var.f15146a, ", bitrate=", i10, ", cameraMode=");
        sb2.append(p0Var);
        sb2.append(", fps=");
        sb2.append(q0Var.f15091a);
        sb2.append(", composition=");
        sb2.append(z10);
        sb2.append(", facing=");
        sb2.append(this.f15171p);
        sb2.append(", maxDurationMs=60000");
        oVar.b(sb2.toString());
        this.f15167l = new k(context, textureView, t0Var, i10, p0Var, q0Var, z10, oVar, cVar);
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
            this.f15168m.b("cancel requested: state=".concat(hg.c.C(i10)));
            if (b(3)) {
                e();
                r();
                v(10);
                if (!this.B && !this.f15167l.Y()) {
                    i();
                    return;
                }
                this.B = true;
                this.A = true;
            }
        }
    }

    public final boolean b(int i10) {
        synchronized (this.f15163g) {
            try {
                r0 r0Var = this.P;
                if (r0Var != null && r0Var.f15097e) {
                    return false;
                }
                this.D = true;
                if (r0Var != null && !r0Var.d) {
                    r0Var.d = true;
                    o oVar = this.f15168m;
                    oVar.b("output generation invalidated: id=" + r0Var.f15094a + ", reason=" + hg.c.B(i10) + ", availableSize=" + r0Var.f15096c);
                    this.f15166k.execute(new h0(this, r0Var, i10, 1));
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(boolean z10) {
        synchronized (this.f15163g) {
            g();
            File d = d("round_video_");
            long j3 = this.I;
            this.I = 1 + j3;
            r0 r0Var = new r0(j3, d);
            this.P = r0Var;
            this.Q = new w(d, this.f15169n.f15146a, z10, this.f15168m, new ah.b(23, this, r0Var));
            o oVar = this.f15168m;
            oVar.b("output generation started: id=" + j3 + ", includeAudio=" + z10 + ", file=" + d.getName());
            this.f15166k.execute(new gg.t(this, r0Var, d, 24));
        }
    }

    public final File d(String str) {
        File file = this.f15160c;
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
        this.f15176u = false;
        k kVar = this.f15167l;
        kVar.U(0.0f);
        kVar.T(false);
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
            this.f15168m.a("fatal error in state=".concat(hg.c.C(i10)), exc);
            if (b(4)) {
                e();
                r();
                this.f15164i.removeCallbacks(this.T);
                r0 r0Var = this.P;
                if (r0Var != null) {
                    this.f15166k.execute(new h0(this, r0Var, exc));
                }
                v(9);
                m("error");
                s60 s60Var = (s60) this.d.f16033b;
                s60Var.x();
                FileLog.e(exc);
                h11 h11Var = s60Var.T;
                if (h11Var != null) {
                    h11Var.d(true);
                }
                s60Var.T = null;
                MediaController.getInstance().requestRecordAudioFocus(false);
                if (s60Var.f30756f0) {
                    s60Var.u(6);
                } else {
                    NotificationCenter.getInstance(s60Var.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStartError, Integer.valueOf(s60Var.f30763n));
                }
                s60Var.w(false, false);
                if (!this.B && !this.f15167l.Y()) {
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
        e0 e0Var = new e0(this, 0);
        ExecutorService executorService = this.f15165j;
        executorService.execute(e0Var);
        this.f15167l.M();
        this.f15164i.removeCallbacksAndMessages(null);
        executorService.shutdown();
        this.f15166k.shutdown();
    }

    public final long j() {
        t();
        if (this.W != 3) {
            return this.E;
        }
        return Math.min(this.f15170o, (SystemClock.elapsedRealtime() + this.E) - this.F);
    }

    public final void k(r0 r0Var, int i10) {
        synchronized (this.f15163g) {
            try {
                if (!r0Var.d && !r0Var.f15097e) {
                    r0Var.d = true;
                    o oVar = this.f15168m;
                    oVar.b("output generation invalidated: id=" + r0Var.f15094a + ", reason=" + hg.c.B(i10) + ", availableSize=" + r0Var.f15096c);
                    this.f15166k.execute(new h0(this, r0Var, i10, 0));
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
        if (j3 <= this.f15170o && this.G <= 0 && this.H + 10 >= j3) {
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
        r0 r0Var = this.P;
        o oVar = this.f15168m;
        StringBuilder w10 = a1.g.w("session summary: terminal=", str, ", state=");
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
        w10.append(this.f15172q);
        w10.append(", cameraMode=");
        w10.append(this.f15173r);
        w10.append(", generation=");
        long j10 = 0;
        if (r0Var == null) {
            j3 = 0;
        } else {
            j3 = r0Var.f15094a;
        }
        w10.append(j3);
        w10.append(", availableSize=");
        if (r0Var != null) {
            j10 = r0Var.f15096c;
        }
        w10.append(j10);
        oVar.b(w10.toString());
    }

    public final void n() {
        o0 o0Var = this.f15171p;
        o0 o0Var2 = this.f15172q;
        n0 n0Var = new n0(o0Var, o0Var2, this.X, this.f15175t);
        s60 s60Var = (s60) this.d.f16033b;
        s60Var.S = n0Var;
        if (o0Var2 != null) {
            qi.e.h.b(o0Var2);
        }
        s60Var.y();
    }

    public final void o() {
        int i10;
        int i11 = this.W;
        long j3 = this.E;
        long j10 = this.F;
        boolean z10 = this.f15177w;
        boolean z11 = this.f15176u;
        long j11 = this.f15170o;
        u0 u0Var = new u0(i11, j3, j10, j11, z10, z11);
        s60 s60Var = (s60) this.d.f16033b;
        u0 u0Var2 = s60Var.R;
        int i12 = s60Var.h;
        if (u0Var2 == null) {
            i10 = 0;
        } else {
            i10 = u0Var2.f15150a;
        }
        s60Var.R = u0Var;
        if (i10 == 3 && i11 != 3) {
            s60Var.v(true);
        }
        s60Var.f30773u0 = Math.max(s60Var.f30773u0, j3);
        if (i11 == 3) {
            if (!s60Var.C0) {
                s60Var.C0 = true;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            }
            s60.m(s60Var);
            s60.n(s60Var, true);
            s60Var.A();
            if (!s60Var.f30756f0) {
                s60Var.f30756f0 = true;
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(s60Var.f30763n), Boolean.FALSE);
            } else if (s60Var.f30757g0) {
                s60Var.f30757g0 = false;
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordResumed, new Object[0]);
            }
        } else {
            s60.n(s60Var, false);
            s60Var.f30775w.setProgress(((float) j3) / ((float) j11));
        }
        if (i11 == 8 || i11 == 9 || i11 == 10) {
            s60Var.q();
            s60Var.x();
        }
        if (i10 == 3 && i11 == 4) {
            s60Var.u(2);
        }
        s60Var.y();
    }

    public final void p() {
        t();
        if (this.W != 3) {
            return;
        }
        this.E = j();
        this.L++;
        this.f15168m.b("pause requested: durationMs=" + this.E);
        e();
        this.f15164i.removeCallbacks(this.T);
        v(4);
        boolean Y = this.f15167l.Y();
        this.B = Y;
        if (!Y) {
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
        this.f15164i.removeCallbacks(this.U);
        this.f15178x = false;
        i2.f0 f0Var = this.S;
        if (f0Var == null) {
            return;
        }
        f0Var.D(this.V);
        i2.f0 f0Var2 = this.S;
        f0Var2.D1();
        TextureView textureView = this.f15159b;
        if (textureView != null && textureView == f0Var2.V) {
            f0Var2.D1();
            f0Var2.q1();
            f0Var2.v1(null);
            f0Var2.o1(0, 0);
        }
        this.S.U0();
        this.S = null;
    }

    public final void s(File file, long j3, long j10, boolean z10, int i10) {
        long nanoTime = System.nanoTime();
        o oVar = this.f15168m;
        StringBuilder u10 = a1.g.u(j3, "final range remux started: range=", "..");
        u10.append(j10);
        u10.append(", includeAudio=");
        u10.append(z10);
        u10.append(", reason=");
        u10.append(hg.c.B(i10));
        oVar.b(u10.toString());
        g();
        k(this.P, i10);
        c(z10);
        g();
        a3.z a2 = w7.j.a(file, this.Q, j3, j10, z10);
        this.Q.g();
        long e7 = w7.j.e(this.Q.f15181a) / 1000;
        o oVar2 = this.f15168m;
        StringBuilder u11 = a1.g.u(e7, "final range remux completed: durationMs=", ", requestedDurationMs=");
        u11.append(a2.f221b);
        u11.append(", actualStartMs=");
        u11.append(a2.f220a);
        u11.append(", size=");
        u11.append(this.Q.f15181a.length());
        u11.append(", elapsedMs=");
        u11.append(f(nanoTime));
        oVar2.b(u11.toString());
        g();
        this.f15166k.execute(new i0(this, this.P, this.Q.f15181a, e7, z10));
    }

    public final void u(boolean z10) {
        if (this.v != z10) {
            this.v = z10;
            cw cwVar = this.f15162f;
            if (cwVar != null) {
                s60.j((s60) cwVar.f25482b, z10);
            }
        }
    }

    public final void v(int i10) {
        int i11 = this.W;
        this.W = i10;
        this.f15168m.b("state: " + hg.c.C(i11) + " -> " + hg.c.C(i10) + ", durationMs=" + j());
        o();
    }

    public final void w(float f7) {
        t();
        if (this.W == 3 && !this.f15177w) {
            this.f15167l.U(Math.max(0.0f, Math.min(1.0f, f7)));
        }
    }

    public final void x(boolean z10) {
        if (this.f15178x == z10) {
            return;
        }
        this.f15178x = z10;
        Handler handler = this.f15164i;
        r4 r4Var = this.U;
        handler.removeCallbacks(r4Var);
        if (z10) {
            handler.post(r4Var);
        }
        this.d.getClass();
        o();
    }
}
