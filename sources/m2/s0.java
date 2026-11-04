package m2;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import b8.zb;
import ei.i4;
import g9.s1;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
public final class s0 implements z {
    public static final AtomicInteger f18979c0 = new AtomicInteger();
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
    public d2.g S;
    public AudioDeviceInfo T;
    public int U;
    public boolean V;
    public long W;
    public boolean X;
    public boolean Y;
    public long Z;
    public final Context f18980a;
    public long f18981a0;
    public final k4.j f18982b;
    public Handler f18983b0;
    public final l0 f18984c;
    public final b1 d;
    public final e2.t f18985e;
    public final a1 f18986f;
    public final s1 f18987g;
    public final ArrayDeque h;
    public int f18988i;
    public o0 f18989j;
    public final r0 f18990k;
    public final r0 f18991l;
    public l2.k f18992m;
    public x f18993n;
    public p0 f18994o;
    public p0 f18995p;
    public e2.i f18996q;
    public o f18997r;
    public n0 f18998s;
    public h0 f18999t;
    public d2.f f19000u;
    public q0 v;
    public q0 f19001w;
    public d2.y0 f19002x;
    public boolean f19003y;
    public long f19004z;

    public s0(i4 i4Var) {
        Context applicationContext;
        int deviceId;
        Context context = (Context) i4Var.f10403b;
        if (context == null) {
            applicationContext = null;
        } else {
            applicationContext = context.getApplicationContext();
        }
        this.f18980a = applicationContext;
        this.f19000u = d2.f.f8079i;
        this.f18982b = (k4.j) i4Var.d;
        this.f18988i = 0;
        this.f18997r = (j0) i4Var.f10406f;
        ?? nVar = new e2.n();
        this.f18984c = nVar;
        ?? nVar2 = new e2.n();
        nVar2.f18834m = g2.n0.f11874b;
        this.d = nVar2;
        this.f18985e = new e2.n();
        this.f18986f = new e2.n();
        this.f18987g = g9.i0.v(nVar2, nVar);
        this.H = 1.0f;
        this.Q = 0;
        this.S = new Object();
        d2.y0 y0Var = d2.y0.d;
        this.f19001w = new q0(y0Var, 0L, 0L);
        this.f19002x = y0Var;
        this.f19003y = false;
        this.h = new ArrayDeque();
        this.f18990k = new r0();
        this.f18991l = new r0();
        int i3 = -1;
        if (Build.VERSION.SDK_INT >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i3 = deviceId;
        }
        this.U = i3;
    }

    public static int k(int r10, java.nio.ByteBuffer r11) {
        throw new UnsupportedOperationException("Method not decompiled: m2.s0.k(int, java.nio.ByteBuffer):int");
    }

    public final void A(d2.g gVar) {
        if (this.S.equals(gVar)) {
            return;
        }
        gVar.getClass();
        if (this.f18999t != null) {
            this.S.getClass();
        }
        this.S = gVar;
    }

    public final void B(java.nio.ByteBuffer r23) {
        throw new UnsupportedOperationException("Method not decompiled: m2.s0.B(java.nio.ByteBuffer):void");
    }

    public final void C(d2.y0 y0Var) {
        if (D()) {
            this.f19002x = y0Var;
            x();
            return;
        }
        d2.y0 y0Var2 = new d2.y0(g2.n0.h(y0Var.f8517a, 0.1f, 8.0f), g2.n0.h(y0Var.f8518b, 0.1f, 8.0f));
        this.f19002x = y0Var2;
        q0 q0Var = new q0(y0Var2, -9223372036854775807L, -9223372036854775807L);
        if (p()) {
            this.v = q0Var;
        } else {
            this.f19001w = q0Var;
        }
    }

    public final boolean D() {
        p0 p0Var = this.f18995p;
        if (p0Var != null && ((n) p0Var.f18962e).f18951j) {
            return true;
        }
        return false;
    }

    public final void a(long j10) {
        d2.y0 y0Var;
        boolean z10;
        boolean z11;
        boolean D = D();
        boolean z12 = false;
        k4.j jVar = this.f18982b;
        if (!D) {
            if (!this.V && p0.a(this.f18995p)) {
                int i3 = ((d2.v) this.f18995p.f18961c).M;
                y0Var = this.f19002x;
                e2.s sVar = (e2.s) jVar.f16871c;
                float f10 = y0Var.f8517a;
                sVar.getClass();
                if (f10 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zb.f(z10);
                if (sVar.f9392c != f10) {
                    sVar.f9392c = f10;
                    sVar.f9396i = true;
                }
                float f11 = y0Var.f8518b;
                if (f11 > 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zb.f(z11);
                if (sVar.d != f11) {
                    sVar.d = f11;
                    sVar.f9396i = true;
                }
            } else {
                y0Var = d2.y0.d;
            }
            this.f19002x = y0Var;
        } else {
            y0Var = d2.y0.d;
        }
        d2.y0 y0Var2 = y0Var;
        if (!this.V && p0.a(this.f18995p)) {
            int i10 = ((d2.v) this.f18995p.f18961c).M;
            z12 = this.f19003y;
            ((x0) jVar.f16870b).f19038o = z12;
        }
        this.f19003y = z12;
        this.h.add(new q0(y0Var2, Math.max(0L, j10), g2.n0.Y(((n) this.f18995p.f18962e).f18945b, l())));
        e2.i iVar = (e2.i) this.f18995p.f18963f;
        this.f18996q = iVar;
        iVar.a();
        x xVar = this.f18993n;
        if (xVar != null) {
            xVar.e(this.f19003y);
        }
    }

    public final h0 b(n nVar) {
        try {
            return ((j0) this.f18997r).a(nVar);
        } catch (l e10) {
            w wVar = new w(nVar.f18945b, nVar.f18946c, nVar.f18944a, nVar.f18948f, (d2.v) this.f18995p.f18961c, nVar.f18947e, e10);
            x xVar = this.f18993n;
            if (xVar != null) {
                xVar.N(wVar);
            }
            throw wVar;
        }
    }

    public final void c(d2.v vVar, int[] iArr) {
        e2.i iVar;
        d2.v vVar2;
        int i3;
        int i10;
        if (this.f18998s == null && this.f18980a != null) {
            n0 n0Var = new n0(this);
            this.f18998s = n0Var;
            j0 j0Var = (j0) this.f18997r;
            j0Var.f();
            if (j0Var.f18900f == null) {
                j0Var.f18900f = new g2.s(Thread.currentThread());
            }
            j0Var.f18900f.a(n0Var);
        }
        String str = vVar.f8489s;
        int i11 = vVar.K;
        int i12 = vVar.M;
        if ("audio/raw".equals(str)) {
            zb.f(g2.n0.M(i12));
            int u10 = g2.n0.u(i12) * i11;
            ?? b0Var = new g9.b0(4);
            b0Var.d(this.f18987g);
            b0Var.c(this.f18985e);
            e2.m[] mVarArr = (e2.m[]) this.f18982b.f16869a;
            int length = mVarArr.length;
            g9.o.e(length, mVarArr);
            b0Var.e(length);
            System.arraycopy(mVarArr, 0, b0Var.f12052a, b0Var.f12053b, length);
            b0Var.f12053b += length;
            iVar = new e2.i(b0Var.f());
            if (iVar.equals(this.f18996q)) {
                iVar = this.f18996q;
            }
            int i13 = vVar.N;
            int i14 = vVar.O;
            b1 b1Var = this.d;
            b1Var.f18830i = i13;
            b1Var.f18831j = i14;
            this.f18984c.f18931i = iArr;
            e2.j jVar = new e2.j(vVar.L, i11, i12);
            try {
                g9.i0 i0Var = iVar.f9349a;
                if (!jVar.equals(e2.j.f9352e)) {
                    for (int i15 = 0; i15 < i0Var.size(); i15++) {
                        e2.m mVar = (e2.m) i0Var.get(i15);
                        e2.j d = mVar.d(jVar);
                        if (mVar.isActive()) {
                            zb.p(!d.equals(e2.j.f9352e));
                            jVar = d;
                        }
                    }
                    int i16 = jVar.f9354b;
                    int i17 = jVar.f9355c;
                    d2.u a10 = vVar.a();
                    a10.L = i17;
                    a10.K = jVar.f9353a;
                    a10.J = i16;
                    vVar2 = new d2.v(a10);
                    i3 = u10;
                    i10 = g2.n0.u(i17) * i16;
                } else {
                    throw new e2.l(jVar);
                }
            } catch (e2.l e10) {
                throw new v(e10, vVar);
            }
        } else {
            iVar = new e2.i(s1.f12146e);
            vVar2 = vVar;
            i3 = -1;
            i10 = -1;
        }
        e2.i iVar2 = iVar;
        i i18 = i(vVar2);
        d2.v vVar3 = i18.f18883a;
        try {
            n c2 = ((j0) this.f18997r).c(i18);
            boolean z10 = c2.f18947e;
            if (c2.f18944a != 0) {
                if (c2.f18946c != 0) {
                    this.X = false;
                    p0 p0Var = new p0(vVar, vVar2, i3, i10, c2, iVar2);
                    if (p()) {
                        this.f18994o = p0Var;
                        return;
                    } else {
                        this.f18995p = p0Var;
                        return;
                    }
                }
                throw new v("Invalid output channel config (isOffload=" + z10 + ")", vVar3);
            }
            throw new v("Invalid output encoding (isOffload=" + z10 + ")", vVar3);
        } catch (h e11) {
            throw new v(e11, vVar);
        }
    }

    public final void d(long r10) {
        throw new UnsupportedOperationException("Method not decompiled: m2.s0.d(long):void");
    }

    public final boolean e() {
        throw new UnsupportedOperationException("Method not decompiled: m2.s0.e():boolean");
    }

    public final void f() {
        d0 d0Var;
        if (p()) {
            this.f19004z = 0L;
            this.A = 0L;
            this.B = 0L;
            this.C = 0L;
            this.Y = false;
            this.D = 0;
            this.f19001w = new q0(this.f19002x, 0L, 0L);
            this.G = 0L;
            this.v = null;
            this.h.clear();
            this.I = null;
            this.J = 0;
            this.K = null;
            this.M = false;
            this.L = false;
            this.N = false;
            this.d.f18836o = 0L;
            e2.i iVar = (e2.i) this.f18995p.f18963f;
            this.f18996q = iVar;
            iVar.a();
            this.f18989j = null;
            p0 p0Var = this.f18994o;
            if (p0Var != null) {
                this.f18995p = p0Var;
                this.f18994o = null;
            }
            f18979c0.incrementAndGet();
            h0 h0Var = this.f18999t;
            if (h0Var.f18870f.d.getPlayState() == 3) {
                h0Var.f18866a.pause();
            }
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 29 && h0Var.c()) {
                g0 g0Var = h0Var.f18872i;
                g0Var.getClass();
                g0.a(g0Var);
            }
            if (i3 >= 24 && (d0Var = h0Var.f18869e) != null) {
                d0.b(d0Var);
                h0Var.f18869e = null;
            }
            AudioTrack audioTrack = h0Var.f18866a;
            g2.s sVar = h0Var.f18873j;
            Handler q10 = g2.n0.q(null);
            synchronized (h0.f18864t) {
                try {
                    if (h0.f18865u == null) {
                        h0.f18865u = Executors.newSingleThreadScheduledExecutor(new g2.m0(0));
                    }
                    h0.v++;
                    h0.f18865u.schedule(new lg.y(audioTrack, q10, sVar, 6), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f18999t = null;
        }
        r0 r0Var = this.f18991l;
        r0Var.f18975c = null;
        r0Var.f18973a = -9223372036854775807L;
        r0Var.f18974b = -9223372036854775807L;
        r0 r0Var2 = this.f18990k;
        r0Var2.f18975c = null;
        r0Var2.f18973a = -9223372036854775807L;
        r0Var2.f18974b = -9223372036854775807L;
        this.Z = 0L;
        this.f18981a0 = 0L;
        Handler handler = this.f18983b0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final long g() {
        boolean z10;
        if (!p()) {
            return -9223372036854775807L;
        }
        if (p0.a(this.f18995p)) {
            return g2.n0.Y(((n) this.f18995p.f18962e).f18945b, this.f18999t.f18866a.getBufferSizeInFrames());
        }
        long bufferSizeInFrames = this.f18999t.f18866a.getBufferSizeInFrames();
        int j10 = e3.b.j(((n) this.f18995p.f18962e).f18944a);
        if (j10 != -2147483647) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.p(z10);
        return g2.n0.a0(bufferSizeInFrames, 1000000L, j10, RoundingMode.DOWN);
    }

    public final long h() {
        ArrayDeque arrayDeque;
        long j10;
        e2.r rVar;
        if (p() && !this.F) {
            long min = Math.min(this.f18999t.a(), g2.n0.Y(((n) this.f18995p.f18962e).f18945b, l()));
            while (true) {
                arrayDeque = this.h;
                if (arrayDeque.isEmpty() || min < ((q0) arrayDeque.getFirst()).f18969c) {
                    break;
                }
                this.f19001w = (q0) arrayDeque.remove();
            }
            q0 q0Var = this.f19001w;
            long j11 = min - q0Var.f18969c;
            long B = g2.n0.B(j11, q0Var.f18967a.f8517a);
            boolean isEmpty = arrayDeque.isEmpty();
            k4.j jVar = this.f18982b;
            if (isEmpty) {
                e2.s sVar = (e2.s) jVar.f16871c;
                if (sVar.isActive()) {
                    if (sVar.f9401n >= 1024) {
                        long j12 = sVar.f9400m;
                        sVar.f9397j.getClass();
                        long o10 = j12 - (rVar.f9382i.o() * (rVar.f9383j * rVar.f9377b));
                        int i3 = sVar.h.f9353a;
                        int i10 = sVar.f9395g.f9353a;
                        if (i3 == i10) {
                            j11 = g2.n0.a0(j11, o10, sVar.f9401n, RoundingMode.DOWN);
                        } else {
                            j11 = g2.n0.a0(j11, o10 * i3, sVar.f9401n * i10, RoundingMode.DOWN);
                        }
                    } else {
                        j11 = (long) (sVar.f9392c * j11);
                    }
                }
                q0 q0Var2 = this.f19001w;
                j10 = q0Var2.f18968b + j11;
                q0Var2.d = j11 - B;
            } else {
                q0 q0Var3 = this.f19001w;
                j10 = q0Var3.f18968b + B + q0Var3.d;
            }
            long j13 = ((x0) jVar.f16870b).f19040q;
            long Y = g2.n0.Y(((n) this.f18995p.f18962e).f18945b, j13) + j10;
            long j14 = this.Z;
            if (j13 > j14) {
                long Y2 = g2.n0.Y(((n) this.f18995p.f18962e).f18945b, j13 - j14);
                this.Z = j13;
                this.f18981a0 += Y2;
                if (this.f18983b0 == null) {
                    this.f18983b0 = new Handler(Looper.myLooper());
                }
                this.f18983b0.removeCallbacksAndMessages(null);
                this.f18983b0.postDelayed(new lg.n(this, 9), 100L);
            }
            return Y;
        }
        return Long.MIN_VALUE;
    }

    public final i i(d2.v vVar) {
        boolean z10;
        i iVar = new i(vVar);
        iVar.f18884b = this.f19000u;
        if (this.f18988i != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        iVar.d = z10;
        iVar.f18885c = this.T;
        iVar.f18886e = this.Q;
        iVar.f18888g = this.V;
        iVar.h = -1;
        iVar.f18887f = this.U;
        return new i(iVar);
    }

    public final int j(d2.v vVar) {
        boolean z10;
        if (g2.n0.M(vVar.M) && vVar.M != 2) {
            d2.u a10 = vVar.a();
            a10.L = 2;
            vVar = new d2.v(a10);
            z10 = true;
        } else {
            z10 = false;
        }
        int i3 = ((j0) this.f18997r).b(i(vVar)).d;
        if (i3 != 1) {
            if (i3 != 2) {
                return 0;
            }
            if (!z10) {
                return 2;
            }
        }
        return 1;
    }

    public final long l() {
        if (p0.a(this.f18995p)) {
            long j10 = this.B;
            long j11 = this.f18995p.f18960b;
            return ((j10 + j11) - 1) / j11;
        }
        return this.C;
    }

    public final boolean m(long r21, int r23, java.nio.ByteBuffer r24) {
        throw new UnsupportedOperationException("Method not decompiled: m2.s0.m(long, int, java.nio.ByteBuffer):boolean");
    }

    public final boolean n() {
        if (p()) {
            if (Build.VERSION.SDK_INT < 29 || !this.f18999t.c() || !this.N) {
                long l10 = l();
                long a10 = this.f18999t.a();
                h0 h0Var = this.f18999t;
                h0Var.getClass();
                if (l10 > g2.n0.a0(a10, h0Var.f18866a.getSampleRate(), 1000000L, RoundingMode.UP)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean o() {
        int i3;
        h0 b10;
        r0 r0Var = this.f18990k;
        boolean z10 = false;
        if (((Exception) r0Var.f18975c) != null && (f18979c0.get() > 0 || SystemClock.elapsedRealtime() < r0Var.f18974b)) {
            return false;
        }
        try {
            b10 = b((n) this.f18995p.f18962e);
        } catch (w e10) {
            int i10 = ((n) this.f18995p.f18962e).f18948f;
            while (i10 > 1000000) {
                int i11 = i10 / 2;
                p0 p0Var = this.f18995p;
                int i12 = p0Var.f18960b;
                if (i12 == -1) {
                    i12 = 1;
                }
                int i13 = i11 % i12;
                if (i13 != 0) {
                    i3 = (i12 - i13) + i11;
                } else {
                    i3 = i11;
                }
                m a10 = ((n) p0Var.f18962e).a();
                a10.f18937f = i3;
                n nVar = new n(a10);
                try {
                    b10 = b(nVar);
                    p0 p0Var2 = this.f18995p;
                    this.f18995p = new p0((d2.v) p0Var2.f18961c, (d2.v) p0Var2.d, p0Var2.f18959a, p0Var2.f18960b, nVar, (e2.i) p0Var2.f18963f);
                } catch (w e11) {
                    e10.addSuppressed(e11);
                    i10 = i3;
                }
            }
            if (((n) this.f18995p.f18962e).f18947e) {
                this.X = true;
            }
            throw e10;
        }
        this.f18999t = b10;
        o0 o0Var = new o0(this, (n) this.f18995p.f18962e);
        this.f18989j = o0Var;
        b10.f18873j.a(o0Var);
        if (this.f18999t.c()) {
            p0 p0Var3 = this.f18995p;
            if (((n) p0Var3.f18962e).f18952k) {
                h0 h0Var = this.f18999t;
                d2.v vVar = (d2.v) p0Var3.f18961c;
                h0Var.d(vVar.N, vVar.O);
            }
        }
        l2.k kVar = this.f18992m;
        if (kVar != null) {
            this.f18999t.f(kVar);
        }
        if (p()) {
            this.f18999t.f18866a.setVolume(this.H);
        }
        this.S.getClass();
        AudioDeviceInfo audioDeviceInfo = this.T;
        if (audioDeviceInfo != null) {
            this.f18999t.f18866a.setPreferredDevice(audioDeviceInfo);
        }
        this.F = true;
        int audioSessionId = this.f18999t.f18866a.getAudioSessionId();
        if (audioSessionId != this.Q) {
            z10 = true;
        }
        this.Q = audioSessionId;
        x xVar = this.f18993n;
        if (xVar != 0) {
            int i14 = ((n) this.f18995p.f18962e).f18944a;
            xVar.J(new Object());
            if (z10) {
                this.R = true;
                p0 p0Var4 = this.f18995p;
                m a11 = ((n) p0Var4.f18962e).a();
                a11.h = this.Q;
                this.f18995p = new p0((d2.v) p0Var4.f18961c, (d2.v) p0Var4.d, p0Var4.f18959a, p0Var4.f18960b, new n(a11), (e2.i) p0Var4.f18963f);
                p0 p0Var5 = this.f18994o;
                if (p0Var5 != null) {
                    m a12 = ((n) p0Var5.f18962e).a();
                    a12.h = this.Q;
                    this.f18994o = new p0((d2.v) p0Var5.f18961c, (d2.v) p0Var5.d, p0Var5.f18959a, p0Var5.f18960b, new n(a12), (e2.i) p0Var5.f18963f);
                }
                this.f18993n.a(this.Q);
            }
        }
        return true;
    }

    public final boolean p() {
        if (this.f18999t != null) {
            return true;
        }
        return false;
    }

    public final void q() {
        this.O = false;
        if (p()) {
            h0 h0Var = this.f18999t;
            k0 k0Var = h0Var.f18870f;
            k0Var.f18916k = 0L;
            k0Var.f18925t = 0;
            k0Var.f18924s = 0;
            k0Var.f18917l = 0L;
            k0Var.f18929y = -9223372036854775807L;
            k0Var.f18930z = -9223372036854775807L;
            if (k0Var.f18926u == -9223372036854775807L) {
                k0Var.h.a(0);
            }
            k0Var.f18927w = k0Var.a();
            if (!h0Var.f18874k || h0Var.c()) {
                h0Var.f18866a.pause();
            }
        }
    }

    public final void r() {
        this.O = true;
        if (p()) {
            h0 h0Var = this.f18999t;
            k0 k0Var = h0Var.f18870f;
            if (k0Var.f18926u != -9223372036854775807L) {
                k0Var.f18909b.getClass();
                k0Var.f18926u = g2.n0.S(SystemClock.elapsedRealtime());
            }
            k0Var.f18915j = g2.n0.Y(k0Var.f18911e, k0Var.a());
            k0Var.h.a(0);
            if (!h0Var.f18874k || h0Var.c()) {
                h0Var.f18866a.play();
            }
        }
    }

    public final void s() {
        if (!this.M) {
            this.M = true;
            if (this.f18999t.c()) {
                this.N = false;
            }
            h0 h0Var = this.f18999t;
            if (!h0Var.f18874k) {
                h0Var.f18874k = true;
                k0 k0Var = h0Var.f18870f;
                long b10 = h0Var.b();
                k0Var.f18927w = k0Var.a();
                k0Var.f18909b.getClass();
                k0Var.f18926u = g2.n0.S(SystemClock.elapsedRealtime());
                k0Var.f18928x = b10;
                h0Var.f18866a.stop();
                h0Var.f18879p = 0;
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
        throw new UnsupportedOperationException("Method not decompiled: m2.s0.u(long):void");
    }

    public final void v() {
        if (this.f18995p != null) {
            p0 p0Var = this.f18994o;
            if (p0Var != null) {
                this.f18995p = p0Var;
                this.f18994o = null;
            }
            try {
                n c2 = ((j0) this.f18997r).c(i((d2.v) this.f18995p.d));
                p0 p0Var2 = this.f18995p;
                this.f18995p = new p0((d2.v) p0Var2.f18961c, (d2.v) p0Var2.d, p0Var2.f18959a, p0Var2.f18960b, c2, (e2.i) p0Var2.f18963f);
            } catch (h e10) {
                throw new IllegalStateException(new v(e10, (d2.v) this.f18995p.f18961c));
            }
        }
        f();
    }

    public final void w() {
        f();
        g9.g0 listIterator = this.f18987g.listIterator(0);
        while (listIterator.hasNext()) {
            ((e2.m) listIterator.next()).reset();
        }
        this.f18985e.reset();
        this.f18986f.reset();
        e2.i iVar = this.f18996q;
        if (iVar != null) {
            g9.i0 i0Var = iVar.f9349a;
            for (int i3 = 0; i3 < i0Var.size(); i3++) {
                e2.m mVar = (e2.m) i0Var.get(i3);
                mVar.e(e2.k.f9356b);
                mVar.reset();
            }
            iVar.f9350b.clear();
            iVar.f9351c = new ByteBuffer[0];
            e2.j jVar = e2.j.f9352e;
            iVar.d = false;
        }
        this.O = false;
        this.X = false;
    }

    public final void x() {
        if (p()) {
            h0 h0Var = this.f18999t;
            d2.y0 y0Var = this.f19002x;
            AudioTrack audioTrack = h0Var.f18866a;
            try {
                audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(g2.n0.h(y0Var.f8517a, 0.1f, h0Var.f18868c)).setPitch(g2.n0.h(y0Var.f8518b, 0.1f, 8.0f)).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                g2.a.m("AudioTrackAudioOutput", "Failed to set playback params", e10);
            }
            k0 k0Var = h0Var.f18870f;
            k0Var.f18914i = audioTrack.getPlaybackParams().getSpeed();
            k0Var.h.a(0);
            k0Var.f18916k = 0L;
            k0Var.f18925t = 0;
            k0Var.f18924s = 0;
            k0Var.f18917l = 0L;
            k0Var.f18929y = -9223372036854775807L;
            k0Var.f18930z = -9223372036854775807L;
            PlaybackParams playbackParams = this.f18999t.f18866a.getPlaybackParams();
            this.f19002x = new d2.y0(playbackParams.getSpeed(), playbackParams.getPitch());
        }
    }

    public final void y(o oVar) {
        if (oVar.equals(this.f18997r)) {
            return;
        }
        ((j0) this.f18997r).d();
        this.f18997r = oVar;
        n0 n0Var = this.f18998s;
        if (n0Var != null) {
            j0 j0Var = (j0) oVar;
            j0Var.f();
            if (j0Var.f18900f == null) {
                j0Var.f18900f = new g2.s(Thread.currentThread());
            }
            j0Var.f18900f.a(n0Var);
        }
        v();
    }

    public final void z(int i3) {
        boolean z10 = false;
        if (this.R) {
            if (this.Q == i3) {
                this.R = false;
            } else {
                return;
            }
        }
        if (this.Q != i3) {
            this.Q = i3;
            if (i3 != 0) {
                z10 = true;
            }
            this.P = z10;
            v();
        }
    }
}
