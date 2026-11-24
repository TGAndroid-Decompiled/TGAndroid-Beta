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
public final class tv6 {
    public static final o6a B = new o6a(1);
    public static final qbb C = vue.a(new k40((byte) 5));
    public final Bundle A;
    public final Object a = new Object();
    public final Uri b;
    public final rv6 c;
    public final qv6 d;
    public final cff e;
    public final Context f;
    public final ox6 g;
    public final lw6 h;
    public final String i;
    public final s6a j;
    public final uu6 k;
    public final Handler l;
    public final wj0 m;
    public final nv6 n;
    public final Handler o;
    public final boolean p;
    public final boolean q;
    public final w59 r;
    public wc8 s;
    public ad8 t;
    public fm6 u;
    public boolean v;
    public final short w;
    public boolean x;
    public final w59 y;
    public final w59 z;

    public tv6(uu6 uu6Var, Context context, String str, oc8 oc8Var, w59 w59Var, w59 w59Var2, w59 w59Var3, cff cffVar, Bundle bundle, Bundle bundle2, wj0 wj0Var) {
        lad.e("MediaSessionImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.11.1] [" + g8c.a + "]");
        this.k = uu6Var;
        this.f = context;
        this.i = str;
        this.y = w59Var;
        this.z = w59Var2;
        this.r = w59Var3;
        this.e = cffVar;
        this.A = bundle2;
        this.m = wj0Var;
        this.p = true;
        this.q = true;
        ox6 ox6Var = new ox6(this);
        this.g = ox6Var;
        this.o = new Handler(Looper.getMainLooper());
        Looper B0 = oc8Var.B0();
        Handler handler = new Handler(B0);
        this.l = handler;
        this.s = wc8.H;
        this.c = new rv6(this, B0);
        this.d = new qv6(this, B0);
        Uri build = new Uri.Builder().scheme("androidx").authority("media3.session").appendPath(str).build();
        this.b = build;
        lw6 lw6Var = new lw6(this, build, handler, bundle, w59Var, w59Var2, qu6.f, qu6.h, bundle2);
        this.h = lw6Var;
        this.j = new s6a(Process.myUid(), context.getPackageName(), ox6Var, bundle, ((bv6) lw6Var.p.b).c.b);
        ad8 ad8Var = new ad8(oc8Var);
        this.t = ad8Var;
        g8c.X(handler, new oh6(this, ad8Var, (byte) 15));
        this.w = (short) 3000;
        this.n = new nv6(this, (byte) 1);
        g8c.X(handler, new nv6(this, (byte) 2));
    }

    public static boolean j(su6 su6Var) {
        if (su6Var != null && Objects.equals(su6Var.a.a.a, "com.android.systemui")) {
            return true;
        }
        return false;
    }

    public final boolean a(android.view.KeyEvent r8, boolean r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tv6.a(android.view.KeyEvent, boolean, boolean):boolean");
    }

    public final t56 b(su6 su6Var, im6 im6Var) {
        int i;
        t56 t56Var;
        ox6 ox6Var = this.g;
        try {
            ny0 P = ox6Var.b.P(su6Var);
            if (P != null) {
                r4a a = P.a(B);
                i = a.n;
                t56Var = a;
            } else if (!g(su6Var)) {
                return jie.c(new o6a(-100));
            } else {
                i = 0;
                t56Var = jie.c(new o6a(0));
            }
            ru6 ru6Var = su6Var.e;
            if (ru6Var != null) {
                Bundle bundle = Bundle.EMPTY;
                ru6Var.a(i, (p5a) im6Var.b);
            }
            return t56Var;
        } catch (DeadObjectException unused) {
            ox6Var.b.e0(su6Var);
            return jie.c(new o6a(-100));
        } catch (RemoteException e) {
            lad.g("MediaSessionImpl", "Exception in " + su6Var, e);
            return jie.c(new o6a(-1));
        }
    }

    public final void c(su6 su6Var, sv6 sv6Var) {
        int i;
        ox6 ox6Var = this.g;
        try {
            ny0 P = ox6Var.b.P(su6Var);
            if (P != null) {
                i = P.d();
            } else if (g(su6Var)) {
                i = 0;
            } else {
                return;
            }
            ru6 ru6Var = su6Var.e;
            if (ru6Var != null) {
                sv6Var.f(ru6Var, i);
            }
        } catch (DeadObjectException unused) {
            ox6Var.b.e0(su6Var);
        } catch (RemoteException e) {
            lad.g("MediaSessionImpl", "Exception in " + su6Var, e);
        }
    }

    public final void d(sv6 sv6Var) {
        mm5 K = this.g.b.K();
        for (int i = 0; i < K.size(); i++) {
            c((su6) K.get(i), sv6Var);
        }
        try {
            sv6Var.f(this.h.l, 0);
        } catch (RemoteException e) {
            lad.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final su6 e() {
        t();
        mm5 K = this.g.b.K();
        for (int i = 0; i < K.size(); i++) {
            su6 su6Var = (su6) K.get(i);
            if (h(su6Var)) {
                return su6Var;
            }
        }
        return null;
    }

    public final void f(kc8 kc8Var) {
        this.c.a(false, false);
        d(new im6(kc8Var, (byte) 2));
        try {
            spc spcVar = this.h.l;
            de3 de3Var = this.s.s;
            spcVar.r();
        } catch (RemoteException e) {
            lad.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final boolean g(su6 su6Var) {
        if (!this.g.b.V(su6Var) && !this.h.g.V(su6Var)) {
            return false;
        }
        return true;
    }

    public final boolean h(su6 su6Var) {
        if (!Objects.equals(su6Var.a.a.a, this.f.getPackageName()) || su6Var.b == 0 || !new Bundle(su6Var.f).getBoolean("androidx.media3.session.MediaNotificationManager", false)) {
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

    public final t56 k(su6 su6Var, w59 w59Var) {
        q(su6Var);
        this.e.getClass();
        return cff.G(w59Var);
    }

    public final t56 l(su6 su6Var) {
        q5a q5aVar;
        kc8 kc8Var;
        mm5 q;
        mm5 mm5Var;
        mm5 mm5Var2;
        mm5 q2;
        if (this.x && j(su6Var)) {
            lw6 lw6Var = this.h;
            lw6Var.getClass();
            q5a q5aVar2 = q5a.b;
            kc8 kc8Var2 = kc8.b;
            q5a q5aVar3 = lw6Var.z;
            q5aVar3.getClass();
            kc8 kc8Var3 = lw6Var.A;
            kc8Var3.getClass();
            if (!lw6Var.y.isEmpty()) {
                mm5 mm5Var3 = lw6Var.y;
                if (mm5Var3 == null) {
                    q2 = null;
                } else {
                    q2 = mm5.q(mm5Var3);
                }
                mm5Var2 = q2;
                mm5Var = null;
            } else {
                mm5 mm5Var4 = lw6Var.x;
                if (mm5Var4 == null) {
                    q = null;
                } else {
                    q = mm5.q(mm5Var4);
                }
                mm5Var = q;
                mm5Var2 = null;
            }
            return jie.c(new qu6(q5aVar3, kc8Var3, mm5Var, mm5Var2, null));
        }
        this.e.getClass();
        Object obj = uu6.c;
        uu6 uu6Var = this.k;
        qu6 qu6Var = uu6Var.b;
        if (qu6Var == null) {
            Bundle l = ir2.l("androidx.media3.session.CALLBACK_NOT_IMPLEMENTED", true);
            q5a q5aVar4 = q5a.b;
            kc8 kc8Var4 = kc8.b;
            q5a q5aVar5 = q5a.b;
            q5aVar5.getClass();
            kc8 kc8Var5 = kc8.b;
            kc8Var5.getClass();
            qu6 qu6Var2 = new qu6(q5aVar5, kc8Var5, null, null, l);
            uu6Var.b = qu6Var2;
            qu6Var = qu6Var2;
        }
        Bundle bundle = qu6Var.e;
        if (bundle != null && bundle.getBoolean("androidx.media3.session.CALLBACK_NOT_IMPLEMENTED", false)) {
            if (su6Var.d) {
                q5aVar = qu6.f;
                kc8Var = qu6.h;
            } else {
                q5aVar = qu6.g;
                kc8Var = qu6.i;
            }
            return g8c.h0(jie.c(new qu6(q5aVar, kc8Var, null, null, null)), new h45(this, su6Var, (byte) 26));
        }
        s(su6Var, qu6Var);
        return jie.c(qu6Var);
    }

    public final am5 m(su6 su6Var) {
        q(su6Var);
        this.e.getClass();
        return jie.c(new o6a(-6));
    }

    public final void n(su6 su6Var) {
        q(su6Var);
        this.e.getClass();
    }

    public final p7a o(su6 su6Var, w59 w59Var, final int i, final long j) {
        q(su6Var);
        this.e.getClass();
        return g8c.h0(cff.G(w59Var), new mx() {
            @Override
            public final t56 mo15apply(Object obj) {
                return jie.c(new tu6((List) obj, i, j));
            }
        });
    }

    public final void p() {
        boolean z;
        lad.e("MediaSessionImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.11.1] [" + g8c.a + "] [" + cr6.b() + "]");
        synchronized (this.a) {
            if (this.v) {
                return;
            }
            this.v = true;
            qv6 qv6Var = this.d;
            lo6 lo6Var = qv6Var.a;
            if (lo6Var != null) {
                qv6Var.removeCallbacks(lo6Var);
                qv6Var.a = null;
            }
            this.l.removeCallbacksAndMessages(null);
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            try {
            } catch (Exception e) {
                lad.g("MediaSessionImpl", "Exception thrown while closing", e);
            }
            if (this.l.getLooper().getThread().isAlive()) {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                g8c.X(this.l, new lo6(this, atomicBoolean, countDownLatch, (byte) 5));
                z = countDownLatch.await(1000L, TimeUnit.MILLISECONDS);
                if (z && atomicBoolean.compareAndSet(false, true)) {
                    try {
                        this.h.n0();
                        this.g.T();
                        return;
                    } catch (RuntimeException e2) {
                        lad.g("MediaSessionImpl", "Exception thrown during emergency main thread release fallback", e2);
                        return;
                    }
                }
            }
            z = false;
            if (z) {
            }
        }
    }

    public final su6 q(su6 su6Var) {
        su6 e;
        if (this.x && j(su6Var) && (e = e()) != null) {
            return e;
        }
        return su6Var;
    }

    public final void r() {
        long j = this.w;
        Handler handler = this.l;
        nv6 nv6Var = this.n;
        handler.removeCallbacks(nv6Var);
        if (this.q && j > 0) {
            if (this.t.j() || this.t.d()) {
                handler.postDelayed(nv6Var, j);
            }
        }
    }

    public final void s(su6 su6Var, qu6 qu6Var) {
        if (h(su6Var)) {
            qu6Var.getClass();
            boolean z = true;
            this.x = true;
            mm5 mm5Var = qu6Var.d;
            uu6 uu6Var = this.k;
            if (mm5Var == null) {
                tv6 tv6Var = uu6Var.a;
                tv6Var.t();
                mm5Var = tv6Var.z;
            }
            boolean isEmpty = mm5Var.isEmpty();
            lw6 lw6Var = this.h;
            if (isEmpty) {
                mm5 mm5Var2 = qu6Var.c;
                if (mm5Var2 == null) {
                    tv6 tv6Var2 = uu6Var.a;
                    tv6Var2.t();
                    mm5Var2 = tv6Var2.y;
                }
                lw6Var.x = mm5Var2;
            } else {
                lw6Var.y = mm5Var;
                lw6Var.p0();
            }
            q5a q5aVar = qu6Var.a;
            kc8 kc8Var = qu6Var.b;
            if (lw6Var.A.a(17) == kc8Var.a(17)) {
                z = false;
            }
            lw6Var.z = q5aVar;
            lw6Var.A = kc8Var;
            if (!lw6Var.y.isEmpty()) {
                lw6Var.p0();
            }
            tv6 tv6Var3 = lw6Var.j;
            if (z) {
                tv6Var3.t();
                lw6Var.m0(new fw6(lw6Var, tv6Var3.t, (byte) 0));
                return;
            }
            tv6Var3.t();
            lw6Var.q0(tv6Var3.t);
        }
    }

    public final void t() {
        if (Looper.myLooper() == this.l.getLooper()) {
            return;
        }
        sc8.j("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
    }
}
