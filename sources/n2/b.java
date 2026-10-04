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
    public final List f16505a;
    public final r f16506b;
    public final of.b f16507c;
    public final l2.g d;
    public final boolean f16508e;
    public final boolean f16509f;
    public final HashMap f16510g;
    public final e2.i h;
    public final qb.b f16511i;
    public final j2.k f16512j;
    public final com.google.firebase.messaging.m f16513k;
    public final UUID f16514l;
    public final Looper f16515m;
    public final androidx.mediarouter.app.c f16516n;
    public int f16517o;
    public int f16518p;
    public HandlerThread f16519q;
    public android.support.v4.media.session.f f16520r;
    public h2.b f16521s;
    public g f16522t;
    public byte[] f16523u;
    public byte[] v;
    public p f16524w;
    public q f16525x;

    public b(UUID uuid, r rVar, of.b bVar, l2.g gVar, List list, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, com.google.firebase.messaging.m mVar, Looper looper, qb.b bVar2, j2.k kVar) {
        this.f16514l = uuid;
        this.f16507c = bVar;
        this.d = gVar;
        this.f16506b = rVar;
        this.f16508e = z10;
        this.f16509f = z11;
        if (bArr != null) {
            this.v = bArr;
            this.f16505a = null;
        } else {
            list.getClass();
            this.f16505a = DesugarCollections.unmodifiableList(list);
        }
        this.f16510g = hashMap;
        this.f16513k = mVar;
        this.h = new e2.i();
        this.f16511i = bVar2;
        this.f16512j = kVar;
        this.f16517o = 2;
        this.f16515m = looper;
        this.f16516n = new androidx.mediarouter.app.c(this, looper, 4);
    }

    @Override
    public final void a(k kVar) {
        p();
        int i10 = this.f16518p;
        if (i10 <= 0) {
            e2.a.e("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f16518p = i11;
        if (i11 == 0) {
            this.f16517o = 0;
            androidx.mediarouter.app.c cVar = this.f16516n;
            String str = d0.f8538a;
            cVar.removeCallbacksAndMessages(null);
            android.support.v4.media.session.f fVar = this.f16520r;
            synchronized (fVar) {
                fVar.removeCallbacksAndMessages(null);
                fVar.f2006b = true;
            }
            this.f16520r = null;
            this.f16519q.quit();
            this.f16519q = null;
            this.f16521s = null;
            this.f16522t = null;
            this.f16524w = null;
            this.f16525x = null;
            byte[] bArr = this.f16523u;
            if (bArr != null) {
                this.f16506b.K(bArr);
                this.f16523u = null;
            }
        }
        if (kVar != null) {
            this.h.n(kVar);
            if (this.h.i(kVar) == 0) {
                kVar.e();
            }
        }
        l2.g gVar = this.d;
        int i12 = this.f16518p;
        f fVar2 = (f) gVar.f15268b;
        if (i12 == 1 && fVar2.E > 0 && fVar2.v != -9223372036854775807L) {
            fVar2.f16541y.add(this);
            Handler handler = fVar2.J;
            handler.getClass();
            handler.postAtTime(new h0(this, 14), this, SystemClock.uptimeMillis() + fVar2.v);
        } else if (i12 == 0) {
            fVar2.f16539w.remove(this);
            if (fVar2.G == this) {
                fVar2.G = null;
            }
            if (fVar2.H == this) {
                fVar2.H = null;
            }
            of.b bVar = fVar2.f16536n;
            HashSet hashSet = (HashSet) bVar.f17162b;
            hashSet.remove(this);
            if (((b) bVar.f17163c) == this) {
                bVar.f17163c = null;
                if (!hashSet.isEmpty()) {
                    b bVar2 = (b) hashSet.iterator().next();
                    bVar.f17163c = bVar2;
                    q m10 = bVar2.f16506b.m();
                    bVar2.f16525x = m10;
                    android.support.v4.media.session.f fVar3 = bVar2.f16520r;
                    String str2 = d0.f8538a;
                    m10.getClass();
                    fVar3.getClass();
                    fVar3.obtainMessage(1, new a(u2.t.f47401b.getAndIncrement(), true, SystemClock.elapsedRealtime(), m10)).sendToTarget();
                }
            }
            if (fVar2.v != -9223372036854775807L) {
                Handler handler2 = fVar2.J;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                fVar2.f16541y.remove(this);
            }
        }
        fVar2.g();
    }

    @Override
    public final void b(k kVar) {
        int i10;
        p();
        boolean z10 = false;
        if (this.f16518p < 0) {
            e2.a.e("DefaultDrmSession", "Session reference count less than zero: " + this.f16518p);
            this.f16518p = 0;
        }
        if (kVar != null) {
            e2.i iVar = this.h;
            synchronized (iVar.f8556a) {
                try {
                    ArrayList arrayList = new ArrayList(iVar.d);
                    arrayList.add(kVar);
                    iVar.d = DesugarCollections.unmodifiableList(arrayList);
                    Integer num = (Integer) iVar.f8557b.get(kVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(iVar.f8558c);
                        hashSet.add(kVar);
                        iVar.f8558c = DesugarCollections.unmodifiableSet(hashSet);
                    }
                    HashMap hashMap = iVar.f8557b;
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
        int i11 = this.f16518p + 1;
        this.f16518p = i11;
        if (i11 == 1) {
            if (this.f16517o == 2) {
                z10 = true;
            }
            e2.d.g(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f16519q = handlerThread;
            handlerThread.start();
            this.f16520r = new android.support.v4.media.session.f(this, this.f16519q.getLooper());
            if (n()) {
                j(true);
            }
        } else if (kVar != null && k() && this.h.i(kVar) == 1) {
            kVar.c(this.f16517o);
        }
        f fVar = (f) this.d.f15268b;
        if (fVar.v != -9223372036854775807L) {
            fVar.f16541y.remove(this);
            Handler handler = fVar.J;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override
    public final UUID c() {
        p();
        return this.f16514l;
    }

    @Override
    public final boolean d() {
        p();
        return this.f16508e;
    }

    @Override
    public final int e() {
        p();
        return this.f16517o;
    }

    @Override
    public final boolean f(String str) {
        p();
        byte[] bArr = this.f16523u;
        e2.d.h(bArr);
        return this.f16506b.r0(str, bArr);
    }

    @Override
    public final g g() {
        p();
        if (this.f16517o == 1) {
            return this.f16522t;
        }
        return null;
    }

    @Override
    public final h2.b h() {
        p();
        return this.f16521s;
    }

    public final void i(o0 o0Var) {
        Set<k> set;
        e2.i iVar = this.h;
        synchronized (iVar.f8556a) {
            set = iVar.f8558c;
        }
        for (k kVar : set) {
            kVar.a();
        }
    }

    public final void j(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.j(boolean):void");
    }

    public final boolean k() {
        int i10 = this.f16517o;
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
        this.f16522t = new g(i11, th2);
        e2.a.f("DefaultDrmSession", "DRM session error", th2);
        if (th2 instanceof Exception) {
            e2.i iVar = this.h;
            synchronized (iVar.f8556a) {
                set = iVar.f8558c;
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
        if (this.f16517o != 4) {
            this.f16517o = 1;
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
        this.f16507c.L(this);
    }

    public final boolean n() {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.n():boolean");
    }

    public final void o(int i10, boolean z10, byte[] bArr) {
        try {
            p k02 = this.f16506b.k0(bArr, this.f16505a, i10, this.f16510g);
            this.f16524w = k02;
            android.support.v4.media.session.f fVar = this.f16520r;
            String str = d0.f8538a;
            k02.getClass();
            fVar.getClass();
            fVar.obtainMessage(2, new a(u2.t.f47401b.getAndIncrement(), z10, SystemClock.elapsedRealtime(), k02)).sendToTarget();
        } catch (Exception | NoSuchMethodError e7) {
            m(e7, true);
        }
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f16515m;
        if (currentThread != looper.getThread()) {
            e2.a.o("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
