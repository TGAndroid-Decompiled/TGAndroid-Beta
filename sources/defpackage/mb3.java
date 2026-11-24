package defpackage;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
public final class mb3 implements cs3 {
    public final List a;
    public final t64 b;
    public final hi2 c;
    public final ni6 d;
    public final boolean e;
    public final boolean f;
    public final HashMap g;
    public final ux2 h;
    public final k4f i;
    public final we8 j;
    public final yh4 k;
    public final UUID l;
    public final Looper m;
    public final c1 n;
    public final Object o;
    public byte p;
    public int q;
    public HandlerThread r;
    public kb3 s;
    public lr4 t;
    public bs3 u;
    public byte[] v;
    public byte[] w;
    public r64 x;
    public ai4 y;
    public s64 z;

    public mb3(UUID uuid, t64 t64Var, hi2 hi2Var, ni6 ni6Var, List list, boolean z, boolean z2, byte[] bArr, HashMap hashMap, yh4 yh4Var, Looper looper, k4f k4fVar, we8 we8Var) {
        this.l = uuid;
        this.c = hi2Var;
        this.d = ni6Var;
        this.b = t64Var;
        this.e = z;
        this.f = z2;
        if (bArr != null) {
            this.w = bArr;
            this.a = null;
        } else {
            list.getClass();
            this.a = DesugarCollections.unmodifiableList(list);
        }
        this.g = hashMap;
        this.k = yh4Var;
        this.h = new ux2();
        this.i = k4fVar;
        this.j = we8Var;
        this.p = (byte) 2;
        this.m = looper;
        this.n = new c1(this, looper, (byte) 2);
        this.o = new Object();
    }

    @Override
    public final UUID a() {
        p();
        return this.l;
    }

    @Override
    public final boolean b() {
        p();
        return this.e;
    }

    @Override
    public final void c(fs3 fs3Var) {
        p();
        int i = this.q;
        if (i <= 0) {
            ncd.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.q = i2;
        if (i2 == 0) {
            this.p = (byte) 0;
            c1 c1Var = this.n;
            String str = hac.a;
            c1Var.removeCallbacksAndMessages(null);
            this.s.b();
            this.s = null;
            this.r.quit();
            this.r = null;
            this.t = null;
            this.u = null;
            this.x = null;
            synchronized (this.o) {
                this.y = null;
            }
            this.z = null;
            byte[] bArr = this.v;
            if (bArr != null) {
                this.b.k(bArr);
                this.v = null;
            }
        }
        if (fs3Var != null) {
            this.h.i(fs3Var);
            if (this.h.h(fs3Var) == 0) {
                fs3Var.e();
            }
        }
        ni6 ni6Var = this.d;
        int i3 = this.q;
        pb3 pb3Var = (pb3) ni6Var.b;
        if (i3 == 1 && pb3Var.F > 0 && pb3Var.w != -9223372036854775807L) {
            pb3Var.E.add(this);
            Handler handler = pb3Var.K;
            handler.getClass();
            handler.postAtTime(new xf2(this, (byte) 26), this, SystemClock.uptimeMillis() + pb3Var.w);
        } else if (i3 == 0) {
            pb3Var.x.remove(this);
            if (pb3Var.H == this) {
                pb3Var.H = null;
            }
            if (pb3Var.I == this) {
                pb3Var.I = null;
            }
            hi2 hi2Var = pb3Var.n;
            HashSet hashSet = (HashSet) hi2Var.b;
            hashSet.remove(this);
            if (((mb3) hi2Var.c) == this) {
                hi2Var.c = null;
                if (!hashSet.isEmpty()) {
                    mb3 mb3Var = (mb3) hashSet.iterator().next();
                    hi2Var.c = mb3Var;
                    s64 c = mb3Var.b.c();
                    mb3Var.z = c;
                    kb3 kb3Var = mb3Var.s;
                    String str2 = hac.a;
                    c.getClass();
                    kb3Var.getClass();
                    kb3Var.obtainMessage(1, new lb3(ea6.h.getAndIncrement(), true, SystemClock.elapsedRealtime(), c)).sendToTarget();
                }
            }
            if (pb3Var.w != -9223372036854775807L) {
                Handler handler2 = pb3Var.K;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                pb3Var.E.remove(this);
            }
        }
        pb3Var.i();
    }

    @Override
    public final void d(fs3 fs3Var) {
        int i;
        p();
        boolean z = false;
        if (this.q < 0) {
            ncd.c("DefaultDrmSession", "Session reference count less than zero: " + this.q);
            this.q = 0;
        }
        if (fs3Var != null) {
            ux2 ux2Var = this.h;
            synchronized (ux2Var.a) {
                ArrayList arrayList = new ArrayList(ux2Var.d);
                arrayList.add(fs3Var);
                ux2Var.d = DesugarCollections.unmodifiableList(arrayList);
                Integer num = (Integer) ux2Var.b.get(fs3Var);
                if (num == null) {
                    HashSet hashSet = new HashSet(ux2Var.c);
                    hashSet.add(fs3Var);
                    ux2Var.c = DesugarCollections.unmodifiableSet(hashSet);
                }
                HashMap hashMap = ux2Var.b;
                if (num != null) {
                    i = num.intValue() + 1;
                } else {
                    i = 1;
                }
                hashMap.put(fs3Var, Integer.valueOf(i));
            }
        }
        int i2 = this.q + 1;
        this.q = i2;
        if (i2 == 1) {
            if (this.p == 2) {
                z = true;
            }
            jte.p(z);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.r = handlerThread;
            handlerThread.start();
            this.s = new kb3(this, this.r.getLooper());
            if (n()) {
                j(true);
            }
        } else if (fs3Var != null && k() && this.h.h(fs3Var) == 1) {
            fs3Var.c(this.p);
        }
        pb3 pb3Var = (pb3) this.d.b;
        if (pb3Var.w != -9223372036854775807L) {
            pb3Var.E.remove(this);
            Handler handler = pb3Var.K;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override
    public final int e() {
        p();
        return this.p;
    }

    @Override
    public final boolean f(String str) {
        p();
        byte[] bArr = this.v;
        bArr.getClass();
        return this.b.u(str, bArr);
    }

    @Override
    public final bs3 g() {
        p();
        if (this.p == 1) {
            return this.u;
        }
        return null;
    }

    @Override
    public final lr4 h() {
        p();
        return this.t;
    }

    public final void i(fu2 fu2Var) {
        Set<fs3> set;
        ux2 ux2Var = this.h;
        synchronized (ux2Var.a) {
            set = ux2Var.c;
        }
        for (fs3 fs3Var : set) {
            fu2Var.accept(fs3Var);
        }
    }

    public final void j(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mb3.j(boolean):void");
    }

    public final boolean k() {
        byte b = this.p;
        if (b != 3 && b != 4) {
            return false;
        }
        return true;
    }

    public final void l(int i, Throwable th) {
        int i2;
        Set<fs3> set;
        if (th instanceof MediaDrm.MediaDrmStateException) {
            i2 = hac.A(hac.B(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        } else {
            if (!(th instanceof MediaDrmResetException)) {
                if (!(th instanceof NotProvisionedException) && !sge.b(th)) {
                    if (th instanceof DeniedByServerException) {
                        i2 = 6007;
                    } else if (th instanceof h8c) {
                        i2 = 6001;
                    } else if (th instanceof nb3) {
                        i2 = 6003;
                    } else if (th instanceof px5) {
                        i2 = 6008;
                    } else if (i != 1) {
                        if (i == 2) {
                            i2 = 6004;
                        } else if (i != 3) {
                            i98.g();
                            return;
                        }
                    }
                }
                i2 = 6002;
            }
            i2 = 6006;
        }
        this.u = new bs3(i2, th);
        ncd.d("DefaultDrmSession", "DRM session error", th);
        if (th instanceof Exception) {
            ux2 ux2Var = this.h;
            synchronized (ux2Var.a) {
                set = ux2Var.c;
            }
            for (fs3 fs3Var : set) {
                fs3Var.d((Exception) th);
            }
        } else if (th instanceof Error) {
            if (!sge.c(th) && !sge.b(th)) {
                throw ((Error) th);
            }
        } else {
            wa3.h("Unexpected Throwable subclass", th);
            return;
        }
        if (this.p != 4) {
            this.p = (byte) 1;
        }
    }

    public final void m(Throwable th, boolean z) {
        int i;
        if (!(th instanceof NotProvisionedException) && !sge.b(th)) {
            if (z) {
                i = 1;
            } else {
                i = 2;
            }
            l(i, th);
            return;
        }
        this.c.O(this);
    }

    public final boolean n() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mb3.n():boolean");
    }

    public final void o(int i, boolean z, byte[] bArr) {
        try {
            synchronized (this.o) {
                this.y = new ai4((byte) 9);
                List list = this.a;
                if (list != null) {
                    mo5.q(list);
                }
            }
            r64 q = this.b.q(bArr, this.a, i, this.g);
            this.x = q;
            kb3 kb3Var = this.s;
            String str = hac.a;
            q.getClass();
            kb3Var.getClass();
            kb3Var.obtainMessage(2, new lb3(ea6.h.getAndIncrement(), z, SystemClock.elapsedRealtime(), q)).sendToTarget();
        } catch (Exception | NoSuchMethodError e) {
            m(e, true);
        }
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.m;
        if (currentThread != looper.getThread()) {
            ncd.g("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
