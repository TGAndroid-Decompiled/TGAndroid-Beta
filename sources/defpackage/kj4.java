package defpackage;

import android.content.ClipDescription;
import android.content.Context;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.PhotoViewer;
public final class kj4 implements tw8, s9, vj5, v76, h8a, z34, qu4, rk6, ty9, rv9, reb, ka1, fc1, aea, p7, k98, rfc, nr7, ifc {
    public static kj4 c;
    public static kj4 d;
    public final byte a;
    public Object b;

    public kj4(Context context, qx6 qx6Var) {
        this.a = (byte) 16;
        px6 px6Var = ((gx6) qx6Var.b).c;
        DesugarCollections.synchronizedSet(new HashSet());
        if (Build.VERSION.SDK_INT >= 29) {
            this.b = new xo6(context, px6Var);
        } else {
            this.b = new xo6(context, px6Var);
        }
    }

    public static kj4 Q(boolean z) {
        if (z) {
            kj4 kj4Var = d;
            if (kj4Var == null) {
                Point point = hl.q;
                kj4 kj4Var2 = new kj4("pip_round_", point.x, point.y);
                d = kj4Var2;
                return kj4Var2;
            }
            return kj4Var;
        }
        kj4 kj4Var3 = c;
        if (kj4Var3 == null) {
            Point point2 = hl.q;
            kj4 kj4Var4 = new kj4("pip_floating_", point2.x, point2.y);
            c = kj4Var4;
            return kj4Var4;
        }
        return kj4Var3;
    }

    @Override
    public final boolean B(String str, da1 da1Var) {
        byte b = this.a;
        return false;
    }

    @Override
    public final void C(int i, int i2) {
        ((j79) this.b).p(i, i2);
    }

    @Override
    public final boolean C1(int i) {
        return true;
    }

    @Override
    public final FrameLayout D() {
        return (wab) this.b;
    }

    @Override
    public final zh6 D0() {
        return null;
    }

    @Override
    public final boolean E() {
        ((o68) this.b).I0();
        return true;
    }

    @Override
    public final void F(String str) {
        ((s98) this.b).l0(str);
    }

    @Override
    public final long G() {
        c8b c8bVar = ((wab) this.b).V1;
        if (c8bVar == null) {
            return 0L;
        }
        return c8bVar.a0 * ((float) c8bVar.h0);
    }

    @Override
    public final void H() {
        pq1 pq1Var = (pq1) this.b;
        View view = pq1Var.a;
        if (view != null) {
            view.setPressed(false);
            pq1Var.a.setSelected(false);
        }
        View view2 = pq1Var.n;
        if (view2 != null && !pq1Var.d) {
            view2.callOnClick();
            pq1Var.d = true;
        }
    }

    @Override
    public final String I() {
        byte b = this.a;
        return null;
    }

    @Override
    public final long J() {
        c8b c8bVar = ((wab) this.b).V1;
        if (c8bVar == null) {
            return 0L;
        }
        return c8bVar.Z * ((float) c8bVar.h0);
    }

    @Override
    public final void K(kc1 kc1Var) {
        ((wab) this.b).a0(kc1Var);
    }

    @Override
    public final h44 L() {
        return ((hc8) this.b).C0;
    }

    @Override
    public final void M(long j) {
        s64 s64Var;
        hbb hbbVar = ((wab) this.b).Q1;
        if (hbbVar != null) {
            kfc kfcVar = hbbVar.e;
            if (kfcVar != null && ((s64Var = kfcVar.d) == null || !s64Var.c0())) {
                return;
            }
            hbbVar.m(j);
        }
    }

    public final String O(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            vw5 vw5Var = (vw5) this.b;
            bx5 bx5Var = new bx5(stringWriter, vw5Var.a, vw5Var.b, vw5Var.c, vw5Var.d);
            bx5Var.h(obj);
            bx5Var.j();
            bx5Var.b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override
    public final void P(h44 h44Var) {
        ((wab) this.b).B0(h44Var);
    }

    public final ClipDescription R() {
        return ((iq5) this.b).getDescription();
    }

    @Override
    public final l2d S(View view, l2d l2dVar) {
        ji8 ji8Var = (ji8) this.b;
        mq5 g = l2dVar.a.g(519);
        ji8Var.r = g;
        ji8Var.d.setPadding(g.a, g.b, g.c, g.d);
        ji8Var.c.requestLayout();
        return l2d.b;
    }

    public final kj4 T(ak5 ak5Var) {
        pz5 pz5Var = (pz5) this.b;
        LatLng latLng = new LatLng(ak5Var.a, ak5Var.b);
        pz5Var.getClass();
        double d2 = pz5Var.b;
        double d3 = latLng.a;
        pz5Var.b = Math.min(d2, d3);
        pz5Var.c = Math.max(pz5Var.c, d3);
        boolean isNaN = Double.isNaN(pz5Var.d);
        double d4 = latLng.b;
        if (isNaN) {
            pz5Var.d = d4;
            pz5Var.e = d4;
            return this;
        }
        double d5 = pz5Var.d;
        double d6 = pz5Var.e;
        if (d5 > d6 ? !(d5 <= d4 || d4 <= d6) : !(d5 <= d4 && d4 <= d6)) {
            if (((d5 - d4) + 360.0d) % 360.0d < ((d4 - d6) + 360.0d) % 360.0d) {
                pz5Var.d = d4;
                return this;
            }
            pz5Var.e = d4;
        }
        return this;
    }

    @Override
    public final void W() {
        int i;
        int i2;
        l98 l98Var = (l98) this.b;
        b8 b8Var = l98Var.R;
        if (l98Var.Z) {
            i = 2131745074;
        } else {
            i = 2131745073;
        }
        b8Var.setText(ob6.M0(i, null));
        b8 b8Var2 = l98Var.R;
        if (l98Var.Z) {
            i2 = 2131232224;
        } else {
            i2 = 2131232213;
        }
        b8Var2.setIcon(i2);
    }

    @Override
    public final void X(int i, int i2) {
        ((j79) this.b).q(i, i2);
    }

    @Override
    public final void X1(ArrayList arrayList) {
        r17 r17Var = (r17) this.b;
        String str = r17Var.a0;
        if (str != null) {
            r17Var.U(str, r17Var.d0, r17Var.e0, r17Var.c0, r17Var.b0);
        }
    }

    public final void Y() {
        vh5[] vh5VarArr;
        vh5[] vh5VarArr2;
        wg5 wg5Var = (wg5) this.b;
        int i = wg5Var.I - 1;
        wg5Var.I = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (vh5 vh5Var : wg5Var.K) {
            vh5Var.g();
            i2 += vh5Var.Z.a;
        }
        t1c[] t1cVarArr = new t1c[i2];
        int i3 = 0;
        for (vh5 vh5Var2 : wg5Var.K) {
            vh5Var2.g();
            int i4 = vh5Var2.Z.a;
            int i5 = 0;
            while (i5 < i4) {
                vh5Var2.g();
                t1cVarArr[i3] = vh5Var2.Z.a(i5);
                i5++;
                i3++;
            }
        }
        wg5Var.J = new u1c(t1cVarArr);
        wg5Var.H.a(wg5Var);
    }

    @Override
    public final zh6 Z0() {
        return null;
    }

    @Override
    public final void b() {
        s98 s98Var = (s98) this.b;
        s98Var.a.b0();
        s98Var.b.b0();
    }

    @Override
    public final Object c(Object obj, Object obj2) {
        return ((es4) this.b).apply(obj2);
    }

    public final v05 d() {
        pz5 pz5Var = (pz5) this.b;
        xve.j("no included points", !Double.isNaN(pz5Var.d));
        LatLngBounds latLngBounds = new LatLngBounds(new LatLng(pz5Var.b, pz5Var.d), new LatLng(pz5Var.c, pz5Var.e));
        ?? obj = new Object();
        obj.a = latLngBounds;
        return obj;
    }

    @Override
    public final void e() {
        ((hc8) this.b).t0(null, true);
    }

    @Override
    public final void f(i8a i8aVar) {
        vh5 vh5Var = (vh5) i8aVar;
        wg5 wg5Var = (wg5) this.b;
        wg5Var.H.f(wg5Var);
    }

    @Override
    public final void g(float f) {
        nc8 nc8Var;
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        if (photoViewer.G2 == null && ((nc8Var = photoViewer.g0) == null || !nc8Var.y)) {
            return;
        }
        if (!photoViewer.G8 && photoViewer.W7.getVisibility() == 0) {
            f = ((photoViewer.X7.getRightProgress() - photoViewer.X7.getLeftProgress()) * f) + photoViewer.X7.getLeftProgress();
        }
        long z0 = photoViewer.z0();
        if (z0 == -9223372036854775807L) {
            photoViewer.a3 = f;
        } else {
            photoViewer.C1((int) (f * ((float) z0)));
        }
        photoViewer.l2(false);
        photoViewer.u3 = false;
    }

    @Override
    public final Object mo21get() {
        ji4 ji4Var = (ji4) ((aj3) this.b).b;
        ji4Var.getClass();
        v9a v9aVar = v9a.a;
        return v9a.a(ji4Var);
    }

    @Override
    public final CharSequence getContentDescription() {
        StringBuilder sb = new StringBuilder();
        n63 n63Var = (n63) this.b;
        sb.append((Object) n63Var.a.getText());
        sb.append(" ");
        sb.append((Object) n63Var.b.getText());
        return sb.toString();
    }

    @Override
    public final void h(float f) {
        zb8 zb8Var;
        zb8 zb8Var2;
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        nc8 nc8Var = photoViewer.g0;
        if (nc8Var != null && nc8Var.y && (zb8Var2 = photoViewer.s3) != null) {
            int i = photoViewer.q3.h - sfc.S;
            zb8Var2.O = nc8Var;
            if (zb8Var2.a0 != 0) {
                zb8Var2.a0 = 0L;
                zb8Var2.g0 = null;
                zb8Var2.f0 = null;
                zb8Var2.e0 = null;
                zb8Var2.b(-1);
            }
            if (i != 0) {
                zb8Var2.r = i;
                int i2 = ((int) (i * f)) / 5;
                if (zb8Var2.n != i2) {
                    zb8Var2.n = i2;
                }
            }
            String g0 = hl.g0((int) ((nc8Var.getVideoDuration() * f) / 1000), false, false);
            zb8Var2.E = g0;
            zb8Var2.F = (int) Math.ceil(zb8Var2.G.measureText(g0));
            zb8Var2.invalidate();
            if (zb8Var2.f != null) {
                Utilities.e.a(zb8Var2.f);
            }
            double videoDuration = (f * nc8Var.getVideoDuration()) / 1000.0d;
            zb8Var2.P = videoDuration;
            String b = nc8Var.b((int) videoDuration);
            if (b != null) {
                zb8Var2.R.e0(b, null, null, null, 0L);
            }
        } else if (photoViewer.G2 != null && (zb8Var = photoViewer.s3) != null) {
            zb8Var.e(photoViewer.S4, f, photoViewer.q3.h - sfc.S);
        }
        ((PhotoViewer) this.b).l2(true);
        ((PhotoViewer) this.b).R2();
    }

    @Override
    public final void i(boolean z) {
        hbb hbbVar = ((wab) this.b).Q1;
        if (hbbVar != null) {
            hbbVar.x(-8713, z);
        }
    }

    @Override
    public final int i0() {
        return 0;
    }

    @Override
    public final heb j(int i, int i2, byte[] bArr) {
        return uh9.c(this, bArr, i2);
    }

    @Override
    public final void k(Object obj) {
        int i;
        Map map = (Map) obj;
        kq4 kq4Var = (kq4) this.b;
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
        gq4 gq4Var = (gq4) kq4Var.F.pollFirst();
        if (gq4Var == null) {
            Log.w("FragmentManager", "No permissions were requested for " + this);
            return;
        }
        String str = gq4Var.a;
        if (kq4Var.c.p(str) == null) {
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    @Override
    public final void l(byte[] bArr, int i, int i2, qeb qebVar, ot2 ot2Var) {
        boolean z;
        m43 a;
        boolean z2;
        ey7 ey7Var = (ey7) this.b;
        ey7Var.L(i2 + i, bArr);
        ey7Var.N(i);
        ArrayList arrayList = new ArrayList();
        while (ey7Var.a() > 0) {
            if (ey7Var.a() >= 8) {
                z = true;
            } else {
                z = false;
            }
            yve.e("Incomplete Mp4Webvtt Top Level box header found.", z);
            int m = ey7Var.m() - 8;
            if (ey7Var.m() == 1987343459) {
                CharSequence charSequence = null;
                l43 l43Var = null;
                while (m > 0) {
                    if (m >= 8) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    yve.e("Incomplete vtt cue box header found.", z2);
                    int m2 = ey7Var.m();
                    int m3 = ey7Var.m();
                    int i3 = m2 - 8;
                    byte[] bArr2 = ey7Var.a;
                    int i4 = ey7Var.b;
                    String str = gcc.a;
                    String str2 = new String(bArr2, i4, i3, StandardCharsets.UTF_8);
                    ey7Var.O(i3);
                    m = (m - 8) - i3;
                    if (m3 == 1937011815) {
                        qzc qzcVar = new qzc();
                        rzc.e(str2, qzcVar);
                        l43Var = qzcVar.a();
                    } else if (m3 == 1885436268) {
                        charSequence = rzc.f(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (l43Var != null) {
                    l43Var.a = charSequence;
                    l43Var.b = null;
                    a = l43Var.a();
                } else {
                    Pattern pattern = rzc.a;
                    qzc qzcVar2 = new qzc();
                    qzcVar2.c = charSequence;
                    a = qzcVar2.a().a();
                }
                arrayList.add(a);
            } else {
                ey7Var.O(m);
            }
        }
        ot2Var.accept(new p43(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    @Override
    public final FrameLayout m() {
        return ((wab) this.b).w1;
    }

    @Override
    public final void n(int i, int i2) {
        ((j79) this.b).j(i, i2);
    }

    @Override
    public final void o(boolean r9, float r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kj4.o(boolean, float):void");
    }

    @Override
    public final void onDismiss() {
        byte b = this.a;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        pq1 pq1Var = (pq1) this.b;
        View view = pq1Var.a;
        if (view != null) {
            view.setPressed(true);
            pq1Var.a.setSelected(true);
            pq1Var.a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
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
        pq1 pq1Var = (pq1) this.b;
        zu1 zu1Var = pq1Var.x;
        if (pq1Var.a != null) {
            zu1Var.g9 = fd0.b(zu1Var, pq1Var.w, zu1Var.l6, zu1Var.c(), zu1Var.Ba);
            n8 n8Var = zu1Var.g9;
            if (n8Var != null) {
                pq1Var.b = n8Var;
                n8Var.setOnDismissListener(new y6(pq1Var, (byte) 3));
                zu1Var.A0.E0();
                zu1Var.C0.R = false;
                ImageView imageView = pq1Var.w;
                zu1Var.Nb(imageView);
                if (imageView != zu1Var.y1) {
                    z = true;
                } else {
                    z = false;
                }
                zu1Var.y6(false, z, 0.3f);
                zu1Var.H7(false);
                ls1 ls1Var = zu1Var.O3;
                if (ls1Var != null) {
                    ls1Var.d(1, true);
                }
                UndoView undoView = zu1Var.N3;
                if (undoView != null) {
                    undoView.d(1, true);
                }
                nr1 nr1Var = zu1Var.a0;
                if (nr1Var != null && nr1Var.getEditField() != null) {
                    zu1Var.a0.getEditField().setAllowDrawCursor(false);
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
        pq1 pq1Var = (pq1) this.b;
        if (!pq1Var.e && (view = pq1Var.a) != null) {
            view.callOnClick();
            pq1Var.e = true;
            return true;
        }
        return false;
    }

    @Override
    public final void onStateChanged(boolean z, int i) {
        mm8 mm8Var = (mm8) this.b;
        kfc kfcVar = mm8Var.y;
        if (kfcVar == null) {
            return;
        }
        boolean c0 = kfcVar.c0();
        lm8 lm8Var = mm8Var.N;
        if (c0) {
            hl.c3(lm8Var);
        } else {
            hl.r(lm8Var);
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
        pp9 pp9Var = ((mm8) this.b).x;
        if (pp9Var != null) {
            float f2 = i / i2;
            if (Math.abs(pp9Var.A0 - f2) >= 1.0E-4f) {
                pp9Var.A0 = f2;
                pp9Var.requestLayout();
            }
        }
    }

    @Override
    public final void p(int i) {
        ((r17) this.b).f();
    }

    @Override
    public final void p0(fi7 fi7Var) {
        switch (this.a) {
            case 20:
                return;
            default:
                b18 b18Var = (b18) this.b;
                if (!TextUtils.isEmpty(fi7Var.b)) {
                    b18Var.Z[0].setText(fi7Var.b);
                }
                if (!TextUtils.isEmpty(fi7Var.d)) {
                    b18Var.Z[1].setText(fi7Var.d);
                }
                if (!TextUtils.isEmpty(fi7Var.c)) {
                    b18Var.Z[2].setText(fi7Var.c);
                }
                int i = fi7Var.n;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            b18Var.x = "female";
                            b18Var.Z[4].setText(ob6.M0(2131747296, null));
                        }
                    } else {
                        b18Var.x = "male";
                        b18Var.Z[4].setText(ob6.M0(2131747235, null));
                    }
                }
                if (!TextUtils.isEmpty(fi7Var.m)) {
                    String str = fi7Var.m;
                    b18Var.s = str;
                    String str2 = (String) b18Var.Z0.get(str);
                    if (str2 != null) {
                        b18Var.Z[5].setText(str2);
                    }
                }
                if (!TextUtils.isEmpty(fi7Var.l)) {
                    String str3 = fi7Var.l;
                    b18Var.w = str3;
                    String str4 = (String) b18Var.Z0.get(str3);
                    if (str4 != null) {
                        b18Var.Z[6].setText(str4);
                    }
                }
                int i2 = fi7Var.k;
                if (i2 > 0 && fi7Var.j > 0 && fi7Var.i > 0) {
                    b18Var.Z[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i2), Integer.valueOf(fi7Var.j), Integer.valueOf(fi7Var.i)));
                    return;
                }
                return;
        }
    }

    @Override
    public final void q(String str) {
        switch (this.a) {
            case 20:
                String c2 = m01.c(str);
                if (!TextUtils.isEmpty(c2)) {
                    uc7.s1(((sl7) this.b).a).a2().a(c2, null, new bm0((byte) 19));
                    return;
                } else {
                    hl.c3(new pg6((byte) 6));
                    return;
                }
            default:
                return;
        }
    }

    @Override
    public final vnb r() {
        return ((wab) this.b).q1;
    }

    @Override
    public final int s() {
        return 2;
    }

    @Override
    public final kc1 t() {
        wab wabVar = (wab) this.b;
        wabVar.Z1 = true;
        return wabVar.e0();
    }

    public final eu6 v() {
        eu6 eu6Var = (eu6) this.b;
        if (eu6Var.a != null) {
            if (!Double.isNaN(eu6Var.d) && eu6Var.d < 0.0d) {
                lq5.j("startTime cannot be negative or NaN.");
                return null;
            } else if (!Double.isNaN(eu6Var.e)) {
                if (!Double.isNaN(eu6Var.f) && eu6Var.f >= 0.0d) {
                    return eu6Var;
                }
                lq5.j("preloadTime cannot be negative or Nan.");
                return null;
            } else {
                lq5.j("playbackDuration cannot be NaN.");
                return null;
            }
        }
        lq5.j("media cannot be null.");
        return null;
    }

    @Override
    public final kc1 w() {
        zw7 zw7Var = ((wab) this.b).B0;
        for (int i = 0; i < zw7Var.getChildCount(); i++) {
            if (zw7Var.getChildAt(i) instanceof kc1) {
                return (kc1) zw7Var.getChildAt(i);
            }
        }
        return null;
    }

    @Override
    public final void x0(int i, int i2) {
        ((j79) this.b).n(i, i2, null);
    }

    @Override
    public final long z() {
        hbb hbbVar = ((wab) this.b).Q1;
        if (hbbVar != null) {
            return hbbVar.getCurrentPosition();
        }
        return 0L;
    }

    @Override
    public final void onRenderedFirstFrame() {
    }

    private final void U() {
    }

    private final void V() {
    }

    @Override
    public final void A() {
    }

    @Override
    public final void reset() {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void x() {
    }

    private final void N(String str) {
    }

    private final void y(fi7 fi7Var) {
    }

    @Override
    public final void onRenderedFirstFrame(uj ujVar) {
    }

    @Override
    public final void onSeekFinished(uj ujVar) {
    }

    @Override
    public final void onSeekStarted(uj ujVar) {
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public final void onError(kfc kfcVar, Exception exc) {
    }

    public kj4(MediaInfo mediaInfo) {
        this.a = (byte) 17;
        eu6 eu6Var = new eu6(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo != null) {
            this.b = eu6Var;
        } else {
            lq5.j("media cannot be null.");
            throw null;
        }
    }

    public kj4(JSONObject jSONObject) {
        this.a = (byte) 17;
        this.b = new eu6(jSONObject);
    }

    public kj4(byte b) {
        this.a = b;
        switch (b) {
            case 19:
                this.b = new ey7();
                return;
            default:
                return;
        }
    }

    public kj4(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.a = (byte) 3;
        this.b = new GestureDetector(context, onGestureListener, null);
    }

    public kj4(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = (byte) 8;
        if (Build.VERSION.SDK_INT >= 25) {
            this.b = new hq5(uri, clipDescription, uri2);
        } else {
            this.b = new pm3(uri, clipDescription, uri2, (byte) 11);
        }
    }

    public kj4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public kj4(String str, int i, int i2) {
        this.a = (byte) 1;
        this.b = a.b.getSharedPreferences(c00.h(i, i2, str, "_"), 0);
    }
}
