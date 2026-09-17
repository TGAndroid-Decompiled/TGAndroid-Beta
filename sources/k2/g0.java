package k2;

import ai.e6;
import ai.i5;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import b2.r0;
import b2.v0;
import ci.g7;
import com.google.android.gms.internal.vision.e2;
import e9.a1;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
public final class g0 implements p {
    public static final Object f13256o0 = new Object();
    public static ScheduledExecutorService f13257p0;
    public static int f13258q0;
    public a0 A;
    public b2.e B;
    public y C;
    public y D;
    public v0 E;
    public boolean F;
    public ByteBuffer G;
    public int H;
    public long I;
    public long J;
    public long K;
    public long L;
    public int M;
    public boolean N;
    public boolean O;
    public long P;
    public float Q;
    public ByteBuffer R;
    public int S;
    public ByteBuffer T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public int Z;
    public final Context f13259a;
    public boolean f13260a0;
    public final aa.a f13261b;
    public b2.f f13262b0;
    public final t f13263c;
    public a6.m f13264c0;
    public final o0 d;
    public boolean f13265d0;
    public final c2.l e;
    public long f13266e0;
    public final n0 f13267f;
    public long f13268f0;
    public final a1 f13269g;
    public boolean f13270g0;
    public final s h;
    public boolean f13271h0;
    public final ArrayDeque f13272i;
    public Looper f13273i0;
    public final boolean f13274j;
    public long f13275j0;
    public int f13276k;
    public long f13277k0;
    public f0 f13278l;
    public Handler f13279l0;
    public final b0 f13280m;
    public Context m0;
    public final b0 f13281n;
    public final boolean f13282n0;
    public final h0 f13283o;
    public final of.b f13284p;
    public final i0 f13285q;
    public final int f13286r;
    public j2.k f13287s;
    public n f13288t;
    public x f13289u;
    public x v;
    public c2.e f13290w;
    public AudioTrack f13291x;
    public b f13292y;
    public g7 f13293z;

    public g0(e6 e6Var) {
        Context applicationContext;
        int deviceId;
        Context context = (Context) e6Var.f765b;
        if (context == null) {
            applicationContext = null;
        } else {
            applicationContext = context.getApplicationContext();
        }
        this.f13259a = applicationContext;
        this.B = b2.e.h;
        this.f13292y = applicationContext == null ? (b) e6Var.f766c : null;
        this.f13261b = (aa.a) e6Var.d;
        int i10 = Build.VERSION.SDK_INT;
        this.f13274j = false;
        this.f13276k = 0;
        this.f13283o = (h0) e6Var.e;
        of.b bVar = (of.b) e6Var.f768g;
        bVar.getClass();
        this.f13284p = bVar;
        this.h = new s(new c0(this, 0));
        ?? iVar = new c2.i();
        this.f13263c = iVar;
        ?? iVar2 = new c2.i();
        iVar2.f13346m = e2.d0.f7889b;
        this.d = iVar2;
        this.e = new c2.i();
        this.f13267f = new c2.i();
        this.f13269g = e9.i0.A(iVar2, iVar);
        this.Q = 1.0f;
        this.Z = 0;
        this.f13262b0 = new Object();
        v0 v0Var = v0.d;
        this.D = new y(v0Var, 0L, 0L);
        this.E = v0Var;
        this.F = false;
        this.f13272i = new ArrayDeque();
        this.f13280m = new b0();
        this.f13281n = new b0();
        this.f13285q = (i0) e6Var.f767f;
        int i11 = -1;
        if (i10 >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i11 = deviceId;
        }
        this.f13286r = i11;
        this.f13282n0 = true;
    }

    public static boolean r(AudioTrack audioTrack) {
        if (Build.VERSION.SDK_INT >= 29 && audioTrack.isOffloadedPlayback()) {
            return true;
        }
        return false;
    }

    public final void A(int i10) {
        boolean z10 = false;
        if (this.f13260a0) {
            if (this.Z == i10) {
                this.f13260a0 = false;
            } else {
                return;
            }
        }
        if (this.Z != i10) {
            this.Z = i10;
            if (i10 != 0) {
                z10 = true;
            }
            this.Y = z10;
            g();
        }
    }

    public final void B() {
        if (q()) {
            try {
                this.f13291x.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.E.f3336a).setPitch(this.E.f3337b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                e2.a.o("DefaultAudioSink", "Failed to set playback params", e);
            }
            v0 v0Var = new v0(this.f13291x.getPlaybackParams().getSpeed(), this.f13291x.getPlaybackParams().getPitch());
            this.E = v0Var;
            float f7 = v0Var.f3336a;
            s sVar = this.h;
            sVar.f13365i = f7;
            r rVar = sVar.e;
            if (rVar != null) {
                rVar.a(0);
            }
            sVar.g();
        }
    }

    public final void C(b2.f fVar) {
        if (this.f13262b0.equals(fVar)) {
            return;
        }
        fVar.getClass();
        if (this.f13291x != null) {
            this.f13262b0.getClass();
        }
        this.f13262b0 = fVar;
    }

    public final void D(int i10, int i11) {
        x xVar;
        AudioTrack audioTrack = this.f13291x;
        if (audioTrack != null && r(audioTrack) && (xVar = this.v) != null && xVar.f13396k) {
            this.f13291x.setOffloadDelayPadding(i10, i11);
        }
    }

    public final void E(java.nio.ByteBuffer r19) {
        throw new UnsupportedOperationException("Method not decompiled: k2.g0.E(java.nio.ByteBuffer):void");
    }

    public final void F(v0 v0Var) {
        this.E = new v0(e2.d0.g(v0Var.f3336a, 0.1f, 8.0f), e2.d0.g(v0Var.f3337b, 0.1f, 8.0f));
        if (H()) {
            B();
            return;
        }
        y yVar = new y(v0Var, -9223372036854775807L, -9223372036854775807L);
        if (q()) {
            this.C = yVar;
        } else {
            this.D = yVar;
        }
    }

    public final boolean G(b2.s sVar) {
        if (k(sVar) != 0) {
            return true;
        }
        return false;
    }

    public final boolean H() {
        x xVar = this.v;
        if (xVar != null && xVar.f13395j && Build.VERSION.SDK_INT >= 23) {
            return true;
        }
        return false;
    }

    public final void a(long j3) {
        v0 v0Var;
        boolean z10;
        boolean z11;
        boolean H = H();
        boolean z12 = false;
        aa.a aVar = this.f13261b;
        if (!H) {
            if (!this.f13265d0) {
                x xVar = this.v;
                if (xVar.f13391c == 0) {
                    int i10 = xVar.f13389a.L;
                    v0Var = this.E;
                    c2.k kVar = (c2.k) aVar.d;
                    float f7 = v0Var.f3336a;
                    kVar.getClass();
                    if (f7 > 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    e2.d.b(z10);
                    if (kVar.f3697c != f7) {
                        kVar.f3697c = f7;
                        kVar.f3700i = true;
                    }
                    float f10 = v0Var.f3337b;
                    if (f10 > 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    e2.d.b(z11);
                    if (kVar.d != f10) {
                        kVar.d = f10;
                        kVar.f3700i = true;
                    }
                    this.E = v0Var;
                }
            }
            v0Var = v0.d;
            this.E = v0Var;
        } else {
            v0Var = v0.d;
        }
        v0 v0Var2 = v0Var;
        if (!this.f13265d0) {
            x xVar2 = this.v;
            if (xVar2.f13391c == 0) {
                int i11 = xVar2.f13389a.L;
                z12 = this.F;
                ((l0) aVar.f360c).f13327o = z12;
            }
        }
        this.F = z12;
        long max = Math.max(0L, j3);
        x xVar3 = this.v;
        this.f13272i.add(new y(v0Var2, max, e2.d0.W(xVar3.e, m())));
        c2.e eVar = this.v.f13394i;
        this.f13290w = eVar;
        eVar.a();
        n nVar = this.f13288t;
        if (nVar != null) {
            nVar.onSkipSilenceEnabledChanged(this.F);
        }
    }

    public final AudioTrack b(k kVar, b2.e eVar, int i10, b2.s sVar, Context context) {
        try {
            AudioTrack a2 = this.f13285q.a(kVar, eVar, i10, context);
            int state = a2.getState();
            if (state == 1) {
                return a2;
            }
            try {
                a2.release();
            } catch (Exception unused) {
            }
            throw new m(state, kVar.f13314b, kVar.f13315c, kVar.f13313a, kVar.f13316f, sVar, kVar.e, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new m(0, kVar.f13314b, kVar.f13315c, kVar.f13313a, kVar.f13316f, sVar, kVar.e, e);
        }
    }

    public final android.media.AudioTrack c(k2.x r9) {
        throw new UnsupportedOperationException("Method not decompiled: k2.g0.c(k2.x):android.media.AudioTrack");
    }

    public final void d(b2.s r27, int[] r28) {
        throw new UnsupportedOperationException("Method not decompiled: k2.g0.d(b2.s, int[]):void");
    }

    public final void e(long j3) {
        int write;
        n nVar;
        boolean z10;
        boolean z11;
        b0 b0Var = this.f13281n;
        if (this.T != null) {
            boolean z12 = false;
            if (b0Var.f13232a != null) {
                synchronized (f13256o0) {
                    if (f13258q0 > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                if (z11 || SystemClock.elapsedRealtime() < b0Var.f13234c) {
                    return;
                }
            }
            int remaining = this.T.remaining();
            if (this.f13265d0) {
                if (j3 != -9223372036854775807L) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e2.d.g(z10);
                if (j3 == Long.MIN_VALUE) {
                    j3 = this.f13266e0;
                } else {
                    this.f13266e0 = j3;
                }
                AudioTrack audioTrack = this.f13291x;
                ByteBuffer byteBuffer = this.T;
                if (Build.VERSION.SDK_INT >= 26) {
                    write = audioTrack.write(byteBuffer, remaining, 1, 1000 * j3);
                } else {
                    if (this.G == null) {
                        ByteBuffer allocate = ByteBuffer.allocate(16);
                        this.G = allocate;
                        allocate.order(ByteOrder.BIG_ENDIAN);
                        this.G.putInt(1431633921);
                    }
                    if (this.H == 0) {
                        this.G.putInt(4, remaining);
                        this.G.putLong(8, j3 * 1000);
                        this.G.position(0);
                        this.H = remaining;
                    }
                    int remaining2 = this.G.remaining();
                    if (remaining2 > 0) {
                        int write2 = audioTrack.write(this.G, remaining2, 1);
                        if (write2 < 0) {
                            this.H = 0;
                            write = write2;
                        } else if (write2 < remaining2) {
                            write = 0;
                        }
                    }
                    write = audioTrack.write(byteBuffer, remaining, 1);
                    if (write < 0) {
                        this.H = 0;
                    } else {
                        this.H -= write;
                    }
                }
            } else {
                write = this.f13291x.write(this.T, remaining, 1);
            }
            this.f13268f0 = SystemClock.elapsedRealtime();
            if (write < 0) {
                if ((Build.VERSION.SDK_INT >= 24 && write == -6) || write == -32) {
                    if (m() <= 0) {
                        if (r(this.f13291x)) {
                            if (this.v.f13391c == 1) {
                                this.f13270g0 = true;
                            }
                        }
                    }
                    z12 = true;
                }
                o oVar = new o(write, this.v.f13389a, z12);
                n nVar2 = this.f13288t;
                if (nVar2 != null) {
                    nVar2.R(oVar);
                }
                if (oVar.f13340b && this.f13259a != null) {
                    b bVar = b.f13229c;
                    this.f13292y = bVar;
                    this.f13293z.a(bVar);
                    throw oVar;
                }
                b0Var.a(oVar);
                return;
            }
            b0Var.f13232a = null;
            b0Var.f13233b = -9223372036854775807L;
            b0Var.f13234c = -9223372036854775807L;
            if (r(this.f13291x)) {
                if (this.L > 0) {
                    this.f13271h0 = false;
                }
                if (this.X && (nVar = this.f13288t) != null && write < remaining && !this.f13271h0) {
                    nVar.r();
                }
            }
            int i10 = this.v.f13391c;
            if (i10 == 0) {
                this.K += write;
            }
            if (write == remaining) {
                if (i10 != 0) {
                    if (this.T == this.R) {
                        z12 = true;
                    }
                    e2.d.g(z12);
                    this.L = (this.M * this.S) + this.L;
                }
                this.T = null;
            }
        }
    }

    public final boolean f() {
        throw new UnsupportedOperationException("Method not decompiled: k2.g0.f():boolean");
    }

    public final void g() {
        a0 a0Var;
        if (q()) {
            this.I = 0L;
            this.J = 0L;
            this.K = 0L;
            this.L = 0L;
            this.f13271h0 = false;
            this.M = 0;
            this.D = new y(this.E, 0L, 0L);
            this.P = 0L;
            this.C = null;
            this.f13272i.clear();
            this.R = null;
            this.S = 0;
            this.T = null;
            this.V = false;
            this.U = false;
            this.W = false;
            this.G = null;
            this.H = 0;
            this.d.f13348o = 0L;
            c2.e eVar = this.v.f13394i;
            this.f13290w = eVar;
            eVar.a();
            AudioTrack audioTrack = this.h.f13362c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f13291x.pause();
            }
            if (r(this.f13291x)) {
                f0 f0Var = this.f13278l;
                f0Var.getClass();
                f0Var.a(this.f13291x);
            }
            k a2 = this.v.a();
            x xVar = this.f13289u;
            if (xVar != null) {
                this.v = xVar;
                this.f13289u = null;
            }
            s sVar = this.h;
            sVar.g();
            sVar.f13362c = null;
            sVar.e = null;
            if (Build.VERSION.SDK_INT >= 24 && (a0Var = this.A) != null) {
                a0Var.b();
                this.A = null;
            }
            AudioTrack audioTrack2 = this.f13291x;
            n nVar = this.f13288t;
            Handler handler = new Handler(Looper.myLooper());
            synchronized (f13256o0) {
                try {
                    if (f13257p0 == null) {
                        String str = e2.d0.f7888a;
                        f13257p0 = Executors.newSingleThreadScheduledExecutor(new e2.c0(0));
                    }
                    f13258q0++;
                    f13257p0.schedule(new i5(audioTrack2, nVar, handler, a2, 19), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f13291x = null;
        }
        b0 b0Var = this.f13281n;
        b0Var.f13232a = null;
        b0Var.f13233b = -9223372036854775807L;
        b0Var.f13234c = -9223372036854775807L;
        b0 b0Var2 = this.f13280m;
        b0Var2.f13232a = null;
        b0Var2.f13233b = -9223372036854775807L;
        b0Var2.f13234c = -9223372036854775807L;
        this.f13275j0 = 0L;
        this.f13277k0 = 0L;
        Handler handler2 = this.f13279l0;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    public final long h() {
        boolean z10;
        long j3;
        if (!q()) {
            return -9223372036854775807L;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return e0.b.c(this.f13291x, this.v);
        }
        x xVar = this.v;
        if (xVar.f13391c == 0) {
            j3 = xVar.e * xVar.d;
        } else {
            int i10 = c3.b.i(xVar.f13393g);
            if (i10 != -2147483647) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.g(z10);
            j3 = i10;
        }
        return e2.d0.Y(this.v.h, 1000000L, j3, RoundingMode.DOWN);
    }

    public final long i() {
        ArrayDeque arrayDeque;
        long j3;
        c2.j jVar;
        if (q() && !this.O) {
            long min = Math.min(this.h.a(), e2.d0.W(this.v.e, m()));
            while (true) {
                arrayDeque = this.f13272i;
                if (arrayDeque.isEmpty() || min < ((y) arrayDeque.getFirst()).f13400c) {
                    break;
                }
                this.D = (y) arrayDeque.remove();
            }
            y yVar = this.D;
            long j10 = min - yVar.f13400c;
            long z10 = e2.d0.z(j10, yVar.f13398a.f3336a);
            boolean isEmpty = arrayDeque.isEmpty();
            aa.a aVar = this.f13261b;
            if (isEmpty) {
                c2.k kVar = (c2.k) aVar.d;
                if (kVar.isActive()) {
                    if (kVar.f3706o >= 1024) {
                        long j11 = kVar.f3705n;
                        kVar.f3701j.getClass();
                        long j12 = j11 - ((jVar.f3684k * jVar.f3678b) * 2);
                        int i10 = kVar.h.f3669a;
                        int i11 = kVar.f3699g.f3669a;
                        if (i10 == i11) {
                            j10 = e2.d0.Y(j10, j12, kVar.f3706o, RoundingMode.DOWN);
                        } else {
                            j10 = e2.d0.Y(j10, j12 * i10, kVar.f3706o * i11, RoundingMode.DOWN);
                        }
                    } else {
                        j10 = (long) (kVar.f3697c * j10);
                    }
                }
                y yVar2 = this.D;
                j3 = yVar2.f13399b + j10;
                yVar2.d = j10 - z10;
            } else {
                y yVar3 = this.D;
                j3 = yVar3.f13399b + z10 + yVar3.d;
            }
            long j13 = ((l0) aVar.f360c).f13329q;
            long W = e2.d0.W(this.v.e, j13) + j3;
            long j14 = this.f13275j0;
            if (j13 > j14) {
                long W2 = e2.d0.W(this.v.e, j13 - j14);
                this.f13275j0 = j13;
                this.f13277k0 += W2;
                if (this.f13279l0 == null) {
                    this.f13279l0 = new Handler(Looper.myLooper());
                }
                this.f13279l0.removeCallbacksAndMessages(null);
                this.f13279l0.postDelayed(new i2.g0(this, 8), 100L);
            }
            return W;
        }
        return Long.MIN_VALUE;
    }

    public final e j(b2.s sVar) {
        boolean booleanValue;
        boolean z10;
        if (this.f13270g0) {
            return e.d;
        }
        b2.e eVar = this.B;
        of.b bVar = this.f13284p;
        bVar.getClass();
        sVar.getClass();
        int i10 = sVar.K;
        eVar.getClass();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29 && i10 != -1) {
            Context context = (Context) bVar.f15521b;
            Boolean bool = (Boolean) bVar.f15522c;
            if (bool != null) {
                booleanValue = bool.booleanValue();
            } else {
                if (context != null) {
                    String parameters = c2.d.e(context).getParameters("offloadVariableRateSupported");
                    if (parameters != null && parameters.equals("offloadVariableRateSupported=1")) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    bVar.f15522c = Boolean.valueOf(z10);
                } else {
                    bVar.f15522c = Boolean.FALSE;
                }
                booleanValue = ((Boolean) bVar.f15522c).booleanValue();
            }
            String str = sVar.f3309r;
            str.getClass();
            int c10 = r0.c(str, sVar.f3302k);
            if (c10 != 0 && i11 >= e2.d0.q(c10)) {
                int s10 = e2.d0.s(sVar.J);
                if (s10 == 0) {
                    return e.d;
                }
                try {
                    AudioFormat r10 = e2.d0.r(i10, s10, c10);
                    if (i11 >= 31) {
                        return e0.h0.a(r10, (AudioAttributes) eVar.b().f3344a, booleanValue);
                    }
                    return b2.c.f(r10, (AudioAttributes) eVar.b().f3344a, booleanValue);
                } catch (IllegalArgumentException unused) {
                    return e.d;
                }
            }
            return e.d;
        }
        return e.d;
    }

    public final int k(b2.s sVar) {
        s();
        String str = sVar.f3309r;
        int i10 = sVar.L;
        if ("audio/raw".equals(str)) {
            if (!e2.d0.K(i10)) {
                e2.m(i10, "Invalid PCM encoding: ", "DefaultAudioSink");
                return 0;
            } else if (i10 != 2) {
                return 1;
            }
        } else if (this.f13292y.d(this.B, sVar) == null) {
            return 0;
        }
        return 2;
    }

    public final long l() {
        x xVar = this.v;
        if (xVar.f13391c == 0) {
            return this.I / xVar.f13390b;
        }
        return this.J;
    }

    public final long m() {
        x xVar = this.v;
        if (xVar.f13391c == 0) {
            long j3 = this.K;
            long j10 = xVar.d;
            String str = e2.d0.f7888a;
            return ((j3 + j10) - 1) / j10;
        }
        return this.L;
    }

    public final boolean n(long r27, int r29, java.nio.ByteBuffer r30) {
        throw new UnsupportedOperationException("Method not decompiled: k2.g0.n(long, int, java.nio.ByteBuffer):boolean");
    }

    public final boolean o() {
        if (q()) {
            if ((Build.VERSION.SDK_INT < 29 || !this.f13291x.isOffloadedPlayback() || !this.W) && this.h.e(m())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean p() {
        throw new UnsupportedOperationException("Method not decompiled: k2.g0.p():boolean");
    }

    public final boolean q() {
        if (this.f13291x != null) {
            return true;
        }
        return false;
    }

    public final void s() {
        boolean z10;
        String name;
        Context context;
        b bVar;
        c cVar;
        Looper myLooper = Looper.myLooper();
        if (this.f13293z != null && this.f13273i0 != myLooper) {
            z10 = false;
        } else {
            z10 = true;
        }
        StringBuilder sb2 = new StringBuilder("DefaultAudioSink accessed on multiple threads: ");
        Looper looper = this.f13273i0;
        String str = "null";
        if (looper == null) {
            name = "null";
        } else {
            name = looper.getThread().getName();
        }
        sb2.append(name);
        sb2.append(" and ");
        if (myLooper != null) {
            str = myLooper.getThread().getName();
        }
        sb2.append(str);
        e2.d.f(sb2.toString(), z10);
        if (this.f13293z == null && (context = this.f13259a) != null) {
            this.f13273i0 = myLooper;
            g7 g7Var = new g7(context, new v(this, 0), this.B, this.f13264c0);
            this.f13293z = g7Var;
            Handler handler = (Handler) g7Var.d;
            Context context2 = (Context) g7Var.f4693b;
            if (g7Var.f4692a) {
                bVar = (b) g7Var.h;
                bVar.getClass();
            } else {
                g7Var.f4692a = true;
                d dVar = (d) g7Var.f4696g;
                if (dVar != null) {
                    dVar.f13238a.registerContentObserver(dVar.f13239b, false, dVar);
                }
                if (Build.VERSION.SDK_INT >= 23 && (cVar = (c) g7Var.e) != null) {
                    e0.b.u(context2, cVar, handler);
                }
                b b10 = b.b(context2, context2.registerReceiver((androidx.mediarouter.app.g) g7Var.f4695f, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), (b2.e) g7Var.f4698j, (a6.m) g7Var.f4697i);
                g7Var.h = b10;
                bVar = b10;
            }
            this.f13292y = bVar;
        }
        this.f13292y.getClass();
    }

    public final void t() {
        this.X = false;
        if (q()) {
            s sVar = this.h;
            sVar.g();
            if (sVar.f13381z == -9223372036854775807L) {
                r rVar = sVar.e;
                rVar.getClass();
                rVar.a(0);
            }
            sVar.B = sVar.b();
            if (!this.V || r(this.f13291x)) {
                this.f13291x.pause();
            }
        }
    }

    public final void u() {
        this.X = true;
        if (q()) {
            s sVar = this.h;
            if (sVar.f13381z != -9223372036854775807L) {
                sVar.I.getClass();
                sVar.f13381z = e2.d0.Q(SystemClock.elapsedRealtime());
            }
            sVar.f13367k = e2.d0.W(sVar.f13363f, sVar.b());
            r rVar = sVar.e;
            rVar.getClass();
            rVar.a(0);
            if (!this.V || r(this.f13291x)) {
                this.f13291x.play();
            }
        }
    }

    public final void v() {
        if (!this.V) {
            this.V = true;
            long m10 = m();
            s sVar = this.h;
            sVar.B = sVar.b();
            sVar.I.getClass();
            sVar.f13381z = e2.d0.Q(SystemClock.elapsedRealtime());
            sVar.C = m10;
            if (r(this.f13291x)) {
                this.W = false;
            }
            this.f13291x.stop();
            this.H = 0;
        }
    }

    public final void w() {
        if (!this.U && q() && f()) {
            v();
            this.U = true;
        }
    }

    public final void x(long r4) {
        throw new UnsupportedOperationException("Method not decompiled: k2.g0.x(long):void");
    }

    public final void y() {
        g();
        e9.g0 listIterator = this.f13269g.listIterator(0);
        while (listIterator.hasNext()) {
            ((c2.h) listIterator.next()).reset();
        }
        this.e.reset();
        this.f13267f.reset();
        c2.e eVar = this.f13290w;
        if (eVar != null) {
            e9.i0 i0Var = eVar.f3666a;
            for (int i10 = 0; i10 < i0Var.size(); i10++) {
                c2.h hVar = (c2.h) i0Var.get(i10);
                hVar.flush();
                hVar.reset();
            }
            eVar.f3668c = new ByteBuffer[0];
            c2.f fVar = c2.f.e;
            eVar.d = false;
        }
        this.X = false;
        this.f13270g0 = false;
    }

    public final void z(b2.e eVar) {
        if (!this.B.equals(eVar)) {
            this.B = eVar;
            if (this.f13265d0) {
                return;
            }
            g7 g7Var = this.f13293z;
            if (g7Var != null) {
                g7Var.f4698j = eVar;
                g7Var.a(b.c((Context) g7Var.f4693b, eVar, (a6.m) g7Var.f4697i));
            }
            g();
        }
    }
}
