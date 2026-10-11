package n2;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import e2.d0;
import i2.h0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import k2.g0;
import m4.p0;
import n4.x;
import w7.z;
public final class b implements g {
    public final List f16559a;
    public final q f16560b;
    public final x f16561c;
    public final g0 d;
    public final boolean f16562e;
    public final boolean f16563f;
    public final HashMap f16564g;
    public final e2.i h;
    public final rb.a f16565i;
    public final j2.k f16566j;
    public final com.google.firebase.messaging.m f16567k;
    public final UUID f16568l;
    public final Looper f16569m;
    public final androidx.mediarouter.app.c f16570n;
    public int f16571o;
    public int f16572p;
    public HandlerThread f16573q;
    public android.support.v4.media.session.f f16574r;
    public h2.b f16575s;
    public f f16576t;
    public byte[] f16577u;
    public byte[] v;
    public o f16578w;
    public p f16579x;

    public b(UUID uuid, q qVar, x xVar, g0 g0Var, List list, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, com.google.firebase.messaging.m mVar, Looper looper, rb.a aVar, j2.k kVar) {
        this.f16568l = uuid;
        this.f16561c = xVar;
        this.d = g0Var;
        this.f16560b = qVar;
        this.f16562e = z10;
        this.f16563f = z11;
        if (bArr != null) {
            this.v = bArr;
            this.f16559a = null;
        } else {
            list.getClass();
            this.f16559a = DesugarCollections.unmodifiableList(list);
        }
        this.f16564g = hashMap;
        this.f16567k = mVar;
        this.h = new e2.i();
        this.f16565i = aVar;
        this.f16566j = kVar;
        this.f16571o = 2;
        this.f16569m = looper;
        this.f16570n = new androidx.mediarouter.app.c(this, looper, 4);
    }

    @Override
    public final void a(j jVar) {
        p();
        int i10 = this.f16572p;
        if (i10 <= 0) {
            e2.a.e("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f16572p = i11;
        if (i11 == 0) {
            this.f16571o = 0;
            androidx.mediarouter.app.c cVar = this.f16570n;
            String str = d0.f8531a;
            cVar.removeCallbacksAndMessages(null);
            android.support.v4.media.session.f fVar = this.f16574r;
            synchronized (fVar) {
                fVar.removeCallbacksAndMessages(null);
                fVar.f2083b = true;
            }
            this.f16574r = null;
            this.f16573q.quit();
            this.f16573q = null;
            this.f16575s = null;
            this.f16576t = null;
            this.f16578w = null;
            this.f16579x = null;
            byte[] bArr = this.f16577u;
            if (bArr != null) {
                this.f16560b.x(bArr);
                this.f16577u = null;
            }
        }
        if (jVar != null) {
            this.h.n(jVar);
            if (this.h.i(jVar) == 0) {
                jVar.e();
            }
        }
        g0 g0Var = this.d;
        int i12 = this.f16572p;
        e eVar = (e) g0Var.f14469b;
        if (i12 == 1 && eVar.E > 0 && eVar.v != -9223372036854775807L) {
            eVar.f16593y.add(this);
            Handler handler = eVar.J;
            handler.getClass();
            handler.postAtTime(new h0(this, 14), this, SystemClock.uptimeMillis() + eVar.v);
        } else if (i12 == 0) {
            eVar.f16591w.remove(this);
            if (eVar.G == this) {
                eVar.G = null;
            }
            if (eVar.H == this) {
                eVar.H = null;
            }
            x xVar = eVar.f16588n;
            HashSet hashSet = (HashSet) xVar.f16694b;
            hashSet.remove(this);
            if (((b) xVar.f16695c) == this) {
                xVar.f16695c = null;
                if (!hashSet.isEmpty()) {
                    b bVar = (b) hashSet.iterator().next();
                    xVar.f16695c = bVar;
                    p h = bVar.f16560b.h();
                    bVar.f16579x = h;
                    android.support.v4.media.session.f fVar2 = bVar.f16574r;
                    String str2 = d0.f8531a;
                    h.getClass();
                    fVar2.getClass();
                    fVar2.obtainMessage(1, new a(u2.t.f48808b.getAndIncrement(), true, SystemClock.elapsedRealtime(), h)).sendToTarget();
                }
            }
            if (eVar.v != -9223372036854775807L) {
                Handler handler2 = eVar.J;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                eVar.f16593y.remove(this);
            }
        }
        eVar.g();
    }

    @Override
    public final void b(j jVar) {
        int i10;
        p();
        boolean z10 = false;
        if (this.f16572p < 0) {
            e2.a.e("DefaultDrmSession", "Session reference count less than zero: " + this.f16572p);
            this.f16572p = 0;
        }
        if (jVar != null) {
            e2.i iVar = this.h;
            synchronized (iVar.f8549a) {
                try {
                    ArrayList arrayList = new ArrayList(iVar.d);
                    arrayList.add(jVar);
                    iVar.d = DesugarCollections.unmodifiableList(arrayList);
                    Integer num = (Integer) iVar.f8550b.get(jVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(iVar.f8551c);
                        hashSet.add(jVar);
                        iVar.f8551c = DesugarCollections.unmodifiableSet(hashSet);
                    }
                    HashMap hashMap = iVar.f8550b;
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
        int i11 = this.f16572p + 1;
        this.f16572p = i11;
        if (i11 == 1) {
            if (this.f16571o == 2) {
                z10 = true;
            }
            e2.d.g(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f16573q = handlerThread;
            handlerThread.start();
            this.f16574r = new android.support.v4.media.session.f(this, this.f16573q.getLooper());
            if (n()) {
                j(true);
            }
        } else if (jVar != null && k() && this.h.i(jVar) == 1) {
            jVar.c(this.f16571o);
        }
        e eVar = (e) this.d.f14469b;
        if (eVar.v != -9223372036854775807L) {
            eVar.f16593y.remove(this);
            Handler handler = eVar.J;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override
    public final UUID c() {
        p();
        return this.f16568l;
    }

    @Override
    public final boolean d() {
        p();
        return this.f16562e;
    }

    @Override
    public final int e() {
        p();
        return this.f16571o;
    }

    @Override
    public final boolean f(String str) {
        p();
        byte[] bArr = this.f16577u;
        e2.d.h(bArr);
        return this.f16560b.Z(str, bArr);
    }

    @Override
    public final f g() {
        p();
        if (this.f16571o == 1) {
            return this.f16576t;
        }
        return null;
    }

    @Override
    public final h2.b h() {
        p();
        return this.f16575s;
    }

    public final void i(p0 p0Var) {
        Set<j> set;
        e2.i iVar = this.h;
        synchronized (iVar.f8549a) {
            set = iVar.f8551c;
        }
        for (j jVar : set) {
            jVar.a();
        }
    }

    public final void j(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.j(boolean):void");
    }

    public final boolean k() {
        int i10 = this.f16571o;
        if (i10 != 3 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void l(int i10, Throwable th2) {
        int i11;
        Set<j> set;
        if (th2 instanceof MediaDrm.MediaDrmStateException) {
            i11 = d0.w(d0.x(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
        } else {
            if (!(th2 instanceof MediaDrmResetException)) {
                if (!(th2 instanceof NotProvisionedException) && !z.b(th2)) {
                    if (th2 instanceof DeniedByServerException) {
                        i11 = 6007;
                    } else if (th2 instanceof w) {
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
        this.f16576t = new f(i11, th2);
        e2.a.f("DefaultDrmSession", "DRM session error", th2);
        if (th2 instanceof Exception) {
            e2.i iVar = this.h;
            synchronized (iVar.f8549a) {
                set = iVar.f8551c;
            }
            for (j jVar : set) {
                jVar.d((Exception) th2);
            }
        } else if (th2 instanceof Error) {
            if (!z.c(th2) && !z.b(th2)) {
                throw ((Error) th2);
            }
        } else {
            throw new IllegalStateException("Unexpected Throwable subclass", th2);
        }
        if (this.f16571o != 4) {
            this.f16571o = 1;
        }
    }

    public final void m(Throwable th2, boolean z10) {
        int i10;
        if (!(th2 instanceof NotProvisionedException) && !z.b(th2)) {
            if (z10) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            l(i10, th2);
            return;
        }
        this.f16561c.T(this);
    }

    public final boolean n() {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.n():boolean");
    }

    public final void o(int i10, boolean z10, byte[] bArr) {
        try {
            o J = this.f16560b.J(bArr, this.f16559a, i10, this.f16564g);
            this.f16578w = J;
            android.support.v4.media.session.f fVar = this.f16574r;
            String str = d0.f8531a;
            J.getClass();
            fVar.getClass();
            fVar.obtainMessage(2, new a(u2.t.f48808b.getAndIncrement(), z10, SystemClock.elapsedRealtime(), J)).sendToTarget();
        } catch (Exception | NoSuchMethodError e7) {
            m(e7, true);
        }
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f16569m;
        if (currentThread != looper.getThread()) {
            e2.a.o("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
