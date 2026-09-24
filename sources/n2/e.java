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
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.df0;
import org.telegram.ui.Components.ef0;
import org.telegram.ui.Components.ic0;
import org.telegram.ui.Components.j60;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.jq0;
import org.telegram.ui.Components.kh0;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.pg0;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qq0;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.uq0;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.Components.wi;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.l9;
import org.telegram.ui.ls0;
import org.telegram.ui.t9;
import org.telegram.ui.web.b1;
import pg.d1;
import r7.z;
import s4.c1;
import s4.f1;
import s4.h1;
import s4.o0;
import s4.p0;
import yh.r2;
import yh.x3;
public class e implements o0.b, j71, d5, wa0, lg.o, p71, b2, t9, com.google.android.gms.common.api.internal.s, h1, w2.a, jq0, pk0 {
    public final int f15100a;
    public Object f15101b;

    public e(int i10, boolean z10) {
        this.f15100a = i10;
    }

    public static float[] D(ArrayList arrayList) {
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
            arrayList2.add((PointF) hg.c.g(1, arrayList));
        }
        float f20 = ((PointF) arrayList2.get(0)).x;
        if (f20 > f10) {
            for (int i23 = (int) f20; i23 >= 0; i23--) {
                arrayList2.add(0, new PointF(i23, 0.0f));
            }
        }
        float f21 = ((PointF) hg.c.g(1, arrayList2)).x;
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

    public static e E(float f7, int i10) {
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

    public int B(long j3) {
        ArrayList arrayList = (ArrayList) this.f15101b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (j3 < ((z3.a) arrayList.get(i10)).f48344b) {
                return i10;
            }
        }
        return arrayList.size();
    }

    @Override
    public int C(View view) {
        return o0.y(view) + ((ViewGroup.MarginLayoutParams) ((p0) view.getLayoutParams())).rightMargin;
    }

    public void G(aa.a aVar) {
        h8.j jVar = (h8.j) this.f15101b;
        jVar.f10132a = aVar;
        Iterator it = jVar.f10134c.iterator();
        while (it.hasNext()) {
            ((x6.e) it.next()).b();
        }
        jVar.f10134c.clear();
        jVar.f10133b = null;
    }

    public boolean H(int i10, int i11, Bundle bundle) {
        return false;
    }

    public void I(c1 c1Var, q0 q0Var, q0 q0Var2) {
        int i10;
        int i11;
        boolean z10;
        c1 T;
        int i12;
        RecyclerView recyclerView = (RecyclerView) this.f15101b;
        recyclerView.f2832b.k(c1Var);
        recyclerView.h(c1Var);
        c1Var.q(false);
        f1 f1Var = (f1) recyclerView.f2835c0;
        f1Var.getClass();
        int i13 = q0Var.f3195a;
        int i14 = q0Var.f3196b;
        View view = c1Var.f42946a;
        if (q0Var2 == null) {
            i10 = view.getLeft();
        } else {
            i10 = q0Var2.f3195a;
        }
        int i15 = i10;
        if (q0Var2 == null) {
            i11 = view.getTop();
        } else {
            i11 = q0Var2.f3196b;
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
                    if (childAt != null && (T = recyclerView.T(childAt)) != null && !T.j() && (i12 = T.h) >= 0 && i12 < i17 && i12 > i18) {
                        i18 = i12;
                    }
                }
            }
            c1Var.f42951i = (c1Var.h - i18) + (i18 * 1000);
            f1Var.s(c1Var, q0Var);
            z10 = true;
        }
        if (z10) {
            recyclerView.l0();
        }
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        ((ChatActivityEnterView) this.f15101b).T0(i10, z10, 0, true, 0L);
    }

    @Override
    public String J0() {
        return ((b1) this.f15101b).f38994i0;
    }

    @Override
    public void K(String str) {
        b1 b1Var = (b1) this.f15101b;
        try {
            b1Var.P = System.currentTimeMillis();
            b1Var.z("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e) {
            FileLog.e(e);
        }
    }

    @Override
    public void L(boolean z10) {
        ((ef0) this.f15101b).f23932c.setAspectLock(z10);
    }

    public void M(c1 c1Var) {
        RecyclerView recyclerView = (RecyclerView) this.f15101b;
        o0 o0Var = recyclerView.f2860x;
        View view = c1Var.f42946a;
        of.e eVar = recyclerView.f2832b;
        la.h hVar = o0Var.f43038a;
        ka.c cVar = (ka.c) hVar.f14151b;
        int indexOfChild = ((RecyclerView) cVar.f13552b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((e6.n) hVar.f14152c).F(indexOfChild)) {
                hVar.Y(view);
            }
            cVar.j0(indexOfChild);
        }
        eVar.g(view);
    }

    @Override
    public void O(int i10, int i11, CharSequence charSequence, boolean z10) {
        wi wiVar = (wi) this.f15101b;
        if (wiVar.m1() == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(wiVar.m1().getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                Emoji.replaceEmoji(spannableStringBuilder, wiVar.m1().getEditText().getPaint().getFontMetricsInt(), false);
            }
            wiVar.m1().setText(spannableStringBuilder);
            wiVar.m1().setSelection(i10 + charSequence.length());
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public void a(int i10) {
        qq0 qq0Var = (qq0) this.f15101b;
        uq0 uq0Var = qq0Var.K;
        qq0Var.f27739s = i10;
        if (qq0Var.v != i10) {
            qq0Var.d.clear();
        }
        int i11 = qq0Var.J;
        if (qq0Var.h() == 0 && !qq0Var.e.e() && !qq0Var.I) {
            uq0Var.Q.e(false, true);
        } else {
            uq0Var.f28891x0.b(i11);
        }
        qq0Var.l();
        int i12 = uq0.f28860a1;
        uq0Var.K0(true);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f15100a) {
            case 16:
                z zVar = (z) ((r7.k) obj).u();
                r7.f fVar = new r7.f(1, (TaskCompletionSource) obj2);
                Parcel O0 = zVar.O0();
                r7.d.c(O0, (g8.e) this.f15101b);
                r7.d.d(O0, fVar);
                O0.writeString(null);
                zVar.S0(O0, 63);
                return;
            default:
                s6.f fVar2 = new s6.f(0, (TaskCompletionSource) obj2);
                s6.e eVar = (s6.e) ((s6.h) obj).u();
                Parcel I0 = eVar.I0();
                k7.a.d(I0, fVar2);
                k7.a.c(I0, (s6.a) this.f15101b);
                eVar.J0(I0, 1);
                return;
        }
    }

    @Override
    public long b(long j3) {
        ArrayList arrayList = (ArrayList) this.f15101b;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j3 < ((z3.a) arrayList.get(0)).f48344b) {
            return ((z3.a) arrayList.get(0)).f48344b;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            z3.a aVar = (z3.a) arrayList.get(i10);
            long j10 = aVar.f48344b;
            long j11 = aVar.f48344b;
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
        ((ArrayList) this.f15101b).clear();
    }

    @Override
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f15101b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override
    public i0 d(long j3) {
        int B = B(j3);
        if (B == 0) {
            g0 g0Var = i0.f8066b;
            return a1.e;
        }
        z3.a aVar = (z3.a) ((ArrayList) this.f15101b).get(B - 1);
        long j10 = aVar.d;
        if (j10 != -9223372036854775807L && j3 >= j10) {
            g0 g0Var2 = i0.f8066b;
            return a1.e;
        }
        return aVar.f48343a;
    }

    @Override
    public boolean e(z3.a r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: n2.e.e(z3.a, long):boolean");
    }

    @Override
    public void e0(boolean z10) {
        ef0 ef0Var = (ef0) this.f15101b;
        ef0Var.getClass();
        df0 df0Var = ef0Var.f23930a;
        if (df0Var != null) {
            ((ls0) df0Var).a(z10);
        }
    }

    @Override
    public boolean e1(String str, l9 l9Var) {
        return false;
    }

    @Override
    public int g() {
        return ((o0) this.f15101b).D();
    }

    @Override
    public void g0() {
        df0 df0Var = ((ef0) this.f15101b).f23930a;
        if (df0Var != null) {
            PhotoViewer photoViewer = ((ls0) df0Var).f35396a;
            if (photoViewer.f31193c2 == 1) {
                photoViewer.H2 = true;
                photoViewer.p3();
            }
        }
    }

    @Override
    public void h(View view, zg.o0 o0Var, boolean z10, boolean z11) {
        zg.t tVar = (zg.t) this.f15101b;
        tVar.f49428a.ab(null, tVar.e, tVar.f49429b, view, 0.0f, 0.0f, o0Var, false, z10, z11, false);
        AndroidUtilities.runOnUIThread(new r2(this, 9));
    }

    @Override
    public a0.i i() {
        return null;
    }

    @Override
    public void invalidate() {
        ((u1) ((org.telegram.ui.Cells.h1) this.f15101b).f20372b).invalidate();
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
    public long l(long j3) {
        ArrayList arrayList = (ArrayList) this.f15101b;
        if (arrayList.isEmpty() || j3 < ((z3.a) arrayList.get(0)).f48344b) {
            return -9223372036854775807L;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            long j10 = ((z3.a) arrayList.get(i10)).f48344b;
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
                return aVar.f48344b;
            }
        }
        z3.a aVar2 = (z3.a) e9.q.l(arrayList);
        long j12 = aVar2.d;
        if (j12 != -9223372036854775807L && j3 >= j12) {
            return j12;
        }
        return aVar2.f48344b;
    }

    @Override
    public a0.i o() {
        return null;
    }

    @Override
    public void onDismiss() {
        b1 b1Var = (b1) this.f15101b;
        b1Var.z("scan_qr_popup_closed", null);
        b1Var.f38993h0 = false;
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        rk0 rk0Var = (rk0) this.f15101b;
        if (z10 && rk0Var.f27981n.n() >= 0) {
            rk0Var.f27984w = true;
        }
        pg0 pg0Var = rk0Var.f27980f;
        ic0 ic0Var = rk0Var.f27985x;
        pg0Var.a(z10, true);
        AndroidUtilities.cancelRunOnUIThread(ic0Var);
        if (z10) {
            AndroidUtilities.runOnUIThread(ic0Var, 16L);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public boolean p() {
        return false;
    }

    @Override
    public Cursor q(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f15101b;
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
    public void r(long j3) {
        ArrayList arrayList = (ArrayList) this.f15101b;
        int B = B(j3);
        if (B == 0) {
            return;
        }
        long j10 = ((z3.a) arrayList.get(B - 1)).d;
        if (j10 == -9223372036854775807L || j10 >= j3) {
            B--;
        }
        arrayList.subList(0, B).clear();
    }

    @Override
    public boolean s(int i10) {
        if (i10 == ((qq0) this.f15101b).f27738r) {
            return true;
        }
        return false;
    }

    public void t() {
        d1 d1Var = ((pg.f1) this.f15101b).d;
        if (d1Var != null) {
            pg.b1 b1Var = d1Var.f41081s;
            if (b1Var != null) {
                d1Var.cancelRunnable(b1Var);
                d1Var.f41081s = null;
            }
            pg.b1 b1Var2 = new pg.b1(d1Var, 1);
            d1Var.f41081s = b1Var2;
            d1Var.postRunnable(b1Var2, 1L);
        }
    }

    public String toString() {
        switch (this.f15100a) {
            case 12:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.f15101b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    public s0.d u(int i10) {
        return null;
    }

    @Override
    public void u0() {
        qc k10 = ((x3) this.f15101b).getBulletinFactory().k(false);
        k10.f27581t = true;
        k10.j();
    }

    public s0.d v(int i10) {
        return null;
    }

    @Override
    public Paint.FontMetricsInt w() {
        return ((wi) this.f15101b).E0.getEditText().getPaint().getFontMetricsInt();
    }

    @Override
    public int x() {
        o0 o0Var = (o0) this.f15101b;
        return o0Var.f43047m - o0Var.E();
    }

    @Override
    public View y(int i10) {
        return ((o0) this.f15101b).q(i10);
    }

    @Override
    public void z() {
        df0 df0Var = ((ef0) this.f15101b).f23930a;
        if (df0Var != null) {
            ((ls0) df0Var).f35396a.f31209e0.invalidate();
        }
    }

    public e(Object obj, int i10) {
        this.f15100a = i10;
        this.f15101b = obj;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public e(s6.g gVar, s6.a aVar) {
        this.f15100a = 21;
        this.f15101b = aVar;
    }

    public e(int i10) {
        this.f15100a = i10;
        switch (i10) {
            case 18:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f15101b = new kh0(this);
                    return;
                } else {
                    this.f15101b = new kh0(this);
                    return;
                }
            case 24:
                this.f15101b = new ArrayList();
                return;
            case 26:
                this.f15101b = new CopyOnWriteArrayList();
                return;
            default:
                this.f15101b = new LinkedHashMap(5, 1.0f, false);
                return;
        }
    }

    public e(int i10, int i11, int[] iArr) {
        this.f15100a = 4;
        j60[] j60VarArr = new j60[(iArr.length / 2) + 1];
        this.f15101b = j60VarArr;
        j60 j60Var = new j60(i10, i11);
        int i12 = 0;
        j60VarArr[0] = j60Var;
        while (i12 < iArr.length / 2) {
            int i13 = i12 + 1;
            int i14 = i12 * 2;
            ((j60[]) this.f15101b)[i13] = new j60(iArr[i14], iArr[i14 + 1]);
            i12 = i13;
        }
    }

    public e(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.f15100a = 15;
        this.f15101b = new GestureDetector(context, onGestureListener, null);
    }

    @Override
    public void U() {
    }

    @Override
    public void n() {
    }

    public e(Context context, Uri uri) {
        this.f15100a = 1;
        this.f15101b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    @Override
    public void F(ArrayList arrayList) {
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
    public void onError(s71 s71Var, Exception exc) {
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
    public void m(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
