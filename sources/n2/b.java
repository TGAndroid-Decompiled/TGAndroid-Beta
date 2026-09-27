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
import i2.h0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import m4.o0;
import w7.b0;
public final class b implements g {
    public final List f15129a;
    public final q f15130b;
    public final of.b f15131c;
    public final a4.m d;
    public final boolean e;
    public final boolean f15132f;
    public final HashMap f15133g;
    public final e2.i h;
    public final qb.b f15134i;
    public final j2.k f15135j;
    public final com.google.firebase.messaging.m f15136k;
    public final UUID f15137l;
    public final Looper f15138m;
    public final androidx.mediarouter.app.c f15139n;
    public int f15140o;
    public int f15141p;
    public HandlerThread f15142q;
    public android.support.v4.media.session.f f15143r;
    public h2.b f15144s;
    public f f15145t;
    public byte[] f15146u;
    public byte[] v;
    public o f15147w;
    public p f15148x;

    public b(UUID uuid, q qVar, of.b bVar, a4.m mVar, List list, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, com.google.firebase.messaging.m mVar2, Looper looper, qb.b bVar2, j2.k kVar) {
        this.f15137l = uuid;
        this.f15131c = bVar;
        this.d = mVar;
        this.f15130b = qVar;
        this.e = z10;
        this.f15132f = z11;
        if (bArr != null) {
            this.v = bArr;
            this.f15129a = null;
        } else {
            list.getClass();
            this.f15129a = DesugarCollections.unmodifiableList(list);
        }
        this.f15133g = hashMap;
        this.f15136k = mVar2;
        this.h = new e2.i();
        this.f15134i = bVar2;
        this.f15135j = kVar;
        this.f15140o = 2;
        this.f15138m = looper;
        this.f15139n = new androidx.mediarouter.app.c(this, looper, 4);
    }

    @Override
    public final void a(j jVar) {
        p();
        int i10 = this.f15141p;
        if (i10 <= 0) {
            e2.a.e("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f15141p = i11;
        if (i11 == 0) {
            this.f15140o = 0;
            androidx.mediarouter.app.c cVar = this.f15139n;
            String str = d0.f7872a;
            cVar.removeCallbacksAndMessages(null);
            android.support.v4.media.session.f fVar = this.f15143r;
            synchronized (fVar) {
                fVar.removeCallbacksAndMessages(null);
                fVar.f1843b = true;
            }
            this.f15143r = null;
            this.f15142q.quit();
            this.f15142q = null;
            this.f15144s = null;
            this.f15145t = null;
            this.f15147w = null;
            this.f15148x = null;
            byte[] bArr = this.f15146u;
            if (bArr != null) {
                this.f15130b.K(bArr);
                this.f15146u = null;
            }
        }
        if (jVar != null) {
            this.h.n(jVar);
            if (this.h.i(jVar) == 0) {
                jVar.e();
            }
        }
        a4.m mVar = this.d;
        int i12 = this.f15141p;
        e eVar = (e) mVar.f275b;
        if (i12 == 1 && eVar.E > 0 && eVar.v != -9223372036854775807L) {
            eVar.f15161y.add(this);
            Handler handler = eVar.J;
            handler.getClass();
            handler.postAtTime(new h0(this, 14), this, SystemClock.uptimeMillis() + eVar.v);
        } else if (i12 == 0) {
            eVar.f15159w.remove(this);
            if (eVar.G == this) {
                eVar.G = null;
            }
            if (eVar.H == this) {
                eVar.H = null;
            }
            of.b bVar = eVar.f15156n;
            HashSet hashSet = (HashSet) bVar.f15732b;
            hashSet.remove(this);
            if (((b) bVar.f15733c) == this) {
                bVar.f15733c = null;
                if (!hashSet.isEmpty()) {
                    b bVar2 = (b) hashSet.iterator().next();
                    bVar.f15733c = bVar2;
                    p m10 = bVar2.f15130b.m();
                    bVar2.f15148x = m10;
                    android.support.v4.media.session.f fVar2 = bVar2.f15143r;
                    String str2 = d0.f7872a;
                    m10.getClass();
                    fVar2.getClass();
                    fVar2.obtainMessage(1, new a(u2.t.f43813b.getAndIncrement(), true, SystemClock.elapsedRealtime(), m10)).sendToTarget();
                }
            }
            if (eVar.v != -9223372036854775807L) {
                Handler handler2 = eVar.J;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                eVar.f15161y.remove(this);
            }
        }
        eVar.g();
    }

    @Override
    public final void b(j jVar) {
        int i10;
        p();
        boolean z10 = false;
        if (this.f15141p < 0) {
            e2.a.e("DefaultDrmSession", "Session reference count less than zero: " + this.f15141p);
            this.f15141p = 0;
        }
        if (jVar != null) {
            e2.i iVar = this.h;
            synchronized (iVar.f7889a) {
                try {
                    ArrayList arrayList = new ArrayList(iVar.d);
                    arrayList.add(jVar);
                    iVar.d = DesugarCollections.unmodifiableList(arrayList);
                    Integer num = (Integer) iVar.f7890b.get(jVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(iVar.f7891c);
                        hashSet.add(jVar);
                        iVar.f7891c = DesugarCollections.unmodifiableSet(hashSet);
                    }
                    HashMap hashMap = iVar.f7890b;
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
        int i11 = this.f15141p + 1;
        this.f15141p = i11;
        if (i11 == 1) {
            if (this.f15140o == 2) {
                z10 = true;
            }
            e2.d.g(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f15142q = handlerThread;
            handlerThread.start();
            this.f15143r = new android.support.v4.media.session.f(this, this.f15142q.getLooper());
            if (n()) {
                j(true);
            }
        } else if (jVar != null && k() && this.h.i(jVar) == 1) {
            jVar.c(this.f15140o);
        }
        e eVar = (e) this.d.f275b;
        if (eVar.v != -9223372036854775807L) {
            eVar.f15161y.remove(this);
            Handler handler = eVar.J;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override
    public final UUID c() {
        p();
        return this.f15137l;
    }

    @Override
    public final boolean d() {
        p();
        return this.e;
    }

    @Override
    public final int e() {
        p();
        return this.f15140o;
    }

    @Override
    public final boolean f(String str) {
        p();
        byte[] bArr = this.f15146u;
        e2.d.h(bArr);
        return this.f15130b.r0(str, bArr);
    }

    @Override
    public final f g() {
        p();
        if (this.f15140o == 1) {
            return this.f15145t;
        }
        return null;
    }

    @Override
    public final h2.b h() {
        p();
        return this.f15144s;
    }

    public final void i(o0 o0Var) {
        Set<j> set;
        e2.i iVar = this.h;
        synchronized (iVar.f7889a) {
            set = iVar.f7891c;
        }
        for (j jVar : set) {
            jVar.a();
        }
    }

    public final void j(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.j(boolean):void");
    }

    public final boolean k() {
        int i10 = this.f15140o;
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
                if (!(th2 instanceof NotProvisionedException) && !b0.b(th2)) {
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
        this.f15145t = new f(i11, th2);
        e2.a.f("DefaultDrmSession", "DRM session error", th2);
        if (th2 instanceof Exception) {
            e2.i iVar = this.h;
            synchronized (iVar.f7889a) {
                set = iVar.f7891c;
            }
            for (j jVar : set) {
                jVar.d((Exception) th2);
            }
        } else if (th2 instanceof Error) {
            if (!b0.c(th2) && !b0.b(th2)) {
                throw ((Error) th2);
            }
        } else {
            throw new IllegalStateException("Unexpected Throwable subclass", th2);
        }
        if (this.f15140o != 4) {
            this.f15140o = 1;
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
        this.f15131c.R(this);
    }

    public final boolean n() {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.n():boolean");
    }

    public final void o(int i10, boolean z10, byte[] bArr) {
        try {
            o k02 = this.f15130b.k0(bArr, this.f15129a, i10, this.f15133g);
            this.f15147w = k02;
            android.support.v4.media.session.f fVar = this.f15143r;
            String str = d0.f7872a;
            k02.getClass();
            fVar.getClass();
            fVar.obtainMessage(2, new a(u2.t.f43813b.getAndIncrement(), z10, SystemClock.elapsedRealtime(), k02)).sendToTarget();
        } catch (Exception | NoSuchMethodError e) {
            m(e, true);
        }
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f15138m;
        if (currentThread != looper.getThread()) {
            e2.a.o("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
