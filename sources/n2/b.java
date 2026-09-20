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
import n4.y;
import w7.b0;
public final class b implements h {
    public final List f15088a;
    public final r f15089b;
    public final y f15090c;
    public final e d;
    public final boolean e;
    public final boolean f15091f;
    public final HashMap f15092g;
    public final e2.i h;
    public final qb.b f15093i;
    public final j2.k f15094j;
    public final com.google.firebase.messaging.m f15095k;
    public final UUID f15096l;
    public final Looper f15097m;
    public final androidx.mediarouter.app.c f15098n;
    public int f15099o;
    public int f15100p;
    public HandlerThread f15101q;
    public android.support.v4.media.session.f f15102r;
    public h2.b f15103s;
    public g f15104t;
    public byte[] f15105u;
    public byte[] v;
    public p f15106w;
    public q f15107x;

    public b(UUID uuid, r rVar, y yVar, e eVar, List list, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, com.google.firebase.messaging.m mVar, Looper looper, qb.b bVar, j2.k kVar) {
        this.f15096l = uuid;
        this.f15090c = yVar;
        this.d = eVar;
        this.f15089b = rVar;
        this.e = z10;
        this.f15091f = z11;
        if (bArr != null) {
            this.v = bArr;
            this.f15088a = null;
        } else {
            list.getClass();
            this.f15088a = DesugarCollections.unmodifiableList(list);
        }
        this.f15092g = hashMap;
        this.f15095k = mVar;
        this.h = new e2.i();
        this.f15093i = bVar;
        this.f15094j = kVar;
        this.f15099o = 2;
        this.f15097m = looper;
        this.f15098n = new androidx.mediarouter.app.c(this, looper, 4);
    }

    @Override
    public final void a(k kVar) {
        p();
        int i10 = this.f15100p;
        if (i10 <= 0) {
            e2.a.e("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f15100p = i11;
        if (i11 == 0) {
            this.f15099o = 0;
            androidx.mediarouter.app.c cVar = this.f15098n;
            String str = d0.f7888a;
            cVar.removeCallbacksAndMessages(null);
            android.support.v4.media.session.f fVar = this.f15102r;
            synchronized (fVar) {
                fVar.removeCallbacksAndMessages(null);
                fVar.f1849b = true;
            }
            this.f15102r = null;
            this.f15101q.quit();
            this.f15101q = null;
            this.f15103s = null;
            this.f15104t = null;
            this.f15106w = null;
            this.f15107x = null;
            byte[] bArr = this.f15105u;
            if (bArr != null) {
                this.f15089b.K(bArr);
                this.f15105u = null;
            }
        }
        if (kVar != null) {
            this.h.n(kVar);
            if (this.h.i(kVar) == 0) {
                kVar.e();
            }
        }
        e eVar = this.d;
        int i12 = this.f15100p;
        f fVar2 = (f) eVar.f15112b;
        if (i12 == 1 && fVar2.E > 0 && fVar2.v != -9223372036854775807L) {
            fVar2.f15122y.add(this);
            Handler handler = fVar2.J;
            handler.getClass();
            handler.postAtTime(new g0(this, 14), this, SystemClock.uptimeMillis() + fVar2.v);
        } else if (i12 == 0) {
            fVar2.f15120w.remove(this);
            if (fVar2.G == this) {
                fVar2.G = null;
            }
            if (fVar2.H == this) {
                fVar2.H = null;
            }
            y yVar = fVar2.f15117n;
            HashSet hashSet = (HashSet) yVar.f15217a;
            hashSet.remove(this);
            if (((b) yVar.f15218b) == this) {
                yVar.f15218b = null;
                if (!hashSet.isEmpty()) {
                    b bVar = (b) hashSet.iterator().next();
                    yVar.f15218b = bVar;
                    q m10 = bVar.f15089b.m();
                    bVar.f15107x = m10;
                    android.support.v4.media.session.f fVar3 = bVar.f15102r;
                    String str2 = d0.f7888a;
                    m10.getClass();
                    fVar3.getClass();
                    fVar3.obtainMessage(1, new a(u2.t.f43784b.getAndIncrement(), true, SystemClock.elapsedRealtime(), m10)).sendToTarget();
                }
            }
            if (fVar2.v != -9223372036854775807L) {
                Handler handler2 = fVar2.J;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                fVar2.f15122y.remove(this);
            }
        }
        fVar2.g();
    }

    @Override
    public final void b(k kVar) {
        int i10;
        p();
        boolean z10 = false;
        if (this.f15100p < 0) {
            e2.a.e("DefaultDrmSession", "Session reference count less than zero: " + this.f15100p);
            this.f15100p = 0;
        }
        if (kVar != null) {
            e2.i iVar = this.h;
            synchronized (iVar.f7905a) {
                try {
                    ArrayList arrayList = new ArrayList(iVar.d);
                    arrayList.add(kVar);
                    iVar.d = DesugarCollections.unmodifiableList(arrayList);
                    Integer num = (Integer) iVar.f7906b.get(kVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(iVar.f7907c);
                        hashSet.add(kVar);
                        iVar.f7907c = DesugarCollections.unmodifiableSet(hashSet);
                    }
                    HashMap hashMap = iVar.f7906b;
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
        int i11 = this.f15100p + 1;
        this.f15100p = i11;
        if (i11 == 1) {
            if (this.f15099o == 2) {
                z10 = true;
            }
            e2.d.g(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f15101q = handlerThread;
            handlerThread.start();
            this.f15102r = new android.support.v4.media.session.f(this, this.f15101q.getLooper());
            if (n()) {
                j(true);
            }
        } else if (kVar != null && k() && this.h.i(kVar) == 1) {
            kVar.c(this.f15099o);
        }
        f fVar = (f) this.d.f15112b;
        if (fVar.v != -9223372036854775807L) {
            fVar.f15122y.remove(this);
            Handler handler = fVar.J;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override
    public final UUID c() {
        p();
        return this.f15096l;
    }

    @Override
    public final boolean d() {
        p();
        return this.e;
    }

    @Override
    public final int e() {
        p();
        return this.f15099o;
    }

    @Override
    public final boolean f(String str) {
        p();
        byte[] bArr = this.f15105u;
        e2.d.h(bArr);
        return this.f15089b.q0(str, bArr);
    }

    @Override
    public final g g() {
        p();
        if (this.f15099o == 1) {
            return this.f15104t;
        }
        return null;
    }

    @Override
    public final h2.b h() {
        p();
        return this.f15103s;
    }

    public final void i(ai.i iVar) {
        Set<k> set;
        e2.i iVar2 = this.h;
        synchronized (iVar2.f7905a) {
            set = iVar2.f7907c;
        }
        for (k kVar : set) {
            kVar.a();
        }
    }

    public final void j(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.j(boolean):void");
    }

    public final boolean k() {
        int i10 = this.f15099o;
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
        this.f15104t = new g(i11, th2);
        e2.a.f("DefaultDrmSession", "DRM session error", th2);
        if (th2 instanceof Exception) {
            e2.i iVar = this.h;
            synchronized (iVar.f7905a) {
                set = iVar.f7907c;
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
        if (this.f15099o != 4) {
            this.f15099o = 1;
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
        this.f15090c.V(this);
    }

    public final boolean n() {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.n():boolean");
    }

    public final void o(int i10, boolean z10, byte[] bArr) {
        try {
            p k02 = this.f15089b.k0(bArr, this.f15088a, i10, this.f15092g);
            this.f15106w = k02;
            android.support.v4.media.session.f fVar = this.f15102r;
            String str = d0.f7888a;
            k02.getClass();
            fVar.getClass();
            fVar.obtainMessage(2, new a(u2.t.f43784b.getAndIncrement(), z10, SystemClock.elapsedRealtime(), k02)).sendToTarget();
        } catch (Exception | NoSuchMethodError e) {
            m(e, true);
        }
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f15097m;
        if (currentThread != looper.getThread()) {
            e2.a.o("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
