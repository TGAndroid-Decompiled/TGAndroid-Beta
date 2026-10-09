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
import k2.g0;
import m4.q0;
import w7.z;
public final class b implements g {
    public final List f16477a;
    public final q f16478b;
    public final pf.b f16479c;
    public final g0 d;
    public final boolean f16480e;
    public final boolean f16481f;
    public final HashMap f16482g;
    public final e2.i h;
    public final rb.a f16483i;
    public final j2.k f16484j;
    public final com.google.firebase.messaging.m f16485k;
    public final UUID f16486l;
    public final Looper f16487m;
    public final androidx.mediarouter.app.c f16488n;
    public int f16489o;
    public int f16490p;
    public HandlerThread f16491q;
    public android.support.v4.media.session.f f16492r;
    public h2.b f16493s;
    public f f16494t;
    public byte[] f16495u;
    public byte[] v;
    public o f16496w;
    public p f16497x;

    public b(UUID uuid, q qVar, pf.b bVar, g0 g0Var, List list, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, com.google.firebase.messaging.m mVar, Looper looper, rb.a aVar, j2.k kVar) {
        this.f16486l = uuid;
        this.f16479c = bVar;
        this.d = g0Var;
        this.f16478b = qVar;
        this.f16480e = z10;
        this.f16481f = z11;
        if (bArr != null) {
            this.v = bArr;
            this.f16477a = null;
        } else {
            list.getClass();
            this.f16477a = DesugarCollections.unmodifiableList(list);
        }
        this.f16482g = hashMap;
        this.f16485k = mVar;
        this.h = new e2.i();
        this.f16483i = aVar;
        this.f16484j = kVar;
        this.f16489o = 2;
        this.f16487m = looper;
        this.f16488n = new androidx.mediarouter.app.c(this, looper, 4);
    }

    @Override
    public final void a(j jVar) {
        p();
        int i10 = this.f16490p;
        if (i10 <= 0) {
            e2.a.e("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f16490p = i11;
        if (i11 == 0) {
            this.f16489o = 0;
            androidx.mediarouter.app.c cVar = this.f16488n;
            String str = d0.f8532a;
            cVar.removeCallbacksAndMessages(null);
            android.support.v4.media.session.f fVar = this.f16492r;
            synchronized (fVar) {
                fVar.removeCallbacksAndMessages(null);
                fVar.f2083b = true;
            }
            this.f16492r = null;
            this.f16491q.quit();
            this.f16491q = null;
            this.f16493s = null;
            this.f16494t = null;
            this.f16496w = null;
            this.f16497x = null;
            byte[] bArr = this.f16495u;
            if (bArr != null) {
                this.f16478b.y(bArr);
                this.f16495u = null;
            }
        }
        if (jVar != null) {
            this.h.n(jVar);
            if (this.h.i(jVar) == 0) {
                jVar.e();
            }
        }
        g0 g0Var = this.d;
        int i12 = this.f16490p;
        e eVar = (e) g0Var.f14470b;
        if (i12 == 1 && eVar.E > 0 && eVar.v != -9223372036854775807L) {
            eVar.f16511y.add(this);
            Handler handler = eVar.J;
            handler.getClass();
            handler.postAtTime(new h0(this, 14), this, SystemClock.uptimeMillis() + eVar.v);
        } else if (i12 == 0) {
            eVar.f16509w.remove(this);
            if (eVar.G == this) {
                eVar.G = null;
            }
            if (eVar.H == this) {
                eVar.H = null;
            }
            pf.b bVar = eVar.f16506n;
            HashSet hashSet = (HashSet) bVar.f45556b;
            hashSet.remove(this);
            if (((b) bVar.f45557c) == this) {
                bVar.f45557c = null;
                if (!hashSet.isEmpty()) {
                    b bVar2 = (b) hashSet.iterator().next();
                    bVar.f45557c = bVar2;
                    p l4 = bVar2.f16478b.l();
                    bVar2.f16497x = l4;
                    android.support.v4.media.session.f fVar2 = bVar2.f16492r;
                    String str2 = d0.f8532a;
                    l4.getClass();
                    fVar2.getClass();
                    fVar2.obtainMessage(1, new a(u2.t.f48706b.getAndIncrement(), true, SystemClock.elapsedRealtime(), l4)).sendToTarget();
                }
            }
            if (eVar.v != -9223372036854775807L) {
                Handler handler2 = eVar.J;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                eVar.f16511y.remove(this);
            }
        }
        eVar.g();
    }

    @Override
    public final void b(j jVar) {
        int i10;
        p();
        boolean z10 = false;
        if (this.f16490p < 0) {
            e2.a.e("DefaultDrmSession", "Session reference count less than zero: " + this.f16490p);
            this.f16490p = 0;
        }
        if (jVar != null) {
            e2.i iVar = this.h;
            synchronized (iVar.f8550a) {
                try {
                    ArrayList arrayList = new ArrayList(iVar.d);
                    arrayList.add(jVar);
                    iVar.d = DesugarCollections.unmodifiableList(arrayList);
                    Integer num = (Integer) iVar.f8551b.get(jVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(iVar.f8552c);
                        hashSet.add(jVar);
                        iVar.f8552c = DesugarCollections.unmodifiableSet(hashSet);
                    }
                    HashMap hashMap = iVar.f8551b;
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
        int i11 = this.f16490p + 1;
        this.f16490p = i11;
        if (i11 == 1) {
            if (this.f16489o == 2) {
                z10 = true;
            }
            e2.d.g(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f16491q = handlerThread;
            handlerThread.start();
            this.f16492r = new android.support.v4.media.session.f(this, this.f16491q.getLooper());
            if (n()) {
                j(true);
            }
        } else if (jVar != null && k() && this.h.i(jVar) == 1) {
            jVar.c(this.f16489o);
        }
        e eVar = (e) this.d.f14470b;
        if (eVar.v != -9223372036854775807L) {
            eVar.f16511y.remove(this);
            Handler handler = eVar.J;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override
    public final UUID c() {
        p();
        return this.f16486l;
    }

    @Override
    public final boolean d() {
        p();
        return this.f16480e;
    }

    @Override
    public final int e() {
        p();
        return this.f16489o;
    }

    @Override
    public final boolean f(String str) {
        p();
        byte[] bArr = this.f16495u;
        e2.d.h(bArr);
        return this.f16478b.Z(str, bArr);
    }

    @Override
    public final f g() {
        p();
        if (this.f16489o == 1) {
            return this.f16494t;
        }
        return null;
    }

    @Override
    public final h2.b h() {
        p();
        return this.f16493s;
    }

    public final void i(q0 q0Var) {
        Set<j> set;
        e2.i iVar = this.h;
        synchronized (iVar.f8550a) {
            set = iVar.f8552c;
        }
        for (j jVar : set) {
            jVar.a();
        }
    }

    public final void j(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.j(boolean):void");
    }

    public final boolean k() {
        int i10 = this.f16489o;
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
                if (!(th2 instanceof NotProvisionedException) && !z.b(th2)) {
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
        this.f16494t = new f(i11, th2);
        e2.a.f("DefaultDrmSession", "DRM session error", th2);
        if (th2 instanceof Exception) {
            e2.i iVar = this.h;
            synchronized (iVar.f8550a) {
                set = iVar.f8552c;
            }
            for (j jVar : set) {
                jVar.d((Exception) th2);
            }
        } else if (th2 instanceof Error) {
            if (!z.c(th2) && !z.b(th2)) {
                throw ((Error) th2);
            }
        } else {
            throw new IllegalStateException("Unexpected Throwable subclass", th2);
        }
        if (this.f16489o != 4) {
            this.f16489o = 1;
        }
    }

    public final void m(Throwable th2, boolean z10) {
        int i10;
        if (!(th2 instanceof NotProvisionedException) && !z.b(th2)) {
            if (z10) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            l(i10, th2);
            return;
        }
        this.f16479c.Q(this);
    }

    public final boolean n() {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.n():boolean");
    }

    public final void o(int i10, boolean z10, byte[] bArr) {
        try {
            o J = this.f16478b.J(bArr, this.f16477a, i10, this.f16482g);
            this.f16496w = J;
            android.support.v4.media.session.f fVar = this.f16492r;
            String str = d0.f8532a;
            J.getClass();
            fVar.getClass();
            fVar.obtainMessage(2, new a(u2.t.f48706b.getAndIncrement(), z10, SystemClock.elapsedRealtime(), J)).sendToTarget();
        } catch (Exception | NoSuchMethodError e7) {
            m(e7, true);
        }
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f16487m;
        if (currentThread != looper.getThread()) {
            e2.a.o("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
