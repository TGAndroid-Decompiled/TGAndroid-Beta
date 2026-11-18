package n2;

import a8.la;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import fi.y3;
import h9.t1;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
public final class r0 implements x {
    public static final AtomicInteger f21210c0 = new AtomicInteger();
    public long A;
    public long B;
    public long C;
    public int D;
    public boolean E;
    public boolean F;
    public long G;
    public float H;
    public ByteBuffer I;
    public int J;
    public ByteBuffer K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public boolean R;
    public e2.f S;
    public AudioDeviceInfo T;
    public int U;
    public boolean V;
    public long W;
    public boolean X;
    public boolean Y;
    public long Z;
    public final Context f21211a;
    public long f21212a0;
    public final h6.m f21213b;
    public Handler f21214b0;
    public final k0 f21215c;
    public final a1 d;
    public final f2.t f21216e;
    public final z0 f21217f;
    public final t1 f21218g;
    public final ArrayDeque h;
    public int f21219i;
    public n0 f21220j;
    public final q0 f21221k;
    public final q0 f21222l;
    public m2.i f21223m;
    public v f21224n;
    public o0 f21225o;
    public o0 f21226p;
    public f2.j f21227q;
    public o f21228r;
    public m0 f21229s;
    public g0 f21230t;
    public e2.e f21231u;
    public p0 v;
    public p0 f21232w;
    public e2.w0 f21233x;
    public boolean f21234y;
    public long f21235z;

    public r0(y3 y3Var) {
        Context applicationContext;
        int deviceId;
        Context context = (Context) y3Var.f12771b;
        if (context == null) {
            applicationContext = null;
        } else {
            applicationContext = context.getApplicationContext();
        }
        this.f21211a = applicationContext;
        this.f21231u = e2.e.f10366i;
        this.f21213b = (h6.m) y3Var.d;
        this.f21219i = 0;
        this.f21228r = (i0) y3Var.f12774f;
        ?? oVar = new f2.o();
        this.f21215c = oVar;
        ?? oVar2 = new f2.o();
        oVar2.f21062m = h2.l0.f13784b;
        this.d = oVar2;
        this.f21216e = new f2.o();
        this.f21217f = new f2.o();
        this.f21218g = h9.i0.v(oVar2, oVar);
        this.H = 1.0f;
        this.Q = 0;
        this.S = new Object();
        e2.w0 w0Var = e2.w0.d;
        this.f21232w = new p0(w0Var, 0L, 0L);
        this.f21233x = w0Var;
        this.f21234y = false;
        this.h = new ArrayDeque();
        this.f21221k = new q0();
        this.f21222l = new q0();
        int i7 = -1;
        if (Build.VERSION.SDK_INT >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i7 = deviceId;
        }
        this.U = i7;
    }

    public static int k(int r10, java.nio.ByteBuffer r11) {
        throw new UnsupportedOperationException("Method not decompiled: n2.r0.k(int, java.nio.ByteBuffer):int");
    }

    public final void A(e2.f fVar) {
        if (this.S.equals(fVar)) {
            return;
        }
        fVar.getClass();
        if (this.f21230t != null) {
            this.S.getClass();
        }
        this.S = fVar;
    }

    public final void B(java.nio.ByteBuffer r23) {
        throw new UnsupportedOperationException("Method not decompiled: n2.r0.B(java.nio.ByteBuffer):void");
    }

    public final void C(e2.w0 w0Var) {
        if (D()) {
            this.f21233x = w0Var;
            x();
            return;
        }
        e2.w0 w0Var2 = new e2.w0(h2.l0.h(w0Var.f10789a, 0.1f, 8.0f), h2.l0.h(w0Var.f10790b, 0.1f, 8.0f));
        this.f21233x = w0Var2;
        p0 p0Var = new p0(w0Var2, -9223372036854775807L, -9223372036854775807L);
        if (p()) {
            this.v = p0Var;
        } else {
            this.f21232w = p0Var;
        }
    }

    public final boolean D() {
        o0 o0Var = this.f21226p;
        if (o0Var != null && ((n) o0Var.f21193e).f21186j) {
            return true;
        }
        return false;
    }

    public final void a(long j3) {
        e2.w0 w0Var;
        boolean z10;
        boolean z11;
        boolean D = D();
        boolean z12 = false;
        h6.m mVar = this.f21213b;
        if (!D) {
            if (!this.V && o0.a(this.f21226p)) {
                int i7 = ((e2.u) this.f21226p.f21192c).M;
                w0Var = this.f21233x;
                f2.s sVar = (f2.s) mVar.d;
                float f10 = w0Var.f10789a;
                sVar.getClass();
                if (f10 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                la.f(z10);
                if (sVar.f11082c != f10) {
                    sVar.f11082c = f10;
                    sVar.f11086i = true;
                }
                float f11 = w0Var.f10790b;
                if (f11 > 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                la.f(z11);
                if (sVar.d != f11) {
                    sVar.d = f11;
                    sVar.f11086i = true;
                }
            } else {
                w0Var = e2.w0.d;
            }
            this.f21233x = w0Var;
        } else {
            w0Var = e2.w0.d;
        }
        e2.w0 w0Var2 = w0Var;
        if (!this.V && o0.a(this.f21226p)) {
            int i10 = ((e2.u) this.f21226p.f21192c).M;
            z12 = this.f21234y;
            ((w0) mVar.f13937c).f21269o = z12;
        }
        this.f21234y = z12;
        this.h.add(new p0(w0Var2, Math.max(0L, j3), h2.l0.Y(((n) this.f21226p.f21193e).f21180b, l())));
        f2.j jVar = (f2.j) this.f21226p.f21194f;
        this.f21227q = jVar;
        jVar.a();
        v vVar = this.f21224n;
        if (vVar != null) {
            vVar.f(this.f21234y);
        }
    }

    public final g0 b(n nVar) {
        try {
            return ((i0) this.f21228r).a(nVar);
        } catch (l e10) {
            u uVar = new u(nVar.f21180b, nVar.f21181c, nVar.f21179a, nVar.f21183f, (e2.u) this.f21226p.f21192c, nVar.f21182e, e10);
            v vVar = this.f21224n;
            if (vVar != null) {
                vVar.Y0(uVar);
            }
            throw uVar;
        }
    }

    public final void c(e2.u uVar, int[] iArr) {
        f2.j jVar;
        e2.u uVar2;
        int i7;
        int i10;
        if (this.f21229s == null && this.f21211a != null) {
            m0 m0Var = new m0(this);
            this.f21229s = m0Var;
            i0 i0Var = (i0) this.f21228r;
            i0Var.f();
            if (i0Var.f21131f == null) {
                i0Var.f21131f = new h2.r(Thread.currentThread());
            }
            i0Var.f21131f.a(m0Var);
        }
        String str = uVar.f10766s;
        int i11 = uVar.K;
        int i12 = uVar.M;
        if ("audio/raw".equals(str)) {
            la.f(h2.l0.M(i12));
            int u10 = h2.l0.u(i12) * i11;
            ?? b0Var = new h9.b0(4);
            b0Var.d(this.f21218g);
            b0Var.c(this.f21216e);
            f2.n[] nVarArr = (f2.n[]) this.f21213b.f13936b;
            int length = nVarArr.length;
            h9.o.e(length, nVarArr);
            b0Var.e(length);
            System.arraycopy(nVarArr, 0, b0Var.f13971a, b0Var.f13972b, length);
            b0Var.f13972b += length;
            jVar = new f2.j(b0Var.f());
            if (jVar.equals(this.f21227q)) {
                jVar = this.f21227q;
            }
            int i13 = uVar.N;
            int i14 = uVar.O;
            a1 a1Var = this.d;
            a1Var.f21058i = i13;
            a1Var.f21059j = i14;
            this.f21215c.f21165i = iArr;
            f2.k kVar = new f2.k(uVar.L, i11, i12);
            try {
                h9.i0 i0Var2 = jVar.f11045a;
                if (!kVar.equals(f2.k.f11048e)) {
                    for (int i15 = 0; i15 < i0Var2.size(); i15++) {
                        f2.n nVar = (f2.n) i0Var2.get(i15);
                        f2.k e10 = nVar.e(kVar);
                        if (nVar.isActive()) {
                            la.p(!e10.equals(f2.k.f11048e));
                            kVar = e10;
                        }
                    }
                    int i16 = kVar.f11050b;
                    int i17 = kVar.f11051c;
                    e2.t a10 = uVar.a();
                    a10.L = i17;
                    a10.K = kVar.f11049a;
                    a10.J = i16;
                    uVar2 = new e2.u(a10);
                    i7 = u10;
                    i10 = h2.l0.u(i17) * i16;
                } else {
                    throw new f2.m(kVar);
                }
            } catch (f2.m e11) {
                throw new t(e11, uVar);
            }
        } else {
            jVar = new f2.j(t1.f14071e);
            uVar2 = uVar;
            i7 = -1;
            i10 = -1;
        }
        f2.j jVar2 = jVar;
        i i18 = i(uVar2);
        e2.u uVar3 = i18.f21121a;
        try {
            n c10 = ((i0) this.f21228r).c(i18);
            boolean z10 = c10.f21182e;
            if (c10.f21179a != 0) {
                if (c10.f21181c != 0) {
                    this.X = false;
                    o0 o0Var = new o0(uVar, uVar2, i7, i10, c10, jVar2);
                    if (p()) {
                        this.f21225o = o0Var;
                        return;
                    } else {
                        this.f21226p = o0Var;
                        return;
                    }
                }
                throw new t("Invalid output channel config (isOffload=" + z10 + ")", uVar3);
            }
            throw new t("Invalid output encoding (isOffload=" + z10 + ")", uVar3);
        } catch (h e12) {
            throw new t(e12, uVar);
        }
    }

    public final void d(long r10) {
        throw new UnsupportedOperationException("Method not decompiled: n2.r0.d(long):void");
    }

    public final boolean e() {
        throw new UnsupportedOperationException("Method not decompiled: n2.r0.e():boolean");
    }

    public final void f() {
        c0 c0Var;
        if (p()) {
            this.f21235z = 0L;
            this.A = 0L;
            this.B = 0L;
            this.C = 0L;
            this.Y = false;
            this.D = 0;
            this.f21232w = new p0(this.f21233x, 0L, 0L);
            this.G = 0L;
            this.v = null;
            this.h.clear();
            this.I = null;
            this.J = 0;
            this.K = null;
            this.M = false;
            this.L = false;
            this.N = false;
            this.d.f21064o = 0L;
            f2.j jVar = (f2.j) this.f21226p.f21194f;
            this.f21227q = jVar;
            jVar.a();
            this.f21220j = null;
            o0 o0Var = this.f21225o;
            if (o0Var != null) {
                this.f21226p = o0Var;
                this.f21225o = null;
            }
            f21210c0.incrementAndGet();
            g0 g0Var = this.f21230t;
            if (g0Var.f21104f.d.getPlayState() == 3) {
                g0Var.f21100a.pause();
            }
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 29 && g0Var.c()) {
                f0 f0Var = g0Var.f21106i;
                f0Var.getClass();
                f0.a(f0Var);
            }
            if (i7 >= 24 && (c0Var = g0Var.f21103e) != null) {
                c0.b(c0Var);
                g0Var.f21103e = null;
            }
            AudioTrack audioTrack = g0Var.f21100a;
            h2.r rVar = g0Var.f21107j;
            Handler q10 = h2.l0.q(null);
            synchronized (g0.f21098t) {
                try {
                    if (g0.f21099u == null) {
                        g0.f21099u = Executors.newSingleThreadScheduledExecutor(new ai.y0(1));
                    }
                    g0.v++;
                    g0.f21099u.schedule(new kg.i0(audioTrack, q10, rVar, 13), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f21230t = null;
        }
        q0 q0Var = this.f21222l;
        q0Var.f21206c = null;
        q0Var.f21204a = -9223372036854775807L;
        q0Var.f21205b = -9223372036854775807L;
        q0 q0Var2 = this.f21221k;
        q0Var2.f21206c = null;
        q0Var2.f21204a = -9223372036854775807L;
        q0Var2.f21205b = -9223372036854775807L;
        this.Z = 0L;
        this.f21212a0 = 0L;
        Handler handler = this.f21214b0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final long g() {
        boolean z10;
        if (!p()) {
            return -9223372036854775807L;
        }
        if (o0.a(this.f21226p)) {
            return h2.l0.Y(((n) this.f21226p.f21193e).f21180b, this.f21230t.f21100a.getBufferSizeInFrames());
        }
        long bufferSizeInFrames = this.f21230t.f21100a.getBufferSizeInFrames();
        int j3 = f3.b.j(((n) this.f21226p.f21193e).f21179a);
        if (j3 != -2147483647) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.p(z10);
        return h2.l0.a0(bufferSizeInFrames, 1000000L, j3, RoundingMode.DOWN);
    }

    public final long h() {
        ArrayDeque arrayDeque;
        long j3;
        f2.r rVar;
        if (p() && !this.F) {
            long min = Math.min(this.f21230t.a(), h2.l0.Y(((n) this.f21226p.f21193e).f21180b, l()));
            while (true) {
                arrayDeque = this.h;
                if (arrayDeque.isEmpty() || min < ((p0) arrayDeque.getFirst()).f21200c) {
                    break;
                }
                this.f21232w = (p0) arrayDeque.remove();
            }
            p0 p0Var = this.f21232w;
            long j10 = min - p0Var.f21200c;
            long B = h2.l0.B(j10, p0Var.f21198a.f10789a);
            boolean isEmpty = arrayDeque.isEmpty();
            h6.m mVar = this.f21213b;
            if (isEmpty) {
                f2.s sVar = (f2.s) mVar.d;
                if (sVar.isActive()) {
                    if (sVar.f11091n >= 1024) {
                        long j11 = sVar.f11090m;
                        sVar.f11087j.getClass();
                        long o4 = j11 - (rVar.f11072i.o() * (rVar.f11073j * rVar.f11067b));
                        int i7 = sVar.h.f11049a;
                        int i10 = sVar.f11085g.f11049a;
                        if (i7 == i10) {
                            j10 = h2.l0.a0(j10, o4, sVar.f11091n, RoundingMode.DOWN);
                        } else {
                            j10 = h2.l0.a0(j10, o4 * i7, sVar.f11091n * i10, RoundingMode.DOWN);
                        }
                    } else {
                        j10 = (long) (sVar.f11082c * j10);
                    }
                }
                p0 p0Var2 = this.f21232w;
                j3 = p0Var2.f21199b + j10;
                p0Var2.d = j10 - B;
            } else {
                p0 p0Var3 = this.f21232w;
                j3 = p0Var3.f21199b + B + p0Var3.d;
            }
            long j12 = ((w0) mVar.f13937c).f21271q;
            long Y = h2.l0.Y(((n) this.f21226p.f21193e).f21180b, j12) + j3;
            long j13 = this.Z;
            if (j12 > j13) {
                long Y2 = h2.l0.Y(((n) this.f21226p.f21193e).f21180b, j12 - j13);
                this.Z = j12;
                this.f21212a0 += Y2;
                if (this.f21214b0 == null) {
                    this.f21214b0 = new Handler(Looper.myLooper());
                }
                this.f21214b0.removeCallbacksAndMessages(null);
                this.f21214b0.postDelayed(new kg.j0(this, 23), 100L);
            }
            return Y;
        }
        return Long.MIN_VALUE;
    }

    public final i i(e2.u uVar) {
        boolean z10;
        i iVar = new i(uVar);
        iVar.f21122b = this.f21231u;
        if (this.f21219i != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        iVar.d = z10;
        iVar.f21123c = this.T;
        iVar.f21124e = this.Q;
        iVar.f21126g = this.V;
        iVar.h = -1;
        iVar.f21125f = this.U;
        return new i(iVar);
    }

    public final int j(e2.u uVar) {
        boolean z10;
        if (h2.l0.M(uVar.M) && uVar.M != 2) {
            e2.t a10 = uVar.a();
            a10.L = 2;
            uVar = new e2.u(a10);
            z10 = true;
        } else {
            z10 = false;
        }
        int i7 = ((i0) this.f21228r).b(i(uVar)).d;
        if (i7 != 1) {
            if (i7 != 2) {
                return 0;
            }
            if (!z10) {
                return 2;
            }
        }
        return 1;
    }

    public final long l() {
        if (o0.a(this.f21226p)) {
            long j3 = this.B;
            long j10 = this.f21226p.f21191b;
            return ((j3 + j10) - 1) / j10;
        }
        return this.C;
    }

    public final boolean m(long r21, int r23, java.nio.ByteBuffer r24) {
        throw new UnsupportedOperationException("Method not decompiled: n2.r0.m(long, int, java.nio.ByteBuffer):boolean");
    }

    public final boolean n() {
        if (p()) {
            if (Build.VERSION.SDK_INT < 29 || !this.f21230t.c() || !this.N) {
                long l10 = l();
                long a10 = this.f21230t.a();
                g0 g0Var = this.f21230t;
                g0Var.getClass();
                if (l10 > h2.l0.a0(a10, g0Var.f21100a.getSampleRate(), 1000000L, RoundingMode.UP)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean o() {
        int i7;
        g0 b10;
        q0 q0Var = this.f21221k;
        boolean z10 = false;
        if (((Exception) q0Var.f21206c) != null && (f21210c0.get() > 0 || SystemClock.elapsedRealtime() < q0Var.f21205b)) {
            return false;
        }
        try {
            b10 = b((n) this.f21226p.f21193e);
        } catch (u e10) {
            int i10 = ((n) this.f21226p.f21193e).f21183f;
            while (i10 > 1000000) {
                int i11 = i10 / 2;
                o0 o0Var = this.f21226p;
                int i12 = o0Var.f21191b;
                if (i12 == -1) {
                    i12 = 1;
                }
                int i13 = i11 % i12;
                if (i13 != 0) {
                    i7 = (i12 - i13) + i11;
                } else {
                    i7 = i11;
                }
                m a10 = ((n) o0Var.f21193e).a();
                a10.f21173f = i7;
                n nVar = new n(a10);
                try {
                    b10 = b(nVar);
                    o0 o0Var2 = this.f21226p;
                    this.f21226p = new o0((e2.u) o0Var2.f21192c, (e2.u) o0Var2.d, o0Var2.f21190a, o0Var2.f21191b, nVar, (f2.j) o0Var2.f21194f);
                } catch (u e11) {
                    e10.addSuppressed(e11);
                    i10 = i7;
                }
            }
            if (((n) this.f21226p.f21193e).f21182e) {
                this.X = true;
            }
            throw e10;
        }
        this.f21230t = b10;
        n0 n0Var = new n0(this, (n) this.f21226p.f21193e);
        this.f21220j = n0Var;
        b10.f21107j.a(n0Var);
        if (this.f21230t.c()) {
            o0 o0Var3 = this.f21226p;
            if (((n) o0Var3.f21193e).f21187k) {
                g0 g0Var = this.f21230t;
                e2.u uVar = (e2.u) o0Var3.f21192c;
                g0Var.d(uVar.N, uVar.O);
            }
        }
        m2.i iVar = this.f21223m;
        if (iVar != null) {
            this.f21230t.f(iVar);
        }
        if (p()) {
            this.f21230t.f21100a.setVolume(this.H);
        }
        this.S.getClass();
        AudioDeviceInfo audioDeviceInfo = this.T;
        if (audioDeviceInfo != null) {
            this.f21230t.f21100a.setPreferredDevice(audioDeviceInfo);
        }
        this.F = true;
        int audioSessionId = this.f21230t.f21100a.getAudioSessionId();
        if (audioSessionId != this.Q) {
            z10 = true;
        }
        this.Q = audioSessionId;
        v vVar = this.f21224n;
        if (vVar != 0) {
            int i14 = ((n) this.f21226p.f21193e).f21179a;
            vVar.b0(new Object());
            if (z10) {
                this.R = true;
                o0 o0Var4 = this.f21226p;
                m a11 = ((n) o0Var4.f21193e).a();
                a11.h = this.Q;
                this.f21226p = new o0((e2.u) o0Var4.f21192c, (e2.u) o0Var4.d, o0Var4.f21190a, o0Var4.f21191b, new n(a11), (f2.j) o0Var4.f21194f);
                o0 o0Var5 = this.f21225o;
                if (o0Var5 != null) {
                    m a12 = ((n) o0Var5.f21193e).a();
                    a12.h = this.Q;
                    this.f21225o = new o0((e2.u) o0Var5.f21192c, (e2.u) o0Var5.d, o0Var5.f21190a, o0Var5.f21191b, new n(a12), (f2.j) o0Var5.f21194f);
                }
                this.f21224n.d(this.Q);
            }
        }
        return true;
    }

    public final boolean p() {
        if (this.f21230t != null) {
            return true;
        }
        return false;
    }

    public final void q() {
        this.O = false;
        if (p()) {
            g0 g0Var = this.f21230t;
            j0 j0Var = g0Var.f21104f;
            j0Var.f21147k = 0L;
            j0Var.f21156t = 0;
            j0Var.f21155s = 0;
            j0Var.f21148l = 0L;
            j0Var.f21160y = -9223372036854775807L;
            j0Var.f21161z = -9223372036854775807L;
            if (j0Var.f21157u == -9223372036854775807L) {
                j0Var.h.a(0);
            }
            j0Var.f21158w = j0Var.a();
            if (!g0Var.f21108k || g0Var.c()) {
                g0Var.f21100a.pause();
            }
        }
    }

    public final void r() {
        this.O = true;
        if (p()) {
            g0 g0Var = this.f21230t;
            j0 j0Var = g0Var.f21104f;
            if (j0Var.f21157u != -9223372036854775807L) {
                j0Var.f21140b.getClass();
                j0Var.f21157u = h2.l0.S(SystemClock.elapsedRealtime());
            }
            j0Var.f21146j = h2.l0.Y(j0Var.f21142e, j0Var.a());
            j0Var.h.a(0);
            if (!g0Var.f21108k || g0Var.c()) {
                g0Var.f21100a.play();
            }
        }
    }

    public final void s() {
        if (!this.M) {
            this.M = true;
            if (this.f21230t.c()) {
                this.N = false;
            }
            g0 g0Var = this.f21230t;
            if (!g0Var.f21108k) {
                g0Var.f21108k = true;
                j0 j0Var = g0Var.f21104f;
                long b10 = g0Var.b();
                j0Var.f21158w = j0Var.a();
                j0Var.f21140b.getClass();
                j0Var.f21157u = h2.l0.S(SystemClock.elapsedRealtime());
                j0Var.f21159x = b10;
                g0Var.f21100a.stop();
                g0Var.f21113p = 0;
            }
        }
    }

    public final void t() {
        if (!this.L && p() && e()) {
            s();
            this.L = true;
        }
    }

    public final void u(long r4) {
        throw new UnsupportedOperationException("Method not decompiled: n2.r0.u(long):void");
    }

    public final void v() {
        if (this.f21226p != null) {
            o0 o0Var = this.f21225o;
            if (o0Var != null) {
                this.f21226p = o0Var;
                this.f21225o = null;
            }
            try {
                n c10 = ((i0) this.f21228r).c(i((e2.u) this.f21226p.d));
                o0 o0Var2 = this.f21226p;
                this.f21226p = new o0((e2.u) o0Var2.f21192c, (e2.u) o0Var2.d, o0Var2.f21190a, o0Var2.f21191b, c10, (f2.j) o0Var2.f21194f);
            } catch (h e10) {
                throw new IllegalStateException(new t(e10, (e2.u) this.f21226p.f21192c));
            }
        }
        f();
    }

    public final void w() {
        f();
        h9.g0 listIterator = this.f21218g.listIterator(0);
        while (listIterator.hasNext()) {
            ((f2.n) listIterator.next()).reset();
        }
        this.f21216e.reset();
        this.f21217f.reset();
        f2.j jVar = this.f21227q;
        if (jVar != null) {
            h9.i0 i0Var = jVar.f11045a;
            for (int i7 = 0; i7 < i0Var.size(); i7++) {
                f2.n nVar = (f2.n) i0Var.get(i7);
                nVar.d(f2.l.f11052b);
                nVar.reset();
            }
            jVar.f11046b.clear();
            jVar.f11047c = new ByteBuffer[0];
            f2.k kVar = f2.k.f11048e;
            jVar.d = false;
        }
        this.O = false;
        this.X = false;
    }

    public final void x() {
        if (p()) {
            g0 g0Var = this.f21230t;
            e2.w0 w0Var = this.f21233x;
            AudioTrack audioTrack = g0Var.f21100a;
            try {
                audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(h2.l0.h(w0Var.f10789a, 0.1f, g0Var.f21102c)).setPitch(h2.l0.h(w0Var.f10790b, 0.1f, 8.0f)).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                h2.a.m("AudioTrackAudioOutput", "Failed to set playback params", e10);
            }
            j0 j0Var = g0Var.f21104f;
            j0Var.f21145i = audioTrack.getPlaybackParams().getSpeed();
            j0Var.h.a(0);
            j0Var.f21147k = 0L;
            j0Var.f21156t = 0;
            j0Var.f21155s = 0;
            j0Var.f21148l = 0L;
            j0Var.f21160y = -9223372036854775807L;
            j0Var.f21161z = -9223372036854775807L;
            PlaybackParams playbackParams = this.f21230t.f21100a.getPlaybackParams();
            this.f21233x = new e2.w0(playbackParams.getSpeed(), playbackParams.getPitch());
        }
    }

    public final void y(o oVar) {
        if (oVar.equals(this.f21228r)) {
            return;
        }
        ((i0) this.f21228r).d();
        this.f21228r = oVar;
        m0 m0Var = this.f21229s;
        if (m0Var != null) {
            i0 i0Var = (i0) oVar;
            i0Var.f();
            if (i0Var.f21131f == null) {
                i0Var.f21131f = new h2.r(Thread.currentThread());
            }
            i0Var.f21131f.a(m0Var);
        }
        v();
    }

    public final void z(int i7) {
        boolean z10 = false;
        if (this.R) {
            if (this.Q == i7) {
                this.R = false;
            } else {
                return;
            }
        }
        if (this.Q != i7) {
            this.Q = i7;
            if (i7 != 0) {
                z10 = true;
            }
            this.P = z10;
            v();
        }
    }
}
