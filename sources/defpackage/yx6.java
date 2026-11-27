package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import j$.util.Objects;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
public final class yx6 {
    public static final gaa B = new gaa(1);
    public static final mfb C = nze.a(new m40((byte) 5));
    public final Bundle A;
    public final Object a = new Object();
    public final Uri b;
    public final wx6 c;
    public final vx6 d;
    public final sjf e;
    public final Context f;
    public final sz6 g;
    public final qy6 h;
    public final String i;
    public final kaa j;
    public final zw6 k;
    public final Handler l;
    public final xj0 m;
    public final sx6 n;
    public final Handler o;
    public final boolean p;
    public final boolean q;
    public final j99 r;
    public kg8 s;
    public og8 t;
    public ko6 u;
    public boolean v;
    public final short w;
    public boolean x;
    public final j99 y;
    public final j99 z;

    public yx6(zw6 zw6Var, Context context, String str, dg8 dg8Var, j99 j99Var, j99 j99Var2, j99 j99Var3, sjf sjfVar, Bundle bundle, Bundle bundle2, xj0 xj0Var) {
        efd.e("MediaSessionImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.11.1] [" + gcc.a + "]");
        this.k = zw6Var;
        this.f = context;
        this.i = str;
        this.y = j99Var;
        this.z = j99Var2;
        this.r = j99Var3;
        this.e = sjfVar;
        this.A = bundle2;
        this.m = xj0Var;
        this.p = true;
        this.q = true;
        sz6 sz6Var = new sz6(this);
        this.g = sz6Var;
        this.o = new Handler(Looper.getMainLooper());
        Looper B0 = dg8Var.B0();
        Handler handler = new Handler(B0);
        this.l = handler;
        this.s = kg8.H;
        this.c = new wx6(this, B0);
        this.d = new vx6(this, B0);
        Uri build = new Uri.Builder().scheme("androidx").authority("media3.session").appendPath(str).build();
        this.b = build;
        qy6 qy6Var = new qy6(this, build, handler, bundle, j99Var, j99Var2, vw6.f, vw6.h, bundle2);
        this.h = qy6Var;
        this.j = new kaa(Process.myUid(), context.getPackageName(), sz6Var, bundle, ((gx6) qy6Var.p.b).c.b);
        og8 og8Var = new og8(dg8Var);
        this.t = og8Var;
        gcc.X(handler, new mn6(this, og8Var, (byte) 12));
        this.w = (short) 3000;
        this.n = new sx6(this, (byte) 1);
        gcc.X(handler, new sx6(this, (byte) 2));
    }

    public static boolean j(xw6 xw6Var) {
        if (xw6Var != null && Objects.equals(xw6Var.a.a.a, "com.android.systemui")) {
            return true;
        }
        return false;
    }

    public final boolean a(android.view.KeyEvent r8, boolean r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yx6.a(android.view.KeyEvent, boolean, boolean):boolean");
    }

    public final x76 b(xw6 xw6Var, bm6 bm6Var) {
        int i;
        x76 x76Var;
        sz6 sz6Var = this.g;
        try {
            vy0 Q = sz6Var.b.Q(xw6Var);
            if (Q != null) {
                j8a a = Q.a(B);
                i = a.n;
                x76Var = a;
            } else if (!g(xw6Var)) {
                return fne.c(new gaa(-100));
            } else {
                i = 0;
                x76Var = fne.c(new gaa(0));
            }
            ww6 ww6Var = xw6Var.e;
            if (ww6Var != null) {
                Bundle bundle = Bundle.EMPTY;
                ww6Var.a(i, (h9a) bm6Var.b);
            }
            return x76Var;
        } catch (DeadObjectException unused) {
            sz6Var.b.k0(xw6Var);
            return fne.c(new gaa(-100));
        } catch (RemoteException e) {
            efd.g("MediaSessionImpl", "Exception in " + xw6Var, e);
            return fne.c(new gaa(-1));
        }
    }

    public final void c(xw6 xw6Var, xx6 xx6Var) {
        int i;
        sz6 sz6Var = this.g;
        try {
            vy0 Q = sz6Var.b.Q(xw6Var);
            if (Q != null) {
                i = Q.d();
            } else if (g(xw6Var)) {
                i = 0;
            } else {
                return;
            }
            ww6 ww6Var = xw6Var.e;
            if (ww6Var != null) {
                xx6Var.b(ww6Var, i);
            }
        } catch (DeadObjectException unused) {
            sz6Var.b.k0(xw6Var);
        } catch (RemoteException e) {
            efd.g("MediaSessionImpl", "Exception in " + xw6Var, e);
        }
    }

    public final void d(xx6 xx6Var) {
        po5 L = this.g.b.L();
        for (int i = 0; i < L.size(); i++) {
            c((xw6) L.get(i), xx6Var);
        }
        try {
            xx6Var.b(this.h.l, 0);
        } catch (RemoteException e) {
            efd.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final xw6 e() {
        t();
        po5 L = this.g.b.L();
        for (int i = 0; i < L.size(); i++) {
            xw6 xw6Var = (xw6) L.get(i);
            if (h(xw6Var)) {
                return xw6Var;
            }
        }
        return null;
    }

    public final void f(zf8 zf8Var) {
        this.c.a(false, false);
        d(new bm6(zf8Var, (byte) 4));
        try {
            guc gucVar = this.h.l;
            xe3 xe3Var = this.s.s;
            gucVar.r();
        } catch (RemoteException e) {
            efd.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final boolean g(xw6 xw6Var) {
        if (!this.g.b.Y(xw6Var) && !this.h.g.Y(xw6Var)) {
            return false;
        }
        return true;
    }

    public final boolean h(xw6 xw6Var) {
        if (!Objects.equals(xw6Var.a.a.a, this.f.getPackageName()) || xw6Var.b == 0 || !new Bundle(xw6Var.f).getBoolean("androidx.media3.session.MediaNotificationManager", false)) {
            return false;
        }
        return true;
    }

    public final boolean i() {
        boolean z;
        synchronized (this.a) {
            z = this.v;
        }
        return z;
    }

    public final x76 k(xw6 xw6Var, j99 j99Var) {
        q(xw6Var);
        this.e.getClass();
        return sjf.G(j99Var);
    }

    public final x76 l(xw6 xw6Var) {
        i9a i9aVar;
        zf8 zf8Var;
        po5 q;
        po5 po5Var;
        po5 po5Var2;
        po5 q2;
        if (this.x && j(xw6Var)) {
            qy6 qy6Var = this.h;
            qy6Var.getClass();
            i9a i9aVar2 = i9a.b;
            zf8 zf8Var2 = zf8.b;
            i9a i9aVar3 = qy6Var.z;
            i9aVar3.getClass();
            zf8 zf8Var3 = qy6Var.A;
            zf8Var3.getClass();
            if (!qy6Var.y.isEmpty()) {
                po5 po5Var3 = qy6Var.y;
                if (po5Var3 == null) {
                    q2 = null;
                } else {
                    q2 = po5.q(po5Var3);
                }
                po5Var2 = q2;
                po5Var = null;
            } else {
                po5 po5Var4 = qy6Var.x;
                if (po5Var4 == null) {
                    q = null;
                } else {
                    q = po5.q(po5Var4);
                }
                po5Var = q;
                po5Var2 = null;
            }
            return fne.c(new vw6(i9aVar3, zf8Var3, po5Var, po5Var2, null));
        }
        this.e.getClass();
        Object obj = zw6.c;
        zw6 zw6Var = this.k;
        vw6 vw6Var = zw6Var.b;
        if (vw6Var == null) {
            Bundle l = bs2.l("androidx.media3.session.CALLBACK_NOT_IMPLEMENTED", true);
            i9a i9aVar4 = i9a.b;
            zf8 zf8Var4 = zf8.b;
            i9a i9aVar5 = i9a.b;
            i9aVar5.getClass();
            zf8 zf8Var5 = zf8.b;
            zf8Var5.getClass();
            vw6 vw6Var2 = new vw6(i9aVar5, zf8Var5, null, null, l);
            zw6Var.b = vw6Var2;
            vw6Var = vw6Var2;
        }
        Bundle bundle = vw6Var.e;
        if (bundle != null && bundle.getBoolean("androidx.media3.session.CALLBACK_NOT_IMPLEMENTED", false)) {
            if (xw6Var.d) {
                i9aVar = vw6.f;
                zf8Var = vw6.h;
            } else {
                i9aVar = vw6.g;
                zf8Var = vw6.i;
            }
            return gcc.h0(fne.c(new vw6(i9aVar, zf8Var, null, null, null)), new rm6(this, xw6Var, (byte) 1));
        }
        s(xw6Var, vw6Var);
        return fne.c(vw6Var);
    }

    public final do5 m(xw6 xw6Var) {
        q(xw6Var);
        this.e.getClass();
        return fne.c(new gaa(-6));
    }

    public final void n(xw6 xw6Var) {
        q(xw6Var);
        this.e.getClass();
    }

    public final gba o(xw6 xw6Var, j99 j99Var, final int i, final long j) {
        q(xw6Var);
        this.e.getClass();
        return gcc.h0(sjf.G(j99Var), new nx() {
            @Override
            public final x76 apply(Object obj) {
                return fne.c(new yw6((List) obj, i, j));
            }
        });
    }

    public final void p() {
        boolean z;
        efd.e("MediaSessionImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.11.1] [" + gcc.a + "] [" + gt6.b() + "]");
        synchronized (this.a) {
            if (this.v) {
                return;
            }
            this.v = true;
            vx6 vx6Var = this.d;
            yg6 yg6Var = vx6Var.a;
            if (yg6Var != null) {
                vx6Var.removeCallbacks(yg6Var);
                vx6Var.a = null;
            }
            this.l.removeCallbacksAndMessages(null);
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            try {
            } catch (Exception e) {
                efd.g("MediaSessionImpl", "Exception thrown while closing", e);
            }
            if (this.l.getLooper().getThread().isAlive()) {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                gcc.X(this.l, new yg6(this, atomicBoolean, countDownLatch, (byte) 10));
                z = countDownLatch.await(1000L, TimeUnit.MILLISECONDS);
                if (z && atomicBoolean.compareAndSet(false, true)) {
                    try {
                        this.h.n0();
                        this.g.T();
                        return;
                    } catch (RuntimeException e2) {
                        efd.g("MediaSessionImpl", "Exception thrown during emergency main thread release fallback", e2);
                        return;
                    }
                }
            }
            z = false;
            if (z) {
            }
        }
    }

    public final xw6 q(xw6 xw6Var) {
        xw6 e;
        if (this.x && j(xw6Var) && (e = e()) != null) {
            return e;
        }
        return xw6Var;
    }

    public final void r() {
        long j = this.w;
        Handler handler = this.l;
        sx6 sx6Var = this.n;
        handler.removeCallbacks(sx6Var);
        if (this.q && j > 0) {
            if (this.t.i() || this.t.e()) {
                handler.postDelayed(sx6Var, j);
            }
        }
    }

    public final void s(xw6 xw6Var, vw6 vw6Var) {
        if (h(xw6Var)) {
            vw6Var.getClass();
            boolean z = true;
            this.x = true;
            po5 po5Var = vw6Var.d;
            zw6 zw6Var = this.k;
            if (po5Var == null) {
                yx6 yx6Var = zw6Var.a;
                yx6Var.t();
                po5Var = yx6Var.z;
            }
            boolean isEmpty = po5Var.isEmpty();
            qy6 qy6Var = this.h;
            if (isEmpty) {
                po5 po5Var2 = vw6Var.c;
                if (po5Var2 == null) {
                    yx6 yx6Var2 = zw6Var.a;
                    yx6Var2.t();
                    po5Var2 = yx6Var2.y;
                }
                qy6Var.x = po5Var2;
            } else {
                qy6Var.y = po5Var;
                qy6Var.p0();
            }
            i9a i9aVar = vw6Var.a;
            zf8 zf8Var = vw6Var.b;
            if (qy6Var.A.a(17) == zf8Var.a(17)) {
                z = false;
            }
            qy6Var.z = i9aVar;
            qy6Var.A = zf8Var;
            if (!qy6Var.y.isEmpty()) {
                qy6Var.p0();
            }
            yx6 yx6Var3 = qy6Var.j;
            if (z) {
                yx6Var3.t();
                qy6Var.m0(new ky6(qy6Var, yx6Var3.t, (byte) 0));
                return;
            }
            yx6Var3.t();
            qy6Var.q0(yx6Var3.t);
        }
    }

    public final void t() {
        if (Looper.myLooper() == this.l.getLooper()) {
            return;
        }
        grb.i("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
    }
}
