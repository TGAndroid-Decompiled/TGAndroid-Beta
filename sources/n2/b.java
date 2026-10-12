package n2;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
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
import m4.r0;
import n4.y;
public final class b implements g {
    public final List f16225a;
    public final q f16226b;
    public final y f16227c;
    public final l2.g d;
    public final boolean f16228e;
    public final boolean f16229f;
    public final HashMap f16230g;
    public final e2.i h;
    public final t7.t f16231i;
    public final j2.k f16232j;
    public final com.google.firebase.messaging.m f16233k;
    public final UUID f16234l;
    public final Looper f16235m;
    public final androidx.mediarouter.app.c f16236n;
    public int f16237o;
    public int f16238p;
    public HandlerThread f16239q;
    public android.support.v4.media.session.f f16240r;
    public h2.b f16241s;
    public f f16242t;
    public byte[] f16243u;
    public byte[] v;
    public o f16244w;
    public p f16245x;

    public b(UUID uuid, q qVar, y yVar, l2.g gVar, List list, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, com.google.firebase.messaging.m mVar, Looper looper, t7.t tVar, j2.k kVar) {
        this.f16234l = uuid;
        this.f16227c = yVar;
        this.d = gVar;
        this.f16226b = qVar;
        this.f16228e = z10;
        this.f16229f = z11;
        if (bArr != null) {
            this.v = bArr;
            this.f16225a = null;
        } else {
            list.getClass();
            this.f16225a = DesugarCollections.unmodifiableList(list);
        }
        this.f16230g = hashMap;
        this.f16233k = mVar;
        this.h = new e2.i();
        this.f16231i = tVar;
        this.f16232j = kVar;
        this.f16237o = 2;
        this.f16235m = looper;
        this.f16236n = new androidx.mediarouter.app.c(this, looper, 4);
    }

    @Override
    public final void a(j jVar) {
        p();
        int i10 = this.f16238p;
        if (i10 <= 0) {
            e2.a.e("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f16238p = i11;
        if (i11 == 0) {
            this.f16237o = 0;
            androidx.mediarouter.app.c cVar = this.f16236n;
            String str = d0.f8529a;
            cVar.removeCallbacksAndMessages(null);
            android.support.v4.media.session.f fVar = this.f16240r;
            synchronized (fVar) {
                fVar.removeCallbacksAndMessages(null);
                fVar.f2081b = true;
            }
            this.f16240r = null;
            this.f16239q.quit();
            this.f16239q = null;
            this.f16241s = null;
            this.f16242t = null;
            this.f16244w = null;
            this.f16245x = null;
            byte[] bArr = this.f16243u;
            if (bArr != null) {
                this.f16226b.D(bArr);
                this.f16243u = null;
            }
        }
        if (jVar != null) {
            this.h.n(jVar);
            if (this.h.i(jVar) == 0) {
                jVar.e();
            }
        }
        l2.g gVar = this.d;
        int i12 = this.f16238p;
        e eVar = (e) gVar.f15080b;
        if (i12 == 1 && eVar.E > 0 && eVar.v != -9223372036854775807L) {
            eVar.f16259y.add(this);
            Handler handler = eVar.J;
            handler.getClass();
            handler.postAtTime(new h0(this, 13), this, SystemClock.uptimeMillis() + eVar.v);
        } else if (i12 == 0) {
            eVar.f16257w.remove(this);
            if (eVar.G == this) {
                eVar.G = null;
            }
            if (eVar.H == this) {
                eVar.H = null;
            }
            y yVar = eVar.f16254n;
            HashSet hashSet = (HashSet) yVar.f16362b;
            hashSet.remove(this);
            if (((b) yVar.f16363c) == this) {
                yVar.f16363c = null;
                if (!hashSet.isEmpty()) {
                    b bVar = (b) hashSet.iterator().next();
                    yVar.f16363c = bVar;
                    p l4 = bVar.f16226b.l();
                    bVar.f16245x = l4;
                    android.support.v4.media.session.f fVar2 = bVar.f16240r;
                    String str2 = d0.f8529a;
                    l4.getClass();
                    fVar2.getClass();
                    fVar2.obtainMessage(1, new a(u2.t.f48915b.getAndIncrement(), true, SystemClock.elapsedRealtime(), l4)).sendToTarget();
                }
            }
            if (eVar.v != -9223372036854775807L) {
                Handler handler2 = eVar.J;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                eVar.f16259y.remove(this);
            }
        }
        eVar.g();
    }

    @Override
    public final void b(j jVar) {
        int i10;
        p();
        boolean z10 = false;
        if (this.f16238p < 0) {
            e2.a.e("DefaultDrmSession", "Session reference count less than zero: " + this.f16238p);
            this.f16238p = 0;
        }
        if (jVar != null) {
            e2.i iVar = this.h;
            synchronized (iVar.f8547a) {
                try {
                    ArrayList arrayList = new ArrayList(iVar.d);
                    arrayList.add(jVar);
                    iVar.d = DesugarCollections.unmodifiableList(arrayList);
                    Integer num = (Integer) iVar.f8548b.get(jVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(iVar.f8549c);
                        hashSet.add(jVar);
                        iVar.f8549c = DesugarCollections.unmodifiableSet(hashSet);
                    }
                    HashMap hashMap = iVar.f8548b;
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
        int i11 = this.f16238p + 1;
        this.f16238p = i11;
        if (i11 == 1) {
            if (this.f16237o == 2) {
                z10 = true;
            }
            e2.d.g(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f16239q = handlerThread;
            handlerThread.start();
            this.f16240r = new android.support.v4.media.session.f(this, this.f16239q.getLooper());
            if (n()) {
                j(true);
            }
        } else if (jVar != null && k() && this.h.i(jVar) == 1) {
            jVar.c(this.f16237o);
        }
        e eVar = (e) this.d.f15080b;
        if (eVar.v != -9223372036854775807L) {
            eVar.f16259y.remove(this);
            Handler handler = eVar.J;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override
    public final UUID c() {
        p();
        return this.f16234l;
    }

    @Override
    public final boolean d() {
        p();
        return this.f16228e;
    }

    @Override
    public final int e() {
        p();
        return this.f16237o;
    }

    @Override
    public final boolean f(String str) {
        p();
        byte[] bArr = this.f16243u;
        e2.d.h(bArr);
        return this.f16226b.b0(str, bArr);
    }

    @Override
    public final f g() {
        p();
        if (this.f16237o == 1) {
            return this.f16242t;
        }
        return null;
    }

    @Override
    public final h2.b h() {
        p();
        return this.f16241s;
    }

    public final void i(r0 r0Var) {
        Set<j> set;
        e2.i iVar = this.h;
        synchronized (iVar.f8547a) {
            set = iVar.f8549c;
        }
        for (j jVar : set) {
            jVar.a();
        }
    }

    public final void j(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.j(boolean):void");
    }

    public final boolean k() {
        int i10 = this.f16237o;
        if (i10 != 3 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void l(int i10, Throwable th2) {
        int i11;
        Set<j> set;
        if (th2 instanceof MediaDrm.MediaDrmStateException) {
            i11 = d0.w(d0.x(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
        } else {
            if (!(th2 instanceof MediaDrmResetException)) {
                if (!(th2 instanceof NotProvisionedException) && !w7.y.b(th2)) {
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
        this.f16242t = new f(i11, th2);
        e2.a.f("DefaultDrmSession", "DRM session error", th2);
        if (th2 instanceof Exception) {
            e2.i iVar = this.h;
            synchronized (iVar.f8547a) {
                set = iVar.f8549c;
            }
            for (j jVar : set) {
                jVar.d((Exception) th2);
            }
        } else if (th2 instanceof Error) {
            if (!w7.y.c(th2) && !w7.y.b(th2)) {
                throw ((Error) th2);
            }
        } else {
            throw new IllegalStateException("Unexpected Throwable subclass", th2);
        }
        if (this.f16237o != 4) {
            this.f16237o = 1;
        }
    }

    public final void m(Throwable th2, boolean z10) {
        int i10;
        if (!(th2 instanceof NotProvisionedException) && !w7.y.b(th2)) {
            if (z10) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            l(i10, th2);
            return;
        }
        this.f16227c.R(this);
    }

    public final boolean n() {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.n():boolean");
    }

    public final void o(int i10, boolean z10, byte[] bArr) {
        try {
            o X = this.f16226b.X(bArr, this.f16225a, i10, this.f16230g);
            this.f16244w = X;
            android.support.v4.media.session.f fVar = this.f16240r;
            String str = d0.f8529a;
            X.getClass();
            fVar.getClass();
            fVar.obtainMessage(2, new a(u2.t.f48915b.getAndIncrement(), z10, SystemClock.elapsedRealtime(), X)).sendToTarget();
        } catch (Exception | NoSuchMethodError e7) {
            m(e7, true);
        }
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f16235m;
        if (currentThread != looper.getThread()) {
            e2.a.o("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
