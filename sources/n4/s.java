package n4;

import ab.c0;
import ah.h0;
import ai.s2;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import b2.a2;
import b2.r0;
import c5.f0;
import c6.e0;
import ci.aa;
import ci.h4;
import ci.q4;
import ci.z9;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.play_billing.a4;
import com.google.android.gms.internal.play_billing.b4;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.o3;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.t3;
import com.google.android.gms.internal.play_billing.w3;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.k0;
import e2.m0;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.ReferenceQueue;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import ki.c6;
import ki.h1;
import ki.j3;
import ki.j4;
import ki.t1;
import ki.u3;
import ki.v3;
import l.a0;
import m.s3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.ti;
import p4.u0;
import r0.i0;
import r0.l0;
import v7.q8;
public final class s implements ee.b, f0, com.google.android.gms.common.api.internal.r, d9.k, g6.n, ef.b, z3.m, c3.i, u3, e2.d, n5.b {
    public final int f17120a;
    public Object f17121b;
    public Object f17122c;

    public s(int i10, Object obj, Object obj2) {
        this.f17120a = i10;
        this.f17121b = obj;
        this.f17122c = obj2;
    }

    public static void i(s sVar, i2.c cVar) {
        sVar.getClass();
        for (Map.Entry entry : new HashMap((HashMap) sVar.f17121b).entrySet()) {
            if (entry.getKey() == null) {
                List list = (List) entry.getValue();
                if (!k(cVar, list).equals(k((i2.c) sVar.f17122c, list))) {
                    throw null;
                }
            } else {
                throw new ClassCastException();
            }
        }
        sVar.f17122c = cVar;
    }

    public static i2.c k(i2.c cVar, List list) {
        cVar.getClass();
        Map map = cVar.f12329a;
        HashMap hashMap = new HashMap(map);
        HashSet hashSet = new HashSet(list);
        for (String str : map.keySet()) {
            if (!hashSet.contains(str)) {
                hashMap.remove(str);
            }
        }
        return new i2.c(hashMap);
    }

    public synchronized Map A() {
        try {
            if (((Map) this.f17122c) == null) {
                this.f17122c = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.f17121b));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Map) this.f17122c;
    }

    public void B(k.a aVar) {
        qi.e eVar = (qi.e) this.f17121b;
        ((ActionMode.Callback) eVar.f44777a).onDestroyActionMode(eVar.n(aVar));
        g.r rVar = (g.r) this.f17122c;
        if (rVar.E != null) {
            rVar.f10709f.getDecorView().removeCallbacks(rVar.F);
        }
        if (rVar.f10725y != null) {
            l0 l0Var = rVar.G;
            if (l0Var != null) {
                l0Var.b();
            }
            l0 a2 = i0.a(rVar.f10725y);
            a2.a(0.0f);
            rVar.G = a2;
            a2.d(new g.i(this, 2));
        }
        rVar.f10724x = null;
        ViewGroup viewGroup = rVar.J;
        WeakHashMap weakHashMap = i0.f44844a;
        r0.y.c(viewGroup);
        rVar.y();
    }

    @Override
    public i80 C(View view) {
        ki.q qVar = (ki.q) this.f17122c;
        i80 i80Var = new i80(qVar, (d6) this.f17121b, view, false, false, true);
        qVar.H = i80Var;
        return i80Var;
    }

    public boolean D(k.a aVar, Menu menu) {
        ViewGroup viewGroup = ((g.r) this.f17122c).J;
        WeakHashMap weakHashMap = i0.f44844a;
        r0.y.c(viewGroup);
        qi.e eVar = (qi.e) this.f17121b;
        ActionMode.Callback callback = (ActionMode.Callback) eVar.f44777a;
        k.e n10 = eVar.n(aVar);
        a0.l lVar = (a0.l) eVar.d;
        Menu menu2 = (Menu) lVar.get(menu);
        if (menu2 == null) {
            menu2 = new a0((Context) eVar.f44778b, (l.k) menu);
            lVar.put(menu, menu2);
        }
        return callback.onPrepareActionMode(n10, menu2);
    }

    @Override
    public void E() {
        ki.q qVar = (ki.q) this.f17122c;
        qVar.a0();
        qVar.b0();
    }

    public void F(boolean z10, boolean z11, float f7) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f17121b;
        h4 h4Var = (h4) this.f17122c;
        aa aaVar = h4Var.e;
        aa.B1 = f7;
        z9 z9Var = aaVar.f5232z0;
        if (z9Var != null) {
            z9Var.setSpeed(f7);
        }
        q4.a0(h4Var.f5463l, z10);
        if (z11 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
        }
    }

    public void G(Object obj) {
        Handler handler = (Handler) this.f17121b;
        if (handler != null) {
            handler.post(new a3.i0(this, obj, SystemClock.elapsedRealtime(), 0));
        }
    }

    @Override
    public void H(v3 v3Var, View view) {
        ki.q qVar = (ki.q) this.f17122c;
        i80 i80Var = new i80(qVar, (d6) this.f17121b, view, false, false, true);
        i80Var.Q = true;
        n2 n2Var = qVar.f28238b.f30574f0;
        qVar.getContext();
        qVar.H = j4.b(i80Var, n2Var, v3Var, true);
    }

    public void I(l lVar, Handler handler) {
        n nVar = (n) this.f17121b;
        synchronized (nVar.d) {
            nVar.f17112l = lVar;
            nVar.f17104a.setCallback(lVar.f17100b, handler);
            lVar.C(nVar, handler);
        }
    }

    public void J(y yVar) {
        n nVar = (n) this.f17121b;
        nVar.f17108g = yVar;
        synchronized (nVar.d) {
            for (int beginBroadcast = nVar.f17107f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((b) nVar.f17107f.getBroadcastItem(beginBroadcast)).t(yVar);
                } catch (RemoteException | SecurityException e) {
                    e2.a.d("MediaSessionCompat", "Dead object in setPlaybackState.", e);
                }
            }
            nVar.f17107f.finishBroadcast();
        }
        MediaSession mediaSession = nVar.f17104a;
        if (yVar.f17140w == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(yVar.f17133a, yVar.f17134b, yVar.d, yVar.f17137n);
            builder.setBufferedPosition(yVar.f17135c);
            builder.setActions(yVar.e);
            builder.setErrorMessage(yVar.h);
            for (x xVar : yVar.f17138r) {
                xVar.getClass();
                PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(xVar.f17130a, xVar.f17131b, xVar.f17132c);
                builder2.setExtras(xVar.d);
                PlaybackState.CustomAction build = builder2.build();
                if (build != null) {
                    builder.addCustomAction(build);
                }
            }
            builder.setActiveQueueItemId(yVar.f17139s);
            builder.setExtras(yVar.v);
            yVar.f17140w = builder.build();
        }
        mediaSession.setPlaybackState(yVar.f17140w);
    }

    public void K(c5.o oVar) {
        this.f17121b = oVar;
        if (oVar.a() != null) {
            oVar.a().getClass();
            String str = oVar.a().d;
            if (str != null) {
                this.f17122c = str;
            }
        }
    }

    public void L(ArrayList arrayList) {
        f2.t tVar;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((f2.s) arrayList.get(i10)).f10339a == 1) {
                try {
                    tVar = new f2.t((f2.s) arrayList.get(i10));
                } catch (f2.r unused) {
                    tVar = null;
                }
                this.f17122c = tVar;
            }
        }
    }

    public void M(a2 a2Var) {
        Handler handler = (Handler) this.f17121b;
        if (handler != null) {
            handler.post(new a1.f(4, this, a2Var));
        }
    }

    public void N(g3 g3Var) {
        try {
            U(g3Var, (p3) this.f17121b);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void O(g3 g3Var, int i10, long j10) {
        try {
            o3 o3Var = (o3) ((p3) this.f17121b).g();
            o3Var.c();
            p3.p((p3) o3Var.f7223b, i10);
            p3 p3Var = (p3) o3Var.a();
            this.f17121b = p3Var;
            if (j10 != 0) {
                o3 o3Var2 = (o3) p3Var.g();
                o3Var2.c();
                p3.r((p3) o3Var2.f7223b, j10);
                p3Var = (p3) o3Var2.a();
            }
            U(g3Var, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void P(g3 g3Var, long j10, boolean z10) {
        p3 p3Var;
        try {
            f3 f3Var = (f3) g3Var.g();
            t3 t3Var = (t3) g3Var.o().g();
            t3Var.c();
            com.google.android.gms.internal.play_billing.v3.n((com.google.android.gms.internal.play_billing.v3) t3Var.f7223b, z10);
            f3Var.c();
            g3.r((g3) f3Var.f7223b, (com.google.android.gms.internal.play_billing.v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j10 == 0) {
                p3Var = (p3) this.f17121b;
            } else {
                o3 o3Var = (o3) ((p3) this.f17121b).g();
                o3Var.c();
                p3.r((p3) o3Var.f7223b, j10);
                p3Var = (p3) o3Var.a();
            }
            U(g3Var2, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void Q(g3 g3Var, int i10, long j10, boolean z10) {
        p3 p3Var;
        try {
            o3 o3Var = (o3) ((p3) this.f17121b).g();
            o3Var.c();
            p3.p((p3) o3Var.f7223b, i10);
            this.f17121b = (p3) o3Var.a();
            f3 f3Var = (f3) g3Var.g();
            t3 t3Var = (t3) g3Var.o().g();
            t3Var.c();
            com.google.android.gms.internal.play_billing.v3.n((com.google.android.gms.internal.play_billing.v3) t3Var.f7223b, z10);
            f3Var.c();
            g3.r((g3) f3Var.f7223b, (com.google.android.gms.internal.play_billing.v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j10 == 0) {
                p3Var = (p3) this.f17121b;
            } else {
                o3 o3Var2 = (o3) ((p3) this.f17121b).g();
                o3Var2.c();
                p3.r((p3) o3Var2.f7223b, j10);
                p3Var = (p3) o3Var2.a();
            }
            U(g3Var2, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void R(l3 l3Var) {
        try {
            w3 t10 = x3.t();
            t10.d((p3) this.f17121b);
            t10.c();
            x3.p((x3) t10.f7223b, l3Var);
            ((b2.t) this.f17122c).i((x3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void S(a4 a4Var) {
        try {
            w3 t10 = x3.t();
            t10.d((p3) this.f17121b);
            t10.c();
            x3.r((x3) t10.f7223b, a4Var);
            ((b2.t) this.f17122c).i((x3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void T(b4 b4Var) {
        if (b4Var == null) {
            return;
        }
        try {
            w3 t10 = x3.t();
            t10.d((p3) this.f17121b);
            t10.c();
            x3.s((x3) t10.f7223b, b4Var);
            ((b2.t) this.f17122c).i((x3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void U(g3 g3Var, p3 p3Var) {
        if (g3Var == null) {
            return;
        }
        try {
            w3 t10 = x3.t();
            t10.d(p3Var);
            t10.c();
            x3.n((x3) t10.f7223b, g3Var);
            ((b2.t) this.f17122c).i((x3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void V(i3 i3Var, p3 p3Var) {
        try {
            w3 t10 = x3.t();
            t10.d(p3Var);
            t10.c();
            x3.o((x3) t10.f7223b, i3Var);
            ((b2.t) this.f17122c).i((x3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public z3.d a(int i10, int i11, byte[] bArr) {
        return r.c.a(this, bArr, i11);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        boolean z10;
        e0 e0Var = (e0) this.f17121b;
        String str = (String) this.f17122c;
        g6.w wVar = (g6.w) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        if (e0Var.F == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        n6.l.j("Not connected to device", z10);
        g6.f fVar = (g6.f) wVar.u();
        Parcel N0 = fVar.N0();
        N0.writeString(str);
        fVar.S0(N0, 5);
        synchronized (e0Var.f4846s) {
            try {
                if (e0Var.f4843p != null) {
                    taskCompletionSource.setException(n6.l.m(new Status(2001, null, null, null)));
                } else {
                    e0Var.f4843p = taskCompletionSource;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public Object apply(Object obj) {
        return ((d9.k) ((ag.b) this.f17121b).f634b).apply(obj);
    }

    @Override
    public c3.h b(c3.p pVar, long j10) {
        long position = pVar.getPosition();
        int min = (int) Math.min(20000L, pVar.getLength() - position);
        e2.x xVar = (e2.x) this.f17122c;
        xVar.K(min);
        pVar.b(0, min, xVar.f8293a);
        int i10 = -1;
        int i11 = -1;
        long j11 = -9223372036854775807L;
        while (xVar.a() >= 4) {
            if (h3.a.a(xVar.f8294b, xVar.f8293a) != 442) {
                xVar.O(1);
            } else {
                xVar.O(4);
                long c10 = j4.x.c(xVar);
                if (c10 != -9223372036854775807L) {
                    long b10 = ((k0) this.f17121b).b(c10);
                    if (b10 > j10) {
                        if (j11 == -9223372036854775807L) {
                            return new c3.h(-1, b10, position);
                        }
                        return new c3.h(0, -9223372036854775807L, position + i11);
                    } else if (b10 + 100000 > j10) {
                        return new c3.h(0, -9223372036854775807L, position + xVar.f8294b);
                    } else {
                        j11 = b10;
                        i11 = xVar.f8294b;
                    }
                }
                int i12 = xVar.f8295c;
                if (xVar.a() < 10) {
                    xVar.N(i12);
                } else {
                    xVar.O(9);
                    int A = xVar.A() & 7;
                    if (xVar.a() < A) {
                        xVar.N(i12);
                    } else {
                        xVar.O(A);
                        if (xVar.a() < 4) {
                            xVar.N(i12);
                        } else {
                            if (h3.a.a(xVar.f8294b, xVar.f8293a) == 443) {
                                xVar.O(4);
                                int H = xVar.H();
                                if (xVar.a() < H) {
                                    xVar.N(i12);
                                } else {
                                    xVar.O(H);
                                }
                            }
                            while (true) {
                                if (xVar.a() < 4) {
                                    break;
                                }
                                int a2 = h3.a.a(xVar.f8294b, xVar.f8293a);
                                if (a2 == 442 || a2 == 441 || (a2 >>> 8) != 1) {
                                    break;
                                }
                                xVar.O(4);
                                if (xVar.a() < 2) {
                                    xVar.N(i12);
                                    break;
                                }
                                xVar.N(Math.min(xVar.f8295c, xVar.f8294b + xVar.H()));
                            }
                        }
                    }
                }
                i10 = xVar.f8294b;
            }
        }
        if (j11 != -9223372036854775807L) {
            return new c3.h(-2, j11, position + i10);
        }
        return c3.h.d;
    }

    @Override
    public int c() {
        return 1;
    }

    @Override
    public boolean d(float r6) {
        throw new UnsupportedOperationException("Method not decompiled: n4.s.d(float):boolean");
    }

    @Override
    public j9.y e(r0 r0Var) {
        j9.y e = ((e2.d) this.f17121b).e(r0Var);
        if (e == null) {
            return null;
        }
        return q8.c(e, new j5.b(this, 17));
    }

    @Override
    public void f() {
        e2.x xVar = (e2.x) this.f17122c;
        byte[] bArr = m0.f8255b;
        xVar.getClass();
        xVar.L(bArr.length, bArr);
    }

    @Override
    public void g(byte[] r19, int r20, int r21, z3.l r22, e2.j r23) {
        throw new UnsupportedOperationException("Method not decompiled: n4.s.g(byte[], int, int, z3.l, e2.j):void");
    }

    @Override
    public Object mo27get() {
        return new m5.d((Context) ((k0.b) this.f17121b).f14559b, (m.g3) ((t1) this.f17122c).mo27get());
    }

    @Override
    public void h(ki.a aVar) {
        ki.q qVar = (ki.q) this.f17122c;
        ti tiVar = qVar.f28238b;
        n2 n2Var = tiVar.f30574f0;
        if (n2Var != null && aVar != null && (aVar.f15089b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(n2Var)) {
            ti tiVar2 = new ti(qVar.getContext(), tiVar.f30574f0, false, false, false, null);
            tiVar2.f30566c2 = new t7.u(11);
            tiVar2.P = true;
            tiVar2.A1.setVisibility(8);
            tiVar2.f30629w2 = new s2(qVar, aVar, tiVar2, 11);
            tiVar2.t1();
            tiVar2.show();
        }
    }

    public c5.e j() {
        if (((c5.o) this.f17121b) != null) {
            return new c5.e(this);
        }
        throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
    }

    @Override
    public void l(int i10) {
        ki.q.R((ki.q) this.f17122c, 74, i10);
    }

    @Override
    public void m(ki.t3 t3Var, View view) {
        ki.q qVar = (ki.q) this.f17122c;
        i80 i80Var = new i80(qVar, (d6) this.f17121b, view, false, false, true);
        i80Var.Q = true;
        qVar.H = j4.c(i80Var, qVar.f28238b.f30574f0, qVar.getContext(), (d6) this.f17121b, t3Var, true);
    }

    @Override
    public void n(h1 h1Var, boolean z10) {
        ((ki.q) this.f17122c).f28238b.w1(h1Var, z10);
    }

    @Override
    public void o() {
        int i10;
        ki.q qVar = (ki.q) this.f17122c;
        ki.w3 w3Var = qVar.f15442r;
        ki.b4 b4Var = qVar.f15443s;
        if (b4Var != null) {
            j3 j3Var = w3Var.f15598l3;
            if (j3Var != null && j3Var.x() && w3Var.D4()) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (b4Var.f15140a0 == 2) {
                b4Var.f15142b0 = i10;
            } else {
                b4Var.f(i10, true);
            }
            if (i10 != 0) {
                qVar.Z();
            }
        }
        qVar.c0();
    }

    @Override
    public void onContentChanged() {
        ki.q qVar = (ki.q) this.f17122c;
        ki.b4 b4Var = qVar.f15443s;
        if (b4Var != null) {
            b4Var.setSendLoading(qVar.f15442r.n3());
        }
        qVar.Y(true);
        qVar.b0();
        ki.d dVar = qVar.P;
        AndroidUtilities.cancelRunOnUIThread(dVar);
        AndroidUtilities.runOnUIThread(dVar, 1000L);
    }

    @Override
    public void p(String str, long j10, long j11, long j12) {
        g6.n nVar = (g6.n) this.f17121b;
        if (nVar != null) {
            nVar.p(str, j10, j11, j12);
        }
    }

    @Override
    public void q() {
        ki.b4 b4Var = ((ki.q) this.f17122c).f15443s;
        if (b4Var != null) {
            int i10 = b4Var.f15140a0;
            if (i10 == 2) {
                i10 = 0;
            }
            b4Var.f15142b0 = i10;
            b4Var.e(false, false);
            b4Var.f(2, true);
        }
    }

    @Override
    public Object r(ee.c cVar, md.c cVar2) {
        Object r10 = ((qf.b) this.f17121b).r(new ab.a0(cVar, (c0) this.f17122c), cVar2);
        if (r10 == ld.a.f15993a) {
            return r10;
        }
        return id.i.f12779a;
    }

    public void s(i2.d dVar) {
        synchronized (dVar) {
        }
        Handler handler = (Handler) this.f17121b;
        if (handler != null) {
            handler.post(new a3.k0(this, dVar, 1));
        }
    }

    @Override
    public void t(String str, long j10, int i10, Object obj, long j11, long j12) {
        int i11;
        g6.m mVar = (g6.m) this.f17122c;
        if (((g6.n) this.f17121b) != null) {
            if (i10 == 2001) {
                Object[] objArr = {Integer.valueOf(mVar.f10854i)};
                g6.b bVar = mVar.f10873a;
                Log.w(bVar.f10843a, bVar.d("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", objArr));
                Iterator it = ((e6.h) mVar.h.f50136b).f8376i.iterator();
                while (it.hasNext()) {
                    ((e6.g) it.next()).o();
                }
                i11 = 2001;
            } else {
                i11 = i10;
            }
            ((g6.n) this.f17121b).t(str, j10, i11, obj, j11, j12);
        }
    }

    public String toString() {
        switch (this.f17120a) {
            case 15:
                try {
                    if (((ec.b) this.f17122c) == null) {
                        this.f17122c = ((ec.e) this.f17121b).a();
                    }
                    return ((ec.b) this.f17122c).toString();
                } catch (dc.e unused) {
                    return "";
                }
            default:
                return super.toString();
        }
    }

    @Override
    public void u() {
        ki.q qVar = (ki.q) this.f17122c;
        if (qVar.getCurrentItemTop() != qVar.I) {
            qVar.f28238b.b2(qVar, 0);
        }
        qVar.d0();
        ki.q.N(qVar);
    }

    @Override
    public j9.y v(byte[] bArr) {
        return q8.c(((e2.d) this.f17121b).v(bArr), new j5.b(this, 17));
    }

    @Override
    public void w(int i10) {
        ki.q qVar = (ki.q) this.f17122c;
        qVar.f28238b.b2(qVar, i10);
        qVar.d0();
        ki.q.N(qVar);
    }

    @Override
    public void x(c6 c6Var, String str) {
        ki.q qVar = (ki.q) this.f17122c;
        if (qVar.v == null) {
            d6 d6Var = (d6) this.f17121b;
            qVar.v = new s3(new h0(21, this, d6Var), d6Var);
        }
        qVar.v.f(c6Var, str);
    }

    @Override
    public ef.a y(qf.b bVar) {
        int i10;
        List list = (List) this.f17122c;
        List list2 = (List) bVar.f44465b;
        if (list2 != null) {
            i10 = list2.size();
        } else {
            i10 = 0;
        }
        if (i10 > 0) {
            ArrayList arrayList = new ArrayList(list.size() + i10);
            arrayList.addAll(list);
            arrayList.addAll(list2);
            list = arrayList;
        }
        return new gd.i(bVar, (List) this.f17121b, list);
    }

    @Override
    public void z() {
        ki.b4 b4Var = ((ki.q) this.f17122c).f15443s;
        if (b4Var != null) {
            int i10 = 0;
            b4Var.e(false, true);
            int i11 = b4Var.f15142b0;
            if (i11 != 2) {
                i10 = i11;
            }
            b4Var.f(i10, true);
        }
    }

    public s(int i10, Object obj, boolean z10) {
        this.f17120a = i10;
        this.f17121b = obj;
    }

    public s(int i10, boolean z10) {
        this.f17120a = i10;
    }

    public s(Object obj, int i10) {
        this.f17120a = i10;
        this.f17121b = obj;
        this.f17122c = null;
    }

    public s(Object obj, Object obj2, boolean z10, int i10) {
        this.f17120a = i10;
        this.f17122c = obj;
        this.f17121b = obj2;
    }

    public s(Context context, p3 p3Var) {
        this.f17120a = 10;
        b2.t tVar = new b2.t(1);
        try {
            l5.t.b(context);
            tVar.f4009c = l5.t.a().c(j5.a.e).a("PLAY_BILLING_LIBRARY", new i5.c("proto"), new sb.a(4));
        } catch (Throwable unused) {
            tVar.f4008b = true;
        }
        this.f17122c = tVar;
        this.f17121b = p3Var;
    }

    public s(IBinder iBinder) {
        this.f17120a = 25;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (interfaceDescriptor != "android.os.IMessenger" && (interfaceDescriptor == null || !interfaceDescriptor.equals("android.os.IMessenger"))) {
            if (interfaceDescriptor != "com.google.android.gms.iid.IMessengerCompat" && (interfaceDescriptor == null || !interfaceDescriptor.equals("com.google.android.gms.iid.IMessengerCompat"))) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.f17122c = new j6.f(iBinder);
            this.f17121b = null;
            return;
        }
        this.f17121b = new Messenger(iBinder);
        this.f17122c = null;
    }

    public s(m6.a aVar) {
        this.f17120a = 17;
        this.f17121b = aVar == null ? null : aVar.f16788b;
    }

    @Override
    public void reset() {
    }

    public s(k0 k0Var) {
        this.f17120a = 24;
        this.f17121b = k0Var;
        this.f17122c = new e2.x();
    }

    public s(int i10) {
        this.f17120a = i10;
        switch (i10) {
            case 14:
                this.f17121b = new ConcurrentHashMap(16, 0.75f, 10);
                this.f17122c = new ReferenceQueue();
                return;
            case 19:
                this.f17121b = new HashMap();
                return;
            case 22:
                this.f17121b = new HashMap();
                this.f17122c = i2.c.f12328b;
                return;
            case 23:
                this.f17121b = new e2.x();
                this.f17122c = new i4.a();
                return;
            default:
                this.f17121b = ByteBuffer.allocateDirect(500);
                return;
        }
    }

    public s(Handler handler, a3.m0 m0Var) {
        this.f17120a = 2;
        if (m0Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f17121b = handler;
        this.f17122c = m0Var;
    }

    public s(Animator animator) {
        this.f17120a = 6;
        this.f17121b = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f17122c = animatorSet;
        animatorSet.play(animator);
    }

    public s(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this.f17120a = 0;
        if (!TextUtils.isEmpty(str)) {
            if (componentName == null) {
                int i10 = u0.f44227b;
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setPackage(context.getPackageName());
                List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
                if (queryBroadcastReceivers.size() == 1) {
                    ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
                    componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                } else {
                    if (queryBroadcastReceivers.size() > 1) {
                        e2.a.l("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
                    }
                    componentName = null;
                }
                if (componentName == null) {
                    e2.a.g("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
                }
            }
            if (componentName != null && pendingIntent == null) {
                Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                intent2.setComponent(componentName);
                pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 29) {
                this.f17121b = new n(context, str, bundle);
            } else if (i11 >= 28) {
                this.f17121b = new n(context, str, bundle);
            } else {
                this.f17121b = new n(context, str, bundle);
            }
            Looper myLooper = Looper.myLooper();
            I(new l(), new Handler(myLooper == null ? Looper.getMainLooper() : myLooper));
            ((n) this.f17121b).f17104a.setMediaButtonReceiver(pendingIntent);
            r rVar = ((n) this.f17121b).f17106c;
            ?? obj = new Object();
            DesugarCollections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                obj.f17129a = new f(context, rVar);
            } else {
                obj.f17129a = new f(context, rVar);
            }
            this.f17122c = obj;
            return;
        }
        throw new IllegalArgumentException("tag must not be null or empty");
    }
}
