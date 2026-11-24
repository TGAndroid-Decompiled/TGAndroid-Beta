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
public final class u39 implements vcc, wu9, gj, rb9, lc9, jaa, no7, ibc, v3a, mea, r53, aha, nab, zu9, uec, WebMessageListenerBoundaryInterface, f69, k6a {
    public final byte a;
    public Object b;

    public u39(View view) {
        this.a = (byte) 14;
        if (Build.VERSION.SDK_INT >= 30) {
            ?? g29Var = new g29(view, (byte) 12);
            g29Var.c = view;
            this.b = g29Var;
            return;
        }
        this.b = new g29(view, (byte) 12);
    }

    @Override
    public final boolean A(mc9 mc9Var) {
        return false;
    }

    @Override
    public final boolean B(int i) {
        oec oecVar = ((wec) this.b).M;
        if (oecVar == null) {
            return false;
        }
        return oecVar.c(i);
    }

    @Override
    public final long C(long j, long j2) {
        return 0L;
    }

    @Override
    public final int D() {
        return ((d49) this.b).C();
    }

    @Override
    public final void E(d5a d5aVar, boolean z) {
        ed1 ed1Var = (ed1) d5aVar;
    }

    @Override
    public final void E1() {
        nf9 nf9Var = ((pf9) this.b).H;
        if (nf9Var != null) {
            ((ue9) nf9Var).a.W3();
        }
    }

    @Override
    public final void F(d5a d5aVar, int i) {
        ed1 ed1Var = (ed1) d5aVar;
    }

    @Override
    public final void G() {
        switch (this.a) {
            case 7:
                if (gl.C3()) {
                    ((on9) this.b).J.k(0L, 33, null, null, null, null);
                    return;
                }
                return;
            default:
                ((StickersActivity) this.b).d0();
                return;
        }
    }

    @Override
    public final eib G0() {
        return (pf9) this.b;
    }

    @Override
    public final boolean H(mc9 mc9Var) {
        return false;
    }

    @Override
    public final lk0 I0() {
        return ((pf9) this.b).a;
    }

    @Override
    public final void J() {
        ((cs5) this.b).j();
    }

    @Override
    public final void K(d5a d5aVar, int i) {
        ed1 ed1Var = (ed1) d5aVar;
    }

    @Override
    public final a8 L(String str) {
        a8 g = ((cs5) this.b).g();
        g.setText(str);
        return g;
    }

    @Override
    public final int M() {
        d49 d49Var = (d49) this.b;
        return d49Var.m - d49Var.D();
    }

    @Override
    public final void N(ArrayList arrayList) {
        oec oecVar = ((wec) this.b).M;
        if (oecVar == null) {
            return;
        }
        oecVar.a(arrayList);
    }

    @Override
    public final float P() {
        int d;
        switch (this.a) {
            case 15:
                d = dg0.d(((jva) this.b).c0);
                break;
            default:
                d = dg0.d(((ydb) this.b).c0);
                break;
        }
        return b00.c(9.66f, d, 0);
    }

    @Override
    public final boolean P0() {
        nf9 nf9Var = ((pf9) this.b).H;
        if (nf9Var != null && ((ue9) nf9Var).a.V4()) {
            return true;
        }
        return false;
    }

    @Override
    public final int Q() {
        switch (this.a) {
            case 15:
                return ((jva) this.b).d0;
            default:
                return ((ydb) this.b).d0;
        }
    }

    @Override
    public final void R(d5a d5aVar, String str) {
        ed1 ed1Var = (ed1) d5aVar;
    }

    @Override
    public final void S() {
        z3a z3aVar = (z3a) this.b;
        HashMap hashMap = z3aVar.n;
        z3aVar.getNotificationCenter().k(kk7.Q0, new HashMap(hashMap));
        hashMap.clear();
    }

    @Override
    public final void T(d5a d5aVar, String str) {
        gr6 gr6Var;
        ed1 ed1Var = (ed1) d5aVar;
        dc6 dc6Var = ydd.i;
        ydd yddVar = (ydd) this.b;
        dc6Var.b("onSessionStarted with transferType = %d", Integer.valueOf(yddVar.e));
        if (yddVar.a.E && yddVar.e == 2) {
            if (yddVar.h == null) {
                dc6Var.b("skip restoring session state due to null SessionState", new Object[0]);
            } else {
                i69 a = yddVar.a();
                if (a == null) {
                    dc6Var.b("skip restoring session state due to null RemoteMediaClient", new Object[0]);
                } else {
                    dc6Var.b("resume SessionState to current session", new Object[0]);
                    p6a p6aVar = yddVar.h;
                    if (p6aVar != null && (gr6Var = p6aVar.a) != null) {
                        i69.k.b("resume SessionState", new Object[0]);
                        fre.e("Must be called from the main thread.");
                        if (!a.w()) {
                            i69.t();
                        } else {
                            i69.x(new o9d(a, gr6Var, (byte) 1));
                        }
                    }
                }
            }
        }
        yddVar.c();
    }

    @Override
    public final void U(Editable editable) {
        ((ai9) this.b).g();
    }

    @Override
    public final void U0(int i, int i2) {
        ld9 ld9Var;
        nf9 nf9Var = ((pf9) this.b).H;
        if (nf9Var != null && (ld9Var = ((ue9) nf9Var).a.R3) != null) {
            ld9Var.f(i, i2);
        }
    }

    @Override
    public final boolean V() {
        return true;
    }

    @Override
    public final vxc W(View view, vxc vxcVar) {
        switch (this.a) {
            case 8:
                io5 H0 = gl.H0(vxcVar, false);
                tq9 tq9Var = (tq9) this.b;
                tq9Var.w.setPadding(H0.a, H0.b, H0.c, H0.d);
                tq9Var.s.requestLayout();
                return vxc.b;
            default:
                jpb jpbVar = (jpb) this.b;
                io5 g = vxcVar.a.g(519);
                jpbVar.n = g;
                jpbVar.c.setPadding(g.a, g.b, g.c, g.d);
                jpbVar.b.requestLayout();
                return vxc.b;
        }
    }

    @Override
    public final void X(Location location) {
        z3a z3aVar = (z3a) this.b;
        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeo.geo = tL_geoPoint;
        tL_geoPoint.lat = gl.b0(location.getLatitude());
        tL_messageMediaGeo.geo._long = gl.b0(location.getLongitude());
        HashMap hashMap = z3aVar.n;
        for (Map.Entry entry : hashMap.entrySet()) {
            k27 k27Var = (k27) entry.getValue();
            z3aVar.q0(x3a.d(tL_messageMediaGeo, k27.B0(k27Var.k), k27Var, null, null, null, true, 0));
        }
        hashMap.clear();
    }

    @Override
    public final void Y(mc9 mc9Var) {
        lk0 lk0Var;
        ai9 ai9Var = (ai9) this.b;
        yh9 yh9Var = ai9Var.s;
        if (yh9Var != null && (lk0Var = ai9Var.a) != null) {
            ye9 ye9Var = ((fe9) yh9Var).a;
            ArrayList arrayList = ye9Var.t3;
            long j = lk0Var.t;
            if (j != 0) {
                int i = -1;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (((lk0) arrayList.get(i2)).k.contains(Long.valueOf(j))) {
                        i = i2;
                    }
                }
                if (i >= 0) {
                    ld9 ld9Var = ye9Var.R3;
                    if (ld9Var != null) {
                        ld9Var.d();
                    }
                    lk0 lk0Var2 = new lk0(new TL_iv.pageBlockParagraph(), 0, 0);
                    ArrayList arrayList2 = lk0Var.k;
                    ArrayList arrayList3 = lk0Var2.k;
                    arrayList3.addAll(arrayList2);
                    if (!arrayList3.isEmpty()) {
                        tb4.v(1, arrayList3);
                    }
                    arrayList.add(i + 1, lk0Var2);
                    ye9Var.t4();
                    ye9Var.g3.O(false);
                    ld9 ld9Var2 = ye9Var.R3;
                    if (ld9Var2 != null) {
                        ld9Var2.h();
                    }
                    ye9Var.post(new sd9(ye9Var, lk0Var2, (byte) 26));
                }
            }
        }
    }

    @Override
    public final View Z(int i) {
        return ((d49) this.b).q(i);
    }

    @Override
    public final void a(int i, boolean z) {
        wec wecVar = (wec) this.b;
        wecVar.E = z;
        wecVar.d = i;
        wecVar.K(1);
        wecVar.z(i, z);
        View[] viewArr = wecVar.e;
        int i2 = 0;
        View view = viewArr[0];
        if (view != null) {
            i2 = view.getMeasuredWidth();
        }
        View view2 = viewArr[1];
        if (view2 != null) {
            if (z) {
                wecVar.F(view2, i2);
            } else {
                wecVar.F(view2, -i2);
            }
        }
    }

    @Override
    public final int a0() {
        return 0;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 25:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                a3d a3dVar = (a3d) ((i3d) obj).k();
                Parcel c = a3dVar.c();
                e2d.b(c, (mgb) this.b);
                try {
                    a3dVar.b.transact(1, c, null, 1);
                    c.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Throwable th) {
                    c.recycle();
                    throw th;
                }
            case 26:
                p3d p3dVar = new p3d((TaskCompletionSource) obj2);
                l4d l4dVar = (l4d) ((r3d) obj).k();
                String str = ((q3d) this.b).l;
                Parcel e = l4dVar.e();
                int i = w3d.a;
                e.writeStrongBinder(p3dVar);
                e.writeString(str);
                l4dVar.f(e, 2);
                return;
            case 27:
                nr5 nr5Var = (nr5) this.b;
                u5d u5dVar = (u5d) obj;
                u5dVar.getClass();
                l5d l5dVar = new l5d((TaskCompletionSource) obj2, (byte) 1);
                try {
                    wcf wcfVar = (wcf) u5dVar.k();
                    Bundle B = u5dVar.B();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i2 = ahd.a;
                    obtain.writeInt(1);
                    nr5Var.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    B.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(l5dVar);
                    wcfVar.a.transact(14, obtain, null, 1);
                    obtain.recycle();
                    return;
                } catch (RemoteException e2) {
                    Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e2);
                    Bundle bundle = Bundle.EMPTY;
                    dve.a(Status.h, Boolean.FALSE, l5dVar.c);
                    return;
                }
            default:
                lhf lhfVar = (lhf) obj;
                x6d x6dVar = (x6d) lhfVar.k();
                ted tedVar = ((afd) this.b).l;
                Parcel R = x6dVar.R();
                jgd.d(R, tedVar);
                x6dVar.W(R, 18);
                x6d x6dVar2 = (x6d) lhfVar.k();
                x6dVar2.W(x6dVar2.R(), 17);
                ((TaskCompletionSource) obj2).setResult(null);
                return;
        }
    }

    @Override
    public final boolean b() {
        wec wecVar = (wec) this.b;
        if (!wecVar.y && !wecVar.I) {
            return true;
        }
        return false;
    }

    @Override
    public final long b0() {
        return 0L;
    }

    @Override
    public final void c() {
        ((wec) this.b).r();
    }

    @Override
    public final boolean c0(boolean z) {
        return false;
    }

    @Override
    public final void d(mc9 mc9Var) {
        switch (this.a) {
            case 5:
                nf9 nf9Var = ((pf9) this.b).H;
                if (nf9Var != null) {
                    ye9 ye9Var = ((ue9) nf9Var).a;
                    ye9Var.i4(mc9Var);
                    ye9Var.p3.g(mc9Var, true);
                    return;
                }
                return;
            default:
                yh9 yh9Var = ((ai9) this.b).s;
                if (yh9Var != null) {
                    ye9 ye9Var2 = ((fe9) yh9Var).a;
                    ye9Var2.i4(mc9Var);
                    ye9Var2.p3.g(mc9Var, true);
                    return;
                }
                return;
        }
    }

    @Override
    public final int d0(View view) {
        return d49.x(view) + ((ViewGroup.MarginLayoutParams) ((e49) view.getLayoutParams())).rightMargin;
    }

    @Override
    public final void d1() {
        nf9 nf9Var = ((pf9) this.b).H;
        if (nf9Var != null) {
            ye9 ye9Var = ((ue9) nf9Var).a;
            ld9 ld9Var = ye9Var.R3;
            if (ld9Var != null) {
                ld9Var.g();
            }
            ye9Var.p3.onContentChanged();
        }
    }

    @Override
    public final long e(long j) {
        return 0L;
    }

    @Override
    public final void f(float f) {
        ib9 ib9Var = (ib9) this.b;
        k27 k27Var = ib9Var.Q;
        if (k27Var == null) {
            return;
        }
        k27Var.b0 = f;
        MediaController.w().h0(ib9Var.Q, f);
    }

    @Override
    public final long f0(long j) {
        return 1L;
    }

    @Override
    public final void g(float f) {
        int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        wec wecVar = (wec) this.b;
        View[] viewArr = wecVar.e;
        if (i == 0) {
            if (viewArr[1] != null) {
                wecVar.G();
                wecVar.h.put(wecVar.f[1], viewArr[1]);
                wecVar.removeView(viewArr[1]);
                wecVar.F(viewArr[0], 0.0f);
                viewArr[1] = null;
            }
            wecVar.A(wecVar.b);
            return;
        }
        View view = viewArr[1];
        if (view == null) {
            return;
        }
        if (wecVar.E) {
            wecVar.F(view, (1.0f - f) * viewArr[0].getMeasuredWidth());
            View view2 = viewArr[0];
            wecVar.F(view2, (-view2.getMeasuredWidth()) * f);
        } else {
            wecVar.F(view, (1.0f - f) * (-viewArr[0].getMeasuredWidth()));
            View view3 = viewArr[0];
            wecVar.F(view3, view3.getMeasuredWidth() * f);
        }
        wecVar.x(false);
    }

    @Override
    public final a8 g0(int i, Runnable runnable, String str, boolean z, boolean z2) {
        cs5 cs5Var = (cs5) this.b;
        int y = cs5Var.y();
        cs5Var.b(i, str, new vj6(runnable, z2, cs5Var, (byte) 23), z);
        View x = cs5Var.x(y);
        if (x instanceof a8) {
            return (a8) x;
        }
        return null;
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
        k27 k27Var = ((ib9) this.b).Q;
        if (k27Var == null) {
            return;
        }
        k27Var.b0 = f;
    }

    @Override
    public final long h0(long j, long j2) {
        return 1L;
    }

    @Override
    public final boolean i() {
        return false;
    }

    public final void i0() {
        a79 a79Var = ((c79) this.b).d;
        if (a79Var != null) {
            z69 z69Var = a79Var.s;
            if (z69Var != null) {
                a79Var.cancelRunnable(z69Var);
                a79Var.s = null;
            }
            z69 z69Var2 = new z69(a79Var, (byte) 1);
            a79Var.s = z69Var2;
            a79Var.postRunnable(z69Var2, 1L);
        }
    }

    @Override
    public final void j(boolean z, float f) {
        qmb qmbVar = (qmb) this.b;
        qmbVar.n1 = f;
        qmbVar.o1();
    }

    public final q7a k0(JSONObject jSONObject) {
        i8a vi2Var;
        int i = jSONObject.getInt("settings_version");
        if (i != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.", null);
            vi2Var = new o5f((byte) 17);
        } else {
            vi2Var = new vi2((byte) 26);
        }
        return vi2Var.h0((ize) this.b, jSONObject);
    }

    public final void l0(s49 s49Var, zw8 zw8Var, zw8 zw8Var2) {
        int i;
        int i2;
        boolean z;
        s49 T;
        int i3;
        RecyclerView recyclerView = (RecyclerView) this.b;
        recyclerView.b.l(s49Var);
        recyclerView.h(s49Var);
        s49Var.q(false);
        hia hiaVar = (hia) recyclerView.d0;
        hiaVar.getClass();
        int i4 = zw8Var.b;
        int i5 = zw8Var.c;
        View view = s49Var.a;
        if (zw8Var2 == null) {
            i2 = view.getLeft();
            i = view.getTop();
        } else {
            int i6 = zw8Var2.b;
            i = zw8Var2.c;
            i2 = i6;
        }
        if (!s49Var.j() && (i4 != i2 || i5 != i)) {
            view.layout(i2, i, view.getWidth() + i2, view.getHeight() + i);
            z = hiaVar.r(s49Var, zw8Var, i4, i5, i2, i);
        } else {
            int i7 = s49Var.h;
            int i8 = -1;
            if (i7 != -1) {
                for (int i9 = 0; i9 < recyclerView.getChildCount(); i9++) {
                    View childAt = recyclerView.getChildAt(i9);
                    if (childAt != null && (T = recyclerView.T(childAt)) != null && !T.j() && (i3 = T.h) >= 0 && i3 < i7 && i3 > i8) {
                        i8 = i3;
                    }
                }
            }
            s49Var.i = (s49Var.h - i8) + (i8 * 1000);
            hiaVar.s(s49Var, zw8Var);
            z = true;
        }
        if (z) {
            recyclerView.n0();
        }
    }

    @Override
    public final void m() {
        pf9 pf9Var = (pf9) this.b;
        nf9 nf9Var = pf9Var.H;
        if (nf9Var != null) {
            ((ue9) nf9Var).a.T3(pf9Var.a);
        }
    }

    public final void m0(s49 s49Var) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        d49 d49Var = recyclerView.y;
        View view = s49Var.a;
        wg2 wg2Var = recyclerView.b;
        mv6 mv6Var = d49Var.a;
        ln8 ln8Var = (ln8) mv6Var.b;
        int indexOfChild = ((RecyclerView) ln8Var.b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((hg2) mv6Var.c).A(indexOfChild)) {
                mv6Var.u0(view);
            }
            ln8Var.K(indexOfChild);
        }
        wg2Var.h(view);
    }

    @Override
    public final void n(d5a d5aVar, int i) {
        ed1 ed1Var = (ed1) d5aVar;
        dc6 dc6Var = ydd.i;
        dc6Var.b("onSessionEnded with error = %d", Integer.valueOf(i));
        ydd yddVar = (ydd) this.b;
        byte b = yddVar.e;
        if (b == 0) {
            dc6Var.b("No need to notify transferred if the transfer type is unknown", new Object[0]);
        } else if (yddVar.h == null) {
            dc6Var.b("No need to notify with null sessionState", new Object[0]);
        } else {
            dc6Var.b("notify transferred with type = %d, sessionState = %s", Integer.valueOf(b), yddVar.h);
            Iterator it = new HashSet(yddVar.b).iterator();
            while (it.hasNext()) {
                yme ymeVar = (yme) it.next();
                byte b2 = yddVar.e;
                switch (ymeVar.a) {
                    case 0:
                        ese.j.b("onTransferred with type = %d", Integer.valueOf(b2));
                        ese eseVar = (ese) ymeVar.b;
                        eseVar.c();
                        w3f b3 = eseVar.c.b(eseVar.g);
                        k3f m = l3f.m(b3.d());
                        m.c();
                        l3f.v((l3f) m.b, b2);
                        b3.e((l3f) m.a());
                        eseVar.a.a((y3f) b3.a(), 231);
                        eseVar.i = false;
                        eseVar.g = null;
                        break;
                }
            }
        }
        if (yddVar.e == 2) {
            return;
        }
        yddVar.c();
    }

    @Override
    public final void o(boolean z) {
        switch (this.a) {
            case 15:
                jva jvaVar = (jva) this.b;
                fm0 fm0Var = jvaVar.Z;
                if (fm0Var != null) {
                    fm0Var.a(z, true);
                }
                hz4 hz4Var = jvaVar.s;
                if (hz4Var != null) {
                    hz4Var.invalidate();
                    return;
                }
                return;
            default:
                ydb ydbVar = (ydb) this.b;
                fm0 fm0Var2 = ydbVar.Z;
                if (fm0Var2 != null) {
                    fm0Var2.a(z, true);
                }
                hz4 hz4Var2 = ydbVar.s;
                if (hz4Var2 != null) {
                    hz4Var2.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onPostMessage(android.webkit.WebView r8, java.lang.reflect.InvocationHandler r9, android.net.Uri r10, boolean r11, java.lang.reflect.InvocationHandler r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u39.onPostMessage(android.webkit.WebView, java.lang.reflect.InvocationHandler, android.net.Uri, boolean, java.lang.reflect.InvocationHandler):void");
    }

    @Override
    public final void onRenderedFirstFrame() {
        gl.c3(new zk9(this, (byte) 16));
    }

    @Override
    public final void onStateChanged(boolean z, int i) {
        qu9 qu9Var = (qu9) this.b;
        if (i == 4) {
            qu9Var.dismiss();
            return;
        }
        gl.r(qu9Var.a0);
        gl.d3(qu9Var.a0, 16L);
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public final void p(d5a d5aVar) {
        ed1 ed1Var = (ed1) d5aVar;
    }

    @Override
    public final void q(d5a d5aVar, int i) {
        ed1 ed1Var = (ed1) d5aVar;
    }

    @Override
    public final fib q0() {
        nf9 nf9Var = ((pf9) this.b).H;
        if (nf9Var != null) {
            return ((ue9) nf9Var).a.getTextSelectionHelper();
        }
        return null;
    }

    @Override
    public final long r(long j, long j2) {
        return 0L;
    }

    @Override
    public final void s(int i, int i2, boolean z) {
        hd9 hd9Var = (hd9) this.b;
        hd9Var.v0(i, i2, z);
        j47 j47Var = hd9Var.P0;
        if (j47Var != null) {
            j47Var.g();
            hd9Var.P0 = null;
        }
    }

    @Override
    public final void t(mc9 mc9Var, int i, int i2) {
        yh9 yh9Var;
        fib textSelectionHelper;
        ai9 ai9Var = (ai9) this.b;
        if (!ai9Var.x && i != i2 && (yh9Var = ai9Var.s) != null && (textSelectionHelper = ((fe9) yh9Var).a.getTextSelectionHelper()) != null) {
            mc9Var.post(new zy0(this, mc9Var, i2, textSelectionHelper, i, (byte) 4));
        }
    }

    @Override
    public final int u(View view) {
        return d49.w(view) - ((ViewGroup.MarginLayoutParams) ((e49) view.getLayoutParams())).leftMargin;
    }

    @Override
    public final long v(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override
    public final az8 w(long j) {
        return (az8) this.b;
    }

    @Override
    public final void x() {
        switch (this.a) {
            case 7:
                return;
            default:
                ((StickersActivity) this.b).d0();
                return;
        }
    }

    @Override
    public final void y0(CharSequence charSequence) {
        nf9 nf9Var = ((pf9) this.b).H;
        if (nf9Var != null) {
            ue9 ue9Var = (ue9) nf9Var;
            if (charSequence != null && charSequence.length() > 0) {
                ue9Var.a.u4(charSequence.toString());
            }
        }
    }

    @Override
    public final void z(d5a d5aVar) {
        ed1 ed1Var = (ed1) d5aVar;
    }

    @Override
    public final void onRenderedFirstFrame(tj tjVar) {
    }

    private final void j0() {
    }

    @Override
    public final void I() {
    }

    @Override
    public final void e0() {
    }

    @Override
    public final void y() {
    }

    @Override
    public final void O(CharSequence charSequence) {
    }

    @Override
    public final void onSeekFinished(tj tjVar) {
    }

    @Override
    public final void onSeekStarted(tj tjVar) {
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public u39(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public u39(byte b) {
        this.a = b;
        switch (b) {
            case 21:
                return;
            default:
                this.b = new eef((byte) 17);
                return;
        }
    }

    @Override
    public final long k(long j, long j2) {
        return j2;
    }

    @Override
    public final void l(int i, int i2) {
    }

    @Override
    public final void onError(lbc lbcVar, Exception exc) {
    }

    @Override
    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
    }
}
