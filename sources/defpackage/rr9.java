package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class rr9 implements mz0 {
    public final HandlerThread a;
    public final Handler b;
    public final i01 c;
    public final lr9 d;
    public final xz0 e;
    public s64 f;
    public qr9 g;
    public boolean h;
    public boolean l;
    public float i = 1.0f;
    public final ArrayDeque j = new ArrayDeque();
    public long k = -1;
    public int m = -1;
    public final hq9 n = new hq9(this, (byte) 2);
    public boolean o = true;
    public long p = -1;
    public long q = -1;

    public rr9(int i, TLRPC.InputGroupCall inputGroupCall, int i2, lr9 lr9Var) {
        this.d = lr9Var;
        HandlerThread handlerThread = new HandlerThread("RtmpStreamPlayer");
        this.a = handlerThread;
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper());
        this.c = new i01(i, inputGroupCall, i2, true, new pe2(this, (byte) 6), new ye9(this, (byte) 14));
        this.e = new xz0(this, false);
    }

    @Override
    public final void a(float f) {
        s64 s64Var = this.f;
        if (s64Var != null) {
            s64Var.c(new of8(f));
        }
    }

    @Override
    public final void b(tz0 tz0Var) {
        int i;
        boolean z;
        boolean z2;
        bt6 bt6Var;
        uif uifVar;
        ys6 ys6Var;
        ArrayDeque arrayDeque = this.j;
        if (this.f != null) {
            byte[] bArr = tz0Var.c;
            int i2 = tz0Var.b;
            long j = tz0Var.a;
            rc0 a = rc0.a(tz0Var.d, bArr);
            if (a != null && (i = a.c) > 0) {
                byte[] bArr2 = tz0Var.c;
                int i3 = a.b;
                e51 e51Var = new e51(Arrays.copyOfRange(bArr2, i3, i + i3));
                jz7 jz7Var = new jz7(new iy8((byte) 19), (byte) 21);
                Object obj = new Object();
                z6f z6fVar = new z6f((byte) 17);
                Uri parse = Uri.parse("tgstream://part/" + j);
                ft6 ft6Var = ft6.g;
                us6 us6Var = new us6();
                xs6 xs6Var = new xs6();
                List list = Collections.EMPTY_LIST;
                no5 no5Var = po5.b;
                j99 j99Var = j99.e;
                zs6 zs6Var = new zs6();
                ct6 ct6Var = ct6.d;
                if (xs6Var.b != null && xs6Var.a == null) {
                    z = false;
                } else {
                    z = true;
                }
                yve.p(z);
                pr3 pr3Var = null;
                if (parse != null) {
                    if (xs6Var.a != null) {
                        ys6Var = new ys6(xs6Var);
                    } else {
                        ys6Var = null;
                    }
                    z2 = false;
                    bt6Var = new bt6(parse, null, ys6Var, null, list, null, j99Var, -9223372036854775807L);
                } else {
                    z2 = false;
                    bt6Var = null;
                }
                ft6 ft6Var2 = new ft6("", new vs6(us6Var), bt6Var, new at6(zs6Var), nt6.M, ct6Var);
                ft6Var2.b.getClass();
                boolean z3 = z2;
                ft6Var2.b.getClass();
                ys6 ys6Var2 = ft6Var2.b.c;
                if (ys6Var2 == null) {
                    uifVar = pr3.u;
                } else {
                    synchronized (obj) {
                        if (!ys6Var2.equals(null)) {
                            pr3Var = rx6.x(ys6Var2);
                        }
                        pr3Var.getClass();
                        uifVar = pr3Var;
                    }
                }
                ew8 ew8Var = new ew8(ft6Var2, e51Var, jz7Var, uifVar, z6fVar, 1048576, null);
                if (i2 != this.m) {
                    StringBuilder sb = new StringBuilder("quality ");
                    bs2.w(sb, this.m, " -> ", i2, " at ");
                    sb.append(j);
                    c(sb.toString());
                    this.m = i2;
                }
                boolean isEmpty = arrayDeque.isEmpty();
                s64 s64Var = this.f;
                s64Var.y1();
                List singletonList = Collections.singletonList(ew8Var);
                s64Var.y1();
                s64Var.Q0(s64Var.p.size(), singletonList);
                arrayDeque.addLast(Long.valueOf(j));
                long j2 = 0;
                if (isEmpty) {
                    long j3 = this.k;
                    if (j3 >= 0) {
                        j2 = Math.max(0L, j3 - j);
                    }
                    this.k = -1L;
                    this.f.j1(z3 ? 1 : 0, j2, z3);
                    this.f.a();
                    return;
                } else if (this.l) {
                    this.l = z3;
                    this.f.j1(arrayDeque.size() - 1, 0L, z3);
                    return;
                } else {
                    return;
                }
            }
            c("bad part " + j);
        }
    }

    @Override
    public final void c(String str) {
        if (f11.a) {
            cc4.b("[RtmpStream] ".concat(str));
        }
    }

    @Override
    public final void d(long j) {
        if (this.f == null) {
            return;
        }
        this.j.clear();
        this.f.t();
        this.k = j;
    }

    @Override
    public final void e(dz0 dz0Var) {
        this.c.b(dz0Var);
    }

    @Override
    public final void f() {
        lr9 lr9Var = this.d;
        if (lr9Var != null) {
            lr9Var.onRejoinRequested();
        }
    }

    @Override
    public final long h() {
        return SystemClock.elapsedRealtime();
    }

    @Override
    public final wg i(qz0 qz0Var, pz0 pz0Var) {
        return this.c.a(qz0Var, pz0Var);
    }

    @Override
    public final lz0 j(Runnable runnable, long j) {
        kr9 kr9Var = new kr9(this, runnable, (byte) 0);
        this.b.postDelayed(kr9Var, Math.max(0L, j));
        return new m88(this, kr9Var, (byte) 27);
    }

    public final void k(boolean z) {
        this.b.post(new q38((byte) 9, this, z));
    }

    public final void l(qr9 qr9Var, Runnable runnable) {
        if (!this.b.post(new jr9(this, qr9Var, runnable, (byte) 0)) && runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void g(long j, int i, long j2) {
    }
}
