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
import b2.s1;
import b2.x1;
import bi.e4;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import ji.b5;
import ji.k5;
import v7.l8;
public class a0 {
    public static final p1 B = new p1(1);
    public final Bundle A;
    public final Object f15853a = new Object();
    public final Uri f15854b;
    public final x f15855c;
    public final w d;
    public final ob.a f15856e;
    public final Context f15857f;
    public final f1 f15858g;
    public final k0 h;
    public final String f15859i;
    public final q1 f15860j;
    public final t f15861k;
    public final Handler f15862l;
    public final n4.y f15863m;
    public final u f15864n;
    public final Handler f15865o;
    public final boolean f15866p;
    public final boolean f15867q;
    public final e9.i0 f15868r;
    public h1 f15869s;
    public j1 f15870t;
    public y f15871u;
    public boolean v;
    public final long f15872w;
    public boolean f15873x;
    public final e9.i0 f15874y;
    public final e9.i0 f15875z;

    public a0(t tVar, Context context, b2.b1 b1Var, e9.i0 i0Var, e9.i0 i0Var2, e9.i0 i0Var3, ob.a aVar, Bundle bundle, Bundle bundle2, n4.y yVar) {
        e2.a.i("MediaSessionImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.1] [" + e2.d0.f8765a + "]");
        this.f15861k = tVar;
        this.f15857f = context;
        this.f15859i = "pip-media-session";
        this.f15874y = i0Var;
        this.f15875z = i0Var2;
        this.f15868r = i0Var3;
        this.f15856e = aVar;
        this.A = bundle2;
        this.f15863m = yVar;
        this.f15866p = true;
        this.f15867q = true;
        f1 f1Var = new f1(this);
        this.f15858g = f1Var;
        this.f15865o = new Handler(Looper.getMainLooper());
        Looper y02 = b1Var.y0();
        Handler handler = new Handler(y02);
        this.f15862l = handler;
        this.f15869s = h1.F;
        this.f15855c = new x(this, y02);
        this.d = new w(this, y02);
        Uri build = new Uri.Builder().scheme(a0.class.getName()).appendPath("pip-media-session").appendPath(String.valueOf(SystemClock.elapsedRealtime())).build();
        this.f15854b = build;
        k0 k0Var = new k0(this, build, handler, bundle, i0Var, i0Var2, p.f16066e, p.f16067f, bundle2);
        this.h = k0Var;
        this.f15860j = new q1(Process.myUid(), context.getPackageName(), f1Var, bundle, ((n4.r) k0Var.f16000k.f16523b).f16505c.f16520b);
        j1 j1Var = new j1(b1Var);
        this.f15870t = j1Var;
        e2.d0.U(handler, new b5(7, this, j1Var));
        this.f15872w = 3000L;
        this.f15864n = new u(this, 2);
        e2.d0.U(handler, new u(this, 3));
    }

    public static void a(a0 a0Var) {
        synchronized (a0Var.f15853a) {
            try {
                if (a0Var.v) {
                    return;
                }
                final o1 O0 = a0Var.f15870t.O0();
                if (!a0Var.f15855c.hasMessages(1)) {
                    o1 o1Var = a0Var.f15869s.f15962c;
                    b2.a1 a1Var = O0.f16058a;
                    int i10 = a1Var.f1987b;
                    b2.a1 a1Var2 = o1Var.f16058a;
                    if (i10 == a1Var2.f1987b && a1Var.f1989e == a1Var2.f1989e && a1Var.h == a1Var2.h && a1Var.f1992i == a1Var2.f1992i) {
                        fg.f fVar = a0Var.f15858g.f15918b;
                        e9.i0 t10 = fVar.t();
                        for (int i11 = 0; i11 < t10.size(); i11++) {
                            final r rVar = (r) t10.get(i11);
                            fVar.w(rVar);
                            final boolean C = fVar.C(rVar, 16);
                            final boolean C2 = fVar.C(rVar, 17);
                            a0Var.c(rVar, new z() {
                                @Override
                                public final void e(q qVar, int i12) {
                                    qVar.e(i12, o1.this, C, C2, rVar.f16087c);
                                }
                            });
                        }
                        try {
                            a0Var.h.f15998i.e(0, O0, true, true, 0);
                        } catch (RemoteException e7) {
                            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
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
        if (rVar != null && Objects.equals(rVar.f16085a.f16452a.f16453a, "com.android.systemui")) {
            return true;
        }
        return false;
    }

    public final boolean b(KeyEvent keyEvent, boolean z10, boolean z11) {
        b bVar;
        r e7 = this.f15861k.f16116a.e();
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
                                if (this.f15870t.u()) {
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
        e2.d0.U(this.f15862l, new e4(this, z11, e7, bVar, 6));
        return true;
    }

    public final void c(r rVar, z zVar) {
        int i10;
        f1 f1Var = this.f15858g;
        try {
            com.google.android.gms.common.api.internal.v y3 = f1Var.f15918b.y(rVar);
            if (y3 != null) {
                i10 = y3.e();
            } else if (h(rVar)) {
                i10 = 0;
            } else {
                return;
            }
            q qVar = rVar.d;
            if (qVar != null) {
                zVar.e(qVar, i10);
            }
        } catch (DeadObjectException unused) {
            f1Var.f15918b.N(rVar);
        } catch (RemoteException e7) {
            e2.a.o("MediaSessionImpl", "Exception in " + rVar, e7);
        }
    }

    public final void d(z zVar) {
        e9.i0 t10 = this.f15858g.f15918b.t();
        for (int i10 = 0; i10 < t10.size(); i10++) {
            c((r) t10.get(i10), zVar);
        }
        try {
            zVar.e(this.h.f15998i, 0);
        } catch (RemoteException e7) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
        }
    }

    public final r e() {
        e9.i0 t10 = this.f15858g.f15918b.t();
        for (int i10 = 0; i10 < t10.size(); i10++) {
            r rVar = (r) t10.get(i10);
            if (i(rVar)) {
                return rVar;
            }
        }
        return null;
    }

    public final void f(b2.x0 x0Var) {
        this.f15855c.a(false, false);
        d(new k5(x0Var, 3));
        try {
            i0 i0Var = this.h.f15998i;
            b2.l lVar = this.f15869s.f15974q;
            i0Var.k();
        } catch (RemoteException e7) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
        }
    }

    public final void g(r rVar, boolean z10) {
        boolean z11;
        boolean z12;
        if (o()) {
            if (this.f15870t.m0(16) && this.f15870t.w() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!this.f15870t.m0(31) && !this.f15870t.m0(20)) {
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
                this.f15856e.getClass();
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                ?? obj = new Object();
                obj.n(unsupportedOperationException);
                androidx.activity.o oVar = new androidx.activity.o(this, s10, z10, x0Var);
                obj.a(new i9.s(0, (Object) obj, oVar), new k2.a0(this, 1));
                return;
            }
            if (!z11) {
                e2.a.n("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
            }
            e2.d0.H(this.f15870t);
            if (z10) {
                p(s10);
            }
        }
    }

    public final boolean h(r rVar) {
        if (!this.f15858g.f15918b.B(rVar) && !this.h.f15996f.B(rVar)) {
            return false;
        }
        return true;
    }

    public final boolean i(r rVar) {
        if (!Objects.equals(rVar.f16085a.f16452a.f16453a, this.f15857f.getPackageName()) || rVar.f16086b == 0 || !new Bundle(rVar.f16088e).getBoolean("androidx.media3.session.MediaNotificationManager", false)) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        boolean z10;
        synchronized (this.f15853a) {
            z10 = this.v;
        }
        return z10;
    }

    public final i9.w l(r rVar, List list) {
        s(rVar);
        this.f15856e.getClass();
        return ob.a.w3(list);
    }

    public final p m(r rVar) {
        e9.i0 v;
        boolean z10 = this.f15873x;
        e9.i0 i0Var = null;
        k0 k0Var = this.h;
        if (z10 && k(rVar)) {
            k0Var.getClass();
            m1 m1Var = p.f16066e;
            m1 m1Var2 = k0Var.f16010u;
            m1Var2.getClass();
            b2.x0 x0Var = k0Var.v;
            x0Var.getClass();
            e9.i0 i0Var2 = k0Var.f16008s;
            if (i0Var2 == null) {
                v = null;
            } else {
                v = e9.i0.v(i0Var2);
            }
            e9.i0 i0Var3 = k0Var.f16009t;
            if (i0Var3 != null) {
                i0Var = e9.i0.v(i0Var3);
            }
            return new p(m1Var2, x0Var, v, i0Var);
        }
        this.f15856e.getClass();
        b2.x0 x0Var2 = p.f16067f;
        m1 m1Var3 = p.f16066e;
        p pVar = new p(m1Var3, x0Var2, null, null);
        if (i(rVar)) {
            boolean z11 = true;
            this.f15873x = true;
            t tVar = this.f15861k;
            e9.i0 i0Var4 = tVar.f16116a.f15875z;
            if (i0Var4.isEmpty()) {
                k0Var.f16008s = tVar.f16116a.f15874y;
            } else {
                k0Var.f16009t = i0Var4;
                Bundle bundle = k0Var.f16007r;
                boolean z12 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
                boolean z13 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
                k0Var.M();
                if (bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) != z12 || bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) != z13) {
                    ((n4.r) k0Var.f16000k.f16523b).f16503a.setExtras(bundle);
                }
            }
            a0 a0Var = k0Var.f15997g;
            Bundle bundle2 = k0Var.f16007r;
            if (k0Var.v.a(17) == x0Var2.a(17)) {
                z11 = false;
            }
            k0Var.f16010u = m1Var3;
            k0Var.v = x0Var2;
            if (!k0Var.f16009t.isEmpty()) {
                boolean z14 = bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
                boolean z15 = bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
                k0Var.M();
                if (bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) != z14 || bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) != z15) {
                    ((n4.r) k0Var.f16000k.f16523b).f16503a.setExtras(bundle2);
                }
            }
            if (z11) {
                e2.d0.U(a0Var.f15862l, new f0(k0Var, a0Var.f15870t, 0));
                return pVar;
            }
            k0Var.N(a0Var.f15870t);
        }
        return pVar;
    }

    public final i9.u n(r rVar) {
        s(rVar);
        this.f15856e.getClass();
        return l8.b(new p1(-6));
    }

    public final boolean o() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            ?? obj = new Object();
            this.f15865o.post(new b5(5, this, (Object) obj));
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
        this.f15856e.getClass();
    }

    public final i9.c0 q(r rVar, List list, final int i10, final long j3) {
        s(rVar);
        this.f15856e.getClass();
        return e2.d0.d0(ob.a.w3(list), new i9.p() {
            @Override
            public final i9.w apply(Object obj) {
                return l8.b(new s(j3, i10, (List) obj));
            }
        });
    }

    public final void r() {
        e2.a.i("MediaSessionImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.1] [" + e2.d0.f8765a + "] [" + b2.l0.b() + "]");
        synchronized (this.f15853a) {
            try {
                if (this.v) {
                    return;
                }
                this.v = true;
                w wVar = this.d;
                hg.t tVar = wVar.f16126a;
                if (tVar != null) {
                    wVar.removeCallbacks(tVar);
                    wVar.f16126a = null;
                }
                this.f15862l.removeCallbacksAndMessages(null);
                try {
                    e2.d0.U(this.f15862l, new u(this, 0));
                } catch (Exception e7) {
                    e2.a.o("MediaSessionImpl", "Exception thrown while closing", e7);
                }
                k0 k0Var = this.h;
                ComponentName componentName = k0Var.f16002m;
                a0 a0Var = k0Var.f15997g;
                n4.y yVar = k0Var.f16000k;
                int i10 = Build.VERSION.SDK_INT;
                int i11 = 0;
                if (i10 < 31) {
                    if (componentName == null) {
                        ((n4.r) yVar.f16523b).f16503a.setMediaButtonReceiver(null);
                    } else {
                        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", a0Var.f15854b);
                        intent.setComponent(componentName);
                        ((n4.r) yVar.f16523b).f16503a.setMediaButtonReceiver(PendingIntent.getBroadcast(a0Var.f15857f, 0, intent, k0.f15995w));
                    }
                }
                androidx.mediarouter.app.g gVar = k0Var.f16001l;
                if (gVar != null) {
                    a0Var.f15857f.unregisterReceiver(gVar);
                }
                n4.r rVar = (n4.r) yVar.f16523b;
                MediaSession mediaSession = rVar.f16503a;
                rVar.f16507f.kill();
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
                rVar.f16504b.f16502a.clear();
                mediaSession.release();
                f1 f1Var = this.f15858g;
                Set<r> set = f1Var.f15919c;
                fg.f fVar = f1Var.f15918b;
                e9.i0 t10 = fVar.t();
                int size = t10.size();
                while (i11 < size) {
                    Object obj = t10.get(i11);
                    i11++;
                    r rVar2 = (r) obj;
                    fVar.N(rVar2);
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
                f1Var.f15917a.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final r s(r rVar) {
        if (this.f15873x && k(rVar)) {
            r e7 = e();
            e7.getClass();
            return e7;
        }
        return rVar;
    }

    public final void t() {
        Handler handler = this.f15862l;
        u uVar = this.f15864n;
        handler.removeCallbacks(uVar);
        if (this.f15867q) {
            long j3 = this.f15872w;
            if (j3 > 0) {
                if (this.f15870t.i0() || this.f15870t.c()) {
                    handler.postDelayed(uVar, j3);
                }
            }
        }
    }

    public final void u(j1 j1Var, j1 j1Var2) {
        b2.n0 n0Var;
        float f7;
        b2.e eVar;
        d2.c cVar;
        int i10;
        boolean z10;
        s1 s1Var;
        k0 k0Var = this.h;
        this.f15870t = j1Var2;
        if (j1Var != null) {
            y yVar = this.f15871u;
            e2.d.h(yVar);
            j1Var.D(yVar);
        }
        y yVar2 = new y(this, j1Var2);
        j1Var2.n0(yVar2);
        this.f15871u = yVar2;
        try {
            k0Var.f15998i.m(0, j1Var, j1Var2);
        } catch (RemoteException e7) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
        }
        if (j1Var == null) {
            ((n4.r) k0Var.f16000k.f16523b).f16503a.setActive(true);
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
            cVar = j1Var2.j0();
        } else {
            cVar = d2.c.d;
        }
        d2.c cVar2 = cVar;
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
            s1Var = s1.f2407b;
        }
        this.f15869s = new h1(W, 0, O0, N0, N02, 0, h, l4, A0, E, Q0, 0, n0Var2, f7, eVar2, cVar2, K, i10, z10, u10, 1, u02, d, i02, c10, R0, L0, Z, z11, s1Var, j1Var2.B0());
        f(j1Var2.t());
    }

    public final void v() {
        if (Looper.myLooper() == this.f15862l.getLooper()) {
            return;
        }
        throw new IllegalStateException("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
    }
}
