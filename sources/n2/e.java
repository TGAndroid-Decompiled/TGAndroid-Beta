package n2;

import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import b2.q0;
import com.google.android.gms.tasks.TaskCompletionSource;
import e9.a1;
import e9.g0;
import e9.i0;
import gg.b2;
import hg.k0;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.bf0;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.cf0;
import org.telegram.ui.Components.g60;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.jh0;
import org.telegram.ui.Components.jq0;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.pg0;
import org.telegram.ui.Components.q71;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.qq0;
import org.telegram.ui.Components.sa0;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.uq0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.m9;
import org.telegram.ui.ts0;
import org.telegram.ui.u9;
import org.telegram.ui.web.d1;
import pg.b1;
import pg.e1;
import r7.z;
import s4.c1;
import s4.f1;
import s4.h1;
import s4.o0;
import s4.p0;
import yh.s2;
import yh.y3;
public class e implements o0.a, j71, c5, sa0, lg.o, q71, b2, u9, com.google.android.gms.common.api.internal.s, h1, w2.a, jq0, ok0 {
    public final int f15111a;
    public Object f15112b;

    public e(int i10, boolean z10) {
        this.f15111a = i10;
    }

    public static e B(float f7, int i10) {
        boolean z10;
        Point point = AndroidUtilities.displaySize;
        int i11 = (int) (point.x * f7);
        int i12 = (int) (point.y * f7);
        if (i11 == i12) {
            return new e(i11, i12, new int[0]);
        }
        if (i10 == 3) {
            return new e(i11, i12, new int[]{i12, i11});
        }
        boolean z11 = true;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 >= i12) {
            z11 = false;
        }
        if (z10 == z11) {
            return new e(i11, i12, new int[0]);
        }
        return new e(i12, i11, new int[0]);
    }

    public static float[] y(ArrayList arrayList) {
        double d;
        double d10;
        float f7;
        double[] dArr;
        ArrayList arrayList2;
        float f10;
        float f11;
        int i10;
        float f12;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            PointF pointF = (PointF) arrayList.get(i11);
            pointF.x *= 255.0f;
            pointF.y *= 255.0f;
        }
        int size2 = arrayList.size();
        double d11 = 1.0d;
        if (size2 <= 0 || size2 == 1) {
            d = 1.0d;
            d10 = 6.0d;
            f7 = 255.0f;
            dArr = null;
        } else {
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size2, 3);
            double[] dArr3 = new double[size2];
            double[] dArr4 = dArr2[0];
            dArr4[1] = 1.0d;
            double d12 = 0.0d;
            dArr4[0] = 0.0d;
            dArr4[2] = 0.0d;
            int i12 = 1;
            while (true) {
                i10 = size2 - 1;
                if (i12 >= i10) {
                    break;
                }
                PointF pointF2 = (PointF) arrayList.get(i12 - 1);
                PointF pointF3 = (PointF) arrayList.get(i12);
                int i13 = i12 + 1;
                double d13 = d11;
                PointF pointF4 = (PointF) arrayList.get(i13);
                double[] dArr5 = dArr2[i12];
                float f13 = pointF3.x;
                double d14 = d12;
                double d15 = f13 - pointF2.x;
                dArr5[0] = d15 / 6.0d;
                float f14 = pointF4.x;
                dArr5[1] = (f14 - f12) / 3.0d;
                double d16 = f14 - f13;
                dArr5[2] = d16 / 6.0d;
                float f15 = pointF4.y;
                float f16 = pointF3.y;
                dArr3[i12] = ((f15 - f16) / d16) - ((f16 - pointF2.y) / d15);
                i12 = i13;
                d11 = d13;
                d12 = d14;
            }
            d = d11;
            double d17 = d12;
            d10 = 6.0d;
            f7 = 255.0f;
            dArr3[0] = d17;
            dArr3[i10] = d17;
            double[] dArr6 = dArr2[i10];
            dArr6[1] = d;
            dArr6[0] = d17;
            dArr6[2] = d17;
            for (int i14 = 1; i14 < size2; i14++) {
                double[] dArr7 = dArr2[i14];
                double d18 = dArr7[0];
                int i15 = i14 - 1;
                double[] dArr8 = dArr2[i15];
                double d19 = d18 / dArr8[1];
                dArr7[1] = dArr7[1] - (dArr8[2] * d19);
                dArr7[0] = d17;
                dArr3[i14] = dArr3[i14] - (d19 * dArr3[i15]);
            }
            for (int i16 = size2 - 2; i16 >= 0; i16--) {
                double[] dArr9 = dArr2[i16];
                double d20 = dArr9[2];
                int i17 = i16 + 1;
                double[] dArr10 = dArr2[i17];
                double d21 = d20 / dArr10[1];
                dArr9[1] = dArr9[1] - (dArr10[0] * d21);
                dArr9[2] = d17;
                dArr3[i16] = dArr3[i16] - (d21 * dArr3[i17]);
            }
            dArr = new double[size2];
            for (int i18 = 0; i18 < size2; i18++) {
                dArr[i18] = dArr3[i18] / dArr2[i18][1];
            }
        }
        int length = dArr.length;
        if (length < 1) {
            arrayList2 = null;
            f10 = 0.0f;
        } else {
            arrayList2 = new ArrayList(length + 1);
            int i19 = 0;
            while (i19 < length - 1) {
                PointF pointF5 = (PointF) arrayList.get(i19);
                int i20 = i19 + 1;
                PointF pointF6 = (PointF) arrayList.get(i20);
                int i21 = (int) pointF5.x;
                while (true) {
                    float f17 = pointF6.x;
                    if (i21 < ((int) f17)) {
                        float f18 = i21;
                        PointF pointF7 = pointF5;
                        double d22 = f17 - pointF5.x;
                        double d23 = (f18 - f11) / d22;
                        double d24 = d - d23;
                        int i22 = length;
                        double[] dArr11 = dArr;
                        float f19 = (float) (((((((d23 * d23) * d23) - d23) * dArr11[i20]) + ((((d24 * d24) * d24) - d24) * dArr11[i19])) * ((d22 * d22) / d10)) + (pointF6.y * d23) + (pointF7.y * d24));
                        if (f19 > f7) {
                            f19 = 255.0f;
                        } else if (f19 < 0.0f) {
                            f19 = 0.0f;
                        }
                        arrayList2.add(new PointF(f18, f19));
                        i21++;
                        dArr = dArr11;
                        pointF5 = pointF7;
                        length = i22;
                    }
                }
                i19 = i20;
            }
            f10 = 0.0f;
            arrayList2.add((PointF) k0.g(1, arrayList));
        }
        float f20 = ((PointF) arrayList2.get(0)).x;
        if (f20 > f10) {
            for (int i23 = (int) f20; i23 >= 0; i23--) {
                arrayList2.add(0, new PointF(i23, 0.0f));
            }
        }
        float f21 = ((PointF) k0.g(1, arrayList2)).x;
        if (f21 < f7) {
            for (int i24 = ((int) f21) + 1; i24 <= 255; i24++) {
                arrayList2.add(new PointF(i24, 255.0f));
            }
        }
        float[] fArr = new float[arrayList2.size()];
        int size3 = arrayList2.size();
        for (int i25 = 0; i25 < size3; i25++) {
            PointF pointF8 = (PointF) arrayList2.get(i25);
            float sqrt = (float) Math.sqrt(Math.pow(pointF8.x - pointF8.y, 2.0d));
            if (pointF8.x > pointF8.y) {
                sqrt = -sqrt;
            }
            fArr[i25] = sqrt;
        }
        return fArr;
    }

    @Override
    public View C(int i10) {
        return ((o0) this.f15112b).q(i10);
    }

    @Override
    public int D(View view) {
        return o0.y(view) + ((ViewGroup.MarginLayoutParams) ((p0) view.getLayoutParams())).rightMargin;
    }

    public void E(aa.a aVar) {
        h8.j jVar = (h8.j) this.f15112b;
        jVar.f10151a = aVar;
        Iterator it = jVar.f10153c.iterator();
        while (it.hasNext()) {
            ((x6.e) it.next()).b();
        }
        jVar.f10153c.clear();
        jVar.f10152b = null;
    }

    @Override
    public boolean F(int i10) {
        if (i10 == ((qq0) this.f15112b).f27637r) {
            return true;
        }
        return false;
    }

    public boolean H(int i10, int i11, Bundle bundle) {
        return false;
    }

    public void I(c1 c1Var, q0 q0Var, q0 q0Var2) {
        int i10;
        int i11;
        boolean z10;
        c1 U;
        int i12;
        RecyclerView recyclerView = (RecyclerView) this.f15112b;
        recyclerView.f2840b.k(c1Var);
        recyclerView.h(c1Var);
        c1Var.q(false);
        f1 f1Var = (f1) recyclerView.f2843c0;
        f1Var.getClass();
        int i13 = q0Var.f3203a;
        int i14 = q0Var.f3204b;
        View view = c1Var.f42974a;
        if (q0Var2 == null) {
            i10 = view.getLeft();
        } else {
            i10 = q0Var2.f3203a;
        }
        int i15 = i10;
        if (q0Var2 == null) {
            i11 = view.getTop();
        } else {
            i11 = q0Var2.f3204b;
        }
        int i16 = i11;
        if (!c1Var.j() && (i13 != i15 || i14 != i16)) {
            view.layout(i15, i16, view.getWidth() + i15, view.getHeight() + i16);
            z10 = f1Var.r(c1Var, q0Var, i13, i14, i15, i16);
        } else {
            int i17 = c1Var.h;
            int i18 = -1;
            if (i17 != -1) {
                for (int i19 = 0; i19 < recyclerView.getChildCount(); i19++) {
                    View childAt = recyclerView.getChildAt(i19);
                    if (childAt != null && (U = recyclerView.U(childAt)) != null && !U.j() && (i12 = U.h) >= 0 && i12 < i17 && i12 > i18) {
                        i18 = i12;
                    }
                }
            }
            c1Var.f42979i = (c1Var.h - i18) + (i18 * 1000);
            f1Var.s(c1Var, q0Var);
            z10 = true;
        }
        if (z10) {
            recyclerView.m0();
        }
    }

    @Override
    public String I0() {
        return ((d1) this.f15112b).f38863i0;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        ((ChatActivityEnterView) this.f15112b).T0(i10, z10, 0, true, 0L);
    }

    @Override
    public void K(String str) {
        d1 d1Var = (d1) this.f15112b;
        try {
            d1Var.P = System.currentTimeMillis();
            d1Var.z("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e) {
            FileLog.e(e);
        }
    }

    @Override
    public void L(boolean z10) {
        ((cf0) this.f15112b).f23279c.setAspectLock(z10);
    }

    public void M(c1 c1Var) {
        RecyclerView recyclerView = (RecyclerView) this.f15112b;
        o0 o0Var = recyclerView.f2868x;
        View view = c1Var.f42974a;
        of.e eVar = recyclerView.f2840b;
        lf.h hVar = o0Var.f43066a;
        ka.c cVar = (ka.c) hVar.f14215b;
        int indexOfChild = ((RecyclerView) cVar.f13566b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((e6.n) hVar.f14216c).F(indexOfChild)) {
                hVar.Y(view);
            }
            cVar.h0(indexOfChild);
        }
        eVar.g(view);
    }

    @Override
    public void O(int i10, int i11, CharSequence charSequence, boolean z10) {
        vi viVar = (vi) this.f15112b;
        if (viVar.m1() == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(viVar.m1().getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                Emoji.replaceEmoji(spannableStringBuilder, viVar.m1().getEditText().getPaint().getFontMetricsInt(), false);
            }
            viVar.m1().setText(spannableStringBuilder);
            viVar.m1().setSelection(i10 + charSequence.length());
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public void a(int i10) {
        qq0 qq0Var = (qq0) this.f15112b;
        uq0 uq0Var = qq0Var.K;
        qq0Var.f27638s = i10;
        if (qq0Var.v != i10) {
            qq0Var.d.clear();
        }
        int i11 = qq0Var.J;
        if (qq0Var.h() == 0 && !qq0Var.e.e() && !qq0Var.I) {
            uq0Var.Q.e(false, true);
        } else {
            uq0Var.f28834x0.b(i11);
        }
        qq0Var.l();
        int i12 = uq0.f28803a1;
        uq0Var.K0(true);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f15111a) {
            case 16:
                z zVar = (z) ((r7.k) obj).u();
                r7.f fVar = new r7.f(1, (TaskCompletionSource) obj2);
                Parcel O0 = zVar.O0();
                r7.d.c(O0, (g8.e) this.f15112b);
                r7.d.d(O0, fVar);
                O0.writeString(null);
                zVar.S0(O0, 63);
                return;
            default:
                s6.f fVar2 = new s6.f(0, (TaskCompletionSource) obj2);
                s6.e eVar = (s6.e) ((s6.h) obj).u();
                Parcel I0 = eVar.I0();
                k7.a.d(I0, fVar2);
                k7.a.c(I0, (s6.a) this.f15112b);
                eVar.J0(I0, 1);
                return;
        }
    }

    @Override
    public long b(long j3) {
        ArrayList arrayList = (ArrayList) this.f15112b;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j3 < ((z3.a) arrayList.get(0)).f48381b) {
            return ((z3.a) arrayList.get(0)).f48381b;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            z3.a aVar = (z3.a) arrayList.get(i10);
            long j10 = aVar.f48381b;
            long j11 = aVar.f48381b;
            if (j3 < j10) {
                long j12 = ((z3.a) arrayList.get(i10 - 1)).d;
                if (j12 != -9223372036854775807L && j12 > j3 && j12 < j11) {
                    return j12;
                }
                return j11;
            }
        }
        long j13 = ((z3.a) e9.q.l(arrayList)).d;
        if (j13 == -9223372036854775807L || j3 >= j13) {
            return Long.MIN_VALUE;
        }
        return j13;
    }

    @Override
    public int c(View view) {
        return o0.x(view) - ((ViewGroup.MarginLayoutParams) ((p0) view.getLayoutParams())).leftMargin;
    }

    @Override
    public void clear() {
        ((ArrayList) this.f15112b).clear();
    }

    @Override
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f15112b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override
    public i0 d(long j3) {
        int v = v(j3);
        if (v == 0) {
            g0 g0Var = i0.f8084b;
            return a1.e;
        }
        z3.a aVar = (z3.a) ((ArrayList) this.f15112b).get(v - 1);
        long j10 = aVar.d;
        if (j10 != -9223372036854775807L && j3 >= j10) {
            g0 g0Var2 = i0.f8084b;
            return a1.e;
        }
        return aVar.f48380a;
    }

    @Override
    public void d0(boolean z10) {
        cf0 cf0Var = (cf0) this.f15112b;
        cf0Var.getClass();
        bf0 bf0Var = cf0Var.f23277a;
        if (bf0Var != null) {
            ((ts0) bf0Var).a(z10);
        }
    }

    @Override
    public boolean e(z3.a r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: n2.e.e(z3.a, long):boolean");
    }

    @Override
    public boolean e1(String str, m9 m9Var) {
        return false;
    }

    @Override
    public int g() {
        return ((o0) this.f15112b).D();
    }

    @Override
    public void h(View view, zg.o0 o0Var, boolean z10, boolean z11) {
        zg.t tVar = (zg.t) this.f15112b;
        tVar.f49466a.ab(null, tVar.e, tVar.f49467b, view, 0.0f, 0.0f, o0Var, false, z10, z11, false);
        AndroidUtilities.runOnUIThread(new s2(this, 9));
    }

    @Override
    public long i(long j3) {
        ArrayList arrayList = (ArrayList) this.f15112b;
        if (arrayList.isEmpty() || j3 < ((z3.a) arrayList.get(0)).f48381b) {
            return -9223372036854775807L;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            long j10 = ((z3.a) arrayList.get(i10)).f48381b;
            int i11 = (j3 > j10 ? 1 : (j3 == j10 ? 0 : -1));
            if (i11 == 0) {
                return j10;
            }
            if (i11 < 0) {
                z3.a aVar = (z3.a) arrayList.get(i10 - 1);
                long j11 = aVar.d;
                if (j11 != -9223372036854775807L && j11 <= j3) {
                    return j11;
                }
                return aVar.f48381b;
            }
        }
        z3.a aVar2 = (z3.a) e9.q.l(arrayList);
        long j12 = aVar2.d;
        if (j12 != -9223372036854775807L && j3 >= j12) {
            return j12;
        }
        return aVar2.f48381b;
    }

    @Override
    public void i0() {
        bf0 bf0Var = ((cf0) this.f15112b).f23277a;
        if (bf0Var != null) {
            PhotoViewer photoViewer = ((ts0) bf0Var).f37876a;
            if (photoViewer.f31205c2 == 1) {
                photoViewer.H2 = true;
                photoViewer.p3();
            }
        }
    }

    @Override
    public void invalidate() {
        ((u1) ((org.telegram.ui.Cells.h1) this.f15112b).f20367b).invalidate();
    }

    @Override
    public boolean j() {
        return true;
    }

    @Override
    public boolean k() {
        return false;
    }

    @Override
    public a0.i l() {
        return null;
    }

    @Override
    public void m(long j3) {
        ArrayList arrayList = (ArrayList) this.f15112b;
        int v = v(j3);
        if (v == 0) {
            return;
        }
        long j10 = ((z3.a) arrayList.get(v - 1)).d;
        if (j10 == -9223372036854775807L || j10 >= j3) {
            v--;
        }
        arrayList.subList(0, v).clear();
    }

    @Override
    public void onDismiss() {
        d1 d1Var = (d1) this.f15112b;
        d1Var.z("scan_qr_popup_closed", null);
        d1Var.f38862h0 = false;
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        qk0 qk0Var = (qk0) this.f15112b;
        if (z10 && qk0Var.f27597n.n() >= 0) {
            qk0Var.f27600w = true;
        }
        pg0 pg0Var = qk0Var.f27596f;
        jc0 jc0Var = qk0Var.f27601x;
        pg0Var.a(z10, true);
        AndroidUtilities.cancelRunOnUIThread(jc0Var);
        if (z10) {
            AndroidUtilities.runOnUIThread(jc0Var, 16L);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public void p() {
        pg.c1 c1Var = ((e1) this.f15112b).d;
        if (c1Var != null) {
            b1 b1Var = c1Var.f41120s;
            if (b1Var != null) {
                c1Var.cancelRunnable(b1Var);
                c1Var.f41120s = null;
            }
            b1 b1Var2 = new b1(c1Var, 1);
            c1Var.f41120s = b1Var2;
            c1Var.postRunnable(b1Var2, 1L);
        }
    }

    @Override
    public Cursor q(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f15112b;
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
    public boolean r() {
        return false;
    }

    @Override
    public Paint.FontMetricsInt s() {
        return ((vi) this.f15112b).E0.getEditText().getPaint().getFontMetricsInt();
    }

    public s0.d t(int i10) {
        return null;
    }

    @Override
    public void t0() {
        pc k10 = ((y3) this.f15112b).getBulletinFactory().k(false);
        k10.f27262t = true;
        k10.j();
    }

    public String toString() {
        switch (this.f15111a) {
            case 12:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.f15112b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    public s0.d u(int i10) {
        return null;
    }

    public int v(long j3) {
        ArrayList arrayList = (ArrayList) this.f15112b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (j3 < ((z3.a) arrayList.get(i10)).f48381b) {
                return i10;
            }
        }
        return arrayList.size();
    }

    @Override
    public a0.i w() {
        return null;
    }

    @Override
    public int x() {
        o0 o0Var = (o0) this.f15112b;
        return o0Var.f43075m - o0Var.E();
    }

    @Override
    public void z() {
        bf0 bf0Var = ((cf0) this.f15112b).f23277a;
        if (bf0Var != null) {
            ((ts0) bf0Var).f37876a.f31221e0.invalidate();
        }
    }

    public e(Object obj, int i10) {
        this.f15111a = i10;
        this.f15112b = obj;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public e(s6.g gVar, s6.a aVar) {
        this.f15111a = 21;
        this.f15112b = aVar;
    }

    public e(int i10) {
        this.f15111a = i10;
        switch (i10) {
            case 18:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f15112b = new jh0(this);
                    return;
                } else {
                    this.f15112b = new jh0(this);
                    return;
                }
            case 24:
                this.f15112b = new ArrayList();
                return;
            case 26:
                this.f15112b = new CopyOnWriteArrayList();
                return;
            default:
                this.f15112b = new LinkedHashMap(5, 1.0f, false);
                return;
        }
    }

    public e(int i10, int i11, int[] iArr) {
        this.f15111a = 4;
        g60[] g60VarArr = new g60[(iArr.length / 2) + 1];
        this.f15112b = g60VarArr;
        g60 g60Var = new g60(i10, i11);
        int i12 = 0;
        g60VarArr[0] = g60Var;
        while (i12 < iArr.length / 2) {
            int i13 = i12 + 1;
            int i14 = i12 * 2;
            ((g60[]) this.f15112b)[i13] = new g60(iArr[i14], iArr[i14 + 1]);
            i12 = i13;
        }
    }

    public e(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.f15111a = 15;
        this.f15112b = new GestureDetector(context, onGestureListener, null);
    }

    @Override
    public void U() {
    }

    @Override
    public void o() {
    }

    public e(Context context, Uri uri) {
        this.f15111a = 1;
        this.f15112b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    @Override
    public void G(ArrayList arrayList) {
    }

    @Override
    public void P(String str) {
    }

    @Override
    public void T0(MrzRecognizer.Result result) {
    }

    @Override
    public void onSeekFinished(j2.a aVar) {
    }

    @Override
    public void onSeekStarted(j2.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void onError(t71 t71Var, Exception exc) {
    }

    @Override
    public void A(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override
    public void f(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }

    @Override
    public void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
