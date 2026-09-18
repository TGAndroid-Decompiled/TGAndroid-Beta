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
import w7.b0;
public final class b implements h {
    public final List f15049a;
    public final r f15050b;
    public final of.b f15051c;
    public final e d;
    public final boolean e;
    public final boolean f15052f;
    public final HashMap f15053g;
    public final e2.i h;
    public final qb.b f15054i;
    public final j2.k f15055j;
    public final com.google.firebase.messaging.m f15056k;
    public final UUID f15057l;
    public final Looper f15058m;
    public final androidx.mediarouter.app.c f15059n;
    public int f15060o;
    public int f15061p;
    public HandlerThread f15062q;
    public android.support.v4.media.session.f f15063r;
    public h2.b f15064s;
    public g f15065t;
    public byte[] f15066u;
    public byte[] v;
    public p f15067w;
    public q f15068x;

    public b(UUID uuid, r rVar, of.b bVar, e eVar, List list, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, com.google.firebase.messaging.m mVar, Looper looper, qb.b bVar2, j2.k kVar) {
        this.f15057l = uuid;
        this.f15051c = bVar;
        this.d = eVar;
        this.f15050b = rVar;
        this.e = z10;
        this.f15052f = z11;
        if (bArr != null) {
            this.v = bArr;
            this.f15049a = null;
        } else {
            list.getClass();
            this.f15049a = DesugarCollections.unmodifiableList(list);
        }
        this.f15053g = hashMap;
        this.f15056k = mVar;
        this.h = new e2.i();
        this.f15054i = bVar2;
        this.f15055j = kVar;
        this.f15060o = 2;
        this.f15058m = looper;
        this.f15059n = new androidx.mediarouter.app.c(this, looper, 4);
    }

    @Override
    public final void a(k kVar) {
        p();
        int i10 = this.f15061p;
        if (i10 <= 0) {
            e2.a.e("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f15061p = i11;
        if (i11 == 0) {
            this.f15060o = 0;
            androidx.mediarouter.app.c cVar = this.f15059n;
            String str = d0.f7887a;
            cVar.removeCallbacksAndMessages(null);
            android.support.v4.media.session.f fVar = this.f15063r;
            synchronized (fVar) {
                fVar.removeCallbacksAndMessages(null);
                fVar.f1849b = true;
            }
            this.f15063r = null;
            this.f15062q.quit();
            this.f15062q = null;
            this.f15064s = null;
            this.f15065t = null;
            this.f15067w = null;
            this.f15068x = null;
            byte[] bArr = this.f15066u;
            if (bArr != null) {
                this.f15050b.K(bArr);
                this.f15066u = null;
            }
        }
        if (kVar != null) {
            this.h.n(kVar);
            if (this.h.i(kVar) == 0) {
                kVar.e();
            }
        }
        e eVar = this.d;
        int i12 = this.f15061p;
        f fVar2 = (f) eVar.f15073b;
        if (i12 == 1 && fVar2.E > 0 && fVar2.v != -9223372036854775807L) {
            fVar2.f15083y.add(this);
            Handler handler = fVar2.J;
            handler.getClass();
            handler.postAtTime(new g0(this, 13), this, SystemClock.uptimeMillis() + fVar2.v);
        } else if (i12 == 0) {
            fVar2.f15081w.remove(this);
            if (fVar2.G == this) {
                fVar2.G = null;
            }
            if (fVar2.H == this) {
                fVar2.H = null;
            }
            of.b bVar = fVar2.f15078n;
            HashSet hashSet = (HashSet) bVar.f15650b;
            hashSet.remove(this);
            if (((b) bVar.f15651c) == this) {
                bVar.f15651c = null;
                if (!hashSet.isEmpty()) {
                    b bVar2 = (b) hashSet.iterator().next();
                    bVar.f15651c = bVar2;
                    q m10 = bVar2.f15050b.m();
                    bVar2.f15068x = m10;
                    android.support.v4.media.session.f fVar3 = bVar2.f15063r;
                    String str2 = d0.f7887a;
                    m10.getClass();
                    fVar3.getClass();
                    fVar3.obtainMessage(1, new a(u2.t.f43739b.getAndIncrement(), true, SystemClock.elapsedRealtime(), m10)).sendToTarget();
                }
            }
            if (fVar2.v != -9223372036854775807L) {
                Handler handler2 = fVar2.J;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                fVar2.f15083y.remove(this);
            }
        }
        fVar2.g();
    }

    @Override
    public final void b(k kVar) {
        int i10;
        p();
        boolean z10 = false;
        if (this.f15061p < 0) {
            e2.a.e("DefaultDrmSession", "Session reference count less than zero: " + this.f15061p);
            this.f15061p = 0;
        }
        if (kVar != null) {
            e2.i iVar = this.h;
            synchronized (iVar.f7904a) {
                try {
                    ArrayList arrayList = new ArrayList(iVar.d);
                    arrayList.add(kVar);
                    iVar.d = DesugarCollections.unmodifiableList(arrayList);
                    Integer num = (Integer) iVar.f7905b.get(kVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(iVar.f7906c);
                        hashSet.add(kVar);
                        iVar.f7906c = DesugarCollections.unmodifiableSet(hashSet);
                    }
                    HashMap hashMap = iVar.f7905b;
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
        int i11 = this.f15061p + 1;
        this.f15061p = i11;
        if (i11 == 1) {
            if (this.f15060o == 2) {
                z10 = true;
            }
            e2.d.g(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f15062q = handlerThread;
            handlerThread.start();
            this.f15063r = new android.support.v4.media.session.f(this, this.f15062q.getLooper());
            if (n()) {
                j(true);
            }
        } else if (kVar != null && k() && this.h.i(kVar) == 1) {
            kVar.c(this.f15060o);
        }
        f fVar = (f) this.d.f15073b;
        if (fVar.v != -9223372036854775807L) {
            fVar.f15083y.remove(this);
            Handler handler = fVar.J;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override
    public final UUID c() {
        p();
        return this.f15057l;
    }

    @Override
    public final boolean d() {
        p();
        return this.e;
    }

    @Override
    public final int e() {
        p();
        return this.f15060o;
    }

    @Override
    public final boolean f(String str) {
        p();
        byte[] bArr = this.f15066u;
        e2.d.h(bArr);
        return this.f15050b.r0(str, bArr);
    }

    @Override
    public final g g() {
        p();
        if (this.f15060o == 1) {
            return this.f15065t;
        }
        return null;
    }

    @Override
    public final h2.b h() {
        p();
        return this.f15064s;
    }

    public final void i(ai.i iVar) {
        Set<k> set;
        e2.i iVar2 = this.h;
        synchronized (iVar2.f7904a) {
            set = iVar2.f7906c;
        }
        for (k kVar : set) {
            kVar.a();
        }
    }

    public final void j(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.j(boolean):void");
    }

    public final boolean k() {
        int i10 = this.f15060o;
        if (i10 != 3 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void l(int i10, Throwable th2) {
        int i11;
        Set<k> set;
        if (th2 instanceof MediaDrm.MediaDrmStateException) {
            i11 = d0.x(d0.y(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
        } else {
            if (Build.VERSION.SDK_INT < 23 || !e0.b.r(th2)) {
                if (!(th2 instanceof NotProvisionedException) && !b0.b(th2)) {
                    if (th2 instanceof DeniedByServerException) {
                        i11 = 6007;
                    } else if (th2 instanceof x) {
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
        this.f15065t = new g(i11, th2);
        e2.a.f("DefaultDrmSession", "DRM session error", th2);
        if (th2 instanceof Exception) {
            e2.i iVar = this.h;
            synchronized (iVar.f7904a) {
                set = iVar.f7906c;
            }
            for (k kVar : set) {
                kVar.d((Exception) th2);
            }
        } else if (th2 instanceof Error) {
            if (!b0.c(th2) && !b0.b(th2)) {
                throw ((Error) th2);
            }
        } else {
            throw new IllegalStateException("Unexpected Throwable subclass", th2);
        }
        if (this.f15060o != 4) {
            this.f15060o = 1;
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
        this.f15051c.R(this);
    }

    public final boolean n() {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.n():boolean");
    }

    public final void o(int i10, boolean z10, byte[] bArr) {
        try {
            p k02 = this.f15050b.k0(bArr, this.f15049a, i10, this.f15053g);
            this.f15067w = k02;
            android.support.v4.media.session.f fVar = this.f15063r;
            String str = d0.f7887a;
            k02.getClass();
            fVar.getClass();
            fVar.obtainMessage(2, new a(u2.t.f43739b.getAndIncrement(), z10, SystemClock.elapsedRealtime(), k02)).sendToTarget();
        } catch (Exception | NoSuchMethodError e) {
            m(e, true);
        }
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f15058m;
        if (currentThread != looper.getThread()) {
            e2.a.o("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
