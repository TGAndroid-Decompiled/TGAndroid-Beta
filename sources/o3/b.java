package o3;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import h5.d0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import n7.qa;
import nh.n5;
public final class b implements i {
    public final List f16224a;
    public final v f16225b;
    public final qa f16226c;
    public final a3.c d;
    public final boolean e;
    public final boolean f16227f;
    public final HashMap f16228g;
    public final h5.e h;
    public final ab.a f16229i;
    public final k3.k f16230j;
    public final cb.m f16231k;
    public final UUID f16232l;
    public final Looper f16233m;
    public final androidx.mediarouter.app.d f16234n;
    public int f16235o;
    public int f16236p;
    public HandlerThread f16237q;
    public android.support.v4.media.session.f f16238r;
    public n3.b f16239s;
    public h f16240t;
    public byte[] f16241u;
    public byte[] v;
    public t f16242w;
    public u f16243x;

    public b(UUID uuid, v vVar, qa qaVar, a3.c cVar, List list, boolean z4, boolean z10, byte[] bArr, HashMap hashMap, cb.m mVar, Looper looper, ab.a aVar, k3.k kVar) {
        this.f16232l = uuid;
        this.f16226c = qaVar;
        this.d = cVar;
        this.f16225b = vVar;
        this.e = z4;
        this.f16227f = z10;
        if (bArr != null) {
            this.v = bArr;
            this.f16224a = null;
        } else {
            list.getClass();
            this.f16224a = DesugarCollections.unmodifiableList(list);
        }
        this.f16228g = hashMap;
        this.f16231k = mVar;
        this.h = new h5.e();
        this.f16229i = aVar;
        this.f16230j = kVar;
        this.f16235o = 2;
        this.f16233m = looper;
        this.f16234n = new androidx.mediarouter.app.d(this, looper, 7);
    }

    @Override
    public final UUID a() {
        o();
        return this.f16232l;
    }

    @Override
    public final boolean b() {
        o();
        return this.e;
    }

    @Override
    public final void c(l lVar) {
        o();
        int i10 = this.f16236p;
        if (i10 <= 0) {
            h5.a.o("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f16236p = i11;
        if (i11 == 0) {
            this.f16235o = 0;
            androidx.mediarouter.app.d dVar = this.f16234n;
            int i12 = d0.f6937a;
            dVar.removeCallbacksAndMessages(null);
            android.support.v4.media.session.f fVar = this.f16238r;
            synchronized (fVar) {
                fVar.removeCallbacksAndMessages(null);
                fVar.f251b = true;
            }
            this.f16238r = null;
            this.f16237q.quit();
            this.f16237q = null;
            this.f16239s = null;
            this.f16240t = null;
            this.f16242w = null;
            this.f16243x = null;
            byte[] bArr = this.f16241u;
            if (bArr != null) {
                this.f16225b.m1(bArr);
                this.f16241u = null;
            }
        }
        if (lVar != null) {
            this.h.n(lVar);
            if (this.h.i(lVar) == 0) {
                lVar.e();
            }
        }
        a3.c cVar = this.d;
        int i13 = this.f16236p;
        e eVar = (e) cVar.f46b;
        if (i13 == 1 && eVar.B > 0 && eVar.v != -9223372036854775807L) {
            eVar.f16256y.add(this);
            Handler handler = eVar.G;
            handler.getClass();
            handler.postAtTime(new n5(this, 15), this, SystemClock.uptimeMillis() + eVar.v);
        } else if (i13 == 0) {
            eVar.f16254w.remove(this);
            if (eVar.D == this) {
                eVar.D = null;
            }
            if (eVar.E == this) {
                eVar.E = null;
            }
            qa qaVar = eVar.f16251n;
            HashSet hashSet = (HashSet) qaVar.f14702b;
            hashSet.remove(this);
            if (((b) qaVar.f14703c) == this) {
                qaVar.f14703c = null;
                if (!hashSet.isEmpty()) {
                    b bVar = (b) hashSet.iterator().next();
                    qaVar.f14703c = bVar;
                    u K = bVar.f16225b.K();
                    bVar.f16243x = K;
                    android.support.v4.media.session.f fVar2 = bVar.f16238r;
                    int i14 = d0.f6937a;
                    K.getClass();
                    fVar2.getClass();
                    fVar2.obtainMessage(0, new a(o4.j.f16355a.getAndIncrement(), true, SystemClock.elapsedRealtime(), K)).sendToTarget();
                }
            }
            if (eVar.v != -9223372036854775807L) {
                Handler handler2 = eVar.G;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                eVar.f16256y.remove(this);
            }
        }
        eVar.j();
    }

    @Override
    public final void d(l lVar) {
        int i10;
        o();
        boolean z4 = false;
        if (this.f16236p < 0) {
            h5.a.o("DefaultDrmSession", "Session reference count less than zero: " + this.f16236p);
            this.f16236p = 0;
        }
        if (lVar != null) {
            h5.e eVar = this.h;
            synchronized (eVar.f6948a) {
                try {
                    ArrayList arrayList = new ArrayList(eVar.d);
                    arrayList.add(lVar);
                    eVar.d = DesugarCollections.unmodifiableList(arrayList);
                    Integer num = (Integer) eVar.f6949b.get(lVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(eVar.f6950c);
                        hashSet.add(lVar);
                        eVar.f6950c = DesugarCollections.unmodifiableSet(hashSet);
                    }
                    HashMap hashMap = eVar.f6949b;
                    if (num != null) {
                        i10 = num.intValue() + 1;
                    } else {
                        i10 = 1;
                    }
                    hashMap.put(lVar, Integer.valueOf(i10));
                } finally {
                }
            }
        }
        int i11 = this.f16236p + 1;
        this.f16236p = i11;
        if (i11 == 1) {
            if (this.f16235o == 2) {
                z4 = true;
            }
            h5.a.i(z4);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f16237q = handlerThread;
            handlerThread.start();
            this.f16238r = new android.support.v4.media.session.f(this, this.f16237q.getLooper());
            if (m()) {
                i(true);
            }
        } else if (lVar != null && j() && this.h.i(lVar) == 1) {
            lVar.c(this.f16235o);
        }
        e eVar2 = (e) this.d.f46b;
        if (eVar2.v != -9223372036854775807L) {
            eVar2.f16256y.remove(this);
            Handler handler = eVar2.G;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override
    public final int e() {
        o();
        return this.f16235o;
    }

    @Override
    public final boolean f(String str) {
        o();
        byte[] bArr = this.f16241u;
        h5.a.j(bArr);
        return this.f16225b.w2(str, bArr);
    }

    @Override
    public final h g() {
        o();
        if (this.f16235o == 1) {
            return this.f16240t;
        }
        return null;
    }

    @Override
    public final n3.b h() {
        o();
        return this.f16239s;
    }

    public final void i(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: o3.b.i(boolean):void");
    }

    public final boolean j() {
        int i10 = this.f16235o;
        if (i10 != 3 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void k(Exception exc, int i10) {
        int i11;
        Set<l> set;
        int i12 = d0.f6937a;
        if (i12 >= 21 && q.a(exc)) {
            i11 = q.b(exc);
        } else {
            if (i12 < 23 || !r.a(exc)) {
                if (i12 < 18 || !p.b(exc)) {
                    if (i12 >= 18 && p.a(exc)) {
                        i11 = 6007;
                    } else if (exc instanceof c0) {
                        i11 = 6001;
                    } else if (exc instanceof c) {
                        i11 = 6003;
                    } else if (exc instanceof a0) {
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
        this.f16240t = new h(exc, i11);
        h5.a.p("DefaultDrmSession", "DRM session error", exc);
        h5.e eVar = this.h;
        synchronized (eVar.f6948a) {
            set = eVar.f6950c;
        }
        for (l lVar : set) {
            lVar.d(exc);
        }
        if (this.f16235o != 4) {
            this.f16235o = 1;
        }
    }

    public final void l(Exception exc, boolean z4) {
        int i10;
        if (exc instanceof NotProvisionedException) {
            qa qaVar = this.f16226c;
            ((HashSet) qaVar.f14702b).add(this);
            if (((b) qaVar.f14703c) != null) {
                return;
            }
            qaVar.f14703c = this;
            u K = this.f16225b.K();
            this.f16243x = K;
            android.support.v4.media.session.f fVar = this.f16238r;
            int i11 = d0.f6937a;
            K.getClass();
            fVar.getClass();
            fVar.obtainMessage(0, new a(o4.j.f16355a.getAndIncrement(), true, SystemClock.elapsedRealtime(), K)).sendToTarget();
            return;
        }
        if (z4) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        k(exc, i10);
    }

    public final boolean m() {
        Set<l> set;
        if (j()) {
            return true;
        }
        try {
            byte[] M0 = this.f16225b.M0();
            this.f16241u = M0;
            this.f16225b.V(M0, this.f16230j);
            this.f16239s = this.f16225b.D0(this.f16241u);
            this.f16235o = 3;
            h5.e eVar = this.h;
            synchronized (eVar.f6948a) {
                set = eVar.f6950c;
            }
            for (l lVar : set) {
                lVar.c(3);
            }
            this.f16241u.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            qa qaVar = this.f16226c;
            ((HashSet) qaVar.f14702b).add(this);
            if (((b) qaVar.f14703c) == null) {
                qaVar.f14703c = this;
                u K = this.f16225b.K();
                this.f16243x = K;
                android.support.v4.media.session.f fVar = this.f16238r;
                int i10 = d0.f6937a;
                K.getClass();
                fVar.getClass();
                fVar.obtainMessage(0, new a(o4.j.f16355a.getAndIncrement(), true, SystemClock.elapsedRealtime(), K)).sendToTarget();
            }
            return false;
        } catch (Exception e) {
            k(e, 1);
            return false;
        }
    }

    public final void n(int i10, boolean z4, byte[] bArr) {
        try {
            t U1 = this.f16225b.U1(bArr, this.f16224a, i10, this.f16228g);
            this.f16242w = U1;
            android.support.v4.media.session.f fVar = this.f16238r;
            int i11 = d0.f6937a;
            U1.getClass();
            fVar.getClass();
            fVar.obtainMessage(1, new a(o4.j.f16355a.getAndIncrement(), z4, SystemClock.elapsedRealtime(), U1)).sendToTarget();
        } catch (Exception e) {
            l(e, true);
        }
    }

    public final void o() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f16233m;
        if (currentThread != looper.getThread()) {
            h5.a.L("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
