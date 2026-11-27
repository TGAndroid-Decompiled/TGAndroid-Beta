package defpackage;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.p;
public final class aj3 implements jx9, cj2, cr7, ty9, rn4, s9, tic, rj5, tw8, fc1, pj5, oa9, nr7, j98, bv9, ifc, a70 {
    public final byte a;
    public Object b;

    public aj3(byte b) {
        this.a = b;
        switch (b) {
            case 16:
                this.b = Collections.newSetFromMap(new WeakHashMap());
                return;
            case 29:
                this.b = new z8d((byte) 26);
                return;
            default:
                this.b = new ey7(10);
                return;
        }
    }

    public static aj3 Q(Object obj) {
        if (obj != null) {
            return new aj3(obj, (byte) 13);
        }
        p3d.h("instance cannot be null");
        return null;
    }

    public static a86 T(Looper looper, Object obj, String str) {
        xve.i(obj, "Listener must not be null");
        xve.i(looper, "Looper must not be null");
        return new a86(looper, obj, str);
    }

    public static float[] V(ArrayList arrayList) {
        float f;
        int i;
        int i2;
        float f2;
        double d;
        double d2;
        double[] dArr;
        ArrayList arrayList2;
        float f3;
        float f4;
        int i3;
        float f5;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            f = 255.0f;
            if (i5 >= size) {
                break;
            }
            PointF pointF = (PointF) arrayList.get(i5);
            pointF.x *= 255.0f;
            pointF.y *= 255.0f;
            i5++;
        }
        int size2 = arrayList.size();
        int i6 = 1;
        double d3 = 1.0d;
        if (size2 > 0 && size2 != 1) {
            char c = 2;
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size2, 3);
            double[] dArr3 = new double[size2];
            double[] dArr4 = dArr2[0];
            dArr4[1] = 1.0d;
            double d4 = 0.0d;
            dArr4[0] = 0.0d;
            dArr4[2] = 0.0d;
            int i7 = 1;
            while (true) {
                i3 = size2 - 1;
                if (i7 >= i3) {
                    break;
                }
                PointF pointF2 = (PointF) arrayList.get(i7 - 1);
                PointF pointF3 = (PointF) arrayList.get(i7);
                int i8 = i7 + 1;
                double d5 = d3;
                PointF pointF4 = (PointF) arrayList.get(i8);
                double[] dArr5 = dArr2[i7];
                char c2 = c;
                float f6 = pointF3.x;
                double d6 = d4;
                int i9 = i4;
                int i10 = i6;
                double d7 = f6 - pointF2.x;
                dArr5[i9] = d7 / 6.0d;
                float f7 = pointF4.x;
                float f8 = f;
                dArr5[i10] = (f7 - f5) / 3.0d;
                double d8 = f7 - f6;
                dArr5[c2] = d8 / 6.0d;
                float f9 = pointF4.y;
                float f10 = pointF3.y;
                dArr3[i7] = ((f9 - f10) / d8) - ((f10 - pointF2.y) / d7);
                i7 = i8;
                c = c2;
                d3 = d5;
                d4 = d6;
                i4 = i9;
                i6 = i10;
                f = f8;
            }
            i = i4;
            i2 = i6;
            f2 = f;
            d = d3;
            char c3 = c;
            double d9 = d4;
            d2 = 6.0d;
            dArr3[i] = d9;
            dArr3[i3] = d9;
            double[] dArr6 = dArr2[i3];
            dArr6[i2] = d;
            dArr6[i] = d9;
            dArr6[c3] = d9;
            for (int i11 = i2; i11 < size2; i11++) {
                double[] dArr7 = dArr2[i11];
                double d10 = dArr7[i];
                int i12 = i11 - 1;
                double[] dArr8 = dArr2[i12];
                double d11 = d10 / dArr8[i2];
                dArr7[i2] = dArr7[i2] - (dArr8[c3] * d11);
                dArr7[i] = d9;
                dArr3[i11] = dArr3[i11] - (d11 * dArr3[i12]);
            }
            for (int i13 = size2 - 2; i13 >= 0; i13--) {
                double[] dArr9 = dArr2[i13];
                double d12 = dArr9[c3];
                int i14 = i13 + 1;
                double[] dArr10 = dArr2[i14];
                double d13 = d12 / dArr10[i2];
                dArr9[i2] = dArr9[i2] - (dArr10[i] * d13);
                dArr9[c3] = d9;
                dArr3[i13] = dArr3[i13] - (d13 * dArr3[i14]);
            }
            dArr = new double[size2];
            for (int i15 = i; i15 < size2; i15++) {
                dArr[i15] = dArr3[i15] / dArr2[i15][i2];
            }
        } else {
            i = 0;
            i2 = 1;
            f2 = 255.0f;
            d = 1.0d;
            d2 = 6.0d;
            dArr = null;
        }
        int length = dArr.length;
        if (length < i2) {
            arrayList2 = null;
            f3 = 0.0f;
        } else {
            arrayList2 = new ArrayList(length + 1);
            int i16 = i;
            while (i16 < length - 1) {
                PointF pointF5 = (PointF) arrayList.get(i16);
                int i17 = i16 + 1;
                PointF pointF6 = (PointF) arrayList.get(i17);
                int i18 = (int) pointF5.x;
                while (true) {
                    float f11 = pointF6.x;
                    if (i18 < ((int) f11)) {
                        float f12 = i18;
                        PointF pointF7 = pointF5;
                        double d14 = f11 - pointF5.x;
                        double d15 = (f12 - f4) / d14;
                        double d16 = d - d15;
                        int i19 = length;
                        double[] dArr11 = dArr;
                        float f13 = (float) (((((((d15 * d15) * d15) - d15) * dArr11[i17]) + ((((d16 * d16) * d16) - d16) * dArr11[i16])) * ((d14 * d14) / d2)) + (pointF6.y * d15) + (pointF7.y * d16));
                        if (f13 > f2) {
                            f13 = f2;
                        } else if (f13 < 0.0f) {
                            f13 = 0.0f;
                        }
                        arrayList2.add(new PointF(f12, f13));
                        i18++;
                        dArr = dArr11;
                        pointF5 = pointF7;
                        length = i19;
                    }
                }
                i16 = i17;
            }
            f3 = 0.0f;
            arrayList2.add((PointF) c00.g(1, arrayList));
        }
        int i20 = i;
        float f14 = ((PointF) arrayList2.get(i20)).x;
        if (f14 > f3) {
            for (int i21 = (int) f14; i21 >= 0; i21--) {
                arrayList2.add(i20, new PointF(i21, f3));
            }
        }
        float f15 = ((PointF) c00.g(1, arrayList2)).x;
        if (f15 < f2) {
            for (int i22 = ((int) f15) + 1; i22 <= 255; i22++) {
                arrayList2.add(new PointF(i22, f2));
            }
        }
        float[] fArr = new float[arrayList2.size()];
        int size3 = arrayList2.size();
        while (i20 < size3) {
            PointF pointF8 = (PointF) arrayList2.get(i20);
            float sqrt = (float) Math.sqrt(Math.pow(pointF8.x - pointF8.y, 2.0d));
            if (pointF8.x > pointF8.y) {
                sqrt = -sqrt;
            }
            fArr[i20] = sqrt;
            i20++;
        }
        return fArr;
    }

    public static void b0(String str, TreeMap treeMap) {
        String[] split = str.split(":", 2);
        if (split.length < 2) {
            return;
        }
        String trim = split[0].trim();
        String trim2 = split[1].trim();
        List list = (List) treeMap.get(trim);
        if (list == null) {
            list = new ArrayList();
            treeMap.put(trim, list);
        }
        list.add(trim2);
    }

    @Override
    public final boolean A(int i) {
        return false;
    }

    @Override
    public final void B(of3 of3Var) {
        ((uj3) this.b).c5(of3Var);
    }

    @Override
    public final boolean B0(int i, View view) {
        return false;
    }

    @Override
    public final void C(int i, boolean z, boolean z2) {
        w78 w78Var = (w78) this.b;
        w78Var.removeSelfFromStack();
        if (!z) {
            w78Var.Z(w78Var.b, w78Var.c, z2, i);
        }
    }

    @Override
    public final FrameLayout D() {
        return (hc8) this.b;
    }

    @Override
    public final boolean E() {
        boolean z;
        switch (this.a) {
            case 19:
                return true;
            default:
                vab vabVar = (vab) this.b;
                if (vabVar.t0 == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    vabVar.C0(null, true);
                }
                return z;
        }
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
    public final long G() {
        return ((hc8) this.b).getCaptionsTrimEnd();
    }

    @Override
    public final void H(int i, int i2) {
        int i3;
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        RectF rectF = ProfileActivity.Z6;
        long a = profileActivity.a();
        profileActivity.getMessagesController().V4(i, a);
        if (profileActivity.w2 == null && profileActivity.v2 == null) {
            return;
        }
        UndoView undoView = profileActivity.M;
        TLRPC.User X1 = profileActivity.getMessagesController().X1(Long.valueOf(a));
        TLRPC.UserFull userFull = profileActivity.w2;
        if (userFull != null) {
            i3 = userFull.ttl_period;
        } else {
            i3 = profileActivity.v2.ttl_period;
        }
        undoView.k(a, i2, X1, Integer.valueOf(i3), null, null);
    }

    @Override
    public final void I(float f, float f2) {
        ((ActionBarLayout) uj3.k1(((nj3) this.b).o0)).p();
    }

    @Override
    public final long J() {
        return ((hc8) this.b).getCaptionsTrimStart();
    }

    @Override
    public final void K(kc1 kc1Var) {
        ((hc8) this.b).a0(kc1Var);
    }

    @Override
    public final void M(long j) {
        s64 s64Var;
        PhotoViewer photoViewer = ((hc8) this.b).d2;
        kfc kfcVar = photoViewer.G2;
        if (kfcVar != null && (s64Var = kfcVar.d) != null && s64Var.c0()) {
            photoViewer.G2.o0(j);
        }
    }

    @Override
    public final void N() {
        ((ProfileActivity) this.b).presentFragment(new x60());
        dismiss();
    }

    @Override
    public final void O() {
        switch (this.a) {
            case 19:
                gc8 gc8Var = (gc8) this.b;
                gc8Var.b.a.f();
                gc8Var.x.setViewHidden(false);
                PhotoViewer photoViewer = gc8Var.L;
                Drawable[] drawableArr = PhotoViewer.d9;
                photoViewer.g2(true, true);
                return;
            default:
                vab vabVar = (vab) this.b;
                vabVar.n0.a.f();
                vabVar.N0.setViewHidden(false);
                return;
        }
    }

    @Override
    public final void P(h44 h44Var) {
        ((hc8) this.b).s0(h44Var);
    }

    @Override
    public final void R() {
        switch (this.a) {
            case 19:
                ((gc8) this.b).x.setViewHidden(true);
                return;
            default:
                vab vabVar = (vab) this.b;
                if (vabVar.t0 != null) {
                    vabVar.C0(null, true);
                }
                vabVar.N0.setViewHidden(true);
                return;
        }
    }

    @Override
    public final l2d S(View view, l2d l2dVar) {
        q67 q67Var = (q67) this.b;
        mq5 H0 = hl.H0(l2dVar, false);
        q67Var.d = H0;
        q67Var.G.setPadding(H0.a, H0.b, H0.c, H0.d);
        q67Var.F.requestLayout();
        return l2d.b;
    }

    @Override
    public final void S0(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        ai4 ai4Var = (ai4) this.b;
        Handler handler = ai4Var.B0;
        zz3 zz3Var = ai4Var.C0;
        handler.removeCallbacks(zz3Var);
        TextView textView = ai4Var.H0;
        if (textView != null) {
            textView.setText(charSequence);
        }
        handler.postDelayed(zz3Var, 2000L);
    }

    @Override
    public final boolean T0(float f, float f2) {
        return ((nj3) this.b).o0.isInPreviewMode();
    }

    public final defpackage.pm3 U(defpackage.lh2 r41) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aj3.U(lh2):pm3");
    }

    @Override
    public final boolean W0(View view, float f, float f2) {
        return false;
    }

    public final void Y(Exception exc) {
        p pVar = (p) this.b;
        if (pVar.R0) {
            return;
        }
        pVar.N0(true, false);
        pVar.J0(false);
        if (!(exc instanceof f1) && !(exc instanceof g1)) {
            jj.t0(exc.getMessage(), pVar);
        } else {
            jj.t0(ob6.M0(2131747131, null), pVar);
        }
    }

    @Override
    public final boolean Y1() {
        return false;
    }

    @Override
    public final void a(float f) {
        switch (this.a) {
            case 8:
                return;
            default:
                s98 s98Var = (s98) this.b;
                r98[] r98VarArr = s98Var.n;
                int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
                if (i != 0 || r98VarArr[1].getVisibility() == 0) {
                    if (s98Var.w) {
                        r98 r98Var = r98VarArr[0];
                        r98Var.setTranslationX((-f) * r98Var.getMeasuredWidth());
                        r98VarArr[1].setTranslationX(r98VarArr[0].getMeasuredWidth() - (f * r98VarArr[0].getMeasuredWidth()));
                    } else {
                        r98 r98Var2 = r98VarArr[0];
                        r98Var2.setTranslationX(r98Var2.getMeasuredWidth() * f);
                        r98VarArr[1].setTranslationX((f * r98VarArr[0].getMeasuredWidth()) - r98VarArr[0].getMeasuredWidth());
                    }
                    if (i == 0) {
                        r98 r98Var3 = r98VarArr[0];
                        r98VarArr[0] = r98VarArr[1];
                        r98VarArr[1] = r98Var3;
                        r98Var3.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final void c(int i, boolean z) {
        boolean z2;
        switch (this.a) {
            case 8:
                yx4 yx4Var = (yx4) this.b;
                if (yx4Var.l2 != i) {
                    yx4Var.l2 = i;
                    yx4Var.d2.g();
                    yx4Var.T1.O(true);
                    return;
                }
                return;
            default:
                s98 s98Var = (s98) this.b;
                r98[] r98VarArr = s98Var.n;
                if (r98VarArr[0].b != i) {
                    if (i == s98Var.h.getFirstTabId()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    s98Var.e = z2;
                    r98 r98Var = r98VarArr[1];
                    r98Var.b = i;
                    r98Var.setVisibility(0);
                    s98Var.n0(true);
                    s98Var.w = z;
                    s7 s7Var = s98Var.c;
                    if (i == 0) {
                        s7Var.setSearchFieldHint(ob6.M0(2131745489, null));
                        return;
                    } else {
                        s7Var.setSearchFieldHint(ob6.M0(2131745492, null));
                        return;
                    }
                }
                return;
        }
    }

    public final defpackage.uf7 c0(defpackage.cb3 r17, defpackage.tl5 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aj3.c0(cb3, tl5, int):uf7");
    }

    @Override
    public final void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient != null) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                a3.h((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }

    @Override
    public final void dismiss() {
        ((ProfileActivity) this.b).T0.U(null, null);
    }

    @Override
    public final boolean e0() {
        return true;
    }

    @Override
    public final boolean f() {
        return true;
    }

    public final void f0() {
        i09 i09Var = (i09) this.b;
        i09Var.getClass();
        try {
            ykd ykdVar = (ykd) i09Var.b;
            Parcel R = ykdVar.R();
            int i = jld.a;
            R.writeInt(0);
            ykdVar.V(R, 2);
        } catch (RemoteException e) {
            p3d.i(e);
        }
    }

    @Override
    public final void finish() {
        Point point = hl.q;
        if (point.x > point.y) {
            ((uj3) this.b).finishPreviewFragment();
        }
    }

    public final void g(StringBuilder sb, Iterator it) {
        ow5 ow5Var = (ow5) this.b;
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb.append(ow5.c(entry.getKey()));
            sb.append("=");
            sb.append(ow5.c(entry.getValue()));
            while (it.hasNext()) {
                sb.append((CharSequence) ow5Var.b);
                Map.Entry entry2 = (Map.Entry) it.next();
                sb.append(ow5.c(entry2.getKey()));
                sb.append("=");
                sb.append(ow5.c(entry2.getValue()));
            }
        }
    }

    public final void g0() {
        i09 i09Var = (i09) this.b;
        i09Var.getClass();
        try {
            ykd ykdVar = (ykd) i09Var.b;
            Parcel R = ykdVar.R();
            int i = jld.a;
            R.writeInt(0);
            ykdVar.V(R, 3);
        } catch (RemoteException e) {
            p3d.i(e);
        }
    }

    @Override
    public final Object mo21get() {
        return this.b;
    }

    @Override
    public final CharSequence getContentDescription() {
        kl4 kl4Var = (kl4) this.b;
        float f = kl4Var.b;
        return String.valueOf(Math.round((kl4Var.a.getProgress() * (kl4Var.c - f)) + f));
    }

    @Override
    public final long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override
    public final void h() {
        w78 w78Var = (w78) this.b;
        int size = w78Var.b.size();
        tb tbVar = w78Var.R;
        if (size == 0) {
            tbVar.setPivotX(0.0f);
            w78Var.R.setPivotY(0.0f);
            w78Var.a0(false);
            return;
        }
        tbVar.invalidate();
        w78Var.a0(true);
    }

    public final void h0() {
        i09 i09Var = (i09) this.b;
        i09Var.getClass();
        try {
            ykd ykdVar = (ykd) i09Var.b;
            Parcel R = ykdVar.R();
            int i = jld.a;
            R.writeInt(0);
            ykdVar.V(R, 1);
        } catch (RemoteException e) {
            p3d.i(e);
        }
    }

    @Override
    public final void i(boolean z) {
        hc8 hc8Var = (hc8) this.b;
        PhotoViewer photoViewer = hc8Var.d2;
        kfc kfcVar = photoViewer.G2;
        if (kfcVar != null) {
            if (z) {
                if (kfcVar.c0()) {
                    hc8Var.c2 = true;
                    photoViewer.m();
                    photoViewer.G2.f0();
                }
            } else if (hc8Var.c2) {
                hc8Var.c2 = false;
                if (!photoViewer.H2 && !photoViewer.T0()) {
                    photoViewer.G2.g0();
                }
            }
        }
    }

    @Override
    public final int i0() {
        return 0;
    }

    public final void j0(pi5 pi5Var, TreeMap treeMap) {
        String str;
        List list = (List) treeMap.get("Sec-WebSocket-Protocol");
        if (list != null && (str = (String) list.get(0)) != null && str.length() != 0) {
            synchronized (((ryc) this.b).c) {
            }
            throw new tt7(19, "The protocol contained in the Sec-WebSocket-Protocol header is not supported: ".concat(str), pi5Var);
        }
    }

    @Override
    public final void k(Object obj) {
        r9 r9Var = (r9) obj;
        kq4 kq4Var = (kq4) this.b;
        gq4 gq4Var = (gq4) kq4Var.F.pollFirst();
        if (gq4Var == null) {
            Log.w("FragmentManager", "No IntentSenders were started for " + this);
            return;
        }
        String str = gq4Var.a;
        int i = gq4Var.b;
        gp4 p = kq4Var.c.p(str);
        if (p == null) {
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
            return;
        }
        p.x(i, r9Var.a, r9Var.b);
    }

    @Override
    public final void l(Editable editable) {
        w78 w78Var = (w78) this.b;
        iu3 iu3Var = w78Var.N;
        w78Var.a = editable;
        iu3Var.setText(editable);
    }

    @Override
    public final FrameLayout m() {
        return ((hc8) this.b).d2.f0;
    }

    @Override
    public final void o(boolean z, float f) {
        kl4 kl4Var = (kl4) this.b;
        float f2 = kl4Var.b;
        float A = qd4.A(kl4Var.c, f2, f, f2);
        kl4Var.d = A;
        if (z) {
            rn rnVar = kl4Var.e;
            rnVar.getClass();
            rnVar.c(null, A);
        }
        kl4Var.invalidate();
    }

    @Override
    public final void onLocationChanged(Location location) {
        if (location == null) {
            return;
        }
        ((id6) this.b).m(location);
    }

    @Override
    public final void onStateChanged(boolean z, int i) {
        mm8 mm8Var = (mm8) this.b;
        lm8 lm8Var = mm8Var.M;
        hl.r(lm8Var);
        kfc kfcVar = mm8Var.E;
        if (kfcVar != null && kfcVar.c0()) {
            hl.c3(lm8Var);
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((mm8) this.b).h();
    }

    @Override
    public final void p(float f) {
        Point point = hl.q;
        if (point.x > point.y) {
            ((uj3) this.b).movePreviewFragment(f);
        }
    }

    @Override
    public final void q() {
        switch (this.a) {
            case 19:
                gc8 gc8Var = (gc8) this.b;
                gc8Var.e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new ch4(gc8Var, (byte) 25)).setInterpolator(k43.h);
                return;
            default:
                return;
        }
    }

    @Override
    public final vnb r() {
        return ((hc8) this.b).A1;
    }

    @Override
    public final kc1 t() {
        return ((hc8) this.b).c0();
    }

    @Override
    public final void u() {
        switch (this.a) {
            case 19:
                return;
            default:
                tb tbVar = ((vab) this.b).z0;
                if (tbVar != null) {
                    tbVar.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final void v() {
        switch (this.a) {
            case 19:
                return;
            default:
                vab vabVar = (vab) this.b;
                if (vabVar.M0) {
                    vabVar.M0 = false;
                    return;
                }
                vabVar.U0.b(1);
                vabVar.s((v01) v01.a.get(0));
                return;
        }
    }

    @Override
    public final kc1 w() {
        ry5 ry5Var = ((hc8) this.b).J0;
        for (int i = 0; i < ry5Var.getChildCount(); i++) {
            if (ry5Var.getChildAt(i) instanceof kc1) {
                return (kc1) ry5Var.getChildAt(i);
            }
        }
        return null;
    }

    @Override
    public final long z() {
        return ((hc8) this.b).getCaptionsVideoPosition();
    }

    @Override
    public final void onRenderedFirstFrame() {
    }

    private final void W() {
    }

    private final void Z() {
    }

    private final void d0() {
    }

    @Override
    public final void X() {
    }

    @Override
    public final void d() {
    }

    @Override
    public final void e() {
    }

    @Override
    public final void p0() {
    }

    @Override
    public final void x() {
    }

    @Override
    public final void x0() {
    }

    @Override
    public final void y() {
    }

    private final void a0(float f) {
    }

    @Override
    public final void L(ArrayList arrayList) {
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
    public final void n(float f, float f2) {
    }

    @Override
    public final void onError(kfc kfcVar, Exception exc) {
    }

    public aj3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public aj3(byte b, boolean z) {
        this.a = b;
    }

    public aj3(TextView textView) {
        this.a = (byte) 2;
        this.b = new zy3(textView);
    }

    public aj3(Context context, Uri uri) {
        this.a = (byte) 6;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    @Override
    public final void D1(View view, float f, float f2) {
    }

    @Override
    public final void j(View view, float f, float f2) {
    }

    @Override
    public final void s(View view, float f, float f2) {
    }

    @Override
    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
    }
}
