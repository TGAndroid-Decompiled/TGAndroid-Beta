package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
public final class q93 implements x30 {
    public long A;
    public long B;
    public long C;
    public int D;
    public int E;
    public long F;
    public boolean G;
    public boolean H;
    public long I;
    public long J;
    public float K;
    public ByteBuffer L;
    public int M;
    public ByteBuffer N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public int T;
    public boolean U;
    public ta0 V;
    public AudioDeviceInfo W;
    public int X;
    public boolean Y;
    public long Z;
    public final Context a;
    public boolean a0;
    public final mv6 b;
    public boolean b0;
    public final ci1 c;
    public long c0;
    public final e2c d;
    public long d0;
    public final bpb e;
    public Handler e0;
    public final bpb f;
    public final w59 g;
    public final ArrayDeque h;
    public byte i;
    public o93 j;
    public final ly0 k;
    public final ly0 l;
    public uc8 m;
    public u30 n;
    public wg2 o;
    public wg2 p;
    public k20 q;
    public s00 r;
    public n93 s;
    public j40 t;
    public nz u;
    public p93 v;
    public p93 w;
    public zb8 x;
    public boolean y;
    public long z;

    public q93(c30 c30Var) {
        Context applicationContext;
        int deviceId;
        Context context = (Context) c30Var.b;
        if (context == null) {
            applicationContext = null;
        } else {
            applicationContext = context.getApplicationContext();
        }
        this.a = applicationContext;
        this.u = nz.i;
        this.b = (mv6) c30Var.d;
        this.i = (byte) 0;
        this.r = (l40) c30Var.f;
        ?? cf0Var = new cf0();
        this.c = cf0Var;
        ?? cf0Var2 = new cf0();
        cf0Var2.m = g8c.b;
        this.d = cf0Var2;
        this.e = new bpb((byte) 1);
        this.f = new bpb((byte) 0);
        this.g = mm5.v(cf0Var2, cf0Var);
        this.K = 1.0f;
        this.T = 0;
        this.V = new Object();
        zb8 zb8Var = zb8.d;
        this.w = new p93(zb8Var, 0L, 0L);
        this.x = zb8Var;
        this.y = false;
        this.h = new ArrayDeque();
        this.k = new ly0(this);
        this.l = new ly0(this);
        int i = -1;
        if (Build.VERSION.SDK_INT >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i = deviceId;
        }
        this.X = i;
    }

    public static int k(int r10, java.nio.ByteBuffer r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q93.k(int, java.nio.ByteBuffer):int");
    }

    public final void A(ta0 ta0Var) {
        if (this.V.equals(ta0Var)) {
            return;
        }
        ta0Var.getClass();
        if (this.t != null) {
            this.V.getClass();
        }
        this.V = ta0Var;
    }

    public final void B(java.nio.ByteBuffer r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q93.B(java.nio.ByteBuffer):void");
    }

    public final void C(zb8 zb8Var) {
        if (E()) {
            this.x = zb8Var;
            x();
            return;
        }
        zb8 zb8Var2 = new zb8(g8c.h(zb8Var.a, 0.1f, 8.0f), g8c.h(zb8Var.b, 0.1f, 8.0f));
        this.x = zb8Var2;
        p93 p93Var = new p93(zb8Var2, -9223372036854775807L, -9223372036854775807L);
        if (p()) {
            this.v = p93Var;
        } else {
            this.w = p93Var;
        }
    }

    public final void D(long j) {
        long j2;
        wg2 wg2Var = this.p;
        this.q = (k20) wg2Var.f;
        if (j == -9223372036854775807L) {
            j2 = 0;
        } else {
            j2 = j - this.J;
            if (((aob) wg2Var.g) != aob.a && wg2Var.h != null) {
                xnb xnbVar = new xnb();
                wg2 wg2Var2 = this.p;
                ((aob) wg2Var2.g).g(wg2Var2.h, xnbVar);
                j2 += xnbVar.e;
            }
        }
        k20 k20Var = this.q;
        m20 m20Var = new m20();
        wg2 wg2Var3 = this.p;
        m20Var.b = (aob) wg2Var3.g;
        m20Var.c = wg2Var3.h;
        m20Var.a = j2;
        n20 a = m20Var.a();
        w59 w59Var = k20Var.a;
        ArrayList arrayList = k20Var.b;
        arrayList.clear();
        k20Var.d = false;
        for (int i = 0; i < w59Var.d; i++) {
            p20 p20Var = (p20) w59Var.get(i);
            p20Var.c(a);
            if (p20Var.isActive()) {
                ?? obj = new Object();
                long j3 = a.a;
                obj.a = j3;
                obj.b = a.b;
                obj.c = a.c;
                obj.a = p20Var.g(j3);
                a = obj.a();
                arrayList.add(p20Var);
            }
        }
        k20Var.c = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= k20Var.a(); i2++) {
            k20Var.c[i2] = ((p20) arrayList.get(i2)).b();
        }
    }

    public final boolean E() {
        wg2 wg2Var = this.p;
        if (wg2Var != null && ((r00) wg2Var.e).j) {
            return true;
        }
        return false;
    }

    public final void a(long j) {
        zb8 zb8Var;
        boolean z;
        boolean z2;
        boolean E = E();
        boolean z3 = false;
        mv6 mv6Var = this.b;
        if (!E) {
            if (!this.Y && this.p.d()) {
                int i = ((fm4) this.p.c).Q;
                zb8Var = this.x;
                mka mkaVar = (mka) mv6Var.d;
                float f = zb8Var.a;
                if (f > 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                gre.f(z);
                if (mkaVar.b != f) {
                    mkaVar.b = f;
                    mkaVar.h = true;
                }
                float f2 = zb8Var.b;
                if (f2 > 0.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                gre.f(z2);
                if (mkaVar.c != f2) {
                    mkaVar.c = f2;
                    mkaVar.h = true;
                }
            } else {
                zb8Var = zb8.d;
            }
            this.x = zb8Var;
        } else {
            zb8Var = zb8.d;
        }
        zb8 zb8Var2 = zb8Var;
        if (!this.Y && this.p.d()) {
            int i2 = ((fm4) this.p.c).Q;
            z3 = this.y;
            ((lha) mv6Var.c).j = z3;
        }
        this.y = z3;
        this.h.add(new p93(zb8Var2, Math.max(0L, j), g8c.Z(((r00) this.p.e).b, l())));
        D(j);
        u30 u30Var = this.n;
        if (u30Var != null) {
            u30Var.h(this.y);
        }
    }

    public final j40 b(r00 r00Var) {
        try {
            return ((l40) this.r).a(r00Var);
        } catch (p00 e) {
            t30 t30Var = new t30(r00Var.b, r00Var.c, r00Var.a, r00Var.f, (fm4) this.p.c, r00Var.e, e);
            u30 u30Var = this.n;
            if (u30Var != null) {
                u30Var.w1(t30Var);
            }
            throw t30Var;
        }
    }

    public final void c(r30 r30Var) {
        int i;
        k20 k20Var;
        fm4 fm4Var;
        int i2;
        Object obj;
        if (this.s == null && this.a != null) {
            n93 n93Var = new n93(this);
            this.s = n93Var;
            l40 l40Var = (l40) this.r;
            l40Var.f();
            a66 a66Var = l40Var.e;
            if (a66Var == null) {
                a66Var = new a66(Thread.currentThread());
                l40Var.e = a66Var;
            }
            a66Var.a(n93Var);
        }
        fm4 fm4Var2 = r30Var.a;
        String str = fm4Var2.t;
        int i3 = fm4Var2.N;
        int i4 = fm4Var2.Q;
        int i5 = -1;
        if ("audio/raw".equals(str)) {
            gre.f(g8c.N(i4));
            int u = g8c.u(i4) * i3;
            ?? em5Var = new em5(4);
            em5Var.d(this.g);
            em5Var.c(this.e);
            p20[] p20VarArr = (p20[]) this.b.b;
            int length = p20VarArr.length;
            xpe.a(length, p20VarArr);
            em5Var.e(length);
            System.arraycopy(p20VarArr, 0, em5Var.a, em5Var.b, length);
            em5Var.b += length;
            k20 k20Var2 = new k20(em5Var.f());
            if (k20Var2.equals(this.q)) {
                k20Var2 = this.q;
            }
            int i6 = fm4Var2.R;
            int i7 = fm4Var2.S;
            e2c e2cVar = this.d;
            e2cVar.i = i6;
            e2cVar.j = i7;
            this.c.i = r30Var.b;
            l20 l20Var = new l20(fm4Var2.P, i3, i4);
            try {
                w59 w59Var = k20Var2.a;
                if (!l20Var.equals(l20.e)) {
                    for (int i8 = 0; i8 < w59Var.d; i8++) {
                        p20 p20Var = (p20) w59Var.get(i8);
                        l20 e = p20Var.e(l20Var);
                        if (p20Var.isActive()) {
                            gre.p(!e.equals(l20.e));
                            l20Var = e;
                        }
                    }
                    int i9 = l20Var.b;
                    int i10 = l20Var.c;
                    em4 a = fm4Var2.a();
                    a.P = i10;
                    a.O = l20Var.a;
                    a.M = i9;
                    if (i9 == i3) {
                        i5 = fm4Var2.O;
                    }
                    a.N = i5;
                    fm4 fm4Var3 = new fm4(a);
                    i = u;
                    k20Var = k20Var2;
                    i2 = g8c.u(i10) * i9;
                    fm4Var = fm4Var3;
                } else {
                    throw new o20(l20Var);
                }
            } catch (o20 e2) {
                throw new s30(e2, fm4Var2);
            }
        } else {
            km5 km5Var = mm5.b;
            i = -1;
            k20Var = new k20(w59.e);
            fm4Var = fm4Var2;
            i2 = -1;
        }
        n00 i11 = i(fm4Var);
        fm4 fm4Var4 = (fm4) i11.a;
        try {
            r00 c = ((l40) this.r).c(i11);
            boolean z = c.e;
            if (c.a != 0) {
                if (c.c != 0) {
                    this.a0 = false;
                    aob aobVar = r30Var.c;
                    rx6 rx6Var = r30Var.d;
                    if (rx6Var != null) {
                        obj = rx6Var.a;
                    } else {
                        obj = null;
                    }
                    wg2 wg2Var = new wg2(fm4Var2, fm4Var, i, i2, c, k20Var, aobVar, obj);
                    if (p()) {
                        this.o = wg2Var;
                        return;
                    } else {
                        this.p = wg2Var;
                        return;
                    }
                }
                throw new s30("Invalid output channel config (isOffload=" + z + ")", fm4Var4);
            }
            throw new s30("Invalid output encoding (isOffload=" + z + ")", fm4Var4);
        } catch (m00 e3) {
            throw new s30(e3, fm4Var2);
        }
    }

    public final void d(long r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q93.d(long):void");
    }

    public final boolean e() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q93.e():boolean");
    }

    public final void f() {
        e40 e40Var;
        if (p()) {
            this.z = 0L;
            this.A = 0L;
            this.B = 0L;
            this.C = 0L;
            this.b0 = false;
            this.D = 0;
            this.E = 0;
            this.F = 0L;
            this.w = new p93(this.x, 0L, 0L);
            this.I = 0L;
            this.v = null;
            this.h.clear();
            this.L = null;
            this.M = 0;
            this.N = null;
            this.P = false;
            this.O = false;
            this.Q = false;
            this.d.o = 0L;
            D(-9223372036854775807L);
            this.j = null;
            wg2 wg2Var = this.o;
            if (wg2Var != null) {
                this.p = wg2Var;
                this.o = null;
            }
            j40 j40Var = this.t;
            if (j40Var.e.d.getPlayState() == 3) {
                j40Var.a.pause();
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 29 && j40Var.c()) {
                i40 i40Var = j40Var.h;
                i40Var.getClass();
                i40Var.a();
            }
            if (i >= 24 && (e40Var = j40Var.d) != null) {
                e40Var.b();
                j40Var.d = null;
            }
            AudioTrack audioTrack = j40Var.a;
            a66 a66Var = j40Var.i;
            Handler q = g8c.q(null);
            synchronized (j40.s) {
                ScheduledExecutorService scheduledExecutorService = j40.t;
                if (scheduledExecutorService == null) {
                    scheduledExecutorService = Executors.newSingleThreadScheduledExecutor(new x20((byte) 9));
                    j40.t = scheduledExecutorService;
                }
                j40.u++;
                scheduledExecutorService.schedule(new nn6(audioTrack, q, a66Var, (byte) 14), 20L, TimeUnit.MILLISECONDS);
            }
            this.t = null;
        }
        ly0 ly0Var = this.l;
        ly0Var.c = null;
        ly0Var.a = -9223372036854775807L;
        ly0Var.b = -9223372036854775807L;
        ly0 ly0Var2 = this.k;
        ly0Var2.c = null;
        ly0Var2.a = -9223372036854775807L;
        ly0Var2.b = -9223372036854775807L;
        this.c0 = 0L;
        this.d0 = 0L;
        Handler handler = this.e0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final long g() {
        boolean z;
        if (!p()) {
            return -9223372036854775807L;
        }
        if (this.p.d()) {
            return g8c.Z(((r00) this.p.e).b, this.t.a.getBufferSizeInFrames());
        }
        long bufferSizeInFrames = this.t.a.getBufferSizeInFrames();
        int b = yfe.b(((r00) this.p.e).a);
        if (b != -2147483647) {
            z = true;
        } else {
            z = false;
        }
        gre.p(z);
        return g8c.b0(bufferSizeInFrames, 1000000L, b, RoundingMode.DOWN);
    }

    public final long h() {
        ArrayDeque arrayDeque;
        long j;
        lka lkaVar;
        if (p() && !this.H) {
            long min = Math.min(this.t.a(), g8c.Z(((r00) this.p.e).b, l()));
            while (true) {
                arrayDeque = this.h;
                if (arrayDeque.isEmpty() || min < ((p93) arrayDeque.getFirst()).c) {
                    break;
                }
                this.w = (p93) arrayDeque.remove();
            }
            p93 p93Var = this.w;
            long j2 = min - p93Var.c;
            long D = g8c.D(j2, p93Var.a.a);
            boolean isEmpty = arrayDeque.isEmpty();
            mv6 mv6Var = this.b;
            if (isEmpty) {
                mka mkaVar = (mka) mv6Var.d;
                if (mkaVar.isActive()) {
                    if (mkaVar.m >= 1024) {
                        long j3 = mkaVar.l;
                        mkaVar.i.getClass();
                        long o = j3 - (lkaVar.i.o() * (lkaVar.j * lkaVar.b));
                        int i = mkaVar.g.a;
                        int i2 = mkaVar.f.a;
                        long j4 = mkaVar.m;
                        if (i == i2) {
                            j2 = g8c.b0(j2, o, j4, RoundingMode.DOWN);
                        } else {
                            j2 = g8c.b0(j2, o * i, j4 * i2, RoundingMode.DOWN);
                        }
                    } else {
                        j2 = (long) (mkaVar.b * j2);
                    }
                }
                p93 p93Var2 = this.w;
                j = p93Var2.b + j2;
                p93Var2.d = j2 - D;
            } else {
                p93 p93Var3 = this.w;
                j = p93Var3.b + D + p93Var3.d;
            }
            long j5 = ((lha) mv6Var.c).l;
            long Z = g8c.Z(((r00) this.p.e).b, j5) + j;
            long j6 = this.c0;
            if (j5 > j6) {
                long Z2 = g8c.Z(((r00) this.p.e).b, j5 - j6);
                this.c0 = j5;
                this.d0 += Z2;
                Handler handler = this.e0;
                if (handler == null) {
                    handler = new Handler(Looper.myLooper());
                    this.e0 = handler;
                }
                handler.removeCallbacksAndMessages(null);
                this.e0.postDelayed(new mk2(this, (byte) 19), 100L);
            }
            return Z;
        }
        return Long.MIN_VALUE;
    }

    public final n00 i(fm4 fm4Var) {
        ?? obj = new Object();
        obj.a = fm4Var;
        obj.b = nz.i;
        boolean z = false;
        obj.e = 0;
        obj.f = -1;
        obj.b = this.u;
        if (this.i != 0) {
            z = true;
        }
        obj.d = z;
        obj.c = this.W;
        obj.e = this.T;
        obj.g = this.Y;
        obj.f = this.X;
        ?? obj2 = new Object();
        obj2.a = (fm4) obj.a;
        obj2.b = (nz) obj.b;
        obj2.c = (AudioDeviceInfo) obj.c;
        obj2.d = obj.d;
        obj2.e = obj.e;
        obj2.f = obj.f;
        obj2.g = obj.g;
        return obj2;
    }

    public final int j(fm4 fm4Var) {
        boolean z;
        if (g8c.N(fm4Var.Q) && fm4Var.Q != 2) {
            em4 a = fm4Var.a();
            a.P = 2;
            fm4Var = new fm4(a);
            z = true;
        } else {
            z = false;
        }
        byte b = ((l40) this.r).b(i(fm4Var)).d;
        if (b != 1) {
            if (b != 2) {
                return 0;
            }
            if (!z) {
                return 2;
            }
        }
        return 1;
    }

    public final long l() {
        if (this.p.d()) {
            long j = this.B;
            long j2 = this.p.b;
            return ((j + j2) - 1) / j2;
        }
        return this.C;
    }

    public final boolean m(long r19, int r21, java.nio.ByteBuffer r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q93.m(long, int, java.nio.ByteBuffer):boolean");
    }

    public final boolean n() {
        if (p()) {
            if (Build.VERSION.SDK_INT < 29 || !this.t.c() || !this.Q) {
                long l = l();
                long a = this.t.a();
                j40 j40Var = this.t;
                j40Var.getClass();
                if (l > g8c.b0(a, j40Var.a.getSampleRate(), 1000000L, RoundingMode.UP)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean o() {
        int b;
        j40 j40Var;
        boolean z;
        ly0 ly0Var = this.k;
        boolean z2 = false;
        if (((Exception) ly0Var.c) != null) {
            ((l40) ((q93) ly0Var.d).r).getClass();
            synchronized (j40.s) {
                if (j40.u > 0) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z || SystemClock.elapsedRealtime() < ly0Var.b) {
                return false;
            }
        }
        try {
            j40Var = b((r00) this.p.e);
        } catch (t30 e) {
            r00 r00Var = (r00) this.p.e;
            int i = r00Var.f;
            boolean N = g8c.N(r00Var.a);
            wg2 wg2Var = this.p;
            if (N) {
                b = ((r00) wg2Var.e).b * wg2Var.b;
            } else {
                int i2 = ((fm4) wg2Var.c).k;
                if (i2 != -1) {
                    b = i2 / 8;
                } else {
                    b = yfe.b(((r00) wg2Var.e).a);
                    if (b == -2147483647) {
                        b = 1000000;
                    }
                }
            }
            r00 r00Var2 = (r00) this.p.e;
            int max = Math.max(b, AudioTrack.getMinBufferSize(r00Var2.b, r00Var2.c, r00Var2.a));
            int i3 = this.p.b;
            if (i3 == -1) {
                i3 = 1;
            }
            while (i > max) {
                i = Math.max(max, i / 2);
                int i4 = i % i3;
                if (i4 != 0) {
                    i = (i3 - i4) + i;
                }
                q00 a = ((r00) this.p.e).a();
                a.f = i;
                r00 r00Var3 = new r00(a);
                try {
                    j40 b2 = b(r00Var3);
                    this.p = this.p.c(r00Var3);
                    j40Var = b2;
                } catch (t30 e2) {
                    e.addSuppressed(e2);
                }
            }
            if (((r00) this.p.e).e) {
                this.a0 = true;
            }
            throw e;
        }
        this.t = j40Var;
        o93 o93Var = new o93(this, (r00) this.p.e);
        this.j = o93Var;
        j40Var.i.a(o93Var);
        if (this.t.c()) {
            wg2 wg2Var2 = this.p;
            if (((r00) wg2Var2.e).k) {
                j40 j40Var2 = this.t;
                fm4 fm4Var = (fm4) wg2Var2.c;
                j40Var2.d(fm4Var.R, fm4Var.S);
            }
        }
        uc8 uc8Var = this.m;
        if (uc8Var != null) {
            this.t.f(uc8Var);
        }
        if (p()) {
            this.t.a.setVolume(this.K);
        }
        this.V.getClass();
        AudioDeviceInfo audioDeviceInfo = this.W;
        if (audioDeviceInfo != null) {
            this.t.a.setPreferredDevice(audioDeviceInfo);
        }
        this.H = true;
        int audioSessionId = this.t.a.getAudioSessionId();
        if (audioSessionId != this.T) {
            z2 = true;
        }
        this.T = audioSessionId;
        u30 u30Var = this.n;
        if (u30Var != null) {
            Object obj = this.p.e;
            u30Var.s0(new pd5((byte) 14));
            if (z2) {
                this.U = true;
                wg2 wg2Var3 = this.p;
                q00 a2 = ((r00) wg2Var3.e).a();
                a2.h = this.T;
                this.p = wg2Var3.c(new r00(a2));
                wg2 wg2Var4 = this.o;
                if (wg2Var4 != null) {
                    q00 a3 = ((r00) wg2Var4.e).a();
                    a3.h = this.T;
                    this.o = wg2Var4.c(new r00(a3));
                }
                this.n.d(this.T);
            }
        }
        return true;
    }

    public final boolean p() {
        if (this.t != null) {
            return true;
        }
        return false;
    }

    public final void q() {
        this.R = false;
        if (p()) {
            j40 j40Var = this.t;
            m40 m40Var = j40Var.e;
            m40Var.e();
            if (m40Var.u == -9223372036854775807L) {
                m40Var.h.a(0);
            }
            m40Var.w = m40Var.a();
            if (!j40Var.j || j40Var.c()) {
                j40Var.a.pause();
            }
        }
    }

    public final void r() {
        this.R = true;
        if (p()) {
            j40 j40Var = this.t;
            m40 m40Var = j40Var.e;
            if (m40Var.u != -9223372036854775807L) {
                m40Var.b.getClass();
                m40Var.u = g8c.T(SystemClock.elapsedRealtime());
            }
            m40Var.j = g8c.Z(m40Var.e, m40Var.a());
            m40Var.h.a(0);
            if (!j40Var.j || j40Var.c()) {
                j40Var.a.play();
            }
        }
    }

    public final void s() {
        if (!this.P) {
            this.P = true;
            if (this.t.c()) {
                this.Q = false;
            }
            j40 j40Var = this.t;
            if (!j40Var.j) {
                j40Var.j = true;
                m40 m40Var = j40Var.e;
                long b = j40Var.b();
                m40Var.w = m40Var.a();
                m40Var.b.getClass();
                m40Var.u = g8c.T(SystemClock.elapsedRealtime());
                m40Var.x = b;
                j40Var.a.stop();
                j40Var.o = 0;
            }
        }
    }

    public final void t() {
        if (!this.O && p() && e()) {
            s();
            this.O = true;
        }
    }

    public final void u(long r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q93.u(long):void");
    }

    public final void v() {
        wg2 wg2Var = this.p;
        if (wg2Var != null) {
            wg2 wg2Var2 = this.o;
            if (wg2Var2 != null) {
                this.p = wg2Var2;
                this.o = null;
                wg2Var = wg2Var2;
            }
            try {
                this.p = this.p.c(((l40) this.r).c(i((fm4) wg2Var.d)));
            } catch (m00 e) {
                ho9.n(new s30(e, (fm4) this.p.c));
                return;
            }
        }
        f();
    }

    public final void w() {
        f();
        km5 listIterator = this.g.listIterator(0);
        while (listIterator.hasNext()) {
            ((p20) listIterator.next()).reset();
        }
        this.e.reset();
        this.f.reset();
        k20 k20Var = this.q;
        if (k20Var != null) {
            w59 w59Var = k20Var.a;
            for (int i = 0; i < w59Var.d; i++) {
                p20 p20Var = (p20) w59Var.get(i);
                p20Var.c(n20.d);
                p20Var.reset();
            }
            k20Var.b.clear();
            k20Var.c = new ByteBuffer[0];
            l20 l20Var = l20.e;
            k20Var.d = false;
        }
        this.R = false;
        this.a0 = false;
    }

    public final void x() {
        if (p()) {
            j40 j40Var = this.t;
            zb8 zb8Var = this.x;
            AudioTrack audioTrack = j40Var.a;
            try {
                audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(g8c.h(zb8Var.a, 0.1f, 8.0f)).setPitch(g8c.h(zb8Var.b, 0.1f, 8.0f)).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                lad.g("AudioTrackAudioOutput", "Failed to set playback params", e);
            }
            m40 m40Var = j40Var.e;
            m40Var.i = audioTrack.getPlaybackParams().getSpeed();
            m40Var.h.a(0);
            m40Var.e();
            PlaybackParams playbackParams = this.t.a.getPlaybackParams();
            this.x = new zb8(playbackParams.getSpeed(), playbackParams.getPitch());
        }
    }

    public final void y(s00 s00Var) {
        if (s00Var.equals(this.r)) {
            return;
        }
        ((l40) this.r).d();
        this.r = s00Var;
        n93 n93Var = this.s;
        if (n93Var != null) {
            l40 l40Var = (l40) s00Var;
            l40Var.f();
            a66 a66Var = l40Var.e;
            if (a66Var == null) {
                a66Var = new a66(Thread.currentThread());
                l40Var.e = a66Var;
            }
            a66Var.a(n93Var);
        }
        v();
    }

    public final void z(int i) {
        boolean z = false;
        if (this.U) {
            if (this.T == i) {
                this.U = false;
            } else {
                return;
            }
        }
        if (this.T != i) {
            this.T = i;
            if (i != 0) {
                z = true;
            }
            this.S = z;
            v();
        }
    }
}
