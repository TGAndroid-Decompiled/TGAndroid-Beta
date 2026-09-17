package m4;

import ai.s4;
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
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import gg.x1;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import v7.l8;
public class a0 {
    public static final q1 B = new q1(1);
    public final Bundle A;
    public final Object f14460a = new Object();
    public final Uri f14461b;
    public final x f14462c;
    public final w d;
    public final na.d e;
    public final Context f14463f;
    public final g1 f14464g;
    public final l0 h;
    public final String f14465i;
    public final r1 f14466j;
    public final t f14467k;
    public final Handler f14468l;
    public final n4.y f14469m;
    public final u f14470n;
    public final Handler f14471o;
    public final boolean f14472p;
    public final boolean f14473q;
    public final e9.i0 f14474r;
    public i1 f14475s;
    public k1 f14476t;
    public y f14477u;
    public boolean v;
    public final long f14478w;
    public boolean f14479x;
    public final e9.i0 f14480y;
    public final e9.i0 f14481z;

    public a0(t tVar, Context context, b2.b1 b1Var, e9.i0 i0Var, e9.i0 i0Var2, e9.i0 i0Var3, na.d dVar, Bundle bundle, Bundle bundle2, n4.y yVar) {
        e2.a.i("MediaSessionImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.1] [" + e2.d0.f7888a + "]");
        this.f14467k = tVar;
        this.f14463f = context;
        this.f14465i = "pip-media-session";
        this.f14480y = i0Var;
        this.f14481z = i0Var2;
        this.f14474r = i0Var3;
        this.e = dVar;
        this.A = bundle2;
        this.f14469m = yVar;
        this.f14472p = true;
        this.f14473q = true;
        g1 g1Var = new g1(this);
        this.f14464g = g1Var;
        this.f14471o = new Handler(Looper.getMainLooper());
        Looper y02 = b1Var.y0();
        Handler handler = new Handler(y02);
        this.f14468l = handler;
        this.f14475s = i1.F;
        this.f14462c = new x(this, y02);
        this.d = new w(this, y02);
        Uri build = new Uri.Builder().scheme(a0.class.getName()).appendPath("pip-media-session").appendPath(String.valueOf(SystemClock.elapsedRealtime())).build();
        this.f14461b = build;
        l0 l0Var = new l0(this, build, handler, bundle, i0Var, i0Var2, p.e, p.f14646f, bundle2);
        this.h = l0Var;
        this.f14466j = new r1(Process.myUid(), context.getPackageName(), g1Var, bundle, ((n4.r) l0Var.f14609k.f15004b).f14987c.f15001b);
        k1 k1Var = new k1(b1Var);
        this.f14476t = k1Var;
        e2.d0.U(handler, new x1(29, this, k1Var));
        this.f14478w = 3000L;
        this.f14470n = new u(this, 2);
        e2.d0.U(handler, new u(this, 3));
    }

    public static void a(a0 a0Var) {
        synchronized (a0Var.f14460a) {
            try {
                if (a0Var.v) {
                    return;
                }
                final p1 O0 = a0Var.f14476t.O0();
                if (!a0Var.f14462c.hasMessages(1)) {
                    p1 p1Var = a0Var.f14475s.f14569c;
                    b2.a1 a1Var = O0.f14663a;
                    int i10 = a1Var.f2930b;
                    b2.a1 a1Var2 = p1Var.f14663a;
                    if (i10 == a1Var2.f2930b && a1Var.e == a1Var2.e && a1Var.h == a1Var2.h && a1Var.f2934i == a1Var2.f2934i) {
                        ni.f fVar = a0Var.f14464g.f14548b;
                        e9.i0 s10 = fVar.s();
                        for (int i11 = 0; i11 < s10.size(); i11++) {
                            final r rVar = (r) s10.get(i11);
                            fVar.v(rVar);
                            final boolean B2 = fVar.B(rVar, 16);
                            final boolean B3 = fVar.B(rVar, 17);
                            a0Var.c(rVar, new z() {
                                @Override
                                public final void d(q qVar, int i12) {
                                    qVar.e(i12, p1.this, B2, B3, rVar.f14679c);
                                }
                            });
                        }
                        try {
                            a0Var.h.f14607i.e(0, O0, true, true, 0);
                        } catch (RemoteException e) {
                            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
                        }
                    }
                }
                a0Var.t();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean k(r rVar) {
        if (rVar != null && Objects.equals(rVar.f14677a.f14939a.f14940a, "com.android.systemui")) {
            return true;
        }
        return false;
    }

    public final boolean b(KeyEvent keyEvent, boolean z10, boolean z11) {
        b bVar;
        r e = this.f14467k.f14709a.e();
        e.getClass();
        int keyCode = keyEvent.getKeyCode();
        if ((keyCode == 85 || keyCode == 79) && z10) {
            keyCode = 87;
        }
        if (keyCode != 126) {
            if (keyCode != 127) {
                if (keyCode != 272) {
                    if (keyCode != 273) {
                        switch (keyCode) {
                            case 85:
                                if (this.f14476t.u()) {
                                    bVar = new b(this, e, 5);
                                    break;
                                } else {
                                    bVar = new b(this, e, 6);
                                    break;
                                }
                            case 86:
                                bVar = new b(this, e, 4);
                                break;
                            case 87:
                                break;
                            case 88:
                                break;
                            case 89:
                                bVar = new b(this, e, 3);
                                break;
                            case 90:
                                bVar = new b(this, e, 2);
                                break;
                            default:
                                return false;
                        }
                    }
                    bVar = new b(this, e, 1);
                }
                bVar = new b(this, e, 9);
            } else {
                bVar = new b(this, e, 8);
            }
        } else {
            bVar = new b(this, e, 7);
        }
        e2.d0.U(this.f14468l, new s4(this, z11, e, bVar, 6));
        return true;
    }

    public final void c(r rVar, z zVar) {
        int i10;
        g1 g1Var = this.f14464g;
        try {
            com.google.android.gms.common.api.internal.v x10 = g1Var.f14548b.x(rVar);
            if (x10 != null) {
                i10 = x10.e();
            } else if (h(rVar)) {
                i10 = 0;
            } else {
                return;
            }
            q qVar = rVar.d;
            if (qVar != null) {
                zVar.d(qVar, i10);
            }
        } catch (DeadObjectException unused) {
            g1Var.f14548b.M(rVar);
        } catch (RemoteException e) {
            e2.a.o("MediaSessionImpl", "Exception in " + rVar, e);
        }
    }

    public final void d(z zVar) {
        e9.i0 s10 = this.f14464g.f14548b.s();
        for (int i10 = 0; i10 < s10.size(); i10++) {
            c((r) s10.get(i10), zVar);
        }
        try {
            zVar.d(this.h.f14607i, 0);
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final r e() {
        e9.i0 s10 = this.f14464g.f14548b.s();
        for (int i10 = 0; i10 < s10.size(); i10++) {
            r rVar = (r) s10.get(i10);
            if (i(rVar)) {
                return rVar;
            }
        }
        return null;
    }

    public final void f(b2.x0 x0Var) {
        this.f14462c.a(false, false);
        d(new k2.v(x0Var, 3));
        try {
            j0 j0Var = this.h.f14607i;
            b2.l lVar = this.f14475s.f14580q;
            j0Var.k();
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final void g(r rVar, boolean z10) {
        boolean z11;
        boolean z12;
        if (o()) {
            if (this.f14476t.m0(16) && this.f14476t.w() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!this.f14476t.m0(31) && !this.f14476t.m0(20)) {
                z12 = false;
            } else {
                z12 = true;
            }
            r s10 = s(rVar);
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            e2.d.g(!false);
            sparseBooleanArray.append(1, true);
            e2.d.g(!false);
            b2.x0 x0Var = new b2.x0(new b2.q(sparseBooleanArray));
            if (!z11 && z12) {
                this.e.getClass();
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                ?? obj = new Object();
                obj.n(unsupportedOperationException);
                androidx.activity.n nVar = new androidx.activity.n(this, s10, z10, x0Var);
                obj.a(new i9.s(0, (Object) obj, nVar), new k2.d0(this, 1));
                return;
            }
            if (!z11) {
                e2.a.n("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
            }
            e2.d0.H(this.f14476t);
            if (z10) {
                p(s10);
            }
        }
    }

    public final boolean h(r rVar) {
        if (!this.f14464g.f14548b.A(rVar) && !this.h.f14605f.A(rVar)) {
            return false;
        }
        return true;
    }

    public final boolean i(r rVar) {
        if (!Objects.equals(rVar.f14677a.f14939a.f14940a, this.f14463f.getPackageName()) || rVar.f14678b == 0 || !new Bundle(rVar.e).getBoolean("androidx.media3.session.MediaNotificationManager", false)) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        boolean z10;
        synchronized (this.f14460a) {
            z10 = this.v;
        }
        return z10;
    }

    public final i9.w l(r rVar, List list) {
        s(rVar);
        this.e.getClass();
        return na.d.z3(list);
    }

    public final p m(r rVar) {
        e9.i0 v;
        boolean z10 = this.f14479x;
        e9.i0 i0Var = null;
        l0 l0Var = this.h;
        if (z10 && k(rVar)) {
            l0Var.getClass();
            n1 n1Var = p.e;
            n1 n1Var2 = l0Var.f14619u;
            n1Var2.getClass();
            b2.x0 x0Var = l0Var.v;
            x0Var.getClass();
            e9.i0 i0Var2 = l0Var.f14617s;
            if (i0Var2 == null) {
                v = null;
            } else {
                v = e9.i0.v(i0Var2);
            }
            e9.i0 i0Var3 = l0Var.f14618t;
            if (i0Var3 != null) {
                i0Var = e9.i0.v(i0Var3);
            }
            return new p(n1Var2, x0Var, v, i0Var);
        }
        this.e.getClass();
        b2.x0 x0Var2 = p.f14646f;
        n1 n1Var3 = p.e;
        p pVar = new p(n1Var3, x0Var2, null, null);
        if (i(rVar)) {
            boolean z11 = true;
            this.f14479x = true;
            t tVar = this.f14467k;
            e9.i0 i0Var4 = tVar.f14709a.f14481z;
            if (i0Var4.isEmpty()) {
                l0Var.f14617s = tVar.f14709a.f14480y;
            } else {
                l0Var.f14618t = i0Var4;
                Bundle bundle = l0Var.f14616r;
                boolean z12 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
                boolean z13 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
                l0Var.M();
                if (bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) != z12 || bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) != z13) {
                    ((n4.r) l0Var.f14609k.f15004b).f14985a.setExtras(bundle);
                }
            }
            a0 a0Var = l0Var.f14606g;
            Bundle bundle2 = l0Var.f14616r;
            if (l0Var.v.a(17) == x0Var2.a(17)) {
                z11 = false;
            }
            l0Var.f14619u = n1Var3;
            l0Var.v = x0Var2;
            if (!l0Var.f14618t.isEmpty()) {
                boolean z14 = bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
                boolean z15 = bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
                l0Var.M();
                if (bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) != z14 || bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) != z15) {
                    ((n4.r) l0Var.f14609k.f15004b).f14985a.setExtras(bundle2);
                }
            }
            if (z11) {
                e2.d0.U(a0Var.f14468l, new f0(l0Var, a0Var.f14476t, 0));
                return pVar;
            }
            l0Var.N(a0Var.f14476t);
        }
        return pVar;
    }

    public final i9.u n(r rVar) {
        s(rVar);
        this.e.getClass();
        return l8.b(new q1(-6));
    }

    public final boolean o() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            ?? obj = new Object();
            this.f14471o.post(new x1(27, this, (Object) obj));
            try {
                return ((Boolean) obj.get()).booleanValue();
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException(e);
            }
        }
        return true;
    }

    public final void p(r rVar) {
        s(rVar);
        this.e.getClass();
    }

    public final i9.c0 q(r rVar, List list, final int i10, final long j3) {
        s(rVar);
        this.e.getClass();
        return e2.d0.d0(na.d.z3(list), new i9.p() {
            @Override
            public final i9.w apply(Object obj) {
                return l8.b(new s(j3, i10, (List) obj));
            }
        });
    }

    public final void r() {
        e2.a.i("MediaSessionImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.1] [" + e2.d0.f7888a + "] [" + b2.l0.b() + "]");
        synchronized (this.f14460a) {
            try {
                if (this.v) {
                    return;
                }
                this.v = true;
                w wVar = this.d;
                gg.t tVar = wVar.f14721a;
                if (tVar != null) {
                    wVar.removeCallbacks(tVar);
                    wVar.f14721a = null;
                }
                this.f14468l.removeCallbacksAndMessages(null);
                try {
                    e2.d0.U(this.f14468l, new u(this, 0));
                } catch (Exception e) {
                    e2.a.o("MediaSessionImpl", "Exception thrown while closing", e);
                }
                l0 l0Var = this.h;
                ComponentName componentName = l0Var.f14611m;
                a0 a0Var = l0Var.f14606g;
                n4.y yVar = l0Var.f14609k;
                int i10 = Build.VERSION.SDK_INT;
                int i11 = 0;
                if (i10 < 31) {
                    if (componentName == null) {
                        ((n4.r) yVar.f15004b).f14985a.setMediaButtonReceiver(null);
                    } else {
                        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", a0Var.f14461b);
                        intent.setComponent(componentName);
                        ((n4.r) yVar.f15004b).f14985a.setMediaButtonReceiver(PendingIntent.getBroadcast(a0Var.f14463f, 0, intent, l0.f14604w));
                    }
                }
                androidx.mediarouter.app.g gVar = l0Var.f14610l;
                if (gVar != null) {
                    a0Var.f14463f.unregisterReceiver(gVar);
                }
                n4.r rVar = (n4.r) yVar.f15004b;
                MediaSession mediaSession = rVar.f14985a;
                rVar.f14988f.kill();
                if (i10 == 27) {
                    try {
                        Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                        declaredField.setAccessible(true);
                        Handler handler = (Handler) declaredField.get(mediaSession);
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(null);
                        }
                    } catch (Exception e7) {
                        Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e7);
                    }
                }
                mediaSession.setCallback(null);
                rVar.f14986b.f14984a.clear();
                mediaSession.release();
                g1 g1Var = this.f14464g;
                Set<r> set = g1Var.f14549c;
                ni.f fVar = g1Var.f14548b;
                e9.i0 s10 = fVar.s();
                int size = s10.size();
                while (i11 < size) {
                    Object obj = s10.get(i11);
                    i11++;
                    r rVar2 = (r) obj;
                    fVar.M(rVar2);
                    q qVar = rVar2.d;
                    if (qVar != null) {
                        qVar.f();
                    }
                }
                for (r rVar3 : set) {
                    q qVar2 = rVar3.d;
                    if (qVar2 != null) {
                        qVar2.f();
                    }
                }
                set.clear();
                g1Var.f14547a.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final r s(r rVar) {
        if (this.f14479x && k(rVar)) {
            r e = e();
            e.getClass();
            return e;
        }
        return rVar;
    }

    public final void t() {
        Handler handler = this.f14468l;
        u uVar = this.f14470n;
        handler.removeCallbacks(uVar);
        if (this.f14473q) {
            long j3 = this.f14478w;
            if (j3 > 0) {
                if (this.f14476t.i0() || this.f14476t.c()) {
                    handler.postDelayed(uVar, j3);
                }
            }
        }
    }

    public final void u(k1 k1Var, k1 k1Var2) {
        b2.n0 n0Var;
        float f7;
        b2.e eVar;
        d2.d dVar;
        int i10;
        boolean z10;
        b2.s1 s1Var;
        l0 l0Var = this.h;
        this.f14476t = k1Var2;
        if (k1Var != null) {
            y yVar = this.f14477u;
            e2.d.h(yVar);
            k1Var.D(yVar);
        }
        y yVar2 = new y(this, k1Var2);
        k1Var2.n0(yVar2);
        this.f14477u = yVar2;
        try {
            l0Var.f14607i.m(0, k1Var, k1Var2);
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
        }
        if (k1Var == null) {
            ((n4.r) l0Var.f14609k.f15004b).f14985a.setActive(true);
        }
        b2.u0 W = k1Var2.W();
        p1 O0 = k1Var2.O0();
        b2.a1 N0 = k1Var2.N0();
        b2.a1 N02 = k1Var2.N0();
        b2.v0 h = k1Var2.h();
        int l4 = k1Var2.l();
        boolean A0 = k1Var2.A0();
        b2.x1 E = k1Var2.E();
        b2.k1 Q0 = k1Var2.Q0();
        if (k1Var2.m0(18)) {
            n0Var = k1Var2.h0();
        } else {
            n0Var = b2.n0.K;
        }
        b2.n0 n0Var2 = n0Var;
        if (k1Var2.m0(22)) {
            f7 = k1Var2.G();
        } else {
            f7 = 1.0f;
        }
        if (k1Var2.m0(21)) {
            eVar = k1Var2.I();
        } else {
            eVar = b2.e.h;
        }
        b2.e eVar2 = eVar;
        if (k1Var2.m0(28)) {
            dVar = k1Var2.j0();
        } else {
            dVar = d2.d.d;
        }
        d2.d dVar2 = dVar;
        b2.l K = k1Var2.K();
        if (k1Var2.m0(23)) {
            i10 = k1Var2.m();
        } else {
            i10 = 0;
        }
        if (k1Var2.m0(23) && k1Var2.x0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean u10 = k1Var2.u();
        int u02 = k1Var2.u0();
        int d = k1Var2.d();
        boolean i02 = k1Var2.i0();
        boolean c10 = k1Var2.c();
        b2.n0 R0 = k1Var2.R0();
        long L0 = k1Var2.L0();
        long Z = k1Var2.Z();
        long z11 = k1Var2.z();
        if (k1Var2.m0(30)) {
            s1Var = k1Var2.g0();
        } else {
            s1Var = b2.s1.f3319b;
        }
        this.f14475s = new i1(W, 0, O0, N0, N02, 0, h, l4, A0, E, Q0, 0, n0Var2, f7, eVar2, dVar2, K, i10, z10, u10, 1, u02, d, i02, c10, R0, L0, Z, z11, s1Var, k1Var2.B0());
        f(k1Var2.t());
    }

    public final void v() {
        if (Looper.myLooper() == this.f14468l.getLooper()) {
            return;
        }
        throw new IllegalStateException("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
    }
}
