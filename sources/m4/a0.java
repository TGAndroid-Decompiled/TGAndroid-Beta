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
import b2.x1;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import v7.m8;
public class a0 {
    public static final p1 B = new p1(1);
    public final Bundle A;
    public final Object f14686a = new Object();
    public final Uri f14687b;
    public final x f14688c;
    public final w d;
    public final na.d e;
    public final Context f14689f;
    public final f1 f14690g;
    public final k0 h;
    public final String f14691i;
    public final q1 f14692j;
    public final t f14693k;
    public final Handler f14694l;
    public final of.b f14695m;
    public final u f14696n;
    public final Handler f14697o;
    public final boolean f14698p;
    public final boolean f14699q;
    public final e9.i0 f14700r;
    public h1 f14701s;
    public j1 f14702t;
    public y f14703u;
    public boolean v;
    public final long f14704w;
    public boolean f14705x;
    public final e9.i0 f14706y;
    public final e9.i0 f14707z;

    public a0(t tVar, Context context, b2.b1 b1Var, e9.i0 i0Var, e9.i0 i0Var2, e9.i0 i0Var3, na.d dVar, Bundle bundle, Bundle bundle2, of.b bVar) {
        e2.a.i("MediaSessionImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.1] [" + e2.d0.f7887a + "]");
        this.f14693k = tVar;
        this.f14689f = context;
        this.f14691i = "pip-media-session";
        this.f14706y = i0Var;
        this.f14707z = i0Var2;
        this.f14700r = i0Var3;
        this.e = dVar;
        this.A = bundle2;
        this.f14695m = bVar;
        this.f14698p = true;
        this.f14699q = true;
        f1 f1Var = new f1(this);
        this.f14690g = f1Var;
        this.f14697o = new Handler(Looper.getMainLooper());
        Looper y02 = b1Var.y0();
        Handler handler = new Handler(y02);
        this.f14694l = handler;
        this.f14701s = h1.F;
        this.f14688c = new x(this, y02);
        this.d = new w(this, y02);
        Uri build = new Uri.Builder().scheme(a0.class.getName()).appendPath("pip-media-session").appendPath(String.valueOf(SystemClock.elapsedRealtime())).build();
        this.f14687b = build;
        k0 k0Var = new k0(this, build, handler, bundle, i0Var, i0Var2, p.e, p.f14886f, bundle2);
        this.h = k0Var;
        this.f14692j = new q1(Process.myUid(), context.getPackageName(), f1Var, bundle, ((n4.r) k0Var.f14824k.f15230a).f15214c.f15228b);
        j1 j1Var = new j1(b1Var);
        this.f14702t = j1Var;
        e2.d0.U(handler, new ki.l(5, this, j1Var));
        this.f14704w = 3000L;
        this.f14696n = new u(this, 2);
        e2.d0.U(handler, new u(this, 3));
    }

    public static void a(a0 a0Var) {
        synchronized (a0Var.f14686a) {
            try {
                if (a0Var.v) {
                    return;
                }
                final o1 O0 = a0Var.f14702t.O0();
                if (!a0Var.f14688c.hasMessages(1)) {
                    o1 o1Var = a0Var.f14701s.f14789c;
                    b2.a1 a1Var = O0.f14879a;
                    int i10 = a1Var.f2929b;
                    b2.a1 a1Var2 = o1Var.f14879a;
                    if (i10 == a1Var2.f2929b && a1Var.e == a1Var2.e && a1Var.h == a1Var2.h && a1Var.f2933i == a1Var2.f2933i) {
                        oi.f fVar = a0Var.f14690g.f14747b;
                        e9.i0 s10 = fVar.s();
                        for (int i11 = 0; i11 < s10.size(); i11++) {
                            final r rVar = (r) s10.get(i11);
                            fVar.v(rVar);
                            final boolean B2 = fVar.B(rVar, 16);
                            final boolean B3 = fVar.B(rVar, 17);
                            a0Var.c(rVar, new z() {
                                @Override
                                public final void d(q qVar, int i12) {
                                    qVar.e(i12, o1.this, B2, B3, rVar.f14903c);
                                }
                            });
                        }
                        try {
                            a0Var.h.f14822i.e(0, O0, true, true, 0);
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
        if (rVar != null && Objects.equals(rVar.f14901a.f15166a.f15167a, "com.android.systemui")) {
            return true;
        }
        return false;
    }

    public final boolean b(KeyEvent keyEvent, boolean z10, boolean z11) {
        b bVar;
        r e = this.f14693k.f14930a.e();
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
                                if (this.f14702t.u()) {
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
        e2.d0.U(this.f14694l, new s4(this, z11, e, bVar, 7));
        return true;
    }

    public final void c(r rVar, z zVar) {
        int i10;
        f1 f1Var = this.f14690g;
        try {
            com.google.android.gms.common.api.internal.v x10 = f1Var.f14747b.x(rVar);
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
            f1Var.f14747b.M(rVar);
        } catch (RemoteException e) {
            e2.a.o("MediaSessionImpl", "Exception in " + rVar, e);
        }
    }

    public final void d(z zVar) {
        e9.i0 s10 = this.f14690g.f14747b.s();
        for (int i10 = 0; i10 < s10.size(); i10++) {
            c((r) s10.get(i10), zVar);
        }
        try {
            zVar.d(this.h.f14822i, 0);
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final r e() {
        e9.i0 s10 = this.f14690g.f14747b.s();
        for (int i10 = 0; i10 < s10.size(); i10++) {
            r rVar = (r) s10.get(i10);
            if (i(rVar)) {
                return rVar;
            }
        }
        return null;
    }

    public final void f(b2.x0 x0Var) {
        this.f14688c.a(false, false);
        d(new k2.v(x0Var, 3));
        try {
            i0 i0Var = this.h.f14822i;
            b2.l lVar = this.f14701s.f14800q;
            i0Var.k();
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final void g(r rVar, boolean z10) {
        boolean z11;
        boolean z12;
        if (o()) {
            if (this.f14702t.m0(16) && this.f14702t.w() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!this.f14702t.m0(31) && !this.f14702t.m0(20)) {
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
            e2.d0.H(this.f14702t);
            if (z10) {
                p(s10);
            }
        }
    }

    public final boolean h(r rVar) {
        if (!this.f14690g.f14747b.A(rVar) && !this.h.f14820f.A(rVar)) {
            return false;
        }
        return true;
    }

    public final boolean i(r rVar) {
        if (!Objects.equals(rVar.f14901a.f15166a.f15167a, this.f14689f.getPackageName()) || rVar.f14902b == 0 || !new Bundle(rVar.e).getBoolean("androidx.media3.session.MediaNotificationManager", false)) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        boolean z10;
        synchronized (this.f14686a) {
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
        boolean z10 = this.f14705x;
        e9.i0 i0Var = null;
        k0 k0Var = this.h;
        if (z10 && k(rVar)) {
            k0Var.getClass();
            m1 m1Var = p.e;
            m1 m1Var2 = k0Var.f14834u;
            m1Var2.getClass();
            b2.x0 x0Var = k0Var.v;
            x0Var.getClass();
            e9.i0 i0Var2 = k0Var.f14832s;
            if (i0Var2 == null) {
                v = null;
            } else {
                v = e9.i0.v(i0Var2);
            }
            e9.i0 i0Var3 = k0Var.f14833t;
            if (i0Var3 != null) {
                i0Var = e9.i0.v(i0Var3);
            }
            return new p(m1Var2, x0Var, v, i0Var);
        }
        this.e.getClass();
        b2.x0 x0Var2 = p.f14886f;
        m1 m1Var3 = p.e;
        p pVar = new p(m1Var3, x0Var2, null, null);
        if (i(rVar)) {
            boolean z11 = true;
            this.f14705x = true;
            t tVar = this.f14693k;
            e9.i0 i0Var4 = tVar.f14930a.f14707z;
            if (i0Var4.isEmpty()) {
                k0Var.f14832s = tVar.f14930a.f14706y;
            } else {
                k0Var.f14833t = i0Var4;
                Bundle bundle = k0Var.f14831r;
                boolean z12 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
                boolean z13 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
                k0Var.M();
                if (bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) != z12 || bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) != z13) {
                    ((n4.r) k0Var.f14824k.f15230a).f15212a.setExtras(bundle);
                }
            }
            a0 a0Var = k0Var.f14821g;
            Bundle bundle2 = k0Var.f14831r;
            if (k0Var.v.a(17) == x0Var2.a(17)) {
                z11 = false;
            }
            k0Var.f14834u = m1Var3;
            k0Var.v = x0Var2;
            if (!k0Var.f14833t.isEmpty()) {
                boolean z14 = bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
                boolean z15 = bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
                k0Var.M();
                if (bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) != z14 || bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) != z15) {
                    ((n4.r) k0Var.f14824k.f15230a).f15212a.setExtras(bundle2);
                }
            }
            if (z11) {
                e2.d0.U(a0Var.f14694l, new f0(k0Var, a0Var.f14702t, 0));
                return pVar;
            }
            k0Var.N(a0Var.f14702t);
        }
        return pVar;
    }

    public final i9.u n(r rVar) {
        s(rVar);
        this.e.getClass();
        return m8.b(new p1(-6));
    }

    public final boolean o() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            ?? obj = new Object();
            this.f14697o.post(new ki.l(3, this, (Object) obj));
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
                return m8.b(new s(j3, i10, (List) obj));
            }
        });
    }

    public final void r() {
        e2.a.i("MediaSessionImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.1] [" + e2.d0.f7887a + "] [" + b2.l0.b() + "]");
        synchronized (this.f14686a) {
            try {
                if (this.v) {
                    return;
                }
                this.v = true;
                w wVar = this.d;
                gg.t tVar = wVar.f14942a;
                if (tVar != null) {
                    wVar.removeCallbacks(tVar);
                    wVar.f14942a = null;
                }
                this.f14694l.removeCallbacksAndMessages(null);
                try {
                    e2.d0.U(this.f14694l, new u(this, 0));
                } catch (Exception e) {
                    e2.a.o("MediaSessionImpl", "Exception thrown while closing", e);
                }
                k0 k0Var = this.h;
                ComponentName componentName = k0Var.f14826m;
                a0 a0Var = k0Var.f14821g;
                n4.y yVar = k0Var.f14824k;
                int i10 = Build.VERSION.SDK_INT;
                int i11 = 0;
                if (i10 < 31) {
                    if (componentName == null) {
                        ((n4.r) yVar.f15230a).f15212a.setMediaButtonReceiver(null);
                    } else {
                        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", a0Var.f14687b);
                        intent.setComponent(componentName);
                        ((n4.r) yVar.f15230a).f15212a.setMediaButtonReceiver(PendingIntent.getBroadcast(a0Var.f14689f, 0, intent, k0.f14819w));
                    }
                }
                androidx.mediarouter.app.g gVar = k0Var.f14825l;
                if (gVar != null) {
                    a0Var.f14689f.unregisterReceiver(gVar);
                }
                n4.r rVar = (n4.r) yVar.f15230a;
                MediaSession mediaSession = rVar.f15212a;
                rVar.f15215f.kill();
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
                rVar.f15213b.f15211a.clear();
                mediaSession.release();
                f1 f1Var = this.f14690g;
                Set<r> set = f1Var.f14748c;
                oi.f fVar = f1Var.f14747b;
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
                f1Var.f14746a.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final r s(r rVar) {
        if (this.f14705x && k(rVar)) {
            r e = e();
            e.getClass();
            return e;
        }
        return rVar;
    }

    public final void t() {
        Handler handler = this.f14694l;
        u uVar = this.f14696n;
        handler.removeCallbacks(uVar);
        if (this.f14699q) {
            long j3 = this.f14704w;
            if (j3 > 0) {
                if (this.f14702t.i0() || this.f14702t.c()) {
                    handler.postDelayed(uVar, j3);
                }
            }
        }
    }

    public final void u(j1 j1Var, j1 j1Var2) {
        b2.n0 n0Var;
        float f7;
        b2.e eVar;
        d2.d dVar;
        int i10;
        boolean z10;
        s1 s1Var;
        k0 k0Var = this.h;
        this.f14702t = j1Var2;
        if (j1Var != null) {
            y yVar = this.f14703u;
            e2.d.h(yVar);
            j1Var.D(yVar);
        }
        y yVar2 = new y(this, j1Var2);
        j1Var2.n0(yVar2);
        this.f14703u = yVar2;
        try {
            k0Var.f14822i.m(0, j1Var, j1Var2);
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
        }
        if (j1Var == null) {
            ((n4.r) k0Var.f14824k.f15230a).f15212a.setActive(true);
        }
        b2.u0 W = j1Var2.W();
        o1 O0 = j1Var2.O0();
        b2.a1 N0 = j1Var2.N0();
        b2.a1 N02 = j1Var2.N0();
        b2.v0 h = j1Var2.h();
        int l4 = j1Var2.l();
        boolean A0 = j1Var2.A0();
        x1 E = j1Var2.E();
        b2.k1 Q0 = j1Var2.Q0();
        if (j1Var2.m0(18)) {
            n0Var = j1Var2.h0();
        } else {
            n0Var = b2.n0.K;
        }
        b2.n0 n0Var2 = n0Var;
        if (j1Var2.m0(22)) {
            f7 = j1Var2.G();
        } else {
            f7 = 1.0f;
        }
        if (j1Var2.m0(21)) {
            eVar = j1Var2.I();
        } else {
            eVar = b2.e.h;
        }
        b2.e eVar2 = eVar;
        if (j1Var2.m0(28)) {
            dVar = j1Var2.j0();
        } else {
            dVar = d2.d.d;
        }
        d2.d dVar2 = dVar;
        b2.l K = j1Var2.K();
        if (j1Var2.m0(23)) {
            i10 = j1Var2.m();
        } else {
            i10 = 0;
        }
        if (j1Var2.m0(23) && j1Var2.x0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean u10 = j1Var2.u();
        int u02 = j1Var2.u0();
        int d = j1Var2.d();
        boolean i02 = j1Var2.i0();
        boolean c10 = j1Var2.c();
        b2.n0 R0 = j1Var2.R0();
        long L0 = j1Var2.L0();
        long Z = j1Var2.Z();
        long z11 = j1Var2.z();
        if (j1Var2.m0(30)) {
            s1Var = j1Var2.g0();
        } else {
            s1Var = s1.f3318b;
        }
        this.f14701s = new h1(W, 0, O0, N0, N02, 0, h, l4, A0, E, Q0, 0, n0Var2, f7, eVar2, dVar2, K, i10, z10, u10, 1, u02, d, i02, c10, R0, L0, Z, z11, s1Var, j1Var2.B0());
        f(j1Var2.t());
    }

    public final void v() {
        if (Looper.myLooper() == this.f14694l.getLooper()) {
            return;
        }
        throw new IllegalStateException("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
    }
}
