package m4;

import ai.t4;
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
import b2.s1;
import b2.x1;
import gg.w1;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import v7.j8;
public class c0 {
    public static final m1 B = new m1(1);
    public final Bundle A;
    public final Object f15731a = new Object();
    public final Uri f15732b;
    public final z f15733c;
    public final y d;
    public final na.d f15734e;
    public final Context f15735f;
    public final c1 f15736g;
    public final m0 h;
    public final String f15737i;
    public final n1 f15738j;
    public final t f15739k;
    public final Handler f15740l;
    public final n4.y f15741m;
    public final u f15742n;
    public final Handler f15743o;
    public final boolean f15744p;
    public final boolean f15745q;
    public final e9.i0 f15746r;
    public e1 f15747s;
    public g1 f15748t;
    public a0 f15749u;
    public boolean v;
    public final long f15750w;
    public boolean f15751x;
    public final e9.i0 f15752y;
    public final e9.i0 f15753z;

    public c0(t tVar, Context context, b2.b1 b1Var, e9.i0 i0Var, e9.i0 i0Var2, e9.i0 i0Var3, na.d dVar, Bundle bundle, Bundle bundle2, n4.y yVar) {
        e2.a.i("MediaSessionImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.1] [" + e2.d0.f8529a + "]");
        this.f15739k = tVar;
        this.f15735f = context;
        this.f15737i = "pip-media-session";
        this.f15752y = i0Var;
        this.f15753z = i0Var2;
        this.f15746r = i0Var3;
        this.f15734e = dVar;
        this.A = bundle2;
        this.f15741m = yVar;
        this.f15744p = true;
        this.f15745q = true;
        c1 c1Var = new c1(this);
        this.f15736g = c1Var;
        this.f15743o = new Handler(Looper.getMainLooper());
        Looper y02 = b1Var.y0();
        Handler handler = new Handler(y02);
        this.f15740l = handler;
        this.f15747s = e1.F;
        this.f15733c = new z(this, y02);
        this.d = new y(this, y02);
        Uri build = new Uri.Builder().scheme(c0.class.getName()).appendPath("pip-media-session").appendPath(String.valueOf(SystemClock.elapsedRealtime())).build();
        this.f15732b = build;
        m0 m0Var = new m0(this, build, handler, bundle, i0Var, i0Var2, p.f15955e, p.f15956f, bundle2);
        this.h = m0Var;
        this.f15738j = new n1(Process.myUid(), context.getPackageName(), c1Var, bundle, ((n4.s) m0Var.f15908k.f16362b).f16345c.f16359b);
        g1 g1Var = new g1(b1Var);
        this.f15748t = g1Var;
        e2.d0.T(handler, new w(1, this, g1Var));
        this.f15750w = 3000L;
        this.f15742n = new u(this, 2);
        e2.d0.T(handler, new u(this, 3));
    }

    public static void a(c0 c0Var) {
        synchronized (c0Var.f15731a) {
            try {
                if (c0Var.v) {
                    return;
                }
                final l1 O0 = c0Var.f15748t.O0();
                if (!c0Var.f15733c.hasMessages(1)) {
                    l1 l1Var = c0Var.f15747s.f15784c;
                    b2.a1 a1Var = O0.f15895a;
                    int i10 = a1Var.f3231b;
                    b2.a1 a1Var2 = l1Var.f15895a;
                    if (i10 == a1Var2.f3231b && a1Var.f3233e == a1Var2.f3233e && a1Var.h == a1Var2.h && a1Var.f3236i == a1Var2.f3236i) {
                        oi.f fVar = c0Var.f15736g.f15755b;
                        e9.i0 s10 = fVar.s();
                        for (int i11 = 0; i11 < s10.size(); i11++) {
                            final r rVar = (r) s10.get(i11);
                            fVar.v(rVar);
                            final boolean B2 = fVar.B(rVar, 16);
                            final boolean B3 = fVar.B(rVar, 17);
                            c0Var.c(rVar, new b0() {
                                @Override
                                public final void d(q qVar, int i12) {
                                    qVar.e(i12, l1.this, B2, B3, rVar.f15967c);
                                }
                            });
                        }
                        try {
                            c0Var.h.f15906i.e(0, O0, true, true, 0);
                        } catch (RemoteException e7) {
                            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
                        }
                    }
                }
                c0Var.t();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean k(r rVar) {
        if (rVar != null && Objects.equals(rVar.f15965a.f16291a.f16292a, "com.android.systemui")) {
            return true;
        }
        return false;
    }

    public final boolean b(KeyEvent keyEvent, boolean z10, boolean z11) {
        b bVar;
        r e7 = this.f15739k.f15977a.e();
        e7.getClass();
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
                                if (this.f15748t.u()) {
                                    bVar = new b(this, e7, 5);
                                    break;
                                } else {
                                    bVar = new b(this, e7, 6);
                                    break;
                                }
                            case 86:
                                bVar = new b(this, e7, 4);
                                break;
                            case 87:
                                break;
                            case 88:
                                break;
                            case 89:
                                bVar = new b(this, e7, 3);
                                break;
                            case 90:
                                bVar = new b(this, e7, 2);
                                break;
                            default:
                                return false;
                        }
                    }
                    bVar = new b(this, e7, 1);
                }
                bVar = new b(this, e7, 9);
            } else {
                bVar = new b(this, e7, 8);
            }
        } else {
            bVar = new b(this, e7, 7);
        }
        e2.d0.T(this.f15740l, new t4(this, z11, e7, bVar, 6));
        return true;
    }

    public final void c(r rVar, b0 b0Var) {
        int i10;
        c1 c1Var = this.f15736g;
        try {
            com.google.android.gms.common.api.internal.v x10 = c1Var.f15755b.x(rVar);
            if (x10 != null) {
                i10 = x10.e();
            } else if (h(rVar)) {
                i10 = 0;
            } else {
                return;
            }
            q qVar = rVar.d;
            if (qVar != null) {
                b0Var.d(qVar, i10);
            }
        } catch (DeadObjectException unused) {
            c1Var.f15755b.M(rVar);
        } catch (RemoteException e7) {
            e2.a.o("MediaSessionImpl", "Exception in " + rVar, e7);
        }
    }

    public final void d(b0 b0Var) {
        e9.i0 s10 = this.f15736g.f15755b.s();
        for (int i10 = 0; i10 < s10.size(); i10++) {
            c((r) s10.get(i10), b0Var);
        }
        try {
            b0Var.d(this.h.f15906i, 0);
        } catch (RemoteException e7) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
        }
    }

    public final r e() {
        e9.i0 s10 = this.f15736g.f15755b.s();
        for (int i10 = 0; i10 < s10.size(); i10++) {
            r rVar = (r) s10.get(i10);
            if (i(rVar)) {
                return rVar;
            }
        }
        return null;
    }

    public final void f(b2.x0 x0Var) {
        this.f15733c.a(false, false);
        d(new x(x0Var, 0));
        try {
            k0 k0Var = this.h.f15906i;
            b2.l lVar = this.f15747s.f15796q;
            k0Var.k();
        } catch (RemoteException e7) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
        }
    }

    public final void g(r rVar, boolean z10) {
        boolean z11;
        boolean z12;
        if (o()) {
            if (this.f15748t.n0(16) && this.f15748t.w() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!this.f15748t.n0(31) && !this.f15748t.n0(20)) {
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
                this.f15734e.getClass();
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                ?? obj = new Object();
                obj.n(unsupportedOperationException);
                obj.a(new i9.s(0, obj, new androidx.activity.n(this, s10, z10, x0Var)), new k2.a0(this, 1));
                return;
            }
            if (!z11) {
                e2.a.n("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
            }
            e2.d0.G(this.f15748t);
            if (z10) {
                p(s10);
            }
        }
    }

    public final boolean h(r rVar) {
        if (!this.f15736g.f15755b.A(rVar) && !this.h.f15904f.A(rVar)) {
            return false;
        }
        return true;
    }

    public final boolean i(r rVar) {
        if (!Objects.equals(rVar.f15965a.f16291a.f16292a, this.f15735f.getPackageName()) || rVar.f15966b == 0 || !new Bundle(rVar.f15968e).getBoolean("androidx.media3.session.MediaNotificationManager", false)) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        boolean z10;
        synchronized (this.f15731a) {
            z10 = this.v;
        }
        return z10;
    }

    public final i9.w l(r rVar, List list) {
        s(rVar);
        this.f15734e.getClass();
        return na.d.v3(list);
    }

    public final p m(r rVar) {
        e9.i0 v;
        boolean z10 = this.f15751x;
        e9.i0 i0Var = null;
        m0 m0Var = this.h;
        if (z10 && k(rVar)) {
            m0Var.getClass();
            j1 j1Var = p.f15955e;
            j1 j1Var2 = m0Var.f15918u;
            j1Var2.getClass();
            b2.x0 x0Var = m0Var.v;
            x0Var.getClass();
            e9.i0 i0Var2 = m0Var.f15916s;
            if (i0Var2 == null) {
                v = null;
            } else {
                v = e9.i0.v(i0Var2);
            }
            e9.i0 i0Var3 = m0Var.f15917t;
            if (i0Var3 != null) {
                i0Var = e9.i0.v(i0Var3);
            }
            return new p(j1Var2, x0Var, v, i0Var);
        }
        this.f15734e.getClass();
        b2.x0 x0Var2 = p.f15956f;
        j1 j1Var3 = p.f15955e;
        p pVar = new p(j1Var3, x0Var2, null, null);
        if (i(rVar)) {
            boolean z11 = true;
            this.f15751x = true;
            t tVar = this.f15739k;
            e9.i0 i0Var4 = tVar.f15977a.f15753z;
            if (i0Var4.isEmpty()) {
                m0Var.f15916s = tVar.f15977a.f15752y;
            } else {
                m0Var.f15917t = i0Var4;
                Bundle bundle = m0Var.f15915r;
                boolean z12 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
                boolean z13 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
                m0Var.M();
                if (bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) != z12 || bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) != z13) {
                    ((n4.s) m0Var.f15908k.f16362b).f16343a.setExtras(bundle);
                }
            }
            c0 c0Var = m0Var.f15905g;
            Bundle bundle2 = m0Var.f15915r;
            if (m0Var.v.a(17) == x0Var2.a(17)) {
                z11 = false;
            }
            m0Var.f15918u = j1Var3;
            m0Var.v = x0Var2;
            if (!m0Var.f15917t.isEmpty()) {
                boolean z14 = bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
                boolean z15 = bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
                m0Var.M();
                if (bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) != z14 || bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) != z15) {
                    ((n4.s) m0Var.f15908k.f16362b).f16343a.setExtras(bundle2);
                }
            }
            if (z11) {
                e2.d0.T(c0Var.f15740l, new h0(m0Var, c0Var.f15748t, 0));
                return pVar;
            }
            m0Var.N(c0Var.f15748t);
        }
        return pVar;
    }

    public final i9.u n(r rVar) {
        s(rVar);
        this.f15734e.getClass();
        return j8.b(new m1(-6));
    }

    public final boolean o() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            ?? obj = new Object();
            this.f15743o.post(new w1(29, this, obj));
            try {
                return ((Boolean) obj.get()).booleanValue();
            } catch (InterruptedException | ExecutionException e7) {
                throw new IllegalStateException(e7);
            }
        }
        return true;
    }

    public final void p(r rVar) {
        s(rVar);
        this.f15734e.getClass();
    }

    public final i9.c0 q(r rVar, List list, final int i10, final long j3) {
        s(rVar);
        this.f15734e.getClass();
        return e2.d0.c0(na.d.v3(list), new i9.p() {
            @Override
            public final i9.w apply(Object obj) {
                return j8.b(new s(j3, i10, (List) obj));
            }
        });
    }

    public final void r() {
        e2.a.i("MediaSessionImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.1] [" + e2.d0.f8529a + "] [" + b2.l0.b() + "]");
        synchronized (this.f15731a) {
            try {
                if (this.v) {
                    return;
                }
                this.v = true;
                y yVar = this.d;
                gg.t tVar = yVar.f16000a;
                if (tVar != null) {
                    yVar.removeCallbacks(tVar);
                    yVar.f16000a = null;
                }
                this.f15740l.removeCallbacksAndMessages(null);
                try {
                    e2.d0.T(this.f15740l, new u(this, 0));
                } catch (Exception e7) {
                    e2.a.o("MediaSessionImpl", "Exception thrown while closing", e7);
                }
                m0 m0Var = this.h;
                ComponentName componentName = m0Var.f15910m;
                c0 c0Var = m0Var.f15905g;
                n4.y yVar2 = m0Var.f15908k;
                int i10 = Build.VERSION.SDK_INT;
                int i11 = 0;
                if (i10 < 31) {
                    if (componentName == null) {
                        ((n4.s) yVar2.f16362b).f16343a.setMediaButtonReceiver(null);
                    } else {
                        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", c0Var.f15732b);
                        intent.setComponent(componentName);
                        ((n4.s) yVar2.f16362b).f16343a.setMediaButtonReceiver(PendingIntent.getBroadcast(c0Var.f15735f, 0, intent, m0.f15903w));
                    }
                }
                androidx.mediarouter.app.g gVar = m0Var.f15909l;
                if (gVar != null) {
                    c0Var.f15735f.unregisterReceiver(gVar);
                }
                n4.s sVar = (n4.s) yVar2.f16362b;
                MediaSession mediaSession = sVar.f16343a;
                sVar.f16347f.kill();
                if (i10 == 27) {
                    try {
                        Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                        declaredField.setAccessible(true);
                        Handler handler = (Handler) declaredField.get(mediaSession);
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(null);
                        }
                    } catch (Exception e10) {
                        Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e10);
                    }
                }
                mediaSession.setCallback(null);
                sVar.f16344b.f16342a.clear();
                mediaSession.release();
                c1 c1Var = this.f15736g;
                Set<r> set = c1Var.f15756c;
                oi.f fVar = c1Var.f15755b;
                e9.i0 s10 = fVar.s();
                int size = s10.size();
                while (i11 < size) {
                    Object obj = s10.get(i11);
                    i11++;
                    r rVar = (r) obj;
                    fVar.M(rVar);
                    q qVar = rVar.d;
                    if (qVar != null) {
                        qVar.f();
                    }
                }
                for (r rVar2 : set) {
                    q qVar2 = rVar2.d;
                    if (qVar2 != null) {
                        qVar2.f();
                    }
                }
                set.clear();
                c1Var.f15754a.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final r s(r rVar) {
        if (this.f15751x && k(rVar)) {
            r e7 = e();
            e7.getClass();
            return e7;
        }
        return rVar;
    }

    public final void t() {
        Handler handler = this.f15740l;
        u uVar = this.f15742n;
        handler.removeCallbacks(uVar);
        if (this.f15745q) {
            long j3 = this.f15750w;
            if (j3 > 0) {
                if (this.f15748t.i0() || this.f15748t.c()) {
                    handler.postDelayed(uVar, j3);
                }
            }
        }
    }

    public final void u(g1 g1Var, g1 g1Var2) {
        b2.n0 n0Var;
        float f7;
        b2.e eVar;
        d2.d dVar;
        boolean z10;
        s1 s1Var;
        m0 m0Var = this.h;
        this.f15748t = g1Var2;
        if (g1Var != null) {
            a0 a0Var = this.f15749u;
            e2.d.h(a0Var);
            g1Var.D(a0Var);
        }
        a0 a0Var2 = new a0(this, g1Var2);
        g1Var2.o0(a0Var2);
        this.f15749u = a0Var2;
        int i10 = 0;
        try {
            m0Var.f15906i.m(0, g1Var, g1Var2);
        } catch (RemoteException e7) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
        }
        if (g1Var == null) {
            ((n4.s) m0Var.f15908k.f16362b).f16343a.setActive(true);
        }
        b2.u0 W = g1Var2.W();
        l1 O0 = g1Var2.O0();
        b2.a1 N0 = g1Var2.N0();
        b2.a1 N02 = g1Var2.N0();
        b2.v0 h = g1Var2.h();
        int l4 = g1Var2.l();
        boolean A0 = g1Var2.A0();
        x1 E = g1Var2.E();
        b2.k1 Q0 = g1Var2.Q0();
        if (g1Var2.n0(18)) {
            n0Var = g1Var2.h0();
        } else {
            n0Var = b2.n0.K;
        }
        b2.n0 n0Var2 = n0Var;
        if (g1Var2.n0(22)) {
            f7 = g1Var2.G();
        } else {
            f7 = 1.0f;
        }
        float f10 = f7;
        if (g1Var2.n0(21)) {
            eVar = g1Var2.I();
        } else {
            eVar = b2.e.h;
        }
        b2.e eVar2 = eVar;
        if (g1Var2.n0(28)) {
            dVar = g1Var2.j0();
        } else {
            dVar = d2.d.d;
        }
        d2.d dVar2 = dVar;
        b2.l K = g1Var2.K();
        if (g1Var2.n0(23)) {
            i10 = g1Var2.m();
        }
        int i11 = i10;
        if (g1Var2.n0(23) && g1Var2.x0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = z10;
        boolean u10 = g1Var2.u();
        int u02 = g1Var2.u0();
        int d = g1Var2.d();
        boolean i02 = g1Var2.i0();
        boolean c10 = g1Var2.c();
        b2.n0 R0 = g1Var2.R0();
        long L0 = g1Var2.L0();
        long Z = g1Var2.Z();
        long z12 = g1Var2.z();
        if (g1Var2.n0(30)) {
            s1Var = g1Var2.g0();
        } else {
            s1Var = s1.f3651b;
        }
        this.f15747s = new e1(W, 0, O0, N0, N02, 0, h, l4, A0, E, Q0, 0, n0Var2, f10, eVar2, dVar2, K, i11, z11, u10, 1, u02, d, i02, c10, R0, L0, Z, z12, s1Var, g1Var2.B0());
        f(g1Var2.t());
    }

    public final void v() {
        if (Looper.myLooper() == this.f15740l.getLooper()) {
            return;
        }
        throw new IllegalStateException("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
    }
}
