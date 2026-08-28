package m5;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.View;
import android.widget.EditText;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import f7.j5;
import g7.y5;
import j$.util.Objects;
import j3.r0;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.e3;
import org.telegram.ui.Cells.g1;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.h50;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.kn0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.Components.t90;
import org.telegram.ui.Components.x4;
import org.telegram.ui.Components.z51;
import org.telegram.ui.li0;
import qh.b2;
import qh.d1;
import qh.d4;
import qh.f4;
import qh.k3;
import qh.o3;
import qh.x1;
import r0.m1;
import xf.a1;
import xf.c1;
import xf.s0;
import xf.z0;
import yf.v0;
import yf.v1;
public final class c0 implements com.google.android.gms.common.api.internal.s, androidx.activity.result.b, OnSuccessListener, na.n, z51, x4, t90, r0.o, p5.a, kn0, qh.g0, v0.i, v1 {
    public final int f17377a;
    public Object f17378b;

    public c0(Object obj, int i9) {
        this.f17377a = i9;
        this.f17378b = obj;
    }

    public static float[] l(ArrayList arrayList) {
        double d;
        double d9;
        float f10;
        double[] dArr;
        ArrayList arrayList2;
        float f11;
        float f12;
        int i9;
        float f13;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            PointF pointF = (PointF) arrayList.get(i10);
            pointF.x *= 255.0f;
            pointF.y *= 255.0f;
        }
        int size2 = arrayList.size();
        double d10 = 1.0d;
        if (size2 <= 0 || size2 == 1) {
            d = 1.0d;
            d9 = 6.0d;
            f10 = 255.0f;
            dArr = null;
        } else {
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size2, 3);
            double[] dArr3 = new double[size2];
            double[] dArr4 = dArr2[0];
            dArr4[1] = 1.0d;
            double d11 = 0.0d;
            dArr4[0] = 0.0d;
            dArr4[2] = 0.0d;
            int i11 = 1;
            while (true) {
                i9 = size2 - 1;
                if (i11 >= i9) {
                    break;
                }
                PointF pointF2 = (PointF) arrayList.get(i11 - 1);
                PointF pointF3 = (PointF) arrayList.get(i11);
                int i12 = i11 + 1;
                double d12 = d10;
                PointF pointF4 = (PointF) arrayList.get(i12);
                double[] dArr5 = dArr2[i11];
                float f14 = pointF3.x;
                double d13 = d11;
                double d14 = f14 - pointF2.x;
                dArr5[0] = d14 / 6.0d;
                float f15 = pointF4.x;
                dArr5[1] = (f15 - f13) / 3.0d;
                double d15 = f15 - f14;
                dArr5[2] = d15 / 6.0d;
                float f16 = pointF4.y;
                float f17 = pointF3.y;
                dArr3[i11] = ((f16 - f17) / d15) - ((f17 - pointF2.y) / d14);
                i11 = i12;
                d10 = d12;
                d11 = d13;
            }
            d = d10;
            double d16 = d11;
            d9 = 6.0d;
            f10 = 255.0f;
            dArr3[0] = d16;
            dArr3[i9] = d16;
            double[] dArr6 = dArr2[i9];
            dArr6[1] = d;
            dArr6[0] = d16;
            dArr6[2] = d16;
            for (int i13 = 1; i13 < size2; i13++) {
                double[] dArr7 = dArr2[i13];
                double d17 = dArr7[0];
                int i14 = i13 - 1;
                double[] dArr8 = dArr2[i14];
                double d18 = d17 / dArr8[1];
                dArr7[1] = dArr7[1] - (dArr8[2] * d18);
                dArr7[0] = d16;
                dArr3[i13] = dArr3[i13] - (d18 * dArr3[i14]);
            }
            for (int i15 = size2 - 2; i15 >= 0; i15--) {
                double[] dArr9 = dArr2[i15];
                double d19 = dArr9[2];
                int i16 = i15 + 1;
                double[] dArr10 = dArr2[i16];
                double d20 = d19 / dArr10[1];
                dArr9[1] = dArr9[1] - (dArr10[0] * d20);
                dArr9[2] = d16;
                dArr3[i15] = dArr3[i15] - (d20 * dArr3[i16]);
            }
            dArr = new double[size2];
            for (int i17 = 0; i17 < size2; i17++) {
                dArr[i17] = dArr3[i17] / dArr2[i17][1];
            }
        }
        int length = dArr.length;
        if (length < 1) {
            arrayList2 = null;
            f11 = 0.0f;
        } else {
            arrayList2 = new ArrayList(length + 1);
            int i18 = 0;
            while (i18 < length - 1) {
                PointF pointF5 = (PointF) arrayList.get(i18);
                int i19 = i18 + 1;
                PointF pointF6 = (PointF) arrayList.get(i19);
                int i20 = (int) pointF5.x;
                while (true) {
                    float f18 = pointF6.x;
                    if (i20 < ((int) f18)) {
                        float f19 = i20;
                        PointF pointF7 = pointF5;
                        double d21 = f18 - pointF5.x;
                        double d22 = (f19 - f12) / d21;
                        double d23 = d - d22;
                        int i21 = length;
                        double[] dArr11 = dArr;
                        float f20 = (float) (((((((d22 * d22) * d22) - d22) * dArr11[i19]) + ((((d23 * d23) * d23) - d23) * dArr11[i18])) * ((d21 * d21) / d9)) + (pointF6.y * d22) + (pointF7.y * d23));
                        if (f20 > f10) {
                            f20 = 255.0f;
                        } else if (f20 < 0.0f) {
                            f20 = 0.0f;
                        }
                        arrayList2.add(new PointF(f19, f20));
                        i20++;
                        dArr = dArr11;
                        pointF5 = pointF7;
                        length = i21;
                    }
                }
                i18 = i19;
            }
            f11 = 0.0f;
            arrayList2.add((PointF) r0.j(1, arrayList));
        }
        float f21 = ((PointF) arrayList2.get(0)).x;
        if (f21 > f11) {
            for (int i22 = (int) f21; i22 >= 0; i22--) {
                arrayList2.add(0, new PointF(i22, 0.0f));
            }
        }
        float f22 = ((PointF) r0.j(1, arrayList2)).x;
        if (f22 < f10) {
            for (int i23 = ((int) f22) + 1; i23 <= 255; i23++) {
                arrayList2.add(new PointF(i23, 255.0f));
            }
        }
        float[] fArr = new float[arrayList2.size()];
        int size3 = arrayList2.size();
        for (int i24 = 0; i24 < size3; i24++) {
            PointF pointF8 = (PointF) arrayList2.get(i24);
            float sqrt = (float) Math.sqrt(Math.pow(pointF8.x - pointF8.y, 2.0d));
            if (pointF8.x > pointF8.y) {
                sqrt = -sqrt;
            }
            fArr[i24] = sqrt;
        }
        return fArr;
    }

    public static c0 m(float f10, int i9) {
        boolean z10;
        Point point = AndroidUtilities.displaySize;
        int i10 = (int) (point.x * f10);
        int i11 = (int) (point.y * f10);
        if (i10 == i11) {
            return new c0(i10, i11, new int[0]);
        }
        if (i9 == 3) {
            return new c0(i10, i11, new int[]{i11, i10});
        }
        boolean z11 = true;
        if (i9 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 >= i11) {
            z11 = false;
        }
        if (z10 == z11) {
            return new c0(i10, i11, new int[0]);
        }
        return new c0(i11, i10, new int[0]);
    }

    @Override
    public void B(int i9, int i10, boolean z10) {
        switch (this.f17377a) {
            case 12:
                ((ChatActivityEnterView) this.f17378b).T0(i9, z10, 0, true, 0L);
                return;
            default:
                x1 x1Var = (x1) this.f17378b;
                x1Var.r0(i9, i10, z10);
                li0 li0Var = x1Var.K0;
                if (li0Var != null) {
                    li0Var.i();
                    x1Var.K0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public n9 D() {
        d4 d4Var = ((f4) this.f17378b).C;
        if (d4Var != null) {
            return ((k3) d4Var).f46489a.getTextSelectionHelper();
        }
        return null;
    }

    @Override
    public void G(CharSequence charSequence) {
        d4 d4Var = ((f4) this.f17378b).C;
        if (d4Var != null) {
            k3 k3Var = (k3) d4Var;
            k3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                k3Var.f46489a.t4(charSequence.toString());
            }
        }
    }

    @Override
    public m9 H() {
        return (f4) this.f17378b;
    }

    @Override
    public qh.a I() {
        return ((f4) this.f17378b).f46834a;
    }

    @Override
    public boolean K() {
        f4 f4Var = (f4) this.f17378b;
        d4 d4Var = f4Var.C;
        if (d4Var != null) {
            qh.a aVar = f4Var.f46834a;
            if (((k3) d4Var).f46489a.S4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public m1 L0(View view, m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        ll0 ll0Var = (ll0) this.f17378b;
        ll0Var.v.setPadding(defaultWindowInsets.f10848a, defaultWindowInsets.f10849b, defaultWindowInsets.f10850c, defaultWindowInsets.d);
        ll0Var.f30477s.requestLayout();
        return m1.f46928b;
    }

    @Override
    public void N0() {
        f4 f4Var = (f4) this.f17378b;
        d4 d4Var = f4Var.C;
        if (d4Var != null) {
            qh.a aVar = f4Var.f46834a;
            o3.O1(((k3) d4Var).f46489a);
        }
    }

    @Override
    public void Q(int i9, int i10) {
        f4 f4Var = (f4) this.f17378b;
        d4 d4Var = f4Var.C;
        if (d4Var != null) {
            qh.a aVar = f4Var.f46834a;
            b2 b2Var = ((k3) d4Var).f46489a.F3;
            if (b2Var != null) {
                b2Var.f(i9, i10);
            }
        }
    }

    @Override
    public void T() {
        f4 f4Var = (f4) this.f17378b;
        d4 d4Var = f4Var.C;
        if (d4Var != null) {
            qh.a aVar = f4Var.f46834a;
            o3 o3Var = ((k3) d4Var).f46489a;
            b2 b2Var = o3Var.F3;
            if (b2Var != null) {
                b2Var.g();
            }
            o3Var.f46565d3.onContentChanged();
        }
    }

    @Override
    public Object Y1() {
        Type type = (Type) this.f17378b;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            throw new RuntimeException("Invalid EnumSet type: " + type.toString());
        }
        throw new RuntimeException("Invalid EnumSet type: " + type.toString());
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f17377a) {
            case 0:
                q5.x xVar = (q5.x) obj;
                q5.f fVar = (q5.f) xVar.u();
                e0 e0Var = ((f0) this.f17378b).f17393k;
                Parcel M0 = fVar.M0();
                com.google.android.gms.internal.cast.u.d(M0, e0Var);
                fVar.R0(M0, 18);
                q5.f fVar2 = (q5.f) xVar.u();
                fVar2.R0(fVar2.M0(), 17);
                ((TaskCompletionSource) obj2).setResult(null);
                return;
            default:
                s6.a aVar = new s6.a((TaskCompletionSource) obj2);
                s6.i iVar = (s6.i) ((s6.c) obj).u();
                String str = ((s6.b) this.f17378b).f47453k;
                Parcel I0 = iVar.I0();
                int i9 = s6.f.f47457a;
                I0.writeStrongBinder(aVar);
                I0.writeString(str);
                iVar.J0(I0, 2);
                return;
        }
    }

    @Override
    public void b(float f10) {
        qh.x xVar = (qh.x) this.f17378b;
        MessageObject messageObject = xVar.L;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f10;
        MediaController.getInstance().seekToProgress(xVar.L, f10);
    }

    public void c(StringBuilder sb2, AbstractCollection abstractCollection) {
        CharSequence obj;
        CharSequence obj2;
        Iterator it = abstractCollection.iterator();
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                if (next instanceof CharSequence) {
                    obj = (CharSequence) next;
                } else {
                    obj = next.toString();
                }
                sb2.append(obj);
                while (it.hasNext()) {
                    sb2.append((CharSequence) ((String) this.f17378b));
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    if (next2 instanceof CharSequence) {
                        obj2 = (CharSequence) next2;
                    } else {
                        obj2 = next2.toString();
                    }
                    sb2.append(obj2);
                }
            }
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override
    public void d(d1 d1Var) {
        d4 d4Var = ((f4) this.f17378b).C;
        if (d4Var != null) {
            o3 o3Var = ((k3) d4Var).f46489a;
            o3.M1(o3Var, d1Var);
            o3Var.f46565d3.f1(d1Var, true);
        }
    }

    @Override
    public void e(float f10) {
        MessageObject messageObject = ((qh.x) this.f17378b).L;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f10;
    }

    @Override
    public void f(Object obj) {
        Bundle extras;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f17378b;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f400b;
        int i9 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).f18319a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.J;
        if (resultReceiver != null) {
            if (intent == null) {
                extras = null;
            } else {
                extras = intent.getExtras();
            }
            resultReceiver.send(i9, extras);
        }
        int i10 = aVar.f399a;
        if (i10 != -1 || i9 != 0) {
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i10 + " and billing's responseCode: " + i9);
        }
        proxyBillingActivityV2.finish();
    }

    @Override
    public void g() {
        f4 f4Var = (f4) this.f17378b;
        d4 d4Var = f4Var.C;
        if (d4Var != null) {
            o3.P1(((k3) d4Var).f46489a, f4Var.f46834a);
        }
    }

    @Override
    public void g0(float f10) {
        v0 v0Var = (v0) this.f17378b;
        s0.e(v0Var.f50128a).k("-1", f10);
        v0Var.f50131e.setBrushSize(f10);
    }

    @Override
    public float get() {
        v0 v0Var = (v0) this.f17378b;
        int i9 = v0Var.f50128a;
        xf.m currentBrush = v0Var.f50131e.getCurrentBrush();
        if (currentBrush == null) {
            return s0.e(i9).f49364i;
        }
        return s0.e(i9).f("-1", currentBrush.d());
    }

    @Override
    public Paint.FontMetricsInt h() {
        return ((ki) this.f17378b).A0.getEditText().getPaint().getFontMetricsInt();
    }

    public void i() {
        a1 a1Var = ((c1) this.f17378b).d;
        if (a1Var != null) {
            z0 z0Var = a1Var.f49166s;
            if (z0Var != null) {
                a1Var.cancelRunnable(z0Var);
                a1Var.f49166s = null;
            }
            z0 z0Var2 = new z0(a1Var, 1);
            a1Var.f49166s = z0Var2;
            a1Var.postRunnable(z0Var2, 1L);
        }
    }

    @Override
    public void invalidate() {
        switch (this.f17377a) {
            case 10:
                ((t1) ((g1) this.f17378b).f24369b).invalidate();
                return;
            default:
                ((pf0) this.f17378b).h.invalidate();
                return;
        }
    }

    public j4.c j(g5.b r42) {
        throw new UnsupportedOperationException("Method not decompiled: m5.c0.j(g5.b):j4.c");
    }

    public int k(int i9, int[] iArr) {
        int[] iArr2;
        int[] iArr3;
        int i10;
        int i11;
        int i12;
        nb.a aVar = (nb.a) this.f17378b;
        if (iArr.length != 0) {
            int length = iArr.length;
            if (length > 1 && iArr[0] == 0) {
                int i13 = 1;
                while (i13 < length && iArr[i13] == 0) {
                    i13++;
                }
                if (i13 == length) {
                    iArr2 = new int[]{0};
                } else {
                    int i14 = length - i13;
                    int[] iArr4 = new int[i14];
                    System.arraycopy(iArr, i13, iArr4, 0, i14);
                    iArr2 = iArr4;
                }
            } else {
                iArr2 = iArr;
            }
            int[] iArr5 = new int[i9];
            boolean z10 = true;
            for (int i15 = 0; i15 < i9; i15++) {
                int i16 = aVar.f18566a[aVar.f18571g + i15];
                if (i16 == 0) {
                    i12 = iArr2[iArr2.length - 1];
                } else {
                    if (i16 == 1) {
                        i11 = 0;
                        for (int i17 : iArr2) {
                            nb.a aVar2 = nb.a.h;
                            i11 ^= i17;
                        }
                    } else {
                        i11 = iArr2[0];
                        int length2 = iArr2.length;
                        for (int i18 = 1; i18 < length2; i18++) {
                            i11 = aVar.c(i16, i11) ^ iArr2[i18];
                        }
                    }
                    i12 = i11;
                }
                iArr5[(i9 - 1) - i15] = i12;
                if (i12 != 0) {
                    z10 = false;
                }
            }
            if (z10) {
                return 0;
            }
            nb.b bVar = new nb.b(aVar, iArr5);
            nb.b a2 = aVar.a(i9, 1);
            nb.b bVar2 = aVar.f18568c;
            if (a2.d() >= bVar.d()) {
                a2 = bVar;
                bVar = a2;
            }
            nb.b bVar3 = aVar.d;
            nb.b bVar4 = a2;
            nb.b bVar5 = bVar;
            nb.b bVar6 = bVar4;
            nb.b bVar7 = bVar2;
            while (bVar6.d() * 2 >= i9) {
                if (!bVar6.e()) {
                    int b10 = aVar.b(bVar6.c(bVar6.d()));
                    nb.b bVar8 = bVar2;
                    while (bVar5.d() >= bVar6.d() && !bVar5.e()) {
                        int d = bVar5.d() - bVar6.d();
                        int c10 = aVar.c(bVar5.c(bVar5.d()), b10);
                        bVar8 = bVar8.a(aVar.a(d, c10));
                        bVar5 = bVar5.a(bVar6.h(d, c10));
                    }
                    nb.b a3 = bVar8.g(bVar3).a(bVar7);
                    if (bVar5.d() < bVar6.d()) {
                        nb.b bVar9 = bVar5;
                        bVar5 = bVar6;
                        bVar6 = bVar9;
                        bVar7 = bVar3;
                        bVar3 = a3;
                    } else {
                        throw new IllegalStateException("Division algorithm failed to reduce polynomial? r: " + bVar5 + ", rLast: " + bVar6);
                    }
                } else {
                    throw new Exception("r_{i-1} was zero");
                }
            }
            int c11 = bVar3.c(0);
            if (c11 != 0) {
                int b11 = aVar.b(c11);
                nb.b[] bVarArr = {bVar3.f(b11), bVar6.f(b11)};
                nb.b bVar10 = bVarArr[0];
                nb.b bVar11 = bVarArr[1];
                int d9 = bVar10.d();
                if (d9 == 1) {
                    iArr3 = new int[]{bVar10.c(1)};
                } else {
                    int[] iArr6 = new int[d9];
                    int i19 = 0;
                    for (int i20 = 1; i20 < aVar.f18569e && i19 < d9; i20++) {
                        if (bVar10.b(i20) == 0) {
                            iArr6[i19] = aVar.b(i20);
                            i19++;
                        }
                    }
                    if (i19 == d9) {
                        iArr3 = iArr6;
                    } else {
                        throw new Exception("Error locator degree does not match number of roots");
                    }
                }
                int length3 = iArr3.length;
                int[] iArr7 = new int[length3];
                for (int i21 = 0; i21 < length3; i21++) {
                    int b12 = aVar.b(iArr3[i21]);
                    int i22 = 1;
                    for (int i23 = 0; i23 < length3; i23++) {
                        if (i21 != i23) {
                            int c12 = aVar.c(iArr3[i23], b12);
                            if ((c12 & 1) == 0) {
                                i10 = c12 | 1;
                            } else {
                                i10 = c12 & (-2);
                            }
                            i22 = aVar.c(i22, i10);
                        }
                    }
                    int c13 = aVar.c(bVar11.b(b12), aVar.b(i22));
                    iArr7[i21] = c13;
                    if (aVar.f18571g != 0) {
                        iArr7[i21] = aVar.c(c13, b12);
                    }
                }
                for (int i24 = 0; i24 < iArr3.length; i24++) {
                    int length4 = iArr.length - 1;
                    int i25 = iArr3[i24];
                    if (i25 != 0) {
                        int i26 = length4 - aVar.f18567b[i25];
                        if (i26 >= 0) {
                            iArr[i26] = iArr[i26] ^ iArr7[i24];
                        } else {
                            throw new Exception("Bad error location");
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                return iArr3.length;
            }
            throw new Exception("sigmaTilde(0) was zero");
        }
        throw new IllegalArgumentException();
    }

    @Override
    public void onError(Object obj) {
        w0.d e10 = (w0.d) obj;
        kotlin.jvm.internal.i.e(e10, "e");
        hd.m mVar = (hd.m) this.f17378b;
        if (mVar.w()) {
            mVar.resumeWith(y5.a(e10));
        }
    }

    @Override
    public void onResult(Object obj) {
        v0.c result = (v0.c) obj;
        kotlin.jvm.internal.i.e(result, "result");
        hd.m mVar = (hd.m) this.f17378b;
        if (mVar.w()) {
            mVar.resumeWith(result);
        }
    }

    @Override
    public void onSuccess(Object obj) {
        ((n5.a) this.f17378b).getClass();
        j5.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    @Override
    public void y(int i9, int i10, CharSequence charSequence, boolean z10) {
        ki kiVar = (ki) this.f17378b;
        if (kiVar.m1() == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(kiVar.m1().getText());
            spannableStringBuilder.replace(i9, i10 + i9, charSequence);
            if (z10) {
                Emoji.replaceEmoji(spannableStringBuilder, kiVar.m1().getEditText().getPaint().getFontMetricsInt(), false);
            }
            kiVar.m1().setText(spannableStringBuilder);
            kiVar.m1().setSelection(i9 + charSequence.length());
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public void y0(Bitmap bitmap) {
        q5.b bVar = p5.h.v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f10 = width;
            int height = bitmap.getHeight();
            int d = (int) aa.d.d(f10, 9.0f, 16.0f, 0.5f);
            float f11 = (d - height) / 2.0f;
            RectF rectF = new RectF(0.0f, f11, f10, height + f11);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, d, config);
            new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = createBitmap;
        }
        ((p5.h) this.f17378b).e(bitmap2, 0);
    }

    public c0(h6.a aVar) {
        this.f17377a = 25;
        x5.l.h(aVar);
        this.f17378b = aVar;
    }

    public c0(JSONArray jSONArray) {
        this.f17377a = 1;
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i9);
                if (optJSONObject != null) {
                    arrayList.add(new n2.j(optJSONObject));
                }
            }
        }
        this.f17378b = arrayList;
    }

    public c0(int i9) {
        this.f17377a = i9;
        switch (i9) {
            case 9:
                this.f17378b = new n2.p(12);
                return;
            case 14:
                return;
            default:
                this.f17378b = new SparseArray();
                return;
        }
    }

    public c0(int i9, int i10, int[] iArr) {
        this.f17377a = 11;
        h50[] h50VarArr = new h50[(iArr.length / 2) + 1];
        this.f17378b = h50VarArr;
        h50 h50Var = new h50(i9, i10);
        int i11 = 0;
        h50VarArr[0] = h50Var;
        while (i11 < iArr.length / 2) {
            int i12 = i11 + 1;
            int i13 = i11 * 2;
            ((h50[]) this.f17378b)[i12] = new h50(iArr[i13], iArr[i13 + 1]);
            i11 = i12;
        }
    }

    public c0(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.f17377a = 23;
        this.f17378b = new GestureDetector(context, onGestureListener, null);
    }

    public c0(String str) {
        this.f17377a = 4;
        str.getClass();
        this.f17378b = str;
    }

    public c0(EditText editText) {
        this.f17377a = 19;
        this.f17378b = new e3(editText);
    }

    @Override
    public void A(String str) {
    }

    @Override
    public void a(TLRPC.BotInlineResult botInlineResult, boolean z10, int i9) {
    }

    @Override
    public void p(TLRPC.TL_document tL_document, String str, Object obj) {
    }
}
