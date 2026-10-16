package n4;

import ab.a0;
import ab.c0;
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
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.ViewGroup;
import b2.b2;
import b2.s0;
import bi.w2;
import e2.m0;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import ji.g1;
import ji.h0;
import ji.h1;
import ji.j0;
import ji.k0;
import m.h3;
import org.telegram.ui.Cells.o9;
import p4.u0;
import r0.i0;
import r0.l0;
public final class s implements ee.b, d9.k, g6.n, ef.b, z3.n, c3.i, g1, e2.d {
    public final int f15744a;
    public Object f15745b;
    public Object f15746c;

    public s(int i10, Object obj, Object obj2) {
        this.f15744a = i10;
        this.f15745b = obj;
        this.f15746c = obj2;
    }

    public static String I(s sVar) {
        Collection<String> collection = (Collection) sVar.f15746c;
        StringBuilder sb2 = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) sVar.f15745b;
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
                    if (!g6.a.f9935a.matcher(str2).matches()) {
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

    public static void h(s sVar, i2.c cVar) {
        sVar.getClass();
        for (Map.Entry entry : new HashMap((HashMap) sVar.f15745b).entrySet()) {
            if (entry.getKey() == null) {
                List list = (List) entry.getValue();
                if (!i(cVar, list).equals(i((i2.c) sVar.f15746c, list))) {
                    throw null;
                }
            } else {
                throw new ClassCastException();
            }
        }
        sVar.f15746c = cVar;
    }

    public static i2.c i(i2.c cVar, List list) {
        cVar.getClass();
        Map map = cVar.f10932a;
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
    public void A(String str, long j10, int i10, Object obj, long j11, long j12) {
        int i11;
        g6.m mVar = (g6.m) this.f15746c;
        if (((g6.n) this.f15745b) != null) {
            if (i10 == 2001) {
                Object[] objArr = {Integer.valueOf(mVar.f9948i)};
                g6.b bVar = mVar.f9967a;
                Log.w(bVar.f9937a, bVar.d("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", objArr));
                Iterator it = ((e6.h) mVar.h.f48731b).f8497i.iterator();
                while (it.hasNext()) {
                    ((e6.g) it.next()).o();
                }
                i11 = 2001;
            } else {
                i11 = i10;
            }
            ((g6.n) this.f15745b).A(str, j10, i11, obj, j11, j12);
        }
    }

    public void B(l lVar, Handler handler) {
        n nVar = (n) this.f15745b;
        synchronized (nVar.d) {
            nVar.f15736l = lVar;
            nVar.f15728a.setCallback(lVar.f15724b, handler);
            lVar.C(nVar, handler);
        }
    }

    @Override
    public void C(Editable editable) {
        ((k0) this.f15746c).i();
        ((j0) this.f15745b).C0();
    }

    public void D(y yVar) {
        n nVar = (n) this.f15745b;
        nVar.f15732g = yVar;
        synchronized (nVar.d) {
            for (int beginBroadcast = nVar.f15731f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((b) nVar.f15731f.getBroadcastItem(beginBroadcast)).t(yVar);
                } catch (RemoteException | SecurityException e) {
                    e2.a.d("MediaSessionCompat", "Dead object in setPlaybackState.", e);
                }
            }
            nVar.f15731f.finishBroadcast();
        }
        MediaSession mediaSession = nVar.f15728a;
        if (yVar.f15764w == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(yVar.f15757a, yVar.f15758b, yVar.d, yVar.f15761n);
            builder.setBufferedPosition(yVar.f15759c);
            builder.setActions(yVar.e);
            builder.setErrorMessage(yVar.h);
            for (x xVar : yVar.f15762r) {
                xVar.getClass();
                PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(xVar.f15754a, xVar.f15755b, xVar.f15756c);
                builder2.setExtras(xVar.d);
                PlaybackState.CustomAction build = builder2.build();
                if (build != null) {
                    builder.addCustomAction(build);
                }
            }
            builder.setActiveQueueItemId(yVar.f15763s);
            builder.setExtras(yVar.v);
            yVar.f15764w = builder.build();
        }
        mediaSession.setPlaybackState(yVar.f15764w);
    }

    @Override
    public boolean E(boolean z10) {
        return false;
    }

    @Override
    public ef.a F(qf.b bVar) {
        int i10;
        List list = (List) this.f15746c;
        List list2 = (List) bVar.f43097b;
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
        return new gd.i(bVar, (List) this.f15745b, list);
    }

    public void G(ArrayList arrayList) {
        f2.s sVar;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((f2.r) arrayList.get(i10)).f8895a == 1) {
                try {
                    sVar = new f2.s((f2.r) arrayList.get(i10));
                } catch (f2.q unused) {
                    sVar = null;
                }
                this.f15746c = sVar;
            }
        }
    }

    public void H(b2 b2Var) {
        Handler handler = (Handler) this.f15745b;
        if (handler != null) {
            handler.post(new a1.f(4, this, b2Var));
        }
    }

    @Override
    public int X() {
        return 1;
    }

    @Override
    public void a(h1 h1Var) {
        ((j0) this.f15745b).a(h1Var);
    }

    @Override
    public Object apply(Object obj) {
        return ((d9.k) ((a4.l) this.f15745b).f279b).apply(obj);
    }

    @Override
    public c3.h b(c3.p pVar, long j10) {
        long position = pVar.getPosition();
        int min = (int) Math.min(20000L, pVar.getLength() - position);
        e2.x xVar = (e2.x) this.f15746c;
        xVar.K(min);
        pVar.b(0, min, xVar.f8414a);
        int i10 = -1;
        int i11 = -1;
        long j11 = -9223372036854775807L;
        while (xVar.a() >= 4) {
            if (h3.a.a(xVar.f8415b, xVar.f8414a) != 442) {
                xVar.O(1);
            } else {
                xVar.O(4);
                long c10 = j4.x.c(xVar);
                if (c10 != -9223372036854775807L) {
                    long b10 = ((e2.k0) this.f15745b).b(c10);
                    if (b10 > j10) {
                        if (j11 == -9223372036854775807L) {
                            return new c3.h(-1, b10, position);
                        }
                        return new c3.h(0, -9223372036854775807L, position + i11);
                    } else if (b10 + 100000 > j10) {
                        return new c3.h(0, -9223372036854775807L, position + xVar.f8415b);
                    } else {
                        j11 = b10;
                        i11 = xVar.f8415b;
                    }
                }
                int i12 = xVar.f8416c;
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
                            if (h3.a.a(xVar.f8415b, xVar.f8414a) == 443) {
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
                                int a2 = h3.a.a(xVar.f8415b, xVar.f8414a);
                                if (a2 == 442 || a2 == 441 || (a2 >>> 8) != 1) {
                                    break;
                                }
                                xVar.O(4);
                                if (xVar.a() < 2) {
                                    xVar.N(i12);
                                    break;
                                }
                                xVar.N(Math.min(xVar.f8416c, xVar.f8415b + xVar.H()));
                            }
                        }
                    }
                }
                i10 = xVar.f8415b;
            }
        }
        if (j11 != -9223372036854775807L) {
            return new c3.h(-2, j11, position + i10);
        }
        return c3.h.d;
    }

    @Override
    public void c() {
        e2.x xVar = (e2.x) this.f15746c;
        byte[] bArr = m0.f8376b;
        xVar.getClass();
        xVar.L(bArr.length, bArr);
    }

    @Override
    public boolean d() {
        return ((j0) this.f15745b).p0();
    }

    @Override
    public boolean e(h1 h1Var) {
        return false;
    }

    @Override
    public void f(int i10, int i11) {
        ((j0) this.f15745b).t0(i10, i11);
    }

    @Override
    public Object g(ee.c cVar, md.c cVar2) {
        Object g10 = ((qf.b) this.f15745b).g(new a0(cVar, (c0) this.f15746c), cVar2);
        if (g10 == ld.a.f14658a) {
            return g10;
        }
        return id.i.f11390a;
    }

    public void j(i2.e eVar) {
        synchronized (eVar) {
        }
        Handler handler = (Handler) this.f15745b;
        if (handler != null) {
            handler.post(new a3.k0(this, eVar, 1));
        }
    }

    @Override
    public void k(String str, long j10, long j11, long j12) {
        g6.n nVar = (g6.n) this.f15745b;
        if (nVar != null) {
            nVar.k(str, j10, j11, j12);
        }
    }

    public com.google.android.datatransport.cct.CctBackendFactory l(java.lang.String r14) {
        throw new UnsupportedOperationException("Method not decompiled: n4.s.l(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    @Override
    public boolean m(h1 h1Var) {
        return false;
    }

    @Override
    public void m0(byte[] r19, int r20, int r21, z3.m r22, e2.j r23) {
        throw new UnsupportedOperationException("Method not decompiled: n4.s.m0(byte[], int, int, z3.m, e2.j):void");
    }

    public ec.b n() {
        if (((ec.b) this.f15746c) == null) {
            ec.e eVar = (ec.e) this.f15745b;
            int[] iArr = eVar.f8714c;
            dc.d dVar = eVar.f8712a;
            int i10 = dVar.f6474a;
            int i11 = dVar.f6475b;
            ec.b bVar = new ec.b(i10, i11);
            if (eVar.f8713b.length < i10) {
                eVar.f8713b = new byte[i10];
            }
            for (int i12 = 0; i12 < 32; i12++) {
                iArr[i12] = 0;
            }
            for (int i13 = 1; i13 < 5; i13++) {
                byte[] b10 = dVar.b((i11 * i13) / 5, eVar.f8713b);
                int i14 = (i10 * 4) / 5;
                for (int i15 = i10 / 5; i15 < i14; i15++) {
                    int i16 = (b10[i15] & 255) >> 3;
                    iArr[i16] = iArr[i16] + 1;
                }
            }
            int length = iArr.length;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            for (int i20 = 0; i20 < length; i20++) {
                int i21 = iArr[i20];
                if (i21 > i17) {
                    i19 = i20;
                    i17 = i21;
                }
                if (i21 > i18) {
                    i18 = i21;
                }
            }
            int i22 = 0;
            int i23 = 0;
            for (int i24 = 0; i24 < length; i24++) {
                int i25 = i24 - i19;
                int i26 = iArr[i24] * i25 * i25;
                if (i26 > i23) {
                    i22 = i24;
                    i23 = i26;
                }
            }
            if (i19 <= i22) {
                int i27 = i19;
                i19 = i22;
                i22 = i27;
            }
            if (i19 - i22 > length / 16) {
                int i28 = i19 - 1;
                int i29 = -1;
                int i30 = i28;
                while (i28 > i22) {
                    int i31 = i28 - i22;
                    int i32 = (i18 - iArr[i28]) * (i19 - i28) * i31 * i31;
                    if (i32 > i29) {
                        i30 = i28;
                        i29 = i32;
                    }
                    i28--;
                }
                int i33 = i30 << 3;
                byte[] a2 = dVar.a();
                for (int i34 = 0; i34 < i11; i34++) {
                    int i35 = i34 * i10;
                    for (int i36 = 0; i36 < i10; i36++) {
                        if ((a2[i35 + i36] & 255) < i33) {
                            int i37 = (i36 / 32) + (bVar.f8705c * i34);
                            int[] iArr2 = bVar.d;
                            iArr2[i37] = iArr2[i37] | (1 << (i36 & 31));
                        }
                    }
                }
                this.f15746c = bVar;
            } else {
                throw dc.e.a();
            }
        }
        return (ec.b) this.f15746c;
    }

    @Override
    public j9.y o(s0 s0Var) {
        Uri uri;
        byte[] bArr;
        h3 h3Var = (h3) this.f15746c;
        if (h3Var != null && (((uri = (Uri) h3Var.f14851c) != null && uri.equals(s0Var.f2357n)) || ((bArr = (byte[]) h3Var.f14850b) != null && Arrays.equals(bArr, s0Var.f2354k)))) {
            j9.y yVar = (j9.y) ((h3) this.f15746c).d;
            yVar.getClass();
            return yVar;
        }
        j9.y o10 = ((e2.d) this.f15745b).o(s0Var);
        if (o10 == null) {
            return null;
        }
        this.f15746c = new h3(s0Var, o10);
        return o10;
    }

    public c3.o p(Object... objArr) {
        Constructor a2;
        synchronized (((AtomicBoolean) this.f15746c)) {
            if (!((AtomicBoolean) this.f15746c).get()) {
                try {
                    a2 = ((w2) this.f15745b).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f15746c).set(true);
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
    public void q(h1 h1Var, int i10, int i11) {
        o9 W;
        j0 j0Var = (j0) this.f15745b;
        if (!((k0) this.f15746c).d && i10 != i11 && (W = j0Var.W()) != null) {
            if (!W.x() || W.W != j0Var.g0()) {
                h1Var.post(new h0(this, h1Var, i11, W, j0Var, i10));
            }
        }
    }

    public synchronized Map s() {
        try {
            if (((Map) this.f15746c) == null) {
                this.f15746c = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.f15745b));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Map) this.f15746c;
    }

    public void t(k.a aVar) {
        pi.e eVar = (pi.e) this.f15745b;
        ((ActionMode.Callback) eVar.f42944a).onDestroyActionMode(eVar.k(aVar));
        g.r rVar = (g.r) this.f15746c;
        if (rVar.E != null) {
            rVar.f9803f.getDecorView().removeCallbacks(rVar.F);
        }
        if (rVar.f9819y != null) {
            l0 l0Var = rVar.G;
            if (l0Var != null) {
                l0Var.b();
            }
            l0 a2 = i0.a(rVar.f9819y);
            a2.a(0.0f);
            rVar.G = a2;
            a2.d(new g.i(this, 2));
        }
        rVar.f9818x = null;
        ViewGroup viewGroup = rVar.J;
        WeakHashMap weakHashMap = i0.f43485a;
        r0.y.c(viewGroup);
        rVar.y();
    }

    public String toString() {
        switch (this.f15744a) {
            case 13:
                try {
                    return n().toString();
                } catch (dc.e unused) {
                    return "";
                }
            default:
                return super.toString();
        }
    }

    @Override
    public j9.y u(byte[] bArr) {
        byte[] bArr2;
        h3 h3Var = (h3) this.f15746c;
        if (h3Var != null && (bArr2 = (byte[]) h3Var.f14850b) != null && Arrays.equals(bArr2, bArr)) {
            j9.y yVar = (j9.y) ((h3) this.f15746c).d;
            yVar.getClass();
            return yVar;
        }
        j9.y u10 = ((e2.d) this.f15745b).u(bArr);
        this.f15746c = new h3(bArr, u10);
        return u10;
    }

    public boolean v(k.a aVar, Menu menu) {
        ViewGroup viewGroup = ((g.r) this.f15746c).J;
        WeakHashMap weakHashMap = i0.f43485a;
        r0.y.c(viewGroup);
        pi.e eVar = (pi.e) this.f15745b;
        ActionMode.Callback callback = (ActionMode.Callback) eVar.f42944a;
        k.e k10 = eVar.k(aVar);
        a0.l lVar = (a0.l) eVar.d;
        Menu menu2 = (Menu) lVar.get(menu);
        if (menu2 == null) {
            menu2 = new l.a0((Context) eVar.f42945b, (l.k) menu);
            lVar.put(menu, menu2);
        }
        return callback.onPrepareActionMode(k10, menu2);
    }

    public void w(Object obj) {
        Handler handler = (Handler) this.f15745b;
        if (handler != null) {
            handler.post(new a3.i0(this, obj, SystemClock.elapsedRealtime(), 0));
        }
    }

    @Override
    public z3.e x(int i10, int i11, byte[] bArr) {
        return t8.b.a(this, bArr, i11);
    }

    @Override
    public void y(CharSequence charSequence) {
        ((j0) this.f15745b).a0(charSequence);
    }

    @Override
    public void z(h1 h1Var) {
        ((j0) this.f15745b).h();
    }

    public s(int i10, Object obj, boolean z10) {
        this.f15744a = i10;
        this.f15745b = obj;
    }

    public s(Object obj, int i10) {
        this.f15744a = i10;
        this.f15745b = obj;
        this.f15746c = null;
    }

    public s(Object obj, Object obj2, boolean z10, int i10) {
        this.f15744a = i10;
        this.f15746c = obj;
        this.f15745b = obj2;
    }

    public s(IBinder iBinder) {
        this.f15744a = 23;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (interfaceDescriptor != "android.os.IMessenger" && (interfaceDescriptor == null || !interfaceDescriptor.equals("android.os.IMessenger"))) {
            if (interfaceDescriptor != "com.google.android.gms.iid.IMessengerCompat" && (interfaceDescriptor == null || !interfaceDescriptor.equals("com.google.android.gms.iid.IMessengerCompat"))) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.f15746c = new j6.f(iBinder);
            this.f15745b = null;
            return;
        }
        this.f15745b = new Messenger(iBinder);
        this.f15746c = null;
    }

    public s(m6.a aVar) {
        this.f15744a = 15;
        this.f15745b = aVar == null ? null : aVar.f15436b;
    }

    public s(e2.k0 k0Var) {
        this.f15744a = 22;
        this.f15745b = k0Var;
        this.f15746c = new e2.x();
    }

    public s(int i10) {
        this.f15744a = i10;
        switch (i10) {
            case 5:
                return;
            case 12:
                this.f15745b = new ConcurrentHashMap(16, 0.75f, 10);
                this.f15746c = new ReferenceQueue();
                return;
            case 17:
                this.f15745b = new HashMap();
                return;
            case 20:
                this.f15745b = new HashMap();
                this.f15746c = i2.c.f10931b;
                return;
            case 21:
                this.f15745b = new e2.x();
                this.f15746c = new i4.a();
                return;
            default:
                this.f15745b = ByteBuffer.allocateDirect(500);
                return;
        }
    }

    @Override
    public void r() {
    }

    @Override
    public void reset() {
    }

    public s(Handler handler, a3.m0 m0Var) {
        this.f15744a = 2;
        if (m0Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f15745b = handler;
        this.f15746c = m0Var;
    }

    public s(Animator animator) {
        this.f15744a = 6;
        this.f15745b = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f15746c = animatorSet;
        animatorSet.play(animator);
    }

    public s(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this.f15744a = 0;
        if (!TextUtils.isEmpty(str)) {
            if (componentName == null) {
                int i10 = u0.f42817b;
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
                this.f15745b = new n(context, str, bundle);
            } else if (i11 >= 28) {
                this.f15745b = new n(context, str, bundle);
            } else {
                this.f15745b = new n(context, str, bundle);
            }
            Looper myLooper = Looper.myLooper();
            B(new l(), new Handler(myLooper == null ? Looper.getMainLooper() : myLooper));
            ((n) this.f15745b).f15728a.setMediaButtonReceiver(pendingIntent);
            r rVar = ((n) this.f15745b).f15730c;
            ?? obj = new Object();
            DesugarCollections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                obj.f15753a = new f(context, rVar);
            } else {
                obj.f15753a = new f(context, rVar);
            }
            this.f15746c = obj;
            return;
        }
        throw new IllegalArgumentException("tag must not be null or empty");
    }

    public s(w2 w2Var) {
        this.f15744a = 8;
        this.f15745b = w2Var;
        this.f15746c = new AtomicBoolean(false);
    }
}
