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
public final class b implements h {
    public final List f15092a;
    public final r f15093b;
    public final of.b f15094c;
    public final e d;
    public final boolean e;
    public final boolean f15095f;
    public final HashMap f15096g;
    public final e2.i h;
    public final qb.b f15097i;
    public final j2.k f15098j;
    public final com.google.firebase.messaging.m f15099k;
    public final UUID f15100l;
    public final Looper f15101m;
    public final androidx.mediarouter.app.c f15102n;
    public int f15103o;
    public int f15104p;
    public HandlerThread f15105q;
    public android.support.v4.media.session.f f15106r;
    public h2.b f15107s;
    public g f15108t;
    public byte[] f15109u;
    public byte[] v;
    public p f15110w;
    public q f15111x;

    public b(UUID uuid, r rVar, of.b bVar, e eVar, List list, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, com.google.firebase.messaging.m mVar, Looper looper, qb.b bVar2, j2.k kVar) {
        this.f15100l = uuid;
        this.f15094c = bVar;
        this.d = eVar;
        this.f15093b = rVar;
        this.e = z10;
        this.f15095f = z11;
        if (bArr != null) {
            this.v = bArr;
            this.f15092a = null;
        } else {
            list.getClass();
            this.f15092a = DesugarCollections.unmodifiableList(list);
        }
        this.f15096g = hashMap;
        this.f15099k = mVar;
        this.h = new e2.i();
        this.f15097i = bVar2;
        this.f15098j = kVar;
        this.f15103o = 2;
        this.f15101m = looper;
        this.f15102n = new androidx.mediarouter.app.c(this, looper, 4);
    }

    @Override
    public final void a(k kVar) {
        p();
        int i10 = this.f15104p;
        if (i10 <= 0) {
            e2.a.e("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f15104p = i11;
        if (i11 == 0) {
            this.f15103o = 0;
            androidx.mediarouter.app.c cVar = this.f15102n;
            String str = d0.f7870a;
            cVar.removeCallbacksAndMessages(null);
            android.support.v4.media.session.f fVar = this.f15106r;
            synchronized (fVar) {
                fVar.removeCallbacksAndMessages(null);
                fVar.f1841b = true;
            }
            this.f15106r = null;
            this.f15105q.quit();
            this.f15105q = null;
            this.f15107s = null;
            this.f15108t = null;
            this.f15110w = null;
            this.f15111x = null;
            byte[] bArr = this.f15109u;
            if (bArr != null) {
                this.f15093b.K(bArr);
                this.f15109u = null;
            }
        }
        if (kVar != null) {
            this.h.n(kVar);
            if (this.h.i(kVar) == 0) {
                kVar.e();
            }
        }
        e eVar = this.d;
        int i12 = this.f15104p;
        f fVar2 = (f) eVar.f15116b;
        if (i12 == 1 && fVar2.E > 0 && fVar2.v != -9223372036854775807L) {
            fVar2.f15126y.add(this);
            Handler handler = fVar2.J;
            handler.getClass();
            handler.postAtTime(new h0(this, 14), this, SystemClock.uptimeMillis() + fVar2.v);
        } else if (i12 == 0) {
            fVar2.f15124w.remove(this);
            if (fVar2.G == this) {
                fVar2.G = null;
            }
            if (fVar2.H == this) {
                fVar2.H = null;
            }
            of.b bVar = fVar2.f15121n;
            HashSet hashSet = (HashSet) bVar.f15693b;
            hashSet.remove(this);
            if (((b) bVar.f15694c) == this) {
                bVar.f15694c = null;
                if (!hashSet.isEmpty()) {
                    b bVar2 = (b) hashSet.iterator().next();
                    bVar.f15694c = bVar2;
                    q m10 = bVar2.f15093b.m();
                    bVar2.f15111x = m10;
                    android.support.v4.media.session.f fVar3 = bVar2.f15106r;
                    String str2 = d0.f7870a;
                    m10.getClass();
                    fVar3.getClass();
                    fVar3.obtainMessage(1, new a(u2.t.f43769b.getAndIncrement(), true, SystemClock.elapsedRealtime(), m10)).sendToTarget();
                }
            }
            if (fVar2.v != -9223372036854775807L) {
                Handler handler2 = fVar2.J;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                fVar2.f15126y.remove(this);
            }
        }
        fVar2.g();
    }

    @Override
    public final void b(k kVar) {
        int i10;
        p();
        boolean z10 = false;
        if (this.f15104p < 0) {
            e2.a.e("DefaultDrmSession", "Session reference count less than zero: " + this.f15104p);
            this.f15104p = 0;
        }
        if (kVar != null) {
            e2.i iVar = this.h;
            synchronized (iVar.f7887a) {
                try {
                    ArrayList arrayList = new ArrayList(iVar.d);
                    arrayList.add(kVar);
                    iVar.d = DesugarCollections.unmodifiableList(arrayList);
                    Integer num = (Integer) iVar.f7888b.get(kVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(iVar.f7889c);
                        hashSet.add(kVar);
                        iVar.f7889c = DesugarCollections.unmodifiableSet(hashSet);
                    }
                    HashMap hashMap = iVar.f7888b;
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
        int i11 = this.f15104p + 1;
        this.f15104p = i11;
        if (i11 == 1) {
            if (this.f15103o == 2) {
                z10 = true;
            }
            e2.d.g(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f15105q = handlerThread;
            handlerThread.start();
            this.f15106r = new android.support.v4.media.session.f(this, this.f15105q.getLooper());
            if (n()) {
                j(true);
            }
        } else if (kVar != null && k() && this.h.i(kVar) == 1) {
            kVar.c(this.f15103o);
        }
        f fVar = (f) this.d.f15116b;
        if (fVar.v != -9223372036854775807L) {
            fVar.f15126y.remove(this);
            Handler handler = fVar.J;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override
    public final UUID c() {
        p();
        return this.f15100l;
    }

    @Override
    public final boolean d() {
        p();
        return this.e;
    }

    @Override
    public final int e() {
        p();
        return this.f15103o;
    }

    @Override
    public final boolean f(String str) {
        p();
        byte[] bArr = this.f15109u;
        e2.d.h(bArr);
        return this.f15093b.r0(str, bArr);
    }

    @Override
    public final g g() {
        p();
        if (this.f15103o == 1) {
            return this.f15108t;
        }
        return null;
    }

    @Override
    public final h2.b h() {
        p();
        return this.f15107s;
    }

    public final void i(o0 o0Var) {
        Set<k> set;
        e2.i iVar = this.h;
        synchronized (iVar.f7887a) {
            set = iVar.f7889c;
        }
        for (k kVar : set) {
            kVar.a();
        }
    }

    public final void j(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.j(boolean):void");
    }

    public final boolean k() {
        int i10 = this.f15103o;
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
        this.f15108t = new g(i11, th2);
        e2.a.f("DefaultDrmSession", "DRM session error", th2);
        if (th2 instanceof Exception) {
            e2.i iVar = this.h;
            synchronized (iVar.f7887a) {
                set = iVar.f7889c;
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
        if (this.f15103o != 4) {
            this.f15103o = 1;
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
        this.f15094c.R(this);
    }

    public final boolean n() {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.n():boolean");
    }

    public final void o(int i10, boolean z10, byte[] bArr) {
        try {
            p k02 = this.f15093b.k0(bArr, this.f15092a, i10, this.f15096g);
            this.f15110w = k02;
            android.support.v4.media.session.f fVar = this.f15106r;
            String str = d0.f7870a;
            k02.getClass();
            fVar.getClass();
            fVar.obtainMessage(2, new a(u2.t.f43769b.getAndIncrement(), z10, SystemClock.elapsedRealtime(), k02)).sendToTarget();
        } catch (Exception | NoSuchMethodError e) {
            m(e, true);
        }
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f15101m;
        if (currentThread != looper.getThread()) {
            e2.a.o("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
