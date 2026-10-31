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
import org.telegram.messenger.f8;
import org.telegram.messenger.me;
import org.telegram.messenger.zs;
public final class k {
    public static final hb.a H = new hb.a(10);
    public static final AtomicLong I = new AtomicLong(1);
    public i0 A;
    public byte[] B;
    public g C;
    public final e D;
    public final e E;
    public final Context f11412a;
    public final File f11413b;
    public final long f11414c;
    public final i d;
    public final boolean e;
    public final m5.e f11415f;
    public final m4.c f11416g;
    public final b h;
    public org.telegram.utils.recorder.audio.d f11422n;
    public long f11423o;
    public long f11424p;
    public long f11425q;
    public long f11426r;
    public long f11427s;
    public boolean f11429u;
    public boolean v;
    public boolean f11430w;
    public boolean f11431x;
    public boolean f11432y;
    public volatile j f11433z;
    public final Handler f11417i = new Handler(Looper.getMainLooper());
    public final ExecutorService f11418j = Executors.newSingleThreadExecutor(new n(2));
    public final ExecutorService f11419k = Executors.newSingleThreadExecutor(new n(3));
    public final Object f11420l = new Object();
    public final ArrayList f11421m = new ArrayList();
    public int G = 1;
    public long f11428t = 1;
    public final z F = new z(this, 1);

    public k(t0 t0Var) {
        q();
        Context context = (Context) t0Var.f10766a;
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        this.f11412a = context;
        File file = (File) t0Var.f10768c;
        this.f11413b = file == null ? context.getCacheDir() : file;
        this.f11414c = 700L;
        i iVar = (i) t0Var.d;
        this.d = iVar;
        this.e = t0Var.f10767b;
        this.f11415f = (m5.e) t0Var.e;
        this.f11416g = (m4.c) t0Var.f10769f;
        b bVar = new b((h) t0Var.f10770g);
        this.h = bVar;
        this.D = new Runnable(this) {
            public final k f11399b;

            {
                this.f11399b = this;
            }

            @Override
            public final void run() {
                i0 i0Var;
                switch (r2) {
                    case 0:
                        k kVar = this.f11399b;
                        if (kVar.G == 3 && !kVar.f11430w) {
                            kVar.f11430w = true;
                            b bVar2 = kVar.h;
                            bVar2.b("maximum duration reached: durationMs=" + kVar.j());
                            kVar.f11415f.getClass();
                            kVar.n();
                            return;
                        }
                        return;
                    default:
                        k kVar2 = this.f11399b;
                        if (kVar2.G == 5 && (i0Var = kVar2.A) != null && kVar2.f11429u) {
                            long M0 = i0Var.M0();
                            long j10 = kVar2.f11426r;
                            if (M0 < j10 || M0 >= kVar2.f11427s) {
                                kVar2.A.Z0(5, j10);
                            }
                            m5.e eVar = kVar2.f11415f;
                            kVar2.j();
                            eVar.getClass();
                            kVar2.f11417i.postDelayed(kVar2.E, 32L);
                            return;
                        }
                        return;
                }
            }
        };
        this.E = new Runnable(this) {
            public final k f11399b;

            {
                this.f11399b = this;
            }

            @Override
            public final void run() {
                i0 i0Var;
                switch (r2) {
                    case 0:
                        k kVar = this.f11399b;
                        if (kVar.G == 3 && !kVar.f11430w) {
                            kVar.f11430w = true;
                            b bVar2 = kVar.h;
                            bVar2.b("maximum duration reached: durationMs=" + kVar.j());
                            kVar.f11415f.getClass();
                            kVar.n();
                            return;
                        }
                        return;
                    default:
                        k kVar2 = this.f11399b;
                        if (kVar2.G == 5 && (i0Var = kVar2.A) != null && kVar2.f11429u) {
                            long M0 = i0Var.M0();
                            long j10 = kVar2.f11426r;
                            if (M0 < j10 || M0 >= kVar2.f11427s) {
                                kVar2.A.Z0(5, j10);
                            }
                            m5.e eVar = kVar2.f11415f;
                            kVar2.j();
                            eVar.getClass();
                            kVar2.f11417i.postDelayed(kVar2.E, 32L);
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
        synchronized (this.f11420l) {
            try {
                if (jVar.d && !jVar.e) {
                    long j11 = jVar.f11411c;
                    if (j10 > j11) {
                        jVar.f11411c = j10;
                        this.f11419k.execute(new c(this, jVar, j11, j10 - j11, 1));
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
            Handler handler = this.f11417i;
            handler.removeCallbacks(eVar);
            handler.removeCallbacks(this.E);
            p();
            k(2);
            s(10);
            org.telegram.utils.recorder.audio.d dVar = this.f11422n;
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
        if (this.f11431x) {
            return;
        }
        this.f11431x = true;
        g gVar = this.C;
        if (gVar == null) {
            file = null;
        } else {
            file = (File) gVar.f11404b;
        }
        u uVar = new u(9, this, file);
        try {
            this.f11418j.execute(uVar);
        } catch (RejectedExecutionException unused) {
            uVar.run();
        }
    }

    public final j d() {
        File f7 = f();
        long j10 = this.f11428t;
        this.f11428t = 1 + j10;
        j jVar = new j(j10, f7);
        synchronized (this.f11420l) {
            this.f11433z = jVar;
            this.f11419k.execute(new l0(this, jVar, f7, 29));
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
        File file = this.f11413b;
        File file2 = new File(file, "audio_recording_voice_" + System.currentTimeMillis() + "_" + I.getAndIncrement() + ".ogg");
        synchronized (this.f11421m) {
            this.f11421m.add(file2);
        }
        return file2;
    }

    public final void g(Exception exc) {
        int i10 = this.G;
        if (i10 != 9 && i10 != 10 && i10 != 8) {
            this.h.a("fatal error in state=".concat(i0.a.y(i10)), exc);
            Handler handler = this.f11417i;
            handler.removeCallbacks(this.D);
            handler.removeCallbacks(this.E);
            p();
            k(3);
            s(9);
            j jVar = this.f11433z;
            if (jVar != null) {
                this.f11419k.execute(new c(this, jVar, exc));
            }
            MediaController mediaController = ((me) this.f11415f.f13013b).f16945a;
            String[] strArr = MediaController.U1;
            f8.e("AudioRecorderV2 failed", exc);
            zs.f(mediaController.f14454g1).k(zs.f19649m2, Integer.valueOf(mediaController.f14452f1));
            mediaController.x(false);
            org.telegram.utils.recorder.audio.d dVar = this.f11422n;
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
        bVar.b("finish requested: state=" + i0.a.y(this.G) + ", durationMs=" + j() + ", trim=" + this.f11426r + ".." + this.f11427s);
        if (this.G == 3) {
            this.v = true;
            this.f11417i.removeCallbacks(this.D);
            s(7);
            this.f11422n.d();
            return;
        }
        p();
        s(7);
        final j jVar = this.f11433z;
        if (jVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        long r10 = r(this.f11424p);
        final long j10 = this.f11426r;
        if (j10 == 0 && this.f11427s == r10) {
            i();
            return;
        }
        final long j11 = this.f11427s;
        k(1);
        final j d = d();
        this.f11418j.execute(new Runnable() {
            @Override
            public final void run() {
                String str;
                j jVar2 = jVar;
                j jVar3 = d;
                long j12 = j10;
                long j13 = j11;
                k kVar = k.this;
                Handler handler = kVar.f11417i;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    String absolutePath = jVar2.f11410b.getAbsolutePath();
                    File file = jVar3.f11410b;
                    String absolutePath2 = file.getAbsolutePath();
                    try {
                        if (AudioRecorderNative.b(absolutePath, absolutePath2, j12, j13)) {
                            ki.b bVar2 = kVar.h;
                            bVar2.b("final trim completed: source=" + jVar2.f11410b.getName() + ", output=" + file.getName() + ", trim=" + j12 + ".." + j13 + ", bytes=" + file.length() + ", elapsedMs=" + (SystemClock.elapsedRealtime() - elapsedRealtime));
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
        j jVar = this.f11433z;
        if (jVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        long j10 = j();
        if (j10 < this.f11414c) {
            b bVar = this.h;
            bVar.b("recording rejected as too short: durationMs=" + j10);
            MediaController mediaController = ((me) this.f11415f.f13013b).f16945a;
            zs.f(mediaController.f14454g1).k(zs.f19693t2, Integer.valueOf(mediaController.f14452f1), Boolean.FALSE, Integer.valueOf((int) j10));
            mediaController.x(false);
            k(2);
            s(10);
            c();
            t();
            l("too_short");
            return;
        }
        this.f11418j.execute(new org.telegram.utils.recorder.audio.b(j10, jVar, this));
    }

    public final long j() {
        q();
        return r(this.f11424p + this.f11425q);
    }

    public final void k(int i10) {
        String str;
        synchronized (this.f11420l) {
            j jVar = this.f11433z;
            if (jVar != null && jVar.d && !jVar.e) {
                jVar.d = false;
                this.f11419k.execute(new c(this, jVar, i10));
                b bVar = this.h;
                StringBuilder sb2 = new StringBuilder("output generation invalidated: id=");
                sb2.append(jVar.f11409a);
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
        if (this.f11432y) {
            return;
        }
        this.f11432y = true;
        StringBuilder u10 = a1.g.u("session summary: terminal=", str, ", durationMs=");
        u10.append(r(this.f11424p + this.f11425q));
        u10.append(", generations=");
        u10.append(this.f11428t - 1);
        this.h.b(u10.toString());
    }

    public final void m() {
        ae.j e = e();
        m5.e eVar = this.f11415f;
        MediaController mediaController = ((me) eVar.f13013b).f16945a;
        int i10 = e.f425a;
        e0.h hVar = (e0.h) eVar.f13014c;
        int i11 = hVar.f6019a;
        hVar.f6019a = i10;
        if (i10 == 3) {
            boolean z10 = hVar.f6020b;
            if (!z10 && i11 == 2) {
                System.currentTimeMillis();
                String[] strArr = MediaController.U1;
                if (!mediaController.H1) {
                    zs.f(mediaController.f14454g1).k(zs.f19645l2, Integer.valueOf(mediaController.f14452f1), Boolean.TRUE);
                }
            } else if (!z10 && i11 == 6) {
                mediaController.Y(true);
                zs.f(mediaController.f14454g1).k(zs.f19667p2, new Object[0]);
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
        if (this.G == 3 && this.f11422n != null) {
            this.h.b("pause requested: durationMs=" + j());
            this.f11417i.removeCallbacks(this.D);
            s(4);
            this.f11422n.d();
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
        this.f11417i.removeCallbacks(this.E);
        this.f11429u = false;
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
        this.h.b("state: " + i0.a.y(i11) + " -> " + i0.a.y(i10) + ", durationMs=" + r(this.f11424p + this.f11425q));
        m();
    }

    public final void t() {
        this.f11418j.shutdown();
        this.f11419k.shutdown();
    }

    public final void u(long j10, long j11, File file) {
        long j12 = this.f11423o + 1;
        this.f11423o = j12;
        j jVar = this.f11433z;
        if (jVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        final org.telegram.utils.recorder.audio.d dVar = new org.telegram.utils.recorder.audio.d(jVar.f11410b, file, j10, j11, this.d, this.h, new g(j12, jVar, this));
        this.f11422n = dVar;
        this.f11425q = 0L;
        dVar.f44283k.post(new Runnable() {
            @Override
            public final void run() {
                String str;
                d dVar2 = d.this;
                File file2 = dVar2.f44277b;
                ki.b bVar = dVar2.f44279f;
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    AudioRecorderNative a2 = AudioRecorderNative.a(dVar2.f44278c, dVar2.d, dVar2.f44276a, dVar2.f44277b);
                    dVar2.f44292t = a2;
                    if (a2 != null) {
                        if (dVar2.e == i.f11407b) {
                            AudioNoiseSuppressor a10 = AudioNoiseSuppressor.a();
                            dVar2.f44293u = a10;
                            if (a10 == null) {
                                bVar.b("RNNoise unavailable; recording unprocessed PCM");
                            } else {
                                bVar.b("RNNoise started: sampleRate=48000, captureFrameSamples=960");
                            }
                        }
                        long d = dVar2.f44292t.d();
                        StringBuilder sb2 = new StringBuilder("Opus encoder started: prefix=");
                        if (file2 == null) {
                            str = "none";
                        } else {
                            str = file2.getName() + " " + dVar2.f44278c + ".." + dVar2.d;
                        }
                        sb2.append(str);
                        sb2.append(", initialBytes=");
                        sb2.append(d);
                        sb2.append(", queuedChunks=");
                        sb2.append(dVar2.f44285m.get());
                        sb2.append(", elapsedMs=");
                        sb2.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                        bVar.b(sb2.toString());
                        dVar2.f44295x = SystemClock.elapsedRealtime();
                        if (d > 0) {
                            g gVar = dVar2.f44280g;
                            ((k) gVar.f11405c).a((j) gVar.f11404b, d);
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Unable to initialize native Opus recorder");
                } catch (Throwable th2) {
                    if (dVar2.v == null) {
                        dVar2.f44279f.a("encoding failed", th2);
                        dVar2.v = d.a(th2);
                        dVar2.f44286n = true;
                    }
                }
            }
        });
        dVar.f44281i.post(new a(dVar, 0));
    }
}
