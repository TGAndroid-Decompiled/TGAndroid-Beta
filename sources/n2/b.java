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
    public final List f16226a;
    public final q f16227b;
    public final y f16228c;
    public final l2.g d;
    public final boolean f16229e;
    public final boolean f16230f;
    public final HashMap f16231g;
    public final e2.i h;
    public final t7.t f16232i;
    public final j2.k f16233j;
    public final com.google.firebase.messaging.m f16234k;
    public final UUID f16235l;
    public final Looper f16236m;
    public final androidx.mediarouter.app.c f16237n;
    public int f16238o;
    public int f16239p;
    public HandlerThread f16240q;
    public android.support.v4.media.session.f f16241r;
    public h2.b f16242s;
    public f f16243t;
    public byte[] f16244u;
    public byte[] v;
    public o f16245w;
    public p f16246x;

    public b(UUID uuid, q qVar, y yVar, l2.g gVar, List list, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, com.google.firebase.messaging.m mVar, Looper looper, t7.t tVar, j2.k kVar) {
        this.f16235l = uuid;
        this.f16228c = yVar;
        this.d = gVar;
        this.f16227b = qVar;
        this.f16229e = z10;
        this.f16230f = z11;
        if (bArr != null) {
            this.v = bArr;
            this.f16226a = null;
        } else {
            list.getClass();
            this.f16226a = DesugarCollections.unmodifiableList(list);
        }
        this.f16231g = hashMap;
        this.f16234k = mVar;
        this.h = new e2.i();
        this.f16232i = tVar;
        this.f16233j = kVar;
        this.f16238o = 2;
        this.f16236m = looper;
        this.f16237n = new androidx.mediarouter.app.c(this, looper, 4);
    }

    @Override
    public final void a(j jVar) {
        p();
        int i10 = this.f16239p;
        if (i10 <= 0) {
            e2.a.e("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f16239p = i11;
        if (i11 == 0) {
            this.f16238o = 0;
            androidx.mediarouter.app.c cVar = this.f16237n;
            String str = d0.f8529a;
            cVar.removeCallbacksAndMessages(null);
            android.support.v4.media.session.f fVar = this.f16241r;
            synchronized (fVar) {
                fVar.removeCallbacksAndMessages(null);
                fVar.f2081b = true;
            }
            this.f16241r = null;
            this.f16240q.quit();
            this.f16240q = null;
            this.f16242s = null;
            this.f16243t = null;
            this.f16245w = null;
            this.f16246x = null;
            byte[] bArr = this.f16244u;
            if (bArr != null) {
                this.f16227b.D(bArr);
                this.f16244u = null;
            }
        }
        if (jVar != null) {
            this.h.n(jVar);
            if (this.h.i(jVar) == 0) {
                jVar.e();
            }
        }
        l2.g gVar = this.d;
        int i12 = this.f16239p;
        e eVar = (e) gVar.f15081b;
        if (i12 == 1 && eVar.E > 0 && eVar.v != -9223372036854775807L) {
            eVar.f16260y.add(this);
            Handler handler = eVar.J;
            handler.getClass();
            handler.postAtTime(new h0(this, 13), this, SystemClock.uptimeMillis() + eVar.v);
        } else if (i12 == 0) {
            eVar.f16258w.remove(this);
            if (eVar.G == this) {
                eVar.G = null;
            }
            if (eVar.H == this) {
                eVar.H = null;
            }
            y yVar = eVar.f16255n;
            HashSet hashSet = (HashSet) yVar.f16363b;
            hashSet.remove(this);
            if (((b) yVar.f16364c) == this) {
                yVar.f16364c = null;
                if (!hashSet.isEmpty()) {
                    b bVar = (b) hashSet.iterator().next();
                    yVar.f16364c = bVar;
                    p l4 = bVar.f16227b.l();
                    bVar.f16246x = l4;
                    android.support.v4.media.session.f fVar2 = bVar.f16241r;
                    String str2 = d0.f8529a;
                    l4.getClass();
                    fVar2.getClass();
                    fVar2.obtainMessage(1, new a(u2.t.f48923b.getAndIncrement(), true, SystemClock.elapsedRealtime(), l4)).sendToTarget();
                }
            }
            if (eVar.v != -9223372036854775807L) {
                Handler handler2 = eVar.J;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                eVar.f16260y.remove(this);
            }
        }
        eVar.g();
    }

    @Override
    public final void b(j jVar) {
        int i10;
        p();
        boolean z10 = false;
        if (this.f16239p < 0) {
            e2.a.e("DefaultDrmSession", "Session reference count less than zero: " + this.f16239p);
            this.f16239p = 0;
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
        int i11 = this.f16239p + 1;
        this.f16239p = i11;
        if (i11 == 1) {
            if (this.f16238o == 2) {
                z10 = true;
            }
            e2.d.g(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f16240q = handlerThread;
            handlerThread.start();
            this.f16241r = new android.support.v4.media.session.f(this, this.f16240q.getLooper());
            if (n()) {
                j(true);
            }
        } else if (jVar != null && k() && this.h.i(jVar) == 1) {
            jVar.c(this.f16238o);
        }
        e eVar = (e) this.d.f15081b;
        if (eVar.v != -9223372036854775807L) {
            eVar.f16260y.remove(this);
            Handler handler = eVar.J;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override
    public final UUID c() {
        p();
        return this.f16235l;
    }

    @Override
    public final boolean d() {
        p();
        return this.f16229e;
    }

    @Override
    public final int e() {
        p();
        return this.f16238o;
    }

    @Override
    public final boolean f(String str) {
        p();
        byte[] bArr = this.f16244u;
        e2.d.h(bArr);
        return this.f16227b.b0(str, bArr);
    }

    @Override
    public final f g() {
        p();
        if (this.f16238o == 1) {
            return this.f16243t;
        }
        return null;
    }

    @Override
    public final h2.b h() {
        p();
        return this.f16242s;
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
        int i10 = this.f16238o;
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
        this.f16243t = new f(i11, th2);
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
        if (this.f16238o != 4) {
            this.f16238o = 1;
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
        this.f16228c.R(this);
    }

    public final boolean n() {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.n():boolean");
    }

    public final void o(int i10, boolean z10, byte[] bArr) {
        try {
            o X = this.f16227b.X(bArr, this.f16226a, i10, this.f16231g);
            this.f16245w = X;
            android.support.v4.media.session.f fVar = this.f16241r;
            String str = d0.f8529a;
            X.getClass();
            fVar.getClass();
            fVar.obtainMessage(2, new a(u2.t.f48923b.getAndIncrement(), z10, SystemClock.elapsedRealtime(), X)).sendToTarget();
        } catch (Exception | NoSuchMethodError e7) {
            m(e7, true);
        }
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f16236m;
        if (currentThread != looper.getThread()) {
            e2.a.o("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
