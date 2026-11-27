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
public final class ja3 implements y30 {
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
    public va0 V;
    public AudioDeviceInfo W;
    public int X;
    public boolean Y;
    public long Z;
    public final Context a;
    public boolean a0;
    public final rx6 b;
    public boolean b0;
    public final ki1 c;
    public long c0;
    public final e6c d;
    public long d0;
    public final btb e;
    public Handler e0;
    public final btb f;
    public final j99 g;
    public final ArrayDeque h;
    public byte i;
    public ha3 j;
    public final ty0 k;
    public final ty0 l;
    public ig8 m;
    public v30 n;
    public oh2 o;
    public oh2 p;
    public l20 q;
    public t00 r;
    public ga3 s;
    public l40 t;
    public oz u;
    public ia3 v;
    public ia3 w;
    public of8 x;
    public boolean y;
    public long z;

    public ja3(d30 d30Var) {
        Context applicationContext;
        int deviceId;
        Context context = (Context) d30Var.b;
        if (context == null) {
            applicationContext = null;
        } else {
            applicationContext = context.getApplicationContext();
        }
        this.a = applicationContext;
        this.u = oz.i;
        this.b = (rx6) d30Var.d;
        this.i = (byte) 0;
        this.r = (n40) d30Var.f;
        ?? ef0Var = new ef0();
        this.c = ef0Var;
        ?? ef0Var2 = new ef0();
        ef0Var2.m = gcc.b;
        this.d = ef0Var2;
        this.e = new btb((byte) 1);
        this.f = new btb((byte) 0);
        this.g = po5.v(ef0Var2, ef0Var);
        this.K = 1.0f;
        this.T = 0;
        this.V = new Object();
        of8 of8Var = of8.d;
        this.w = new ia3(of8Var, 0L, 0L);
        this.x = of8Var;
        this.y = false;
        this.h = new ArrayDeque();
        this.k = new ty0(this);
        this.l = new ty0(this);
        int i = -1;
        if (Build.VERSION.SDK_INT >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i = deviceId;
        }
        this.X = i;
    }

    public static int k(int r10, java.nio.ByteBuffer r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ja3.k(int, java.nio.ByteBuffer):int");
    }

    public final void A(va0 va0Var) {
        if (this.V.equals(va0Var)) {
            return;
        }
        va0Var.getClass();
        if (this.t != null) {
            this.V.getClass();
        }
        this.V = va0Var;
    }

    public final void B(java.nio.ByteBuffer r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ja3.B(java.nio.ByteBuffer):void");
    }

    public final void C(of8 of8Var) {
        if (E()) {
            this.x = of8Var;
            x();
            return;
        }
        of8 of8Var2 = new of8(gcc.h(of8Var.a, 0.1f, 8.0f), gcc.h(of8Var.b, 0.1f, 8.0f));
        this.x = of8Var2;
        ia3 ia3Var = new ia3(of8Var2, -9223372036854775807L, -9223372036854775807L);
        if (p()) {
            this.v = ia3Var;
        } else {
            this.w = ia3Var;
        }
    }

    public final void D(long j) {
        long j2;
        oh2 oh2Var = this.p;
        this.q = (l20) oh2Var.f;
        if (j == -9223372036854775807L) {
            j2 = 0;
        } else {
            j2 = j - this.J;
            if (((asb) oh2Var.g) != asb.a && oh2Var.h != null) {
                xrb xrbVar = new xrb();
                oh2 oh2Var2 = this.p;
                ((asb) oh2Var2.g).g(oh2Var2.h, xrbVar);
                j2 += xrbVar.e;
            }
        }
        l20 l20Var = this.q;
        n20 n20Var = new n20();
        oh2 oh2Var3 = this.p;
        n20Var.b = (asb) oh2Var3.g;
        n20Var.c = oh2Var3.h;
        n20Var.a = j2;
        o20 a = n20Var.a();
        j99 j99Var = l20Var.a;
        ArrayList arrayList = l20Var.b;
        arrayList.clear();
        l20Var.d = false;
        for (int i = 0; i < j99Var.d; i++) {
            q20 q20Var = (q20) j99Var.get(i);
            q20Var.c(a);
            if (q20Var.isActive()) {
                ?? obj = new Object();
                long j3 = a.a;
                obj.a = j3;
                obj.b = a.b;
                obj.c = a.c;
                obj.a = q20Var.g(j3);
                a = obj.a();
                arrayList.add(q20Var);
            }
        }
        l20Var.c = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= l20Var.a(); i2++) {
            l20Var.c[i2] = ((q20) arrayList.get(i2)).b();
        }
    }

    public final boolean E() {
        oh2 oh2Var = this.p;
        if (oh2Var != null && ((s00) oh2Var.e).j) {
            return true;
        }
        return false;
    }

    public final void a(long j) {
        of8 of8Var;
        boolean z;
        boolean z2;
        boolean E = E();
        boolean z3 = false;
        rx6 rx6Var = this.b;
        if (!E) {
            if (!this.Y && this.p.d()) {
                int i = ((ko4) this.p.c).Q;
                of8Var = this.x;
                goa goaVar = (goa) rx6Var.d;
                float f = of8Var.a;
                if (f > 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                yve.f(z);
                if (goaVar.b != f) {
                    goaVar.b = f;
                    goaVar.h = true;
                }
                float f2 = of8Var.b;
                if (f2 > 0.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                yve.f(z2);
                if (goaVar.c != f2) {
                    goaVar.c = f2;
                    goaVar.h = true;
                }
            } else {
                of8Var = of8.d;
            }
            this.x = of8Var;
        } else {
            of8Var = of8.d;
        }
        of8 of8Var2 = of8Var;
        if (!this.Y && this.p.d()) {
            int i2 = ((ko4) this.p.c).Q;
            z3 = this.y;
            ((ela) rx6Var.c).j = z3;
        }
        this.y = z3;
        this.h.add(new ia3(of8Var2, Math.max(0L, j), gcc.Z(((s00) this.p.e).b, l())));
        D(j);
        v30 v30Var = this.n;
        if (v30Var != null) {
            v30Var.h(this.y);
        }
    }

    public final l40 b(s00 s00Var) {
        try {
            return ((n40) this.r).a(s00Var);
        } catch (q00 e) {
            u30 u30Var = new u30(s00Var.b, s00Var.c, s00Var.a, s00Var.f, (ko4) this.p.c, s00Var.e, e);
            v30 v30Var = this.n;
            if (v30Var != null) {
                v30Var.h0(u30Var);
            }
            throw u30Var;
        }
    }

    public final void c(s30 s30Var) {
        int i;
        l20 l20Var;
        ko4 ko4Var;
        int i2;
        Object obj;
        if (this.s == null && this.a != null) {
            ga3 ga3Var = new ga3(this);
            this.s = ga3Var;
            n40 n40Var = (n40) this.r;
            n40Var.f();
            e86 e86Var = n40Var.e;
            if (e86Var == null) {
                e86Var = new e86(Thread.currentThread());
                n40Var.e = e86Var;
            }
            e86Var.a(ga3Var);
        }
        ko4 ko4Var2 = s30Var.a;
        String str = ko4Var2.t;
        int i3 = ko4Var2.N;
        int i4 = ko4Var2.Q;
        int i5 = -1;
        if ("audio/raw".equals(str)) {
            yve.f(gcc.N(i4));
            int u = gcc.u(i4) * i3;
            ?? ho5Var = new ho5(4);
            ho5Var.d(this.g);
            ho5Var.c(this.e);
            q20[] q20VarArr = (q20[]) this.b.b;
            int length = q20VarArr.length;
            rue.a(length, q20VarArr);
            ho5Var.e(length);
            System.arraycopy(q20VarArr, 0, ho5Var.a, ho5Var.b, length);
            ho5Var.b += length;
            l20 l20Var2 = new l20(ho5Var.f());
            if (l20Var2.equals(this.q)) {
                l20Var2 = this.q;
            }
            int i6 = ko4Var2.R;
            int i7 = ko4Var2.S;
            e6c e6cVar = this.d;
            e6cVar.i = i6;
            e6cVar.j = i7;
            this.c.i = s30Var.b;
            m20 m20Var = new m20(ko4Var2.P, i3, i4);
            try {
                j99 j99Var = l20Var2.a;
                if (!m20Var.equals(m20.e)) {
                    for (int i8 = 0; i8 < j99Var.d; i8++) {
                        q20 q20Var = (q20) j99Var.get(i8);
                        m20 e = q20Var.e(m20Var);
                        if (q20Var.isActive()) {
                            yve.p(!e.equals(m20.e));
                            m20Var = e;
                        }
                    }
                    int i9 = m20Var.b;
                    int i10 = m20Var.c;
                    jo4 a = ko4Var2.a();
                    a.P = i10;
                    a.O = m20Var.a;
                    a.M = i9;
                    if (i9 == i3) {
                        i5 = ko4Var2.O;
                    }
                    a.N = i5;
                    ko4 ko4Var3 = new ko4(a);
                    i = u;
                    l20Var = l20Var2;
                    i2 = gcc.u(i10) * i9;
                    ko4Var = ko4Var3;
                } else {
                    throw new p20(m20Var);
                }
            } catch (p20 e2) {
                throw new t30(e2, ko4Var2);
            }
        } else {
            no5 no5Var = po5.b;
            i = -1;
            l20Var = new l20(j99.e);
            ko4Var = ko4Var2;
            i2 = -1;
        }
        o00 i11 = i(ko4Var);
        ko4 ko4Var4 = (ko4) i11.a;
        try {
            s00 c = ((n40) this.r).c(i11);
            boolean z = c.e;
            if (c.a != 0) {
                if (c.c != 0) {
                    this.a0 = false;
                    asb asbVar = s30Var.c;
                    vz6 vz6Var = s30Var.d;
                    if (vz6Var != null) {
                        obj = vz6Var.a;
                    } else {
                        obj = null;
                    }
                    oh2 oh2Var = new oh2(ko4Var2, ko4Var, i, i2, c, l20Var, asbVar, obj);
                    if (p()) {
                        this.o = oh2Var;
                        return;
                    } else {
                        this.p = oh2Var;
                        return;
                    }
                }
                throw new t30("Invalid output channel config (isOffload=" + z + ")", ko4Var4);
            }
            throw new t30("Invalid output encoding (isOffload=" + z + ")", ko4Var4);
        } catch (n00 e3) {
            throw new t30(e3, ko4Var2);
        }
    }

    public final void d(long r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ja3.d(long):void");
    }

    public final boolean e() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ja3.e():boolean");
    }

    public final void f() {
        g40 g40Var;
        if (p()) {
            this.z = 0L;
            this.A = 0L;
            this.B = 0L;
            this.C = 0L;
            this.b0 = false;
            this.D = 0;
            this.E = 0;
            this.F = 0L;
            this.w = new ia3(this.x, 0L, 0L);
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
            oh2 oh2Var = this.o;
            if (oh2Var != null) {
                this.p = oh2Var;
                this.o = null;
            }
            l40 l40Var = this.t;
            if (l40Var.e.d.getPlayState() == 3) {
                l40Var.a.pause();
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 29 && l40Var.c()) {
                k40 k40Var = l40Var.h;
                k40Var.getClass();
                k40Var.a();
            }
            if (i >= 24 && (g40Var = l40Var.d) != null) {
                g40Var.b();
                l40Var.d = null;
            }
            AudioTrack audioTrack = l40Var.a;
            e86 e86Var = l40Var.i;
            Handler q = gcc.q(null);
            synchronized (l40.s) {
                ScheduledExecutorService scheduledExecutorService = l40.t;
                if (scheduledExecutorService == null) {
                    scheduledExecutorService = Executors.newSingleThreadScheduledExecutor(new y20((byte) 9));
                    l40.t = scheduledExecutorService;
                }
                l40.u++;
                scheduledExecutorService.schedule(new es6(audioTrack, q, e86Var, (byte) 14), 20L, TimeUnit.MILLISECONDS);
            }
            this.t = null;
        }
        ty0 ty0Var = this.l;
        ty0Var.c = null;
        ty0Var.a = -9223372036854775807L;
        ty0Var.b = -9223372036854775807L;
        ty0 ty0Var2 = this.k;
        ty0Var2.c = null;
        ty0Var2.a = -9223372036854775807L;
        ty0Var2.b = -9223372036854775807L;
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
            return gcc.Z(((s00) this.p.e).b, this.t.a.getBufferSizeInFrames());
        }
        long bufferSizeInFrames = this.t.a.getBufferSizeInFrames();
        int b = pke.b(((s00) this.p.e).a);
        if (b != -2147483647) {
            z = true;
        } else {
            z = false;
        }
        yve.p(z);
        return gcc.b0(bufferSizeInFrames, 1000000L, b, RoundingMode.DOWN);
    }

    public final long h() {
        ArrayDeque arrayDeque;
        long j;
        foa foaVar;
        if (p() && !this.H) {
            long min = Math.min(this.t.a(), gcc.Z(((s00) this.p.e).b, l()));
            while (true) {
                arrayDeque = this.h;
                if (arrayDeque.isEmpty() || min < ((ia3) arrayDeque.getFirst()).c) {
                    break;
                }
                this.w = (ia3) arrayDeque.remove();
            }
            ia3 ia3Var = this.w;
            long j2 = min - ia3Var.c;
            long D = gcc.D(j2, ia3Var.a.a);
            boolean isEmpty = arrayDeque.isEmpty();
            rx6 rx6Var = this.b;
            if (isEmpty) {
                goa goaVar = (goa) rx6Var.d;
                if (goaVar.isActive()) {
                    if (goaVar.m >= 1024) {
                        long j3 = goaVar.l;
                        goaVar.i.getClass();
                        long o = j3 - (foaVar.i.o() * (foaVar.j * foaVar.b));
                        int i = goaVar.g.a;
                        int i2 = goaVar.f.a;
                        long j4 = goaVar.m;
                        if (i == i2) {
                            j2 = gcc.b0(j2, o, j4, RoundingMode.DOWN);
                        } else {
                            j2 = gcc.b0(j2, o * i, j4 * i2, RoundingMode.DOWN);
                        }
                    } else {
                        j2 = (long) (goaVar.b * j2);
                    }
                }
                ia3 ia3Var2 = this.w;
                j = ia3Var2.b + j2;
                ia3Var2.d = j2 - D;
            } else {
                ia3 ia3Var3 = this.w;
                j = ia3Var3.b + D + ia3Var3.d;
            }
            long j5 = ((ela) rx6Var.c).l;
            long Z = gcc.Z(((s00) this.p.e).b, j5) + j;
            long j6 = this.c0;
            if (j5 > j6) {
                long Z2 = gcc.Z(((s00) this.p.e).b, j5 - j6);
                this.c0 = j5;
                this.d0 += Z2;
                Handler handler = this.e0;
                if (handler == null) {
                    handler = new Handler(Looper.myLooper());
                    this.e0 = handler;
                }
                handler.removeCallbacksAndMessages(null);
                this.e0.postDelayed(new vd2(this, (byte) 25), 100L);
            }
            return Z;
        }
        return Long.MIN_VALUE;
    }

    public final o00 i(ko4 ko4Var) {
        ?? obj = new Object();
        obj.a = ko4Var;
        obj.b = oz.i;
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
        obj2.a = (ko4) obj.a;
        obj2.b = (oz) obj.b;
        obj2.c = (AudioDeviceInfo) obj.c;
        obj2.d = obj.d;
        obj2.e = obj.e;
        obj2.f = obj.f;
        obj2.g = obj.g;
        return obj2;
    }

    public final int j(ko4 ko4Var) {
        boolean z;
        if (gcc.N(ko4Var.Q) && ko4Var.Q != 2) {
            jo4 a = ko4Var.a();
            a.P = 2;
            ko4Var = new ko4(a);
            z = true;
        } else {
            z = false;
        }
        byte b = ((n40) this.r).b(i(ko4Var)).d;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ja3.m(long, int, java.nio.ByteBuffer):boolean");
    }

    public final boolean n() {
        if (p()) {
            if (Build.VERSION.SDK_INT < 29 || !this.t.c() || !this.Q) {
                long l = l();
                long a = this.t.a();
                l40 l40Var = this.t;
                l40Var.getClass();
                if (l > gcc.b0(a, l40Var.a.getSampleRate(), 1000000L, RoundingMode.UP)) {
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
        l40 l40Var;
        boolean z;
        ty0 ty0Var = this.k;
        boolean z2 = false;
        if (((Exception) ty0Var.c) != null) {
            ((n40) ((ja3) ty0Var.d).r).getClass();
            synchronized (l40.s) {
                if (l40.u > 0) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z || SystemClock.elapsedRealtime() < ty0Var.b) {
                return false;
            }
        }
        try {
            l40Var = b((s00) this.p.e);
        } catch (u30 e) {
            s00 s00Var = (s00) this.p.e;
            int i = s00Var.f;
            boolean N = gcc.N(s00Var.a);
            oh2 oh2Var = this.p;
            if (N) {
                b = ((s00) oh2Var.e).b * oh2Var.b;
            } else {
                int i2 = ((ko4) oh2Var.c).k;
                if (i2 != -1) {
                    b = i2 / 8;
                } else {
                    b = pke.b(((s00) oh2Var.e).a);
                    if (b == -2147483647) {
                        b = 1000000;
                    }
                }
            }
            s00 s00Var2 = (s00) this.p.e;
            int max = Math.max(b, AudioTrack.getMinBufferSize(s00Var2.b, s00Var2.c, s00Var2.a));
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
                r00 a = ((s00) this.p.e).a();
                a.f = i;
                s00 s00Var3 = new s00(a);
                try {
                    l40 b2 = b(s00Var3);
                    this.p = this.p.c(s00Var3);
                    l40Var = b2;
                } catch (u30 e2) {
                    e.addSuppressed(e2);
                }
            }
            if (((s00) this.p.e).e) {
                this.a0 = true;
            }
            throw e;
        }
        this.t = l40Var;
        ha3 ha3Var = new ha3(this, (s00) this.p.e);
        this.j = ha3Var;
        l40Var.i.a(ha3Var);
        if (this.t.c()) {
            oh2 oh2Var2 = this.p;
            if (((s00) oh2Var2.e).k) {
                l40 l40Var2 = this.t;
                ko4 ko4Var = (ko4) oh2Var2.c;
                l40Var2.d(ko4Var.R, ko4Var.S);
            }
        }
        ig8 ig8Var = this.m;
        if (ig8Var != null) {
            this.t.f(ig8Var);
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
        v30 v30Var = this.n;
        if (v30Var != null) {
            Object obj = this.p.e;
            v30Var.M(new qf5((byte) 14));
            if (z2) {
                this.U = true;
                oh2 oh2Var3 = this.p;
                r00 a2 = ((s00) oh2Var3.e).a();
                a2.h = this.T;
                this.p = oh2Var3.c(new s00(a2));
                oh2 oh2Var4 = this.o;
                if (oh2Var4 != null) {
                    r00 a3 = ((s00) oh2Var4.e).a();
                    a3.h = this.T;
                    this.o = oh2Var4.c(new s00(a3));
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
            l40 l40Var = this.t;
            o40 o40Var = l40Var.e;
            o40Var.e();
            if (o40Var.u == -9223372036854775807L) {
                o40Var.h.a(0);
            }
            o40Var.w = o40Var.a();
            if (!l40Var.j || l40Var.c()) {
                l40Var.a.pause();
            }
        }
    }

    public final void r() {
        this.R = true;
        if (p()) {
            l40 l40Var = this.t;
            o40 o40Var = l40Var.e;
            if (o40Var.u != -9223372036854775807L) {
                o40Var.b.getClass();
                o40Var.u = gcc.T(SystemClock.elapsedRealtime());
            }
            o40Var.j = gcc.Z(o40Var.e, o40Var.a());
            o40Var.h.a(0);
            if (!l40Var.j || l40Var.c()) {
                l40Var.a.play();
            }
        }
    }

    public final void s() {
        if (!this.P) {
            this.P = true;
            if (this.t.c()) {
                this.Q = false;
            }
            l40 l40Var = this.t;
            if (!l40Var.j) {
                l40Var.j = true;
                o40 o40Var = l40Var.e;
                long b = l40Var.b();
                o40Var.w = o40Var.a();
                o40Var.b.getClass();
                o40Var.u = gcc.T(SystemClock.elapsedRealtime());
                o40Var.x = b;
                l40Var.a.stop();
                l40Var.o = 0;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ja3.u(long):void");
    }

    public final void v() {
        oh2 oh2Var = this.p;
        if (oh2Var != null) {
            oh2 oh2Var2 = this.o;
            if (oh2Var2 != null) {
                this.p = oh2Var2;
                this.o = null;
                oh2Var = oh2Var2;
            }
            try {
                this.p = this.p.c(((n40) this.r).c(i((ko4) oh2Var.d)));
            } catch (n00 e) {
                vr9.l(new t30(e, (ko4) this.p.c));
                return;
            }
        }
        f();
    }

    public final void w() {
        f();
        no5 listIterator = this.g.listIterator(0);
        while (listIterator.hasNext()) {
            ((q20) listIterator.next()).reset();
        }
        this.e.reset();
        this.f.reset();
        l20 l20Var = this.q;
        if (l20Var != null) {
            j99 j99Var = l20Var.a;
            for (int i = 0; i < j99Var.d; i++) {
                q20 q20Var = (q20) j99Var.get(i);
                q20Var.c(o20.d);
                q20Var.reset();
            }
            l20Var.b.clear();
            l20Var.c = new ByteBuffer[0];
            m20 m20Var = m20.e;
            l20Var.d = false;
        }
        this.R = false;
        this.a0 = false;
    }

    public final void x() {
        if (p()) {
            l40 l40Var = this.t;
            of8 of8Var = this.x;
            AudioTrack audioTrack = l40Var.a;
            try {
                audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(gcc.h(of8Var.a, 0.1f, 8.0f)).setPitch(gcc.h(of8Var.b, 0.1f, 8.0f)).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                efd.g("AudioTrackAudioOutput", "Failed to set playback params", e);
            }
            o40 o40Var = l40Var.e;
            o40Var.i = audioTrack.getPlaybackParams().getSpeed();
            o40Var.h.a(0);
            o40Var.e();
            PlaybackParams playbackParams = this.t.a.getPlaybackParams();
            this.x = new of8(playbackParams.getSpeed(), playbackParams.getPitch());
        }
    }

    public final void y(t00 t00Var) {
        if (t00Var.equals(this.r)) {
            return;
        }
        ((n40) this.r).d();
        this.r = t00Var;
        ga3 ga3Var = this.s;
        if (ga3Var != null) {
            n40 n40Var = (n40) t00Var;
            n40Var.f();
            e86 e86Var = n40Var.e;
            if (e86Var == null) {
                e86Var = new e86(Thread.currentThread());
                n40Var.e = e86Var;
            }
            e86Var.a(ga3Var);
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
