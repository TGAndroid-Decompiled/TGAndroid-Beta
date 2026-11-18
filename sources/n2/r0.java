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
    public static final AtomicInteger f21213c0 = new AtomicInteger();
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
    public final Context f21214a;
    public long f21215a0;
    public final h6.m f21216b;
    public Handler f21217b0;
    public final k0 f21218c;
    public final a1 d;
    public final f2.t f21219e;
    public final z0 f21220f;
    public final t1 f21221g;
    public final ArrayDeque h;
    public int f21222i;
    public n0 f21223j;
    public final q0 f21224k;
    public final q0 f21225l;
    public m2.i f21226m;
    public v f21227n;
    public o0 f21228o;
    public o0 f21229p;
    public f2.j f21230q;
    public o f21231r;
    public m0 f21232s;
    public g0 f21233t;
    public e2.e f21234u;
    public p0 v;
    public p0 f21235w;
    public e2.w0 f21236x;
    public boolean f21237y;
    public long f21238z;

    public r0(y3 y3Var) {
        Context applicationContext;
        int deviceId;
        Context context = (Context) y3Var.f12774b;
        if (context == null) {
            applicationContext = null;
        } else {
            applicationContext = context.getApplicationContext();
        }
        this.f21214a = applicationContext;
        this.f21234u = e2.e.f10369i;
        this.f21216b = (h6.m) y3Var.d;
        this.f21222i = 0;
        this.f21231r = (i0) y3Var.f12777f;
        ?? oVar = new f2.o();
        this.f21218c = oVar;
        ?? oVar2 = new f2.o();
        oVar2.f21065m = h2.l0.f13787b;
        this.d = oVar2;
        this.f21219e = new f2.o();
        this.f21220f = new f2.o();
        this.f21221g = h9.i0.v(oVar2, oVar);
        this.H = 1.0f;
        this.Q = 0;
        this.S = new Object();
        e2.w0 w0Var = e2.w0.d;
        this.f21235w = new p0(w0Var, 0L, 0L);
        this.f21236x = w0Var;
        this.f21237y = false;
        this.h = new ArrayDeque();
        this.f21224k = new q0();
        this.f21225l = new q0();
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
        if (this.f21233t != null) {
            this.S.getClass();
        }
        this.S = fVar;
    }

    public final void B(java.nio.ByteBuffer r23) {
        throw new UnsupportedOperationException("Method not decompiled: n2.r0.B(java.nio.ByteBuffer):void");
    }

    public final void C(e2.w0 w0Var) {
        if (D()) {
            this.f21236x = w0Var;
            x();
            return;
        }
        e2.w0 w0Var2 = new e2.w0(h2.l0.h(w0Var.f10792a, 0.1f, 8.0f), h2.l0.h(w0Var.f10793b, 0.1f, 8.0f));
        this.f21236x = w0Var2;
        p0 p0Var = new p0(w0Var2, -9223372036854775807L, -9223372036854775807L);
        if (p()) {
            this.v = p0Var;
        } else {
            this.f21235w = p0Var;
        }
    }

    public final boolean D() {
        o0 o0Var = this.f21229p;
        if (o0Var != null && ((n) o0Var.f21196e).f21189j) {
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
        h6.m mVar = this.f21216b;
        if (!D) {
            if (!this.V && o0.a(this.f21229p)) {
                int i7 = ((e2.u) this.f21229p.f21195c).M;
                w0Var = this.f21236x;
                f2.s sVar = (f2.s) mVar.d;
                float f10 = w0Var.f10792a;
                sVar.getClass();
                if (f10 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                la.f(z10);
                if (sVar.f11085c != f10) {
                    sVar.f11085c = f10;
                    sVar.f11089i = true;
                }
                float f11 = w0Var.f10793b;
                if (f11 > 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                la.f(z11);
                if (sVar.d != f11) {
                    sVar.d = f11;
                    sVar.f11089i = true;
                }
            } else {
                w0Var = e2.w0.d;
            }
            this.f21236x = w0Var;
        } else {
            w0Var = e2.w0.d;
        }
        e2.w0 w0Var2 = w0Var;
        if (!this.V && o0.a(this.f21229p)) {
            int i10 = ((e2.u) this.f21229p.f21195c).M;
            z12 = this.f21237y;
            ((w0) mVar.f13940c).f21272o = z12;
        }
        this.f21237y = z12;
        this.h.add(new p0(w0Var2, Math.max(0L, j3), h2.l0.Y(((n) this.f21229p.f21196e).f21183b, l())));
        f2.j jVar = (f2.j) this.f21229p.f21197f;
        this.f21230q = jVar;
        jVar.a();
        v vVar = this.f21227n;
        if (vVar != null) {
            vVar.f(this.f21237y);
        }
    }

    public final g0 b(n nVar) {
        try {
            return ((i0) this.f21231r).a(nVar);
        } catch (l e10) {
            u uVar = new u(nVar.f21183b, nVar.f21184c, nVar.f21182a, nVar.f21186f, (e2.u) this.f21229p.f21195c, nVar.f21185e, e10);
            v vVar = this.f21227n;
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
        if (this.f21232s == null && this.f21214a != null) {
            m0 m0Var = new m0(this);
            this.f21232s = m0Var;
            i0 i0Var = (i0) this.f21231r;
            i0Var.f();
            if (i0Var.f21134f == null) {
                i0Var.f21134f = new h2.r(Thread.currentThread());
            }
            i0Var.f21134f.a(m0Var);
        }
        String str = uVar.f10769s;
        int i11 = uVar.K;
        int i12 = uVar.M;
        if ("audio/raw".equals(str)) {
            la.f(h2.l0.M(i12));
            int u10 = h2.l0.u(i12) * i11;
            ?? b0Var = new h9.b0(4);
            b0Var.d(this.f21221g);
            b0Var.c(this.f21219e);
            f2.n[] nVarArr = (f2.n[]) this.f21216b.f13939b;
            int length = nVarArr.length;
            h9.o.e(length, nVarArr);
            b0Var.e(length);
            System.arraycopy(nVarArr, 0, b0Var.f13974a, b0Var.f13975b, length);
            b0Var.f13975b += length;
            jVar = new f2.j(b0Var.f());
            if (jVar.equals(this.f21230q)) {
                jVar = this.f21230q;
            }
            int i13 = uVar.N;
            int i14 = uVar.O;
            a1 a1Var = this.d;
            a1Var.f21061i = i13;
            a1Var.f21062j = i14;
            this.f21218c.f21168i = iArr;
            f2.k kVar = new f2.k(uVar.L, i11, i12);
            try {
                h9.i0 i0Var2 = jVar.f11048a;
                if (!kVar.equals(f2.k.f11051e)) {
                    for (int i15 = 0; i15 < i0Var2.size(); i15++) {
                        f2.n nVar = (f2.n) i0Var2.get(i15);
                        f2.k e10 = nVar.e(kVar);
                        if (nVar.isActive()) {
                            la.p(!e10.equals(f2.k.f11051e));
                            kVar = e10;
                        }
                    }
                    int i16 = kVar.f11053b;
                    int i17 = kVar.f11054c;
                    e2.t a10 = uVar.a();
                    a10.L = i17;
                    a10.K = kVar.f11052a;
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
            jVar = new f2.j(t1.f14074e);
            uVar2 = uVar;
            i7 = -1;
            i10 = -1;
        }
        f2.j jVar2 = jVar;
        i i18 = i(uVar2);
        e2.u uVar3 = i18.f21124a;
        try {
            n c10 = ((i0) this.f21231r).c(i18);
            boolean z10 = c10.f21185e;
            if (c10.f21182a != 0) {
                if (c10.f21184c != 0) {
                    this.X = false;
                    o0 o0Var = new o0(uVar, uVar2, i7, i10, c10, jVar2);
                    if (p()) {
                        this.f21228o = o0Var;
                        return;
                    } else {
                        this.f21229p = o0Var;
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
            this.f21238z = 0L;
            this.A = 0L;
            this.B = 0L;
            this.C = 0L;
            this.Y = false;
            this.D = 0;
            this.f21235w = new p0(this.f21236x, 0L, 0L);
            this.G = 0L;
            this.v = null;
            this.h.clear();
            this.I = null;
            this.J = 0;
            this.K = null;
            this.M = false;
            this.L = false;
            this.N = false;
            this.d.f21067o = 0L;
            f2.j jVar = (f2.j) this.f21229p.f21197f;
            this.f21230q = jVar;
            jVar.a();
            this.f21223j = null;
            o0 o0Var = this.f21228o;
            if (o0Var != null) {
                this.f21229p = o0Var;
                this.f21228o = null;
            }
            f21213c0.incrementAndGet();
            g0 g0Var = this.f21233t;
            if (g0Var.f21107f.d.getPlayState() == 3) {
                g0Var.f21103a.pause();
            }
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 29 && g0Var.c()) {
                f0 f0Var = g0Var.f21109i;
                f0Var.getClass();
                f0.a(f0Var);
            }
            if (i7 >= 24 && (c0Var = g0Var.f21106e) != null) {
                c0.b(c0Var);
                g0Var.f21106e = null;
            }
            AudioTrack audioTrack = g0Var.f21103a;
            h2.r rVar = g0Var.f21110j;
            Handler q10 = h2.l0.q(null);
            synchronized (g0.f21101t) {
                try {
                    if (g0.f21102u == null) {
                        g0.f21102u = Executors.newSingleThreadScheduledExecutor(new ai.y0(1));
                    }
                    g0.v++;
                    g0.f21102u.schedule(new kg.i0(audioTrack, q10, rVar, 13), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f21233t = null;
        }
        q0 q0Var = this.f21225l;
        q0Var.f21209c = null;
        q0Var.f21207a = -9223372036854775807L;
        q0Var.f21208b = -9223372036854775807L;
        q0 q0Var2 = this.f21224k;
        q0Var2.f21209c = null;
        q0Var2.f21207a = -9223372036854775807L;
        q0Var2.f21208b = -9223372036854775807L;
        this.Z = 0L;
        this.f21215a0 = 0L;
        Handler handler = this.f21217b0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final long g() {
        boolean z10;
        if (!p()) {
            return -9223372036854775807L;
        }
        if (o0.a(this.f21229p)) {
            return h2.l0.Y(((n) this.f21229p.f21196e).f21183b, this.f21233t.f21103a.getBufferSizeInFrames());
        }
        long bufferSizeInFrames = this.f21233t.f21103a.getBufferSizeInFrames();
        int j3 = f3.b.j(((n) this.f21229p.f21196e).f21182a);
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
            long min = Math.min(this.f21233t.a(), h2.l0.Y(((n) this.f21229p.f21196e).f21183b, l()));
            while (true) {
                arrayDeque = this.h;
                if (arrayDeque.isEmpty() || min < ((p0) arrayDeque.getFirst()).f21203c) {
                    break;
                }
                this.f21235w = (p0) arrayDeque.remove();
            }
            p0 p0Var = this.f21235w;
            long j10 = min - p0Var.f21203c;
            long B = h2.l0.B(j10, p0Var.f21201a.f10792a);
            boolean isEmpty = arrayDeque.isEmpty();
            h6.m mVar = this.f21216b;
            if (isEmpty) {
                f2.s sVar = (f2.s) mVar.d;
                if (sVar.isActive()) {
                    if (sVar.f11094n >= 1024) {
                        long j11 = sVar.f11093m;
                        sVar.f11090j.getClass();
                        long o4 = j11 - (rVar.f11075i.o() * (rVar.f11076j * rVar.f11070b));
                        int i7 = sVar.h.f11052a;
                        int i10 = sVar.f11088g.f11052a;
                        if (i7 == i10) {
                            j10 = h2.l0.a0(j10, o4, sVar.f11094n, RoundingMode.DOWN);
                        } else {
                            j10 = h2.l0.a0(j10, o4 * i7, sVar.f11094n * i10, RoundingMode.DOWN);
                        }
                    } else {
                        j10 = (long) (sVar.f11085c * j10);
                    }
                }
                p0 p0Var2 = this.f21235w;
                j3 = p0Var2.f21202b + j10;
                p0Var2.d = j10 - B;
            } else {
                p0 p0Var3 = this.f21235w;
                j3 = p0Var3.f21202b + B + p0Var3.d;
            }
            long j12 = ((w0) mVar.f13940c).f21274q;
            long Y = h2.l0.Y(((n) this.f21229p.f21196e).f21183b, j12) + j3;
            long j13 = this.Z;
            if (j12 > j13) {
                long Y2 = h2.l0.Y(((n) this.f21229p.f21196e).f21183b, j12 - j13);
                this.Z = j12;
                this.f21215a0 += Y2;
                if (this.f21217b0 == null) {
                    this.f21217b0 = new Handler(Looper.myLooper());
                }
                this.f21217b0.removeCallbacksAndMessages(null);
                this.f21217b0.postDelayed(new kg.j0(this, 23), 100L);
            }
            return Y;
        }
        return Long.MIN_VALUE;
    }

    public final i i(e2.u uVar) {
        boolean z10;
        i iVar = new i(uVar);
        iVar.f21125b = this.f21234u;
        if (this.f21222i != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        iVar.d = z10;
        iVar.f21126c = this.T;
        iVar.f21127e = this.Q;
        iVar.f21129g = this.V;
        iVar.h = -1;
        iVar.f21128f = this.U;
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
        int i7 = ((i0) this.f21231r).b(i(uVar)).d;
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
        if (o0.a(this.f21229p)) {
            long j3 = this.B;
            long j10 = this.f21229p.f21194b;
            return ((j3 + j10) - 1) / j10;
        }
        return this.C;
    }

    public final boolean m(long r21, int r23, java.nio.ByteBuffer r24) {
        throw new UnsupportedOperationException("Method not decompiled: n2.r0.m(long, int, java.nio.ByteBuffer):boolean");
    }

    public final boolean n() {
        if (p()) {
            if (Build.VERSION.SDK_INT < 29 || !this.f21233t.c() || !this.N) {
                long l10 = l();
                long a10 = this.f21233t.a();
                g0 g0Var = this.f21233t;
                g0Var.getClass();
                if (l10 > h2.l0.a0(a10, g0Var.f21103a.getSampleRate(), 1000000L, RoundingMode.UP)) {
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
        q0 q0Var = this.f21224k;
        boolean z10 = false;
        if (((Exception) q0Var.f21209c) != null && (f21213c0.get() > 0 || SystemClock.elapsedRealtime() < q0Var.f21208b)) {
            return false;
        }
        try {
            b10 = b((n) this.f21229p.f21196e);
        } catch (u e10) {
            int i10 = ((n) this.f21229p.f21196e).f21186f;
            while (i10 > 1000000) {
                int i11 = i10 / 2;
                o0 o0Var = this.f21229p;
                int i12 = o0Var.f21194b;
                if (i12 == -1) {
                    i12 = 1;
                }
                int i13 = i11 % i12;
                if (i13 != 0) {
                    i7 = (i12 - i13) + i11;
                } else {
                    i7 = i11;
                }
                m a10 = ((n) o0Var.f21196e).a();
                a10.f21176f = i7;
                n nVar = new n(a10);
                try {
                    b10 = b(nVar);
                    o0 o0Var2 = this.f21229p;
                    this.f21229p = new o0((e2.u) o0Var2.f21195c, (e2.u) o0Var2.d, o0Var2.f21193a, o0Var2.f21194b, nVar, (f2.j) o0Var2.f21197f);
                } catch (u e11) {
                    e10.addSuppressed(e11);
                    i10 = i7;
                }
            }
            if (((n) this.f21229p.f21196e).f21185e) {
                this.X = true;
            }
            throw e10;
        }
        this.f21233t = b10;
        n0 n0Var = new n0(this, (n) this.f21229p.f21196e);
        this.f21223j = n0Var;
        b10.f21110j.a(n0Var);
        if (this.f21233t.c()) {
            o0 o0Var3 = this.f21229p;
            if (((n) o0Var3.f21196e).f21190k) {
                g0 g0Var = this.f21233t;
                e2.u uVar = (e2.u) o0Var3.f21195c;
                g0Var.d(uVar.N, uVar.O);
            }
        }
        m2.i iVar = this.f21226m;
        if (iVar != null) {
            this.f21233t.f(iVar);
        }
        if (p()) {
            this.f21233t.f21103a.setVolume(this.H);
        }
        this.S.getClass();
        AudioDeviceInfo audioDeviceInfo = this.T;
        if (audioDeviceInfo != null) {
            this.f21233t.f21103a.setPreferredDevice(audioDeviceInfo);
        }
        this.F = true;
        int audioSessionId = this.f21233t.f21103a.getAudioSessionId();
        if (audioSessionId != this.Q) {
            z10 = true;
        }
        this.Q = audioSessionId;
        v vVar = this.f21227n;
        if (vVar != 0) {
            int i14 = ((n) this.f21229p.f21196e).f21182a;
            vVar.b0(new Object());
            if (z10) {
                this.R = true;
                o0 o0Var4 = this.f21229p;
                m a11 = ((n) o0Var4.f21196e).a();
                a11.h = this.Q;
                this.f21229p = new o0((e2.u) o0Var4.f21195c, (e2.u) o0Var4.d, o0Var4.f21193a, o0Var4.f21194b, new n(a11), (f2.j) o0Var4.f21197f);
                o0 o0Var5 = this.f21228o;
                if (o0Var5 != null) {
                    m a12 = ((n) o0Var5.f21196e).a();
                    a12.h = this.Q;
                    this.f21228o = new o0((e2.u) o0Var5.f21195c, (e2.u) o0Var5.d, o0Var5.f21193a, o0Var5.f21194b, new n(a12), (f2.j) o0Var5.f21197f);
                }
                this.f21227n.d(this.Q);
            }
        }
        return true;
    }

    public final boolean p() {
        if (this.f21233t != null) {
            return true;
        }
        return false;
    }

    public final void q() {
        this.O = false;
        if (p()) {
            g0 g0Var = this.f21233t;
            j0 j0Var = g0Var.f21107f;
            j0Var.f21150k = 0L;
            j0Var.f21159t = 0;
            j0Var.f21158s = 0;
            j0Var.f21151l = 0L;
            j0Var.f21163y = -9223372036854775807L;
            j0Var.f21164z = -9223372036854775807L;
            if (j0Var.f21160u == -9223372036854775807L) {
                j0Var.h.a(0);
            }
            j0Var.f21161w = j0Var.a();
            if (!g0Var.f21111k || g0Var.c()) {
                g0Var.f21103a.pause();
            }
        }
    }

    public final void r() {
        this.O = true;
        if (p()) {
            g0 g0Var = this.f21233t;
            j0 j0Var = g0Var.f21107f;
            if (j0Var.f21160u != -9223372036854775807L) {
                j0Var.f21143b.getClass();
                j0Var.f21160u = h2.l0.S(SystemClock.elapsedRealtime());
            }
            j0Var.f21149j = h2.l0.Y(j0Var.f21145e, j0Var.a());
            j0Var.h.a(0);
            if (!g0Var.f21111k || g0Var.c()) {
                g0Var.f21103a.play();
            }
        }
    }

    public final void s() {
        if (!this.M) {
            this.M = true;
            if (this.f21233t.c()) {
                this.N = false;
            }
            g0 g0Var = this.f21233t;
            if (!g0Var.f21111k) {
                g0Var.f21111k = true;
                j0 j0Var = g0Var.f21107f;
                long b10 = g0Var.b();
                j0Var.f21161w = j0Var.a();
                j0Var.f21143b.getClass();
                j0Var.f21160u = h2.l0.S(SystemClock.elapsedRealtime());
                j0Var.f21162x = b10;
                g0Var.f21103a.stop();
                g0Var.f21116p = 0;
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
        if (this.f21229p != null) {
            o0 o0Var = this.f21228o;
            if (o0Var != null) {
                this.f21229p = o0Var;
                this.f21228o = null;
            }
            try {
                n c10 = ((i0) this.f21231r).c(i((e2.u) this.f21229p.d));
                o0 o0Var2 = this.f21229p;
                this.f21229p = new o0((e2.u) o0Var2.f21195c, (e2.u) o0Var2.d, o0Var2.f21193a, o0Var2.f21194b, c10, (f2.j) o0Var2.f21197f);
            } catch (h e10) {
                throw new IllegalStateException(new t(e10, (e2.u) this.f21229p.f21195c));
            }
        }
        f();
    }

    public final void w() {
        f();
        h9.g0 listIterator = this.f21221g.listIterator(0);
        while (listIterator.hasNext()) {
            ((f2.n) listIterator.next()).reset();
        }
        this.f21219e.reset();
        this.f21220f.reset();
        f2.j jVar = this.f21230q;
        if (jVar != null) {
            h9.i0 i0Var = jVar.f11048a;
            for (int i7 = 0; i7 < i0Var.size(); i7++) {
                f2.n nVar = (f2.n) i0Var.get(i7);
                nVar.d(f2.l.f11055b);
                nVar.reset();
            }
            jVar.f11049b.clear();
            jVar.f11050c = new ByteBuffer[0];
            f2.k kVar = f2.k.f11051e;
            jVar.d = false;
        }
        this.O = false;
        this.X = false;
    }

    public final void x() {
        if (p()) {
            g0 g0Var = this.f21233t;
            e2.w0 w0Var = this.f21236x;
            AudioTrack audioTrack = g0Var.f21103a;
            try {
                audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(h2.l0.h(w0Var.f10792a, 0.1f, g0Var.f21105c)).setPitch(h2.l0.h(w0Var.f10793b, 0.1f, 8.0f)).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                h2.a.m("AudioTrackAudioOutput", "Failed to set playback params", e10);
            }
            j0 j0Var = g0Var.f21107f;
            j0Var.f21148i = audioTrack.getPlaybackParams().getSpeed();
            j0Var.h.a(0);
            j0Var.f21150k = 0L;
            j0Var.f21159t = 0;
            j0Var.f21158s = 0;
            j0Var.f21151l = 0L;
            j0Var.f21163y = -9223372036854775807L;
            j0Var.f21164z = -9223372036854775807L;
            PlaybackParams playbackParams = this.f21233t.f21103a.getPlaybackParams();
            this.f21236x = new e2.w0(playbackParams.getSpeed(), playbackParams.getPitch());
        }
    }

    public final void y(o oVar) {
        if (oVar.equals(this.f21231r)) {
            return;
        }
        ((i0) this.f21231r).d();
        this.f21231r = oVar;
        m0 m0Var = this.f21232s;
        if (m0Var != null) {
            i0 i0Var = (i0) oVar;
            i0Var.f();
            if (i0Var.f21134f == null) {
                i0Var.f21134f = new h2.r(Thread.currentThread());
            }
            i0Var.f21134f.a(m0Var);
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
