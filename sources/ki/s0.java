package ki;

import ai.q4;
import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.TextureView;
import ii.n4;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.pv;
import org.telegram.ui.Components.z01;
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
    public final Context f15043a;
    public final TextureView f15044b;
    public final File f15045c;
    public final l2.g d;
    public final p0 f15046e;
    public final pv f15047f;
    public final i f15052l;
    public final m f15053m;
    public final q0 f15054n;
    public final long f15055o;
    public l0 f15056p;
    public l0 f15057q;
    public m0 f15058r;
    public n0 f15059s;
    public boolean f15061u;
    public boolean v;
    public boolean f15062w;
    public boolean f15063x;
    public boolean f15064y;
    public boolean f15065z;
    public final Object f15048g = new Object();
    public final Matrix h = new Matrix();
    public final Handler f15049i = new Handler(Looper.getMainLooper());
    public final ExecutorService f15050j = Executors.newSingleThreadExecutor(new e2.c0(1));
    public final ExecutorService f15051k = Executors.newSingleThreadExecutor(new e2.c0(2));
    public int W = 1;
    public int X = 1;
    public float f15060t = 1.0f;
    public long I = 1;
    public final b0 T = new b0(this, 1);
    public final q4 U = new q4(this, 24);

    public s0(j0 j0Var) {
        Context context;
        n4 n4Var = new n4(this, 3);
        this.V = new i0(this, 0);
        t();
        Context context2 = j0Var.f14944a;
        Context applicationContext = context2.getApplicationContext();
        if (applicationContext == null) {
            context = context2;
        } else {
            context = applicationContext;
        }
        this.f15043a = context;
        TextureView textureView = j0Var.f14945b;
        this.f15044b = textureView;
        File file = j0Var.f14946c;
        this.f15045c = file == null ? context.getCacheDir() : file;
        this.f15056p = j0Var.d;
        q0 q0Var = j0Var.f14947e;
        this.f15054n = q0Var;
        int i10 = j0Var.h;
        m0 m0Var = j0Var.f14948f;
        n0 n0Var = j0Var.f14949g;
        this.f15055o = 60000L;
        boolean z10 = j0Var.f14950i;
        this.d = j0Var.f14951j;
        this.f15046e = j0Var.f14952k;
        this.f15047f = j0Var.f14953l;
        m mVar = new m();
        this.f15053m = mVar;
        StringBuilder sb2 = new StringBuilder("session created: device=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(" ");
        sb2.append(Build.MODEL);
        sb2.append(", sdk=");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append(", output=");
        sb2.append(q0Var.f15031a);
        sb2.append("x");
        hg.k0.s(sb2, q0Var.f15031a, ", bitrate=", i10, ", cameraMode=");
        sb2.append(m0Var);
        sb2.append(", fps=");
        sb2.append(n0Var.f14995a);
        sb2.append(", composition=");
        sb2.append(z10);
        sb2.append(", facing=");
        sb2.append(this.f15056p);
        sb2.append(", maxDurationMs=60000");
        mVar.b(sb2.toString());
        this.f15052l = new i(context, textureView, q0Var, i10, m0Var, n0Var, z10, mVar, n4Var);
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
            this.f15053m.b("cancel requested: state=".concat(hg.k0.B(i10)));
            if (b(3)) {
                e();
                r();
                v(10);
                if (!this.B && !this.f15052l.D()) {
                    i();
                    return;
                }
                this.B = true;
                this.A = true;
            }
        }
    }

    public final boolean b(int i10) {
        synchronized (this.f15048g) {
            try {
                o0 o0Var = this.P;
                if (o0Var != null && o0Var.f15000e) {
                    return false;
                }
                this.D = true;
                if (o0Var != null && !o0Var.d) {
                    o0Var.d = true;
                    m mVar = this.f15053m;
                    mVar.b("output generation invalidated: id=" + o0Var.f14997a + ", reason=" + hg.k0.A(i10) + ", availableSize=" + o0Var.f14999c);
                    this.f15051k.execute(new e0(this, o0Var, i10, 1));
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(boolean z10) {
        synchronized (this.f15048g) {
            g();
            File d = d("round_video_");
            long j3 = this.I;
            this.I = 1 + j3;
            o0 o0Var = new o0(j3, d);
            this.P = o0Var;
            this.Q = new t(d, this.f15054n.f15031a, z10, this.f15053m, new ah.b(23, this, o0Var));
            m mVar = this.f15053m;
            mVar.b("output generation started: id=" + j3 + ", includeAudio=" + z10 + ", file=" + d.getName());
            this.f15051k.execute(new gg.t(this, o0Var, d, 24));
        }
    }

    public final File d(String str) {
        File file = this.f15045c;
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
        this.f15061u = false;
        i iVar = this.f15052l;
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
            this.f15053m.a("fatal error in state=".concat(hg.k0.B(i10)), exc);
            if (b(4)) {
                e();
                r();
                this.f15049i.removeCallbacks(this.T);
                o0 o0Var = this.P;
                if (o0Var != null) {
                    this.f15051k.execute(new e0(this, o0Var, exc));
                }
                v(9);
                m("error");
                e60 e60Var = (e60) this.d.f15267b;
                e60Var.u();
                FileLog.e(exc);
                z01 z01Var = e60Var.T;
                if (z01Var != null) {
                    z01Var.d(true);
                }
                e60Var.T = null;
                MediaController.getInstance().requestRecordAudioFocus(false);
                if (e60Var.f25945e0) {
                    e60Var.r(6);
                } else {
                    NotificationCenter.getInstance(e60Var.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStartError, Integer.valueOf(e60Var.f25954n));
                }
                e60Var.t(false, false);
                if (!this.B && !this.f15052l.D()) {
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
        ExecutorService executorService = this.f15050j;
        executorService.execute(b0Var);
        this.f15052l.s();
        this.f15049i.removeCallbacksAndMessages(null);
        executorService.shutdown();
        this.f15051k.shutdown();
    }

    public final long j() {
        t();
        if (this.W != 3) {
            return this.E;
        }
        return Math.min(this.f15055o, (SystemClock.elapsedRealtime() + this.E) - this.F);
    }

    public final void k(o0 o0Var, int i10) {
        synchronized (this.f15048g) {
            try {
                if (!o0Var.d && !o0Var.f15000e) {
                    o0Var.d = true;
                    m mVar = this.f15053m;
                    mVar.b("output generation invalidated: id=" + o0Var.f14997a + ", reason=" + hg.k0.A(i10) + ", availableSize=" + o0Var.f14999c);
                    this.f15051k.execute(new e0(this, o0Var, i10, 0));
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
        if (j3 <= this.f15055o && this.G <= 0 && this.H + 10 >= j3) {
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
        m mVar = this.f15053m;
        StringBuilder v = a4.a.v("session summary: terminal=", str, ", state=");
        v.append(hg.k0.B(this.W));
        v.append(", durationMs=");
        v.append(j());
        v.append(", pauses=");
        v.append(this.L);
        v.append(", resumes=");
        v.append(this.M);
        v.append(", cameraSwitches=");
        v.append(this.N);
        v.append(", facing=");
        v.append(this.f15057q);
        v.append(", cameraMode=");
        v.append(this.f15058r);
        v.append(", generation=");
        long j10 = 0;
        if (o0Var == null) {
            j3 = 0;
        } else {
            j3 = o0Var.f14997a;
        }
        v.append(j3);
        v.append(", availableSize=");
        if (o0Var != null) {
            j10 = o0Var.f14999c;
        }
        v.append(j10);
        mVar.b(v.toString());
    }

    public final void n() {
        l0 l0Var = this.f15056p;
        l0 l0Var2 = this.f15057q;
        k0 k0Var = new k0(l0Var, l0Var2, this.X, this.f15060t);
        e60 e60Var = (e60) this.d.f15267b;
        e60Var.S = k0Var;
        if (l0Var2 != null) {
            ri.e.h.b(l0Var2);
        }
        e60.k(e60Var);
    }

    public final void o() {
        int i10;
        int i11 = this.W;
        long j3 = this.E;
        long j10 = this.F;
        boolean z10 = this.f15062w;
        boolean z11 = this.f15061u;
        long j11 = this.f15055o;
        r0 r0Var = new r0(i11, j3, j10, j11, z10, z11);
        e60 e60Var = (e60) this.d.f15267b;
        r0 r0Var2 = e60Var.R;
        int i12 = e60Var.h;
        if (r0Var2 == null) {
            i10 = 0;
        } else {
            i10 = r0Var2.f15035a;
        }
        e60Var.R = r0Var;
        if (i10 == 3 && i11 != 3) {
            e60Var.s(true);
        }
        e60Var.f25955n0 = Math.max(e60Var.f25955n0, j3);
        if (i11 == 3) {
            if (!e60Var.f25965v0) {
                e60Var.f25965v0 = true;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            }
            e60.l(e60Var);
            e60.m(e60Var, true);
            e60Var.w();
            if (!e60Var.f25945e0) {
                e60Var.f25945e0 = true;
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(e60Var.f25954n), Boolean.FALSE);
            } else if (e60Var.f25947f0) {
                e60Var.f25947f0 = false;
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordResumed, new Object[0]);
            }
        } else {
            e60.m(e60Var, false);
            e60Var.f25966w.setProgress(((float) j3) / ((float) j11));
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
        this.f15053m.b("pause requested: durationMs=" + this.E);
        e();
        this.f15049i.removeCallbacks(this.T);
        v(4);
        boolean D = this.f15052l.D();
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
        this.f15049i.removeCallbacks(this.U);
        this.f15063x = false;
        i2.f0 f0Var = this.S;
        if (f0Var == null) {
            return;
        }
        f0Var.D(this.V);
        i2.f0 f0Var2 = this.S;
        f0Var2.B1();
        TextureView textureView = this.f15044b;
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
        m mVar = this.f15053m;
        StringBuilder t10 = a4.a.t(j3, "final range remux started: range=", "..");
        t10.append(j10);
        t10.append(", includeAudio=");
        t10.append(z10);
        t10.append(", reason=");
        t10.append(hg.k0.A(i10));
        mVar.b(t10.toString());
        g();
        k(this.P, i10);
        c(z10);
        g();
        a3.z a2 = w7.k.a(file, this.Q, j3, j10, z10);
        this.Q.g();
        long e7 = w7.k.e(this.Q.f15066a) / 1000;
        m mVar2 = this.f15053m;
        StringBuilder t11 = a4.a.t(e7, "final range remux completed: durationMs=", ", requestedDurationMs=");
        t11.append(a2.f221b);
        t11.append(", actualStartMs=");
        t11.append(a2.f220a);
        t11.append(", size=");
        t11.append(this.Q.f15066a.length());
        t11.append(", elapsedMs=");
        t11.append(f(nanoTime));
        mVar2.b(t11.toString());
        g();
        this.f15051k.execute(new f0(this, this.P, this.Q.f15066a, e7, z10));
    }

    public final void u(boolean z10) {
        if (this.v != z10) {
            this.v = z10;
            pv pvVar = this.f15047f;
            if (pvVar != null) {
                e60.j((e60) pvVar.f29747b, z10);
            }
        }
    }

    public final void v(int i10) {
        int i11 = this.W;
        this.W = i10;
        this.f15053m.b("state: " + hg.k0.B(i11) + " -> " + hg.k0.B(i10) + ", durationMs=" + j());
        o();
    }

    public final void w(float f7) {
        t();
        if (this.W == 3 && !this.f15062w) {
            this.f15052l.z(Math.max(0.0f, Math.min(1.0f, f7)));
        }
    }

    public final void x(boolean z10) {
        if (this.f15063x == z10) {
            return;
        }
        this.f15063x = z10;
        Handler handler = this.f15049i;
        q4 q4Var = this.U;
        handler.removeCallbacks(q4Var);
        if (z10) {
            handler.post(q4Var);
        }
        this.d.getClass();
        o();
    }
}
