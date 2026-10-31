package n4;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import b2.s0;
import bi.a4;
import bi.b4;
import bi.c4;
import bi.d4;
import bi.i4;
import bi.n1;
import bi.q3;
import bi.q6;
import bi.t0;
import bi.t4;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.l0;
import ig.b1;
import ig.c0;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import j9.y;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Constructor;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import l.b0;
import m.p3;
import org.telegram.messenger.i0;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.z60;
import org.telegram.ui.er0;
import org.telegram.ui.qo0;
import r0.h0;
import r0.k0;
import v7.p8;
public final class q implements OnCompleteListener, b4, d9.k, f6.a, fa.a, g6.n, z3.m, c3.i, b1, e2.d {
    public Object f13526a;
    public Object f13527b;

    public q(Object obj) {
        this.f13526a = obj;
        this.f13527b = null;
    }

    public static String I(q qVar) {
        Collection<String> collection = (Collection) qVar.f13527b;
        StringBuilder sb2 = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) qVar.f13526a;
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            if (upperCase.matches("[A-F0-9]+")) {
                sb2.append("/");
                sb2.append(upperCase);
            } else {
                throw new IllegalArgumentException("Invalid application ID: ".concat(str));
            }
        }
        if (collection != null) {
            if (!collection.isEmpty()) {
                if (str == null) {
                    sb2.append("/");
                }
                sb2.append("/");
                boolean z10 = true;
                for (String str2 : collection) {
                    g6.a.b(str2);
                    if (!z10) {
                        sb2.append(",");
                    }
                    if (!g6.a.f7365a.matcher(str2).matches()) {
                        StringBuilder sb3 = new StringBuilder(str2.length());
                        for (int i10 = 0; i10 < str2.length(); i10++) {
                            char charAt = str2.charAt(i10);
                            if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && ((charAt < '0' || charAt > '9') && charAt != '_' && charAt != '-' && charAt != '.' && charAt != ':'))) {
                                sb3.append(String.format("%%%04x", Integer.valueOf(charAt)));
                            } else {
                                sb3.append(charAt);
                            }
                        }
                        str2 = sb3.toString();
                    }
                    sb2.append(str2);
                    z10 = false;
                }
            } else {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
        }
        if (str == null && collection == null) {
            sb2.append("/");
        }
        if (collection == null) {
            sb2.append("/");
        }
        sb2.append("//ALLOW_IPV6");
        return sb2.toString();
    }

    public static void f(q qVar, i2.c cVar) {
        qVar.getClass();
        for (Map.Entry entry : new HashMap((HashMap) qVar.f13526a).entrySet()) {
            if (entry.getKey() == null) {
                List list = (List) entry.getValue();
                if (!i(cVar, list).equals(i((i2.c) qVar.f13527b, list))) {
                    throw null;
                }
            } else {
                throw new ClassCastException();
            }
        }
        qVar.f13527b = cVar;
    }

    public static i2.c i(i2.c cVar, List list) {
        cVar.getClass();
        Map map = cVar.f7820a;
        HashMap hashMap = new HashMap(map);
        HashSet hashSet = new HashSet(list);
        for (String str : map.keySet()) {
            if (!hashSet.contains(str)) {
                hashMap.remove(str);
            }
        }
        return new i2.c(hashMap);
    }

    @Override
    public void A() {
        bi.t tVar = (bi.t) this.f13527b;
        if (tVar.getCurrentItemTop() != tVar.I) {
            tVar.f30947b.L1(tVar, 0);
        }
        tVar.d0();
        bi.t.N(tVar);
    }

    public void B(k.a aVar) {
        xa.n nVar = (xa.n) this.f13526a;
        ((ActionMode.Callback) nVar.f53554a).onDestroyActionMode(nVar.v(aVar));
        g.r rVar = (g.r) this.f13527b;
        if (rVar.E != null) {
            rVar.f7228f.getDecorView().removeCallbacks(rVar.F);
        }
        if (rVar.D != null) {
            k0 k0Var = rVar.G;
            if (k0Var != null) {
                k0Var.b();
            }
            k0 a2 = h0.a(rVar.D);
            a2.a(0.0f);
            rVar.G = a2;
            a2.d(new g.i(this, 2));
        }
        rVar.f7244y = null;
        ViewGroup viewGroup = rVar.J;
        WeakHashMap weakHashMap = h0.f46123a;
        r0.x.c(viewGroup);
        rVar.y();
    }

    public boolean C(k.a aVar, Menu menu) {
        ViewGroup viewGroup = ((g.r) this.f13527b).J;
        WeakHashMap weakHashMap = h0.f46123a;
        r0.x.c(viewGroup);
        xa.n nVar = (xa.n) this.f13526a;
        ActionMode.Callback callback = (ActionMode.Callback) nVar.f53554a;
        k.e v = nVar.v(aVar);
        a0.l lVar = (a0.l) nVar.d;
        Menu menu2 = (Menu) lVar.get(menu);
        if (menu2 == null) {
            menu2 = new b0((Context) nVar.f53555b, (l.l) menu);
            lVar.put(menu, menu2);
        }
        return callback.onPrepareActionMode(v, menu2);
    }

    @Override
    public void D(q6 q6Var, String str) {
        bi.t tVar = (bi.t) this.f13527b;
        if (tVar.f3352w == null) {
            p6 p6Var = (p6) this.f13526a;
            tVar.f3352w = new p3(new ag.m(3, this, p6Var), p6Var);
        }
        tVar.f3352w.g(q6Var, str);
    }

    @Override
    public void E(int i10) {
        bi.t tVar = (bi.t) this.f13527b;
        tVar.f30947b.L1(tVar, i10);
        tVar.d0();
        bi.t.N(tVar);
    }

    public void F(android.support.v4.media.session.s sVar, Handler handler) {
        l lVar = (l) this.f13526a;
        synchronized (lVar.d) {
            lVar.f13518l = sVar;
            lVar.f13510a.setCallback((android.support.v4.media.session.r) sVar.e, handler);
            sVar.d0(lVar, handler);
        }
    }

    public void G(int i10) {
        try {
            i8.f fVar = (i8.f) this.f13526a;
            Parcel P0 = fVar.P0();
            P0.writeInt(i10);
            fVar.T0(P0, 16);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void H(w wVar) {
        l lVar = (l) this.f13526a;
        lVar.f13514g = wVar;
        synchronized (lVar.d) {
            for (int beginBroadcast = lVar.f13513f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((b) lVar.f13513f.getBroadcastItem(beginBroadcast)).u(wVar);
                } catch (RemoteException | SecurityException e) {
                    e2.a.d("MediaSessionCompat", "Dead object in setPlaybackState.", e);
                }
            }
            lVar.f13513f.finishBroadcast();
        }
        MediaSession mediaSession = lVar.f13510a;
        if (wVar.f13546x == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(wVar.f13538a, wVar.f13539b, wVar.d, wVar.f13542n);
            builder.setBufferedPosition(wVar.f13540c);
            builder.setActions(wVar.e);
            builder.setErrorMessage(wVar.h);
            for (v vVar : wVar.f13543r) {
                vVar.getClass();
                PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(vVar.f13535a, vVar.f13536b, vVar.f13537c);
                builder2.setExtras(vVar.d);
                PlaybackState.CustomAction build = builder2.build();
                if (build != null) {
                    builder.addCustomAction(build);
                }
            }
            builder.setActiveQueueItemId(wVar.f13544s);
            builder.setExtras(wVar.f13545w);
            wVar.f13546x = builder.build();
        }
        mediaSession.setPlaybackState(wVar.f13546x);
    }

    @Override
    public void N(c4 c4Var, View view) {
        bi.t tVar = (bi.t) this.f13527b;
        z60 z60Var = new z60(tVar, (p6) this.f13526a, view, false, false, true);
        z60Var.Q = true;
        k2 k2Var = tVar.f30947b.W1;
        tVar.getContext();
        tVar.H = t4.b(z60Var, k2Var, c4Var, true);
    }

    @Override
    public void T() {
        i4 i4Var = ((bi.t) this.f13527b).f3351s;
        if (i4Var != null) {
            int i10 = 0;
            i4Var.e(false, true);
            int i11 = i4Var.f3078b0;
            if (i11 != 2) {
                i10 = i11;
            }
            i4Var.g(i10, true);
        }
    }

    @Override
    public z60 U(View view) {
        bi.t tVar = (bi.t) this.f13527b;
        z60 z60Var = new z60(tVar, (p6) this.f13526a, view, false, false, true);
        tVar.H = z60Var;
        return z60Var;
    }

    @Override
    public void Z() {
        bi.t tVar = (bi.t) this.f13527b;
        tVar.a0();
        tVar.b0();
    }

    @Override
    public y a(s0 s0Var) {
        y a2 = ((e2.d) this.f13526a).a(s0Var);
        if (a2 == null) {
            return null;
        }
        return p8.c(a2, new c0(this, 25));
    }

    @Override
    public Object apply(Object obj) {
        return ((d9.k) ((a4.l) this.f13526a).f279b).apply(obj);
    }

    @Override
    public c3.h b(c3.p pVar, long j10) {
        long position = pVar.getPosition();
        int min = (int) Math.min(20000L, pVar.getLength() - position);
        e2.x xVar = (e2.x) this.f13527b;
        xVar.K(min);
        pVar.b(0, min, xVar.f6207a);
        int i10 = -1;
        int i11 = -1;
        long j11 = -9223372036854775807L;
        while (xVar.a() >= 4) {
            if (h3.a.a(xVar.f6208b, xVar.f6207a) != 442) {
                xVar.O(1);
            } else {
                xVar.O(4);
                long c10 = j4.y.c(xVar);
                if (c10 != -9223372036854775807L) {
                    long b10 = ((e2.k0) this.f13526a).b(c10);
                    if (b10 > j10) {
                        if (j11 == -9223372036854775807L) {
                            return new c3.h(b10, -1, position);
                        }
                        return new c3.h(-9223372036854775807L, 0, position + i11);
                    } else if (b10 + 100000 > j10) {
                        return new c3.h(-9223372036854775807L, 0, position + xVar.f6208b);
                    } else {
                        j11 = b10;
                        i11 = xVar.f6208b;
                    }
                }
                int i12 = xVar.f6209c;
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
                            if (h3.a.a(xVar.f6208b, xVar.f6207a) == 443) {
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
                                int a2 = h3.a.a(xVar.f6208b, xVar.f6207a);
                                if (a2 == 442 || a2 == 441 || (a2 >>> 8) != 1) {
                                    break;
                                }
                                xVar.O(4);
                                if (xVar.a() < 2) {
                                    xVar.N(i12);
                                    break;
                                }
                                xVar.N(Math.min(xVar.f6209c, xVar.f6208b + xVar.H()));
                            }
                        }
                    }
                }
                i10 = xVar.f6208b;
            }
        }
        if (j11 != -9223372036854775807L) {
            return new c3.h(j11, -2, position + i10);
        }
        return c3.h.d;
    }

    @Override
    public boolean c(float r6) {
        throw new UnsupportedOperationException("Method not decompiled: n4.q.c(float):boolean");
    }

    @Override
    public void d() {
        ((qo0) this.f13526a).run();
    }

    @Override
    public void d0(bi.a aVar) {
        bi.t tVar = (bi.t) this.f13527b;
        bi biVar = tVar.f30947b;
        k2 k2Var = biVar.W1;
        if (k2Var != null && aVar != null && (aVar.f2818b instanceof TL_iv.pageBlockMap) && i0.J1(k2Var)) {
            bi biVar2 = new bi(tVar.getContext(), biVar.W1, false, false, false, null);
            biVar2.T3 = new kb.a(3);
            biVar2.G1 = true;
            biVar2.f24718r3.setVisibility(8);
            biVar2.f24715q4 = new androidx.car.app.utils.a(tVar, aVar, biVar2, 2);
            biVar2.d1();
            biVar2.show();
        }
    }

    @Override
    public void e() {
        e2.x xVar = (e2.x) this.f13527b;
        byte[] bArr = l0.f6166b;
        xVar.getClass();
        xVar.L(bArr.length, bArr);
    }

    @Override
    public void g() {
        t0 t0Var = ((er0) this.f13527b).G0;
        if (t0Var != null) {
            t0Var.invalidate();
        }
    }

    @Override
    public void h(n1 n1Var, boolean z10) {
        ((bi.t) this.f13527b).f30947b.g1(n1Var, z10);
    }

    @Override
    public StackTraceElement[] h0(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        fa.a[] aVarArr = (fa.a[]) this.f13526a;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i10 = 0; i10 < 1; i10++) {
            fa.a aVar = aVarArr[i10];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = aVar.h0(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > 1024) {
            return ((hb.a) this.f13527b).h0(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }

    @Override
    public void j() {
        er0 er0Var = (er0) this.f13527b;
        if (er0Var.T0) {
            er0Var.T0 = false;
            return;
        }
        er0Var.f10165c1.b(1);
        er0Var.z((ig.h) ig.h.f8315a.get(0));
    }

    @Override
    public boolean k() {
        boolean z10;
        er0 er0Var = (er0) this.f13527b;
        if (er0Var.B0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            er0Var.q0(null, true);
        }
        return z10;
    }

    @Override
    public z3.d l(int i10, int i11, byte[] bArr) {
        return sc.e.a(this, bArr, i11);
    }

    public c3.o m(Object... objArr) {
        Constructor a2;
        synchronized (((AtomicBoolean) this.f13527b)) {
            if (!((AtomicBoolean) this.f13527b).get()) {
                try {
                    a2 = ((aa.a) this.f13526a).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f13527b).set(true);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            a2 = null;
        }
        if (a2 == null) {
            return null;
        }
        try {
            return (c3.o) a2.newInstance(objArr);
        } catch (Exception e7) {
            throw new IllegalStateException("Unexpected error creating extractor", e7);
        }
    }

    @Override
    public void n() {
        er0 er0Var = (er0) this.f13527b;
        er0Var.f10180o0.f8469a.B();
        er0Var.U0.setViewHidden(false);
    }

    @Override
    public int o() {
        return 1;
    }

    @Override
    public void onComplete(Task task) {
        a9.e eVar = (a9.e) this.f13526a;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f13527b;
        synchronized (eVar.f328f) {
            eVar.e.remove(taskCompletionSource);
        }
    }

    @Override
    public void onContentChanged() {
        bi.t tVar = (bi.t) this.f13527b;
        i4 i4Var = tVar.f3351s;
        if (i4Var != null) {
            i4Var.setSendLoading(tVar.f3350r.p3());
        }
        tVar.Y(true);
        tVar.b0();
        bi.f fVar = tVar.P;
        i0.r(fVar);
        i0.h3(fVar, 1000L);
    }

    @Override
    public void p(int i10) {
        bi.t.R((bi.t) this.f13527b, 74, i10);
    }

    @Override
    public void q(Bitmap bitmap) {
        hf.b bVar = (hf.b) this.f13526a;
        bVar.f7658c = bitmap;
        f6.g gVar = (f6.g) this.f13527b;
        gVar.f6932l = bVar;
        gVar.b();
    }

    @Override
    public void r() {
        int i10;
        bi.t tVar = (bi.t) this.f13527b;
        d4 d4Var = tVar.f3350r;
        i4 i4Var = tVar.f3351s;
        if (i4Var != null) {
            q3 q3Var = d4Var.f2950u3;
            if (q3Var != null && q3Var.x() && d4Var.F4()) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (i4Var.f3076a0 == 2) {
                i4Var.f3078b0 = i10;
            } else {
                i4Var.g(i10, true);
            }
            if (i10 != 0) {
                tVar.Z();
            }
        }
        tVar.c0();
    }

    @Override
    public void s(String str, long j10, long j11, long j12) {
        g6.n nVar = (g6.n) this.f13526a;
        if (nVar != null) {
            nVar.s(str, j10, j11, j12);
        }
    }

    @Override
    public void t() {
        er0 er0Var = (er0) this.f13527b;
        if (er0Var.B0 != null) {
            er0Var.q0(null, true);
        }
        er0Var.U0.setViewHidden(true);
    }

    @Override
    public void u() {
        i4 i4Var = ((bi.t) this.f13527b).f3351s;
        if (i4Var != null) {
            int i10 = i4Var.f3076a0;
            if (i10 == 2) {
                i10 = 0;
            }
            i4Var.f3078b0 = i10;
            i4Var.e(false, false);
            i4Var.g(2, true);
        }
    }

    @Override
    public void v(a4 a4Var, View view) {
        bi.t tVar = (bi.t) this.f13527b;
        z60 z60Var = new z60(tVar, (p6) this.f13526a, view, false, false, true);
        z60Var.Q = true;
        tVar.H = t4.c(z60Var, tVar.f30947b.W1, tVar.getContext(), (p6) this.f13526a, a4Var, true);
    }

    @Override
    public y w(byte[] bArr) {
        return p8.c(((e2.d) this.f13526a).w(bArr), new c0(this, 25));
    }

    public synchronized Map x() {
        try {
            if (((Map) this.f13527b) == null) {
                this.f13527b = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.f13526a));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Map) this.f13527b;
    }

    @Override
    public void y(String str, long j10, int i10, Object obj, long j11, long j12) {
        int i11;
        g6.m mVar = (g6.m) this.f13527b;
        if (((g6.n) this.f13526a) != null) {
            if (i10 == 2001) {
                Object[] objArr = {Integer.valueOf(mVar.f7378i)};
                g6.b bVar = mVar.f7397a;
                Log.w(bVar.f7367a, bVar.d("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", objArr));
                Iterator it = ((e6.h) mVar.h.f55432b).f6290i.iterator();
                while (it.hasNext()) {
                    ((e6.g) it.next()).o();
                }
                i11 = 2001;
            } else {
                i11 = i10;
            }
            ((g6.n) this.f13526a).y(str, j10, i11, obj, j11, j12);
        }
    }

    @Override
    public void z(byte[] r19, int r20, int r21, z3.l r22, e2.j r23) {
        throw new UnsupportedOperationException("Method not decompiled: n4.q.z(byte[], int, int, z3.l, e2.j):void");
    }

    public q(Object obj, Object obj2) {
        this.f13526a = obj;
        this.f13527b = obj2;
    }

    public q(Object obj, Object obj2, boolean z10) {
        this.f13527b = obj;
        this.f13526a = obj2;
    }

    public q(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (interfaceDescriptor != "android.os.IMessenger" && (interfaceDescriptor == null || !interfaceDescriptor.equals("android.os.IMessenger"))) {
            if (interfaceDescriptor != "com.google.android.gms.iid.IMessengerCompat" && (interfaceDescriptor == null || !interfaceDescriptor.equals("com.google.android.gms.iid.IMessengerCompat"))) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.f13527b = new j6.f(iBinder);
            this.f13526a = null;
            return;
        }
        this.f13526a = new Messenger(iBinder);
        this.f13527b = null;
    }

    public q(int i10) {
        switch (i10) {
            case 11:
                this.f13526a = new ConcurrentHashMap(16, 0.75f, 10);
                this.f13527b = new ReferenceQueue();
                return;
            case 19:
                this.f13526a = new HashMap();
                return;
            case 22:
                this.f13526a = new HashMap();
                this.f13527b = i2.c.f7819b;
                return;
            case 23:
                this.f13526a = new e2.x();
                this.f13527b = new i4.a();
                return;
            default:
                return;
        }
    }

    @Override
    public void reset() {
    }

    public q(Animator animator) {
        this.f13526a = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f13527b = animatorSet;
        animatorSet.play(animator);
    }

    public q(aa.a aVar) {
        this.f13526a = aVar;
        this.f13527b = new AtomicBoolean(false);
    }
}
