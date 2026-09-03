package o3;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import n7.qa;
import nh.n5;
public final class b implements j {
    public final List f16207a;
    public final w f16208b;
    public final qa f16209c;
    public final ja.c d;
    public final boolean e;
    public final boolean f16210f;
    public final HashMap f16211g;
    public final h5.e h;
    public final z9.d f16212i;
    public final k3.k f16213j;
    public final cb.m f16214k;
    public final UUID f16215l;
    public final Looper f16216m;
    public final androidx.mediarouter.app.d f16217n;
    public int f16218o;
    public int f16219p;
    public HandlerThread f16220q;
    public android.support.v4.media.session.f f16221r;
    public n3.b f16222s;
    public i f16223t;
    public byte[] f16224u;
    public byte[] v;
    public u f16225w;
    public v f16226x;

    public b(UUID uuid, w wVar, qa qaVar, ja.c cVar, List list, boolean z4, boolean z10, byte[] bArr, HashMap hashMap, cb.m mVar, Looper looper, z9.d dVar, k3.k kVar) {
        this.f16215l = uuid;
        this.f16209c = qaVar;
        this.d = cVar;
        this.f16208b = wVar;
        this.e = z4;
        this.f16210f = z10;
        if (bArr != null) {
            this.v = bArr;
            this.f16207a = null;
        } else {
            list.getClass();
            this.f16207a = DesugarCollections.unmodifiableList(list);
        }
        this.f16211g = hashMap;
        this.f16214k = mVar;
        this.h = new h5.e();
        this.f16212i = dVar;
        this.f16213j = kVar;
        this.f16218o = 2;
        this.f16216m = looper;
        this.f16217n = new androidx.mediarouter.app.d(this, looper, 7);
    }

    @Override
    public final UUID a() {
        o();
        return this.f16215l;
    }

    @Override
    public final boolean b() {
        o();
        return this.e;
    }

    @Override
    public final void c(m mVar) {
        o();
        int i10 = this.f16219p;
        if (i10 <= 0) {
            h5.a.o("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f16219p = i11;
        if (i11 == 0) {
            this.f16218o = 0;
            androidx.mediarouter.app.d dVar = this.f16217n;
            int i12 = h5.d0.f6924a;
            dVar.removeCallbacksAndMessages(null);
            android.support.v4.media.session.f fVar = this.f16221r;
            synchronized (fVar) {
                fVar.removeCallbacksAndMessages(null);
                fVar.f266b = true;
            }
            this.f16221r = null;
            this.f16220q.quit();
            this.f16220q = null;
            this.f16222s = null;
            this.f16223t = null;
            this.f16225w = null;
            this.f16226x = null;
            byte[] bArr = this.f16224u;
            if (bArr != null) {
                this.f16208b.H(bArr);
                this.f16224u = null;
            }
        }
        if (mVar != null) {
            this.h.n(mVar);
            if (this.h.i(mVar) == 0) {
                mVar.e();
            }
        }
        ja.c cVar = this.d;
        int i13 = this.f16219p;
        f fVar2 = (f) cVar.f9336b;
        if (i13 == 1 && fVar2.B > 0 && fVar2.v != -9223372036854775807L) {
            fVar2.f16241y.add(this);
            Handler handler = fVar2.G;
            handler.getClass();
            handler.postAtTime(new n5(this, 15), this, SystemClock.uptimeMillis() + fVar2.v);
        } else if (i13 == 0) {
            fVar2.f16239w.remove(this);
            if (fVar2.D == this) {
                fVar2.D = null;
            }
            if (fVar2.E == this) {
                fVar2.E = null;
            }
            qa qaVar = fVar2.f16236n;
            HashSet hashSet = (HashSet) qaVar.f14687b;
            hashSet.remove(this);
            if (((b) qaVar.f14688c) == this) {
                qaVar.f14688c = null;
                if (!hashSet.isEmpty()) {
                    b bVar = (b) hashSet.iterator().next();
                    qaVar.f14688c = bVar;
                    v d = bVar.f16208b.d();
                    bVar.f16226x = d;
                    android.support.v4.media.session.f fVar3 = bVar.f16221r;
                    int i14 = h5.d0.f6924a;
                    d.getClass();
                    fVar3.getClass();
                    fVar3.obtainMessage(0, new a(o4.j.f16337a.getAndIncrement(), true, SystemClock.elapsedRealtime(), d)).sendToTarget();
                }
            }
            if (fVar2.v != -9223372036854775807L) {
                Handler handler2 = fVar2.G;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                fVar2.f16241y.remove(this);
            }
        }
        fVar2.g();
    }

    @Override
    public final void d(m mVar) {
        int i10;
        o();
        boolean z4 = false;
        if (this.f16219p < 0) {
            h5.a.o("DefaultDrmSession", "Session reference count less than zero: " + this.f16219p);
            this.f16219p = 0;
        }
        if (mVar != null) {
            h5.e eVar = this.h;
            synchronized (eVar.f6935a) {
                try {
                    ArrayList arrayList = new ArrayList(eVar.d);
                    arrayList.add(mVar);
                    eVar.d = DesugarCollections.unmodifiableList(arrayList);
                    Integer num = (Integer) eVar.f6936b.get(mVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(eVar.f6937c);
                        hashSet.add(mVar);
                        eVar.f6937c = DesugarCollections.unmodifiableSet(hashSet);
                    }
                    HashMap hashMap = eVar.f6936b;
                    if (num != null) {
                        i10 = num.intValue() + 1;
                    } else {
                        i10 = 1;
                    }
                    hashMap.put(mVar, Integer.valueOf(i10));
                } finally {
                }
            }
        }
        int i11 = this.f16219p + 1;
        this.f16219p = i11;
        if (i11 == 1) {
            if (this.f16218o == 2) {
                z4 = true;
            }
            h5.a.i(z4);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f16220q = handlerThread;
            handlerThread.start();
            this.f16221r = new android.support.v4.media.session.f(this, this.f16220q.getLooper());
            if (m()) {
                i(true);
            }
        } else if (mVar != null && j() && this.h.i(mVar) == 1) {
            mVar.c(this.f16218o);
        }
        f fVar = (f) this.d.f9336b;
        if (fVar.v != -9223372036854775807L) {
            fVar.f16241y.remove(this);
            Handler handler = fVar.G;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override
    public final int e() {
        o();
        return this.f16218o;
    }

    @Override
    public final boolean f(String str) {
        o();
        byte[] bArr = this.f16224u;
        h5.a.j(bArr);
        return this.f16208b.j0(str, bArr);
    }

    @Override
    public final i g() {
        o();
        if (this.f16218o == 1) {
            return this.f16223t;
        }
        return null;
    }

    @Override
    public final n3.b h() {
        o();
        return this.f16222s;
    }

    public final void i(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: o3.b.i(boolean):void");
    }

    public final boolean j() {
        int i10 = this.f16218o;
        if (i10 != 3 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void k(Exception exc, int i10) {
        int i11;
        Set<m> set;
        int i12 = h5.d0.f6924a;
        if (i12 >= 21 && r.a(exc)) {
            i11 = r.b(exc);
        } else {
            if (i12 < 23 || !s.a(exc)) {
                if (i12 < 18 || !q.b(exc)) {
                    if (i12 >= 18 && q.a(exc)) {
                        i11 = 6007;
                    } else if (exc instanceof d0) {
                        i11 = 6001;
                    } else if (exc instanceof d) {
                        i11 = 6003;
                    } else if (exc instanceof b0) {
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
        this.f16223t = new i(exc, i11);
        h5.a.p("DefaultDrmSession", "DRM session error", exc);
        h5.e eVar = this.h;
        synchronized (eVar.f6935a) {
            set = eVar.f6937c;
        }
        for (m mVar : set) {
            mVar.d(exc);
        }
        if (this.f16218o != 4) {
            this.f16218o = 1;
        }
    }

    public final void l(Exception exc, boolean z4) {
        int i10;
        if (exc instanceof NotProvisionedException) {
            qa qaVar = this.f16209c;
            ((HashSet) qaVar.f14687b).add(this);
            if (((b) qaVar.f14688c) != null) {
                return;
            }
            qaVar.f14688c = this;
            v d = this.f16208b.d();
            this.f16226x = d;
            android.support.v4.media.session.f fVar = this.f16221r;
            int i11 = h5.d0.f6924a;
            d.getClass();
            fVar.getClass();
            fVar.obtainMessage(0, new a(o4.j.f16337a.getAndIncrement(), true, SystemClock.elapsedRealtime(), d)).sendToTarget();
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
        Set<m> set;
        if (j()) {
            return true;
        }
        try {
            byte[] B = this.f16208b.B();
            this.f16224u = B;
            this.f16208b.k(B, this.f16213j);
            this.f16222s = this.f16208b.z(this.f16224u);
            this.f16218o = 3;
            h5.e eVar = this.h;
            synchronized (eVar.f6935a) {
                set = eVar.f6937c;
            }
            for (m mVar : set) {
                mVar.c(3);
            }
            this.f16224u.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            qa qaVar = this.f16209c;
            ((HashSet) qaVar.f14687b).add(this);
            if (((b) qaVar.f14688c) == null) {
                qaVar.f14688c = this;
                v d = this.f16208b.d();
                this.f16226x = d;
                android.support.v4.media.session.f fVar = this.f16221r;
                int i10 = h5.d0.f6924a;
                d.getClass();
                fVar.getClass();
                fVar.obtainMessage(0, new a(o4.j.f16337a.getAndIncrement(), true, SystemClock.elapsedRealtime(), d)).sendToTarget();
            }
            return false;
        } catch (Exception e) {
            k(e, 1);
            return false;
        }
    }

    public final void n(int i10, boolean z4, byte[] bArr) {
        try {
            u b02 = this.f16208b.b0(bArr, this.f16207a, i10, this.f16211g);
            this.f16225w = b02;
            android.support.v4.media.session.f fVar = this.f16221r;
            int i11 = h5.d0.f6924a;
            b02.getClass();
            fVar.getClass();
            fVar.obtainMessage(1, new a(o4.j.f16337a.getAndIncrement(), z4, SystemClock.elapsedRealtime(), b02)).sendToTarget();
        } catch (Exception e) {
            l(e, true);
        }
    }

    public final void o() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f16216m;
        if (currentThread != looper.getThread()) {
            h5.a.L("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
