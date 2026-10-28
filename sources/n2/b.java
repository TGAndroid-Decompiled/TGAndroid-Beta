package n2;

import a8.te;
import a8.yb;
import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import e2.n0;
import f9.i0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import li.h5;
public final class b implements g {
    public final List f18583a;
    public final q f18584b;
    public final m4.c f18585c;
    public final h5 d;
    public final boolean e;
    public final boolean f18586f;
    public final HashMap f18587g;
    public final e2.k h;
    public final u7.s f18588i;
    public final j2.j f18589j;
    public final c2.b f18590k;
    public final UUID f18591l;
    public final Looper f18592m;
    public final androidx.mediarouter.app.c f18593n;
    public final Object f18594o;
    public int f18595p;
    public int f18596q;
    public HandlerThread f18597r;
    public android.support.v4.media.session.f f18598s;
    public h2.b f18599t;
    public f f18600u;
    public byte[] v;
    public byte[] f18601w;
    public o f18602x;
    public jg.i f18603y;
    public p f18604z;

    public b(UUID uuid, q qVar, m4.c cVar, h5 h5Var, List list, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, c2.b bVar, Looper looper, u7.s sVar, j2.j jVar) {
        this.f18591l = uuid;
        this.f18585c = cVar;
        this.d = h5Var;
        this.f18584b = qVar;
        this.e = z10;
        this.f18586f = z11;
        if (bArr != null) {
            this.f18601w = bArr;
            this.f18583a = null;
        } else {
            list.getClass();
            this.f18583a = DesugarCollections.unmodifiableList(list);
        }
        this.f18587g = hashMap;
        this.f18590k = bVar;
        this.h = new e2.k();
        this.f18588i = sVar;
        this.f18589j = jVar;
        this.f18595p = 2;
        this.f18592m = looper;
        this.f18593n = new androidx.mediarouter.app.c(this, looper, 5);
        this.f18594o = new Object();
    }

    @Override
    public final void a(j jVar) {
        p();
        int i10 = this.f18596q;
        if (i10 <= 0) {
            e2.a.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f18596q = i11;
        if (i11 == 0) {
            this.f18595p = 0;
            androidx.mediarouter.app.c cVar = this.f18593n;
            String str = n0.f9691a;
            cVar.removeCallbacksAndMessages(null);
            this.f18598s.b();
            this.f18598s = null;
            this.f18597r.quit();
            this.f18597r = null;
            this.f18599t = null;
            this.f18600u = null;
            this.f18602x = null;
            synchronized (this.f18594o) {
                this.f18603y = null;
            }
            this.f18604z = null;
            byte[] bArr = this.v;
            if (bArr != null) {
                this.f18584b.H(bArr);
                this.v = null;
            }
        }
        if (jVar != null) {
            this.h.m(jVar);
            if (this.h.h(jVar) == 0) {
                jVar.e();
            }
        }
        h5 h5Var = this.d;
        int i12 = this.f18596q;
        e eVar = (e) h5Var.f17284a;
        if (i12 == 1 && eVar.E > 0 && eVar.v != -9223372036854775807L) {
            eVar.f18617y.add(this);
            Handler handler = eVar.J;
            handler.getClass();
            handler.postAtTime(new k2.c(this, 11), this, SystemClock.uptimeMillis() + eVar.v);
        } else if (i12 == 0) {
            eVar.f18615w.remove(this);
            if (eVar.G == this) {
                eVar.G = null;
            }
            if (eVar.H == this) {
                eVar.H = null;
            }
            m4.c cVar2 = eVar.f18612n;
            HashSet hashSet = (HashSet) cVar2.f18008b;
            hashSet.remove(this);
            if (((b) cVar2.f18009c) == this) {
                cVar2.f18009c = null;
                if (!hashSet.isEmpty()) {
                    b bVar = (b) hashSet.iterator().next();
                    cVar2.f18009c = bVar;
                    p k10 = bVar.f18584b.k();
                    bVar.f18604z = k10;
                    android.support.v4.media.session.f fVar = bVar.f18598s;
                    String str2 = n0.f9691a;
                    k10.getClass();
                    fVar.getClass();
                    fVar.obtainMessage(1, new a(u2.u.f49470g.getAndIncrement(), true, SystemClock.elapsedRealtime(), k10)).sendToTarget();
                }
            }
            if (eVar.v != -9223372036854775807L) {
                Handler handler2 = eVar.J;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                eVar.f18617y.remove(this);
            }
        }
        eVar.i();
    }

    @Override
    public final void b(j jVar) {
        int i10;
        p();
        boolean z10 = false;
        if (this.f18596q < 0) {
            e2.a.c("DefaultDrmSession", "Session reference count less than zero: " + this.f18596q);
            this.f18596q = 0;
        }
        if (jVar != null) {
            e2.k kVar = this.h;
            synchronized (kVar.f9675a) {
                try {
                    ArrayList arrayList = new ArrayList(kVar.d);
                    arrayList.add(jVar);
                    kVar.d = DesugarCollections.unmodifiableList(arrayList);
                    Integer num = (Integer) kVar.f9676b.get(jVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(kVar.f9677c);
                        hashSet.add(jVar);
                        kVar.f9677c = DesugarCollections.unmodifiableSet(hashSet);
                    }
                    HashMap hashMap = kVar.f9676b;
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
        int i11 = this.f18596q + 1;
        this.f18596q = i11;
        if (i11 == 1) {
            if (this.f18595p == 2) {
                z10 = true;
            }
            yb.p(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f18597r = handlerThread;
            handlerThread.start();
            this.f18598s = new android.support.v4.media.session.f(this, this.f18597r.getLooper());
            if (n()) {
                j(true);
            }
        } else if (jVar != null && k() && this.h.h(jVar) == 1) {
            jVar.c(this.f18595p);
        }
        e eVar = (e) this.d.f17284a;
        if (eVar.v != -9223372036854775807L) {
            eVar.f18617y.remove(this);
            Handler handler = eVar.J;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override
    public final UUID c() {
        p();
        return this.f18591l;
    }

    @Override
    public final boolean d() {
        p();
        return this.e;
    }

    @Override
    public final int e() {
        p();
        return this.f18595p;
    }

    @Override
    public final boolean f(String str) {
        p();
        byte[] bArr = this.v;
        bArr.getClass();
        return this.f18584b.p0(str, bArr);
    }

    @Override
    public final f g() {
        p();
        if (this.f18595p == 1) {
            return this.f18600u;
        }
        return null;
    }

    @Override
    public final h2.b h() {
        p();
        return this.f18599t;
    }

    public final void i(e2.j jVar) {
        Set<j> set;
        e2.k kVar = this.h;
        synchronized (kVar.f9675a) {
            set = kVar.f9677c;
        }
        for (j jVar2 : set) {
            jVar.accept(jVar2);
        }
    }

    public final void j(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.j(boolean):void");
    }

    public final boolean k() {
        int i10 = this.f18595p;
        if (i10 != 3 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void l(int i10, Throwable th2) {
        int i11;
        Set<j> set;
        if (th2 instanceof MediaDrm.MediaDrmStateException) {
            i11 = n0.z(n0.A(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
        } else {
            if (!(th2 instanceof MediaDrmResetException)) {
                if (!(th2 instanceof NotProvisionedException) && !te.b(th2)) {
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
        this.f18600u = new f(i11, th2);
        e2.a.d("DefaultDrmSession", "DRM session error", th2);
        if (th2 instanceof Exception) {
            e2.k kVar = this.h;
            synchronized (kVar.f9675a) {
                set = kVar.f9677c;
            }
            for (j jVar : set) {
                jVar.d((Exception) th2);
            }
        } else if (th2 instanceof Error) {
            if (!te.c(th2) && !te.b(th2)) {
                throw ((Error) th2);
            }
        } else {
            throw new IllegalStateException("Unexpected Throwable subclass", th2);
        }
        if (this.f18595p != 4) {
            this.f18595p = 1;
        }
    }

    public final void m(Throwable th2, boolean z10) {
        int i10;
        if (!(th2 instanceof NotProvisionedException) && !te.b(th2)) {
            if (z10) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            l(i10, th2);
            return;
        }
        this.f18585c.p0(this);
    }

    public final boolean n() {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.n():boolean");
    }

    public final void o(int i10, boolean z10, byte[] bArr) {
        try {
            synchronized (this.f18594o) {
                try {
                    this.f18603y = new jg.i(10);
                    List list = this.f18583a;
                    if (list != null) {
                        i0.u(list);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            o Y = this.f18584b.Y(bArr, this.f18583a, i10, this.f18587g);
            this.f18602x = Y;
            android.support.v4.media.session.f fVar = this.f18598s;
            String str = n0.f9691a;
            Y.getClass();
            fVar.getClass();
            fVar.obtainMessage(2, new a(u2.u.f49470g.getAndIncrement(), z10, SystemClock.elapsedRealtime(), Y)).sendToTarget();
        } catch (Exception | NoSuchMethodError e) {
            m(e, true);
        }
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f18592m;
        if (currentThread != looper.getThread()) {
            e2.a.m("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
