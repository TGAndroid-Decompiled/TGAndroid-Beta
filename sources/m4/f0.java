package m4;

import a8.ac;
import a8.qd;
import a8.w9;
import a8.yb;
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
import bi.s9;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
public class f0 {
    public static final t1 B = new t1(1);
    public static final e9.t C = ac.a(new a3.s(5));
    public final Bundle A;
    public final Object f18041a = new Object();
    public final Uri f18042b;
    public final c0 f18043c;
    public final b0 d;
    public final qb.a e;
    public final Context f18044f;
    public final j1 f18045g;
    public final p0 h;
    public final String f18046i;
    public final u1 f18047j;
    public final y f18048k;
    public final Handler f18049l;
    public final e2.d f18050m;
    public final z f18051n;
    public final Handler f18052o;
    public final boolean f18053p;
    public final boolean f18054q;
    public final f9.i0 f18055r;
    public l1 f18056s;
    public n1 f18057t;
    public d0 f18058u;
    public boolean v;
    public final long f18059w;
    public boolean f18060x;
    public final f9.i0 f18061y;
    public final f9.i0 f18062z;

    public f0(y yVar, Context context, String str, b2.g1 g1Var, f9.i0 i0Var, f9.i0 i0Var2, f9.i0 i0Var3, qb.a aVar, Bundle bundle, Bundle bundle2, e2.d dVar, boolean z10, boolean z11) {
        String str2 = str;
        e2.a.g("MediaSessionImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + e2.n0.f9692a + "]");
        this.f18048k = yVar;
        this.f18044f = context;
        this.f18046i = str2;
        this.f18061y = i0Var;
        this.f18062z = i0Var2;
        this.f18055r = i0Var3;
        this.e = aVar;
        this.A = bundle2;
        this.f18050m = dVar;
        this.f18053p = z10;
        this.f18054q = z11;
        j1 j1Var = new j1(this);
        this.f18045g = j1Var;
        this.f18052o = new Handler(Looper.getMainLooper());
        Looper A0 = g1Var.A0();
        Handler handler = new Handler(A0);
        this.f18049l = handler;
        this.f18056s = l1.H;
        this.f18043c = new c0(this, A0);
        this.d = new b0(this, A0);
        Uri build = new Uri.Builder().scheme("androidx").authority("media3.session").appendPath(str2 == null ? "" : str2).build();
        this.f18042b = build;
        p0 p0Var = new p0(this, build, handler, bundle, z10, i0Var, i0Var2, u.e, u.f18259f, bundle2);
        this.h = p0Var;
        this.f18047j = new u1(Process.myUid(), context.getPackageName(), j1Var, bundle, ((n4.n) p0Var.f18186m.f18696b).f18681c.f18693b);
        n1 n1Var = new n1(g1Var);
        this.f18057t = n1Var;
        e2.n0.W(handler, new k2.e0(10, this, n1Var));
        this.f18059w = 3000L;
        this.f18051n = new z(this, 2);
        e2.n0.W(handler, new z(this, 3));
    }

    public static void a(f0 f0Var) {
        synchronized (f0Var.f18041a) {
            try {
                if (f0Var.v) {
                    return;
                }
                s1 R0 = f0Var.f18057t.R0();
                if (!f0Var.f18043c.hasMessages(1)) {
                    s1 s1Var = f0Var.f18056s.f18141c;
                    b2.f1 f1Var = R0.f18242a;
                    int i10 = f1Var.f3202b;
                    b2.f1 f1Var2 = s1Var.f18242a;
                    if (i10 == f1Var2.f3202b && f1Var.e == f1Var2.e && f1Var.h == f1Var2.h && f1Var.f3206i == f1Var2.f3206i) {
                        com.google.firebase.messaging.q qVar = f0Var.f18045g.f18092b;
                        f9.i0 k10 = qVar.k();
                        for (int i11 = 0; i11 < k10.size(); i11++) {
                            w wVar = (w) k10.get(i11);
                            qVar.n(wVar);
                            f0Var.c(wVar, new a0(R0, qVar.v(wVar, 16), qVar.v(wVar, 17), wVar));
                        }
                        try {
                            f0Var.h.f18182i.f(0, R0, true, true, 0);
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
        if (wVar != null && Objects.equals(wVar.f18286a.f18698a.f18699a, "com.android.systemui")) {
            return true;
        }
        return false;
    }

    public final boolean b(KeyEvent keyEvent, boolean z10, boolean z11) {
        f fVar;
        w e = this.f18048k.f18301a.e();
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
                e2.n0.W(this.f18049l, new s9(this, z11, e, fVar, 7));
                return true;
            }
            if (this.f18057t.t()) {
                fVar = new f(this, e, 7);
            } else {
                fVar = new f(this, e, 8);
            }
            e2.n0.W(this.f18049l, new s9(this, z11, e, fVar, 7));
            return true;
        }
        return false;
    }

    public final void c(w wVar, e0 e0Var) {
        int i10;
        j1 j1Var = this.f18045g;
        try {
            com.google.android.gms.common.api.internal.u p10 = j1Var.f18092b.p(wVar);
            if (p10 != null) {
                i10 = p10.e();
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
            j1Var.f18092b.B(wVar);
        } catch (RemoteException e) {
            e2.a.m("MediaSessionImpl", "Exception in " + wVar, e);
        }
    }

    public final void d(e0 e0Var) {
        f9.i0 k10 = this.f18045g.f18092b.k();
        for (int i10 = 0; i10 < k10.size(); i10++) {
            c((w) k10.get(i10), e0Var);
        }
        try {
            e0Var.d(this.h.f18182i, 0);
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final w e() {
        f9.i0 k10 = this.f18045g.f18092b.k();
        for (int i10 = 0; i10 < k10.size(); i10++) {
            w wVar = (w) k10.get(i10);
            if (i(wVar)) {
                return wVar;
            }
        }
        return null;
    }

    public final void f(b2.c1 c1Var) {
        this.f18043c.a(false, false);
        d(new jg.e1(c1Var, 16));
        try {
            n0 n0Var = this.h.f18182i;
            b2.q qVar = this.f18056s.f18154s;
            n0Var.k();
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final void g(w wVar, boolean z10) {
        boolean z11;
        boolean z12;
        if (o()) {
            if (this.f18057t.o0(16) && this.f18057t.v() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!this.f18057t.o0(31) && !this.f18057t.o0(20)) {
                z12 = false;
            } else {
                z12 = true;
            }
            w s10 = s(wVar);
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            yb.p(!false);
            sparseBooleanArray.append(1, true);
            yb.p(!false);
            new b2.c1(new b2.v(sparseBooleanArray));
            if (!z11 && z12) {
                this.e.getClass();
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                ?? obj = new Object();
                obj.n(unsupportedOperationException);
                ?? obj2 = new Object();
                obj2.f2122c = this;
                obj2.f2121b = s10;
                obj2.f2120a = z10;
                obj.a(new k9.u(0, (Object) obj, (Object) obj2), new i2.h0(this, 2));
                return;
            }
            if (!z11) {
                e2.a.l("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
            }
            e2.n0.J(this.f18057t);
            if (z10) {
                p(s10);
            }
        }
    }

    public final boolean h(w wVar) {
        if (!this.f18045g.f18092b.u(wVar) && !this.h.f18180f.u(wVar)) {
            return false;
        }
        return true;
    }

    public final boolean i(w wVar) {
        if (!Objects.equals(wVar.f18286a.f18698a.f18699a, this.f18044f.getPackageName()) || wVar.f18287b == 0 || !new Bundle(wVar.e).getBoolean("androidx.media3.session.MediaNotificationManager", false)) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        boolean z10;
        synchronized (this.f18041a) {
            z10 = this.v;
        }
        return z10;
    }

    public final k9.y l(w wVar, List list) {
        s(wVar);
        this.e.getClass();
        return qb.a.t4(list);
    }

    public final u m(w wVar) {
        f9.i0 u10;
        f9.i0 i0Var;
        boolean z10 = this.f18060x;
        f9.i0 i0Var2 = null;
        p0 p0Var = this.h;
        if (z10 && k(wVar)) {
            p0Var.getClass();
            q1 q1Var = u.e;
            q1 q1Var2 = p0Var.f18195w;
            q1Var2.getClass();
            b2.c1 c1Var = p0Var.f18196x;
            c1Var.getClass();
            if (!p0Var.v.isEmpty()) {
                f9.i0 i0Var3 = p0Var.v;
                if (i0Var3 == null) {
                    i0Var = null;
                } else {
                    i0Var = f9.i0.u(i0Var3);
                }
            } else {
                f9.i0 i0Var4 = p0Var.f18194u;
                if (i0Var4 == null) {
                    u10 = null;
                } else {
                    u10 = f9.i0.u(i0Var4);
                }
                f9.i0 i0Var5 = u10;
                i0Var = null;
                i0Var2 = i0Var5;
            }
            return new u(q1Var2, c1Var, i0Var2, i0Var);
        }
        this.e.getClass();
        b2.c1 c1Var2 = u.f18259f;
        q1 q1Var3 = u.e;
        u uVar = new u(q1Var3, c1Var2, null, null);
        if (i(wVar)) {
            boolean z11 = true;
            this.f18060x = true;
            y yVar = this.f18048k;
            f9.i0 i0Var6 = yVar.f18301a.f18062z;
            if (i0Var6.isEmpty()) {
                p0Var.f18194u = yVar.f18301a.f18061y;
            } else {
                p0Var.v = i0Var6;
                p0Var.N();
            }
            f0 f0Var = p0Var.f18181g;
            if (p0Var.f18196x.a(17) == c1Var2.a(17)) {
                z11 = false;
            }
            p0Var.f18195w = q1Var3;
            p0Var.f18196x = c1Var2;
            if (!p0Var.v.isEmpty()) {
                p0Var.N();
            }
            if (z11) {
                e2.n0.W(f0Var.f18049l, new j0(p0Var, f0Var.f18057t, 0));
                return uVar;
            }
            p0Var.O(f0Var.f18057t);
        }
        return uVar;
    }

    public final k9.w n(w wVar) {
        s(wVar);
        this.e.getClass();
        return qd.b(new t1(-6));
    }

    public final boolean o() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                return ((Boolean) w9.a(new jg.e1(this, 15)).f5914b.get()).booleanValue();
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

    public final k9.e0 q(w wVar, List list, final int i10, final long j10) {
        s(wVar);
        this.e.getClass();
        return e2.n0.g0(qb.a.t4(list), new k9.q() {
            @Override
            public final k9.y apply(Object obj) {
                return qd.b(new x(j10, i10, (List) obj));
            }
        });
    }

    public final void r() {
        e2.a.g("MediaSessionImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + e2.n0.f9692a + "] [" + b2.q0.b() + "]");
        synchronized (this.f18041a) {
            try {
                if (this.v) {
                    return;
                }
                this.v = true;
                b0 b0Var = this.d;
                jg.f1 f1Var = b0Var.f18006a;
                if (f1Var != null) {
                    b0Var.removeCallbacks(f1Var);
                    b0Var.f18006a = null;
                }
                this.f18049l.removeCallbacksAndMessages(null);
                try {
                    e2.n0.W(this.f18049l, new z(this, 0));
                } catch (Exception e) {
                    e2.a.m("MediaSessionImpl", "Exception thrown while closing", e);
                }
                p0 p0Var = this.h;
                ComponentName componentName = p0Var.f18188o;
                f0 f0Var = p0Var.f18181g;
                n4.s sVar = p0Var.f18186m;
                int i10 = Build.VERSION.SDK_INT;
                int i11 = 0;
                if (i10 < 31) {
                    if (componentName == null) {
                        ((n4.n) sVar.f18696b).f18679a.setMediaButtonReceiver(null);
                    } else {
                        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", f0Var.f18042b);
                        intent.setComponent(componentName);
                        ((n4.n) sVar.f18696b).f18679a.setMediaButtonReceiver(PendingIntent.getBroadcast(f0Var.f18044f, 0, intent, p0.f18179y));
                    }
                }
                androidx.mediarouter.app.g gVar = p0Var.f18187n;
                if (gVar != null) {
                    f0Var.f18044f.unregisterReceiver(gVar);
                }
                b bVar = p0Var.f18185l;
                if (bVar != null && !bVar.f18005f.getAndSet(true)) {
                    bVar.f18004c.execute(new a(bVar, 0));
                }
                n4.n nVar = (n4.n) sVar.f18696b;
                MediaSession mediaSession = nVar.f18679a;
                nVar.f18682f.kill();
                if (i10 == 27) {
                    try {
                        Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                        declaredField.setAccessible(true);
                        Handler handler = (Handler) declaredField.get(mediaSession);
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(null);
                        }
                    } catch (Exception e10) {
                        e2.a.m("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e10);
                    }
                }
                mediaSession.setCallback(null);
                nVar.f18680b.f18678a.clear();
                mediaSession.release();
                j1 j1Var = this.f18045g;
                Set<w> set = j1Var.f18093c;
                com.google.firebase.messaging.q qVar = j1Var.f18092b;
                f9.i0 k10 = qVar.k();
                int size = k10.size();
                while (i11 < size) {
                    Object obj = k10.get(i11);
                    i11++;
                    w wVar = (w) obj;
                    qVar.B(wVar);
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
                j1Var.f18091a.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final w s(w wVar) {
        w e;
        if (this.f18060x && k(wVar) && (e = e()) != null) {
            return e;
        }
        return wVar;
    }

    public final void t() {
        Handler handler = this.f18049l;
        z zVar = this.f18051n;
        handler.removeCallbacks(zVar);
        if (this.f18054q) {
            long j10 = this.f18059w;
            if (j10 > 0) {
                if (this.f18057t.j0() || this.f18057t.c()) {
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
        b2.w1 w1Var;
        p0 p0Var = this.h;
        this.f18057t = n1Var2;
        if (n1Var != null) {
            d0 d0Var = this.f18058u;
            d0Var.getClass();
            n1Var.C(d0Var);
        }
        d0 d0Var2 = new d0(this, n1Var2);
        n1Var2.p0(d0Var2);
        this.f18058u = d0Var2;
        int i10 = 0;
        try {
            p0Var.f18182i.m(0, n1Var, n1Var2);
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
        if (n1Var == null) {
            ((n4.n) p0Var.f18186m.f18696b).f18679a.setActive(true);
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
            fVar = b2.f.f3180i;
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
            w1Var = b2.w1.f3543b;
        }
        this.f18056s = new l1(W, 0, R0, Q0, Q02, 0, h, l4, D0, D, T0, 0, s0Var2, f10, 1.0f, fVar2, 0, cVar2, J, i11, z11, t10, 1, w02, d, j02, c10, U0, O0, Z, y3, w1Var, n1Var2.E0());
        f(n1Var2.s());
    }

    public final void v() {
        if (Looper.myLooper() == this.f18049l.getLooper()) {
            return;
        }
        throw new IllegalStateException("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
    }
}
