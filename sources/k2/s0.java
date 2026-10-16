package k2;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import bi.p5;
import e9.x1;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import v7.u6;
public final class s0 implements z {
    public static final AtomicInteger f13995c0 = new AtomicInteger();
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
    public final Context f13996a;
    public long f13997a0;
    public final androidx.biometric.e f13998b;
    public Handler f13999b0;
    public final l0 f14000c;
    public final c1 d;
    public final c2.u e;
    public final b1 f14001f;
    public final x1 f14002g;
    public final ArrayDeque h;
    public int f14003i;
    public o0 f14004j;
    public final r0 f14005k;
    public final r0 f14006l;
    public j2.k f14007m;
    public x f14008n;
    public p0 f14009o;
    public p0 f14010p;
    public c2.j f14011q;
    public p f14012r;
    public n0 f14013s;
    public h0 f14014t;
    public b2.f f14015u;
    public q0 v;
    public q0 f14016w;
    public b2.a1 f14017x;
    public boolean f14018y;
    public long f14019z;

    public s0(p5 p5Var) {
        Context applicationContext;
        int deviceId;
        Context context = (Context) p5Var.f3469b;
        if (context == null) {
            applicationContext = null;
        } else {
            applicationContext = context.getApplicationContext();
        }
        this.f13996a = applicationContext;
        this.f14015u = b2.f.f2117i;
        this.f13998b = (androidx.biometric.e) p5Var.d;
        this.f14003i = 0;
        this.f14012r = (j0) p5Var.f3471f;
        ?? oVar = new c2.o();
        this.f14000c = oVar;
        ?? oVar2 = new c2.o();
        oVar2.f13863m = e2.m0.f8376b;
        this.d = oVar2;
        this.e = new c2.o();
        this.f14001f = new c2.o();
        this.f14002g = e9.n0.z(oVar2, oVar);
        this.H = 1.0f;
        this.Q = 0;
        this.S = new Object();
        b2.a1 a1Var = b2.a1.d;
        this.f14016w = new q0(a1Var, 0L, 0L);
        this.f14017x = a1Var;
        this.f14018y = false;
        this.h = new ArrayDeque();
        this.f14005k = new r0();
        this.f14006l = new r0();
        int i10 = -1;
        if (Build.VERSION.SDK_INT >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i10 = deviceId;
        }
        this.U = i10;
    }

    public static int k(int r10, java.nio.ByteBuffer r11) {
        throw new UnsupportedOperationException("Method not decompiled: k2.s0.k(int, java.nio.ByteBuffer):int");
    }

    public final void A(b2.g gVar) {
        if (this.S.equals(gVar)) {
            return;
        }
        gVar.getClass();
        if (this.f14014t != null) {
            this.S.getClass();
        }
        this.S = gVar;
    }

    public final void B(java.nio.ByteBuffer r23) {
        throw new UnsupportedOperationException("Method not decompiled: k2.s0.B(java.nio.ByteBuffer):void");
    }

    public final void C(b2.a1 a1Var) {
        if (D()) {
            this.f14017x = a1Var;
            x();
            return;
        }
        b2.a1 a1Var2 = new b2.a1(e2.m0.h(a1Var.f2077a, 0.1f, 8.0f), e2.m0.h(a1Var.f2078b, 0.1f, 8.0f));
        this.f14017x = a1Var2;
        q0 q0Var = new q0(a1Var2, -9223372036854775807L, -9223372036854775807L);
        if (p()) {
            this.v = q0Var;
        } else {
            this.f14016w = q0Var;
        }
    }

    public final boolean D() {
        p0 p0Var = this.f14010p;
        if (p0Var != null && ((o) p0Var.e).f13972j) {
            return true;
        }
        return false;
    }

    public final void a(long j10) {
        b2.a1 a1Var;
        boolean z10;
        boolean z11;
        boolean D = D();
        boolean z12 = false;
        androidx.biometric.e eVar = this.f13998b;
        if (!D) {
            if (!this.V && p0.a(this.f14010p)) {
                int i10 = ((b2.x) this.f14010p.f13978c).M;
                a1Var = this.f14017x;
                c2.t tVar = (c2.t) eVar.d;
                float f7 = a1Var.f2077a;
                tVar.getClass();
                if (f7 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u6.g(z10);
                if (tVar.f4181c != f7) {
                    tVar.f4181c = f7;
                    tVar.f4184i = true;
                }
                float f10 = a1Var.f2078b;
                if (f10 > 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                u6.g(z11);
                if (tVar.d != f10) {
                    tVar.d = f10;
                    tVar.f4184i = true;
                }
            } else {
                a1Var = b2.a1.d;
            }
            this.f14017x = a1Var;
        } else {
            a1Var = b2.a1.d;
        }
        b2.a1 a1Var2 = a1Var;
        if (!this.V && p0.a(this.f14010p)) {
            int i11 = ((b2.x) this.f14010p.f13978c).M;
            z12 = this.f14018y;
            ((x0) eVar.f1201c).f14052o = z12;
        }
        this.f14018y = z12;
        this.h.add(new q0(a1Var2, Math.max(0L, j10), e2.m0.Y(((o) this.f14010p.e).f13967b, l())));
        c2.j jVar = (c2.j) this.f14010p.f13979f;
        this.f14011q = jVar;
        jVar.a();
        x xVar = this.f14008n;
        if (xVar != null) {
            xVar.onSkipSilenceEnabledChanged(this.f14018y);
        }
    }

    public final h0 b(o oVar) {
        try {
            return ((j0) this.f14012r).a(oVar);
        } catch (m e) {
            w wVar = new w(oVar.f13967b, oVar.f13968c, oVar.f13966a, oVar.f13969f, (b2.x) this.f14010p.f13978c, oVar.e, e);
            x xVar = this.f14008n;
            if (xVar != null) {
                xVar.x(wVar);
            }
            throw wVar;
        }
    }

    public final void c(b2.x xVar, int[] iArr) {
        c2.j jVar;
        b2.x xVar2;
        int i10;
        int i11;
        if (this.f14013s == null && this.f13996a != null) {
            n0 n0Var = new n0(this);
            this.f14013s = n0Var;
            j0 j0Var = (j0) this.f14012r;
            j0Var.f();
            if (j0Var.f13920f == null) {
                j0Var.f13920f = new e2.r(Thread.currentThread());
            }
            j0Var.f13920f.a(n0Var);
        }
        String str = xVar.f2523s;
        int i12 = xVar.K;
        int i13 = xVar.M;
        if ("audio/raw".equals(str)) {
            u6.g(e2.m0.M(i13));
            int u10 = e2.m0.u(i13) * i12;
            ?? g0Var = new e9.g0(4);
            g0Var.d(this.f14002g);
            g0Var.c(this.e);
            c2.n[] nVarArr = (c2.n[]) this.f13998b.f1200b;
            int length = nVarArr.length;
            e9.s.d(length, nVarArr);
            g0Var.e(length);
            System.arraycopy(nVarArr, 0, g0Var.f8566a, g0Var.f8567b, length);
            g0Var.f8567b += length;
            jVar = new c2.j(g0Var.f());
            if (jVar.equals(this.f14011q)) {
                jVar = this.f14011q;
            }
            int i14 = xVar.N;
            int i15 = xVar.O;
            c1 c1Var = this.d;
            c1Var.f13859i = i14;
            c1Var.f13860j = i15;
            this.f14000c.f13953i = iArr;
            c2.k kVar = new c2.k(xVar.L, i12, i13);
            try {
                e9.n0 n0Var2 = jVar.f4143a;
                if (!kVar.equals(c2.k.e)) {
                    for (int i16 = 0; i16 < n0Var2.size(); i16++) {
                        c2.n nVar = (c2.n) n0Var2.get(i16);
                        c2.k e = nVar.e(kVar);
                        if (nVar.isActive()) {
                            u6.p(!e.equals(c2.k.e));
                            kVar = e;
                        }
                    }
                    int i17 = kVar.f4147b;
                    int i18 = kVar.f4148c;
                    b2.w a2 = xVar.a();
                    a2.L = i18;
                    a2.K = kVar.f4146a;
                    a2.J = i17;
                    xVar2 = new b2.x(a2);
                    i10 = u10;
                    i11 = e2.m0.u(i18) * i17;
                } else {
                    throw new c2.m(kVar);
                }
            } catch (c2.m e7) {
                throw new v(e7, xVar);
            }
        } else {
            jVar = new c2.j(x1.e);
            xVar2 = xVar;
            i10 = -1;
            i11 = -1;
        }
        c2.j jVar2 = jVar;
        j i19 = i(xVar2);
        b2.x xVar3 = i19.f13912a;
        try {
            o c10 = ((j0) this.f14012r).c(i19);
            boolean z10 = c10.e;
            if (c10.f13966a != 0) {
                if (c10.f13968c != 0) {
                    this.X = false;
                    p0 p0Var = new p0(xVar, xVar2, i10, i11, c10, jVar2);
                    if (p()) {
                        this.f14009o = p0Var;
                        return;
                    } else {
                        this.f14010p = p0Var;
                        return;
                    }
                }
                throw new v("Invalid output channel config (isOffload=" + z10 + ")", xVar3);
            }
            throw new v("Invalid output encoding (isOffload=" + z10 + ")", xVar3);
        } catch (i e10) {
            throw new v(e10, xVar);
        }
    }

    public final void d(long r10) {
        throw new UnsupportedOperationException("Method not decompiled: k2.s0.d(long):void");
    }

    public final boolean e() {
        throw new UnsupportedOperationException("Method not decompiled: k2.s0.e():boolean");
    }

    public final void f() {
        d0 d0Var;
        if (p()) {
            this.f14019z = 0L;
            this.A = 0L;
            this.B = 0L;
            this.C = 0L;
            this.Y = false;
            this.D = 0;
            this.f14016w = new q0(this.f14017x, 0L, 0L);
            this.G = 0L;
            this.v = null;
            this.h.clear();
            this.I = null;
            this.J = 0;
            this.K = null;
            this.M = false;
            this.L = false;
            this.N = false;
            this.d.f13865o = 0L;
            c2.j jVar = (c2.j) this.f14010p.f13979f;
            this.f14011q = jVar;
            jVar.a();
            this.f14004j = null;
            p0 p0Var = this.f14009o;
            if (p0Var != null) {
                this.f14010p = p0Var;
                this.f14009o = null;
            }
            f13995c0.incrementAndGet();
            h0 h0Var = this.f14014t;
            if (h0Var.f13896f.d.getPlayState() == 3) {
                h0Var.f13893a.pause();
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29 && h0Var.c()) {
                g0 g0Var = h0Var.f13898i;
                g0Var.getClass();
                g0.a(g0Var);
            }
            if (i10 >= 24 && (d0Var = h0Var.e) != null) {
                d0.b(d0Var);
                h0Var.e = null;
            }
            AudioTrack audioTrack = h0Var.f13893a;
            e2.r rVar = h0Var.f13899j;
            Handler q6 = e2.m0.q(null);
            synchronized (h0.f13891t) {
                try {
                    if (h0.f13892u == null) {
                        h0.f13892u = Executors.newSingleThreadScheduledExecutor(new e2.l0(0));
                    }
                    h0.v++;
                    h0.f13892u.schedule(new hg.t(audioTrack, q6, rVar, 21), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f14014t = null;
        }
        r0 r0Var = this.f14006l;
        r0Var.f13989a = null;
        r0Var.f13990b = -9223372036854775807L;
        r0Var.f13991c = -9223372036854775807L;
        r0 r0Var2 = this.f14005k;
        r0Var2.f13989a = null;
        r0Var2.f13990b = -9223372036854775807L;
        r0Var2.f13991c = -9223372036854775807L;
        this.Z = 0L;
        this.f13997a0 = 0L;
        Handler handler = this.f13999b0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final long g() {
        boolean z10;
        if (!p()) {
            return -9223372036854775807L;
        }
        if (p0.a(this.f14010p)) {
            return e2.m0.Y(((o) this.f14010p.e).f13967b, this.f14014t.f13893a.getBufferSizeInFrames());
        }
        long bufferSizeInFrames = this.f14014t.f13893a.getBufferSizeInFrames();
        int j10 = c3.b.j(((o) this.f14010p.e).f13966a);
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
            long min = Math.min(this.f14014t.a(), e2.m0.Y(((o) this.f14010p.e).f13967b, l()));
            while (true) {
                arrayDeque = this.h;
                if (arrayDeque.isEmpty() || min < ((q0) arrayDeque.getFirst()).f13985c) {
                    break;
                }
                this.f14016w = (q0) arrayDeque.remove();
            }
            q0 q0Var = this.f14016w;
            long j11 = min - q0Var.f13985c;
            long B = e2.m0.B(j11, q0Var.f13983a.f2077a);
            boolean isEmpty = arrayDeque.isEmpty();
            androidx.biometric.e eVar = this.f13998b;
            if (isEmpty) {
                c2.t tVar = (c2.t) eVar.d;
                if (tVar.isActive()) {
                    if (tVar.f4189n >= 1024) {
                        long j12 = tVar.f4188m;
                        tVar.f4185j.getClass();
                        long o10 = j12 - (sVar.f4171i.o() * (sVar.f4172j * sVar.f4167b));
                        int i10 = tVar.h.f4146a;
                        int i11 = tVar.f4183g.f4146a;
                        if (i10 == i11) {
                            j11 = e2.m0.a0(j11, o10, tVar.f4189n, RoundingMode.DOWN);
                        } else {
                            j11 = e2.m0.a0(j11, o10 * i10, tVar.f4189n * i11, RoundingMode.DOWN);
                        }
                    } else {
                        j11 = (long) (tVar.f4181c * j11);
                    }
                }
                q0 q0Var2 = this.f14016w;
                j10 = q0Var2.f13984b + j11;
                q0Var2.d = j11 - B;
            } else {
                q0 q0Var3 = this.f14016w;
                j10 = q0Var3.f13984b + B + q0Var3.d;
            }
            long j13 = ((x0) eVar.f1201c).f14054q;
            long Y = e2.m0.Y(((o) this.f14010p.e).f13967b, j13) + j10;
            long j14 = this.Z;
            if (j13 > j14) {
                long Y2 = e2.m0.Y(((o) this.f14010p.e).f13967b, j13 - j14);
                this.Z = j13;
                this.f13997a0 += Y2;
                if (this.f13999b0 == null) {
                    this.f13999b0 = new Handler(Looper.myLooper());
                }
                this.f13999b0.removeCallbacksAndMessages(null);
                this.f13999b0.postDelayed(new ig.t0(this, 14), 100L);
            }
            return Y;
        }
        return Long.MIN_VALUE;
    }

    public final j i(b2.x xVar) {
        boolean z10;
        j jVar = new j(xVar);
        jVar.f13913b = this.f14015u;
        if (this.f14003i != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        jVar.d = z10;
        jVar.f13914c = this.T;
        jVar.e = this.Q;
        jVar.f13916g = this.V;
        jVar.h = -1;
        jVar.f13915f = this.U;
        return new j(jVar);
    }

    public final int j(b2.x xVar) {
        boolean z10;
        if (e2.m0.M(xVar.M) && xVar.M != 2) {
            b2.w a2 = xVar.a();
            a2.L = 2;
            xVar = new b2.x(a2);
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = ((j0) this.f14012r).b(i(xVar)).d;
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
        if (p0.a(this.f14010p)) {
            long j10 = this.B;
            long j11 = this.f14010p.f13977b;
            return ((j10 + j11) - 1) / j11;
        }
        return this.C;
    }

    public final boolean m(long r21, int r23, java.nio.ByteBuffer r24) {
        throw new UnsupportedOperationException("Method not decompiled: k2.s0.m(long, int, java.nio.ByteBuffer):boolean");
    }

    public final boolean n() {
        if (p()) {
            if (Build.VERSION.SDK_INT < 29 || !this.f14014t.c() || !this.N) {
                long l4 = l();
                long a2 = this.f14014t.a();
                h0 h0Var = this.f14014t;
                h0Var.getClass();
                if (l4 > e2.m0.a0(a2, h0Var.f13893a.getSampleRate(), 1000000L, RoundingMode.UP)) {
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
        h0 b10;
        r0 r0Var = this.f14005k;
        boolean z10 = false;
        if (r0Var.f13989a != null && (f13995c0.get() > 0 || SystemClock.elapsedRealtime() < r0Var.f13991c)) {
            return false;
        }
        try {
            b10 = b((o) this.f14010p.e);
        } catch (w e) {
            int i11 = ((o) this.f14010p.e).f13969f;
            while (i11 > 1000000) {
                int i12 = i11 / 2;
                p0 p0Var = this.f14010p;
                int i13 = p0Var.f13977b;
                if (i13 == -1) {
                    i13 = 1;
                }
                int i14 = i12 % i13;
                if (i14 != 0) {
                    i10 = (i13 - i14) + i12;
                } else {
                    i10 = i12;
                }
                n a2 = ((o) p0Var.e).a();
                a2.f13960f = i10;
                o oVar = new o(a2);
                try {
                    b10 = b(oVar);
                    p0 p0Var2 = this.f14010p;
                    this.f14010p = new p0((b2.x) p0Var2.f13978c, (b2.x) p0Var2.d, p0Var2.f13976a, p0Var2.f13977b, oVar, (c2.j) p0Var2.f13979f);
                } catch (w e7) {
                    e.addSuppressed(e7);
                    i11 = i10;
                }
            }
            if (((o) this.f14010p.e).e) {
                this.X = true;
            }
            throw e;
        }
        this.f14014t = b10;
        o0 o0Var = new o0(this, (o) this.f14010p.e);
        this.f14004j = o0Var;
        b10.f13899j.a(o0Var);
        if (this.f14014t.c()) {
            p0 p0Var3 = this.f14010p;
            if (((o) p0Var3.e).f13973k) {
                h0 h0Var = this.f14014t;
                b2.x xVar = (b2.x) p0Var3.f13978c;
                h0Var.d(xVar.N, xVar.O);
            }
        }
        j2.k kVar = this.f14007m;
        if (kVar != null) {
            this.f14014t.f(kVar);
        }
        if (p()) {
            this.f14014t.f13893a.setVolume(this.H);
        }
        this.S.getClass();
        AudioDeviceInfo audioDeviceInfo = this.T;
        if (audioDeviceInfo != null) {
            this.f14014t.f13893a.setPreferredDevice(audioDeviceInfo);
        }
        this.F = true;
        int audioSessionId = this.f14014t.f13893a.getAudioSessionId();
        if (audioSessionId != this.Q) {
            z10 = true;
        }
        this.Q = audioSessionId;
        x xVar2 = this.f14008n;
        if (xVar2 != 0) {
            int i15 = ((o) this.f14010p.e).f13966a;
            xVar2.D(new Object());
            if (z10) {
                this.R = true;
                p0 p0Var4 = this.f14010p;
                n a10 = ((o) p0Var4.e).a();
                a10.h = this.Q;
                this.f14010p = new p0((b2.x) p0Var4.f13978c, (b2.x) p0Var4.d, p0Var4.f13976a, p0Var4.f13977b, new o(a10), (c2.j) p0Var4.f13979f);
                p0 p0Var5 = this.f14009o;
                if (p0Var5 != null) {
                    n a11 = ((o) p0Var5.e).a();
                    a11.h = this.Q;
                    this.f14009o = new p0((b2.x) p0Var5.f13978c, (b2.x) p0Var5.d, p0Var5.f13976a, p0Var5.f13977b, new o(a11), (c2.j) p0Var5.f13979f);
                }
                this.f14008n.onAudioSessionIdChanged(this.Q);
            }
        }
        return true;
    }

    public final boolean p() {
        if (this.f14014t != null) {
            return true;
        }
        return false;
    }

    public final void q() {
        this.O = false;
        if (p()) {
            h0 h0Var = this.f14014t;
            k0 k0Var = h0Var.f13896f;
            k0Var.f13935k = 0L;
            k0Var.f13944t = 0;
            k0Var.f13943s = 0;
            k0Var.f13936l = 0L;
            k0Var.f13948y = -9223372036854775807L;
            k0Var.f13949z = -9223372036854775807L;
            if (k0Var.f13945u == -9223372036854775807L) {
                k0Var.h.a(0);
            }
            k0Var.f13946w = k0Var.a();
            if (!h0Var.f13900k || h0Var.c()) {
                h0Var.f13893a.pause();
            }
        }
    }

    public final void r() {
        this.O = true;
        if (p()) {
            h0 h0Var = this.f14014t;
            k0 k0Var = h0Var.f13896f;
            if (k0Var.f13945u != -9223372036854775807L) {
                k0Var.f13929b.getClass();
                k0Var.f13945u = e2.m0.S(SystemClock.elapsedRealtime());
            }
            k0Var.f13934j = e2.m0.Y(k0Var.e, k0Var.a());
            k0Var.h.a(0);
            if (!h0Var.f13900k || h0Var.c()) {
                h0Var.f13893a.play();
            }
        }
    }

    public final void s() {
        if (!this.M) {
            this.M = true;
            if (this.f14014t.c()) {
                this.N = false;
            }
            h0 h0Var = this.f14014t;
            if (!h0Var.f13900k) {
                h0Var.f13900k = true;
                k0 k0Var = h0Var.f13896f;
                long b10 = h0Var.b();
                k0Var.f13946w = k0Var.a();
                k0Var.f13929b.getClass();
                k0Var.f13945u = e2.m0.S(SystemClock.elapsedRealtime());
                k0Var.f13947x = b10;
                h0Var.f13893a.stop();
                h0Var.f13905p = 0;
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
        throw new UnsupportedOperationException("Method not decompiled: k2.s0.u(long):void");
    }

    public final void v() {
        if (this.f14010p != null) {
            p0 p0Var = this.f14009o;
            if (p0Var != null) {
                this.f14010p = p0Var;
                this.f14009o = null;
            }
            try {
                o c10 = ((j0) this.f14012r).c(i((b2.x) this.f14010p.d));
                p0 p0Var2 = this.f14010p;
                this.f14010p = new p0((b2.x) p0Var2.f13978c, (b2.x) p0Var2.d, p0Var2.f13976a, p0Var2.f13977b, c10, (c2.j) p0Var2.f13979f);
            } catch (i e) {
                throw new IllegalStateException(new v(e, (b2.x) this.f14010p.f13978c));
            }
        }
        f();
    }

    public final void w() {
        f();
        e9.l0 listIterator = this.f14002g.listIterator(0);
        while (listIterator.hasNext()) {
            ((c2.n) listIterator.next()).reset();
        }
        this.e.reset();
        this.f14001f.reset();
        c2.j jVar = this.f14011q;
        if (jVar != null) {
            e9.n0 n0Var = jVar.f4143a;
            for (int i10 = 0; i10 < n0Var.size(); i10++) {
                c2.n nVar = (c2.n) n0Var.get(i10);
                nVar.d(c2.l.f4149b);
                nVar.reset();
            }
            jVar.f4144b.clear();
            jVar.f4145c = new ByteBuffer[0];
            c2.k kVar = c2.k.e;
            jVar.d = false;
        }
        this.O = false;
        this.X = false;
    }

    public final void x() {
        if (p()) {
            h0 h0Var = this.f14014t;
            b2.a1 a1Var = this.f14017x;
            AudioTrack audioTrack = h0Var.f13893a;
            try {
                audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(e2.m0.h(a1Var.f2077a, 0.1f, h0Var.f13895c)).setPitch(e2.m0.h(a1Var.f2078b, 0.1f, 8.0f)).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                e2.a.m("AudioTrackAudioOutput", "Failed to set playback params", e);
            }
            k0 k0Var = h0Var.f13896f;
            k0Var.f13933i = audioTrack.getPlaybackParams().getSpeed();
            k0Var.h.a(0);
            k0Var.f13935k = 0L;
            k0Var.f13944t = 0;
            k0Var.f13943s = 0;
            k0Var.f13936l = 0L;
            k0Var.f13948y = -9223372036854775807L;
            k0Var.f13949z = -9223372036854775807L;
            PlaybackParams playbackParams = this.f14014t.f13893a.getPlaybackParams();
            this.f14017x = new b2.a1(playbackParams.getSpeed(), playbackParams.getPitch());
        }
    }

    public final void y(p pVar) {
        if (pVar.equals(this.f14012r)) {
            return;
        }
        ((j0) this.f14012r).d();
        this.f14012r = pVar;
        n0 n0Var = this.f14013s;
        if (n0Var != null) {
            j0 j0Var = (j0) pVar;
            j0Var.f();
            if (j0Var.f13920f == null) {
                j0Var.f13920f = new e2.r(Thread.currentThread());
            }
            j0Var.f13920f.a(n0Var);
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
