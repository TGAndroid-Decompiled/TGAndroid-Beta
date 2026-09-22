package n2;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import e2.d0;
import i2.g0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import w7.a0;
public final class b implements g {
    public final List f14864a;
    public final q f14865b;
    public final of.b f14866c;
    public final a4.m d;
    public final boolean e;
    public final boolean f14867f;
    public final HashMap f14868g;
    public final e2.i h;
    public final qb.b f14869i;
    public final j2.k f14870j;
    public final com.google.firebase.messaging.m f14871k;
    public final UUID f14872l;
    public final Looper f14873m;
    public final androidx.mediarouter.app.c f14874n;
    public int f14875o;
    public int f14876p;
    public HandlerThread f14877q;
    public android.support.v4.media.session.f f14878r;
    public h2.b f14879s;
    public f f14880t;
    public byte[] f14881u;
    public byte[] v;
    public o f14882w;
    public p f14883x;

    public b(UUID uuid, q qVar, of.b bVar, a4.m mVar, List list, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, com.google.firebase.messaging.m mVar2, Looper looper, qb.b bVar2, j2.k kVar) {
        this.f14872l = uuid;
        this.f14866c = bVar;
        this.d = mVar;
        this.f14865b = qVar;
        this.e = z10;
        this.f14867f = z11;
        if (bArr != null) {
            this.v = bArr;
            this.f14864a = null;
        } else {
            list.getClass();
            this.f14864a = DesugarCollections.unmodifiableList(list);
        }
        this.f14868g = hashMap;
        this.f14871k = mVar2;
        this.h = new e2.i();
        this.f14869i = bVar2;
        this.f14870j = kVar;
        this.f14875o = 2;
        this.f14873m = looper;
        this.f14874n = new androidx.mediarouter.app.c(this, looper, 4);
    }

    @Override
    public final void a(j jVar) {
        p();
        int i10 = this.f14876p;
        if (i10 <= 0) {
            e2.a.e("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f14876p = i11;
        if (i11 == 0) {
            this.f14875o = 0;
            androidx.mediarouter.app.c cVar = this.f14874n;
            String str = d0.f7885a;
            cVar.removeCallbacksAndMessages(null);
            android.support.v4.media.session.f fVar = this.f14878r;
            synchronized (fVar) {
                fVar.removeCallbacksAndMessages(null);
                fVar.f1846b = true;
            }
            this.f14878r = null;
            this.f14877q.quit();
            this.f14877q = null;
            this.f14879s = null;
            this.f14880t = null;
            this.f14882w = null;
            this.f14883x = null;
            byte[] bArr = this.f14881u;
            if (bArr != null) {
                this.f14865b.K(bArr);
                this.f14881u = null;
            }
        }
        if (jVar != null) {
            this.h.n(jVar);
            if (this.h.i(jVar) == 0) {
                jVar.e();
            }
        }
        a4.m mVar = this.d;
        int i12 = this.f14876p;
        e eVar = (e) mVar.f275b;
        if (i12 == 1 && eVar.E > 0 && eVar.v != -9223372036854775807L) {
            eVar.f14896y.add(this);
            Handler handler = eVar.J;
            handler.getClass();
            handler.postAtTime(new g0(this, 13), this, SystemClock.uptimeMillis() + eVar.v);
        } else if (i12 == 0) {
            eVar.f14894w.remove(this);
            if (eVar.G == this) {
                eVar.G = null;
            }
            if (eVar.H == this) {
                eVar.H = null;
            }
            of.b bVar = eVar.f14891n;
            HashSet hashSet = (HashSet) bVar.f15509b;
            hashSet.remove(this);
            if (((b) bVar.f15510c) == this) {
                bVar.f15510c = null;
                if (!hashSet.isEmpty()) {
                    b bVar2 = (b) hashSet.iterator().next();
                    bVar.f15510c = bVar2;
                    p m10 = bVar2.f14865b.m();
                    bVar2.f14883x = m10;
                    android.support.v4.media.session.f fVar2 = bVar2.f14878r;
                    String str2 = d0.f7885a;
                    m10.getClass();
                    fVar2.getClass();
                    fVar2.obtainMessage(1, new a(u2.t.f43480b.getAndIncrement(), true, SystemClock.elapsedRealtime(), m10)).sendToTarget();
                }
            }
            if (eVar.v != -9223372036854775807L) {
                Handler handler2 = eVar.J;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                eVar.f14896y.remove(this);
            }
        }
        eVar.g();
    }

    @Override
    public final void b(j jVar) {
        int i10;
        p();
        boolean z10 = false;
        if (this.f14876p < 0) {
            e2.a.e("DefaultDrmSession", "Session reference count less than zero: " + this.f14876p);
            this.f14876p = 0;
        }
        if (jVar != null) {
            e2.i iVar = this.h;
            synchronized (iVar.f7902a) {
                try {
                    ArrayList arrayList = new ArrayList(iVar.d);
                    arrayList.add(jVar);
                    iVar.d = DesugarCollections.unmodifiableList(arrayList);
                    Integer num = (Integer) iVar.f7903b.get(jVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(iVar.f7904c);
                        hashSet.add(jVar);
                        iVar.f7904c = DesugarCollections.unmodifiableSet(hashSet);
                    }
                    HashMap hashMap = iVar.f7903b;
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
        int i11 = this.f14876p + 1;
        this.f14876p = i11;
        if (i11 == 1) {
            if (this.f14875o == 2) {
                z10 = true;
            }
            e2.d.g(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f14877q = handlerThread;
            handlerThread.start();
            this.f14878r = new android.support.v4.media.session.f(this, this.f14877q.getLooper());
            if (n()) {
                j(true);
            }
        } else if (jVar != null && k() && this.h.i(jVar) == 1) {
            jVar.c(this.f14875o);
        }
        e eVar = (e) this.d.f275b;
        if (eVar.v != -9223372036854775807L) {
            eVar.f14896y.remove(this);
            Handler handler = eVar.J;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override
    public final UUID c() {
        p();
        return this.f14872l;
    }

    @Override
    public final boolean d() {
        p();
        return this.e;
    }

    @Override
    public final int e() {
        p();
        return this.f14875o;
    }

    @Override
    public final boolean f(String str) {
        p();
        byte[] bArr = this.f14881u;
        e2.d.h(bArr);
        return this.f14865b.r0(str, bArr);
    }

    @Override
    public final f g() {
        p();
        if (this.f14875o == 1) {
            return this.f14880t;
        }
        return null;
    }

    @Override
    public final h2.b h() {
        p();
        return this.f14879s;
    }

    public final void i(ai.i iVar) {
        Set<j> set;
        e2.i iVar2 = this.h;
        synchronized (iVar2.f7902a) {
            set = iVar2.f7904c;
        }
        for (j jVar : set) {
            jVar.a();
        }
    }

    public final void j(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.j(boolean):void");
    }

    public final boolean k() {
        int i10 = this.f14875o;
        if (i10 != 3 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void l(int i10, Throwable th2) {
        int i11;
        Set<j> set;
        if (th2 instanceof MediaDrm.MediaDrmStateException) {
            i11 = d0.x(d0.y(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
        } else {
            if (Build.VERSION.SDK_INT < 23 || !e0.b.r(th2)) {
                if (!(th2 instanceof NotProvisionedException) && !a0.b(th2)) {
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
        this.f14880t = new f(i11, th2);
        e2.a.f("DefaultDrmSession", "DRM session error", th2);
        if (th2 instanceof Exception) {
            e2.i iVar = this.h;
            synchronized (iVar.f7902a) {
                set = iVar.f7904c;
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
        if (this.f14875o != 4) {
            this.f14875o = 1;
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
        this.f14866c.R(this);
    }

    public final boolean n() {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.n():boolean");
    }

    public final void o(int i10, boolean z10, byte[] bArr) {
        try {
            o k02 = this.f14865b.k0(bArr, this.f14864a, i10, this.f14868g);
            this.f14882w = k02;
            android.support.v4.media.session.f fVar = this.f14878r;
            String str = d0.f7885a;
            k02.getClass();
            fVar.getClass();
            fVar.obtainMessage(2, new a(u2.t.f43480b.getAndIncrement(), z10, SystemClock.elapsedRealtime(), k02)).sendToTarget();
        } catch (Exception | NoSuchMethodError e) {
            m(e, true);
        }
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f14873m;
        if (currentThread != looper.getThread()) {
            e2.a.o("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
