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
import b2.s1;
import gg.x1;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import v7.l8;
public class a0 {
    public static final l1 B = new l1(1);
    public final Bundle A;
    public final Object f14438a = new Object();
    public final Uri f14439b;
    public final x f14440c;
    public final w d;
    public final na.d e;
    public final Context f14441f;
    public final b1 f14442g;
    public final l0 h;
    public final String f14443i;
    public final m1 f14444j;
    public final t f14445k;
    public final Handler f14446l;
    public final n4.y f14447m;
    public final u f14448n;
    public final Handler f14449o;
    public final boolean f14450p;
    public final boolean f14451q;
    public final e9.i0 f14452r;
    public d1 f14453s;
    public f1 f14454t;
    public y f14455u;
    public boolean v;
    public final long f14456w;
    public boolean f14457x;
    public final e9.i0 f14458y;
    public final e9.i0 f14459z;

    public a0(t tVar, Context context, b2.b1 b1Var, e9.i0 i0Var, e9.i0 i0Var2, e9.i0 i0Var3, na.d dVar, Bundle bundle, Bundle bundle2, n4.y yVar) {
        e2.a.i("MediaSessionImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.1] [" + e2.d0.f7871a + "]");
        this.f14445k = tVar;
        this.f14441f = context;
        this.f14443i = "pip-media-session";
        this.f14458y = i0Var;
        this.f14459z = i0Var2;
        this.f14452r = i0Var3;
        this.e = dVar;
        this.A = bundle2;
        this.f14447m = yVar;
        this.f14450p = true;
        this.f14451q = true;
        b1 b1Var2 = new b1(this);
        this.f14442g = b1Var2;
        this.f14449o = new Handler(Looper.getMainLooper());
        Looper y02 = b1Var.y0();
        Handler handler = new Handler(y02);
        this.f14446l = handler;
        this.f14453s = d1.F;
        this.f14440c = new x(this, y02);
        this.d = new w(this, y02);
        Uri build = new Uri.Builder().scheme(a0.class.getName()).appendPath("pip-media-session").appendPath(String.valueOf(SystemClock.elapsedRealtime())).build();
        this.f14439b = build;
        l0 l0Var = new l0(this, build, handler, bundle, i0Var, i0Var2, p.e, p.f14657f, bundle2);
        this.h = l0Var;
        this.f14444j = new m1(Process.myUid(), context.getPackageName(), b1Var2, bundle, ((n4.r) l0Var.f14610k.f14969b).f14952c.f14966b);
        f1 f1Var = new f1(b1Var);
        this.f14454t = f1Var;
        e2.d0.U(handler, new x1(29, this, f1Var));
        this.f14456w = 3000L;
        this.f14448n = new u(this, 2);
        e2.d0.U(handler, new u(this, 3));
    }

    public static void a(a0 a0Var) {
        synchronized (a0Var.f14438a) {
            try {
                if (a0Var.v) {
                    return;
                }
                final k1 O0 = a0Var.f14454t.O0();
                if (!a0Var.f14440c.hasMessages(1)) {
                    k1 k1Var = a0Var.f14453s.f14491c;
                    b2.a1 a1Var = O0.f14593a;
                    int i10 = a1Var.f2922b;
                    b2.a1 a1Var2 = k1Var.f14593a;
                    if (i10 == a1Var2.f2922b && a1Var.e == a1Var2.e && a1Var.h == a1Var2.h && a1Var.f2926i == a1Var2.f2926i) {
                        ni.f fVar = a0Var.f14442g.f14466b;
                        e9.i0 s10 = fVar.s();
                        for (int i11 = 0; i11 < s10.size(); i11++) {
                            final r rVar = (r) s10.get(i11);
                            fVar.v(rVar);
                            final boolean B2 = fVar.B(rVar, 16);
                            final boolean B3 = fVar.B(rVar, 17);
                            a0Var.c(rVar, new z() {
                                @Override
                                public final void d(q qVar, int i12) {
                                    qVar.e(i12, k1.this, B2, B3, rVar.f14667c);
                                }
                            });
                        }
                        try {
                            a0Var.h.f14608i.e(0, O0, true, true, 0);
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
        if (rVar != null && Objects.equals(rVar.f14665a.f14904a.f14905a, "com.android.systemui")) {
            return true;
        }
        return false;
    }

    public final boolean b(KeyEvent keyEvent, boolean z10, boolean z11) {
        b bVar;
        r e = this.f14445k.f14676a.e();
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
                                if (this.f14454t.u()) {
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
        e2.d0.U(this.f14446l, new s4(this, z11, e, bVar, 6));
        return true;
    }

    public final void c(r rVar, z zVar) {
        int i10;
        b1 b1Var = this.f14442g;
        try {
            com.google.android.gms.common.api.internal.v x10 = b1Var.f14466b.x(rVar);
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
            b1Var.f14466b.M(rVar);
        } catch (RemoteException e) {
            e2.a.o("MediaSessionImpl", "Exception in " + rVar, e);
        }
    }

    public final void d(z zVar) {
        e9.i0 s10 = this.f14442g.f14466b.s();
        for (int i10 = 0; i10 < s10.size(); i10++) {
            c((r) s10.get(i10), zVar);
        }
        try {
            zVar.d(this.h.f14608i, 0);
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final r e() {
        e9.i0 s10 = this.f14442g.f14466b.s();
        for (int i10 = 0; i10 < s10.size(); i10++) {
            r rVar = (r) s10.get(i10);
            if (i(rVar)) {
                return rVar;
            }
        }
        return null;
    }

    public final void f(b2.x0 x0Var) {
        this.f14440c.a(false, false);
        d(new le.b(x0Var, 1));
        try {
            j0 j0Var = this.h.f14608i;
            b2.l lVar = this.f14453s.f14502q;
            j0Var.k();
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final void g(r rVar, boolean z10) {
        boolean z11;
        boolean z12;
        if (o()) {
            if (this.f14454t.m0(16) && this.f14454t.w() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!this.f14454t.m0(31) && !this.f14454t.m0(20)) {
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
                obj.a(new i9.s(0, (Object) obj, nVar), new k2.c0(this, 1));
                return;
            }
            if (!z11) {
                e2.a.n("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
            }
            e2.d0.H(this.f14454t);
            if (z10) {
                p(s10);
            }
        }
    }

    public final boolean h(r rVar) {
        if (!this.f14442g.f14466b.A(rVar) && !this.h.f14606f.A(rVar)) {
            return false;
        }
        return true;
    }

    public final boolean i(r rVar) {
        if (!Objects.equals(rVar.f14665a.f14904a.f14905a, this.f14441f.getPackageName()) || rVar.f14666b == 0 || !new Bundle(rVar.e).getBoolean("androidx.media3.session.MediaNotificationManager", false)) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        boolean z10;
        synchronized (this.f14438a) {
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
        boolean z10 = this.f14457x;
        e9.i0 i0Var = null;
        l0 l0Var = this.h;
        if (z10 && k(rVar)) {
            l0Var.getClass();
            i1 i1Var = p.e;
            i1 i1Var2 = l0Var.f14620u;
            i1Var2.getClass();
            b2.x0 x0Var = l0Var.v;
            x0Var.getClass();
            e9.i0 i0Var2 = l0Var.f14618s;
            if (i0Var2 == null) {
                v = null;
            } else {
                v = e9.i0.v(i0Var2);
            }
            e9.i0 i0Var3 = l0Var.f14619t;
            if (i0Var3 != null) {
                i0Var = e9.i0.v(i0Var3);
            }
            return new p(i1Var2, x0Var, v, i0Var);
        }
        this.e.getClass();
        b2.x0 x0Var2 = p.f14657f;
        i1 i1Var3 = p.e;
        p pVar = new p(i1Var3, x0Var2, null, null);
        if (i(rVar)) {
            boolean z11 = true;
            this.f14457x = true;
            t tVar = this.f14445k;
            e9.i0 i0Var4 = tVar.f14676a.f14459z;
            if (i0Var4.isEmpty()) {
                l0Var.f14618s = tVar.f14676a.f14458y;
            } else {
                l0Var.f14619t = i0Var4;
                Bundle bundle = l0Var.f14617r;
                boolean z12 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
                boolean z13 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
                l0Var.M();
                if (bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) != z12 || bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) != z13) {
                    ((n4.r) l0Var.f14610k.f14969b).f14950a.setExtras(bundle);
                }
            }
            a0 a0Var = l0Var.f14607g;
            Bundle bundle2 = l0Var.f14617r;
            if (l0Var.v.a(17) == x0Var2.a(17)) {
                z11 = false;
            }
            l0Var.f14620u = i1Var3;
            l0Var.v = x0Var2;
            if (!l0Var.f14619t.isEmpty()) {
                boolean z14 = bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
                boolean z15 = bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
                l0Var.M();
                if (bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) != z14 || bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) != z15) {
                    ((n4.r) l0Var.f14610k.f14969b).f14950a.setExtras(bundle2);
                }
            }
            if (z11) {
                e2.d0.U(a0Var.f14446l, new f0(l0Var, a0Var.f14454t, 0));
                return pVar;
            }
            l0Var.N(a0Var.f14454t);
        }
        return pVar;
    }

    public final i9.u n(r rVar) {
        s(rVar);
        this.e.getClass();
        return l8.b(new l1(-6));
    }

    public final boolean o() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            ?? obj = new Object();
            this.f14449o.post(new x1(27, this, (Object) obj));
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
        e2.a.i("MediaSessionImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.1] [" + e2.d0.f7871a + "] [" + b2.l0.b() + "]");
        synchronized (this.f14438a) {
            try {
                if (this.v) {
                    return;
                }
                this.v = true;
                w wVar = this.d;
                gg.t tVar = wVar.f14689a;
                if (tVar != null) {
                    wVar.removeCallbacks(tVar);
                    wVar.f14689a = null;
                }
                this.f14446l.removeCallbacksAndMessages(null);
                try {
                    e2.d0.U(this.f14446l, new u(this, 0));
                } catch (Exception e) {
                    e2.a.o("MediaSessionImpl", "Exception thrown while closing", e);
                }
                l0 l0Var = this.h;
                ComponentName componentName = l0Var.f14612m;
                a0 a0Var = l0Var.f14607g;
                n4.y yVar = l0Var.f14610k;
                int i10 = Build.VERSION.SDK_INT;
                int i11 = 0;
                if (i10 < 31) {
                    if (componentName == null) {
                        ((n4.r) yVar.f14969b).f14950a.setMediaButtonReceiver(null);
                    } else {
                        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", a0Var.f14439b);
                        intent.setComponent(componentName);
                        ((n4.r) yVar.f14969b).f14950a.setMediaButtonReceiver(PendingIntent.getBroadcast(a0Var.f14441f, 0, intent, l0.f14605w));
                    }
                }
                androidx.mediarouter.app.g gVar = l0Var.f14611l;
                if (gVar != null) {
                    a0Var.f14441f.unregisterReceiver(gVar);
                }
                n4.r rVar = (n4.r) yVar.f14969b;
                MediaSession mediaSession = rVar.f14950a;
                rVar.f14953f.kill();
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
                rVar.f14951b.f14949a.clear();
                mediaSession.release();
                b1 b1Var = this.f14442g;
                Set<r> set = b1Var.f14467c;
                ni.f fVar = b1Var.f14466b;
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
                b1Var.f14465a.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final r s(r rVar) {
        if (this.f14457x && k(rVar)) {
            r e = e();
            e.getClass();
            return e;
        }
        return rVar;
    }

    public final void t() {
        Handler handler = this.f14446l;
        u uVar = this.f14448n;
        handler.removeCallbacks(uVar);
        if (this.f14451q) {
            long j3 = this.f14456w;
            if (j3 > 0) {
                if (this.f14454t.i0() || this.f14454t.c()) {
                    handler.postDelayed(uVar, j3);
                }
            }
        }
    }

    public final void u(f1 f1Var, f1 f1Var2) {
        b2.n0 n0Var;
        float f7;
        b2.e eVar;
        d2.d dVar;
        int i10;
        boolean z10;
        s1 s1Var;
        l0 l0Var = this.h;
        this.f14454t = f1Var2;
        if (f1Var != null) {
            y yVar = this.f14455u;
            e2.d.h(yVar);
            f1Var.D(yVar);
        }
        y yVar2 = new y(this, f1Var2);
        f1Var2.n0(yVar2);
        this.f14455u = yVar2;
        try {
            l0Var.f14608i.m(0, f1Var, f1Var2);
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
        }
        if (f1Var == null) {
            ((n4.r) l0Var.f14610k.f14969b).f14950a.setActive(true);
        }
        b2.u0 W = f1Var2.W();
        k1 O0 = f1Var2.O0();
        b2.a1 N0 = f1Var2.N0();
        b2.a1 N02 = f1Var2.N0();
        b2.v0 h = f1Var2.h();
        int l4 = f1Var2.l();
        boolean A0 = f1Var2.A0();
        b2.x1 E = f1Var2.E();
        b2.k1 Q0 = f1Var2.Q0();
        if (f1Var2.m0(18)) {
            n0Var = f1Var2.h0();
        } else {
            n0Var = b2.n0.K;
        }
        b2.n0 n0Var2 = n0Var;
        if (f1Var2.m0(22)) {
            f7 = f1Var2.G();
        } else {
            f7 = 1.0f;
        }
        if (f1Var2.m0(21)) {
            eVar = f1Var2.I();
        } else {
            eVar = b2.e.h;
        }
        b2.e eVar2 = eVar;
        if (f1Var2.m0(28)) {
            dVar = f1Var2.j0();
        } else {
            dVar = d2.d.d;
        }
        d2.d dVar2 = dVar;
        b2.l K = f1Var2.K();
        if (f1Var2.m0(23)) {
            i10 = f1Var2.m();
        } else {
            i10 = 0;
        }
        if (f1Var2.m0(23) && f1Var2.x0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean u10 = f1Var2.u();
        int u02 = f1Var2.u0();
        int d = f1Var2.d();
        boolean i02 = f1Var2.i0();
        boolean c10 = f1Var2.c();
        b2.n0 R0 = f1Var2.R0();
        long L0 = f1Var2.L0();
        long Z = f1Var2.Z();
        long z11 = f1Var2.z();
        if (f1Var2.m0(30)) {
            s1Var = f1Var2.g0();
        } else {
            s1Var = s1.f3311b;
        }
        this.f14453s = new d1(W, 0, O0, N0, N02, 0, h, l4, A0, E, Q0, 0, n0Var2, f7, eVar2, dVar2, K, i10, z10, u10, 1, u02, d, i02, c10, R0, L0, Z, z11, s1Var, f1Var2.B0());
        f(f1Var2.t());
    }

    public final void v() {
        if (Looper.myLooper() == this.f14446l.getLooper()) {
            return;
        }
        throw new IllegalStateException("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
    }
}
