package n2;

import a8.ja;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import fi.a4;
import h9.s1;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kg.j1;
public final class r0 implements x {
    public static final AtomicInteger f20849c0 = new AtomicInteger();
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
    public final Context f20850a;
    public long f20851a0;
    public final h6.m f20852b;
    public Handler f20853b0;
    public final k0 f20854c;
    public final a1 d;
    public final f2.s f20855e;
    public final z0 f20856f;
    public final s1 f20857g;
    public final ArrayDeque h;
    public int f20858i;
    public n0 f20859j;
    public final q0 f20860k;
    public final q0 f20861l;
    public m2.j f20862m;
    public v f20863n;
    public o0 f20864o;
    public o0 f20865p;
    public f2.i f20866q;
    public o f20867r;
    public m0 f20868s;
    public g0 f20869t;
    public e2.e f20870u;
    public p0 v;
    public p0 f20871w;
    public e2.w0 f20872x;
    public boolean f20873y;
    public long f20874z;

    public r0(a4 a4Var) {
        Context applicationContext;
        int deviceId;
        Context context = (Context) a4Var.f11406b;
        if (context == null) {
            applicationContext = null;
        } else {
            applicationContext = context.getApplicationContext();
        }
        this.f20850a = applicationContext;
        this.f20870u = e2.e.f10051i;
        this.f20852b = (h6.m) a4Var.d;
        this.f20858i = 0;
        this.f20867r = (i0) a4Var.f11409f;
        ?? nVar = new f2.n();
        this.f20854c = nVar;
        ?? nVar2 = new f2.n();
        nVar2.f20701m = h2.l0.f13472b;
        this.d = nVar2;
        this.f20855e = new f2.n();
        this.f20856f = new f2.n();
        this.f20857g = h9.i0.v(nVar2, nVar);
        this.H = 1.0f;
        this.Q = 0;
        this.S = new Object();
        e2.w0 w0Var = e2.w0.d;
        this.f20871w = new p0(w0Var, 0L, 0L);
        this.f20872x = w0Var;
        this.f20873y = false;
        this.h = new ArrayDeque();
        this.f20860k = new q0();
        this.f20861l = new q0();
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
        if (this.f20869t != null) {
            this.S.getClass();
        }
        this.S = fVar;
    }

    public final void B(java.nio.ByteBuffer r23) {
        throw new UnsupportedOperationException("Method not decompiled: n2.r0.B(java.nio.ByteBuffer):void");
    }

    public final void C(e2.w0 w0Var) {
        if (D()) {
            this.f20872x = w0Var;
            x();
            return;
        }
        e2.w0 w0Var2 = new e2.w0(h2.l0.h(w0Var.f10474a, 0.1f, 8.0f), h2.l0.h(w0Var.f10475b, 0.1f, 8.0f));
        this.f20872x = w0Var2;
        p0 p0Var = new p0(w0Var2, -9223372036854775807L, -9223372036854775807L);
        if (p()) {
            this.v = p0Var;
        } else {
            this.f20871w = p0Var;
        }
    }

    public final boolean D() {
        o0 o0Var = this.f20865p;
        if (o0Var != null && ((n) o0Var.f20832e).f20825j) {
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
        h6.m mVar = this.f20852b;
        if (!D) {
            if (!this.V && o0.a(this.f20865p)) {
                int i7 = ((e2.u) this.f20865p.f20831c).M;
                w0Var = this.f20872x;
                f2.r rVar = (f2.r) mVar.d;
                float f10 = w0Var.f10474a;
                rVar.getClass();
                if (f10 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ja.f(z10);
                if (rVar.f10763c != f10) {
                    rVar.f10763c = f10;
                    rVar.f10767i = true;
                }
                float f11 = w0Var.f10475b;
                if (f11 > 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ja.f(z11);
                if (rVar.d != f11) {
                    rVar.d = f11;
                    rVar.f10767i = true;
                }
            } else {
                w0Var = e2.w0.d;
            }
            this.f20872x = w0Var;
        } else {
            w0Var = e2.w0.d;
        }
        e2.w0 w0Var2 = w0Var;
        if (!this.V && o0.a(this.f20865p)) {
            int i10 = ((e2.u) this.f20865p.f20831c).M;
            z12 = this.f20873y;
            ((w0) mVar.f13625c).f20908o = z12;
        }
        this.f20873y = z12;
        this.h.add(new p0(w0Var2, Math.max(0L, j3), h2.l0.Y(((n) this.f20865p.f20832e).f20819b, l())));
        f2.i iVar = (f2.i) this.f20865p.f20833f;
        this.f20866q = iVar;
        iVar.a();
        v vVar = this.f20863n;
        if (vVar != null) {
            vVar.c(this.f20873y);
        }
    }

    public final g0 b(n nVar) {
        try {
            return ((i0) this.f20867r).a(nVar);
        } catch (l e10) {
            u uVar = new u(nVar.f20819b, nVar.f20820c, nVar.f20818a, nVar.f20822f, (e2.u) this.f20865p.f20831c, nVar.f20821e, e10);
            v vVar = this.f20863n;
            if (vVar != null) {
                vVar.T(uVar);
            }
            throw uVar;
        }
    }

    public final void c(e2.u uVar, int[] iArr) {
        f2.i iVar;
        e2.u uVar2;
        int i7;
        int i10;
        if (this.f20868s == null && this.f20850a != null) {
            m0 m0Var = new m0(this);
            this.f20868s = m0Var;
            i0 i0Var = (i0) this.f20867r;
            i0Var.f();
            if (i0Var.f20770f == null) {
                i0Var.f20770f = new h2.r(Thread.currentThread());
            }
            i0Var.f20770f.a(m0Var);
        }
        String str = uVar.f10451s;
        int i11 = uVar.K;
        int i12 = uVar.M;
        if ("audio/raw".equals(str)) {
            ja.f(h2.l0.M(i12));
            int u10 = h2.l0.u(i12) * i11;
            ?? b0Var = new h9.b0(4);
            b0Var.d(this.f20857g);
            b0Var.c(this.f20855e);
            f2.m[] mVarArr = (f2.m[]) this.f20852b.f13624b;
            int length = mVarArr.length;
            h9.o.e(length, mVarArr);
            b0Var.e(length);
            System.arraycopy(mVarArr, 0, b0Var.f13655a, b0Var.f13656b, length);
            b0Var.f13656b += length;
            iVar = new f2.i(b0Var.f());
            if (iVar.equals(this.f20866q)) {
                iVar = this.f20866q;
            }
            int i13 = uVar.N;
            int i14 = uVar.O;
            a1 a1Var = this.d;
            a1Var.f20697i = i13;
            a1Var.f20698j = i14;
            this.f20854c.f20804i = iArr;
            f2.j jVar = new f2.j(uVar.L, i11, i12);
            try {
                h9.i0 i0Var2 = iVar.f10726a;
                if (!jVar.equals(f2.j.f10729e)) {
                    for (int i15 = 0; i15 < i0Var2.size(); i15++) {
                        f2.m mVar = (f2.m) i0Var2.get(i15);
                        f2.j e10 = mVar.e(jVar);
                        if (mVar.isActive()) {
                            ja.p(!e10.equals(f2.j.f10729e));
                            jVar = e10;
                        }
                    }
                    int i16 = jVar.f10731b;
                    int i17 = jVar.f10732c;
                    e2.t a10 = uVar.a();
                    a10.L = i17;
                    a10.K = jVar.f10730a;
                    a10.J = i16;
                    uVar2 = new e2.u(a10);
                    i7 = u10;
                    i10 = h2.l0.u(i17) * i16;
                } else {
                    throw new f2.l(jVar);
                }
            } catch (f2.l e11) {
                throw new t(e11, uVar);
            }
        } else {
            iVar = new f2.i(s1.f13749e);
            uVar2 = uVar;
            i7 = -1;
            i10 = -1;
        }
        f2.i iVar2 = iVar;
        i i18 = i(uVar2);
        e2.u uVar3 = i18.f20760a;
        try {
            n c10 = ((i0) this.f20867r).c(i18);
            boolean z10 = c10.f20821e;
            if (c10.f20818a != 0) {
                if (c10.f20820c != 0) {
                    this.X = false;
                    o0 o0Var = new o0(uVar, uVar2, i7, i10, c10, iVar2);
                    if (p()) {
                        this.f20864o = o0Var;
                        return;
                    } else {
                        this.f20865p = o0Var;
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
            this.f20874z = 0L;
            this.A = 0L;
            this.B = 0L;
            this.C = 0L;
            this.Y = false;
            this.D = 0;
            this.f20871w = new p0(this.f20872x, 0L, 0L);
            this.G = 0L;
            this.v = null;
            this.h.clear();
            this.I = null;
            this.J = 0;
            this.K = null;
            this.M = false;
            this.L = false;
            this.N = false;
            this.d.f20703o = 0L;
            f2.i iVar = (f2.i) this.f20865p.f20833f;
            this.f20866q = iVar;
            iVar.a();
            this.f20859j = null;
            o0 o0Var = this.f20864o;
            if (o0Var != null) {
                this.f20865p = o0Var;
                this.f20864o = null;
            }
            f20849c0.incrementAndGet();
            g0 g0Var = this.f20869t;
            if (g0Var.f20743f.d.getPlayState() == 3) {
                g0Var.f20739a.pause();
            }
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 29 && g0Var.c()) {
                f0 f0Var = g0Var.f20745i;
                f0Var.getClass();
                f0.a(f0Var);
            }
            if (i7 >= 24 && (c0Var = g0Var.f20742e) != null) {
                c0.b(c0Var);
                g0Var.f20742e = null;
            }
            AudioTrack audioTrack = g0Var.f20739a;
            h2.r rVar = g0Var.f20746j;
            Handler q10 = h2.l0.q(null);
            synchronized (g0.f20737t) {
                try {
                    if (g0.f20738u == null) {
                        g0.f20738u = Executors.newSingleThreadScheduledExecutor(new ai.y0(1));
                    }
                    g0.v++;
                    g0.f20738u.schedule(new ki.n(audioTrack, q10, rVar, 9), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f20869t = null;
        }
        q0 q0Var = this.f20861l;
        q0Var.f20845c = null;
        q0Var.f20843a = -9223372036854775807L;
        q0Var.f20844b = -9223372036854775807L;
        q0 q0Var2 = this.f20860k;
        q0Var2.f20845c = null;
        q0Var2.f20843a = -9223372036854775807L;
        q0Var2.f20844b = -9223372036854775807L;
        this.Z = 0L;
        this.f20851a0 = 0L;
        Handler handler = this.f20853b0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final long g() {
        boolean z10;
        if (!p()) {
            return -9223372036854775807L;
        }
        if (o0.a(this.f20865p)) {
            return h2.l0.Y(((n) this.f20865p.f20832e).f20819b, this.f20869t.f20739a.getBufferSizeInFrames());
        }
        long bufferSizeInFrames = this.f20869t.f20739a.getBufferSizeInFrames();
        int j3 = f3.b.j(((n) this.f20865p.f20832e).f20818a);
        if (j3 != -2147483647) {
            z10 = true;
        } else {
            z10 = false;
        }
        ja.p(z10);
        return h2.l0.a0(bufferSizeInFrames, 1000000L, j3, RoundingMode.DOWN);
    }

    public final long h() {
        ArrayDeque arrayDeque;
        long j3;
        f2.q qVar;
        if (p() && !this.F) {
            long min = Math.min(this.f20869t.a(), h2.l0.Y(((n) this.f20865p.f20832e).f20819b, l()));
            while (true) {
                arrayDeque = this.h;
                if (arrayDeque.isEmpty() || min < ((p0) arrayDeque.getFirst()).f20839c) {
                    break;
                }
                this.f20871w = (p0) arrayDeque.remove();
            }
            p0 p0Var = this.f20871w;
            long j10 = min - p0Var.f20839c;
            long B = h2.l0.B(j10, p0Var.f20837a.f10474a);
            boolean isEmpty = arrayDeque.isEmpty();
            h6.m mVar = this.f20852b;
            if (isEmpty) {
                f2.r rVar = (f2.r) mVar.d;
                if (rVar.isActive()) {
                    if (rVar.f10772n >= 1024) {
                        long j11 = rVar.f10771m;
                        rVar.f10768j.getClass();
                        long o4 = j11 - (qVar.f10753i.o() * (qVar.f10754j * qVar.f10748b));
                        int i7 = rVar.h.f10730a;
                        int i10 = rVar.f10766g.f10730a;
                        if (i7 == i10) {
                            j10 = h2.l0.a0(j10, o4, rVar.f10772n, RoundingMode.DOWN);
                        } else {
                            j10 = h2.l0.a0(j10, o4 * i7, rVar.f10772n * i10, RoundingMode.DOWN);
                        }
                    } else {
                        j10 = (long) (rVar.f10763c * j10);
                    }
                }
                p0 p0Var2 = this.f20871w;
                j3 = p0Var2.f20838b + j10;
                p0Var2.d = j10 - B;
            } else {
                p0 p0Var3 = this.f20871w;
                j3 = p0Var3.f20838b + B + p0Var3.d;
            }
            long j12 = ((w0) mVar.f13625c).f20910q;
            long Y = h2.l0.Y(((n) this.f20865p.f20832e).f20819b, j12) + j3;
            long j13 = this.Z;
            if (j12 > j13) {
                long Y2 = h2.l0.Y(((n) this.f20865p.f20832e).f20819b, j12 - j13);
                this.Z = j12;
                this.f20851a0 += Y2;
                if (this.f20853b0 == null) {
                    this.f20853b0 = new Handler(Looper.myLooper());
                }
                this.f20853b0.removeCallbacksAndMessages(null);
                this.f20853b0.postDelayed(new j1(this, 19), 100L);
            }
            return Y;
        }
        return Long.MIN_VALUE;
    }

    public final i i(e2.u uVar) {
        boolean z10;
        i iVar = new i(uVar);
        iVar.f20761b = this.f20870u;
        if (this.f20858i != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        iVar.d = z10;
        iVar.f20762c = this.T;
        iVar.f20763e = this.Q;
        iVar.f20765g = this.V;
        iVar.h = -1;
        iVar.f20764f = this.U;
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
        int i7 = ((i0) this.f20867r).b(i(uVar)).d;
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
        if (o0.a(this.f20865p)) {
            long j3 = this.B;
            long j10 = this.f20865p.f20830b;
            return ((j3 + j10) - 1) / j10;
        }
        return this.C;
    }

    public final boolean m(long r21, int r23, java.nio.ByteBuffer r24) {
        throw new UnsupportedOperationException("Method not decompiled: n2.r0.m(long, int, java.nio.ByteBuffer):boolean");
    }

    public final boolean n() {
        if (p()) {
            if (Build.VERSION.SDK_INT < 29 || !this.f20869t.c() || !this.N) {
                long l10 = l();
                long a10 = this.f20869t.a();
                g0 g0Var = this.f20869t;
                g0Var.getClass();
                if (l10 > h2.l0.a0(a10, g0Var.f20739a.getSampleRate(), 1000000L, RoundingMode.UP)) {
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
        q0 q0Var = this.f20860k;
        boolean z10 = false;
        if (((Exception) q0Var.f20845c) != null && (f20849c0.get() > 0 || SystemClock.elapsedRealtime() < q0Var.f20844b)) {
            return false;
        }
        try {
            b10 = b((n) this.f20865p.f20832e);
        } catch (u e10) {
            int i10 = ((n) this.f20865p.f20832e).f20822f;
            while (i10 > 1000000) {
                int i11 = i10 / 2;
                o0 o0Var = this.f20865p;
                int i12 = o0Var.f20830b;
                if (i12 == -1) {
                    i12 = 1;
                }
                int i13 = i11 % i12;
                if (i13 != 0) {
                    i7 = (i12 - i13) + i11;
                } else {
                    i7 = i11;
                }
                m a10 = ((n) o0Var.f20832e).a();
                a10.f20812f = i7;
                n nVar = new n(a10);
                try {
                    b10 = b(nVar);
                    o0 o0Var2 = this.f20865p;
                    this.f20865p = new o0((e2.u) o0Var2.f20831c, (e2.u) o0Var2.d, o0Var2.f20829a, o0Var2.f20830b, nVar, (f2.i) o0Var2.f20833f);
                } catch (u e11) {
                    e10.addSuppressed(e11);
                    i10 = i7;
                }
            }
            if (((n) this.f20865p.f20832e).f20821e) {
                this.X = true;
            }
            throw e10;
        }
        this.f20869t = b10;
        n0 n0Var = new n0(this, (n) this.f20865p.f20832e);
        this.f20859j = n0Var;
        b10.f20746j.a(n0Var);
        if (this.f20869t.c()) {
            o0 o0Var3 = this.f20865p;
            if (((n) o0Var3.f20832e).f20826k) {
                g0 g0Var = this.f20869t;
                e2.u uVar = (e2.u) o0Var3.f20831c;
                g0Var.d(uVar.N, uVar.O);
            }
        }
        m2.j jVar = this.f20862m;
        if (jVar != null) {
            this.f20869t.f(jVar);
        }
        if (p()) {
            this.f20869t.f20739a.setVolume(this.H);
        }
        this.S.getClass();
        AudioDeviceInfo audioDeviceInfo = this.T;
        if (audioDeviceInfo != null) {
            this.f20869t.f20739a.setPreferredDevice(audioDeviceInfo);
        }
        this.F = true;
        int audioSessionId = this.f20869t.f20739a.getAudioSessionId();
        if (audioSessionId != this.Q) {
            z10 = true;
        }
        this.Q = audioSessionId;
        v vVar = this.f20863n;
        if (vVar != 0) {
            int i14 = ((n) this.f20865p.f20832e).f20818a;
            vVar.u(new Object());
            if (z10) {
                this.R = true;
                o0 o0Var4 = this.f20865p;
                m a11 = ((n) o0Var4.f20832e).a();
                a11.h = this.Q;
                this.f20865p = new o0((e2.u) o0Var4.f20831c, (e2.u) o0Var4.d, o0Var4.f20829a, o0Var4.f20830b, new n(a11), (f2.i) o0Var4.f20833f);
                o0 o0Var5 = this.f20864o;
                if (o0Var5 != null) {
                    m a12 = ((n) o0Var5.f20832e).a();
                    a12.h = this.Q;
                    this.f20864o = new o0((e2.u) o0Var5.f20831c, (e2.u) o0Var5.d, o0Var5.f20829a, o0Var5.f20830b, new n(a12), (f2.i) o0Var5.f20833f);
                }
                this.f20863n.a(this.Q);
            }
        }
        return true;
    }

    public final boolean p() {
        if (this.f20869t != null) {
            return true;
        }
        return false;
    }

    public final void q() {
        this.O = false;
        if (p()) {
            g0 g0Var = this.f20869t;
            j0 j0Var = g0Var.f20743f;
            j0Var.f20786k = 0L;
            j0Var.f20795t = 0;
            j0Var.f20794s = 0;
            j0Var.f20787l = 0L;
            j0Var.f20799y = -9223372036854775807L;
            j0Var.f20800z = -9223372036854775807L;
            if (j0Var.f20796u == -9223372036854775807L) {
                j0Var.h.a(0);
            }
            j0Var.f20797w = j0Var.a();
            if (!g0Var.f20747k || g0Var.c()) {
                g0Var.f20739a.pause();
            }
        }
    }

    public final void r() {
        this.O = true;
        if (p()) {
            g0 g0Var = this.f20869t;
            j0 j0Var = g0Var.f20743f;
            if (j0Var.f20796u != -9223372036854775807L) {
                j0Var.f20779b.getClass();
                j0Var.f20796u = h2.l0.S(SystemClock.elapsedRealtime());
            }
            j0Var.f20785j = h2.l0.Y(j0Var.f20781e, j0Var.a());
            j0Var.h.a(0);
            if (!g0Var.f20747k || g0Var.c()) {
                g0Var.f20739a.play();
            }
        }
    }

    public final void s() {
        if (!this.M) {
            this.M = true;
            if (this.f20869t.c()) {
                this.N = false;
            }
            g0 g0Var = this.f20869t;
            if (!g0Var.f20747k) {
                g0Var.f20747k = true;
                j0 j0Var = g0Var.f20743f;
                long b10 = g0Var.b();
                j0Var.f20797w = j0Var.a();
                j0Var.f20779b.getClass();
                j0Var.f20796u = h2.l0.S(SystemClock.elapsedRealtime());
                j0Var.f20798x = b10;
                g0Var.f20739a.stop();
                g0Var.f20752p = 0;
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
        if (this.f20865p != null) {
            o0 o0Var = this.f20864o;
            if (o0Var != null) {
                this.f20865p = o0Var;
                this.f20864o = null;
            }
            try {
                n c10 = ((i0) this.f20867r).c(i((e2.u) this.f20865p.d));
                o0 o0Var2 = this.f20865p;
                this.f20865p = new o0((e2.u) o0Var2.f20831c, (e2.u) o0Var2.d, o0Var2.f20829a, o0Var2.f20830b, c10, (f2.i) o0Var2.f20833f);
            } catch (h e10) {
                throw new IllegalStateException(new t(e10, (e2.u) this.f20865p.f20831c));
            }
        }
        f();
    }

    public final void w() {
        f();
        h9.g0 listIterator = this.f20857g.listIterator(0);
        while (listIterator.hasNext()) {
            ((f2.m) listIterator.next()).reset();
        }
        this.f20855e.reset();
        this.f20856f.reset();
        f2.i iVar = this.f20866q;
        if (iVar != null) {
            h9.i0 i0Var = iVar.f10726a;
            for (int i7 = 0; i7 < i0Var.size(); i7++) {
                f2.m mVar = (f2.m) i0Var.get(i7);
                mVar.d(f2.k.f10733b);
                mVar.reset();
            }
            iVar.f10727b.clear();
            iVar.f10728c = new ByteBuffer[0];
            f2.j jVar = f2.j.f10729e;
            iVar.d = false;
        }
        this.O = false;
        this.X = false;
    }

    public final void x() {
        if (p()) {
            g0 g0Var = this.f20869t;
            e2.w0 w0Var = this.f20872x;
            AudioTrack audioTrack = g0Var.f20739a;
            try {
                audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(h2.l0.h(w0Var.f10474a, 0.1f, g0Var.f20741c)).setPitch(h2.l0.h(w0Var.f10475b, 0.1f, 8.0f)).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                h2.a.m("AudioTrackAudioOutput", "Failed to set playback params", e10);
            }
            j0 j0Var = g0Var.f20743f;
            j0Var.f20784i = audioTrack.getPlaybackParams().getSpeed();
            j0Var.h.a(0);
            j0Var.f20786k = 0L;
            j0Var.f20795t = 0;
            j0Var.f20794s = 0;
            j0Var.f20787l = 0L;
            j0Var.f20799y = -9223372036854775807L;
            j0Var.f20800z = -9223372036854775807L;
            PlaybackParams playbackParams = this.f20869t.f20739a.getPlaybackParams();
            this.f20872x = new e2.w0(playbackParams.getSpeed(), playbackParams.getPitch());
        }
    }

    public final void y(o oVar) {
        if (oVar.equals(this.f20867r)) {
            return;
        }
        ((i0) this.f20867r).d();
        this.f20867r = oVar;
        m0 m0Var = this.f20868s;
        if (m0Var != null) {
            i0 i0Var = (i0) oVar;
            i0Var.f();
            if (i0Var.f20770f == null) {
                i0Var.f20770f = new h2.r(Thread.currentThread());
            }
            i0Var.f20770f.a(m0Var);
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
