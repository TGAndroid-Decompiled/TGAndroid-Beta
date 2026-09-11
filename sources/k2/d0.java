package k2;

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
import bi.n5;
import com.google.android.gms.internal.vision.e2;
import di.g7;
import e9.a1;
import ig.t0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import ji.k5;
import ji.u4;
public final class d0 implements p {
    public static final Object f14528o0 = new Object();
    public static ScheduledExecutorService f14529p0;
    public static int f14530q0;
    public y A;
    public b2.e B;
    public w C;
    public w D;
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
    public final Context f14531a;
    public boolean f14532a0;
    public final aa.a f14533b;
    public b2.f f14534b0;
    public final t f14535c;
    public u4 f14536c0;
    public final m0 d;
    public boolean f14537d0;
    public final c2.l f14538e;
    public long f14539e0;
    public final l0 f14540f;
    public long f14541f0;
    public final a1 f14542g;
    public boolean f14543g0;
    public final s h;
    public boolean f14544h0;
    public final ArrayDeque f14545i;
    public Looper f14546i0;
    public final boolean f14547j;
    public long f14548j0;
    public int f14549k;
    public long f14550k0;
    public c0 f14551l;
    public Handler f14552l0;
    public final z f14553m;
    public Context m0;
    public final z f14554n;
    public final boolean f14555n0;
    public final e0 f14556o;
    public final pf.b f14557p;
    public final f0 f14558q;
    public final int f14559r;
    public j2.k f14560s;
    public n f14561t;
    public v f14562u;
    public v v;
    public c2.e f14563w;
    public AudioTrack f14564x;
    public b f14565y;
    public g7 f14566z;

    public d0(n5 n5Var) {
        Context applicationContext;
        int deviceId;
        Context context = (Context) n5Var.f3365b;
        if (context == null) {
            applicationContext = null;
        } else {
            applicationContext = context.getApplicationContext();
        }
        this.f14531a = applicationContext;
        this.B = b2.e.h;
        this.f14565y = applicationContext == null ? (b) n5Var.f3366c : null;
        this.f14533b = (aa.a) n5Var.d;
        int i10 = Build.VERSION.SDK_INT;
        this.f14547j = false;
        this.f14549k = 0;
        this.f14556o = (e0) n5Var.f3367e;
        pf.b bVar = (pf.b) n5Var.f3369g;
        bVar.getClass();
        this.f14557p = bVar;
        this.h = new s(new xa.c(this, 25));
        ?? iVar = new c2.i();
        this.f14535c = iVar;
        ?? iVar2 = new c2.i();
        iVar2.f14630m = e2.d0.f8738b;
        this.d = iVar2;
        this.f14538e = new c2.i();
        this.f14540f = new c2.i();
        this.f14542g = e9.i0.A(iVar2, iVar);
        this.Q = 1.0f;
        this.Z = 0;
        this.f14534b0 = new Object();
        v0 v0Var = v0.d;
        this.D = new w(v0Var, 0L, 0L);
        this.E = v0Var;
        this.F = false;
        this.f14545i = new ArrayDeque();
        this.f14553m = new z();
        this.f14554n = new z();
        this.f14558q = (f0) n5Var.f3368f;
        int i11 = -1;
        if (i10 >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i11 = deviceId;
        }
        this.f14559r = i11;
        this.f14555n0 = true;
    }

    public static boolean r(AudioTrack audioTrack) {
        if (Build.VERSION.SDK_INT >= 29 && audioTrack.isOffloadedPlayback()) {
            return true;
        }
        return false;
    }

    public final void A(int i10) {
        boolean z10 = false;
        if (this.f14532a0) {
            if (this.Z == i10) {
                this.f14532a0 = false;
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
                this.f14564x.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.E.f2400a).setPitch(this.E.f2401b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e7) {
                e2.a.o("DefaultAudioSink", "Failed to set playback params", e7);
            }
            v0 v0Var = new v0(this.f14564x.getPlaybackParams().getSpeed(), this.f14564x.getPlaybackParams().getPitch());
            this.E = v0Var;
            float f7 = v0Var.f2400a;
            s sVar = this.h;
            sVar.f14655i = f7;
            r rVar = sVar.f14652e;
            if (rVar != null) {
                rVar.a(0);
            }
            sVar.g();
        }
    }

    public final void C(b2.f fVar) {
        if (this.f14534b0.equals(fVar)) {
            return;
        }
        fVar.getClass();
        if (this.f14564x != null) {
            this.f14534b0.getClass();
        }
        this.f14534b0 = fVar;
    }

    public final void D(int i10, int i11) {
        v vVar;
        AudioTrack audioTrack = this.f14564x;
        if (audioTrack != null && r(audioTrack) && (vVar = this.v) != null && vVar.f14683k) {
            this.f14564x.setOffloadDelayPadding(i10, i11);
        }
    }

    public final void E(java.nio.ByteBuffer r19) {
        throw new UnsupportedOperationException("Method not decompiled: k2.d0.E(java.nio.ByteBuffer):void");
    }

    public final void F(v0 v0Var) {
        this.E = new v0(e2.d0.g(v0Var.f2400a, 0.1f, 8.0f), e2.d0.g(v0Var.f2401b, 0.1f, 8.0f));
        if (H()) {
            B();
            return;
        }
        w wVar = new w(v0Var, -9223372036854775807L, -9223372036854775807L);
        if (q()) {
            this.C = wVar;
        } else {
            this.D = wVar;
        }
    }

    public final boolean G(b2.s sVar) {
        if (k(sVar) != 0) {
            return true;
        }
        return false;
    }

    public final boolean H() {
        v vVar = this.v;
        if (vVar != null && vVar.f14682j && Build.VERSION.SDK_INT >= 23) {
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
        aa.a aVar = this.f14533b;
        if (!H) {
            if (!this.f14537d0) {
                v vVar = this.v;
                if (vVar.f14677c == 0) {
                    int i10 = vVar.f14675a.L;
                    v0Var = this.E;
                    c2.k kVar = (c2.k) aVar.d;
                    float f7 = v0Var.f2400a;
                    kVar.getClass();
                    if (f7 > 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    e2.d.b(z10);
                    if (kVar.f4183c != f7) {
                        kVar.f4183c = f7;
                        kVar.f4187i = true;
                    }
                    float f10 = v0Var.f2401b;
                    if (f10 > 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    e2.d.b(z11);
                    if (kVar.d != f10) {
                        kVar.d = f10;
                        kVar.f4187i = true;
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
        if (!this.f14537d0) {
            v vVar2 = this.v;
            if (vVar2.f14677c == 0) {
                int i11 = vVar2.f14675a.L;
                z12 = this.F;
                ((j0) aVar.f372c).f14608o = z12;
            }
        }
        this.F = z12;
        long max = Math.max(0L, j3);
        v vVar3 = this.v;
        this.f14545i.add(new w(v0Var2, max, e2.d0.W(vVar3.f14678e, m())));
        c2.e eVar = this.v.f14681i;
        this.f14563w = eVar;
        eVar.a();
        n nVar = this.f14561t;
        if (nVar != null) {
            nVar.onSkipSilenceEnabledChanged(this.F);
        }
    }

    public final AudioTrack b(k kVar, b2.e eVar, int i10, b2.s sVar, Context context) {
        try {
            AudioTrack a2 = this.f14558q.a(kVar, eVar, i10, context);
            int state = a2.getState();
            if (state == 1) {
                return a2;
            }
            try {
                a2.release();
            } catch (Exception unused) {
            }
            throw new m(state, kVar.f14616b, kVar.f14617c, kVar.f14615a, kVar.f14619f, sVar, kVar.f14618e, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e7) {
            throw new m(0, kVar.f14616b, kVar.f14617c, kVar.f14615a, kVar.f14619f, sVar, kVar.f14618e, e7);
        }
    }

    public final android.media.AudioTrack c(k2.v r9) {
        throw new UnsupportedOperationException("Method not decompiled: k2.d0.c(k2.v):android.media.AudioTrack");
    }

    public final void d(b2.s r27, int[] r28) {
        throw new UnsupportedOperationException("Method not decompiled: k2.d0.d(b2.s, int[]):void");
    }

    public final void e(long j3) {
        int write;
        n nVar;
        boolean z10;
        boolean z11;
        z zVar = this.f14554n;
        if (this.T != null) {
            boolean z12 = false;
            if (zVar.f14692a != null) {
                synchronized (f14528o0) {
                    if (f14530q0 > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                if (z11 || SystemClock.elapsedRealtime() < zVar.f14694c) {
                    return;
                }
            }
            int remaining = this.T.remaining();
            if (this.f14537d0) {
                if (j3 != -9223372036854775807L) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e2.d.g(z10);
                if (j3 == Long.MIN_VALUE) {
                    j3 = this.f14539e0;
                } else {
                    this.f14539e0 = j3;
                }
                AudioTrack audioTrack = this.f14564x;
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
                write = this.f14564x.write(this.T, remaining, 1);
            }
            this.f14541f0 = SystemClock.elapsedRealtime();
            if (write < 0) {
                if ((Build.VERSION.SDK_INT >= 24 && write == -6) || write == -32) {
                    if (m() <= 0) {
                        if (r(this.f14564x)) {
                            if (this.v.f14677c == 1) {
                                this.f14543g0 = true;
                            }
                        }
                    }
                    z12 = true;
                }
                o oVar = new o(write, this.v.f14675a, z12);
                n nVar2 = this.f14561t;
                if (nVar2 != null) {
                    nVar2.z(oVar);
                }
                if (oVar.f14634b && this.f14531a != null) {
                    b bVar = b.f14516c;
                    this.f14565y = bVar;
                    this.f14566z.a(bVar);
                    throw oVar;
                }
                zVar.a(oVar);
                return;
            }
            zVar.f14692a = null;
            zVar.f14693b = -9223372036854775807L;
            zVar.f14694c = -9223372036854775807L;
            if (r(this.f14564x)) {
                if (this.L > 0) {
                    this.f14544h0 = false;
                }
                if (this.X && (nVar = this.f14561t) != null && write < remaining && !this.f14544h0) {
                    nVar.l();
                }
            }
            int i10 = this.v.f14677c;
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
        throw new UnsupportedOperationException("Method not decompiled: k2.d0.f():boolean");
    }

    public final void g() {
        y yVar;
        if (q()) {
            this.I = 0L;
            this.J = 0L;
            this.K = 0L;
            this.L = 0L;
            this.f14544h0 = false;
            this.M = 0;
            this.D = new w(this.E, 0L, 0L);
            this.P = 0L;
            this.C = null;
            this.f14545i.clear();
            this.R = null;
            this.S = 0;
            this.T = null;
            this.V = false;
            this.U = false;
            this.W = false;
            this.G = null;
            this.H = 0;
            this.d.f14632o = 0L;
            c2.e eVar = this.v.f14681i;
            this.f14563w = eVar;
            eVar.a();
            AudioTrack audioTrack = this.h.f14651c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f14564x.pause();
            }
            if (r(this.f14564x)) {
                c0 c0Var = this.f14551l;
                c0Var.getClass();
                c0Var.a(this.f14564x);
            }
            k a2 = this.v.a();
            v vVar = this.f14562u;
            if (vVar != null) {
                this.v = vVar;
                this.f14562u = null;
            }
            s sVar = this.h;
            sVar.g();
            sVar.f14651c = null;
            sVar.f14652e = null;
            if (Build.VERSION.SDK_INT >= 24 && (yVar = this.A) != null) {
                yVar.b();
                this.A = null;
            }
            AudioTrack audioTrack2 = this.f14564x;
            n nVar = this.f14561t;
            Handler handler = new Handler(Looper.myLooper());
            synchronized (f14528o0) {
                try {
                    if (f14529p0 == null) {
                        String str = e2.d0.f8737a;
                        f14529p0 = Executors.newSingleThreadScheduledExecutor(new e2.c0(0));
                    }
                    f14530q0++;
                    f14529p0.schedule(new androidx.car.app.utils.b(audioTrack2, nVar, handler, a2, 20), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f14564x = null;
        }
        z zVar = this.f14554n;
        zVar.f14692a = null;
        zVar.f14693b = -9223372036854775807L;
        zVar.f14694c = -9223372036854775807L;
        z zVar2 = this.f14553m;
        zVar2.f14692a = null;
        zVar2.f14693b = -9223372036854775807L;
        zVar2.f14694c = -9223372036854775807L;
        this.f14548j0 = 0L;
        this.f14550k0 = 0L;
        Handler handler2 = this.f14552l0;
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
            return e0.b.c(this.f14564x, this.v);
        }
        v vVar = this.v;
        if (vVar.f14677c == 0) {
            j3 = vVar.f14678e * vVar.d;
        } else {
            int i10 = c3.b.i(vVar.f14680g);
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
            long min = Math.min(this.h.a(), e2.d0.W(this.v.f14678e, m()));
            while (true) {
                arrayDeque = this.f14545i;
                if (arrayDeque.isEmpty() || min < ((w) arrayDeque.getFirst()).f14687c) {
                    break;
                }
                this.D = (w) arrayDeque.remove();
            }
            w wVar = this.D;
            long j10 = min - wVar.f14687c;
            long z10 = e2.d0.z(j10, wVar.f14685a.f2400a);
            boolean isEmpty = arrayDeque.isEmpty();
            aa.a aVar = this.f14533b;
            if (isEmpty) {
                c2.k kVar = (c2.k) aVar.d;
                if (kVar.isActive()) {
                    if (kVar.f4193o >= 1024) {
                        long j11 = kVar.f4192n;
                        kVar.f4188j.getClass();
                        long j12 = j11 - ((jVar.f4170k * jVar.f4163b) * 2);
                        int i10 = kVar.h.f4153a;
                        int i11 = kVar.f4186g.f4153a;
                        if (i10 == i11) {
                            j10 = e2.d0.Y(j10, j12, kVar.f4193o, RoundingMode.DOWN);
                        } else {
                            j10 = e2.d0.Y(j10, j12 * i10, kVar.f4193o * i11, RoundingMode.DOWN);
                        }
                    } else {
                        j10 = (long) (kVar.f4183c * j10);
                    }
                }
                w wVar2 = this.D;
                j3 = wVar2.f14686b + j10;
                wVar2.d = j10 - z10;
            } else {
                w wVar3 = this.D;
                j3 = wVar3.f14686b + z10 + wVar3.d;
            }
            long j13 = ((j0) aVar.f372c).f14610q;
            long W = e2.d0.W(this.v.f14678e, j13) + j3;
            long j14 = this.f14548j0;
            if (j13 > j14) {
                long W2 = e2.d0.W(this.v.f14678e, j13 - j14);
                this.f14548j0 = j13;
                this.f14550k0 += W2;
                if (this.f14552l0 == null) {
                    this.f14552l0 = new Handler(Looper.myLooper());
                }
                this.f14552l0.removeCallbacksAndMessages(null);
                this.f14552l0.postDelayed(new t0(this, 12), 100L);
            }
            return W;
        }
        return Long.MIN_VALUE;
    }

    public final e j(b2.s sVar) {
        boolean booleanValue;
        boolean z10;
        if (this.f14543g0) {
            return e.d;
        }
        b2.e eVar = this.B;
        pf.b bVar = this.f14557p;
        bVar.getClass();
        sVar.getClass();
        int i10 = sVar.K;
        eVar.getClass();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29 && i10 != -1) {
            Context context = (Context) bVar.f44046b;
            Boolean bool = (Boolean) bVar.f44047c;
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
                    bVar.f44047c = Boolean.valueOf(z10);
                } else {
                    bVar.f44047c = Boolean.FALSE;
                }
                booleanValue = ((Boolean) bVar.f44047c).booleanValue();
            }
            String str = sVar.f2370r;
            str.getClass();
            int c10 = r0.c(str, sVar.f2363k);
            if (c10 != 0 && i11 >= e2.d0.q(c10)) {
                int s10 = e2.d0.s(sVar.J);
                if (s10 == 0) {
                    return e.d;
                }
                try {
                    AudioFormat r10 = e2.d0.r(i10, s10, c10);
                    if (i11 >= 31) {
                        return e0.h0.a(r10, (AudioAttributes) eVar.b().f2408a, booleanValue);
                    }
                    return b2.c.f(r10, (AudioAttributes) eVar.b().f2408a, booleanValue);
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
        String str = sVar.f2370r;
        int i10 = sVar.L;
        if ("audio/raw".equals(str)) {
            if (!e2.d0.K(i10)) {
                e2.n(i10, "Invalid PCM encoding: ", "DefaultAudioSink");
                return 0;
            } else if (i10 != 2) {
                return 1;
            }
        } else if (this.f14565y.d(this.B, sVar) == null) {
            return 0;
        }
        return 2;
    }

    public final long l() {
        v vVar = this.v;
        if (vVar.f14677c == 0) {
            return this.I / vVar.f14676b;
        }
        return this.J;
    }

    public final long m() {
        v vVar = this.v;
        if (vVar.f14677c == 0) {
            long j3 = this.K;
            long j10 = vVar.d;
            String str = e2.d0.f8737a;
            return ((j3 + j10) - 1) / j10;
        }
        return this.L;
    }

    public final boolean n(java.nio.ByteBuffer r27, long r28, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: k2.d0.n(java.nio.ByteBuffer, long, int):boolean");
    }

    public final boolean o() {
        if (q()) {
            if ((Build.VERSION.SDK_INT < 29 || !this.f14564x.isOffloadedPlayback() || !this.W) && this.h.e(m())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean p() {
        throw new UnsupportedOperationException("Method not decompiled: k2.d0.p():boolean");
    }

    public final boolean q() {
        if (this.f14564x != null) {
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
        if (this.f14566z != null && this.f14546i0 != myLooper) {
            z10 = false;
        } else {
            z10 = true;
        }
        StringBuilder sb2 = new StringBuilder("DefaultAudioSink accessed on multiple threads: ");
        Looper looper = this.f14546i0;
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
        if (this.f14566z == null && (context = this.f14531a) != null) {
            this.f14546i0 = myLooper;
            g7 g7Var = new g7(context, new k5(this, 1), this.B, this.f14536c0);
            this.f14566z = g7Var;
            Handler handler = (Handler) g7Var.d;
            Context context2 = (Context) g7Var.f7265b;
            if (g7Var.f7264a) {
                bVar = (b) g7Var.h;
                bVar.getClass();
            } else {
                g7Var.f7264a = true;
                d dVar = (d) g7Var.f7269g;
                if (dVar != null) {
                    dVar.f14525a.registerContentObserver(dVar.f14526b, false, dVar);
                }
                if (Build.VERSION.SDK_INT >= 23 && (cVar = (c) g7Var.f7267e) != null) {
                    e0.b.u(context2, cVar, handler);
                }
                b b10 = b.b(context2, context2.registerReceiver((androidx.mediarouter.app.g) g7Var.f7268f, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), (b2.e) g7Var.f7271j, (u4) g7Var.f7270i);
                g7Var.h = b10;
                bVar = b10;
            }
            this.f14565y = bVar;
        }
        this.f14565y.getClass();
    }

    public final void t() {
        this.X = false;
        if (q()) {
            s sVar = this.h;
            sVar.g();
            if (sVar.f14671z == -9223372036854775807L) {
                r rVar = sVar.f14652e;
                rVar.getClass();
                rVar.a(0);
            }
            sVar.B = sVar.b();
            if (!this.V || r(this.f14564x)) {
                this.f14564x.pause();
            }
        }
    }

    public final void u() {
        this.X = true;
        if (q()) {
            s sVar = this.h;
            if (sVar.f14671z != -9223372036854775807L) {
                sVar.I.getClass();
                sVar.f14671z = e2.d0.Q(SystemClock.elapsedRealtime());
            }
            sVar.f14657k = e2.d0.W(sVar.f14653f, sVar.b());
            r rVar = sVar.f14652e;
            rVar.getClass();
            rVar.a(0);
            if (!this.V || r(this.f14564x)) {
                this.f14564x.play();
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
            sVar.f14671z = e2.d0.Q(SystemClock.elapsedRealtime());
            sVar.C = m10;
            if (r(this.f14564x)) {
                this.W = false;
            }
            this.f14564x.stop();
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
        throw new UnsupportedOperationException("Method not decompiled: k2.d0.x(long):void");
    }

    public final void y() {
        g();
        e9.g0 listIterator = this.f14542g.listIterator(0);
        while (listIterator.hasNext()) {
            ((c2.h) listIterator.next()).reset();
        }
        this.f14538e.reset();
        this.f14540f.reset();
        c2.e eVar = this.f14563w;
        if (eVar != null) {
            e9.i0 i0Var = eVar.f4149a;
            for (int i10 = 0; i10 < i0Var.size(); i10++) {
                c2.h hVar = (c2.h) i0Var.get(i10);
                hVar.flush();
                hVar.reset();
            }
            eVar.f4151c = new ByteBuffer[0];
            c2.f fVar = c2.f.f4152e;
            eVar.d = false;
        }
        this.X = false;
        this.f14543g0 = false;
    }

    public final void z(b2.e eVar) {
        if (!this.B.equals(eVar)) {
            this.B = eVar;
            if (this.f14537d0) {
                return;
            }
            g7 g7Var = this.f14566z;
            if (g7Var != null) {
                g7Var.f7271j = eVar;
                g7Var.a(b.c((Context) g7Var.f7265b, eVar, (u4) g7Var.f7270i));
            }
            g();
        }
    }
}
