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
public final class h30 {
    public static final vi2 H = new vi2((byte) 14);
    public static final AtomicLong I = new AtomicLong(1);
    public y54 A;
    public byte[] B;
    public m20 C;
    public final y20 D;
    public final y20 E;
    public final Context a;
    public final File b;
    public final short c;
    public final e30 d;
    public final boolean e;
    public final lv6 f;
    public final tg2 g;
    public final q20 h;
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
    public volatile f30 z;
    public final Handler i = new Handler(Looper.getMainLooper());
    public final ExecutorService j = Executors.newSingleThreadExecutor(new x20((byte) 0));
    public final ExecutorService k = Executors.newSingleThreadExecutor(new x20((byte) 1));
    public final Object l = new Object();
    public final ArrayList m = new ArrayList();
    public int G = 1;
    public long t = 1;
    public final b30 F = new b30(this, (byte) 0);

    public h30(c30 c30Var) {
        q();
        Context context = (Context) c30Var.b;
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        this.a = context;
        File file = (File) c30Var.c;
        this.b = file == null ? context.getCacheDir() : file;
        this.c = (short) 700;
        e30 e30Var = (e30) c30Var.d;
        this.d = e30Var;
        this.e = c30Var.a;
        this.f = (lv6) c30Var.e;
        this.g = (tg2) c30Var.f;
        q20 q20Var = new q20((d30) c30Var.g);
        this.h = q20Var;
        this.D = new Runnable(this) {
            public final h30 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                y54 y54Var;
                byte b = r2;
                h30 h30Var = this.b;
                switch (b) {
                    case 0:
                        if (h30Var.G == 3 && !h30Var.w) {
                            h30Var.w = true;
                            q20 q20Var2 = h30Var.h;
                            q20Var2.b("maximum duration reached: durationMs=" + h30Var.j());
                            h30Var.f.getClass();
                            h30Var.n();
                            return;
                        }
                        return;
                    default:
                        if (h30Var.G == 5 && (y54Var = h30Var.A) != null && h30Var.u) {
                            long m = y54Var.m();
                            long j = h30Var.r;
                            if (m < j || m >= h30Var.s) {
                                h30Var.A.k1(j);
                            }
                            lv6 lv6Var = h30Var.f;
                            h30Var.j();
                            lv6Var.getClass();
                            h30Var.i.postDelayed(h30Var.E, 32L);
                            return;
                        }
                        return;
                }
            }
        };
        this.E = new Runnable(this) {
            public final h30 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                y54 y54Var;
                byte b = r2;
                h30 h30Var = this.b;
                switch (b) {
                    case 0:
                        if (h30Var.G == 3 && !h30Var.w) {
                            h30Var.w = true;
                            q20 q20Var2 = h30Var.h;
                            q20Var2.b("maximum duration reached: durationMs=" + h30Var.j());
                            h30Var.f.getClass();
                            h30Var.n();
                            return;
                        }
                        return;
                    default:
                        if (h30Var.G == 5 && (y54Var = h30Var.A) != null && h30Var.u) {
                            long m = y54Var.m();
                            long j = h30Var.r;
                            if (m < j || m >= h30Var.s) {
                                h30Var.A.k1(j);
                            }
                            lv6 lv6Var = h30Var.f;
                            h30Var.j();
                            lv6Var.getClass();
                            h30Var.i.postDelayed(h30Var.E, 32L);
                            return;
                        }
                        return;
                }
            }
        };
        q20Var.b("session created: device=" + Build.MANUFACTURER + " " + Build.MODEL + ", sdk=" + Build.VERSION.SDK_INT + ", sampleRate=48000, noiseSuppression=" + e30Var + ", minimumDurationMs=700, maximumDurationMs=0");
    }

    public static void q() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        sc8.j("AudioRecordingSession must be used on the main thread");
    }

    public static long r(long j) {
        return (j * 1000) / 48000;
    }

    public final void a(f30 f30Var, long j) {
        if (j <= 0) {
            return;
        }
        synchronized (this.l) {
            if (f30Var.d && !f30Var.e) {
                long j2 = f30Var.c;
                if (j > j2) {
                    f30Var.c = j;
                    this.k.execute(new v20(this, f30Var, j2, j - j2, (byte) 1));
                }
            }
        }
    }

    public final void b() {
        q();
        int i = this.G;
        if (i != 10 && i != 8) {
            this.h.b("cancel requested: state=".concat(b00.B(this.G)));
            y20 y20Var = this.D;
            Handler handler = this.i;
            handler.removeCallbacks(y20Var);
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
        m20 m20Var = this.C;
        if (m20Var == null) {
            file = null;
        } else {
            file = (File) m20Var.b;
        }
        z20 z20Var = new z20(this, file, (byte) 0);
        try {
            this.j.execute(z20Var);
        } catch (RejectedExecutionException unused) {
            z20Var.run();
        }
    }

    public final f30 d() {
        File f = f();
        long j = this.t;
        this.t = 1 + j;
        f30 f30Var = new f30(j, f);
        synchronized (this.l) {
            this.z = f30Var;
            this.k.execute(new nn6(this, f30Var, f, (byte) 12));
        }
        q20 q20Var = this.h;
        StringBuilder o = ug8.o(j, "output generation started: id=", ", file=");
        o.append(f.getName());
        q20Var.b(o.toString());
        return f30Var;
    }

    public final g30 e() {
        return new g30(this.G);
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
            this.h.a("fatal error in state=".concat(b00.B(this.G)), exc);
            Handler handler = this.i;
            handler.removeCallbacks(this.D);
            handler.removeCallbacks(this.E);
            p();
            k(3);
            s(9);
            f30 f30Var = this.z;
            if (f30Var != null) {
                this.k.execute(new v20(this, f30Var, exc));
            }
            MediaController mediaController = ((ml6) this.f.b).a;
            String[] strArr = MediaController.W1;
            fa4.e("AudioRecorderV2 failed", exc);
            kk7.f(mediaController.i1).k(kk7.l2, Integer.valueOf(mediaController.h1));
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
        q20 q20Var = this.h;
        q20Var.b("finish requested: state=" + b00.B(this.G) + ", durationMs=" + j() + ", trim=" + this.r + ".." + this.s);
        if (this.G == 3) {
            this.v = true;
            this.i.removeCallbacks(this.D);
            s(7);
            this.n.e();
            return;
        }
        p();
        s(7);
        final f30 f30Var = this.z;
        if (f30Var == null) {
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
        final f30 d = d();
        this.j.execute(new Runnable() {
            @Override
            public final void run() {
                Object obj;
                f30 f30Var2 = f30Var;
                f30 f30Var3 = d;
                long j3 = j;
                long j4 = j2;
                h30 h30Var = h30.this;
                Handler handler = h30Var.i;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    String absolutePath = f30Var2.b.getAbsolutePath();
                    File file = f30Var3.b;
                    obj = file.getAbsolutePath();
                    try {
                        if (AudioRecorderNative.b(absolutePath, obj, j3, j4)) {
                            q20 q20Var2 = h30Var.h;
                            q20Var2.b("final trim completed: source=" + f30Var2.b.getName() + ", output=" + file.getName() + ", trim=" + j3 + ".." + j4 + ", bytes=" + file.length() + ", elapsedMs=" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                            h30Var.a(f30Var3, file.length());
                            handler.post(new w20(h30Var, j4, j3, (byte) 0));
                            return;
                        }
                        throw new IllegalStateException("Unable to trim final Opus output");
                    } catch (Throwable th) {
                        th = th;
                        handler.post(new ee2(obj, th, (byte) 29));
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obj = h30Var;
                }
            }
        });
    }

    public final void i() {
        if (this.G != 7) {
            return;
        }
        f30 f30Var = this.z;
        if (f30Var == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        long j = j();
        if (j < this.c) {
            q20 q20Var = this.h;
            q20Var.b("recording rejected as too short: durationMs=" + j);
            MediaController mediaController = ((ml6) this.f.b).a;
            kk7.f(mediaController.i1).k(kk7.s2, Integer.valueOf(mediaController.h1), Boolean.FALSE, Integer.valueOf((int) j));
            mediaController.s(false);
            k(2);
            s(10);
            c();
            t();
            l("too_short");
            return;
        }
        this.j.execute(new b(this, f30Var, j));
    }

    public final long j() {
        q();
        return r(this.p + this.q);
    }

    public final void k(int i) {
        String str;
        synchronized (this.l) {
            f30 f30Var = this.z;
            if (f30Var != null && f30Var.d && !f30Var.e) {
                f30Var.d = false;
                this.k.execute(new v20(this, f30Var, i));
                q20 q20Var = this.h;
                StringBuilder sb = new StringBuilder("output generation invalidated: id=");
                sb.append(f30Var.a);
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
                q20Var.b(sb.toString());
            }
        }
    }

    public final void l(String str) {
        if (this.y) {
            return;
        }
        this.y = true;
        StringBuilder p = ug8.p("session summary: terminal=", str, ", durationMs=");
        p.append(r(this.p + this.q));
        p.append(", generations=");
        p.append(this.t - 1);
        this.h.b(p.toString());
    }

    public final void m() {
        g30 e = e();
        lv6 lv6Var = this.f;
        MediaController mediaController = ((ml6) lv6Var.b).a;
        int i = e.a;
        u20 u20Var = (u20) lv6Var.c;
        int i2 = u20Var.b;
        u20Var.b = i;
        if (i == 3) {
            if (!u20Var.a) {
                if (i2 == 2) {
                    System.currentTimeMillis();
                    String[] strArr = MediaController.W1;
                    if (!mediaController.J1) {
                        kk7.f(mediaController.i1).k(kk7.k2, Integer.valueOf(mediaController.h1), Boolean.TRUE);
                    }
                } else if (i2 == 6) {
                    mediaController.X(true);
                    kk7.f(mediaController.i1).k(kk7.o2, new Object[0]);
                }
            }
            if (u20Var.a) {
                if (i == 3 || i == 5) {
                    u20Var.a = false;
                    ((h30) u20Var.e).h();
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
        y54 y54Var = this.A;
        if (y54Var != null) {
            y54Var.p0(this.F);
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
        this.h.b("state: " + b00.B(i2) + " -> " + b00.B(i) + ", durationMs=" + r(this.p + this.q));
        m();
    }

    public final void t() {
        this.j.shutdown();
        this.k.shutdown();
    }

    public final void u(long j, long j2, File file) {
        long j3 = this.o + 1;
        this.o = j3;
        f30 f30Var = this.z;
        if (f30Var == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        File file2 = f30Var.b;
        e30 e30Var = this.d;
        q20 q20Var = this.h;
        ?? obj = new Object();
        obj.c = this;
        obj.a = j3;
        obj.b = f30Var;
        final d dVar = new d(file2, file, j, j2, e30Var, q20Var, obj);
        this.n = dVar;
        this.q = 0L;
        dVar.k.post(new Runnable() {
            @Override
            public final void run() {
                String str;
                d dVar2 = d.this;
                File file3 = dVar2.b;
                q20 q20Var2 = dVar2.f;
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    AudioRecorderNative a = AudioRecorderNative.a(dVar2.c, dVar2.d, dVar2.a, dVar2.b);
                    dVar2.t = a;
                    if (a != null) {
                        if (dVar2.e == e30.b) {
                            AudioNoiseSuppressor a2 = AudioNoiseSuppressor.a();
                            dVar2.u = a2;
                            if (a2 == null) {
                                q20Var2.b("RNNoise unavailable; recording unprocessed PCM");
                            } else {
                                q20Var2.b("RNNoise started: sampleRate=48000, captureFrameSamples=960");
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
                        q20Var2.b(sb.toString());
                        dVar2.x = SystemClock.elapsedRealtime();
                        if (d > 0) {
                            m20 m20Var = dVar2.g;
                            ((h30) m20Var.c).a((f30) m20Var.b, d);
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
        dVar.i.post(new vz(dVar, (byte) 0));
    }
}
