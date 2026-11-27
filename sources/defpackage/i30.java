package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.MediaController;
import org.telegram.utils.recorder.audio.b;
import org.telegram.utils.recorder.audio.d;
public final class i30 {
    public static final rj2 H = new rj2((byte) 14);
    public static final AtomicLong I = new AtomicLong(1);
    public s64 A;
    public byte[] B;
    public n20 C;
    public final z20 D;
    public final z20 E;
    public final Context a;
    public final File b;
    public final short c;
    public final f30 d;
    public final boolean e;
    public final qx6 f;
    public final lh2 g;
    public final r20 h;
    public d n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public volatile g30 z;
    public final Handler i = new Handler(Looper.getMainLooper());
    public final ExecutorService j = Executors.newSingleThreadExecutor(new y20((byte) 0));
    public final ExecutorService k = Executors.newSingleThreadExecutor(new y20((byte) 1));
    public final Object l = new Object();
    public final ArrayList m = new ArrayList();
    public int G = 1;
    public long t = 1;
    public final c30 F = new c30(this, (byte) 0);

    public i30(d30 d30Var) {
        q();
        Context context = (Context) d30Var.b;
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        this.a = context;
        File file = (File) d30Var.c;
        this.b = file == null ? context.getCacheDir() : file;
        this.c = (short) 700;
        f30 f30Var = (f30) d30Var.d;
        this.d = f30Var;
        this.e = d30Var.a;
        this.f = (qx6) d30Var.e;
        this.g = (lh2) d30Var.f;
        r20 r20Var = new r20((e30) d30Var.g);
        this.h = r20Var;
        this.D = new Runnable(this) {
            public final i30 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                s64 s64Var;
                byte b = r2;
                i30 i30Var = this.b;
                switch (b) {
                    case 0:
                        if (i30Var.G == 3 && !i30Var.w) {
                            i30Var.w = true;
                            r20 r20Var2 = i30Var.h;
                            r20Var2.b("maximum duration reached: durationMs=" + i30Var.j());
                            i30Var.f.getClass();
                            i30Var.n();
                            return;
                        }
                        return;
                    default:
                        if (i30Var.G == 5 && (s64Var = i30Var.A) != null && i30Var.u) {
                            long k = s64Var.k();
                            long j = i30Var.r;
                            if (k < j || k >= i30Var.s) {
                                i30Var.A.k1(j);
                            }
                            qx6 qx6Var = i30Var.f;
                            i30Var.j();
                            qx6Var.getClass();
                            i30Var.i.postDelayed(i30Var.E, 32L);
                            return;
                        }
                        return;
                }
            }
        };
        this.E = new Runnable(this) {
            public final i30 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                s64 s64Var;
                byte b = r2;
                i30 i30Var = this.b;
                switch (b) {
                    case 0:
                        if (i30Var.G == 3 && !i30Var.w) {
                            i30Var.w = true;
                            r20 r20Var2 = i30Var.h;
                            r20Var2.b("maximum duration reached: durationMs=" + i30Var.j());
                            i30Var.f.getClass();
                            i30Var.n();
                            return;
                        }
                        return;
                    default:
                        if (i30Var.G == 5 && (s64Var = i30Var.A) != null && i30Var.u) {
                            long k = s64Var.k();
                            long j = i30Var.r;
                            if (k < j || k >= i30Var.s) {
                                i30Var.A.k1(j);
                            }
                            qx6 qx6Var = i30Var.f;
                            i30Var.j();
                            qx6Var.getClass();
                            i30Var.i.postDelayed(i30Var.E, 32L);
                            return;
                        }
                        return;
                }
            }
        };
        r20Var.b("session created: device=" + Build.MANUFACTURER + " " + Build.MODEL + ", sdk=" + Build.VERSION.SDK_INT + ", sampleRate=48000, noiseSuppression=" + f30Var + ", minimumDurationMs=700, maximumDurationMs=0");
    }

    public static void q() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        grb.i("AudioRecordingSession must be used on the main thread");
    }

    public static long r(long j) {
        return (j * 1000) / 48000;
    }

    public final void a(g30 g30Var, long j) {
        if (j <= 0) {
            return;
        }
        synchronized (this.l) {
            if (g30Var.d && !g30Var.e) {
                long j2 = g30Var.c;
                if (j > j2) {
                    g30Var.c = j;
                    this.k.execute(new w20(this, g30Var, j2, j - j2, (byte) 1));
                }
            }
        }
    }

    public final void b() {
        q();
        int i = this.G;
        if (i != 10 && i != 8) {
            this.h.b("cancel requested: state=".concat(c00.C(this.G)));
            z20 z20Var = this.D;
            Handler handler = this.i;
            handler.removeCallbacks(z20Var);
            handler.removeCallbacks(this.E);
            p();
            k(2);
            s(10);
            d dVar = this.n;
            if (dVar != null) {
                dVar.e();
                return;
            }
            c();
            t();
        }
    }

    public final void c() {
        File file;
        if (this.x) {
            return;
        }
        this.x = true;
        n20 n20Var = this.C;
        if (n20Var == null) {
            file = null;
        } else {
            file = (File) n20Var.b;
        }
        a30 a30Var = new a30(this, file, (byte) 0);
        try {
            this.j.execute(a30Var);
        } catch (RejectedExecutionException unused) {
            a30Var.run();
        }
    }

    public final g30 d() {
        File f = f();
        long j = this.t;
        this.t = 1 + j;
        g30 g30Var = new g30(j, f);
        synchronized (this.l) {
            this.z = g30Var;
            this.k.execute(new es6(this, g30Var, f, (byte) 12));
        }
        r20 r20Var = this.h;
        StringBuilder o = ik8.o(j, "output generation started: id=", ", file=");
        o.append(f.getName());
        r20Var.b(o.toString());
        return g30Var;
    }

    public final h30 e() {
        return new h30(this.G);
    }

    public final File f() {
        File file = this.b;
        File file2 = new File(file, "audio_recording_voice_" + System.currentTimeMillis() + "_" + I.getAndIncrement() + ".ogg");
        synchronized (this.m) {
            this.m.add(file2);
        }
        return file2;
    }

    public final void g(Exception exc) {
        int i = this.G;
        if (i != 9 && i != 10 && i != 8) {
            this.h.a("fatal error in state=".concat(c00.C(this.G)), exc);
            Handler handler = this.i;
            handler.removeCallbacks(this.D);
            handler.removeCallbacks(this.E);
            p();
            k(3);
            s(9);
            g30 g30Var = this.z;
            if (g30Var != null) {
                this.k.execute(new w20(this, g30Var, exc));
            }
            MediaController mediaController = ((sn6) this.f.b).a;
            String[] strArr = MediaController.W1;
            cc4.e("AudioRecorderV2 failed", exc);
            jn7.f(mediaController.i1).k(jn7.m2, Integer.valueOf(mediaController.h1));
            mediaController.u(false);
            d dVar = this.n;
            if (dVar != null) {
                dVar.e();
            } else {
                c();
                t();
            }
            l("error");
        }
    }

    public final void h() {
        q();
        int i = this.G;
        if (i != 3 && i != 5) {
            return;
        }
        r20 r20Var = this.h;
        r20Var.b("finish requested: state=" + c00.C(this.G) + ", durationMs=" + j() + ", trim=" + this.r + ".." + this.s);
        if (this.G == 3) {
            this.v = true;
            this.i.removeCallbacks(this.D);
            s(7);
            this.n.e();
            return;
        }
        p();
        s(7);
        final g30 g30Var = this.z;
        if (g30Var == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        long r = r(this.p);
        final long j = this.r;
        if (j == 0 && this.s == r) {
            i();
            return;
        }
        final long j2 = this.s;
        k(1);
        final g30 d = d();
        this.j.execute(new Runnable() {
            @Override
            public final void run() {
                Object obj;
                g30 g30Var2 = g30Var;
                g30 g30Var3 = d;
                long j3 = j;
                long j4 = j2;
                i30 i30Var = i30.this;
                Handler handler = i30Var.i;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    String absolutePath = g30Var2.b.getAbsolutePath();
                    File file = g30Var3.b;
                    obj = file.getAbsolutePath();
                    try {
                        if (AudioRecorderNative.b(absolutePath, obj, j3, j4)) {
                            r20 r20Var2 = i30Var.h;
                            r20Var2.b("final trim completed: source=" + g30Var2.b.getName() + ", output=" + file.getName() + ", trim=" + j3 + ".." + j4 + ", bytes=" + file.length() + ", elapsedMs=" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                            i30Var.a(g30Var3, file.length());
                            handler.post(new x20(i30Var, j4, j3, (byte) 0));
                            return;
                        }
                        throw new IllegalStateException("Unable to trim final Opus output");
                    } catch (Throwable th) {
                        th = th;
                        handler.post(new ve2(obj, th, (byte) 29));
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obj = i30Var;
                }
            }
        });
    }

    public final void i() {
        if (this.G != 7) {
            return;
        }
        g30 g30Var = this.z;
        if (g30Var == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        long j = j();
        if (j < this.c) {
            r20 r20Var = this.h;
            r20Var.b("recording rejected as too short: durationMs=" + j);
            MediaController mediaController = ((sn6) this.f.b).a;
            jn7.f(mediaController.i1).k(jn7.t2, Integer.valueOf(mediaController.h1), Boolean.FALSE, Integer.valueOf((int) j));
            mediaController.u(false);
            k(2);
            s(10);
            c();
            t();
            l("too_short");
            return;
        }
        this.j.execute(new b(this, g30Var, j));
    }

    public final long j() {
        q();
        return r(this.p + this.q);
    }

    public final void k(int i) {
        String str;
        synchronized (this.l) {
            g30 g30Var = this.z;
            if (g30Var != null && g30Var.d && !g30Var.e) {
                g30Var.d = false;
                this.k.execute(new w20(this, g30Var, i));
                r20 r20Var = this.h;
                StringBuilder sb = new StringBuilder("output generation invalidated: id=");
                sb.append(g30Var.a);
                sb.append(", reason=");
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            str = "null";
                        } else {
                            str = "ERROR";
                        }
                    } else {
                        str = "CANCELLED";
                    }
                } else {
                    str = "REBUILT";
                }
                sb.append(str);
                r20Var.b(sb.toString());
            }
        }
    }

    public final void l(String str) {
        if (this.y) {
            return;
        }
        this.y = true;
        StringBuilder p = ik8.p("session summary: terminal=", str, ", durationMs=");
        p.append(r(this.p + this.q));
        p.append(", generations=");
        p.append(this.t - 1);
        this.h.b(p.toString());
    }

    public final void m() {
        h30 e = e();
        qx6 qx6Var = this.f;
        MediaController mediaController = ((sn6) qx6Var.b).a;
        int i = e.a;
        v20 v20Var = (v20) qx6Var.c;
        i30 i30Var = v20Var.b;
        int i2 = v20Var.f;
        v20Var.f = i;
        if (i == 3) {
            if (!v20Var.g) {
                if (i2 == 2) {
                    System.currentTimeMillis();
                    String[] strArr = MediaController.W1;
                    if (!mediaController.J1) {
                        jn7.f(mediaController.i1).k(jn7.l2, Integer.valueOf(mediaController.h1), Boolean.TRUE);
                    }
                } else if (i2 == 6) {
                    mediaController.b0(true);
                    jn7.f(mediaController.i1).k(jn7.p2, new Object[0]);
                }
            }
            if (v20Var.g && (i == 3 || i == 5)) {
                v20Var.g = false;
                i30Var.h();
            }
            if (v20Var.i && !v20Var.g) {
                v20Var.i = false;
                i30Var.n();
            }
        }
    }

    public final boolean n() {
        q();
        if (this.G == 3 && this.n != null) {
            this.h.b("pause requested: durationMs=" + j());
            this.i.removeCallbacks(this.D);
            s(4);
            this.n.e();
            return true;
        }
        return false;
    }

    public final void o() {
        q();
        int i = this.G;
        if (i == 10) {
            return;
        }
        if (i != 8) {
            b();
            return;
        }
        p();
        c();
        s(10);
        l("released");
    }

    public final void p() {
        this.i.removeCallbacks(this.E);
        this.u = false;
        s64 s64Var = this.A;
        if (s64Var != null) {
            s64Var.p0(this.F);
            this.A.g1();
            this.A = null;
        }
    }

    public final void s(int i) {
        int i2 = this.G;
        if (i2 == i) {
            return;
        }
        this.G = i;
        this.h.b("state: " + c00.C(i2) + " -> " + c00.C(i) + ", durationMs=" + r(this.p + this.q));
        m();
    }

    public final void t() {
        this.j.shutdown();
        this.k.shutdown();
    }

    public final void u(long j, long j2, File file) {
        long j3 = this.o + 1;
        this.o = j3;
        g30 g30Var = this.z;
        if (g30Var == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        File file2 = g30Var.b;
        f30 f30Var = this.d;
        r20 r20Var = this.h;
        ?? obj = new Object();
        obj.c = this;
        obj.a = j3;
        obj.b = g30Var;
        final d dVar = new d(file2, file, j, j2, f30Var, r20Var, obj);
        this.n = dVar;
        this.q = 0L;
        dVar.k.post(new Runnable() {
            @Override
            public final void run() {
                String str;
                d dVar2 = d.this;
                File file3 = dVar2.b;
                r20 r20Var2 = dVar2.f;
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    AudioRecorderNative a = AudioRecorderNative.a(dVar2.c, dVar2.d, dVar2.a, dVar2.b);
                    dVar2.t = a;
                    if (a != null) {
                        if (dVar2.e == f30.b) {
                            AudioNoiseSuppressor a2 = AudioNoiseSuppressor.a();
                            dVar2.u = a2;
                            if (a2 == null) {
                                r20Var2.b("RNNoise unavailable; recording unprocessed PCM");
                            } else {
                                r20Var2.b("RNNoise started: sampleRate=48000, captureFrameSamples=960");
                            }
                        }
                        long d = dVar2.t.d();
                        StringBuilder sb = new StringBuilder("Opus encoder started: prefix=");
                        if (file3 == null) {
                            str = "none";
                        } else {
                            str = file3.getName() + " " + dVar2.c + ".." + dVar2.d;
                        }
                        sb.append(str);
                        sb.append(", initialBytes=");
                        sb.append(d);
                        sb.append(", queuedChunks=");
                        sb.append(dVar2.m.get());
                        sb.append(", elapsedMs=");
                        sb.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                        r20Var2.b(sb.toString());
                        dVar2.x = SystemClock.elapsedRealtime();
                        if (d > 0) {
                            n20 n20Var = dVar2.g;
                            ((i30) n20Var.c).a((g30) n20Var.b, d);
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Unable to initialize native Opus recorder");
                } catch (Throwable th) {
                    if (dVar2.v == null) {
                        dVar2.f.a("encoding failed", th);
                        dVar2.v = d.a(th);
                        dVar2.n = true;
                    }
                }
            }
        });
        dVar.i.post(new wz(dVar, (byte) 0));
    }
}
