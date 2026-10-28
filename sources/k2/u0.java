package k2;

import a8.yb;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import di.p4;
import f9.s1;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import jg.f1;
public final class u0 implements a0 {
    public static final AtomicInteger f16281c0 = new AtomicInteger();
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
    public final Context f16282a;
    public long f16283a0;
    public final a8.h0 f16284b;
    public Handler f16285b0;
    public final n0 f16286c;
    public final d1 d;
    public final c2.v e;
    public final c1 f16287f;
    public final s1 f16288g;
    public final ArrayDeque h;
    public int f16289i;
    public q0 f16290j;
    public final t0 f16291k;
    public final t0 f16292l;
    public j2.j f16293m;
    public y f16294n;
    public r0 f16295o;
    public r0 f16296p;
    public c2.k f16297q;
    public q f16298r;
    public p0 f16299s;
    public j0 f16300t;
    public b2.f f16301u;
    public s0 v;
    public s0 f16302w;
    public b2.a1 f16303x;
    public boolean f16304y;
    public long f16305z;

    public u0(p4 p4Var) {
        Context applicationContext;
        int deviceId;
        Context context = (Context) p4Var.f8900b;
        if (context == null) {
            applicationContext = null;
        } else {
            applicationContext = context.getApplicationContext();
        }
        this.f16282a = applicationContext;
        this.f16301u = b2.f.f3180i;
        this.f16284b = (a8.h0) p4Var.d;
        this.f16289i = 0;
        this.f16298r = (l0) p4Var.f8902f;
        ?? pVar = new c2.p();
        this.f16286c = pVar;
        ?? pVar2 = new c2.p();
        pVar2.f16143m = e2.n0.f9692b;
        this.d = pVar2;
        this.e = new c2.p();
        this.f16287f = new c2.p();
        this.f16288g = f9.i0.z(pVar2, pVar);
        this.H = 1.0f;
        this.Q = 0;
        this.S = new Object();
        b2.a1 a1Var = b2.a1.d;
        this.f16302w = new s0(a1Var, 0L, 0L);
        this.f16303x = a1Var;
        this.f16304y = false;
        this.h = new ArrayDeque();
        this.f16291k = new t0();
        this.f16292l = new t0();
        int i10 = -1;
        if (Build.VERSION.SDK_INT >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i10 = deviceId;
        }
        this.U = i10;
    }

    public static int k(int r10, java.nio.ByteBuffer r11) {
        throw new UnsupportedOperationException("Method not decompiled: k2.u0.k(int, java.nio.ByteBuffer):int");
    }

    public final void A(b2.g gVar) {
        if (this.S.equals(gVar)) {
            return;
        }
        gVar.getClass();
        if (this.f16300t != null) {
            this.S.getClass();
        }
        this.S = gVar;
    }

    public final void B(java.nio.ByteBuffer r23) {
        throw new UnsupportedOperationException("Method not decompiled: k2.u0.B(java.nio.ByteBuffer):void");
    }

    public final void C(b2.a1 a1Var) {
        if (D()) {
            this.f16303x = a1Var;
            x();
            return;
        }
        b2.a1 a1Var2 = new b2.a1(e2.n0.h(a1Var.f3140a, 0.1f, 8.0f), e2.n0.h(a1Var.f3141b, 0.1f, 8.0f));
        this.f16303x = a1Var2;
        s0 s0Var = new s0(a1Var2, -9223372036854775807L, -9223372036854775807L);
        if (p()) {
            this.v = s0Var;
        } else {
            this.f16302w = s0Var;
        }
    }

    public final boolean D() {
        r0 r0Var = this.f16296p;
        if (r0Var != null && ((p) r0Var.e).f16254j) {
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
        a8.h0 h0Var = this.f16284b;
        if (!D) {
            if (!this.V && r0.a(this.f16296p)) {
                int i10 = ((b2.x) this.f16296p.f16264c).M;
                a1Var = this.f16303x;
                c2.u uVar = (c2.u) h0Var.d;
                float f7 = a1Var.f3140a;
                uVar.getClass();
                if (f7 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                yb.g(z10);
                if (uVar.f5989c != f7) {
                    uVar.f5989c = f7;
                    uVar.f5992i = true;
                }
                float f10 = a1Var.f3141b;
                if (f10 > 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                yb.g(z11);
                if (uVar.d != f10) {
                    uVar.d = f10;
                    uVar.f5992i = true;
                }
            } else {
                a1Var = b2.a1.d;
            }
            this.f16303x = a1Var;
        } else {
            a1Var = b2.a1.d;
        }
        b2.a1 a1Var2 = a1Var;
        if (!this.V && r0.a(this.f16296p)) {
            int i11 = ((b2.x) this.f16296p.f16264c).M;
            z12 = this.f16304y;
            ((z0) h0Var.f512c).f16338o = z12;
        }
        this.f16304y = z12;
        this.h.add(new s0(a1Var2, Math.max(0L, j10), e2.n0.Y(((p) this.f16296p.e).f16249b, l())));
        c2.k kVar = (c2.k) this.f16296p.f16265f;
        this.f16297q = kVar;
        kVar.a();
        y yVar = this.f16294n;
        if (yVar != null) {
            yVar.onSkipSilenceEnabledChanged(this.f16304y);
        }
    }

    public final j0 b(p pVar) {
        try {
            return ((l0) this.f16298r).a(pVar);
        } catch (n e) {
            x xVar = new x(pVar.f16249b, pVar.f16250c, pVar.f16248a, pVar.f16251f, (b2.x) this.f16296p.f16264c, pVar.e, e);
            y yVar = this.f16294n;
            if (yVar != null) {
                yVar.r(xVar);
            }
            throw xVar;
        }
    }

    public final void c(b2.x xVar, int[] iArr) {
        c2.k kVar;
        b2.x xVar2;
        int i10;
        int i11;
        if (this.f16299s == null && this.f16282a != null) {
            p0 p0Var = new p0(this);
            this.f16299s = p0Var;
            l0 l0Var = (l0) this.f16298r;
            l0Var.f();
            if (l0Var.f16206f == null) {
                l0Var.f16206f = new e2.r(Thread.currentThread());
            }
            l0Var.f16206f.a(p0Var);
        }
        String str = xVar.f3586s;
        int i12 = xVar.K;
        int i13 = xVar.M;
        if ("audio/raw".equals(str)) {
            yb.g(e2.n0.M(i13));
            int u10 = e2.n0.u(i13) * i12;
            ?? b0Var = new f9.b0(4);
            b0Var.d(this.f16288g);
            b0Var.c(this.e);
            c2.o[] oVarArr = (c2.o[]) this.f16284b.f511b;
            int length = oVarArr.length;
            f9.o.d(length, oVarArr);
            b0Var.e(length);
            System.arraycopy(oVarArr, 0, b0Var.f10257a, b0Var.f10258b, length);
            b0Var.f10258b += length;
            kVar = new c2.k(b0Var.f());
            if (kVar.equals(this.f16297q)) {
                kVar = this.f16297q;
            }
            int i14 = xVar.N;
            int i15 = xVar.O;
            d1 d1Var = this.d;
            d1Var.f16139i = i14;
            d1Var.f16140j = i15;
            this.f16286c.f16236i = iArr;
            c2.l lVar = new c2.l(xVar.L, i12, i13);
            try {
                f9.i0 i0Var = kVar.f5951a;
                if (!lVar.equals(c2.l.e)) {
                    for (int i16 = 0; i16 < i0Var.size(); i16++) {
                        c2.o oVar = (c2.o) i0Var.get(i16);
                        c2.l e = oVar.e(lVar);
                        if (oVar.isActive()) {
                            yb.p(!e.equals(c2.l.e));
                            lVar = e;
                        }
                    }
                    int i17 = lVar.f5955b;
                    int i18 = lVar.f5956c;
                    b2.w a2 = xVar.a();
                    a2.L = i18;
                    a2.K = lVar.f5954a;
                    a2.J = i17;
                    xVar2 = new b2.x(a2);
                    i10 = u10;
                    i11 = e2.n0.u(i18) * i17;
                } else {
                    throw new c2.n(lVar);
                }
            } catch (c2.n e10) {
                throw new w(e10, xVar);
            }
        } else {
            kVar = new c2.k(s1.e);
            xVar2 = xVar;
            i10 = -1;
            i11 = -1;
        }
        c2.k kVar2 = kVar;
        k i19 = i(xVar2);
        b2.x xVar3 = i19.f16192a;
        try {
            p c10 = ((l0) this.f16298r).c(i19);
            boolean z10 = c10.e;
            if (c10.f16248a != 0) {
                if (c10.f16250c != 0) {
                    this.X = false;
                    r0 r0Var = new r0(xVar, xVar2, i10, i11, c10, kVar2);
                    if (p()) {
                        this.f16295o = r0Var;
                        return;
                    } else {
                        this.f16296p = r0Var;
                        return;
                    }
                }
                throw new w("Invalid output channel config (isOffload=" + z10 + ")", xVar3);
            }
            throw new w("Invalid output encoding (isOffload=" + z10 + ")", xVar3);
        } catch (j e11) {
            throw new w(e11, xVar);
        }
    }

    public final void d(long r10) {
        throw new UnsupportedOperationException("Method not decompiled: k2.u0.d(long):void");
    }

    public final boolean e() {
        throw new UnsupportedOperationException("Method not decompiled: k2.u0.e():boolean");
    }

    public final void f() {
        f0 f0Var;
        if (p()) {
            this.f16305z = 0L;
            this.A = 0L;
            this.B = 0L;
            this.C = 0L;
            this.Y = false;
            this.D = 0;
            this.f16302w = new s0(this.f16303x, 0L, 0L);
            this.G = 0L;
            this.v = null;
            this.h.clear();
            this.I = null;
            this.J = 0;
            this.K = null;
            this.M = false;
            this.L = false;
            this.N = false;
            this.d.f16145o = 0L;
            c2.k kVar = (c2.k) this.f16296p.f16265f;
            this.f16297q = kVar;
            kVar.a();
            this.f16290j = null;
            r0 r0Var = this.f16295o;
            if (r0Var != null) {
                this.f16296p = r0Var;
                this.f16295o = null;
            }
            f16281c0.incrementAndGet();
            j0 j0Var = this.f16300t;
            if (j0Var.f16179f.d.getPlayState() == 3) {
                j0Var.f16176a.pause();
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29 && j0Var.c()) {
                i0 i0Var = j0Var.f16181i;
                i0Var.getClass();
                i0.a(i0Var);
            }
            if (i10 >= 24 && (f0Var = j0Var.e) != null) {
                f0.b(f0Var);
                j0Var.e = null;
            }
            AudioTrack audioTrack = j0Var.f16176a;
            e2.r rVar = j0Var.f16182j;
            Handler q5 = e2.n0.q(null);
            synchronized (j0.f16174t) {
                try {
                    if (j0.f16175u == null) {
                        j0.f16175u = Executors.newSingleThreadScheduledExecutor(new e2.l0(0));
                    }
                    j0.v++;
                    j0.f16175u.schedule(new f1(audioTrack, q5, rVar, 3), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f16300t = null;
        }
        t0 t0Var = this.f16292l;
        t0Var.f16277c = null;
        t0Var.f16275a = -9223372036854775807L;
        t0Var.f16276b = -9223372036854775807L;
        t0 t0Var2 = this.f16291k;
        t0Var2.f16277c = null;
        t0Var2.f16275a = -9223372036854775807L;
        t0Var2.f16276b = -9223372036854775807L;
        this.Z = 0L;
        this.f16283a0 = 0L;
        Handler handler = this.f16285b0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final long g() {
        boolean z10;
        if (!p()) {
            return -9223372036854775807L;
        }
        if (r0.a(this.f16296p)) {
            return e2.n0.Y(((p) this.f16296p.e).f16249b, this.f16300t.f16176a.getBufferSizeInFrames());
        }
        long bufferSizeInFrames = this.f16300t.f16176a.getBufferSizeInFrames();
        int j10 = c3.b.j(((p) this.f16296p.e).f16248a);
        if (j10 != -2147483647) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.p(z10);
        return e2.n0.a0(bufferSizeInFrames, 1000000L, j10, RoundingMode.DOWN);
    }

    public final long h() {
        ArrayDeque arrayDeque;
        long j10;
        c2.t tVar;
        if (p() && !this.F) {
            long min = Math.min(this.f16300t.a(), e2.n0.Y(((p) this.f16296p.e).f16249b, l()));
            while (true) {
                arrayDeque = this.h;
                if (arrayDeque.isEmpty() || min < ((s0) arrayDeque.getFirst()).f16271c) {
                    break;
                }
                this.f16302w = (s0) arrayDeque.remove();
            }
            s0 s0Var = this.f16302w;
            long j11 = min - s0Var.f16271c;
            long B = e2.n0.B(j11, s0Var.f16269a.f3140a);
            boolean isEmpty = arrayDeque.isEmpty();
            a8.h0 h0Var = this.f16284b;
            if (isEmpty) {
                c2.u uVar = (c2.u) h0Var.d;
                if (uVar.isActive()) {
                    if (uVar.f5997n >= 1024) {
                        long j12 = uVar.f5996m;
                        uVar.f5993j.getClass();
                        long o10 = j12 - (tVar.f5979i.o() * (tVar.f5980j * tVar.f5975b));
                        int i10 = uVar.h.f5954a;
                        int i11 = uVar.f5991g.f5954a;
                        if (i10 == i11) {
                            j11 = e2.n0.a0(j11, o10, uVar.f5997n, RoundingMode.DOWN);
                        } else {
                            j11 = e2.n0.a0(j11, o10 * i10, uVar.f5997n * i11, RoundingMode.DOWN);
                        }
                    } else {
                        j11 = (long) (uVar.f5989c * j11);
                    }
                }
                s0 s0Var2 = this.f16302w;
                j10 = s0Var2.f16270b + j11;
                s0Var2.d = j11 - B;
            } else {
                s0 s0Var3 = this.f16302w;
                j10 = s0Var3.f16270b + B + s0Var3.d;
            }
            long j13 = ((z0) h0Var.f512c).f16340q;
            long Y = e2.n0.Y(((p) this.f16296p.e).f16249b, j13) + j10;
            long j14 = this.Z;
            if (j13 > j14) {
                long Y2 = e2.n0.Y(((p) this.f16296p.e).f16249b, j13 - j14);
                this.Z = j13;
                this.f16283a0 += Y2;
                if (this.f16285b0 == null) {
                    this.f16285b0 = new Handler(Looper.myLooper());
                }
                this.f16285b0.removeCallbacksAndMessages(null);
                this.f16285b0.postDelayed(new c(this, 2), 100L);
            }
            return Y;
        }
        return Long.MIN_VALUE;
    }

    public final k i(b2.x xVar) {
        boolean z10;
        k kVar = new k(xVar);
        kVar.f16193b = this.f16301u;
        if (this.f16289i != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        kVar.d = z10;
        kVar.f16194c = this.T;
        kVar.e = this.Q;
        kVar.f16196g = this.V;
        kVar.h = -1;
        kVar.f16195f = this.U;
        return new k(kVar);
    }

    public final int j(b2.x xVar) {
        boolean z10;
        if (e2.n0.M(xVar.M) && xVar.M != 2) {
            b2.w a2 = xVar.a();
            a2.L = 2;
            xVar = new b2.x(a2);
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = ((l0) this.f16298r).b(i(xVar)).d;
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
        if (r0.a(this.f16296p)) {
            long j10 = this.B;
            long j11 = this.f16296p.f16263b;
            return ((j10 + j11) - 1) / j11;
        }
        return this.C;
    }

    public final boolean m(long r21, int r23, java.nio.ByteBuffer r24) {
        throw new UnsupportedOperationException("Method not decompiled: k2.u0.m(long, int, java.nio.ByteBuffer):boolean");
    }

    public final boolean n() {
        if (p()) {
            if (Build.VERSION.SDK_INT < 29 || !this.f16300t.c() || !this.N) {
                long l4 = l();
                long a2 = this.f16300t.a();
                j0 j0Var = this.f16300t;
                j0Var.getClass();
                if (l4 > e2.n0.a0(a2, j0Var.f16176a.getSampleRate(), 1000000L, RoundingMode.UP)) {
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
        j0 b10;
        t0 t0Var = this.f16291k;
        boolean z10 = false;
        if (((Exception) t0Var.f16277c) != null && (f16281c0.get() > 0 || SystemClock.elapsedRealtime() < t0Var.f16276b)) {
            return false;
        }
        try {
            b10 = b((p) this.f16296p.e);
        } catch (x e) {
            int i11 = ((p) this.f16296p.e).f16251f;
            while (i11 > 1000000) {
                int i12 = i11 / 2;
                r0 r0Var = this.f16296p;
                int i13 = r0Var.f16263b;
                if (i13 == -1) {
                    i13 = 1;
                }
                int i14 = i12 % i13;
                if (i14 != 0) {
                    i10 = (i13 - i14) + i12;
                } else {
                    i10 = i12;
                }
                o a2 = ((p) r0Var.e).a();
                a2.f16241f = i10;
                p pVar = new p(a2);
                try {
                    b10 = b(pVar);
                    r0 r0Var2 = this.f16296p;
                    this.f16296p = new r0((b2.x) r0Var2.f16264c, (b2.x) r0Var2.d, r0Var2.f16262a, r0Var2.f16263b, pVar, (c2.k) r0Var2.f16265f);
                } catch (x e10) {
                    e.addSuppressed(e10);
                    i11 = i10;
                }
            }
            if (((p) this.f16296p.e).e) {
                this.X = true;
            }
            throw e;
        }
        this.f16300t = b10;
        q0 q0Var = new q0(this, (p) this.f16296p.e);
        this.f16290j = q0Var;
        b10.f16182j.a(q0Var);
        if (this.f16300t.c()) {
            r0 r0Var3 = this.f16296p;
            if (((p) r0Var3.e).f16255k) {
                j0 j0Var = this.f16300t;
                b2.x xVar = (b2.x) r0Var3.f16264c;
                j0Var.d(xVar.N, xVar.O);
            }
        }
        j2.j jVar = this.f16293m;
        if (jVar != null) {
            this.f16300t.f(jVar);
        }
        if (p()) {
            this.f16300t.f16176a.setVolume(this.H);
        }
        this.S.getClass();
        AudioDeviceInfo audioDeviceInfo = this.T;
        if (audioDeviceInfo != null) {
            this.f16300t.f16176a.setPreferredDevice(audioDeviceInfo);
        }
        this.F = true;
        int audioSessionId = this.f16300t.f16176a.getAudioSessionId();
        if (audioSessionId != this.Q) {
            z10 = true;
        }
        this.Q = audioSessionId;
        y yVar = this.f16294n;
        if (yVar != 0) {
            int i15 = ((p) this.f16296p.e).f16248a;
            yVar.D(new Object());
            if (z10) {
                this.R = true;
                r0 r0Var4 = this.f16296p;
                o a10 = ((p) r0Var4.e).a();
                a10.h = this.Q;
                this.f16296p = new r0((b2.x) r0Var4.f16264c, (b2.x) r0Var4.d, r0Var4.f16262a, r0Var4.f16263b, new p(a10), (c2.k) r0Var4.f16265f);
                r0 r0Var5 = this.f16295o;
                if (r0Var5 != null) {
                    o a11 = ((p) r0Var5.e).a();
                    a11.h = this.Q;
                    this.f16295o = new r0((b2.x) r0Var5.f16264c, (b2.x) r0Var5.d, r0Var5.f16262a, r0Var5.f16263b, new p(a11), (c2.k) r0Var5.f16265f);
                }
                this.f16294n.onAudioSessionIdChanged(this.Q);
            }
        }
        return true;
    }

    public final boolean p() {
        if (this.f16300t != null) {
            return true;
        }
        return false;
    }

    public final void q() {
        this.O = false;
        if (p()) {
            j0 j0Var = this.f16300t;
            m0 m0Var = j0Var.f16179f;
            m0Var.f16221k = 0L;
            m0Var.f16230t = 0;
            m0Var.f16229s = 0;
            m0Var.f16222l = 0L;
            m0Var.f16234y = -9223372036854775807L;
            m0Var.f16235z = -9223372036854775807L;
            if (m0Var.f16231u == -9223372036854775807L) {
                m0Var.h.a(0);
            }
            m0Var.f16232w = m0Var.a();
            if (!j0Var.f16183k || j0Var.c()) {
                j0Var.f16176a.pause();
            }
        }
    }

    public final void r() {
        this.O = true;
        if (p()) {
            j0 j0Var = this.f16300t;
            m0 m0Var = j0Var.f16179f;
            if (m0Var.f16231u != -9223372036854775807L) {
                m0Var.f16215b.getClass();
                m0Var.f16231u = e2.n0.S(SystemClock.elapsedRealtime());
            }
            m0Var.f16220j = e2.n0.Y(m0Var.e, m0Var.a());
            m0Var.h.a(0);
            if (!j0Var.f16183k || j0Var.c()) {
                j0Var.f16176a.play();
            }
        }
    }

    public final void s() {
        if (!this.M) {
            this.M = true;
            if (this.f16300t.c()) {
                this.N = false;
            }
            j0 j0Var = this.f16300t;
            if (!j0Var.f16183k) {
                j0Var.f16183k = true;
                m0 m0Var = j0Var.f16179f;
                long b10 = j0Var.b();
                m0Var.f16232w = m0Var.a();
                m0Var.f16215b.getClass();
                m0Var.f16231u = e2.n0.S(SystemClock.elapsedRealtime());
                m0Var.f16233x = b10;
                j0Var.f16176a.stop();
                j0Var.f16188p = 0;
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
        throw new UnsupportedOperationException("Method not decompiled: k2.u0.u(long):void");
    }

    public final void v() {
        if (this.f16296p != null) {
            r0 r0Var = this.f16295o;
            if (r0Var != null) {
                this.f16296p = r0Var;
                this.f16295o = null;
            }
            try {
                p c10 = ((l0) this.f16298r).c(i((b2.x) this.f16296p.d));
                r0 r0Var2 = this.f16296p;
                this.f16296p = new r0((b2.x) r0Var2.f16264c, (b2.x) r0Var2.d, r0Var2.f16262a, r0Var2.f16263b, c10, (c2.k) r0Var2.f16265f);
            } catch (j e) {
                throw new IllegalStateException(new w(e, (b2.x) this.f16296p.f16264c));
            }
        }
        f();
    }

    public final void w() {
        f();
        f9.g0 listIterator = this.f16288g.listIterator(0);
        while (listIterator.hasNext()) {
            ((c2.o) listIterator.next()).reset();
        }
        this.e.reset();
        this.f16287f.reset();
        c2.k kVar = this.f16297q;
        if (kVar != null) {
            f9.i0 i0Var = kVar.f5951a;
            for (int i10 = 0; i10 < i0Var.size(); i10++) {
                c2.o oVar = (c2.o) i0Var.get(i10);
                oVar.d(c2.m.f5957b);
                oVar.reset();
            }
            kVar.f5952b.clear();
            kVar.f5953c = new ByteBuffer[0];
            c2.l lVar = c2.l.e;
            kVar.d = false;
        }
        this.O = false;
        this.X = false;
    }

    public final void x() {
        if (p()) {
            j0 j0Var = this.f16300t;
            b2.a1 a1Var = this.f16303x;
            AudioTrack audioTrack = j0Var.f16176a;
            try {
                audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(e2.n0.h(a1Var.f3140a, 0.1f, j0Var.f16178c)).setPitch(e2.n0.h(a1Var.f3141b, 0.1f, 8.0f)).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                e2.a.m("AudioTrackAudioOutput", "Failed to set playback params", e);
            }
            m0 m0Var = j0Var.f16179f;
            m0Var.f16219i = audioTrack.getPlaybackParams().getSpeed();
            m0Var.h.a(0);
            m0Var.f16221k = 0L;
            m0Var.f16230t = 0;
            m0Var.f16229s = 0;
            m0Var.f16222l = 0L;
            m0Var.f16234y = -9223372036854775807L;
            m0Var.f16235z = -9223372036854775807L;
            PlaybackParams playbackParams = this.f16300t.f16176a.getPlaybackParams();
            this.f16303x = new b2.a1(playbackParams.getSpeed(), playbackParams.getPitch());
        }
    }

    public final void y(q qVar) {
        if (qVar.equals(this.f16298r)) {
            return;
        }
        ((l0) this.f16298r).d();
        this.f16298r = qVar;
        p0 p0Var = this.f16299s;
        if (p0Var != null) {
            l0 l0Var = (l0) qVar;
            l0Var.f();
            if (l0Var.f16206f == null) {
                l0Var.f16206f = new e2.r(Thread.currentThread());
            }
            l0Var.f16206f.a(p0Var);
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
