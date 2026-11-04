package o4;

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
import b8.bc;
import b8.v1;
import b8.yd;
import b8.zb;
import ci.u8;
import d2.a2;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
public class e0 {
    public static final r1 B = new r1(1);
    public static final f9.t C = bc.a(new c3.q(5));
    public final Bundle A;
    public final Object f20619a = new Object();
    public final Uri f20620b;
    public final b0 f20621c;
    public final a0 d;
    public final kb.a f20622e;
    public final Context f20623f;
    public final h1 f20624g;
    public final o0 h;
    public final String f20625i;
    public final s1 f20626j;
    public final x f20627k;
    public final Handler f20628l;
    public final g2.e f20629m;
    public final y f20630n;
    public final Handler f20631o;
    public final boolean f20632p;
    public final boolean f20633q;
    public final g9.i0 f20634r;
    public j1 f20635s;
    public l1 f20636t;
    public c0 f20637u;
    public boolean v;
    public final long f20638w;
    public boolean f20639x;
    public final g9.i0 f20640y;
    public final g9.i0 f20641z;

    public e0(x xVar, Context context, String str, d2.e1 e1Var, g9.i0 i0Var, g9.i0 i0Var2, g9.i0 i0Var3, kb.a aVar, Bundle bundle, Bundle bundle2, g2.e eVar, boolean z10, boolean z11) {
        String str2 = str;
        g2.a.g("MediaSessionImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + g2.n0.f11873a + "]");
        this.f20627k = xVar;
        this.f20623f = context;
        this.f20625i = str2;
        this.f20640y = i0Var;
        this.f20641z = i0Var2;
        this.f20634r = i0Var3;
        this.f20622e = aVar;
        this.A = bundle2;
        this.f20629m = eVar;
        this.f20632p = z10;
        this.f20633q = z11;
        h1 h1Var = new h1(this);
        this.f20624g = h1Var;
        this.f20631o = new Handler(Looper.getMainLooper());
        Looper B0 = e1Var.B0();
        Handler handler = new Handler(B0);
        this.f20628l = handler;
        this.f20635s = j1.H;
        this.f20621c = new b0(this, B0);
        this.d = new a0(this, B0);
        Uri build = new Uri.Builder().scheme("androidx").authority("media3.session").appendPath(str2 == null ? "" : str2).build();
        this.f20620b = build;
        o0 o0Var = new o0(this, build, handler, bundle, z10, i0Var, i0Var2, t.f20853e, t.f20854f, bundle2);
        this.h = o0Var;
        this.f20626j = new s1(Process.myUid(), context.getPackageName(), h1Var, bundle, ((p4.l) o0Var.f20779n.f53181a).f53166c.f53179b);
        l1 l1Var = new l1(e1Var);
        this.f20636t = l1Var;
        g2.n0.W(handler, new m2.s(12, this, l1Var));
        this.f20638w = 3000L;
        this.f20630n = new y(this, 2);
        g2.n0.W(handler, new y(this, 3));
    }

    public static void a(e0 e0Var) {
        synchronized (e0Var.f20619a) {
            try {
                if (e0Var.v) {
                    return;
                }
                q1 R0 = e0Var.f20636t.R0();
                if (!e0Var.f20621c.hasMessages(1)) {
                    q1 q1Var = e0Var.f20635s.f20721c;
                    d2.d1 d1Var = R0.f20817a;
                    int i3 = d1Var.f8067b;
                    d2.d1 d1Var2 = q1Var.f20817a;
                    if (i3 == d1Var2.f8067b && d1Var.f8069e == d1Var2.f8069e && d1Var.h == d1Var2.h && d1Var.f8072i == d1Var2.f8072i) {
                        ui.f fVar = e0Var.f20624g.f20661b;
                        g9.i0 n4 = fVar.n();
                        for (int i10 = 0; i10 < n4.size(); i10++) {
                            v vVar = (v) n4.get(i10);
                            fVar.p(vVar);
                            e0Var.c(vVar, new z(R0, fVar.w(vVar, 16), fVar.w(vVar, 17), vVar));
                        }
                        try {
                            e0Var.h.f20775j.i(0, R0, true, true, 0);
                        } catch (RemoteException e10) {
                            g2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
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
        if (vVar != null && Objects.equals(vVar.f20879a.f53183a.f53184a, "com.android.systemui")) {
            return true;
        }
        return false;
    }

    public final boolean b(KeyEvent keyEvent, boolean z10, boolean z11) {
        e eVar;
        v e10 = this.f20627k.f20895a.e();
        if (e10 != null) {
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
                                        eVar = new e(this, e10, 6);
                                        break;
                                    case 87:
                                        break;
                                    case 88:
                                        break;
                                    case 89:
                                        eVar = new e(this, e10, 5);
                                        break;
                                    case 90:
                                        eVar = new e(this, e10, 4);
                                        break;
                                    default:
                                        return false;
                                }
                            }
                            eVar = new e(this, e10, 3);
                        }
                        eVar = new e(this, e10, 2);
                    } else {
                        eVar = new e(this, e10, 1);
                    }
                } else {
                    eVar = new e(this, e10, 9);
                }
                g2.n0.W(this.f20628l, new u8(this, z11, e10, eVar, 7));
                return true;
            }
            if (this.f20636t.u()) {
                eVar = new e(this, e10, 7);
            } else {
                eVar = new e(this, e10, 8);
            }
            g2.n0.W(this.f20628l, new u8(this, z11, e10, eVar, 7));
            return true;
        }
        return false;
    }

    public final void c(v vVar, d0 d0Var) {
        int i3;
        h1 h1Var = this.f20624g;
        try {
            com.google.android.gms.common.api.internal.s s6 = h1Var.f20661b.s(vVar);
            if (s6 != null) {
                i3 = s6.e();
            } else if (h(vVar)) {
                i3 = 0;
            } else {
                return;
            }
            u uVar = vVar.d;
            if (uVar != null) {
                d0Var.d(uVar, i3);
            }
        } catch (DeadObjectException unused) {
            h1Var.f20661b.K(vVar);
        } catch (RemoteException e10) {
            g2.a.m("MediaSessionImpl", "Exception in " + vVar, e10);
        }
    }

    public final void d(d0 d0Var) {
        g9.i0 n4 = this.f20624g.f20661b.n();
        for (int i3 = 0; i3 < n4.size(); i3++) {
            c((v) n4.get(i3), d0Var);
        }
        try {
            d0Var.d(this.h.f20775j, 0);
        } catch (RemoteException e10) {
            g2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
        }
    }

    public final v e() {
        g9.i0 n4 = this.f20624g.f20661b.n();
        for (int i3 = 0; i3 < n4.size(); i3++) {
            v vVar = (v) n4.get(i3);
            if (i(vVar)) {
                return vVar;
            }
        }
        return null;
    }

    public final void f(d2.a1 a1Var) {
        this.f20621c.a(false, false);
        d(new l5.b(a1Var, 16));
        try {
            m0 m0Var = this.h.f20775j;
            d2.p pVar = this.f20635s.f20735s;
            m0Var.m();
        } catch (RemoteException e10) {
            g2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
        }
    }

    public final void g(v vVar, boolean z10) {
        boolean z11;
        boolean z12;
        if (o()) {
            if (this.f20636t.m0(16) && this.f20636t.w() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!this.f20636t.m0(31) && !this.f20636t.m0(20)) {
                z12 = false;
            } else {
                z12 = true;
            }
            v s6 = s(vVar);
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            zb.p(!false);
            sparseBooleanArray.append(1, true);
            zb.p(!false);
            d2.a1 a1Var = new d2.a1(new d2.t(sparseBooleanArray));
            if (!z11 && z12) {
                this.f20622e.getClass();
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                ?? obj = new Object();
                obj.n(unsupportedOperationException);
                obj.b(new l9.u(0, (Object) obj, new androidx.activity.n(this, s6, z10, a1Var)), new k2.g0(this, 2));
                return;
            }
            if (!z11) {
                g2.a.l("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
            }
            g2.n0.J(this.f20636t);
            if (z10) {
                p(s6);
            }
        }
    }

    public final boolean h(v vVar) {
        if (!this.f20624g.f20661b.t(vVar) && !this.h.f20773g.t(vVar)) {
            return false;
        }
        return true;
    }

    public final boolean i(v vVar) {
        if (!Objects.equals(vVar.f20879a.f53183a.f53184a, this.f20623f.getPackageName()) || vVar.f20880b == 0 || !new Bundle(vVar.f20882e).getBoolean("androidx.media3.session.MediaNotificationManager", false)) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        boolean z10;
        synchronized (this.f20619a) {
            z10 = this.v;
        }
        return z10;
    }

    public final l9.y l(v vVar, List list) {
        s(vVar);
        this.f20622e.getClass();
        return kb.a.U4(list);
    }

    public final t m(v vVar) {
        g9.i0 q10;
        g9.i0 i0Var;
        boolean z10 = this.f20639x;
        g9.i0 i0Var2 = null;
        o0 o0Var = this.h;
        if (z10 && k(vVar)) {
            o0Var.getClass();
            o1 o1Var = t.f20853e;
            o1 o1Var2 = o0Var.f20788x;
            o1Var2.getClass();
            d2.a1 a1Var = o0Var.f20789y;
            a1Var.getClass();
            if (!o0Var.f20787w.isEmpty()) {
                g9.i0 i0Var3 = o0Var.f20787w;
                if (i0Var3 == null) {
                    i0Var = null;
                } else {
                    i0Var = g9.i0.q(i0Var3);
                }
            } else {
                g9.i0 i0Var4 = o0Var.v;
                if (i0Var4 == null) {
                    q10 = null;
                } else {
                    q10 = g9.i0.q(i0Var4);
                }
                g9.i0 i0Var5 = q10;
                i0Var = null;
                i0Var2 = i0Var5;
            }
            return new t(o1Var2, a1Var, i0Var2, i0Var);
        }
        this.f20622e.getClass();
        d2.a1 a1Var2 = t.f20854f;
        o1 o1Var3 = t.f20853e;
        t tVar = new t(o1Var3, a1Var2, null, null);
        if (i(vVar)) {
            boolean z11 = true;
            this.f20639x = true;
            x xVar = this.f20627k;
            g9.i0 i0Var6 = xVar.f20895a.f20641z;
            if (i0Var6.isEmpty()) {
                o0Var.v = xVar.f20895a.f20640y;
            } else {
                o0Var.f20787w = i0Var6;
                o0Var.o0();
            }
            e0 e0Var = o0Var.h;
            if (o0Var.f20789y.a(17) == a1Var2.a(17)) {
                z11 = false;
            }
            o0Var.f20788x = o1Var3;
            o0Var.f20789y = a1Var2;
            if (!o0Var.f20787w.isEmpty()) {
                o0Var.o0();
            }
            if (z11) {
                g2.n0.W(e0Var.f20628l, new i0(o0Var, e0Var.f20636t, 0));
                return tVar;
            }
            o0Var.p0(e0Var.f20636t);
        }
        return tVar;
    }

    public final l9.w n(v vVar) {
        s(vVar);
        this.f20622e.getClass();
        return yd.b(new r1(-6));
    }

    public final boolean o() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                return ((Boolean) v1.a(new l5.b(this, 15)).f3957b.get()).booleanValue();
            } catch (InterruptedException | ExecutionException e10) {
                throw new IllegalStateException(e10);
            }
        }
        return true;
    }

    public final void p(v vVar) {
        s(vVar);
        this.f20622e.getClass();
    }

    public final l9.e0 q(v vVar, List list, final int i3, final long j10) {
        s(vVar);
        this.f20622e.getClass();
        return g2.n0.g0(kb.a.U4(list), new l9.q() {
            @Override
            public final l9.y apply(Object obj) {
                return yd.b(new w((List) obj, i3, j10));
            }
        });
    }

    public final void r() {
        g2.a.g("MediaSessionImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + g2.n0.f11873a + "] [" + d2.o0.b() + "]");
        synchronized (this.f20619a) {
            try {
                if (this.v) {
                    return;
                }
                this.v = true;
                a0 a0Var = this.d;
                lg.y yVar = a0Var.f20577a;
                if (yVar != null) {
                    a0Var.removeCallbacks(yVar);
                    a0Var.f20577a = null;
                }
                this.f20628l.removeCallbacksAndMessages(null);
                try {
                    g2.n0.W(this.f20628l, new y(this, 0));
                } catch (Exception e10) {
                    g2.a.m("MediaSessionImpl", "Exception thrown while closing", e10);
                }
                o0 o0Var = this.h;
                ComponentName componentName = o0Var.f20781p;
                e0 e0Var = o0Var.h;
                p4.q qVar = o0Var.f20779n;
                int i3 = Build.VERSION.SDK_INT;
                int i10 = 0;
                if (i3 < 31) {
                    if (componentName == null) {
                        ((p4.l) qVar.f53181a).f53164a.setMediaButtonReceiver(null);
                    } else {
                        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", e0Var.f20620b);
                        intent.setComponent(componentName);
                        ((p4.l) qVar.f53181a).f53164a.setMediaButtonReceiver(PendingIntent.getBroadcast(e0Var.f20623f, 0, intent, o0.f20772z));
                    }
                }
                androidx.mediarouter.app.f fVar = o0Var.f20780o;
                if (fVar != null) {
                    e0Var.f20623f.unregisterReceiver(fVar);
                }
                b bVar = o0Var.f20778m;
                if (bVar != null && !bVar.f20585f.getAndSet(true)) {
                    bVar.f20583c.execute(new a(bVar, 0));
                }
                p4.l lVar = (p4.l) qVar.f53181a;
                MediaSession mediaSession = lVar.f53164a;
                lVar.f53168f.kill();
                if (i3 == 27) {
                    try {
                        Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                        declaredField.setAccessible(true);
                        Handler handler = (Handler) declaredField.get(mediaSession);
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(null);
                        }
                    } catch (Exception e11) {
                        g2.a.m("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e11);
                    }
                }
                mediaSession.setCallback(null);
                lVar.f53165b.f53163a.clear();
                mediaSession.release();
                h1 h1Var = this.f20624g;
                Set<v> set = h1Var.f20662c;
                ui.f fVar2 = h1Var.f20661b;
                g9.i0 n4 = fVar2.n();
                int size = n4.size();
                while (i10 < size) {
                    Object obj = n4.get(i10);
                    i10++;
                    v vVar = (v) obj;
                    fVar2.K(vVar);
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
                h1Var.f20660a.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final v s(v vVar) {
        v e10;
        if (this.f20639x && k(vVar) && (e10 = e()) != null) {
            return e10;
        }
        return vVar;
    }

    public final void t() {
        Handler handler = this.f20628l;
        y yVar = this.f20630n;
        handler.removeCallbacks(yVar);
        if (this.f20633q) {
            long j10 = this.f20638w;
            if (j10 > 0) {
                if (this.f20636t.i0() || this.f20636t.d()) {
                    handler.postDelayed(yVar, j10);
                }
            }
        }
    }

    public final void u(l1 l1Var, l1 l1Var2) {
        d2.q0 q0Var;
        float f10;
        d2.f fVar;
        f2.c cVar;
        boolean z10;
        d2.v1 v1Var;
        o0 o0Var = this.h;
        this.f20636t = l1Var2;
        if (l1Var != null) {
            c0 c0Var = this.f20637u;
            c0Var.getClass();
            l1Var.s(c0Var);
        }
        c0 c0Var2 = new c0(this, l1Var2);
        l1Var2.u0(c0Var2);
        this.f20637u = c0Var2;
        int i3 = 0;
        try {
            o0Var.f20775j.o(0, l1Var, l1Var2);
        } catch (RemoteException e10) {
            g2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
        }
        if (l1Var == null) {
            ((p4.l) o0Var.f20779n.f53181a).f53164a.setActive(true);
        }
        d2.x0 U = l1Var2.U();
        q1 R0 = l1Var2.R0();
        d2.d1 Q0 = l1Var2.Q0();
        d2.d1 Q02 = l1Var2.Q0();
        d2.y0 g7 = l1Var2.g();
        int m10 = l1Var2.m();
        boolean E0 = l1Var2.E0();
        a2 C2 = l1Var2.C();
        d2.n1 T0 = l1Var2.T0();
        if (l1Var2.m0(18)) {
            q0Var = l1Var2.h0();
        } else {
            q0Var = d2.q0.L;
        }
        d2.q0 q0Var2 = q0Var;
        if (l1Var2.m0(22)) {
            f10 = l1Var2.E();
        } else {
            f10 = 1.0f;
        }
        float f11 = f10;
        if (l1Var2.m0(21)) {
            fVar = l1Var2.G();
        } else {
            fVar = d2.f.f8079i;
        }
        d2.f fVar2 = fVar;
        if (l1Var2.m0(28)) {
            cVar = l1Var2.j0();
        } else {
            cVar = f2.c.d;
        }
        f2.c cVar2 = cVar;
        d2.p I = l1Var2.I();
        if (l1Var2.m0(23)) {
            i3 = l1Var2.i();
        }
        int i10 = i3;
        if (l1Var2.m0(23) && l1Var2.z0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = z10;
        boolean u10 = l1Var2.u();
        int t02 = l1Var2.t0();
        int h = l1Var2.h();
        boolean i02 = l1Var2.i0();
        boolean d = l1Var2.d();
        d2.q0 U0 = l1Var2.U0();
        long O0 = l1Var2.O0();
        long X = l1Var2.X();
        long z12 = l1Var2.z();
        if (l1Var2.m0(30)) {
            v1Var = l1Var2.f0();
        } else {
            v1Var = d2.v1.f8498b;
        }
        this.f20635s = new j1(U, 0, R0, Q0, Q02, 0, g7, m10, E0, C2, T0, 0, q0Var2, f11, 1.0f, fVar2, 0, cVar2, I, i10, z11, u10, 1, t02, h, i02, d, U0, O0, X, z12, v1Var, l1Var2.F0());
        f(l1Var2.t());
    }

    public final void v() {
        if (Looper.myLooper() == this.f20628l.getLooper()) {
            return;
        }
        throw new IllegalStateException("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
    }
}
