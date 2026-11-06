package n2;

import a8.ia;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import di.h4;
import h9.t1;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
public final class q0 implements x {
    public static final AtomicInteger f20268c0 = new AtomicInteger();
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
    public final Context f20269a;
    public long f20270a0;
    public final h6.m f20271b;
    public Handler f20272b0;
    public final j0 f20273c;
    public final z0 d;
    public final f2.t f20274e;
    public final y0 f20275f;
    public final t1 f20276g;
    public final ArrayDeque h;
    public int f20277i;
    public m0 f20278j;
    public final p0 f20279k;
    public final p0 f20280l;
    public m2.j f20281m;
    public v f20282n;
    public n0 f20283o;
    public n0 f20284p;
    public f2.j f20285q;
    public o f20286r;
    public l0 f20287s;
    public f0 f20288t;
    public e2.e f20289u;
    public o0 v;
    public o0 f20290w;
    public e2.w0 f20291x;
    public boolean f20292y;
    public long f20293z;

    public q0(h4 h4Var) {
        Context applicationContext;
        int deviceId;
        Context context = (Context) h4Var.f9075b;
        if (context == null) {
            applicationContext = null;
        } else {
            applicationContext = context.getApplicationContext();
        }
        this.f20269a = applicationContext;
        this.f20289u = e2.e.f10215i;
        this.f20271b = (h6.m) h4Var.d;
        this.f20277i = 0;
        this.f20286r = (h0) h4Var.f9078f;
        ?? oVar = new f2.o();
        this.f20273c = oVar;
        ?? oVar2 = new f2.o();
        oVar2.f20356m = h2.m0.f14113b;
        this.d = oVar2;
        this.f20274e = new f2.o();
        this.f20275f = new f2.o();
        this.f20276g = h9.i0.v(oVar2, oVar);
        this.H = 1.0f;
        this.Q = 0;
        this.S = new Object();
        e2.w0 w0Var = e2.w0.d;
        this.f20290w = new o0(w0Var, 0L, 0L);
        this.f20291x = w0Var;
        this.f20292y = false;
        this.h = new ArrayDeque();
        this.f20279k = new p0();
        this.f20280l = new p0();
        int i7 = -1;
        if (Build.VERSION.SDK_INT >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i7 = deviceId;
        }
        this.U = i7;
    }

    public static int k(int r10, java.nio.ByteBuffer r11) {
        throw new UnsupportedOperationException("Method not decompiled: n2.q0.k(int, java.nio.ByteBuffer):int");
    }

    public final void A(e2.f fVar) {
        if (this.S.equals(fVar)) {
            return;
        }
        fVar.getClass();
        if (this.f20288t != null) {
            this.S.getClass();
        }
        this.S = fVar;
    }

    public final void B(java.nio.ByteBuffer r23) {
        throw new UnsupportedOperationException("Method not decompiled: n2.q0.B(java.nio.ByteBuffer):void");
    }

    public final void C(e2.w0 w0Var) {
        if (D()) {
            this.f20291x = w0Var;
            x();
            return;
        }
        e2.w0 w0Var2 = new e2.w0(h2.m0.h(w0Var.f10638a, 0.1f, 8.0f), h2.m0.h(w0Var.f10639b, 0.1f, 8.0f));
        this.f20291x = w0Var2;
        o0 o0Var = new o0(w0Var2, -9223372036854775807L, -9223372036854775807L);
        if (p()) {
            this.v = o0Var;
        } else {
            this.f20290w = o0Var;
        }
    }

    public final boolean D() {
        n0 n0Var = this.f20284p;
        if (n0Var != null && ((n) n0Var.f20254e).f20249j) {
            return true;
        }
        return false;
    }

    public final void a(long j3) {
        e2.w0 w0Var;
        boolean z9;
        boolean z10;
        boolean D = D();
        boolean z11 = false;
        h6.m mVar = this.f20271b;
        if (!D) {
            if (!this.V && n0.a(this.f20284p)) {
                int i7 = ((e2.u) this.f20284p.f20253c).M;
                w0Var = this.f20291x;
                f2.s sVar = (f2.s) mVar.d;
                float f10 = w0Var.f10638a;
                sVar.getClass();
                if (f10 > 0.0f) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                ia.f(z9);
                if (sVar.f10950c != f10) {
                    sVar.f10950c = f10;
                    sVar.f10954i = true;
                }
                float f11 = w0Var.f10639b;
                if (f11 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ia.f(z10);
                if (sVar.d != f11) {
                    sVar.d = f11;
                    sVar.f10954i = true;
                }
            } else {
                w0Var = e2.w0.d;
            }
            this.f20291x = w0Var;
        } else {
            w0Var = e2.w0.d;
        }
        e2.w0 w0Var2 = w0Var;
        if (!this.V && n0.a(this.f20284p)) {
            int i10 = ((e2.u) this.f20284p.f20253c).M;
            z11 = this.f20292y;
            ((v0) mVar.f14265c).f20326o = z11;
        }
        this.f20292y = z11;
        this.h.add(new o0(w0Var2, Math.max(0L, j3), h2.m0.Y(((n) this.f20284p.f20254e).f20243b, l())));
        f2.j jVar = (f2.j) this.f20284p.f20255f;
        this.f20285q = jVar;
        jVar.a();
        v vVar = this.f20282n;
        if (vVar != null) {
            vVar.f(this.f20292y);
        }
    }

    public final f0 b(n nVar) {
        try {
            return ((h0) this.f20286r).a(nVar);
        } catch (l e10) {
            u uVar = new u(nVar.f20243b, nVar.f20244c, nVar.f20242a, nVar.f20246f, (e2.u) this.f20284p.f20253c, nVar.f20245e, e10);
            v vVar = this.f20282n;
            if (vVar != null) {
                vVar.U0(uVar);
            }
            throw uVar;
        }
    }

    public final void c(e2.u uVar, int[] iArr) {
        f2.j jVar;
        e2.u uVar2;
        int i7;
        int i10;
        if (this.f20287s == null && this.f20269a != null) {
            l0 l0Var = new l0(this);
            this.f20287s = l0Var;
            h0 h0Var = (h0) this.f20286r;
            h0Var.f();
            if (h0Var.f20186f == null) {
                h0Var.f20186f = new h2.r(Thread.currentThread());
            }
            h0Var.f20186f.a(l0Var);
        }
        String str = uVar.f10615s;
        int i11 = uVar.K;
        int i12 = uVar.M;
        if ("audio/raw".equals(str)) {
            ia.f(h2.m0.M(i12));
            int u10 = h2.m0.u(i12) * i11;
            ?? b0Var = new h9.b0(4);
            b0Var.d(this.f20276g);
            b0Var.c(this.f20274e);
            f2.n[] nVarArr = (f2.n[]) this.f20271b.f14264b;
            int length = nVarArr.length;
            h9.o.e(length, nVarArr);
            b0Var.e(length);
            System.arraycopy(nVarArr, 0, b0Var.f14297a, b0Var.f14298b, length);
            b0Var.f14298b += length;
            jVar = new f2.j(b0Var.f());
            if (jVar.equals(this.f20285q)) {
                jVar = this.f20285q;
            }
            int i13 = uVar.N;
            int i14 = uVar.O;
            z0 z0Var = this.d;
            z0Var.f20352i = i13;
            z0Var.f20353j = i14;
            this.f20273c.f20223i = iArr;
            f2.k kVar = new f2.k(uVar.L, i11, i12);
            try {
                h9.i0 i0Var = jVar.f10913a;
                if (!kVar.equals(f2.k.f10916e)) {
                    for (int i15 = 0; i15 < i0Var.size(); i15++) {
                        f2.n nVar = (f2.n) i0Var.get(i15);
                        f2.k e10 = nVar.e(kVar);
                        if (nVar.isActive()) {
                            ia.p(!e10.equals(f2.k.f10916e));
                            kVar = e10;
                        }
                    }
                    int i16 = kVar.f10918b;
                    int i17 = kVar.f10919c;
                    e2.t a10 = uVar.a();
                    a10.L = i17;
                    a10.K = kVar.f10917a;
                    a10.J = i16;
                    uVar2 = new e2.u(a10);
                    i7 = u10;
                    i10 = h2.m0.u(i17) * i16;
                } else {
                    throw new f2.m(kVar);
                }
            } catch (f2.m e11) {
                throw new t(e11, uVar);
            }
        } else {
            jVar = new f2.j(t1.f14397e);
            uVar2 = uVar;
            i7 = -1;
            i10 = -1;
        }
        f2.j jVar2 = jVar;
        i i18 = i(uVar2);
        e2.u uVar3 = i18.f20191a;
        try {
            n c10 = ((h0) this.f20286r).c(i18);
            boolean z9 = c10.f20245e;
            if (c10.f20242a != 0) {
                if (c10.f20244c != 0) {
                    this.X = false;
                    n0 n0Var = new n0(uVar, uVar2, i7, i10, c10, jVar2);
                    if (p()) {
                        this.f20283o = n0Var;
                        return;
                    } else {
                        this.f20284p = n0Var;
                        return;
                    }
                }
                throw new t("Invalid output channel config (isOffload=" + z9 + ")", uVar3);
            }
            throw new t("Invalid output encoding (isOffload=" + z9 + ")", uVar3);
        } catch (h e12) {
            throw new t(e12, uVar);
        }
    }

    public final void d(long r10) {
        throw new UnsupportedOperationException("Method not decompiled: n2.q0.d(long):void");
    }

    public final boolean e() {
        throw new UnsupportedOperationException("Method not decompiled: n2.q0.e():boolean");
    }

    public final void f() {
        b0 b0Var;
        if (p()) {
            this.f20293z = 0L;
            this.A = 0L;
            this.B = 0L;
            this.C = 0L;
            this.Y = false;
            this.D = 0;
            this.f20290w = new o0(this.f20291x, 0L, 0L);
            this.G = 0L;
            this.v = null;
            this.h.clear();
            this.I = null;
            this.J = 0;
            this.K = null;
            this.M = false;
            this.L = false;
            this.N = false;
            this.d.f20358o = 0L;
            f2.j jVar = (f2.j) this.f20284p.f20255f;
            this.f20285q = jVar;
            jVar.a();
            this.f20278j = null;
            n0 n0Var = this.f20283o;
            if (n0Var != null) {
                this.f20284p = n0Var;
                this.f20283o = null;
            }
            f20268c0.incrementAndGet();
            f0 f0Var = this.f20288t;
            if (f0Var.f20163f.d.getPlayState() == 3) {
                f0Var.f20159a.pause();
            }
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 29 && f0Var.c()) {
                e0 e0Var = f0Var.f20165i;
                e0Var.getClass();
                e0.a(e0Var);
            }
            if (i7 >= 24 && (b0Var = f0Var.f20162e) != null) {
                b0.b(b0Var);
                f0Var.f20162e = null;
            }
            AudioTrack audioTrack = f0Var.f20159a;
            h2.r rVar = f0Var.f20166j;
            Handler q10 = h2.m0.q(null);
            synchronized (f0.f20157t) {
                try {
                    if (f0.f20158u == null) {
                        f0.f20158u = Executors.newSingleThreadScheduledExecutor(new h2.l0(0));
                    }
                    f0.v++;
                    f0.f20158u.schedule(new l2.z0(audioTrack, q10, rVar, 10), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f20288t = null;
        }
        p0 p0Var = this.f20280l;
        p0Var.f20264c = null;
        p0Var.f20262a = -9223372036854775807L;
        p0Var.f20263b = -9223372036854775807L;
        p0 p0Var2 = this.f20279k;
        p0Var2.f20264c = null;
        p0Var2.f20262a = -9223372036854775807L;
        p0Var2.f20263b = -9223372036854775807L;
        this.Z = 0L;
        this.f20270a0 = 0L;
        Handler handler = this.f20272b0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final long g() {
        boolean z9;
        if (!p()) {
            return -9223372036854775807L;
        }
        if (n0.a(this.f20284p)) {
            return h2.m0.Y(((n) this.f20284p.f20254e).f20243b, this.f20288t.f20159a.getBufferSizeInFrames());
        }
        long bufferSizeInFrames = this.f20288t.f20159a.getBufferSizeInFrames();
        int j3 = f3.b.j(((n) this.f20284p.f20254e).f20242a);
        if (j3 != -2147483647) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.p(z9);
        return h2.m0.a0(bufferSizeInFrames, 1000000L, j3, RoundingMode.DOWN);
    }

    public final long h() {
        ArrayDeque arrayDeque;
        long j3;
        f2.r rVar;
        if (p() && !this.F) {
            long min = Math.min(this.f20288t.a(), h2.m0.Y(((n) this.f20284p.f20254e).f20243b, l()));
            while (true) {
                arrayDeque = this.h;
                if (arrayDeque.isEmpty() || min < ((o0) arrayDeque.getFirst()).f20258c) {
                    break;
                }
                this.f20290w = (o0) arrayDeque.remove();
            }
            o0 o0Var = this.f20290w;
            long j10 = min - o0Var.f20258c;
            long B = h2.m0.B(j10, o0Var.f20256a.f10638a);
            boolean isEmpty = arrayDeque.isEmpty();
            h6.m mVar = this.f20271b;
            if (isEmpty) {
                f2.s sVar = (f2.s) mVar.d;
                if (sVar.isActive()) {
                    if (sVar.f10959n >= 1024) {
                        long j11 = sVar.f10958m;
                        sVar.f10955j.getClass();
                        long o4 = j11 - (rVar.f10940i.o() * (rVar.f10941j * rVar.f10935b));
                        int i7 = sVar.h.f10917a;
                        int i10 = sVar.f10953g.f10917a;
                        if (i7 == i10) {
                            j10 = h2.m0.a0(j10, o4, sVar.f10959n, RoundingMode.DOWN);
                        } else {
                            j10 = h2.m0.a0(j10, o4 * i7, sVar.f10959n * i10, RoundingMode.DOWN);
                        }
                    } else {
                        j10 = (long) (sVar.f10950c * j10);
                    }
                }
                o0 o0Var2 = this.f20290w;
                j3 = o0Var2.f20257b + j10;
                o0Var2.d = j10 - B;
            } else {
                o0 o0Var3 = this.f20290w;
                j3 = o0Var3.f20257b + B + o0Var3.d;
            }
            long j12 = ((v0) mVar.f14265c).f20328q;
            long Y = h2.m0.Y(((n) this.f20284p.f20254e).f20243b, j12) + j3;
            long j13 = this.Z;
            if (j12 > j13) {
                long Y2 = h2.m0.Y(((n) this.f20284p.f20254e).f20243b, j12 - j13);
                this.Z = j12;
                this.f20270a0 += Y2;
                if (this.f20272b0 == null) {
                    this.f20272b0 = new Handler(Looper.myLooper());
                }
                this.f20272b0.removeCallbacksAndMessages(null);
                this.f20272b0.postDelayed(new l2.w(this, 13), 100L);
            }
            return Y;
        }
        return Long.MIN_VALUE;
    }

    public final i i(e2.u uVar) {
        boolean z9;
        i iVar = new i(uVar);
        iVar.f20192b = this.f20289u;
        if (this.f20277i != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        iVar.d = z9;
        iVar.f20193c = this.T;
        iVar.f20194e = this.Q;
        iVar.f20196g = this.V;
        iVar.h = -1;
        iVar.f20195f = this.U;
        return new i(iVar);
    }

    public final int j(e2.u uVar) {
        boolean z9;
        if (h2.m0.M(uVar.M) && uVar.M != 2) {
            e2.t a10 = uVar.a();
            a10.L = 2;
            uVar = new e2.u(a10);
            z9 = true;
        } else {
            z9 = false;
        }
        int i7 = ((h0) this.f20286r).b(i(uVar)).d;
        if (i7 != 1) {
            if (i7 != 2) {
                return 0;
            }
            if (!z9) {
                return 2;
            }
        }
        return 1;
    }

    public final long l() {
        if (n0.a(this.f20284p)) {
            long j3 = this.B;
            long j10 = this.f20284p.f20252b;
            return ((j3 + j10) - 1) / j10;
        }
        return this.C;
    }

    public final boolean m(long r21, int r23, java.nio.ByteBuffer r24) {
        throw new UnsupportedOperationException("Method not decompiled: n2.q0.m(long, int, java.nio.ByteBuffer):boolean");
    }

    public final boolean n() {
        if (p()) {
            if (Build.VERSION.SDK_INT < 29 || !this.f20288t.c() || !this.N) {
                long l10 = l();
                long a10 = this.f20288t.a();
                f0 f0Var = this.f20288t;
                f0Var.getClass();
                if (l10 > h2.m0.a0(a10, f0Var.f20159a.getSampleRate(), 1000000L, RoundingMode.UP)) {
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
        f0 b10;
        p0 p0Var = this.f20279k;
        boolean z9 = false;
        if (((Exception) p0Var.f20264c) != null && (f20268c0.get() > 0 || SystemClock.elapsedRealtime() < p0Var.f20263b)) {
            return false;
        }
        try {
            b10 = b((n) this.f20284p.f20254e);
        } catch (u e10) {
            int i10 = ((n) this.f20284p.f20254e).f20246f;
            while (i10 > 1000000) {
                int i11 = i10 / 2;
                n0 n0Var = this.f20284p;
                int i12 = n0Var.f20252b;
                if (i12 == -1) {
                    i12 = 1;
                }
                int i13 = i11 % i12;
                if (i13 != 0) {
                    i7 = (i12 - i13) + i11;
                } else {
                    i7 = i11;
                }
                m a10 = ((n) n0Var.f20254e).a();
                a10.f20235f = i7;
                n nVar = new n(a10);
                try {
                    b10 = b(nVar);
                    n0 n0Var2 = this.f20284p;
                    this.f20284p = new n0((e2.u) n0Var2.f20253c, (e2.u) n0Var2.d, n0Var2.f20251a, n0Var2.f20252b, nVar, (f2.j) n0Var2.f20255f);
                } catch (u e11) {
                    e10.addSuppressed(e11);
                    i10 = i7;
                }
            }
            if (((n) this.f20284p.f20254e).f20245e) {
                this.X = true;
            }
            throw e10;
        }
        this.f20288t = b10;
        m0 m0Var = new m0(this, (n) this.f20284p.f20254e);
        this.f20278j = m0Var;
        b10.f20166j.a(m0Var);
        if (this.f20288t.c()) {
            n0 n0Var3 = this.f20284p;
            if (((n) n0Var3.f20254e).f20250k) {
                f0 f0Var = this.f20288t;
                e2.u uVar = (e2.u) n0Var3.f20253c;
                f0Var.d(uVar.N, uVar.O);
            }
        }
        m2.j jVar = this.f20281m;
        if (jVar != null) {
            this.f20288t.f(jVar);
        }
        if (p()) {
            this.f20288t.f20159a.setVolume(this.H);
        }
        this.S.getClass();
        AudioDeviceInfo audioDeviceInfo = this.T;
        if (audioDeviceInfo != null) {
            this.f20288t.f20159a.setPreferredDevice(audioDeviceInfo);
        }
        this.F = true;
        int audioSessionId = this.f20288t.f20159a.getAudioSessionId();
        if (audioSessionId != this.Q) {
            z9 = true;
        }
        this.Q = audioSessionId;
        v vVar = this.f20282n;
        if (vVar != 0) {
            int i14 = ((n) this.f20284p.f20254e).f20242a;
            vVar.Y(new Object());
            if (z9) {
                this.R = true;
                n0 n0Var4 = this.f20284p;
                m a11 = ((n) n0Var4.f20254e).a();
                a11.h = this.Q;
                this.f20284p = new n0((e2.u) n0Var4.f20253c, (e2.u) n0Var4.d, n0Var4.f20251a, n0Var4.f20252b, new n(a11), (f2.j) n0Var4.f20255f);
                n0 n0Var5 = this.f20283o;
                if (n0Var5 != null) {
                    m a12 = ((n) n0Var5.f20254e).a();
                    a12.h = this.Q;
                    this.f20283o = new n0((e2.u) n0Var5.f20253c, (e2.u) n0Var5.d, n0Var5.f20251a, n0Var5.f20252b, new n(a12), (f2.j) n0Var5.f20255f);
                }
                this.f20282n.c(this.Q);
            }
        }
        return true;
    }

    public final boolean p() {
        if (this.f20288t != null) {
            return true;
        }
        return false;
    }

    public final void q() {
        this.O = false;
        if (p()) {
            f0 f0Var = this.f20288t;
            i0 i0Var = f0Var.f20163f;
            i0Var.f20205k = 0L;
            i0Var.f20214t = 0;
            i0Var.f20213s = 0;
            i0Var.f20206l = 0L;
            i0Var.f20218y = -9223372036854775807L;
            i0Var.f20219z = -9223372036854775807L;
            if (i0Var.f20215u == -9223372036854775807L) {
                i0Var.h.a(0);
            }
            i0Var.f20216w = i0Var.a();
            if (!f0Var.f20167k || f0Var.c()) {
                f0Var.f20159a.pause();
            }
        }
    }

    public final void r() {
        this.O = true;
        if (p()) {
            f0 f0Var = this.f20288t;
            i0 i0Var = f0Var.f20163f;
            if (i0Var.f20215u != -9223372036854775807L) {
                i0Var.f20198b.getClass();
                i0Var.f20215u = h2.m0.S(SystemClock.elapsedRealtime());
            }
            i0Var.f20204j = h2.m0.Y(i0Var.f20200e, i0Var.a());
            i0Var.h.a(0);
            if (!f0Var.f20167k || f0Var.c()) {
                f0Var.f20159a.play();
            }
        }
    }

    public final void s() {
        if (!this.M) {
            this.M = true;
            if (this.f20288t.c()) {
                this.N = false;
            }
            f0 f0Var = this.f20288t;
            if (!f0Var.f20167k) {
                f0Var.f20167k = true;
                i0 i0Var = f0Var.f20163f;
                long b10 = f0Var.b();
                i0Var.f20216w = i0Var.a();
                i0Var.f20198b.getClass();
                i0Var.f20215u = h2.m0.S(SystemClock.elapsedRealtime());
                i0Var.f20217x = b10;
                f0Var.f20159a.stop();
                f0Var.f20172p = 0;
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
        throw new UnsupportedOperationException("Method not decompiled: n2.q0.u(long):void");
    }

    public final void v() {
        if (this.f20284p != null) {
            n0 n0Var = this.f20283o;
            if (n0Var != null) {
                this.f20284p = n0Var;
                this.f20283o = null;
            }
            try {
                n c10 = ((h0) this.f20286r).c(i((e2.u) this.f20284p.d));
                n0 n0Var2 = this.f20284p;
                this.f20284p = new n0((e2.u) n0Var2.f20253c, (e2.u) n0Var2.d, n0Var2.f20251a, n0Var2.f20252b, c10, (f2.j) n0Var2.f20255f);
            } catch (h e10) {
                throw new IllegalStateException(new t(e10, (e2.u) this.f20284p.f20253c));
            }
        }
        f();
    }

    public final void w() {
        f();
        h9.g0 listIterator = this.f20276g.listIterator(0);
        while (listIterator.hasNext()) {
            ((f2.n) listIterator.next()).reset();
        }
        this.f20274e.reset();
        this.f20275f.reset();
        f2.j jVar = this.f20285q;
        if (jVar != null) {
            h9.i0 i0Var = jVar.f10913a;
            for (int i7 = 0; i7 < i0Var.size(); i7++) {
                f2.n nVar = (f2.n) i0Var.get(i7);
                nVar.d(f2.l.f10920b);
                nVar.reset();
            }
            jVar.f10914b.clear();
            jVar.f10915c = new ByteBuffer[0];
            f2.k kVar = f2.k.f10916e;
            jVar.d = false;
        }
        this.O = false;
        this.X = false;
    }

    public final void x() {
        if (p()) {
            f0 f0Var = this.f20288t;
            e2.w0 w0Var = this.f20291x;
            AudioTrack audioTrack = f0Var.f20159a;
            try {
                audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(h2.m0.h(w0Var.f10638a, 0.1f, f0Var.f20161c)).setPitch(h2.m0.h(w0Var.f10639b, 0.1f, 8.0f)).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                h2.a.m("AudioTrackAudioOutput", "Failed to set playback params", e10);
            }
            i0 i0Var = f0Var.f20163f;
            i0Var.f20203i = audioTrack.getPlaybackParams().getSpeed();
            i0Var.h.a(0);
            i0Var.f20205k = 0L;
            i0Var.f20214t = 0;
            i0Var.f20213s = 0;
            i0Var.f20206l = 0L;
            i0Var.f20218y = -9223372036854775807L;
            i0Var.f20219z = -9223372036854775807L;
            PlaybackParams playbackParams = this.f20288t.f20159a.getPlaybackParams();
            this.f20291x = new e2.w0(playbackParams.getSpeed(), playbackParams.getPitch());
        }
    }

    public final void y(o oVar) {
        if (oVar.equals(this.f20286r)) {
            return;
        }
        ((h0) this.f20286r).d();
        this.f20286r = oVar;
        l0 l0Var = this.f20287s;
        if (l0Var != null) {
            h0 h0Var = (h0) oVar;
            h0Var.f();
            if (h0Var.f20186f == null) {
                h0Var.f20186f = new h2.r(Thread.currentThread());
            }
            h0Var.f20186f.a(l0Var);
        }
        v();
    }

    public final void z(int i7) {
        boolean z9 = false;
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
                z9 = true;
            }
            this.P = z9;
            v();
        }
    }
}
