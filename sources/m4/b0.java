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
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import b2.x1;
import bi.g2;
import hi.y1;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import v7.o8;
public class b0 {
    public static final r1 B = new r1(1);
    public final Bundle A;
    public final Object f13291a = new Object();
    public final Uri f13292b;
    public final y f13293c;
    public final x d;
    public final na.d e;
    public final Context f13294f;
    public final h1 f13295g;
    public final l0 h;
    public final String f13296i;
    public final s1 f13297j;
    public final t f13298k;
    public final Handler f13299l;
    public final of.b f13300m;
    public final u f13301n;
    public final Handler f13302o;
    public final boolean f13303p;
    public final boolean f13304q;
    public final e9.i0 f13305r;
    public j1 f13306s;
    public l1 f13307t;
    public z f13308u;
    public boolean v;
    public final long f13309w;
    public boolean f13310x;
    public final e9.i0 f13311y;
    public final e9.i0 f13312z;

    public b0(t tVar, Context context, b2.b1 b1Var, e9.i0 i0Var, e9.i0 i0Var2, e9.i0 i0Var3, na.d dVar, Bundle bundle, Bundle bundle2, of.b bVar) {
        e2.a.i("MediaSessionImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.1] [" + e2.d0.f7188a + "]");
        this.f13298k = tVar;
        this.f13294f = context;
        this.f13296i = "pip-media-session";
        this.f13311y = i0Var;
        this.f13312z = i0Var2;
        this.f13305r = i0Var3;
        this.e = dVar;
        this.A = bundle2;
        this.f13300m = bVar;
        this.f13303p = true;
        this.f13304q = true;
        h1 h1Var = new h1(this);
        this.f13295g = h1Var;
        this.f13302o = new Handler(Looper.getMainLooper());
        Looper y02 = b1Var.y0();
        Handler handler = new Handler(y02);
        this.f13299l = handler;
        this.f13306s = j1.F;
        this.f13293c = new y(this, y02);
        this.d = new x(this, y02);
        Uri build = new Uri.Builder().scheme(b0.class.getName()).appendPath("pip-media-session").appendPath(String.valueOf(SystemClock.elapsedRealtime())).build();
        this.f13292b = build;
        l0 l0Var = new l0(this, build, handler, bundle, i0Var, i0Var2, p.e, p.f13467f, bundle2);
        this.h = l0Var;
        this.f13297j = new s1(Process.myUid(), context.getPackageName(), h1Var, bundle, ((n4.r) l0Var.f13433k.f13824b).f13807c.f13821b);
        l1 l1Var = new l1(b1Var);
        this.f13307t = l1Var;
        e2.d0.U(handler, new w(2, this, l1Var));
        this.f13309w = 3000L;
        this.f13301n = new u(this, 2);
        e2.d0.U(handler, new u(this, 3));
    }

    public static void a(b0 b0Var) {
        synchronized (b0Var.f13291a) {
            try {
                if (b0Var.v) {
                    return;
                }
                final q1 O0 = b0Var.f13307t.O0();
                if (!b0Var.f13293c.hasMessages(1)) {
                    q1 q1Var = b0Var.f13306s.f13397c;
                    b2.a1 a1Var = O0.f13491a;
                    int i10 = a1Var.f1623b;
                    b2.a1 a1Var2 = q1Var.f13491a;
                    if (i10 == a1Var2.f1623b && a1Var.e == a1Var2.e && a1Var.h == a1Var2.h && a1Var.f1627i == a1Var2.f1627i) {
                        ki.f fVar = b0Var.f13295g.f13376b;
                        e9.i0 r10 = fVar.r();
                        for (int i11 = 0; i11 < r10.size(); i11++) {
                            final r rVar = (r) r10.get(i11);
                            fVar.u(rVar);
                            final boolean A = fVar.A(rVar, 16);
                            final boolean A2 = fVar.A(rVar, 17);
                            b0Var.c(rVar, new a0() {
                                @Override
                                public final void d(q qVar, int i12) {
                                    qVar.e(i12, q1.this, A, A2, rVar.f13500c);
                                }
                            });
                        }
                        try {
                            b0Var.h.f13431i.e(0, O0, true, true, 0);
                        } catch (RemoteException e) {
                            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
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
        if (rVar != null && Objects.equals(rVar.f13498a.f13759a.f13760a, "com.android.systemui")) {
            return true;
        }
        return false;
    }

    public final boolean b(KeyEvent keyEvent, boolean z10, boolean z11) {
        b bVar;
        r e = this.f13298k.f13518a.e();
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
                                if (this.f13307t.u()) {
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
        e2.d0.U(this.f13299l, new g2(this, z11, e, bVar, 5));
        return true;
    }

    public final void c(r rVar, a0 a0Var) {
        int i10;
        h1 h1Var = this.f13295g;
        try {
            com.google.android.gms.common.api.internal.v w10 = h1Var.f13376b.w(rVar);
            if (w10 != null) {
                i10 = w10.e();
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
            h1Var.f13376b.K(rVar);
        } catch (RemoteException e) {
            e2.a.o("MediaSessionImpl", "Exception in " + rVar, e);
        }
    }

    public final void d(a0 a0Var) {
        e9.i0 r10 = this.f13295g.f13376b.r();
        for (int i10 = 0; i10 < r10.size(); i10++) {
            c((r) r10.get(i10), a0Var);
        }
        try {
            a0Var.d(this.h.f13431i, 0);
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final r e() {
        e9.i0 r10 = this.f13295g.f13376b.r();
        for (int i10 = 0; i10 < r10.size(); i10++) {
            r rVar = (r) r10.get(i10);
            if (i(rVar)) {
                return rVar;
            }
        }
        return null;
    }

    public final void f(b2.x0 x0Var) {
        this.f13293c.a(false, false);
        d(new y1(x0Var, 24));
        try {
            j0 j0Var = this.h.f13431i;
            b2.l lVar = this.f13306s.f13408q;
            j0Var.k();
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final void g(r rVar, boolean z10) {
        boolean z11;
        boolean z12;
        if (o()) {
            if (this.f13307t.m0(16) && this.f13307t.w() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!this.f13307t.m0(31) && !this.f13307t.m0(20)) {
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
                androidx.activity.o oVar = new androidx.activity.o(this, s10, z10, x0Var);
                obj.a(new i9.s(0, (Object) obj, oVar), new k2.b0(this, 1));
                return;
            }
            if (!z11) {
                e2.a.n("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
            }
            e2.d0.H(this.f13307t);
            if (z10) {
                p(s10);
            }
        }
    }

    public final boolean h(r rVar) {
        if (!this.f13295g.f13376b.z(rVar) && !this.h.f13429f.z(rVar)) {
            return false;
        }
        return true;
    }

    public final boolean i(r rVar) {
        if (!Objects.equals(rVar.f13498a.f13759a.f13760a, this.f13294f.getPackageName()) || rVar.f13499b == 0 || !new Bundle(rVar.e).getBoolean("androidx.media3.session.MediaNotificationManager", false)) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        boolean z10;
        synchronized (this.f13291a) {
            z10 = this.v;
        }
        return z10;
    }

    public final i9.w l(r rVar, List list) {
        s(rVar);
        this.e.getClass();
        return na.d.B3(list);
    }

    public final p m(r rVar) {
        e9.i0 v;
        boolean z10 = this.f13310x;
        e9.i0 i0Var = null;
        l0 l0Var = this.h;
        if (z10 && k(rVar)) {
            l0Var.getClass();
            o1 o1Var = p.e;
            o1 o1Var2 = l0Var.f13443u;
            o1Var2.getClass();
            b2.x0 x0Var = l0Var.v;
            x0Var.getClass();
            e9.i0 i0Var2 = l0Var.f13441s;
            if (i0Var2 == null) {
                v = null;
            } else {
                v = e9.i0.v(i0Var2);
            }
            e9.i0 i0Var3 = l0Var.f13442t;
            if (i0Var3 != null) {
                i0Var = e9.i0.v(i0Var3);
            }
            return new p(o1Var2, x0Var, v, i0Var);
        }
        this.e.getClass();
        b2.x0 x0Var2 = p.f13467f;
        o1 o1Var3 = p.e;
        p pVar = new p(o1Var3, x0Var2, null, null);
        if (i(rVar)) {
            boolean z11 = true;
            this.f13310x = true;
            t tVar = this.f13298k;
            e9.i0 i0Var4 = tVar.f13518a.f13312z;
            if (i0Var4.isEmpty()) {
                l0Var.f13441s = tVar.f13518a.f13311y;
            } else {
                l0Var.f13442t = i0Var4;
                Bundle bundle = l0Var.f13440r;
                boolean z12 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
                boolean z13 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
                l0Var.M();
                if (bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) != z12 || bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) != z13) {
                    ((n4.r) l0Var.f13433k.f13824b).f13805a.setExtras(bundle);
                }
            }
            b0 b0Var = l0Var.f13430g;
            Bundle bundle2 = l0Var.f13440r;
            if (l0Var.v.a(17) == x0Var2.a(17)) {
                z11 = false;
            }
            l0Var.f13443u = o1Var3;
            l0Var.v = x0Var2;
            if (!l0Var.f13442t.isEmpty()) {
                boolean z14 = bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
                boolean z15 = bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
                l0Var.M();
                if (bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) != z14 || bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) != z15) {
                    ((n4.r) l0Var.f13433k.f13824b).f13805a.setExtras(bundle2);
                }
            }
            if (z11) {
                e2.d0.U(b0Var.f13299l, new g0(l0Var, b0Var.f13307t, 0));
                return pVar;
            }
            l0Var.N(b0Var.f13307t);
        }
        return pVar;
    }

    public final i9.u n(r rVar) {
        s(rVar);
        this.e.getClass();
        return o8.b(new r1(-6));
    }

    public final boolean o() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            ?? obj = new Object();
            this.f13302o.post(new w(0, this, (Object) obj));
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
        return e2.d0.d0(na.d.B3(list), new i9.p() {
            @Override
            public final i9.w apply(Object obj) {
                return o8.b(new s(j3, i10, (List) obj));
            }
        });
    }

    public final void r() {
        e2.a.i("MediaSessionImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.1] [" + e2.d0.f7188a + "] [" + b2.l0.b() + "]");
        synchronized (this.f13291a) {
            try {
                if (this.v) {
                    return;
                }
                this.v = true;
                x xVar = this.d;
                gg.a0 a0Var = xVar.f13553a;
                if (a0Var != null) {
                    xVar.removeCallbacks(a0Var);
                    xVar.f13553a = null;
                }
                this.f13299l.removeCallbacksAndMessages(null);
                try {
                    e2.d0.U(this.f13299l, new u(this, 0));
                } catch (Exception e) {
                    e2.a.o("MediaSessionImpl", "Exception thrown while closing", e);
                }
                l0 l0Var = this.h;
                ComponentName componentName = l0Var.f13435m;
                b0 b0Var = l0Var.f13430g;
                n4.y yVar = l0Var.f13433k;
                int i10 = Build.VERSION.SDK_INT;
                int i11 = 0;
                if (i10 < 31) {
                    if (componentName == null) {
                        ((n4.r) yVar.f13824b).f13805a.setMediaButtonReceiver(null);
                    } else {
                        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", b0Var.f13292b);
                        intent.setComponent(componentName);
                        ((n4.r) yVar.f13824b).f13805a.setMediaButtonReceiver(PendingIntent.getBroadcast(b0Var.f13294f, 0, intent, l0.f13428w));
                    }
                }
                androidx.mediarouter.app.g gVar = l0Var.f13434l;
                if (gVar != null) {
                    b0Var.f13294f.unregisterReceiver(gVar);
                }
                n4.r rVar = (n4.r) yVar.f13824b;
                MediaSession mediaSession = rVar.f13805a;
                rVar.f13808f.kill();
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
                rVar.f13806b.f13804a.clear();
                mediaSession.release();
                h1 h1Var = this.f13295g;
                Set<r> set = h1Var.f13377c;
                ki.f fVar = h1Var.f13376b;
                e9.i0 r10 = fVar.r();
                int size = r10.size();
                while (i11 < size) {
                    Object obj = r10.get(i11);
                    i11++;
                    r rVar2 = (r) obj;
                    fVar.K(rVar2);
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
                h1Var.f13375a.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final r s(r rVar) {
        if (this.f13310x && k(rVar)) {
            r e = e();
            e.getClass();
            return e;
        }
        return rVar;
    }

    public final void t() {
        Handler handler = this.f13299l;
        u uVar = this.f13301n;
        handler.removeCallbacks(uVar);
        if (this.f13304q) {
            long j3 = this.f13309w;
            if (j3 > 0) {
                if (this.f13307t.i0() || this.f13307t.c()) {
                    handler.postDelayed(uVar, j3);
                }
            }
        }
    }

    public final void u(l1 l1Var, l1 l1Var2) {
        b2.n0 n0Var;
        float f7;
        b2.e eVar;
        d2.c cVar;
        int i10;
        boolean z10;
        b2.s1 s1Var;
        l0 l0Var = this.h;
        this.f13307t = l1Var2;
        if (l1Var != null) {
            z zVar = this.f13308u;
            e2.d.h(zVar);
            l1Var.D(zVar);
        }
        z zVar2 = new z(this, l1Var2);
        l1Var2.n0(zVar2);
        this.f13308u = zVar2;
        try {
            l0Var.f13431i.m(0, l1Var, l1Var2);
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
        }
        if (l1Var == null) {
            ((n4.r) l0Var.f13433k.f13824b).f13805a.setActive(true);
        }
        b2.u0 W = l1Var2.W();
        q1 O0 = l1Var2.O0();
        b2.a1 N0 = l1Var2.N0();
        b2.a1 N02 = l1Var2.N0();
        b2.v0 h = l1Var2.h();
        int l4 = l1Var2.l();
        boolean A0 = l1Var2.A0();
        x1 E = l1Var2.E();
        b2.k1 Q0 = l1Var2.Q0();
        if (l1Var2.m0(18)) {
            n0Var = l1Var2.h0();
        } else {
            n0Var = b2.n0.K;
        }
        b2.n0 n0Var2 = n0Var;
        if (l1Var2.m0(22)) {
            f7 = l1Var2.G();
        } else {
            f7 = 1.0f;
        }
        if (l1Var2.m0(21)) {
            eVar = l1Var2.I();
        } else {
            eVar = b2.e.h;
        }
        b2.e eVar2 = eVar;
        if (l1Var2.m0(28)) {
            cVar = l1Var2.j0();
        } else {
            cVar = d2.c.d;
        }
        d2.c cVar2 = cVar;
        b2.l K = l1Var2.K();
        if (l1Var2.m0(23)) {
            i10 = l1Var2.m();
        } else {
            i10 = 0;
        }
        if (l1Var2.m0(23) && l1Var2.x0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean u10 = l1Var2.u();
        int u02 = l1Var2.u0();
        int d = l1Var2.d();
        boolean i02 = l1Var2.i0();
        boolean c10 = l1Var2.c();
        b2.n0 R0 = l1Var2.R0();
        long L0 = l1Var2.L0();
        long Z = l1Var2.Z();
        long z11 = l1Var2.z();
        if (l1Var2.m0(30)) {
            s1Var = l1Var2.g0();
        } else {
            s1Var = b2.s1.f2012b;
        }
        this.f13306s = new j1(W, 0, O0, N0, N02, 0, h, l4, A0, E, Q0, 0, n0Var2, f7, eVar2, cVar2, K, i10, z10, u10, 1, u02, d, i02, c10, R0, L0, Z, z11, s1Var, l1Var2.B0());
        f(l1Var2.t());
    }

    public final void v() {
        if (Looper.myLooper() == this.f13299l.getLooper()) {
            return;
        }
        throw new IllegalStateException("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
    }
}
