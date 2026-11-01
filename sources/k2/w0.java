package k2;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import e9.x1;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import v7.t6;
public final class w0 implements b0 {
    public static final AtomicInteger f10784c0 = new AtomicInteger();
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
    public final Context f10785a;
    public long f10786a0;
    public final android.support.v4.media.session.a0 f10787b;
    public Handler f10788b0;
    public final p0 f10789c;
    public final f1 d;
    public final c2.t e;
    public final e1 f10790f;
    public final x1 f10791g;
    public final ArrayDeque h;
    public int f10792i;
    public s0 f10793j;
    public final v0 f10794k;
    public final v0 f10795l;
    public j2.l f10796m;
    public z f10797n;
    public ji.a f10798o;
    public ji.a f10799p;
    public c2.i f10800q;
    public p f10801r;
    public r0 f10802s;
    public j0 f10803t;
    public b2.f f10804u;
    public u0 v;
    public u0 f10805w;
    public b2.z0 f10806x;
    public boolean f10807y;
    public long f10808z;

    public w0(t0 t0Var) {
        Context applicationContext;
        int deviceId;
        Context context = (Context) t0Var.f10767a;
        if (context == null) {
            applicationContext = null;
        } else {
            applicationContext = context.getApplicationContext();
        }
        this.f10785a = applicationContext;
        this.f10804u = b2.f.f2027i;
        this.f10787b = (android.support.v4.media.session.a0) t0Var.d;
        this.f10792i = 0;
        this.f10801r = (n0) t0Var.f10770f;
        ?? nVar = new c2.n();
        this.f10789c = nVar;
        ?? nVar2 = new c2.n();
        nVar2.f10655m = e2.l0.f6166b;
        this.d = nVar2;
        this.e = new c2.n();
        this.f10790f = new c2.n();
        this.f10791g = e9.n0.z(nVar2, nVar);
        this.H = 1.0f;
        this.Q = 0;
        this.S = new Object();
        b2.z0 z0Var = b2.z0.d;
        this.f10805w = new u0(z0Var, 0L, 0L);
        this.f10806x = z0Var;
        this.f10807y = false;
        this.h = new ArrayDeque();
        this.f10794k = new v0();
        this.f10795l = new v0();
        int i10 = -1;
        if (Build.VERSION.SDK_INT >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i10 = deviceId;
        }
        this.U = i10;
    }

    public static int k(int r10, java.nio.ByteBuffer r11) {
        throw new UnsupportedOperationException("Method not decompiled: k2.w0.k(int, java.nio.ByteBuffer):int");
    }

    public final void A(b2.g gVar) {
        if (this.S.equals(gVar)) {
            return;
        }
        gVar.getClass();
        if (this.f10803t != null) {
            this.S.getClass();
        }
        this.S = gVar;
    }

    public final void B(java.nio.ByteBuffer r23) {
        throw new UnsupportedOperationException("Method not decompiled: k2.w0.B(java.nio.ByteBuffer):void");
    }

    public final void C(b2.z0 z0Var) {
        if (D()) {
            this.f10806x = z0Var;
            x();
            return;
        }
        b2.z0 z0Var2 = new b2.z0(e2.l0.h(z0Var.f2443a, 0.1f, 8.0f), e2.l0.h(z0Var.f2444b, 0.1f, 8.0f));
        this.f10806x = z0Var2;
        u0 u0Var = new u0(z0Var2, -9223372036854775807L, -9223372036854775807L);
        if (p()) {
            this.v = u0Var;
        } else {
            this.f10805w = u0Var;
        }
    }

    public final boolean D() {
        ji.a aVar = this.f10799p;
        if (aVar != null && ((o) aVar.e).f10724j) {
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
        android.support.v4.media.session.a0 a0Var = this.f10787b;
        if (!D) {
            if (!this.V && ji.a.a(this.f10799p)) {
                int i10 = ((b2.x) this.f10799p.f10424c).M;
                z0Var = this.f10806x;
                c2.s sVar = (c2.s) a0Var.d;
                float f7 = z0Var.f2443a;
                sVar.getClass();
                if (f7 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                t6.f(z10);
                if (sVar.f3582c != f7) {
                    sVar.f3582c = f7;
                    sVar.f3585i = true;
                }
                float f10 = z0Var.f2444b;
                if (f10 > 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                t6.f(z11);
                if (sVar.d != f10) {
                    sVar.d = f10;
                    sVar.f3585i = true;
                }
            } else {
                z0Var = b2.z0.d;
            }
            this.f10806x = z0Var;
        } else {
            z0Var = b2.z0.d;
        }
        b2.z0 z0Var2 = z0Var;
        if (!this.V && ji.a.a(this.f10799p)) {
            int i11 = ((b2.x) this.f10799p.f10424c).M;
            z12 = this.f10807y;
            ((b1) a0Var.f876c).f10613o = z12;
        }
        this.f10807y = z12;
        this.h.add(new u0(z0Var2, Math.max(0L, j10), e2.l0.Y(((o) this.f10799p.e).f10719b, l())));
        c2.i iVar = (c2.i) this.f10799p.f10425f;
        this.f10800q = iVar;
        iVar.a();
        z zVar = this.f10797n;
        if (zVar != null) {
            zVar.e(this.f10807y);
        }
    }

    public final j0 b(o oVar) {
        try {
            return ((n0) this.f10801r).a(oVar);
        } catch (m e) {
            y yVar = new y(oVar.f10719b, oVar.f10720c, oVar.f10718a, oVar.f10721f, (b2.x) this.f10799p.f10424c, oVar.e, e);
            z zVar = this.f10797n;
            if (zVar != null) {
                zVar.P(yVar);
            }
            throw yVar;
        }
    }

    public final void c(b2.x xVar, int[] iArr) {
        c2.i iVar;
        b2.x xVar2;
        int i10;
        int i11;
        if (this.f10802s == null && this.f10785a != null) {
            r0 r0Var = new r0(this);
            this.f10802s = r0Var;
            n0 n0Var = (n0) this.f10801r;
            n0Var.f();
            if (n0Var.f10713f == null) {
                n0Var.f10713f = new e2.r(Thread.currentThread());
            }
            n0Var.f10713f.a(r0Var);
        }
        String str = xVar.f2423s;
        int i12 = xVar.K;
        int i13 = xVar.M;
        if ("audio/raw".equals(str)) {
            t6.f(e2.l0.M(i13));
            int u10 = e2.l0.u(i13) * i12;
            ?? g0Var = new e9.g0(4);
            g0Var.d(this.f10791g);
            g0Var.c(this.e);
            c2.m[] mVarArr = (c2.m[]) this.f10787b.f875b;
            int length = mVarArr.length;
            e9.s.d(length, mVarArr);
            g0Var.e(length);
            System.arraycopy(mVarArr, 0, g0Var.f6361a, g0Var.f6362b, length);
            g0Var.f6362b += length;
            iVar = new c2.i(g0Var.f());
            if (iVar.equals(this.f10800q)) {
                iVar = this.f10800q;
            }
            int i14 = xVar.N;
            int i15 = xVar.O;
            f1 f1Var = this.d;
            f1Var.f10651i = i14;
            f1Var.f10652j = i15;
            this.f10789c.f10748i = iArr;
            c2.j jVar = new c2.j(xVar.L, i12, i13);
            try {
                e9.n0 n0Var2 = iVar.f3544a;
                if (!jVar.equals(c2.j.e)) {
                    for (int i16 = 0; i16 < n0Var2.size(); i16++) {
                        c2.m mVar = (c2.m) n0Var2.get(i16);
                        c2.j e = mVar.e(jVar);
                        if (mVar.isActive()) {
                            t6.p(!e.equals(c2.j.e));
                            jVar = e;
                        }
                    }
                    int i17 = jVar.f3548b;
                    int i18 = jVar.f3549c;
                    b2.w a2 = xVar.a();
                    a2.L = i18;
                    a2.K = jVar.f3547a;
                    a2.J = i17;
                    xVar2 = new b2.x(a2);
                    i10 = u10;
                    i11 = e2.l0.u(i18) * i17;
                } else {
                    throw new c2.l(jVar);
                }
            } catch (c2.l e7) {
                throw new x(e7, xVar);
            }
        } else {
            iVar = new c2.i(x1.e);
            xVar2 = xVar;
            i10 = -1;
            i11 = -1;
        }
        c2.i iVar2 = iVar;
        j i19 = i(xVar2);
        b2.x xVar3 = i19.f10668a;
        try {
            o c10 = ((n0) this.f10801r).c(i19);
            boolean z10 = c10.e;
            if (c10.f10718a != 0) {
                if (c10.f10720c != 0) {
                    this.X = false;
                    ji.a aVar = new ji.a(xVar, xVar2, i10, i11, c10, iVar2);
                    if (p()) {
                        this.f10798o = aVar;
                        return;
                    } else {
                        this.f10799p = aVar;
                        return;
                    }
                }
                throw new x("Invalid output channel config (isOffload=" + z10 + ")", xVar3);
            }
            throw new x("Invalid output encoding (isOffload=" + z10 + ")", xVar3);
        } catch (i e10) {
            throw new x(e10, xVar);
        }
    }

    public final void d(long r10) {
        throw new UnsupportedOperationException("Method not decompiled: k2.w0.d(long):void");
    }

    public final boolean e() {
        throw new UnsupportedOperationException("Method not decompiled: k2.w0.e():boolean");
    }

    public final void f() {
        f0 f0Var;
        if (p()) {
            this.f10808z = 0L;
            this.A = 0L;
            this.B = 0L;
            this.C = 0L;
            this.Y = false;
            this.D = 0;
            this.f10805w = new u0(this.f10806x, 0L, 0L);
            this.G = 0L;
            this.v = null;
            this.h.clear();
            this.I = null;
            this.J = 0;
            this.K = null;
            this.M = false;
            this.L = false;
            this.N = false;
            this.d.f10657o = 0L;
            c2.i iVar = (c2.i) this.f10799p.f10425f;
            this.f10800q = iVar;
            iVar.a();
            this.f10793j = null;
            ji.a aVar = this.f10798o;
            if (aVar != null) {
                this.f10799p = aVar;
                this.f10798o = null;
            }
            f10784c0.incrementAndGet();
            j0 j0Var = this.f10803t;
            if (j0Var.f10678f.d.getPlayState() == 3) {
                j0Var.f10675a.pause();
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29 && j0Var.c()) {
                i0 i0Var = j0Var.f10680i;
                i0Var.getClass();
                i0.a(i0Var);
            }
            if (i10 >= 24 && (f0Var = j0Var.e) != null) {
                f0.b(f0Var);
                j0Var.e = null;
            }
            AudioTrack audioTrack = j0Var.f10675a;
            e2.r rVar = j0Var.f10681j;
            Handler q6 = e2.l0.q(null);
            synchronized (j0.f10673t) {
                try {
                    if (j0.f10674u == null) {
                        j0.f10674u = Executors.newSingleThreadScheduledExecutor(new di.n(1));
                    }
                    j0.v++;
                    j0.f10674u.schedule(new a3.l0(audioTrack, q6, rVar, 27), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f10803t = null;
        }
        v0 v0Var = this.f10795l;
        v0Var.f10783c = null;
        v0Var.f10781a = -9223372036854775807L;
        v0Var.f10782b = -9223372036854775807L;
        v0 v0Var2 = this.f10794k;
        v0Var2.f10783c = null;
        v0Var2.f10781a = -9223372036854775807L;
        v0Var2.f10782b = -9223372036854775807L;
        this.Z = 0L;
        this.f10786a0 = 0L;
        Handler handler = this.f10788b0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final long g() {
        boolean z10;
        if (!p()) {
            return -9223372036854775807L;
        }
        if (ji.a.a(this.f10799p)) {
            return e2.l0.Y(((o) this.f10799p.e).f10719b, this.f10803t.f10675a.getBufferSizeInFrames());
        }
        long bufferSizeInFrames = this.f10803t.f10675a.getBufferSizeInFrames();
        int j10 = c3.b.j(((o) this.f10799p.e).f10718a);
        if (j10 != -2147483647) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.p(z10);
        return e2.l0.a0(bufferSizeInFrames, 1000000L, j10, RoundingMode.DOWN);
    }

    public final long h() {
        ArrayDeque arrayDeque;
        long j10;
        c2.r rVar;
        if (p() && !this.F) {
            long min = Math.min(this.f10803t.a(), e2.l0.Y(((o) this.f10799p.e).f10719b, l()));
            while (true) {
                arrayDeque = this.h;
                if (arrayDeque.isEmpty() || min < ((u0) arrayDeque.getFirst()).f10777c) {
                    break;
                }
                this.f10805w = (u0) arrayDeque.remove();
            }
            u0 u0Var = this.f10805w;
            long j11 = min - u0Var.f10777c;
            long B = e2.l0.B(j11, u0Var.f10775a.f2443a);
            boolean isEmpty = arrayDeque.isEmpty();
            android.support.v4.media.session.a0 a0Var = this.f10787b;
            if (isEmpty) {
                c2.s sVar = (c2.s) a0Var.d;
                if (sVar.isActive()) {
                    if (sVar.f3590n >= 1024) {
                        long j12 = sVar.f3589m;
                        sVar.f3586j.getClass();
                        long o10 = j12 - (rVar.f3572i.o() * (rVar.f3573j * rVar.f3568b));
                        int i10 = sVar.h.f3547a;
                        int i11 = sVar.f3584g.f3547a;
                        if (i10 == i11) {
                            j11 = e2.l0.a0(j11, o10, sVar.f3590n, RoundingMode.DOWN);
                        } else {
                            j11 = e2.l0.a0(j11, o10 * i10, sVar.f3590n * i11, RoundingMode.DOWN);
                        }
                    } else {
                        j11 = (long) (sVar.f3582c * j11);
                    }
                }
                u0 u0Var2 = this.f10805w;
                j10 = u0Var2.f10776b + j11;
                u0Var2.d = j11 - B;
            } else {
                u0 u0Var3 = this.f10805w;
                j10 = u0Var3.f10776b + B + u0Var3.d;
            }
            long j13 = ((b1) a0Var.f876c).f10615q;
            long Y = e2.l0.Y(((o) this.f10799p.e).f10719b, j13) + j10;
            long j14 = this.Z;
            if (j13 > j14) {
                long Y2 = e2.l0.Y(((o) this.f10799p.e).f10719b, j13 - j14);
                this.Z = j13;
                this.f10786a0 += Y2;
                if (this.f10788b0 == null) {
                    this.f10788b0 = new Handler(Looper.myLooper());
                }
                this.f10788b0.removeCallbacksAndMessages(null);
                this.f10788b0.postDelayed(new gg.c(this, 21), 100L);
            }
            return Y;
        }
        return Long.MIN_VALUE;
    }

    public final j i(b2.x xVar) {
        boolean z10;
        j jVar = new j(xVar);
        jVar.f10669b = this.f10804u;
        if (this.f10792i != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        jVar.d = z10;
        jVar.f10670c = this.T;
        jVar.e = this.Q;
        jVar.f10672g = this.V;
        jVar.h = -1;
        jVar.f10671f = this.U;
        return new j(jVar);
    }

    public final int j(b2.x xVar) {
        boolean z10;
        if (e2.l0.M(xVar.M) && xVar.M != 2) {
            b2.w a2 = xVar.a();
            a2.L = 2;
            xVar = new b2.x(a2);
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = ((n0) this.f10801r).b(i(xVar)).d;
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
        if (ji.a.a(this.f10799p)) {
            long j10 = this.B;
            long j11 = this.f10799p.f10423b;
            return ((j10 + j11) - 1) / j11;
        }
        return this.C;
    }

    public final boolean m(long r21, int r23, java.nio.ByteBuffer r24) {
        throw new UnsupportedOperationException("Method not decompiled: k2.w0.m(long, int, java.nio.ByteBuffer):boolean");
    }

    public final boolean n() {
        if (p()) {
            if (Build.VERSION.SDK_INT < 29 || !this.f10803t.c() || !this.N) {
                long l4 = l();
                long a2 = this.f10803t.a();
                j0 j0Var = this.f10803t;
                j0Var.getClass();
                if (l4 > e2.l0.a0(a2, j0Var.f10675a.getSampleRate(), 1000000L, RoundingMode.UP)) {
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
        v0 v0Var = this.f10794k;
        boolean z10 = false;
        if (((Exception) v0Var.f10783c) != null && (f10784c0.get() > 0 || SystemClock.elapsedRealtime() < v0Var.f10782b)) {
            return false;
        }
        try {
            b10 = b((o) this.f10799p.e);
        } catch (y e) {
            int i11 = ((o) this.f10799p.e).f10721f;
            while (i11 > 1000000) {
                int i12 = i11 / 2;
                ji.a aVar = this.f10799p;
                int i13 = aVar.f10423b;
                if (i13 == -1) {
                    i13 = 1;
                }
                int i14 = i12 % i13;
                if (i14 != 0) {
                    i10 = (i13 - i14) + i12;
                } else {
                    i10 = i12;
                }
                n a2 = ((o) aVar.e).a();
                a2.f10705f = i10;
                o oVar = new o(a2);
                try {
                    b10 = b(oVar);
                    ji.a aVar2 = this.f10799p;
                    this.f10799p = new ji.a((b2.x) aVar2.f10424c, (b2.x) aVar2.d, aVar2.f10422a, aVar2.f10423b, oVar, (c2.i) aVar2.f10425f);
                } catch (y e7) {
                    e.addSuppressed(e7);
                    i11 = i10;
                }
            }
            if (((o) this.f10799p.e).e) {
                this.X = true;
            }
            throw e;
        }
        this.f10803t = b10;
        s0 s0Var = new s0(this, (o) this.f10799p.e);
        this.f10793j = s0Var;
        b10.f10681j.a(s0Var);
        if (this.f10803t.c()) {
            ji.a aVar3 = this.f10799p;
            if (((o) aVar3.e).f10725k) {
                j0 j0Var = this.f10803t;
                b2.x xVar = (b2.x) aVar3.f10424c;
                j0Var.d(xVar.N, xVar.O);
            }
        }
        j2.l lVar = this.f10796m;
        if (lVar != null) {
            this.f10803t.f(lVar);
        }
        if (p()) {
            this.f10803t.f10675a.setVolume(this.H);
        }
        this.S.getClass();
        AudioDeviceInfo audioDeviceInfo = this.T;
        if (audioDeviceInfo != null) {
            this.f10803t.f10675a.setPreferredDevice(audioDeviceInfo);
        }
        this.F = true;
        int audioSessionId = this.f10803t.f10675a.getAudioSessionId();
        if (audioSessionId != this.Q) {
            z10 = true;
        }
        this.Q = audioSessionId;
        z zVar = this.f10797n;
        if (zVar != 0) {
            int i15 = ((o) this.f10799p.e).f10718a;
            zVar.a0(new Object());
            if (z10) {
                this.R = true;
                ji.a aVar4 = this.f10799p;
                n a10 = ((o) aVar4.e).a();
                a10.h = this.Q;
                this.f10799p = new ji.a((b2.x) aVar4.f10424c, (b2.x) aVar4.d, aVar4.f10422a, aVar4.f10423b, new o(a10), (c2.i) aVar4.f10425f);
                ji.a aVar5 = this.f10798o;
                if (aVar5 != null) {
                    n a11 = ((o) aVar5.e).a();
                    a11.h = this.Q;
                    this.f10798o = new ji.a((b2.x) aVar5.f10424c, (b2.x) aVar5.d, aVar5.f10422a, aVar5.f10423b, new o(a11), (c2.i) aVar5.f10425f);
                }
                this.f10797n.a(this.Q);
            }
        }
        return true;
    }

    public final boolean p() {
        if (this.f10803t != null) {
            return true;
        }
        return false;
    }

    public final void q() {
        this.O = false;
        if (p()) {
            j0 j0Var = this.f10803t;
            o0 o0Var = j0Var.f10678f;
            o0Var.f10733k = 0L;
            o0Var.f10742t = 0;
            o0Var.f10741s = 0;
            o0Var.f10734l = 0L;
            o0Var.f10746y = -9223372036854775807L;
            o0Var.f10747z = -9223372036854775807L;
            if (o0Var.f10743u == -9223372036854775807L) {
                o0Var.h.a(0);
            }
            o0Var.f10744w = o0Var.a();
            if (!j0Var.f10682k || j0Var.c()) {
                j0Var.f10675a.pause();
            }
        }
    }

    public final void r() {
        this.O = true;
        if (p()) {
            j0 j0Var = this.f10803t;
            o0 o0Var = j0Var.f10678f;
            if (o0Var.f10743u != -9223372036854775807L) {
                o0Var.f10727b.getClass();
                o0Var.f10743u = e2.l0.S(SystemClock.elapsedRealtime());
            }
            o0Var.f10732j = e2.l0.Y(o0Var.e, o0Var.a());
            o0Var.h.a(0);
            if (!j0Var.f10682k || j0Var.c()) {
                j0Var.f10675a.play();
            }
        }
    }

    public final void s() {
        if (!this.M) {
            this.M = true;
            if (this.f10803t.c()) {
                this.N = false;
            }
            j0 j0Var = this.f10803t;
            if (!j0Var.f10682k) {
                j0Var.f10682k = true;
                o0 o0Var = j0Var.f10678f;
                long b10 = j0Var.b();
                o0Var.f10744w = o0Var.a();
                o0Var.f10727b.getClass();
                o0Var.f10743u = e2.l0.S(SystemClock.elapsedRealtime());
                o0Var.f10745x = b10;
                j0Var.f10675a.stop();
                j0Var.f10687p = 0;
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
        throw new UnsupportedOperationException("Method not decompiled: k2.w0.u(long):void");
    }

    public final void v() {
        if (this.f10799p != null) {
            ji.a aVar = this.f10798o;
            if (aVar != null) {
                this.f10799p = aVar;
                this.f10798o = null;
            }
            try {
                o c10 = ((n0) this.f10801r).c(i((b2.x) this.f10799p.d));
                ji.a aVar2 = this.f10799p;
                this.f10799p = new ji.a((b2.x) aVar2.f10424c, (b2.x) aVar2.d, aVar2.f10422a, aVar2.f10423b, c10, (c2.i) aVar2.f10425f);
            } catch (i e) {
                throw new IllegalStateException(new x(e, (b2.x) this.f10799p.f10424c));
            }
        }
        f();
    }

    public final void w() {
        f();
        e9.l0 listIterator = this.f10791g.listIterator(0);
        while (listIterator.hasNext()) {
            ((c2.m) listIterator.next()).reset();
        }
        this.e.reset();
        this.f10790f.reset();
        c2.i iVar = this.f10800q;
        if (iVar != null) {
            e9.n0 n0Var = iVar.f3544a;
            for (int i10 = 0; i10 < n0Var.size(); i10++) {
                c2.m mVar = (c2.m) n0Var.get(i10);
                mVar.d(c2.k.f3550b);
                mVar.reset();
            }
            iVar.f3545b.clear();
            iVar.f3546c = new ByteBuffer[0];
            c2.j jVar = c2.j.e;
            iVar.d = false;
        }
        this.O = false;
        this.X = false;
    }

    public final void x() {
        if (p()) {
            j0 j0Var = this.f10803t;
            b2.z0 z0Var = this.f10806x;
            AudioTrack audioTrack = j0Var.f10675a;
            try {
                audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(e2.l0.h(z0Var.f2443a, 0.1f, j0Var.f10677c)).setPitch(e2.l0.h(z0Var.f2444b, 0.1f, 8.0f)).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                e2.a.m("AudioTrackAudioOutput", "Failed to set playback params", e);
            }
            o0 o0Var = j0Var.f10678f;
            o0Var.f10731i = audioTrack.getPlaybackParams().getSpeed();
            o0Var.h.a(0);
            o0Var.f10733k = 0L;
            o0Var.f10742t = 0;
            o0Var.f10741s = 0;
            o0Var.f10734l = 0L;
            o0Var.f10746y = -9223372036854775807L;
            o0Var.f10747z = -9223372036854775807L;
            PlaybackParams playbackParams = this.f10803t.f10675a.getPlaybackParams();
            this.f10806x = new b2.z0(playbackParams.getSpeed(), playbackParams.getPitch());
        }
    }

    public final void y(p pVar) {
        if (pVar.equals(this.f10801r)) {
            return;
        }
        ((n0) this.f10801r).d();
        this.f10801r = pVar;
        r0 r0Var = this.f10802s;
        if (r0Var != null) {
            n0 n0Var = (n0) pVar;
            n0Var.f();
            if (n0Var.f10713f == null) {
                n0Var.f10713f = new e2.r(Thread.currentThread());
            }
            n0Var.f10713f.a(r0Var);
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
