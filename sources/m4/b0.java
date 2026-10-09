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
import j$.util.Objects;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import v7.j8;
public class b0 {
    public static final l1 B = new l1(1);
    public final Bundle A;
    public final Object f15980a = new Object();
    public final Uri f15981b;
    public final y f15982c;
    public final x d;
    public final na.d f15983e;
    public final Context f15984f;
    public final b1 f15985g;
    public final l0 h;
    public final String f15986i;
    public final m1 f15987j;
    public final t f15988k;
    public final Handler f15989l;
    public final pf.b f15990m;
    public final u f15991n;
    public final Handler f15992o;
    public final boolean f15993p;
    public final boolean f15994q;
    public final e9.i0 f15995r;
    public d1 f15996s;
    public f1 f15997t;
    public z f15998u;
    public boolean v;
    public final long f15999w;
    public boolean f16000x;
    public final e9.i0 f16001y;
    public final e9.i0 f16002z;

    public b0(t tVar, Context context, b2.b1 b1Var, e9.i0 i0Var, e9.i0 i0Var2, e9.i0 i0Var3, na.d dVar, Bundle bundle, Bundle bundle2, pf.b bVar) {
        e2.a.i("MediaSessionImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.1] [" + e2.d0.f8532a + "]");
        this.f15988k = tVar;
        this.f15984f = context;
        this.f15986i = "pip-media-session";
        this.f16001y = i0Var;
        this.f16002z = i0Var2;
        this.f15995r = i0Var3;
        this.f15983e = dVar;
        this.A = bundle2;
        this.f15990m = bVar;
        this.f15993p = true;
        this.f15994q = true;
        b1 b1Var2 = new b1(this);
        this.f15985g = b1Var2;
        this.f15992o = new Handler(Looper.getMainLooper());
        Looper y02 = b1Var.y0();
        Handler handler = new Handler(y02);
        this.f15989l = handler;
        this.f15996s = d1.F;
        this.f15982c = new y(this, y02);
        this.d = new x(this, y02);
        Uri build = new Uri.Builder().scheme(b0.class.getName()).appendPath("pip-media-session").appendPath(String.valueOf(SystemClock.elapsedRealtime())).build();
        this.f15981b = build;
        l0 l0Var = new l0(this, build, handler, bundle, i0Var, i0Var2, p.f16208e, p.f16209f, bundle2);
        this.h = l0Var;
        this.f15987j = new m1(Process.myUid(), context.getPackageName(), b1Var2, bundle, ((n4.r) l0Var.f16159k.f16612b).f16595c.f16609b);
        f1 f1Var = new f1(b1Var);
        this.f15997t = f1Var;
        e2.d0.T(handler, new ki.i0(4, this, f1Var));
        this.f15999w = 3000L;
        this.f15991n = new u(this, 2);
        e2.d0.T(handler, new u(this, 3));
    }

    public static void a(b0 b0Var) {
        synchronized (b0Var.f15980a) {
            try {
                if (b0Var.v) {
                    return;
                }
                final k1 O0 = b0Var.f15997t.O0();
                if (!b0Var.f15982c.hasMessages(1)) {
                    k1 k1Var = b0Var.f15996s.f16029c;
                    b2.a1 a1Var = O0.f16140a;
                    int i10 = a1Var.f3233b;
                    b2.a1 a1Var2 = k1Var.f16140a;
                    if (i10 == a1Var2.f3233b && a1Var.f3235e == a1Var2.f3235e && a1Var.h == a1Var2.h && a1Var.f3238i == a1Var2.f3238i) {
                        oi.f fVar = b0Var.f15985g.f16004b;
                        e9.i0 s10 = fVar.s();
                        for (int i11 = 0; i11 < s10.size(); i11++) {
                            final r rVar = (r) s10.get(i11);
                            fVar.v(rVar);
                            final boolean B2 = fVar.B(rVar, 16);
                            final boolean B3 = fVar.B(rVar, 17);
                            b0Var.c(rVar, new a0() {
                                @Override
                                public final void d(q qVar, int i12) {
                                    qVar.e(i12, k1.this, B2, B3, rVar.f16219c);
                                }
                            });
                        }
                        try {
                            b0Var.h.f16157i.e(0, O0, true, true, 0);
                        } catch (RemoteException e7) {
                            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
                        }
                    }
                }
                b0Var.t();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean k(r rVar) {
        if (rVar != null && Objects.equals(rVar.f16217a.f16617a.f16543a, "com.android.systemui")) {
            return true;
        }
        return false;
    }

    public final boolean b(KeyEvent keyEvent, boolean z10, boolean z11) {
        b bVar;
        r e7 = this.f15988k.f16229a.e();
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
                                if (this.f15997t.u()) {
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
        e2.d0.T(this.f15989l, new t4(this, z11, e7, bVar, 7));
        return true;
    }

    public final void c(r rVar, a0 a0Var) {
        int i10;
        b1 b1Var = this.f15985g;
        try {
            com.google.android.gms.common.api.internal.v x10 = b1Var.f16004b.x(rVar);
            if (x10 != null) {
                i10 = x10.e();
            } else if (h(rVar)) {
                i10 = 0;
            } else {
                return;
            }
            q qVar = rVar.d;
            if (qVar != null) {
                a0Var.d(qVar, i10);
            }
        } catch (DeadObjectException unused) {
            b1Var.f16004b.M(rVar);
        } catch (RemoteException e7) {
            e2.a.o("MediaSessionImpl", "Exception in " + rVar, e7);
        }
    }

    public final void d(a0 a0Var) {
        e9.i0 s10 = this.f15985g.f16004b.s();
        for (int i10 = 0; i10 < s10.size(); i10++) {
            c((r) s10.get(i10), a0Var);
        }
        try {
            a0Var.d(this.h.f16157i, 0);
        } catch (RemoteException e7) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
        }
    }

    public final r e() {
        e9.i0 s10 = this.f15985g.f16004b.s();
        for (int i10 = 0; i10 < s10.size(); i10++) {
            r rVar = (r) s10.get(i10);
            if (i(rVar)) {
                return rVar;
            }
        }
        return null;
    }

    public final void f(b2.x0 x0Var) {
        this.f15982c.a(false, false);
        d(new w(x0Var, 0));
        try {
            j0 j0Var = this.h.f16157i;
            b2.l lVar = this.f15996s.f16041q;
            j0Var.k();
        } catch (RemoteException e7) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
        }
    }

    public final void g(r rVar, boolean z10) {
        boolean z11;
        boolean z12;
        if (o()) {
            if (this.f15997t.m0(16) && this.f15997t.w() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!this.f15997t.m0(31) && !this.f15997t.m0(20)) {
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
                this.f15983e.getClass();
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                ?? obj = new Object();
                obj.n(unsupportedOperationException);
                obj.a(new i9.s(0, obj, new androidx.activity.n(this, s10, z10, x0Var)), new k2.a0(this, 1));
                return;
            }
            if (!z11) {
                e2.a.n("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
            }
            e2.d0.G(this.f15997t);
            if (z10) {
                p(s10);
            }
        }
    }

    public final boolean h(r rVar) {
        if (!this.f15985g.f16004b.A(rVar) && !this.h.f16155f.A(rVar)) {
            return false;
        }
        return true;
    }

    public final boolean i(r rVar) {
        if (!Objects.equals(rVar.f16217a.f16617a.f16543a, this.f15984f.getPackageName()) || rVar.f16218b == 0 || !new Bundle(rVar.f16220e).getBoolean("androidx.media3.session.MediaNotificationManager", false)) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        boolean z10;
        synchronized (this.f15980a) {
            z10 = this.v;
        }
        return z10;
    }

    public final i9.w l(r rVar, List list) {
        s(rVar);
        this.f15983e.getClass();
        return na.d.C3(list);
    }

    public final p m(r rVar) {
        e9.i0 v;
        boolean z10 = this.f16000x;
        e9.i0 i0Var = null;
        l0 l0Var = this.h;
        if (z10 && k(rVar)) {
            l0Var.getClass();
            i1 i1Var = p.f16208e;
            i1 i1Var2 = l0Var.f16169u;
            i1Var2.getClass();
            b2.x0 x0Var = l0Var.v;
            x0Var.getClass();
            e9.i0 i0Var2 = l0Var.f16167s;
            if (i0Var2 == null) {
                v = null;
            } else {
                v = e9.i0.v(i0Var2);
            }
            e9.i0 i0Var3 = l0Var.f16168t;
            if (i0Var3 != null) {
                i0Var = e9.i0.v(i0Var3);
            }
            return new p(i1Var2, x0Var, v, i0Var);
        }
        this.f15983e.getClass();
        b2.x0 x0Var2 = p.f16209f;
        i1 i1Var3 = p.f16208e;
        p pVar = new p(i1Var3, x0Var2, null, null);
        if (i(rVar)) {
            boolean z11 = true;
            this.f16000x = true;
            t tVar = this.f15988k;
            e9.i0 i0Var4 = tVar.f16229a.f16002z;
            if (i0Var4.isEmpty()) {
                l0Var.f16167s = tVar.f16229a.f16001y;
            } else {
                l0Var.f16168t = i0Var4;
                Bundle bundle = l0Var.f16166r;
                boolean z12 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
                boolean z13 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
                l0Var.M();
                if (bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) != z12 || bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) != z13) {
                    ((n4.r) l0Var.f16159k.f16612b).f16593a.setExtras(bundle);
                }
            }
            b0 b0Var = l0Var.f16156g;
            Bundle bundle2 = l0Var.f16166r;
            if (l0Var.v.a(17) == x0Var2.a(17)) {
                z11 = false;
            }
            l0Var.f16169u = i1Var3;
            l0Var.v = x0Var2;
            if (!l0Var.f16168t.isEmpty()) {
                boolean z14 = bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
                boolean z15 = bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
                l0Var.M();
                if (bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) != z14 || bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) != z15) {
                    ((n4.r) l0Var.f16159k.f16612b).f16593a.setExtras(bundle2);
                }
            }
            if (z11) {
                e2.d0.T(b0Var.f15989l, new g0(l0Var, b0Var.f15997t, 0));
                return pVar;
            }
            l0Var.N(b0Var.f15997t);
        }
        return pVar;
    }

    public final i9.u n(r rVar) {
        s(rVar);
        this.f15983e.getClass();
        return j8.b(new l1(-6));
    }

    public final boolean o() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            ?? obj = new Object();
            this.f15992o.post(new ki.i0(2, this, (Object) obj));
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
        this.f15983e.getClass();
    }

    public final i9.c0 q(r rVar, List list, final int i10, final long j3) {
        s(rVar);
        this.f15983e.getClass();
        return e2.d0.c0(na.d.C3(list), new i9.p() {
            @Override
            public final i9.w apply(Object obj) {
                return j8.b(new s(j3, i10, (List) obj));
            }
        });
    }

    public final void r() {
        e2.a.i("MediaSessionImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.1] [" + e2.d0.f8532a + "] [" + b2.l0.b() + "]");
        synchronized (this.f15980a) {
            try {
                if (this.v) {
                    return;
                }
                this.v = true;
                x xVar = this.d;
                gg.t tVar = xVar.f16248a;
                if (tVar != null) {
                    xVar.removeCallbacks(tVar);
                    xVar.f16248a = null;
                }
                this.f15989l.removeCallbacksAndMessages(null);
                try {
                    e2.d0.T(this.f15989l, new u(this, 0));
                } catch (Exception e7) {
                    e2.a.o("MediaSessionImpl", "Exception thrown while closing", e7);
                }
                l0 l0Var = this.h;
                ComponentName componentName = l0Var.f16161m;
                b0 b0Var = l0Var.f16156g;
                n4.x xVar2 = l0Var.f16159k;
                int i10 = Build.VERSION.SDK_INT;
                int i11 = 0;
                if (i10 < 31) {
                    if (componentName == null) {
                        ((n4.r) xVar2.f16612b).f16593a.setMediaButtonReceiver(null);
                    } else {
                        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", b0Var.f15981b);
                        intent.setComponent(componentName);
                        ((n4.r) xVar2.f16612b).f16593a.setMediaButtonReceiver(PendingIntent.getBroadcast(b0Var.f15984f, 0, intent, l0.f16154w));
                    }
                }
                androidx.mediarouter.app.g gVar = l0Var.f16160l;
                if (gVar != null) {
                    b0Var.f15984f.unregisterReceiver(gVar);
                }
                n4.r rVar = (n4.r) xVar2.f16612b;
                MediaSession mediaSession = rVar.f16593a;
                rVar.f16597f.kill();
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
                rVar.f16594b.f16592a.clear();
                mediaSession.release();
                b1 b1Var = this.f15985g;
                Set<r> set = b1Var.f16005c;
                oi.f fVar = b1Var.f16004b;
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
                b1Var.f16003a.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final r s(r rVar) {
        if (this.f16000x && k(rVar)) {
            r e7 = e();
            e7.getClass();
            return e7;
        }
        return rVar;
    }

    public final void t() {
        Handler handler = this.f15989l;
        u uVar = this.f15991n;
        handler.removeCallbacks(uVar);
        if (this.f15994q) {
            long j3 = this.f15999w;
            if (j3 > 0) {
                if (this.f15997t.i0() || this.f15997t.c()) {
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
        boolean z10;
        s1 s1Var;
        l0 l0Var = this.h;
        this.f15997t = f1Var2;
        if (f1Var != null) {
            z zVar = this.f15998u;
            e2.d.h(zVar);
            f1Var.D(zVar);
        }
        z zVar2 = new z(this, f1Var2);
        f1Var2.n0(zVar2);
        this.f15998u = zVar2;
        int i10 = 0;
        try {
            l0Var.f16157i.m(0, f1Var, f1Var2);
        } catch (RemoteException e7) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
        }
        if (f1Var == null) {
            ((n4.r) l0Var.f16159k.f16612b).f16593a.setActive(true);
        }
        b2.u0 W = f1Var2.W();
        k1 O0 = f1Var2.O0();
        b2.a1 N0 = f1Var2.N0();
        b2.a1 N02 = f1Var2.N0();
        b2.v0 h = f1Var2.h();
        int l4 = f1Var2.l();
        boolean A0 = f1Var2.A0();
        x1 E = f1Var2.E();
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
        float f10 = f7;
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
        }
        int i11 = i10;
        if (f1Var2.m0(23) && f1Var2.x0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = z10;
        boolean u10 = f1Var2.u();
        int u02 = f1Var2.u0();
        int d = f1Var2.d();
        boolean i02 = f1Var2.i0();
        boolean c10 = f1Var2.c();
        b2.n0 R0 = f1Var2.R0();
        long L0 = f1Var2.L0();
        long Z = f1Var2.Z();
        long z12 = f1Var2.z();
        if (f1Var2.m0(30)) {
            s1Var = f1Var2.g0();
        } else {
            s1Var = s1.f3653b;
        }
        this.f15996s = new d1(W, 0, O0, N0, N02, 0, h, l4, A0, E, Q0, 0, n0Var2, f10, eVar2, dVar2, K, i11, z11, u10, 1, u02, d, i02, c10, R0, L0, Z, z12, s1Var, f1Var2.B0());
        f(f1Var2.t());
    }

    public final void v() {
        if (Looper.myLooper() == this.f15989l.getLooper()) {
            return;
        }
        throw new IllegalStateException("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
    }
}
