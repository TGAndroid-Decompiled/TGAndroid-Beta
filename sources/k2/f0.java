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
public final class f0 implements q {
    public static final Object f13251o0 = new Object();
    public static ScheduledExecutorService f13252p0;
    public static int f13253q0;
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
    public final Context f13254a;
    public boolean f13255a0;
    public final aa.a f13256b;
    public b2.f f13257b0;
    public final u f13258c;
    public e f13259c0;
    public final n0 d;
    public boolean f13260d0;
    public final c2.l e;
    public long f13261e0;
    public final m0 f13262f;
    public long f13263f0;
    public final a1 f13264g;
    public boolean f13265g0;
    public final t h;
    public boolean f13266h0;
    public final ArrayDeque f13267i;
    public Looper f13268i0;
    public final boolean f13269j;
    public long f13270j0;
    public int f13271k;
    public long f13272k0;
    public e0 f13273l;
    public Handler f13274l0;
    public final b0 f13275m;
    public Context m0;
    public final b0 f13276n;
    public final boolean f13277n0;
    public final g0 f13278o;
    public final of.b f13279p;
    public final h0 f13280q;
    public final int f13281r;
    public j2.k f13282s;
    public o f13283t;
    public x f13284u;
    public x v;
    public c2.e f13285w;
    public AudioTrack f13286x;
    public b f13287y;
    public g7 f13288z;

    public f0(e6 e6Var) {
        Context applicationContext;
        int deviceId;
        Context context = (Context) e6Var.f762b;
        if (context == null) {
            applicationContext = null;
        } else {
            applicationContext = context.getApplicationContext();
        }
        this.f13254a = applicationContext;
        this.B = b2.e.h;
        this.f13287y = applicationContext == null ? (b) e6Var.f763c : null;
        this.f13256b = (aa.a) e6Var.d;
        int i10 = Build.VERSION.SDK_INT;
        this.f13269j = false;
        this.f13271k = 0;
        this.f13278o = (g0) e6Var.e;
        of.b bVar = (of.b) e6Var.f765g;
        bVar.getClass();
        this.f13279p = bVar;
        this.h = new t(new zg.t(this));
        ?? iVar = new c2.i();
        this.f13258c = iVar;
        ?? iVar2 = new c2.i();
        iVar2.f13344m = e2.d0.f7888b;
        this.d = iVar2;
        this.e = new c2.i();
        this.f13262f = new c2.i();
        this.f13264g = e9.i0.A(iVar2, iVar);
        this.Q = 1.0f;
        this.Z = 0;
        this.f13257b0 = new Object();
        v0 v0Var = v0.d;
        this.D = new y(v0Var, 0L, 0L);
        this.E = v0Var;
        this.F = false;
        this.f13267i = new ArrayDeque();
        this.f13275m = new b0();
        this.f13276n = new b0();
        this.f13280q = (h0) e6Var.f764f;
        int i11 = -1;
        if (i10 >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i11 = deviceId;
        }
        this.f13281r = i11;
        this.f13277n0 = true;
    }

    public static boolean r(AudioTrack audioTrack) {
        if (Build.VERSION.SDK_INT >= 29 && audioTrack.isOffloadedPlayback()) {
            return true;
        }
        return false;
    }

    public final void A(int i10) {
        boolean z10 = false;
        if (this.f13255a0) {
            if (this.Z == i10) {
                this.f13255a0 = false;
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
                this.f13286x.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.E.f3335a).setPitch(this.E.f3336b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                e2.a.o("DefaultAudioSink", "Failed to set playback params", e);
            }
            v0 v0Var = new v0(this.f13286x.getPlaybackParams().getSpeed(), this.f13286x.getPlaybackParams().getPitch());
            this.E = v0Var;
            float f7 = v0Var.f3335a;
            t tVar = this.h;
            tVar.f13366i = f7;
            s sVar = tVar.e;
            if (sVar != null) {
                sVar.a(0);
            }
            tVar.g();
        }
    }

    public final void C(b2.f fVar) {
        if (this.f13257b0.equals(fVar)) {
            return;
        }
        fVar.getClass();
        if (this.f13286x != null) {
            this.f13257b0.getClass();
        }
        this.f13257b0 = fVar;
    }

    public final void D(int i10, int i11) {
        x xVar;
        AudioTrack audioTrack = this.f13286x;
        if (audioTrack != null && r(audioTrack) && (xVar = this.v) != null && xVar.f13395k) {
            this.f13286x.setOffloadDelayPadding(i10, i11);
        }
    }

    public final void E(java.nio.ByteBuffer r19) {
        throw new UnsupportedOperationException("Method not decompiled: k2.f0.E(java.nio.ByteBuffer):void");
    }

    public final void F(v0 v0Var) {
        this.E = new v0(e2.d0.g(v0Var.f3335a, 0.1f, 8.0f), e2.d0.g(v0Var.f3336b, 0.1f, 8.0f));
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
        if (xVar != null && xVar.f13394j && Build.VERSION.SDK_INT >= 23) {
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
        aa.a aVar = this.f13256b;
        if (!H) {
            if (!this.f13260d0) {
                x xVar = this.v;
                if (xVar.f13390c == 0) {
                    int i10 = xVar.f13388a.L;
                    v0Var = this.E;
                    c2.k kVar = (c2.k) aVar.d;
                    float f7 = v0Var.f3335a;
                    kVar.getClass();
                    if (f7 > 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    e2.d.b(z10);
                    if (kVar.f3696c != f7) {
                        kVar.f3696c = f7;
                        kVar.f3699i = true;
                    }
                    float f10 = v0Var.f3336b;
                    if (f10 > 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    e2.d.b(z11);
                    if (kVar.d != f10) {
                        kVar.d = f10;
                        kVar.f3699i = true;
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
        if (!this.f13260d0) {
            x xVar2 = this.v;
            if (xVar2.f13390c == 0) {
                int i11 = xVar2.f13388a.L;
                z12 = this.F;
                ((k0) aVar.f357c).f13323o = z12;
            }
        }
        this.F = z12;
        long max = Math.max(0L, j3);
        x xVar3 = this.v;
        this.f13267i.add(new y(v0Var2, max, e2.d0.W(xVar3.e, m())));
        c2.e eVar = this.v.f13393i;
        this.f13285w = eVar;
        eVar.a();
        o oVar = this.f13283t;
        if (oVar != null) {
            oVar.onSkipSilenceEnabledChanged(this.F);
        }
    }

    public final AudioTrack b(l lVar, b2.e eVar, int i10, b2.s sVar, Context context) {
        try {
            AudioTrack a2 = this.f13280q.a(lVar, eVar, i10, context);
            int state = a2.getState();
            if (state == 1) {
                return a2;
            }
            try {
                a2.release();
            } catch (Exception unused) {
            }
            throw new n(state, lVar.f13331b, lVar.f13332c, lVar.f13330a, lVar.f13333f, sVar, lVar.e, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new n(0, lVar.f13331b, lVar.f13332c, lVar.f13330a, lVar.f13333f, sVar, lVar.e, e);
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
        b0 b0Var = this.f13276n;
        if (this.T != null) {
            boolean z12 = false;
            if (b0Var.f13233a != null) {
                synchronized (f13251o0) {
                    if (f13253q0 > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                if (z11 || SystemClock.elapsedRealtime() < b0Var.f13235c) {
                    return;
                }
            }
            int remaining = this.T.remaining();
            if (this.f13260d0) {
                if (j3 != -9223372036854775807L) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e2.d.g(z10);
                if (j3 == Long.MIN_VALUE) {
                    j3 = this.f13261e0;
                } else {
                    this.f13261e0 = j3;
                }
                AudioTrack audioTrack = this.f13286x;
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
                write = this.f13286x.write(this.T, remaining, 1);
            }
            this.f13263f0 = SystemClock.elapsedRealtime();
            if (write < 0) {
                if ((Build.VERSION.SDK_INT >= 24 && write == -6) || write == -32) {
                    if (m() <= 0) {
                        if (r(this.f13286x)) {
                            if (this.v.f13390c == 1) {
                                this.f13265g0 = true;
                            }
                        }
                    }
                    z12 = true;
                }
                p pVar = new p(write, this.v.f13388a, z12);
                o oVar2 = this.f13283t;
                if (oVar2 != null) {
                    oVar2.M(pVar);
                }
                if (pVar.f13348b && this.f13254a != null) {
                    b bVar = b.f13230c;
                    this.f13287y = bVar;
                    this.f13288z.a(bVar);
                    throw pVar;
                }
                b0Var.a(pVar);
                return;
            }
            b0Var.f13233a = null;
            b0Var.f13234b = -9223372036854775807L;
            b0Var.f13235c = -9223372036854775807L;
            if (r(this.f13286x)) {
                if (this.L > 0) {
                    this.f13266h0 = false;
                }
                if (this.X && (oVar = this.f13283t) != null && write < remaining && !this.f13266h0) {
                    oVar.p();
                }
            }
            int i10 = this.v.f13390c;
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
            this.f13266h0 = false;
            this.M = 0;
            this.D = new y(this.E, 0L, 0L);
            this.P = 0L;
            this.C = null;
            this.f13267i.clear();
            this.R = null;
            this.S = 0;
            this.T = null;
            this.V = false;
            this.U = false;
            this.W = false;
            this.G = null;
            this.H = 0;
            this.d.f13346o = 0L;
            c2.e eVar = this.v.f13393i;
            this.f13285w = eVar;
            eVar.a();
            AudioTrack audioTrack = this.h.f13363c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f13286x.pause();
            }
            if (r(this.f13286x)) {
                e0 e0Var = this.f13273l;
                e0Var.getClass();
                e0Var.a(this.f13286x);
            }
            l a2 = this.v.a();
            x xVar = this.f13284u;
            if (xVar != null) {
                this.v = xVar;
                this.f13284u = null;
            }
            t tVar = this.h;
            tVar.g();
            tVar.f13363c = null;
            tVar.e = null;
            if (Build.VERSION.SDK_INT >= 24 && (a0Var = this.A) != null) {
                a0Var.b();
                this.A = null;
            }
            AudioTrack audioTrack2 = this.f13286x;
            o oVar = this.f13283t;
            Handler handler = new Handler(Looper.myLooper());
            synchronized (f13251o0) {
                try {
                    if (f13252p0 == null) {
                        String str = e2.d0.f7887a;
                        f13252p0 = Executors.newSingleThreadScheduledExecutor(new e2.c0(0));
                    }
                    f13253q0++;
                    f13252p0.schedule(new i5(audioTrack2, oVar, handler, a2, 19), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f13286x = null;
        }
        b0 b0Var = this.f13276n;
        b0Var.f13233a = null;
        b0Var.f13234b = -9223372036854775807L;
        b0Var.f13235c = -9223372036854775807L;
        b0 b0Var2 = this.f13275m;
        b0Var2.f13233a = null;
        b0Var2.f13234b = -9223372036854775807L;
        b0Var2.f13235c = -9223372036854775807L;
        this.f13270j0 = 0L;
        this.f13272k0 = 0L;
        Handler handler2 = this.f13274l0;
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
            return e0.b.c(this.f13286x, this.v);
        }
        x xVar = this.v;
        if (xVar.f13390c == 0) {
            j3 = xVar.e * xVar.d;
        } else {
            int i10 = c3.b.i(xVar.f13392g);
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
                arrayDeque = this.f13267i;
                if (arrayDeque.isEmpty() || min < ((y) arrayDeque.getFirst()).f13399c) {
                    break;
                }
                this.D = (y) arrayDeque.remove();
            }
            y yVar = this.D;
            long j10 = min - yVar.f13399c;
            long z10 = e2.d0.z(j10, yVar.f13397a.f3335a);
            boolean isEmpty = arrayDeque.isEmpty();
            aa.a aVar = this.f13256b;
            if (isEmpty) {
                c2.k kVar = (c2.k) aVar.d;
                if (kVar.isActive()) {
                    if (kVar.f3705o >= 1024) {
                        long j11 = kVar.f3704n;
                        kVar.f3700j.getClass();
                        long j12 = j11 - ((jVar.f3683k * jVar.f3677b) * 2);
                        int i10 = kVar.h.f3668a;
                        int i11 = kVar.f3698g.f3668a;
                        if (i10 == i11) {
                            j10 = e2.d0.Y(j10, j12, kVar.f3705o, RoundingMode.DOWN);
                        } else {
                            j10 = e2.d0.Y(j10, j12 * i10, kVar.f3705o * i11, RoundingMode.DOWN);
                        }
                    } else {
                        j10 = (long) (kVar.f3696c * j10);
                    }
                }
                y yVar2 = this.D;
                j3 = yVar2.f13398b + j10;
                yVar2.d = j10 - z10;
            } else {
                y yVar3 = this.D;
                j3 = yVar3.f13398b + z10 + yVar3.d;
            }
            long j13 = ((k0) aVar.f357c).f13325q;
            long W = e2.d0.W(this.v.e, j13) + j3;
            long j14 = this.f13270j0;
            if (j13 > j14) {
                long W2 = e2.d0.W(this.v.e, j13 - j14);
                this.f13270j0 = j13;
                this.f13272k0 += W2;
                if (this.f13274l0 == null) {
                    this.f13274l0 = new Handler(Looper.myLooper());
                }
                this.f13274l0.removeCallbacksAndMessages(null);
                this.f13274l0.postDelayed(new i2.g0(this, 8), 100L);
            }
            return W;
        }
        return Long.MIN_VALUE;
    }

    public final f j(b2.s sVar) {
        boolean booleanValue;
        boolean z10;
        if (this.f13265g0) {
            return f.d;
        }
        b2.e eVar = this.B;
        of.b bVar = this.f13279p;
        bVar.getClass();
        sVar.getClass();
        int i10 = sVar.K;
        eVar.getClass();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29 && i10 != -1) {
            Context context = (Context) bVar.f15697b;
            Boolean bool = (Boolean) bVar.f15698c;
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
                    bVar.f15698c = Boolean.valueOf(z10);
                } else {
                    bVar.f15698c = Boolean.FALSE;
                }
                booleanValue = ((Boolean) bVar.f15698c).booleanValue();
            }
            String str = sVar.f3308r;
            str.getClass();
            int c10 = r0.c(str, sVar.f3301k);
            if (c10 != 0 && i11 >= e2.d0.q(c10)) {
                int s10 = e2.d0.s(sVar.J);
                if (s10 == 0) {
                    return f.d;
                }
                try {
                    AudioFormat r10 = e2.d0.r(i10, s10, c10);
                    if (i11 >= 31) {
                        return e0.h0.a(r10, (AudioAttributes) eVar.b().f3343a, booleanValue);
                    }
                    return b2.c.f(r10, (AudioAttributes) eVar.b().f3343a, booleanValue);
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
        String str = sVar.f3308r;
        int i10 = sVar.L;
        if ("audio/raw".equals(str)) {
            if (!e2.d0.K(i10)) {
                e2.m(i10, "Invalid PCM encoding: ", "DefaultAudioSink");
                return 0;
            } else if (i10 != 2) {
                return 1;
            }
        } else if (this.f13287y.d(this.B, sVar) == null) {
            return 0;
        }
        return 2;
    }

    public final long l() {
        x xVar = this.v;
        if (xVar.f13390c == 0) {
            return this.I / xVar.f13389b;
        }
        return this.J;
    }

    public final long m() {
        x xVar = this.v;
        if (xVar.f13390c == 0) {
            long j3 = this.K;
            long j10 = xVar.d;
            String str = e2.d0.f7887a;
            return ((j3 + j10) - 1) / j10;
        }
        return this.L;
    }

    public final boolean n(long r27, int r29, java.nio.ByteBuffer r30) {
        throw new UnsupportedOperationException("Method not decompiled: k2.f0.n(long, int, java.nio.ByteBuffer):boolean");
    }

    public final boolean o() {
        if (q()) {
            if ((Build.VERSION.SDK_INT < 29 || !this.f13286x.isOffloadedPlayback() || !this.W) && this.h.e(m())) {
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
        if (this.f13286x != null) {
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
        if (this.f13288z != null && this.f13268i0 != myLooper) {
            z10 = false;
        } else {
            z10 = true;
        }
        StringBuilder sb2 = new StringBuilder("DefaultAudioSink accessed on multiple threads: ");
        Looper looper = this.f13268i0;
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
        if (this.f13288z == null && (context = this.f13254a) != null) {
            this.f13268i0 = myLooper;
            g7 g7Var = new g7(context, new v(this, 0), this.B, this.f13259c0);
            this.f13288z = g7Var;
            Handler handler = (Handler) g7Var.d;
            Context context2 = (Context) g7Var.f4692b;
            if (g7Var.f4691a) {
                bVar = (b) g7Var.h;
                bVar.getClass();
            } else {
                g7Var.f4691a = true;
                d dVar = (d) g7Var.f4695g;
                if (dVar != null) {
                    dVar.f13239a.registerContentObserver(dVar.f13240b, false, dVar);
                }
                if (Build.VERSION.SDK_INT >= 23 && (cVar = (c) g7Var.e) != null) {
                    e0.b.u(context2, cVar, handler);
                }
                b b10 = b.b(context2, context2.registerReceiver((androidx.mediarouter.app.g) g7Var.f4694f, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), (b2.e) g7Var.f4697j, (e) g7Var.f4696i);
                g7Var.h = b10;
                bVar = b10;
            }
            this.f13287y = bVar;
        }
        this.f13287y.getClass();
    }

    public final void t() {
        this.X = false;
        if (q()) {
            t tVar = this.h;
            tVar.g();
            if (tVar.f13382z == -9223372036854775807L) {
                s sVar = tVar.e;
                sVar.getClass();
                sVar.a(0);
            }
            tVar.B = tVar.b();
            if (!this.V || r(this.f13286x)) {
                this.f13286x.pause();
            }
        }
    }

    public final void u() {
        this.X = true;
        if (q()) {
            t tVar = this.h;
            if (tVar.f13382z != -9223372036854775807L) {
                tVar.I.getClass();
                tVar.f13382z = e2.d0.Q(SystemClock.elapsedRealtime());
            }
            tVar.f13368k = e2.d0.W(tVar.f13364f, tVar.b());
            s sVar = tVar.e;
            sVar.getClass();
            sVar.a(0);
            if (!this.V || r(this.f13286x)) {
                this.f13286x.play();
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
            tVar.f13382z = e2.d0.Q(SystemClock.elapsedRealtime());
            tVar.C = m10;
            if (r(this.f13286x)) {
                this.W = false;
            }
            this.f13286x.stop();
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
        e9.g0 listIterator = this.f13264g.listIterator(0);
        while (listIterator.hasNext()) {
            ((c2.h) listIterator.next()).reset();
        }
        this.e.reset();
        this.f13262f.reset();
        c2.e eVar = this.f13285w;
        if (eVar != null) {
            e9.i0 i0Var = eVar.f3665a;
            for (int i10 = 0; i10 < i0Var.size(); i10++) {
                c2.h hVar = (c2.h) i0Var.get(i10);
                hVar.flush();
                hVar.reset();
            }
            eVar.f3667c = new ByteBuffer[0];
            c2.f fVar = c2.f.e;
            eVar.d = false;
        }
        this.X = false;
        this.f13265g0 = false;
    }

    public final void z(b2.e eVar) {
        if (!this.B.equals(eVar)) {
            this.B = eVar;
            if (this.f13260d0) {
                return;
            }
            g7 g7Var = this.f13288z;
            if (g7Var != null) {
                g7Var.f4697j = eVar;
                g7Var.a(b.c((Context) g7Var.f4692b, eVar, (e) g7Var.f4696i));
            }
            g();
        }
    }
}
