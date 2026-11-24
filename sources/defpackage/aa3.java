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
public final class aa3 implements sq3 {
    public final List a;
    public final i54 b;
    public final lv6 c;
    public final qx4 d;
    public final boolean e;
    public final boolean f;
    public final HashMap g;
    public final kw2 h;
    public final i2f i;
    public final uc8 j;
    public final xf4 k;
    public final UUID l;
    public final Looper m;
    public final c1 n;
    public final Object o;
    public byte p;
    public int q;
    public HandlerThread r;
    public y93 s;
    public kp4 t;
    public rq3 u;
    public byte[] v;
    public byte[] w;
    public g54 x;
    public z24 y;
    public h54 z;

    public aa3(UUID uuid, i54 i54Var, lv6 lv6Var, qx4 qx4Var, List list, boolean z, boolean z2, byte[] bArr, HashMap hashMap, xf4 xf4Var, Looper looper, i2f i2fVar, uc8 uc8Var) {
        this.l = uuid;
        this.c = lv6Var;
        this.d = qx4Var;
        this.b = i54Var;
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
        this.k = xf4Var;
        this.h = new kw2();
        this.i = i2fVar;
        this.j = uc8Var;
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
    public final void c(vq3 vq3Var) {
        p();
        int i = this.q;
        if (i <= 0) {
            lad.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.q = i2;
        if (i2 == 0) {
            this.p = (byte) 0;
            c1 c1Var = this.n;
            String str = g8c.a;
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
                this.b.l(bArr);
                this.v = null;
            }
        }
        if (vq3Var != null) {
            this.h.i(vq3Var);
            if (this.h.h(vq3Var) == 0) {
                vq3Var.e();
            }
        }
        qx4 qx4Var = this.d;
        int i3 = this.q;
        da3 da3Var = (da3) qx4Var.a;
        if (i3 == 1 && da3Var.F > 0 && da3Var.w != -9223372036854775807L) {
            da3Var.E.add(this);
            Handler handler = da3Var.K;
            handler.getClass();
            handler.postAtTime(new mk2(this, (byte) 21), this, SystemClock.uptimeMillis() + da3Var.w);
        } else if (i3 == 0) {
            da3Var.x.remove(this);
            if (da3Var.H == this) {
                da3Var.H = null;
            }
            if (da3Var.I == this) {
                da3Var.I = null;
            }
            lv6 lv6Var = da3Var.n;
            HashSet hashSet = (HashSet) lv6Var.b;
            hashSet.remove(this);
            if (((aa3) lv6Var.c) == this) {
                lv6Var.c = null;
                if (!hashSet.isEmpty()) {
                    aa3 aa3Var = (aa3) hashSet.iterator().next();
                    lv6Var.c = aa3Var;
                    h54 c = aa3Var.b.c();
                    aa3Var.z = c;
                    y93 y93Var = aa3Var.s;
                    String str2 = g8c.a;
                    c.getClass();
                    y93Var.getClass();
                    y93Var.obtainMessage(1, new z93(f86.h.getAndIncrement(), true, SystemClock.elapsedRealtime(), c)).sendToTarget();
                }
            }
            if (da3Var.w != -9223372036854775807L) {
                Handler handler2 = da3Var.K;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                da3Var.E.remove(this);
            }
        }
        da3Var.i();
    }

    @Override
    public final void d(vq3 vq3Var) {
        int i;
        p();
        boolean z = false;
        if (this.q < 0) {
            lad.c("DefaultDrmSession", "Session reference count less than zero: " + this.q);
            this.q = 0;
        }
        if (vq3Var != null) {
            kw2 kw2Var = this.h;
            synchronized (kw2Var.a) {
                ArrayList arrayList = new ArrayList(kw2Var.d);
                arrayList.add(vq3Var);
                kw2Var.d = DesugarCollections.unmodifiableList(arrayList);
                Integer num = (Integer) kw2Var.b.get(vq3Var);
                if (num == null) {
                    HashSet hashSet = new HashSet(kw2Var.c);
                    hashSet.add(vq3Var);
                    kw2Var.c = DesugarCollections.unmodifiableSet(hashSet);
                }
                HashMap hashMap = kw2Var.b;
                if (num != null) {
                    i = num.intValue() + 1;
                } else {
                    i = 1;
                }
                hashMap.put(vq3Var, Integer.valueOf(i));
            }
        }
        int i2 = this.q + 1;
        this.q = i2;
        if (i2 == 1) {
            if (this.p == 2) {
                z = true;
            }
            gre.p(z);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.r = handlerThread;
            handlerThread.start();
            this.s = new y93(this, this.r.getLooper());
            if (n()) {
                j(true);
            }
        } else if (vq3Var != null && k() && this.h.h(vq3Var) == 1) {
            vq3Var.c(this.p);
        }
        da3 da3Var = (da3) this.d.a;
        if (da3Var.w != -9223372036854775807L) {
            da3Var.E.remove(this);
            Handler handler = da3Var.K;
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
        return this.b.x(str, bArr);
    }

    @Override
    public final rq3 g() {
        p();
        if (this.p == 1) {
            return this.u;
        }
        return null;
    }

    @Override
    public final kp4 h() {
        p();
        return this.t;
    }

    public final void i(us2 us2Var) {
        Set<vq3> set;
        kw2 kw2Var = this.h;
        synchronized (kw2Var.a) {
            set = kw2Var.c;
        }
        for (vq3 vq3Var : set) {
            us2Var.accept(vq3Var);
        }
    }

    public final void j(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aa3.j(boolean):void");
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
        Set<vq3> set;
        if (th instanceof MediaDrm.MediaDrmStateException) {
            i2 = g8c.A(g8c.B(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        } else {
            if (!(th instanceof MediaDrmResetException)) {
                if (!(th instanceof NotProvisionedException) && !ree.b(th)) {
                    if (th instanceof DeniedByServerException) {
                        i2 = 6007;
                    } else if (th instanceof g6c) {
                        i2 = 6001;
                    } else if (th instanceof ba3) {
                        i2 = 6003;
                    } else if (th instanceof pv5) {
                        i2 = 6008;
                    } else if (i != 1) {
                        if (i == 2) {
                            i2 = 6004;
                        } else if (i != 3) {
                            sc8.e();
                            return;
                        }
                    }
                }
                i2 = 6002;
            }
            i2 = 6006;
        }
        this.u = new rq3(i2, th);
        lad.d("DefaultDrmSession", "DRM session error", th);
        if (th instanceof Exception) {
            kw2 kw2Var = this.h;
            synchronized (kw2Var.a) {
                set = kw2Var.c;
            }
            for (vq3 vq3Var : set) {
                vq3Var.d((Exception) th);
            }
        } else if (th instanceof Error) {
            if (!ree.c(th) && !ree.b(th)) {
                throw ((Error) th);
            }
        } else {
            k93.h("Unexpected Throwable subclass", th);
            return;
        }
        if (this.p != 4) {
            this.p = (byte) 1;
        }
    }

    public final void m(Throwable th, boolean z) {
        int i;
        if (!(th instanceof NotProvisionedException) && !ree.b(th)) {
            if (z) {
                i = 1;
            } else {
                i = 2;
            }
            l(i, th);
            return;
        }
        this.c.G(this);
    }

    public final boolean n() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aa3.n():boolean");
    }

    public final void o(int i, boolean z, byte[] bArr) {
        try {
            synchronized (this.o) {
                this.y = new z24((byte) 11);
                List list = this.a;
                if (list != null) {
                    mm5.q(list);
                }
            }
            g54 t = this.b.t(bArr, this.a, i, this.g);
            this.x = t;
            y93 y93Var = this.s;
            String str = g8c.a;
            t.getClass();
            y93Var.getClass();
            y93Var.obtainMessage(2, new z93(f86.h.getAndIncrement(), z, SystemClock.elapsedRealtime(), t)).sendToTarget();
        } catch (Exception | NoSuchMethodError e) {
            m(e, true);
        }
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.m;
        if (currentThread != looper.getThread()) {
            lad.g("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
