package n4;

import a3.i0;
import ab.a0;
import ab.c0;
import ah.h0;
import ai.u2;
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
import c5.g0;
import c6.e0;
import ci.g4;
import ci.p4;
import ci.y9;
import ci.z9;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.play_billing.c4;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.m3;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.q3;
import com.google.android.gms.internal.play_billing.w3;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.internal.play_billing.y3;
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
import ki.b4;
import ki.c6;
import ki.h1;
import ki.j3;
import ki.j4;
import ki.t3;
import ki.u3;
import ki.v3;
import m.s3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.ri;
import p4.t0;
import r0.l0;
import si.o0;
import v7.q8;
public final class s implements ee.b, g0, com.google.android.gms.common.api.internal.r, d9.k, g6.n, ef.b, z3.m, c3.i, u3, e2.d {
    public final int f17187a;
    public Object f17188b;
    public Object f17189c;

    public s(int i10, Object obj, Object obj2) {
        this.f17187a = i10;
        this.f17188b = obj;
        this.f17189c = obj2;
    }

    public static void h(s sVar, i2.d dVar) {
        sVar.getClass();
        for (Map.Entry entry : new HashMap((HashMap) sVar.f17188b).entrySet()) {
            if (entry.getKey() == null) {
                List list = (List) entry.getValue();
                if (!l(dVar, list).equals(l((i2.d) sVar.f17189c, list))) {
                    throw null;
                }
            } else {
                throw new ClassCastException();
            }
        }
        sVar.f17189c = dVar;
    }

    public static i2.d l(i2.d dVar, List list) {
        dVar.getClass();
        Map map = dVar.f12364a;
        HashMap hashMap = new HashMap(map);
        HashSet hashSet = new HashSet(list);
        for (String str : map.keySet()) {
            if (!hashSet.contains(str)) {
                hashMap.remove(str);
            }
        }
        return new i2.d(hashMap);
    }

    public void A(boolean z10, boolean z11, float f7) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f17188b;
        g4 g4Var = (g4) this.f17189c;
        z9 z9Var = g4Var.e;
        z9.B1 = f7;
        y9 y9Var = z9Var.f6276z0;
        if (y9Var != null) {
            y9Var.setSpeed(f7);
        }
        p4.Z(g4Var.f5359l, z10);
        if (z11 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
        }
    }

    public void B(Object obj) {
        Handler handler = (Handler) this.f17188b;
        if (handler != null) {
            handler.post(new i0(this, obj, SystemClock.elapsedRealtime(), 0));
        }
    }

    @Override
    public void C(c6 c6Var, String str) {
        ki.q qVar = (ki.q) this.f17189c;
        if (qVar.v == null) {
            g6 g6Var = (g6) this.f17188b;
            qVar.v = new s3(new h0(22, this, g6Var), g6Var);
        }
        qVar.v.f(c6Var, str);
    }

    public void D(l lVar, Handler handler) {
        n nVar = (n) this.f17188b;
        synchronized (nVar.d) {
            nVar.f17179l = lVar;
            nVar.f17171a.setCallback(lVar.f17167b, handler);
            lVar.C(nVar, handler);
        }
    }

    @Override
    public ef.a E(qf.b bVar) {
        int i10;
        List list = (List) this.f17189c;
        List list2 = (List) bVar.f44863b;
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
        return new gd.i(bVar, (List) this.f17188b, list);
    }

    public void F(y yVar) {
        n nVar = (n) this.f17188b;
        nVar.f17175g = yVar;
        synchronized (nVar.d) {
            for (int beginBroadcast = nVar.f17174f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((b) nVar.f17174f.getBroadcastItem(beginBroadcast)).t(yVar);
                } catch (RemoteException | SecurityException e) {
                    e2.a.d("MediaSessionCompat", "Dead object in setPlaybackState.", e);
                }
            }
            nVar.f17174f.finishBroadcast();
        }
        MediaSession mediaSession = nVar.f17171a;
        if (yVar.f17207w == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(yVar.f17200a, yVar.f17201b, yVar.d, yVar.f17204n);
            builder.setBufferedPosition(yVar.f17202c);
            builder.setActions(yVar.e);
            builder.setErrorMessage(yVar.h);
            for (x xVar : yVar.f17205r) {
                xVar.getClass();
                PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(xVar.f17197a, xVar.f17198b, xVar.f17199c);
                builder2.setExtras(xVar.d);
                PlaybackState.CustomAction build = builder2.build();
                if (build != null) {
                    builder.addCustomAction(build);
                }
            }
            builder.setActiveQueueItemId(yVar.f17206s);
            builder.setExtras(yVar.v);
            yVar.f17207w = builder.build();
        }
        mediaSession.setPlaybackState(yVar.f17207w);
    }

    public void G(c5.p pVar) {
        this.f17188b = pVar;
        if (pVar.a() != null) {
            pVar.a().getClass();
            String str = pVar.a().d;
            if (str != null) {
                this.f17189c = str;
            }
        }
    }

    public void H(ArrayList arrayList) {
        f2.t tVar;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((f2.s) arrayList.get(i10)).f10355a == 1) {
                try {
                    tVar = new f2.t((f2.s) arrayList.get(i10));
                } catch (f2.r unused) {
                    tVar = null;
                }
                this.f17189c = tVar;
            }
        }
    }

    public void I(a2 a2Var) {
        Handler handler = (Handler) this.f17188b;
        if (handler != null) {
            handler.post(new a1.f(4, this, a2Var));
        }
    }

    @Override
    public void J() {
        b4 b4Var = ((ki.q) this.f17189c).f15509s;
        if (b4Var != null) {
            int i10 = 0;
            b4Var.e(false, true);
            int i11 = b4Var.f15194b0;
            if (i11 != 2) {
                i10 = i11;
            }
            b4Var.g(i10, true);
        }
    }

    public void K(g3 g3Var) {
        try {
            T(g3Var, (q3) this.f17188b);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void L(g3 g3Var, int i10, long j10) {
        try {
            p3 p3Var = (p3) ((q3) this.f17188b).g();
            p3Var.c();
            q3.p((q3) p3Var.f7233b, i10);
            q3 q3Var = (q3) p3Var.a();
            this.f17188b = q3Var;
            if (j10 != 0) {
                p3 p3Var2 = (p3) q3Var.g();
                p3Var2.c();
                q3.r((q3) p3Var2.f7233b, j10);
                q3Var = (q3) p3Var2.a();
            }
            T(g3Var, q3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public h80 M(View view) {
        ki.q qVar = (ki.q) this.f17189c;
        h80 h80Var = new h80(qVar, (g6) this.f17188b, view, false, false, true);
        qVar.H = h80Var;
        return h80Var;
    }

    public void N(g3 g3Var, long j10, boolean z10) {
        q3 q3Var;
        try {
            f3 f3Var = (f3) g3Var.g();
            com.google.android.gms.internal.play_billing.u3 u3Var = (com.google.android.gms.internal.play_billing.u3) g3Var.o().g();
            u3Var.c();
            w3.n((w3) u3Var.f7233b, z10);
            f3Var.c();
            g3.r((g3) f3Var.f7233b, (w3) u3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j10 == 0) {
                q3Var = (q3) this.f17188b;
            } else {
                p3 p3Var = (p3) ((q3) this.f17188b).g();
                p3Var.c();
                q3.r((q3) p3Var.f7233b, j10);
                q3Var = (q3) p3Var.a();
            }
            T(g3Var2, q3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void O(g3 g3Var, int i10, long j10, boolean z10) {
        q3 q3Var;
        try {
            p3 p3Var = (p3) ((q3) this.f17188b).g();
            p3Var.c();
            q3.p((q3) p3Var.f7233b, i10);
            this.f17188b = (q3) p3Var.a();
            f3 f3Var = (f3) g3Var.g();
            com.google.android.gms.internal.play_billing.u3 u3Var = (com.google.android.gms.internal.play_billing.u3) g3Var.o().g();
            u3Var.c();
            w3.n((w3) u3Var.f7233b, z10);
            f3Var.c();
            g3.r((g3) f3Var.f7233b, (w3) u3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j10 == 0) {
                q3Var = (q3) this.f17188b;
            } else {
                p3 p3Var2 = (p3) ((q3) this.f17188b).g();
                p3Var2.c();
                q3.r((q3) p3Var2.f7233b, j10);
                q3Var = (q3) p3Var2.a();
            }
            T(g3Var2, q3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void P() {
        ki.q qVar = (ki.q) this.f17189c;
        qVar.a0();
        qVar.b0();
    }

    public void Q(m3 m3Var) {
        try {
            x3 t10 = y3.t();
            t10.d((q3) this.f17188b);
            t10.c();
            y3.p((y3) t10.f7233b, m3Var);
            ((b2.t) this.f17189c).i((y3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void R(com.google.android.gms.internal.play_billing.b4 b4Var) {
        try {
            x3 t10 = y3.t();
            t10.d((q3) this.f17188b);
            t10.c();
            y3.r((y3) t10.f7233b, b4Var);
            ((b2.t) this.f17189c).i((y3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void S(c4 c4Var) {
        if (c4Var == null) {
            return;
        }
        try {
            x3 t10 = y3.t();
            t10.d((q3) this.f17188b);
            t10.c();
            y3.s((y3) t10.f7233b, c4Var);
            ((b2.t) this.f17189c).i((y3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void T(g3 g3Var, q3 q3Var) {
        if (g3Var == null) {
            return;
        }
        try {
            x3 t10 = y3.t();
            t10.d(q3Var);
            t10.c();
            y3.n((y3) t10.f7233b, g3Var);
            ((b2.t) this.f17189c).i((y3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void U(i3 i3Var, q3 q3Var) {
        try {
            x3 t10 = y3.t();
            t10.d(q3Var);
            t10.c();
            y3.o((y3) t10.f7233b, i3Var);
            ((b2.t) this.f17189c).i((y3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void V(v3 v3Var, View view) {
        ki.q qVar = (ki.q) this.f17189c;
        h80 h80Var = new h80(qVar, (g6) this.f17188b, view, false, false, true);
        h80Var.Q = true;
        o2 o2Var = qVar.f27704b.f30146f0;
        qVar.getContext();
        qVar.H = j4.b(h80Var, o2Var, v3Var, true);
    }

    @Override
    public z3.d a(int i10, int i11, byte[] bArr) {
        return o0.a(this, bArr, i11);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        boolean z10;
        e0 e0Var = (e0) this.f17188b;
        String str = (String) this.f17189c;
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
        synchronized (e0Var.f4849s) {
            try {
                if (e0Var.f4846p != null) {
                    taskCompletionSource.setException(n6.l.m(new Status(2001, null, null, null)));
                } else {
                    e0Var.f4846p = taskCompletionSource;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public Object apply(Object obj) {
        return ((d9.k) ((a4.l) this.f17188b).f279b).apply(obj);
    }

    @Override
    public c3.h b(c3.r rVar, long j10) {
        long position = rVar.getPosition();
        int min = (int) Math.min(20000L, rVar.getLength() - position);
        e2.x xVar = (e2.x) this.f17189c;
        xVar.K(min);
        rVar.a(0, min, xVar.f8298a);
        int i10 = -1;
        int i11 = -1;
        long j11 = -9223372036854775807L;
        while (xVar.a() >= 4) {
            if (h3.a.a(xVar.f8299b, xVar.f8298a) != 442) {
                xVar.O(1);
            } else {
                xVar.O(4);
                long c10 = j4.x.c(xVar);
                if (c10 != -9223372036854775807L) {
                    long b10 = ((k0) this.f17188b).b(c10);
                    if (b10 > j10) {
                        if (j11 == -9223372036854775807L) {
                            return new c3.h(-1, b10, position);
                        }
                        return new c3.h(0, -9223372036854775807L, position + i11);
                    } else if (b10 + 100000 > j10) {
                        return new c3.h(0, -9223372036854775807L, position + xVar.f8299b);
                    } else {
                        j11 = b10;
                        i11 = xVar.f8299b;
                    }
                }
                int i12 = xVar.f8300c;
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
                            if (h3.a.a(xVar.f8299b, xVar.f8298a) == 443) {
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
                                int a2 = h3.a.a(xVar.f8299b, xVar.f8298a);
                                if (a2 == 442 || a2 == 441 || (a2 >>> 8) != 1) {
                                    break;
                                }
                                xVar.O(4);
                                if (xVar.a() < 2) {
                                    xVar.N(i12);
                                    break;
                                }
                                xVar.N(Math.min(xVar.f8300c, xVar.f8299b + xVar.H()));
                            }
                        }
                    }
                }
                i10 = xVar.f8299b;
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
    public void d() {
        e2.x xVar = (e2.x) this.f17189c;
        byte[] bArr = m0.f8260b;
        xVar.getClass();
        xVar.L(bArr.length, bArr);
    }

    @Override
    public boolean e(float r6) {
        throw new UnsupportedOperationException("Method not decompiled: n4.s.e(float):boolean");
    }

    @Override
    public void f(byte[] r19, int r20, int r21, z3.l r22, e2.j r23) {
        throw new UnsupportedOperationException("Method not decompiled: n4.s.f(byte[], int, int, z3.l, e2.j):void");
    }

    @Override
    public j9.y g(r0 r0Var) {
        j9.y g10 = ((e2.d) this.f17188b).g(r0Var);
        if (g10 == null) {
            return null;
        }
        return q8.c(g10, new j5.b(this, 17));
    }

    @Override
    public void i(ki.a aVar) {
        ki.q qVar = (ki.q) this.f17189c;
        ri riVar = qVar.f27704b;
        o2 o2Var = riVar.f30146f0;
        if (o2Var != null && aVar != null && (aVar.f15141b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(o2Var)) {
            ri riVar2 = new ri(qVar.getContext(), riVar.f30146f0, false, false, false, null);
            riVar2.f30138c2 = new t7.u(11);
            riVar2.P = true;
            riVar2.A1.setVisibility(8);
            riVar2.f30212z2 = new u2(qVar, aVar, riVar2, 11);
            riVar2.w1();
            riVar2.show();
        }
    }

    @Override
    public void j(String str, long j10, long j11, long j12) {
        g6.n nVar = (g6.n) this.f17188b;
        if (nVar != null) {
            nVar.j(str, j10, j11, j12);
        }
    }

    public c5.e k() {
        if (((c5.p) this.f17188b) != null) {
            return new c5.e(this);
        }
        throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
    }

    @Override
    public void m(int i10) {
        ki.q.R((ki.q) this.f17189c, 74, i10);
    }

    @Override
    public void n(t3 t3Var, View view) {
        ki.q qVar = (ki.q) this.f17189c;
        h80 h80Var = new h80(qVar, (g6) this.f17188b, view, false, false, true);
        h80Var.Q = true;
        qVar.H = j4.c(h80Var, qVar.f27704b.f30146f0, qVar.getContext(), (g6) this.f17188b, t3Var, true);
    }

    @Override
    public void o(h1 h1Var, boolean z10) {
        ((ki.q) this.f17189c).f27704b.z1(h1Var, z10);
    }

    @Override
    public void onContentChanged() {
        ki.q qVar = (ki.q) this.f17189c;
        b4 b4Var = qVar.f15509s;
        if (b4Var != null) {
            b4Var.setSendLoading(qVar.f15508r.s3());
        }
        qVar.Y(true);
        qVar.b0();
        ki.d dVar = qVar.P;
        AndroidUtilities.cancelRunOnUIThread(dVar);
        AndroidUtilities.runOnUIThread(dVar, 1000L);
    }

    @Override
    public void p() {
        int i10;
        ki.q qVar = (ki.q) this.f17189c;
        ki.w3 w3Var = qVar.f15508r;
        b4 b4Var = qVar.f15509s;
        if (b4Var != null) {
            j3 j3Var = w3Var.f15667o3;
            if (j3Var != null && j3Var.x() && w3Var.I4()) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (b4Var.f15192a0 == 2) {
                b4Var.f15194b0 = i10;
            } else {
                b4Var.g(i10, true);
            }
            if (i10 != 0) {
                qVar.Z();
            }
        }
        qVar.c0();
    }

    @Override
    public Object q(ee.c cVar, md.c cVar2) {
        Object q6 = ((qf.b) this.f17188b).q(new a0(cVar, (c0) this.f17189c), cVar2);
        if (q6 == ld.a.f16062a) {
            return q6;
        }
        return id.i.f12807a;
    }

    public void r(i2.e eVar) {
        synchronized (eVar) {
        }
        Handler handler = (Handler) this.f17188b;
        if (handler != null) {
            handler.post(new a3.k0(this, eVar, 1));
        }
    }

    @Override
    public void s() {
        b4 b4Var = ((ki.q) this.f17189c).f15509s;
        if (b4Var != null) {
            int i10 = b4Var.f15192a0;
            if (i10 == 2) {
                i10 = 0;
            }
            b4Var.f15194b0 = i10;
            b4Var.e(false, false);
            b4Var.g(2, true);
        }
    }

    @Override
    public void t(String str, long j10, int i10, Object obj, long j11, long j12) {
        int i11;
        g6.m mVar = (g6.m) this.f17189c;
        if (((g6.n) this.f17188b) != null) {
            if (i10 == 2001) {
                Object[] objArr = {Integer.valueOf(mVar.f10872i)};
                g6.b bVar = mVar.f10891a;
                Log.w(bVar.f10861a, bVar.d("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", objArr));
                Iterator it = ((e6.h) mVar.h.f50563b).f8381i.iterator();
                while (it.hasNext()) {
                    ((e6.g) it.next()).o();
                }
                i11 = 2001;
            } else {
                i11 = i10;
            }
            ((g6.n) this.f17188b).t(str, j10, i11, obj, j11, j12);
        }
    }

    public String toString() {
        switch (this.f17187a) {
            case 15:
                try {
                    if (((ec.b) this.f17189c) == null) {
                        this.f17189c = ((ec.e) this.f17188b).a();
                    }
                    return ((ec.b) this.f17189c).toString();
                } catch (dc.e unused) {
                    return "";
                }
            default:
                return super.toString();
        }
    }

    public synchronized Map u() {
        try {
            if (((Map) this.f17189c) == null) {
                this.f17189c = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.f17188b));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Map) this.f17189c;
    }

    @Override
    public j9.y v(byte[] bArr) {
        return q8.c(((e2.d) this.f17188b).v(bArr), new j5.b(this, 17));
    }

    public void w(k.a aVar) {
        qi.e eVar = (qi.e) this.f17188b;
        ((ActionMode.Callback) eVar.f45175a).onDestroyActionMode(eVar.n(aVar));
        g.r rVar = (g.r) this.f17189c;
        if (rVar.E != null) {
            rVar.f10727f.getDecorView().removeCallbacks(rVar.F);
        }
        if (rVar.f10743y != null) {
            l0 l0Var = rVar.G;
            if (l0Var != null) {
                l0Var.b();
            }
            l0 a2 = r0.i0.a(rVar.f10743y);
            a2.a(0.0f);
            rVar.G = a2;
            a2.d(new g.i(this, 2));
        }
        rVar.f10742x = null;
        ViewGroup viewGroup = rVar.J;
        WeakHashMap weakHashMap = r0.i0.f45241a;
        r0.y.c(viewGroup);
        rVar.y();
    }

    public boolean x(k.a aVar, Menu menu) {
        ViewGroup viewGroup = ((g.r) this.f17189c).J;
        WeakHashMap weakHashMap = r0.i0.f45241a;
        r0.y.c(viewGroup);
        qi.e eVar = (qi.e) this.f17188b;
        ActionMode.Callback callback = (ActionMode.Callback) eVar.f45175a;
        k.e n10 = eVar.n(aVar);
        a0.l lVar = (a0.l) eVar.d;
        Menu menu2 = (Menu) lVar.get(menu);
        if (menu2 == null) {
            menu2 = new l.a0((Context) eVar.f45176b, (l.k) menu);
            lVar.put(menu, menu2);
        }
        return callback.onPrepareActionMode(n10, menu2);
    }

    @Override
    public void y() {
        ki.q qVar = (ki.q) this.f17189c;
        if (qVar.getCurrentItemTop() != qVar.I) {
            qVar.f27704b.f2(qVar, 0);
        }
        qVar.d0();
        ki.q.N(qVar);
    }

    @Override
    public void z(int i10) {
        ki.q qVar = (ki.q) this.f17189c;
        qVar.f27704b.f2(qVar, i10);
        qVar.d0();
        ki.q.N(qVar);
    }

    public s(int i10, Object obj, boolean z10) {
        this.f17187a = i10;
        this.f17188b = obj;
    }

    public s(int i10, boolean z10) {
        this.f17187a = i10;
    }

    public s(Object obj, int i10) {
        this.f17187a = i10;
        this.f17188b = obj;
        this.f17189c = null;
    }

    public s(Object obj, Object obj2, boolean z10, int i10) {
        this.f17187a = i10;
        this.f17189c = obj;
        this.f17188b = obj2;
    }

    public s(Context context, q3 q3Var) {
        this.f17187a = 10;
        b2.t tVar = new b2.t(1);
        try {
            l5.t.b(context);
            tVar.f4013c = l5.t.a().c(j5.a.e).a("PLAY_BILLING_LIBRARY", new i5.c("proto"), new sb.a(4));
        } catch (Throwable unused) {
            tVar.f4012b = true;
        }
        this.f17189c = tVar;
        this.f17188b = q3Var;
    }

    public s(IBinder iBinder) {
        this.f17187a = 25;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (interfaceDescriptor != "android.os.IMessenger" && (interfaceDescriptor == null || !interfaceDescriptor.equals("android.os.IMessenger"))) {
            if (interfaceDescriptor != "com.google.android.gms.iid.IMessengerCompat" && (interfaceDescriptor == null || !interfaceDescriptor.equals("com.google.android.gms.iid.IMessengerCompat"))) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.f17189c = new j6.f(iBinder);
            this.f17188b = null;
            return;
        }
        this.f17188b = new Messenger(iBinder);
        this.f17189c = null;
    }

    public s(m6.a aVar) {
        this.f17187a = 17;
        this.f17188b = aVar == null ? null : aVar.f16857b;
    }

    @Override
    public void reset() {
    }

    public s(k0 k0Var) {
        this.f17187a = 24;
        this.f17188b = k0Var;
        this.f17189c = new e2.x();
    }

    public s(int i10) {
        this.f17187a = i10;
        switch (i10) {
            case 14:
                this.f17188b = new ConcurrentHashMap(16, 0.75f, 10);
                this.f17189c = new ReferenceQueue();
                return;
            case 19:
                this.f17188b = new HashMap();
                return;
            case 22:
                this.f17188b = new HashMap();
                this.f17189c = i2.d.f12363b;
                return;
            case 23:
                this.f17188b = new e2.x();
                this.f17189c = new i4.a();
                return;
            default:
                this.f17188b = ByteBuffer.allocateDirect(500);
                return;
        }
    }

    public s(Handler handler, a3.m0 m0Var) {
        this.f17187a = 2;
        if (m0Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f17188b = handler;
        this.f17189c = m0Var;
    }

    public s(Animator animator) {
        this.f17187a = 6;
        this.f17188b = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f17189c = animatorSet;
        animatorSet.play(animator);
    }

    public s(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this.f17187a = 0;
        if (!TextUtils.isEmpty(str)) {
            if (componentName == null) {
                int i10 = t0.f44622b;
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
                this.f17188b = new n(context, str, bundle);
            } else if (i11 >= 28) {
                this.f17188b = new n(context, str, bundle);
            } else {
                this.f17188b = new n(context, str, bundle);
            }
            Looper myLooper = Looper.myLooper();
            D(new l(), new Handler(myLooper == null ? Looper.getMainLooper() : myLooper));
            ((n) this.f17188b).f17171a.setMediaButtonReceiver(pendingIntent);
            r rVar = ((n) this.f17188b).f17173c;
            ?? obj = new Object();
            DesugarCollections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                obj.f17196a = new f(context, rVar);
            } else {
                obj.f17196a = new f(context, rVar);
            }
            this.f17189c = obj;
            return;
        }
        throw new IllegalArgumentException("tag must not be null or empty");
    }
}
