package n2;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import e2.l0;
import e9.n0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import v7.t6;
import w7.d0;
public final class b implements g {
    public final List f13420a;
    public final q f13421b;
    public final m5.e f13422c;
    public final l2.f d;
    public final boolean e;
    public final boolean f13423f;
    public final HashMap f13424g;
    public final e2.k h;
    public final hb.a f13425i;
    public final j2.l f13426j;
    public final ac.a f13427k;
    public final UUID f13428l;
    public final Looper f13429m;
    public final android.support.v4.media.session.q f13430n;
    public final Object f13431o;
    public int f13432p;
    public int f13433q;
    public HandlerThread f13434r;
    public android.support.v4.media.session.f f13435s;
    public h2.b f13436t;
    public f f13437u;
    public byte[] v;
    public byte[] f13438w;
    public o f13439x;
    public u f13440y;
    public p f13441z;

    public b(UUID uuid, q qVar, m5.e eVar, l2.f fVar, List list, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, ac.a aVar, Looper looper, hb.a aVar2, j2.l lVar) {
        this.f13428l = uuid;
        this.f13422c = eVar;
        this.d = fVar;
        this.f13421b = qVar;
        this.e = z10;
        this.f13423f = z11;
        if (bArr != null) {
            this.f13438w = bArr;
            this.f13420a = null;
        } else {
            list.getClass();
            this.f13420a = DesugarCollections.unmodifiableList(list);
        }
        this.f13424g = hashMap;
        this.f13427k = aVar;
        this.h = new e2.k();
        this.f13425i = aVar2;
        this.f13426j = lVar;
        this.f13432p = 2;
        this.f13429m = looper;
        this.f13430n = new android.support.v4.media.session.q(this, looper, 6);
        this.f13431o = new Object();
    }

    @Override
    public final void a(j jVar) {
        p();
        int i10 = this.f13433q;
        if (i10 <= 0) {
            e2.a.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f13433q = i11;
        if (i11 == 0) {
            this.f13432p = 0;
            android.support.v4.media.session.q qVar = this.f13430n;
            String str = l0.f6165a;
            qVar.removeCallbacksAndMessages(null);
            this.f13435s.b();
            this.f13435s = null;
            this.f13434r.quit();
            this.f13434r = null;
            this.f13436t = null;
            this.f13437u = null;
            this.f13439x = null;
            synchronized (this.f13431o) {
                this.f13440y = null;
            }
            this.f13441z = null;
            byte[] bArr = this.v;
            if (bArr != null) {
                this.f13421b.B0(bArr);
                this.v = null;
            }
        }
        if (jVar != null) {
            this.h.m(jVar);
            if (this.h.l(jVar) == 0) {
                jVar.e();
            }
        }
        l2.f fVar = this.d;
        int i12 = this.f13433q;
        e eVar = (e) fVar.f11587b;
        if (i12 == 1 && eVar.E > 0 && eVar.f13452w != -9223372036854775807L) {
            eVar.D.add(this);
            Handler handler = eVar.J;
            handler.getClass();
            handler.postAtTime(new lg.s(this, 11), this, SystemClock.uptimeMillis() + eVar.f13452w);
        } else if (i12 == 0) {
            eVar.f13453x.remove(this);
            if (eVar.G == this) {
                eVar.G = null;
            }
            if (eVar.H == this) {
                eVar.H = null;
            }
            m5.e eVar2 = eVar.f13449n;
            HashSet hashSet = (HashSet) eVar2.f13013b;
            hashSet.remove(this);
            if (((b) eVar2.f13014c) == this) {
                eVar2.f13014c = null;
                if (!hashSet.isEmpty()) {
                    b bVar = (b) hashSet.iterator().next();
                    eVar2.f13014c = bVar;
                    p u10 = bVar.f13421b.u();
                    bVar.f13441z = u10;
                    android.support.v4.media.session.f fVar2 = bVar.f13435s;
                    String str2 = l0.f6165a;
                    u10.getClass();
                    fVar2.getClass();
                    fVar2.obtainMessage(1, new a(u2.u.f50014g.getAndIncrement(), true, SystemClock.elapsedRealtime(), u10)).sendToTarget();
                }
            }
            if (eVar.f13452w != -9223372036854775807L) {
                Handler handler2 = eVar.J;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                eVar.D.remove(this);
            }
        }
        eVar.h();
    }

    @Override
    public final void b(j jVar) {
        int i10;
        p();
        boolean z10 = false;
        if (this.f13433q < 0) {
            e2.a.c("DefaultDrmSession", "Session reference count less than zero: " + this.f13433q);
            this.f13433q = 0;
        }
        if (jVar != null) {
            e2.k kVar = this.h;
            synchronized (kVar.f6155a) {
                try {
                    ArrayList arrayList = new ArrayList(kVar.d);
                    arrayList.add(jVar);
                    kVar.d = DesugarCollections.unmodifiableList(arrayList);
                    Integer num = (Integer) kVar.f6156b.get(jVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(kVar.f6157c);
                        hashSet.add(jVar);
                        kVar.f6157c = DesugarCollections.unmodifiableSet(hashSet);
                    }
                    HashMap hashMap = kVar.f6156b;
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
        int i11 = this.f13433q + 1;
        this.f13433q = i11;
        if (i11 == 1) {
            if (this.f13432p == 2) {
                z10 = true;
            }
            t6.p(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f13434r = handlerThread;
            handlerThread.start();
            this.f13435s = new android.support.v4.media.session.f(this, this.f13434r.getLooper());
            if (n()) {
                j(true);
            }
        } else if (jVar != null && k() && this.h.l(jVar) == 1) {
            jVar.c(this.f13432p);
        }
        e eVar = (e) this.d.f11587b;
        if (eVar.f13452w != -9223372036854775807L) {
            eVar.D.remove(this);
            Handler handler = eVar.J;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override
    public final UUID c() {
        p();
        return this.f13428l;
    }

    @Override
    public final boolean d() {
        p();
        return this.e;
    }

    @Override
    public final int e() {
        p();
        return this.f13432p;
    }

    @Override
    public final boolean f(String str) {
        p();
        byte[] bArr = this.v;
        bArr.getClass();
        return this.f13421b.x1(str, bArr);
    }

    @Override
    public final f g() {
        p();
        if (this.f13432p == 1) {
            return this.f13437u;
        }
        return null;
    }

    @Override
    public final h2.b h() {
        p();
        return this.f13436t;
    }

    public final void i(e2.j jVar) {
        Set<j> set;
        e2.k kVar = this.h;
        synchronized (kVar.f6155a) {
            set = kVar.f6157c;
        }
        for (j jVar2 : set) {
            jVar.accept(jVar2);
        }
    }

    public final void j(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.j(boolean):void");
    }

    public final boolean k() {
        int i10 = this.f13432p;
        if (i10 != 3 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void l(int i10, Throwable th2) {
        int i11;
        Set<j> set;
        if (th2 instanceof MediaDrm.MediaDrmStateException) {
            i11 = l0.z(l0.A(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
        } else {
            if (!(th2 instanceof MediaDrmResetException)) {
                if (!(th2 instanceof NotProvisionedException) && !d0.b(th2)) {
                    if (th2 instanceof DeniedByServerException) {
                        i11 = 6007;
                    } else if (th2 instanceof y) {
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
        this.f13437u = new f(i11, th2);
        e2.a.d("DefaultDrmSession", "DRM session error", th2);
        if (th2 instanceof Exception) {
            e2.k kVar = this.h;
            synchronized (kVar.f6155a) {
                set = kVar.f6157c;
            }
            for (j jVar : set) {
                jVar.d((Exception) th2);
            }
        } else if (th2 instanceof Error) {
            if (!d0.c(th2) && !d0.b(th2)) {
                throw ((Error) th2);
            }
        } else {
            throw new IllegalStateException("Unexpected Throwable subclass", th2);
        }
        if (this.f13432p != 4) {
            this.f13432p = 1;
        }
    }

    public final void m(Throwable th2, boolean z10) {
        int i10;
        if (!(th2 instanceof NotProvisionedException) && !d0.b(th2)) {
            if (z10) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            l(i10, th2);
            return;
        }
        this.f13422c.W(this);
    }

    public final boolean n() {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.n():boolean");
    }

    public final void o(int i10, boolean z10, byte[] bArr) {
        try {
            synchronized (this.f13431o) {
                this.f13440y = new u(0);
                List list = this.f13420a;
                if (list != null) {
                    n0.u(list);
                }
            }
            o Y0 = this.f13421b.Y0(bArr, this.f13420a, i10, this.f13424g);
            this.f13439x = Y0;
            android.support.v4.media.session.f fVar = this.f13435s;
            String str = l0.f6165a;
            Y0.getClass();
            fVar.getClass();
            fVar.obtainMessage(2, new a(u2.u.f50014g.getAndIncrement(), z10, SystemClock.elapsedRealtime(), Y0)).sendToTarget();
        } catch (Exception | NoSuchMethodError e) {
            m(e, true);
        }
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f13429m;
        if (currentThread != looper.getThread()) {
            e2.a.m("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
