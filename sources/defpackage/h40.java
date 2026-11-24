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
public final class h40 {
    public static final jk2 H = new jk2((byte) 14);
    public static final AtomicLong I = new AtomicLong(1);
    public h74 A;
    public byte[] B;
    public m30 C;
    public final z30 D;
    public final z30 E;
    public final Context a;
    public final File b;
    public final short c;
    public final e40 d;
    public final boolean e;
    public final hi2 f;
    public final lx6 g;
    public final q30 h;
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
    public volatile f40 z;
    public final Handler i = new Handler(Looper.getMainLooper());
    public final ExecutorService j = Executors.newSingleThreadExecutor(new y30((byte) 0));
    public final ExecutorService k = Executors.newSingleThreadExecutor(new y30((byte) 1));
    public final Object l = new Object();
    public final ArrayList m = new ArrayList();
    public int G = 1;
    public long t = 1;
    public final b40 F = new b40(this, (byte) 0);

    public h40(c40 c40Var) {
        q();
        Context context = (Context) c40Var.b;
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        this.a = context;
        File file = (File) c40Var.c;
        this.b = file == null ? context.getCacheDir() : file;
        this.c = (short) 700;
        e40 e40Var = (e40) c40Var.d;
        this.d = e40Var;
        this.e = c40Var.a;
        this.f = (hi2) c40Var.e;
        this.g = (lx6) c40Var.f;
        q30 q30Var = new q30((d40) c40Var.g);
        this.h = q30Var;
        this.D = new Runnable(this) {
            public final h40 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                h74 h74Var;
                byte b = r2;
                h40 h40Var = this.b;
                switch (b) {
                    case 0:
                        if (h40Var.G == 3 && !h40Var.w) {
                            h40Var.w = true;
                            q30 q30Var2 = h40Var.h;
                            q30Var2.b("maximum duration reached: durationMs=" + h40Var.j());
                            h40Var.f.getClass();
                            h40Var.n();
                            return;
                        }
                        return;
                    default:
                        if (h40Var.G == 5 && (h74Var = h40Var.A) != null && h40Var.u) {
                            long k = h74Var.k();
                            long j = h40Var.r;
                            if (k < j || k >= h40Var.s) {
                                h40Var.A.k1(j);
                            }
                            hi2 hi2Var = h40Var.f;
                            h40Var.j();
                            hi2Var.getClass();
                            h40Var.i.postDelayed(h40Var.E, 32L);
                            return;
                        }
                        return;
                }
            }
        };
        this.E = new Runnable(this) {
            public final h40 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                h74 h74Var;
                byte b = r2;
                h40 h40Var = this.b;
                switch (b) {
                    case 0:
                        if (h40Var.G == 3 && !h40Var.w) {
                            h40Var.w = true;
                            q30 q30Var2 = h40Var.h;
                            q30Var2.b("maximum duration reached: durationMs=" + h40Var.j());
                            h40Var.f.getClass();
                            h40Var.n();
                            return;
                        }
                        return;
                    default:
                        if (h40Var.G == 5 && (h74Var = h40Var.A) != null && h40Var.u) {
                            long k = h74Var.k();
                            long j = h40Var.r;
                            if (k < j || k >= h40Var.s) {
                                h40Var.A.k1(j);
                            }
                            hi2 hi2Var = h40Var.f;
                            h40Var.j();
                            hi2Var.getClass();
                            h40Var.i.postDelayed(h40Var.E, 32L);
                            return;
                        }
                        return;
                }
            }
        };
        q30Var.b("session created: device=" + Build.MANUFACTURER + " " + Build.MODEL + ", sdk=" + Build.VERSION.SDK_INT + ", sampleRate=48000, noiseSuppression=" + e40Var + ", minimumDurationMs=700, maximumDurationMs=0");
    }

    public static void q() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        dq9.m("AudioRecordingSession must be used on the main thread");
    }

    public static long r(long j) {
        return (j * 1000) / 48000;
    }

    public final void a(f40 f40Var, long j) {
        if (j <= 0) {
            return;
        }
        synchronized (this.l) {
            if (f40Var.d && !f40Var.e) {
                long j2 = f40Var.c;
                if (j > j2) {
                    f40Var.c = j;
                    this.k.execute(new v30(this, f40Var, j2, j - j2, (byte) 1));
                }
            }
        }
    }

    public final void b() {
        q();
        int i = this.G;
        if (i != 10 && i != 8) {
            this.h.b("cancel requested: state=".concat(b10.B(this.G)));
            z30 z30Var = this.D;
            Handler handler = this.i;
            handler.removeCallbacks(z30Var);
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
        m30 m30Var = this.C;
        if (m30Var == null) {
            file = null;
        } else {
            file = (File) m30Var.b;
        }
        x30 x30Var = new x30(this, file, (byte) 1);
        try {
            this.j.execute(x30Var);
        } catch (RejectedExecutionException unused) {
            x30Var.run();
        }
    }

    public final f40 d() {
        File f = f();
        long j = this.t;
        this.t = 1 + j;
        f40 f40Var = new f40(j, f);
        synchronized (this.l) {
            this.z = f40Var;
            this.k.execute(new op6(this, f40Var, f, (byte) 12));
        }
        q30 q30Var = this.h;
        StringBuilder o = wi8.o(j, "output generation started: id=", ", file=");
        o.append(f.getName());
        q30Var.b(o.toString());
        return f40Var;
    }

    public final g40 e() {
        return new g40(this.G);
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
            this.h.a("fatal error in state=".concat(b10.B(this.G)), exc);
            Handler handler = this.i;
            handler.removeCallbacks(this.D);
            handler.removeCallbacks(this.E);
            p();
            k(3);
            s(9);
            f40 f40Var = this.z;
            if (f40Var != null) {
                this.k.execute(new v30(this, f40Var, exc));
            }
            MediaController mediaController = ((on6) this.f.b).a;
            String[] strArr = MediaController.W1;
            fc4.e("AudioRecorderV2 failed", exc);
            nm7.f(mediaController.i1).k(nm7.m2, Integer.valueOf(mediaController.h1));
            mediaController.s(false);
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
        q30 q30Var = this.h;
        q30Var.b("finish requested: state=" + b10.B(this.G) + ", durationMs=" + j() + ", trim=" + this.r + ".." + this.s);
        if (this.G == 3) {
            this.v = true;
            this.i.removeCallbacks(this.D);
            s(7);
            this.n.e();
            return;
        }
        p();
        s(7);
        final f40 f40Var = this.z;
        if (f40Var == null) {
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
        final f40 d = d();
        this.j.execute(new Runnable() {
            @Override
            public final void run() {
                Object obj;
                f40 f40Var2 = f40Var;
                f40 f40Var3 = d;
                long j3 = j;
                long j4 = j2;
                h40 h40Var = h40.this;
                Handler handler = h40Var.i;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    String absolutePath = f40Var2.b.getAbsolutePath();
                    File file = f40Var3.b;
                    obj = file.getAbsolutePath();
                    try {
                        if (AudioRecorderNative.b(absolutePath, obj, j3, j4)) {
                            q30 q30Var2 = h40Var.h;
                            q30Var2.b("final trim completed: source=" + f40Var2.b.getName() + ", output=" + file.getName() + ", trim=" + j3 + ".." + j4 + ", bytes=" + file.length() + ", elapsedMs=" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                            h40Var.a(f40Var3, file.length());
                            handler.post(new w30(h40Var, j4, j3, (byte) 0));
                            return;
                        }
                        throw new IllegalStateException("Unable to trim final Opus output");
                    } catch (Throwable th) {
                        th = th;
                        handler.post(new x30(obj, th, (byte) 0));
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obj = h40Var;
                }
            }
        });
    }

    public final void i() {
        if (this.G != 7) {
            return;
        }
        f40 f40Var = this.z;
        if (f40Var == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        long j = j();
        if (j < this.c) {
            q30 q30Var = this.h;
            q30Var.b("recording rejected as too short: durationMs=" + j);
            MediaController mediaController = ((on6) this.f.b).a;
            nm7.f(mediaController.i1).k(nm7.t2, Integer.valueOf(mediaController.h1), Boolean.FALSE, Integer.valueOf((int) j));
            mediaController.s(false);
            k(2);
            s(10);
            c();
            t();
            l("too_short");
            return;
        }
        this.j.execute(new b(this, f40Var, j));
    }

    public final long j() {
        q();
        return r(this.p + this.q);
    }

    public final void k(int i) {
        String str;
        synchronized (this.l) {
            f40 f40Var = this.z;
            if (f40Var != null && f40Var.d && !f40Var.e) {
                f40Var.d = false;
                this.k.execute(new v30(this, f40Var, i));
                q30 q30Var = this.h;
                StringBuilder sb = new StringBuilder("output generation invalidated: id=");
                sb.append(f40Var.a);
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
                q30Var.b(sb.toString());
            }
        }
    }

    public final void l(String str) {
        if (this.y) {
            return;
        }
        this.y = true;
        StringBuilder p = wi8.p("session summary: terminal=", str, ", durationMs=");
        p.append(r(this.p + this.q));
        p.append(", generations=");
        p.append(this.t - 1);
        this.h.b(p.toString());
    }

    public final void m() {
        g40 e = e();
        hi2 hi2Var = this.f;
        MediaController mediaController = ((on6) hi2Var.b).a;
        int i = e.a;
        u30 u30Var = (u30) hi2Var.c;
        int i2 = u30Var.b;
        u30Var.b = i;
        if (i == 3) {
            if (!u30Var.a) {
                if (i2 == 2) {
                    System.currentTimeMillis();
                    String[] strArr = MediaController.W1;
                    if (!mediaController.J1) {
                        nm7.f(mediaController.i1).k(nm7.l2, Integer.valueOf(mediaController.h1), Boolean.TRUE);
                    }
                } else if (i2 == 6) {
                    mediaController.X(true);
                    nm7.f(mediaController.i1).k(nm7.p2, new Object[0]);
                }
            }
            if (u30Var.a) {
                if (i == 3 || i == 5) {
                    u30Var.a = false;
                    ((h40) u30Var.e).h();
                }
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
        h74 h74Var = this.A;
        if (h74Var != null) {
            h74Var.p0(this.F);
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
        this.h.b("state: " + b10.B(i2) + " -> " + b10.B(i) + ", durationMs=" + r(this.p + this.q));
        m();
    }

    public final void t() {
        this.j.shutdown();
        this.k.shutdown();
    }

    public final void u(long j, long j2, File file) {
        long j3 = this.o + 1;
        this.o = j3;
        f40 f40Var = this.z;
        if (f40Var == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        File file2 = f40Var.b;
        e40 e40Var = this.d;
        q30 q30Var = this.h;
        ?? obj = new Object();
        obj.c = this;
        obj.a = j3;
        obj.b = f40Var;
        final d dVar = new d(file2, file, j, j2, e40Var, q30Var, obj);
        this.n = dVar;
        this.q = 0L;
        dVar.k.post(new Runnable() {
            @Override
            public final void run() {
                String str;
                d dVar2 = d.this;
                File file3 = dVar2.b;
                q30 q30Var2 = dVar2.f;
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    AudioRecorderNative a = AudioRecorderNative.a(dVar2.c, dVar2.d, dVar2.a, dVar2.b);
                    dVar2.t = a;
                    if (a != null) {
                        if (dVar2.e == e40.b) {
                            AudioNoiseSuppressor a2 = AudioNoiseSuppressor.a();
                            dVar2.u = a2;
                            if (a2 == null) {
                                q30Var2.b("RNNoise unavailable; recording unprocessed PCM");
                            } else {
                                q30Var2.b("RNNoise started: sampleRate=48000, captureFrameSamples=960");
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
                        q30Var2.b(sb.toString());
                        dVar2.x = SystemClock.elapsedRealtime();
                        if (d > 0) {
                            m30 m30Var = dVar2.g;
                            ((h40) m30Var.c).a((f40) m30Var.b, d);
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
        dVar.i.post(new v00(dVar, (byte) 0));
    }
}
