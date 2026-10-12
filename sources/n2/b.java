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
import ji.d4;
import ji.h5;
import v7.u6;
import w7.b0;
public final class b implements g {
    public final List f15919a;
    public final r f15920b;
    public final n4.s f15921c;
    public final h5 d;
    public final boolean e;
    public final boolean f15922f;
    public final HashMap f15923g;
    public final e2.k h;
    public final oa.d f15924i;
    public final j2.k f15925j;
    public final c2.b f15926k;
    public final UUID f15927l;
    public final Looper f15928m;
    public final o0 f15929n;
    public final Object f15930o;
    public int f15931p;
    public int f15932q;
    public HandlerThread f15933r;
    public android.support.v4.media.session.f f15934s;
    public h2.b f15935t;
    public f f15936u;
    public byte[] v;
    public byte[] f15937w;
    public p f15938x;
    public d4 f15939y;
    public q f15940z;

    public b(UUID uuid, r rVar, n4.s sVar, h5 h5Var, List list, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, c2.b bVar, Looper looper, oa.d dVar, j2.k kVar) {
        this.f15927l = uuid;
        this.f15921c = sVar;
        this.d = h5Var;
        this.f15920b = rVar;
        this.e = z10;
        this.f15922f = z11;
        if (bArr != null) {
            this.f15937w = bArr;
            this.f15919a = null;
        } else {
            list.getClass();
            this.f15919a = DesugarCollections.unmodifiableList(list);
        }
        this.f15923g = hashMap;
        this.f15926k = bVar;
        this.h = new e2.k();
        this.f15924i = dVar;
        this.f15925j = kVar;
        this.f15931p = 2;
        this.f15928m = looper;
        this.f15929n = new o0(this, looper, 5);
        this.f15930o = new Object();
    }

    @Override
    public final void a(k kVar) {
        p();
        int i10 = this.f15932q;
        if (i10 <= 0) {
            e2.a.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f15932q = i11;
        if (i11 == 0) {
            this.f15931p = 0;
            o0 o0Var = this.f15929n;
            String str = m0.f8372a;
            o0Var.removeCallbacksAndMessages(null);
            this.f15934s.b();
            this.f15934s = null;
            this.f15933r.quit();
            this.f15933r = null;
            this.f15935t = null;
            this.f15936u = null;
            this.f15938x = null;
            synchronized (this.f15930o) {
                this.f15939y = null;
            }
            this.f15940z = null;
            byte[] bArr = this.v;
            if (bArr != null) {
                this.f15920b.X(bArr);
                this.v = null;
            }
        }
        if (kVar != null) {
            this.h.m(kVar);
            if (this.h.h(kVar) == 0) {
                kVar.e();
            }
        }
        h5 h5Var = this.d;
        int i12 = this.f15932q;
        e eVar = (e) h5Var.f13312b;
        if (i12 == 1 && eVar.E > 0 && eVar.v != -9223372036854775807L) {
            eVar.f15953y.add(this);
            Handler handler = eVar.J;
            handler.getClass();
            handler.postAtTime(new t0(this, 19), this, SystemClock.uptimeMillis() + eVar.v);
        } else if (i12 == 0) {
            eVar.f15951w.remove(this);
            if (eVar.G == this) {
                eVar.G = null;
            }
            if (eVar.H == this) {
                eVar.H = null;
            }
            n4.s sVar = eVar.f15948n;
            HashSet hashSet = (HashSet) sVar.f16031b;
            hashSet.remove(this);
            if (((b) sVar.f16032c) == this) {
                sVar.f16032c = null;
                if (!hashSet.isEmpty()) {
                    b bVar = (b) hashSet.iterator().next();
                    sVar.f16032c = bVar;
                    q l4 = bVar.f15920b.l();
                    bVar.f15940z = l4;
                    android.support.v4.media.session.f fVar = bVar.f15934s;
                    String str2 = m0.f8372a;
                    l4.getClass();
                    fVar.getClass();
                    fVar.obtainMessage(1, new a(u2.u.f46053g.getAndIncrement(), true, SystemClock.elapsedRealtime(), l4)).sendToTarget();
                }
            }
            if (eVar.v != -9223372036854775807L) {
                Handler handler2 = eVar.J;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                eVar.f15953y.remove(this);
            }
        }
        eVar.g();
    }

    @Override
    public final void b(k kVar) {
        int i10;
        p();
        boolean z10 = false;
        if (this.f15932q < 0) {
            e2.a.c("DefaultDrmSession", "Session reference count less than zero: " + this.f15932q);
            this.f15932q = 0;
        }
        if (kVar != null) {
            e2.k kVar2 = this.h;
            synchronized (kVar2.f8361a) {
                try {
                    ArrayList arrayList = new ArrayList(kVar2.d);
                    arrayList.add(kVar);
                    kVar2.d = DesugarCollections.unmodifiableList(arrayList);
                    Integer num = (Integer) kVar2.f8362b.get(kVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(kVar2.f8363c);
                        hashSet.add(kVar);
                        kVar2.f8363c = DesugarCollections.unmodifiableSet(hashSet);
                    }
                    HashMap hashMap = kVar2.f8362b;
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
        int i11 = this.f15932q + 1;
        this.f15932q = i11;
        if (i11 == 1) {
            if (this.f15931p == 2) {
                z10 = true;
            }
            u6.p(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f15933r = handlerThread;
            handlerThread.start();
            this.f15934s = new android.support.v4.media.session.f(this, this.f15933r.getLooper());
            if (n()) {
                j(true);
            }
        } else if (kVar != null && k() && this.h.h(kVar) == 1) {
            kVar.c(this.f15931p);
        }
        e eVar = (e) this.d.f13312b;
        if (eVar.v != -9223372036854775807L) {
            eVar.f15953y.remove(this);
            Handler handler = eVar.J;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override
    public final UUID c() {
        p();
        return this.f15927l;
    }

    @Override
    public final boolean d() {
        p();
        return this.e;
    }

    @Override
    public final int e() {
        p();
        return this.f15931p;
    }

    @Override
    public final boolean f(String str) {
        p();
        byte[] bArr = this.v;
        bArr.getClass();
        return this.f15920b.D0(str, bArr);
    }

    @Override
    public final f g() {
        p();
        if (this.f15931p == 1) {
            return this.f15936u;
        }
        return null;
    }

    @Override
    public final h2.b h() {
        p();
        return this.f15935t;
    }

    public final void i(e2.j jVar) {
        Set<k> set;
        e2.k kVar = this.h;
        synchronized (kVar.f8361a) {
            set = kVar.f8363c;
        }
        for (k kVar2 : set) {
            jVar.accept(kVar2);
        }
    }

    public final void j(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.j(boolean):void");
    }

    public final boolean k() {
        int i10 = this.f15931p;
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
                if (!(th2 instanceof NotProvisionedException) && !b0.b(th2)) {
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
        this.f15936u = new f(i11, th2);
        e2.a.d("DefaultDrmSession", "DRM session error", th2);
        if (th2 instanceof Exception) {
            e2.k kVar = this.h;
            synchronized (kVar.f8361a) {
                set = kVar.f8363c;
            }
            for (k kVar2 : set) {
                kVar2.d((Exception) th2);
            }
        } else if (th2 instanceof Error) {
            if (!b0.c(th2) && !b0.b(th2)) {
                throw ((Error) th2);
            }
        } else {
            throw new IllegalStateException("Unexpected Throwable subclass", th2);
        }
        if (this.f15931p != 4) {
            this.f15931p = 1;
        }
    }

    public final void m(Throwable th2, boolean z10) {
        int i10;
        if (!(th2 instanceof NotProvisionedException) && !b0.b(th2)) {
            if (z10) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            l(i10, th2);
            return;
        }
        this.f15921c.u(this);
    }

    public final boolean n() {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.n():boolean");
    }

    public final void o(int i10, boolean z10, byte[] bArr) {
        try {
            synchronized (this.f15930o) {
                this.f15939y = new d4(6);
                List list = this.f15919a;
                if (list != null) {
                    n0.u(list);
                }
            }
            p m0 = this.f15920b.m0(bArr, this.f15919a, i10, this.f15923g);
            this.f15938x = m0;
            android.support.v4.media.session.f fVar = this.f15934s;
            String str = m0.f8372a;
            m0.getClass();
            fVar.getClass();
            fVar.obtainMessage(2, new a(u2.u.f46053g.getAndIncrement(), z10, SystemClock.elapsedRealtime(), m0)).sendToTarget();
        } catch (Exception | NoSuchMethodError e) {
            m(e, true);
        }
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f15928m;
        if (currentThread != looper.getThread()) {
            e2.a.m("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
