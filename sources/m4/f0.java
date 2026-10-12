package m4;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import b2.b2;
import b2.w1;
import bi.h4;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import ji.m5;
import ji.v2;
import v7.q8;
import v7.u6;
import v7.w6;
public class f0 {
    public static final t1 B = new t1(1);
    public static final d9.u C = w6.a(new a3.s(5));
    public final Bundle A;
    public final Object f15424a = new Object();
    public final Uri f15425b;
    public final c0 f15426c;
    public final b0 d;
    public final pb.a e;
    public final Context f15427f;
    public final j1 f15428g;
    public final q0 h;
    public final String f15429i;
    public final u1 f15430j;
    public final y f15431k;
    public final Handler f15432l;
    public final e2.d f15433m;
    public final z f15434n;
    public final Handler f15435o;
    public final boolean f15436p;
    public final boolean f15437q;
    public final e9.n0 f15438r;
    public l1 f15439s;
    public n1 f15440t;
    public d0 f15441u;
    public boolean v;
    public final long f15442w;
    public boolean f15443x;
    public final e9.n0 f15444y;
    public final e9.n0 f15445z;

    public f0(y yVar, Context context, String str, b2.g1 g1Var, e9.n0 n0Var, e9.n0 n0Var2, e9.n0 n0Var3, pb.a aVar, Bundle bundle, Bundle bundle2, e2.d dVar, boolean z10, boolean z11) {
        String str2 = str;
        e2.a.g("MediaSessionImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + e2.m0.f8372a + "]");
        this.f15431k = yVar;
        this.f15427f = context;
        this.f15429i = str2;
        this.f15444y = n0Var;
        this.f15445z = n0Var2;
        this.f15438r = n0Var3;
        this.e = aVar;
        this.A = bundle2;
        this.f15433m = dVar;
        this.f15436p = z10;
        this.f15437q = z11;
        j1 j1Var = new j1(this);
        this.f15428g = j1Var;
        this.f15435o = new Handler(Looper.getMainLooper());
        Looper A0 = g1Var.A0();
        Handler handler = new Handler(A0);
        this.f15432l = handler;
        this.f15439s = l1.H;
        this.f15426c = new c0(this, A0);
        this.d = new b0(this, A0);
        Uri build = new Uri.Builder().scheme("androidx").authority("media3.session").appendPath(str2 == null ? "" : str2).build();
        this.f15425b = build;
        q0 q0Var = new q0(this, build, handler, bundle, z10, n0Var, n0Var2, u.e, u.f15643f, bundle2);
        this.h = q0Var;
        this.f15430j = new u1(Process.myUid(), context.getPackageName(), j1Var, bundle, ((n4.n) q0Var.f15578m.f16031b).f16016c.f16028b);
        n1 n1Var = new n1(g1Var);
        this.f15440t = n1Var;
        e2.m0.W(handler, new v2(14, this, n1Var));
        this.f15442w = 3000L;
        this.f15434n = new z(this, 2);
        e2.m0.W(handler, new z(this, 3));
    }

    public static void a(f0 f0Var) {
        synchronized (f0Var.f15424a) {
            try {
                if (f0Var.v) {
                    return;
                }
                s1 R0 = f0Var.f15440t.R0();
                if (!f0Var.f15426c.hasMessages(1)) {
                    s1 s1Var = f0Var.f15439s.f15526c;
                    b2.f1 f1Var = R0.f15626a;
                    int i10 = f1Var.f2135b;
                    b2.f1 f1Var2 = s1Var.f15626a;
                    if (i10 == f1Var2.f2135b && f1Var.e == f1Var2.e && f1Var.h == f1Var2.h && f1Var.f2139i == f1Var2.f2139i) {
                        qi.e eVar = f0Var.f15428g.f15475b;
                        e9.n0 m10 = eVar.m();
                        for (int i11 = 0; i11 < m10.size(); i11++) {
                            w wVar = (w) m10.get(i11);
                            eVar.o(wVar);
                            f0Var.c(wVar, new a0(R0, eVar.u(wVar, 16), eVar.u(wVar, 17), wVar));
                        }
                        try {
                            f0Var.h.f15574i.f(0, R0, true, true, 0);
                        } catch (RemoteException e) {
                            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                        }
                    }
                }
                f0Var.t();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean k(w wVar) {
        if (wVar != null && Objects.equals(wVar.f15670a.f16033a.f16034a, "com.android.systemui")) {
            return true;
        }
        return false;
    }

    public final boolean b(KeyEvent keyEvent, boolean z10, boolean z11) {
        f fVar;
        w e = this.f15431k.f15681a.e();
        if (e != null) {
            int keyCode = keyEvent.getKeyCode();
            if ((keyCode == 85 || keyCode == 79) && z10) {
                keyCode = 87;
            }
            if (keyCode != 79) {
                if (keyCode != 126) {
                    if (keyCode != 127) {
                        if (keyCode != 272) {
                            if (keyCode != 273) {
                                switch (keyCode) {
                                    case 85:
                                        break;
                                    case 86:
                                        fVar = new f(this, e, 6);
                                        break;
                                    case 87:
                                        break;
                                    case 88:
                                        break;
                                    case 89:
                                        fVar = new f(this, e, 5);
                                        break;
                                    case 90:
                                        fVar = new f(this, e, 4);
                                        break;
                                    default:
                                        return false;
                                }
                            }
                            fVar = new f(this, e, 3);
                        }
                        fVar = new f(this, e, 2);
                    } else {
                        fVar = new f(this, e, 1);
                    }
                } else {
                    fVar = new f(this, e, 9);
                }
                e2.m0.W(this.f15432l, new h4(this, z11, e, fVar, 7));
                return true;
            }
            if (this.f15440t.t()) {
                fVar = new f(this, e, 7);
            } else {
                fVar = new f(this, e, 8);
            }
            e2.m0.W(this.f15432l, new h4(this, z11, e, fVar, 7));
            return true;
        }
        return false;
    }

    public final void c(w wVar, e0 e0Var) {
        int i10;
        j1 j1Var = this.f15428g;
        try {
            com.google.android.gms.common.api.internal.v q6 = j1Var.f15475b.q(wVar);
            if (q6 != null) {
                i10 = q6.e();
            } else if (h(wVar)) {
                i10 = 0;
            } else {
                return;
            }
            v vVar = wVar.d;
            if (vVar != null) {
                e0Var.d(vVar, i10);
            }
        } catch (DeadObjectException unused) {
            j1Var.f15475b.C(wVar);
        } catch (RemoteException e) {
            e2.a.m("MediaSessionImpl", "Exception in " + wVar, e);
        }
    }

    public final void d(e0 e0Var) {
        e9.n0 m10 = this.f15428g.f15475b.m();
        for (int i10 = 0; i10 < m10.size(); i10++) {
            c((w) m10.get(i10), e0Var);
        }
        try {
            e0Var.d(this.h.f15574i, 0);
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final w e() {
        e9.n0 m10 = this.f15428g.f15475b.m();
        for (int i10 = 0; i10 < m10.size(); i10++) {
            w wVar = (w) m10.get(i10);
            if (i(wVar)) {
                return wVar;
            }
        }
        return null;
    }

    public final void f(b2.c1 c1Var) {
        this.f15426c.a(false, false);
        d(new m5(c1Var, 3));
        try {
            o0 o0Var = this.h.f15574i;
            b2.q qVar = this.f15439s.f15539s;
            o0Var.k();
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final void g(w wVar, boolean z10) {
        boolean z11;
        boolean z12;
        if (o()) {
            if (this.f15440t.o0(16) && this.f15440t.v() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!this.f15440t.o0(31) && !this.f15440t.o0(20)) {
                z12 = false;
            } else {
                z12 = true;
            }
            w s10 = s(wVar);
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            u6.p(!false);
            sparseBooleanArray.append(1, true);
            u6.p(!false);
            new b2.c1(new b2.v(sparseBooleanArray));
            if (!z11 && z12) {
                this.e.getClass();
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                ?? obj = new Object();
                obj.n(unsupportedOperationException);
                ?? obj2 = new Object();
                obj2.f1050c = this;
                obj2.f1049b = s10;
                obj2.f1048a = z10;
                obj.a(new j9.u(0, (Object) obj, (Object) obj2), new i2.f0(this, 2));
                return;
            }
            if (!z11) {
                e2.a.l("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
            }
            e2.m0.J(this.f15440t);
            if (z10) {
                p(s10);
            }
        }
    }

    public final boolean h(w wVar) {
        if (!this.f15428g.f15475b.t(wVar) && !this.h.f15572f.t(wVar)) {
            return false;
        }
        return true;
    }

    public final boolean i(w wVar) {
        if (!Objects.equals(wVar.f15670a.f16033a.f16034a, this.f15427f.getPackageName()) || wVar.f15671b == 0 || !new Bundle(wVar.e).getBoolean("androidx.media3.session.MediaNotificationManager", false)) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        boolean z10;
        synchronized (this.f15424a) {
            z10 = this.v;
        }
        return z10;
    }

    public final j9.y l(w wVar, List list) {
        s(wVar);
        this.e.getClass();
        return pb.a.p0(list);
    }

    public final u m(w wVar) {
        e9.n0 u10;
        e9.n0 n0Var;
        boolean z10 = this.f15443x;
        e9.n0 n0Var2 = null;
        q0 q0Var = this.h;
        if (z10 && k(wVar)) {
            q0Var.getClass();
            q1 q1Var = u.e;
            q1 q1Var2 = q0Var.f15587w;
            q1Var2.getClass();
            b2.c1 c1Var = q0Var.f15588x;
            c1Var.getClass();
            if (!q0Var.v.isEmpty()) {
                e9.n0 n0Var3 = q0Var.v;
                if (n0Var3 == null) {
                    n0Var = null;
                } else {
                    n0Var = e9.n0.u(n0Var3);
                }
            } else {
                e9.n0 n0Var4 = q0Var.f15586u;
                if (n0Var4 == null) {
                    u10 = null;
                } else {
                    u10 = e9.n0.u(n0Var4);
                }
                e9.n0 n0Var5 = u10;
                n0Var = null;
                n0Var2 = n0Var5;
            }
            return new u(q1Var2, c1Var, n0Var2, n0Var);
        }
        this.e.getClass();
        b2.c1 c1Var2 = u.f15643f;
        q1 q1Var3 = u.e;
        u uVar = new u(q1Var3, c1Var2, null, null);
        if (i(wVar)) {
            boolean z11 = true;
            this.f15443x = true;
            y yVar = this.f15431k;
            e9.n0 n0Var6 = yVar.f15681a.f15445z;
            if (n0Var6.isEmpty()) {
                q0Var.f15586u = yVar.f15681a.f15444y;
            } else {
                q0Var.v = n0Var6;
                q0Var.N();
            }
            f0 f0Var = q0Var.f15573g;
            if (q0Var.f15588x.a(17) == c1Var2.a(17)) {
                z11 = false;
            }
            q0Var.f15587w = q1Var3;
            q0Var.f15588x = c1Var2;
            if (!q0Var.v.isEmpty()) {
                q0Var.N();
            }
            if (z11) {
                e2.m0.W(f0Var.f15432l, new j0(q0Var, f0Var.f15440t, 0));
                return uVar;
            }
            q0Var.O(f0Var.f15440t);
        }
        return uVar;
    }

    public final j9.w n(w wVar) {
        s(wVar);
        this.e.getClass();
        return q8.b(new t1(-6));
    }

    public final boolean o() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                return ((Boolean) v7.h0.a(new m5(this, 2)).f4103b.get()).booleanValue();
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException(e);
            }
        }
        return true;
    }

    public final void p(w wVar) {
        s(wVar);
        this.e.getClass();
    }

    public final j9.e0 q(w wVar, List list, final int i10, final long j10) {
        s(wVar);
        this.e.getClass();
        return e2.m0.g0(pb.a.p0(list), new j9.q() {
            @Override
            public final j9.y apply(Object obj) {
                return q8.b(new x(j10, i10, (List) obj));
            }
        });
    }

    public final void r() {
        e2.a.g("MediaSessionImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + e2.m0.f8372a + "] [" + b2.q0.b() + "]");
        synchronized (this.f15424a) {
            try {
                if (this.v) {
                    return;
                }
                this.v = true;
                b0 b0Var = this.d;
                hg.t tVar = b0Var.f15389a;
                if (tVar != null) {
                    b0Var.removeCallbacks(tVar);
                    b0Var.f15389a = null;
                }
                this.f15432l.removeCallbacksAndMessages(null);
                try {
                    e2.m0.W(this.f15432l, new z(this, 0));
                } catch (Exception e) {
                    e2.a.m("MediaSessionImpl", "Exception thrown while closing", e);
                }
                q0 q0Var = this.h;
                ComponentName componentName = q0Var.f15580o;
                f0 f0Var = q0Var.f15573g;
                n4.s sVar = q0Var.f15578m;
                int i10 = Build.VERSION.SDK_INT;
                int i11 = 0;
                if (i10 < 31) {
                    if (componentName == null) {
                        ((n4.n) sVar.f16031b).f16014a.setMediaButtonReceiver(null);
                    } else {
                        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", f0Var.f15425b);
                        intent.setComponent(componentName);
                        ((n4.n) sVar.f16031b).f16014a.setMediaButtonReceiver(PendingIntent.getBroadcast(f0Var.f15427f, 0, intent, q0.f15571y));
                    }
                }
                androidx.mediarouter.app.f fVar = q0Var.f15579n;
                if (fVar != null) {
                    f0Var.f15427f.unregisterReceiver(fVar);
                }
                b bVar = q0Var.f15577l;
                if (bVar != null && !bVar.f15388f.getAndSet(true)) {
                    bVar.f15387c.execute(new a(bVar, 0));
                }
                n4.n nVar = (n4.n) sVar.f16031b;
                MediaSession mediaSession = nVar.f16014a;
                nVar.f16017f.kill();
                if (i10 == 27) {
                    try {
                        Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                        declaredField.setAccessible(true);
                        Handler handler = (Handler) declaredField.get(mediaSession);
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(null);
                        }
                    } catch (Exception e7) {
                        e2.a.m("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e7);
                    }
                }
                mediaSession.setCallback(null);
                nVar.f16015b.f16013a.clear();
                mediaSession.release();
                j1 j1Var = this.f15428g;
                Set<w> set = j1Var.f15476c;
                qi.e eVar = j1Var.f15475b;
                e9.n0 m10 = eVar.m();
                int size = m10.size();
                while (i11 < size) {
                    Object obj = m10.get(i11);
                    i11++;
                    w wVar = (w) obj;
                    eVar.C(wVar);
                    v vVar = wVar.d;
                    if (vVar != null) {
                        vVar.g();
                    }
                }
                for (w wVar2 : set) {
                    v vVar2 = wVar2.d;
                    if (vVar2 != null) {
                        vVar2.g();
                    }
                }
                set.clear();
                j1Var.f15474a.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final w s(w wVar) {
        w e;
        if (this.f15443x && k(wVar) && (e = e()) != null) {
            return e;
        }
        return wVar;
    }

    public final void t() {
        Handler handler = this.f15432l;
        z zVar = this.f15434n;
        handler.removeCallbacks(zVar);
        if (this.f15437q) {
            long j10 = this.f15442w;
            if (j10 > 0) {
                if (this.f15440t.j0() || this.f15440t.c()) {
                    handler.postDelayed(zVar, j10);
                }
            }
        }
    }

    public final void u(n1 n1Var, n1 n1Var2) {
        b2.s0 s0Var;
        float f7;
        b2.f fVar;
        d2.c cVar;
        boolean z10;
        w1 w1Var;
        q0 q0Var = this.h;
        this.f15440t = n1Var2;
        if (n1Var != null) {
            d0 d0Var = this.f15441u;
            d0Var.getClass();
            n1Var.C(d0Var);
        }
        d0 d0Var2 = new d0(this, n1Var2);
        n1Var2.p0(d0Var2);
        this.f15441u = d0Var2;
        int i10 = 0;
        try {
            q0Var.f15574i.m(0, n1Var, n1Var2);
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
        if (n1Var == null) {
            ((n4.n) q0Var.f15578m.f16031b).f16014a.setActive(true);
        }
        b2.z0 W = n1Var2.W();
        s1 R0 = n1Var2.R0();
        b2.f1 Q0 = n1Var2.Q0();
        b2.f1 Q02 = n1Var2.Q0();
        b2.a1 h = n1Var2.h();
        int l4 = n1Var2.l();
        boolean D0 = n1Var2.D0();
        b2 D = n1Var2.D();
        b2.p1 T0 = n1Var2.T0();
        if (n1Var2.o0(18)) {
            s0Var = n1Var2.i0();
        } else {
            s0Var = b2.s0.L;
        }
        b2.s0 s0Var2 = s0Var;
        if (n1Var2.o0(22)) {
            f7 = n1Var2.F();
        } else {
            f7 = 1.0f;
        }
        float f10 = f7;
        if (n1Var2.o0(21)) {
            fVar = n1Var2.H();
        } else {
            fVar = b2.f.f2113i;
        }
        b2.f fVar2 = fVar;
        if (n1Var2.o0(28)) {
            cVar = n1Var2.k0();
        } else {
            cVar = d2.c.d;
        }
        d2.c cVar2 = cVar;
        b2.q J = n1Var2.J();
        if (n1Var2.o0(23)) {
            i10 = n1Var2.m();
        }
        int i11 = i10;
        if (n1Var2.o0(23) && n1Var2.z0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = z10;
        boolean t10 = n1Var2.t();
        int w02 = n1Var2.w0();
        int d = n1Var2.d();
        boolean j02 = n1Var2.j0();
        boolean c10 = n1Var2.c();
        b2.s0 U0 = n1Var2.U0();
        long O0 = n1Var2.O0();
        long Z = n1Var2.Z();
        long y3 = n1Var2.y();
        if (n1Var2.o0(30)) {
            w1Var = n1Var2.h0();
        } else {
            w1Var = w1.f2476b;
        }
        this.f15439s = new l1(W, 0, R0, Q0, Q02, 0, h, l4, D0, D, T0, 0, s0Var2, f10, 1.0f, fVar2, 0, cVar2, J, i11, z11, t10, 1, w02, d, j02, c10, U0, O0, Z, y3, w1Var, n1Var2.E0());
        f(n1Var2.s());
    }

    public final void v() {
        if (Looper.myLooper() == this.f15432l.getLooper()) {
            return;
        }
        throw new IllegalStateException("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
    }
}
