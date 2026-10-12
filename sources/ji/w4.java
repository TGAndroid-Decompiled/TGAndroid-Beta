package ji;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ai0;
import org.telegram.ui.Components.jr0;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.sf0;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.w60;
import org.telegram.ui.Components.y71;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.at0;
import org.telegram.ui.hu0;
import org.telegram.ui.jc0;
import org.telegram.ui.y9;
import w7.u8;
public class w4 implements j0, m.e2, y2.g, l.i, l2.i, o0.a, y71, org.telegram.ui.Components.f5, lb0, mg.o, bh.h, y9, com.google.android.gms.common.api.internal.o, rg.x1, s4.h1, com.google.android.gms.common.api.internal.s {
    public final int f13591a;
    public Object f13592b;

    public w4(int i10, boolean z10) {
        this.f13591a = i10;
    }

    public static float[] R(ArrayList arrayList) {
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
            arrayList2.add((PointF) i2.d.g(1, arrayList));
        }
        int i29 = i10;
        float f22 = ((PointF) arrayList2.get(i29)).x;
        if (f22 > f11) {
            for (int i30 = (int) f22; i30 >= 0; i30--) {
                arrayList2.add(i29, new PointF(i30, f11));
            }
        }
        float f23 = ((PointF) i2.d.g(1, arrayList2)).x;
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

    public static w4 T(float f7, int i10) {
        boolean z10;
        Point point = AndroidUtilities.displaySize;
        int i11 = (int) (point.x * f7);
        int i12 = (int) (point.y * f7);
        if (i11 == i12) {
            return new w4(i11, i12, new int[0]);
        }
        if (i10 == 3) {
            return new w4(i11, i12, new int[]{i12, i11});
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
            return new w4(i11, i12, new int[0]);
        }
        return new w4(i12, i11, new int[0]);
    }

    @Override
    public void A() {
        sf0 sf0Var = ((tf0) this.f13592b).f29368a;
        if (sf0Var != null) {
            ((at0) sf0Var).f34338a.f32226e0.invalidate();
        }
    }

    @Override
    public void B(y2.i iVar, long j10, long j11, boolean z10) {
        ((l2.h) this.f13592b).x((y2.o) iVar, j10, j11);
    }

    @Override
    public void B0(float f7) {
        hu0 hu0Var = (hu0) this.f13592b;
        qg.s0.e(hu0Var.P1).k(String.valueOf(qg.m.f43485a.indexOf(hu0Var.W0.getCurrentBrush())), f7);
        qg.q1 q1Var = hu0Var.K1;
        q1Var.f43545c = f7;
        hu0Var.t0(q1Var, null);
    }

    @Override
    public o9 C() {
        q3 q3Var = ((y4) this.f13592b).N;
        if (q3Var != null) {
            return q3Var.f13477a.getTextSelectionHelper();
        }
        return null;
    }

    @Override
    public int D() {
        return ((s4.n0) this.f13592b).D();
    }

    @Override
    public View D0(int i10) {
        return ((s4.n0) this.f13592b).q(i10);
    }

    @Override
    public void F(CharSequence charSequence) {
        q3 q3Var = ((y4) this.f13592b).N;
        if (q3Var != null) {
            q3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                q3Var.f13477a.u4(charSequence.toString());
            }
        }
    }

    public void G(Runnable runnable) {
        Runnable runnable2 = (Runnable) ((HashMap) this.f13592b).remove(runnable);
        if (runnable2 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable2);
        }
    }

    public void H() {
        HashMap hashMap = (HashMap) this.f13592b;
        for (Map.Entry entry : hashMap.entrySet()) {
            AndroidUtilities.cancelRunOnUIThread((Runnable) entry.getValue());
        }
        hashMap.clear();
    }

    public s0.c I(int i10) {
        return null;
    }

    @Override
    public String I0() {
        return null;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        ((ChatActivityEnterView) this.f13592b).R0(i10, z10, 0, true, 0L);
    }

    @Override
    public void K(String str) {
        String trim;
        org.telegram.ui.Wallet.z4 z4Var = (org.telegram.ui.Wallet.z4) this.f13592b;
        if (str == null) {
            trim = "";
        } else {
            try {
                trim = str.trim();
            } catch (Throwable unused) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.f3(z4Var, 7));
                return;
            }
        }
        Uri parse = Uri.parse(trim);
        String scheme = parse.getScheme();
        if (("ton".equalsIgnoreCase(scheme) || "tc".equalsIgnoreCase(scheme)) && (z4Var.getParentActivity() instanceof LaunchActivity) && new jc0((LaunchActivity) z4Var.getParentActivity(), org.telegram.ui.Wallet.z4.g0(z4Var), null, false).g(parse)) {
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.f3(z4Var, 7));
    }

    @Override
    public n9 L() {
        return (y4) this.f13592b;
    }

    @Override
    public int L0(View view) {
        return s4.n0.y(view) + ((ViewGroup.MarginLayoutParams) ((s4.o0) view.getLayoutParams())).rightMargin;
    }

    @Override
    public void M(boolean z10) {
        ((tf0) this.f13592b).f29370c.setAspectLock(z10);
    }

    public String N(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            la.d dVar = (la.d) this.f13592b;
            la.e eVar = new la.e(stringWriter, dVar.f14646a, dVar.f14647b, dVar.f14648c, dVar.d);
            eVar.h(obj);
            eVar.j();
            eVar.f14650b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override
    public a O() {
        return ((y4) this.f13592b).f13119a;
    }

    public s0.c P(int i10) {
        return null;
    }

    @Override
    public boolean Q() {
        y4 y4Var = (y4) this.f13592b;
        q3 q3Var = y4Var.N;
        if (q3Var != null) {
            a aVar = y4Var.f13119a;
            if (q3Var.f13477a.T4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void S(int i10, int i11) {
        y4 y4Var = (y4) this.f13592b;
        q3 q3Var = y4Var.N;
        if (q3Var != null) {
            a aVar = y4Var.f13119a;
            h2 h2Var = q3Var.f13477a.H3;
            if (h2Var != null) {
                h2Var.f(i10, i11);
            }
        }
    }

    public boolean U(int i10, int i11, Bundle bundle) {
        return false;
    }

    public void V(s4.b1 b1Var, b2.v0 v0Var, b2.v0 v0Var2) {
        int i10;
        int i11;
        boolean z10;
        s4.b1 T;
        int i12;
        RecyclerView recyclerView = (RecyclerView) this.f13592b;
        recyclerView.f1989b.k(b1Var);
        recyclerView.h(b1Var);
        b1Var.q(false);
        s4.e1 e1Var = (s4.e1) recyclerView.f1992c0;
        e1Var.getClass();
        int i13 = v0Var.f2444a;
        int i14 = v0Var.f2445b;
        View view = b1Var.f44838a;
        if (v0Var2 == null) {
            i10 = view.getLeft();
        } else {
            i10 = v0Var2.f2444a;
        }
        int i15 = i10;
        if (v0Var2 == null) {
            i11 = view.getTop();
        } else {
            i11 = v0Var2.f2445b;
        }
        int i16 = i11;
        if (!b1Var.j() && (i13 != i15 || i14 != i16)) {
            view.layout(i15, i16, view.getWidth() + i15, view.getHeight() + i16);
            z10 = e1Var.r(b1Var, v0Var, i13, i14, i15, i16);
        } else {
            int i17 = b1Var.h;
            int i18 = -1;
            if (i17 != -1) {
                for (int i19 = 0; i19 < recyclerView.getChildCount(); i19++) {
                    View childAt = recyclerView.getChildAt(i19);
                    if (childAt != null && (T = recyclerView.T(childAt)) != null && !T.j() && (i12 = T.h) >= 0 && i12 < i17 && i12 > i18) {
                        i18 = i12;
                    }
                }
            }
            b1Var.f44843i = (b1Var.h - i18) + (i18 * 1000);
            e1Var.s(b1Var, v0Var);
            z10 = true;
        }
        if (z10) {
            recyclerView.l0();
        }
    }

    public void W(s4.b1 b1Var) {
        RecyclerView recyclerView = (RecyclerView) this.f13592b;
        s4.n0 n0Var = recyclerView.f2017x;
        View view = b1Var.f44838a;
        qf.e eVar = recyclerView.f1989b;
        li.k kVar = n0Var.f44930a;
        h5 h5Var = (h5) kVar.f14820b;
        int indexOfChild = ((RecyclerView) h5Var.f13312b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((ad.d) kVar.f14821c).G(indexOfChild)) {
                kVar.X(view);
            }
            h5Var.a1(indexOfChild);
        }
        eVar.g(view);
    }

    @Override
    public Cursor X(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f13592b;
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

    public Object Y() {
        if (n7.a.f16163b == null) {
            n7.a.f16163b = new Exception();
        }
        synchronized (n7.a.f16162a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    @Override
    public void Z() {
        y4 y4Var = (y4) this.f13592b;
        q3 q3Var = y4Var.N;
        if (q3Var != null) {
            a aVar = y4Var.f13119a;
            x3 x3Var = q3Var.f13477a;
            h2 h2Var = x3Var.H3;
            if (h2Var != null) {
                h2Var.g();
            }
            x3Var.f13627f3.onContentChanged();
        }
    }

    @Override
    public void a(h1 h1Var) {
        q3 q3Var = ((y4) this.f13592b).N;
        if (q3Var != null) {
            x3 x3Var = q3Var.f13477a;
            x3.N1(x3Var, h1Var);
            x3Var.f13627f3.c0(h1Var, true);
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        s6.f fVar = new s6.f(0, (TaskCompletionSource) obj2);
        s6.e eVar = (s6.e) ((s6.h) obj).u();
        Parcel H0 = eVar.H0();
        k7.a.d(H0, fVar);
        k7.a.c(H0, (s6.a) this.f13592b);
        eVar.I0(H0, 1);
    }

    @Override
    public long b(long j10) {
        return 0L;
    }

    @Override
    public int b0() {
        s4.n0 n0Var = (s4.n0) this.f13592b;
        return n0Var.f44939m - n0Var.E();
    }

    @Override
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f13592b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override
    public void d(l.k kVar, MenuItem menuItem) {
        ((l.e) this.f13592b).f14395f.removeCallbacksAndMessages(kVar);
    }

    @Override
    public long e(long j10, long j11) {
        return 0L;
    }

    @Override
    public boolean e1(String str, org.telegram.ui.o9 o9Var) {
        return false;
    }

    @Override
    public void f() {
        y4 y4Var = (y4) this.f13592b;
        q3 q3Var = y4Var.N;
        if (q3Var != null) {
            x3.Q1(q3Var.f13477a, y4Var.f13119a);
        }
    }

    @Override
    public float get() {
        hu0 hu0Var = (hu0) this.f13592b;
        int i10 = hu0Var.P1;
        qg.m currentBrush = hu0Var.W0.getCurrentBrush();
        if (currentBrush == null) {
            return qg.s0.e(i10).f43570i;
        }
        return qg.s0.e(i10).f(String.valueOf(qg.m.f43485a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override
    public long h(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override
    public m2.j i(long j10) {
        return (m2.j) this.f13592b;
    }

    @Override
    public void i0(boolean z10) {
        tf0 tf0Var = (tf0) this.f13592b;
        tf0Var.getClass();
        sf0 sf0Var = tf0Var.f29368a;
        if (sf0Var != null) {
            ((at0) sf0Var).a(z10);
        }
    }

    @Override
    public void invalidate() {
        ((org.telegram.ui.Cells.u1) ((org.telegram.ui.Cells.h1) this.f13592b).f21259b).invalidate();
    }

    @Override
    public k4.d j(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        long min;
        k4.d dVar;
        y2.o oVar = (y2.o) iVar;
        l2.h hVar = (l2.h) this.f13592b;
        long j12 = oVar.f48546a;
        g2.m mVar = oVar.f48547b;
        g2.b0 b0Var = oVar.d;
        u2.u uVar = new u2.u(mVar, b0Var.f9856c, b0Var.d, j10, j11, b0Var.f9855b);
        int i11 = oVar.f48548c;
        hVar.f14509m.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof b2.x0) || (th2 instanceof FileNotFoundException) || (th2 instanceof g2.u) || (th2 instanceof y2.k) || ((th2 instanceof g2.j) && ((g2.j) th2).f9873a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i10 - 1) * 1000, 5000);
        if (min == -9223372036854775807L) {
            dVar = y2.l.f48542f;
        } else {
            dVar = new k4.d(0, min, false);
        }
        hVar.f14513q.t(uVar, i11, iOException, !dVar.a());
        return dVar;
    }

    @Override
    public void k(y2.i iVar, long j10, long j11, int i10) {
        u2.u uVar;
        y2.o oVar = (y2.o) iVar;
        l2.h hVar = (l2.h) this.f13592b;
        if (i10 == 0) {
            long j12 = oVar.f48546a;
            uVar = new u2.u(oVar.f48547b, j10);
        } else {
            long j13 = oVar.f48546a;
            g2.m mVar = oVar.f48547b;
            g2.b0 b0Var = oVar.d;
            uVar = new u2.u(mVar, b0Var.f9856c, b0Var.d, j10, j11, b0Var.f9855b);
        }
        hVar.f14513q.v(uVar, oVar.f48548c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override
    public void k0() {
        sf0 sf0Var = ((tf0) this.f13592b).f29368a;
        if (sf0Var != null) {
            PhotoViewer photoViewer = ((at0) sf0Var).f34338a;
            if (photoViewer.f32210c2 == 1) {
                photoViewer.H2 = true;
                photoViewer.q3();
            }
        }
    }

    @Override
    public void l(y2.i iVar, long j10, long j11) {
        int size;
        long j12;
        y2.o oVar = (y2.o) iVar;
        l2.h hVar = (l2.h) this.f13592b;
        long j13 = oVar.f48546a;
        g2.m mVar = oVar.f48547b;
        g2.b0 b0Var = oVar.d;
        u2.u uVar = new u2.u(mVar, b0Var.f9856c, b0Var.d, j10, j11, b0Var.f9855b);
        hVar.f14509m.getClass();
        hVar.f14513q.r(uVar, oVar.f48548c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        m2.c cVar = (m2.c) oVar.f48549f;
        m2.c cVar2 = hVar.G;
        if (cVar2 == null) {
            size = 0;
        } else {
            size = cVar2.f15330m.size();
        }
        long j14 = cVar.b(0).f15347b;
        int i10 = 0;
        while (i10 < size && hVar.G.b(i10).f15347b < j14) {
            i10++;
        }
        if (cVar.d) {
            if (size - i10 > cVar.f15330m.size()) {
                e2.a.l("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j15 = hVar.M;
                j12 = -9223372036854775807L;
                if (j15 != -9223372036854775807L && cVar.h * 1000 <= j15) {
                    e2.a.l("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.h + ", " + hVar.M);
                } else {
                    hVar.L = 0;
                }
            }
            int i11 = hVar.L;
            hVar.L = i11 + 1;
            if (i11 < hVar.f14509m.y3(oVar.f48548c)) {
                hVar.D.postDelayed(hVar.v, Math.min((hVar.L - 1) * 1000, 5000));
                return;
            }
            hVar.C = new IOException();
            return;
        }
        j12 = -9223372036854775807L;
        hVar.G = cVar;
        hVar.H = cVar.d & hVar.H;
        hVar.I = j10 - j11;
        hVar.J = j10;
        hVar.N += i10;
        synchronized (hVar.f14516t) {
            try {
                if (oVar.f48547b.f9883a.equals(hVar.E)) {
                    Uri uri = hVar.G.f15328k;
                    if (uri == null) {
                        uri = u8.a(oVar.d.f9856c);
                    }
                    hVar.E = uri;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m2.c cVar3 = hVar.G;
        if (cVar3.d && hVar.K == j12) {
            c5.a aVar = cVar3.f15326i;
            if (aVar != null) {
                String str = aVar.f4323b;
                if (!Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
                    if (!Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                        if (!Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                            if (!Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
                                hVar.y(new IOException("Unsupported UTC timing scheme"));
                                return;
                            } else {
                                hVar.w();
                                return;
                            }
                        }
                        hVar.A(aVar, new sb.a(12));
                        return;
                    }
                    hVar.A(aVar, new Object());
                    return;
                }
                try {
                    hVar.K = e2.m0.V(aVar.f4324c) - hVar.J;
                    hVar.z(true);
                    return;
                } catch (b2.x0 e) {
                    hVar.y(e);
                    return;
                }
            }
            hVar.w();
            return;
        }
        hVar.z(true);
    }

    @Override
    public Paint.FontMetricsInt m() {
        return ((vi) this.f13592b).H0.getEditText().getPaint().getFontMetricsInt();
    }

    @Override
    public void m0(bh.a aVar) {
        aVar.a(((jr0) this.f13592b).getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override
    public void n(l.k kVar) {
        l2.f fVar = ((ActionMenuView) this.f13592b).K;
        if (fVar != null) {
            fVar.n(kVar);
        }
    }

    @Override
    public long o(long j10, long j11) {
        return 0L;
    }

    @Override
    public void o0() {
        y4 y4Var = (y4) this.f13592b;
        q3 q3Var = y4Var.N;
        if (q3Var != null) {
            a aVar = y4Var.f13119a;
            x3.P1(q3Var.f13477a);
        }
    }

    @Override
    public boolean p(l.k kVar, MenuItem menuItem) {
        m.k kVar2 = ((ActionMenuView) this.f13592b).P;
        if (kVar2 != null) {
            Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((d4) kVar2).f13233b).W.f14821c).iterator();
            while (it.hasNext()) {
                if (((androidx.fragment.app.a0) it.next()).f1539a.p()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public int q(View view) {
        return s4.n0.x(view) - ((ViewGroup.MarginLayoutParams) ((s4.o0) view.getLayoutParams())).leftMargin;
    }

    @Override
    public void s(l.k kVar, l.m mVar) {
        l.e eVar = (l.e) this.f13592b;
        Handler handler = eVar.f14395f;
        l.d dVar = null;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = eVar.f14396n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (kVar == ((l.d) arrayList.get(i10)).f14390b) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 == -1) {
            return;
        }
        int i11 = i10 + 1;
        if (i11 < arrayList.size()) {
            dVar = (l.d) arrayList.get(i11);
        }
        handler.postAtTime(new com.google.android.gms.internal.cast.p(this, dVar, mVar, kVar, false, 1), kVar, SystemClock.uptimeMillis() + 200);
    }

    @Override
    public boolean t() {
        return true;
    }

    public String toString() {
        switch (this.f13591a) {
            case 29:
                te.b bVar = te.b.e;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("method-execution".substring(7));
                stringBuffer.append("(");
                stringBuffer.append(((s4.b) this.f13592b).n());
                stringBuffer.append(")");
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    @Override
    public long u() {
        return 0L;
    }

    @Override
    public void v(Canvas canvas) {
        jr0 jr0Var = (jr0) this.f13592b;
        canvas.drawColor(jr0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6));
        if (SharedConfig.chatBlurEnabled()) {
            jr0Var.O0.b(canvas, -3);
        }
    }

    @Override
    public long w(long j10) {
        return 1L;
    }

    @Override
    public long x(long j10, long j11) {
        return 1L;
    }

    @Override
    public void y(int i10, int i11, CharSequence charSequence, boolean z10) {
        vi viVar = (vi) this.f13592b;
        if (viVar.o1() == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(viVar.o1().getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                Emoji.replaceEmoji(spannableStringBuilder, viVar.o1().getEditText().getPaint().getFontMetricsInt(), false);
            }
            viVar.o1().setText(spannableStringBuilder);
            viVar.o1().setSelection(i10 + charSequence.length());
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public void z(Object obj) {
        ((g8.c) obj).onLocationResult((LocationResult) this.f13592b);
    }

    public w4(Object obj, int i10) {
        this.f13591a = i10;
        this.f13592b = obj;
    }

    public w4(s6.g gVar, s6.a aVar) {
        this.f13591a = 28;
        this.f13592b = aVar;
    }

    public w4(int i10) {
        this.f13591a = i10;
        switch (i10) {
            case 17:
                this.f13592b = new HashMap();
                return;
            case 25:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f13592b = new ai0(this);
                    return;
                } else {
                    this.f13592b = new ai0(this);
                    return;
                }
            default:
                this.f13592b = new o2.d(1.0f, 5, 0, false);
                return;
        }
    }

    public w4(int i10, int i11, int[] iArr) {
        this.f13591a = 12;
        w60[] w60VarArr = new w60[(iArr.length / 2) + 1];
        this.f13592b = w60VarArr;
        w60 w60Var = new w60(i10, i11);
        int i12 = 0;
        w60VarArr[0] = w60Var;
        while (i12 < iArr.length / 2) {
            int i13 = i12 + 1;
            int i14 = i12 * 2;
            ((w60[]) this.f13592b)[i13] = new w60(iArr[i14], iArr[i14 + 1]);
            i12 = i13;
        }
    }

    public w4(Context context, Uri uri) {
        this.f13591a = 9;
        this.f13592b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    @Override
    public void onDismiss() {
    }

    @Override
    public void E(String str) {
    }

    @Override
    public void W0(MrzRecognizer.Result result) {
    }

    @Override
    public long c(long j10, long j11) {
        return j11;
    }

    @Override
    public void g(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }

    @Override
    public void r(TLRPC.TL_document tL_document, String str, Object obj) {
    }
}
