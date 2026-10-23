package k2;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import ci.o4;
import e9.x1;
import ei.bc;
import ig.d2;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import v7.u6;
public final class t0 implements a0 {
    public static final AtomicInteger f14842c0 = new AtomicInteger();
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
    public b2.g S;
    public AudioDeviceInfo T;
    public int U;
    public boolean V;
    public long W;
    public boolean X;
    public boolean Y;
    public long Z;
    public final Context f14843a;
    public long f14844a0;
    public final androidx.biometric.e f14845b;
    public Handler f14846b0;
    public final m0 f14847c;
    public final d1 d;
    public final c2.u e;
    public final c1 f14848f;
    public final x1 f14849g;
    public final ArrayDeque h;
    public int f14850i;
    public p0 f14851j;
    public final s0 f14852k;
    public final s0 f14853l;
    public j2.j f14854m;
    public y f14855n;
    public q0 f14856o;
    public q0 f14857p;
    public c2.j f14858q;
    public q f14859r;
    public o0 f14860s;
    public i0 f14861t;
    public b2.f f14862u;
    public r0 v;
    public r0 f14863w;
    public b2.z0 f14864x;
    public boolean f14865y;
    public long f14866z;

    public t0(o4 o4Var) {
        Context applicationContext;
        int deviceId;
        Context context = (Context) o4Var.f5632b;
        if (context == null) {
            applicationContext = null;
        } else {
            applicationContext = context.getApplicationContext();
        }
        this.f14843a = applicationContext;
        this.f14862u = b2.f.f3744i;
        this.f14845b = (androidx.biometric.e) o4Var.d;
        this.f14850i = 0;
        this.f14859r = (k0) o4Var.f5634f;
        ?? oVar = new c2.o();
        this.f14847c = oVar;
        ?? oVar2 = new c2.o();
        oVar2.f14712m = e2.m0.f8260b;
        this.d = oVar2;
        this.e = new c2.o();
        this.f14848f = new c2.o();
        this.f14849g = e9.n0.z(oVar2, oVar);
        this.H = 1.0f;
        this.Q = 0;
        this.S = new Object();
        b2.z0 z0Var = b2.z0.d;
        this.f14863w = new r0(z0Var, 0L, 0L);
        this.f14864x = z0Var;
        this.f14865y = false;
        this.h = new ArrayDeque();
        this.f14852k = new s0();
        this.f14853l = new s0();
        int i10 = -1;
        if (Build.VERSION.SDK_INT >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i10 = deviceId;
        }
        this.U = i10;
    }

    public static int k(int r10, java.nio.ByteBuffer r11) {
        throw new UnsupportedOperationException("Method not decompiled: k2.t0.k(int, java.nio.ByteBuffer):int");
    }

    public final void A(b2.g gVar) {
        if (this.S.equals(gVar)) {
            return;
        }
        gVar.getClass();
        if (this.f14861t != null) {
            this.S.getClass();
        }
        this.S = gVar;
    }

    public final void B(java.nio.ByteBuffer r23) {
        throw new UnsupportedOperationException("Method not decompiled: k2.t0.B(java.nio.ByteBuffer):void");
    }

    public final void C(b2.z0 z0Var) {
        if (D()) {
            this.f14864x = z0Var;
            x();
            return;
        }
        b2.z0 z0Var2 = new b2.z0(e2.m0.h(z0Var.f4159a, 0.1f, 8.0f), e2.m0.h(z0Var.f4160b, 0.1f, 8.0f));
        this.f14864x = z0Var2;
        r0 r0Var = new r0(z0Var2, -9223372036854775807L, -9223372036854775807L);
        if (p()) {
            this.v = r0Var;
        } else {
            this.f14863w = r0Var;
        }
    }

    public final boolean D() {
        q0 q0Var = this.f14857p;
        if (q0Var != null && ((p) q0Var.e).f14819j) {
            return true;
        }
        return false;
    }

    public final void a(long j10) {
        b2.z0 z0Var;
        boolean z10;
        boolean z11;
        boolean D = D();
        boolean z12 = false;
        androidx.biometric.e eVar = this.f14845b;
        if (!D) {
            if (!this.V && q0.a(this.f14857p)) {
                int i10 = ((b2.w) this.f14857p.f14825c).M;
                z0Var = this.f14864x;
                c2.t tVar = (c2.t) eVar.d;
                float f7 = z0Var.f4159a;
                tVar.getClass();
                if (f7 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u6.g(z10);
                if (tVar.f4552c != f7) {
                    tVar.f4552c = f7;
                    tVar.f4555i = true;
                }
                float f10 = z0Var.f4160b;
                if (f10 > 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                u6.g(z11);
                if (tVar.d != f10) {
                    tVar.d = f10;
                    tVar.f4555i = true;
                }
            } else {
                z0Var = b2.z0.d;
            }
            this.f14864x = z0Var;
        } else {
            z0Var = b2.z0.d;
        }
        b2.z0 z0Var2 = z0Var;
        if (!this.V && q0.a(this.f14857p)) {
            int i11 = ((b2.w) this.f14857p.f14825c).M;
            z12 = this.f14865y;
            ((z0) eVar.f2823c).f14904o = z12;
        }
        this.f14865y = z12;
        this.h.add(new r0(z0Var2, Math.max(0L, j10), e2.m0.Y(((p) this.f14857p.e).f14814b, l())));
        c2.j jVar = (c2.j) this.f14857p.f14826f;
        this.f14858q = jVar;
        jVar.a();
        y yVar = this.f14855n;
        if (yVar != null) {
            yVar.onSkipSilenceEnabledChanged(this.f14865y);
        }
    }

    public final i0 b(p pVar) {
        try {
            return ((k0) this.f14859r).a(pVar);
        } catch (n e) {
            x xVar = new x(pVar.f14814b, pVar.f14815c, pVar.f14813a, pVar.f14816f, (b2.w) this.f14857p.f14825c, pVar.e, e);
            y yVar = this.f14855n;
            if (yVar != null) {
                yVar.I(xVar);
            }
            throw xVar;
        }
    }

    public final void c(b2.w wVar, int[] iArr) {
        c2.j jVar;
        b2.w wVar2;
        int i10;
        int i11;
        if (this.f14860s == null && this.f14843a != null) {
            o0 o0Var = new o0(this);
            this.f14860s = o0Var;
            k0 k0Var = (k0) this.f14859r;
            k0Var.f();
            if (k0Var.f14767f == null) {
                k0Var.f14767f = new e2.r(Thread.currentThread());
            }
            k0Var.f14767f.a(o0Var);
        }
        String str = wVar.f4135s;
        int i12 = wVar.K;
        int i13 = wVar.M;
        if ("audio/raw".equals(str)) {
            u6.g(e2.m0.M(i13));
            int u10 = e2.m0.u(i13) * i12;
            ?? g0Var = new e9.g0(4);
            g0Var.d(this.f14849g);
            g0Var.c(this.e);
            c2.n[] nVarArr = (c2.n[]) this.f14845b.f2822b;
            int length = nVarArr.length;
            e9.s.d(length, nVarArr);
            g0Var.e(length);
            System.arraycopy(nVarArr, 0, g0Var.f8452a, g0Var.f8453b, length);
            g0Var.f8453b += length;
            jVar = new c2.j(g0Var.f());
            if (jVar.equals(this.f14858q)) {
                jVar = this.f14858q;
            }
            int i14 = wVar.N;
            int i15 = wVar.O;
            d1 d1Var = this.d;
            d1Var.f14708i = i14;
            d1Var.f14709j = i15;
            this.f14847c.f14800i = iArr;
            c2.k kVar = new c2.k(wVar.L, i12, i13);
            try {
                e9.n0 n0Var = jVar.f4514a;
                if (!kVar.equals(c2.k.e)) {
                    for (int i16 = 0; i16 < n0Var.size(); i16++) {
                        c2.n nVar = (c2.n) n0Var.get(i16);
                        c2.k e = nVar.e(kVar);
                        if (nVar.isActive()) {
                            u6.p(!e.equals(c2.k.e));
                            kVar = e;
                        }
                    }
                    int i17 = kVar.f4518b;
                    int i18 = kVar.f4519c;
                    b2.v a2 = wVar.a();
                    a2.L = i18;
                    a2.K = kVar.f4517a;
                    a2.J = i17;
                    wVar2 = new b2.w(a2);
                    i10 = u10;
                    i11 = e2.m0.u(i18) * i17;
                } else {
                    throw new c2.m(kVar);
                }
            } catch (c2.m e7) {
                throw new w(e7, wVar);
            }
        } else {
            jVar = new c2.j(x1.e);
            wVar2 = wVar;
            i10 = -1;
            i11 = -1;
        }
        c2.j jVar2 = jVar;
        k i19 = i(wVar2);
        b2.w wVar3 = i19.f14759a;
        try {
            p c10 = ((k0) this.f14859r).c(i19);
            boolean z10 = c10.e;
            if (c10.f14813a != 0) {
                if (c10.f14815c != 0) {
                    this.X = false;
                    q0 q0Var = new q0(wVar, wVar2, i10, i11, c10, jVar2);
                    if (p()) {
                        this.f14856o = q0Var;
                        return;
                    } else {
                        this.f14857p = q0Var;
                        return;
                    }
                }
                throw new w("Invalid output channel config (isOffload=" + z10 + ")", wVar3);
            }
            throw new w("Invalid output encoding (isOffload=" + z10 + ")", wVar3);
        } catch (j e10) {
            throw new w(e10, wVar);
        }
    }

    public final void d(long r10) {
        throw new UnsupportedOperationException("Method not decompiled: k2.t0.d(long):void");
    }

    public final boolean e() {
        throw new UnsupportedOperationException("Method not decompiled: k2.t0.e():boolean");
    }

    public final void f() {
        e0 e0Var;
        if (p()) {
            this.f14866z = 0L;
            this.A = 0L;
            this.B = 0L;
            this.C = 0L;
            this.Y = false;
            this.D = 0;
            this.f14863w = new r0(this.f14864x, 0L, 0L);
            this.G = 0L;
            this.v = null;
            this.h.clear();
            this.I = null;
            this.J = 0;
            this.K = null;
            this.M = false;
            this.L = false;
            this.N = false;
            this.d.f14714o = 0L;
            c2.j jVar = (c2.j) this.f14857p.f14826f;
            this.f14858q = jVar;
            jVar.a();
            this.f14851j = null;
            q0 q0Var = this.f14856o;
            if (q0Var != null) {
                this.f14857p = q0Var;
                this.f14856o = null;
            }
            f14842c0.incrementAndGet();
            i0 i0Var = this.f14861t;
            if (i0Var.f14743f.d.getPlayState() == 3) {
                i0Var.f14740a.pause();
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29 && i0Var.c()) {
                h0 h0Var = i0Var.f14745i;
                h0Var.getClass();
                h0.a(h0Var);
            }
            if (i10 >= 24 && (e0Var = i0Var.e) != null) {
                e0.b(e0Var);
                i0Var.e = null;
            }
            AudioTrack audioTrack = i0Var.f14740a;
            e2.r rVar = i0Var.f14746j;
            Handler q6 = e2.m0.q(null);
            synchronized (i0.f14738t) {
                try {
                    if (i0.f14739u == null) {
                        i0.f14739u = Executors.newSingleThreadScheduledExecutor(new e2.l0(0));
                    }
                    i0.v++;
                    i0.f14739u.schedule(new d2(audioTrack, q6, rVar, 2), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f14861t = null;
        }
        s0 s0Var = this.f14853l;
        s0Var.f14836a = null;
        s0Var.f14837b = -9223372036854775807L;
        s0Var.f14838c = -9223372036854775807L;
        s0 s0Var2 = this.f14852k;
        s0Var2.f14836a = null;
        s0Var2.f14837b = -9223372036854775807L;
        s0Var2.f14838c = -9223372036854775807L;
        this.Z = 0L;
        this.f14844a0 = 0L;
        Handler handler = this.f14846b0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final long g() {
        boolean z10;
        if (!p()) {
            return -9223372036854775807L;
        }
        if (q0.a(this.f14857p)) {
            return e2.m0.Y(((p) this.f14857p.e).f14814b, this.f14861t.f14740a.getBufferSizeInFrames());
        }
        long bufferSizeInFrames = this.f14861t.f14740a.getBufferSizeInFrames();
        int j10 = c3.b.j(((p) this.f14857p.e).f14813a);
        if (j10 != -2147483647) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        return e2.m0.a0(bufferSizeInFrames, 1000000L, j10, RoundingMode.DOWN);
    }

    public final long h() {
        ArrayDeque arrayDeque;
        long j10;
        c2.s sVar;
        if (p() && !this.F) {
            long min = Math.min(this.f14861t.a(), e2.m0.Y(((p) this.f14857p.e).f14814b, l()));
            while (true) {
                arrayDeque = this.h;
                if (arrayDeque.isEmpty() || min < ((r0) arrayDeque.getFirst()).f14832c) {
                    break;
                }
                this.f14863w = (r0) arrayDeque.remove();
            }
            r0 r0Var = this.f14863w;
            long j11 = min - r0Var.f14832c;
            long B = e2.m0.B(j11, r0Var.f14830a.f4159a);
            boolean isEmpty = arrayDeque.isEmpty();
            androidx.biometric.e eVar = this.f14845b;
            if (isEmpty) {
                c2.t tVar = (c2.t) eVar.d;
                if (tVar.isActive()) {
                    if (tVar.f4560n >= 1024) {
                        long j12 = tVar.f4559m;
                        tVar.f4556j.getClass();
                        long o10 = j12 - (sVar.f4542i.o() * (sVar.f4543j * sVar.f4538b));
                        int i10 = tVar.h.f4517a;
                        int i11 = tVar.f4554g.f4517a;
                        if (i10 == i11) {
                            j11 = e2.m0.a0(j11, o10, tVar.f4560n, RoundingMode.DOWN);
                        } else {
                            j11 = e2.m0.a0(j11, o10 * i10, tVar.f4560n * i11, RoundingMode.DOWN);
                        }
                    } else {
                        j11 = (long) (tVar.f4552c * j11);
                    }
                }
                r0 r0Var2 = this.f14863w;
                j10 = r0Var2.f14831b + j11;
                r0Var2.d = j11 - B;
            } else {
                r0 r0Var3 = this.f14863w;
                j10 = r0Var3.f14831b + B + r0Var3.d;
            }
            long j13 = ((z0) eVar.f2823c).f14906q;
            long Y = e2.m0.Y(((p) this.f14857p.e).f14814b, j13) + j10;
            long j14 = this.Z;
            if (j13 > j14) {
                long Y2 = e2.m0.Y(((p) this.f14857p.e).f14814b, j13 - j14);
                this.Z = j13;
                this.f14844a0 += Y2;
                if (this.f14846b0 == null) {
                    this.f14846b0 = new Handler(Looper.myLooper());
                }
                this.f14846b0.removeCallbacksAndMessages(null);
                this.f14846b0.postDelayed(new bc(this, 28), 100L);
            }
            return Y;
        }
        return Long.MIN_VALUE;
    }

    public final k i(b2.w wVar) {
        boolean z10;
        k kVar = new k(wVar);
        kVar.f14760b = this.f14862u;
        if (this.f14850i != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        kVar.d = z10;
        kVar.f14761c = this.T;
        kVar.e = this.Q;
        kVar.f14763g = this.V;
        kVar.h = -1;
        kVar.f14762f = this.U;
        return new k(kVar);
    }

    public final int j(b2.w wVar) {
        boolean z10;
        if (e2.m0.M(wVar.M) && wVar.M != 2) {
            b2.v a2 = wVar.a();
            a2.L = 2;
            wVar = new b2.w(a2);
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = ((k0) this.f14859r).b(i(wVar)).d;
        if (i10 != 1) {
            if (i10 != 2) {
                return 0;
            }
            if (!z10) {
                return 2;
            }
        }
        return 1;
    }

    public final long l() {
        if (q0.a(this.f14857p)) {
            long j10 = this.B;
            long j11 = this.f14857p.f14824b;
            return ((j10 + j11) - 1) / j11;
        }
        return this.C;
    }

    public final boolean m(long r21, int r23, java.nio.ByteBuffer r24) {
        throw new UnsupportedOperationException("Method not decompiled: k2.t0.m(long, int, java.nio.ByteBuffer):boolean");
    }

    public final boolean n() {
        if (p()) {
            if (Build.VERSION.SDK_INT < 29 || !this.f14861t.c() || !this.N) {
                long l4 = l();
                long a2 = this.f14861t.a();
                i0 i0Var = this.f14861t;
                i0Var.getClass();
                if (l4 > e2.m0.a0(a2, i0Var.f14740a.getSampleRate(), 1000000L, RoundingMode.UP)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean o() {
        int i10;
        i0 b10;
        s0 s0Var = this.f14852k;
        boolean z10 = false;
        if (s0Var.f14836a != null && (f14842c0.get() > 0 || SystemClock.elapsedRealtime() < s0Var.f14838c)) {
            return false;
        }
        try {
            b10 = b((p) this.f14857p.e);
        } catch (x e) {
            int i11 = ((p) this.f14857p.e).f14816f;
            while (i11 > 1000000) {
                int i12 = i11 / 2;
                q0 q0Var = this.f14857p;
                int i13 = q0Var.f14824b;
                if (i13 == -1) {
                    i13 = 1;
                }
                int i14 = i12 % i13;
                if (i14 != 0) {
                    i10 = (i13 - i14) + i12;
                } else {
                    i10 = i12;
                }
                o a2 = ((p) q0Var.e).a();
                a2.f14807f = i10;
                p pVar = new p(a2);
                try {
                    b10 = b(pVar);
                    q0 q0Var2 = this.f14857p;
                    this.f14857p = new q0((b2.w) q0Var2.f14825c, (b2.w) q0Var2.d, q0Var2.f14823a, q0Var2.f14824b, pVar, (c2.j) q0Var2.f14826f);
                } catch (x e7) {
                    e.addSuppressed(e7);
                    i11 = i10;
                }
            }
            if (((p) this.f14857p.e).e) {
                this.X = true;
            }
            throw e;
        }
        this.f14861t = b10;
        p0 p0Var = new p0(this, (p) this.f14857p.e);
        this.f14851j = p0Var;
        b10.f14746j.a(p0Var);
        if (this.f14861t.c()) {
            q0 q0Var3 = this.f14857p;
            if (((p) q0Var3.e).f14820k) {
                i0 i0Var = this.f14861t;
                b2.w wVar = (b2.w) q0Var3.f14825c;
                i0Var.d(wVar.N, wVar.O);
            }
        }
        j2.j jVar = this.f14854m;
        if (jVar != null) {
            this.f14861t.f(jVar);
        }
        if (p()) {
            this.f14861t.f14740a.setVolume(this.H);
        }
        this.S.getClass();
        AudioDeviceInfo audioDeviceInfo = this.T;
        if (audioDeviceInfo != null) {
            this.f14861t.f14740a.setPreferredDevice(audioDeviceInfo);
        }
        this.F = true;
        int audioSessionId = this.f14861t.f14740a.getAudioSessionId();
        if (audioSessionId != this.Q) {
            z10 = true;
        }
        this.Q = audioSessionId;
        y yVar = this.f14855n;
        if (yVar != 0) {
            int i15 = ((p) this.f14857p.e).f14813a;
            yVar.Q(new Object());
            if (z10) {
                this.R = true;
                q0 q0Var4 = this.f14857p;
                o a10 = ((p) q0Var4.e).a();
                a10.h = this.Q;
                this.f14857p = new q0((b2.w) q0Var4.f14825c, (b2.w) q0Var4.d, q0Var4.f14823a, q0Var4.f14824b, new p(a10), (c2.j) q0Var4.f14826f);
                q0 q0Var5 = this.f14856o;
                if (q0Var5 != null) {
                    o a11 = ((p) q0Var5.e).a();
                    a11.h = this.Q;
                    this.f14856o = new q0((b2.w) q0Var5.f14825c, (b2.w) q0Var5.d, q0Var5.f14823a, q0Var5.f14824b, new p(a11), (c2.j) q0Var5.f14826f);
                }
                this.f14855n.onAudioSessionIdChanged(this.Q);
            }
        }
        return true;
    }

    public final boolean p() {
        if (this.f14861t != null) {
            return true;
        }
        return false;
    }

    public final void q() {
        this.O = false;
        if (p()) {
            i0 i0Var = this.f14861t;
            l0 l0Var = i0Var.f14743f;
            l0Var.f14782k = 0L;
            l0Var.f14791t = 0;
            l0Var.f14790s = 0;
            l0Var.f14783l = 0L;
            l0Var.f14795y = -9223372036854775807L;
            l0Var.f14796z = -9223372036854775807L;
            if (l0Var.f14792u == -9223372036854775807L) {
                l0Var.h.a(0);
            }
            l0Var.f14793w = l0Var.a();
            if (!i0Var.f14747k || i0Var.c()) {
                i0Var.f14740a.pause();
            }
        }
    }

    public final void r() {
        this.O = true;
        if (p()) {
            i0 i0Var = this.f14861t;
            l0 l0Var = i0Var.f14743f;
            if (l0Var.f14792u != -9223372036854775807L) {
                l0Var.f14776b.getClass();
                l0Var.f14792u = e2.m0.S(SystemClock.elapsedRealtime());
            }
            l0Var.f14781j = e2.m0.Y(l0Var.e, l0Var.a());
            l0Var.h.a(0);
            if (!i0Var.f14747k || i0Var.c()) {
                i0Var.f14740a.play();
            }
        }
    }

    public final void s() {
        if (!this.M) {
            this.M = true;
            if (this.f14861t.c()) {
                this.N = false;
            }
            i0 i0Var = this.f14861t;
            if (!i0Var.f14747k) {
                i0Var.f14747k = true;
                l0 l0Var = i0Var.f14743f;
                long b10 = i0Var.b();
                l0Var.f14793w = l0Var.a();
                l0Var.f14776b.getClass();
                l0Var.f14792u = e2.m0.S(SystemClock.elapsedRealtime());
                l0Var.f14794x = b10;
                i0Var.f14740a.stop();
                i0Var.f14752p = 0;
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
        throw new UnsupportedOperationException("Method not decompiled: k2.t0.u(long):void");
    }

    public final void v() {
        if (this.f14857p != null) {
            q0 q0Var = this.f14856o;
            if (q0Var != null) {
                this.f14857p = q0Var;
                this.f14856o = null;
            }
            try {
                p c10 = ((k0) this.f14859r).c(i((b2.w) this.f14857p.d));
                q0 q0Var2 = this.f14857p;
                this.f14857p = new q0((b2.w) q0Var2.f14825c, (b2.w) q0Var2.d, q0Var2.f14823a, q0Var2.f14824b, c10, (c2.j) q0Var2.f14826f);
            } catch (j e) {
                throw new IllegalStateException(new w(e, (b2.w) this.f14857p.f14825c));
            }
        }
        f();
    }

    public final void w() {
        f();
        e9.l0 listIterator = this.f14849g.listIterator(0);
        while (listIterator.hasNext()) {
            ((c2.n) listIterator.next()).reset();
        }
        this.e.reset();
        this.f14848f.reset();
        c2.j jVar = this.f14858q;
        if (jVar != null) {
            e9.n0 n0Var = jVar.f4514a;
            for (int i10 = 0; i10 < n0Var.size(); i10++) {
                c2.n nVar = (c2.n) n0Var.get(i10);
                nVar.d(c2.l.f4520b);
                nVar.reset();
            }
            jVar.f4515b.clear();
            jVar.f4516c = new ByteBuffer[0];
            c2.k kVar = c2.k.e;
            jVar.d = false;
        }
        this.O = false;
        this.X = false;
    }

    public final void x() {
        if (p()) {
            i0 i0Var = this.f14861t;
            b2.z0 z0Var = this.f14864x;
            AudioTrack audioTrack = i0Var.f14740a;
            try {
                audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(e2.m0.h(z0Var.f4159a, 0.1f, i0Var.f14742c)).setPitch(e2.m0.h(z0Var.f4160b, 0.1f, 8.0f)).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                e2.a.m("AudioTrackAudioOutput", "Failed to set playback params", e);
            }
            l0 l0Var = i0Var.f14743f;
            l0Var.f14780i = audioTrack.getPlaybackParams().getSpeed();
            l0Var.h.a(0);
            l0Var.f14782k = 0L;
            l0Var.f14791t = 0;
            l0Var.f14790s = 0;
            l0Var.f14783l = 0L;
            l0Var.f14795y = -9223372036854775807L;
            l0Var.f14796z = -9223372036854775807L;
            PlaybackParams playbackParams = this.f14861t.f14740a.getPlaybackParams();
            this.f14864x = new b2.z0(playbackParams.getSpeed(), playbackParams.getPitch());
        }
    }

    public final void y(q qVar) {
        if (qVar.equals(this.f14859r)) {
            return;
        }
        ((k0) this.f14859r).d();
        this.f14859r = qVar;
        o0 o0Var = this.f14860s;
        if (o0Var != null) {
            k0 k0Var = (k0) qVar;
            k0Var.f();
            if (k0Var.f14767f == null) {
                k0Var.f14767f = new e2.r(Thread.currentThread());
            }
            k0Var.f14767f.a(o0Var);
        }
        v();
    }

    public final void z(int i10) {
        boolean z10 = false;
        if (this.R) {
            if (this.Q == i10) {
                this.R = false;
            } else {
                return;
            }
        }
        if (this.Q != i10) {
            this.Q = i10;
            if (i10 != 0) {
                z10 = true;
            }
            this.P = z10;
            v();
        }
    }
}
