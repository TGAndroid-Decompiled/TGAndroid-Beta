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
import m4.p0;
import n4.x;
import w7.z;
public final class b implements g {
    public final List f16523a;
    public final q f16524b;
    public final x f16525c;
    public final g0 d;
    public final boolean f16526e;
    public final boolean f16527f;
    public final HashMap f16528g;
    public final e2.i h;
    public final rb.a f16529i;
    public final j2.k f16530j;
    public final com.google.firebase.messaging.m f16531k;
    public final UUID f16532l;
    public final Looper f16533m;
    public final androidx.mediarouter.app.c f16534n;
    public int f16535o;
    public int f16536p;
    public HandlerThread f16537q;
    public android.support.v4.media.session.f f16538r;
    public h2.b f16539s;
    public f f16540t;
    public byte[] f16541u;
    public byte[] v;
    public o f16542w;
    public p f16543x;

    public b(UUID uuid, q qVar, x xVar, g0 g0Var, List list, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, com.google.firebase.messaging.m mVar, Looper looper, rb.a aVar, j2.k kVar) {
        this.f16532l = uuid;
        this.f16525c = xVar;
        this.d = g0Var;
        this.f16524b = qVar;
        this.f16526e = z10;
        this.f16527f = z11;
        if (bArr != null) {
            this.v = bArr;
            this.f16523a = null;
        } else {
            list.getClass();
            this.f16523a = DesugarCollections.unmodifiableList(list);
        }
        this.f16528g = hashMap;
        this.f16531k = mVar;
        this.h = new e2.i();
        this.f16529i = aVar;
        this.f16530j = kVar;
        this.f16535o = 2;
        this.f16533m = looper;
        this.f16534n = new androidx.mediarouter.app.c(this, looper, 4);
    }

    @Override
    public final void a(j jVar) {
        p();
        int i10 = this.f16536p;
        if (i10 <= 0) {
            e2.a.e("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f16536p = i11;
        if (i11 == 0) {
            this.f16535o = 0;
            androidx.mediarouter.app.c cVar = this.f16534n;
            String str = d0.f8531a;
            cVar.removeCallbacksAndMessages(null);
            android.support.v4.media.session.f fVar = this.f16538r;
            synchronized (fVar) {
                fVar.removeCallbacksAndMessages(null);
                fVar.f2083b = true;
            }
            this.f16538r = null;
            this.f16537q.quit();
            this.f16537q = null;
            this.f16539s = null;
            this.f16540t = null;
            this.f16542w = null;
            this.f16543x = null;
            byte[] bArr = this.f16541u;
            if (bArr != null) {
                this.f16524b.x(bArr);
                this.f16541u = null;
            }
        }
        if (jVar != null) {
            this.h.n(jVar);
            if (this.h.i(jVar) == 0) {
                jVar.e();
            }
        }
        g0 g0Var = this.d;
        int i12 = this.f16536p;
        e eVar = (e) g0Var.f14469b;
        if (i12 == 1 && eVar.E > 0 && eVar.v != -9223372036854775807L) {
            eVar.f16557y.add(this);
            Handler handler = eVar.J;
            handler.getClass();
            handler.postAtTime(new h0(this, 14), this, SystemClock.uptimeMillis() + eVar.v);
        } else if (i12 == 0) {
            eVar.f16555w.remove(this);
            if (eVar.G == this) {
                eVar.G = null;
            }
            if (eVar.H == this) {
                eVar.H = null;
            }
            x xVar = eVar.f16552n;
            HashSet hashSet = (HashSet) xVar.f16658b;
            hashSet.remove(this);
            if (((b) xVar.f16659c) == this) {
                xVar.f16659c = null;
                if (!hashSet.isEmpty()) {
                    b bVar = (b) hashSet.iterator().next();
                    xVar.f16659c = bVar;
                    p h = bVar.f16524b.h();
                    bVar.f16543x = h;
                    android.support.v4.media.session.f fVar2 = bVar.f16538r;
                    String str2 = d0.f8531a;
                    h.getClass();
                    fVar2.getClass();
                    fVar2.obtainMessage(1, new a(u2.t.f48774b.getAndIncrement(), true, SystemClock.elapsedRealtime(), h)).sendToTarget();
                }
            }
            if (eVar.v != -9223372036854775807L) {
                Handler handler2 = eVar.J;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                eVar.f16557y.remove(this);
            }
        }
        eVar.g();
    }

    @Override
    public final void b(j jVar) {
        int i10;
        p();
        boolean z10 = false;
        if (this.f16536p < 0) {
            e2.a.e("DefaultDrmSession", "Session reference count less than zero: " + this.f16536p);
            this.f16536p = 0;
        }
        if (jVar != null) {
            e2.i iVar = this.h;
            synchronized (iVar.f8549a) {
                try {
                    ArrayList arrayList = new ArrayList(iVar.d);
                    arrayList.add(jVar);
                    iVar.d = DesugarCollections.unmodifiableList(arrayList);
                    Integer num = (Integer) iVar.f8550b.get(jVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(iVar.f8551c);
                        hashSet.add(jVar);
                        iVar.f8551c = DesugarCollections.unmodifiableSet(hashSet);
                    }
                    HashMap hashMap = iVar.f8550b;
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
        int i11 = this.f16536p + 1;
        this.f16536p = i11;
        if (i11 == 1) {
            if (this.f16535o == 2) {
                z10 = true;
            }
            e2.d.g(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f16537q = handlerThread;
            handlerThread.start();
            this.f16538r = new android.support.v4.media.session.f(this, this.f16537q.getLooper());
            if (n()) {
                j(true);
            }
        } else if (jVar != null && k() && this.h.i(jVar) == 1) {
            jVar.c(this.f16535o);
        }
        e eVar = (e) this.d.f14469b;
        if (eVar.v != -9223372036854775807L) {
            eVar.f16557y.remove(this);
            Handler handler = eVar.J;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override
    public final UUID c() {
        p();
        return this.f16532l;
    }

    @Override
    public final boolean d() {
        p();
        return this.f16526e;
    }

    @Override
    public final int e() {
        p();
        return this.f16535o;
    }

    @Override
    public final boolean f(String str) {
        p();
        byte[] bArr = this.f16541u;
        e2.d.h(bArr);
        return this.f16524b.Z(str, bArr);
    }

    @Override
    public final f g() {
        p();
        if (this.f16535o == 1) {
            return this.f16540t;
        }
        return null;
    }

    @Override
    public final h2.b h() {
        p();
        return this.f16539s;
    }

    public final void i(p0 p0Var) {
        Set<j> set;
        e2.i iVar = this.h;
        synchronized (iVar.f8549a) {
            set = iVar.f8551c;
        }
        for (j jVar : set) {
            jVar.a();
        }
    }

    public final void j(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.j(boolean):void");
    }

    public final boolean k() {
        int i10 = this.f16535o;
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
        this.f16540t = new f(i11, th2);
        e2.a.f("DefaultDrmSession", "DRM session error", th2);
        if (th2 instanceof Exception) {
            e2.i iVar = this.h;
            synchronized (iVar.f8549a) {
                set = iVar.f8551c;
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
        if (this.f16535o != 4) {
            this.f16535o = 1;
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
        this.f16525c.T(this);
    }

    public final boolean n() {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.n():boolean");
    }

    public final void o(int i10, boolean z10, byte[] bArr) {
        try {
            o J = this.f16524b.J(bArr, this.f16523a, i10, this.f16528g);
            this.f16542w = J;
            android.support.v4.media.session.f fVar = this.f16538r;
            String str = d0.f8531a;
            J.getClass();
            fVar.getClass();
            fVar.obtainMessage(2, new a(u2.t.f48774b.getAndIncrement(), z10, SystemClock.elapsedRealtime(), J)).sendToTarget();
        } catch (Exception | NoSuchMethodError e7) {
            m(e7, true);
        }
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f16533m;
        if (currentThread != looper.getThread()) {
            e2.a.o("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
