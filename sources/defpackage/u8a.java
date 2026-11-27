package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;
import java.util.zip.Inflater;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class u8a implements ws4, gn7, reb, jb9 {
    public static u8a e;
    public static final String[] f = {"Connection", "Upgrade"};
    public static final String[] h = {"Upgrade", "websocket"};
    public static final String[] n = {"Sec-WebSocket-Version", "13"};
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public u8a(Typeface typeface, yf7 yf7Var) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        this.d = typeface;
        this.a = yf7Var;
        this.c = new ag7(1024);
        int a = yf7Var.a(6);
        if (a != 0) {
            int i6 = a + yf7Var.a;
            i = yf7Var.b.getInt(yf7Var.b.getInt(i6) + i6);
        } else {
            i = 0;
        }
        this.b = new char[i << 1];
        int a2 = yf7Var.a(6);
        if (a2 != 0) {
            int i7 = a2 + yf7Var.a;
            i2 = yf7Var.b.getInt(yf7Var.b.getInt(i7) + i7);
        } else {
            i2 = 0;
        }
        for (int i8 = 0; i8 < i2; i8++) {
            px3 px3Var = new px3(this, i8);
            xf7 b = px3Var.b();
            int a3 = b.a(4);
            if (a3 != 0) {
                i3 = b.b.getInt(a3 + b.a);
            } else {
                i3 = 0;
            }
            Character.toChars(i3, (char[]) this.b, i8 << 1);
            xf7 b2 = px3Var.b();
            int a4 = b2.a(16);
            if (a4 != 0) {
                int i9 = a4 + b2.a;
                i4 = b2.b.getInt(b2.b.getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            if (i4 > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                ag7 ag7Var = (ag7) this.c;
                xf7 b3 = px3Var.b();
                int a5 = b3.a(16);
                if (a5 != 0) {
                    int i10 = a5 + b3.a;
                    i5 = b3.b.getInt(b3.b.getInt(i10) + i10);
                } else {
                    i5 = 0;
                }
                ag7Var.a(px3Var, 0, i5 - 1);
            } else {
                lq5.j("invalid metadata codepoint length");
                throw null;
            }
        }
    }

    public static void E(long j, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            hashMap.remove(arrayList.get(i));
        }
    }

    public static synchronized u8a v() {
        u8a u8aVar;
        synchronized (u8a.class) {
            u8aVar = e;
            if (u8aVar == null) {
                u8aVar = new u8a((byte) 0);
                e = u8aVar;
            }
        }
        return u8aVar;
    }

    public final void A() {
        long uptimeMillis = SystemClock.uptimeMillis();
        for (long[] jArr : ((LinkedHashMap) this.d).values()) {
            n(jArr, uptimeMillis);
        }
        this.d = new LinkedHashMap();
    }

    public final boolean B(g9 g9Var, MenuItem menuItem) {
        return ((ActionMode.Callback) this.a).onActionItemClicked(q(g9Var), new n27((Context) this.b, (ufb) menuItem));
    }

    public final boolean C(g9 g9Var, f27 f27Var) {
        ActionMode.Callback callback = (ActionMode.Callback) this.a;
        pfb q = q(g9Var);
        vla vlaVar = (vla) this.d;
        Menu menu = (Menu) vlaVar.get(f27Var);
        if (menu == null) {
            menu = new d37((Context) this.b, f27Var);
            vlaVar.put(f27Var, menu);
        }
        return callback.onCreateActionMode(q, menu);
    }

    public final ip3 D(String str) {
        if (str != null) {
            mp3 mp3Var = new mp3((ArrayList) this.a, (up5) this.c, (ArrayList) this.b);
            int i = 0;
            while (true) {
                int length = str.length();
                int i2 = i;
                while (true) {
                    if (i2 < length) {
                        char charAt = str.charAt(i2);
                        if (charAt == '\n' || charAt == '\r') {
                            break;
                        }
                        i2++;
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                if (i2 == -1) {
                    break;
                }
                mp3Var.i(str.substring(i, i2));
                i = i2 + 1;
                if (i < str.length() && str.charAt(i2) == '\r' && str.charAt(i) == '\n') {
                    i = i2 + 2;
                }
            }
            if (str.length() > 0 && (i == 0 || i < str.length())) {
                mp3Var.i(str.substring(i));
            }
            mp3Var.f(mp3Var.n);
            tp5 q = mp3Var.j.q(new um4(mp3Var.k, mp3Var.m, (byte) 6));
            for (y1 y1Var : mp3Var.o) {
                y1Var.g(q);
            }
            ip3 ip3Var = (ip3) mp3Var.l.b;
            Iterator it = ((ArrayList) this.d).iterator();
            if (!it.hasNext()) {
                return ip3Var;
            }
            throw qu6.l(it);
        }
        p3d.h("input must not be null");
        return null;
    }

    public final java.lang.Object F(defpackage.ax2 r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u8a.F(ax2):java.lang.Object");
    }

    public final xg0 G(List list) {
        xg0 xg0Var;
        HashMap hashMap = (HashMap) this.c;
        ArrayList g = g(list);
        if (g.size() < 2) {
            return (xg0) dqe.a(g, null);
        }
        Collections.sort(g, new ta((byte) 8));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = ((xg0) g.get(0)).c;
        int i3 = 0;
        while (true) {
            if (i3 >= g.size()) {
                break;
            }
            xg0 xg0Var2 = (xg0) g.get(i3);
            if (i2 != xg0Var2.c) {
                if (arrayList.size() == 1) {
                    return (xg0) g.get(0);
                }
            } else {
                arrayList.add(new Pair(xg0Var2.b, Integer.valueOf(xg0Var2.d)));
                i3++;
            }
        }
        xg0 xg0Var3 = (xg0) hashMap.get(arrayList);
        if (xg0Var3 == null) {
            List subList = g.subList(0, arrayList.size());
            int i4 = 0;
            for (int i5 = 0; i5 < subList.size(); i5++) {
                i4 += ((xg0) subList.get(i5)).d;
            }
            int nextInt = ((Random) this.d).nextInt(i4);
            int i6 = 0;
            while (true) {
                if (i < subList.size()) {
                    xg0Var = (xg0) subList.get(i);
                    i6 += xg0Var.d;
                    if (nextInt < i6) {
                        break;
                    }
                    i++;
                } else {
                    xg0Var = (xg0) dqe.b(subList);
                    break;
                }
            }
            hashMap.put(arrayList, xg0Var);
            return xg0Var;
        }
        return xg0Var3;
    }

    public final synchronized void H(Exception exc) {
        CountDownLatch countDownLatch = (CountDownLatch) this.a;
        if (countDownLatch != null && ((ArrayList) this.b) != null) {
            if (((Exception) this.d) == null) {
                this.d = exc;
            }
            countDownLatch.countDown();
        } else {
            throw new IllegalStateException("Cannot set exception before awaiting!");
        }
    }

    public final Bundle I(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.c;
        if (bundle != null) {
            return (Bundle) hashMap.put(str, bundle);
        }
        return (Bundle) hashMap.remove(str);
    }

    public final synchronized void J(yna ynaVar, Socket socket) {
        ArrayList arrayList;
        if (((CountDownLatch) this.a) != null && (arrayList = (ArrayList) this.b) != null) {
            if (((Socket) this.c) == null) {
                this.c = socket;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    yna ynaVar2 = (yna) obj;
                    if (ynaVar2 != ynaVar) {
                        ynaVar2.a(new InterruptedException());
                        ynaVar2.interrupt();
                    }
                }
            } else {
                try {
                    socket.close();
                } catch (IOException unused) {
                }
            }
            ((CountDownLatch) this.a).countDown();
        } else {
            throw new IllegalStateException("Cannot set socket before awaiting!");
        }
    }

    @Override
    public final void a() {
        pj7 pj7Var = (pj7) this.c;
        if (((fn7) this.b) == null) {
            return;
        }
        u8a u8aVar = (u8a) this.d;
        if (u8aVar != null) {
            u8aVar.a();
            this.d = null;
        }
        int i = pj7Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            jn7 jn7Var = (jn7) this.a;
            fn7 fn7Var = (fn7) this.b;
            if (i2 >= 0 && i2 < pj7Var.b) {
                jn7Var.n(fn7Var, pj7Var.a[i2]);
            } else {
                lq5.g(pj7Var.b - 1, uh9.m(i2, "Index ", " must be in 0.."));
                return;
            }
        }
        pj7Var.b = 0;
        this.a = null;
        this.b = null;
    }

    public final u8a b(int i) {
        if (((fn7) this.b) == null) {
            return this;
        }
        pj7 pj7Var = (pj7) this.c;
        int i2 = pj7Var.b + 1;
        int[] iArr = pj7Var.a;
        if (iArr.length < i2) {
            iArr = Arrays.copyOf(iArr, Math.max(i2, (iArr.length * 3) / 2));
            pj7Var.a = iArr;
        }
        int i3 = pj7Var.b;
        iArr[i3] = i;
        pj7Var.b = i3 + 1;
        ((jn7) this.a).a((fn7) this.b, i);
        return this;
    }

    public final void c(gp4 gp4Var) {
        if (!((ArrayList) this.a).contains(gp4Var)) {
            synchronized (((ArrayList) this.a)) {
                ((ArrayList) this.a).add(gp4Var);
            }
            gp4Var.w = true;
            return;
        }
        xi4.k(gp4Var, "Fragment already added: ");
    }

    @Override
    public final void d() {
        hl.d3(new fb9((e) this.a, (Context) this.b, (vnb) this.c, (en9) this.d, (byte) 2), 200L);
    }

    public final u8a e(int i) {
        if (((fn7) this.b) == null) {
            return this;
        }
        u8a u8aVar = (u8a) this.d;
        if (u8aVar == null) {
            u8aVar = new u8a(jn7.e(), (fn7) this.b);
            this.d = u8aVar;
        }
        u8aVar.b(i);
        return this;
    }

    @Override
    public final void f() {
        hl.d3(new z09((e) this.a, (en9) this.d, (byte) 12), 200L);
    }

    public final ArrayList g(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = (HashMap) this.a;
        E(elapsedRealtime, hashMap);
        HashMap hashMap2 = (HashMap) this.b;
        E(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            xg0 xg0Var = (xg0) list.get(i);
            if (!hashMap.containsKey(xg0Var.b) && !hashMap2.containsKey(Integer.valueOf(xg0Var.c))) {
                arrayList.add(xg0Var);
            }
        }
        return arrayList;
    }

    public final s30 h() {
        vz6 vz6Var;
        boolean z;
        if (!((asb) this.c).p() && (vz6Var = (vz6) this.d) != null) {
            if (((asb) this.c).b(vz6Var.a) != -1) {
                z = true;
            } else {
                z = false;
            }
            yve.f(z);
        }
        return new s30(this);
    }

    @Override
    public final void i() {
        e eVar = (e) this.a;
        eVar.showDialog(new xk8(eVar, 3, true));
    }

    @Override
    public final heb j(int i, int i2, byte[] bArr) {
        return uh9.c(this, bArr, i2);
    }

    @Override
    public final void k(Throwable th) {
        ((sz6) this.d).c.remove((xw6) this.a);
        pye.a((gk5) this.c);
    }

    @Override
    public final void l(byte[] bArr, int i, int i2, qeb qebVar, ot2 ot2Var) {
        m43 m43Var;
        int i3;
        int i4;
        int i5;
        int A;
        int i6;
        int i7;
        int D;
        e78 e78Var = (e78) this.c;
        int[] iArr = e78Var.b;
        ey7 ey7Var = e78Var.a;
        ey7 ey7Var2 = (ey7) this.b;
        ey7 ey7Var3 = (ey7) this.a;
        ey7Var3.L(i + i2, bArr);
        ey7Var3.N(i);
        Inflater inflater = (Inflater) this.d;
        if (inflater == null) {
            inflater = new Inflater();
            this.d = inflater;
        }
        if (gcc.R(ey7Var3, ey7Var2, inflater)) {
            ey7Var3.L(ey7Var2.c, ey7Var2.a);
        }
        int i8 = 0;
        e78Var.d = 0;
        e78Var.e = 0;
        e78Var.f = 0;
        e78Var.g = 0;
        e78Var.h = 0;
        e78Var.i = 0;
        ey7Var.K(0);
        e78Var.c = false;
        ArrayList arrayList = new ArrayList();
        while (ey7Var3.a() >= 3) {
            int i9 = ey7Var3.c;
            int A2 = ey7Var3.A();
            int H = ey7Var3.H();
            int i10 = ey7Var3.b + H;
            if (i10 > i9) {
                ey7Var3.N(i9);
                i3 = i8;
                m43Var = null;
            } else {
                char c = 128;
                if (A2 != 128) {
                    switch (A2) {
                        case 20:
                            if (H % 5 == 2) {
                                ey7Var3.O(2);
                                Arrays.fill(iArr, i8);
                                int i11 = H / 5;
                                int i12 = i8;
                                while (i12 < i11) {
                                    int A3 = ey7Var3.A();
                                    char c2 = c;
                                    double A4 = ey7Var3.A();
                                    double A5 = ey7Var3.A() - 128;
                                    double A6 = ey7Var3.A() - 128;
                                    iArr[A3] = (ey7Var3.A() << 24) | (gcc.i((int) ((1.402d * A5) + A4), 0, 255) << 16) | (gcc.i((int) ((A4 - (0.34414d * A6)) - (A5 * 0.71414d)), 0, 255) << 8) | gcc.i((int) ((A6 * 1.772d) + A4), 0, 255);
                                    i12++;
                                    c = c2;
                                    e78Var = e78Var;
                                }
                                e78Var.c = true;
                                break;
                            }
                            break;
                        case 21:
                            if (H >= 4) {
                                ey7Var3.O(3);
                                if ((ey7Var3.A() & 128) != 0) {
                                    i7 = 1;
                                } else {
                                    i7 = i8;
                                }
                                int i13 = H - 4;
                                if (i7 != 0) {
                                    if (i13 >= 7 && (D = ey7Var3.D()) >= 4) {
                                        e78Var.h = ey7Var3.H();
                                        e78Var.i = ey7Var3.H();
                                        ey7Var.K(D - 4);
                                        i13 = H - 11;
                                    }
                                }
                                int i14 = ey7Var.b;
                                int i15 = ey7Var.c;
                                if (i14 < i15 && i13 > 0) {
                                    int min = Math.min(i13, i15 - i14);
                                    ey7Var3.k(i14, min, ey7Var.a);
                                    ey7Var.N(i14 + min);
                                    break;
                                }
                            }
                            break;
                        case 22:
                            if (H >= 19) {
                                e78Var.d = ey7Var3.H();
                                e78Var.e = ey7Var3.H();
                                ey7Var3.O(11);
                                e78Var.f = ey7Var3.H();
                                e78Var.g = ey7Var3.H();
                                break;
                            }
                            break;
                    }
                    m43Var = null;
                    i3 = 0;
                } else {
                    if (e78Var.d != 0 && e78Var.e != 0 && e78Var.h != 0 && e78Var.i != 0 && (i4 = ey7Var.c) != 0 && ey7Var.b == i4 && e78Var.c) {
                        ey7Var.N(0);
                        int i16 = e78Var.h * e78Var.i;
                        int[] iArr2 = new int[i16];
                        int i17 = 0;
                        while (i17 < i16) {
                            int A7 = ey7Var.A();
                            if (A7 != 0) {
                                i5 = i17 + 1;
                                iArr2[i17] = iArr[A7];
                            } else {
                                int A8 = ey7Var.A();
                                if (A8 != 0) {
                                    if ((A8 & 64) == 0) {
                                        A = A8 & 63;
                                    } else {
                                        A = ((A8 & 63) << 8) | ey7Var.A();
                                    }
                                    if ((A8 & 128) == 0) {
                                        i6 = iArr[0];
                                    } else {
                                        i6 = iArr[ey7Var.A()];
                                    }
                                    i5 = A + i17;
                                    Arrays.fill(iArr2, i17, i5, i6);
                                }
                            }
                            i17 = i5;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr2, e78Var.h, e78Var.i, Bitmap.Config.ARGB_8888);
                        float f2 = e78Var.d;
                        float f3 = e78Var.e;
                        m43Var = new m43(null, null, null, createBitmap, e78Var.g / f3, 0, 0, e78Var.f / f2, 0, Integer.MIN_VALUE, -3.4028235E38f, e78Var.h / f2, e78Var.i / f3, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
                    } else {
                        m43Var = null;
                    }
                    i3 = 0;
                    e78Var.d = 0;
                    e78Var.e = 0;
                    e78Var.f = 0;
                    e78Var.g = 0;
                    e78Var.h = 0;
                    e78Var.i = 0;
                    ey7Var.K(0);
                    e78Var.c = false;
                }
                ey7Var3.N(i10);
            }
            if (m43Var != null) {
                arrayList.add(m43Var);
            }
            i8 = i3;
        }
        ot2Var.accept(new p43(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    public final java.lang.Object m(defpackage.ax2 r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u8a.m(ax2):java.lang.Object");
    }

    public final void n(long[] jArr, long j) {
        long j2;
        if (j - jArr[3] >= 2000) {
            if (((HashSet) this.b).add(jArr[0] + ":" + jArr[1])) {
                long j3 = jArr[0];
                int i = (int) jArr[1];
                long j4 = jArr[3];
                int i2 = ((yd) this.c).b;
                TLRPC.Chat M0 = uc7.s1(i2).M0(Long.valueOf(-j3));
                if (M0 != null && !M0.min) {
                    j2 = M0.access_hash;
                } else {
                    j2 = 0;
                }
                ha4 ha4Var = new ha4(j3, j2, i, "list_view", null, "chat_list", null, ea4.g(i2) - ((int) ((SystemClock.uptimeMillis() - j4) / 1000)), Utilities.b.nextLong());
                ha4Var.i = Integer.valueOf((int) (j - j4));
                String i3 = ea4.i(i2);
                if (i3 != null) {
                    ea4.e.postRunnable(new x94(i3, ha4Var, (byte) 0));
                }
            }
        }
    }

    public final gp4 o(String str) {
        xq4 xq4Var = (xq4) ((HashMap) this.b).get(str);
        if (xq4Var != null) {
            return xq4Var.c;
        }
        return null;
    }

    @Override
    public final void onSuccess(Object obj) {
        vw6 vw6Var = (vw6) obj;
        gk5 gk5Var = (gk5) this.c;
        yx6 yx6Var = (yx6) this.b;
        sz6 sz6Var = (sz6) this.d;
        CopyOnWriteArraySet copyOnWriteArraySet = sz6Var.c;
        rx6 rx6Var = sz6Var.b;
        xw6 xw6Var = (xw6) this.a;
        copyOnWriteArraySet.remove(xw6Var);
        boolean z = false;
        try {
            if (!yx6Var.i()) {
                lz6 lz6Var = (lz6) xw6Var.e;
                lz6Var.getClass();
                IBinder asBinder = lz6Var.a.asBinder();
                vw6Var.getClass();
                if (rx6Var.Y(xw6Var)) {
                    efd.f("MediaSessionStub", "Controller " + xw6Var + " has sent connection request multiple times");
                }
                rx6Var.b(asBinder, xw6Var, vw6Var.a, vw6Var.b);
                vy0 Q = rx6Var.Q(xw6Var);
                if (Q == null) {
                    efd.f("MediaSessionStub", "Ignoring connection request from unknown controller info");
                } else {
                    yx6Var.t();
                    og8 og8Var = yx6Var.t;
                    kg8 kg8Var = yx6Var.s;
                    yx6Var.t();
                    zf8 zf8Var = vw6Var.b;
                    kg8 a0 = sz6Var.a0(sz6Var.b0(kg8Var));
                    if (rx6Var.Y(xw6Var)) {
                        asb asbVar = a0.j;
                        f2c f2cVar = a0.F;
                        rx6Var.D0();
                        us2 us2Var = (us2) ((qs) rx6Var.c).get(xw6Var);
                        if (us2Var != null) {
                            us2Var.h = asbVar;
                            us2Var.i = f2cVar;
                        }
                    }
                    MediaSession.Token token = ((gx6) yx6Var.h.p.b).c.b;
                    yx6Var.t();
                    po5 po5Var = vw6Var.c;
                    if (po5Var == null) {
                        yx6Var.t();
                        po5Var = yx6Var.y;
                    }
                    po5 po5Var2 = vw6Var.d;
                    if (po5Var2 == null) {
                        yx6Var.t();
                        po5Var2 = yx6Var.z;
                    }
                    yx6Var.t();
                    po5 po5Var3 = po5Var;
                    j99 j99Var = yx6Var.r;
                    po5 po5Var4 = po5Var2;
                    i9a i9aVar = vw6Var.a;
                    zf8 q = og8Var.q();
                    Bundle bundle = new Bundle(yx6Var.j.a.d);
                    Bundle bundle2 = vw6Var.e;
                    if (bundle2 == null) {
                        yx6Var.t();
                        bundle2 = yx6Var.A;
                    }
                    xs2 xs2Var = new xs2(sz6Var, po5Var3, po5Var4, j99Var, i9aVar, zf8Var, q, bundle, bundle2, a0, token);
                    if (!yx6Var.i()) {
                        try {
                            ((fk5) gk5Var).a(Q.d(), xs2Var.a(xw6Var.c));
                            z = true;
                        } catch (RemoteException unused) {
                        }
                        if (z) {
                            if (!yx6Var.x || !yx6.j(xw6Var)) {
                                yx6Var.e.getClass();
                                return;
                            }
                            return;
                        }
                        pye.a(gk5Var);
                        return;
                    }
                }
            }
            pye.a(gk5Var);
        } catch (Throwable th) {
            if (0 == 0) {
                pye.a(gk5Var);
            }
            throw th;
        }
    }

    public final gp4 p(String str) {
        for (xq4 xq4Var : ((HashMap) this.b).values()) {
            if (xq4Var != null) {
                gp4 gp4Var = xq4Var.c;
                if (!str.equals(gp4Var.e)) {
                    gp4Var = gp4Var.M.c.p(str);
                }
                if (gp4Var != null) {
                    return gp4Var;
                }
            }
        }
        return null;
    }

    public final pfb q(g9 g9Var) {
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            pfb pfbVar = (pfb) arrayList.get(i);
            if (pfbVar != null && pfbVar.b == g9Var) {
                return pfbVar;
            }
        }
        pfb pfbVar2 = new pfb((Context) this.b, g9Var);
        arrayList.add(pfbVar2);
        return pfbVar2;
    }

    public final ArrayList r() {
        ArrayList arrayList = new ArrayList();
        for (xq4 xq4Var : ((HashMap) this.b).values()) {
            if (xq4Var != null) {
                arrayList.add(xq4Var);
            }
        }
        return arrayList;
    }

    @Override
    public final int s() {
        return 2;
    }

    public final ArrayList t() {
        ArrayList arrayList = new ArrayList();
        for (xq4 xq4Var : ((HashMap) this.b).values()) {
            if (xq4Var != null) {
                arrayList.add(xq4Var.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List u() {
        ArrayList arrayList;
        if (((ArrayList) this.a).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.a)) {
            arrayList = new ArrayList((ArrayList) this.a);
        }
        return arrayList;
    }

    public final boolean w(Context context) {
        boolean z;
        if (((Boolean) this.c) == null) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                z = true;
            } else {
                z = false;
            }
            this.c = Boolean.valueOf(z);
        }
        if (!((Boolean) this.b).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.c).booleanValue();
    }

    public final boolean x(Context context) {
        boolean z;
        Boolean bool = (Boolean) this.b;
        if (bool == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z = true;
            } else {
                z = false;
            }
            bool = Boolean.valueOf(z);
            this.b = bool;
        }
        if (!bool.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.b).booleanValue();
    }

    public final void y(xq4 xq4Var) {
        gp4 gp4Var = xq4Var.c;
        String str = gp4Var.e;
        HashMap hashMap = (HashMap) this.b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(gp4Var.e, xq4Var);
        if (kq4.K(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + gp4Var);
        }
    }

    public final void z(xq4 xq4Var) {
        HashMap hashMap = (HashMap) this.b;
        gp4 gp4Var = xq4Var.c;
        if (gp4Var.T) {
            ((nq4) this.d).f(gp4Var);
        }
        if (hashMap.get(gp4Var.e) == xq4Var && ((xq4) hashMap.put(gp4Var.e, null)) != null && kq4.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + gp4Var);
        }
    }

    @Override
    public final void reset() {
    }

    public u8a(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public u8a(byte b) {
        switch (b) {
            case 3:
                Random random = new Random();
                this.c = new HashMap();
                this.d = random;
                this.a = new HashMap();
                this.b = new HashMap();
                return;
            case 6:
                this.a = new ArrayList();
                this.b = new HashMap();
                this.c = new HashMap();
                return;
            case 12:
                this.a = new ey7();
                this.b = new ey7();
                this.c = new e78();
                return;
            default:
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = new ArrayDeque();
                return;
        }
    }

    public u8a(ko4 ko4Var) {
        this.a = ko4Var;
        this.b = null;
        this.c = asb.a;
        this.d = null;
    }

    public u8a(jn7 jn7Var, fn7 fn7Var) {
        ?? obj = new Object();
        obj.a = new int[16];
        this.c = obj;
        this.a = jn7Var;
        this.b = fn7Var;
    }
}
