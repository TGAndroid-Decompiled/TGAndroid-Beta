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
public final class cb3 implements x40 {
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
    public tb0 V;
    public AudioDeviceInfo W;
    public int X;
    public boolean Y;
    public long Z;
    public final Context a;
    public boolean a0;
    public final mx6 b;
    public boolean b0;
    public final jj1 c;
    public long c0;
    public final e4c d;
    public long d0;
    public final crb e;
    public Handler e0;
    public final crb f;
    public final y79 g;
    public final ArrayDeque h;
    public byte i;
    public ab3 j;
    public final sz0 k;
    public final sz0 l;
    public we8 m;
    public u40 n;
    public ki2 o;
    public ki2 p;
    public k30 q;
    public s10 r;
    public za3 s;
    public j50 t;
    public o00 u;
    public bb3 v;
    public bb3 w;
    public ce8 x;
    public boolean y;
    public long z;

    public cb3(c40 c40Var) {
        Context applicationContext;
        int deviceId;
        Context context = (Context) c40Var.b;
        if (context == null) {
            applicationContext = null;
        } else {
            applicationContext = context.getApplicationContext();
        }
        this.a = applicationContext;
        this.u = o00.i;
        this.b = (mx6) c40Var.d;
        this.i = (byte) 0;
        this.r = (l50) c40Var.f;
        ?? cg0Var = new cg0();
        this.c = cg0Var;
        ?? cg0Var2 = new cg0();
        cg0Var2.m = hac.b;
        this.d = cg0Var2;
        this.e = new crb((byte) 1);
        this.f = new crb((byte) 0);
        this.g = mo5.v(cg0Var2, cg0Var);
        this.K = 1.0f;
        this.T = 0;
        this.V = new Object();
        ce8 ce8Var = ce8.d;
        this.w = new bb3(ce8Var, 0L, 0L);
        this.x = ce8Var;
        this.y = false;
        this.h = new ArrayDeque();
        this.k = new sz0(this);
        this.l = new sz0(this);
        int i = -1;
        if (Build.VERSION.SDK_INT >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i = deviceId;
        }
        this.X = i;
    }

    public static int k(int r10, java.nio.ByteBuffer r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cb3.k(int, java.nio.ByteBuffer):int");
    }

    public final void A(tb0 tb0Var) {
        if (this.V.equals(tb0Var)) {
            return;
        }
        tb0Var.getClass();
        if (this.t != null) {
            this.V.getClass();
        }
        this.V = tb0Var;
    }

    public final void B(java.nio.ByteBuffer r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cb3.B(java.nio.ByteBuffer):void");
    }

    public final void C(ce8 ce8Var) {
        if (E()) {
            this.x = ce8Var;
            x();
            return;
        }
        ce8 ce8Var2 = new ce8(hac.h(ce8Var.a, 0.1f, 8.0f), hac.h(ce8Var.b, 0.1f, 8.0f));
        this.x = ce8Var2;
        bb3 bb3Var = new bb3(ce8Var2, -9223372036854775807L, -9223372036854775807L);
        if (p()) {
            this.v = bb3Var;
        } else {
            this.w = bb3Var;
        }
    }

    public final void D(long j) {
        long j2;
        ki2 ki2Var = this.p;
        this.q = (k30) ki2Var.f;
        if (j == -9223372036854775807L) {
            j2 = 0;
        } else {
            j2 = j - this.J;
            if (((bqb) ki2Var.g) != bqb.a && ki2Var.h != null) {
                ypb ypbVar = new ypb();
                ki2 ki2Var2 = this.p;
                ((bqb) ki2Var2.g).g(ki2Var2.h, ypbVar);
                j2 += ypbVar.e;
            }
        }
        k30 k30Var = this.q;
        m30 m30Var = new m30();
        ki2 ki2Var3 = this.p;
        m30Var.b = (bqb) ki2Var3.g;
        m30Var.c = ki2Var3.h;
        m30Var.a = j2;
        n30 a = m30Var.a();
        y79 y79Var = k30Var.a;
        ArrayList arrayList = k30Var.b;
        arrayList.clear();
        k30Var.d = false;
        for (int i = 0; i < y79Var.d; i++) {
            p30 p30Var = (p30) y79Var.get(i);
            p30Var.c(a);
            if (p30Var.isActive()) {
                ?? obj = new Object();
                long j3 = a.a;
                obj.a = j3;
                obj.b = a.b;
                obj.c = a.c;
                obj.a = p30Var.g(j3);
                a = obj.a();
                arrayList.add(p30Var);
            }
        }
        k30Var.c = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= k30Var.a(); i2++) {
            k30Var.c[i2] = ((p30) arrayList.get(i2)).b();
        }
    }

    public final boolean E() {
        ki2 ki2Var = this.p;
        if (ki2Var != null && ((r10) ki2Var.e).j) {
            return true;
        }
        return false;
    }

    public final void a(long j) {
        ce8 ce8Var;
        boolean z;
        boolean z2;
        boolean E = E();
        boolean z3 = false;
        mx6 mx6Var = this.b;
        if (!E) {
            if (!this.Y && this.p.d()) {
                int i = ((go4) this.p.c).Q;
                ce8Var = this.x;
                nma nmaVar = (nma) mx6Var.d;
                float f = ce8Var.a;
                if (f > 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                jte.f(z);
                if (nmaVar.b != f) {
                    nmaVar.b = f;
                    nmaVar.h = true;
                }
                float f2 = ce8Var.b;
                if (f2 > 0.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                jte.f(z2);
                if (nmaVar.c != f2) {
                    nmaVar.c = f2;
                    nmaVar.h = true;
                }
            } else {
                ce8Var = ce8.d;
            }
            this.x = ce8Var;
        } else {
            ce8Var = ce8.d;
        }
        ce8 ce8Var2 = ce8Var;
        if (!this.Y && this.p.d()) {
            int i2 = ((go4) this.p.c).Q;
            z3 = this.y;
            ((nja) mx6Var.c).j = z3;
        }
        this.y = z3;
        this.h.add(new bb3(ce8Var2, Math.max(0L, j), hac.Z(((r10) this.p.e).b, l())));
        D(j);
        u40 u40Var = this.n;
        if (u40Var != null) {
            u40Var.f(this.y);
        }
    }

    public final j50 b(r10 r10Var) {
        try {
            return ((l50) this.r).a(r10Var);
        } catch (p10 e) {
            t40 t40Var = new t40(r10Var.b, r10Var.c, r10Var.a, r10Var.f, (go4) this.p.c, r10Var.e, e);
            u40 u40Var = this.n;
            if (u40Var != null) {
                u40Var.f0(t40Var);
            }
            throw t40Var;
        }
    }

    public final void c(r40 r40Var) {
        int i;
        k30 k30Var;
        go4 go4Var;
        int i2;
        Object obj;
        if (this.s == null && this.a != null) {
            za3 za3Var = new za3(this);
            this.s = za3Var;
            l50 l50Var = (l50) this.r;
            l50Var.f();
            a86 a86Var = l50Var.e;
            if (a86Var == null) {
                a86Var = new a86(Thread.currentThread());
                l50Var.e = a86Var;
            }
            a86Var.a(za3Var);
        }
        go4 go4Var2 = r40Var.a;
        String str = go4Var2.t;
        int i3 = go4Var2.N;
        int i4 = go4Var2.Q;
        int i5 = -1;
        if ("audio/raw".equals(str)) {
            jte.f(hac.N(i4));
            int u = hac.u(i4) * i3;
            ?? eo5Var = new eo5(4);
            eo5Var.d(this.g);
            eo5Var.c(this.e);
            p30[] p30VarArr = (p30[]) this.b.b;
            int length = p30VarArr.length;
            ase.a(length, p30VarArr);
            eo5Var.e(length);
            System.arraycopy(p30VarArr, 0, eo5Var.a, eo5Var.b, length);
            eo5Var.b += length;
            k30 k30Var2 = new k30(eo5Var.f());
            if (k30Var2.equals(this.q)) {
                k30Var2 = this.q;
            }
            int i6 = go4Var2.R;
            int i7 = go4Var2.S;
            e4c e4cVar = this.d;
            e4cVar.i = i6;
            e4cVar.j = i7;
            this.c.i = r40Var.b;
            l30 l30Var = new l30(go4Var2.P, i3, i4);
            try {
                y79 y79Var = k30Var2.a;
                if (!l30Var.equals(l30.e)) {
                    for (int i8 = 0; i8 < y79Var.d; i8++) {
                        p30 p30Var = (p30) y79Var.get(i8);
                        l30 e = p30Var.e(l30Var);
                        if (p30Var.isActive()) {
                            jte.p(!e.equals(l30.e));
                            l30Var = e;
                        }
                    }
                    int i9 = l30Var.b;
                    int i10 = l30Var.c;
                    fo4 a = go4Var2.a();
                    a.P = i10;
                    a.O = l30Var.a;
                    a.M = i9;
                    if (i9 == i3) {
                        i5 = go4Var2.O;
                    }
                    a.N = i5;
                    go4 go4Var3 = new go4(a);
                    i = u;
                    k30Var = k30Var2;
                    i2 = hac.u(i10) * i9;
                    go4Var = go4Var3;
                } else {
                    throw new o30(l30Var);
                }
            } catch (o30 e2) {
                throw new s40(e2, go4Var2);
            }
        } else {
            ko5 ko5Var = mo5.b;
            i = -1;
            k30Var = new k30(y79.e);
            go4Var = go4Var2;
            i2 = -1;
        }
        n10 i11 = i(go4Var);
        go4 go4Var4 = (go4) i11.a;
        try {
            r10 c = ((l50) this.r).c(i11);
            boolean z = c.e;
            if (c.a != 0) {
                if (c.c != 0) {
                    this.a0 = false;
                    bqb bqbVar = r40Var.c;
                    rz6 rz6Var = r40Var.d;
                    if (rz6Var != null) {
                        obj = rz6Var.a;
                    } else {
                        obj = null;
                    }
                    ki2 ki2Var = new ki2(go4Var2, go4Var, i, i2, c, k30Var, bqbVar, obj);
                    if (p()) {
                        this.o = ki2Var;
                        return;
                    } else {
                        this.p = ki2Var;
                        return;
                    }
                }
                throw new s40("Invalid output channel config (isOffload=" + z + ")", go4Var4);
            }
            throw new s40("Invalid output encoding (isOffload=" + z + ")", go4Var4);
        } catch (m10 e3) {
            throw new s40(e3, go4Var2);
        }
    }

    public final void d(long r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cb3.d(long):void");
    }

    public final boolean e() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cb3.e():boolean");
    }

    public final void f() {
        e50 e50Var;
        if (p()) {
            this.z = 0L;
            this.A = 0L;
            this.B = 0L;
            this.C = 0L;
            this.b0 = false;
            this.D = 0;
            this.E = 0;
            this.F = 0L;
            this.w = new bb3(this.x, 0L, 0L);
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
            ki2 ki2Var = this.o;
            if (ki2Var != null) {
                this.p = ki2Var;
                this.o = null;
            }
            j50 j50Var = this.t;
            if (j50Var.e.d.getPlayState() == 3) {
                j50Var.a.pause();
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 29 && j50Var.c()) {
                i50 i50Var = j50Var.h;
                i50Var.getClass();
                i50Var.a();
            }
            if (i >= 24 && (e50Var = j50Var.d) != null) {
                e50Var.b();
                j50Var.d = null;
            }
            AudioTrack audioTrack = j50Var.a;
            a86 a86Var = j50Var.i;
            Handler q = hac.q(null);
            synchronized (j50.s) {
                ScheduledExecutorService scheduledExecutorService = j50.t;
                if (scheduledExecutorService == null) {
                    scheduledExecutorService = Executors.newSingleThreadScheduledExecutor(new y30((byte) 9));
                    j50.t = scheduledExecutorService;
                }
                j50.u++;
                scheduledExecutorService.schedule(new op6(audioTrack, q, a86Var, (byte) 14), 20L, TimeUnit.MILLISECONDS);
            }
            this.t = null;
        }
        sz0 sz0Var = this.l;
        sz0Var.c = null;
        sz0Var.a = -9223372036854775807L;
        sz0Var.b = -9223372036854775807L;
        sz0 sz0Var2 = this.k;
        sz0Var2.c = null;
        sz0Var2.a = -9223372036854775807L;
        sz0Var2.b = -9223372036854775807L;
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
            return hac.Z(((r10) this.p.e).b, this.t.a.getBufferSizeInFrames());
        }
        long bufferSizeInFrames = this.t.a.getBufferSizeInFrames();
        int b = zhe.b(((r10) this.p.e).a);
        if (b != -2147483647) {
            z = true;
        } else {
            z = false;
        }
        jte.p(z);
        return hac.b0(bufferSizeInFrames, 1000000L, b, RoundingMode.DOWN);
    }

    public final long h() {
        ArrayDeque arrayDeque;
        long j;
        mma mmaVar;
        if (p() && !this.H) {
            long min = Math.min(this.t.a(), hac.Z(((r10) this.p.e).b, l()));
            while (true) {
                arrayDeque = this.h;
                if (arrayDeque.isEmpty() || min < ((bb3) arrayDeque.getFirst()).c) {
                    break;
                }
                this.w = (bb3) arrayDeque.remove();
            }
            bb3 bb3Var = this.w;
            long j2 = min - bb3Var.c;
            long D = hac.D(j2, bb3Var.a.a);
            boolean isEmpty = arrayDeque.isEmpty();
            mx6 mx6Var = this.b;
            if (isEmpty) {
                nma nmaVar = (nma) mx6Var.d;
                if (nmaVar.isActive()) {
                    if (nmaVar.m >= 1024) {
                        long j3 = nmaVar.l;
                        nmaVar.i.getClass();
                        long o = j3 - (mmaVar.i.o() * (mmaVar.j * mmaVar.b));
                        int i = nmaVar.g.a;
                        int i2 = nmaVar.f.a;
                        long j4 = nmaVar.m;
                        if (i == i2) {
                            j2 = hac.b0(j2, o, j4, RoundingMode.DOWN);
                        } else {
                            j2 = hac.b0(j2, o * i, j4 * i2, RoundingMode.DOWN);
                        }
                    } else {
                        j2 = (long) (nmaVar.b * j2);
                    }
                }
                bb3 bb3Var2 = this.w;
                j = bb3Var2.b + j2;
                bb3Var2.d = j2 - D;
            } else {
                bb3 bb3Var3 = this.w;
                j = bb3Var3.b + D + bb3Var3.d;
            }
            long j5 = ((nja) mx6Var.c).l;
            long Z = hac.Z(((r10) this.p.e).b, j5) + j;
            long j6 = this.c0;
            if (j5 > j6) {
                long Z2 = hac.Z(((r10) this.p.e).b, j5 - j6);
                this.c0 = j5;
                this.d0 += Z2;
                Handler handler = this.e0;
                if (handler == null) {
                    handler = new Handler(Looper.myLooper());
                    this.e0 = handler;
                }
                handler.removeCallbacksAndMessages(null);
                this.e0.postDelayed(new xf2(this, (byte) 24), 100L);
            }
            return Z;
        }
        return Long.MIN_VALUE;
    }

    public final n10 i(go4 go4Var) {
        ?? obj = new Object();
        obj.a = go4Var;
        obj.b = o00.i;
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
        obj2.a = (go4) obj.a;
        obj2.b = (o00) obj.b;
        obj2.c = (AudioDeviceInfo) obj.c;
        obj2.d = obj.d;
        obj2.e = obj.e;
        obj2.f = obj.f;
        obj2.g = obj.g;
        return obj2;
    }

    public final int j(go4 go4Var) {
        boolean z;
        if (hac.N(go4Var.Q) && go4Var.Q != 2) {
            fo4 a = go4Var.a();
            a.P = 2;
            go4Var = new go4(a);
            z = true;
        } else {
            z = false;
        }
        byte b = ((l50) this.r).b(i(go4Var)).d;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cb3.m(long, int, java.nio.ByteBuffer):boolean");
    }

    public final boolean n() {
        if (p()) {
            if (Build.VERSION.SDK_INT < 29 || !this.t.c() || !this.Q) {
                long l = l();
                long a = this.t.a();
                j50 j50Var = this.t;
                j50Var.getClass();
                if (l > hac.b0(a, j50Var.a.getSampleRate(), 1000000L, RoundingMode.UP)) {
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
        j50 j50Var;
        boolean z;
        sz0 sz0Var = this.k;
        boolean z2 = false;
        if (((Exception) sz0Var.c) != null) {
            ((l50) ((cb3) sz0Var.d).r).getClass();
            synchronized (j50.s) {
                if (j50.u > 0) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z || SystemClock.elapsedRealtime() < sz0Var.b) {
                return false;
            }
        }
        try {
            j50Var = b((r10) this.p.e);
        } catch (t40 e) {
            r10 r10Var = (r10) this.p.e;
            int i = r10Var.f;
            boolean N = hac.N(r10Var.a);
            ki2 ki2Var = this.p;
            if (N) {
                b = ((r10) ki2Var.e).b * ki2Var.b;
            } else {
                int i2 = ((go4) ki2Var.c).k;
                if (i2 != -1) {
                    b = i2 / 8;
                } else {
                    b = zhe.b(((r10) ki2Var.e).a);
                    if (b == -2147483647) {
                        b = 1000000;
                    }
                }
            }
            r10 r10Var2 = (r10) this.p.e;
            int max = Math.max(b, AudioTrack.getMinBufferSize(r10Var2.b, r10Var2.c, r10Var2.a));
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
                q10 a = ((r10) this.p.e).a();
                a.f = i;
                r10 r10Var3 = new r10(a);
                try {
                    j50 b2 = b(r10Var3);
                    this.p = this.p.c(r10Var3);
                    j50Var = b2;
                } catch (t40 e2) {
                    e.addSuppressed(e2);
                }
            }
            if (((r10) this.p.e).e) {
                this.a0 = true;
            }
            throw e;
        }
        this.t = j50Var;
        ab3 ab3Var = new ab3(this, (r10) this.p.e);
        this.j = ab3Var;
        j50Var.i.a(ab3Var);
        if (this.t.c()) {
            ki2 ki2Var2 = this.p;
            if (((r10) ki2Var2.e).k) {
                j50 j50Var2 = this.t;
                go4 go4Var = (go4) ki2Var2.c;
                j50Var2.d(go4Var.R, go4Var.S);
            }
        }
        we8 we8Var = this.m;
        if (we8Var != null) {
            this.t.f(we8Var);
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
        u40 u40Var = this.n;
        if (u40Var != null) {
            Object obj = this.p.e;
            u40Var.L(new nf5((byte) 14));
            if (z2) {
                this.U = true;
                ki2 ki2Var3 = this.p;
                q10 a2 = ((r10) ki2Var3.e).a();
                a2.h = this.T;
                this.p = ki2Var3.c(new r10(a2));
                ki2 ki2Var4 = this.o;
                if (ki2Var4 != null) {
                    q10 a3 = ((r10) ki2Var4.e).a();
                    a3.h = this.T;
                    this.o = ki2Var4.c(new r10(a3));
                }
                this.n.b(this.T);
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
            j50 j50Var = this.t;
            m50 m50Var = j50Var.e;
            m50Var.e();
            if (m50Var.u == -9223372036854775807L) {
                m50Var.h.a(0);
            }
            m50Var.w = m50Var.a();
            if (!j50Var.j || j50Var.c()) {
                j50Var.a.pause();
            }
        }
    }

    public final void r() {
        this.R = true;
        if (p()) {
            j50 j50Var = this.t;
            m50 m50Var = j50Var.e;
            if (m50Var.u != -9223372036854775807L) {
                m50Var.b.getClass();
                m50Var.u = hac.T(SystemClock.elapsedRealtime());
            }
            m50Var.j = hac.Z(m50Var.e, m50Var.a());
            m50Var.h.a(0);
            if (!j50Var.j || j50Var.c()) {
                j50Var.a.play();
            }
        }
    }

    public final void s() {
        if (!this.P) {
            this.P = true;
            if (this.t.c()) {
                this.Q = false;
            }
            j50 j50Var = this.t;
            if (!j50Var.j) {
                j50Var.j = true;
                m50 m50Var = j50Var.e;
                long b = j50Var.b();
                m50Var.w = m50Var.a();
                m50Var.b.getClass();
                m50Var.u = hac.T(SystemClock.elapsedRealtime());
                m50Var.x = b;
                j50Var.a.stop();
                j50Var.o = 0;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cb3.u(long):void");
    }

    public final void v() {
        ki2 ki2Var = this.p;
        if (ki2Var != null) {
            ki2 ki2Var2 = this.o;
            if (ki2Var2 != null) {
                this.p = ki2Var2;
                this.o = null;
                ki2Var = ki2Var2;
            }
            try {
                this.p = this.p.c(((l50) this.r).c(i((go4) ki2Var.d)));
            } catch (m10 e) {
                dq9.o(new s40(e, (go4) this.p.c));
                return;
            }
        }
        f();
    }

    public final void w() {
        f();
        ko5 listIterator = this.g.listIterator(0);
        while (listIterator.hasNext()) {
            ((p30) listIterator.next()).reset();
        }
        this.e.reset();
        this.f.reset();
        k30 k30Var = this.q;
        if (k30Var != null) {
            y79 y79Var = k30Var.a;
            for (int i = 0; i < y79Var.d; i++) {
                p30 p30Var = (p30) y79Var.get(i);
                p30Var.c(n30.d);
                p30Var.reset();
            }
            k30Var.b.clear();
            k30Var.c = new ByteBuffer[0];
            l30 l30Var = l30.e;
            k30Var.d = false;
        }
        this.R = false;
        this.a0 = false;
    }

    public final void x() {
        if (p()) {
            j50 j50Var = this.t;
            ce8 ce8Var = this.x;
            AudioTrack audioTrack = j50Var.a;
            try {
                audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(hac.h(ce8Var.a, 0.1f, 8.0f)).setPitch(hac.h(ce8Var.b, 0.1f, 8.0f)).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                ncd.g("AudioTrackAudioOutput", "Failed to set playback params", e);
            }
            m50 m50Var = j50Var.e;
            m50Var.i = audioTrack.getPlaybackParams().getSpeed();
            m50Var.h.a(0);
            m50Var.e();
            PlaybackParams playbackParams = this.t.a.getPlaybackParams();
            this.x = new ce8(playbackParams.getSpeed(), playbackParams.getPitch());
        }
    }

    public final void y(s10 s10Var) {
        if (s10Var.equals(this.r)) {
            return;
        }
        ((l50) this.r).d();
        this.r = s10Var;
        za3 za3Var = this.s;
        if (za3Var != null) {
            l50 l50Var = (l50) s10Var;
            l50Var.f();
            a86 a86Var = l50Var.e;
            if (a86Var == null) {
                a86Var = new a86(Thread.currentThread());
                l50Var.e = a86Var;
            }
            a86Var.a(za3Var);
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
