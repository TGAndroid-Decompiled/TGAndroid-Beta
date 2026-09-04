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
import ig.t0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import w7.z;
public final class b implements g {
    public final List f16359a;
    public final q f16360b;
    public final pf.b f16361c;
    public final l.d d;
    public final boolean f16362e;
    public final boolean f16363f;
    public final HashMap f16364g;
    public final e2.i h;
    public final rb.a f16365i;
    public final j2.k f16366j;
    public final com.google.firebase.messaging.m f16367k;
    public final UUID f16368l;
    public final Looper f16369m;
    public final androidx.mediarouter.app.c f16370n;
    public int f16371o;
    public int f16372p;
    public HandlerThread f16373q;
    public android.support.v4.media.session.f f16374r;
    public h2.a f16375s;
    public f f16376t;
    public byte[] f16377u;
    public byte[] v;
    public o f16378w;
    public p f16379x;

    public b(UUID uuid, q qVar, pf.b bVar, l.d dVar, List list, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, com.google.firebase.messaging.m mVar, Looper looper, rb.a aVar, j2.k kVar) {
        this.f16368l = uuid;
        this.f16361c = bVar;
        this.d = dVar;
        this.f16360b = qVar;
        this.f16362e = z10;
        this.f16363f = z11;
        if (bArr != null) {
            this.v = bArr;
            this.f16359a = null;
        } else {
            list.getClass();
            this.f16359a = DesugarCollections.unmodifiableList(list);
        }
        this.f16364g = hashMap;
        this.f16367k = mVar;
        this.h = new e2.i();
        this.f16365i = aVar;
        this.f16366j = kVar;
        this.f16371o = 2;
        this.f16369m = looper;
        this.f16370n = new androidx.mediarouter.app.c(this, looper, 4);
    }

    @Override
    public final void a(j jVar) {
        p();
        int i10 = this.f16372p;
        if (i10 <= 0) {
            e2.a.e("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f16372p = i11;
        if (i11 == 0) {
            this.f16371o = 0;
            androidx.mediarouter.app.c cVar = this.f16370n;
            String str = d0.f8737a;
            cVar.removeCallbacksAndMessages(null);
            android.support.v4.media.session.f fVar = this.f16374r;
            synchronized (fVar) {
                fVar.removeCallbacksAndMessages(null);
                fVar.f812b = true;
            }
            this.f16374r = null;
            this.f16373q.quit();
            this.f16373q = null;
            this.f16375s = null;
            this.f16376t = null;
            this.f16378w = null;
            this.f16379x = null;
            byte[] bArr = this.f16377u;
            if (bArr != null) {
                this.f16360b.b0(bArr);
                this.f16377u = null;
            }
        }
        if (jVar != null) {
            this.h.n(jVar);
            if (this.h.i(jVar) == 0) {
                jVar.e();
            }
        }
        l.d dVar = this.d;
        int i12 = this.f16372p;
        e eVar = (e) dVar.f15072b;
        if (i12 == 1 && eVar.E > 0 && eVar.v != -9223372036854775807L) {
            eVar.f16393y.add(this);
            Handler handler = eVar.J;
            handler.getClass();
            handler.postAtTime(new t0(this, 16), this, SystemClock.uptimeMillis() + eVar.v);
        } else if (i12 == 0) {
            eVar.f16391w.remove(this);
            if (eVar.G == this) {
                eVar.G = null;
            }
            if (eVar.H == this) {
                eVar.H = null;
            }
            pf.b bVar = eVar.f16388n;
            HashSet hashSet = (HashSet) bVar.f44046b;
            hashSet.remove(this);
            if (((b) bVar.f44047c) == this) {
                bVar.f44047c = null;
                if (!hashSet.isEmpty()) {
                    b bVar2 = (b) hashSet.iterator().next();
                    bVar.f44047c = bVar2;
                    p k10 = bVar2.f16360b.k();
                    bVar2.f16379x = k10;
                    android.support.v4.media.session.f fVar2 = bVar2.f16374r;
                    String str2 = d0.f8737a;
                    k10.getClass();
                    fVar2.getClass();
                    fVar2.obtainMessage(1, new a(u2.t.f46804b.getAndIncrement(), true, SystemClock.elapsedRealtime(), k10)).sendToTarget();
                }
            }
            if (eVar.v != -9223372036854775807L) {
                Handler handler2 = eVar.J;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                eVar.f16393y.remove(this);
            }
        }
        eVar.g();
    }

    @Override
    public final void b(j jVar) {
        int i10;
        p();
        boolean z10 = false;
        if (this.f16372p < 0) {
            e2.a.e("DefaultDrmSession", "Session reference count less than zero: " + this.f16372p);
            this.f16372p = 0;
        }
        if (jVar != null) {
            e2.i iVar = this.h;
            synchronized (iVar.f8755a) {
                try {
                    ArrayList arrayList = new ArrayList(iVar.d);
                    arrayList.add(jVar);
                    iVar.d = DesugarCollections.unmodifiableList(arrayList);
                    Integer num = (Integer) iVar.f8756b.get(jVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(iVar.f8757c);
                        hashSet.add(jVar);
                        iVar.f8757c = DesugarCollections.unmodifiableSet(hashSet);
                    }
                    HashMap hashMap = iVar.f8756b;
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
        int i11 = this.f16372p + 1;
        this.f16372p = i11;
        if (i11 == 1) {
            if (this.f16371o == 2) {
                z10 = true;
            }
            e2.d.g(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f16373q = handlerThread;
            handlerThread.start();
            this.f16374r = new android.support.v4.media.session.f(this, this.f16373q.getLooper());
            if (n()) {
                j(true);
            }
        } else if (jVar != null && k() && this.h.i(jVar) == 1) {
            jVar.c(this.f16371o);
        }
        e eVar = (e) this.d.f15072b;
        if (eVar.v != -9223372036854775807L) {
            eVar.f16393y.remove(this);
            Handler handler = eVar.J;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override
    public final UUID c() {
        p();
        return this.f16368l;
    }

    @Override
    public final boolean d() {
        p();
        return this.f16362e;
    }

    @Override
    public final int e() {
        p();
        return this.f16371o;
    }

    @Override
    public final boolean f(String str) {
        p();
        byte[] bArr = this.f16377u;
        e2.d.h(bArr);
        return this.f16360b.M0(str, bArr);
    }

    @Override
    public final f g() {
        p();
        if (this.f16371o == 1) {
            return this.f16376t;
        }
        return null;
    }

    @Override
    public final h2.a h() {
        p();
        return this.f16375s;
    }

    public final void i(bi.f fVar) {
        Set<j> set;
        e2.i iVar = this.h;
        synchronized (iVar.f8755a) {
            set = iVar.f8757c;
        }
        for (j jVar : set) {
            jVar.a();
        }
    }

    public final void j(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.j(boolean):void");
    }

    public final boolean k() {
        int i10 = this.f16371o;
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
        this.f16376t = new f(i11, th2);
        e2.a.f("DefaultDrmSession", "DRM session error", th2);
        if (th2 instanceof Exception) {
            e2.i iVar = this.h;
            synchronized (iVar.f8755a) {
                set = iVar.f8757c;
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
        if (this.f16371o != 4) {
            this.f16371o = 1;
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
        this.f16361c.d0(this);
    }

    public final boolean n() {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.n():boolean");
    }

    public final void o(int i10, boolean z10, byte[] bArr) {
        try {
            o B0 = this.f16360b.B0(bArr, this.f16359a, i10, this.f16364g);
            this.f16378w = B0;
            android.support.v4.media.session.f fVar = this.f16374r;
            String str = d0.f8737a;
            B0.getClass();
            fVar.getClass();
            fVar.obtainMessage(2, new a(u2.t.f46804b.getAndIncrement(), z10, SystemClock.elapsedRealtime(), B0)).sendToTarget();
        } catch (Exception | NoSuchMethodError e7) {
            m(e7, true);
        }
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f16369m;
        if (currentThread != looper.getThread()) {
            e2.a.o("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
