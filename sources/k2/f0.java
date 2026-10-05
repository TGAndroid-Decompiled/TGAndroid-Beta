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
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
public final class f0 implements q {
    public static final Object f14396o0 = new Object();
    public static ScheduledExecutorService f14397p0;
    public static int f14398q0;
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
    public final Context f14399a;
    public boolean f14400a0;
    public final aa.a f14401b;
    public b2.f f14402b0;
    public final u f14403c;
    public e f14404c0;
    public final n0 d;
    public boolean f14405d0;
    public final c2.l f14406e;
    public long f14407e0;
    public final m0 f14408f;
    public long f14409f0;
    public final a1 f14410g;
    public boolean f14411g0;
    public final t h;
    public boolean f14412h0;
    public final ArrayDeque f14413i;
    public Looper f14414i0;
    public final boolean f14415j;
    public long f14416j0;
    public int f14417k;
    public long f14418k0;
    public e0 f14419l;
    public Handler f14420l0;
    public final b0 f14421m;
    public Context m0;
    public final b0 f14422n;
    public final boolean f14423n0;
    public final g0 f14424o;
    public final of.b f14425p;
    public final h0 f14426q;
    public final int f14427r;
    public j2.k f14428s;
    public o f14429t;
    public x f14430u;
    public x v;
    public c2.e f14431w;
    public AudioTrack f14432x;
    public b f14433y;
    public e7 f14434z;

    public f0(d6 d6Var) {
        Context applicationContext;
        int deviceId;
        Context context = (Context) d6Var.f773b;
        if (context == null) {
            applicationContext = null;
        } else {
            applicationContext = context.getApplicationContext();
        }
        this.f14399a = applicationContext;
        this.B = b2.e.h;
        this.f14433y = applicationContext == null ? (b) d6Var.f774c : null;
        this.f14401b = (aa.a) d6Var.d;
        int i10 = Build.VERSION.SDK_INT;
        this.f14415j = false;
        this.f14417k = 0;
        this.f14424o = (g0) d6Var.f775e;
        of.b bVar = (of.b) d6Var.f777g;
        bVar.getClass();
        this.f14425p = bVar;
        this.h = new t(new a4.m(this, 24));
        ?? iVar = new c2.i();
        this.f14403c = iVar;
        ?? iVar2 = new c2.i();
        iVar2.f14493m = e2.d0.f8539b;
        this.d = iVar2;
        this.f14406e = new c2.i();
        this.f14408f = new c2.i();
        this.f14410g = e9.i0.A(iVar2, iVar);
        this.Q = 1.0f;
        this.Z = 0;
        this.f14402b0 = new Object();
        v0 v0Var = v0.d;
        this.D = new y(v0Var, 0L, 0L);
        this.E = v0Var;
        this.F = false;
        this.f14413i = new ArrayDeque();
        this.f14421m = new b0();
        this.f14422n = new b0();
        this.f14426q = (h0) d6Var.f776f;
        int i11 = -1;
        if (i10 >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i11 = deviceId;
        }
        this.f14427r = i11;
        this.f14423n0 = true;
    }

    public static boolean r(AudioTrack audioTrack) {
        if (Build.VERSION.SDK_INT >= 29 && audioTrack.isOffloadedPlayback()) {
            return true;
        }
        return false;
    }

    public final void A(int i10) {
        boolean z10 = false;
        if (this.f14400a0) {
            if (this.Z == i10) {
                this.f14400a0 = false;
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
                this.f14432x.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.E.f3594a).setPitch(this.E.f3595b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e7) {
                e2.a.o("DefaultAudioSink", "Failed to set playback params", e7);
            }
            v0 v0Var = new v0(this.f14432x.getPlaybackParams().getSpeed(), this.f14432x.getPlaybackParams().getPitch());
            this.E = v0Var;
            float f7 = v0Var.f3594a;
            t tVar = this.h;
            tVar.f14518i = f7;
            s sVar = tVar.f14515e;
            if (sVar != null) {
                sVar.a(0);
            }
            tVar.g();
        }
    }

    public final void C(b2.f fVar) {
        if (this.f14402b0.equals(fVar)) {
            return;
        }
        fVar.getClass();
        if (this.f14432x != null) {
            this.f14402b0.getClass();
        }
        this.f14402b0 = fVar;
    }

    public final void D(int i10, int i11) {
        x xVar;
        AudioTrack audioTrack = this.f14432x;
        if (audioTrack != null && r(audioTrack) && (xVar = this.v) != null && xVar.f14548k) {
            this.f14432x.setOffloadDelayPadding(i10, i11);
        }
    }

    public final void E(java.nio.ByteBuffer r19) {
        throw new UnsupportedOperationException("Method not decompiled: k2.f0.E(java.nio.ByteBuffer):void");
    }

    public final void F(v0 v0Var) {
        this.E = new v0(e2.d0.g(v0Var.f3594a, 0.1f, 8.0f), e2.d0.g(v0Var.f3595b, 0.1f, 8.0f));
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
        if (xVar != null && xVar.f14547j && Build.VERSION.SDK_INT >= 23) {
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
        aa.a aVar = this.f14401b;
        if (!H) {
            if (!this.f14405d0) {
                x xVar = this.v;
                if (xVar.f14542c == 0) {
                    int i10 = xVar.f14540a.L;
                    v0Var = this.E;
                    c2.k kVar = (c2.k) aVar.d;
                    float f7 = v0Var.f3594a;
                    kVar.getClass();
                    if (f7 > 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    e2.d.b(z10);
                    if (kVar.f3989c != f7) {
                        kVar.f3989c = f7;
                        kVar.f3993i = true;
                    }
                    float f10 = v0Var.f3595b;
                    if (f10 > 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    e2.d.b(z11);
                    if (kVar.d != f10) {
                        kVar.d = f10;
                        kVar.f3993i = true;
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
        if (!this.f14405d0) {
            x xVar2 = this.v;
            if (xVar2.f14542c == 0) {
                int i11 = xVar2.f14540a.L;
                z12 = this.F;
                ((k0) aVar.f387c).f14471o = z12;
            }
        }
        this.F = z12;
        long max = Math.max(0L, j3);
        x xVar3 = this.v;
        this.f14413i.add(new y(v0Var2, max, e2.d0.W(xVar3.f14543e, m())));
        c2.e eVar = this.v.f14546i;
        this.f14431w = eVar;
        eVar.a();
        o oVar = this.f14429t;
        if (oVar != null) {
            oVar.onSkipSilenceEnabledChanged(this.F);
        }
    }

    public final AudioTrack b(l lVar, b2.e eVar, int i10, b2.s sVar, Context context) {
        try {
            AudioTrack a2 = this.f14426q.a(lVar, eVar, i10, context);
            int state = a2.getState();
            if (state == 1) {
                return a2;
            }
            try {
                a2.release();
            } catch (Exception unused) {
            }
            throw new n(state, lVar.f14479b, lVar.f14480c, lVar.f14478a, lVar.f14482f, sVar, lVar.f14481e, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e7) {
            throw new n(0, lVar.f14479b, lVar.f14480c, lVar.f14478a, lVar.f14482f, sVar, lVar.f14481e, e7);
        }
    }

    public final android.media.AudioTrack c(k2.x r9) {
        throw new UnsupportedOperationException("Method not decompiled: k2.f0.c(k2.x):android.media.AudioTrack");
    }

    public final void d(b2.s r27, int[] r28) {
        throw new UnsupportedOperationException("Method not decompiled: k2.f0.d(b2.s, int[]):void");
    }

    public final void e(long j3) {
        int write;
        o oVar;
        boolean z10;
        boolean z11;
        b0 b0Var = this.f14422n;
        if (this.T != null) {
            boolean z12 = false;
            if (b0Var.f14378a != null) {
                synchronized (f14396o0) {
                    if (f14398q0 > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                if (z11 || SystemClock.elapsedRealtime() < b0Var.f14380c) {
                    return;
                }
            }
            int remaining = this.T.remaining();
            if (this.f14405d0) {
                if (j3 != -9223372036854775807L) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e2.d.g(z10);
                if (j3 == Long.MIN_VALUE) {
                    j3 = this.f14407e0;
                } else {
                    this.f14407e0 = j3;
                }
                AudioTrack audioTrack = this.f14432x;
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
                write = this.f14432x.write(this.T, remaining, 1);
            }
            this.f14409f0 = SystemClock.elapsedRealtime();
            if (write < 0) {
                if ((Build.VERSION.SDK_INT >= 24 && write == -6) || write == -32) {
                    if (m() <= 0) {
                        if (r(this.f14432x)) {
                            if (this.v.f14542c == 1) {
                                this.f14411g0 = true;
                            }
                        }
                    }
                    z12 = true;
                }
                p pVar = new p(write, this.v.f14540a, z12);
                o oVar2 = this.f14429t;
                if (oVar2 != null) {
                    oVar2.x(pVar);
                }
                if (pVar.f14497b && this.f14399a != null) {
                    b bVar = b.f14374c;
                    this.f14433y = bVar;
                    this.f14434z.a(bVar);
                    throw pVar;
                }
                b0Var.a(pVar);
                return;
            }
            b0Var.f14378a = null;
            b0Var.f14379b = -9223372036854775807L;
            b0Var.f14380c = -9223372036854775807L;
            if (r(this.f14432x)) {
                if (this.L > 0) {
                    this.f14412h0 = false;
                }
                if (this.X && (oVar = this.f14429t) != null && write < remaining && !this.f14412h0) {
                    oVar.o();
                }
            }
            int i10 = this.v.f14542c;
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
        throw new UnsupportedOperationException("Method not decompiled: k2.f0.f():boolean");
    }

    public final void g() {
        a0 a0Var;
        if (q()) {
            this.I = 0L;
            this.J = 0L;
            this.K = 0L;
            this.L = 0L;
            this.f14412h0 = false;
            this.M = 0;
            this.D = new y(this.E, 0L, 0L);
            this.P = 0L;
            this.C = null;
            this.f14413i.clear();
            this.R = null;
            this.S = 0;
            this.T = null;
            this.V = false;
            this.U = false;
            this.W = false;
            this.G = null;
            this.H = 0;
            this.d.f14495o = 0L;
            c2.e eVar = this.v.f14546i;
            this.f14431w = eVar;
            eVar.a();
            AudioTrack audioTrack = this.h.f14514c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f14432x.pause();
            }
            if (r(this.f14432x)) {
                e0 e0Var = this.f14419l;
                e0Var.getClass();
                e0Var.a(this.f14432x);
            }
            l a2 = this.v.a();
            x xVar = this.f14430u;
            if (xVar != null) {
                this.v = xVar;
                this.f14430u = null;
            }
            t tVar = this.h;
            tVar.g();
            tVar.f14514c = null;
            tVar.f14515e = null;
            if (Build.VERSION.SDK_INT >= 24 && (a0Var = this.A) != null) {
                a0Var.b();
                this.A = null;
            }
            AudioTrack audioTrack2 = this.f14432x;
            o oVar = this.f14429t;
            Handler handler = new Handler(Looper.myLooper());
            synchronized (f14396o0) {
                try {
                    if (f14397p0 == null) {
                        String str = e2.d0.f8538a;
                        f14397p0 = Executors.newSingleThreadScheduledExecutor(new e2.c0(0));
                    }
                    f14398q0++;
                    f14397p0.schedule(new h5(audioTrack2, oVar, handler, a2, 19), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f14432x = null;
        }
        b0 b0Var = this.f14422n;
        b0Var.f14378a = null;
        b0Var.f14379b = -9223372036854775807L;
        b0Var.f14380c = -9223372036854775807L;
        b0 b0Var2 = this.f14421m;
        b0Var2.f14378a = null;
        b0Var2.f14379b = -9223372036854775807L;
        b0Var2.f14380c = -9223372036854775807L;
        this.f14416j0 = 0L;
        this.f14418k0 = 0L;
        Handler handler2 = this.f14420l0;
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
            return e0.b.c(this.f14432x, this.v);
        }
        x xVar = this.v;
        if (xVar.f14542c == 0) {
            j3 = xVar.f14543e * xVar.d;
        } else {
            int i10 = c3.b.i(xVar.f14545g);
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
            long min = Math.min(this.h.a(), e2.d0.W(this.v.f14543e, m()));
            while (true) {
                arrayDeque = this.f14413i;
                if (arrayDeque.isEmpty() || min < ((y) arrayDeque.getFirst()).f14552c) {
                    break;
                }
                this.D = (y) arrayDeque.remove();
            }
            y yVar = this.D;
            long j10 = min - yVar.f14552c;
            long z10 = e2.d0.z(j10, yVar.f14550a.f3594a);
            boolean isEmpty = arrayDeque.isEmpty();
            aa.a aVar = this.f14401b;
            if (isEmpty) {
                c2.k kVar = (c2.k) aVar.d;
                if (kVar.isActive()) {
                    if (kVar.f3999o >= 1024) {
                        long j11 = kVar.f3998n;
                        kVar.f3994j.getClass();
                        long j12 = j11 - ((jVar.f3976k * jVar.f3969b) * 2);
                        int i10 = kVar.h.f3959a;
                        int i11 = kVar.f3992g.f3959a;
                        if (i10 == i11) {
                            j10 = e2.d0.Y(j10, j12, kVar.f3999o, RoundingMode.DOWN);
                        } else {
                            j10 = e2.d0.Y(j10, j12 * i10, kVar.f3999o * i11, RoundingMode.DOWN);
                        }
                    } else {
                        j10 = (long) (kVar.f3989c * j10);
                    }
                }
                y yVar2 = this.D;
                j3 = yVar2.f14551b + j10;
                yVar2.d = j10 - z10;
            } else {
                y yVar3 = this.D;
                j3 = yVar3.f14551b + z10 + yVar3.d;
            }
            long j13 = ((k0) aVar.f387c).f14473q;
            long W = e2.d0.W(this.v.f14543e, j13) + j3;
            long j14 = this.f14416j0;
            if (j13 > j14) {
                long W2 = e2.d0.W(this.v.f14543e, j13 - j14);
                this.f14416j0 = j13;
                this.f14418k0 += W2;
                if (this.f14420l0 == null) {
                    this.f14420l0 = new Handler(Looper.myLooper());
                }
                this.f14420l0.removeCallbacksAndMessages(null);
                this.f14420l0.postDelayed(new i2.h0(this, 8), 100L);
            }
            return W;
        }
        return Long.MIN_VALUE;
    }

    public final f j(b2.s sVar) {
        boolean booleanValue;
        boolean z10;
        if (this.f14411g0) {
            return f.d;
        }
        b2.e eVar = this.B;
        of.b bVar = this.f14425p;
        bVar.getClass();
        sVar.getClass();
        int i10 = sVar.K;
        eVar.getClass();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29 && i10 != -1) {
            Context context = (Context) bVar.f17167b;
            Boolean bool = (Boolean) bVar.f17168c;
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
                    bVar.f17168c = Boolean.valueOf(z10);
                } else {
                    bVar.f17168c = Boolean.FALSE;
                }
                booleanValue = ((Boolean) bVar.f17168c).booleanValue();
            }
            String str = sVar.f3564r;
            str.getClass();
            int c10 = r0.c(str, sVar.f3557k);
            if (c10 != 0 && i11 >= e2.d0.q(c10)) {
                int s10 = e2.d0.s(sVar.J);
                if (s10 == 0) {
                    return f.d;
                }
                try {
                    AudioFormat r10 = e2.d0.r(i10, s10, c10);
                    if (i11 >= 31) {
                        return e0.h0.b(r10, (AudioAttributes) eVar.b().f3602a, booleanValue);
                    }
                    return b2.c.f(r10, (AudioAttributes) eVar.b().f3602a, booleanValue);
                } catch (IllegalArgumentException unused) {
                    return f.d;
                }
            }
            return f.d;
        }
        return f.d;
    }

    public final int k(b2.s sVar) {
        s();
        String str = sVar.f3564r;
        int i10 = sVar.L;
        if ("audio/raw".equals(str)) {
            if (!e2.d0.K(i10)) {
                e2.m(i10, "Invalid PCM encoding: ", "DefaultAudioSink");
                return 0;
            } else if (i10 != 2) {
                return 1;
            }
        } else if (this.f14433y.d(this.B, sVar) == null) {
            return 0;
        }
        return 2;
    }

    public final long l() {
        x xVar = this.v;
        if (xVar.f14542c == 0) {
            return this.I / xVar.f14541b;
        }
        return this.J;
    }

    public final long m() {
        x xVar = this.v;
        if (xVar.f14542c == 0) {
            long j3 = this.K;
            long j10 = xVar.d;
            String str = e2.d0.f8538a;
            return ((j3 + j10) - 1) / j10;
        }
        return this.L;
    }

    public final boolean n(long r27, int r29, java.nio.ByteBuffer r30) {
        throw new UnsupportedOperationException("Method not decompiled: k2.f0.n(long, int, java.nio.ByteBuffer):boolean");
    }

    public final boolean o() {
        if (q()) {
            if ((Build.VERSION.SDK_INT < 29 || !this.f14432x.isOffloadedPlayback() || !this.W) && this.h.e(m())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean p() {
        throw new UnsupportedOperationException("Method not decompiled: k2.f0.p():boolean");
    }

    public final boolean q() {
        if (this.f14432x != null) {
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
        if (this.f14434z != null && this.f14414i0 != myLooper) {
            z10 = false;
        } else {
            z10 = true;
        }
        StringBuilder sb2 = new StringBuilder("DefaultAudioSink accessed on multiple threads: ");
        Looper looper = this.f14414i0;
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
        if (this.f14434z == null && (context = this.f14399a) != null) {
            this.f14414i0 = myLooper;
            e7 e7Var = new e7(context, new v(this, 0), this.B, this.f14404c0);
            this.f14434z = e7Var;
            Handler handler = (Handler) e7Var.d;
            Context context2 = (Context) e7Var.f5023b;
            if (e7Var.f5022a) {
                bVar = (b) e7Var.h;
                bVar.getClass();
            } else {
                e7Var.f5022a = true;
                d dVar = (d) e7Var.f5027g;
                if (dVar != null) {
                    dVar.f14384a.registerContentObserver(dVar.f14385b, false, dVar);
                }
                if (Build.VERSION.SDK_INT >= 23 && (cVar = (c) e7Var.f5025e) != null) {
                    e0.b.u(context2, cVar, handler);
                }
                b b10 = b.b(context2, context2.registerReceiver((androidx.mediarouter.app.g) e7Var.f5026f, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), (b2.e) e7Var.f5029j, (e) e7Var.f5028i);
                e7Var.h = b10;
                bVar = b10;
            }
            this.f14433y = bVar;
        }
        this.f14433y.getClass();
    }

    public final void t() {
        this.X = false;
        if (q()) {
            t tVar = this.h;
            tVar.g();
            if (tVar.f14534z == -9223372036854775807L) {
                s sVar = tVar.f14515e;
                sVar.getClass();
                sVar.a(0);
            }
            tVar.B = tVar.b();
            if (!this.V || r(this.f14432x)) {
                this.f14432x.pause();
            }
        }
    }

    public final void u() {
        this.X = true;
        if (q()) {
            t tVar = this.h;
            if (tVar.f14534z != -9223372036854775807L) {
                tVar.I.getClass();
                tVar.f14534z = e2.d0.Q(SystemClock.elapsedRealtime());
            }
            tVar.f14520k = e2.d0.W(tVar.f14516f, tVar.b());
            s sVar = tVar.f14515e;
            sVar.getClass();
            sVar.a(0);
            if (!this.V || r(this.f14432x)) {
                this.f14432x.play();
            }
        }
    }

    public final void v() {
        if (!this.V) {
            this.V = true;
            long m10 = m();
            t tVar = this.h;
            tVar.B = tVar.b();
            tVar.I.getClass();
            tVar.f14534z = e2.d0.Q(SystemClock.elapsedRealtime());
            tVar.C = m10;
            if (r(this.f14432x)) {
                this.W = false;
            }
            this.f14432x.stop();
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
        throw new UnsupportedOperationException("Method not decompiled: k2.f0.x(long):void");
    }

    public final void y() {
        g();
        e9.g0 listIterator = this.f14410g.listIterator(0);
        while (listIterator.hasNext()) {
            ((c2.h) listIterator.next()).reset();
        }
        this.f14406e.reset();
        this.f14408f.reset();
        c2.e eVar = this.f14431w;
        if (eVar != null) {
            e9.i0 i0Var = eVar.f3955a;
            for (int i10 = 0; i10 < i0Var.size(); i10++) {
                c2.h hVar = (c2.h) i0Var.get(i10);
                hVar.flush();
                hVar.reset();
            }
            eVar.f3957c = new ByteBuffer[0];
            c2.f fVar = c2.f.f3958e;
            eVar.d = false;
        }
        this.X = false;
        this.f14411g0 = false;
    }

    public final void z(b2.e eVar) {
        if (!this.B.equals(eVar)) {
            this.B = eVar;
            if (this.f14405d0) {
                return;
            }
            e7 e7Var = this.f14434z;
            if (e7Var != null) {
                e7Var.f5029j = eVar;
                e7Var.a(b.c((Context) e7Var.f5023b, eVar, (e) e7Var.f5028i));
            }
            g();
        }
    }
}
