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
import w7.b0;
public final class b implements h {
    public final List f15077a;
    public final r f15078b;
    public final of.b f15079c;
    public final e d;
    public final boolean e;
    public final boolean f15080f;
    public final HashMap f15081g;
    public final e2.i h;
    public final qb.b f15082i;
    public final j2.k f15083j;
    public final com.google.firebase.messaging.m f15084k;
    public final UUID f15085l;
    public final Looper f15086m;
    public final androidx.mediarouter.app.c f15087n;
    public int f15088o;
    public int f15089p;
    public HandlerThread f15090q;
    public android.support.v4.media.session.f f15091r;
    public h2.b f15092s;
    public g f15093t;
    public byte[] f15094u;
    public byte[] v;
    public p f15095w;
    public q f15096x;

    public b(UUID uuid, r rVar, of.b bVar, e eVar, List list, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, com.google.firebase.messaging.m mVar, Looper looper, qb.b bVar2, j2.k kVar) {
        this.f15085l = uuid;
        this.f15079c = bVar;
        this.d = eVar;
        this.f15078b = rVar;
        this.e = z10;
        this.f15080f = z11;
        if (bArr != null) {
            this.v = bArr;
            this.f15077a = null;
        } else {
            list.getClass();
            this.f15077a = DesugarCollections.unmodifiableList(list);
        }
        this.f15081g = hashMap;
        this.f15084k = mVar;
        this.h = new e2.i();
        this.f15082i = bVar2;
        this.f15083j = kVar;
        this.f15088o = 2;
        this.f15086m = looper;
        this.f15087n = new androidx.mediarouter.app.c(this, looper, 4);
    }

    @Override
    public final void a(k kVar) {
        p();
        int i10 = this.f15089p;
        if (i10 <= 0) {
            e2.a.e("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f15089p = i11;
        if (i11 == 0) {
            this.f15088o = 0;
            androidx.mediarouter.app.c cVar = this.f15087n;
            String str = d0.f7870a;
            cVar.removeCallbacksAndMessages(null);
            android.support.v4.media.session.f fVar = this.f15091r;
            synchronized (fVar) {
                fVar.removeCallbacksAndMessages(null);
                fVar.f1841b = true;
            }
            this.f15091r = null;
            this.f15090q.quit();
            this.f15090q = null;
            this.f15092s = null;
            this.f15093t = null;
            this.f15095w = null;
            this.f15096x = null;
            byte[] bArr = this.f15094u;
            if (bArr != null) {
                this.f15078b.K(bArr);
                this.f15094u = null;
            }
        }
        if (kVar != null) {
            this.h.n(kVar);
            if (this.h.i(kVar) == 0) {
                kVar.e();
            }
        }
        e eVar = this.d;
        int i12 = this.f15089p;
        f fVar2 = (f) eVar.f15101b;
        if (i12 == 1 && fVar2.E > 0 && fVar2.v != -9223372036854775807L) {
            fVar2.f15111y.add(this);
            Handler handler = fVar2.J;
            handler.getClass();
            handler.postAtTime(new h0(this, 14), this, SystemClock.uptimeMillis() + fVar2.v);
        } else if (i12 == 0) {
            fVar2.f15109w.remove(this);
            if (fVar2.G == this) {
                fVar2.G = null;
            }
            if (fVar2.H == this) {
                fVar2.H = null;
            }
            of.b bVar = fVar2.f15106n;
            HashSet hashSet = (HashSet) bVar.f15678b;
            hashSet.remove(this);
            if (((b) bVar.f15679c) == this) {
                bVar.f15679c = null;
                if (!hashSet.isEmpty()) {
                    b bVar2 = (b) hashSet.iterator().next();
                    bVar.f15679c = bVar2;
                    q m10 = bVar2.f15078b.m();
                    bVar2.f15096x = m10;
                    android.support.v4.media.session.f fVar3 = bVar2.f15091r;
                    String str2 = d0.f7870a;
                    m10.getClass();
                    fVar3.getClass();
                    fVar3.obtainMessage(1, new a(u2.t.f43755b.getAndIncrement(), true, SystemClock.elapsedRealtime(), m10)).sendToTarget();
                }
            }
            if (fVar2.v != -9223372036854775807L) {
                Handler handler2 = fVar2.J;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                fVar2.f15111y.remove(this);
            }
        }
        fVar2.g();
    }

    @Override
    public final void b(k kVar) {
        int i10;
        p();
        boolean z10 = false;
        if (this.f15089p < 0) {
            e2.a.e("DefaultDrmSession", "Session reference count less than zero: " + this.f15089p);
            this.f15089p = 0;
        }
        if (kVar != null) {
            e2.i iVar = this.h;
            synchronized (iVar.f7887a) {
                try {
                    ArrayList arrayList = new ArrayList(iVar.d);
                    arrayList.add(kVar);
                    iVar.d = DesugarCollections.unmodifiableList(arrayList);
                    Integer num = (Integer) iVar.f7888b.get(kVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(iVar.f7889c);
                        hashSet.add(kVar);
                        iVar.f7889c = DesugarCollections.unmodifiableSet(hashSet);
                    }
                    HashMap hashMap = iVar.f7888b;
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
        int i11 = this.f15089p + 1;
        this.f15089p = i11;
        if (i11 == 1) {
            if (this.f15088o == 2) {
                z10 = true;
            }
            e2.d.g(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f15090q = handlerThread;
            handlerThread.start();
            this.f15091r = new android.support.v4.media.session.f(this, this.f15090q.getLooper());
            if (n()) {
                j(true);
            }
        } else if (kVar != null && k() && this.h.i(kVar) == 1) {
            kVar.c(this.f15088o);
        }
        f fVar = (f) this.d.f15101b;
        if (fVar.v != -9223372036854775807L) {
            fVar.f15111y.remove(this);
            Handler handler = fVar.J;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override
    public final UUID c() {
        p();
        return this.f15085l;
    }

    @Override
    public final boolean d() {
        p();
        return this.e;
    }

    @Override
    public final int e() {
        p();
        return this.f15088o;
    }

    @Override
    public final boolean f(String str) {
        p();
        byte[] bArr = this.f15094u;
        e2.d.h(bArr);
        return this.f15078b.r0(str, bArr);
    }

    @Override
    public final g g() {
        p();
        if (this.f15088o == 1) {
            return this.f15093t;
        }
        return null;
    }

    @Override
    public final h2.b h() {
        p();
        return this.f15092s;
    }

    public final void i(o0 o0Var) {
        Set<k> set;
        e2.i iVar = this.h;
        synchronized (iVar.f7887a) {
            set = iVar.f7889c;
        }
        for (k kVar : set) {
            kVar.a();
        }
    }

    public final void j(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.j(boolean):void");
    }

    public final boolean k() {
        int i10 = this.f15088o;
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
                if (!(th2 instanceof NotProvisionedException) && !b0.b(th2)) {
                    if (th2 instanceof DeniedByServerException) {
                        i11 = 6007;
                    } else if (th2 instanceof x) {
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
        this.f15093t = new g(i11, th2);
        e2.a.f("DefaultDrmSession", "DRM session error", th2);
        if (th2 instanceof Exception) {
            e2.i iVar = this.h;
            synchronized (iVar.f7887a) {
                set = iVar.f7889c;
            }
            for (k kVar : set) {
                kVar.d((Exception) th2);
            }
        } else if (th2 instanceof Error) {
            if (!b0.c(th2) && !b0.b(th2)) {
                throw ((Error) th2);
            }
        } else {
            throw new IllegalStateException("Unexpected Throwable subclass", th2);
        }
        if (this.f15088o != 4) {
            this.f15088o = 1;
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
        this.f15079c.R(this);
    }

    public final boolean n() {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.n():boolean");
    }

    public final void o(int i10, boolean z10, byte[] bArr) {
        try {
            p k02 = this.f15078b.k0(bArr, this.f15077a, i10, this.f15081g);
            this.f15095w = k02;
            android.support.v4.media.session.f fVar = this.f15091r;
            String str = d0.f7870a;
            k02.getClass();
            fVar.getClass();
            fVar.obtainMessage(2, new a(u2.t.f43755b.getAndIncrement(), z10, SystemClock.elapsedRealtime(), k02)).sendToTarget();
        } catch (Exception | NoSuchMethodError e) {
            m(e, true);
        }
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f15086m;
        if (currentThread != looper.getThread()) {
            e2.a.o("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
