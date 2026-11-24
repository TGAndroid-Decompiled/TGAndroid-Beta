package defpackage;

import android.content.ClipDescription;
import android.content.Context;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.UndoView;
public final class gi3 implements pt9, gi2, pfa, kt8, r9, th5, r56, p4a, d34, ms4, ni6, zu9, yr9, uab, ca1, yt7, v02, v49, ibc {
    public Object a;

    public gi3(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.a = new GestureDetector(context, onGestureListener, null);
    }

    @Override
    public final l34 A() {
        return ((q88) this.a).I0;
    }

    @Override
    public final void B1(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        x02 x02Var;
        vx7 vx7Var = (vx7) this.a;
        if (vx7Var.getParentActivity() != null && (x02Var = vx7Var.S0) != null) {
            if (i != 8) {
                if (i == 7) {
                    x02Var.a(true);
                } else {
                    x02Var.J(i);
                    vx7Var.H1(i);
                    return;
                }
            }
            HashMap<Object, Object> selectedPhotos = vx7Var.S0.d2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = vx7Var.S0.d2.getSelectedPhotosOrder();
            if (!selectedPhotos.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (int i4 = 0; i4 < selectedPhotosOrder.size(); i4++) {
                    jm6 jm6Var = (jm6) selectedPhotos.get(selectedPhotosOrder.get(i4));
                    ?? obj = new Object();
                    String str = jm6Var.h;
                    if (str != null) {
                        obj.c = str;
                    } else {
                        obj.c = jm6Var.I;
                    }
                    arrayList.add(obj);
                    jm6Var.e();
                }
                vx7Var.I1(arrayList);
            }
        }
    }

    @Override
    public final void C(int i, int i2) {
        ((w39) this.a).j(i, i2);
    }

    @Override
    public final void D(float f, float f2) {
        ui5 ui5Var;
        ui5Var = ((d) ((vi3) this.a).u0).parentLayout;
        ((ActionBarLayout) ui5Var).p();
    }

    @Override
    public final void H(String str) {
        String c = d01.c(str);
        if (!TextUtils.isEmpty(c)) {
            na7.q1(((jj7) this.a).a).Y1().a(c, null, new bm0((byte) 19));
        } else {
            gl.c3(new am6((byte) 4));
        }
    }

    @Override
    public final boolean H0(float f, float f2) {
        return ((vi3) this.a).u0.isInPreviewMode();
    }

    @Override
    public final void H1(View view, boolean z) {
        if (z == ((u58) this.a).Y && (view instanceof o48)) {
            o48 o48Var = (o48) view;
            o48Var.y.c(o48Var);
        }
    }

    @Override
    public final void I0() {
        gl.t1(((vx7) this.a).fragmentView.findFocus());
    }

    @Override
    public final boolean K(int i) {
        if (((u58) this.a).M.d(i) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean K0(View view, float f, float f2) {
        return false;
    }

    @Override
    public final void O(float f) {
        x6b x6bVar = (x6b) this.a;
        k38.e(x6bVar.v1).k(String.valueOf(m01.a.indexOf(x6bVar.E0.getCurrentBrush())), f);
        mcb mcbVar = x6bVar.q1;
        mcbVar.c = f;
        x6bVar.E0(mcbVar, null, false);
    }

    @Override
    public final vf6 O0() {
        return null;
    }

    @Override
    public final boolean S() {
        return true;
    }

    @Override
    public final boolean U1(int i) {
        return true;
    }

    @Override
    public final boolean V1() {
        return false;
    }

    @Override
    public final boolean W0(String str, u91 u91Var) {
        return false;
    }

    @Override
    public final String Z0() {
        return null;
    }

    @Override
    public final int a0() {
        return 0;
    }

    @Override
    public final void b(q4a q4aVar) {
        tf5 tf5Var = (tf5) q4aVar;
        ue5 ue5Var = (ue5) this.a;
        ue5Var.H.b(ue5Var);
    }

    public final qy4 c() {
        kx5 kx5Var = (kx5) this.a;
        fre.j("no included points", !Double.isNaN(kx5Var.d));
        LatLngBounds latLngBounds = new LatLngBounds(new LatLng(kx5Var.b, kx5Var.d), new LatLng(kx5Var.c, kx5Var.e));
        ?? obj = new Object();
        obj.a = latLngBounds;
        return obj;
    }

    public final zr6 d() {
        zr6 zr6Var = (zr6) this.a;
        if (zr6Var.a != null) {
            if (!Double.isNaN(zr6Var.d) && zr6Var.d < 0.0d) {
                w26.j("startTime cannot be negative or NaN.");
                return null;
            } else if (!Double.isNaN(zr6Var.e)) {
                if (!Double.isNaN(zr6Var.f) && zr6Var.f >= 0.0d) {
                    return zr6Var;
                }
                w26.j("preloadTime cannot be negative or Nan.");
                return null;
            } else {
                w26.j("playbackDuration cannot be NaN.");
                return null;
            }
        }
        w26.j("media cannot be null.");
        return null;
    }

    @Override
    public final Object e(Object obj, Object obj2) {
        return ((aq4) this.a).apply(obj2);
    }

    @Override
    public final kab f(int i, int i2, byte[] bArr) {
        return de9.c(this, bArr, i2);
    }

    @Override
    public final void f2(int i, int i2) {
        ((w39) this.a).n(i, i2, null);
    }

    @Override
    public final void finish() {
        Point point = gl.q;
        if (point.x > point.y) {
            ((cj3) this.a).finishPreviewFragment();
        }
    }

    @Override
    public final boolean g0() {
        return false;
    }

    @Override
    public final float get() {
        x6b x6bVar = (x6b) this.a;
        m01 currentBrush = x6bVar.E0.getCurrentBrush();
        int i = x6bVar.v1;
        if (currentBrush == null) {
            return k38.e(i).i;
        }
        return k38.e(i).f(String.valueOf(m01.a.indexOf(currentBrush)), currentBrush.c());
    }

    @Override
    public final CharSequence getContentDescription() {
        StringBuilder sb = new StringBuilder();
        v53 v53Var = (v53) this.a;
        sb.append((Object) v53Var.a.getText());
        sb.append(" ");
        sb.append((Object) v53Var.b.getText());
        return sb.toString();
    }

    @Override
    public final long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override
    public final void h() {
        bq1 bq1Var = (bq1) this.a;
        View view = bq1Var.a;
        if (view != null) {
            view.setPressed(false);
            bq1Var.a.setSelected(false);
        }
        View view2 = bq1Var.n;
        if (view2 != null && !bq1Var.d) {
            view2.callOnClick();
            bq1Var.d = true;
        }
    }

    @Override
    public final void i(Object obj) {
        int i;
        Map map = (Map) obj;
        go4 go4Var = (go4) this.a;
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
        co4 co4Var = (co4) go4Var.F.pollFirst();
        if (co4Var == null) {
            Log.w("FragmentManager", "No permissions were requested for " + this);
            return;
        }
        String str = co4Var.a;
        if (go4Var.c.n(str) == null) {
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    @Override
    public final void j(boolean r9, float r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gi3.j(boolean, float):void");
    }

    @Override
    public final void j1(int i, int i2) {
        ((w39) this.a).q(i, i2);
    }

    @Override
    public final void l(byte[] bArr, int i, int i2, tab tabVar, us2 us2Var) {
        boolean z;
        u33 a;
        boolean z2;
        xu7 xu7Var = (xu7) this.a;
        xu7Var.L(i2 + i, bArr);
        xu7Var.N(i);
        ArrayList arrayList = new ArrayList();
        while (xu7Var.a() > 0) {
            if (xu7Var.a() >= 8) {
                z = true;
            } else {
                z = false;
            }
            gre.e("Incomplete Mp4Webvtt Top Level box header found.", z);
            int m = xu7Var.m() - 8;
            if (xu7Var.m() == 1987343459) {
                CharSequence charSequence = null;
                t33 t33Var = null;
                while (m > 0) {
                    if (m >= 8) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    gre.e("Incomplete vtt cue box header found.", z2);
                    int m2 = xu7Var.m();
                    int m3 = xu7Var.m();
                    int i3 = m2 - 8;
                    byte[] bArr2 = xu7Var.a;
                    int i4 = xu7Var.b;
                    String str = g8c.a;
                    String str2 = new String(bArr2, i4, i3, StandardCharsets.UTF_8);
                    xu7Var.O(i3);
                    m = (m - 8) - i3;
                    if (m3 == 1937011815) {
                        avc avcVar = new avc();
                        bvc.e(str2, avcVar);
                        t33Var = avcVar.a();
                    } else if (m3 == 1885436268) {
                        charSequence = bvc.f(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (t33Var != null) {
                    t33Var.a = charSequence;
                    t33Var.b = null;
                    a = t33Var.a();
                } else {
                    Pattern pattern = bvc.a;
                    avc avcVar2 = new avc();
                    avcVar2.c = charSequence;
                    a = avcVar2.a().a();
                }
                arrayList.add(a);
            } else {
                xu7Var.O(m);
            }
        }
        us2Var.accept(new x33(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    @Override
    public final void m(float f) {
        Point point = gl.q;
        if (point.x > point.y) {
            ((cj3) this.a).movePreviewFragment(f);
        }
    }

    @Override
    public final void m2(ArrayList arrayList) {
        kz6 kz6Var = (kz6) this.a;
        String str = kz6Var.a0;
        if (str != null) {
            kz6Var.U(str, kz6Var.d0, kz6Var.e0, kz6Var.c0, kz6Var.b0);
        }
    }

    @Override
    public final boolean n2(int i) {
        Object obj;
        u58 u58Var = (u58) this.a;
        xl6 xl6Var = u58Var.K;
        if (xl6Var != null) {
            obj = Integer.valueOf(((jm6) xl6Var.e.get(i)).C);
        } else {
            obj = ((nm6) u58Var.f.get(i)).B;
        }
        return u58Var.b.containsKey(obj);
    }

    @Override
    public final int o() {
        return 2;
    }

    @Override
    public final void o0(int i, int i2) {
        ((w39) this.a).p(i, i2);
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        bq1 bq1Var = (bq1) this.a;
        View view = bq1Var.a;
        if (view != null) {
            view.setPressed(true);
            bq1Var.a.setSelected(true);
            bq1Var.a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
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
        bq1 bq1Var = (bq1) this.a;
        mu1 mu1Var = bq1Var.x;
        if (bq1Var.a != null) {
            mu1Var.g9 = dd0.b(mu1Var, bq1Var.w, mu1Var.l6, mu1Var.d(), mu1Var.Ba);
            m8 m8Var = mu1Var.g9;
            if (m8Var != null) {
                bq1Var.b = m8Var;
                m8Var.setOnDismissListener(new x6(bq1Var, (byte) 3));
                mu1Var.A0.D0();
                mu1Var.C0.R = false;
                ImageView imageView = bq1Var.w;
                mu1Var.Cb(imageView);
                if (imageView != mu1Var.y1) {
                    z = true;
                } else {
                    z = false;
                }
                mu1Var.r6(false, z, 0.3f);
                mu1Var.z7(false);
                xr1 xr1Var = mu1Var.O3;
                if (xr1Var != null) {
                    xr1Var.d(1, true);
                }
                UndoView undoView = mu1Var.N3;
                if (undoView != null) {
                    undoView.d(1, true);
                }
                ar1 ar1Var = mu1Var.a0;
                if (ar1Var != null && ar1Var.getEditField() != null) {
                    mu1Var.a0.getEditField().setAllowDrawCursor(false);
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
        bq1 bq1Var = (bq1) this.a;
        if (!bq1Var.e && (view = bq1Var.a) != null) {
            view.callOnClick();
            bq1Var.e = true;
            return true;
        }
        return false;
    }

    @Override
    public final void onStateChanged(boolean z, int i) {
        zi8 zi8Var = (zi8) this.a;
        yi8 yi8Var = zi8Var.M;
        gl.r(yi8Var);
        lbc lbcVar = zi8Var.E;
        if (lbcVar != null && lbcVar.c0()) {
            gl.c3(yi8Var);
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((zi8) this.a).h();
    }

    public final android.view.ViewGroup p(android.app.Activity r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gi3.p(android.app.Activity, int):android.view.ViewGroup");
    }

    public final String q(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            qu5 qu5Var = (qu5) this.a;
            wu5 wu5Var = new wu5(stringWriter, qu5Var.a, qu5Var.b, qu5Var.c, qu5Var.d);
            wu5Var.h(obj);
            wu5Var.j();
            wu5Var.b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override
    public final void r(int i) {
        ((kz6) this.a).f();
    }

    public final ClipDescription s() {
        return ((fo5) this.a).getDescription();
    }

    @Override
    public final boolean s1() {
        return false;
    }

    public final gi3 t(yh5 yh5Var) {
        kx5 kx5Var = (kx5) this.a;
        LatLng latLng = new LatLng(yh5Var.a, yh5Var.b);
        kx5Var.getClass();
        double d = kx5Var.b;
        double d2 = latLng.a;
        kx5Var.b = Math.min(d, d2);
        kx5Var.c = Math.max(kx5Var.c, d2);
        boolean isNaN = Double.isNaN(kx5Var.d);
        double d3 = latLng.b;
        if (isNaN) {
            kx5Var.d = d3;
            kx5Var.e = d3;
            return this;
        }
        double d4 = kx5Var.d;
        double d5 = kx5Var.e;
        if (d4 > d5 ? !(d4 <= d3 || d3 <= d5) : !(d4 <= d3 && d3 <= d5)) {
            if (((d4 - d3) + 360.0d) % 360.0d < ((d3 - d5) + 360.0d) % 360.0d) {
                kx5Var.d = d3;
                return this;
            }
            kx5Var.e = d3;
        }
        return this;
    }

    @Override
    public final vf6 t1() {
        return null;
    }

    @Override
    public final void u() {
        ((q88) this.a).t0(null, true);
    }

    @Override
    public final void v(boolean z) {
        u58 u58Var = (u58) this.a;
        u58Var.X = z ? (byte) 1 : (byte) 0;
        if (z) {
            u58.Z(u58Var).getView().requestDisallowInterceptTouchEvent(true);
        }
        u58Var.L.e1(true);
    }

    @Override
    public final void w(ue3 ue3Var) {
        ((cj3) this.a).Y4(ue3Var);
    }

    public final void x() {
        tf5[] tf5VarArr;
        tf5[] tf5VarArr2;
        ue5 ue5Var = (ue5) this.a;
        int i = ue5Var.I - 1;
        ue5Var.I = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (tf5 tf5Var : ue5Var.K) {
            tf5Var.b();
            i2 += tf5Var.Z.a;
        }
        sxb[] sxbVarArr = new sxb[i2];
        int i3 = 0;
        for (tf5 tf5Var2 : ue5Var.K) {
            tf5Var2.b();
            int i4 = tf5Var2.Z.a;
            int i5 = 0;
            while (i5 < i4) {
                tf5Var2.b();
                sxbVarArr[i3] = tf5Var2.Z.a(i5);
                i5++;
                i3++;
            }
        }
        ue5Var.J = new txb(sxbVarArr);
        ue5Var.H.a(ue5Var);
    }

    @Override
    public final void z2(vq0 vq0Var) {
        vq0Var.run();
    }

    @Override
    public final void onRenderedFirstFrame() {
    }

    public gi3(Object obj) {
        this.a = obj;
    }

    @Override
    public final void h0() {
    }

    @Override
    public final void n0() {
    }

    @Override
    public final void onDismiss() {
    }

    @Override
    public final void reset() {
    }

    @Override
    public final void y() {
    }

    @Override
    public final void z0() {
    }

    @Override
    public final void P0(Object obj) {
    }

    @Override
    public final void Q1(vf7 vf7Var) {
    }

    @Override
    public final void g1(TLRPC.User user) {
    }

    @Override
    public final void onRenderedFirstFrame(tj tjVar) {
    }

    @Override
    public final void onSeekFinished(tj tjVar) {
    }

    @Override
    public final void onSeekStarted(tj tjVar) {
    }

    @Override
    public final Object mo9get() {
        jg4 jg4Var = (jg4) ((mo5) this.a).a;
        jg4Var.getClass();
        d6a d6aVar = d6a.a;
        return d6a.a(jg4Var);
    }

    @Override
    public final void k(float f, float f2) {
    }

    @Override
    public final void onError(lbc lbcVar, Exception exc) {
    }

    @Override
    public final void f1(View view, float f, float f2) {
    }

    @Override
    public final void g(View view, float f, float f2) {
    }

    @Override
    public final void n(View view, float f, float f2) {
    }

    @Override
    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
    }

    @Override
    public final void R0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }
}
