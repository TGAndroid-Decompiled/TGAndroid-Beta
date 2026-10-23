package ki;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.net.Uri;
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
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.eh0;
import org.telegram.ui.Components.er0;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.ir0;
import org.telegram.ui.Components.j81;
import org.telegram.ui.Components.qf0;
import org.telegram.ui.Components.rf0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.u60;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Wallet.s9;
import org.telegram.ui.cs0;
import org.telegram.ui.qi0;
import w7.u8;
public class t1 implements org.telegram.ui.Components.d5, j0, m.f2, y2.g, m.y0, n5.b, o0.a, a81, gb0, mg.o, g81, hg.z1, com.google.android.gms.common.api.internal.r, r2.m, com.google.android.gms.common.api.internal.o, rg.w1, s4.h1 {
    public final int f15584a;
    public Object f15585b;

    public t1(Object obj, int i10) {
        this.f15584a = i10;
        this.f15585b = obj;
    }

    public static float[] P(ArrayList arrayList) {
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
            arrayList2.add((PointF) i2.o1.i(1, arrayList));
        }
        int i29 = i10;
        float f22 = ((PointF) arrayList2.get(i29)).x;
        if (f22 > f11) {
            for (int i30 = (int) f22; i30 >= 0; i30--) {
                arrayList2.add(i29, new PointF(i30, f11));
            }
        }
        float f23 = ((PointF) i2.o1.i(1, arrayList2)).x;
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

    public static t1 Q(float f7, int i10) {
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
    public void A(CharSequence charSequence) {
        m4 m4Var = ((o4) this.f15585b).G;
        if (m4Var != null) {
            s3 s3Var = (s3) m4Var;
            s3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                s3Var.f15561a.z4(charSequence.toString());
            }
        }
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        switch (this.f15584a) {
            case 0:
                d2 d2Var = (d2) this.f15585b;
                d2Var.s0(i10, i11, z10);
                qi0 qi0Var = d2Var.O0;
                if (qi0Var != null) {
                    qi0Var.h();
                    d2Var.O0 = null;
                    return;
                }
                return;
            default:
                ((ChatActivityEnterView) this.f15585b).R0(i10, z10, 0, true, 0L);
                return;
        }
    }

    @Override
    public n9 D() {
        return (o4) this.f15585b;
    }

    @Override
    public void E(boolean z10) {
        ((rf0) this.f15585b).f30164c.setAspectLock(z10);
    }

    @Override
    public a F() {
        return ((o4) this.f15585b).f15157a;
    }

    @Override
    public a0.h G() {
        switch (this.f15584a) {
            case 18:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean H() {
        o4 o4Var = (o4) this.f15585b;
        m4 m4Var = o4Var.G;
        if (m4Var != null) {
            a aVar = o4Var.f15157a;
            if (((s3) m4Var).f15561a.Y4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void I(int i10, int i11, CharSequence charSequence, boolean z10) {
        ti tiVar = (ti) this.f15585b;
        if (tiVar.r1() == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tiVar.r1().getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                Emoji.replaceEmoji(spannableStringBuilder, tiVar.r1().getEditText().getPaint().getFontMetricsInt(), false);
            }
            tiVar.r1().setText(spannableStringBuilder);
            tiVar.r1().setSelection(i10 + charSequence.length());
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void J() {
        qg.c1 c1Var = ((qg.e1) this.f15585b).d;
        if (c1Var != null) {
            qg.b1 b1Var = c1Var.f44904s;
            if (b1Var != null) {
                c1Var.cancelRunnable(b1Var);
                c1Var.f44904s = null;
            }
            qg.b1 b1Var2 = new qg.b1(c1Var, 1);
            c1Var.f44904s = b1Var2;
            c1Var.postRunnable(b1Var2, 1L);
        }
    }

    @Override
    public void K(int i10, int i11) {
        o4 o4Var = (o4) this.f15585b;
        m4 m4Var = o4Var.G;
        if (m4Var != null) {
            a aVar = o4Var.f15157a;
            h2 h2Var = ((s3) m4Var).f15561a.K3;
            if (h2Var != null) {
                h2Var.f(i10, i11);
            }
        }
    }

    public String M(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            la.d dVar = (la.d) this.f15585b;
            la.e eVar = new la.e(stringWriter, dVar.f16050a, dVar.f16051b, dVar.f16052c, dVar.d);
            eVar.h(obj);
            eVar.j();
            eVar.f16054b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override
    public void N() {
        o4 o4Var = (o4) this.f15585b;
        m4 m4Var = o4Var.G;
        if (m4Var != null) {
            a aVar = o4Var.f15157a;
            w3 w3Var = ((s3) m4Var).f15561a;
            h2 h2Var = w3Var.K3;
            if (h2Var != null) {
                h2Var.g();
            }
            w3Var.f15656i3.onContentChanged();
        }
    }

    @Override
    public boolean O(int i10) {
        switch (this.f15584a) {
            case 18:
                if (i10 == ((er0) this.f15585b).f26056r) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public void R(boolean z10) {
        rf0 rf0Var = (rf0) this.f15585b;
        rf0Var.getClass();
        qf0 qf0Var = rf0Var.f30162a;
        if (qf0Var != null) {
            ((cs0) qf0Var).e(z10);
        }
    }

    @Override
    public void S(ArrayList arrayList) {
        int i10 = this.f15584a;
    }

    @Override
    public void U(float f7) {
        rg.w0 w0Var = (rg.w0) this.f15585b;
        qg.u0.e(w0Var.f46101a).k("-1", f7);
        w0Var.e.setBrushSize(f7);
    }

    @Override
    public void W() {
        qf0 qf0Var = ((rf0) this.f15585b).f30162a;
        if (qf0Var != null) {
            PhotoViewer photoViewer = ((cs0) qf0Var).f36422a;
            if (photoViewer.f33564c2 == 1) {
                photoViewer.H2 = true;
                photoViewer.s3();
            }
        }
    }

    @Override
    public void X() {
        o4 o4Var = (o4) this.f15585b;
        m4 m4Var = o4Var.G;
        if (m4Var != null) {
            a aVar = o4Var.f15157a;
            w3.U1(((s3) m4Var).f15561a);
        }
    }

    public void Y(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.f15585b;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }

    public void Z() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f15585b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        int size = arrayDeque.size();
        long b02 = b0();
        throw new IOException("data item not completed, stackSize: " + size + " scope: " + b02);
    }

    @Override
    public void a(long j10, int i10, int i11, int i12) {
        ((MediaCodec) this.f15585b).queueInputBuffer(i10, 0, i11, j10, i12);
    }

    public void a0(long j10) {
        long b02 = b0();
        if (b02 != j10) {
            if (b02 != -1) {
                if (b02 == -2) {
                    b02 = -2;
                } else {
                    return;
                }
            }
            StringBuilder t10 = a1.g.t(j10, "expected non-string scope or scope ", " but found ");
            t10.append(b02);
            throw new IOException(t10.toString());
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f15584a) {
            case 21:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                p6.a aVar = (p6.a) ((p6.c) obj).u();
                Parcel H0 = aVar.H0();
                k7.a.c(H0, (n6.o) this.f15585b);
                try {
                    aVar.f317b.transact(1, H0, null, 1);
                    H0.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Throwable th2) {
                    H0.recycle();
                    throw th2;
                }
            default:
                s6.f fVar = new s6.f(1, (TaskCompletionSource) obj2);
                s6.e eVar = (s6.e) ((s6.h) obj).u();
                Parcel H02 = eVar.H0();
                k7.a.d(H02, fVar);
                k7.a.c(H02, (s6.a) this.f15585b);
                H02.writeStrongBinder(null);
                eVar.I0(H02, 2);
                return;
        }
    }

    @Override
    public void b(int i10, h2.d dVar, long j10, int i11) {
        ((MediaCodec) this.f15585b).queueSecureInputBuffer(i10, 0, dVar.f11657i, j10, i11);
    }

    public long b0() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f15585b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override
    public void c(h1 h1Var) {
        m4 m4Var = ((o4) this.f15585b).G;
        if (m4Var != null) {
            w3 w3Var = ((s3) m4Var).f15561a;
            w3.S1(w3Var, h1Var);
            w3Var.f15656i3.o(h1Var, true);
        }
    }

    @Override
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f15585b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override
    public int d(View view) {
        return s4.n0.z(view) - ((ViewGroup.MarginLayoutParams) ((s4.o0) view.getLayoutParams())).topMargin;
    }

    @Override
    public k4.d e(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        long min;
        k4.d dVar;
        y2.o oVar = (y2.o) iVar;
        l2.h hVar = (l2.h) this.f15585b;
        long j12 = oVar.f50378a;
        g2.m mVar = oVar.f50379b;
        g2.b0 b0Var = oVar.d;
        u2.v vVar = new u2.v(mVar, b0Var.f10783c, b0Var.d, j10, j11, b0Var.f10782b);
        int i11 = oVar.f50380c;
        hVar.f15912m.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof b2.w0) || (th2 instanceof FileNotFoundException) || (th2 instanceof g2.u) || (th2 instanceof y2.k) || ((th2 instanceof g2.j) && ((g2.j) th2).f10800a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i10 - 1) * 1000, 5000);
        if (min == -9223372036854775807L) {
            dVar = y2.l.f50374f;
        } else {
            dVar = new k4.d(0, min, false);
        }
        hVar.f15916q.t(vVar, i11, iOException, !dVar.a());
        return dVar;
    }

    @Override
    public void f(int i10) {
        switch (this.f15584a) {
            case 18:
                er0 er0Var = (er0) this.f15585b;
                ir0 ir0Var = er0Var.K;
                er0Var.f26057s = i10;
                if (er0Var.v != i10) {
                    er0Var.d.clear();
                }
                int i11 = er0Var.J;
                if (er0Var.h() == 0 && !er0Var.e.e() && !er0Var.I) {
                    ir0Var.R.e(false, true);
                } else {
                    ir0Var.f27441y0.b(i11);
                }
                er0Var.l();
                int i12 = ir0.f27405d1;
                ir0Var.P0(true);
                return;
            default:
                s9 s9Var = (s9) this.f15585b;
                if (!s9Var.f35185n && i10 == s9Var.I) {
                    s9Var.e0(s9Var.M.getText().toString().trim());
                    return;
                }
                return;
        }
    }

    @Override
    public void g() {
        o4 o4Var = (o4) this.f15585b;
        m4 m4Var = o4Var.G;
        if (m4Var != null) {
            w3.V1(((s3) m4Var).f15561a, o4Var.f15157a);
        }
    }

    @Override
    public Object mo27get() {
        return new m.g3((Context) ((n5.c) this.f15585b).f17214a, new rb.b(24), new pb.a(24), 3);
    }

    @Override
    public void h(Object obj) {
        ((g8.c) obj).onLocationAvailability((LocationAvailability) this.f15585b);
    }

    @Override
    public void invalidate() {
        ((org.telegram.ui.Cells.t1) ((org.telegram.ui.Cells.g1) this.f15585b).f22397b).invalidate();
    }

    @Override
    public void j(y2.i iVar, long j10, long j11, int i10) {
        u2.v vVar;
        y2.o oVar = (y2.o) iVar;
        l2.h hVar = (l2.h) this.f15585b;
        if (i10 == 0) {
            long j12 = oVar.f50378a;
            vVar = new u2.v(oVar.f50379b, j10);
        } else {
            long j13 = oVar.f50378a;
            g2.m mVar = oVar.f50379b;
            g2.b0 b0Var = oVar.d;
            vVar = new u2.v(mVar, b0Var.f10783c, b0Var.d, j10, j11, b0Var.f10782b);
        }
        hVar.f15916q.v(vVar, oVar.f50380c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override
    public void k(y2.i iVar, long j10, long j11) {
        int size;
        long j12;
        y2.o oVar = (y2.o) iVar;
        l2.h hVar = (l2.h) this.f15585b;
        long j13 = oVar.f50378a;
        g2.m mVar = oVar.f50379b;
        g2.b0 b0Var = oVar.d;
        u2.v vVar = new u2.v(mVar, b0Var.f10783c, b0Var.d, j10, j11, b0Var.f10782b);
        hVar.f15912m.getClass();
        hVar.f15916q.r(vVar, oVar.f50380c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        m2.c cVar = (m2.c) oVar.f50381f;
        m2.c cVar2 = hVar.G;
        if (cVar2 == null) {
            size = 0;
        } else {
            size = cVar2.f16487m.size();
        }
        long j14 = cVar.b(0).f16504b;
        int i10 = 0;
        while (i10 < size && hVar.G.b(i10).f16504b < j14) {
            i10++;
        }
        if (cVar.d) {
            if (size - i10 > cVar.f16487m.size()) {
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
            if (i11 < hVar.f15912m.y3(oVar.f50380c)) {
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
        synchronized (hVar.f15919t) {
            try {
                if (oVar.f50379b.f10810a.equals(hVar.E)) {
                    Uri uri = hVar.G.f16485k;
                    if (uri == null) {
                        uri = u8.a(oVar.d.f10783c);
                    }
                    hVar.E = uri;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m2.c cVar3 = hVar.G;
        if (cVar3.d && hVar.K == j12) {
            m2.t tVar = cVar3.f16483i;
            if (tVar != null) {
                String str = tVar.f16532b;
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
                        hVar.A(tVar, new sb.a(12));
                        return;
                    }
                    hVar.A(tVar, new Object());
                    return;
                }
                try {
                    hVar.K = e2.m0.V(tVar.f16533c) - hVar.J;
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
    public void l(l.k kVar, MenuItem menuItem) {
        ((l.e) this.f15585b).f15798f.removeCallbacksAndMessages(kVar);
    }

    @Override
    public int m() {
        return ((s4.n0) this.f15585b).G();
    }

    @Override
    public int o() {
        s4.n0 n0Var = (s4.n0) this.f15585b;
        return n0Var.f46445n - n0Var.C();
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        hl0 hl0Var = (hl0) this.f15585b;
        if (z10 && hl0Var.f26978n.n() >= 0) {
            hl0Var.f26981w = true;
        }
        eh0 eh0Var = hl0Var.f26977f;
        yb0 yb0Var = hl0Var.f26982x;
        eh0Var.a(z10, true);
        AndroidUtilities.cancelRunOnUIThread(yb0Var);
        if (z10) {
            AndroidUtilities.runOnUIThread(yb0Var, 16L);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void q(l.k kVar, l.m mVar) {
        l.e eVar = (l.e) this.f15585b;
        Handler handler = eVar.f15798f;
        l.d dVar = null;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = eVar.f15799n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (kVar == ((l.d) arrayList.get(i10)).f15793b) {
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
    public Cursor r(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f15585b;
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
    public void setParameters(Bundle bundle) {
        ((MediaCodec) this.f15585b).setParameters(bundle);
    }

    @Override
    public View t(int i10) {
        return ((s4.n0) this.f15585b).q(i10);
    }

    @Override
    public void u() {
        qf0 qf0Var = ((rf0) this.f15585b).f30162a;
        if (qf0Var != null) {
            ((cs0) qf0Var).f36422a.f33580e0.invalidate();
        }
    }

    @Override
    public Paint.FontMetricsInt v() {
        return ((ti) this.f15585b).H0.getEditText().getPaint().getFontMetricsInt();
    }

    @Override
    public o9 w() {
        m4 m4Var = ((o4) this.f15585b).G;
        if (m4Var != null) {
            return ((s3) m4Var).f15561a.getTextSelectionHelper();
        }
        return null;
    }

    @Override
    public a0.h x() {
        switch (this.f15584a) {
            case 18:
                return null;
            default:
                return null;
        }
    }

    @Override
    public int y(View view) {
        return s4.n0.v(view) + ((ViewGroup.MarginLayoutParams) ((s4.o0) view.getLayoutParams())).bottomMargin;
    }

    @Override
    public void z(y2.i iVar, long j10, long j11, boolean z10) {
        ((l2.h) this.f15585b).x((y2.o) iVar, j10, j11);
    }

    public t1(s6.g gVar, s6.a aVar) {
        this.f15584a = 29;
        this.f15585b = aVar;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public t1(int i10) {
        this.f15584a = i10;
        switch (i10) {
            case 10:
                this.f15585b = new o2.d(1.0f, 5, 0, false);
                return;
            case 15:
                return;
            default:
                this.f15585b = new ArrayDeque(16);
                return;
        }
    }

    public t1(int i10, int i11, int[] iArr) {
        this.f15584a = 12;
        u60[] u60VarArr = new u60[(iArr.length / 2) + 1];
        this.f15585b = u60VarArr;
        u60 u60Var = new u60(i10, i11);
        int i12 = 0;
        u60VarArr[0] = u60Var;
        while (i12 < iArr.length / 2) {
            int i13 = i12 + 1;
            int i14 = i12 * 2;
            ((u60[]) this.f15585b)[i13] = new u60(iArr[i14], iArr[i14 + 1]);
            i12 = i13;
        }
    }

    @Override
    public float get() {
        rg.w0 w0Var = (rg.w0) this.f15585b;
        int i10 = w0Var.f46101a;
        qg.m currentBrush = w0Var.e.getCurrentBrush();
        if (currentBrush == null) {
            return qg.u0.e(i10).f45096i;
        }
        return qg.u0.e(i10).f("-1", currentBrush.d());
    }

    public t1(ArrayList arrayList) {
        this.f15584a = 26;
        this.f15585b = DesugarCollections.unmodifiableList(arrayList);
    }

    public t1(Context context, Uri uri) {
        this.f15584a = 9;
        this.f15585b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    private final void T(ArrayList arrayList) {
    }

    private final void V(ArrayList arrayList) {
    }

    @Override
    public void L(String str) {
    }

    @Override
    public void n(int i10) {
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
    public void s(int i10) {
    }

    @Override
    public void flush() {
    }

    @Override
    public void p() {
    }

    @Override
    public void shutdown() {
    }

    @Override
    public void start() {
    }

    @Override
    public void onError(j81 j81Var, Exception exc) {
    }

    @Override
    public void B(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override
    public void i(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
