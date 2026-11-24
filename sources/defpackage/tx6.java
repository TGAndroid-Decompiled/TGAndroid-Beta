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
public final class tx6 {
    public static final q8a B = new q8a(1);
    public static final sdb C = xwe.a(new k50((byte) 5));
    public final Bundle A;
    public final Object a = new Object();
    public final Uri b;
    public final rx6 c;
    public final qx6 d;
    public final dhf e;
    public final Context f;
    public final oz6 g;
    public final ly6 h;
    public final String i;
    public final u8a j;
    public final uw6 k;
    public final Handler l;
    public final wk0 m;
    public final nx6 n;
    public final Handler o;
    public final boolean p;
    public final boolean q;
    public final y79 r;
    public ye8 s;
    public cf8 t;
    public go6 u;
    public boolean v;
    public final short w;
    public boolean x;
    public final y79 y;
    public final y79 z;

    public tx6(uw6 uw6Var, Context context, String str, re8 re8Var, y79 y79Var, y79 y79Var2, y79 y79Var3, dhf dhfVar, Bundle bundle, Bundle bundle2, wk0 wk0Var) {
        ncd.e("MediaSessionImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.11.1] [" + hac.a + "]");
        this.k = uw6Var;
        this.f = context;
        this.i = str;
        this.y = y79Var;
        this.z = y79Var2;
        this.r = y79Var3;
        this.e = dhfVar;
        this.A = bundle2;
        this.m = wk0Var;
        this.p = true;
        this.q = true;
        oz6 oz6Var = new oz6(this);
        this.g = oz6Var;
        this.o = new Handler(Looper.getMainLooper());
        Looper B0 = re8Var.B0();
        Handler handler = new Handler(B0);
        this.l = handler;
        this.s = ye8.H;
        this.c = new rx6(this, B0);
        this.d = new qx6(this, B0);
        Uri build = new Uri.Builder().scheme("androidx").authority("media3.session").appendPath(str).build();
        this.b = build;
        ly6 ly6Var = new ly6(this, build, handler, bundle, y79Var, y79Var2, qw6.f, qw6.h, bundle2);
        this.h = ly6Var;
        this.j = new u8a(Process.myUid(), context.getPackageName(), oz6Var, bundle, ((bx6) ly6Var.p.b).c.b);
        cf8 cf8Var = new cf8(re8Var);
        this.t = cf8Var;
        hac.X(handler, new lj6(this, cf8Var, (byte) 16));
        this.w = (short) 3000;
        this.n = new nx6(this, (byte) 1);
        hac.X(handler, new nx6(this, (byte) 2));
    }

    public static boolean j(sw6 sw6Var) {
        if (sw6Var != null && Objects.equals(sw6Var.a.a.a, "com.android.systemui")) {
            return true;
        }
        return false;
    }

    public final boolean a(android.view.KeyEvent r8, boolean r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tx6.a(android.view.KeyEvent, boolean, boolean):boolean");
    }

    public final t76 b(sw6 sw6Var, cj6 cj6Var) {
        int i;
        t76 t76Var;
        oz6 oz6Var = this.g;
        try {
            uz0 R = oz6Var.b.R(sw6Var);
            if (R != null) {
                t6a a = R.a(B);
                i = a.n;
                t76Var = a;
            } else if (!g(sw6Var)) {
                return kke.c(new q8a(-100));
            } else {
                i = 0;
                t76Var = kke.c(new q8a(0));
            }
            rw6 rw6Var = sw6Var.e;
            if (rw6Var != null) {
                Bundle bundle = Bundle.EMPTY;
                rw6Var.a(i, (r7a) cj6Var.b);
            }
            return t76Var;
        } catch (DeadObjectException unused) {
            oz6Var.b.i0(sw6Var);
            return kke.c(new q8a(-100));
        } catch (RemoteException e) {
            ncd.g("MediaSessionImpl", "Exception in " + sw6Var, e);
            return kke.c(new q8a(-1));
        }
    }

    public final void c(sw6 sw6Var, sx6 sx6Var) {
        int i;
        oz6 oz6Var = this.g;
        try {
            uz0 R = oz6Var.b.R(sw6Var);
            if (R != null) {
                i = R.d();
            } else if (g(sw6Var)) {
                i = 0;
            } else {
                return;
            }
            rw6 rw6Var = sw6Var.e;
            if (rw6Var != null) {
                sx6Var.d(rw6Var, i);
            }
        } catch (DeadObjectException unused) {
            oz6Var.b.i0(sw6Var);
        } catch (RemoteException e) {
            ncd.g("MediaSessionImpl", "Exception in " + sw6Var, e);
        }
    }

    public final void d(sx6 sx6Var) {
        mo5 M = this.g.b.M();
        for (int i = 0; i < M.size(); i++) {
            c((sw6) M.get(i), sx6Var);
        }
        try {
            sx6Var.d(this.h.l, 0);
        } catch (RemoteException e) {
            ncd.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final sw6 e() {
        t();
        mo5 M = this.g.b.M();
        for (int i = 0; i < M.size(); i++) {
            sw6 sw6Var = (sw6) M.get(i);
            if (h(sw6Var)) {
                return sw6Var;
            }
        }
        return null;
    }

    public final void f(ne8 ne8Var) {
        this.c.a(false, false);
        d(new cj6(ne8Var, (byte) 5));
        try {
            trc trcVar = this.h.l;
            of3 of3Var = this.s.s;
            trcVar.r();
        } catch (RemoteException e) {
            ncd.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final boolean g(sw6 sw6Var) {
        if (!this.g.b.X(sw6Var) && !this.h.g.X(sw6Var)) {
            return false;
        }
        return true;
    }

    public final boolean h(sw6 sw6Var) {
        if (!Objects.equals(sw6Var.a.a.a, this.f.getPackageName()) || sw6Var.b == 0 || !new Bundle(sw6Var.f).getBoolean("androidx.media3.session.MediaNotificationManager", false)) {
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

    public final t76 k(sw6 sw6Var, y79 y79Var) {
        q(sw6Var);
        this.e.getClass();
        return dhf.H(y79Var);
    }

    public final t76 l(sw6 sw6Var) {
        s7a s7aVar;
        ne8 ne8Var;
        mo5 q;
        mo5 mo5Var;
        mo5 mo5Var2;
        mo5 q2;
        if (this.x && j(sw6Var)) {
            ly6 ly6Var = this.h;
            ly6Var.getClass();
            s7a s7aVar2 = s7a.b;
            ne8 ne8Var2 = ne8.b;
            s7a s7aVar3 = ly6Var.z;
            s7aVar3.getClass();
            ne8 ne8Var3 = ly6Var.A;
            ne8Var3.getClass();
            if (!ly6Var.y.isEmpty()) {
                mo5 mo5Var3 = ly6Var.y;
                if (mo5Var3 == null) {
                    q2 = null;
                } else {
                    q2 = mo5.q(mo5Var3);
                }
                mo5Var2 = q2;
                mo5Var = null;
            } else {
                mo5 mo5Var4 = ly6Var.x;
                if (mo5Var4 == null) {
                    q = null;
                } else {
                    q = mo5.q(mo5Var4);
                }
                mo5Var = q;
                mo5Var2 = null;
            }
            return kke.c(new qw6(s7aVar3, ne8Var3, mo5Var, mo5Var2, null));
        }
        this.e.getClass();
        Object obj = uw6.c;
        uw6 uw6Var = this.k;
        qw6 qw6Var = uw6Var.b;
        if (qw6Var == null) {
            Bundle l = ts2.l("androidx.media3.session.CALLBACK_NOT_IMPLEMENTED", true);
            s7a s7aVar4 = s7a.b;
            ne8 ne8Var4 = ne8.b;
            s7a s7aVar5 = s7a.b;
            s7aVar5.getClass();
            ne8 ne8Var5 = ne8.b;
            ne8Var5.getClass();
            qw6 qw6Var2 = new qw6(s7aVar5, ne8Var5, null, null, l);
            uw6Var.b = qw6Var2;
            qw6Var = qw6Var2;
        }
        Bundle bundle = qw6Var.e;
        if (bundle != null && bundle.getBoolean("androidx.media3.session.CALLBACK_NOT_IMPLEMENTED", false)) {
            if (sw6Var.d) {
                s7aVar = qw6.f;
                ne8Var = qw6.h;
            } else {
                s7aVar = qw6.g;
                ne8Var = qw6.i;
            }
            return hac.h0(kke.c(new qw6(s7aVar, ne8Var, null, null, null)), new nv4(this, sw6Var, (byte) 27));
        }
        s(sw6Var, qw6Var);
        return kke.c(qw6Var);
    }

    public final ao5 m(sw6 sw6Var) {
        q(sw6Var);
        this.e.getClass();
        return kke.c(new q8a(-6));
    }

    public final void n(sw6 sw6Var) {
        q(sw6Var);
        this.e.getClass();
    }

    public final q9a o(sw6 sw6Var, y79 y79Var, final int i, final long j) {
        q(sw6Var);
        this.e.getClass();
        return hac.h0(dhf.H(y79Var), new ny() {
            @Override
            public final t76 mo22apply(Object obj) {
                return kke.c(new tw6((List) obj, i, j));
            }
        });
    }

    public final void p() {
        boolean z;
        ncd.e("MediaSessionImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.11.1] [" + hac.a + "] [" + ct6.b() + "]");
        synchronized (this.a) {
            if (this.v) {
                return;
            }
            this.v = true;
            qx6 qx6Var = this.d;
            fp6 fp6Var = qx6Var.a;
            if (fp6Var != null) {
                qx6Var.removeCallbacks(fp6Var);
                qx6Var.a = null;
            }
            this.l.removeCallbacksAndMessages(null);
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            try {
            } catch (Exception e) {
                ncd.g("MediaSessionImpl", "Exception thrown while closing", e);
            }
            if (this.l.getLooper().getThread().isAlive()) {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                hac.X(this.l, new fp6(this, atomicBoolean, countDownLatch, (byte) 7));
                z = countDownLatch.await(1000L, TimeUnit.MILLISECONDS);
                if (z && atomicBoolean.compareAndSet(false, true)) {
                    try {
                        this.h.n0();
                        this.g.T();
                        return;
                    } catch (RuntimeException e2) {
                        ncd.g("MediaSessionImpl", "Exception thrown during emergency main thread release fallback", e2);
                        return;
                    }
                }
            }
            z = false;
            if (z) {
            }
        }
    }

    public final sw6 q(sw6 sw6Var) {
        sw6 e;
        if (this.x && j(sw6Var) && (e = e()) != null) {
            return e;
        }
        return sw6Var;
    }

    public final void r() {
        long j = this.w;
        Handler handler = this.l;
        nx6 nx6Var = this.n;
        handler.removeCallbacks(nx6Var);
        if (this.q && j > 0) {
            if (this.t.i() || this.t.f()) {
                handler.postDelayed(nx6Var, j);
            }
        }
    }

    public final void s(sw6 sw6Var, qw6 qw6Var) {
        if (h(sw6Var)) {
            qw6Var.getClass();
            boolean z = true;
            this.x = true;
            mo5 mo5Var = qw6Var.d;
            uw6 uw6Var = this.k;
            if (mo5Var == null) {
                tx6 tx6Var = uw6Var.a;
                tx6Var.t();
                mo5Var = tx6Var.z;
            }
            boolean isEmpty = mo5Var.isEmpty();
            ly6 ly6Var = this.h;
            if (isEmpty) {
                mo5 mo5Var2 = qw6Var.c;
                if (mo5Var2 == null) {
                    tx6 tx6Var2 = uw6Var.a;
                    tx6Var2.t();
                    mo5Var2 = tx6Var2.y;
                }
                ly6Var.x = mo5Var2;
            } else {
                ly6Var.y = mo5Var;
                ly6Var.p0();
            }
            s7a s7aVar = qw6Var.a;
            ne8 ne8Var = qw6Var.b;
            if (ly6Var.A.a(17) == ne8Var.a(17)) {
                z = false;
            }
            ly6Var.z = s7aVar;
            ly6Var.A = ne8Var;
            if (!ly6Var.y.isEmpty()) {
                ly6Var.p0();
            }
            tx6 tx6Var3 = ly6Var.j;
            if (z) {
                tx6Var3.t();
                ly6Var.m0(new fy6(ly6Var, tx6Var3.t, (byte) 0));
                return;
            }
            tx6Var3.t();
            ly6Var.q0(tx6Var3.t);
        }
    }

    public final void t() {
        if (Looper.myLooper() == this.l.getLooper()) {
            return;
        }
        dq9.m("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
    }
}
