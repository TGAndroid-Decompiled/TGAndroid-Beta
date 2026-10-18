package ki;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
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
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.dr0;
import org.telegram.ui.Components.fb0;
import org.telegram.ui.Components.mf0;
import org.telegram.ui.Components.nf0;
import org.telegram.ui.Components.q71;
import org.telegram.ui.Components.rc0;
import org.telegram.ui.Components.t60;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.uh0;
import org.telegram.ui.Components.x71;
import org.telegram.ui.Components.zq0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bs0;
import org.telegram.ui.it0;
import org.telegram.ui.kb0;
import org.telegram.ui.n9;
import org.telegram.ui.oi0;
import org.telegram.ui.x9;
import w7.v8;
public class t1 implements org.telegram.ui.Components.e5, j0, m.f2, y2.g, m.y0, n5.b, o0.a, q71, fb0, mg.o, x71, hg.z1, x9, com.google.android.gms.common.api.internal.o, rg.v1, s4.h1, com.google.android.gms.common.api.internal.r {
    public final int f15525a;
    public Object f15526b;

    public t1(Object obj, int i10) {
        this.f15525a = i10;
        this.f15526b = obj;
    }

    public static void M(String str, TreeMap treeMap) {
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

    public static float[] u(ArrayList arrayList) {
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
            arrayList2.add((PointF) i2.d.h(1, arrayList));
        }
        int i29 = i10;
        float f22 = ((PointF) arrayList2.get(i29)).x;
        if (f22 > f11) {
            for (int i30 = (int) f22; i30 >= 0; i30--) {
                arrayList2.add(i29, new PointF(i30, f11));
            }
        }
        float f23 = ((PointF) i2.d.h(1, arrayList2)).x;
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

    public static t1 w(float f7, int i10) {
        boolean z10;
        Point point = AndroidUtilities.displaySize;
        int i11 = (int) (point.x * f7);
        int i12 = (int) (point.y * f7);
        if (i11 == i12) {
            return new t1(i11, i12, new int[0]);
        }
        if (i10 == 3) {
            return new t1(i11, i12, new int[]{i12, i11});
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
            return new t1(i11, i12, new int[0]);
        }
        return new t1(i12, i11, new int[0]);
    }

    @Override
    public m9 B() {
        return (o4) this.f15526b;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        switch (this.f15525a) {
            case 0:
                d2 d2Var = (d2) this.f15526b;
                d2Var.s0(i10, i11, z10);
                oi0 oi0Var = d2Var.O0;
                if (oi0Var != null) {
                    oi0Var.i();
                    d2Var.O0 = null;
                    return;
                }
                return;
            default:
                ((ChatActivityEnterView) this.f15526b).R0(i10, z10, 0, true, 0L);
                return;
        }
    }

    @Override
    public void D(boolean z10) {
        ((nf0) this.f15526b).f28755c.setAspectLock(z10);
    }

    @Override
    public void E(String str) {
        String trim;
        org.telegram.ui.Wallet.m5 m5Var = (org.telegram.ui.Wallet.m5) this.f15526b;
        if (str == null) {
            trim = "";
        } else {
            try {
                trim = str.trim();
            } catch (Throwable unused) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.n3(m5Var, 7));
                return;
            }
        }
        Uri parse = Uri.parse(trim);
        String scheme = parse.getScheme();
        if (("ton".equalsIgnoreCase(scheme) || "tc".equalsIgnoreCase(scheme)) && (m5Var.getParentActivity() instanceof LaunchActivity) && new kb0((LaunchActivity) m5Var.getParentActivity(), org.telegram.ui.Wallet.m5.k0(m5Var), null, false).g(parse)) {
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.n3(m5Var, 7));
    }

    @Override
    public a F() {
        return ((o4) this.f15526b).f15112a;
    }

    @Override
    public boolean G() {
        o4 o4Var = (o4) this.f15526b;
        m4 m4Var = o4Var.G;
        if (m4Var != null) {
            a aVar = o4Var.f15112a;
            if (((s3) m4Var).f15502a.T4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void H(int i10, int i11, CharSequence charSequence, boolean z10) {
        ti tiVar = (ti) this.f15526b;
        if (tiVar.o1() == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tiVar.o1().getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                Emoji.replaceEmoji(spannableStringBuilder, tiVar.o1().getEditText().getPaint().getFontMetricsInt(), false);
            }
            tiVar.o1().setText(spannableStringBuilder);
            tiVar.o1().setSelection(i10 + charSequence.length());
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public void I(y2.i iVar, long j10, long j11, boolean z10) {
        ((l2.h) this.f15526b).x((y2.o) iVar, j10, j11);
    }

    @Override
    public a0.h J() {
        return null;
    }

    @Override
    public void K(int i10, int i11) {
        o4 o4Var = (o4) this.f15526b;
        m4 m4Var = o4Var.G;
        if (m4Var != null) {
            a aVar = o4Var.f15112a;
            h2 h2Var = ((s3) m4Var).f15502a.H3;
            if (h2Var != null) {
                h2Var.f(i10, i11);
            }
        }
    }

    @Override
    public View L(int i10) {
        return ((s4.n0) this.f15526b).q(i10);
    }

    @Override
    public void N() {
        o4 o4Var = (o4) this.f15526b;
        m4 m4Var = o4Var.G;
        if (m4Var != null) {
            a aVar = o4Var.f15112a;
            w3 w3Var = ((s3) m4Var).f15502a;
            h2 h2Var = w3Var.H3;
            if (h2Var != null) {
                h2Var.g();
            }
            w3Var.f15593f3.onContentChanged();
        }
    }

    @Override
    public boolean O(int i10) {
        if (i10 == ((zq0) this.f15526b).f33011r) {
            return true;
        }
        return false;
    }

    public boolean Q(int i10, int i11, Bundle bundle) {
        return false;
    }

    @Override
    public void R(boolean z10) {
        nf0 nf0Var = (nf0) this.f15526b;
        nf0Var.getClass();
        mf0 mf0Var = nf0Var.f28753a;
        if (mf0Var != null) {
            ((bs0) mf0Var).a(z10);
        }
    }

    public void S(s4.b1 b1Var, b2.u0 u0Var, b2.u0 u0Var2) {
        int i10;
        int i11;
        boolean z10;
        s4.b1 T;
        int i12;
        RecyclerView recyclerView = (RecyclerView) this.f15526b;
        recyclerView.f3607b.k(b1Var);
        recyclerView.h(b1Var);
        b1Var.q(false);
        s4.e1 e1Var = (s4.e1) recyclerView.f3610c0;
        e1Var.getClass();
        int i13 = u0Var.f4057a;
        int i14 = u0Var.f4058b;
        View view = b1Var.f45958a;
        if (u0Var2 == null) {
            i10 = view.getLeft();
        } else {
            i10 = u0Var2.f4057a;
        }
        int i15 = i10;
        if (u0Var2 == null) {
            i11 = view.getTop();
        } else {
            i11 = u0Var2.f4058b;
        }
        int i16 = i11;
        if (!b1Var.j() && (i13 != i15 || i14 != i16)) {
            view.layout(i15, i16, view.getWidth() + i15, view.getHeight() + i16);
            z10 = e1Var.r(b1Var, u0Var, i13, i14, i15, i16);
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
            b1Var.f45963i = (b1Var.h - i18) + (i18 * 1000);
            e1Var.s(b1Var, u0Var);
            z10 = true;
        }
        if (z10) {
            recyclerView.l0();
        }
    }

    public void T(s4.b1 b1Var) {
        RecyclerView recyclerView = (RecyclerView) this.f15526b;
        s4.n0 n0Var = recyclerView.f3635x;
        View view = b1Var.f45958a;
        qf.e eVar = recyclerView.f3607b;
        m.g3 g3Var = n0Var.f46050a;
        ih.g gVar = (ih.g) g3Var.f16203b;
        int indexOfChild = gVar.f13141a.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((ad.d) g3Var.f16204c).F(indexOfChild)) {
                g3Var.S(view);
            }
            gVar.a(indexOfChild);
        }
        eVar.g(view);
    }

    @Override
    public void U(float f7) {
        it0 it0Var = (it0) this.f15526b;
        qg.u0.e(it0Var.P1).k(String.valueOf(qg.m.f44605a.indexOf(it0Var.W0.getCurrentBrush())), f7);
        qg.s1 s1Var = it0Var.K1;
        s1Var.f44689c = f7;
        it0Var.t0(s1Var, null);
    }

    @Override
    public boolean U0(String str, n9 n9Var) {
        return false;
    }

    @Override
    public void V() {
        mf0 mf0Var = ((nf0) this.f15526b).f28753a;
        if (mf0Var != null) {
            PhotoViewer photoViewer = ((bs0) mf0Var).f35755a;
            if (photoViewer.f33257c2 == 1) {
                photoViewer.H2 = true;
                photoViewer.q3();
            }
        }
    }

    @Override
    public void W() {
        o4 o4Var = (o4) this.f15526b;
        m4 m4Var = o4Var.G;
        if (m4Var != null) {
            a aVar = o4Var.f15112a;
            w3.P1(((s3) m4Var).f15502a);
        }
    }

    @Override
    public int X(View view) {
        return s4.n0.y(view) + ((ViewGroup.MarginLayoutParams) ((s4.o0) view.getLayoutParams())).rightMargin;
    }

    public void Z(ba.a aVar, TreeMap treeMap) {
        String str;
        List list = (List) treeMap.get("Sec-WebSocket-Protocol");
        if (list != null && (str = (String) list.get(0)) != null && str.length() != 0) {
            synchronized (((tc.u) this.f15526b).f47018c) {
            }
            throw new tc.n(19, "The protocol contained in the Sec-WebSocket-Protocol header is not supported: ".concat(str), aVar);
        }
    }

    public void a0() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f15526b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        int size = arrayDeque.size();
        long c02 = c0();
        throw new IOException("data item not completed, stackSize: " + size + " scope: " + c02);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        s6.f fVar = new s6.f(0, (TaskCompletionSource) obj2);
        s6.e eVar = (s6.e) ((s6.h) obj).u();
        Parcel H0 = eVar.H0();
        k7.a.d(H0, fVar);
        k7.a.c(H0, (s6.a) this.f15526b);
        eVar.I0(H0, 1);
    }

    public void b0(long j10) {
        long c02 = c0();
        if (c02 != j10) {
            if (c02 != -1) {
                if (c02 == -2) {
                    c02 = -2;
                } else {
                    return;
                }
            }
            StringBuilder t10 = a1.g.t(j10, "expected non-string scope or scope ", " but found ");
            t10.append(c02);
            throw new IOException(t10.toString());
        }
    }

    @Override
    public void c(h1 h1Var) {
        m4 m4Var = ((o4) this.f15526b).G;
        if (m4Var != null) {
            w3 w3Var = ((s3) m4Var).f15502a;
            w3.N1(w3Var, h1Var);
            w3Var.f15593f3.n(h1Var, true);
        }
    }

    public long c0() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f15526b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f15526b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override
    public int d(View view) {
        return s4.n0.x(view) - ((ViewGroup.MarginLayoutParams) ((s4.o0) view.getLayoutParams())).leftMargin;
    }

    @Override
    public void e(l.k kVar, MenuItem menuItem) {
        ((l.e) this.f15526b).f15736f.removeCallbacksAndMessages(kVar);
    }

    @Override
    public void f(int i10) {
        zq0 zq0Var = (zq0) this.f15526b;
        dr0 dr0Var = zq0Var.K;
        zq0Var.f33012s = i10;
        if (zq0Var.v != i10) {
            zq0Var.d.clear();
        }
        int i11 = zq0Var.J;
        if (zq0Var.h() == 0 && !zq0Var.e.e() && !zq0Var.I) {
            dr0Var.Q.e(false, true);
        } else {
            dr0Var.f25689x0.b(i11);
        }
        zq0Var.l();
        int i12 = dr0.f25658a1;
        dr0Var.L0(true);
    }

    @Override
    public void g() {
        o4 o4Var = (o4) this.f15526b;
        m4 m4Var = o4Var.G;
        if (m4Var != null) {
            w3.Q1(((s3) m4Var).f15502a, o4Var.f15112a);
        }
    }

    @Override
    public Object mo27get() {
        return new m.g3((Context) ((k0.b) this.f15526b).f14566b, new rb.b(24), new pb.a(24), 3);
    }

    public s0.c i(int i10) {
        return null;
    }

    @Override
    public void invalidate() {
        ((org.telegram.ui.Cells.u1) ((org.telegram.ui.Cells.h1) this.f15526b).f22327b).invalidate();
    }

    @Override
    public k4.d j(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        long min;
        k4.d dVar;
        y2.o oVar = (y2.o) iVar;
        l2.h hVar = (l2.h) this.f15526b;
        long j12 = oVar.f49975a;
        g2.m mVar = oVar.f49976b;
        g2.b0 b0Var = oVar.d;
        u2.t tVar = new u2.t(mVar, b0Var.f10767c, b0Var.d, j10, j11, b0Var.f10766b);
        int i11 = oVar.f49977c;
        hVar.f15850m.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof b2.w0) || (th2 instanceof FileNotFoundException) || (th2 instanceof g2.u) || (th2 instanceof y2.k) || ((th2 instanceof g2.j) && ((g2.j) th2).f10784a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i10 - 1) * 1000, 5000);
        if (min == -9223372036854775807L) {
            dVar = y2.l.f49971f;
        } else {
            dVar = new k4.d(0, min, false);
        }
        hVar.f15854q.t(tVar, i11, iOException, !dVar.a());
        return dVar;
    }

    @Override
    public int k() {
        return ((s4.n0) this.f15526b).D();
    }

    @Override
    public void l(y2.i iVar, long j10, long j11, int i10) {
        u2.t tVar;
        y2.o oVar = (y2.o) iVar;
        l2.h hVar = (l2.h) this.f15526b;
        if (i10 == 0) {
            long j12 = oVar.f49975a;
            tVar = new u2.t(oVar.f49976b, j10);
        } else {
            long j13 = oVar.f49975a;
            g2.m mVar = oVar.f49976b;
            g2.b0 b0Var = oVar.d;
            tVar = new u2.t(mVar, b0Var.f10767c, b0Var.d, j10, j11, b0Var.f10766b);
        }
        hVar.f15854q.v(tVar, oVar.f49977c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    public String m(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            la.d dVar = (la.d) this.f15526b;
            la.e eVar = new la.e(stringWriter, dVar.f15988a, dVar.f15989b, dVar.f15990c, dVar.d);
            eVar.h(obj);
            eVar.j();
            eVar.f15992b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override
    public void n(y2.i iVar, long j10, long j11) {
        int size;
        long j12;
        y2.o oVar = (y2.o) iVar;
        l2.h hVar = (l2.h) this.f15526b;
        long j13 = oVar.f49975a;
        g2.m mVar = oVar.f49976b;
        g2.b0 b0Var = oVar.d;
        u2.t tVar = new u2.t(mVar, b0Var.f10767c, b0Var.d, j10, j11, b0Var.f10766b);
        hVar.f15850m.getClass();
        hVar.f15854q.r(tVar, oVar.f49977c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        m2.c cVar = (m2.c) oVar.f49978f;
        m2.c cVar2 = hVar.G;
        if (cVar2 == null) {
            size = 0;
        } else {
            size = cVar2.f16425m.size();
        }
        long j14 = cVar.b(0).f16442b;
        int i10 = 0;
        while (i10 < size && hVar.G.b(i10).f16442b < j14) {
            i10++;
        }
        if (cVar.d) {
            if (size - i10 > cVar.f16425m.size()) {
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
            if (i11 < hVar.f15850m.y3(oVar.f49977c)) {
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
        synchronized (hVar.f15857t) {
            try {
                if (oVar.f49976b.f10794a.equals(hVar.E)) {
                    Uri uri = hVar.G.f16423k;
                    if (uri == null) {
                        uri = v8.a(oVar.d.f10767c);
                    }
                    hVar.E = uri;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m2.c cVar3 = hVar.G;
        if (cVar3.d && hVar.K == j12) {
            m2.t tVar2 = cVar3.f16421i;
            if (tVar2 != null) {
                String str = tVar2.f16470b;
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
                        hVar.A(tVar2, new sb.a(12));
                        return;
                    }
                    hVar.A(tVar2, new Object());
                    return;
                }
                try {
                    hVar.K = e2.m0.V(tVar2.f16471c) - hVar.J;
                    hVar.z(true);
                    return;
                } catch (b2.w0 e) {
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
    public void o(Object obj) {
        ((g8.c) obj).onLocationResult((LocationResult) this.f15526b);
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        dl0 dl0Var = (dl0) this.f15526b;
        if (z10 && dl0Var.f25620n.n() >= 0) {
            dl0Var.f25623w = true;
        }
        ah0 ah0Var = dl0Var.f25619f;
        rc0 rc0Var = dl0Var.f25624x;
        ah0Var.a(z10, true);
        AndroidUtilities.cancelRunOnUIThread(rc0Var);
        if (z10) {
            AndroidUtilities.runOnUIThread(rc0Var, 16L);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void p(l.k kVar, l.m mVar) {
        l.e eVar = (l.e) this.f15526b;
        Handler handler = eVar.f15736f;
        l.d dVar = null;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = eVar.f15737n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (kVar == ((l.d) arrayList.get(i10)).f15731b) {
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
    public String p0() {
        return null;
    }

    public s0.c q(int i10) {
        return null;
    }

    @Override
    public void r() {
        mf0 mf0Var = ((nf0) this.f15526b).f28753a;
        if (mf0Var != null) {
            ((bs0) mf0Var).f35755a.f33273e0.invalidate();
        }
    }

    @Override
    public Paint.FontMetricsInt s() {
        return ((ti) this.f15526b).H0.getEditText().getPaint().getFontMetricsInt();
    }

    @Override
    public org.telegram.ui.Cells.n9 t() {
        m4 m4Var = ((o4) this.f15526b).G;
        if (m4Var != null) {
            return ((s3) m4Var).f15502a.getTextSelectionHelper();
        }
        return null;
    }

    @Override
    public void v(CharSequence charSequence) {
        m4 m4Var = ((o4) this.f15526b).G;
        if (m4Var != null) {
            s3 s3Var = (s3) m4Var;
            s3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                s3Var.f15502a.u4(charSequence.toString());
            }
        }
    }

    @Override
    public Cursor x(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f15526b;
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
    public a0.h y() {
        return null;
    }

    @Override
    public int z() {
        s4.n0 n0Var = (s4.n0) this.f15526b;
        return n0Var.f46059m - n0Var.E();
    }

    public t1(s6.g gVar, s6.a aVar) {
        this.f15525a = 28;
        this.f15526b = aVar;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public t1(int i10) {
        this.f15525a = i10;
        switch (i10) {
            case 10:
                this.f15526b = new o2.d(1.0f, 5, 0, false);
                return;
            case 15:
                return;
            case 25:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f15526b = new uh0(this);
                    return;
                } else {
                    this.f15526b = new uh0(this);
                    return;
                }
            default:
                this.f15526b = new ArrayDeque(16);
                return;
        }
    }

    @Override
    public float get() {
        it0 it0Var = (it0) this.f15526b;
        int i10 = it0Var.P1;
        qg.m currentBrush = it0Var.W0.getCurrentBrush();
        if (currentBrush == null) {
            return qg.u0.e(i10).f44717i;
        }
        return qg.u0.e(i10).f(String.valueOf(qg.m.f44605a.indexOf(currentBrush)), currentBrush.d());
    }

    public t1(int i10, int i11, int[] iArr) {
        this.f15525a = 12;
        t60[] t60VarArr = new t60[(iArr.length / 2) + 1];
        this.f15526b = t60VarArr;
        t60 t60Var = new t60(i10, i11);
        int i12 = 0;
        t60VarArr[0] = t60Var;
        while (i12 < iArr.length / 2) {
            int i13 = i12 + 1;
            int i14 = i12 * 2;
            ((t60[]) this.f15526b)[i13] = new t60(iArr[i14], iArr[i14 + 1]);
            i12 = i13;
        }
    }

    public t1(Context context, Uri uri) {
        this.f15525a = 9;
        this.f15526b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    @Override
    public void F0(MrzRecognizer.Result result) {
    }

    @Override
    public void P(String str) {
    }

    @Override
    public void Y(ArrayList arrayList) {
    }

    @Override
    public void a(int i10) {
    }

    @Override
    public void h(int i10) {
    }

    @Override
    public void onDismiss() {
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
    public void onError(a81 a81Var, Exception exc) {
    }

    @Override
    public void A(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override
    public void b(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
