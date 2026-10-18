package m4;

import ai.x9;
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
import b2.a2;
import b2.v1;
import ig.e2;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import v7.q8;
import v7.u6;
import v7.w6;
public class f0 {
    public static final s1 B = new s1(1);
    public static final d9.u C = w6.a(new a3.s(5));
    public final Bundle A;
    public final Object f16519a = new Object();
    public final Uri f16520b;
    public final c0 f16521c;
    public final b0 d;
    public final pb.a e;
    public final Context f16522f;
    public final i1 f16523g;
    public final p0 h;
    public final String f16524i;
    public final t1 f16525j;
    public final x f16526k;
    public final Handler f16527l;
    public final e2.d f16528m;
    public final y f16529n;
    public final Handler f16530o;
    public final boolean f16531p;
    public final boolean f16532q;
    public final e9.n0 f16533r;
    public k1 f16534s;
    public m1 f16535t;
    public d0 f16536u;
    public boolean v;
    public final long f16537w;
    public boolean f16538x;
    public final e9.n0 f16539y;
    public final e9.n0 f16540z;

    public f0(x xVar, Context context, String str, b2.f1 f1Var, e9.n0 n0Var, e9.n0 n0Var2, e9.n0 n0Var3, pb.a aVar, Bundle bundle, Bundle bundle2, e2.d dVar, boolean z10, boolean z11) {
        String str2 = str;
        e2.a.g("MediaSessionImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + e2.m0.f8255a + "]");
        this.f16526k = xVar;
        this.f16522f = context;
        this.f16524i = str2;
        this.f16539y = n0Var;
        this.f16540z = n0Var2;
        this.f16533r = n0Var3;
        this.e = aVar;
        this.A = bundle2;
        this.f16528m = dVar;
        this.f16531p = z10;
        this.f16532q = z11;
        i1 i1Var = new i1(this);
        this.f16523g = i1Var;
        this.f16530o = new Handler(Looper.getMainLooper());
        Looper A0 = f1Var.A0();
        Handler handler = new Handler(A0);
        this.f16527l = handler;
        this.f16534s = k1.H;
        this.f16521c = new c0(this, A0);
        this.d = new b0(this, A0);
        Uri build = new Uri.Builder().scheme("androidx").authority("media3.session").appendPath(str2 == null ? "" : str2).build();
        this.f16520b = build;
        p0 p0Var = new p0(this, build, handler, bundle, z10, n0Var, n0Var2, t.e, t.f16732f, bundle2);
        this.h = p0Var;
        this.f16525j = new t1(Process.myUid(), context.getPackageName(), i1Var, bundle, ((n4.n) p0Var.f16667m.f17128b).f17113c.f17125b);
        m1 m1Var = new m1(f1Var);
        this.f16535t = m1Var;
        e2.m0.W(handler, new hi.t(28, this, m1Var));
        this.f16537w = 3000L;
        this.f16529n = new y(this, 2);
        e2.m0.W(handler, new y(this, 3));
    }

    public static void a(f0 f0Var) {
        synchronized (f0Var.f16519a) {
            try {
                if (f0Var.v) {
                    return;
                }
                r1 R0 = f0Var.f16535t.R0();
                if (!f0Var.f16521c.hasMessages(1)) {
                    r1 r1Var = f0Var.f16534s.f16615c;
                    b2.e1 e1Var = R0.f16715a;
                    int i10 = e1Var.f3736b;
                    b2.e1 e1Var2 = r1Var.f16715a;
                    if (i10 == e1Var2.f3736b && e1Var.e == e1Var2.e && e1Var.h == e1Var2.h && e1Var.f3740i == e1Var2.f3740i) {
                        qi.e eVar = f0Var.f16523g.f16565b;
                        e9.n0 p5 = eVar.p();
                        for (int i11 = 0; i11 < p5.size(); i11++) {
                            v vVar = (v) p5.get(i11);
                            eVar.r(vVar);
                            f0Var.c(vVar, new a0(R0, eVar.x(vVar, 16), eVar.x(vVar, 17), vVar));
                        }
                        try {
                            f0Var.h.f16663i.f(0, R0, true, true, 0);
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

    public static boolean k(v vVar) {
        if (vVar != null && Objects.equals(vVar.f16759a.f17130a.f17131a, "com.android.systemui")) {
            return true;
        }
        return false;
    }

    public final boolean b(KeyEvent keyEvent, boolean z10, boolean z11) {
        e eVar;
        v e = this.f16526k.f16771a.e();
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
                                        eVar = new e(this, e, 6);
                                        break;
                                    case 87:
                                        break;
                                    case 88:
                                        break;
                                    case 89:
                                        eVar = new e(this, e, 5);
                                        break;
                                    case 90:
                                        eVar = new e(this, e, 4);
                                        break;
                                    default:
                                        return false;
                                }
                            }
                            eVar = new e(this, e, 3);
                        }
                        eVar = new e(this, e, 2);
                    } else {
                        eVar = new e(this, e, 1);
                    }
                } else {
                    eVar = new e(this, e, 9);
                }
                e2.m0.W(this.f16527l, new x9(this, z11, e, eVar, 7));
                return true;
            }
            if (this.f16535t.t()) {
                eVar = new e(this, e, 7);
            } else {
                eVar = new e(this, e, 8);
            }
            e2.m0.W(this.f16527l, new x9(this, z11, e, eVar, 7));
            return true;
        }
        return false;
    }

    public final void c(v vVar, e0 e0Var) {
        int i10;
        i1 i1Var = this.f16523g;
        try {
            com.google.android.gms.common.api.internal.u t10 = i1Var.f16565b.t(vVar);
            if (t10 != null) {
                i10 = t10.e();
            } else if (h(vVar)) {
                i10 = 0;
            } else {
                return;
            }
            u uVar = vVar.d;
            if (uVar != null) {
                e0Var.b(uVar, i10);
            }
        } catch (DeadObjectException unused) {
            i1Var.f16565b.E(vVar);
        } catch (RemoteException e) {
            e2.a.m("MediaSessionImpl", "Exception in " + vVar, e);
        }
    }

    public final void d(e0 e0Var) {
        e9.n0 p5 = this.f16523g.f16565b.p();
        for (int i10 = 0; i10 < p5.size(); i10++) {
            c((v) p5.get(i10), e0Var);
        }
        try {
            e0Var.b(this.h.f16663i, 0);
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final v e() {
        e9.n0 p5 = this.f16523g.f16565b.p();
        for (int i10 = 0; i10 < p5.size(); i10++) {
            v vVar = (v) p5.get(i10);
            if (i(vVar)) {
                return vVar;
            }
        }
        return null;
    }

    public final void f(b2.b1 b1Var) {
        this.f16521c.a(false, false);
        d(new j5.b(b1Var, 12));
        try {
            n0 n0Var = this.h.f16663i;
            b2.p pVar = this.f16534s.f16628s;
            n0Var.k();
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final void g(v vVar, boolean z10) {
        boolean z11;
        boolean z12;
        if (o()) {
            if (this.f16535t.o0(16) && this.f16535t.v() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!this.f16535t.o0(31) && !this.f16535t.o0(20)) {
                z12 = false;
            } else {
                z12 = true;
            }
            v s10 = s(vVar);
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            u6.p(!false);
            sparseBooleanArray.append(1, true);
            u6.p(!false);
            new b2.b1(new b2.u(sparseBooleanArray));
            if (!z11 && z12) {
                this.e.getClass();
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                ?? obj = new Object();
                obj.n(unsupportedOperationException);
                ?? obj2 = new Object();
                obj2.f2673c = this;
                obj2.f2672b = s10;
                obj2.f2671a = z10;
                obj.a(new j9.u(0, (Object) obj, (Object) obj2), new i2.f0(this, 2));
                return;
            }
            if (!z11) {
                e2.a.l("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
            }
            e2.m0.J(this.f16535t);
            if (z10) {
                p(s10);
            }
        }
    }

    public final boolean h(v vVar) {
        if (!this.f16523g.f16565b.w(vVar) && !this.h.f16661f.w(vVar)) {
            return false;
        }
        return true;
    }

    public final boolean i(v vVar) {
        if (!Objects.equals(vVar.f16759a.f17130a.f17131a, this.f16522f.getPackageName()) || vVar.f16760b == 0 || !new Bundle(vVar.e).getBoolean("androidx.media3.session.MediaNotificationManager", false)) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        boolean z10;
        synchronized (this.f16519a) {
            z10 = this.v;
        }
        return z10;
    }

    public final j9.y l(v vVar, List list) {
        s(vVar);
        this.e.getClass();
        return pb.a.p0(list);
    }

    public final t m(v vVar) {
        e9.n0 u10;
        e9.n0 n0Var;
        boolean z10 = this.f16538x;
        e9.n0 n0Var2 = null;
        p0 p0Var = this.h;
        if (z10 && k(vVar)) {
            p0Var.getClass();
            p1 p1Var = t.e;
            p1 p1Var2 = p0Var.f16676w;
            p1Var2.getClass();
            b2.b1 b1Var = p0Var.f16677x;
            b1Var.getClass();
            if (!p0Var.v.isEmpty()) {
                e9.n0 n0Var3 = p0Var.v;
                if (n0Var3 == null) {
                    n0Var = null;
                } else {
                    n0Var = e9.n0.u(n0Var3);
                }
            } else {
                e9.n0 n0Var4 = p0Var.f16675u;
                if (n0Var4 == null) {
                    u10 = null;
                } else {
                    u10 = e9.n0.u(n0Var4);
                }
                e9.n0 n0Var5 = u10;
                n0Var = null;
                n0Var2 = n0Var5;
            }
            return new t(p1Var2, b1Var, n0Var2, n0Var);
        }
        this.e.getClass();
        b2.b1 b1Var2 = t.f16732f;
        p1 p1Var3 = t.e;
        t tVar = new t(p1Var3, b1Var2, null, null);
        if (i(vVar)) {
            boolean z11 = true;
            this.f16538x = true;
            x xVar = this.f16526k;
            e9.n0 n0Var6 = xVar.f16771a.f16540z;
            if (n0Var6.isEmpty()) {
                p0Var.f16675u = xVar.f16771a.f16539y;
            } else {
                p0Var.v = n0Var6;
                p0Var.N();
            }
            f0 f0Var = p0Var.f16662g;
            if (p0Var.f16677x.a(17) == b1Var2.a(17)) {
                z11 = false;
            }
            p0Var.f16676w = p1Var3;
            p0Var.f16677x = b1Var2;
            if (!p0Var.v.isEmpty()) {
                p0Var.N();
            }
            if (z11) {
                e2.m0.W(f0Var.f16527l, new j0(p0Var, f0Var.f16535t, 0));
                return tVar;
            }
            p0Var.O(f0Var.f16535t);
        }
        return tVar;
    }

    public final j9.w n(v vVar) {
        s(vVar);
        this.e.getClass();
        return q8.b(new s1(-6));
    }

    public final boolean o() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                return ((Boolean) v7.h0.a(new j5.b(this, 11)).f4478b.get()).booleanValue();
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException(e);
            }
        }
        return true;
    }

    public final void p(v vVar) {
        s(vVar);
        this.e.getClass();
    }

    public final j9.e0 q(v vVar, List list, final int i10, final long j10) {
        s(vVar);
        this.e.getClass();
        return e2.m0.g0(pb.a.p0(list), new j9.q() {
            @Override
            public final j9.y apply(Object obj) {
                return q8.b(new w(j10, i10, (List) obj));
            }
        });
    }

    public final void r() {
        e2.a.g("MediaSessionImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + e2.m0.f8255a + "] [" + b2.p0.b() + "]");
        synchronized (this.f16519a) {
            try {
                if (this.v) {
                    return;
                }
                this.v = true;
                b0 b0Var = this.d;
                e2 e2Var = b0Var.f16485a;
                if (e2Var != null) {
                    b0Var.removeCallbacks(e2Var);
                    b0Var.f16485a = null;
                }
                this.f16527l.removeCallbacksAndMessages(null);
                try {
                    e2.m0.W(this.f16527l, new y(this, 0));
                } catch (Exception e) {
                    e2.a.m("MediaSessionImpl", "Exception thrown while closing", e);
                }
                p0 p0Var = this.h;
                ComponentName componentName = p0Var.f16669o;
                f0 f0Var = p0Var.f16662g;
                n4.s sVar = p0Var.f16667m;
                int i10 = Build.VERSION.SDK_INT;
                int i11 = 0;
                if (i10 < 31) {
                    if (componentName == null) {
                        ((n4.n) sVar.f17128b).f17111a.setMediaButtonReceiver(null);
                    } else {
                        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", f0Var.f16520b);
                        intent.setComponent(componentName);
                        ((n4.n) sVar.f17128b).f17111a.setMediaButtonReceiver(PendingIntent.getBroadcast(f0Var.f16522f, 0, intent, p0.f16660y));
                    }
                }
                androidx.mediarouter.app.f fVar = p0Var.f16668n;
                if (fVar != null) {
                    f0Var.f16522f.unregisterReceiver(fVar);
                }
                b bVar = p0Var.f16666l;
                if (bVar != null && !bVar.f16484f.getAndSet(true)) {
                    bVar.f16483c.execute(new a(bVar, 0));
                }
                n4.n nVar = (n4.n) sVar.f17128b;
                MediaSession mediaSession = nVar.f17111a;
                nVar.f17114f.kill();
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
                nVar.f17112b.f17110a.clear();
                mediaSession.release();
                i1 i1Var = this.f16523g;
                Set<v> set = i1Var.f16566c;
                qi.e eVar = i1Var.f16565b;
                e9.n0 p5 = eVar.p();
                int size = p5.size();
                while (i11 < size) {
                    Object obj = p5.get(i11);
                    i11++;
                    v vVar = (v) obj;
                    eVar.E(vVar);
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
                i1Var.f16564a.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final v s(v vVar) {
        v e;
        if (this.f16538x && k(vVar) && (e = e()) != null) {
            return e;
        }
        return vVar;
    }

    public final void t() {
        Handler handler = this.f16527l;
        y yVar = this.f16529n;
        handler.removeCallbacks(yVar);
        if (this.f16532q) {
            long j10 = this.f16537w;
            if (j10 > 0) {
                if (this.f16535t.j0() || this.f16535t.c()) {
                    handler.postDelayed(yVar, j10);
                }
            }
        }
    }

    public final void u(m1 m1Var, m1 m1Var2) {
        b2.r0 r0Var;
        float f7;
        b2.f fVar;
        d2.c cVar;
        boolean z10;
        v1 v1Var;
        p0 p0Var = this.h;
        this.f16535t = m1Var2;
        if (m1Var != null) {
            d0 d0Var = this.f16536u;
            d0Var.getClass();
            m1Var.C(d0Var);
        }
        d0 d0Var2 = new d0(this, m1Var2);
        m1Var2.p0(d0Var2);
        this.f16536u = d0Var2;
        int i10 = 0;
        try {
            p0Var.f16663i.m(0, m1Var, m1Var2);
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
        if (m1Var == null) {
            ((n4.n) p0Var.f16667m.f17128b).f17111a.setActive(true);
        }
        b2.y0 W = m1Var2.W();
        r1 R0 = m1Var2.R0();
        b2.e1 Q0 = m1Var2.Q0();
        b2.e1 Q02 = m1Var2.Q0();
        b2.z0 h = m1Var2.h();
        int l4 = m1Var2.l();
        boolean D0 = m1Var2.D0();
        a2 D = m1Var2.D();
        b2.o1 T0 = m1Var2.T0();
        if (m1Var2.o0(18)) {
            r0Var = m1Var2.i0();
        } else {
            r0Var = b2.r0.L;
        }
        b2.r0 r0Var2 = r0Var;
        if (m1Var2.o0(22)) {
            f7 = m1Var2.F();
        } else {
            f7 = 1.0f;
        }
        float f10 = f7;
        if (m1Var2.o0(21)) {
            fVar = m1Var2.H();
        } else {
            fVar = b2.f.f3741i;
        }
        b2.f fVar2 = fVar;
        if (m1Var2.o0(28)) {
            cVar = m1Var2.k0();
        } else {
            cVar = d2.c.d;
        }
        d2.c cVar2 = cVar;
        b2.p J = m1Var2.J();
        if (m1Var2.o0(23)) {
            i10 = m1Var2.m();
        }
        int i11 = i10;
        if (m1Var2.o0(23) && m1Var2.z0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = z10;
        boolean t10 = m1Var2.t();
        int w02 = m1Var2.w0();
        int d = m1Var2.d();
        boolean j02 = m1Var2.j0();
        boolean c10 = m1Var2.c();
        b2.r0 U0 = m1Var2.U0();
        long O0 = m1Var2.O0();
        long Z = m1Var2.Z();
        long y3 = m1Var2.y();
        if (m1Var2.o0(30)) {
            v1Var = m1Var2.h0();
        } else {
            v1Var = v1.f4089b;
        }
        this.f16534s = new k1(W, 0, R0, Q0, Q02, 0, h, l4, D0, D, T0, 0, r0Var2, f10, 1.0f, fVar2, 0, cVar2, J, i11, z11, t10, 1, w02, d, j02, c10, U0, O0, Z, y3, v1Var, m1Var2.E0());
        f(m1Var2.s());
    }

    public final void v() {
        if (Looper.myLooper() == this.f16527l.getLooper()) {
            return;
        }
        throw new IllegalStateException("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
    }
}
