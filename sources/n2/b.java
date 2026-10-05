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
    public final List f16510a;
    public final r f16511b;
    public final of.b f16512c;
    public final l2.g d;
    public final boolean f16513e;
    public final boolean f16514f;
    public final HashMap f16515g;
    public final e2.i h;
    public final qb.b f16516i;
    public final j2.k f16517j;
    public final com.google.firebase.messaging.m f16518k;
    public final UUID f16519l;
    public final Looper f16520m;
    public final androidx.mediarouter.app.c f16521n;
    public int f16522o;
    public int f16523p;
    public HandlerThread f16524q;
    public android.support.v4.media.session.f f16525r;
    public h2.b f16526s;
    public g f16527t;
    public byte[] f16528u;
    public byte[] v;
    public p f16529w;
    public q f16530x;

    public b(UUID uuid, r rVar, of.b bVar, l2.g gVar, List list, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, com.google.firebase.messaging.m mVar, Looper looper, qb.b bVar2, j2.k kVar) {
        this.f16519l = uuid;
        this.f16512c = bVar;
        this.d = gVar;
        this.f16511b = rVar;
        this.f16513e = z10;
        this.f16514f = z11;
        if (bArr != null) {
            this.v = bArr;
            this.f16510a = null;
        } else {
            list.getClass();
            this.f16510a = DesugarCollections.unmodifiableList(list);
        }
        this.f16515g = hashMap;
        this.f16518k = mVar;
        this.h = new e2.i();
        this.f16516i = bVar2;
        this.f16517j = kVar;
        this.f16522o = 2;
        this.f16520m = looper;
        this.f16521n = new androidx.mediarouter.app.c(this, looper, 4);
    }

    @Override
    public final void a(k kVar) {
        p();
        int i10 = this.f16523p;
        if (i10 <= 0) {
            e2.a.e("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f16523p = i11;
        if (i11 == 0) {
            this.f16522o = 0;
            androidx.mediarouter.app.c cVar = this.f16521n;
            String str = d0.f8538a;
            cVar.removeCallbacksAndMessages(null);
            android.support.v4.media.session.f fVar = this.f16525r;
            synchronized (fVar) {
                fVar.removeCallbacksAndMessages(null);
                fVar.f2006b = true;
            }
            this.f16525r = null;
            this.f16524q.quit();
            this.f16524q = null;
            this.f16526s = null;
            this.f16527t = null;
            this.f16529w = null;
            this.f16530x = null;
            byte[] bArr = this.f16528u;
            if (bArr != null) {
                this.f16511b.K(bArr);
                this.f16528u = null;
            }
        }
        if (kVar != null) {
            this.h.n(kVar);
            if (this.h.i(kVar) == 0) {
                kVar.e();
            }
        }
        l2.g gVar = this.d;
        int i12 = this.f16523p;
        f fVar2 = (f) gVar.f15268b;
        if (i12 == 1 && fVar2.E > 0 && fVar2.v != -9223372036854775807L) {
            fVar2.f16546y.add(this);
            Handler handler = fVar2.J;
            handler.getClass();
            handler.postAtTime(new h0(this, 14), this, SystemClock.uptimeMillis() + fVar2.v);
        } else if (i12 == 0) {
            fVar2.f16544w.remove(this);
            if (fVar2.G == this) {
                fVar2.G = null;
            }
            if (fVar2.H == this) {
                fVar2.H = null;
            }
            of.b bVar = fVar2.f16541n;
            HashSet hashSet = (HashSet) bVar.f17167b;
            hashSet.remove(this);
            if (((b) bVar.f17168c) == this) {
                bVar.f17168c = null;
                if (!hashSet.isEmpty()) {
                    b bVar2 = (b) hashSet.iterator().next();
                    bVar.f17168c = bVar2;
                    q m10 = bVar2.f16511b.m();
                    bVar2.f16530x = m10;
                    android.support.v4.media.session.f fVar3 = bVar2.f16525r;
                    String str2 = d0.f8538a;
                    m10.getClass();
                    fVar3.getClass();
                    fVar3.obtainMessage(1, new a(u2.t.f47408b.getAndIncrement(), true, SystemClock.elapsedRealtime(), m10)).sendToTarget();
                }
            }
            if (fVar2.v != -9223372036854775807L) {
                Handler handler2 = fVar2.J;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                fVar2.f16546y.remove(this);
            }
        }
        fVar2.g();
    }

    @Override
    public final void b(k kVar) {
        int i10;
        p();
        boolean z10 = false;
        if (this.f16523p < 0) {
            e2.a.e("DefaultDrmSession", "Session reference count less than zero: " + this.f16523p);
            this.f16523p = 0;
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
        int i11 = this.f16523p + 1;
        this.f16523p = i11;
        if (i11 == 1) {
            if (this.f16522o == 2) {
                z10 = true;
            }
            e2.d.g(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f16524q = handlerThread;
            handlerThread.start();
            this.f16525r = new android.support.v4.media.session.f(this, this.f16524q.getLooper());
            if (n()) {
                j(true);
            }
        } else if (kVar != null && k() && this.h.i(kVar) == 1) {
            kVar.c(this.f16522o);
        }
        f fVar = (f) this.d.f15268b;
        if (fVar.v != -9223372036854775807L) {
            fVar.f16546y.remove(this);
            Handler handler = fVar.J;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override
    public final UUID c() {
        p();
        return this.f16519l;
    }

    @Override
    public final boolean d() {
        p();
        return this.f16513e;
    }

    @Override
    public final int e() {
        p();
        return this.f16522o;
    }

    @Override
    public final boolean f(String str) {
        p();
        byte[] bArr = this.f16528u;
        e2.d.h(bArr);
        return this.f16511b.r0(str, bArr);
    }

    @Override
    public final g g() {
        p();
        if (this.f16522o == 1) {
            return this.f16527t;
        }
        return null;
    }

    @Override
    public final h2.b h() {
        p();
        return this.f16526s;
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
        int i10 = this.f16522o;
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
        this.f16527t = new g(i11, th2);
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
        if (this.f16522o != 4) {
            this.f16522o = 1;
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
        this.f16512c.L(this);
    }

    public final boolean n() {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.n():boolean");
    }

    public final void o(int i10, boolean z10, byte[] bArr) {
        try {
            p k02 = this.f16511b.k0(bArr, this.f16510a, i10, this.f16515g);
            this.f16529w = k02;
            android.support.v4.media.session.f fVar = this.f16525r;
            String str = d0.f8538a;
            k02.getClass();
            fVar.getClass();
            fVar.obtainMessage(2, new a(u2.t.f47408b.getAndIncrement(), z10, SystemClock.elapsedRealtime(), k02)).sendToTarget();
        } catch (Exception | NoSuchMethodError e7) {
            m(e7, true);
        }
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f16520m;
        if (currentThread != looper.getThread()) {
            e2.a.o("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
