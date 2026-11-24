package defpackage;

import android.content.ClipDescription;
import android.content.Context;
import android.graphics.Point;
import android.graphics.RectF;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class lj4 implements lv8, r9, sj5, r76, r6a, o44, nu4, pk6, cx9, au9, vcb, kb1, zv7, g22, x69, am0, kab {
    public static lj4 b;
    public Object a;

    public lj4(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.a = new GestureDetector(context, onGestureListener, null);
    }

    public static lj4 t() {
        lj4 lj4Var = b;
        if (lj4Var == null) {
            Point point = gm.q;
            int i = point.x;
            int i2 = point.y;
            ?? obj = new Object();
            obj.a = a.b.getSharedPreferences(b10.g(i, i2, "pip_floating_", "_"), 0);
            b = obj;
            return obj;
        }
        return lj4Var;
    }

    public final void A() {
        sh5[] sh5VarArr;
        sh5[] sh5VarArr2;
        tg5 tg5Var = (tg5) this.a;
        int i = tg5Var.I - 1;
        tg5Var.I = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (sh5 sh5Var : tg5Var.K) {
            sh5Var.d();
            i2 += sh5Var.Z.a;
        }
        uzb[] uzbVarArr = new uzb[i2];
        int i3 = 0;
        for (sh5 sh5Var2 : tg5Var.K) {
            sh5Var2.d();
            int i4 = sh5Var2.Z.a;
            int i5 = 0;
            while (i5 < i4) {
                sh5Var2.d();
                uzbVarArr[i3] = sh5Var2.Z.a(i5);
                i5++;
                i3++;
            }
        }
        tg5Var.J = new vzb(uzbVarArr);
        tg5Var.H.a(tg5Var);
    }

    @Override
    public final boolean B() {
        return false;
    }

    @Override
    public final String B0() {
        return null;
    }

    @Override
    public final void C(int i, int i2) {
        ((y59) this.a).p(i, i2);
    }

    @Override
    public final void C0(int i, int i2) {
        ((y59) this.a).q(i, i2);
    }

    @Override
    public final void E0(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        i22 i22Var;
        xz7 xz7Var = (xz7) this.a;
        if (xz7Var.getParentActivity() != null && (i22Var = xz7Var.S0) != null) {
            if (i != 8) {
                if (i == 7) {
                    i22Var.a(true);
                } else {
                    i22Var.I(i);
                    xz7Var.I1(i);
                    return;
                }
            }
            HashMap<Object, Object> selectedPhotos = xz7Var.S0.d2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = xz7Var.S0.d2.getSelectedPhotosOrder();
            if (!selectedPhotos.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (int i4 = 0; i4 < selectedPhotosOrder.size(); i4++) {
                    jo6 jo6Var = (jo6) selectedPhotos.get(selectedPhotosOrder.get(i4));
                    ?? obj = new Object();
                    String str = jo6Var.h;
                    if (str != null) {
                        obj.c = str;
                    } else {
                        obj.c = jo6Var.I;
                    }
                    arrayList.add(obj);
                    jo6Var.e();
                }
                xz7Var.J1(arrayList);
            }
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
    public final boolean K0() {
        return false;
    }

    @Override
    public final int K1() {
        ProfileActivity profileActivity = (ProfileActivity) this.a;
        nm0 nm0Var = profileActivity.R5;
        return cmb.p1(profileActivity.g2(), nm0Var.a(nm0Var.e));
    }

    @Override
    public final void O(float f) {
        z8b z8bVar = (z8b) this.a;
        m58.e(z8bVar.v1).k(String.valueOf(u11.a.indexOf(z8bVar.E0.getCurrentBrush())), f);
        oeb oebVar = z8bVar.q1;
        oebVar.c = f;
        z8bVar.E0(oebVar, null, false);
    }

    @Override
    public final void O0(int i, int i2) {
        ((y59) this.a).n(i, i2, null);
    }

    @Override
    public final int V() {
        ProfileActivity profileActivity = (ProfileActivity) this.a;
        nm0 nm0Var = profileActivity.R5;
        return on2.f(profileActivity.g2(), 553648127, nm0Var.a(nm0Var.c));
    }

    @Override
    public final boolean X(String str, db1 db1Var) {
        return false;
    }

    @Override
    public final void a1(vr0 vr0Var) {
        vr0Var.run();
    }

    @Override
    public final void a2(ArrayList arrayList) {
        k17 k17Var = (k17) this.a;
        String str = k17Var.a0;
        if (str != null) {
            k17Var.U(str, k17Var.d0, k17Var.e0, k17Var.c0, k17Var.b0);
        }
    }

    @Override
    public final void b(s6a s6aVar) {
        sh5 sh5Var = (sh5) s6aVar;
        tg5 tg5Var = (tg5) this.a;
        tg5Var.H.b(tg5Var);
    }

    @Override
    public final void b0() {
        gm.t1(((xz7) this.a).fragmentView.findFocus());
    }

    public final q05 c() {
        kz5 kz5Var = (kz5) this.a;
        ite.j("no included points", !Double.isNaN(kz5Var.d));
        LatLngBounds latLngBounds = new LatLngBounds(new LatLng(kz5Var.b, kz5Var.d), new LatLng(kz5Var.c, kz5Var.e));
        ?? obj = new Object();
        obj.a = latLngBounds;
        return obj;
    }

    @Override
    public final void d() {
        ((sa8) this.a).t0(null, true);
    }

    @Override
    public final vh6 e1() {
        return null;
    }

    @Override
    public final Object f(Object obj, Object obj2) {
        return ((bs4) this.a).apply(obj2);
    }

    @Override
    public final lcb g(int i, int i2, byte[] bArr) {
        return hg9.c(this, bArr, i2);
    }

    @Override
    public final int g0() {
        return 0;
    }

    @Override
    public final float g1() {
        return 0.0f;
    }

    @Override
    public final float get() {
        z8b z8bVar = (z8b) this.a;
        u11 currentBrush = z8bVar.E0.getCurrentBrush();
        int i = z8bVar.v1;
        if (currentBrush == null) {
            return m58.e(i).i;
        }
        return m58.e(i).f(String.valueOf(u11.a.indexOf(currentBrush)), currentBrush.c());
    }

    @Override
    public final CharSequence getContentDescription() {
        StringBuilder sb = new StringBuilder();
        h73 h73Var = (h73) this.a;
        sb.append((Object) h73Var.a.getText());
        sb.append(" ");
        sb.append((Object) h73Var.b.getText());
        return sb.toString();
    }

    @Override
    public final boolean h(long j, int i, int i2, int i3, lab labVar) {
        ImageReceiver imageReceiver;
        au8 au8Var;
        au8 au8Var2;
        au8 au8Var3;
        au8 au8Var4;
        labVar.b = null;
        labVar.c = null;
        bp8 bp8Var = (bp8) this.a;
        yo8 yo8Var = bp8Var.h;
        ArrayList arrayList = bp8Var.x;
        if (bp8Var.O < 0.2f) {
            labVar.b = yo8Var.getImageReceiver();
            labVar.c = null;
            labVar.a = yo8Var;
            labVar.h = 0.0f;
            labVar.i = gm.q.y;
            labVar.g = (View) bp8Var.getParent();
            labVar.d = bp8Var.E;
            labVar.n = true;
            return true;
        }
        int i4 = 0;
        while (true) {
            if (i4 < arrayList.size()) {
                au8 au8Var5 = (au8) arrayList.get(i4);
                if (au8Var5.e >= 1.0f && au8Var5.a == i2) {
                    int i5 = i4 - 1;
                    if (i5 >= 0) {
                        au8Var3 = (au8) arrayList.get(i5);
                    } else {
                        au8Var3 = null;
                    }
                    int i6 = i4 - 2;
                    if (i6 >= 0) {
                        au8Var4 = (au8) arrayList.get(i6);
                    } else {
                        au8Var4 = null;
                    }
                    au8 d = ProfileStoriesView.d(au8Var3, au8Var4, au8Var5);
                    imageReceiver = au8Var5.b;
                    au8Var2 = d;
                    au8Var = au8Var5;
                } else {
                    i4++;
                }
            } else {
                imageReceiver = null;
                au8Var = null;
                au8Var2 = null;
                break;
            }
        }
        if (imageReceiver == null) {
            return false;
        }
        labVar.c = imageReceiver;
        labVar.b = null;
        labVar.a = bp8Var;
        labVar.h = 0.0f;
        labVar.i = gm.q.y;
        labVar.g = (View) bp8Var.getParent();
        if (au8Var != null && au8Var2 != null) {
            labVar.f = new ki(this, new RectF(au8Var.m), au8Var, new RectF(au8Var2.m), au8Var2);
            return true;
        }
        labVar.f = null;
        return true;
    }

    @Override
    public final int h1() {
        return 0;
    }

    @Override
    public final w44 i() {
        return ((sa8) this.a).I0;
    }

    public final au6 j() {
        au6 au6Var = (au6) this.a;
        if (au6Var.a != null) {
            if (!Double.isNaN(au6Var.d) && au6Var.d < 0.0d) {
                u36.j("startTime cannot be negative or NaN.");
                return null;
            } else if (!Double.isNaN(au6Var.e)) {
                if (!Double.isNaN(au6Var.f) && au6Var.f >= 0.0d) {
                    return au6Var;
                }
                u36.j("preloadTime cannot be negative or Nan.");
                return null;
            } else {
                u36.j("playbackDuration cannot be NaN.");
                return null;
            }
        }
        u36.j("media cannot be null.");
        return null;
    }

    @Override
    public final int j0() {
        return 0;
    }

    public final android.view.ViewGroup k(android.app.Activity r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lj4.k(android.app.Activity, int):android.view.ViewGroup");
    }

    @Override
    public final void k0(View view, boolean z) {
        if (z == ((w78) this.a).Y && (view instanceof q68)) {
            q68 q68Var = (q68) view;
            q68Var.y.c(q68Var);
        }
    }

    @Override
    public final void l(int i, int i2) {
        ((y59) this.a).j(i, i2);
    }

    @Override
    public final void m(Object obj) {
        int i;
        Map map = (Map) obj;
        hq4 hq4Var = (hq4) this.a;
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (((Boolean) arrayList.get(i2)).booleanValue()) {
                i = 0;
            } else {
                i = -1;
            }
            iArr[i2] = i;
        }
        dq4 dq4Var = (dq4) hq4Var.F.pollFirst();
        if (dq4Var == null) {
            Log.w("FragmentManager", "No permissions were requested for " + this);
            return;
        }
        String str = dq4Var.a;
        if (hq4Var.c.o(str) == null) {
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    @Override
    public final void n(boolean r9, float r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lj4.n(boolean, float):void");
    }

    @Override
    public final void o(int i) {
        ((k17) this.a).f();
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        or1 or1Var = (or1) this.a;
        View view = or1Var.a;
        if (view != null) {
            view.setPressed(true);
            or1Var.a.setSelected(true);
            or1Var.a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        }
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        boolean z;
        or1 or1Var = (or1) this.a;
        yv1 yv1Var = or1Var.x;
        if (or1Var.a != null) {
            yv1Var.g9 = de0.b(yv1Var, or1Var.w, yv1Var.l6, yv1Var.d(), yv1Var.Ba);
            m8 m8Var = yv1Var.g9;
            if (m8Var != null) {
                or1Var.b = m8Var;
                m8Var.setOnDismissListener(new x6(or1Var, (byte) 3));
                yv1Var.A0.D0();
                yv1Var.C0.R = false;
                ImageView imageView = or1Var.w;
                yv1Var.Mb(imageView);
                if (imageView != yv1Var.y1) {
                    z = true;
                } else {
                    z = false;
                }
                yv1Var.y6(false, z, 0.3f);
                yv1Var.H7(false);
                kt1 kt1Var = yv1Var.O3;
                if (kt1Var != null) {
                    kt1Var.d(1, true);
                }
                UndoView undoView = yv1Var.N3;
                if (undoView != null) {
                    undoView.d(1, true);
                }
                ms1 ms1Var = yv1Var.a0;
                if (ms1Var != null && ms1Var.getEditField() != null) {
                    yv1Var.a0.getEditField().setAllowDrawCursor(false);
                }
            }
        }
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        View view;
        or1 or1Var = (or1) this.a;
        if (!or1Var.e && (view = or1Var.a) != null) {
            view.callOnClick();
            or1Var.e = true;
            return true;
        }
        return false;
    }

    @Override
    public final void p(byte[] bArr, int i, int i2, ucb ucbVar, fu2 fu2Var) {
        boolean z;
        f53 a;
        boolean z2;
        yw7 yw7Var = (yw7) this.a;
        yw7Var.L(i2 + i, bArr);
        yw7Var.N(i);
        ArrayList arrayList = new ArrayList();
        while (yw7Var.a() > 0) {
            if (yw7Var.a() >= 8) {
                z = true;
            } else {
                z = false;
            }
            jte.e("Incomplete Mp4Webvtt Top Level box header found.", z);
            int m = yw7Var.m() - 8;
            if (yw7Var.m() == 1987343459) {
                CharSequence charSequence = null;
                e53 e53Var = null;
                while (m > 0) {
                    if (m >= 8) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    jte.e("Incomplete vtt cue box header found.", z2);
                    int m2 = yw7Var.m();
                    int m3 = yw7Var.m();
                    int i3 = m2 - 8;
                    byte[] bArr2 = yw7Var.a;
                    int i4 = yw7Var.b;
                    String str = hac.a;
                    String str2 = new String(bArr2, i4, i3, StandardCharsets.UTF_8);
                    yw7Var.O(i3);
                    m = (m - 8) - i3;
                    if (m3 == 1937011815) {
                        bxc bxcVar = new bxc();
                        cxc.e(str2, bxcVar);
                        e53Var = bxcVar.a();
                    } else if (m3 == 1885436268) {
                        charSequence = cxc.f(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (e53Var != null) {
                    e53Var.a = charSequence;
                    e53Var.b = null;
                    a = e53Var.a();
                } else {
                    Pattern pattern = cxc.a;
                    bxc bxcVar2 = new bxc();
                    bxcVar2.c = charSequence;
                    a = bxcVar2.a().a();
                }
                arrayList.add(a);
            } else {
                yw7Var.O(m);
            }
        }
        fu2Var.accept(new i53(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    @Override
    public final void q(boolean z) {
        w78 w78Var = (w78) this.a;
        w78Var.X = z ? (byte) 1 : (byte) 0;
        if (z) {
            w78.a0(w78Var).getView().requestDisallowInterceptTouchEvent(true);
        }
        w78Var.L.e1(true);
    }

    @Override
    public final void q0(long j, int i, j48 j48Var) {
        int i2 = ProfileStoriesView.t0;
        ((bp8) this.a).f(true, false);
        j48Var.run();
    }

    @Override
    public final int r() {
        return 2;
    }

    @Override
    public final boolean r0(int i) {
        Object obj;
        w78 w78Var = (w78) this.a;
        yn6 yn6Var = w78Var.K;
        if (yn6Var != null) {
            obj = Integer.valueOf(((jo6) yn6Var.e.get(i)).C);
        } else {
            obj = ((no6) w78Var.f.get(i)).B;
        }
        return w78Var.b.containsKey(obj);
    }

    @Override
    public final int r1() {
        ProfileActivity profileActivity = (ProfileActivity) this.a;
        nm0 nm0Var = profileActivity.R5;
        return cmb.p1(profileActivity.g2(), nm0Var.a(nm0Var.b));
    }

    public final String s(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            qw5 qw5Var = (qw5) this.a;
            ww5 ww5Var = new ww5(stringWriter, qw5Var.a, qw5Var.b, qw5Var.c, qw5Var.d);
            ww5Var.h(obj);
            ww5Var.j();
            ww5Var.b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    public final ClipDescription u() {
        return ((fq5) this.a).getDescription();
    }

    @Override
    public final int u0() {
        ProfileActivity profileActivity = (ProfileActivity) this.a;
        nm0 nm0Var = profileActivity.R5;
        return on2.f(profileActivity.g2(), 352321535, nm0Var.a(nm0Var.d));
    }

    @Override
    public final void v(String str) {
        String c = l11.c(str);
        if (!TextUtils.isEmpty(c)) {
            oc7.r1(((ml7) this.a).a).Z1().a(c, null, new bn0((byte) 19));
        } else {
            gm.c3(new bo6((byte) 4));
        }
    }

    @Override
    public final boolean w(int i) {
        if (((w78) this.a).M.d(i) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final float w0() {
        return -1.0f;
    }

    @Override
    public final void y() {
        or1 or1Var = (or1) this.a;
        View view = or1Var.a;
        if (view != null) {
            view.setPressed(false);
            or1Var.a.setSelected(false);
        }
        View view2 = or1Var.n;
        if (view2 != null && !or1Var.d) {
            view2.callOnClick();
            or1Var.d = true;
        }
    }

    @Override
    public final float y0() {
        return -1.0f;
    }

    public final lj4 z(xj5 xj5Var) {
        kz5 kz5Var = (kz5) this.a;
        LatLng latLng = new LatLng(xj5Var.a, xj5Var.b);
        kz5Var.getClass();
        double d = kz5Var.b;
        double d2 = latLng.a;
        kz5Var.b = Math.min(d, d2);
        kz5Var.c = Math.max(kz5Var.c, d2);
        boolean isNaN = Double.isNaN(kz5Var.d);
        double d3 = latLng.b;
        if (isNaN) {
            kz5Var.d = d3;
            kz5Var.e = d3;
            return this;
        }
        double d4 = kz5Var.d;
        double d5 = kz5Var.e;
        if (d4 > d5 ? !(d4 <= d3 || d3 <= d5) : !(d4 <= d3 && d3 <= d5)) {
            if (((d4 - d3) + 360.0d) % 360.0d < ((d3 - d5) + 360.0d) % 360.0d) {
                kz5Var.d = d3;
                return this;
            }
            kz5Var.e = d3;
        }
        return this;
    }

    public lj4(Object obj) {
        this.a = obj;
    }

    @Override
    public final void I() {
    }

    @Override
    public final void I0(yh7 yh7Var) {
    }

    @Override
    public final void e(boolean z) {
    }

    @Override
    public final void f0(Object obj) {
    }

    @Override
    public final void onDismiss() {
    }

    @Override
    public final void reset() {
    }

    @Override
    public final void x() {
    }

    @Override
    public final void z0(TLRPC.User user) {
    }

    @Override
    public final Object mo8get() {
        li4 li4Var = (li4) ((lq5) this.a).a;
        li4Var.getClass();
        f8a f8aVar = f8a.a;
        return f8a.a(li4Var);
    }

    @Override
    public final void n0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }
}
