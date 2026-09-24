package k2;

import ai.d6;
import ai.h5;
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
import ci.e7;
import com.google.android.gms.internal.vision.e2;
import e9.a1;
import ei.d5;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
public final class e0 implements p {
    public static final Object f13234o0 = new Object();
    public static ScheduledExecutorService f13235p0;
    public static int f13236q0;
    public z A;
    public b2.e B;
    public x C;
    public x D;
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
    public final Context f13237a;
    public boolean f13238a0;
    public final aa.a f13239b;
    public b2.f f13240b0;
    public final t f13241c;
    public a6.m f13242c0;
    public final m0 d;
    public boolean f13243d0;
    public final c2.l e;
    public long f13244e0;
    public final l0 f13245f;
    public long f13246f0;
    public final a1 f13247g;
    public boolean f13248g0;
    public final s h;
    public boolean f13249h0;
    public final ArrayDeque f13250i;
    public Looper f13251i0;
    public final boolean f13252j;
    public long f13253j0;
    public int f13254k;
    public long f13255k0;
    public d0 f13256l;
    public Handler f13257l0;
    public final a0 f13258m;
    public Context m0;
    public final a0 f13259n;
    public final boolean f13260n0;
    public final f0 f13261o;
    public final of.b f13262p;
    public final g0 f13263q;
    public final int f13264r;
    public j2.k f13265s;
    public n f13266t;
    public w f13267u;
    public w v;
    public c2.e f13268w;
    public AudioTrack f13269x;
    public b f13270y;
    public e7 f13271z;

    public e0(d6 d6Var) {
        Context applicationContext;
        int deviceId;
        Context context = (Context) d6Var.f712b;
        if (context == null) {
            applicationContext = null;
        } else {
            applicationContext = context.getApplicationContext();
        }
        this.f13237a = applicationContext;
        this.B = b2.e.h;
        this.f13270y = applicationContext == null ? (b) d6Var.f713c : null;
        this.f13239b = (aa.a) d6Var.d;
        int i10 = Build.VERSION.SDK_INT;
        this.f13252j = false;
        this.f13254k = 0;
        this.f13261o = (f0) d6Var.e;
        of.b bVar = (of.b) d6Var.f715g;
        bVar.getClass();
        this.f13262p = bVar;
        this.h = new s(new a6.i(this, 29));
        ?? iVar = new c2.i();
        this.f13241c = iVar;
        ?? iVar2 = new c2.i();
        iVar2.f13327m = e2.d0.f7871b;
        this.d = iVar2;
        this.e = new c2.i();
        this.f13245f = new c2.i();
        this.f13247g = e9.i0.A(iVar2, iVar);
        this.Q = 1.0f;
        this.Z = 0;
        this.f13240b0 = new Object();
        v0 v0Var = v0.d;
        this.D = new x(v0Var, 0L, 0L);
        this.E = v0Var;
        this.F = false;
        this.f13250i = new ArrayDeque();
        this.f13258m = new a0();
        this.f13259n = new a0();
        this.f13263q = (g0) d6Var.f714f;
        int i11 = -1;
        if (i10 >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i11 = deviceId;
        }
        this.f13264r = i11;
        this.f13260n0 = true;
    }

    public static boolean r(AudioTrack audioTrack) {
        if (Build.VERSION.SDK_INT >= 29 && audioTrack.isOffloadedPlayback()) {
            return true;
        }
        return false;
    }

    public final void A(int i10) {
        boolean z10 = false;
        if (this.f13238a0) {
            if (this.Z == i10) {
                this.f13238a0 = false;
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
                this.f13269x.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.E.f3328a).setPitch(this.E.f3329b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                e2.a.o("DefaultAudioSink", "Failed to set playback params", e);
            }
            v0 v0Var = new v0(this.f13269x.getPlaybackParams().getSpeed(), this.f13269x.getPlaybackParams().getPitch());
            this.E = v0Var;
            float f7 = v0Var.f3328a;
            s sVar = this.h;
            sVar.f13349i = f7;
            r rVar = sVar.e;
            if (rVar != null) {
                rVar.a(0);
            }
            sVar.g();
        }
    }

    public final void C(b2.f fVar) {
        if (this.f13240b0.equals(fVar)) {
            return;
        }
        fVar.getClass();
        if (this.f13269x != null) {
            this.f13240b0.getClass();
        }
        this.f13240b0 = fVar;
    }

    public final void D(int i10, int i11) {
        w wVar;
        AudioTrack audioTrack = this.f13269x;
        if (audioTrack != null && r(audioTrack) && (wVar = this.v) != null && wVar.f13378k) {
            this.f13269x.setOffloadDelayPadding(i10, i11);
        }
    }

    public final void E(java.nio.ByteBuffer r19) {
        throw new UnsupportedOperationException("Method not decompiled: k2.e0.E(java.nio.ByteBuffer):void");
    }

    public final void F(v0 v0Var) {
        this.E = new v0(e2.d0.g(v0Var.f3328a, 0.1f, 8.0f), e2.d0.g(v0Var.f3329b, 0.1f, 8.0f));
        if (H()) {
            B();
            return;
        }
        x xVar = new x(v0Var, -9223372036854775807L, -9223372036854775807L);
        if (q()) {
            this.C = xVar;
        } else {
            this.D = xVar;
        }
    }

    public final boolean G(b2.s sVar) {
        if (k(sVar) != 0) {
            return true;
        }
        return false;
    }

    public final boolean H() {
        w wVar = this.v;
        if (wVar != null && wVar.f13377j && Build.VERSION.SDK_INT >= 23) {
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
        aa.a aVar = this.f13239b;
        if (!H) {
            if (!this.f13243d0) {
                w wVar = this.v;
                if (wVar.f13373c == 0) {
                    int i10 = wVar.f13371a.L;
                    v0Var = this.E;
                    c2.k kVar = (c2.k) aVar.d;
                    float f7 = v0Var.f3328a;
                    kVar.getClass();
                    if (f7 > 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    e2.d.b(z10);
                    if (kVar.f3689c != f7) {
                        kVar.f3689c = f7;
                        kVar.f3692i = true;
                    }
                    float f10 = v0Var.f3329b;
                    if (f10 > 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    e2.d.b(z11);
                    if (kVar.d != f10) {
                        kVar.d = f10;
                        kVar.f3692i = true;
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
        if (!this.f13243d0) {
            w wVar2 = this.v;
            if (wVar2.f13373c == 0) {
                int i11 = wVar2.f13371a.L;
                z12 = this.F;
                ((j0) aVar.f360c).f13306o = z12;
            }
        }
        this.F = z12;
        long max = Math.max(0L, j3);
        w wVar3 = this.v;
        this.f13250i.add(new x(v0Var2, max, e2.d0.W(wVar3.e, m())));
        c2.e eVar = this.v.f13376i;
        this.f13268w = eVar;
        eVar.a();
        n nVar = this.f13266t;
        if (nVar != null) {
            nVar.onSkipSilenceEnabledChanged(this.F);
        }
    }

    public final AudioTrack b(k kVar, b2.e eVar, int i10, b2.s sVar, Context context) {
        try {
            AudioTrack a2 = this.f13263q.a(kVar, eVar, i10, context);
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

    public final android.media.AudioTrack c(k2.w r9) {
        throw new UnsupportedOperationException("Method not decompiled: k2.e0.c(k2.w):android.media.AudioTrack");
    }

    public final void d(b2.s r27, int[] r28) {
        throw new UnsupportedOperationException("Method not decompiled: k2.e0.d(b2.s, int[]):void");
    }

    public final void e(long j3) {
        int write;
        n nVar;
        boolean z10;
        boolean z11;
        a0 a0Var = this.f13259n;
        if (this.T != null) {
            boolean z12 = false;
            if (a0Var.f13215a != null) {
                synchronized (f13234o0) {
                    if (f13236q0 > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                if (z11 || SystemClock.elapsedRealtime() < a0Var.f13217c) {
                    return;
                }
            }
            int remaining = this.T.remaining();
            if (this.f13243d0) {
                if (j3 != -9223372036854775807L) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e2.d.g(z10);
                if (j3 == Long.MIN_VALUE) {
                    j3 = this.f13244e0;
                } else {
                    this.f13244e0 = j3;
                }
                AudioTrack audioTrack = this.f13269x;
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
                write = this.f13269x.write(this.T, remaining, 1);
            }
            this.f13246f0 = SystemClock.elapsedRealtime();
            if (write < 0) {
                if ((Build.VERSION.SDK_INT >= 24 && write == -6) || write == -32) {
                    if (m() <= 0) {
                        if (r(this.f13269x)) {
                            if (this.v.f13373c == 1) {
                                this.f13248g0 = true;
                            }
                        }
                    }
                    z12 = true;
                }
                o oVar = new o(write, this.v.f13371a, z12);
                n nVar2 = this.f13266t;
                if (nVar2 != null) {
                    nVar2.P(oVar);
                }
                if (oVar.f13331b && this.f13237a != null) {
                    b bVar = b.f13218c;
                    this.f13270y = bVar;
                    this.f13271z.a(bVar);
                    throw oVar;
                }
                a0Var.a(oVar);
                return;
            }
            a0Var.f13215a = null;
            a0Var.f13216b = -9223372036854775807L;
            a0Var.f13217c = -9223372036854775807L;
            if (r(this.f13269x)) {
                if (this.L > 0) {
                    this.f13249h0 = false;
                }
                if (this.X && (nVar = this.f13266t) != null && write < remaining && !this.f13249h0) {
                    nVar.q();
                }
            }
            int i10 = this.v.f13373c;
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
        throw new UnsupportedOperationException("Method not decompiled: k2.e0.f():boolean");
    }

    public final void g() {
        z zVar;
        if (q()) {
            this.I = 0L;
            this.J = 0L;
            this.K = 0L;
            this.L = 0L;
            this.f13249h0 = false;
            this.M = 0;
            this.D = new x(this.E, 0L, 0L);
            this.P = 0L;
            this.C = null;
            this.f13250i.clear();
            this.R = null;
            this.S = 0;
            this.T = null;
            this.V = false;
            this.U = false;
            this.W = false;
            this.G = null;
            this.H = 0;
            this.d.f13329o = 0L;
            c2.e eVar = this.v.f13376i;
            this.f13268w = eVar;
            eVar.a();
            AudioTrack audioTrack = this.h.f13346c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f13269x.pause();
            }
            if (r(this.f13269x)) {
                d0 d0Var = this.f13256l;
                d0Var.getClass();
                d0Var.a(this.f13269x);
            }
            k a2 = this.v.a();
            w wVar = this.f13267u;
            if (wVar != null) {
                this.v = wVar;
                this.f13267u = null;
            }
            s sVar = this.h;
            sVar.g();
            sVar.f13346c = null;
            sVar.e = null;
            if (Build.VERSION.SDK_INT >= 24 && (zVar = this.A) != null) {
                zVar.b();
                this.A = null;
            }
            AudioTrack audioTrack2 = this.f13269x;
            n nVar = this.f13266t;
            Handler handler = new Handler(Looper.myLooper());
            synchronized (f13234o0) {
                try {
                    if (f13235p0 == null) {
                        String str = e2.d0.f7870a;
                        f13235p0 = Executors.newSingleThreadScheduledExecutor(new e2.c0(0));
                    }
                    f13236q0++;
                    f13235p0.schedule(new h5(audioTrack2, nVar, handler, a2, 19), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f13269x = null;
        }
        a0 a0Var = this.f13259n;
        a0Var.f13215a = null;
        a0Var.f13216b = -9223372036854775807L;
        a0Var.f13217c = -9223372036854775807L;
        a0 a0Var2 = this.f13258m;
        a0Var2.f13215a = null;
        a0Var2.f13216b = -9223372036854775807L;
        a0Var2.f13217c = -9223372036854775807L;
        this.f13253j0 = 0L;
        this.f13255k0 = 0L;
        Handler handler2 = this.f13257l0;
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
            return e0.b.c(this.f13269x, this.v);
        }
        w wVar = this.v;
        if (wVar.f13373c == 0) {
            j3 = wVar.e * wVar.d;
        } else {
            int i10 = c3.b.i(wVar.f13375g);
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
                arrayDeque = this.f13250i;
                if (arrayDeque.isEmpty() || min < ((x) arrayDeque.getFirst()).f13382c) {
                    break;
                }
                this.D = (x) arrayDeque.remove();
            }
            x xVar = this.D;
            long j10 = min - xVar.f13382c;
            long z10 = e2.d0.z(j10, xVar.f13380a.f3328a);
            boolean isEmpty = arrayDeque.isEmpty();
            aa.a aVar = this.f13239b;
            if (isEmpty) {
                c2.k kVar = (c2.k) aVar.d;
                if (kVar.isActive()) {
                    if (kVar.f3698o >= 1024) {
                        long j11 = kVar.f3697n;
                        kVar.f3693j.getClass();
                        long j12 = j11 - ((jVar.f3676k * jVar.f3670b) * 2);
                        int i10 = kVar.h.f3661a;
                        int i11 = kVar.f3691g.f3661a;
                        if (i10 == i11) {
                            j10 = e2.d0.Y(j10, j12, kVar.f3698o, RoundingMode.DOWN);
                        } else {
                            j10 = e2.d0.Y(j10, j12 * i10, kVar.f3698o * i11, RoundingMode.DOWN);
                        }
                    } else {
                        j10 = (long) (kVar.f3689c * j10);
                    }
                }
                x xVar2 = this.D;
                j3 = xVar2.f13381b + j10;
                xVar2.d = j10 - z10;
            } else {
                x xVar3 = this.D;
                j3 = xVar3.f13381b + z10 + xVar3.d;
            }
            long j13 = ((j0) aVar.f360c).f13308q;
            long W = e2.d0.W(this.v.e, j13) + j3;
            long j14 = this.f13253j0;
            if (j13 > j14) {
                long W2 = e2.d0.W(this.v.e, j13 - j14);
                this.f13253j0 = j13;
                this.f13255k0 += W2;
                if (this.f13257l0 == null) {
                    this.f13257l0 = new Handler(Looper.myLooper());
                }
                this.f13257l0.removeCallbacksAndMessages(null);
                this.f13257l0.postDelayed(new i2.h0(this, 8), 100L);
            }
            return W;
        }
        return Long.MIN_VALUE;
    }

    public final e j(b2.s sVar) {
        boolean booleanValue;
        boolean z10;
        if (this.f13248g0) {
            return e.d;
        }
        b2.e eVar = this.B;
        of.b bVar = this.f13262p;
        bVar.getClass();
        sVar.getClass();
        int i10 = sVar.K;
        eVar.getClass();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29 && i10 != -1) {
            Context context = (Context) bVar.f15678b;
            Boolean bool = (Boolean) bVar.f15679c;
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
                    bVar.f15679c = Boolean.valueOf(z10);
                } else {
                    bVar.f15679c = Boolean.FALSE;
                }
                booleanValue = ((Boolean) bVar.f15679c).booleanValue();
            }
            String str = sVar.f3301r;
            str.getClass();
            int c10 = r0.c(str, sVar.f3294k);
            if (c10 != 0 && i11 >= e2.d0.q(c10)) {
                int s10 = e2.d0.s(sVar.J);
                if (s10 == 0) {
                    return e.d;
                }
                try {
                    AudioFormat r10 = e2.d0.r(i10, s10, c10);
                    if (i11 >= 31) {
                        return e0.h0.a(r10, (AudioAttributes) eVar.b().f3336a, booleanValue);
                    }
                    return b2.c.f(r10, (AudioAttributes) eVar.b().f3336a, booleanValue);
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
        String str = sVar.f3301r;
        int i10 = sVar.L;
        if ("audio/raw".equals(str)) {
            if (!e2.d0.K(i10)) {
                e2.m(i10, "Invalid PCM encoding: ", "DefaultAudioSink");
                return 0;
            } else if (i10 != 2) {
                return 1;
            }
        } else if (this.f13270y.d(this.B, sVar) == null) {
            return 0;
        }
        return 2;
    }

    public final long l() {
        w wVar = this.v;
        if (wVar.f13373c == 0) {
            return this.I / wVar.f13372b;
        }
        return this.J;
    }

    public final long m() {
        w wVar = this.v;
        if (wVar.f13373c == 0) {
            long j3 = this.K;
            long j10 = wVar.d;
            String str = e2.d0.f7870a;
            return ((j3 + j10) - 1) / j10;
        }
        return this.L;
    }

    public final boolean n(long r27, int r29, java.nio.ByteBuffer r30) {
        throw new UnsupportedOperationException("Method not decompiled: k2.e0.n(long, int, java.nio.ByteBuffer):boolean");
    }

    public final boolean o() {
        if (q()) {
            if ((Build.VERSION.SDK_INT < 29 || !this.f13269x.isOffloadedPlayback() || !this.W) && this.h.e(m())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean p() {
        throw new UnsupportedOperationException("Method not decompiled: k2.e0.p():boolean");
    }

    public final boolean q() {
        if (this.f13269x != null) {
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
        if (this.f13271z != null && this.f13251i0 != myLooper) {
            z10 = false;
        } else {
            z10 = true;
        }
        StringBuilder sb2 = new StringBuilder("DefaultAudioSink accessed on multiple threads: ");
        Looper looper = this.f13251i0;
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
        if (this.f13271z == null && (context = this.f13237a) != null) {
            this.f13251i0 = myLooper;
            e7 e7Var = new e7(context, new d5(this, 29), this.B, this.f13242c0);
            this.f13271z = e7Var;
            Handler handler = (Handler) e7Var.d;
            Context context2 = (Context) e7Var.f4640b;
            if (e7Var.f4639a) {
                bVar = (b) e7Var.h;
                bVar.getClass();
            } else {
                e7Var.f4639a = true;
                d dVar = (d) e7Var.f4643g;
                if (dVar != null) {
                    dVar.f13225a.registerContentObserver(dVar.f13226b, false, dVar);
                }
                if (Build.VERSION.SDK_INT >= 23 && (cVar = (c) e7Var.e) != null) {
                    e0.b.u(context2, cVar, handler);
                }
                b b10 = b.b(context2, context2.registerReceiver((androidx.mediarouter.app.g) e7Var.f4642f, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), (b2.e) e7Var.f4645j, (a6.m) e7Var.f4644i);
                e7Var.h = b10;
                bVar = b10;
            }
            this.f13270y = bVar;
        }
        this.f13270y.getClass();
    }

    public final void t() {
        this.X = false;
        if (q()) {
            s sVar = this.h;
            sVar.g();
            if (sVar.f13365z == -9223372036854775807L) {
                r rVar = sVar.e;
                rVar.getClass();
                rVar.a(0);
            }
            sVar.B = sVar.b();
            if (!this.V || r(this.f13269x)) {
                this.f13269x.pause();
            }
        }
    }

    public final void u() {
        this.X = true;
        if (q()) {
            s sVar = this.h;
            if (sVar.f13365z != -9223372036854775807L) {
                sVar.I.getClass();
                sVar.f13365z = e2.d0.Q(SystemClock.elapsedRealtime());
            }
            sVar.f13351k = e2.d0.W(sVar.f13347f, sVar.b());
            r rVar = sVar.e;
            rVar.getClass();
            rVar.a(0);
            if (!this.V || r(this.f13269x)) {
                this.f13269x.play();
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
            sVar.f13365z = e2.d0.Q(SystemClock.elapsedRealtime());
            sVar.C = m10;
            if (r(this.f13269x)) {
                this.W = false;
            }
            this.f13269x.stop();
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
        throw new UnsupportedOperationException("Method not decompiled: k2.e0.x(long):void");
    }

    public final void y() {
        g();
        e9.g0 listIterator = this.f13247g.listIterator(0);
        while (listIterator.hasNext()) {
            ((c2.h) listIterator.next()).reset();
        }
        this.e.reset();
        this.f13245f.reset();
        c2.e eVar = this.f13268w;
        if (eVar != null) {
            e9.i0 i0Var = eVar.f3658a;
            for (int i10 = 0; i10 < i0Var.size(); i10++) {
                c2.h hVar = (c2.h) i0Var.get(i10);
                hVar.flush();
                hVar.reset();
            }
            eVar.f3660c = new ByteBuffer[0];
            c2.f fVar = c2.f.e;
            eVar.d = false;
        }
        this.X = false;
        this.f13248g0 = false;
    }

    public final void z(b2.e eVar) {
        if (!this.B.equals(eVar)) {
            this.B = eVar;
            if (this.f13243d0) {
                return;
            }
            e7 e7Var = this.f13271z;
            if (e7Var != null) {
                e7Var.f4645j = eVar;
                e7Var.a(b.c((Context) e7Var.f4640b, eVar, (a6.m) e7Var.f4644i));
            }
            g();
        }
    }
}
