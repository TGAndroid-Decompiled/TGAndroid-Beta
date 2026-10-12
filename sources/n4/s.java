package n4;

import a3.i0;
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
import e9.l0;
import e9.n0;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
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
import ji.h5;
import ji.j0;
import ji.k0;
import ji.m5;
import org.telegram.ui.Cells.o9;
import p4.u0;
import v7.q8;
public final class s implements ee.b, d9.k, g6.n, ef.b, z3.n, c3.i, g1, e2.d, n5.b {
    public final int f16030a;
    public Object f16031b;
    public Object f16032c;

    public s(int i10, Object obj, Object obj2) {
        this.f16030a = i10;
        this.f16031b = obj;
        this.f16032c = obj2;
    }

    public static String E(s sVar) {
        Collection<String> collection = (Collection) sVar.f16032c;
        StringBuilder sb2 = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) sVar.f16031b;
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
                    if (!g6.a.f9932a.matcher(str2).matches()) {
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

    public static void e(s sVar, i2.c cVar) {
        sVar.getClass();
        for (Map.Entry entry : new HashMap((HashMap) sVar.f16031b).entrySet()) {
            if (entry.getKey() == null) {
                List list = (List) entry.getValue();
                if (!f(cVar, list).equals(f((i2.c) sVar.f16032c, list))) {
                    throw null;
                }
            } else {
                throw new ClassCastException();
            }
        }
        sVar.f16032c = cVar;
    }

    public static i2.c f(i2.c cVar, List list) {
        cVar.getClass();
        Map map = cVar.f10928a;
        HashMap hashMap = new HashMap(map);
        HashSet hashSet = new HashSet(list);
        for (String str : map.keySet()) {
            if (!hashSet.contains(str)) {
                hashMap.remove(str);
            }
        }
        return new i2.c(hashMap);
    }

    public void A(y yVar) {
        n nVar = (n) this.f16031b;
        nVar.f16018g = yVar;
        synchronized (nVar.d) {
            for (int beginBroadcast = nVar.f16017f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((b) nVar.f16017f.getBroadcastItem(beginBroadcast)).t(yVar);
                } catch (RemoteException | SecurityException e) {
                    e2.a.d("MediaSessionCompat", "Dead object in setPlaybackState.", e);
                }
            }
            nVar.f16017f.finishBroadcast();
        }
        MediaSession mediaSession = nVar.f16014a;
        if (yVar.f16050w == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(yVar.f16043a, yVar.f16044b, yVar.d, yVar.f16047n);
            builder.setBufferedPosition(yVar.f16045c);
            builder.setActions(yVar.e);
            builder.setErrorMessage(yVar.h);
            for (x xVar : yVar.f16048r) {
                xVar.getClass();
                PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(xVar.f16040a, xVar.f16041b, xVar.f16042c);
                builder2.setExtras(xVar.d);
                PlaybackState.CustomAction build = builder2.build();
                if (build != null) {
                    builder.addCustomAction(build);
                }
            }
            builder.setActiveQueueItemId(yVar.f16049s);
            builder.setExtras(yVar.v);
            yVar.f16050w = builder.build();
        }
        mediaSession.setPlaybackState(yVar.f16050w);
    }

    public void B(ArrayList arrayList) {
        f2.s sVar;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((f2.r) arrayList.get(i10)).f8892a == 1) {
                try {
                    sVar = new f2.s((f2.r) arrayList.get(i10));
                } catch (f2.q unused) {
                    sVar = null;
                }
                this.f16032c = sVar;
            }
        }
    }

    @Override
    public boolean C(h1 h1Var) {
        return false;
    }

    public void D(b2 b2Var) {
        Handler handler = (Handler) this.f16031b;
        if (handler != null) {
            handler.post(new a1.f(4, this, b2Var));
        }
    }

    @Override
    public boolean F0(boolean z10) {
        return false;
    }

    @Override
    public void U(h1 h1Var, int i10, int i11) {
        o9 C;
        j0 j0Var = (j0) this.f16031b;
        if (!((k0) this.f16032c).d && i10 != i11 && (C = j0Var.C()) != null) {
            if (!C.x() || C.W != j0Var.L()) {
                h1Var.post(new h0(this, h1Var, i11, C, j0Var, i10));
            }
        }
    }

    @Override
    public void a(h1 h1Var) {
        ((j0) this.f16031b).a(h1Var);
    }

    @Override
    public Object apply(Object obj) {
        return ((d9.k) ((k6.h) this.f16031b).f14176b).apply(obj);
    }

    @Override
    public c3.h b(c3.p pVar, long j10) {
        long position = pVar.getPosition();
        int min = (int) Math.min(20000L, pVar.getLength() - position);
        e2.x xVar = (e2.x) this.f16032c;
        xVar.K(min);
        pVar.a(0, min, xVar.f8411a);
        int i10 = -1;
        int i11 = -1;
        long j11 = -9223372036854775807L;
        while (xVar.a() >= 4) {
            if (h3.a.a(xVar.f8412b, xVar.f8411a) != 442) {
                xVar.O(1);
            } else {
                xVar.O(4);
                long c10 = j4.x.c(xVar);
                if (c10 != -9223372036854775807L) {
                    long b10 = ((e2.k0) this.f16031b).b(c10);
                    if (b10 > j10) {
                        if (j11 == -9223372036854775807L) {
                            return new c3.h(-1, b10, position);
                        }
                        return new c3.h(0, -9223372036854775807L, position + i11);
                    } else if (b10 + 100000 > j10) {
                        return new c3.h(0, -9223372036854775807L, position + xVar.f8412b);
                    } else {
                        j11 = b10;
                        i11 = xVar.f8412b;
                    }
                }
                int i12 = xVar.f8413c;
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
                            if (h3.a.a(xVar.f8412b, xVar.f8411a) == 443) {
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
                                int a2 = h3.a.a(xVar.f8412b, xVar.f8411a);
                                if (a2 == 442 || a2 == 441 || (a2 >>> 8) != 1) {
                                    break;
                                }
                                xVar.O(4);
                                if (xVar.a() < 2) {
                                    xVar.N(i12);
                                    break;
                                }
                                xVar.N(Math.min(xVar.f8413c, xVar.f8412b + xVar.H()));
                            }
                        }
                    }
                }
                i10 = xVar.f8412b;
            }
        }
        if (j11 != -9223372036854775807L) {
            return new c3.h(-2, j11, position + i10);
        }
        return c3.h.d;
    }

    @Override
    public void c() {
        e2.x xVar = (e2.x) this.f16032c;
        byte[] bArr = m0.f8373b;
        xVar.getClass();
        xVar.L(bArr.length, bArr);
    }

    @Override
    public j9.y d(s0 s0Var) {
        j9.y d = ((e2.d) this.f16031b).d(s0Var);
        if (d == null) {
            return null;
        }
        return q8.c(d, new m5(this, 8));
    }

    @Override
    public Object g(ee.c cVar, md.c cVar2) {
        Object g10 = ((qf.b) this.f16031b).g(new a0(cVar, (c0) this.f16032c), cVar2);
        if (g10 == ld.a.f14658a) {
            return g10;
        }
        return id.i.f11386a;
    }

    @Override
    public void g0(CharSequence charSequence) {
        ((j0) this.f16031b).F(charSequence);
    }

    @Override
    public Object mo27get() {
        return new m5.d((Context) ((n5.c) this.f16031b).f16057a, (li.k) ((h5) this.f16032c).mo27get());
    }

    @Override
    public boolean h() {
        return ((j0) this.f16031b).Q();
    }

    @Override
    public int h0() {
        return 1;
    }

    public void i(i2.e eVar) {
        synchronized (eVar) {
        }
        Handler handler = (Handler) this.f16031b;
        if (handler != null) {
            handler.post(new a3.k0(this, eVar, 1));
        }
    }

    @Override
    public void j(String str, long j10, long j11, long j12) {
        g6.n nVar = (g6.n) this.f16031b;
        if (nVar != null) {
            nVar.j(str, j10, j11, j12);
        }
    }

    public byte[] k(n3.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.f16032c;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f16031b;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.f15987a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(aVar.f15988b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.f15989c);
            dataOutputStream.writeLong(aVar.d);
            dataOutputStream.write(aVar.e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean l(h1 h1Var) {
        return false;
    }

    public ec.b m() {
        if (((ec.b) this.f16032c) == null) {
            ec.e eVar = (ec.e) this.f16031b;
            int[] iArr = eVar.f8711c;
            dc.d dVar = eVar.f8709a;
            int i10 = dVar.f6471a;
            int i11 = dVar.f6472b;
            ec.b bVar = new ec.b(i10, i11);
            if (eVar.f8710b.length < i10) {
                eVar.f8710b = new byte[i10];
            }
            for (int i12 = 0; i12 < 32; i12++) {
                iArr[i12] = 0;
            }
            for (int i13 = 1; i13 < 5; i13++) {
                byte[] b10 = dVar.b((i11 * i13) / 5, eVar.f8710b);
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
                            int i37 = (i36 / 32) + (bVar.f8702c * i34);
                            int[] iArr2 = bVar.d;
                            iArr2[i37] = iArr2[i37] | (1 << (i36 & 31));
                        }
                    }
                }
                this.f16032c = bVar;
            } else {
                throw dc.e.a();
            }
        }
        return (ec.b) this.f16032c;
    }

    public c3.o n(Object... objArr) {
        Constructor a2;
        synchronized (((AtomicBoolean) this.f16032c)) {
            if (!((AtomicBoolean) this.f16032c).get()) {
                try {
                    a2 = ((w2) this.f16031b).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f16032c).set(true);
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

    public synchronized Map o() {
        try {
            if (((Map) this.f16032c) == null) {
                this.f16032c = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.f16031b));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Map) this.f16032c;
    }

    @Override
    public void p(int i10, int i11) {
        ((j0) this.f16031b).S(i10, i11);
    }

    @Override
    public void p0(h1 h1Var) {
        ((j0) this.f16031b).f();
    }

    @Override
    public j9.y q(byte[] bArr) {
        return q8.c(((e2.d) this.f16031b).q(bArr), new m5(this, 8));
    }

    public void r(k.a aVar) {
        qi.e eVar = (qi.e) this.f16031b;
        ((ActionMode.Callback) eVar.f43662a).onDestroyActionMode(eVar.k(aVar));
        g.r rVar = (g.r) this.f16032c;
        if (rVar.E != null) {
            rVar.f9800f.getDecorView().removeCallbacks(rVar.F);
        }
        if (rVar.f9816y != null) {
            r0.m0 m0Var = rVar.G;
            if (m0Var != null) {
                m0Var.b();
            }
            r0.m0 a2 = r0.j0.a(rVar.f9816y);
            a2.a(0.0f);
            rVar.G = a2;
            a2.d(new g.i(this, 2));
        }
        rVar.f9815x = null;
        ViewGroup viewGroup = rVar.J;
        WeakHashMap weakHashMap = r0.j0.f43732a;
        r0.z.c(viewGroup);
        rVar.y();
    }

    public boolean s(k.a aVar, Menu menu) {
        ViewGroup viewGroup = ((g.r) this.f16032c).J;
        WeakHashMap weakHashMap = r0.j0.f43732a;
        r0.z.c(viewGroup);
        qi.e eVar = (qi.e) this.f16031b;
        ActionMode.Callback callback = (ActionMode.Callback) eVar.f43662a;
        k.e k10 = eVar.k(aVar);
        a0.l lVar = (a0.l) eVar.d;
        Menu menu2 = (Menu) lVar.get(menu);
        if (menu2 == null) {
            menu2 = new l.a0((Context) eVar.f43663b, (l.k) menu);
            lVar.put(menu, menu2);
        }
        return callback.onPrepareActionMode(k10, menu2);
    }

    @Override
    public void s0(Editable editable) {
        ((k0) this.f16032c).i();
        ((j0) this.f16031b).Z();
    }

    public void t(Exception exc, boolean z10) {
        int i10;
        this.f16032c = null;
        HashSet hashSet = (HashSet) this.f16031b;
        n0 u10 = n0.u(hashSet);
        hashSet.clear();
        l0 listIterator = u10.listIterator(0);
        while (listIterator.hasNext()) {
            n2.b bVar = (n2.b) listIterator.next();
            bVar.getClass();
            if (z10) {
                i10 = 1;
            } else {
                i10 = 3;
            }
            bVar.l(i10, exc);
        }
    }

    public String toString() {
        switch (this.f16030a) {
            case 13:
                try {
                    return m().toString();
                } catch (dc.e unused) {
                    return "";
                }
            default:
                return super.toString();
        }
    }

    public void u(n2.b bVar) {
        ((HashSet) this.f16031b).add(bVar);
        if (((n2.b) this.f16032c) != null) {
            return;
        }
        this.f16032c = bVar;
        n2.q l4 = bVar.f15920b.l();
        bVar.f15940z = l4;
        android.support.v4.media.session.f fVar = bVar.f15934s;
        String str = m0.f8372a;
        l4.getClass();
        fVar.getClass();
        fVar.obtainMessage(1, new n2.a(u2.u.f46053g.getAndIncrement(), true, SystemClock.elapsedRealtime(), l4)).sendToTarget();
    }

    @Override
    public void u0(byte[] r19, int r20, int r21, z3.m r22, e2.j r23) {
        throw new UnsupportedOperationException("Method not decompiled: n4.s.u0(byte[], int, int, z3.m, e2.j):void");
    }

    @Override
    public void v(String str, long j10, int i10, Object obj, long j11, long j12) {
        int i11;
        g6.m mVar = (g6.m) this.f16032c;
        if (((g6.n) this.f16031b) != null) {
            if (i10 == 2001) {
                Object[] objArr = {Integer.valueOf(mVar.f9945i)};
                g6.b bVar = mVar.f9964a;
                Log.w(bVar.f9934a, bVar.d("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", objArr));
                Iterator it = ((e6.h) mVar.h.f48732b).f8494i.iterator();
                while (it.hasNext()) {
                    ((e6.g) it.next()).o();
                }
                i11 = 2001;
            } else {
                i11 = i10;
            }
            ((g6.n) this.f16031b).v(str, j10, i11, obj, j11, j12);
        }
    }

    @Override
    public z3.e w(int i10, int i11, byte[] bArr) {
        return t8.b.a(this, bArr, i11);
    }

    @Override
    public ef.a x(qf.b bVar) {
        int i10;
        List list = (List) this.f16032c;
        List list2 = (List) bVar.f43355b;
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
        return new gd.i(bVar, (List) this.f16031b, list);
    }

    public void y(Object obj) {
        Handler handler = (Handler) this.f16031b;
        if (handler != null) {
            handler.post(new i0(this, obj, SystemClock.elapsedRealtime(), 0));
        }
    }

    public void z(l lVar, Handler handler) {
        n nVar = (n) this.f16031b;
        synchronized (nVar.d) {
            nVar.f16022l = lVar;
            nVar.f16014a.setCallback(lVar.f16010b, handler);
            lVar.C(nVar, handler);
        }
    }

    public s(int i10, Object obj, boolean z10) {
        this.f16030a = i10;
        this.f16031b = obj;
    }

    public s(Object obj, int i10) {
        this.f16030a = i10;
        this.f16031b = obj;
        this.f16032c = null;
    }

    public s(Object obj, Object obj2, boolean z10, int i10) {
        this.f16030a = i10;
        this.f16032c = obj;
        this.f16031b = obj2;
    }

    public s(IBinder iBinder) {
        this.f16030a = 23;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (interfaceDescriptor != "android.os.IMessenger" && (interfaceDescriptor == null || !interfaceDescriptor.equals("android.os.IMessenger"))) {
            if (interfaceDescriptor != "com.google.android.gms.iid.IMessengerCompat" && (interfaceDescriptor == null || !interfaceDescriptor.equals("com.google.android.gms.iid.IMessengerCompat"))) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.f16032c = new j6.f(iBinder);
            this.f16031b = null;
            return;
        }
        this.f16031b = new Messenger(iBinder);
        this.f16032c = null;
    }

    public s(m6.a aVar) {
        this.f16030a = 15;
        this.f16031b = aVar == null ? null : aVar.f15701b;
    }

    public s(e2.k0 k0Var) {
        this.f16030a = 22;
        this.f16031b = k0Var;
        this.f16032c = new e2.x();
    }

    public s(int i10) {
        this.f16030a = i10;
        switch (i10) {
            case 5:
                return;
            case 12:
                this.f16031b = new ConcurrentHashMap(16, 0.75f, 10);
                this.f16032c = new ReferenceQueue();
                return;
            case 17:
                this.f16031b = new HashMap();
                return;
            case 20:
                this.f16031b = new HashMap();
                this.f16032c = i2.c.f10927b;
                return;
            case 21:
                this.f16031b = new e2.x();
                this.f16032c = new i4.a();
                return;
            case 28:
                this.f16031b = new HashSet();
                return;
            case 29:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f16031b = byteArrayOutputStream;
                this.f16032c = new DataOutputStream(byteArrayOutputStream);
                return;
            default:
                this.f16031b = ByteBuffer.allocateDirect(500);
                return;
        }
    }

    @Override
    public void W() {
    }

    @Override
    public void reset() {
    }

    public s(Handler handler, a3.m0 m0Var) {
        this.f16030a = 2;
        if (m0Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f16031b = handler;
        this.f16032c = m0Var;
    }

    public s(Animator animator) {
        this.f16030a = 6;
        this.f16031b = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f16032c = animatorSet;
        animatorSet.play(animator);
    }

    public s(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this.f16030a = 0;
        if (!TextUtils.isEmpty(str)) {
            if (componentName == null) {
                int i10 = u0.f43116b;
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
                this.f16031b = new n(context, str, bundle);
            } else if (i11 >= 28) {
                this.f16031b = new n(context, str, bundle);
            } else {
                this.f16031b = new n(context, str, bundle);
            }
            Looper myLooper = Looper.myLooper();
            z(new l(), new Handler(myLooper == null ? Looper.getMainLooper() : myLooper));
            ((n) this.f16031b).f16014a.setMediaButtonReceiver(pendingIntent);
            r rVar = ((n) this.f16031b).f16016c;
            ?? obj = new Object();
            DesugarCollections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                obj.f16039a = new f(context, rVar);
            } else {
                obj.f16039a = new f(context, rVar);
            }
            this.f16032c = obj;
            return;
        }
        throw new IllegalArgumentException("tag must not be null or empty");
    }

    public s(w2 w2Var) {
        this.f16030a = 8;
        this.f16031b = w2Var;
        this.f16032c = new AtomicBoolean(false);
    }
}
