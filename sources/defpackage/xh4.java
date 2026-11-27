package defpackage;

import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.RemoteException;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class xh4 implements cr7, rn4, s9, yj5, a70, s84, fx7, v30, ag4, l12, i89, bl0, hcb, ugc {
    public final byte a;
    public Object b;

    public xh4(byte b) {
        this.a = b;
        switch (b) {
            case 11:
                this.b = new LinkedHashMap(0, 0.75f, true);
                return;
            default:
                this.b = po5.p();
                return;
        }
    }

    @Override
    public final int A() {
        q79 q79Var = (q79) this.b;
        return q79Var.m - q79Var.D();
    }

    @Override
    public final View B(int i) {
        return ((q79) this.b).q(i);
    }

    @Override
    public final float B0() {
        return -1.0f;
    }

    @Override
    public final int C(View view) {
        return q79.x(view) + ((ViewGroup.MarginLayoutParams) ((r79) view.getLayoutParams())).rightMargin;
    }

    @Override
    public final void C0(long j, int i, long j2) {
        lh2 lh2Var = ((km6) this.b).b1;
        Handler handler = (Handler) lh2Var.b;
        if (handler != null) {
            handler.post(new m30(lh2Var, i, j, j2, (byte) 0));
        }
    }

    @Override
    public final void D() {
        w64 w64Var = ((km6) this.b).Y;
        if (w64Var != null) {
            w64Var.a.j0 = true;
        }
    }

    @Override
    public final float D0() {
        return -1.0f;
    }

    public final boolean E(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xh4.E(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean E0() {
        return false;
    }

    @Override
    public final Cursor F(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e) {
            Log.w("FontsProvider", "Unable to query the content provider", e);
            return null;
        }
    }

    @Override
    public final void G(float f) {
        switch (this.a) {
            case 12:
                gc8 gc8Var = (gc8) this.b;
                a78.e(gc8Var.a).k("-1", f);
                gc8Var.e.setBrushSize(f);
                return;
            default:
                wab wabVar = (wab) this.b;
                a78.e(wabVar.p1).k(String.valueOf(v01.a.indexOf(wabVar.y0.getCurrentBrush())), f);
                igb igbVar = wabVar.k1;
                igbVar.c = f;
                wabVar.D0(igbVar, null, false);
                return;
        }
    }

    @Override
    public final void H(int i, int i2) {
        xc5 xc5Var = (xc5) this.b;
        xc5Var.X = i;
        hl.V3(xc5Var.b);
    }

    public final void I(f89 f89Var, m09 m09Var, m09 m09Var2) {
        int i;
        int i2;
        boolean z;
        f89 U;
        int i3;
        RecyclerView recyclerView = (RecyclerView) this.b;
        recyclerView.b.l(f89Var);
        recyclerView.h(f89Var);
        f89Var.q(false);
        cma cmaVar = (cma) recyclerView.d0;
        cmaVar.getClass();
        int i4 = m09Var.b;
        int i5 = m09Var.c;
        View view = f89Var.a;
        if (m09Var2 == null) {
            i2 = view.getLeft();
            i = view.getTop();
        } else {
            int i6 = m09Var2.b;
            i = m09Var2.c;
            i2 = i6;
        }
        if (!f89Var.j() && (i4 != i2 || i5 != i)) {
            view.layout(i2, i, view.getWidth() + i2, view.getHeight() + i);
            z = cmaVar.r(f89Var, m09Var, i4, i5, i2, i);
        } else {
            int i7 = f89Var.h;
            int i8 = -1;
            if (i7 != -1) {
                for (int i9 = 0; i9 < recyclerView.getChildCount(); i9++) {
                    View childAt = recyclerView.getChildAt(i9);
                    if (childAt != null && (U = recyclerView.U(childAt)) != null && !U.j() && (i3 = U.h) >= 0 && i3 < i7 && i3 > i8) {
                        i8 = i3;
                    }
                }
            }
            f89Var.i = (f89Var.h - i8) + (i8 * 1000);
            cmaVar.s(f89Var, m09Var);
            z = true;
        }
        if (z) {
            recyclerView.o0();
        }
    }

    public final byte J() {
        int read = ((i51) this.b).read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    public final int K() {
        return ((J() & 255) << 24) | ((J() & 255) << 16) | ((J() & 255) << 8) | (J() & 255);
    }

    public final int L() {
        return ((J() & Byte.MAX_VALUE) << 21) | ((J() & Byte.MAX_VALUE) << 14) | ((J() & Byte.MAX_VALUE) << 7) | (J() & Byte.MAX_VALUE);
    }

    @Override
    public final void M(qf5 qf5Var) {
        lh2 lh2Var = ((km6) this.b).b1;
        Handler handler = (Handler) lh2Var.b;
        if (handler != null) {
            handler.post(new n30(lh2Var, qf5Var, (byte) 1));
        }
    }

    public final void O(long j) {
        long j2 = 0;
        while (j2 < j) {
            long skip = ((i51) this.b).skip(j - j2);
            if (skip > 0) {
                j2 += skip;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override
    public final void O0(vq0 vq0Var) {
        vq0Var.run();
    }

    public final void P(f89 f89Var) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        q79 q79Var = recyclerView.y;
        View view = f89Var.a;
        oh2 oh2Var = recyclerView.b;
        rx6 rx6Var = q79Var.a;
        j09 j09Var = (j09) rx6Var.b;
        int indexOfChild = ((RecyclerView) j09Var.b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((zg2) rx6Var.c).y(indexOfChild)) {
                rx6Var.A0(view);
            }
            j09Var.N(indexOfChild);
        }
        oh2Var.h(view);
    }

    @Override
    public final int Q1() {
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        ol0 ol0Var = profileActivity.M5;
        return aob.p1(profileActivity.f2(), ol0Var.a(ol0Var.e));
    }

    @Override
    public final void S0(java.lang.Object r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xh4.S0(java.lang.Object):void");
    }

    @Override
    public final void V() {
        hl.t1(((b18) this.b).fragmentView.findFocus());
    }

    @Override
    public final int X() {
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        ol0 ol0Var = profileActivity.M5;
        return vm2.f(profileActivity.f2(), 553648127, ol0Var.a(ol0Var.c));
    }

    @Override
    public final void Z() {
        ((km6) this.b).u();
    }

    @Override
    public final boolean b() {
        return !((lm7) this.b).M;
    }

    @Override
    public final int c(View view) {
        return q79.w(view) - ((ViewGroup.MarginLayoutParams) ((r79) view.getLayoutParams())).leftMargin;
    }

    @Override
    public final void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override
    public final void d(int i) {
        fi6 fi6Var;
        km6 km6Var = (km6) this.b;
        if (Build.VERSION.SDK_INT >= 35 && (fi6Var = km6Var.d1) != null) {
            fi6Var.d(i);
        }
        lh2 lh2Var = km6Var.b1;
        Handler handler = (Handler) lh2Var.b;
        if (handler != null) {
            handler.post(new zd(lh2Var, i, (byte) 4));
        }
    }

    @Override
    public final void dismiss() {
        ((xc5) this.b).x.d(true);
    }

    @Override
    public final void e() {
        ((lm7) this.b).v();
    }

    @Override
    public final boolean g(dg4 dg4Var) {
        return false;
    }

    @Override
    public final float get() {
        switch (this.a) {
            case 12:
                gc8 gc8Var = (gc8) this.b;
                v01 currentBrush = gc8Var.e.getCurrentBrush();
                int i = gc8Var.a;
                if (currentBrush == null) {
                    return a78.e(i).i;
                }
                return a78.e(i).f("-1", currentBrush.c());
            default:
                wab wabVar = (wab) this.b;
                v01 currentBrush2 = wabVar.y0.getCurrentBrush();
                int i2 = wabVar.p1;
                if (currentBrush2 == null) {
                    return a78.e(i2).i;
                }
                return a78.e(i2).f(String.valueOf(v01.a.indexOf(currentBrush2)), currentBrush2.c());
        }
    }

    @Override
    public final void h(boolean z) {
        lh2 lh2Var = ((km6) this.b).b1;
        Handler handler = (Handler) lh2Var.b;
        if (handler != null) {
            handler.post(new xac((byte) 3, lh2Var, z));
        }
    }

    @Override
    public final void h0(Exception exc) {
        efd.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        lh2 lh2Var = ((km6) this.b).b1;
        Handler handler = (Handler) lh2Var.b;
        if (handler != null) {
            handler.post(new k30(lh2Var, exc, (byte) 1));
        }
    }

    @Override
    public final boolean i() {
        return false;
    }

    @Override
    public final boolean j(long j, int i, int i2, int i3, icb icbVar) {
        ImageReceiver imageReceiver;
        iv8 iv8Var;
        iv8 iv8Var2;
        iv8 iv8Var3;
        iv8 iv8Var4;
        icbVar.b = null;
        icbVar.c = null;
        lq8 lq8Var = (lq8) this.b;
        iq8 iq8Var = lq8Var.h;
        ArrayList arrayList = lq8Var.x;
        if (lq8Var.O < 0.2f) {
            icbVar.b = iq8Var.getImageReceiver();
            icbVar.c = null;
            icbVar.a = iq8Var;
            icbVar.h = 0.0f;
            icbVar.i = hl.q.y;
            icbVar.g = (View) lq8Var.getParent();
            icbVar.d = lq8Var.E;
            icbVar.n = true;
            return true;
        }
        int i4 = 0;
        while (true) {
            if (i4 < arrayList.size()) {
                iv8 iv8Var5 = (iv8) arrayList.get(i4);
                if (iv8Var5.e >= 1.0f && iv8Var5.a == i2) {
                    int i5 = i4 - 1;
                    if (i5 >= 0) {
                        iv8Var3 = (iv8) arrayList.get(i5);
                    } else {
                        iv8Var3 = null;
                    }
                    int i6 = i4 - 2;
                    if (i6 >= 0) {
                        iv8Var4 = (iv8) arrayList.get(i6);
                    } else {
                        iv8Var4 = null;
                    }
                    iv8 d = ProfileStoriesView.d(iv8Var3, iv8Var4, iv8Var5);
                    imageReceiver = iv8Var5.b;
                    iv8Var2 = d;
                    iv8Var = iv8Var5;
                } else {
                    i4++;
                }
            } else {
                imageReceiver = null;
                iv8Var = null;
                iv8Var2 = null;
                break;
            }
        }
        if (imageReceiver == null) {
            return false;
        }
        icbVar.c = imageReceiver;
        icbVar.b = null;
        icbVar.a = lq8Var;
        icbVar.h = 0.0f;
        icbVar.i = hl.q.y;
        icbVar.g = (View) lq8Var.getParent();
        if (iv8Var != null && iv8Var2 != null) {
            icbVar.f = new xg(this, new RectF(iv8Var.m), iv8Var, new RectF(iv8Var2.m), iv8Var2);
            return true;
        }
        icbVar.f = null;
        return true;
    }

    @Override
    public final void k(Object obj) {
        r9 r9Var = (r9) obj;
        kq4 kq4Var = (kq4) this.b;
        gq4 gq4Var = (gq4) kq4Var.F.pollLast();
        if (gq4Var == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = gq4Var.a;
        int i = gq4Var.b;
        gp4 p = kq4Var.c.p(str);
        if (p == null) {
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
            return;
        }
        p.x(i, r9Var.a, r9Var.b);
    }

    @Override
    public final void l0() {
        ((km6) this.b).l1 = true;
    }

    @Override
    public final int m() {
        return ((q79) this.b).C();
    }

    @Override
    public final int m0() {
        return 0;
    }

    @Override
    public final float m1() {
        return 0.0f;
    }

    @Override
    public final void n(long j) {
        km6 km6Var = (km6) this.b;
        km6Var.o1 = true;
        lh2 lh2Var = km6Var.b1;
        Handler handler = (Handler) lh2Var.b;
        if (handler != null) {
            handler.post(new kt(lh2Var, j, (byte) 2));
        }
    }

    @Override
    public final void n0(View view, boolean z) {
        if (z == ((l98) this.b).Y && (view instanceof d88)) {
            d88 d88Var = (d88) view;
            d88Var.y.c(d88Var);
        }
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final int o1() {
        return 0;
    }

    @Override
    public final int q(int i) {
        return 0;
    }

    @Override
    public final void r(boolean z) {
        l98 l98Var = (l98) this.b;
        l98Var.X = z ? (byte) 1 : (byte) 0;
        if (z) {
            l98.Z(l98Var).getView().requestDisallowInterceptTouchEvent(true);
        }
        l98Var.L.f1(true);
    }

    @Override
    public final void s(bg4 bg4Var, boolean z) {
        ir1 ir1Var = ((lm7) this.b).w;
        if (ir1Var != null) {
            ir1Var.F(bg4Var.a);
        }
    }

    @Override
    public final boolean s0(int i) {
        Object obj;
        l98 l98Var = (l98) this.b;
        do6 do6Var = l98Var.K;
        if (do6Var != null) {
            obj = Integer.valueOf(((no6) do6Var.e.get(i)).C);
        } else {
            obj = ((ro6) l98Var.f.get(i)).B;
        }
        return l98Var.b.containsKey(obj);
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
        ((b76) this.b).h(f);
    }

    public final String toString() {
        switch (this.a) {
            case 8:
                ycb ycbVar = ycb.e;
                StringBuffer stringBuffer = new StringBuffer("execution(");
                stringBuffer.append(((ia) this.b).m());
                stringBuffer.append(")");
                return stringBuffer.toString();
            case 15:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    @Override
    public final void u(qf5 qf5Var) {
        lh2 lh2Var = ((km6) this.b).b1;
        Handler handler = (Handler) lh2Var.b;
        if (handler != null) {
            handler.post(new n30(lh2Var, qf5Var, (byte) 0));
        }
    }

    public final void v() {
        na9 na9Var = ((pa9) this.b).d;
        if (na9Var != null) {
            ma9 ma9Var = na9Var.s;
            if (ma9Var != null) {
                na9Var.cancelRunnable(ma9Var);
                na9Var.s = null;
            }
            ma9 ma9Var2 = new ma9(na9Var, (byte) 2);
            na9Var.s = ma9Var2;
            na9Var.postRunnable(ma9Var2, 1L);
        }
    }

    @Override
    public final void v0(float f, int i) {
        ((b76) this.b).h(f);
    }

    @Override
    public final boolean w(int i) {
        if (((l98) this.b).M.d(i) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void w0() {
        w64 w64Var = ((km6) this.b).Y;
        if (w64Var != null) {
            w64Var.a();
        }
    }

    @Override
    public final void x(long j, int i, y58 y58Var) {
        int i2 = ProfileStoriesView.t0;
        ((lq8) this.b).f(true, false);
        y58Var.run();
    }

    @Override
    public final int x0() {
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        ol0 ol0Var = profileActivity.M5;
        return vm2.f(profileActivity.f2(), 352321535, ol0Var.a(ol0Var.d));
    }

    @Override
    public final int x1() {
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        ol0 ol0Var = profileActivity.M5;
        return aob.p1(profileActivity.f2(), ol0Var.a(ol0Var.b));
    }

    public final android.view.ViewGroup y(android.app.Activity r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xh4.y(android.app.Activity, int):android.view.ViewGroup");
    }

    @Override
    public final void z() {
        ((km6) this.b).n1 = true;
    }

    @Override
    public final void z0(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        n12 n12Var;
        b18 b18Var = (b18) this.b;
        if (b18Var.getParentActivity() != null && (n12Var = b18Var.S0) != null) {
            if (i != 8) {
                if (i == 7) {
                    n12Var.a(true);
                } else {
                    n12Var.I(i);
                    b18Var.I1(i);
                    return;
                }
            }
            HashMap<Object, Object> selectedPhotos = b18Var.S0.d2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = b18Var.S0.d2.getSelectedPhotosOrder();
            if (!selectedPhotos.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (int i4 = 0; i4 < selectedPhotosOrder.size(); i4++) {
                    no6 no6Var = (no6) selectedPhotos.get(selectedPhotosOrder.get(i4));
                    ?? obj = new Object();
                    String str = no6Var.h;
                    if (str != null) {
                        obj.c = str;
                    } else {
                        obj.c = no6Var.I;
                    }
                    arrayList.add(obj);
                    no6Var.e();
                }
                b18Var.J1(arrayList);
            }
        }
    }

    @Override
    public final void N() {
    }

    @Override
    public final void R() {
    }

    @Override
    public final void a(float f) {
    }

    @Override
    public final void e0(Object obj) {
    }

    @Override
    public final void f(boolean z) {
    }

    @Override
    public final void i0(TLRPC.User user) {
    }

    @Override
    public final void l(int i) {
    }

    public xh4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public xh4(byte b, boolean z) {
        this.a = b;
    }

    public xh4(Context context, Uri uri) {
        this.a = (byte) 1;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public xh4(Context context, tu4 tu4Var) {
        this.a = (byte) 3;
        this.b = new su4(context, tu4Var);
    }

    @Override
    public final void p(int i, int i2) {
    }

    @Override
    public final void f0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }
}
