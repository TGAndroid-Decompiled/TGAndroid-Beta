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
    public static final k1 B = new k1(1);
    public final Bundle A;
    public final Object f14707a = new Object();
    public final Uri f14708b;
    public final x f14709c;
    public final w d;
    public final na.d e;
    public final Context f14710f;
    public final a1 f14711g;
    public final k0 h;
    public final String f14712i;
    public final l1 f14713j;
    public final t f14714k;
    public final Handler f14715l;
    public final n4.y f14716m;
    public final u f14717n;
    public final Handler f14718o;
    public final boolean f14719p;
    public final boolean f14720q;
    public final e9.i0 f14721r;
    public c1 f14722s;
    public e1 f14723t;
    public y f14724u;
    public boolean v;
    public final long f14725w;
    public boolean f14726x;
    public final e9.i0 f14727y;
    public final e9.i0 f14728z;

    public a0(t tVar, Context context, b2.b1 b1Var, e9.i0 i0Var, e9.i0 i0Var2, e9.i0 i0Var3, na.d dVar, Bundle bundle, Bundle bundle2, n4.y yVar) {
        e2.a.i("MediaSessionImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.1] [" + e2.d0.f7882a + "]");
        this.f14714k = tVar;
        this.f14710f = context;
        this.f14712i = "pip-media-session";
        this.f14727y = i0Var;
        this.f14728z = i0Var2;
        this.f14721r = i0Var3;
        this.e = dVar;
        this.A = bundle2;
        this.f14716m = yVar;
        this.f14719p = true;
        this.f14720q = true;
        a1 a1Var = new a1(this);
        this.f14711g = a1Var;
        this.f14718o = new Handler(Looper.getMainLooper());
        Looper y02 = b1Var.y0();
        Handler handler = new Handler(y02);
        this.f14715l = handler;
        this.f14722s = c1.F;
        this.f14709c = new x(this, y02);
        this.d = new w(this, y02);
        Uri build = new Uri.Builder().scheme(a0.class.getName()).appendPath("pip-media-session").appendPath(String.valueOf(SystemClock.elapsedRealtime())).build();
        this.f14708b = build;
        k0 k0Var = new k0(this, build, handler, bundle, i0Var, i0Var2, p.e, p.f14924f, bundle2);
        this.h = k0Var;
        this.f14713j = new l1(Process.myUid(), context.getPackageName(), a1Var, bundle, ((n4.r) k0Var.f14871k.f15238b).f15221c.f15235b);
        e1 e1Var = new e1(b1Var);
        this.f14723t = e1Var;
        e2.d0.U(handler, new ki.h0(4, this, e1Var));
        this.f14725w = 3000L;
        this.f14717n = new u(this, 2);
        e2.d0.U(handler, new u(this, 3));
    }

    public static void a(a0 a0Var) {
        synchronized (a0Var.f14707a) {
            try {
                if (a0Var.v) {
                    return;
                }
                final j1 O0 = a0Var.f14723t.O0();
                if (!a0Var.f14709c.hasMessages(1)) {
                    j1 j1Var = a0Var.f14722s.f14757c;
                    b2.a1 a1Var = O0.f14858a;
                    int i10 = a1Var.f2929b;
                    b2.a1 a1Var2 = j1Var.f14858a;
                    if (i10 == a1Var2.f2929b && a1Var.e == a1Var2.e && a1Var.h == a1Var2.h && a1Var.f2933i == a1Var2.f2933i) {
                        oi.f fVar = a0Var.f14711g.f14730b;
                        e9.i0 s10 = fVar.s();
                        for (int i11 = 0; i11 < s10.size(); i11++) {
                            final r rVar = (r) s10.get(i11);
                            fVar.v(rVar);
                            final boolean B2 = fVar.B(rVar, 16);
                            final boolean B3 = fVar.B(rVar, 17);
                            a0Var.c(rVar, new z() {
                                @Override
                                public final void c(q qVar, int i12) {
                                    qVar.e(i12, j1.this, B2, B3, rVar.f14935c);
                                }
                            });
                        }
                        try {
                            a0Var.h.f14869i.e(0, O0, true, true, 0);
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
        if (rVar != null && Objects.equals(rVar.f14933a.f15173a.f15174a, "com.android.systemui")) {
            return true;
        }
        return false;
    }

    public final boolean b(KeyEvent keyEvent, boolean z10, boolean z11) {
        b bVar;
        r e = this.f14714k.f14947a.e();
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
                                if (this.f14723t.u()) {
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
        e2.d0.U(this.f14715l, new s4(this, z11, e, bVar, 7));
        return true;
    }

    public final void c(r rVar, z zVar) {
        int i10;
        a1 a1Var = this.f14711g;
        try {
            com.google.android.gms.common.api.internal.v x10 = a1Var.f14730b.x(rVar);
            if (x10 != null) {
                i10 = x10.e();
            } else if (h(rVar)) {
                i10 = 0;
            } else {
                return;
            }
            q qVar = rVar.d;
            if (qVar != null) {
                zVar.c(qVar, i10);
            }
        } catch (DeadObjectException unused) {
            a1Var.f14730b.M(rVar);
        } catch (RemoteException e) {
            e2.a.o("MediaSessionImpl", "Exception in " + rVar, e);
        }
    }

    public final void d(z zVar) {
        e9.i0 s10 = this.f14711g.f14730b.s();
        for (int i10 = 0; i10 < s10.size(); i10++) {
            c((r) s10.get(i10), zVar);
        }
        try {
            zVar.c(this.h.f14869i, 0);
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final r e() {
        e9.i0 s10 = this.f14711g.f14730b.s();
        for (int i10 = 0; i10 < s10.size(); i10++) {
            r rVar = (r) s10.get(i10);
            if (i(rVar)) {
                return rVar;
            }
        }
        return null;
    }

    public final void f(b2.x0 x0Var) {
        this.f14709c.a(false, false);
        d(new le.b(x0Var, 1));
        try {
            i0 i0Var = this.h.f14869i;
            b2.l lVar = this.f14722s.f14768q;
            i0Var.k();
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final void g(r rVar, boolean z10) {
        boolean z11;
        boolean z12;
        if (o()) {
            if (this.f14723t.m0(16) && this.f14723t.w() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!this.f14723t.m0(31) && !this.f14723t.m0(20)) {
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
                obj.a(new i9.s(0, (Object) obj, nVar), new k2.b0(this, 1));
                return;
            }
            if (!z11) {
                e2.a.n("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
            }
            e2.d0.H(this.f14723t);
            if (z10) {
                p(s10);
            }
        }
    }

    public final boolean h(r rVar) {
        if (!this.f14711g.f14730b.A(rVar) && !this.h.f14867f.A(rVar)) {
            return false;
        }
        return true;
    }

    public final boolean i(r rVar) {
        if (!Objects.equals(rVar.f14933a.f15173a.f15174a, this.f14710f.getPackageName()) || rVar.f14934b == 0 || !new Bundle(rVar.e).getBoolean("androidx.media3.session.MediaNotificationManager", false)) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        boolean z10;
        synchronized (this.f14707a) {
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
        boolean z10 = this.f14726x;
        e9.i0 i0Var = null;
        k0 k0Var = this.h;
        if (z10 && k(rVar)) {
            k0Var.getClass();
            h1 h1Var = p.e;
            h1 h1Var2 = k0Var.f14881u;
            h1Var2.getClass();
            b2.x0 x0Var = k0Var.v;
            x0Var.getClass();
            e9.i0 i0Var2 = k0Var.f14879s;
            if (i0Var2 == null) {
                v = null;
            } else {
                v = e9.i0.v(i0Var2);
            }
            e9.i0 i0Var3 = k0Var.f14880t;
            if (i0Var3 != null) {
                i0Var = e9.i0.v(i0Var3);
            }
            return new p(h1Var2, x0Var, v, i0Var);
        }
        this.e.getClass();
        b2.x0 x0Var2 = p.f14924f;
        h1 h1Var3 = p.e;
        p pVar = new p(h1Var3, x0Var2, null, null);
        if (i(rVar)) {
            boolean z11 = true;
            this.f14726x = true;
            t tVar = this.f14714k;
            e9.i0 i0Var4 = tVar.f14947a.f14728z;
            if (i0Var4.isEmpty()) {
                k0Var.f14879s = tVar.f14947a.f14727y;
            } else {
                k0Var.f14880t = i0Var4;
                Bundle bundle = k0Var.f14878r;
                boolean z12 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
                boolean z13 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
                k0Var.M();
                if (bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) != z12 || bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) != z13) {
                    ((n4.r) k0Var.f14871k.f15238b).f15219a.setExtras(bundle);
                }
            }
            a0 a0Var = k0Var.f14868g;
            Bundle bundle2 = k0Var.f14878r;
            if (k0Var.v.a(17) == x0Var2.a(17)) {
                z11 = false;
            }
            k0Var.f14881u = h1Var3;
            k0Var.v = x0Var2;
            if (!k0Var.f14880t.isEmpty()) {
                boolean z14 = bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
                boolean z15 = bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
                k0Var.M();
                if (bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) != z14 || bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) != z15) {
                    ((n4.r) k0Var.f14871k.f15238b).f15219a.setExtras(bundle2);
                }
            }
            if (z11) {
                e2.d0.U(a0Var.f14715l, new f0(k0Var, a0Var.f14723t, 0));
                return pVar;
            }
            k0Var.N(a0Var.f14723t);
        }
        return pVar;
    }

    public final i9.u n(r rVar) {
        s(rVar);
        this.e.getClass();
        return m8.b(new k1(-6));
    }

    public final boolean o() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            ?? obj = new Object();
            this.f14718o.post(new ki.h0(2, this, (Object) obj));
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
        e2.a.i("MediaSessionImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.1] [" + e2.d0.f7882a + "] [" + b2.l0.b() + "]");
        synchronized (this.f14707a) {
            try {
                if (this.v) {
                    return;
                }
                this.v = true;
                w wVar = this.d;
                gg.t tVar = wVar.f14958a;
                if (tVar != null) {
                    wVar.removeCallbacks(tVar);
                    wVar.f14958a = null;
                }
                this.f14715l.removeCallbacksAndMessages(null);
                try {
                    e2.d0.U(this.f14715l, new u(this, 0));
                } catch (Exception e) {
                    e2.a.o("MediaSessionImpl", "Exception thrown while closing", e);
                }
                k0 k0Var = this.h;
                ComponentName componentName = k0Var.f14873m;
                a0 a0Var = k0Var.f14868g;
                n4.y yVar = k0Var.f14871k;
                int i10 = Build.VERSION.SDK_INT;
                int i11 = 0;
                if (i10 < 31) {
                    if (componentName == null) {
                        ((n4.r) yVar.f15238b).f15219a.setMediaButtonReceiver(null);
                    } else {
                        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", a0Var.f14708b);
                        intent.setComponent(componentName);
                        ((n4.r) yVar.f15238b).f15219a.setMediaButtonReceiver(PendingIntent.getBroadcast(a0Var.f14710f, 0, intent, k0.f14866w));
                    }
                }
                androidx.mediarouter.app.g gVar = k0Var.f14872l;
                if (gVar != null) {
                    a0Var.f14710f.unregisterReceiver(gVar);
                }
                n4.r rVar = (n4.r) yVar.f15238b;
                MediaSession mediaSession = rVar.f15219a;
                rVar.f15222f.kill();
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
                rVar.f15220b.f15218a.clear();
                mediaSession.release();
                a1 a1Var = this.f14711g;
                Set<r> set = a1Var.f14731c;
                oi.f fVar = a1Var.f14730b;
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
                a1Var.f14729a.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final r s(r rVar) {
        if (this.f14726x && k(rVar)) {
            r e = e();
            e.getClass();
            return e;
        }
        return rVar;
    }

    public final void t() {
        Handler handler = this.f14715l;
        u uVar = this.f14717n;
        handler.removeCallbacks(uVar);
        if (this.f14720q) {
            long j3 = this.f14725w;
            if (j3 > 0) {
                if (this.f14723t.i0() || this.f14723t.c()) {
                    handler.postDelayed(uVar, j3);
                }
            }
        }
    }

    public final void u(e1 e1Var, e1 e1Var2) {
        b2.n0 n0Var;
        float f7;
        b2.e eVar;
        d2.d dVar;
        int i10;
        boolean z10;
        s1 s1Var;
        k0 k0Var = this.h;
        this.f14723t = e1Var2;
        if (e1Var != null) {
            y yVar = this.f14724u;
            e2.d.h(yVar);
            e1Var.D(yVar);
        }
        y yVar2 = new y(this, e1Var2);
        e1Var2.n0(yVar2);
        this.f14724u = yVar2;
        try {
            k0Var.f14869i.m(0, e1Var, e1Var2);
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
        }
        if (e1Var == null) {
            ((n4.r) k0Var.f14871k.f15238b).f15219a.setActive(true);
        }
        b2.u0 W = e1Var2.W();
        j1 O0 = e1Var2.O0();
        b2.a1 N0 = e1Var2.N0();
        b2.a1 N02 = e1Var2.N0();
        b2.v0 h = e1Var2.h();
        int l4 = e1Var2.l();
        boolean A0 = e1Var2.A0();
        x1 E = e1Var2.E();
        b2.k1 Q0 = e1Var2.Q0();
        if (e1Var2.m0(18)) {
            n0Var = e1Var2.h0();
        } else {
            n0Var = b2.n0.K;
        }
        b2.n0 n0Var2 = n0Var;
        if (e1Var2.m0(22)) {
            f7 = e1Var2.G();
        } else {
            f7 = 1.0f;
        }
        if (e1Var2.m0(21)) {
            eVar = e1Var2.I();
        } else {
            eVar = b2.e.h;
        }
        b2.e eVar2 = eVar;
        if (e1Var2.m0(28)) {
            dVar = e1Var2.j0();
        } else {
            dVar = d2.d.d;
        }
        d2.d dVar2 = dVar;
        b2.l K = e1Var2.K();
        if (e1Var2.m0(23)) {
            i10 = e1Var2.m();
        } else {
            i10 = 0;
        }
        if (e1Var2.m0(23) && e1Var2.x0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean u10 = e1Var2.u();
        int u02 = e1Var2.u0();
        int d = e1Var2.d();
        boolean i02 = e1Var2.i0();
        boolean c10 = e1Var2.c();
        b2.n0 R0 = e1Var2.R0();
        long L0 = e1Var2.L0();
        long Z = e1Var2.Z();
        long z11 = e1Var2.z();
        if (e1Var2.m0(30)) {
            s1Var = e1Var2.g0();
        } else {
            s1Var = s1.f3318b;
        }
        this.f14722s = new c1(W, 0, O0, N0, N02, 0, h, l4, A0, E, Q0, 0, n0Var2, f7, eVar2, dVar2, K, i10, z10, u10, 1, u02, d, i02, c10, R0, L0, Z, z11, s1Var, e1Var2.B0());
        f(e1Var2.t());
    }

    public final void v() {
        if (Looper.myLooper() == this.f14715l.getLooper()) {
            return;
        }
        throw new IllegalStateException("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
    }
}
