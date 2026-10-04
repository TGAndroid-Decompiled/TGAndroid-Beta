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
import w7.c0;
public final class b implements h {
    public final List f16501a;
    public final r f16502b;
    public final of.b f16503c;
    public final l2.g d;
    public final boolean f16504e;
    public final boolean f16505f;
    public final HashMap f16506g;
    public final e2.i h;
    public final qb.b f16507i;
    public final j2.k f16508j;
    public final com.google.firebase.messaging.m f16509k;
    public final UUID f16510l;
    public final Looper f16511m;
    public final androidx.mediarouter.app.c f16512n;
    public int f16513o;
    public int f16514p;
    public HandlerThread f16515q;
    public android.support.v4.media.session.f f16516r;
    public h2.b f16517s;
    public g f16518t;
    public byte[] f16519u;
    public byte[] v;
    public p f16520w;
    public q f16521x;

    public b(UUID uuid, r rVar, of.b bVar, l2.g gVar, List list, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, com.google.firebase.messaging.m mVar, Looper looper, qb.b bVar2, j2.k kVar) {
        this.f16510l = uuid;
        this.f16503c = bVar;
        this.d = gVar;
        this.f16502b = rVar;
        this.f16504e = z10;
        this.f16505f = z11;
        if (bArr != null) {
            this.v = bArr;
            this.f16501a = null;
        } else {
            list.getClass();
            this.f16501a = DesugarCollections.unmodifiableList(list);
        }
        this.f16506g = hashMap;
        this.f16509k = mVar;
        this.h = new e2.i();
        this.f16507i = bVar2;
        this.f16508j = kVar;
        this.f16513o = 2;
        this.f16511m = looper;
        this.f16512n = new androidx.mediarouter.app.c(this, looper, 4);
    }

    @Override
    public final void a(k kVar) {
        p();
        int i10 = this.f16514p;
        if (i10 <= 0) {
            e2.a.e("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f16514p = i11;
        if (i11 == 0) {
            this.f16513o = 0;
            androidx.mediarouter.app.c cVar = this.f16512n;
            String str = d0.f8537a;
            cVar.removeCallbacksAndMessages(null);
            android.support.v4.media.session.f fVar = this.f16516r;
            synchronized (fVar) {
                fVar.removeCallbacksAndMessages(null);
                fVar.f2006b = true;
            }
            this.f16516r = null;
            this.f16515q.quit();
            this.f16515q = null;
            this.f16517s = null;
            this.f16518t = null;
            this.f16520w = null;
            this.f16521x = null;
            byte[] bArr = this.f16519u;
            if (bArr != null) {
                this.f16502b.K(bArr);
                this.f16519u = null;
            }
        }
        if (kVar != null) {
            this.h.n(kVar);
            if (this.h.i(kVar) == 0) {
                kVar.e();
            }
        }
        l2.g gVar = this.d;
        int i12 = this.f16514p;
        f fVar2 = (f) gVar.f15267b;
        if (i12 == 1 && fVar2.E > 0 && fVar2.v != -9223372036854775807L) {
            fVar2.f16537y.add(this);
            Handler handler = fVar2.J;
            handler.getClass();
            handler.postAtTime(new h0(this, 14), this, SystemClock.uptimeMillis() + fVar2.v);
        } else if (i12 == 0) {
            fVar2.f16535w.remove(this);
            if (fVar2.G == this) {
                fVar2.G = null;
            }
            if (fVar2.H == this) {
                fVar2.H = null;
            }
            of.b bVar = fVar2.f16532n;
            HashSet hashSet = (HashSet) bVar.f17158b;
            hashSet.remove(this);
            if (((b) bVar.f17159c) == this) {
                bVar.f17159c = null;
                if (!hashSet.isEmpty()) {
                    b bVar2 = (b) hashSet.iterator().next();
                    bVar.f17159c = bVar2;
                    q m10 = bVar2.f16502b.m();
                    bVar2.f16521x = m10;
                    android.support.v4.media.session.f fVar3 = bVar2.f16516r;
                    String str2 = d0.f8537a;
                    m10.getClass();
                    fVar3.getClass();
                    fVar3.obtainMessage(1, new a(u2.t.f47393b.getAndIncrement(), true, SystemClock.elapsedRealtime(), m10)).sendToTarget();
                }
            }
            if (fVar2.v != -9223372036854775807L) {
                Handler handler2 = fVar2.J;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                fVar2.f16537y.remove(this);
            }
        }
        fVar2.g();
    }

    @Override
    public final void b(k kVar) {
        int i10;
        p();
        boolean z10 = false;
        if (this.f16514p < 0) {
            e2.a.e("DefaultDrmSession", "Session reference count less than zero: " + this.f16514p);
            this.f16514p = 0;
        }
        if (kVar != null) {
            e2.i iVar = this.h;
            synchronized (iVar.f8555a) {
                try {
                    ArrayList arrayList = new ArrayList(iVar.d);
                    arrayList.add(kVar);
                    iVar.d = DesugarCollections.unmodifiableList(arrayList);
                    Integer num = (Integer) iVar.f8556b.get(kVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(iVar.f8557c);
                        hashSet.add(kVar);
                        iVar.f8557c = DesugarCollections.unmodifiableSet(hashSet);
                    }
                    HashMap hashMap = iVar.f8556b;
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
        int i11 = this.f16514p + 1;
        this.f16514p = i11;
        if (i11 == 1) {
            if (this.f16513o == 2) {
                z10 = true;
            }
            e2.d.g(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f16515q = handlerThread;
            handlerThread.start();
            this.f16516r = new android.support.v4.media.session.f(this, this.f16515q.getLooper());
            if (n()) {
                j(true);
            }
        } else if (kVar != null && k() && this.h.i(kVar) == 1) {
            kVar.c(this.f16513o);
        }
        f fVar = (f) this.d.f15267b;
        if (fVar.v != -9223372036854775807L) {
            fVar.f16537y.remove(this);
            Handler handler = fVar.J;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override
    public final UUID c() {
        p();
        return this.f16510l;
    }

    @Override
    public final boolean d() {
        p();
        return this.f16504e;
    }

    @Override
    public final int e() {
        p();
        return this.f16513o;
    }

    @Override
    public final boolean f(String str) {
        p();
        byte[] bArr = this.f16519u;
        e2.d.h(bArr);
        return this.f16502b.r0(str, bArr);
    }

    @Override
    public final g g() {
        p();
        if (this.f16513o == 1) {
            return this.f16518t;
        }
        return null;
    }

    @Override
    public final h2.b h() {
        p();
        return this.f16517s;
    }

    public final void i(o0 o0Var) {
        Set<k> set;
        e2.i iVar = this.h;
        synchronized (iVar.f8555a) {
            set = iVar.f8557c;
        }
        for (k kVar : set) {
            kVar.a();
        }
    }

    public final void j(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.j(boolean):void");
    }

    public final boolean k() {
        int i10 = this.f16513o;
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
                if (!(th2 instanceof NotProvisionedException) && !c0.b(th2)) {
                    if (th2 instanceof DeniedByServerException) {
                        i11 = 6007;
                    } else if (th2 instanceof x) {
                        i11 = 6001;
                    } else if (th2 instanceof d) {
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
        this.f16518t = new g(i11, th2);
        e2.a.f("DefaultDrmSession", "DRM session error", th2);
        if (th2 instanceof Exception) {
            e2.i iVar = this.h;
            synchronized (iVar.f8555a) {
                set = iVar.f8557c;
            }
            for (k kVar : set) {
                kVar.d((Exception) th2);
            }
        } else if (th2 instanceof Error) {
            if (!c0.c(th2) && !c0.b(th2)) {
                throw ((Error) th2);
            }
        } else {
            throw new IllegalStateException("Unexpected Throwable subclass", th2);
        }
        if (this.f16513o != 4) {
            this.f16513o = 1;
        }
    }

    public final void m(Throwable th2, boolean z10) {
        int i10;
        if (!(th2 instanceof NotProvisionedException) && !c0.b(th2)) {
            if (z10) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            l(i10, th2);
            return;
        }
        this.f16503c.L(this);
    }

    public final boolean n() {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.n():boolean");
    }

    public final void o(int i10, boolean z10, byte[] bArr) {
        try {
            p k02 = this.f16502b.k0(bArr, this.f16501a, i10, this.f16506g);
            this.f16520w = k02;
            android.support.v4.media.session.f fVar = this.f16516r;
            String str = d0.f8537a;
            k02.getClass();
            fVar.getClass();
            fVar.obtainMessage(2, new a(u2.t.f47393b.getAndIncrement(), z10, SystemClock.elapsedRealtime(), k02)).sendToTarget();
        } catch (Exception | NoSuchMethodError e7) {
            m(e7, true);
        }
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f16511m;
        if (currentThread != looper.getThread()) {
            e2.a.o("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
