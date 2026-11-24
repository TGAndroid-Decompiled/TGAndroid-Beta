package defpackage;

import android.graphics.SurfaceTexture;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.json.JSONObject;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.StickersActivity;
public final class x59 implements wec, zw9, gk, rd9, me9, jca, qq7, ldc, w5a, mga, d73, cja, ocb, cx9, ugc, WebMessageListenerBoundaryInterface, h89, m8a {
    public final byte a;
    public Object b;

    public x59(View view) {
        this.a = (byte) 14;
        if (Build.VERSION.SDK_INT >= 30) {
            ?? et8Var = new et8(view, (byte) 13);
            et8Var.c = view;
            this.b = et8Var;
            return;
        }
        this.b = new et8(view, (byte) 13);
    }

    @Override
    public final int A(View view) {
        return f69.w(view) - ((ViewGroup.MarginLayoutParams) ((g69) view.getLayoutParams())).leftMargin;
    }

    @Override
    public final void B(f7a f7aVar, boolean z) {
        me1 me1Var = (me1) f7aVar;
    }

    @Override
    public final void C(f7a f7aVar, int i) {
        me1 me1Var = (me1) f7aVar;
    }

    @Override
    public final wzc C0(View view, wzc wzcVar) {
        switch (this.a) {
            case 8:
                iq5 H0 = gm.H0(wzcVar, false);
                vs9 vs9Var = (vs9) this.b;
                vs9Var.w.setPadding(H0.a, H0.b, H0.c, H0.d);
                vs9Var.s.requestLayout();
                return wzc.b;
            default:
                krb krbVar = (krb) this.b;
                iq5 g = wzcVar.a.g(519);
                krbVar.n = g;
                krbVar.c.setPadding(g.a, g.b, g.c, g.d);
                krbVar.b.requestLayout();
                return wzc.b;
        }
    }

    @Override
    public final boolean D(int i) {
        ogc ogcVar = ((wgc) this.b).M;
        if (ogcVar == null) {
            return false;
        }
        return ogcVar.c(i);
    }

    @Override
    public final int E() {
        return ((f69) this.b).C();
    }

    @Override
    public final void E1() {
        rh9 rh9Var = ((th9) this.b).H;
        if (rh9Var != null) {
            ch9 ch9Var = ((yg9) rh9Var).a;
            of9 of9Var = ch9Var.R3;
            if (of9Var != null) {
                of9Var.g();
            }
            ch9Var.p3.onContentChanged();
        }
    }

    @Override
    public final boolean F() {
        switch (this.a) {
            case 7:
                if (gm.C3()) {
                    ((pp9) this.b).J.k(0L, 33, null, null, null, null);
                }
                return true;
            default:
                ((StickersActivity) this.b).e0();
                return true;
        }
    }

    @Override
    public final boolean G(ne9 ne9Var) {
        return false;
    }

    @Override
    public final gkb H0() {
        rh9 rh9Var = ((th9) this.b).H;
        if (rh9Var != null) {
            return ((yg9) rh9Var).a.getTextSelectionHelper();
        }
        return null;
    }

    @Override
    public final void I() {
        ((bu5) this.b).j();
    }

    @Override
    public final long J(long j, long j2) {
        return 0L;
    }

    @Override
    public final a8 K(String str) {
        a8 g = ((bu5) this.b).g();
        g.setText(str);
        return g;
    }

    @Override
    public final void L(f7a f7aVar, int i) {
        me1 me1Var = (me1) f7aVar;
    }

    @Override
    public final int N() {
        f69 f69Var = (f69) this.b;
        return f69Var.m - f69Var.D();
    }

    @Override
    public final void O(ArrayList arrayList) {
        ogc ogcVar = ((wgc) this.b).M;
        if (ogcVar == null) {
            return;
        }
        ogcVar.a(arrayList);
    }

    @Override
    public final void O0(CharSequence charSequence) {
        rh9 rh9Var = ((th9) this.b).H;
        if (rh9Var != null) {
            yg9 yg9Var = (yg9) rh9Var;
            if (charSequence != null && charSequence.length() > 0) {
                yg9Var.a.u4(charSequence.toString());
            }
        }
    }

    @Override
    public final void P(f7a f7aVar, String str) {
        me1 me1Var = (me1) f7aVar;
    }

    @Override
    public final void Q() {
        a6a a6aVar = (a6a) this.b;
        HashMap hashMap = a6aVar.n;
        a6aVar.getNotificationCenter().k(nm7.R0, new HashMap(hashMap));
        hashMap.clear();
    }

    @Override
    public final void R(f7a f7aVar, String str) {
        gt6 gt6Var;
        me1 me1Var = (me1) f7aVar;
        ce6 ce6Var = zfd.i;
        zfd zfdVar = (zfd) this.b;
        ce6Var.b("onSessionStarted with transferType = %d", Integer.valueOf(zfdVar.e));
        if (zfdVar.a.E && zfdVar.e == 2) {
            if (zfdVar.h == null) {
                ce6Var.b("skip restoring session state due to null SessionState", new Object[0]);
            } else {
                k89 a = zfdVar.a();
                if (a == null) {
                    ce6Var.b("skip restoring session state due to null RemoteMediaClient", new Object[0]);
                } else {
                    ce6Var.b("resume SessionState to current session", new Object[0]);
                    r8a r8aVar = zfdVar.h;
                    if (r8aVar != null && (gt6Var = r8aVar.a) != null) {
                        k89.k.b("resume SessionState", new Object[0]);
                        ite.e("Must be called from the main thread.");
                        if (!a.w()) {
                            k89.t();
                        } else {
                            k89.x(new qbd(a, gt6Var, (byte) 1));
                        }
                    }
                }
            }
        }
        zfdVar.c();
    }

    @Override
    public final void S(Editable editable) {
        ((ck9) this.b).g();
    }

    @Override
    public final boolean T() {
        return true;
    }

    @Override
    public final void U(Location location) {
        a6a a6aVar = (a6a) this.b;
        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeo.geo = tL_geoPoint;
        tL_geoPoint.lat = gm.b0(location.getLatitude());
        tL_messageMediaGeo.geo._long = gm.b0(location.getLongitude());
        HashMap hashMap = a6aVar.n;
        for (Map.Entry entry : hashMap.entrySet()) {
            k47 k47Var = (k47) entry.getValue();
            a6aVar.q0(y5a.d(tL_messageMediaGeo, k47.B0(k47Var.k), k47Var, null, null, null, true, 0));
        }
        hashMap.clear();
    }

    @Override
    public final long V() {
        return 0L;
    }

    @Override
    public final void W(ne9 ne9Var) {
        ll0 ll0Var;
        ck9 ck9Var = (ck9) this.b;
        ak9 ak9Var = ck9Var.s;
        if (ak9Var != null && (ll0Var = ck9Var.a) != null) {
            ch9 ch9Var = ((jg9) ak9Var).a;
            ArrayList arrayList = ch9Var.t3;
            long j = ll0Var.t;
            if (j != 0) {
                int i = -1;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (((ll0) arrayList.get(i2)).k.contains(Long.valueOf(j))) {
                        i = i2;
                    }
                }
                if (i >= 0) {
                    of9 of9Var = ch9Var.R3;
                    if (of9Var != null) {
                        of9Var.d();
                    }
                    ll0 ll0Var2 = new ll0(new TL_iv.pageBlockParagraph(), 0, 0);
                    ArrayList arrayList2 = ll0Var.k;
                    ArrayList arrayList3 = ll0Var2.k;
                    arrayList3.addAll(arrayList2);
                    if (!arrayList3.isEmpty()) {
                        td4.w(1, arrayList3);
                    }
                    arrayList.add(i + 1, ll0Var2);
                    ch9Var.t4();
                    ch9Var.g3.O(false);
                    of9 of9Var2 = ch9Var.R3;
                    if (of9Var2 != null) {
                        of9Var2.h();
                    }
                    ch9Var.post(new vf9(ch9Var, ll0Var2, (byte) 26));
                }
            }
        }
    }

    @Override
    public final long X(long j) {
        return 1L;
    }

    @Override
    public final View Y(int i) {
        return ((f69) this.b).q(i);
    }

    @Override
    public final fkb Y0() {
        return (th9) this.b;
    }

    @Override
    public final boolean Z(boolean z) {
        return false;
    }

    @Override
    public final void a(int i, boolean z) {
        wgc wgcVar = (wgc) this.b;
        wgcVar.E = z;
        wgcVar.d = i;
        wgcVar.K(1);
        wgcVar.z(i, z);
        View[] viewArr = wgcVar.e;
        int i2 = 0;
        View view = viewArr[0];
        if (view != null) {
            i2 = view.getMeasuredWidth();
        }
        View view2 = viewArr[1];
        if (view2 != null) {
            if (z) {
                wgcVar.F(view2, i2);
            } else {
                wgcVar.F(view2, -i2);
            }
        }
    }

    @Override
    public final int a0(View view) {
        return f69.x(view) + ((ViewGroup.MarginLayoutParams) ((g69) view.getLayoutParams())).rightMargin;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 25:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                c5d c5dVar = (c5d) ((k5d) obj).k();
                Parcel c = c5dVar.c();
                g4d.b(c, (nib) this.b);
                try {
                    c5dVar.b.transact(1, c, null, 1);
                    c.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Throwable th) {
                    c.recycle();
                    throw th;
                }
            case 26:
                r5d r5dVar = new r5d((TaskCompletionSource) obj2);
                n6d n6dVar = (n6d) ((t5d) obj).k();
                String str = ((s5d) this.b).l;
                Parcel e = n6dVar.e();
                int i = y5d.a;
                e.writeStrongBinder(r5dVar);
                e.writeString(str);
                n6dVar.f(e, 2);
                return;
            case 27:
                mt5 mt5Var = (mt5) this.b;
                w7d w7dVar = (w7d) obj;
                w7dVar.getClass();
                n7d n7dVar = new n7d((TaskCompletionSource) obj2, (byte) 1);
                try {
                    xef xefVar = (xef) w7dVar.k();
                    Bundle B = w7dVar.B();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i2 = bjd.a;
                    obtain.writeInt(1);
                    mt5Var.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    B.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(n7dVar);
                    xefVar.a.transact(14, obtain, null, 1);
                    obtain.recycle();
                    return;
                } catch (RemoteException e2) {
                    Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e2);
                    Bundle bundle = Bundle.EMPTY;
                    fxe.a(Status.h, Boolean.FALSE, n7dVar.c);
                    return;
                }
            default:
                mjf mjfVar = (mjf) obj;
                z8d z8dVar = (z8d) mjfVar.k();
                ugd ugdVar = ((bhd) this.b).l;
                Parcel R = z8dVar.R();
                kid.d(R, ugdVar);
                z8dVar.W(R, 18);
                z8d z8dVar2 = (z8d) mjfVar.k();
                z8dVar2.W(z8dVar2.R(), 17);
                ((TaskCompletionSource) obj2).setResult(null);
                return;
        }
    }

    @Override
    public final boolean b() {
        wgc wgcVar = (wgc) this.b;
        if (!wgcVar.y && !wgcVar.I) {
            return true;
        }
        return false;
    }

    @Override
    public final float b0() {
        int d;
        switch (this.a) {
            case 15:
                d = eh0.d(((nxa) this.b).c0);
                break;
            default:
                d = eh0.d(((yfb) this.b).c0);
                break;
        }
        return b10.c(9.66f, d, 0);
    }

    @Override
    public final void c() {
        ((wgc) this.b).q();
    }

    @Override
    public final a8 c0(int i, Runnable runnable, String str, boolean z, boolean z2) {
        bu5 bu5Var = (bu5) this.b;
        int y = bu5Var.y();
        bu5Var.b(i, str, new yl6(runnable, z2, bu5Var, (byte) 23), z);
        View x = bu5Var.x(y);
        if (x instanceof a8) {
            return (a8) x;
        }
        return null;
    }

    @Override
    public final void d(ne9 ne9Var) {
        switch (this.a) {
            case 5:
                rh9 rh9Var = ((th9) this.b).H;
                if (rh9Var != null) {
                    ch9 ch9Var = ((yg9) rh9Var).a;
                    ch9Var.i4(ne9Var);
                    ch9Var.p3.j(ne9Var, true);
                    return;
                }
                return;
            default:
                ak9 ak9Var = ((ck9) this.b).s;
                if (ak9Var != null) {
                    ch9 ch9Var2 = ((jg9) ak9Var).a;
                    ch9Var2.i4(ne9Var);
                    ch9Var2.p3.j(ne9Var, true);
                    return;
                }
                return;
        }
    }

    @Override
    public final ll0 d1() {
        return ((th9) this.b).a;
    }

    @Override
    public final long e(long j) {
        return 0L;
    }

    @Override
    public final long e0(long j, long j2) {
        return 1L;
    }

    @Override
    public final void f(float f) {
        id9 id9Var = (id9) this.b;
        k47 k47Var = id9Var.Q;
        if (k47Var == null) {
            return;
        }
        k47Var.b0 = f;
        MediaController.w().h0(id9Var.Q, f);
    }

    public final void f0() {
        c99 c99Var = ((e99) this.b).d;
        if (c99Var != null) {
            b99 b99Var = c99Var.s;
            if (b99Var != null) {
                c99Var.cancelRunnable(b99Var);
                c99Var.s = null;
            }
            b99 b99Var2 = new b99(c99Var, (byte) 1);
            c99Var.s = b99Var2;
            c99Var.postRunnable(b99Var2, 1L);
        }
    }

    @Override
    public final void g(float f) {
        int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        wgc wgcVar = (wgc) this.b;
        View[] viewArr = wgcVar.e;
        if (i == 0) {
            if (viewArr[1] != null) {
                wgcVar.G();
                wgcVar.h.put(wgcVar.f[1], viewArr[1]);
                wgcVar.removeView(viewArr[1]);
                wgcVar.F(viewArr[0], 0.0f);
                viewArr[1] = null;
            }
            wgcVar.A(wgcVar.b);
            return;
        }
        View view = viewArr[1];
        if (view == null) {
            return;
        }
        if (wgcVar.E) {
            wgcVar.F(view, (1.0f - f) * viewArr[0].getMeasuredWidth());
            View view2 = viewArr[0];
            wgcVar.F(view2, (-view2.getMeasuredWidth()) * f);
        } else {
            wgcVar.F(view, (1.0f - f) * (-viewArr[0].getMeasuredWidth()));
            View view3 = viewArr[0];
            wgcVar.F(view3, view3.getMeasuredWidth() * f);
        }
        wgcVar.x(false);
    }

    @Override
    public final boolean g1() {
        rh9 rh9Var = ((th9) this.b).H;
        if (rh9Var != null && ((yg9) rh9Var).a.V4()) {
            return true;
        }
        return false;
    }

    @Override
    public final CharSequence getContentDescription() {
        return null;
    }

    @Override
    public final String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override
    public final void h(float f) {
        k47 k47Var = ((id9) this.b).Q;
        if (k47Var == null) {
            return;
        }
        k47Var.b0 = f;
    }

    @Override
    public final int h0() {
        switch (this.a) {
            case 15:
                return ((nxa) this.b).d0;
            default:
                return ((yfb) this.b).d0;
        }
    }

    @Override
    public final boolean i() {
        return false;
    }

    public final r9a i0(JSONObject jSONObject) {
        iaa jk2Var;
        int i = jSONObject.getInt("settings_version");
        if (i != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.", null);
            jk2Var = new q7f((byte) 17);
        } else {
            jk2Var = new jk2((byte) 26);
        }
        return jk2Var.q0((k1f) this.b, jSONObject);
    }

    @Override
    public final int j0() {
        return 0;
    }

    @Override
    public final void j2() {
        rh9 rh9Var = ((th9) this.b).H;
        if (rh9Var != null) {
            ((yg9) rh9Var).a.W3();
        }
    }

    public final void k0(u69 u69Var, az8 az8Var, az8 az8Var2) {
        int i;
        int i2;
        boolean z;
        u69 T;
        int i3;
        RecyclerView recyclerView = (RecyclerView) this.b;
        recyclerView.b.l(u69Var);
        recyclerView.h(u69Var);
        u69Var.q(false);
        jka jkaVar = (jka) recyclerView.d0;
        jkaVar.getClass();
        int i4 = az8Var.b;
        int i5 = az8Var.c;
        View view = u69Var.a;
        if (az8Var2 == null) {
            i2 = view.getLeft();
            i = view.getTop();
        } else {
            int i6 = az8Var2.b;
            i = az8Var2.c;
            i2 = i6;
        }
        if (!u69Var.j() && (i4 != i2 || i5 != i)) {
            view.layout(i2, i, view.getWidth() + i2, view.getHeight() + i);
            z = jkaVar.r(u69Var, az8Var, i4, i5, i2, i);
        } else {
            int i7 = u69Var.h;
            int i8 = -1;
            if (i7 != -1) {
                for (int i9 = 0; i9 < recyclerView.getChildCount(); i9++) {
                    View childAt = recyclerView.getChildAt(i9);
                    if (childAt != null && (T = recyclerView.T(childAt)) != null && !T.j() && (i3 = T.h) >= 0 && i3 < i7 && i3 > i8) {
                        i8 = i3;
                    }
                }
            }
            u69Var.i = (u69Var.h - i8) + (i8 * 1000);
            jkaVar.s(u69Var, az8Var);
            z = true;
        }
        if (z) {
            recyclerView.n0();
        }
    }

    @Override
    public final void l(f7a f7aVar, int i) {
        me1 me1Var = (me1) f7aVar;
        ce6 ce6Var = zfd.i;
        ce6Var.b("onSessionEnded with error = %d", Integer.valueOf(i));
        zfd zfdVar = (zfd) this.b;
        byte b = zfdVar.e;
        if (b == 0) {
            ce6Var.b("No need to notify transferred if the transfer type is unknown", new Object[0]);
        } else if (zfdVar.h == null) {
            ce6Var.b("No need to notify with null sessionState", new Object[0]);
        } else {
            ce6Var.b("notify transferred with type = %d, sessionState = %s", Integer.valueOf(b), zfdVar.h);
            Iterator it = new HashSet(zfdVar.b).iterator();
            while (it.hasNext()) {
                bpe bpeVar = (bpe) it.next();
                byte b2 = zfdVar.e;
                switch (bpeVar.a) {
                    case 0:
                        hue.j.b("onTransferred with type = %d", Integer.valueOf(b2));
                        hue hueVar = (hue) bpeVar.b;
                        hueVar.c();
                        y5f b3 = hueVar.c.b(hueVar.g);
                        m5f m = n5f.m(b3.d());
                        m.c();
                        n5f.v((n5f) m.b, b2);
                        b3.e((n5f) m.a());
                        hueVar.a.a((a6f) b3.a(), 231);
                        hueVar.i = false;
                        hueVar.g = null;
                        break;
                }
            }
        }
        if (zfdVar.e == 2) {
            return;
        }
        zfdVar.c();
    }

    public final void l0(u69 u69Var) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        f69 f69Var = recyclerView.y;
        View view = u69Var.a;
        ki2 ki2Var = recyclerView.b;
        mx6 mx6Var = f69Var.a;
        ai4 ai4Var = (ai4) mx6Var.b;
        int indexOfChild = ((RecyclerView) ai4Var.b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((vh2) mx6Var.c).z(indexOfChild)) {
                mx6Var.y0(view);
            }
            ai4Var.S(indexOfChild);
        }
        ki2Var.h(view);
    }

    @Override
    public final long m(long j, long j2) {
        return 0L;
    }

    @Override
    public final void n(boolean z, float f) {
        rob robVar = (rob) this.b;
        robVar.n1 = f;
        robVar.p1();
    }

    @Override
    public final void o(f7a f7aVar) {
        me1 me1Var = (me1) f7aVar;
    }

    @Override
    public final void onPostMessage(android.webkit.WebView r8, java.lang.reflect.InvocationHandler r9, android.net.Uri r10, boolean r11, java.lang.reflect.InvocationHandler r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x59.onPostMessage(android.webkit.WebView, java.lang.reflect.InvocationHandler, android.net.Uri, boolean, java.lang.reflect.InvocationHandler):void");
    }

    @Override
    public final void onRenderedFirstFrame() {
        gm.c3(new kf9(this, (byte) 24));
    }

    @Override
    public final void onStateChanged(boolean z, int i) {
        tw9 tw9Var = (tw9) this.b;
        if (i == 4) {
            tw9Var.dismiss();
            return;
        }
        gm.r(tw9Var.a0);
        gm.d3(tw9Var.a0, 16L);
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public final void p() {
        th9 th9Var = (th9) this.b;
        rh9 rh9Var = th9Var.H;
        if (rh9Var != null) {
            ((yg9) rh9Var).a.T3(th9Var.a);
        }
    }

    @Override
    public final void q(f7a f7aVar, int i) {
        me1 me1Var = (me1) f7aVar;
    }

    @Override
    public final void r(ne9 ne9Var, int i, int i2) {
        ak9 ak9Var;
        gkb textSelectionHelper;
        ck9 ck9Var = (ck9) this.b;
        if (!ck9Var.x && i != i2 && (ak9Var = ck9Var.s) != null && (textSelectionHelper = ((jg9) ak9Var).a.getTextSelectionHelper()) != null) {
            ne9Var.post(new g01(this, ne9Var, i2, textSelectionHelper, i, (byte) 4));
        }
    }

    @Override
    public final void r1(int i, int i2) {
        of9 of9Var;
        rh9 rh9Var = ((th9) this.b).H;
        if (rh9Var != null && (of9Var = ((yg9) rh9Var).a.R3) != null) {
            of9Var.f(i, i2);
        }
    }

    @Override
    public final void s() {
        switch (this.a) {
            case 7:
                return;
            default:
                ((StickersActivity) this.b).e0();
                return;
        }
    }

    @Override
    public final void t(boolean z) {
        switch (this.a) {
            case 15:
                nxa nxaVar = (nxa) this.b;
                fn0 fn0Var = nxaVar.Z;
                if (fn0Var != null) {
                    fn0Var.a(z, true);
                }
                g15 g15Var = nxaVar.s;
                if (g15Var != null) {
                    g15Var.invalidate();
                    return;
                }
                return;
            default:
                yfb yfbVar = (yfb) this.b;
                fn0 fn0Var2 = yfbVar.Z;
                if (fn0Var2 != null) {
                    fn0Var2.a(z, true);
                }
                g15 g15Var2 = yfbVar.s;
                if (g15Var2 != null) {
                    g15Var2.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final long u(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override
    public final boolean v(ne9 ne9Var) {
        return false;
    }

    @Override
    public final b19 w(long j) {
        return (b19) this.b;
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        jf9 jf9Var = (jf9) this.b;
        jf9Var.w0(i, i2, z);
        j67 j67Var = jf9Var.P0;
        if (j67Var != null) {
            j67Var.g();
            jf9Var.P0 = null;
        }
    }

    @Override
    public final void z(f7a f7aVar) {
        me1 me1Var = (me1) f7aVar;
    }

    @Override
    public final void onRenderedFirstFrame(tk tkVar) {
    }

    private final void g0() {
    }

    @Override
    public final void H() {
    }

    @Override
    public final void d0() {
    }

    @Override
    public final void x() {
    }

    @Override
    public final void M(CharSequence charSequence) {
    }

    @Override
    public final void onSeekFinished(tk tkVar) {
    }

    @Override
    public final void onSeekStarted(tk tkVar) {
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public x59(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public x59(byte b) {
        this.a = b;
        switch (b) {
            case 21:
                return;
            default:
                this.b = new fgf((byte) 17);
                return;
        }
    }

    @Override
    public final long j(long j, long j2) {
        return j2;
    }

    @Override
    public final void k(int i, int i2) {
    }

    @Override
    public final void onError(ndc ndcVar, Exception exc) {
    }

    @Override
    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
    }
}
