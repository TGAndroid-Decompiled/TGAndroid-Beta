package n2;

import ab.o0;
import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import e2.m0;
import e9.n0;
import ig.t0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import ji.h5;
import ji.w4;
import v7.u6;
import w7.a0;
import z7.xf;
public final class b implements g {
    public final List f15633a;
    public final q f15634b;
    public final xf f15635c;
    public final w4 d;
    public final boolean e;
    public final boolean f15636f;
    public final HashMap f15637g;
    public final e2.k h;
    public final oa.d f15638i;
    public final j2.k f15639j;
    public final c2.b f15640k;
    public final UUID f15641l;
    public final Looper f15642m;
    public final o0 f15643n;
    public final Object f15644o;
    public int f15645p;
    public int f15646q;
    public HandlerThread f15647r;
    public android.support.v4.media.session.f f15648s;
    public h2.b f15649t;
    public f f15650u;
    public byte[] v;
    public byte[] f15651w;
    public o f15652x;
    public h5 f15653y;
    public p f15654z;

    public b(UUID uuid, q qVar, xf xfVar, w4 w4Var, List list, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, c2.b bVar, Looper looper, oa.d dVar, j2.k kVar) {
        this.f15641l = uuid;
        this.f15635c = xfVar;
        this.d = w4Var;
        this.f15634b = qVar;
        this.e = z10;
        this.f15636f = z11;
        if (bArr != null) {
            this.f15651w = bArr;
            this.f15633a = null;
        } else {
            list.getClass();
            this.f15633a = DesugarCollections.unmodifiableList(list);
        }
        this.f15637g = hashMap;
        this.f15640k = bVar;
        this.h = new e2.k();
        this.f15638i = dVar;
        this.f15639j = kVar;
        this.f15645p = 2;
        this.f15642m = looper;
        this.f15643n = new o0(this, looper, 5);
        this.f15644o = new Object();
    }

    @Override
    public final void a(j jVar) {
        p();
        int i10 = this.f15646q;
        if (i10 <= 0) {
            e2.a.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f15646q = i11;
        if (i11 == 0) {
            this.f15645p = 0;
            o0 o0Var = this.f15643n;
            String str = m0.f8375a;
            o0Var.removeCallbacksAndMessages(null);
            this.f15648s.b();
            this.f15648s = null;
            this.f15647r.quit();
            this.f15647r = null;
            this.f15649t = null;
            this.f15650u = null;
            this.f15652x = null;
            synchronized (this.f15644o) {
                this.f15653y = null;
            }
            this.f15654z = null;
            byte[] bArr = this.v;
            if (bArr != null) {
                this.f15634b.W(bArr);
                this.v = null;
            }
        }
        if (jVar != null) {
            this.h.m(jVar);
            if (this.h.h(jVar) == 0) {
                jVar.e();
            }
        }
        w4 w4Var = this.d;
        int i12 = this.f15646q;
        e eVar = (e) w4Var.f13595b;
        if (i12 == 1 && eVar.E > 0 && eVar.v != -9223372036854775807L) {
            eVar.f15667y.add(this);
            Handler handler = eVar.J;
            handler.getClass();
            handler.postAtTime(new t0(this, 18), this, SystemClock.uptimeMillis() + eVar.v);
        } else if (i12 == 0) {
            eVar.f15665w.remove(this);
            if (eVar.G == this) {
                eVar.G = null;
            }
            if (eVar.H == this) {
                eVar.H = null;
            }
            xf xfVar = eVar.f15662n;
            HashSet hashSet = (HashSet) xfVar.f49868a;
            hashSet.remove(this);
            if (((b) xfVar.f49869b) == this) {
                xfVar.f49869b = null;
                if (!hashSet.isEmpty()) {
                    b bVar = (b) hashSet.iterator().next();
                    xfVar.f49869b = bVar;
                    p p5 = bVar.f15634b.p();
                    bVar.f15654z = p5;
                    android.support.v4.media.session.f fVar = bVar.f15648s;
                    String str2 = m0.f8375a;
                    p5.getClass();
                    fVar.getClass();
                    fVar.obtainMessage(1, new a(u2.u.f46053g.getAndIncrement(), true, SystemClock.elapsedRealtime(), p5)).sendToTarget();
                }
            }
            if (eVar.v != -9223372036854775807L) {
                Handler handler2 = eVar.J;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                eVar.f15667y.remove(this);
            }
        }
        eVar.g();
    }

    @Override
    public final void b(j jVar) {
        int i10;
        p();
        boolean z10 = false;
        if (this.f15646q < 0) {
            e2.a.c("DefaultDrmSession", "Session reference count less than zero: " + this.f15646q);
            this.f15646q = 0;
        }
        if (jVar != null) {
            e2.k kVar = this.h;
            synchronized (kVar.f8364a) {
                try {
                    ArrayList arrayList = new ArrayList(kVar.d);
                    arrayList.add(jVar);
                    kVar.d = DesugarCollections.unmodifiableList(arrayList);
                    Integer num = (Integer) kVar.f8365b.get(jVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(kVar.f8366c);
                        hashSet.add(jVar);
                        kVar.f8366c = DesugarCollections.unmodifiableSet(hashSet);
                    }
                    HashMap hashMap = kVar.f8365b;
                    if (num != null) {
                        i10 = num.intValue() + 1;
                    } else {
                        i10 = 1;
                    }
                    hashMap.put(jVar, Integer.valueOf(i10));
                } finally {
                }
            }
        }
        int i11 = this.f15646q + 1;
        this.f15646q = i11;
        if (i11 == 1) {
            if (this.f15645p == 2) {
                z10 = true;
            }
            u6.p(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f15647r = handlerThread;
            handlerThread.start();
            this.f15648s = new android.support.v4.media.session.f(this, this.f15647r.getLooper());
            if (n()) {
                j(true);
            }
        } else if (jVar != null && k() && this.h.h(jVar) == 1) {
            jVar.c(this.f15645p);
        }
        e eVar = (e) this.d.f13595b;
        if (eVar.v != -9223372036854775807L) {
            eVar.f15667y.remove(this);
            Handler handler = eVar.J;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override
    public final UUID c() {
        p();
        return this.f15641l;
    }

    @Override
    public final boolean d() {
        p();
        return this.e;
    }

    @Override
    public final int e() {
        p();
        return this.f15645p;
    }

    @Override
    public final boolean f(String str) {
        p();
        byte[] bArr = this.v;
        bArr.getClass();
        return this.f15634b.w0(str, bArr);
    }

    @Override
    public final f g() {
        p();
        if (this.f15645p == 1) {
            return this.f15650u;
        }
        return null;
    }

    @Override
    public final h2.b h() {
        p();
        return this.f15649t;
    }

    public final void i(e2.j jVar) {
        Set<j> set;
        e2.k kVar = this.h;
        synchronized (kVar.f8364a) {
            set = kVar.f8366c;
        }
        for (j jVar2 : set) {
            jVar.accept(jVar2);
        }
    }

    public final void j(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.j(boolean):void");
    }

    public final boolean k() {
        int i10 = this.f15645p;
        if (i10 != 3 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void l(int i10, Throwable th2) {
        int i11;
        Set<j> set;
        if (th2 instanceof MediaDrm.MediaDrmStateException) {
            i11 = m0.z(m0.A(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
        } else {
            if (!(th2 instanceof MediaDrmResetException)) {
                if (!(th2 instanceof NotProvisionedException) && !a0.b(th2)) {
                    if (th2 instanceof DeniedByServerException) {
                        i11 = 6007;
                    } else if (th2 instanceof x) {
                        i11 = 6001;
                    } else if (th2 instanceof c) {
                        i11 = 6003;
                    } else if (th2 instanceof u) {
                        i11 = 6008;
                    } else if (i10 != 1) {
                        if (i10 == 2) {
                            i11 = 6004;
                        } else if (i10 != 3) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                i11 = 6002;
            }
            i11 = 6006;
        }
        this.f15650u = new f(i11, th2);
        e2.a.d("DefaultDrmSession", "DRM session error", th2);
        if (th2 instanceof Exception) {
            e2.k kVar = this.h;
            synchronized (kVar.f8364a) {
                set = kVar.f8366c;
            }
            for (j jVar : set) {
                jVar.d((Exception) th2);
            }
        } else if (th2 instanceof Error) {
            if (!a0.c(th2) && !a0.b(th2)) {
                throw ((Error) th2);
            }
        } else {
            throw new IllegalStateException("Unexpected Throwable subclass", th2);
        }
        if (this.f15645p != 4) {
            this.f15645p = 1;
        }
    }

    public final void m(Throwable th2, boolean z10) {
        int i10;
        if (!(th2 instanceof NotProvisionedException) && !a0.b(th2)) {
            if (z10) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            l(i10, th2);
            return;
        }
        this.f15635c.b(this);
    }

    public final boolean n() {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.n():boolean");
    }

    public final void o(int i10, boolean z10, byte[] bArr) {
        try {
            synchronized (this.f15644o) {
                this.f15653y = new h5(7);
                List list = this.f15633a;
                if (list != null) {
                    n0.u(list);
                }
            }
            o k02 = this.f15634b.k0(bArr, this.f15633a, i10, this.f15637g);
            this.f15652x = k02;
            android.support.v4.media.session.f fVar = this.f15648s;
            String str = m0.f8375a;
            k02.getClass();
            fVar.getClass();
            fVar.obtainMessage(2, new a(u2.u.f46053g.getAndIncrement(), z10, SystemClock.elapsedRealtime(), k02)).sendToTarget();
        } catch (Exception | NoSuchMethodError e) {
            m(e, true);
        }
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f15642m;
        if (currentThread != looper.getThread()) {
            e2.a.m("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
