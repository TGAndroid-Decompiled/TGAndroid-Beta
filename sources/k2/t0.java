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
import ig.e2;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import v7.u6;
public final class t0 implements z {
    public static final AtomicInteger f14799c0 = new AtomicInteger();
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
    public final Context f14800a;
    public long f14801a0;
    public final androidx.biometric.e f14802b;
    public Handler f14803b0;
    public final m0 f14804c;
    public final c1 d;
    public final c2.u e;
    public final b1 f14805f;
    public final x1 f14806g;
    public final ArrayDeque h;
    public int f14807i;
    public p0 f14808j;
    public final s0 f14809k;
    public final s0 f14810l;
    public j2.k f14811m;
    public x f14812n;
    public q0 f14813o;
    public q0 f14814p;
    public c2.j f14815q;
    public p f14816r;
    public o0 f14817s;
    public i0 f14818t;
    public b2.f f14819u;
    public r0 v;
    public r0 f14820w;
    public b2.z0 f14821x;
    public boolean f14822y;
    public long f14823z;

    public t0(o4 o4Var) {
        Context applicationContext;
        int deviceId;
        Context context = (Context) o4Var.f5628b;
        if (context == null) {
            applicationContext = null;
        } else {
            applicationContext = context.getApplicationContext();
        }
        this.f14800a = applicationContext;
        this.f14819u = b2.f.f3741i;
        this.f14802b = (androidx.biometric.e) o4Var.d;
        this.f14807i = 0;
        this.f14816r = (k0) o4Var.f5630f;
        ?? oVar = new c2.o();
        this.f14804c = oVar;
        ?? oVar2 = new c2.o();
        oVar2.f14663m = e2.m0.f8254b;
        this.d = oVar2;
        this.e = new c2.o();
        this.f14805f = new c2.o();
        this.f14806g = e9.n0.z(oVar2, oVar);
        this.H = 1.0f;
        this.Q = 0;
        this.S = new Object();
        b2.z0 z0Var = b2.z0.d;
        this.f14820w = new r0(z0Var, 0L, 0L);
        this.f14821x = z0Var;
        this.f14822y = false;
        this.h = new ArrayDeque();
        this.f14809k = new s0();
        this.f14810l = new s0();
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
        if (this.f14818t != null) {
            this.S.getClass();
        }
        this.S = gVar;
    }

    public final void B(java.nio.ByteBuffer r23) {
        throw new UnsupportedOperationException("Method not decompiled: k2.t0.B(java.nio.ByteBuffer):void");
    }

    public final void C(b2.z0 z0Var) {
        if (D()) {
            this.f14821x = z0Var;
            x();
            return;
        }
        b2.z0 z0Var2 = new b2.z0(e2.m0.h(z0Var.f4156a, 0.1f, 8.0f), e2.m0.h(z0Var.f4157b, 0.1f, 8.0f));
        this.f14821x = z0Var2;
        r0 r0Var = new r0(z0Var2, -9223372036854775807L, -9223372036854775807L);
        if (p()) {
            this.v = r0Var;
        } else {
            this.f14820w = r0Var;
        }
    }

    public final boolean D() {
        q0 q0Var = this.f14814p;
        if (q0Var != null && ((o) q0Var.e).f14772j) {
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
        androidx.biometric.e eVar = this.f14802b;
        if (!D) {
            if (!this.V && q0.a(this.f14814p)) {
                int i10 = ((b2.w) this.f14814p.f14782c).M;
                z0Var = this.f14821x;
                c2.t tVar = (c2.t) eVar.d;
                float f7 = z0Var.f4156a;
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
                float f10 = z0Var.f4157b;
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
            this.f14821x = z0Var;
        } else {
            z0Var = b2.z0.d;
        }
        b2.z0 z0Var2 = z0Var;
        if (!this.V && q0.a(this.f14814p)) {
            int i11 = ((b2.w) this.f14814p.f14782c).M;
            z12 = this.f14822y;
            ((y0) eVar.f2820c).f14856o = z12;
        }
        this.f14822y = z12;
        this.h.add(new r0(z0Var2, Math.max(0L, j10), e2.m0.Y(((o) this.f14814p.e).f14767b, l())));
        c2.j jVar = (c2.j) this.f14814p.f14783f;
        this.f14815q = jVar;
        jVar.a();
        x xVar = this.f14812n;
        if (xVar != null) {
            xVar.onSkipSilenceEnabledChanged(this.f14822y);
        }
    }

    public final i0 b(o oVar) {
        try {
            return ((k0) this.f14816r).a(oVar);
        } catch (m e) {
            w wVar = new w(oVar.f14767b, oVar.f14768c, oVar.f14766a, oVar.f14769f, (b2.w) this.f14814p.f14782c, oVar.e, e);
            x xVar = this.f14812n;
            if (xVar != null) {
                xVar.I(wVar);
            }
            throw wVar;
        }
    }

    public final void c(b2.w wVar, int[] iArr) {
        c2.j jVar;
        b2.w wVar2;
        int i10;
        int i11;
        if (this.f14817s == null && this.f14800a != null) {
            o0 o0Var = new o0(this);
            this.f14817s = o0Var;
            k0 k0Var = (k0) this.f14816r;
            k0Var.f();
            if (k0Var.f14724f == null) {
                k0Var.f14724f = new e2.r(Thread.currentThread());
            }
            k0Var.f14724f.a(o0Var);
        }
        String str = wVar.f4132s;
        int i12 = wVar.K;
        int i13 = wVar.M;
        if ("audio/raw".equals(str)) {
            u6.g(e2.m0.M(i13));
            int u10 = e2.m0.u(i13) * i12;
            ?? g0Var = new e9.g0(4);
            g0Var.d(this.f14806g);
            g0Var.c(this.e);
            c2.n[] nVarArr = (c2.n[]) this.f14802b.f2819b;
            int length = nVarArr.length;
            e9.s.d(length, nVarArr);
            g0Var.e(length);
            System.arraycopy(nVarArr, 0, g0Var.f8446a, g0Var.f8447b, length);
            g0Var.f8447b += length;
            jVar = new c2.j(g0Var.f());
            if (jVar.equals(this.f14815q)) {
                jVar = this.f14815q;
            }
            int i14 = wVar.N;
            int i15 = wVar.O;
            c1 c1Var = this.d;
            c1Var.f14659i = i14;
            c1Var.f14660j = i15;
            this.f14804c.f14754i = iArr;
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
                throw new v(e7, wVar);
            }
        } else {
            jVar = new c2.j(x1.e);
            wVar2 = wVar;
            i10 = -1;
            i11 = -1;
        }
        c2.j jVar2 = jVar;
        j i19 = i(wVar2);
        b2.w wVar3 = i19.f14710a;
        try {
            o c10 = ((k0) this.f14816r).c(i19);
            boolean z10 = c10.e;
            if (c10.f14766a != 0) {
                if (c10.f14768c != 0) {
                    this.X = false;
                    q0 q0Var = new q0(wVar, wVar2, i10, i11, c10, jVar2);
                    if (p()) {
                        this.f14813o = q0Var;
                        return;
                    } else {
                        this.f14814p = q0Var;
                        return;
                    }
                }
                throw new v("Invalid output channel config (isOffload=" + z10 + ")", wVar3);
            }
            throw new v("Invalid output encoding (isOffload=" + z10 + ")", wVar3);
        } catch (i e10) {
            throw new v(e10, wVar);
        }
    }

    public final void d(long r10) {
        throw new UnsupportedOperationException("Method not decompiled: k2.t0.d(long):void");
    }

    public final boolean e() {
        throw new UnsupportedOperationException("Method not decompiled: k2.t0.e():boolean");
    }

    public final void f() {
        d0 d0Var;
        if (p()) {
            this.f14823z = 0L;
            this.A = 0L;
            this.B = 0L;
            this.C = 0L;
            this.Y = false;
            this.D = 0;
            this.f14820w = new r0(this.f14821x, 0L, 0L);
            this.G = 0L;
            this.v = null;
            this.h.clear();
            this.I = null;
            this.J = 0;
            this.K = null;
            this.M = false;
            this.L = false;
            this.N = false;
            this.d.f14665o = 0L;
            c2.j jVar = (c2.j) this.f14814p.f14783f;
            this.f14815q = jVar;
            jVar.a();
            this.f14808j = null;
            q0 q0Var = this.f14813o;
            if (q0Var != null) {
                this.f14814p = q0Var;
                this.f14813o = null;
            }
            f14799c0.incrementAndGet();
            i0 i0Var = this.f14818t;
            if (i0Var.f14697f.d.getPlayState() == 3) {
                i0Var.f14694a.pause();
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29 && i0Var.c()) {
                h0 h0Var = i0Var.f14699i;
                h0Var.getClass();
                h0.a(h0Var);
            }
            if (i10 >= 24 && (d0Var = i0Var.e) != null) {
                d0.b(d0Var);
                i0Var.e = null;
            }
            AudioTrack audioTrack = i0Var.f14694a;
            e2.r rVar = i0Var.f14700j;
            Handler q6 = e2.m0.q(null);
            synchronized (i0.f14692t) {
                try {
                    if (i0.f14693u == null) {
                        i0.f14693u = Executors.newSingleThreadScheduledExecutor(new e2.l0(0));
                    }
                    i0.v++;
                    i0.f14693u.schedule(new e2(audioTrack, q6, rVar, 2), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f14818t = null;
        }
        s0 s0Var = this.f14810l;
        s0Var.f14793a = null;
        s0Var.f14794b = -9223372036854775807L;
        s0Var.f14795c = -9223372036854775807L;
        s0 s0Var2 = this.f14809k;
        s0Var2.f14793a = null;
        s0Var2.f14794b = -9223372036854775807L;
        s0Var2.f14795c = -9223372036854775807L;
        this.Z = 0L;
        this.f14801a0 = 0L;
        Handler handler = this.f14803b0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final long g() {
        boolean z10;
        if (!p()) {
            return -9223372036854775807L;
        }
        if (q0.a(this.f14814p)) {
            return e2.m0.Y(((o) this.f14814p.e).f14767b, this.f14818t.f14694a.getBufferSizeInFrames());
        }
        long bufferSizeInFrames = this.f14818t.f14694a.getBufferSizeInFrames();
        int j10 = c3.b.j(((o) this.f14814p.e).f14766a);
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
            long min = Math.min(this.f14818t.a(), e2.m0.Y(((o) this.f14814p.e).f14767b, l()));
            while (true) {
                arrayDeque = this.h;
                if (arrayDeque.isEmpty() || min < ((r0) arrayDeque.getFirst()).f14789c) {
                    break;
                }
                this.f14820w = (r0) arrayDeque.remove();
            }
            r0 r0Var = this.f14820w;
            long j11 = min - r0Var.f14789c;
            long B = e2.m0.B(j11, r0Var.f14787a.f4156a);
            boolean isEmpty = arrayDeque.isEmpty();
            androidx.biometric.e eVar = this.f14802b;
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
                r0 r0Var2 = this.f14820w;
                j10 = r0Var2.f14788b + j11;
                r0Var2.d = j11 - B;
            } else {
                r0 r0Var3 = this.f14820w;
                j10 = r0Var3.f14788b + B + r0Var3.d;
            }
            long j13 = ((y0) eVar.f2820c).f14858q;
            long Y = e2.m0.Y(((o) this.f14814p.e).f14767b, j13) + j10;
            long j14 = this.Z;
            if (j13 > j14) {
                long Y2 = e2.m0.Y(((o) this.f14814p.e).f14767b, j13 - j14);
                this.Z = j13;
                this.f14801a0 += Y2;
                if (this.f14803b0 == null) {
                    this.f14803b0 = new Handler(Looper.myLooper());
                }
                this.f14803b0.removeCallbacksAndMessages(null);
                this.f14803b0.postDelayed(new bc(this, 28), 100L);
            }
            return Y;
        }
        return Long.MIN_VALUE;
    }

    public final j i(b2.w wVar) {
        boolean z10;
        j jVar = new j(wVar);
        jVar.f14711b = this.f14819u;
        if (this.f14807i != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        jVar.d = z10;
        jVar.f14712c = this.T;
        jVar.e = this.Q;
        jVar.f14714g = this.V;
        jVar.h = -1;
        jVar.f14713f = this.U;
        return new j(jVar);
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
        int i10 = ((k0) this.f14816r).b(i(wVar)).d;
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
        if (q0.a(this.f14814p)) {
            long j10 = this.B;
            long j11 = this.f14814p.f14781b;
            return ((j10 + j11) - 1) / j11;
        }
        return this.C;
    }

    public final boolean m(long r21, int r23, java.nio.ByteBuffer r24) {
        throw new UnsupportedOperationException("Method not decompiled: k2.t0.m(long, int, java.nio.ByteBuffer):boolean");
    }

    public final boolean n() {
        if (p()) {
            if (Build.VERSION.SDK_INT < 29 || !this.f14818t.c() || !this.N) {
                long l4 = l();
                long a2 = this.f14818t.a();
                i0 i0Var = this.f14818t;
                i0Var.getClass();
                if (l4 > e2.m0.a0(a2, i0Var.f14694a.getSampleRate(), 1000000L, RoundingMode.UP)) {
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
        s0 s0Var = this.f14809k;
        boolean z10 = false;
        if (s0Var.f14793a != null && (f14799c0.get() > 0 || SystemClock.elapsedRealtime() < s0Var.f14795c)) {
            return false;
        }
        try {
            b10 = b((o) this.f14814p.e);
        } catch (w e) {
            int i11 = ((o) this.f14814p.e).f14769f;
            while (i11 > 1000000) {
                int i12 = i11 / 2;
                q0 q0Var = this.f14814p;
                int i13 = q0Var.f14781b;
                if (i13 == -1) {
                    i13 = 1;
                }
                int i14 = i12 % i13;
                if (i14 != 0) {
                    i10 = (i13 - i14) + i12;
                } else {
                    i10 = i12;
                }
                n a2 = ((o) q0Var.e).a();
                a2.f14759f = i10;
                o oVar = new o(a2);
                try {
                    b10 = b(oVar);
                    q0 q0Var2 = this.f14814p;
                    this.f14814p = new q0((b2.w) q0Var2.f14782c, (b2.w) q0Var2.d, q0Var2.f14780a, q0Var2.f14781b, oVar, (c2.j) q0Var2.f14783f);
                } catch (w e7) {
                    e.addSuppressed(e7);
                    i11 = i10;
                }
            }
            if (((o) this.f14814p.e).e) {
                this.X = true;
            }
            throw e;
        }
        this.f14818t = b10;
        p0 p0Var = new p0(this, (o) this.f14814p.e);
        this.f14808j = p0Var;
        b10.f14700j.a(p0Var);
        if (this.f14818t.c()) {
            q0 q0Var3 = this.f14814p;
            if (((o) q0Var3.e).f14773k) {
                i0 i0Var = this.f14818t;
                b2.w wVar = (b2.w) q0Var3.f14782c;
                i0Var.d(wVar.N, wVar.O);
            }
        }
        j2.k kVar = this.f14811m;
        if (kVar != null) {
            this.f14818t.f(kVar);
        }
        if (p()) {
            this.f14818t.f14694a.setVolume(this.H);
        }
        this.S.getClass();
        AudioDeviceInfo audioDeviceInfo = this.T;
        if (audioDeviceInfo != null) {
            this.f14818t.f14694a.setPreferredDevice(audioDeviceInfo);
        }
        this.F = true;
        int audioSessionId = this.f14818t.f14694a.getAudioSessionId();
        if (audioSessionId != this.Q) {
            z10 = true;
        }
        this.Q = audioSessionId;
        x xVar = this.f14812n;
        if (xVar != 0) {
            int i15 = ((o) this.f14814p.e).f14766a;
            xVar.P(new Object());
            if (z10) {
                this.R = true;
                q0 q0Var4 = this.f14814p;
                n a10 = ((o) q0Var4.e).a();
                a10.h = this.Q;
                this.f14814p = new q0((b2.w) q0Var4.f14782c, (b2.w) q0Var4.d, q0Var4.f14780a, q0Var4.f14781b, new o(a10), (c2.j) q0Var4.f14783f);
                q0 q0Var5 = this.f14813o;
                if (q0Var5 != null) {
                    n a11 = ((o) q0Var5.e).a();
                    a11.h = this.Q;
                    this.f14813o = new q0((b2.w) q0Var5.f14782c, (b2.w) q0Var5.d, q0Var5.f14780a, q0Var5.f14781b, new o(a11), (c2.j) q0Var5.f14783f);
                }
                this.f14812n.onAudioSessionIdChanged(this.Q);
            }
        }
        return true;
    }

    public final boolean p() {
        if (this.f14818t != null) {
            return true;
        }
        return false;
    }

    public final void q() {
        this.O = false;
        if (p()) {
            i0 i0Var = this.f14818t;
            l0 l0Var = i0Var.f14697f;
            l0Var.f14739k = 0L;
            l0Var.f14748t = 0;
            l0Var.f14747s = 0;
            l0Var.f14740l = 0L;
            l0Var.f14752y = -9223372036854775807L;
            l0Var.f14753z = -9223372036854775807L;
            if (l0Var.f14749u == -9223372036854775807L) {
                l0Var.h.a(0);
            }
            l0Var.f14750w = l0Var.a();
            if (!i0Var.f14701k || i0Var.c()) {
                i0Var.f14694a.pause();
            }
        }
    }

    public final void r() {
        this.O = true;
        if (p()) {
            i0 i0Var = this.f14818t;
            l0 l0Var = i0Var.f14697f;
            if (l0Var.f14749u != -9223372036854775807L) {
                l0Var.f14733b.getClass();
                l0Var.f14749u = e2.m0.S(SystemClock.elapsedRealtime());
            }
            l0Var.f14738j = e2.m0.Y(l0Var.e, l0Var.a());
            l0Var.h.a(0);
            if (!i0Var.f14701k || i0Var.c()) {
                i0Var.f14694a.play();
            }
        }
    }

    public final void s() {
        if (!this.M) {
            this.M = true;
            if (this.f14818t.c()) {
                this.N = false;
            }
            i0 i0Var = this.f14818t;
            if (!i0Var.f14701k) {
                i0Var.f14701k = true;
                l0 l0Var = i0Var.f14697f;
                long b10 = i0Var.b();
                l0Var.f14750w = l0Var.a();
                l0Var.f14733b.getClass();
                l0Var.f14749u = e2.m0.S(SystemClock.elapsedRealtime());
                l0Var.f14751x = b10;
                i0Var.f14694a.stop();
                i0Var.f14706p = 0;
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
        if (this.f14814p != null) {
            q0 q0Var = this.f14813o;
            if (q0Var != null) {
                this.f14814p = q0Var;
                this.f14813o = null;
            }
            try {
                o c10 = ((k0) this.f14816r).c(i((b2.w) this.f14814p.d));
                q0 q0Var2 = this.f14814p;
                this.f14814p = new q0((b2.w) q0Var2.f14782c, (b2.w) q0Var2.d, q0Var2.f14780a, q0Var2.f14781b, c10, (c2.j) q0Var2.f14783f);
            } catch (i e) {
                throw new IllegalStateException(new v(e, (b2.w) this.f14814p.f14782c));
            }
        }
        f();
    }

    public final void w() {
        f();
        e9.l0 listIterator = this.f14806g.listIterator(0);
        while (listIterator.hasNext()) {
            ((c2.n) listIterator.next()).reset();
        }
        this.e.reset();
        this.f14805f.reset();
        c2.j jVar = this.f14815q;
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
            i0 i0Var = this.f14818t;
            b2.z0 z0Var = this.f14821x;
            AudioTrack audioTrack = i0Var.f14694a;
            try {
                audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(e2.m0.h(z0Var.f4156a, 0.1f, i0Var.f14696c)).setPitch(e2.m0.h(z0Var.f4157b, 0.1f, 8.0f)).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                e2.a.m("AudioTrackAudioOutput", "Failed to set playback params", e);
            }
            l0 l0Var = i0Var.f14697f;
            l0Var.f14737i = audioTrack.getPlaybackParams().getSpeed();
            l0Var.h.a(0);
            l0Var.f14739k = 0L;
            l0Var.f14748t = 0;
            l0Var.f14747s = 0;
            l0Var.f14740l = 0L;
            l0Var.f14752y = -9223372036854775807L;
            l0Var.f14753z = -9223372036854775807L;
            PlaybackParams playbackParams = this.f14818t.f14694a.getPlaybackParams();
            this.f14821x = new b2.z0(playbackParams.getSpeed(), playbackParams.getPitch());
        }
    }

    public final void y(p pVar) {
        if (pVar.equals(this.f14816r)) {
            return;
        }
        ((k0) this.f14816r).d();
        this.f14816r = pVar;
        o0 o0Var = this.f14817s;
        if (o0Var != null) {
            k0 k0Var = (k0) pVar;
            k0Var.f();
            if (k0Var.f14724f == null) {
                k0Var.f14724f = new e2.r(Thread.currentThread());
            }
            k0Var.f14724f.a(o0Var);
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
