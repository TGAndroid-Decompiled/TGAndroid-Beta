package defpackage;

import android.content.SharedPreferences;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
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
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ProfileActivity;
public final class oo8 implements o7, ln5, rd9, uj2, im4, lv8, ga6, fqb, cx9, mc2, w17, au9, qwc, r3d, a4d, h89, hbd {
    public final byte a;
    public Object b;

    public oo8(ai4 ai4Var) {
        this.a = (byte) 3;
        this.b = (fhd) ai4Var.b;
    }

    @Override
    public final boolean A0(long j) {
        return false;
    }

    @Override
    public final boolean B(y17 y17Var, MenuItem menuItem) {
        return false;
    }

    @Override
    public final void C0(int i) {
        ot2 ot2Var;
        m5d m5dVar = (m5d) this.b;
        ReentrantLock reentrantLock = m5dVar.o;
        reentrantLock.lock();
        try {
            if (!m5dVar.n && (ot2Var = m5dVar.m) != null && ot2Var.c()) {
                m5dVar.n = true;
                m5dVar.e.onConnectionSuspended(i);
            } else {
                m5dVar.n = false;
                m5dVar.b.C0(i);
                m5dVar.m = null;
                m5dVar.l = null;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override
    public final boolean D1(gn gnVar) {
        return false;
    }

    @Override
    public final boolean E(rc2 rc2Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final void E1() {
        xg9 xg9Var = ((he9) this.b).T;
        if (xg9Var != null) {
            ch9 ch9Var = xg9Var.a;
            of9 of9Var = ch9Var.R3;
            if (of9Var != null) {
                of9Var.g();
            }
            ch9Var.p3.onContentChanged();
        }
    }

    @Override
    public final boolean F1(int i) {
        return true;
    }

    @Override
    public final vh6 G0() {
        return null;
    }

    @Override
    public final void G1(View view, float f, float f2) {
        byte b = this.a;
    }

    @Override
    public final void H(rc2 rc2Var, int i, float f, float f2, boolean z) {
        uob uobVar = (uob) this.b;
        zcb zcbVar = uobVar.E;
        if (uobVar.a()) {
            uobVar.y = 0;
            rc2Var.invalidate();
            gm.r(zcbVar);
            gm.d3(zcbVar, 5000L);
        }
    }

    @Override
    public final gkb H0() {
        xg9 xg9Var = ((he9) this.b).T;
        if (xg9Var == null) {
            return null;
        }
        return xg9Var.a.getTextSelectionHelper();
    }

    @Override
    public final void I(float f, float f2) {
        uj9 uj9Var;
        mc2 mc2Var;
        switch (this.a) {
            case 8:
                si9 si9Var = (si9) this.b;
                ri9 ri9Var = si9Var.b0;
                if (ri9Var != null && (mc2Var = (uj9Var = si9Var.a).F) != null) {
                    mc2Var.L0(uj9Var.E, ri9Var.c);
                    return;
                }
                return;
            default:
                Runnable runnable = ((g8c) this.b).j;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean J0(rc2 rc2Var, TLRPC.TodoItem todoItem, boolean z) {
        return false;
    }

    @Override
    public final boolean K() {
        return false;
    }

    @Override
    public final void K1() {
        t3d t3dVar = (t3d) this.b;
        Iterator it = ((kt) t3dVar.f.values()).iterator();
        while (it.hasNext()) {
            ((zz4) it.next()).c();
        }
        t3dVar.o.G = Collections.EMPTY_SET;
    }

    @Override
    public final void L(ImageReceiver imageReceiver) {
        pr8 pr8Var = ((sr8) this.b).h.H0;
        if (pr8Var != null) {
            pr8Var.d();
        }
    }

    @Override
    public final pc8 M1() {
        return null;
    }

    @Override
    public final boolean N() {
        return false;
    }

    @Override
    public final int O() {
        return 0;
    }

    @Override
    public final void O0(CharSequence charSequence) {
        xg9 xg9Var = ((he9) this.b).T;
        if (xg9Var != null && charSequence != null && charSequence.length() > 0) {
            xg9Var.a.u4(charSequence.toString());
        }
    }

    @Override
    public final boolean O1(long j) {
        return false;
    }

    @Override
    public final String P0(rc2 rc2Var) {
        return null;
    }

    @Override
    public final int Q(rc2 rc2Var) {
        return 0;
    }

    @Override
    public final String[] R0() {
        return ((WebViewProviderFactoryBoundaryInterface) this.b).getSupportedFeatures();
    }

    @Override
    public final hw1 S() {
        return null;
    }

    @Override
    public final boolean S0(rc2 rc2Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final void T1(y17 y17Var) {
        Toolbar toolbar = (Toolbar) this.b;
        b9 b9Var = toolbar.a.K;
        if (b9Var != null && b9Var.f()) {
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) toolbar.a0.c).iterator();
        while (it.hasNext()) {
            ((aq4) it.next()).a.t();
        }
    }

    @Override
    public final boolean U1(k47 k47Var) {
        return true;
    }

    @Override
    public final void W0(ja6 ja6Var, long j, long j2, int i) {
        switch (this.a) {
            case 14:
                return;
            default:
                dx7 dx7Var = (dx7) ja6Var;
                dx8 dx8Var = (dx8) this.b;
                if (dx8Var.a) {
                    ea6 a = dx8.a(dx7Var, j, j2);
                    kq kqVar = (kq) dx8Var.g;
                    kqVar.getClass();
                    kqVar.u(a, 8, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
                    return;
                }
                return;
        }
    }

    @Override
    public final void X(boolean z, float f) {
        ((o6b) this.b).a(Boolean.FALSE, Float.valueOf(f));
    }

    @Override
    public final fkb Y0() {
        return (he9) this.b;
    }

    @Override
    public final boolean Y1(rc2 rc2Var, TLRPC.User user) {
        return false;
    }

    @Override
    public final boolean Z() {
        return false;
    }

    @Override
    public final boolean Z1(rc2 rc2Var) {
        return false;
    }

    @Override
    public final void a() {
        t3d t3dVar = (t3d) this.b;
        ReentrantLock reentrantLock = t3dVar.a;
        reentrantLock.lock();
        try {
            t3dVar.m = new l3d(t3dVar, t3dVar.j, t3dVar.k, t3dVar.d, t3dVar.l, reentrantLock, t3dVar.c);
            t3dVar.m.K1();
            t3dVar.b.signalAll();
        } finally {
            t3dVar.a.unlock();
        }
    }

    @Override
    public final CharacterStyle a0(rc2 rc2Var) {
        return null;
    }

    @Override
    public final boolean a1(float f, float f2) {
        switch (this.a) {
            case 8:
                si9 si9Var = (si9) this.b;
                ri9 h0 = si9Var.h0(f, f2);
                h0 = (h0 == null || h0.b) ? null : null;
                si9Var.b0 = h0;
                if (h0 != null) {
                    return true;
                }
                return false;
            default:
                int L = gm.L(9.0f);
                RectF rectF = ((g8c) this.b).g;
                float f3 = -L;
                rectF.inset(f3, f3);
                boolean contains = rectF.contains(f, f2);
                float f4 = L;
                rectF.inset(f4, f4);
                return contains;
        }
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        r08 r08Var = (r08) this.b;
        w7d w7dVar = (w7d) obj;
        Bundle B = w7dVar.B();
        B.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        n7d n7dVar = new n7d((TaskCompletionSource) obj2, (byte) 0);
        try {
            xef xefVar = (xef) w7dVar.k();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            int i = bjd.a;
            obtain.writeInt(1);
            r08Var.writeToParcel(obtain, 0);
            obtain.writeInt(1);
            B.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(n7dVar);
            xefVar.a.transact(19, obtain, null, 1);
            obtain.recycle();
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException getting payment data", e);
            Bundle bundle = Bundle.EMPTY;
            n7dVar.R(Status.h, null);
        }
    }

    @Override
    public final boolean b() {
        return ((uob) this.b).a();
    }

    @Override
    public final boolean b2() {
        switch (this.a) {
            case 8:
                return true;
            default:
                return false;
        }
    }

    @Override
    public final void c0(java.lang.String r13, long r14, int r16, defpackage.tad r17, long r18, long r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oo8.c0(java.lang.String, long, int, tad, long, long):void");
    }

    @Override
    public final boolean c1(View view, float f, float f2) {
        switch (this.a) {
            case 8:
                si9 si9Var = (si9) this.b;
                if (si9Var.b0 == null) {
                    return false;
                }
                ri9 h0 = si9Var.h0(f, f2);
                ri9 ri9Var = si9Var.b0;
                if (h0 != ri9Var) {
                    return false;
                }
                uj9 uj9Var = si9Var.a;
                mc2 mc2Var = uj9Var.F;
                if (mc2Var != null) {
                    mc2Var.m0(uj9Var.E, ri9Var.c);
                }
                return true;
            default:
                return false;
        }
    }

    @Override
    public final WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) oz0.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).createWebView(webView));
    }

    @Override
    public final void d(ne9 ne9Var) {
        xg9 xg9Var = ((he9) this.b).T;
        if (xg9Var != null) {
            ch9 ch9Var = xg9Var.a;
            ch9Var.i4(ne9Var);
            ch9Var.p3.j(ne9Var, true);
        }
    }

    @Override
    public final boolean d0() {
        return ((uob) this.b).a();
    }

    @Override
    public final ll0 d1() {
        return ((he9) this.b).a;
    }

    @Override
    public final jh0 e(jh0 jh0Var) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override
    public final vh6 e1() {
        return null;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final boolean f0() {
        byte b = this.a;
        return true;
    }

    @Override
    public final ha6 f2(ja6 ja6Var, long j, long j2, IOException iOException, int i) {
        int i2;
        long j3;
        switch (this.a) {
            case 14:
                ((z63) this.b).a.y(iOException);
                return mx6.y;
            default:
                dx7 dx7Var = (dx7) ja6Var;
                ha6 ha6Var = mx6.y;
                dx8 dx8Var = (dx8) this.b;
                if (dx8Var.a) {
                    if (iOException instanceof ki5) {
                        i2 = ((ki5) iOException).c;
                    } else {
                        i2 = Integer.MAX_VALUE;
                    }
                    boolean z = false;
                    if (i2 == 410) {
                        mx6 mx6Var = (mx6) dx8Var.j;
                        mx6Var.getClass();
                        mx6Var.e0(null);
                        dfb dfbVar = (dfb) dx8Var.i;
                        dfbVar.getClass();
                        dfbVar.f();
                        j3 = -9223372036854775807L;
                    } else {
                        j3 = 300000;
                        if (i2 == 429) {
                            List list = (List) dx7Var.d.d.get("Retry-After");
                            if (list != null) {
                                try {
                                    j3 = 1000 * Long.parseLong((String) list.get(0));
                                } catch (NumberFormatException unused) {
                                    ncd.f("SteeringManifestTracker", "Retry-After header string doesn't contain a parsable long");
                                }
                            }
                        } else {
                            k0b k0bVar = (k0b) dx8Var.h;
                            if (k0bVar != null) {
                                long j4 = k0bVar.b;
                                if (j4 != -9223372036854775807L) {
                                    j3 = j4;
                                }
                            }
                        }
                    }
                    if (j3 != -9223372036854775807L) {
                        dfb dfbVar2 = (dfb) dx8Var.i;
                        dfbVar2.getClass();
                        dfbVar2.a.postDelayed(new l0b(dx8Var, (byte) 1), j3);
                    } else {
                        z = true;
                    }
                    ((dfb) dx8Var.d).e(new n28(this, iOException, z));
                    ea6 a = dx8.a(dx7Var, j, j2);
                    kq kqVar = (kq) dx8Var.g;
                    kqVar.getClass();
                    kqVar.s(a, 8, iOException, z);
                }
                return ha6Var;
        }
    }

    @Override
    public final java.lang.Object g(defpackage.jm4 r5, defpackage.px2 r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oo8.g(jm4, px2):java.lang.Object");
    }

    @Override
    public final void g0(ja6 ja6Var, long j, long j2) {
        boolean z;
        switch (this.a) {
            case 14:
                z63 z63Var = (z63) this.b;
                synchronized (afd.b) {
                    z = afd.c;
                }
                if (!z) {
                    z63Var.a.y(new IOException(new ConcurrentModificationException()));
                    return;
                }
                z63Var.a();
                return;
            default:
                dx7 dx7Var = (dx7) ja6Var;
                if (((dx8) this.b).a) {
                    k0b k0bVar = (k0b) dx7Var.f;
                    k0bVar.getClass();
                    dx8 dx8Var = (dx8) this.b;
                    dx8Var.h = k0bVar;
                    ((dfb) dx8Var.d).e(new uva(this, k0bVar, (byte) 2));
                    dx8 dx8Var2 = (dx8) this.b;
                    Uri uri = (Uri) dx8Var2.e;
                    uri.getClass();
                    Uri uri2 = k0bVar.c;
                    if (uri2 != null) {
                        String uri3 = uri2.toString();
                        if (uri3 != null && lze.a(uri3)[0] != -1) {
                            uri = uri2;
                        } else {
                            uri = lze.d(uri.toString(), uri2.toString());
                        }
                    }
                    dx8Var2.e = uri;
                    long j3 = k0bVar.b;
                    if (j3 == -9223372036854775807L) {
                        j3 = 300000;
                    }
                    dfb dfbVar = (dfb) ((dx8) this.b).i;
                    dfbVar.getClass();
                    dfbVar.a.postDelayed(new l0b((dx8) this.b, (byte) 0), j3);
                    ea6 a = dx8.a(dx7Var, j, j2);
                    kq kqVar = (kq) ((dx8) this.b).g;
                    kqVar.getClass();
                    kqVar.p(a, 8);
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean g1() {
        xg9 xg9Var = ((he9) this.b).T;
        if (xg9Var != null && xg9Var.a.V4()) {
            return true;
        }
        return false;
    }

    @Override
    public final Object mo8get() {
        return new z7a((j8a) ((lv8) this.b).mo8get());
    }

    @Override
    public final CharSequence getContentDescription() {
        nmb nmbVar = (nmb) this.b;
        return String.valueOf(Math.round((nmbVar.a.getProgress() * nmbVar.b) + 0.0f));
    }

    @Override
    public final long getLongPressDuration() {
        byte b = this.a;
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override
    public final StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) oz0.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).getStatics());
    }

    @Override
    public final void h2() {
        RectF rectF = ProfileActivity.e7;
        vs9.d(new vh8((ProfileActivity) this.b, (byte) 3));
    }

    @Override
    public final void j(View view, float f, float f2) {
        byte b = this.a;
    }

    @Override
    public final int j0() {
        return ((nmb) this.b).b;
    }

    @Override
    public final void j1(Bundle bundle) {
        m5d m5dVar = (m5d) this.b;
        ReentrantLock reentrantLock = m5dVar.o;
        reentrantLock.lock();
        try {
            Bundle bundle2 = m5dVar.k;
            if (bundle2 == null) {
                m5dVar.k = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            m5dVar.l = ot2.f;
            m5dVar.j();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override
    public final void j2() {
        xg9 xg9Var = ((he9) this.b).T;
        if (xg9Var != null) {
            xg9Var.a.W3();
        }
    }

    @Override
    public final void l(float f, float f2) {
        switch (this.a) {
            case 8:
                si9 si9Var = (si9) this.b;
                ri9 h0 = si9Var.h0(f, f2);
                ri9 ri9Var = si9Var.b0;
                if (h0 != ri9Var) {
                    ri9Var = null;
                }
                si9Var.k0(ri9Var);
                return;
            default:
                return;
        }
    }

    @Override
    public final boolean l0(rc2 rc2Var, boolean z) {
        return false;
    }

    @Override
    public final boolean l1() {
        return false;
    }

    @Override
    public final boolean m1(k47 k47Var) {
        return aq1.a(k47Var);
    }

    @Override
    public final boolean m2(int i) {
        return false;
    }

    @Override
    public final void n(boolean z, float f) {
        nmb nmbVar = (nmb) this.b;
        nmbVar.e.C0(Math.round((nmbVar.b * f) + 0.0f), false);
    }

    @Override
    public final boolean n1(rc2 rc2Var, int i) {
        if (i == ((uob) this.b).y) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean n2(rc2 rc2Var, k47 k47Var) {
        return false;
    }

    @Override
    public final void o(int i) {
        asc ascVar = (asc) this.b;
        if (!ascVar.r && i == ascVar.K) {
            ascVar.j0(ascVar.O.getText().toString().trim());
        }
    }

    @Override
    public final void p() {
        he9 he9Var = (he9) this.b;
        xg9 xg9Var = he9Var.T;
        if (xg9Var != null) {
            xg9Var.a.T3(he9Var.a);
        }
    }

    @Override
    public final boolean p0(rc2 rc2Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final boolean p1() {
        return true;
    }

    @Override
    public final hkb p2() {
        return null;
    }

    @Override
    public final void q0() {
        switch (this.a) {
            case 8:
                si9 si9Var = (si9) this.b;
                si9Var.k0(si9Var.b0);
                return;
            default:
                ((g8c) this.b).h.c(true);
                return;
        }
    }

    @Override
    public final void r(View view, float f, float f2) {
        byte b = this.a;
    }

    @Override
    public final void r1(int i, int i2) {
        of9 of9Var;
        xg9 xg9Var = ((he9) this.b).T;
        if (xg9Var != null && (of9Var = xg9Var.a.R3) != null) {
            of9Var.f(i, i2);
        }
    }

    public final int r2(int[] iArr, int i) {
        int[] iArr2;
        int[] iArr3;
        int i2;
        int i3;
        int i4;
        iu4 iu4Var = (iu4) this.b;
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
                int i8 = iu4Var.a[(iu4Var.g ? 1 : 0) + i7];
                if (i8 == 0) {
                    i4 = iArr2[iArr2.length - 1];
                } else {
                    if (i8 == 1) {
                        i3 = 0;
                        for (int i9 : iArr2) {
                            iu4 iu4Var2 = iu4.h;
                            i3 ^= i9;
                        }
                    } else {
                        i3 = iArr2[0];
                        int length2 = iArr2.length;
                        for (int i10 = 1; i10 < length2; i10++) {
                            i3 = iu4Var.c(i8, i3) ^ iArr2[i10];
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
            ju4 ju4Var = new ju4(iu4Var, iArr5);
            ju4 a = iu4Var.a(i, 1);
            ju4 ju4Var2 = iu4Var.c;
            if (a.d() >= ju4Var.d()) {
                a = ju4Var;
                ju4Var = a;
            }
            ju4 ju4Var3 = iu4Var.d;
            ju4 ju4Var4 = a;
            ju4 ju4Var5 = ju4Var;
            ju4 ju4Var6 = ju4Var4;
            ju4 ju4Var7 = ju4Var2;
            while ((ju4Var6.d() << 1) >= i) {
                if (!ju4Var6.e()) {
                    int b = iu4Var.b(ju4Var6.c(ju4Var6.d()));
                    ju4 ju4Var8 = ju4Var2;
                    while (ju4Var5.d() >= ju4Var6.d() && !ju4Var5.e()) {
                        int d = ju4Var5.d() - ju4Var6.d();
                        int c = iu4Var.c(ju4Var5.c(ju4Var5.d()), b);
                        ju4Var8 = ju4Var8.a(iu4Var.a(d, c));
                        ju4Var5 = ju4Var5.a(ju4Var6.h(d, c));
                    }
                    ju4 a2 = ju4Var8.g(ju4Var3).a(ju4Var7);
                    if (ju4Var5.d() < ju4Var6.d()) {
                        ju4 ju4Var9 = ju4Var5;
                        ju4Var5 = ju4Var6;
                        ju4Var6 = ju4Var9;
                        ju4Var7 = ju4Var3;
                        ju4Var3 = a2;
                    } else {
                        throw new IllegalStateException("Division algorithm failed to reduce polynomial? r: " + ju4Var5 + ", rLast: " + ju4Var6);
                    }
                } else {
                    throw new Exception("r_{i-1} was zero");
                }
            }
            int c2 = ju4Var3.c(0);
            if (c2 != 0) {
                int b2 = iu4Var.b(c2);
                ju4[] ju4VarArr = {ju4Var3.f(b2), ju4Var6.f(b2)};
                ju4 ju4Var10 = ju4VarArr[0];
                ju4 ju4Var11 = ju4VarArr[1];
                int d2 = ju4Var10.d();
                if (d2 == 1) {
                    iArr3 = new int[]{ju4Var10.c(1)};
                } else {
                    int[] iArr6 = new int[d2];
                    int i11 = 0;
                    for (int i12 = 1; i12 < iu4Var.e && i11 < d2; i12++) {
                        if (ju4Var10.b(i12) == 0) {
                            iArr6[i11] = iu4Var.b(i12);
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
                    int b3 = iu4Var.b(iArr3[i13]);
                    int i14 = 1;
                    for (int i15 = 0; i15 < length3; i15++) {
                        if (i13 != i15) {
                            int c3 = iu4Var.c(iArr3[i15], b3);
                            if ((c3 & 1) == 0) {
                                i2 = c3 | 1;
                            } else {
                                i2 = c3 & (-2);
                            }
                            i14 = iu4Var.c(i14, i2);
                        }
                    }
                    int c4 = iu4Var.c(ju4Var11.b(b3), iu4Var.b(i14));
                    iArr7[i13] = c4;
                    if (iu4Var.g) {
                        iArr7[i13] = iu4Var.c(c4, b3);
                    }
                }
                for (int i16 = 0; i16 < iArr3.length; i16++) {
                    int length4 = iArr.length - 1;
                    int i17 = iArr3[i16];
                    if (i17 != 0) {
                        int i18 = length4 - iu4Var.b[i17];
                        if (i18 >= 0) {
                            iArr[i18] = iArr[i18] ^ iArr7[i16];
                        } else {
                            throw new Exception("Bad error location");
                        }
                    } else {
                        i98.g();
                        return 0;
                    }
                }
                return iArr3.length;
            }
            throw new Exception("sigmaTilde(0) was zero");
        }
        i98.g();
        return 0;
    }

    public final void s2(ga gaVar) {
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
    public final String t(long j) {
        return null;
    }

    @Override
    public final boolean t0(rc2 rc2Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final void t1(rc2 rc2Var, int i) {
        uob uobVar = (uob) this.b;
        zcb zcbVar = uobVar.E;
        if (uobVar.a()) {
            uobVar.y = 2;
            rc2Var.invalidate();
            gm.r(zcbVar);
            gm.d3(zcbVar, 5000L);
        }
    }

    public final void t2(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int T = recyclerView.e.T();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < T; i6++) {
            View S = recyclerView.e.S(i6);
            u69 U = RecyclerView.U(S);
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
                ((g69) S.getLayoutParams()).c = true;
            }
        }
        ki2 ki2Var = recyclerView.b;
        ArrayList arrayList2 = (ArrayList) ki2Var.e;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            u69 u69Var = (u69) arrayList2.get(size);
            if (u69Var != null && (i3 = u69Var.c) >= i && i3 < i5) {
                u69Var.a(2);
                ki2Var.g(size);
            }
        }
        recyclerView.z0 = true;
    }

    @Override
    public final void u0(String str, long j, long j2, long j3) {
        pfd pfdVar = (pfd) this.b;
        try {
            pfdVar.a(new xed(new Status(2103, null, null, null), (byte) 1));
        } catch (IllegalStateException e) {
            ce6 ce6Var = k89.k;
            Log.e(ce6Var.a, ce6Var.d("Result already set when calling onRequestReplaced", new Object[0]), e);
        }
        Iterator it = pfdVar.q.i.iterator();
        while (it.hasNext()) {
            ((j89) it.next()).h(str, j, 2103, j2, j3);
        }
    }

    public final void u2(int i, int i2) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int T = recyclerView.e.T();
        for (int i3 = 0; i3 < T; i3++) {
            u69 U = RecyclerView.U(recyclerView.e.S(i3));
            if (U != null && !U.r() && U.c >= i) {
                U.n(i2, false);
                recyclerView.v0.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.b.e;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            u69 u69Var = (u69) arrayList.get(i4);
            if (u69Var != null && u69Var.c >= i) {
                u69Var.n(i2, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.y0 = true;
    }

    @Override
    public final void v(ot2 ot2Var) {
        m5d m5dVar = (m5d) this.b;
        ReentrantLock reentrantLock = m5dVar.o;
        reentrantLock.lock();
        try {
            m5dVar.l = ot2Var;
            m5dVar.j();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void v2(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int T = recyclerView.e.T();
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
        for (int i11 = 0; i11 < T; i11++) {
            u69 U = RecyclerView.U(recyclerView.e.S(i11));
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
            u69 u69Var = (u69) arrayList.get(i12);
            if (u69Var != null && (i8 = u69Var.c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    u69Var.n(i2 - i, false);
                } else {
                    u69Var.n(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.y0 = true;
    }

    @Override
    public final void w(ja6 ja6Var, long j, long j2, boolean z) {
        switch (this.a) {
            case 14:
                return;
            default:
                dx7 dx7Var = (dx7) ja6Var;
                dx8 dx8Var = (dx8) this.b;
                if (dx8Var.a) {
                    ea6 a = dx8.a(dx7Var, j, j2);
                    kq kqVar = (kq) dx8Var.g;
                    kqVar.getClass();
                    kqVar.o(a, 8, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void w1(k47 k47Var, String str, String str2, String str3, String str4, int i, int i2) {
        uob uobVar = (uob) this.b;
        zcb zcbVar = uobVar.E;
        if (uobVar.a()) {
            uobVar.y = 2;
            gm.r(zcbVar);
            gm.d3(zcbVar, 5000L);
        }
    }

    @Override
    public final boolean x0(rc2 rc2Var) {
        return false;
    }

    @Override
    public final void x1(rc2 rc2Var, TLRPC.WebPage webPage, String str, boolean z) {
        l11.u(rc2Var.getContext(), str);
    }

    public final void x2(int i) {
        boolean z;
        TLRPC.TL_exportedNoPaidMessagesToken c;
        my8 my8Var = ((iy8) this.b).e;
        if (my8Var != null && my8Var.d != i) {
            boolean z2 = true;
            byte b = i;
            b = i;
            if (my8Var.c.d && i == 2) {
                b = 1;
            }
            my8Var.d = b;
            SharedPreferences.Editor edit = my8Var.f().edit();
            if (my8Var.d == 2) {
                z = true;
            } else {
                z = false;
            }
            edit.putBoolean("qrNoPaidPermanent", z).apply();
            byte b2 = my8Var.d;
            if (b2 == 0) {
                if (my8Var.n != 0) {
                    ConnectionsManager.getInstance(my8Var.a).cancelRequest(my8Var.n, true);
                    my8Var.n = 0;
                    return;
                }
                return;
            }
            if (b2 == 2 && (c = my8Var.c()) != null) {
                my8Var.f = c;
                my8Var.b.setFreeLink(my8Var.d(c));
            }
            if (my8Var.d != 1) {
                z2 = false;
            }
            my8Var.n(false, z2);
        }
    }

    @Override
    public final void y0() {
        switch (this.a) {
            case 8:
                si9 si9Var = (si9) this.b;
                si9Var.k0(null);
                si9Var.b0 = null;
                return;
            default:
                ((g8c) this.b).h.c(false);
                return;
        }
    }

    @Override
    public final boolean z1() {
        return false;
    }

    public oo8(byte b) {
        this.a = b;
    }

    public oo8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void C1() {
    }

    @Override
    public final void T0() {
    }

    @Override
    public final void V() {
    }

    @Override
    public final void V1() {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void g2() {
    }

    @Override
    public final void i() {
    }

    @Override
    public final void o2() {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void s0() {
    }

    @Override
    public final void x() {
    }

    @Override
    public final void z0() {
    }

    @Override
    public final void A(rc2 rc2Var) {
    }

    @Override
    public final void F0(rc2 rc2Var) {
    }

    @Override
    public final void G(rc2 rc2Var) {
    }

    @Override
    public final void H1(float f) {
    }

    @Override
    public final void I0(int i) {
    }

    @Override
    public final void J(Bundle bundle) {
    }

    @Override
    public final void J1(rc2 rc2Var) {
    }

    @Override
    public final void K0(float f) {
    }

    @Override
    public final void L1(rc2 rc2Var) {
    }

    @Override
    public final void M0(rc2 rc2Var) {
    }

    @Override
    public final void P(rc2 rc2Var) {
    }

    @Override
    public final void Q0(rc2 rc2Var) {
    }

    @Override
    public final void Q1(rc2 rc2Var) {
    }

    @Override
    public final void R(rc2 rc2Var) {
    }

    @Override
    public final void S1(float f) {
    }

    @Override
    public final void T(k47 k47Var) {
    }

    @Override
    public final void U0(rc2 rc2Var) {
    }

    @Override
    public final void X0(rc2 rc2Var) {
    }

    @Override
    public final void Y(int i) {
    }

    @Override
    public final void Z0(rc2 rc2Var) {
    }

    @Override
    public final void a2(ArrayList arrayList) {
    }

    @Override
    public final void c2(float f) {
    }

    @Override
    public final void e0(k47 k47Var) {
    }

    @Override
    public final void f1(long j) {
    }

    @Override
    public final void h(int i) {
    }

    @Override
    public final void h0(String str) {
    }

    @Override
    public final void h1(boolean z) {
    }

    @Override
    public final void i2(rc2 rc2Var) {
    }

    @Override
    public final void k(rc2 rc2Var) {
    }

    @Override
    public final void k0(rc2 rc2Var) {
    }

    @Override
    public final void k1(rc2 rc2Var) {
    }

    @Override
    public final void k2(long j) {
    }

    @Override
    public final void n0(float f) {
    }

    @Override
    public final void q1(h47 h47Var) {
    }

    @Override
    public final void q2(rc2 rc2Var) {
    }

    @Override
    public final void s(float f) {
    }

    @Override
    public final void v1(float f) {
    }

    @Override
    public final void w0(boolean z) {
    }

    @Override
    public final void y(float f) {
    }

    @Override
    public final void y1(rc2 rc2Var) {
    }

    private final void w2(float f, float f2) {
    }

    @Override
    public final void B0(int i, Drawable drawable) {
    }

    @Override
    public final void B1(rc2 rc2Var, ir0 ir0Var) {
    }

    @Override
    public final void C(long j, boolean z) {
    }

    @Override
    public final void D0(rc2 rc2Var, boolean z) {
    }

    @Override
    public final void E0(float f, int i) {
    }

    @Override
    public final void L0(rc2 rc2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void N1(String str, String str2) {
    }

    @Override
    public final void P1(rc2 rc2Var, n28 n28Var) {
    }

    @Override
    public final void R1(float f, int i) {
    }

    @Override
    public final void U(rc2 rc2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void X1(rc2 rc2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void e2(int i, long j) {
    }

    @Override
    public final void i0(rc2 rc2Var, int i) {
    }

    @Override
    public final void m0(rc2 rc2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void o1(rc2 rc2Var, boolean z) {
    }

    @Override
    public final void s1(float f, int i) {
    }

    @Override
    public final void v0(rc2 rc2Var, long j) {
    }

    private final void A2(View view, float f, float f2) {
    }

    private final void B2(View view, float f, float f2) {
    }

    private final void C2(View view, float f, float f2) {
    }

    private final void D2(View view, float f, float f2) {
    }

    private final void E2(View view, float f, float f2) {
    }

    private final void F2(View view, float f, float f2) {
    }

    @Override
    public final void A1(ot2 ot2Var, zo zoVar, boolean z) {
    }

    @Override
    public final void F(rc2 rc2Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public final void I1(rc2 rc2Var, TLObject tLObject, boolean z) {
    }

    @Override
    public final void M(rc2 rc2Var, CharacterStyle characterStyle, boolean z) {
    }

    @Override
    public final void N0(rc2 rc2Var, float f, float f2) {
    }

    @Override
    public final void d2(rc2 rc2Var, float f, float f2) {
    }

    @Override
    public final void i1(rc2 rc2Var, float f, float f2) {
    }

    @Override
    public final void l2(rc2 rc2Var, boolean z, boolean z2) {
    }

    @Override
    public final void o0(rc2 rc2Var, int i, int i2) {
    }

    @Override
    public final void u(rc2 rc2Var, float f, float f2) {
    }

    @Override
    public final void u1(rc2 rc2Var, boolean z, boolean z2) {
    }

    private final void y2(ja6 ja6Var, long j, long j2, boolean z) {
    }

    private final void z2(ja6 ja6Var, long j, long j2, int i) {
    }

    @Override
    public final void W(rc2 rc2Var, TLRPC.User user, float f, float f2) {
    }

    @Override
    public final void b0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
    }

    @Override
    public final void m(rc2 rc2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    @Override
    public final void r0(rc2 rc2Var, float f, float f2, boolean z) {
    }

    @Override
    public final void z(rc2 rc2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void V0(rc2 rc2Var, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
    }

    @Override
    public final void b1(rc2 rc2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    @Override
    public final void W1(rc2 rc2Var, TLRPC.Chat chat, int i, float f, float f2, boolean z) {
    }
}
