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
public class e0 {
    public static final s1 B = new s1(1);
    public static final d9.u C = w6.a(new a3.s(5));
    public final Bundle A;
    public final Object f15154a = new Object();
    public final Uri f15155b;
    public final b0 f15156c;
    public final a0 d;
    public final pb.a e;
    public final Context f15157f;
    public final i1 f15158g;
    public final p0 h;
    public final String f15159i;
    public final t1 f15160j;
    public final x f15161k;
    public final Handler f15162l;
    public final e2.d f15163m;
    public final y f15164n;
    public final Handler f15165o;
    public final boolean f15166p;
    public final boolean f15167q;
    public final e9.n0 f15168r;
    public k1 f15169s;
    public m1 f15170t;
    public c0 f15171u;
    public boolean v;
    public final long f15172w;
    public boolean f15173x;
    public final e9.n0 f15174y;
    public final e9.n0 f15175z;

    public e0(x xVar, Context context, String str, b2.g1 g1Var, e9.n0 n0Var, e9.n0 n0Var2, e9.n0 n0Var3, pb.a aVar, Bundle bundle, Bundle bundle2, e2.d dVar, boolean z10, boolean z11) {
        String str2 = str;
        e2.a.g("MediaSessionImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + e2.m0.f8375a + "]");
        this.f15161k = xVar;
        this.f15157f = context;
        this.f15159i = str2;
        this.f15174y = n0Var;
        this.f15175z = n0Var2;
        this.f15168r = n0Var3;
        this.e = aVar;
        this.A = bundle2;
        this.f15163m = dVar;
        this.f15166p = z10;
        this.f15167q = z11;
        i1 i1Var = new i1(this);
        this.f15158g = i1Var;
        this.f15165o = new Handler(Looper.getMainLooper());
        Looper A0 = g1Var.A0();
        Handler handler = new Handler(A0);
        this.f15162l = handler;
        this.f15169s = k1.H;
        this.f15156c = new b0(this, A0);
        this.d = new a0(this, A0);
        Uri build = new Uri.Builder().scheme("androidx").authority("media3.session").appendPath(str2 == null ? "" : str2).build();
        this.f15155b = build;
        p0 p0Var = new p0(this, build, handler, bundle, z10, n0Var, n0Var2, t.e, t.f15373f, bundle2);
        this.h = p0Var;
        this.f15160j = new t1(Process.myUid(), context.getPackageName(), i1Var, bundle, ((n4.n) p0Var.f15308m.f15745b).f15730c.f15742b);
        m1 m1Var = new m1(g1Var);
        this.f15170t = m1Var;
        e2.m0.W(handler, new v2(11, this, m1Var));
        this.f15172w = 3000L;
        this.f15164n = new y(this, 2);
        e2.m0.W(handler, new y(this, 3));
    }

    public static void a(e0 e0Var) {
        synchronized (e0Var.f15154a) {
            try {
                if (e0Var.v) {
                    return;
                }
                r1 R0 = e0Var.f15170t.R0();
                if (!e0Var.f15156c.hasMessages(1)) {
                    r1 r1Var = e0Var.f15169s.f15256c;
                    b2.f1 f1Var = R0.f15356a;
                    int i10 = f1Var.f2139b;
                    b2.f1 f1Var2 = r1Var.f15356a;
                    if (i10 == f1Var2.f2139b && f1Var.e == f1Var2.e && f1Var.h == f1Var2.h && f1Var.f2143i == f1Var2.f2143i) {
                        pi.e eVar = e0Var.f15158g.f15205b;
                        e9.n0 m10 = eVar.m();
                        for (int i11 = 0; i11 < m10.size(); i11++) {
                            v vVar = (v) m10.get(i11);
                            eVar.o(vVar);
                            e0Var.c(vVar, new z(R0, eVar.u(vVar, 16), eVar.u(vVar, 17), vVar));
                        }
                        try {
                            e0Var.h.f15304i.f(0, R0, true, true, 0);
                        } catch (RemoteException e) {
                            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                        }
                    }
                }
                e0Var.t();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean k(v vVar) {
        if (vVar != null && Objects.equals(vVar.f15400a.f15747a.f15748a, "com.android.systemui")) {
            return true;
        }
        return false;
    }

    public final boolean b(KeyEvent keyEvent, boolean z10, boolean z11) {
        e eVar;
        v e = this.f15161k.f15411a.e();
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
                                        eVar = new e(this, e, 6);
                                        break;
                                    case 87:
                                        break;
                                    case 88:
                                        break;
                                    case 89:
                                        eVar = new e(this, e, 5);
                                        break;
                                    case 90:
                                        eVar = new e(this, e, 4);
                                        break;
                                    default:
                                        return false;
                                }
                            }
                            eVar = new e(this, e, 3);
                        }
                        eVar = new e(this, e, 2);
                    } else {
                        eVar = new e(this, e, 1);
                    }
                } else {
                    eVar = new e(this, e, 9);
                }
                e2.m0.W(this.f15162l, new h4(this, z11, e, eVar, 6));
                return true;
            }
            if (this.f15170t.t()) {
                eVar = new e(this, e, 7);
            } else {
                eVar = new e(this, e, 8);
            }
            e2.m0.W(this.f15162l, new h4(this, z11, e, eVar, 6));
            return true;
        }
        return false;
    }

    public final void c(v vVar, d0 d0Var) {
        int i10;
        i1 i1Var = this.f15158g;
        try {
            com.google.android.gms.common.api.internal.v q6 = i1Var.f15205b.q(vVar);
            if (q6 != null) {
                i10 = q6.e();
            } else if (h(vVar)) {
                i10 = 0;
            } else {
                return;
            }
            u uVar = vVar.d;
            if (uVar != null) {
                d0Var.d(uVar, i10);
            }
        } catch (DeadObjectException unused) {
            i1Var.f15205b.C(vVar);
        } catch (RemoteException e) {
            e2.a.m("MediaSessionImpl", "Exception in " + vVar, e);
        }
    }

    public final void d(d0 d0Var) {
        e9.n0 m10 = this.f15158g.f15205b.m();
        for (int i10 = 0; i10 < m10.size(); i10++) {
            c((v) m10.get(i10), d0Var);
        }
        try {
            d0Var.d(this.h.f15304i, 0);
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final v e() {
        e9.n0 m10 = this.f15158g.f15205b.m();
        for (int i10 = 0; i10 < m10.size(); i10++) {
            v vVar = (v) m10.get(i10);
            if (i(vVar)) {
                return vVar;
            }
        }
        return null;
    }

    public final void f(b2.c1 c1Var) {
        this.f15156c.a(false, false);
        d(new m5(c1Var, 3));
        try {
            n0 n0Var = this.h.f15304i;
            b2.q qVar = this.f15169s.f15269s;
            n0Var.k();
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final void g(v vVar, boolean z10) {
        boolean z11;
        boolean z12;
        if (o()) {
            if (this.f15170t.o0(16) && this.f15170t.v() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!this.f15170t.o0(31) && !this.f15170t.o0(20)) {
                z12 = false;
            } else {
                z12 = true;
            }
            v s10 = s(vVar);
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
                obj2.f1054c = this;
                obj2.f1053b = s10;
                obj2.f1052a = z10;
                obj.a(new j9.u(0, (Object) obj, (Object) obj2), new i2.f0(this, 2));
                return;
            }
            if (!z11) {
                e2.a.l("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
            }
            e2.m0.J(this.f15170t);
            if (z10) {
                p(s10);
            }
        }
    }

    public final boolean h(v vVar) {
        if (!this.f15158g.f15205b.t(vVar) && !this.h.f15302f.t(vVar)) {
            return false;
        }
        return true;
    }

    public final boolean i(v vVar) {
        if (!Objects.equals(vVar.f15400a.f15747a.f15748a, this.f15157f.getPackageName()) || vVar.f15401b == 0 || !new Bundle(vVar.e).getBoolean("androidx.media3.session.MediaNotificationManager", false)) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        boolean z10;
        synchronized (this.f15154a) {
            z10 = this.v;
        }
        return z10;
    }

    public final j9.y l(v vVar, List list) {
        s(vVar);
        this.e.getClass();
        return pb.a.s0(list);
    }

    public final t m(v vVar) {
        e9.n0 u10;
        e9.n0 n0Var;
        boolean z10 = this.f15173x;
        e9.n0 n0Var2 = null;
        p0 p0Var = this.h;
        if (z10 && k(vVar)) {
            p0Var.getClass();
            p1 p1Var = t.e;
            p1 p1Var2 = p0Var.f15317w;
            p1Var2.getClass();
            b2.c1 c1Var = p0Var.f15318x;
            c1Var.getClass();
            if (!p0Var.v.isEmpty()) {
                e9.n0 n0Var3 = p0Var.v;
                if (n0Var3 == null) {
                    n0Var = null;
                } else {
                    n0Var = e9.n0.u(n0Var3);
                }
            } else {
                e9.n0 n0Var4 = p0Var.f15316u;
                if (n0Var4 == null) {
                    u10 = null;
                } else {
                    u10 = e9.n0.u(n0Var4);
                }
                e9.n0 n0Var5 = u10;
                n0Var = null;
                n0Var2 = n0Var5;
            }
            return new t(p1Var2, c1Var, n0Var2, n0Var);
        }
        this.e.getClass();
        b2.c1 c1Var2 = t.f15373f;
        p1 p1Var3 = t.e;
        t tVar = new t(p1Var3, c1Var2, null, null);
        if (i(vVar)) {
            boolean z11 = true;
            this.f15173x = true;
            x xVar = this.f15161k;
            e9.n0 n0Var6 = xVar.f15411a.f15175z;
            if (n0Var6.isEmpty()) {
                p0Var.f15316u = xVar.f15411a.f15174y;
            } else {
                p0Var.v = n0Var6;
                p0Var.N();
            }
            e0 e0Var = p0Var.f15303g;
            if (p0Var.f15318x.a(17) == c1Var2.a(17)) {
                z11 = false;
            }
            p0Var.f15317w = p1Var3;
            p0Var.f15318x = c1Var2;
            if (!p0Var.v.isEmpty()) {
                p0Var.N();
            }
            if (z11) {
                e2.m0.W(e0Var.f15162l, new i0(p0Var, e0Var.f15170t, 0));
                return tVar;
            }
            p0Var.O(e0Var.f15170t);
        }
        return tVar;
    }

    public final j9.w n(v vVar) {
        s(vVar);
        this.e.getClass();
        return q8.b(new s1(-6));
    }

    public final boolean o() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                return ((Boolean) v7.h0.a(new m5(this, 2)).f4107b.get()).booleanValue();
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException(e);
            }
        }
        return true;
    }

    public final void p(v vVar) {
        s(vVar);
        this.e.getClass();
    }

    public final j9.e0 q(v vVar, List list, final int i10, final long j10) {
        s(vVar);
        this.e.getClass();
        return e2.m0.g0(pb.a.s0(list), new j9.q() {
            @Override
            public final j9.y apply(Object obj) {
                return q8.b(new w(j10, i10, (List) obj));
            }
        });
    }

    public final void r() {
        e2.a.g("MediaSessionImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + e2.m0.f8375a + "] [" + b2.q0.b() + "]");
        synchronized (this.f15154a) {
            try {
                if (this.v) {
                    return;
                }
                this.v = true;
                a0 a0Var = this.d;
                hg.t tVar = a0Var.f15117a;
                if (tVar != null) {
                    a0Var.removeCallbacks(tVar);
                    a0Var.f15117a = null;
                }
                this.f15162l.removeCallbacksAndMessages(null);
                try {
                    e2.m0.W(this.f15162l, new y(this, 0));
                } catch (Exception e) {
                    e2.a.m("MediaSessionImpl", "Exception thrown while closing", e);
                }
                p0 p0Var = this.h;
                ComponentName componentName = p0Var.f15310o;
                e0 e0Var = p0Var.f15303g;
                n4.s sVar = p0Var.f15308m;
                int i10 = Build.VERSION.SDK_INT;
                int i11 = 0;
                if (i10 < 31) {
                    if (componentName == null) {
                        ((n4.n) sVar.f15745b).f15728a.setMediaButtonReceiver(null);
                    } else {
                        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", e0Var.f15155b);
                        intent.setComponent(componentName);
                        ((n4.n) sVar.f15745b).f15728a.setMediaButtonReceiver(PendingIntent.getBroadcast(e0Var.f15157f, 0, intent, p0.f15301y));
                    }
                }
                androidx.mediarouter.app.f fVar = p0Var.f15309n;
                if (fVar != null) {
                    e0Var.f15157f.unregisterReceiver(fVar);
                }
                b bVar = p0Var.f15307l;
                if (bVar != null && !bVar.f15123f.getAndSet(true)) {
                    bVar.f15122c.execute(new a(bVar, 0));
                }
                n4.n nVar = (n4.n) sVar.f15745b;
                MediaSession mediaSession = nVar.f15728a;
                nVar.f15731f.kill();
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
                nVar.f15729b.f15727a.clear();
                mediaSession.release();
                i1 i1Var = this.f15158g;
                Set<v> set = i1Var.f15206c;
                pi.e eVar = i1Var.f15205b;
                e9.n0 m10 = eVar.m();
                int size = m10.size();
                while (i11 < size) {
                    Object obj = m10.get(i11);
                    i11++;
                    v vVar = (v) obj;
                    eVar.C(vVar);
                    u uVar = vVar.d;
                    if (uVar != null) {
                        uVar.g();
                    }
                }
                for (v vVar2 : set) {
                    u uVar2 = vVar2.d;
                    if (uVar2 != null) {
                        uVar2.g();
                    }
                }
                set.clear();
                i1Var.f15204a.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final v s(v vVar) {
        v e;
        if (this.f15173x && k(vVar) && (e = e()) != null) {
            return e;
        }
        return vVar;
    }

    public final void t() {
        Handler handler = this.f15162l;
        y yVar = this.f15164n;
        handler.removeCallbacks(yVar);
        if (this.f15167q) {
            long j10 = this.f15172w;
            if (j10 > 0) {
                if (this.f15170t.j0() || this.f15170t.c()) {
                    handler.postDelayed(yVar, j10);
                }
            }
        }
    }

    public final void u(m1 m1Var, m1 m1Var2) {
        b2.s0 s0Var;
        float f7;
        b2.f fVar;
        d2.c cVar;
        boolean z10;
        w1 w1Var;
        p0 p0Var = this.h;
        this.f15170t = m1Var2;
        if (m1Var != null) {
            c0 c0Var = this.f15171u;
            c0Var.getClass();
            m1Var.C(c0Var);
        }
        c0 c0Var2 = new c0(this, m1Var2);
        m1Var2.p0(c0Var2);
        this.f15171u = c0Var2;
        int i10 = 0;
        try {
            p0Var.f15304i.m(0, m1Var, m1Var2);
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
        if (m1Var == null) {
            ((n4.n) p0Var.f15308m.f15745b).f15728a.setActive(true);
        }
        b2.z0 W = m1Var2.W();
        r1 R0 = m1Var2.R0();
        b2.f1 Q0 = m1Var2.Q0();
        b2.f1 Q02 = m1Var2.Q0();
        b2.a1 h = m1Var2.h();
        int l4 = m1Var2.l();
        boolean D0 = m1Var2.D0();
        b2 D = m1Var2.D();
        b2.p1 T0 = m1Var2.T0();
        if (m1Var2.o0(18)) {
            s0Var = m1Var2.i0();
        } else {
            s0Var = b2.s0.L;
        }
        b2.s0 s0Var2 = s0Var;
        if (m1Var2.o0(22)) {
            f7 = m1Var2.F();
        } else {
            f7 = 1.0f;
        }
        float f10 = f7;
        if (m1Var2.o0(21)) {
            fVar = m1Var2.H();
        } else {
            fVar = b2.f.f2117i;
        }
        b2.f fVar2 = fVar;
        if (m1Var2.o0(28)) {
            cVar = m1Var2.k0();
        } else {
            cVar = d2.c.d;
        }
        d2.c cVar2 = cVar;
        b2.q J = m1Var2.J();
        if (m1Var2.o0(23)) {
            i10 = m1Var2.m();
        }
        int i11 = i10;
        if (m1Var2.o0(23) && m1Var2.z0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = z10;
        boolean t10 = m1Var2.t();
        int w02 = m1Var2.w0();
        int d = m1Var2.d();
        boolean j02 = m1Var2.j0();
        boolean c10 = m1Var2.c();
        b2.s0 U0 = m1Var2.U0();
        long O0 = m1Var2.O0();
        long Z = m1Var2.Z();
        long y3 = m1Var2.y();
        if (m1Var2.o0(30)) {
            w1Var = m1Var2.h0();
        } else {
            w1Var = w1.f2480b;
        }
        this.f15169s = new k1(W, 0, R0, Q0, Q02, 0, h, l4, D0, D, T0, 0, s0Var2, f10, 1.0f, fVar2, 0, cVar2, J, i11, z11, t10, 1, w02, d, j02, c10, U0, O0, Z, y3, w1Var, m1Var2.E0());
        f(m1Var2.s());
    }

    public final void v() {
        if (Looper.myLooper() == this.f15162l.getLooper()) {
            return;
        }
        throw new IllegalStateException("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
    }
}
