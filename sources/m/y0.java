package m;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.net.Uri;
import android.os.RemoteException;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.d70;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.sr0;
import org.telegram.ui.Components.yf0;
import org.telegram.ui.Components.zf0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Wallet.c5;
import org.telegram.ui.fc0;
import org.telegram.ui.n9;
import org.telegram.ui.vs0;
import org.telegram.ui.x9;
public class y0 implements x0, n5.b, o0.a, g81, f5, qb0, lg.o, ah.j, x9, qg.v1, com.google.android.gms.common.api.internal.o, w2.d, Continuation, ml0 {
    public final int f15626a;
    public Object f15627b;

    public y0(int i10, boolean z10) {
        this.f15626a = i10;
    }

    public static float[] g(ArrayList arrayList) {
        float f7;
        int i10;
        int i11;
        float f10;
        double d;
        double d10;
        double[] dArr;
        ArrayList arrayList2;
        float f11;
        float f12;
        int i12;
        float f13;
        int size = arrayList.size();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            f7 = 255.0f;
            if (i14 >= size) {
                break;
            }
            PointF pointF = (PointF) arrayList.get(i14);
            pointF.x *= 255.0f;
            pointF.y *= 255.0f;
            i14++;
        }
        int size2 = arrayList.size();
        int i15 = 1;
        double d11 = 1.0d;
        if (size2 <= 0 || size2 == 1) {
            i10 = 0;
            i11 = 1;
            f10 = 255.0f;
            d = 1.0d;
            d10 = 6.0d;
            dArr = null;
        } else {
            char c10 = 2;
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size2, 3);
            double[] dArr3 = new double[size2];
            double[] dArr4 = dArr2[0];
            dArr4[1] = 1.0d;
            double d12 = 0.0d;
            dArr4[0] = 0.0d;
            dArr4[2] = 0.0d;
            int i16 = 1;
            while (true) {
                i12 = size2 - 1;
                if (i16 >= i12) {
                    break;
                }
                PointF pointF2 = (PointF) arrayList.get(i16 - 1);
                PointF pointF3 = (PointF) arrayList.get(i16);
                int i17 = i16 + 1;
                double d13 = d11;
                PointF pointF4 = (PointF) arrayList.get(i17);
                double[] dArr5 = dArr2[i16];
                char c11 = c10;
                float f14 = pointF3.x;
                double d14 = d12;
                int i18 = i13;
                int i19 = i15;
                double d15 = f14 - pointF2.x;
                dArr5[i18] = d15 / 6.0d;
                float f15 = pointF4.x;
                float f16 = f7;
                dArr5[i19] = (f15 - f13) / 3.0d;
                double d16 = f15 - f14;
                dArr5[c11] = d16 / 6.0d;
                float f17 = pointF4.y;
                float f18 = pointF3.y;
                dArr3[i16] = ((f17 - f18) / d16) - ((f18 - pointF2.y) / d15);
                i16 = i17;
                c10 = c11;
                d11 = d13;
                d12 = d14;
                i13 = i18;
                i15 = i19;
                f7 = f16;
            }
            i10 = i13;
            i11 = i15;
            f10 = f7;
            d = d11;
            char c12 = c10;
            double d17 = d12;
            d10 = 6.0d;
            dArr3[i10] = d17;
            dArr3[i12] = d17;
            double[] dArr6 = dArr2[i12];
            dArr6[i11] = d;
            dArr6[i10] = d17;
            dArr6[c12] = d17;
            for (int i20 = i11; i20 < size2; i20++) {
                double[] dArr7 = dArr2[i20];
                double d18 = dArr7[i10];
                int i21 = i20 - 1;
                double[] dArr8 = dArr2[i21];
                double d19 = d18 / dArr8[i11];
                dArr7[i11] = dArr7[i11] - (dArr8[c12] * d19);
                dArr7[i10] = d17;
                dArr3[i20] = dArr3[i20] - (d19 * dArr3[i21]);
            }
            for (int i22 = size2 - 2; i22 >= 0; i22--) {
                double[] dArr9 = dArr2[i22];
                double d20 = dArr9[c12];
                int i23 = i22 + 1;
                double[] dArr10 = dArr2[i23];
                double d21 = d20 / dArr10[i11];
                dArr9[i11] = dArr9[i11] - (dArr10[i10] * d21);
                dArr9[c12] = d17;
                dArr3[i22] = dArr3[i22] - (d21 * dArr3[i23]);
            }
            dArr = new double[size2];
            for (int i24 = i10; i24 < size2; i24++) {
                dArr[i24] = dArr3[i24] / dArr2[i24][i11];
            }
        }
        int length = dArr.length;
        if (length < i11) {
            arrayList2 = null;
            f11 = 0.0f;
        } else {
            arrayList2 = new ArrayList(length + 1);
            int i25 = i10;
            while (i25 < length - 1) {
                PointF pointF5 = (PointF) arrayList.get(i25);
                int i26 = i25 + 1;
                PointF pointF6 = (PointF) arrayList.get(i26);
                int i27 = (int) pointF5.x;
                while (true) {
                    float f19 = pointF6.x;
                    if (i27 < ((int) f19)) {
                        float f20 = i27;
                        PointF pointF7 = pointF5;
                        double d22 = f19 - pointF5.x;
                        double d23 = (f20 - f12) / d22;
                        double d24 = d - d23;
                        int i28 = length;
                        double[] dArr11 = dArr;
                        float f21 = (float) (((((((d23 * d23) * d23) - d23) * dArr11[i26]) + ((((d24 * d24) * d24) - d24) * dArr11[i25])) * ((d22 * d22) / d10)) + (pointF6.y * d23) + (pointF7.y * d24));
                        if (f21 > f10) {
                            f21 = f10;
                        } else if (f21 < 0.0f) {
                            f21 = 0.0f;
                        }
                        arrayList2.add(new PointF(f20, f21));
                        i27++;
                        dArr = dArr11;
                        pointF5 = pointF7;
                        length = i28;
                    }
                }
                i25 = i26;
            }
            f11 = 0.0f;
            arrayList2.add((PointF) hg.c.h(1, arrayList));
        }
        int i29 = i10;
        float f22 = ((PointF) arrayList2.get(i29)).x;
        if (f22 > f11) {
            for (int i30 = (int) f22; i30 >= 0; i30--) {
                arrayList2.add(i29, new PointF(i30, f11));
            }
        }
        float f23 = ((PointF) hg.c.h(1, arrayList2)).x;
        if (f23 < f10) {
            for (int i31 = ((int) f23) + 1; i31 <= 255; i31++) {
                arrayList2.add(new PointF(i31, f10));
            }
        }
        float[] fArr = new float[arrayList2.size()];
        int size3 = arrayList2.size();
        while (i29 < size3) {
            PointF pointF8 = (PointF) arrayList2.get(i29);
            float sqrt = (float) Math.sqrt(Math.pow(pointF8.x - pointF8.y, 2.0d));
            if (pointF8.x > pointF8.y) {
                sqrt = -sqrt;
            }
            fArr[i29] = sqrt;
            i29++;
        }
        return fArr;
    }

    public static y0 n(float f7, int i10) {
        boolean z10;
        Point point = AndroidUtilities.displaySize;
        int i11 = (int) (point.x * f7);
        int i12 = (int) (point.y * f7);
        if (i11 == i12) {
            return new y0(i11, i12, new int[0]);
        }
        if (i10 == 3) {
            return new y0(i11, i12, new int[]{i12, i11});
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
            return new y0(i11, i12, new int[0]);
        }
        return new y0(i12, i11, new int[0]);
    }

    @Override
    public String A0() {
        return null;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        ((ChatActivityEnterView) this.f15627b).W0(i10, z10, 0, true, 0L);
    }

    @Override
    public void K(String str) {
        String trim;
        c5 c5Var = (c5) this.f15627b;
        if (str == null) {
            trim = "";
        } else {
            try {
                trim = str.trim();
            } catch (Throwable unused) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.h3(c5Var, 7));
                return;
            }
        }
        Uri parse = Uri.parse(trim);
        String scheme = parse.getScheme();
        if (("ton".equalsIgnoreCase(scheme) || "tc".equalsIgnoreCase(scheme)) && (c5Var.getParentActivity() instanceof LaunchActivity) && new fc0((LaunchActivity) c5Var.getParentActivity(), c5.g0(c5Var), null, false).g(parse)) {
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.h3(c5Var, 7));
    }

    @Override
    public void T(boolean z10) {
        zf0 zf0Var = (zf0) this.f15627b;
        zf0Var.getClass();
        yf0 yf0Var = zf0Var.f33341a;
        if (yf0Var != null) {
            ((vs0) yf0Var).a(z10);
        }
    }

    @Override
    public void X() {
        yf0 yf0Var = ((zf0) this.f15627b).f33341a;
        if (yf0Var != null) {
            PhotoViewer photoViewer = ((vs0) yf0Var).f42845a;
            if (photoViewer.f33724c2 == 1) {
                photoViewer.H2 = true;
                photoViewer.q3();
            }
        }
    }

    @Override
    public boolean Z0(String str, n9 n9Var) {
        return false;
    }

    @Override
    public Paint.FontMetricsInt b() {
        return ((aj) this.f15627b).H0.getEditText().getPaint().getFontMetricsInt();
    }

    @Override
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f15627b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override
    public Cursor d(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f15627b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e7) {
            Log.w("FontsProvider", "Unable to query the content provider", e7);
            return null;
        }
    }

    @Override
    public void g0(ah.a aVar) {
        aVar.a(((sr0) this.f15627b).getThemedColor(h6.f20559d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override
    public Object mo27get() {
        switch (this.f15626a) {
            case 1:
                return new f3((Context) ((l2.g) this.f15627b).f15080b, new qb.b(24), new ob.a(24), 3);
            default:
                return new s5.i((Context) ((gd.a) this.f15627b).mo27get(), "com.google.android.datatransport.events", Integer.valueOf(s5.i.d).intValue());
        }
    }

    @Override
    public void h(View view, zg.n0 n0Var, boolean z10, boolean z11) {
        zg.t tVar = (zg.t) this.f15627b;
        tVar.f54886a.eb(null, tVar.f54889e, tVar.f54887b, view, 0.0f, 0.0f, n0Var, false, z10, z11, false);
        AndroidUtilities.runOnUIThread(new yh.f0(this, 13));
    }

    @Override
    public void i(int i10, int i11, CharSequence charSequence, boolean z10) {
        aj ajVar = (aj) this.f15627b;
        if (ajVar.o1() == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ajVar.o1().getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                Emoji.replaceEmoji(spannableStringBuilder, ajVar.o1().getEditText().getPaint().getFontMetricsInt(), false);
            }
            ajVar.o1().setText(spannableStringBuilder);
            ajVar.o1().setSelection(i10 + charSequence.length());
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public void invalidate() {
        ((org.telegram.ui.Cells.u1) ((org.telegram.ui.Cells.h1) this.f15627b).f21956b).invalidate();
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
    public void l(Canvas canvas) {
        sr0 sr0Var = (sr0) this.f15627b;
        canvas.drawColor(sr0Var.getThemedColor(h6.f20559d6));
        if (SharedConfig.chatBlurEnabled()) {
            sr0Var.O0.b(canvas, -3);
        }
    }

    @Override
    public void l0(float f7) {
        qg.w0 w0Var = (qg.w0) this.f15627b;
        pg.t0.e(w0Var.f46524a).k("-1", f7);
        w0Var.f46527e.setBrushSize(f7);
    }

    public void m(za.b0 b0Var) {
        ((l5.r) ((i5.f) ((pa.b) this.f15627b).get())).a("FIREBASE_APPQUALITY_SESSION", new i5.c("json"), new za.k(this)).a(new i5.a(null, b0Var, i5.d.f12012a, null), new j2.e(16));
    }

    @Override
    public boolean q() {
        return false;
    }

    public void r(aa.a aVar) {
        h8.j jVar = (h8.j) this.f15627b;
        jVar.f11040a = aVar;
        Iterator it = jVar.f11042c.iterator();
        while (it.hasNext()) {
            ((x6.e) it.next()).b();
        }
        jVar.f11042c.clear();
        jVar.f11041b = null;
    }

    @Override
    public Object then(Task task) {
        return ((Callable) this.f15627b).call();
    }

    public String toString() {
        switch (this.f15626a) {
            case 20:
                se.b bVar = se.b.f48201e;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("method-execution".substring(7));
                stringBuffer.append("(");
                stringBuffer.append(((ra.a) this.f15627b).n());
                stringBuffer.append(")");
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    @Override
    public void u() {
        yf0 yf0Var = ((zf0) this.f15627b).f33341a;
        if (yf0Var != null) {
            ((vs0) yf0Var).f42845a.f33741e0.invalidate();
        }
    }

    @Override
    public void v(Object obj) {
        ((g8.c) obj).onLocationResult((LocationResult) this.f15627b);
    }

    @Override
    public void z(boolean z10) {
        ((zf0) this.f15627b).f33343c.setAspectLock(z10);
    }

    public y0(Object obj, int i10) {
        this.f15626a = i10;
        this.f15627b = obj;
    }

    public y0(int i10) {
        this.f15626a = i10;
        switch (i10) {
            case 23:
                this.f15627b = new qb.b(28);
                return;
            case 26:
                this.f15627b = new CopyOnWriteArrayList();
                return;
            default:
                this.f15627b = new LinkedHashMap(5, 1.0f, false);
                return;
        }
    }

    public y0(int i10, int i11, int[] iArr) {
        this.f15626a = 6;
        d70[] d70VarArr = new d70[(iArr.length / 2) + 1];
        this.f15627b = d70VarArr;
        d70 d70Var = new d70(i10, i11);
        int i12 = 0;
        d70VarArr[0] = d70Var;
        while (i12 < iArr.length / 2) {
            int i13 = i12 + 1;
            int i14 = i12 * 2;
            ((d70[]) this.f15627b)[i13] = new d70(iArr[i14], iArr[i14 + 1]);
            i12 = i13;
        }
    }

    @Override
    public float get() {
        qg.w0 w0Var = (qg.w0) this.f15627b;
        int i10 = w0Var.f46524a;
        pg.m currentBrush = w0Var.f46527e.getCurrentBrush();
        if (currentBrush == null) {
            return pg.t0.e(i10).f45685i;
        }
        return pg.t0.e(i10).f("-1", currentBrush.d());
    }

    public y0(TextView textView) {
        this.f15626a = 15;
        this.f15627b = new q1.g(textView);
    }

    public y0(Context context, Uri uri) {
        this.f15626a = 3;
        this.f15627b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    @Override
    public void onDismiss() {
    }

    @Override
    public void p() {
    }

    @Override
    public void P0(MrzRecognizer.Result result) {
    }

    @Override
    public void c(int i10) {
    }

    @Override
    public void e(int i10) {
    }

    @Override
    public void s(String str) {
    }

    @Override
    public void a(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }

    @Override
    public void f(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override
    public void o(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
