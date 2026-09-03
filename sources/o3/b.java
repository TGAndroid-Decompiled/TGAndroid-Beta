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
import lh.c3;
import n7.qa;
public final class b implements i {
    public final List f16364a;
    public final v f16365b;
    public final qa f16366c;
    public final o5.i d;
    public final boolean f16367e;
    public final boolean f16368f;
    public final HashMap f16369g;
    public final h5.e h;
    public final ab.a f16370i;
    public final k3.k f16371j;
    public final cb.m f16372k;
    public final UUID f16373l;
    public final Looper f16374m;
    public final androidx.mediarouter.app.d f16375n;
    public int f16376o;
    public int f16377p;
    public HandlerThread f16378q;
    public android.support.v4.media.session.f f16379r;
    public n3.b f16380s;
    public h f16381t;
    public byte[] f16382u;
    public byte[] v;
    public t f16383w;
    public u f16384x;

    public b(UUID uuid, v vVar, qa qaVar, o5.i iVar, List list, boolean z4, boolean z10, byte[] bArr, HashMap hashMap, cb.m mVar, Looper looper, ab.a aVar, k3.k kVar) {
        this.f16373l = uuid;
        this.f16366c = qaVar;
        this.d = iVar;
        this.f16365b = vVar;
        this.f16367e = z4;
        this.f16368f = z10;
        if (bArr != null) {
            this.v = bArr;
            this.f16364a = null;
        } else {
            list.getClass();
            this.f16364a = DesugarCollections.unmodifiableList(list);
        }
        this.f16369g = hashMap;
        this.f16372k = mVar;
        this.h = new h5.e();
        this.f16370i = aVar;
        this.f16371j = kVar;
        this.f16376o = 2;
        this.f16374m = looper;
        this.f16375n = new androidx.mediarouter.app.d(this, looper, 7);
    }

    @Override
    public final UUID a() {
        o();
        return this.f16373l;
    }

    @Override
    public final boolean b() {
        o();
        return this.f16367e;
    }

    @Override
    public final void c(l lVar) {
        o();
        int i10 = this.f16377p;
        if (i10 <= 0) {
            h5.a.o("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f16377p = i11;
        if (i11 == 0) {
            this.f16376o = 0;
            androidx.mediarouter.app.d dVar = this.f16375n;
            int i12 = d0.f7237a;
            dVar.removeCallbacksAndMessages(null);
            android.support.v4.media.session.f fVar = this.f16379r;
            synchronized (fVar) {
                fVar.removeCallbacksAndMessages(null);
                fVar.f284b = true;
            }
            this.f16379r = null;
            this.f16378q.quit();
            this.f16378q = null;
            this.f16380s = null;
            this.f16381t = null;
            this.f16383w = null;
            this.f16384x = null;
            byte[] bArr = this.f16382u;
            if (bArr != null) {
                this.f16365b.q1(bArr);
                this.f16382u = null;
            }
        }
        if (lVar != null) {
            this.h.n(lVar);
            if (this.h.i(lVar) == 0) {
                lVar.e();
            }
        }
        o5.i iVar = this.d;
        int i13 = this.f16377p;
        e eVar = (e) iVar.f16617b;
        if (i13 == 1 && eVar.B > 0 && eVar.v != -9223372036854775807L) {
            eVar.f16398y.add(this);
            Handler handler = eVar.G;
            handler.getClass();
            handler.postAtTime(new c3(this, 23), this, SystemClock.uptimeMillis() + eVar.v);
        } else if (i13 == 0) {
            eVar.f16396w.remove(this);
            if (eVar.D == this) {
                eVar.D = null;
            }
            if (eVar.E == this) {
                eVar.E = null;
            }
            qa qaVar = eVar.f16393n;
            HashSet hashSet = (HashSet) qaVar.f15701b;
            hashSet.remove(this);
            if (((b) qaVar.f15702c) == this) {
                qaVar.f15702c = null;
                if (!hashSet.isEmpty()) {
                    b bVar = (b) hashSet.iterator().next();
                    qaVar.f15702c = bVar;
                    u J = bVar.f16365b.J();
                    bVar.f16384x = J;
                    android.support.v4.media.session.f fVar2 = bVar.f16379r;
                    int i14 = d0.f7237a;
                    J.getClass();
                    fVar2.getClass();
                    fVar2.obtainMessage(0, new a(o4.j.f16504a.getAndIncrement(), true, SystemClock.elapsedRealtime(), J)).sendToTarget();
                }
            }
            if (eVar.v != -9223372036854775807L) {
                Handler handler2 = eVar.G;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                eVar.f16398y.remove(this);
            }
        }
        eVar.j();
    }

    @Override
    public final void d(l lVar) {
        int i10;
        o();
        boolean z4 = false;
        if (this.f16377p < 0) {
            h5.a.o("DefaultDrmSession", "Session reference count less than zero: " + this.f16377p);
            this.f16377p = 0;
        }
        if (lVar != null) {
            h5.e eVar = this.h;
            synchronized (eVar.f7249a) {
                try {
                    ArrayList arrayList = new ArrayList(eVar.d);
                    arrayList.add(lVar);
                    eVar.d = DesugarCollections.unmodifiableList(arrayList);
                    Integer num = (Integer) eVar.f7250b.get(lVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(eVar.f7251c);
                        hashSet.add(lVar);
                        eVar.f7251c = DesugarCollections.unmodifiableSet(hashSet);
                    }
                    HashMap hashMap = eVar.f7250b;
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
        int i11 = this.f16377p + 1;
        this.f16377p = i11;
        if (i11 == 1) {
            if (this.f16376o == 2) {
                z4 = true;
            }
            h5.a.i(z4);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f16378q = handlerThread;
            handlerThread.start();
            this.f16379r = new android.support.v4.media.session.f(this, this.f16378q.getLooper());
            if (m()) {
                i(true);
            }
        } else if (lVar != null && j() && this.h.i(lVar) == 1) {
            lVar.c(this.f16376o);
        }
        e eVar2 = (e) this.d.f16617b;
        if (eVar2.v != -9223372036854775807L) {
            eVar2.f16398y.remove(this);
            Handler handler = eVar2.G;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override
    public final int e() {
        o();
        return this.f16376o;
    }

    @Override
    public final boolean f(String str) {
        o();
        byte[] bArr = this.f16382u;
        h5.a.j(bArr);
        return this.f16365b.C2(str, bArr);
    }

    @Override
    public final h g() {
        o();
        if (this.f16376o == 1) {
            return this.f16381t;
        }
        return null;
    }

    @Override
    public final n3.b h() {
        o();
        return this.f16380s;
    }

    public final void i(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: o3.b.i(boolean):void");
    }

    public final boolean j() {
        int i10 = this.f16376o;
        if (i10 != 3 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void k(Exception exc, int i10) {
        int i11;
        Set<l> set;
        int i12 = d0.f7237a;
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
        this.f16381t = new h(exc, i11);
        h5.a.p("DefaultDrmSession", "DRM session error", exc);
        h5.e eVar = this.h;
        synchronized (eVar.f7249a) {
            set = eVar.f7251c;
        }
        for (l lVar : set) {
            lVar.d(exc);
        }
        if (this.f16376o != 4) {
            this.f16376o = 1;
        }
    }

    public final void l(Exception exc, boolean z4) {
        int i10;
        if (exc instanceof NotProvisionedException) {
            qa qaVar = this.f16366c;
            ((HashSet) qaVar.f15701b).add(this);
            if (((b) qaVar.f15702c) != null) {
                return;
            }
            qaVar.f15702c = this;
            u J = this.f16365b.J();
            this.f16384x = J;
            android.support.v4.media.session.f fVar = this.f16379r;
            int i11 = d0.f7237a;
            J.getClass();
            fVar.getClass();
            fVar.obtainMessage(0, new a(o4.j.f16504a.getAndIncrement(), true, SystemClock.elapsedRealtime(), J)).sendToTarget();
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
            byte[] O0 = this.f16365b.O0();
            this.f16382u = O0;
            this.f16365b.U(O0, this.f16371j);
            this.f16380s = this.f16365b.E0(this.f16382u);
            this.f16376o = 3;
            h5.e eVar = this.h;
            synchronized (eVar.f7249a) {
                set = eVar.f7251c;
            }
            for (l lVar : set) {
                lVar.c(3);
            }
            this.f16382u.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            qa qaVar = this.f16366c;
            ((HashSet) qaVar.f15701b).add(this);
            if (((b) qaVar.f15702c) == null) {
                qaVar.f15702c = this;
                u J = this.f16365b.J();
                this.f16384x = J;
                android.support.v4.media.session.f fVar = this.f16379r;
                int i10 = d0.f7237a;
                J.getClass();
                fVar.getClass();
                fVar.obtainMessage(0, new a(o4.j.f16504a.getAndIncrement(), true, SystemClock.elapsedRealtime(), J)).sendToTarget();
            }
            return false;
        } catch (Exception e6) {
            k(e6, 1);
            return false;
        }
    }

    public final void n(int i10, boolean z4, byte[] bArr) {
        try {
            t Z1 = this.f16365b.Z1(bArr, this.f16364a, i10, this.f16369g);
            this.f16383w = Z1;
            android.support.v4.media.session.f fVar = this.f16379r;
            int i11 = d0.f7237a;
            Z1.getClass();
            fVar.getClass();
            fVar.obtainMessage(1, new a(o4.j.f16504a.getAndIncrement(), z4, SystemClock.elapsedRealtime(), Z1)).sendToTarget();
        } catch (Exception e6) {
            l(e6, true);
        }
    }

    public final void o() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f16374m;
        if (currentThread != looper.getThread()) {
            h5.a.L("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
