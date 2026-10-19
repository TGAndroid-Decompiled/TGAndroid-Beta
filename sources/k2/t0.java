package k2;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import ci.p4;
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
    public static final AtomicInteger f14801c0 = new AtomicInteger();
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
    public final Context f14802a;
    public long f14803a0;
    public final androidx.biometric.e f14804b;
    public Handler f14805b0;
    public final m0 f14806c;
    public final d1 d;
    public final c2.u e;
    public final c1 f14807f;
    public final x1 f14808g;
    public final ArrayDeque h;
    public int f14809i;
    public p0 f14810j;
    public final s0 f14811k;
    public final s0 f14812l;
    public j2.k f14813m;
    public x f14814n;
    public q0 f14815o;
    public q0 f14816p;
    public c2.j f14817q;
    public p f14818r;
    public o0 f14819s;
    public i0 f14820t;
    public b2.f f14821u;
    public r0 v;
    public r0 f14822w;
    public b2.z0 f14823x;
    public boolean f14824y;
    public long f14825z;

    public t0(p4 p4Var) {
        Context applicationContext;
        int deviceId;
        Context context = (Context) p4Var.f5728b;
        if (context == null) {
            applicationContext = null;
        } else {
            applicationContext = context.getApplicationContext();
        }
        this.f14802a = applicationContext;
        this.f14821u = b2.f.f3739i;
        this.f14804b = (androidx.biometric.e) p4Var.d;
        this.f14809i = 0;
        this.f14818r = (k0) p4Var.f5730f;
        ?? oVar = new c2.o();
        this.f14806c = oVar;
        ?? oVar2 = new c2.o();
        oVar2.f14671m = e2.m0.f8255b;
        this.d = oVar2;
        this.e = new c2.o();
        this.f14807f = new c2.o();
        this.f14808g = e9.n0.z(oVar2, oVar);
        this.H = 1.0f;
        this.Q = 0;
        this.S = new Object();
        b2.z0 z0Var = b2.z0.d;
        this.f14822w = new r0(z0Var, 0L, 0L);
        this.f14823x = z0Var;
        this.f14824y = false;
        this.h = new ArrayDeque();
        this.f14811k = new s0();
        this.f14812l = new s0();
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
        if (this.f14820t != null) {
            this.S.getClass();
        }
        this.S = gVar;
    }

    public final void B(java.nio.ByteBuffer r23) {
        throw new UnsupportedOperationException("Method not decompiled: k2.t0.B(java.nio.ByteBuffer):void");
    }

    public final void C(b2.z0 z0Var) {
        if (D()) {
            this.f14823x = z0Var;
            x();
            return;
        }
        b2.z0 z0Var2 = new b2.z0(e2.m0.h(z0Var.f4154a, 0.1f, 8.0f), e2.m0.h(z0Var.f4155b, 0.1f, 8.0f));
        this.f14823x = z0Var2;
        r0 r0Var = new r0(z0Var2, -9223372036854775807L, -9223372036854775807L);
        if (p()) {
            this.v = r0Var;
        } else {
            this.f14822w = r0Var;
        }
    }

    public final boolean D() {
        q0 q0Var = this.f14816p;
        if (q0Var != null && ((o) q0Var.e).f14774j) {
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
        androidx.biometric.e eVar = this.f14804b;
        if (!D) {
            if (!this.V && q0.a(this.f14816p)) {
                int i10 = ((b2.w) this.f14816p.f14784c).M;
                z0Var = this.f14823x;
                c2.t tVar = (c2.t) eVar.d;
                float f7 = z0Var.f4154a;
                tVar.getClass();
                if (f7 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u6.g(z10);
                if (tVar.f4550c != f7) {
                    tVar.f4550c = f7;
                    tVar.f4553i = true;
                }
                float f10 = z0Var.f4155b;
                if (f10 > 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                u6.g(z11);
                if (tVar.d != f10) {
                    tVar.d = f10;
                    tVar.f4553i = true;
                }
            } else {
                z0Var = b2.z0.d;
            }
            this.f14823x = z0Var;
        } else {
            z0Var = b2.z0.d;
        }
        b2.z0 z0Var2 = z0Var;
        if (!this.V && q0.a(this.f14816p)) {
            int i11 = ((b2.w) this.f14816p.f14784c).M;
            z12 = this.f14824y;
            ((z0) eVar.f2818c).f14860o = z12;
        }
        this.f14824y = z12;
        this.h.add(new r0(z0Var2, Math.max(0L, j10), e2.m0.Y(((o) this.f14816p.e).f14769b, l())));
        c2.j jVar = (c2.j) this.f14816p.f14785f;
        this.f14817q = jVar;
        jVar.a();
        x xVar = this.f14814n;
        if (xVar != null) {
            xVar.onSkipSilenceEnabledChanged(this.f14824y);
        }
    }

    public final i0 b(o oVar) {
        try {
            return ((k0) this.f14818r).a(oVar);
        } catch (m e) {
            w wVar = new w(oVar.f14769b, oVar.f14770c, oVar.f14768a, oVar.f14771f, (b2.w) this.f14816p.f14784c, oVar.e, e);
            x xVar = this.f14814n;
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
        if (this.f14819s == null && this.f14802a != null) {
            o0 o0Var = new o0(this);
            this.f14819s = o0Var;
            k0 k0Var = (k0) this.f14818r;
            k0Var.f();
            if (k0Var.f14726f == null) {
                k0Var.f14726f = new e2.r(Thread.currentThread());
            }
            k0Var.f14726f.a(o0Var);
        }
        String str = wVar.f4130s;
        int i12 = wVar.K;
        int i13 = wVar.M;
        if ("audio/raw".equals(str)) {
            u6.g(e2.m0.M(i13));
            int u10 = e2.m0.u(i13) * i12;
            ?? g0Var = new e9.g0(4);
            g0Var.d(this.f14808g);
            g0Var.c(this.e);
            c2.n[] nVarArr = (c2.n[]) this.f14804b.f2817b;
            int length = nVarArr.length;
            e9.s.d(length, nVarArr);
            g0Var.e(length);
            System.arraycopy(nVarArr, 0, g0Var.f8447a, g0Var.f8448b, length);
            g0Var.f8448b += length;
            jVar = new c2.j(g0Var.f());
            if (jVar.equals(this.f14817q)) {
                jVar = this.f14817q;
            }
            int i14 = wVar.N;
            int i15 = wVar.O;
            d1 d1Var = this.d;
            d1Var.f14667i = i14;
            d1Var.f14668j = i15;
            this.f14806c.f14756i = iArr;
            c2.k kVar = new c2.k(wVar.L, i12, i13);
            try {
                e9.n0 n0Var = jVar.f4512a;
                if (!kVar.equals(c2.k.e)) {
                    for (int i16 = 0; i16 < n0Var.size(); i16++) {
                        c2.n nVar = (c2.n) n0Var.get(i16);
                        c2.k e = nVar.e(kVar);
                        if (nVar.isActive()) {
                            u6.p(!e.equals(c2.k.e));
                            kVar = e;
                        }
                    }
                    int i17 = kVar.f4516b;
                    int i18 = kVar.f4517c;
                    b2.v a2 = wVar.a();
                    a2.L = i18;
                    a2.K = kVar.f4515a;
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
        b2.w wVar3 = i19.f14712a;
        try {
            o c10 = ((k0) this.f14818r).c(i19);
            boolean z10 = c10.e;
            if (c10.f14768a != 0) {
                if (c10.f14770c != 0) {
                    this.X = false;
                    q0 q0Var = new q0(wVar, wVar2, i10, i11, c10, jVar2);
                    if (p()) {
                        this.f14815o = q0Var;
                        return;
                    } else {
                        this.f14816p = q0Var;
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
            this.f14825z = 0L;
            this.A = 0L;
            this.B = 0L;
            this.C = 0L;
            this.Y = false;
            this.D = 0;
            this.f14822w = new r0(this.f14823x, 0L, 0L);
            this.G = 0L;
            this.v = null;
            this.h.clear();
            this.I = null;
            this.J = 0;
            this.K = null;
            this.M = false;
            this.L = false;
            this.N = false;
            this.d.f14673o = 0L;
            c2.j jVar = (c2.j) this.f14816p.f14785f;
            this.f14817q = jVar;
            jVar.a();
            this.f14810j = null;
            q0 q0Var = this.f14815o;
            if (q0Var != null) {
                this.f14816p = q0Var;
                this.f14815o = null;
            }
            f14801c0.incrementAndGet();
            i0 i0Var = this.f14820t;
            if (i0Var.f14699f.d.getPlayState() == 3) {
                i0Var.f14696a.pause();
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29 && i0Var.c()) {
                h0 h0Var = i0Var.f14701i;
                h0Var.getClass();
                h0.a(h0Var);
            }
            if (i10 >= 24 && (d0Var = i0Var.e) != null) {
                d0.b(d0Var);
                i0Var.e = null;
            }
            AudioTrack audioTrack = i0Var.f14696a;
            e2.r rVar = i0Var.f14702j;
            Handler q6 = e2.m0.q(null);
            synchronized (i0.f14694t) {
                try {
                    if (i0.f14695u == null) {
                        i0.f14695u = Executors.newSingleThreadScheduledExecutor(new e2.l0(0));
                    }
                    i0.v++;
                    i0.f14695u.schedule(new e2(audioTrack, q6, rVar, 2), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f14820t = null;
        }
        s0 s0Var = this.f14812l;
        s0Var.f14795a = null;
        s0Var.f14796b = -9223372036854775807L;
        s0Var.f14797c = -9223372036854775807L;
        s0 s0Var2 = this.f14811k;
        s0Var2.f14795a = null;
        s0Var2.f14796b = -9223372036854775807L;
        s0Var2.f14797c = -9223372036854775807L;
        this.Z = 0L;
        this.f14803a0 = 0L;
        Handler handler = this.f14805b0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final long g() {
        boolean z10;
        if (!p()) {
            return -9223372036854775807L;
        }
        if (q0.a(this.f14816p)) {
            return e2.m0.Y(((o) this.f14816p.e).f14769b, this.f14820t.f14696a.getBufferSizeInFrames());
        }
        long bufferSizeInFrames = this.f14820t.f14696a.getBufferSizeInFrames();
        int j10 = c3.b.j(((o) this.f14816p.e).f14768a);
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
            long min = Math.min(this.f14820t.a(), e2.m0.Y(((o) this.f14816p.e).f14769b, l()));
            while (true) {
                arrayDeque = this.h;
                if (arrayDeque.isEmpty() || min < ((r0) arrayDeque.getFirst()).f14791c) {
                    break;
                }
                this.f14822w = (r0) arrayDeque.remove();
            }
            r0 r0Var = this.f14822w;
            long j11 = min - r0Var.f14791c;
            long B = e2.m0.B(j11, r0Var.f14789a.f4154a);
            boolean isEmpty = arrayDeque.isEmpty();
            androidx.biometric.e eVar = this.f14804b;
            if (isEmpty) {
                c2.t tVar = (c2.t) eVar.d;
                if (tVar.isActive()) {
                    if (tVar.f4558n >= 1024) {
                        long j12 = tVar.f4557m;
                        tVar.f4554j.getClass();
                        long o10 = j12 - (sVar.f4540i.o() * (sVar.f4541j * sVar.f4536b));
                        int i10 = tVar.h.f4515a;
                        int i11 = tVar.f4552g.f4515a;
                        if (i10 == i11) {
                            j11 = e2.m0.a0(j11, o10, tVar.f4558n, RoundingMode.DOWN);
                        } else {
                            j11 = e2.m0.a0(j11, o10 * i10, tVar.f4558n * i11, RoundingMode.DOWN);
                        }
                    } else {
                        j11 = (long) (tVar.f4550c * j11);
                    }
                }
                r0 r0Var2 = this.f14822w;
                j10 = r0Var2.f14790b + j11;
                r0Var2.d = j11 - B;
            } else {
                r0 r0Var3 = this.f14822w;
                j10 = r0Var3.f14790b + B + r0Var3.d;
            }
            long j13 = ((z0) eVar.f2818c).f14862q;
            long Y = e2.m0.Y(((o) this.f14816p.e).f14769b, j13) + j10;
            long j14 = this.Z;
            if (j13 > j14) {
                long Y2 = e2.m0.Y(((o) this.f14816p.e).f14769b, j13 - j14);
                this.Z = j13;
                this.f14803a0 += Y2;
                if (this.f14805b0 == null) {
                    this.f14805b0 = new Handler(Looper.myLooper());
                }
                this.f14805b0.removeCallbacksAndMessages(null);
                this.f14805b0.postDelayed(new bc(this, 28), 100L);
            }
            return Y;
        }
        return Long.MIN_VALUE;
    }

    public final j i(b2.w wVar) {
        boolean z10;
        j jVar = new j(wVar);
        jVar.f14713b = this.f14821u;
        if (this.f14809i != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        jVar.d = z10;
        jVar.f14714c = this.T;
        jVar.e = this.Q;
        jVar.f14716g = this.V;
        jVar.h = -1;
        jVar.f14715f = this.U;
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
        int i10 = ((k0) this.f14818r).b(i(wVar)).d;
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
        if (q0.a(this.f14816p)) {
            long j10 = this.B;
            long j11 = this.f14816p.f14783b;
            return ((j10 + j11) - 1) / j11;
        }
        return this.C;
    }

    public final boolean m(long r21, int r23, java.nio.ByteBuffer r24) {
        throw new UnsupportedOperationException("Method not decompiled: k2.t0.m(long, int, java.nio.ByteBuffer):boolean");
    }

    public final boolean n() {
        if (p()) {
            if (Build.VERSION.SDK_INT < 29 || !this.f14820t.c() || !this.N) {
                long l4 = l();
                long a2 = this.f14820t.a();
                i0 i0Var = this.f14820t;
                i0Var.getClass();
                if (l4 > e2.m0.a0(a2, i0Var.f14696a.getSampleRate(), 1000000L, RoundingMode.UP)) {
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
        s0 s0Var = this.f14811k;
        boolean z10 = false;
        if (s0Var.f14795a != null && (f14801c0.get() > 0 || SystemClock.elapsedRealtime() < s0Var.f14797c)) {
            return false;
        }
        try {
            b10 = b((o) this.f14816p.e);
        } catch (w e) {
            int i11 = ((o) this.f14816p.e).f14771f;
            while (i11 > 1000000) {
                int i12 = i11 / 2;
                q0 q0Var = this.f14816p;
                int i13 = q0Var.f14783b;
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
                a2.f14761f = i10;
                o oVar = new o(a2);
                try {
                    b10 = b(oVar);
                    q0 q0Var2 = this.f14816p;
                    this.f14816p = new q0((b2.w) q0Var2.f14784c, (b2.w) q0Var2.d, q0Var2.f14782a, q0Var2.f14783b, oVar, (c2.j) q0Var2.f14785f);
                } catch (w e7) {
                    e.addSuppressed(e7);
                    i11 = i10;
                }
            }
            if (((o) this.f14816p.e).e) {
                this.X = true;
            }
            throw e;
        }
        this.f14820t = b10;
        p0 p0Var = new p0(this, (o) this.f14816p.e);
        this.f14810j = p0Var;
        b10.f14702j.a(p0Var);
        if (this.f14820t.c()) {
            q0 q0Var3 = this.f14816p;
            if (((o) q0Var3.e).f14775k) {
                i0 i0Var = this.f14820t;
                b2.w wVar = (b2.w) q0Var3.f14784c;
                i0Var.d(wVar.N, wVar.O);
            }
        }
        j2.k kVar = this.f14813m;
        if (kVar != null) {
            this.f14820t.f(kVar);
        }
        if (p()) {
            this.f14820t.f14696a.setVolume(this.H);
        }
        this.S.getClass();
        AudioDeviceInfo audioDeviceInfo = this.T;
        if (audioDeviceInfo != null) {
            this.f14820t.f14696a.setPreferredDevice(audioDeviceInfo);
        }
        this.F = true;
        int audioSessionId = this.f14820t.f14696a.getAudioSessionId();
        if (audioSessionId != this.Q) {
            z10 = true;
        }
        this.Q = audioSessionId;
        x xVar = this.f14814n;
        if (xVar != 0) {
            int i15 = ((o) this.f14816p.e).f14768a;
            xVar.Q(new Object());
            if (z10) {
                this.R = true;
                q0 q0Var4 = this.f14816p;
                n a10 = ((o) q0Var4.e).a();
                a10.h = this.Q;
                this.f14816p = new q0((b2.w) q0Var4.f14784c, (b2.w) q0Var4.d, q0Var4.f14782a, q0Var4.f14783b, new o(a10), (c2.j) q0Var4.f14785f);
                q0 q0Var5 = this.f14815o;
                if (q0Var5 != null) {
                    n a11 = ((o) q0Var5.e).a();
                    a11.h = this.Q;
                    this.f14815o = new q0((b2.w) q0Var5.f14784c, (b2.w) q0Var5.d, q0Var5.f14782a, q0Var5.f14783b, new o(a11), (c2.j) q0Var5.f14785f);
                }
                this.f14814n.onAudioSessionIdChanged(this.Q);
            }
        }
        return true;
    }

    public final boolean p() {
        if (this.f14820t != null) {
            return true;
        }
        return false;
    }

    public final void q() {
        this.O = false;
        if (p()) {
            i0 i0Var = this.f14820t;
            l0 l0Var = i0Var.f14699f;
            l0Var.f14741k = 0L;
            l0Var.f14750t = 0;
            l0Var.f14749s = 0;
            l0Var.f14742l = 0L;
            l0Var.f14754y = -9223372036854775807L;
            l0Var.f14755z = -9223372036854775807L;
            if (l0Var.f14751u == -9223372036854775807L) {
                l0Var.h.a(0);
            }
            l0Var.f14752w = l0Var.a();
            if (!i0Var.f14703k || i0Var.c()) {
                i0Var.f14696a.pause();
            }
        }
    }

    public final void r() {
        this.O = true;
        if (p()) {
            i0 i0Var = this.f14820t;
            l0 l0Var = i0Var.f14699f;
            if (l0Var.f14751u != -9223372036854775807L) {
                l0Var.f14735b.getClass();
                l0Var.f14751u = e2.m0.S(SystemClock.elapsedRealtime());
            }
            l0Var.f14740j = e2.m0.Y(l0Var.e, l0Var.a());
            l0Var.h.a(0);
            if (!i0Var.f14703k || i0Var.c()) {
                i0Var.f14696a.play();
            }
        }
    }

    public final void s() {
        if (!this.M) {
            this.M = true;
            if (this.f14820t.c()) {
                this.N = false;
            }
            i0 i0Var = this.f14820t;
            if (!i0Var.f14703k) {
                i0Var.f14703k = true;
                l0 l0Var = i0Var.f14699f;
                long b10 = i0Var.b();
                l0Var.f14752w = l0Var.a();
                l0Var.f14735b.getClass();
                l0Var.f14751u = e2.m0.S(SystemClock.elapsedRealtime());
                l0Var.f14753x = b10;
                i0Var.f14696a.stop();
                i0Var.f14708p = 0;
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
        if (this.f14816p != null) {
            q0 q0Var = this.f14815o;
            if (q0Var != null) {
                this.f14816p = q0Var;
                this.f14815o = null;
            }
            try {
                o c10 = ((k0) this.f14818r).c(i((b2.w) this.f14816p.d));
                q0 q0Var2 = this.f14816p;
                this.f14816p = new q0((b2.w) q0Var2.f14784c, (b2.w) q0Var2.d, q0Var2.f14782a, q0Var2.f14783b, c10, (c2.j) q0Var2.f14785f);
            } catch (i e) {
                throw new IllegalStateException(new v(e, (b2.w) this.f14816p.f14784c));
            }
        }
        f();
    }

    public final void w() {
        f();
        e9.l0 listIterator = this.f14808g.listIterator(0);
        while (listIterator.hasNext()) {
            ((c2.n) listIterator.next()).reset();
        }
        this.e.reset();
        this.f14807f.reset();
        c2.j jVar = this.f14817q;
        if (jVar != null) {
            e9.n0 n0Var = jVar.f4512a;
            for (int i10 = 0; i10 < n0Var.size(); i10++) {
                c2.n nVar = (c2.n) n0Var.get(i10);
                nVar.d(c2.l.f4518b);
                nVar.reset();
            }
            jVar.f4513b.clear();
            jVar.f4514c = new ByteBuffer[0];
            c2.k kVar = c2.k.e;
            jVar.d = false;
        }
        this.O = false;
        this.X = false;
    }

    public final void x() {
        if (p()) {
            i0 i0Var = this.f14820t;
            b2.z0 z0Var = this.f14823x;
            AudioTrack audioTrack = i0Var.f14696a;
            try {
                audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(e2.m0.h(z0Var.f4154a, 0.1f, i0Var.f14698c)).setPitch(e2.m0.h(z0Var.f4155b, 0.1f, 8.0f)).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                e2.a.m("AudioTrackAudioOutput", "Failed to set playback params", e);
            }
            l0 l0Var = i0Var.f14699f;
            l0Var.f14739i = audioTrack.getPlaybackParams().getSpeed();
            l0Var.h.a(0);
            l0Var.f14741k = 0L;
            l0Var.f14750t = 0;
            l0Var.f14749s = 0;
            l0Var.f14742l = 0L;
            l0Var.f14754y = -9223372036854775807L;
            l0Var.f14755z = -9223372036854775807L;
            PlaybackParams playbackParams = this.f14820t.f14696a.getPlaybackParams();
            this.f14823x = new b2.z0(playbackParams.getSpeed(), playbackParams.getPitch());
        }
    }

    public final void y(p pVar) {
        if (pVar.equals(this.f14818r)) {
            return;
        }
        ((k0) this.f14818r).d();
        this.f14818r = pVar;
        o0 o0Var = this.f14819s;
        if (o0Var != null) {
            k0 k0Var = (k0) pVar;
            k0Var.f();
            if (k0Var.f14726f == null) {
                k0Var.f14726f = new e2.r(Thread.currentThread());
            }
            k0Var.f14726f.a(o0Var);
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
