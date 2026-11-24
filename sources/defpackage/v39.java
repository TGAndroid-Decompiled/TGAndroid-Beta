package defpackage;

import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class v39 implements rb9, gi2, hk4, jy9, kt8, h86, eob, zu9, bb2, wz6, yr9, puc, p1d, y1d, f69, f9d, v56, OnCompleteListener {
    public final byte a;
    public Object b;

    public v39(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final String[] A0() {
        return ((WebViewProviderFactoryBoundaryInterface) this.b).getSupportedFeatures();
    }

    @Override
    public final boolean A1(gb2 gb2Var, int i) {
        if (i == ((tmb) this.b).y) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean B(yz6 yz6Var, MenuItem menuItem) {
        return false;
    }

    @Override
    public final boolean B2(gb2 gb2Var, k27 k27Var) {
        return false;
    }

    @Override
    public final void C0(k86 k86Var, long j, long j2, int i) {
        switch (this.a) {
            case 11:
                return;
            default:
                cv7 cv7Var = (cv7) k86Var;
                cv8 cv8Var = (cv8) this.b;
                if (cv8Var.a) {
                    f86 a = cv8.a(cv7Var, j, j2);
                    kp kpVar = (kp) cv8Var.g;
                    kpVar.getClass();
                    kpVar.u(a, 8, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean D0(gb2 gb2Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final void E1() {
        te9 te9Var = ((gc9) this.b).T;
        if (te9Var != null) {
            te9Var.a.W3();
        }
    }

    @Override
    public final gib E2() {
        return null;
    }

    @Override
    public final boolean F(gb2 gb2Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final boolean F0(gb2 gb2Var) {
        return false;
    }

    @Override
    public final void F1(gb2 gb2Var, int i) {
        tmb tmbVar = (tmb) this.b;
        cib cibVar = tmbVar.E;
        if (tmbVar.a()) {
            tmbVar.y = 2;
            gb2Var.invalidate();
            gl.r(cibVar);
            gl.e3(cibVar, 5000L);
        }
    }

    @Override
    public final void G(Object obj) {
        u56 u56Var;
        ly4 ly4Var = (ly4) obj;
        qx qxVar = ((dmd) this.b).b;
        synchronized (qxVar) {
            qxVar.b = false;
            u56Var = ((w56) qxVar.c).b;
        }
        if (u56Var != null) {
            ((u84) qxVar.d).c(u56Var, 2441);
        }
    }

    @Override
    public final eib G0() {
        return (gc9) this.b;
    }

    @Override
    public final boolean H0(float f, float f2) {
        switch (this.a) {
            case 4:
                pg9 pg9Var = (pg9) this.b;
                og9 i0 = pg9Var.i0(f, f2);
                i0 = (i0 == null || i0.b) ? null : null;
                pg9Var.b0 = i0;
                if (i0 != null) {
                    return true;
                }
                return false;
            default:
                int L = gl.L(9.0f);
                RectF rectF = ((f6c) this.b).g;
                float f3 = -L;
                rectF.inset(f3, f3);
                boolean contains = rectF.contains(f, f2);
                float f4 = L;
                rectF.inset(f4, f4);
                return contains;
        }
    }

    @Override
    public final lk0 I0() {
        return ((gc9) this.b).a;
    }

    @Override
    public final void I1(k27 k27Var, String str, String str2, String str3, String str4, int i, int i2) {
        tmb tmbVar = (tmb) this.b;
        cib cibVar = tmbVar.E;
        if (tmbVar.a()) {
            tmbVar.y = 2;
            gl.r(cibVar);
            gl.e3(cibVar, 5000L);
        }
    }

    @Override
    public final boolean J0(long j) {
        return false;
    }

    public final int J1(int[] iArr, int i) {
        int[] iArr2;
        int[] iArr3;
        int i2;
        int i3;
        int i4;
        hs4 hs4Var = (hs4) this.b;
        if (iArr.length != 0) {
            int length = iArr.length;
            if (length > 1 && iArr[0] == 0) {
                int i5 = 1;
                while (i5 < length && iArr[i5] == 0) {
                    i5++;
                }
                if (i5 == length) {
                    iArr2 = new int[]{0};
                } else {
                    int i6 = length - i5;
                    int[] iArr4 = new int[i6];
                    System.arraycopy(iArr, i5, iArr4, 0, i6);
                    iArr2 = iArr4;
                }
            } else {
                iArr2 = iArr;
            }
            int[] iArr5 = new int[i];
            int i7 = 0;
            boolean z = true;
            while (i7 < i) {
                int i8 = hs4Var.a[(hs4Var.g ? 1 : 0) + i7];
                if (i8 == 0) {
                    i4 = iArr2[iArr2.length - 1];
                } else {
                    if (i8 == 1) {
                        i3 = 0;
                        for (int i9 : iArr2) {
                            hs4 hs4Var2 = hs4.h;
                            i3 ^= i9;
                        }
                    } else {
                        i3 = iArr2[0];
                        int length2 = iArr2.length;
                        for (int i10 = 1; i10 < length2; i10++) {
                            i3 = hs4Var.c(i8, i3) ^ iArr2[i10];
                        }
                    }
                    i4 = i3;
                }
                iArr5[(i - 1) - i7] = i4;
                if (i4 != 0) {
                    z = false;
                }
                i7++;
                z = z;
            }
            if (z) {
                return 0;
            }
            is4 is4Var = new is4(hs4Var, iArr5);
            is4 a = hs4Var.a(i, 1);
            is4 is4Var2 = hs4Var.c;
            if (a.d() >= is4Var.d()) {
                a = is4Var;
                is4Var = a;
            }
            is4 is4Var3 = hs4Var.d;
            is4 is4Var4 = a;
            is4 is4Var5 = is4Var;
            is4 is4Var6 = is4Var4;
            is4 is4Var7 = is4Var2;
            while ((is4Var6.d() << 1) >= i) {
                if (!is4Var6.e()) {
                    int b = hs4Var.b(is4Var6.c(is4Var6.d()));
                    is4 is4Var8 = is4Var2;
                    while (is4Var5.d() >= is4Var6.d() && !is4Var5.e()) {
                        int d = is4Var5.d() - is4Var6.d();
                        int c = hs4Var.c(is4Var5.c(is4Var5.d()), b);
                        is4Var8 = is4Var8.a(hs4Var.a(d, c));
                        is4Var5 = is4Var5.a(is4Var6.h(d, c));
                    }
                    is4 a2 = is4Var8.g(is4Var3).a(is4Var7);
                    if (is4Var5.d() < is4Var6.d()) {
                        is4 is4Var9 = is4Var5;
                        is4Var5 = is4Var6;
                        is4Var6 = is4Var9;
                        is4Var7 = is4Var3;
                        is4Var3 = a2;
                    } else {
                        throw new IllegalStateException("Division algorithm failed to reduce polynomial? r: " + is4Var5 + ", rLast: " + is4Var6);
                    }
                } else {
                    throw new Exception("r_{i-1} was zero");
                }
            }
            int c2 = is4Var3.c(0);
            if (c2 != 0) {
                int b2 = hs4Var.b(c2);
                is4[] is4VarArr = {is4Var3.f(b2), is4Var6.f(b2)};
                is4 is4Var10 = is4VarArr[0];
                is4 is4Var11 = is4VarArr[1];
                int d2 = is4Var10.d();
                if (d2 == 1) {
                    iArr3 = new int[]{is4Var10.c(1)};
                } else {
                    int[] iArr6 = new int[d2];
                    int i11 = 0;
                    for (int i12 = 1; i12 < hs4Var.e && i11 < d2; i12++) {
                        if (is4Var10.b(i12) == 0) {
                            iArr6[i11] = hs4Var.b(i12);
                            i11++;
                        }
                    }
                    if (i11 == d2) {
                        iArr3 = iArr6;
                    } else {
                        throw new Exception("Error locator degree does not match number of roots");
                    }
                }
                int length3 = iArr3.length;
                int[] iArr7 = new int[length3];
                for (int i13 = 0; i13 < length3; i13++) {
                    int b3 = hs4Var.b(iArr3[i13]);
                    int i14 = 1;
                    for (int i15 = 0; i15 < length3; i15++) {
                        if (i13 != i15) {
                            int c3 = hs4Var.c(iArr3[i15], b3);
                            if ((c3 & 1) == 0) {
                                i2 = c3 | 1;
                            } else {
                                i2 = c3 & (-2);
                            }
                            i14 = hs4Var.c(i14, i2);
                        }
                    }
                    int c4 = hs4Var.c(is4Var11.b(b3), hs4Var.b(i14));
                    iArr7[i13] = c4;
                    if (hs4Var.g) {
                        iArr7[i13] = hs4Var.c(c4, b3);
                    }
                }
                for (int i16 = 0; i16 < iArr3.length; i16++) {
                    int length4 = iArr.length - 1;
                    int i17 = iArr3[i16];
                    if (i17 != 0) {
                        int i18 = length4 - hs4Var.b[i17];
                        if (i18 >= 0) {
                            iArr[i18] = iArr[i18] ^ iArr7[i16];
                        } else {
                            throw new Exception("Bad error location");
                        }
                    } else {
                        sc8.e();
                        return 0;
                    }
                }
                return iArr3.length;
            }
            throw new Exception("sigmaTilde(0) was zero");
        }
        sc8.e();
        return 0;
    }

    @Override
    public final void K(float f, float f2) {
        rh9 rh9Var;
        bb2 bb2Var;
        switch (this.a) {
            case 4:
                pg9 pg9Var = (pg9) this.b;
                og9 og9Var = pg9Var.b0;
                if (og9Var != null && (bb2Var = (rh9Var = pg9Var.a).F) != null) {
                    bb2Var.V0(rh9Var.E, og9Var.c);
                    return;
                }
                return;
            default:
                Runnable runnable = ((f6c) this.b).j;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean K0(View view, float f, float f2) {
        switch (this.a) {
            case 4:
                pg9 pg9Var = (pg9) this.b;
                if (pg9Var.b0 == null) {
                    return false;
                }
                og9 i0 = pg9Var.i0(f, f2);
                og9 og9Var = pg9Var.b0;
                if (i0 != og9Var) {
                    return false;
                }
                rh9 rh9Var = pg9Var.a;
                bb2 bb2Var = rh9Var.F;
                if (bb2Var != null) {
                    bb2Var.u0(rh9Var.E, og9Var.c);
                }
                return true;
            default:
                return false;
        }
    }

    @Override
    public final void K1(gb2 gb2Var, TLRPC.WebPage webPage, String str, boolean z) {
        d01.t(gb2Var.getContext(), str);
    }

    @Override
    public final void L(boolean z, float f) {
        ((n4b) this.b).a(Boolean.FALSE, Float.valueOf(f));
    }

    public final void L1(ga gaVar) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        byte b = gaVar.a;
        if (b != 1) {
            if (b != 2) {
                if (b != 4) {
                    if (b != 8) {
                        return;
                    }
                    recyclerView.y.W(recyclerView, gaVar.b, gaVar.d);
                    return;
                }
                recyclerView.y.Z(recyclerView, gaVar.b, gaVar.d, gaVar.c);
                return;
            }
            recyclerView.y.X(recyclerView, gaVar.b, gaVar.d);
            return;
        }
        recyclerView.y.U(recyclerView, gaVar.b, gaVar.d);
    }

    @Override
    public final void M(gb2 gb2Var, int i, float f, float f2, boolean z) {
        tmb tmbVar = (tmb) this.b;
        cib cibVar = tmbVar.E;
        if (tmbVar.a()) {
            tmbVar.y = 0;
            gb2Var.invalidate();
            gl.r(cibVar);
            gl.e3(cibVar, 5000L);
        }
    }

    @Override
    public final boolean N() {
        return false;
    }

    @Override
    public final boolean N1() {
        return false;
    }

    @Override
    public final vf6 O0() {
        return null;
    }

    @Override
    public final boolean P() {
        return false;
    }

    @Override
    public final boolean P0() {
        te9 te9Var = ((gc9) this.b).T;
        if (te9Var != null && te9Var.a.V4()) {
            return true;
        }
        return false;
    }

    public final void P1(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int R = recyclerView.e.R();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < R; i6++) {
            View Q = recyclerView.e.Q(i6);
            s49 U = RecyclerView.U(Q);
            if (U != null && !U.r() && (i4 = U.c) >= i && i4 < i5) {
                U.a(2);
                if (obj == null) {
                    U.a(1024);
                } else if ((U.l & 1024) == 0) {
                    if (U.m == null) {
                        ArrayList arrayList = new ArrayList();
                        U.m = arrayList;
                        U.n = DesugarCollections.unmodifiableList(arrayList);
                    }
                    U.m.add(obj);
                }
                ((e49) Q.getLayoutParams()).c = true;
            }
        }
        wg2 wg2Var = recyclerView.b;
        ArrayList arrayList2 = (ArrayList) wg2Var.e;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            s49 s49Var = (s49) arrayList2.get(size);
            if (s49Var != null && (i3 = s49Var.c) >= i && i3 < i5) {
                s49Var.a(2);
                wg2Var.g(size);
            }
        }
        recyclerView.z0 = true;
    }

    @Override
    public final int Q() {
        return 0;
    }

    public final void Q1(int i, int i2) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int R = recyclerView.e.R();
        for (int i3 = 0; i3 < R; i3++) {
            s49 U = RecyclerView.U(recyclerView.e.Q(i3));
            if (U != null && !U.r() && U.c >= i) {
                U.n(i2, false);
                recyclerView.v0.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.b.e;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            s49 s49Var = (s49) arrayList.get(i4);
            if (s49Var != null && s49Var.c >= i) {
                s49Var.n(i2, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.y0 = true;
    }

    @Override
    public final void R(java.lang.String r13, long r14, int r16, defpackage.r8d r17, long r18, long r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v39.R(java.lang.String, long, int, r8d, long, long):void");
    }

    @Override
    public final void R0(Bundle bundle) {
        k3d k3dVar = (k3d) this.b;
        ReentrantLock reentrantLock = k3dVar.o;
        reentrantLock.lock();
        try {
            Bundle bundle2 = k3dVar.k;
            if (bundle2 == null) {
                k3dVar.k = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            k3dVar.l = ds2.f;
            k3dVar.j();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override
    public final boolean S0() {
        return true;
    }

    public final void S1(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int R = recyclerView.e.R();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < R; i11++) {
            s49 U = RecyclerView.U(recyclerView.e.Q(i11));
            if (U != null && (i9 = U.c) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    U.n(i2 - i, false);
                } else {
                    U.n(i5, false);
                }
                recyclerView.v0.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.b.e;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            s49 s49Var = (s49) arrayList.get(i12);
            if (s49Var != null && (i8 = s49Var.c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    s49Var.n(i2 - i, false);
                } else {
                    s49Var.n(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.y0 = true;
    }

    @Override
    public final boolean T() {
        byte b = this.a;
        return true;
    }

    @Override
    public final boolean T0(gb2 gb2Var, TLRPC.TodoItem todoItem, boolean z) {
        return false;
    }

    @Override
    public final boolean T1(gm gmVar) {
        return false;
    }

    @Override
    public final int U(gb2 gb2Var) {
        return 0;
    }

    @Override
    public final void U0(int i, int i2) {
        ld9 ld9Var;
        te9 te9Var = ((gc9) this.b).T;
        if (te9Var != null && (ld9Var = te9Var.a.R3) != null) {
            ld9Var.f(i, i2);
        }
    }

    @Override
    public final boolean U1(int i) {
        return true;
    }

    @Override
    public final vu1 W() {
        return null;
    }

    @Override
    public final void Z(k86 k86Var, long j, long j2) {
        boolean z;
        switch (this.a) {
            case 11:
                n53 n53Var = (n53) this.b;
                synchronized (ycd.b) {
                    z = ycd.c;
                }
                if (!z) {
                    n53Var.a.y(new IOException(new ConcurrentModificationException()));
                    return;
                }
                n53Var.a();
                return;
            default:
                cv7 cv7Var = (cv7) k86Var;
                if (((cv8) this.b).a) {
                    hya hyaVar = (hya) cv7Var.f;
                    hyaVar.getClass();
                    cv8 cv8Var = (cv8) this.b;
                    cv8Var.h = hyaVar;
                    ((cdb) cv8Var.d).e(new iya(this, hyaVar, (byte) 0));
                    cv8 cv8Var2 = (cv8) this.b;
                    Uri uri = (Uri) cv8Var2.e;
                    uri.getClass();
                    Uri uri2 = hyaVar.c;
                    if (uri2 != null) {
                        String uri3 = uri2.toString();
                        if (uri3 != null && jxe.a(uri3)[0] != -1) {
                            uri = uri2;
                        } else {
                            uri = jxe.d(uri.toString(), uri2.toString());
                        }
                    }
                    cv8Var2.e = uri;
                    long j3 = hyaVar.b;
                    if (j3 == -9223372036854775807L) {
                        j3 = 300000;
                    }
                    cdb cdbVar = (cdb) ((cv8) this.b).i;
                    cdbVar.getClass();
                    cdbVar.a.postDelayed(new jya((cv8) this.b, (byte) 0), j3);
                    f86 a = cv8.a(cv7Var, j, j2);
                    kp kpVar = (kp) ((cv8) this.b).g;
                    kpVar.getClass();
                    kpVar.p(a, 8);
                    return;
                }
                return;
        }
    }

    @Override
    public final ma8 Z1() {
        return null;
    }

    @Override
    public final void a() {
        r1d r1dVar = (r1d) this.b;
        ReentrantLock reentrantLock = r1dVar.a;
        reentrantLock.lock();
        try {
            r1dVar.m = new j1d(r1dVar, r1dVar.j, r1dVar.k, r1dVar.d, r1dVar.l, reentrantLock, r1dVar.c);
            r1dVar.m.g1();
            r1dVar.b.signalAll();
        } finally {
            r1dVar.a.unlock();
        }
    }

    @Override
    public final int a0() {
        return ((mkb) this.b).b;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 25:
                py7 py7Var = (py7) obj3;
                u5d u5dVar = (u5d) obj;
                Bundle B = u5dVar.B();
                B.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
                l5d l5dVar = new l5d((TaskCompletionSource) obj2, (byte) 0);
                try {
                    wcf wcfVar = (wcf) u5dVar.k();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i = ahd.a;
                    obtain.writeInt(1);
                    py7Var.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    B.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(l5dVar);
                    wcfVar.a.transact(19, obtain, null, 1);
                    obtain.recycle();
                    return;
                } catch (RemoteException e) {
                    Log.e("WalletClientImpl", "RemoteException getting payment data", e);
                    Bundle bundle = Bundle.EMPTY;
                    l5dVar.R(Status.h, null);
                    return;
                }
            default:
                z2f z2fVar = (z2f) ((qnd) obj).k();
                hkd hkdVar = new hkd((TaskCompletionSource) obj2, (byte) 1);
                Parcel R = z2fVar.R();
                int i2 = rgd.a;
                R.writeInt(1);
                ((jb6) obj3).writeToParcel(R, 0);
                rgd.c(R, hkdVar);
                R.writeString(null);
                z2fVar.V(R, 63);
                return;
        }
    }

    @Override
    public final boolean b() {
        return ((tmb) this.b).a();
    }

    @Override
    public final String b1(gb2 gb2Var) {
        return null;
    }

    @Override
    public final boolean c2(long j) {
        return false;
    }

    @Override
    public final WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) hy0.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).createWebView(webView));
    }

    @Override
    public final void d(mc9 mc9Var) {
        te9 te9Var = ((gc9) this.b).T;
        if (te9Var != null) {
            ye9 ye9Var = te9Var.a;
            ye9Var.i4(mc9Var);
            ye9Var.p3.g(mc9Var, true);
        }
    }

    @Override
    public final boolean d0() {
        return false;
    }

    @Override
    public final void d1() {
        te9 te9Var = ((gc9) this.b).T;
        if (te9Var != null) {
            ye9 ye9Var = te9Var.a;
            ld9 ld9Var = ye9Var.R3;
            if (ld9Var != null) {
                ld9Var.g();
            }
            ye9Var.p3.onContentChanged();
        }
    }

    @Override
    public final ig0 e(ig0 ig0Var) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override
    public final CharacterStyle e0(gb2 gb2Var) {
        return null;
    }

    @Override
    public final void f1(View view, float f, float f2) {
        byte b = this.a;
    }

    @Override
    public final void g(View view, float f, float f2) {
        byte b = this.a;
    }

    @Override
    public final void g0() {
        switch (this.a) {
            case 4:
                pg9 pg9Var = (pg9) this.b;
                pg9Var.l0(pg9Var.b0);
                return;
            default:
                ((f6c) this.b).h.c(true);
                return;
        }
    }

    @Override
    public final void g1() {
        r1d r1dVar = (r1d) this.b;
        Iterator it = ((js) r1dVar.f.values()).iterator();
        while (it.hasNext()) {
            ((xx4) it.next()).c();
        }
        r1dVar.o.G = Collections.EMPTY_SET;
    }

    @Override
    public final boolean g2(k27 k27Var) {
        return true;
    }

    @Override
    public final Object mo9get() {
        return new x5a((h6a) ((kt8) this.b).mo9get());
    }

    @Override
    public final CharSequence getContentDescription() {
        mkb mkbVar = (mkb) this.b;
        return String.valueOf(Math.round((mkbVar.a.getProgress() * mkbVar.b) + 0.0f));
    }

    @Override
    public final long getLongPressDuration() {
        byte b = this.a;
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override
    public final StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) hy0.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).getStatics());
    }

    @Override
    public final java.lang.Object h(defpackage.ik4 r5, defpackage.fw2 r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v39.h(ik4, fw2):java.lang.Object");
    }

    @Override
    public final boolean h0() {
        return ((tmb) this.b).a();
    }

    @Override
    public final boolean h1(gb2 gb2Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final void j(boolean z, float f) {
        mkb mkbVar = (mkb) this.b;
        mkbVar.e.B0(Math.round((mkbVar.b * f) + 0.0f), false);
    }

    @Override
    public final void j0(String str, long j, long j2, long j3) {
        ndd nddVar = (ndd) this.b;
        try {
            nddVar.a(new vcd(new Status(2103, null, null, null), (byte) 1));
        } catch (IllegalStateException e) {
            dc6 dc6Var = i69.k;
            Log.e(dc6Var.a, dc6Var.d("Result already set when calling onRequestReplaced", new Object[0]), e);
        }
        Iterator it = nddVar.q.i.iterator();
        while (it.hasNext()) {
            ((h69) it.next()).h(str, j, 2103, j2, j3);
        }
    }

    @Override
    public final void k(float f, float f2) {
        switch (this.a) {
            case 4:
                pg9 pg9Var = (pg9) this.b;
                og9 i0 = pg9Var.i0(f, f2);
                og9 og9Var = pg9Var.b0;
                if (i0 != og9Var) {
                    og9Var = null;
                }
                pg9Var.l0(og9Var);
                return;
            default:
                return;
        }
    }

    @Override
    public final boolean k2(gb2 gb2Var, TLRPC.User user) {
        return false;
    }

    @Override
    public final boolean l() {
        return true;
    }

    @Override
    public final boolean l2(gb2 gb2Var) {
        return false;
    }

    @Override
    public final void m() {
        gc9 gc9Var = (gc9) this.b;
        te9 te9Var = gc9Var.T;
        if (te9Var != null) {
            te9Var.a.T3(gc9Var.a);
        }
    }

    @Override
    public final void n(View view, float f, float f2) {
        byte b = this.a;
    }

    @Override
    public final void n0(int i) {
        ds2 ds2Var;
        k3d k3dVar = (k3d) this.b;
        ReentrantLock reentrantLock = k3dVar.o;
        reentrantLock.lock();
        try {
            if (!k3dVar.n && (ds2Var = k3dVar.m) != null && ds2Var.c()) {
                k3dVar.n = true;
                k3dVar.e.onConnectionSuspended(i);
            } else {
                k3dVar.n = false;
                k3dVar.b.n0(i);
                k3dVar.m = null;
                k3dVar.l = null;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override
    public final void o(ds2 ds2Var) {
        k3d k3dVar = (k3d) this.b;
        ReentrantLock reentrantLock = k3dVar.o;
        reentrantLock.lock();
        try {
            k3dVar.l = ds2Var;
            k3dVar.j();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override
    public final void o0() {
        switch (this.a) {
            case 4:
                pg9 pg9Var = (pg9) this.b;
                pg9Var.l0(null);
                pg9Var.b0 = null;
                return;
            default:
                ((f6c) this.b).h.c(false);
                return;
        }
    }

    @Override
    public final void o1(yz6 yz6Var) {
        Toolbar toolbar = (Toolbar) this.b;
        b9 b9Var = toolbar.a.K;
        if (b9Var != null && b9Var.f()) {
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) toolbar.a0.c).iterator();
        while (it.hasNext()) {
            ((zn4) it.next()).a.t();
        }
    }

    @Override
    public final void onComplete(Task task) {
        ((CountDownLatch) this.b).countDown();
    }

    @Override
    public final void r(int i) {
        ypc ypcVar = (ypc) this.b;
        if (!ypcVar.r && i == ypcVar.K) {
            ypcVar.i0(ypcVar.O.getText().toString().trim());
        }
    }

    @Override
    public final boolean r0(gb2 gb2Var, boolean z) {
        return false;
    }

    @Override
    public final fib s0() {
        te9 te9Var = ((gc9) this.b).T;
        if (te9Var == null) {
            return null;
        }
        return te9Var.a.getTextSelectionHelper();
    }

    @Override
    public final boolean s1() {
        switch (this.a) {
            case 4:
                return true;
            default:
                return false;
        }
    }

    @Override
    public final vf6 t1() {
        return null;
    }

    @Override
    public final void v(k86 k86Var, long j, long j2, boolean z) {
        switch (this.a) {
            case 11:
                return;
            default:
                cv7 cv7Var = (cv7) k86Var;
                cv8 cv8Var = (cv8) this.b;
                if (cv8Var.a) {
                    f86 a = cv8.a(cv7Var, j, j2);
                    kp kpVar = (kp) cv8Var.g;
                    kpVar.getClass();
                    kpVar.o(a, 8, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean w0(gb2 gb2Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final i86 w1(k86 k86Var, long j, long j2, IOException iOException, int i) {
        int i2;
        long j3;
        switch (this.a) {
            case 11:
                ((n53) this.b).a.y(iOException);
                return mv6.y;
            default:
                cv7 cv7Var = (cv7) k86Var;
                i86 i86Var = mv6.y;
                cv8 cv8Var = (cv8) this.b;
                if (cv8Var.a) {
                    if (iOException instanceof lg5) {
                        i2 = ((lg5) iOException).c;
                    } else {
                        i2 = Integer.MAX_VALUE;
                    }
                    boolean z = false;
                    if (i2 == 410) {
                        mv6 mv6Var = (mv6) cv8Var.j;
                        mv6Var.getClass();
                        mv6Var.b0(null);
                        cdb cdbVar = (cdb) cv8Var.i;
                        cdbVar.getClass();
                        cdbVar.f();
                        j3 = -9223372036854775807L;
                    } else {
                        j3 = 300000;
                        if (i2 == 429) {
                            List list = (List) cv7Var.d.d.get("Retry-After");
                            if (list != null) {
                                try {
                                    j3 = 1000 * Long.parseLong((String) list.get(0));
                                } catch (NumberFormatException unused) {
                                    lad.f("SteeringManifestTracker", "Retry-After header string doesn't contain a parsable long");
                                }
                            }
                        } else {
                            hya hyaVar = (hya) cv8Var.h;
                            if (hyaVar != null) {
                                long j4 = hyaVar.b;
                                if (j4 != -9223372036854775807L) {
                                    j3 = j4;
                                }
                            }
                        }
                    }
                    if (j3 != -9223372036854775807L) {
                        cdb cdbVar2 = (cdb) cv8Var.i;
                        cdbVar2.getClass();
                        cdbVar2.a.postDelayed(new jya(cv8Var, (byte) 1), j3);
                    } else {
                        z = true;
                    }
                    ((cdb) cv8Var.d).e(new k08(this, iOException, z));
                    f86 a = cv8.a(cv7Var, j, j2);
                    kp kpVar = (kp) cv8Var.g;
                    kpVar.getClass();
                    kpVar.s(a, 8, iOException, z);
                }
                return i86Var;
        }
    }

    @Override
    public final String x(long j) {
        return null;
    }

    @Override
    public final void y0(CharSequence charSequence) {
        te9 te9Var = ((gc9) this.b).T;
        if (te9Var != null && charSequence != null && charSequence.length() > 0) {
            te9Var.a.u4(charSequence.toString());
        }
    }

    @Override
    public final boolean y1() {
        return false;
    }

    @Override
    public final boolean y2(int i) {
        return false;
    }

    @Override
    public final boolean z1(k27 k27Var) {
        return oo1.a(k27Var);
    }

    public v39(byte b) {
        this.a = b;
    }

    @Override
    public final void A() {
    }

    @Override
    public final void B0() {
    }

    @Override
    public final void C2() {
    }

    @Override
    public final void J() {
    }

    @Override
    public final void R1() {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void i1() {
    }

    @Override
    public final void p() {
    }

    @Override
    public final void p1() {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void u2() {
    }

    @Override
    public final void D1(h27 h27Var) {
    }

    @Override
    public final void E(gb2 gb2Var) {
    }

    @Override
    public final void H1(long j) {
    }

    @Override
    public final void H2(gb2 gb2Var) {
    }

    @Override
    public final void I(gb2 gb2Var) {
    }

    @Override
    public final void L0(long j) {
    }

    @Override
    public final void M1(gb2 gb2Var) {
    }

    @Override
    public final void N0(gb2 gb2Var) {
    }

    @Override
    public final void Q0(boolean z) {
    }

    @Override
    public final void S(gb2 gb2Var) {
    }

    @Override
    public final void V(gb2 gb2Var) {
    }

    @Override
    public final void X(k27 k27Var) {
    }

    @Override
    public final void X0(gb2 gb2Var) {
    }

    @Override
    public final void X1(gb2 gb2Var) {
    }

    @Override
    public final void Y1(gb2 gb2Var) {
    }

    @Override
    public final void Z0(float f) {
    }

    @Override
    public final void c0(int i) {
    }

    @Override
    public final void c1(gb2 gb2Var) {
    }

    @Override
    public final void e1(float f) {
    }

    @Override
    public final void e2(gb2 gb2Var) {
    }

    @Override
    public final void f(int i) {
    }

    @Override
    public final void f0(float f) {
    }

    @Override
    public final void i(Bundle bundle) {
    }

    @Override
    public final void i0(k27 k27Var) {
    }

    @Override
    public final void k0(String str) {
    }

    @Override
    public final void k1(float f) {
    }

    @Override
    public final void l1(gb2 gb2Var) {
    }

    @Override
    public final void m0(boolean z) {
    }

    @Override
    public final void m2(ArrayList arrayList) {
    }

    @Override
    public final void n1(gb2 gb2Var) {
    }

    @Override
    public final void q(gb2 gb2Var) {
    }

    @Override
    public final void q0(gb2 gb2Var) {
    }

    @Override
    public final void q1(gb2 gb2Var) {
    }

    @Override
    public final void t0(int i) {
    }

    @Override
    public final void u(float f) {
    }

    @Override
    public final void u1(float f) {
    }

    @Override
    public final void v2(gb2 gb2Var) {
    }

    @Override
    public final void w(float f) {
    }

    @Override
    public final void x0(float f) {
    }

    @Override
    public final void x1(gb2 gb2Var) {
    }

    private final void V1(float f, float f2) {
    }

    @Override
    public final void B1(int i, long j) {
    }

    @Override
    public final void C1(gb2 gb2Var, boolean z) {
    }

    @Override
    public final void E0(gb2 gb2Var, long j) {
    }

    @Override
    public final void M0(gb2 gb2Var, boolean z) {
    }

    @Override
    public final void O1(gb2 gb2Var, iq0 iq0Var) {
    }

    @Override
    public final void V0(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void W0(float f, int i) {
    }

    @Override
    public final void Y(gb2 gb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void b2(String str, String str2) {
    }

    @Override
    public final void d2(gb2 gb2Var, k08 k08Var) {
    }

    @Override
    public final void j1(float f, int i) {
    }

    @Override
    public final void j2(gb2 gb2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void l0(gb2 gb2Var, int i) {
    }

    @Override
    public final void p0(float f, int i) {
    }

    @Override
    public final void u0(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void y(long j, boolean z) {
    }

    private final void h2(View view, float f, float f2) {
    }

    private final void n2(View view, float f, float f2) {
    }

    private final void o2(View view, float f, float f2) {
    }

    private final void p2(View view, float f, float f2) {
    }

    private final void q2(View view, float f, float f2) {
    }

    private final void r2(View view, float f, float f2) {
    }

    @Override
    public final void G1(gb2 gb2Var, boolean z, boolean z2) {
    }

    @Override
    public final void H(gb2 gb2Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public final void O(gb2 gb2Var, CharacterStyle characterStyle, boolean z) {
    }

    @Override
    public final void W1(gb2 gb2Var, TLObject tLObject, boolean z) {
    }

    @Override
    public final void Y0(gb2 gb2Var, float f, float f2) {
    }

    @Override
    public final void a1(ds2 ds2Var, yn ynVar, boolean z) {
    }

    @Override
    public final void s2(gb2 gb2Var, float f, float f2) {
    }

    @Override
    public final void v0(gb2 gb2Var, int i, int i2) {
    }

    @Override
    public final void v1(gb2 gb2Var, float f, float f2) {
    }

    @Override
    public final void x2(gb2 gb2Var, boolean z, boolean z2) {
    }

    @Override
    public final void z(gb2 gb2Var, float f, float f2) {
    }

    private final void a2(k86 k86Var, long j, long j2, boolean z) {
    }

    private final void f2(k86 k86Var, long j, long j2, int i) {
    }

    @Override
    public final void D(gb2 gb2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void b0(gb2 gb2Var, TLRPC.User user, float f, float f2) {
    }

    @Override
    public final void s(gb2 gb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    @Override
    public final void z0(gb2 gb2Var, float f, float f2, boolean z) {
    }

    @Override
    public final void m1(gb2 gb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
    }

    @Override
    public final void r1(gb2 gb2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    @Override
    public final void i2(gb2 gb2Var, TLRPC.Chat chat, int i, float f, float f2, boolean z) {
    }
}
