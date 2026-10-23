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
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import ki.t1;
import v7.u6;
import w7.a0;
public final class b implements h {
    public final List f17076a;
    public final r f17077b;
    public final e f17078c;
    public final t1 d;
    public final boolean e;
    public final boolean f17079f;
    public final HashMap f17080g;
    public final e2.k h;
    public final oa.d f17081i;
    public final j2.j f17082j;
    public final c2.b f17083k;
    public final UUID f17084l;
    public final Looper f17085m;
    public final o0 f17086n;
    public final Object f17087o;
    public int f17088p;
    public int f17089q;
    public HandlerThread f17090r;
    public android.support.v4.media.session.f f17091s;
    public h2.b f17092t;
    public g f17093u;
    public byte[] v;
    public byte[] f17094w;
    public p f17095x;
    public le.b f17096y;
    public q f17097z;

    public b(UUID uuid, r rVar, e eVar, t1 t1Var, List list, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, c2.b bVar, Looper looper, oa.d dVar, j2.j jVar) {
        this.f17084l = uuid;
        this.f17078c = eVar;
        this.d = t1Var;
        this.f17077b = rVar;
        this.e = z10;
        this.f17079f = z11;
        if (bArr != null) {
            this.f17094w = bArr;
            this.f17076a = null;
        } else {
            list.getClass();
            this.f17076a = DesugarCollections.unmodifiableList(list);
        }
        this.f17080g = hashMap;
        this.f17083k = bVar;
        this.h = new e2.k();
        this.f17081i = dVar;
        this.f17082j = jVar;
        this.f17088p = 2;
        this.f17085m = looper;
        this.f17086n = new o0(this, looper, 5);
        this.f17087o = new Object();
    }

    @Override
    public final void a(k kVar) {
        p();
        int i10 = this.f17089q;
        if (i10 <= 0) {
            e2.a.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f17089q = i11;
        if (i11 == 0) {
            this.f17088p = 0;
            o0 o0Var = this.f17086n;
            String str = m0.f8259a;
            o0Var.removeCallbacksAndMessages(null);
            this.f17091s.b();
            this.f17091s = null;
            this.f17090r.quit();
            this.f17090r = null;
            this.f17092t = null;
            this.f17093u = null;
            this.f17095x = null;
            synchronized (this.f17087o) {
                this.f17096y = null;
            }
            this.f17097z = null;
            byte[] bArr = this.v;
            if (bArr != null) {
                this.f17077b.Y(bArr);
                this.v = null;
            }
        }
        if (kVar != null) {
            this.h.m(kVar);
            if (this.h.h(kVar) == 0) {
                kVar.e();
            }
        }
        t1 t1Var = this.d;
        int i12 = this.f17089q;
        f fVar = (f) t1Var.f15585b;
        if (i12 == 1 && fVar.E > 0 && fVar.v != -9223372036854775807L) {
            fVar.f17113y.add(this);
            Handler handler = fVar.J;
            handler.getClass();
            handler.postAtTime(new ki.u(this, 8), this, SystemClock.uptimeMillis() + fVar.v);
        } else if (i12 == 0) {
            fVar.f17111w.remove(this);
            if (fVar.G == this) {
                fVar.G = null;
            }
            if (fVar.H == this) {
                fVar.H = null;
            }
            e eVar = fVar.f17108n;
            HashSet hashSet = (HashSet) eVar.f17102b;
            hashSet.remove(this);
            if (((b) eVar.f17103c) == this) {
                eVar.f17103c = null;
                if (!hashSet.isEmpty()) {
                    b bVar = (b) hashSet.iterator().next();
                    eVar.f17103c = bVar;
                    q o10 = bVar.f17077b.o();
                    bVar.f17097z = o10;
                    android.support.v4.media.session.f fVar2 = bVar.f17091s;
                    String str2 = m0.f8259a;
                    o10.getClass();
                    fVar2.getClass();
                    fVar2.obtainMessage(1, new a(u2.v.f47898g.getAndIncrement(), true, SystemClock.elapsedRealtime(), o10)).sendToTarget();
                }
            }
            if (fVar.v != -9223372036854775807L) {
                Handler handler2 = fVar.J;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                fVar.f17113y.remove(this);
            }
        }
        fVar.g();
    }

    @Override
    public final void b(k kVar) {
        int i10;
        p();
        boolean z10 = false;
        if (this.f17089q < 0) {
            e2.a.c("DefaultDrmSession", "Session reference count less than zero: " + this.f17089q);
            this.f17089q = 0;
        }
        if (kVar != null) {
            e2.k kVar2 = this.h;
            synchronized (kVar2.f8248a) {
                try {
                    ArrayList arrayList = new ArrayList(kVar2.d);
                    arrayList.add(kVar);
                    kVar2.d = DesugarCollections.unmodifiableList(arrayList);
                    Integer num = (Integer) kVar2.f8249b.get(kVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(kVar2.f8250c);
                        hashSet.add(kVar);
                        kVar2.f8250c = DesugarCollections.unmodifiableSet(hashSet);
                    }
                    HashMap hashMap = kVar2.f8249b;
                    if (num != null) {
                        i10 = num.intValue() + 1;
                    } else {
                        i10 = 1;
                    }
                    hashMap.put(kVar, Integer.valueOf(i10));
                } finally {
                }
            }
        }
        int i11 = this.f17089q + 1;
        this.f17089q = i11;
        if (i11 == 1) {
            if (this.f17088p == 2) {
                z10 = true;
            }
            u6.p(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f17090r = handlerThread;
            handlerThread.start();
            this.f17091s = new android.support.v4.media.session.f(this, this.f17090r.getLooper());
            if (n()) {
                j(true);
            }
        } else if (kVar != null && k() && this.h.h(kVar) == 1) {
            kVar.c(this.f17088p);
        }
        f fVar = (f) this.d.f15585b;
        if (fVar.v != -9223372036854775807L) {
            fVar.f17113y.remove(this);
            Handler handler = fVar.J;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override
    public final UUID c() {
        p();
        return this.f17084l;
    }

    @Override
    public final boolean d() {
        p();
        return this.e;
    }

    @Override
    public final int e() {
        p();
        return this.f17088p;
    }

    @Override
    public final boolean f(String str) {
        p();
        byte[] bArr = this.v;
        bArr.getClass();
        return this.f17077b.B0(str, bArr);
    }

    @Override
    public final g g() {
        p();
        if (this.f17088p == 1) {
            return this.f17093u;
        }
        return null;
    }

    @Override
    public final h2.b h() {
        p();
        return this.f17092t;
    }

    public final void i(e2.j jVar) {
        Set<k> set;
        e2.k kVar = this.h;
        synchronized (kVar.f8248a) {
            set = kVar.f8250c;
        }
        for (k kVar2 : set) {
            jVar.accept(kVar2);
        }
    }

    public final void j(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.j(boolean):void");
    }

    public final boolean k() {
        int i10 = this.f17088p;
        if (i10 != 3 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void l(int i10, Throwable th2) {
        int i11;
        Set<k> set;
        if (th2 instanceof MediaDrm.MediaDrmStateException) {
            i11 = m0.z(m0.A(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
        } else {
            if (!(th2 instanceof MediaDrmResetException)) {
                if (!(th2 instanceof NotProvisionedException) && !a0.b(th2)) {
                    if (th2 instanceof DeniedByServerException) {
                        i11 = 6007;
                    } else if (th2 instanceof y) {
                        i11 = 6001;
                    } else if (th2 instanceof c) {
                        i11 = 6003;
                    } else if (th2 instanceof v) {
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
        this.f17093u = new g(i11, th2);
        e2.a.d("DefaultDrmSession", "DRM session error", th2);
        if (th2 instanceof Exception) {
            e2.k kVar = this.h;
            synchronized (kVar.f8248a) {
                set = kVar.f8250c;
            }
            for (k kVar2 : set) {
                kVar2.d((Exception) th2);
            }
        } else if (th2 instanceof Error) {
            if (!a0.c(th2) && !a0.b(th2)) {
                throw ((Error) th2);
            }
        } else {
            throw new IllegalStateException("Unexpected Throwable subclass", th2);
        }
        if (this.f17088p != 4) {
            this.f17088p = 1;
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
        this.f17078c.P(this);
    }

    public final boolean n() {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.n():boolean");
    }

    public final void o(int i10, boolean z10, byte[] bArr) {
        try {
            synchronized (this.f17087o) {
                this.f17096y = new le.b();
                List list = this.f17076a;
                if (list != null) {
                    n0.u(list);
                }
            }
            p k02 = this.f17077b.k0(bArr, this.f17076a, i10, this.f17080g);
            this.f17095x = k02;
            android.support.v4.media.session.f fVar = this.f17091s;
            String str = m0.f8259a;
            k02.getClass();
            fVar.getClass();
            fVar.obtainMessage(2, new a(u2.v.f47898g.getAndIncrement(), z10, SystemClock.elapsedRealtime(), k02)).sendToTarget();
        } catch (Exception | NoSuchMethodError e) {
            m(e, true);
        }
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f17085m;
        if (currentThread != looper.getThread()) {
            e2.a.m("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
