package ki;

import a3.l0;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import di.n;
import e2.z;
import i2.i0;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLong;
import k2.t0;
import k2.u;
import ki.g;
import ki.i;
import ki.j;
import ki.k;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.at;
import org.telegram.messenger.f8;
import org.telegram.messenger.ne;
public final class k {
    public static final hb.a H = new hb.a(10);
    public static final AtomicLong I = new AtomicLong(1);
    public i0 A;
    public byte[] B;
    public g C;
    public final e D;
    public final e E;
    public final Context f11413a;
    public final File f11414b;
    public final long f11415c;
    public final i d;
    public final boolean e;
    public final m5.e f11416f;
    public final m4.c f11417g;
    public final b h;
    public org.telegram.utils.recorder.audio.d f11423n;
    public long f11424o;
    public long f11425p;
    public long f11426q;
    public long f11427r;
    public long f11428s;
    public boolean f11430u;
    public boolean v;
    public boolean f11431w;
    public boolean f11432x;
    public boolean f11433y;
    public volatile j f11434z;
    public final Handler f11418i = new Handler(Looper.getMainLooper());
    public final ExecutorService f11419j = Executors.newSingleThreadExecutor(new n(2));
    public final ExecutorService f11420k = Executors.newSingleThreadExecutor(new n(3));
    public final Object f11421l = new Object();
    public final ArrayList f11422m = new ArrayList();
    public int G = 1;
    public long f11429t = 1;
    public final z F = new z(this, 1);

    public k(t0 t0Var) {
        q();
        Context context = (Context) t0Var.f10767a;
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        this.f11413a = context;
        File file = (File) t0Var.f10769c;
        this.f11414b = file == null ? context.getCacheDir() : file;
        this.f11415c = 700L;
        i iVar = (i) t0Var.d;
        this.d = iVar;
        this.e = t0Var.f10768b;
        this.f11416f = (m5.e) t0Var.e;
        this.f11417g = (m4.c) t0Var.f10770f;
        b bVar = new b((h) t0Var.f10771g);
        this.h = bVar;
        this.D = new Runnable(this) {
            public final k f11400b;

            {
                this.f11400b = this;
            }

            @Override
            public final void run() {
                i0 i0Var;
                switch (r2) {
                    case 0:
                        k kVar = this.f11400b;
                        if (kVar.G == 3 && !kVar.f11431w) {
                            kVar.f11431w = true;
                            b bVar2 = kVar.h;
                            bVar2.b("maximum duration reached: durationMs=" + kVar.j());
                            kVar.f11416f.getClass();
                            kVar.n();
                            return;
                        }
                        return;
                    default:
                        k kVar2 = this.f11400b;
                        if (kVar2.G == 5 && (i0Var = kVar2.A) != null && kVar2.f11430u) {
                            long M0 = i0Var.M0();
                            long j10 = kVar2.f11427r;
                            if (M0 < j10 || M0 >= kVar2.f11428s) {
                                kVar2.A.Z0(5, j10);
                            }
                            m5.e eVar = kVar2.f11416f;
                            kVar2.j();
                            eVar.getClass();
                            kVar2.f11418i.postDelayed(kVar2.E, 32L);
                            return;
                        }
                        return;
                }
            }
        };
        this.E = new Runnable(this) {
            public final k f11400b;

            {
                this.f11400b = this;
            }

            @Override
            public final void run() {
                i0 i0Var;
                switch (r2) {
                    case 0:
                        k kVar = this.f11400b;
                        if (kVar.G == 3 && !kVar.f11431w) {
                            kVar.f11431w = true;
                            b bVar2 = kVar.h;
                            bVar2.b("maximum duration reached: durationMs=" + kVar.j());
                            kVar.f11416f.getClass();
                            kVar.n();
                            return;
                        }
                        return;
                    default:
                        k kVar2 = this.f11400b;
                        if (kVar2.G == 5 && (i0Var = kVar2.A) != null && kVar2.f11430u) {
                            long M0 = i0Var.M0();
                            long j10 = kVar2.f11427r;
                            if (M0 < j10 || M0 >= kVar2.f11428s) {
                                kVar2.A.Z0(5, j10);
                            }
                            m5.e eVar = kVar2.f11416f;
                            kVar2.j();
                            eVar.getClass();
                            kVar2.f11418i.postDelayed(kVar2.E, 32L);
                            return;
                        }
                        return;
                }
            }
        };
        bVar.b("session created: device=" + Build.MANUFACTURER + " " + Build.MODEL + ", sdk=" + Build.VERSION.SDK_INT + ", sampleRate=48000, noiseSuppression=" + iVar + ", minimumDurationMs=700, maximumDurationMs=0");
    }

    public static void q() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("AudioRecordingSession must be used on the main thread");
    }

    public static long r(long j10) {
        return (j10 * 1000) / 48000;
    }

    public final void a(j jVar, long j10) {
        if (j10 <= 0) {
            return;
        }
        synchronized (this.f11421l) {
            try {
                if (jVar.d && !jVar.e) {
                    long j11 = jVar.f11412c;
                    if (j10 > j11) {
                        jVar.f11412c = j10;
                        this.f11420k.execute(new c(this, jVar, j11, j10 - j11, 1));
                    }
                }
            } finally {
            }
        }
    }

    public final void b() {
        q();
        int i10 = this.G;
        if (i10 != 10 && i10 != 8) {
            this.h.b("cancel requested: state=".concat(i0.a.y(i10)));
            e eVar = this.D;
            Handler handler = this.f11418i;
            handler.removeCallbacks(eVar);
            handler.removeCallbacks(this.E);
            p();
            k(2);
            s(10);
            org.telegram.utils.recorder.audio.d dVar = this.f11423n;
            if (dVar != null) {
                dVar.d();
                return;
            }
            c();
            t();
        }
    }

    public final void c() {
        File file;
        if (this.f11432x) {
            return;
        }
        this.f11432x = true;
        g gVar = this.C;
        if (gVar == null) {
            file = null;
        } else {
            file = (File) gVar.f11405b;
        }
        u uVar = new u(9, this, file);
        try {
            this.f11419j.execute(uVar);
        } catch (RejectedExecutionException unused) {
            uVar.run();
        }
    }

    public final j d() {
        File f7 = f();
        long j10 = this.f11429t;
        this.f11429t = 1 + j10;
        j jVar = new j(j10, f7);
        synchronized (this.f11421l) {
            this.f11434z = jVar;
            this.f11420k.execute(new l0(this, jVar, f7, 29));
        }
        b bVar = this.h;
        StringBuilder s10 = a1.g.s(j10, "output generation started: id=", ", file=");
        s10.append(f7.getName());
        bVar.b(s10.toString());
        return jVar;
    }

    public final ae.j e() {
        return new ae.j(this.G);
    }

    public final File f() {
        File file = this.f11414b;
        File file2 = new File(file, "audio_recording_voice_" + System.currentTimeMillis() + "_" + I.getAndIncrement() + ".ogg");
        synchronized (this.f11422m) {
            this.f11422m.add(file2);
        }
        return file2;
    }

    public final void g(Exception exc) {
        int i10 = this.G;
        if (i10 != 9 && i10 != 10 && i10 != 8) {
            this.h.a("fatal error in state=".concat(i0.a.y(i10)), exc);
            Handler handler = this.f11418i;
            handler.removeCallbacks(this.D);
            handler.removeCallbacks(this.E);
            p();
            k(3);
            s(9);
            j jVar = this.f11434z;
            if (jVar != null) {
                this.f11420k.execute(new c(this, jVar, exc));
            }
            MediaController mediaController = ((ne) this.f11416f.f13014b).f17287a;
            String[] strArr = MediaController.U1;
            f8.e("AudioRecorderV2 failed", exc);
            at.f(mediaController.f14455g1).k(at.f14745m2, Integer.valueOf(mediaController.f14453f1));
            mediaController.x(false);
            org.telegram.utils.recorder.audio.d dVar = this.f11423n;
            if (dVar != null) {
                dVar.d();
            } else {
                c();
                t();
            }
            l("error");
        }
    }

    public final void h() {
        q();
        int i10 = this.G;
        if (i10 != 3 && i10 != 5) {
            return;
        }
        b bVar = this.h;
        bVar.b("finish requested: state=" + i0.a.y(this.G) + ", durationMs=" + j() + ", trim=" + this.f11427r + ".." + this.f11428s);
        if (this.G == 3) {
            this.v = true;
            this.f11418i.removeCallbacks(this.D);
            s(7);
            this.f11423n.d();
            return;
        }
        p();
        s(7);
        final j jVar = this.f11434z;
        if (jVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        long r10 = r(this.f11425p);
        final long j10 = this.f11427r;
        if (j10 == 0 && this.f11428s == r10) {
            i();
            return;
        }
        final long j11 = this.f11428s;
        k(1);
        final j d = d();
        this.f11419j.execute(new Runnable() {
            @Override
            public final void run() {
                String str;
                j jVar2 = jVar;
                j jVar3 = d;
                long j12 = j10;
                long j13 = j11;
                k kVar = k.this;
                Handler handler = kVar.f11418i;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    String absolutePath = jVar2.f11411b.getAbsolutePath();
                    File file = jVar3.f11411b;
                    String absolutePath2 = file.getAbsolutePath();
                    try {
                        if (AudioRecorderNative.b(absolutePath, absolutePath2, j12, j13)) {
                            ki.b bVar2 = kVar.h;
                            bVar2.b("final trim completed: source=" + jVar2.f11411b.getName() + ", output=" + file.getName() + ", trim=" + j12 + ".." + j13 + ", bytes=" + file.length() + ", elapsedMs=" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                            kVar.a(jVar3, file.length());
                            handler.post(new ki.d(kVar, j13, j12, 0));
                            return;
                        }
                        throw new IllegalStateException("Unable to trim final Opus output");
                    } catch (Throwable th2) {
                        th = th2;
                        str = absolutePath2;
                        handler.post(new u(8, str, th));
                    }
                } catch (Throwable th3) {
                    th = th3;
                    str = kVar;
                }
            }
        });
    }

    public final void i() {
        if (this.G != 7) {
            return;
        }
        j jVar = this.f11434z;
        if (jVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        long j10 = j();
        if (j10 < this.f11415c) {
            b bVar = this.h;
            bVar.b("recording rejected as too short: durationMs=" + j10);
            MediaController mediaController = ((ne) this.f11416f.f13014b).f17287a;
            at.f(mediaController.f14455g1).k(at.f14789t2, Integer.valueOf(mediaController.f14453f1), Boolean.FALSE, Integer.valueOf((int) j10));
            mediaController.x(false);
            k(2);
            s(10);
            c();
            t();
            l("too_short");
            return;
        }
        this.f11419j.execute(new org.telegram.utils.recorder.audio.b(j10, jVar, this));
    }

    public final long j() {
        q();
        return r(this.f11425p + this.f11426q);
    }

    public final void k(int i10) {
        String str;
        synchronized (this.f11421l) {
            j jVar = this.f11434z;
            if (jVar != null && jVar.d && !jVar.e) {
                jVar.d = false;
                this.f11420k.execute(new c(this, jVar, i10));
                b bVar = this.h;
                StringBuilder sb2 = new StringBuilder("output generation invalidated: id=");
                sb2.append(jVar.f11410a);
                sb2.append(", reason=");
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
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
                sb2.append(str);
                bVar.b(sb2.toString());
            }
        }
    }

    public final void l(String str) {
        if (this.f11433y) {
            return;
        }
        this.f11433y = true;
        StringBuilder u10 = a1.g.u("session summary: terminal=", str, ", durationMs=");
        u10.append(r(this.f11425p + this.f11426q));
        u10.append(", generations=");
        u10.append(this.f11429t - 1);
        this.h.b(u10.toString());
    }

    public final void m() {
        ae.j e = e();
        m5.e eVar = this.f11416f;
        MediaController mediaController = ((ne) eVar.f13014b).f17287a;
        int i10 = e.f425a;
        e0.h hVar = (e0.h) eVar.f13015c;
        int i11 = hVar.f6019a;
        hVar.f6019a = i10;
        if (i10 == 3) {
            boolean z10 = hVar.f6020b;
            if (!z10 && i11 == 2) {
                System.currentTimeMillis();
                String[] strArr = MediaController.U1;
                if (!mediaController.H1) {
                    at.f(mediaController.f14455g1).k(at.f14741l2, Integer.valueOf(mediaController.f14453f1), Boolean.TRUE);
                }
            } else if (!z10 && i11 == 6) {
                mediaController.Y(true);
                at.f(mediaController.f14455g1).k(at.f14763p2, new Object[0]);
            }
            if (hVar.f6020b) {
                if (i10 == 3 || i10 == 5) {
                    hVar.f6020b = false;
                    ((k) hVar.e).h();
                }
            }
        }
    }

    public final boolean n() {
        q();
        if (this.G == 3 && this.f11423n != null) {
            this.h.b("pause requested: durationMs=" + j());
            this.f11418i.removeCallbacks(this.D);
            s(4);
            this.f11423n.d();
            return true;
        }
        return false;
    }

    public final void o() {
        q();
        int i10 = this.G;
        if (i10 == 10) {
            return;
        }
        if (i10 != 8) {
            b();
            return;
        }
        p();
        c();
        s(10);
        l("released");
    }

    public final void p() {
        this.f11418i.removeCallbacks(this.E);
        this.f11430u = false;
        i0 i0Var = this.A;
        if (i0Var != null) {
            i0Var.C(this.F);
            this.A.X0();
            this.A = null;
        }
    }

    public final void s(int i10) {
        int i11 = this.G;
        if (i11 == i10) {
            return;
        }
        this.G = i10;
        this.h.b("state: " + i0.a.y(i11) + " -> " + i0.a.y(i10) + ", durationMs=" + r(this.f11425p + this.f11426q));
        m();
    }

    public final void t() {
        this.f11419j.shutdown();
        this.f11420k.shutdown();
    }

    public final void u(long j10, long j11, File file) {
        long j12 = this.f11424o + 1;
        this.f11424o = j12;
        j jVar = this.f11434z;
        if (jVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        final org.telegram.utils.recorder.audio.d dVar = new org.telegram.utils.recorder.audio.d(jVar.f11411b, file, j10, j11, this.d, this.h, new g(j12, jVar, this));
        this.f11423n = dVar;
        this.f11426q = 0L;
        dVar.f44287k.post(new Runnable() {
            @Override
            public final void run() {
                String str;
                d dVar2 = d.this;
                File file2 = dVar2.f44281b;
                ki.b bVar = dVar2.f44283f;
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    AudioRecorderNative a2 = AudioRecorderNative.a(dVar2.f44282c, dVar2.d, dVar2.f44280a, dVar2.f44281b);
                    dVar2.f44296t = a2;
                    if (a2 != null) {
                        if (dVar2.e == i.f11408b) {
                            AudioNoiseSuppressor a10 = AudioNoiseSuppressor.a();
                            dVar2.f44297u = a10;
                            if (a10 == null) {
                                bVar.b("RNNoise unavailable; recording unprocessed PCM");
                            } else {
                                bVar.b("RNNoise started: sampleRate=48000, captureFrameSamples=960");
                            }
                        }
                        long d = dVar2.f44296t.d();
                        StringBuilder sb2 = new StringBuilder("Opus encoder started: prefix=");
                        if (file2 == null) {
                            str = "none";
                        } else {
                            str = file2.getName() + " " + dVar2.f44282c + ".." + dVar2.d;
                        }
                        sb2.append(str);
                        sb2.append(", initialBytes=");
                        sb2.append(d);
                        sb2.append(", queuedChunks=");
                        sb2.append(dVar2.f44289m.get());
                        sb2.append(", elapsedMs=");
                        sb2.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                        bVar.b(sb2.toString());
                        dVar2.f44299x = SystemClock.elapsedRealtime();
                        if (d > 0) {
                            g gVar = dVar2.f44284g;
                            ((k) gVar.f11406c).a((j) gVar.f11405b, d);
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Unable to initialize native Opus recorder");
                } catch (Throwable th2) {
                    if (dVar2.v == null) {
                        dVar2.f44283f.a("encoding failed", th2);
                        dVar2.v = d.a(th2);
                        dVar2.f44290n = true;
                    }
                }
            }
        });
        dVar.f44285i.post(new a(dVar, 0));
    }
}
