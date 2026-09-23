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
import m4.p0;
import w7.a0;
public final class b implements g {
    public final List f14841a;
    public final q f14842b;
    public final of.b f14843c;
    public final a4.m d;
    public final boolean e;
    public final boolean f14844f;
    public final HashMap f14845g;
    public final e2.i h;
    public final qb.b f14846i;
    public final j2.k f14847j;
    public final com.google.firebase.messaging.m f14848k;
    public final UUID f14849l;
    public final Looper f14850m;
    public final androidx.mediarouter.app.c f14851n;
    public int f14852o;
    public int f14853p;
    public HandlerThread f14854q;
    public android.support.v4.media.session.f f14855r;
    public h2.b f14856s;
    public f f14857t;
    public byte[] f14858u;
    public byte[] v;
    public o f14859w;
    public p f14860x;

    public b(UUID uuid, q qVar, of.b bVar, a4.m mVar, List list, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, com.google.firebase.messaging.m mVar2, Looper looper, qb.b bVar2, j2.k kVar) {
        this.f14849l = uuid;
        this.f14843c = bVar;
        this.d = mVar;
        this.f14842b = qVar;
        this.e = z10;
        this.f14844f = z11;
        if (bArr != null) {
            this.v = bArr;
            this.f14841a = null;
        } else {
            list.getClass();
            this.f14841a = DesugarCollections.unmodifiableList(list);
        }
        this.f14845g = hashMap;
        this.f14848k = mVar2;
        this.h = new e2.i();
        this.f14846i = bVar2;
        this.f14847j = kVar;
        this.f14852o = 2;
        this.f14850m = looper;
        this.f14851n = new androidx.mediarouter.app.c(this, looper, 4);
    }

    @Override
    public final void a(j jVar) {
        p();
        int i10 = this.f14853p;
        if (i10 <= 0) {
            e2.a.e("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f14853p = i11;
        if (i11 == 0) {
            this.f14852o = 0;
            androidx.mediarouter.app.c cVar = this.f14851n;
            String str = d0.f7871a;
            cVar.removeCallbacksAndMessages(null);
            android.support.v4.media.session.f fVar = this.f14855r;
            synchronized (fVar) {
                fVar.removeCallbacksAndMessages(null);
                fVar.f1841b = true;
            }
            this.f14855r = null;
            this.f14854q.quit();
            this.f14854q = null;
            this.f14856s = null;
            this.f14857t = null;
            this.f14859w = null;
            this.f14860x = null;
            byte[] bArr = this.f14858u;
            if (bArr != null) {
                this.f14842b.K(bArr);
                this.f14858u = null;
            }
        }
        if (jVar != null) {
            this.h.n(jVar);
            if (this.h.i(jVar) == 0) {
                jVar.e();
            }
        }
        a4.m mVar = this.d;
        int i12 = this.f14853p;
        e eVar = (e) mVar.f275b;
        if (i12 == 1 && eVar.E > 0 && eVar.v != -9223372036854775807L) {
            eVar.f14873y.add(this);
            Handler handler = eVar.J;
            handler.getClass();
            handler.postAtTime(new h0(this, 13), this, SystemClock.uptimeMillis() + eVar.v);
        } else if (i12 == 0) {
            eVar.f14871w.remove(this);
            if (eVar.G == this) {
                eVar.G = null;
            }
            if (eVar.H == this) {
                eVar.H = null;
            }
            of.b bVar = eVar.f14868n;
            HashSet hashSet = (HashSet) bVar.f15486b;
            hashSet.remove(this);
            if (((b) bVar.f15487c) == this) {
                bVar.f15487c = null;
                if (!hashSet.isEmpty()) {
                    b bVar2 = (b) hashSet.iterator().next();
                    bVar.f15487c = bVar2;
                    p m10 = bVar2.f14842b.m();
                    bVar2.f14860x = m10;
                    android.support.v4.media.session.f fVar2 = bVar2.f14855r;
                    String str2 = d0.f7871a;
                    m10.getClass();
                    fVar2.getClass();
                    fVar2.obtainMessage(1, new a(u2.t.f43412b.getAndIncrement(), true, SystemClock.elapsedRealtime(), m10)).sendToTarget();
                }
            }
            if (eVar.v != -9223372036854775807L) {
                Handler handler2 = eVar.J;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                eVar.f14873y.remove(this);
            }
        }
        eVar.g();
    }

    @Override
    public final void b(j jVar) {
        int i10;
        p();
        boolean z10 = false;
        if (this.f14853p < 0) {
            e2.a.e("DefaultDrmSession", "Session reference count less than zero: " + this.f14853p);
            this.f14853p = 0;
        }
        if (jVar != null) {
            e2.i iVar = this.h;
            synchronized (iVar.f7888a) {
                try {
                    ArrayList arrayList = new ArrayList(iVar.d);
                    arrayList.add(jVar);
                    iVar.d = DesugarCollections.unmodifiableList(arrayList);
                    Integer num = (Integer) iVar.f7889b.get(jVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(iVar.f7890c);
                        hashSet.add(jVar);
                        iVar.f7890c = DesugarCollections.unmodifiableSet(hashSet);
                    }
                    HashMap hashMap = iVar.f7889b;
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
        int i11 = this.f14853p + 1;
        this.f14853p = i11;
        if (i11 == 1) {
            if (this.f14852o == 2) {
                z10 = true;
            }
            e2.d.g(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f14854q = handlerThread;
            handlerThread.start();
            this.f14855r = new android.support.v4.media.session.f(this, this.f14854q.getLooper());
            if (n()) {
                j(true);
            }
        } else if (jVar != null && k() && this.h.i(jVar) == 1) {
            jVar.c(this.f14852o);
        }
        e eVar = (e) this.d.f275b;
        if (eVar.v != -9223372036854775807L) {
            eVar.f14873y.remove(this);
            Handler handler = eVar.J;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override
    public final UUID c() {
        p();
        return this.f14849l;
    }

    @Override
    public final boolean d() {
        p();
        return this.e;
    }

    @Override
    public final int e() {
        p();
        return this.f14852o;
    }

    @Override
    public final boolean f(String str) {
        p();
        byte[] bArr = this.f14858u;
        e2.d.h(bArr);
        return this.f14842b.r0(str, bArr);
    }

    @Override
    public final f g() {
        p();
        if (this.f14852o == 1) {
            return this.f14857t;
        }
        return null;
    }

    @Override
    public final h2.b h() {
        p();
        return this.f14856s;
    }

    public final void i(p0 p0Var) {
        Set<j> set;
        e2.i iVar = this.h;
        synchronized (iVar.f7888a) {
            set = iVar.f7890c;
        }
        for (j jVar : set) {
            jVar.a();
        }
    }

    public final void j(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.j(boolean):void");
    }

    public final boolean k() {
        int i10 = this.f14852o;
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
        this.f14857t = new f(i11, th2);
        e2.a.f("DefaultDrmSession", "DRM session error", th2);
        if (th2 instanceof Exception) {
            e2.i iVar = this.h;
            synchronized (iVar.f7888a) {
                set = iVar.f7890c;
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
        if (this.f14852o != 4) {
            this.f14852o = 1;
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
        this.f14843c.R(this);
    }

    public final boolean n() {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.n():boolean");
    }

    public final void o(int i10, boolean z10, byte[] bArr) {
        try {
            o k02 = this.f14842b.k0(bArr, this.f14841a, i10, this.f14845g);
            this.f14859w = k02;
            android.support.v4.media.session.f fVar = this.f14855r;
            String str = d0.f7871a;
            k02.getClass();
            fVar.getClass();
            fVar.obtainMessage(2, new a(u2.t.f43412b.getAndIncrement(), z10, SystemClock.elapsedRealtime(), k02)).sendToTarget();
        } catch (Exception | NoSuchMethodError e) {
            m(e, true);
        }
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f14850m;
        if (currentThread != looper.getThread()) {
            e2.a.o("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
