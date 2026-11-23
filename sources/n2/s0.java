package n2;

import a8.ma;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import fi.y3;
import h9.s1;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
public final class s0 implements x {
    public static final AtomicInteger f21307c0 = new AtomicInteger();
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
    public final Context f21308a;
    public long f21309a0;
    public final h6.m f21310b;
    public Handler f21311b0;
    public final l0 f21312c;
    public final b1 d;
    public final f2.t f21313e;
    public final a1 f21314f;
    public final s1 f21315g;
    public final ArrayDeque h;
    public int f21316i;
    public o0 f21317j;
    public final r0 f21318k;
    public final r0 f21319l;
    public m2.i f21320m;
    public v f21321n;
    public p0 f21322o;
    public p0 f21323p;
    public f2.j f21324q;
    public o f21325r;
    public n0 f21326s;
    public h0 f21327t;
    public e2.e f21328u;
    public q0 v;
    public q0 f21329w;
    public e2.w0 f21330x;
    public boolean f21331y;
    public long f21332z;

    public s0(y3 y3Var) {
        Context applicationContext;
        int deviceId;
        Context context = (Context) y3Var.f12776b;
        if (context == null) {
            applicationContext = null;
        } else {
            applicationContext = context.getApplicationContext();
        }
        this.f21308a = applicationContext;
        this.f21328u = e2.e.f10359i;
        this.f21310b = (h6.m) y3Var.d;
        this.f21316i = 0;
        this.f21325r = (j0) y3Var.f12779f;
        ?? oVar = new f2.o();
        this.f21312c = oVar;
        ?? oVar2 = new f2.o();
        oVar2.f21163m = h2.l0.f13779b;
        this.d = oVar2;
        this.f21313e = new f2.o();
        this.f21314f = new f2.o();
        this.f21315g = h9.i0.v(oVar2, oVar);
        this.H = 1.0f;
        this.Q = 0;
        this.S = new Object();
        e2.w0 w0Var = e2.w0.d;
        this.f21329w = new q0(w0Var, 0L, 0L);
        this.f21330x = w0Var;
        this.f21331y = false;
        this.h = new ArrayDeque();
        this.f21318k = new r0();
        this.f21319l = new r0();
        int i7 = -1;
        if (Build.VERSION.SDK_INT >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i7 = deviceId;
        }
        this.U = i7;
    }

    public static int k(int r10, java.nio.ByteBuffer r11) {
        throw new UnsupportedOperationException("Method not decompiled: n2.s0.k(int, java.nio.ByteBuffer):int");
    }

    public final void A(e2.f fVar) {
        if (this.S.equals(fVar)) {
            return;
        }
        fVar.getClass();
        if (this.f21327t != null) {
            this.S.getClass();
        }
        this.S = fVar;
    }

    public final void B(java.nio.ByteBuffer r23) {
        throw new UnsupportedOperationException("Method not decompiled: n2.s0.B(java.nio.ByteBuffer):void");
    }

    public final void C(e2.w0 w0Var) {
        if (D()) {
            this.f21330x = w0Var;
            x();
            return;
        }
        e2.w0 w0Var2 = new e2.w0(h2.l0.h(w0Var.f10782a, 0.1f, 8.0f), h2.l0.h(w0Var.f10783b, 0.1f, 8.0f));
        this.f21330x = w0Var2;
        q0 q0Var = new q0(w0Var2, -9223372036854775807L, -9223372036854775807L);
        if (p()) {
            this.v = q0Var;
        } else {
            this.f21329w = q0Var;
        }
    }

    public final boolean D() {
        p0 p0Var = this.f21323p;
        if (p0Var != null && ((n) p0Var.f21293e).f21282j) {
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
        h6.m mVar = this.f21310b;
        if (!D) {
            if (!this.V && p0.a(this.f21323p)) {
                int i7 = ((e2.u) this.f21323p.f21292c).M;
                w0Var = this.f21330x;
                f2.s sVar = (f2.s) mVar.d;
                float f10 = w0Var.f10782a;
                sVar.getClass();
                if (f10 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ma.f(z10);
                if (sVar.f11075c != f10) {
                    sVar.f11075c = f10;
                    sVar.f11079i = true;
                }
                float f11 = w0Var.f10783b;
                if (f11 > 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ma.f(z11);
                if (sVar.d != f11) {
                    sVar.d = f11;
                    sVar.f11079i = true;
                }
            } else {
                w0Var = e2.w0.d;
            }
            this.f21330x = w0Var;
        } else {
            w0Var = e2.w0.d;
        }
        e2.w0 w0Var2 = w0Var;
        if (!this.V && p0.a(this.f21323p)) {
            int i10 = ((e2.u) this.f21323p.f21292c).M;
            z12 = this.f21331y;
            ((x0) mVar.f13932c).f21366o = z12;
        }
        this.f21331y = z12;
        this.h.add(new q0(w0Var2, Math.max(0L, j3), h2.l0.Y(((n) this.f21323p.f21293e).f21276b, l())));
        f2.j jVar = (f2.j) this.f21323p.f21294f;
        this.f21324q = jVar;
        jVar.a();
        v vVar = this.f21321n;
        if (vVar != null) {
            vVar.c(this.f21331y);
        }
    }

    public final h0 b(n nVar) {
        try {
            return ((j0) this.f21325r).a(nVar);
        } catch (l e10) {
            u uVar = new u(nVar.f21276b, nVar.f21277c, nVar.f21275a, nVar.f21279f, (e2.u) this.f21323p.f21292c, nVar.f21278e, e10);
            v vVar = this.f21321n;
            if (vVar != null) {
                vVar.Q(uVar);
            }
            throw uVar;
        }
    }

    public final void c(e2.u uVar, int[] iArr) {
        f2.j jVar;
        e2.u uVar2;
        int i7;
        int i10;
        if (this.f21326s == null && this.f21308a != null) {
            n0 n0Var = new n0(this);
            this.f21326s = n0Var;
            j0 j0Var = (j0) this.f21325r;
            j0Var.f();
            if (j0Var.f21231f == null) {
                j0Var.f21231f = new h2.r(Thread.currentThread());
            }
            j0Var.f21231f.a(n0Var);
        }
        String str = uVar.f10759s;
        int i11 = uVar.K;
        int i12 = uVar.M;
        if ("audio/raw".equals(str)) {
            ma.f(h2.l0.M(i12));
            int u10 = h2.l0.u(i12) * i11;
            ?? b0Var = new h9.b0(4);
            b0Var.d(this.f21315g);
            b0Var.c(this.f21313e);
            f2.n[] nVarArr = (f2.n[]) this.f21310b.f13931b;
            int length = nVarArr.length;
            h9.o.e(length, nVarArr);
            b0Var.e(length);
            System.arraycopy(nVarArr, 0, b0Var.f13964a, b0Var.f13965b, length);
            b0Var.f13965b += length;
            jVar = new f2.j(b0Var.f());
            if (jVar.equals(this.f21324q)) {
                jVar = this.f21324q;
            }
            int i13 = uVar.N;
            int i14 = uVar.O;
            b1 b1Var = this.d;
            b1Var.f21159i = i13;
            b1Var.f21160j = i14;
            this.f21312c.f21262i = iArr;
            f2.k kVar = new f2.k(uVar.L, i11, i12);
            try {
                h9.i0 i0Var = jVar.f11038a;
                if (!kVar.equals(f2.k.f11041e)) {
                    for (int i15 = 0; i15 < i0Var.size(); i15++) {
                        f2.n nVar = (f2.n) i0Var.get(i15);
                        f2.k e10 = nVar.e(kVar);
                        if (nVar.isActive()) {
                            ma.p(!e10.equals(f2.k.f11041e));
                            kVar = e10;
                        }
                    }
                    int i16 = kVar.f11043b;
                    int i17 = kVar.f11044c;
                    e2.t a10 = uVar.a();
                    a10.L = i17;
                    a10.K = kVar.f11042a;
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
            jVar = new f2.j(s1.f14058e);
            uVar2 = uVar;
            i7 = -1;
            i10 = -1;
        }
        f2.j jVar2 = jVar;
        i i18 = i(uVar2);
        e2.u uVar3 = i18.f21214a;
        try {
            n c10 = ((j0) this.f21325r).c(i18);
            boolean z10 = c10.f21278e;
            if (c10.f21275a != 0) {
                if (c10.f21277c != 0) {
                    this.X = false;
                    p0 p0Var = new p0(uVar, uVar2, i7, i10, c10, jVar2);
                    if (p()) {
                        this.f21322o = p0Var;
                        return;
                    } else {
                        this.f21323p = p0Var;
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
        throw new UnsupportedOperationException("Method not decompiled: n2.s0.d(long):void");
    }

    public final boolean e() {
        throw new UnsupportedOperationException("Method not decompiled: n2.s0.e():boolean");
    }

    public final void f() {
        d0 d0Var;
        if (p()) {
            this.f21332z = 0L;
            this.A = 0L;
            this.B = 0L;
            this.C = 0L;
            this.Y = false;
            this.D = 0;
            this.f21329w = new q0(this.f21330x, 0L, 0L);
            this.G = 0L;
            this.v = null;
            this.h.clear();
            this.I = null;
            this.J = 0;
            this.K = null;
            this.M = false;
            this.L = false;
            this.N = false;
            this.d.f21165o = 0L;
            f2.j jVar = (f2.j) this.f21323p.f21294f;
            this.f21324q = jVar;
            jVar.a();
            this.f21317j = null;
            p0 p0Var = this.f21322o;
            if (p0Var != null) {
                this.f21323p = p0Var;
                this.f21322o = null;
            }
            f21307c0.incrementAndGet();
            h0 h0Var = this.f21327t;
            if (h0Var.f21201f.d.getPlayState() == 3) {
                h0Var.f21197a.pause();
            }
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 29 && h0Var.c()) {
                g0 g0Var = h0Var.f21203i;
                g0Var.getClass();
                g0.a(g0Var);
            }
            if (i7 >= 24 && (d0Var = h0Var.f21200e) != null) {
                d0.b(d0Var);
                h0Var.f21200e = null;
            }
            AudioTrack audioTrack = h0Var.f21197a;
            h2.r rVar = h0Var.f21204j;
            Handler q10 = h2.l0.q(null);
            synchronized (h0.f21195t) {
                try {
                    if (h0.f21196u == null) {
                        h0.f21196u = Executors.newSingleThreadScheduledExecutor(new ai.v0(1));
                    }
                    h0.v++;
                    h0.f21196u.schedule(new kg.x(audioTrack, q10, rVar, 15), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f21327t = null;
        }
        r0 r0Var = this.f21319l;
        r0Var.f21306c = null;
        r0Var.f21304a = -9223372036854775807L;
        r0Var.f21305b = -9223372036854775807L;
        r0 r0Var2 = this.f21318k;
        r0Var2.f21306c = null;
        r0Var2.f21304a = -9223372036854775807L;
        r0Var2.f21305b = -9223372036854775807L;
        this.Z = 0L;
        this.f21309a0 = 0L;
        Handler handler = this.f21311b0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final long g() {
        boolean z10;
        if (!p()) {
            return -9223372036854775807L;
        }
        if (p0.a(this.f21323p)) {
            return h2.l0.Y(((n) this.f21323p.f21293e).f21276b, this.f21327t.f21197a.getBufferSizeInFrames());
        }
        long bufferSizeInFrames = this.f21327t.f21197a.getBufferSizeInFrames();
        int j3 = f3.b.j(((n) this.f21323p.f21293e).f21275a);
        if (j3 != -2147483647) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.p(z10);
        return h2.l0.a0(bufferSizeInFrames, 1000000L, j3, RoundingMode.DOWN);
    }

    public final long h() {
        ArrayDeque arrayDeque;
        long j3;
        f2.r rVar;
        if (p() && !this.F) {
            long min = Math.min(this.f21327t.a(), h2.l0.Y(((n) this.f21323p.f21293e).f21276b, l()));
            while (true) {
                arrayDeque = this.h;
                if (arrayDeque.isEmpty() || min < ((q0) arrayDeque.getFirst()).f21300c) {
                    break;
                }
                this.f21329w = (q0) arrayDeque.remove();
            }
            q0 q0Var = this.f21329w;
            long j10 = min - q0Var.f21300c;
            long B = h2.l0.B(j10, q0Var.f21298a.f10782a);
            boolean isEmpty = arrayDeque.isEmpty();
            h6.m mVar = this.f21310b;
            if (isEmpty) {
                f2.s sVar = (f2.s) mVar.d;
                if (sVar.isActive()) {
                    if (sVar.f11084n >= 1024) {
                        long j11 = sVar.f11083m;
                        sVar.f11080j.getClass();
                        long o4 = j11 - (rVar.f11065i.o() * (rVar.f11066j * rVar.f11060b));
                        int i7 = sVar.h.f11042a;
                        int i10 = sVar.f11078g.f11042a;
                        if (i7 == i10) {
                            j10 = h2.l0.a0(j10, o4, sVar.f11084n, RoundingMode.DOWN);
                        } else {
                            j10 = h2.l0.a0(j10, o4 * i7, sVar.f11084n * i10, RoundingMode.DOWN);
                        }
                    } else {
                        j10 = (long) (sVar.f11075c * j10);
                    }
                }
                q0 q0Var2 = this.f21329w;
                j3 = q0Var2.f21299b + j10;
                q0Var2.d = j10 - B;
            } else {
                q0 q0Var3 = this.f21329w;
                j3 = q0Var3.f21299b + B + q0Var3.d;
            }
            long j12 = ((x0) mVar.f13932c).f21368q;
            long Y = h2.l0.Y(((n) this.f21323p.f21293e).f21276b, j12) + j3;
            long j13 = this.Z;
            if (j12 > j13) {
                long Y2 = h2.l0.Y(((n) this.f21323p.f21293e).f21276b, j12 - j13);
                this.Z = j12;
                this.f21309a0 += Y2;
                if (this.f21311b0 == null) {
                    this.f21311b0 = new Handler(Looper.myLooper());
                }
                this.f21311b0.removeCallbacksAndMessages(null);
                this.f21311b0.postDelayed(new kg.i0(this, 23), 100L);
            }
            return Y;
        }
        return Long.MIN_VALUE;
    }

    public final i i(e2.u uVar) {
        boolean z10;
        i iVar = new i(uVar);
        iVar.f21215b = this.f21328u;
        if (this.f21316i != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        iVar.d = z10;
        iVar.f21216c = this.T;
        iVar.f21217e = this.Q;
        iVar.f21219g = this.V;
        iVar.h = -1;
        iVar.f21218f = this.U;
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
        int i7 = ((j0) this.f21325r).b(i(uVar)).d;
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
        if (p0.a(this.f21323p)) {
            long j3 = this.B;
            long j10 = this.f21323p.f21291b;
            return ((j3 + j10) - 1) / j10;
        }
        return this.C;
    }

    public final boolean m(long r21, int r23, java.nio.ByteBuffer r24) {
        throw new UnsupportedOperationException("Method not decompiled: n2.s0.m(long, int, java.nio.ByteBuffer):boolean");
    }

    public final boolean n() {
        if (p()) {
            if (Build.VERSION.SDK_INT < 29 || !this.f21327t.c() || !this.N) {
                long l10 = l();
                long a10 = this.f21327t.a();
                h0 h0Var = this.f21327t;
                h0Var.getClass();
                if (l10 > h2.l0.a0(a10, h0Var.f21197a.getSampleRate(), 1000000L, RoundingMode.UP)) {
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
        h0 b10;
        r0 r0Var = this.f21318k;
        boolean z10 = false;
        if (((Exception) r0Var.f21306c) != null && (f21307c0.get() > 0 || SystemClock.elapsedRealtime() < r0Var.f21305b)) {
            return false;
        }
        try {
            b10 = b((n) this.f21323p.f21293e);
        } catch (u e10) {
            int i10 = ((n) this.f21323p.f21293e).f21279f;
            while (i10 > 1000000) {
                int i11 = i10 / 2;
                p0 p0Var = this.f21323p;
                int i12 = p0Var.f21291b;
                if (i12 == -1) {
                    i12 = 1;
                }
                int i13 = i11 % i12;
                if (i13 != 0) {
                    i7 = (i12 - i13) + i11;
                } else {
                    i7 = i11;
                }
                m a10 = ((n) p0Var.f21293e).a();
                a10.f21268f = i7;
                n nVar = new n(a10);
                try {
                    b10 = b(nVar);
                    p0 p0Var2 = this.f21323p;
                    this.f21323p = new p0((e2.u) p0Var2.f21292c, (e2.u) p0Var2.d, p0Var2.f21290a, p0Var2.f21291b, nVar, (f2.j) p0Var2.f21294f);
                } catch (u e11) {
                    e10.addSuppressed(e11);
                    i10 = i7;
                }
            }
            if (((n) this.f21323p.f21293e).f21278e) {
                this.X = true;
            }
            throw e10;
        }
        this.f21327t = b10;
        o0 o0Var = new o0(this, (n) this.f21323p.f21293e);
        this.f21317j = o0Var;
        b10.f21204j.a(o0Var);
        if (this.f21327t.c()) {
            p0 p0Var3 = this.f21323p;
            if (((n) p0Var3.f21293e).f21283k) {
                h0 h0Var = this.f21327t;
                e2.u uVar = (e2.u) p0Var3.f21292c;
                h0Var.d(uVar.N, uVar.O);
            }
        }
        m2.i iVar = this.f21320m;
        if (iVar != null) {
            this.f21327t.f(iVar);
        }
        if (p()) {
            this.f21327t.f21197a.setVolume(this.H);
        }
        this.S.getClass();
        AudioDeviceInfo audioDeviceInfo = this.T;
        if (audioDeviceInfo != null) {
            this.f21327t.f21197a.setPreferredDevice(audioDeviceInfo);
        }
        this.F = true;
        int audioSessionId = this.f21327t.f21197a.getAudioSessionId();
        if (audioSessionId != this.Q) {
            z10 = true;
        }
        this.Q = audioSessionId;
        v vVar = this.f21321n;
        if (vVar != 0) {
            int i14 = ((n) this.f21323p.f21293e).f21275a;
            vVar.s(new Object());
            if (z10) {
                this.R = true;
                p0 p0Var4 = this.f21323p;
                m a11 = ((n) p0Var4.f21293e).a();
                a11.h = this.Q;
                this.f21323p = new p0((e2.u) p0Var4.f21292c, (e2.u) p0Var4.d, p0Var4.f21290a, p0Var4.f21291b, new n(a11), (f2.j) p0Var4.f21294f);
                p0 p0Var5 = this.f21322o;
                if (p0Var5 != null) {
                    m a12 = ((n) p0Var5.f21293e).a();
                    a12.h = this.Q;
                    this.f21322o = new p0((e2.u) p0Var5.f21292c, (e2.u) p0Var5.d, p0Var5.f21290a, p0Var5.f21291b, new n(a12), (f2.j) p0Var5.f21294f);
                }
                this.f21321n.a(this.Q);
            }
        }
        return true;
    }

    public final boolean p() {
        if (this.f21327t != null) {
            return true;
        }
        return false;
    }

    public final void q() {
        this.O = false;
        if (p()) {
            h0 h0Var = this.f21327t;
            k0 k0Var = h0Var.f21201f;
            k0Var.f21247k = 0L;
            k0Var.f21256t = 0;
            k0Var.f21255s = 0;
            k0Var.f21248l = 0L;
            k0Var.f21260y = -9223372036854775807L;
            k0Var.f21261z = -9223372036854775807L;
            if (k0Var.f21257u == -9223372036854775807L) {
                k0Var.h.a(0);
            }
            k0Var.f21258w = k0Var.a();
            if (!h0Var.f21205k || h0Var.c()) {
                h0Var.f21197a.pause();
            }
        }
    }

    public final void r() {
        this.O = true;
        if (p()) {
            h0 h0Var = this.f21327t;
            k0 k0Var = h0Var.f21201f;
            if (k0Var.f21257u != -9223372036854775807L) {
                k0Var.f21240b.getClass();
                k0Var.f21257u = h2.l0.S(SystemClock.elapsedRealtime());
            }
            k0Var.f21246j = h2.l0.Y(k0Var.f21242e, k0Var.a());
            k0Var.h.a(0);
            if (!h0Var.f21205k || h0Var.c()) {
                h0Var.f21197a.play();
            }
        }
    }

    public final void s() {
        if (!this.M) {
            this.M = true;
            if (this.f21327t.c()) {
                this.N = false;
            }
            h0 h0Var = this.f21327t;
            if (!h0Var.f21205k) {
                h0Var.f21205k = true;
                k0 k0Var = h0Var.f21201f;
                long b10 = h0Var.b();
                k0Var.f21258w = k0Var.a();
                k0Var.f21240b.getClass();
                k0Var.f21257u = h2.l0.S(SystemClock.elapsedRealtime());
                k0Var.f21259x = b10;
                h0Var.f21197a.stop();
                h0Var.f21210p = 0;
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
        throw new UnsupportedOperationException("Method not decompiled: n2.s0.u(long):void");
    }

    public final void v() {
        if (this.f21323p != null) {
            p0 p0Var = this.f21322o;
            if (p0Var != null) {
                this.f21323p = p0Var;
                this.f21322o = null;
            }
            try {
                n c10 = ((j0) this.f21325r).c(i((e2.u) this.f21323p.d));
                p0 p0Var2 = this.f21323p;
                this.f21323p = new p0((e2.u) p0Var2.f21292c, (e2.u) p0Var2.d, p0Var2.f21290a, p0Var2.f21291b, c10, (f2.j) p0Var2.f21294f);
            } catch (h e10) {
                throw new IllegalStateException(new t(e10, (e2.u) this.f21323p.f21292c));
            }
        }
        f();
    }

    public final void w() {
        f();
        h9.g0 listIterator = this.f21315g.listIterator(0);
        while (listIterator.hasNext()) {
            ((f2.n) listIterator.next()).reset();
        }
        this.f21313e.reset();
        this.f21314f.reset();
        f2.j jVar = this.f21324q;
        if (jVar != null) {
            h9.i0 i0Var = jVar.f11038a;
            for (int i7 = 0; i7 < i0Var.size(); i7++) {
                f2.n nVar = (f2.n) i0Var.get(i7);
                nVar.d(f2.l.f11045b);
                nVar.reset();
            }
            jVar.f11039b.clear();
            jVar.f11040c = new ByteBuffer[0];
            f2.k kVar = f2.k.f11041e;
            jVar.d = false;
        }
        this.O = false;
        this.X = false;
    }

    public final void x() {
        if (p()) {
            h0 h0Var = this.f21327t;
            e2.w0 w0Var = this.f21330x;
            AudioTrack audioTrack = h0Var.f21197a;
            try {
                audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(h2.l0.h(w0Var.f10782a, 0.1f, h0Var.f21199c)).setPitch(h2.l0.h(w0Var.f10783b, 0.1f, 8.0f)).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                h2.a.m("AudioTrackAudioOutput", "Failed to set playback params", e10);
            }
            k0 k0Var = h0Var.f21201f;
            k0Var.f21245i = audioTrack.getPlaybackParams().getSpeed();
            k0Var.h.a(0);
            k0Var.f21247k = 0L;
            k0Var.f21256t = 0;
            k0Var.f21255s = 0;
            k0Var.f21248l = 0L;
            k0Var.f21260y = -9223372036854775807L;
            k0Var.f21261z = -9223372036854775807L;
            PlaybackParams playbackParams = this.f21327t.f21197a.getPlaybackParams();
            this.f21330x = new e2.w0(playbackParams.getSpeed(), playbackParams.getPitch());
        }
    }

    public final void y(o oVar) {
        if (oVar.equals(this.f21325r)) {
            return;
        }
        ((j0) this.f21325r).d();
        this.f21325r = oVar;
        n0 n0Var = this.f21326s;
        if (n0Var != null) {
            j0 j0Var = (j0) oVar;
            j0Var.f();
            if (j0Var.f21231f == null) {
                j0Var.f21231f = new h2.r(Thread.currentThread());
            }
            j0Var.f21231f.a(n0Var);
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
