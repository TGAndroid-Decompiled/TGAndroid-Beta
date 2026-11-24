package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
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
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;
import java.util.zip.Inflater;
import org.telegram.ui.ActionBar.d;
public final class wtc implements sq4, hk7, uab, x79 {
    public static volatile wtc e;
    public static final mu7 f = new Object();
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public wtc(Typeface typeface, pd7 pd7Var) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        this.d = typeface;
        this.a = pd7Var;
        this.c = new rd7(1024);
        int a = pd7Var.a(6);
        if (a != 0) {
            int i6 = a + pd7Var.a;
            i = pd7Var.b.getInt(pd7Var.b.getInt(i6) + i6);
        } else {
            i = 0;
        }
        this.b = new char[i << 1];
        int a2 = pd7Var.a(6);
        if (a2 != 0) {
            int i7 = a2 + pd7Var.a;
            i2 = pd7Var.b.getInt(pd7Var.b.getInt(i7) + i7);
        } else {
            i2 = 0;
        }
        for (int i8 = 0; i8 < i2; i8++) {
            uw3 uw3Var = new uw3(this, i8);
            od7 b = uw3Var.b();
            int a3 = b.a(4);
            if (a3 != 0) {
                i3 = b.b.getInt(a3 + b.a);
            } else {
                i3 = 0;
            }
            Character.toChars(i3, (char[]) this.b, i8 << 1);
            od7 b2 = uw3Var.b();
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
                rd7 rd7Var = (rd7) this.c;
                od7 b3 = uw3Var.b();
                int a5 = b3.a(16);
                if (a5 != 0) {
                    int i10 = a5 + b3.a;
                    i5 = b3.b.getInt(b3.b.getInt(i10) + i10);
                } else {
                    i5 = 0;
                }
                rd7Var.a(uw3Var, 0, i5 - 1);
            } else {
                w26.j("invalid metadata codepoint length");
                throw null;
            }
        }
    }

    public final synchronized void A(Exception exc) {
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

    public final Bundle B(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.c;
        if (bundle != null) {
            return (Bundle) hashMap.put(str, bundle);
        }
        return (Bundle) hashMap.remove(str);
    }

    public final synchronized void C(eka ekaVar, Socket socket) {
        ArrayList arrayList;
        if (((CountDownLatch) this.a) != null && (arrayList = (ArrayList) this.b) != null) {
            if (((Socket) this.c) == null) {
                this.c = socket;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    eka ekaVar2 = (eka) obj;
                    if (ekaVar2 != ekaVar) {
                        ekaVar2.a(new InterruptedException());
                        ekaVar2.interrupt();
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
        gh7 gh7Var = (gh7) this.c;
        if (((gk7) this.b) == null) {
            return;
        }
        wtc wtcVar = (wtc) this.d;
        if (wtcVar != null) {
            wtcVar.a();
            this.d = null;
        }
        int i = gh7Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            kk7 kk7Var = (kk7) this.a;
            gk7 gk7Var = (gk7) this.b;
            if (i2 >= 0 && i2 < gh7Var.b) {
                kk7Var.n(gk7Var, gh7Var.a[i2]);
            } else {
                w26.h(gh7Var.b - 1, de9.m(i2, "Index ", " must be in 0.."));
                return;
            }
        }
        gh7Var.b = 0;
        this.a = null;
        this.b = null;
    }

    public final wtc b(int i) {
        if (((gk7) this.b) == null) {
            return this;
        }
        gh7 gh7Var = (gh7) this.c;
        int i2 = gh7Var.b + 1;
        int[] iArr = gh7Var.a;
        if (iArr.length < i2) {
            iArr = Arrays.copyOf(iArr, Math.max(i2, (iArr.length * 3) / 2));
            gh7Var.a = iArr;
        }
        int i3 = gh7Var.b;
        iArr[i3] = i;
        gh7Var.b = i3 + 1;
        ((kk7) this.a).a((gk7) this.b, i);
        return this;
    }

    public final void c(bn4 bn4Var) {
        if (!((ArrayList) this.a).contains(bn4Var)) {
            synchronized (((ArrayList) this.a)) {
                ((ArrayList) this.a).add(bn4Var);
            }
            bn4Var.w = true;
            return;
        }
        wn4.i(bn4Var, "Fragment already added: ");
    }

    @Override
    public final void d() {
        gl.d3(new s79((d) this.a, (Context) this.b, (wjb) this.c, (tj9) this.d, (byte) 2), 200L);
    }

    public final wtc e(int i) {
        if (((gk7) this.b) == null) {
            return this;
        }
        wtc wtcVar = (wtc) this.d;
        if (wtcVar == null) {
            wtcVar = new wtc(kk7.e(), (gk7) this.b);
            this.d = wtcVar;
        }
        wtcVar.b(i);
        return this;
    }

    @Override
    public final kab f(int i, int i2, byte[] bArr) {
        return de9.c(this, bArr, i2);
    }

    @Override
    public final void g() {
        gl.d3(new lw8((d) this.a, (tj9) this.d, (byte) 14), 200L);
    }

    public final void h(Canvas canvas, int i) {
        ArrayList arrayList = (ArrayList) this.c;
        canvas.clipRect(0, 0, i, gl.L(14.66f));
        RectF rectF = gl.P;
        float f2 = i;
        rectF.set(0.0f, 0.0f, f2, gl.L(14.66f));
        canvas.saveLayerAlpha(rectF, 255, 31);
        if (k96.a0) {
            canvas.translate(f2, 0.0f);
        }
        int L = i - gl.L(25.0f);
        int i2 = 0;
        while (i2 < arrayList.size()) {
            ve3 ve3Var = (ve3) arrayList.get(i2);
            L = ug8.B(4.0f, ve3Var.g, L);
            if (L < 0) {
                break;
            }
            if (k96.a0) {
                canvas.translate(-ve3Var.g, 0.0f);
                ve3Var.a(canvas);
                canvas.translate(-gl.L(4.0f), 0.0f);
            } else {
                ve3Var.a(canvas);
                canvas.translate(gl.L(4.0f) + ve3Var.g, 0.0f);
            }
            i2++;
        }
        if (i2 < arrayList.size()) {
            int size = arrayList.size() - i2;
            ve3 ve3Var2 = (ve3) this.d;
            if (ve3Var2 == null || ve3Var2.a != size) {
                ?? obj = new Object();
                obj.a = size;
                tgb tgbVar = new tgb(de9.k(size, "+"), 10.0f, gl.o());
                tgbVar.q((ue3) this.a);
                obj.c = tgbVar;
                int L2 = gl.L(9.32f);
                tgb tgbVar2 = obj.c;
                obj.g = L2 + ((int) tgbVar2.c);
                tgbVar2.h();
                int i3 = bkb.m8;
                obj.f = i3;
                obj.e = true;
                obj.d = bkb.w0(null, i3, false);
                this.d = obj;
                ve3Var2 = obj;
            }
            if (k96.a0) {
                canvas.translate(-ve3Var2.g, 0.0f);
                ((ve3) this.d).a(canvas);
                canvas.translate(-gl.L(4.0f), 0.0f);
            } else {
                ve3Var2.a(canvas);
                canvas.translate(gl.L(4.0f) + ((ve3) this.d).g, 0.0f);
            }
        }
        canvas.restore();
    }

    public final void i(vtc vtcVar) {
        if (((vtc) this.b) != vtcVar) {
            return;
        }
        ttc ttcVar = (ttc) this.c;
        if (ttcVar != null) {
            gl.r(ttcVar);
            this.c = null;
        }
        ttc ttcVar2 = (ttc) this.d;
        if (ttcVar2 != null) {
            gl.r(ttcVar2);
            this.d = null;
        }
        synchronized (auc.y) {
            auc aucVar = auc.A;
            if (aucVar != null) {
                aucVar.q();
                auc.A = null;
            }
        }
        this.b = null;
        vtcVar.c.run(-1L);
        z();
    }

    @Override
    public final void j() {
        d dVar = (d) this.a;
        dVar.showDialog(new jh8(dVar, 3, true));
    }

    @Override
    public final void k(Throwable th) {
        ((ox6) this.d).c.remove((su6) this.a);
        wte.a((ei5) this.c);
    }

    @Override
    public final void l(byte[] bArr, int i, int i2, tab tabVar, us2 us2Var) {
        u33 u33Var;
        int i3;
        int i4;
        int i5;
        int A;
        int i6;
        int i7;
        int D;
        o38 o38Var = (o38) this.c;
        int[] iArr = o38Var.b;
        xu7 xu7Var = o38Var.a;
        xu7 xu7Var2 = (xu7) this.b;
        xu7 xu7Var3 = (xu7) this.a;
        xu7Var3.L(i + i2, bArr);
        xu7Var3.N(i);
        Inflater inflater = (Inflater) this.d;
        if (inflater == null) {
            inflater = new Inflater();
            this.d = inflater;
        }
        if (g8c.R(xu7Var3, xu7Var2, inflater)) {
            xu7Var3.L(xu7Var2.c, xu7Var2.a);
        }
        int i8 = 0;
        o38Var.d = 0;
        o38Var.e = 0;
        o38Var.f = 0;
        o38Var.g = 0;
        o38Var.h = 0;
        o38Var.i = 0;
        xu7Var.K(0);
        o38Var.c = false;
        ArrayList arrayList = new ArrayList();
        while (xu7Var3.a() >= 3) {
            int i9 = xu7Var3.c;
            int A2 = xu7Var3.A();
            int H = xu7Var3.H();
            int i10 = xu7Var3.b + H;
            if (i10 > i9) {
                xu7Var3.N(i9);
                i3 = i8;
                u33Var = null;
            } else {
                char c = 128;
                if (A2 != 128) {
                    switch (A2) {
                        case 20:
                            if (H % 5 == 2) {
                                xu7Var3.O(2);
                                Arrays.fill(iArr, i8);
                                int i11 = H / 5;
                                int i12 = i8;
                                while (i12 < i11) {
                                    int A3 = xu7Var3.A();
                                    char c2 = c;
                                    double A4 = xu7Var3.A();
                                    double A5 = xu7Var3.A() - 128;
                                    double A6 = xu7Var3.A() - 128;
                                    iArr[A3] = (xu7Var3.A() << 24) | (g8c.i((int) ((1.402d * A5) + A4), 0, 255) << 16) | (g8c.i((int) ((A4 - (0.34414d * A6)) - (A5 * 0.71414d)), 0, 255) << 8) | g8c.i((int) ((A6 * 1.772d) + A4), 0, 255);
                                    i12++;
                                    c = c2;
                                    o38Var = o38Var;
                                }
                                o38Var.c = true;
                                break;
                            }
                            break;
                        case 21:
                            if (H >= 4) {
                                xu7Var3.O(3);
                                if ((xu7Var3.A() & 128) != 0) {
                                    i7 = 1;
                                } else {
                                    i7 = i8;
                                }
                                int i13 = H - 4;
                                if (i7 != 0) {
                                    if (i13 >= 7 && (D = xu7Var3.D()) >= 4) {
                                        o38Var.h = xu7Var3.H();
                                        o38Var.i = xu7Var3.H();
                                        xu7Var.K(D - 4);
                                        i13 = H - 11;
                                    }
                                }
                                int i14 = xu7Var.b;
                                int i15 = xu7Var.c;
                                if (i14 < i15 && i13 > 0) {
                                    int min = Math.min(i13, i15 - i14);
                                    xu7Var3.k(i14, min, xu7Var.a);
                                    xu7Var.N(i14 + min);
                                    break;
                                }
                            }
                            break;
                        case 22:
                            if (H >= 19) {
                                o38Var.d = xu7Var3.H();
                                o38Var.e = xu7Var3.H();
                                xu7Var3.O(11);
                                o38Var.f = xu7Var3.H();
                                o38Var.g = xu7Var3.H();
                                break;
                            }
                            break;
                    }
                    u33Var = null;
                    i3 = 0;
                } else {
                    if (o38Var.d != 0 && o38Var.e != 0 && o38Var.h != 0 && o38Var.i != 0 && (i4 = xu7Var.c) != 0 && xu7Var.b == i4 && o38Var.c) {
                        xu7Var.N(0);
                        int i16 = o38Var.h * o38Var.i;
                        int[] iArr2 = new int[i16];
                        int i17 = 0;
                        while (i17 < i16) {
                            int A7 = xu7Var.A();
                            if (A7 != 0) {
                                i5 = i17 + 1;
                                iArr2[i17] = iArr[A7];
                            } else {
                                int A8 = xu7Var.A();
                                if (A8 != 0) {
                                    if ((A8 & 64) == 0) {
                                        A = A8 & 63;
                                    } else {
                                        A = ((A8 & 63) << 8) | xu7Var.A();
                                    }
                                    if ((A8 & 128) == 0) {
                                        i6 = iArr[0];
                                    } else {
                                        i6 = iArr[xu7Var.A()];
                                    }
                                    i5 = A + i17;
                                    Arrays.fill(iArr2, i17, i5, i6);
                                }
                            }
                            i17 = i5;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr2, o38Var.h, o38Var.i, Bitmap.Config.ARGB_8888);
                        float f2 = o38Var.d;
                        float f3 = o38Var.e;
                        u33Var = new u33(null, null, null, createBitmap, o38Var.g / f3, 0, 0, o38Var.f / f2, 0, Integer.MIN_VALUE, -3.4028235E38f, o38Var.h / f2, o38Var.i / f3, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
                    } else {
                        u33Var = null;
                    }
                    i3 = 0;
                    o38Var.d = 0;
                    o38Var.e = 0;
                    o38Var.f = 0;
                    o38Var.g = 0;
                    o38Var.h = 0;
                    o38Var.i = 0;
                    xu7Var.K(0);
                    o38Var.c = false;
                }
                xu7Var3.N(i10);
            }
            if (u33Var != null) {
                arrayList.add(u33Var);
            }
            i8 = i3;
        }
        us2Var.accept(new x33(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    public final bn4 m(String str) {
        to4 to4Var = (to4) ((HashMap) this.b).get(str);
        if (to4Var != null) {
            return to4Var.c;
        }
        return null;
    }

    public final bn4 n(String str) {
        for (to4 to4Var : ((HashMap) this.b).values()) {
            if (to4Var != null) {
                bn4 bn4Var = to4Var.c;
                if (!str.equals(bn4Var.e)) {
                    bn4Var = bn4Var.M.c.n(str);
                }
                if (bn4Var != null) {
                    return bn4Var;
                }
            }
        }
        return null;
    }

    @Override
    public final int o() {
        return 2;
    }

    @Override
    public final void onSuccess(Object obj) {
        qu6 qu6Var = (qu6) obj;
        ei5 ei5Var = (ei5) this.c;
        tv6 tv6Var = (tv6) this.b;
        ox6 ox6Var = (ox6) this.d;
        CopyOnWriteArraySet copyOnWriteArraySet = ox6Var.c;
        mv6 mv6Var = ox6Var.b;
        su6 su6Var = (su6) this.a;
        copyOnWriteArraySet.remove(su6Var);
        boolean z = false;
        try {
            if (!tv6Var.i()) {
                hx6 hx6Var = (hx6) su6Var.e;
                hx6Var.getClass();
                IBinder asBinder = hx6Var.a.asBinder();
                qu6Var.getClass();
                if (mv6Var.V(su6Var)) {
                    lad.f("MediaSessionStub", "Controller " + su6Var + " has sent connection request multiple times");
                }
                mv6Var.g(asBinder, su6Var, qu6Var.a, qu6Var.b);
                ny0 P = mv6Var.P(su6Var);
                if (P == null) {
                    lad.f("MediaSessionStub", "Ignoring connection request from unknown controller info");
                } else {
                    tv6Var.t();
                    ad8 ad8Var = tv6Var.t;
                    wc8 wc8Var = tv6Var.s;
                    tv6Var.t();
                    kc8 kc8Var = qu6Var.b;
                    wc8 a0 = ox6Var.a0(ox6Var.b0(wc8Var));
                    if (mv6Var.V(su6Var)) {
                        aob aobVar = a0.j;
                        eyb eybVar = a0.F;
                        mv6Var.x0();
                        bs2 bs2Var = (bs2) ((ps) mv6Var.c).get(su6Var);
                        if (bs2Var != null) {
                            bs2Var.h = aobVar;
                            bs2Var.i = eybVar;
                        }
                    }
                    MediaSession.Token token = ((bv6) tv6Var.h.p.b).c.b;
                    tv6Var.t();
                    mm5 mm5Var = qu6Var.c;
                    if (mm5Var == null) {
                        tv6Var.t();
                        mm5Var = tv6Var.y;
                    }
                    mm5 mm5Var2 = qu6Var.d;
                    if (mm5Var2 == null) {
                        tv6Var.t();
                        mm5Var2 = tv6Var.z;
                    }
                    tv6Var.t();
                    mm5 mm5Var3 = mm5Var;
                    w59 w59Var = tv6Var.r;
                    mm5 mm5Var4 = mm5Var2;
                    q5a q5aVar = qu6Var.a;
                    kc8 q = ad8Var.q();
                    Bundle bundle = new Bundle(tv6Var.j.a.d);
                    Bundle bundle2 = qu6Var.e;
                    if (bundle2 == null) {
                        tv6Var.t();
                        bundle2 = tv6Var.A;
                    }
                    es2 es2Var = new es2(ox6Var, mm5Var3, mm5Var4, w59Var, q5aVar, kc8Var, q, bundle, bundle2, a0, token);
                    if (!tv6Var.i()) {
                        try {
                            ((di5) ei5Var).a(P.d(), es2Var.a(su6Var.c));
                            z = true;
                        } catch (RemoteException unused) {
                        }
                        if (z) {
                            if (!tv6Var.x || !tv6.j(su6Var)) {
                                tv6Var.e.getClass();
                                return;
                            }
                            return;
                        }
                        wte.a(ei5Var);
                        return;
                    }
                }
            }
            wte.a(ei5Var);
        } catch (Throwable th) {
            if (0 == 0) {
                wte.a(ei5Var);
            }
            throw th;
        }
    }

    public final tbb p(f9 f9Var) {
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            tbb tbbVar = (tbb) arrayList.get(i);
            if (tbbVar != null && tbbVar.b == f9Var) {
                return tbbVar;
            }
        }
        tbb tbbVar2 = new tbb((Context) this.b, f9Var);
        arrayList.add(tbbVar2);
        return tbbVar2;
    }

    public final ArrayList q() {
        ArrayList arrayList = new ArrayList();
        for (to4 to4Var : ((HashMap) this.b).values()) {
            if (to4Var != null) {
                arrayList.add(to4Var);
            }
        }
        return arrayList;
    }

    public final ArrayList r() {
        ArrayList arrayList = new ArrayList();
        for (to4 to4Var : ((HashMap) this.b).values()) {
            if (to4Var != null) {
                arrayList.add(to4Var.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List s() {
        ArrayList arrayList;
        if (((ArrayList) this.a).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.a)) {
            arrayList = new ArrayList((ArrayList) this.a);
        }
        return arrayList;
    }

    public final boolean t() {
        return ((ArrayList) this.c).isEmpty();
    }

    public final void u(to4 to4Var) {
        bn4 bn4Var = to4Var.c;
        String str = bn4Var.e;
        HashMap hashMap = (HashMap) this.b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(bn4Var.e, to4Var);
        if (go4.K(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + bn4Var);
        }
    }

    public final void v(to4 to4Var) {
        HashMap hashMap = (HashMap) this.b;
        bn4 bn4Var = to4Var.c;
        if (bn4Var.T) {
            ((jo4) this.d).f(bn4Var);
        }
        if (hashMap.get(bn4Var.e) == to4Var && ((to4) hashMap.put(bn4Var.e, null)) != null && go4.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + bn4Var);
        }
    }

    public final boolean w(f9 f9Var, MenuItem menuItem) {
        return ((ActionMode.Callback) this.a).onActionItemClicked(p(f9Var), new g07((Context) this.b, (ybb) menuItem));
    }

    public final boolean x(f9 f9Var, yz6 yz6Var) {
        ActionMode.Callback callback = (ActionMode.Callback) this.a;
        tbb p = p(f9Var);
        aia aiaVar = (aia) this.d;
        Menu menu = (Menu) aiaVar.get(yz6Var);
        if (menu == null) {
            menu = new w07((Context) this.b, yz6Var);
            aiaVar.put(yz6Var, menu);
        }
        return callback.onCreateActionMode(p, menu);
    }

    public final ro3 y(String str) {
        if (str != null) {
            vo3 vo3Var = new vo3((ArrayList) this.a, (rn5) this.c, (ArrayList) this.b);
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
                vo3Var.i(str.substring(i, i2));
                i = i2 + 1;
                if (i < str.length() && str.charAt(i2) == '\r' && str.charAt(i) == '\n') {
                    i = i2 + 2;
                }
            }
            if (str.length() > 0 && (i == 0 || i < str.length())) {
                vo3Var.i(str.substring(i));
            }
            vo3Var.f(vo3Var.n);
            qn5 S0 = vo3Var.j.S0(new wk4(vo3Var.k, vo3Var.m, (byte) 5));
            for (x1 x1Var : vo3Var.o) {
                x1Var.g(S0);
            }
            ro3 ro3Var = (ro3) vo3Var.l.b;
            Iterator it = ((ArrayList) this.d).iterator();
            if (!it.hasNext()) {
                return ro3Var;
            }
            throw ls6.l(it);
        }
        fvc.f("input must not be null");
        return null;
    }

    public final void z() {
        boolean z;
        if (((vtc) this.b) == null) {
            vtc vtcVar = (vtc) ((ArrayDeque) this.a).pollFirst();
            this.b = vtcVar;
            if (vtcVar != null) {
                int i = 0;
                ttc ttcVar = new ttc(this, vtcVar, (byte) 0);
                this.c = ttcVar;
                gl.d3(ttcVar, 10000L);
                au8 au8Var = vtcVar.b;
                String str = au8Var.b;
                String str2 = au8Var.f;
                utc utcVar = new utc(this, vtcVar);
                vk9 k = auc.k(str);
                byte[] f2 = auc.f(str2);
                if (k != null && f2 != null) {
                    try {
                        z = muc.a("WEB_MESSAGE_LISTENER");
                    } catch (Throwable th) {
                        fa4.g(th, true);
                        z = false;
                    }
                    if (z) {
                        synchronized (auc.y) {
                            auc aucVar = auc.A;
                            if (aucVar != null) {
                                aucVar.q();
                                auc.A = null;
                            }
                            try {
                                auc aucVar2 = new auc(k, str2, f2);
                                auc.A = aucVar2;
                                aucVar2.x = utcVar;
                                ur urVar = ur.f;
                                if (urVar != null) {
                                    urVar.d.add(aucVar2);
                                }
                                aucVar2.j.execute(new xtc(aucVar2, (byte) 1));
                                gl.c3(new xtc(aucVar2, (byte) 2));
                                i = auc.A.i.getLocalPort();
                            } catch (Exception e2) {
                                fa4.g(e2, true);
                                auc aucVar3 = auc.A;
                                if (aucVar3 != null) {
                                    aucVar3.q();
                                    auc.A = null;
                                }
                            }
                        }
                    }
                }
                vtcVar.d = i;
                if (i == 0) {
                    i(vtcVar);
                }
            }
        }
    }

    @Override
    public final void reset() {
    }

    public wtc(byte b) {
        switch (b) {
            case 5:
                this.a = new ArrayList();
                this.b = new HashMap();
                this.c = new HashMap();
                return;
            case 11:
                this.a = new xu7();
                this.b = new xu7();
                this.c = new o38();
                return;
            default:
                this.a = new ArrayDeque();
                return;
        }
    }

    public wtc(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public wtc(kk7 kk7Var, gk7 gk7Var) {
        ?? obj = new Object();
        obj.a = new int[16];
        this.c = obj;
        this.a = kk7Var;
        this.b = gk7Var;
    }
}
