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
import gg.g0;
import gg.v1;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import n4.y;
import w7.a0;
public final class b implements g {
    public final List f13695a;
    public final r f13696b;
    public final y f13697c;
    public final a4.m d;
    public final boolean e;
    public final boolean f13698f;
    public final HashMap f13699g;
    public final e2.i h;
    public final rb.a f13700i;
    public final j2.k f13701j;
    public final com.google.firebase.messaging.m f13702k;
    public final UUID f13703l;
    public final Looper f13704m;
    public final androidx.mediarouter.app.c f13705n;
    public int f13706o;
    public int f13707p;
    public HandlerThread f13708q;
    public android.support.v4.media.session.f f13709r;
    public h2.b f13710s;
    public f f13711t;
    public byte[] f13712u;
    public byte[] v;
    public p f13713w;
    public q f13714x;

    public b(UUID uuid, r rVar, y yVar, a4.m mVar, List list, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, com.google.firebase.messaging.m mVar2, Looper looper, rb.a aVar, j2.k kVar) {
        this.f13703l = uuid;
        this.f13697c = yVar;
        this.d = mVar;
        this.f13696b = rVar;
        this.e = z10;
        this.f13698f = z11;
        if (bArr != null) {
            this.v = bArr;
            this.f13695a = null;
        } else {
            list.getClass();
            this.f13695a = DesugarCollections.unmodifiableList(list);
        }
        this.f13699g = hashMap;
        this.f13702k = mVar2;
        this.h = new e2.i();
        this.f13700i = aVar;
        this.f13701j = kVar;
        this.f13706o = 2;
        this.f13704m = looper;
        this.f13705n = new androidx.mediarouter.app.c(this, looper, 4);
    }

    @Override
    public final void a(j jVar) {
        p();
        int i10 = this.f13707p;
        if (i10 <= 0) {
            e2.a.e("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f13707p = i11;
        if (i11 == 0) {
            this.f13706o = 0;
            androidx.mediarouter.app.c cVar = this.f13705n;
            String str = d0.f7188a;
            cVar.removeCallbacksAndMessages(null);
            android.support.v4.media.session.f fVar = this.f13709r;
            synchronized (fVar) {
                fVar.removeCallbacksAndMessages(null);
                fVar.f530b = true;
            }
            this.f13709r = null;
            this.f13708q.quit();
            this.f13708q = null;
            this.f13710s = null;
            this.f13711t = null;
            this.f13713w = null;
            this.f13714x = null;
            byte[] bArr = this.f13712u;
            if (bArr != null) {
                this.f13696b.G(bArr);
                this.f13712u = null;
            }
        }
        if (jVar != null) {
            this.h.n(jVar);
            if (this.h.i(jVar) == 0) {
                jVar.e();
            }
        }
        a4.m mVar = this.d;
        int i12 = this.f13707p;
        e eVar = (e) mVar.f273b;
        if (i12 == 1 && eVar.E > 0 && eVar.v != -9223372036854775807L) {
            eVar.f13727y.add(this);
            Handler handler = eVar.J;
            handler.getClass();
            handler.postAtTime(new v1(this, 22), this, SystemClock.uptimeMillis() + eVar.v);
        } else if (i12 == 0) {
            eVar.f13725w.remove(this);
            if (eVar.G == this) {
                eVar.G = null;
            }
            if (eVar.H == this) {
                eVar.H = null;
            }
            y yVar = eVar.f13722n;
            HashSet hashSet = (HashSet) yVar.f13824b;
            hashSet.remove(this);
            if (((b) yVar.f13825c) == this) {
                yVar.f13825c = null;
                if (!hashSet.isEmpty()) {
                    b bVar = (b) hashSet.iterator().next();
                    yVar.f13825c = bVar;
                    q p5 = bVar.f13696b.p();
                    bVar.f13714x = p5;
                    android.support.v4.media.session.f fVar2 = bVar.f13709r;
                    String str2 = d0.f7188a;
                    p5.getClass();
                    fVar2.getClass();
                    fVar2.obtainMessage(1, new a(u2.u.f42455b.getAndIncrement(), true, SystemClock.elapsedRealtime(), p5)).sendToTarget();
                }
            }
            if (eVar.v != -9223372036854775807L) {
                Handler handler2 = eVar.J;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                eVar.f13727y.remove(this);
            }
        }
        eVar.g();
    }

    @Override
    public final void b(j jVar) {
        int i10;
        p();
        boolean z10 = false;
        if (this.f13707p < 0) {
            e2.a.e("DefaultDrmSession", "Session reference count less than zero: " + this.f13707p);
            this.f13707p = 0;
        }
        if (jVar != null) {
            e2.i iVar = this.h;
            synchronized (iVar.f7205a) {
                try {
                    ArrayList arrayList = new ArrayList(iVar.d);
                    arrayList.add(jVar);
                    iVar.d = DesugarCollections.unmodifiableList(arrayList);
                    Integer num = (Integer) iVar.f7206b.get(jVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(iVar.f7207c);
                        hashSet.add(jVar);
                        iVar.f7207c = DesugarCollections.unmodifiableSet(hashSet);
                    }
                    HashMap hashMap = iVar.f7206b;
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
        int i11 = this.f13707p + 1;
        this.f13707p = i11;
        if (i11 == 1) {
            if (this.f13706o == 2) {
                z10 = true;
            }
            e2.d.g(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f13708q = handlerThread;
            handlerThread.start();
            this.f13709r = new android.support.v4.media.session.f(this, this.f13708q.getLooper());
            if (n()) {
                j(true);
            }
        } else if (jVar != null && k() && this.h.i(jVar) == 1) {
            jVar.c(this.f13706o);
        }
        e eVar = (e) this.d.f273b;
        if (eVar.v != -9223372036854775807L) {
            eVar.f13727y.remove(this);
            Handler handler = eVar.J;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override
    public final UUID c() {
        p();
        return this.f13703l;
    }

    @Override
    public final boolean d() {
        p();
        return this.e;
    }

    @Override
    public final int e() {
        p();
        return this.f13706o;
    }

    @Override
    public final boolean f(String str) {
        p();
        byte[] bArr = this.f13712u;
        e2.d.h(bArr);
        return this.f13696b.j0(str, bArr);
    }

    @Override
    public final f g() {
        p();
        if (this.f13706o == 1) {
            return this.f13711t;
        }
        return null;
    }

    @Override
    public final h2.b h() {
        p();
        return this.f13710s;
    }

    public final void i(g0 g0Var) {
        Set<j> set;
        e2.i iVar = this.h;
        synchronized (iVar.f7205a) {
            set = iVar.f7207c;
        }
        for (j jVar : set) {
            jVar.a();
        }
    }

    public final void j(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.j(boolean):void");
    }

    public final boolean k() {
        int i10 = this.f13706o;
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
                if (!(th2 instanceof NotProvisionedException) && !a0.b(th2)) {
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
        this.f13711t = new f(i11, th2);
        e2.a.f("DefaultDrmSession", "DRM session error", th2);
        if (th2 instanceof Exception) {
            e2.i iVar = this.h;
            synchronized (iVar.f7205a) {
                set = iVar.f7207c;
            }
            for (j jVar : set) {
                jVar.d((Exception) th2);
            }
        } else if (th2 instanceof Error) {
            if (!a0.c(th2) && !a0.b(th2)) {
                throw ((Error) th2);
            }
        } else {
            throw new IllegalStateException("Unexpected Throwable subclass", th2);
        }
        if (this.f13706o != 4) {
            this.f13706o = 1;
        }
    }

    public final void m(Throwable th2, boolean z10) {
        int i10;
        if (!(th2 instanceof NotProvisionedException) && !a0.b(th2)) {
            if (z10) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            l(i10, th2);
            return;
        }
        this.f13697c.q(this);
    }

    public final boolean n() {
        throw new UnsupportedOperationException("Method not decompiled: n2.b.n():boolean");
    }

    public final void o(int i10, boolean z10, byte[] bArr) {
        try {
            p Z = this.f13696b.Z(bArr, this.f13695a, i10, this.f13699g);
            this.f13713w = Z;
            android.support.v4.media.session.f fVar = this.f13709r;
            String str = d0.f7188a;
            Z.getClass();
            fVar.getClass();
            fVar.obtainMessage(2, new a(u2.u.f42455b.getAndIncrement(), z10, SystemClock.elapsedRealtime(), Z)).sendToTarget();
        } catch (Exception | NoSuchMethodError e) {
            m(e, true);
        }
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f13704m;
        if (currentThread != looper.getThread()) {
            e2.a.o("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
