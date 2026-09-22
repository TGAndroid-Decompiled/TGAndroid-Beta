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
public final class b implements g {
    public final List f15103a;
    public final q f15104b;
    public final y f15105c;
    public final android.support.v4.media.c d;
    public final boolean e;
    public final boolean f15106f;
    public final HashMap f15107g;
    public final e2.i h;
    public final qb.b f15108i;
    public final j2.k f15109j;
    public final com.google.firebase.messaging.m f15110k;
    public final UUID f15111l;
    public final Looper f15112m;
    public final androidx.mediarouter.app.c f15113n;
    public int f15114o;
    public int f15115p;
    public HandlerThread f15116q;
    public android.support.v4.media.session.f f15117r;
    public h2.b f15118s;
    public f f15119t;
    public byte[] f15120u;
    public byte[] v;
    public o f15121w;
    public p f15122x;

    public b(UUID uuid, q qVar, y yVar, android.support.v4.media.c cVar, List list, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, com.google.firebase.messaging.m mVar, Looper looper, qb.b bVar, j2.k kVar) {
        this.f15111l = uuid;
        this.f15105c = yVar;
        this.d = cVar;
        this.f15104b = qVar;
        this.e = z10;
        this.f15106f = z11;
        if (bArr != null) {
            this.v = bArr;
            this.f15103a = null;
        } else {
            list.getClass();
            this.f15103a = DesugarCollections.unmodifiableList(list);
        }
        this.f15107g = hashMap;
        this.f15110k = mVar;
        this.h = new e2.i();
        this.f15108i = bVar;
        this.f15109j = kVar;
        this.f15114o = 2;
        this.f15112m = looper;
        this.f15113n = new androidx.mediarouter.app.c(this, looper, 4);
    }

    @Override
    public final void a(j jVar) {
        p();
        int i10 = this.f15115p;
        if (i10 <= 0) {
            e2.a.e("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f15115p = i11;
        if (i11 == 0) {
            this.f15114o = 0;
            androidx.mediarouter.app.c cVar = this.f15113n;
            String str = d0.f7887a;
            cVar.removeCallbacksAndMessages(null);
            android.support.v4.media.session.f fVar = this.f15117r;
            synchronized (fVar) {
                fVar.removeCallbacksAndMessages(null);
                fVar.f1848b = true;
            }
            this.f15117r = null;
            this.f15116q.quit();
            this.f15116q = null;
            this.f15118s = null;
            this.f15119t = null;
            this.f15121w = null;
            this.f15122x = null;
            byte[] bArr = this.f15120u;
            if (bArr != null) {
                this.f15104b.K(bArr);
                this.f15120u = null;
            }
        }
        if (jVar != null) {
            this.h.n(jVar);
            if (this.h.i(jVar) == 0) {
                jVar.e();
            }
        }
        android.support.v4.media.c cVar2 = this.d;
        int i12 = this.f15115p;
        e eVar = (e) cVar2.f1812b;
        if (i12 == 1 && eVar.E > 0 && eVar.v != -9223372036854775807L) {
            eVar.f15135y.add(this);
            Handler handler = eVar.J;
            handler.getClass();
            handler.postAtTime(new g0(this, 14), this, SystemClock.uptimeMillis() + eVar.v);
        } else if (i12 == 0) {
            eVar.f15133w.remove(this);
            if (eVar.G == this) {
                eVar.G = null;
            }
            if (eVar.H == this) {
                eVar.H = null;
            }
            y yVar = eVar.f15130n;
            HashSet hashSet = (HashSet) yVar.f15230a;
            hashSet.remove(this);
            if (((b) yVar.f15231b) == this) {
                yVar.f15231b = null;
                if (!hashSet.isEmpty()) {
                    b bVar = (b) hashSet.iterator().next();
                    yVar.f15231b = bVar;
                    p m10 = bVar.f15104b.m();
                    bVar.f15122x = m10;
                    android.support.v4.media.session.f fVar2 = bVar.f15117r;
                    String str2 = d0.f7887a;
                    m10.getClass();
                    fVar2.getClass();
                    fVar2.obtainMessage(1, new a(u2.t.f43805b.getAndIncrement(), true, SystemClock.elapsedRealtime(), m10)).sendToTarget();
                }
            }
            if (eVar.v != -9223372036854775807L) {
                Handler handler2 = eVar.J;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                eVar.f15135y.remove(this);
            }
        }
        eVar.g();
    }

    @Override
    public final void b(j jVar) {
        int i10;
        p();
        boolean z10 = false;
        if (this.f15115p < 0) {
            e2.a.e("DefaultDrmSession", "Session reference count less than zero: " + this.f15115p);
            this.f15115p = 0;
        }
        if (jVar != null) {
            e2.i iVar = this.h;
            synchronized (iVar.f7904a) {
                try {
                    ArrayList arrayList = new ArrayList(iVar.d);
                    arrayList.add(jVar);
                    iVar.d = DesugarCollections.unmodifiableList(arrayList);
                    Integer num = (Integer) iVar.f7905b.get(jVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(iVar.f7906c);
                        hashSet.add(jVar);
                        iVar.f7906c = DesugarCollections.unmodifiableSet(hashSet);
                    }
                    HashMap hashMap = iVar.f7905b;
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
        int i11 = this.f15115p + 1;
        this.f15115p = i11;
        if (i11 == 1) {
            if (this.f15114o == 2) {
                z10 = true;
            }
            e2.d.g(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f15116q = handlerThread;
            handlerThread.start();
            this.f15117r = new android.support.v4.media.session.f(this, this.f15116q.getLooper());
            if (n()) {
                j(true);
            }
        } else if (jVar != null && k() && this.h.i(jVar) == 1) {
            jVar.c(this.f15114o);
        }
        e eVar = (e) this.d.f1812b;
        if (eVar.v != -9223372036854775807L) {
            eVar.f15135y.remove(this);
            Handler handler = eVar.J;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override
    public final UUID c() {
        p();
        return this.f15111l;
    }

    @Override
    public final boolean d() {
        p();
        return this.e;
    }

    @Override
    public final int e() {
        p();
        return this.f15114o;
    }

    @Override
    public final boolean f(String str) {
        p();
        byte[] bArr = this.f15120u;
        e2.d.h(bArr);
        return this.f15104b.q0(str, bArr);
    }

    @Override
    public final f g() {
        p();
        if (this.f15114o == 1) {
            return this.f15119t;
        }
        return null;
    }

    @Override
    public final h2.b h() {
        p();
        return this.f15118s;
    }

    public final void i(ai.i iVar) {
        Set<j> set;
        e2.i iVar2 = this.h;
        synchronized (iVar2.f7904a) {
            set = iVar2.f7906c;
        }
        for (j jVar : set) {
            jVar.a();
        }
    }

    public final void j(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.j(boolean):void");
    }

    public final boolean k() {
        int i10 = this.f15114o;
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
                if (!(th2 instanceof NotProvisionedException) && !b0.b(th2)) {
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
        this.f15119t = new f(i11, th2);
        e2.a.f("DefaultDrmSession", "DRM session error", th2);
        if (th2 instanceof Exception) {
            e2.i iVar = this.h;
            synchronized (iVar.f7904a) {
                set = iVar.f7906c;
            }
            for (j jVar : set) {
                jVar.d((Exception) th2);
            }
        } else if (th2 instanceof Error) {
            if (!b0.c(th2) && !b0.b(th2)) {
                throw ((Error) th2);
            }
        } else {
            throw new IllegalStateException("Unexpected Throwable subclass", th2);
        }
        if (this.f15114o != 4) {
            this.f15114o = 1;
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
        this.f15105c.W(this);
    }

    public final boolean n() {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.n():boolean");
    }

    public final void o(int i10, boolean z10, byte[] bArr) {
        try {
            o k02 = this.f15104b.k0(bArr, this.f15103a, i10, this.f15107g);
            this.f15121w = k02;
            android.support.v4.media.session.f fVar = this.f15117r;
            String str = d0.f7887a;
            k02.getClass();
            fVar.getClass();
            fVar.obtainMessage(2, new a(u2.t.f43805b.getAndIncrement(), z10, SystemClock.elapsedRealtime(), k02)).sendToTarget();
        } catch (Exception | NoSuchMethodError e) {
            m(e, true);
        }
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f15112m;
        if (currentThread != looper.getThread()) {
            e2.a.o("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
