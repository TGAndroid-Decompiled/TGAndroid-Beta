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
import ci.e7;
import com.google.android.gms.internal.vision.e2;
import e9.a1;
import ei.c5;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
public final class d0 implements p {
    public static final Object f14420n0 = new Object();
    public static ScheduledExecutorService f14421o0;
    public static int f14422p0;
    public b2.e A;
    public w B;
    public w C;
    public v0 D;
    public boolean E;
    public ByteBuffer F;
    public int G;
    public long H;
    public long I;
    public long J;
    public long K;
    public int L;
    public boolean M;
    public boolean N;
    public long O;
    public float P;
    public ByteBuffer Q;
    public int R;
    public ByteBuffer S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public boolean Z;
    public final Context f14423a;
    public b2.f f14424a0;
    public final aa.a f14425b;
    public a4.l f14426b0;
    public final t f14427c;
    public boolean f14428c0;
    public final m0 d;
    public long f14429d0;
    public final c2.l f14430e;
    public long f14431e0;
    public final l0 f14432f;
    public boolean f14433f0;
    public final a1 f14434g;
    public boolean f14435g0;
    public final s h;
    public Looper f14436h0;
    public final ArrayDeque f14437i;
    public long f14438i0;
    public int f14439j;
    public long f14440j0;
    public c0 f14441k;
    public Handler f14442k0;
    public final z f14443l;
    public Context f14444l0;
    public final z f14445m;
    public final boolean m0;
    public final e0 f14446n;
    public final pf.b f14447o;
    public final f0 f14448p;
    public final int f14449q;
    public j2.k f14450r;
    public n f14451s;
    public v f14452t;
    public v f14453u;
    public c2.e v;
    public AudioTrack f14454w;
    public b f14455x;
    public e7 f14456y;
    public y f14457z;

    public d0(e6 e6Var) {
        Context applicationContext;
        int deviceId;
        Context context = (Context) e6Var.f883b;
        if (context == null) {
            applicationContext = null;
        } else {
            applicationContext = context.getApplicationContext();
        }
        this.f14423a = applicationContext;
        this.A = b2.e.h;
        this.f14455x = applicationContext == null ? (b) e6Var.f884c : null;
        this.f14425b = (aa.a) e6Var.d;
        int i10 = Build.VERSION.SDK_INT;
        this.f14439j = 0;
        this.f14446n = (e0) e6Var.f885e;
        pf.b bVar = (pf.b) e6Var.f887g;
        bVar.getClass();
        this.f14447o = bVar;
        this.h = new s(new xa.c(this, 28));
        ?? iVar = new c2.i();
        this.f14427c = iVar;
        ?? iVar2 = new c2.i();
        iVar2.f14520m = e2.d0.f8532b;
        this.d = iVar2;
        this.f14430e = new c2.i();
        this.f14432f = new c2.i();
        this.f14434g = e9.i0.A(iVar2, iVar);
        this.P = 1.0f;
        this.Y = 0;
        this.f14424a0 = new Object();
        v0 v0Var = v0.d;
        this.C = new w(v0Var, 0L, 0L);
        this.D = v0Var;
        this.E = false;
        this.f14437i = new ArrayDeque();
        this.f14443l = new z();
        this.f14445m = new z();
        this.f14448p = (f0) e6Var.f886f;
        int i11 = -1;
        if (i10 >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i11 = deviceId;
        }
        this.f14449q = i11;
        this.m0 = true;
    }

    public static boolean r(AudioTrack audioTrack) {
        if (Build.VERSION.SDK_INT >= 29 && audioTrack.isOffloadedPlayback()) {
            return true;
        }
        return false;
    }

    public final void A(int i10) {
        boolean z10 = false;
        if (this.Z) {
            if (this.Y == i10) {
                this.Z = false;
            } else {
                return;
            }
        }
        if (this.Y != i10) {
            this.Y = i10;
            if (i10 != 0) {
                z10 = true;
            }
            this.X = z10;
            g();
        }
    }

    public final void B() {
        if (q()) {
            try {
                this.f14454w.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.D.f3673a).setPitch(this.D.f3674b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e7) {
                e2.a.o("DefaultAudioSink", "Failed to set playback params", e7);
            }
            v0 v0Var = new v0(this.f14454w.getPlaybackParams().getSpeed(), this.f14454w.getPlaybackParams().getPitch());
            this.D = v0Var;
            float f7 = v0Var.f3673a;
            s sVar = this.h;
            sVar.h = f7;
            r rVar = sVar.f14542e;
            if (rVar != null) {
                rVar.a(0);
            }
            sVar.f();
        }
    }

    public final void C(b2.f fVar) {
        if (this.f14424a0.equals(fVar)) {
            return;
        }
        fVar.getClass();
        if (this.f14454w != null) {
            this.f14424a0.getClass();
        }
        this.f14424a0 = fVar;
    }

    public final void D(int i10, int i11) {
        v vVar;
        AudioTrack audioTrack = this.f14454w;
        if (audioTrack != null && r(audioTrack) && (vVar = this.f14453u) != null && vVar.f14573k) {
            this.f14454w.setOffloadDelayPadding(i10, i11);
        }
    }

    public final void E(java.nio.ByteBuffer r19) {
        throw new UnsupportedOperationException("Method not decompiled: k2.d0.E(java.nio.ByteBuffer):void");
    }

    public final void F(v0 v0Var) {
        this.D = new v0(e2.d0.g(v0Var.f3673a, 0.1f, 8.0f), e2.d0.g(v0Var.f3674b, 0.1f, 8.0f));
        v vVar = this.f14453u;
        if (vVar != null && vVar.f14572j) {
            B();
            return;
        }
        w wVar = new w(v0Var, -9223372036854775807L, -9223372036854775807L);
        if (q()) {
            this.B = wVar;
        } else {
            this.C = wVar;
        }
    }

    public final boolean G(b2.s sVar) {
        if (k(sVar) != 0) {
            return true;
        }
        return false;
    }

    public final void a(long j3) {
        v0 v0Var;
        boolean z10;
        boolean z11;
        v vVar = this.f14453u;
        boolean z12 = false;
        aa.a aVar = this.f14425b;
        if (vVar != null && vVar.f14572j) {
            v0Var = v0.d;
        } else {
            if (!this.f14428c0 && vVar.f14567c == 0) {
                int i10 = vVar.f14565a.L;
                v0Var = this.D;
                c2.k kVar = (c2.k) aVar.d;
                float f7 = v0Var.f3673a;
                kVar.getClass();
                if (f7 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e2.d.b(z10);
                if (kVar.f4038c != f7) {
                    kVar.f4038c = f7;
                    kVar.f4042i = true;
                }
                float f10 = v0Var.f3674b;
                if (f10 > 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                e2.d.b(z11);
                if (kVar.d != f10) {
                    kVar.d = f10;
                    kVar.f4042i = true;
                }
            } else {
                v0Var = v0.d;
            }
            this.D = v0Var;
        }
        v0 v0Var2 = v0Var;
        if (!this.f14428c0) {
            v vVar2 = this.f14453u;
            if (vVar2.f14567c == 0) {
                int i11 = vVar2.f14565a.L;
                z12 = this.E;
                ((j0) aVar.f385c).f14498o = z12;
            }
        }
        this.E = z12;
        this.f14437i.add(new w(v0Var2, Math.max(0L, j3), e2.d0.V(this.f14453u.f14568e, m())));
        c2.e eVar = this.f14453u.f14571i;
        this.v = eVar;
        eVar.a();
        n nVar = this.f14451s;
        if (nVar != null) {
            nVar.onSkipSilenceEnabledChanged(this.E);
        }
    }

    public final AudioTrack b(k kVar, b2.e eVar, int i10, b2.s sVar, Context context) {
        try {
            AudioTrack a2 = this.f14448p.a(kVar, eVar, i10, context);
            int state = a2.getState();
            if (state == 1) {
                return a2;
            }
            try {
                a2.release();
            } catch (Exception unused) {
            }
            throw new m(state, kVar.f14506b, kVar.f14507c, kVar.f14505a, kVar.f14509f, sVar, kVar.f14508e, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e7) {
            throw new m(0, kVar.f14506b, kVar.f14507c, kVar.f14505a, kVar.f14509f, sVar, kVar.f14508e, e7);
        }
    }

    public final android.media.AudioTrack c(k2.v r9) {
        throw new UnsupportedOperationException("Method not decompiled: k2.d0.c(k2.v):android.media.AudioTrack");
    }

    public final void d(b2.s r26, int[] r27) {
        throw new UnsupportedOperationException("Method not decompiled: k2.d0.d(b2.s, int[]):void");
    }

    public final void e(long j3) {
        int write;
        n nVar;
        boolean z10;
        boolean z11;
        z zVar = this.f14445m;
        if (this.S != null) {
            boolean z12 = false;
            if (zVar.f14582a != null) {
                synchronized (f14420n0) {
                    if (f14422p0 > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                if (z11 || SystemClock.elapsedRealtime() < zVar.f14584c) {
                    return;
                }
            }
            int remaining = this.S.remaining();
            if (this.f14428c0) {
                if (j3 != -9223372036854775807L) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e2.d.g(z10);
                if (j3 == Long.MIN_VALUE) {
                    j3 = this.f14429d0;
                } else {
                    this.f14429d0 = j3;
                }
                AudioTrack audioTrack = this.f14454w;
                ByteBuffer byteBuffer = this.S;
                if (Build.VERSION.SDK_INT >= 26) {
                    write = audioTrack.write(byteBuffer, remaining, 1, 1000 * j3);
                } else {
                    if (this.F == null) {
                        ByteBuffer allocate = ByteBuffer.allocate(16);
                        this.F = allocate;
                        allocate.order(ByteOrder.BIG_ENDIAN);
                        this.F.putInt(1431633921);
                    }
                    if (this.G == 0) {
                        this.F.putInt(4, remaining);
                        this.F.putLong(8, j3 * 1000);
                        this.F.position(0);
                        this.G = remaining;
                    }
                    int remaining2 = this.F.remaining();
                    if (remaining2 > 0) {
                        int write2 = audioTrack.write(this.F, remaining2, 1);
                        if (write2 < 0) {
                            this.G = 0;
                            write = write2;
                        } else if (write2 < remaining2) {
                            write = 0;
                        }
                    }
                    write = audioTrack.write(byteBuffer, remaining, 1);
                    if (write < 0) {
                        this.G = 0;
                    } else {
                        this.G -= write;
                    }
                }
            } else {
                write = this.f14454w.write(this.S, remaining, 1);
            }
            this.f14431e0 = SystemClock.elapsedRealtime();
            if (write < 0) {
                if ((Build.VERSION.SDK_INT >= 24 && write == -6) || write == -32) {
                    if (m() <= 0) {
                        if (r(this.f14454w)) {
                            if (this.f14453u.f14567c == 1) {
                                this.f14433f0 = true;
                            }
                        }
                    }
                    z12 = true;
                }
                o oVar = new o(write, this.f14453u.f14565a, z12);
                n nVar2 = this.f14451s;
                if (nVar2 != null) {
                    nVar2.f0(oVar);
                }
                if (oVar.f14524b && this.f14423a != null) {
                    b bVar = b.f14408c;
                    this.f14455x = bVar;
                    this.f14456y.a(bVar);
                    throw oVar;
                }
                zVar.a(oVar);
                return;
            }
            zVar.f14582a = null;
            zVar.f14583b = -9223372036854775807L;
            zVar.f14584c = -9223372036854775807L;
            if (r(this.f14454w)) {
                if (this.K > 0) {
                    this.f14435g0 = false;
                }
                if (this.W && (nVar = this.f14451s) != null && write < remaining && !this.f14435g0) {
                    nVar.v();
                }
            }
            int i10 = this.f14453u.f14567c;
            if (i10 == 0) {
                this.J += write;
            }
            if (write == remaining) {
                if (i10 != 0) {
                    if (this.S == this.Q) {
                        z12 = true;
                    }
                    e2.d.g(z12);
                    this.K = (this.L * this.R) + this.K;
                }
                this.S = null;
            }
        }
    }

    public final boolean f() {
        throw new UnsupportedOperationException("Method not decompiled: k2.d0.f():boolean");
    }

    public final void g() {
        y yVar;
        if (q()) {
            this.H = 0L;
            this.I = 0L;
            this.J = 0L;
            this.K = 0L;
            this.f14435g0 = false;
            this.L = 0;
            this.C = new w(this.D, 0L, 0L);
            this.O = 0L;
            this.B = null;
            this.f14437i.clear();
            this.Q = null;
            this.R = 0;
            this.S = null;
            this.U = false;
            this.T = false;
            this.V = false;
            this.F = null;
            this.G = 0;
            this.d.f14522o = 0L;
            c2.e eVar = this.f14453u.f14571i;
            this.v = eVar;
            eVar.a();
            AudioTrack audioTrack = this.h.f14541c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f14454w.pause();
            }
            if (r(this.f14454w)) {
                c0 c0Var = this.f14441k;
                c0Var.getClass();
                c0Var.a(this.f14454w);
            }
            k a2 = this.f14453u.a();
            v vVar = this.f14452t;
            if (vVar != null) {
                this.f14453u = vVar;
                this.f14452t = null;
            }
            s sVar = this.h;
            sVar.f();
            sVar.f14541c = null;
            sVar.f14542e = null;
            if (Build.VERSION.SDK_INT >= 24 && (yVar = this.f14457z) != null) {
                yVar.b();
                this.f14457z = null;
            }
            AudioTrack audioTrack2 = this.f14454w;
            n nVar = this.f14451s;
            Handler handler = new Handler(Looper.myLooper());
            synchronized (f14420n0) {
                try {
                    if (f14421o0 == null) {
                        String str = e2.d0.f8531a;
                        f14421o0 = Executors.newSingleThreadScheduledExecutor(new e2.c0(0));
                    }
                    f14422p0++;
                    f14421o0.schedule(new i5(audioTrack2, nVar, handler, a2, 19), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f14454w = null;
        }
        z zVar = this.f14445m;
        zVar.f14582a = null;
        zVar.f14583b = -9223372036854775807L;
        zVar.f14584c = -9223372036854775807L;
        z zVar2 = this.f14443l;
        zVar2.f14582a = null;
        zVar2.f14583b = -9223372036854775807L;
        zVar2.f14584c = -9223372036854775807L;
        this.f14438i0 = 0L;
        this.f14440j0 = 0L;
        Handler handler2 = this.f14442k0;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    public final long h() {
        boolean z10;
        if (!q()) {
            return -9223372036854775807L;
        }
        AudioTrack audioTrack = this.f14454w;
        v vVar = this.f14453u;
        if (vVar.f14567c == 0) {
            return e2.d0.V(vVar.f14568e, audioTrack.getBufferSizeInFrames());
        }
        long bufferSizeInFrames = audioTrack.getBufferSizeInFrames();
        int i10 = c3.b.i(vVar.f14570g);
        if (i10 != -2147483647) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        return e2.d0.X(bufferSizeInFrames, 1000000L, i10, RoundingMode.DOWN);
    }

    public final long i() {
        ArrayDeque arrayDeque;
        long j3;
        c2.j jVar;
        if (q() && !this.N) {
            long min = Math.min(this.h.a(), e2.d0.V(this.f14453u.f14568e, m()));
            while (true) {
                arrayDeque = this.f14437i;
                if (arrayDeque.isEmpty() || min < ((w) arrayDeque.getFirst()).f14577c) {
                    break;
                }
                this.C = (w) arrayDeque.remove();
            }
            w wVar = this.C;
            long j10 = min - wVar.f14577c;
            long y3 = e2.d0.y(j10, wVar.f14575a.f3673a);
            boolean isEmpty = arrayDeque.isEmpty();
            aa.a aVar = this.f14425b;
            if (isEmpty) {
                c2.k kVar = (c2.k) aVar.d;
                if (kVar.isActive()) {
                    if (kVar.f4048o >= 1024) {
                        long j11 = kVar.f4047n;
                        kVar.f4043j.getClass();
                        long j12 = j11 - ((jVar.f4025k * jVar.f4018b) * 2);
                        int i10 = kVar.h.f4008a;
                        int i11 = kVar.f4041g.f4008a;
                        if (i10 == i11) {
                            j10 = e2.d0.X(j10, j12, kVar.f4048o, RoundingMode.DOWN);
                        } else {
                            j10 = e2.d0.X(j10, j12 * i10, kVar.f4048o * i11, RoundingMode.DOWN);
                        }
                    } else {
                        j10 = (long) (kVar.f4038c * j10);
                    }
                }
                w wVar2 = this.C;
                j3 = wVar2.f14576b + j10;
                wVar2.d = j10 - y3;
            } else {
                w wVar3 = this.C;
                j3 = wVar3.f14576b + y3 + wVar3.d;
            }
            long j13 = ((j0) aVar.f385c).f14500q;
            long V = e2.d0.V(this.f14453u.f14568e, j13) + j3;
            long j14 = this.f14438i0;
            if (j13 > j14) {
                long V2 = e2.d0.V(this.f14453u.f14568e, j13 - j14);
                this.f14438i0 = j13;
                this.f14440j0 += V2;
                if (this.f14442k0 == null) {
                    this.f14442k0 = new Handler(Looper.myLooper());
                }
                this.f14442k0.removeCallbacksAndMessages(null);
                this.f14442k0.postDelayed(new i2.h0(this, 8), 100L);
            }
            return V;
        }
        return Long.MIN_VALUE;
    }

    public final e j(b2.s sVar) {
        boolean booleanValue;
        boolean z10;
        if (this.f14433f0) {
            return e.d;
        }
        b2.e eVar = this.A;
        pf.b bVar = this.f14447o;
        bVar.getClass();
        sVar.getClass();
        int i10 = sVar.K;
        eVar.getClass();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29 && i10 != -1) {
            Context context = (Context) bVar.f45592b;
            Boolean bool = (Boolean) bVar.f45593c;
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
                    bVar.f45593c = Boolean.valueOf(z10);
                } else {
                    bVar.f45593c = Boolean.FALSE;
                }
                booleanValue = ((Boolean) bVar.f45593c).booleanValue();
            }
            String str = sVar.f3643r;
            str.getClass();
            int c10 = r0.c(str, sVar.f3636k);
            if (c10 != 0 && i11 >= e2.d0.q(c10)) {
                int r10 = e2.d0.r(sVar.J);
                if (r10 == 0) {
                    return e.d;
                }
                try {
                    AudioFormat build = new AudioFormat.Builder().setSampleRate(i10).setChannelMask(r10).setEncoding(c10).build();
                    if (i11 >= 31) {
                        return e0.f0.a(build, (AudioAttributes) eVar.b().f3681a, booleanValue);
                    }
                    return b2.c.f(build, (AudioAttributes) eVar.b().f3681a, booleanValue);
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
        String str = sVar.f3643r;
        int i10 = sVar.L;
        if ("audio/raw".equals(str)) {
            if (!e2.d0.J(i10)) {
                e2.m(i10, "Invalid PCM encoding: ", "DefaultAudioSink");
                return 0;
            } else if (i10 != 2) {
                return 1;
            }
        } else if (this.f14455x.d(this.A, sVar) == null) {
            return 0;
        }
        return 2;
    }

    public final long l() {
        v vVar = this.f14453u;
        if (vVar.f14567c == 0) {
            return this.H / vVar.f14566b;
        }
        return this.I;
    }

    public final long m() {
        v vVar = this.f14453u;
        if (vVar.f14567c == 0) {
            long j3 = this.J;
            long j10 = vVar.d;
            String str = e2.d0.f8531a;
            return ((j3 + j10) - 1) / j10;
        }
        return this.K;
    }

    public final boolean n(long r28, int r30, java.nio.ByteBuffer r31) {
        throw new UnsupportedOperationException("Method not decompiled: k2.d0.n(long, int, java.nio.ByteBuffer):boolean");
    }

    public final boolean o() {
        if (q()) {
            if (Build.VERSION.SDK_INT < 29 || !this.f14454w.isOffloadedPlayback() || !this.V) {
                long m10 = m();
                s sVar = this.h;
                long a2 = sVar.a();
                int i10 = sVar.f14543f;
                String str = e2.d0.f8531a;
                if (m10 > e2.d0.X(a2, i10, 1000000L, RoundingMode.UP)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean p() {
        throw new UnsupportedOperationException("Method not decompiled: k2.d0.p():boolean");
    }

    public final boolean q() {
        if (this.f14454w != null) {
            return true;
        }
        return false;
    }

    public final void s() {
        boolean z10;
        String name;
        Context context;
        b bVar;
        Looper myLooper = Looper.myLooper();
        if (this.f14456y != null && this.f14436h0 != myLooper) {
            z10 = false;
        } else {
            z10 = true;
        }
        StringBuilder sb2 = new StringBuilder("DefaultAudioSink accessed on multiple threads: ");
        Looper looper = this.f14436h0;
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
        if (this.f14456y == null && (context = this.f14423a) != null) {
            this.f14436h0 = myLooper;
            e7 e7Var = new e7(context, new c5(this, 29), this.A, this.f14426b0);
            this.f14456y = e7Var;
            Handler handler = (Handler) e7Var.d;
            Context context2 = (Context) e7Var.f5030b;
            if (e7Var.f5029a) {
                bVar = (b) e7Var.h;
                bVar.getClass();
            } else {
                e7Var.f5029a = true;
                d dVar = (d) e7Var.f5034g;
                if (dVar != null) {
                    dVar.f14417a.registerContentObserver(dVar.f14418b, false, dVar);
                }
                c cVar = (c) e7Var.f5032e;
                if (cVar != null) {
                    c2.d.e(context2).registerAudioDeviceCallback(cVar, handler);
                }
                b b10 = b.b(context2, context2.registerReceiver((androidx.mediarouter.app.g) e7Var.f5033f, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), (b2.e) e7Var.f5036j, (a4.l) e7Var.f5035i);
                e7Var.h = b10;
                bVar = b10;
            }
            this.f14455x = bVar;
        }
        this.f14455x.getClass();
    }

    public final void t() {
        this.W = false;
        if (q()) {
            s sVar = this.h;
            sVar.f();
            if (sVar.f14559x == -9223372036854775807L) {
                r rVar = sVar.f14542e;
                rVar.getClass();
                rVar.a(0);
            }
            sVar.f14561z = sVar.b();
            if (!this.U || r(this.f14454w)) {
                this.f14454w.pause();
            }
        }
    }

    public final void u() {
        this.W = true;
        if (q()) {
            s sVar = this.h;
            if (sVar.f14559x != -9223372036854775807L) {
                sVar.G.getClass();
                sVar.f14559x = e2.d0.P(SystemClock.elapsedRealtime());
            }
            sVar.f14546j = e2.d0.V(sVar.f14543f, sVar.b());
            r rVar = sVar.f14542e;
            rVar.getClass();
            rVar.a(0);
            if (!this.U || r(this.f14454w)) {
                this.f14454w.play();
            }
        }
    }

    public final void v() {
        if (!this.U) {
            this.U = true;
            long m10 = m();
            s sVar = this.h;
            sVar.f14561z = sVar.b();
            sVar.G.getClass();
            sVar.f14559x = e2.d0.P(SystemClock.elapsedRealtime());
            sVar.A = m10;
            if (r(this.f14454w)) {
                this.V = false;
            }
            this.f14454w.stop();
            this.G = 0;
        }
    }

    public final void w() {
        if (!this.T && q() && f()) {
            v();
            this.T = true;
        }
    }

    public final void x(long r4) {
        throw new UnsupportedOperationException("Method not decompiled: k2.d0.x(long):void");
    }

    public final void y() {
        g();
        e9.g0 listIterator = this.f14434g.listIterator(0);
        while (listIterator.hasNext()) {
            ((c2.h) listIterator.next()).reset();
        }
        this.f14430e.reset();
        this.f14432f.reset();
        c2.e eVar = this.v;
        if (eVar != null) {
            e9.i0 i0Var = eVar.f4004a;
            for (int i10 = 0; i10 < i0Var.size(); i10++) {
                c2.h hVar = (c2.h) i0Var.get(i10);
                hVar.flush();
                hVar.reset();
            }
            eVar.f4006c = new ByteBuffer[0];
            c2.f fVar = c2.f.f4007e;
            eVar.d = false;
        }
        this.W = false;
        this.f14433f0 = false;
    }

    public final void z(b2.e eVar) {
        if (!this.A.equals(eVar)) {
            this.A = eVar;
            if (this.f14428c0) {
                return;
            }
            e7 e7Var = this.f14456y;
            if (e7Var != null) {
                e7Var.f5036j = eVar;
                e7Var.a(b.c((Context) e7Var.f5030b, eVar, (a4.l) e7Var.f5035i));
            }
            g();
        }
    }
}
