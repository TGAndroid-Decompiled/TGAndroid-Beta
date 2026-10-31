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
import bi.n4;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import v7.e5;
import v7.p8;
import v7.t6;
import v7.v6;
public class f0 {
    public static final t1 B = new t1(1);
    public static final d9.t C = v6.a(new a3.s(5));
    public final Bundle A;
    public final Object f12738a = new Object();
    public final Uri f12739b;
    public final c0 f12740c;
    public final b0 d;
    public final oa.d e;
    public final Context f12741f;
    public final j1 f12742g;
    public final p0 h;
    public final String f12743i;
    public final u1 f12744j;
    public final y f12745k;
    public final Handler f12746l;
    public final e2.d f12747m;
    public final z f12748n;
    public final Handler f12749o;
    public final boolean f12750p;
    public final boolean f12751q;
    public final e9.n0 f12752r;
    public l1 f12753s;
    public n1 f12754t;
    public d0 f12755u;
    public boolean v;
    public final long f12756w;
    public boolean f12757x;
    public final e9.n0 f12758y;
    public final e9.n0 f12759z;

    public f0(y yVar, Context context, String str, b2.f1 f1Var, e9.n0 n0Var, e9.n0 n0Var2, e9.n0 n0Var3, oa.d dVar, Bundle bundle, Bundle bundle2, e2.d dVar2, boolean z10, boolean z11) {
        String str2 = str;
        e2.a.g("MediaSessionImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + e2.l0.f6165a + "]");
        this.f12745k = yVar;
        this.f12741f = context;
        this.f12743i = str2;
        this.f12758y = n0Var;
        this.f12759z = n0Var2;
        this.f12752r = n0Var3;
        this.e = dVar;
        this.A = bundle2;
        this.f12747m = dVar2;
        this.f12750p = z10;
        this.f12751q = z11;
        j1 j1Var = new j1(this);
        this.f12742g = j1Var;
        this.f12749o = new Handler(Looper.getMainLooper());
        Looper A0 = f1Var.A0();
        Handler handler = new Handler(A0);
        this.f12746l = handler;
        this.f12753s = l1.H;
        this.f12740c = new c0(this, A0);
        this.d = new b0(this, A0);
        Uri build = new Uri.Builder().scheme("androidx").authority("media3.session").appendPath(str2 == null ? "" : str2).build();
        this.f12739b = build;
        p0 p0Var = new p0(this, build, handler, bundle, z10, n0Var, n0Var2, u.e, u.f12955f, bundle2);
        this.h = p0Var;
        this.f12744j = new u1(Process.myUid(), context.getPackageName(), j1Var, bundle, ((n4.l) p0Var.f12883n.f13526a).f13512c.f13524b);
        n1 n1Var = new n1(f1Var);
        this.f12754t = n1Var;
        e2.l0.W(handler, new k2.u(16, this, n1Var));
        this.f12756w = 3000L;
        this.f12748n = new z(this, 2);
        e2.l0.W(handler, new z(this, 3));
    }

    public static void a(f0 f0Var) {
        synchronized (f0Var.f12738a) {
            try {
                if (f0Var.v) {
                    return;
                }
                s1 R0 = f0Var.f12754t.R0();
                if (!f0Var.f12740c.hasMessages(1)) {
                    s1 s1Var = f0Var.f12753s.f12838c;
                    b2.e1 e1Var = R0.f12939a;
                    int i10 = e1Var.f2022b;
                    b2.e1 e1Var2 = s1Var.f12939a;
                    if (i10 == e1Var2.f2022b && e1Var.e == e1Var2.e && e1Var.h == e1Var2.h && e1Var.f2026i == e1Var2.f2026i) {
                        xa.n nVar = f0Var.f12742g.f12789b;
                        e9.n0 A = nVar.A();
                        for (int i11 = 0; i11 < A.size(); i11++) {
                            w wVar = (w) A.get(i11);
                            nVar.E(wVar);
                            f0Var.c(wVar, new a0(R0, nVar.M(wVar, 16), nVar.M(wVar, 17), wVar));
                        }
                        try {
                            f0Var.h.f12879j.f(0, R0, true, true, 0);
                        } catch (RemoteException e) {
                            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                        }
                    }
                }
                f0Var.t();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean k(w wVar) {
        if (wVar != null && Objects.equals(wVar.f12981a.f13528a.f13529a, "com.android.systemui")) {
            return true;
        }
        return false;
    }

    public final boolean b(KeyEvent keyEvent, boolean z10, boolean z11) {
        f fVar;
        w e = this.f12745k.f12994a.e();
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
                                        fVar = new f(this, e, 6);
                                        break;
                                    case 87:
                                        break;
                                    case 88:
                                        break;
                                    case 89:
                                        fVar = new f(this, e, 5);
                                        break;
                                    case 90:
                                        fVar = new f(this, e, 4);
                                        break;
                                    default:
                                        return false;
                                }
                            }
                            fVar = new f(this, e, 3);
                        }
                        fVar = new f(this, e, 2);
                    } else {
                        fVar = new f(this, e, 1);
                    }
                } else {
                    fVar = new f(this, e, 9);
                }
                e2.l0.W(this.f12746l, new n4(this, z11, e, fVar, 4));
                return true;
            }
            if (this.f12754t.t()) {
                fVar = new f(this, e, 7);
            } else {
                fVar = new f(this, e, 8);
            }
            e2.l0.W(this.f12746l, new n4(this, z11, e, fVar, 4));
            return true;
        }
        return false;
    }

    public final void c(w wVar, e0 e0Var) {
        int i10;
        j1 j1Var = this.f12742g;
        try {
            com.google.android.gms.common.api.internal.v G = j1Var.f12789b.G(wVar);
            if (G != null) {
                i10 = G.e();
            } else if (h(wVar)) {
                i10 = 0;
            } else {
                return;
            }
            v vVar = wVar.d;
            if (vVar != null) {
                e0Var.e(vVar, i10);
            }
        } catch (DeadObjectException unused) {
            j1Var.f12789b.U(wVar);
        } catch (RemoteException e) {
            e2.a.m("MediaSessionImpl", "Exception in " + wVar, e);
        }
    }

    public final void d(e0 e0Var) {
        e9.n0 A = this.f12742g.f12789b.A();
        for (int i10 = 0; i10 < A.size(); i10++) {
            c((w) A.get(i10), e0Var);
        }
        try {
            e0Var.e(this.h.f12879j, 0);
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final w e() {
        e9.n0 A = this.f12742g.f12789b.A();
        for (int i10 = 0; i10 < A.size(); i10++) {
            w wVar = (w) A.get(i10);
            if (i(wVar)) {
                return wVar;
            }
        }
        return null;
    }

    public final void f(b2.b1 b1Var) {
        this.f12740c.a(false, false);
        d(new ig.c0(b1Var, 20));
        try {
            n0 n0Var = this.h.f12879j;
            b2.q qVar = this.f12753s.f12851s;
            n0Var.m();
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final void g(w wVar, boolean z10) {
        boolean z11;
        boolean z12;
        if (o()) {
            if (this.f12754t.n0(16) && this.f12754t.v() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!this.f12754t.n0(31) && !this.f12754t.n0(20)) {
                z12 = false;
            } else {
                z12 = true;
            }
            w s10 = s(wVar);
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            t6.p(!false);
            sparseBooleanArray.append(1, true);
            t6.p(!false);
            b2.b1 b1Var = new b2.b1(new b2.v(sparseBooleanArray));
            if (!z11 && z12) {
                this.e.getClass();
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                ?? obj = new Object();
                obj.n(unsupportedOperationException);
                obj.a(new j9.u(0, (Object) obj, new androidx.activity.o(this, s10, z10, b1Var)), new i2.g0(this, 2));
                return;
            }
            if (!z11) {
                e2.a.l("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
            }
            e2.l0.J(this.f12754t);
            if (z10) {
                p(s10);
            }
        }
    }

    public final boolean h(w wVar) {
        if (!this.f12742g.f12789b.L(wVar) && !this.h.f12877g.L(wVar)) {
            return false;
        }
        return true;
    }

    public final boolean i(w wVar) {
        if (!Objects.equals(wVar.f12981a.f13528a.f13529a, this.f12741f.getPackageName()) || wVar.f12982b == 0 || !new Bundle(wVar.e).getBoolean("androidx.media3.session.MediaNotificationManager", false)) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        boolean z10;
        synchronized (this.f12738a) {
            z10 = this.v;
        }
        return z10;
    }

    public final j9.y l(w wVar, List list) {
        s(wVar);
        this.e.getClass();
        return oa.d.P4(list);
    }

    public final u m(w wVar) {
        e9.n0 u10;
        e9.n0 n0Var;
        boolean z10 = this.f12757x;
        e9.n0 n0Var2 = null;
        p0 p0Var = this.h;
        if (z10 && k(wVar)) {
            p0Var.getClass();
            q1 q1Var = u.e;
            q1 q1Var2 = p0Var.f12892x;
            q1Var2.getClass();
            b2.b1 b1Var = p0Var.f12893y;
            b1Var.getClass();
            if (!p0Var.f12891w.isEmpty()) {
                e9.n0 n0Var3 = p0Var.f12891w;
                if (n0Var3 == null) {
                    n0Var = null;
                } else {
                    n0Var = e9.n0.u(n0Var3);
                }
            } else {
                e9.n0 n0Var4 = p0Var.v;
                if (n0Var4 == null) {
                    u10 = null;
                } else {
                    u10 = e9.n0.u(n0Var4);
                }
                e9.n0 n0Var5 = u10;
                n0Var = null;
                n0Var2 = n0Var5;
            }
            return new u(q1Var2, b1Var, n0Var2, n0Var);
        }
        this.e.getClass();
        b2.b1 b1Var2 = u.f12955f;
        q1 q1Var3 = u.e;
        u uVar = new u(q1Var3, b1Var2, null, null);
        if (i(wVar)) {
            boolean z11 = true;
            this.f12757x = true;
            y yVar = this.f12745k;
            e9.n0 n0Var6 = yVar.f12994a.f12759z;
            if (n0Var6.isEmpty()) {
                p0Var.v = yVar.f12994a.f12758y;
            } else {
                p0Var.f12891w = n0Var6;
                p0Var.o0();
            }
            f0 f0Var = p0Var.h;
            if (p0Var.f12893y.a(17) == b1Var2.a(17)) {
                z11 = false;
            }
            p0Var.f12892x = q1Var3;
            p0Var.f12893y = b1Var2;
            if (!p0Var.f12891w.isEmpty()) {
                p0Var.o0();
            }
            if (z11) {
                e2.l0.W(f0Var.f12746l, new j0(p0Var, f0Var.f12754t, 0));
                return uVar;
            }
            p0Var.p0(f0Var.f12754t);
        }
        return uVar;
    }

    public final j9.w n(w wVar) {
        s(wVar);
        this.e.getClass();
        return p8.b(new t1(-6));
    }

    public final boolean o() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                return ((Boolean) e5.a(new ig.c0(this, 19)).f3513b.get()).booleanValue();
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException(e);
            }
        }
        return true;
    }

    public final void p(w wVar) {
        s(wVar);
        this.e.getClass();
    }

    public final j9.e0 q(w wVar, List list, final int i10, final long j10) {
        s(wVar);
        this.e.getClass();
        return e2.l0.g0(oa.d.P4(list), new j9.q() {
            @Override
            public final j9.y apply(Object obj) {
                return p8.b(new x((List) obj, i10, j10));
            }
        });
    }

    public final void r() {
        e2.a.g("MediaSessionImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + e2.l0.f6165a + "] [" + b2.q0.b() + "]");
        synchronized (this.f12738a) {
            try {
                if (this.v) {
                    return;
                }
                this.v = true;
                b0 b0Var = this.d;
                li.s sVar = b0Var.f12702a;
                if (sVar != null) {
                    b0Var.removeCallbacks(sVar);
                    b0Var.f12702a = null;
                }
                this.f12746l.removeCallbacksAndMessages(null);
                try {
                    e2.l0.W(this.f12746l, new z(this, 0));
                } catch (Exception e) {
                    e2.a.m("MediaSessionImpl", "Exception thrown while closing", e);
                }
                p0 p0Var = this.h;
                ComponentName componentName = p0Var.f12885p;
                f0 f0Var = p0Var.h;
                n4.q qVar = p0Var.f12883n;
                int i10 = Build.VERSION.SDK_INT;
                int i11 = 0;
                if (i10 < 31) {
                    if (componentName == null) {
                        ((n4.l) qVar.f13526a).f13510a.setMediaButtonReceiver(null);
                    } else {
                        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", f0Var.f12739b);
                        intent.setComponent(componentName);
                        ((n4.l) qVar.f13526a).f13510a.setMediaButtonReceiver(PendingIntent.getBroadcast(f0Var.f12741f, 0, intent, p0.f12876z));
                    }
                }
                androidx.mediarouter.app.f fVar = p0Var.f12884o;
                if (fVar != null) {
                    f0Var.f12741f.unregisterReceiver(fVar);
                }
                b bVar = p0Var.f12882m;
                if (bVar != null && !bVar.f12701f.getAndSet(true)) {
                    bVar.f12700c.execute(new a(bVar, 0));
                }
                n4.l lVar = (n4.l) qVar.f13526a;
                MediaSession mediaSession = lVar.f13510a;
                lVar.f13513f.kill();
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
                lVar.f13511b.f13509a.clear();
                mediaSession.release();
                j1 j1Var = this.f12742g;
                Set<w> set = j1Var.f12790c;
                xa.n nVar = j1Var.f12789b;
                e9.n0 A = nVar.A();
                int size = A.size();
                while (i11 < size) {
                    Object obj = A.get(i11);
                    i11++;
                    w wVar = (w) obj;
                    nVar.U(wVar);
                    v vVar = wVar.d;
                    if (vVar != null) {
                        vVar.g();
                    }
                }
                for (w wVar2 : set) {
                    v vVar2 = wVar2.d;
                    if (vVar2 != null) {
                        vVar2.g();
                    }
                }
                set.clear();
                j1Var.f12788a.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final w s(w wVar) {
        w e;
        if (this.f12757x && k(wVar) && (e = e()) != null) {
            return e;
        }
        return wVar;
    }

    public final void t() {
        Handler handler = this.f12746l;
        z zVar = this.f12748n;
        handler.removeCallbacks(zVar);
        if (this.f12751q) {
            long j10 = this.f12756w;
            if (j10 > 0) {
                if (this.f12754t.i0() || this.f12754t.d()) {
                    handler.postDelayed(zVar, j10);
                }
            }
        }
    }

    public final void u(n1 n1Var, n1 n1Var2) {
        b2.s0 s0Var;
        float f7;
        b2.f fVar;
        d2.d dVar;
        boolean z10;
        w1 w1Var;
        p0 p0Var = this.h;
        this.f12754t = n1Var2;
        if (n1Var != null) {
            d0 d0Var = this.f12755u;
            d0Var.getClass();
            n1Var.C(d0Var);
        }
        d0 d0Var2 = new d0(this, n1Var2);
        n1Var2.o0(d0Var2);
        this.f12755u = d0Var2;
        int i10 = 0;
        try {
            p0Var.f12879j.o(0, n1Var, n1Var2);
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
        if (n1Var == null) {
            ((n4.l) p0Var.f12883n.f13526a).f13510a.setActive(true);
        }
        b2.y0 V = n1Var2.V();
        s1 R0 = n1Var2.R0();
        b2.e1 Q0 = n1Var2.Q0();
        b2.e1 Q02 = n1Var2.Q0();
        b2.z0 g10 = n1Var2.g();
        int m10 = n1Var2.m();
        boolean D0 = n1Var2.D0();
        b2 D = n1Var2.D();
        b2.o1 T0 = n1Var2.T0();
        if (n1Var2.n0(18)) {
            s0Var = n1Var2.h0();
        } else {
            s0Var = b2.s0.L;
        }
        b2.s0 s0Var2 = s0Var;
        if (n1Var2.n0(22)) {
            f7 = n1Var2.F();
        } else {
            f7 = 1.0f;
        }
        float f10 = f7;
        if (n1Var2.n0(21)) {
            fVar = n1Var2.H();
        } else {
            fVar = b2.f.f2027i;
        }
        b2.f fVar2 = fVar;
        if (n1Var2.n0(28)) {
            dVar = n1Var2.j0();
        } else {
            dVar = d2.d.d;
        }
        d2.d dVar2 = dVar;
        b2.q J = n1Var2.J();
        if (n1Var2.n0(23)) {
            i10 = n1Var2.l();
        }
        int i11 = i10;
        if (n1Var2.n0(23) && n1Var2.z0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = z10;
        boolean t10 = n1Var2.t();
        int w02 = n1Var2.w0();
        int h = n1Var2.h();
        boolean i02 = n1Var2.i0();
        boolean d = n1Var2.d();
        b2.s0 U0 = n1Var2.U0();
        long O0 = n1Var2.O0();
        long Y = n1Var2.Y();
        long y3 = n1Var2.y();
        if (n1Var2.n0(30)) {
            w1Var = n1Var2.g0();
        } else {
            w1Var = w1.f2380b;
        }
        this.f12753s = new l1(V, 0, R0, Q0, Q02, 0, g10, m10, D0, D, T0, 0, s0Var2, f10, 1.0f, fVar2, 0, dVar2, J, i11, z11, t10, 1, w02, h, i02, d, U0, O0, Y, y3, w1Var, n1Var2.E0());
        f(n1Var2.s());
    }

    public final void v() {
        if (Looper.myLooper() == this.f12746l.getLooper()) {
            return;
        }
        throw new IllegalStateException("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
    }
}
