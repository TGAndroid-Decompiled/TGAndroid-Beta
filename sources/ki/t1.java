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
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.bh0;
import org.telegram.ui.Components.br0;
import org.telegram.ui.Components.c81;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.fb0;
import org.telegram.ui.Components.fr0;
import org.telegram.ui.Components.nf0;
import org.telegram.ui.Components.of0;
import org.telegram.ui.Components.rc0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t60;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.z71;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Wallet.r9;
import org.telegram.ui.mi0;
import org.telegram.ui.zr0;
import w7.u8;
public class t1 implements org.telegram.ui.Components.e5, j0, m.f2, y2.g, m.y0, n5.b, o0.a, s71, fb0, mg.o, z71, hg.z1, com.google.android.gms.common.api.internal.r, r2.m, com.google.android.gms.common.api.internal.o, rg.v1, s4.h1 {
    public final int f15524a;
    public Object f15525b;

    public t1(Object obj, int i10) {
        this.f15524a = i10;
        this.f15525b = obj;
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
            arrayList2.add((PointF) i2.e.h(1, arrayList));
        }
        int i29 = i10;
        float f22 = ((PointF) arrayList2.get(i29)).x;
        if (f22 > f11) {
            for (int i30 = (int) f22; i30 >= 0; i30--) {
                arrayList2.add(i29, new PointF(i30, f11));
            }
        }
        float f23 = ((PointF) i2.e.h(1, arrayList2)).x;
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
    public int B(View view) {
        return s4.n0.v(view) + ((ViewGroup.MarginLayoutParams) ((s4.o0) view.getLayoutParams())).bottomMargin;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        switch (this.f15524a) {
            case 0:
                d2 d2Var = (d2) this.f15525b;
                d2Var.s0(i10, i11, z10);
                mi0 mi0Var = d2Var.O0;
                if (mi0Var != null) {
                    mi0Var.h();
                    d2Var.O0 = null;
                    return;
                }
                return;
            default:
                ((ChatActivityEnterView) this.f15525b).R0(i10, z10, 0, true, 0L);
                return;
        }
    }

    @Override
    public m9 D() {
        return (o4) this.f15525b;
    }

    @Override
    public void E(boolean z10) {
        ((of0) this.f15525b).f29041c.setAspectLock(z10);
    }

    @Override
    public a F() {
        return ((o4) this.f15525b).f15111a;
    }

    @Override
    public a0.h G() {
        switch (this.f15524a) {
            case 18:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean H() {
        o4 o4Var = (o4) this.f15525b;
        m4 m4Var = o4Var.G;
        if (m4Var != null) {
            a aVar = o4Var.f15111a;
            if (((s3) m4Var).f15501a.T4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void I(int i10, int i11, CharSequence charSequence, boolean z10) {
        ti tiVar = (ti) this.f15525b;
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
    public void J(y2.i iVar, long j10, long j11, boolean z10) {
        ((l2.h) this.f15525b).x((y2.o) iVar, j10, j11);
    }

    @Override
    public void K(int i10, int i11) {
        o4 o4Var = (o4) this.f15525b;
        m4 m4Var = o4Var.G;
        if (m4Var != null) {
            a aVar = o4Var.f15111a;
            h2 h2Var = ((s3) m4Var).f15501a.H3;
            if (h2Var != null) {
                h2Var.f(i10, i11);
            }
        }
    }

    public String M(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            la.d dVar = (la.d) this.f15525b;
            la.e eVar = new la.e(stringWriter, dVar.f15987a, dVar.f15988b, dVar.f15989c, dVar.d);
            eVar.h(obj);
            eVar.j();
            eVar.f15991b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override
    public void N() {
        o4 o4Var = (o4) this.f15525b;
        m4 m4Var = o4Var.G;
        if (m4Var != null) {
            a aVar = o4Var.f15111a;
            w3 w3Var = ((s3) m4Var).f15501a;
            h2 h2Var = w3Var.H3;
            if (h2Var != null) {
                h2Var.g();
            }
            w3Var.f15592f3.onContentChanged();
        }
    }

    @Override
    public boolean O(int i10) {
        switch (this.f15524a) {
            case 18:
                if (i10 == ((br0) this.f15525b).f25019r) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public void R(boolean z10) {
        of0 of0Var = (of0) this.f15525b;
        of0Var.getClass();
        nf0 nf0Var = of0Var.f29039a;
        if (nf0Var != null) {
            ((zr0) nf0Var).a(z10);
        }
    }

    @Override
    public void S(ArrayList arrayList) {
        int i10 = this.f15524a;
    }

    @Override
    public void U(float f7) {
        rg.w0 w0Var = (rg.w0) this.f15525b;
        qg.v0.e(w0Var.f45682a).k("-1", f7);
        w0Var.e.setBrushSize(f7);
    }

    @Override
    public void W() {
        nf0 nf0Var = ((of0) this.f15525b).f29039a;
        if (nf0Var != null) {
            PhotoViewer photoViewer = ((zr0) nf0Var).f43801a;
            if (photoViewer.f33266c2 == 1) {
                photoViewer.H2 = true;
                photoViewer.s3();
            }
        }
    }

    @Override
    public void X() {
        o4 o4Var = (o4) this.f15525b;
        m4 m4Var = o4Var.G;
        if (m4Var != null) {
            a aVar = o4Var.f15111a;
            w3.P1(((s3) m4Var).f15501a);
        }
    }

    public void Y(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.f15525b;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }

    public void Z() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f15525b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        int size = arrayDeque.size();
        long b02 = b0();
        throw new IOException("data item not completed, stackSize: " + size + " scope: " + b02);
    }

    @Override
    public void a(long j10, int i10, int i11, int i12) {
        ((MediaCodec) this.f15525b).queueInputBuffer(i10, 0, i11, j10, i12);
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
        switch (this.f15524a) {
            case 21:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                p6.a aVar = (p6.a) ((p6.c) obj).u();
                Parcel H0 = aVar.H0();
                k7.a.c(H0, (n6.o) this.f15525b);
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
                k7.a.c(H02, (s6.a) this.f15525b);
                H02.writeStrongBinder(null);
                eVar.I0(H02, 2);
                return;
        }
    }

    @Override
    public void b(int i10, h2.d dVar, long j10, int i11) {
        ((MediaCodec) this.f15525b).queueSecureInputBuffer(i10, 0, dVar.f11630i, j10, i11);
    }

    public long b0() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f15525b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override
    public void c(h1 h1Var) {
        m4 m4Var = ((o4) this.f15525b).G;
        if (m4Var != null) {
            w3 w3Var = ((s3) m4Var).f15501a;
            w3.N1(w3Var, h1Var);
            w3Var.f15592f3.o(h1Var, true);
        }
    }

    @Override
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f15525b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override
    public void d(l.k kVar, MenuItem menuItem) {
        ((l.e) this.f15525b).f15735f.removeCallbacksAndMessages(kVar);
    }

    @Override
    public k4.d e(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        long min;
        k4.d dVar;
        y2.o oVar = (y2.o) iVar;
        l2.h hVar = (l2.h) this.f15525b;
        long j12 = oVar.f49937a;
        g2.m mVar = oVar.f49938b;
        g2.b0 b0Var = oVar.d;
        u2.u uVar = new u2.u(mVar, b0Var.f10764c, b0Var.d, j10, j11, b0Var.f10763b);
        int i11 = oVar.f49939c;
        hVar.f15849m.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof b2.w0) || (th2 instanceof FileNotFoundException) || (th2 instanceof g2.u) || (th2 instanceof y2.k) || ((th2 instanceof g2.j) && ((g2.j) th2).f10781a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i10 - 1) * 1000, 5000);
        if (min == -9223372036854775807L) {
            dVar = y2.l.f49933f;
        } else {
            dVar = new k4.d(0, min, false);
        }
        hVar.f15853q.t(uVar, i11, iOException, !dVar.a());
        return dVar;
    }

    @Override
    public void f(int i10) {
        switch (this.f15524a) {
            case 18:
                br0 br0Var = (br0) this.f15525b;
                fr0 fr0Var = br0Var.K;
                br0Var.f25020s = i10;
                if (br0Var.v != i10) {
                    br0Var.d.clear();
                }
                int i11 = br0Var.J;
                if (br0Var.h() == 0 && !br0Var.e.e() && !br0Var.I) {
                    fr0Var.R.e(false, true);
                } else {
                    fr0Var.f26399y0.b(i11);
                }
                br0Var.l();
                int i12 = fr0.f26365b1;
                fr0Var.M0(true);
                return;
            default:
                r9 r9Var = (r9) this.f15525b;
                if (!r9Var.f34819n && i10 == r9Var.I) {
                    r9Var.e0(r9Var.M.getText().toString().trim());
                    return;
                }
                return;
        }
    }

    @Override
    public void g() {
        o4 o4Var = (o4) this.f15525b;
        m4 m4Var = o4Var.G;
        if (m4Var != null) {
            w3.Q1(((s3) m4Var).f15501a, o4Var.f15111a);
        }
    }

    @Override
    public Object mo27get() {
        return new m.g3((Context) ((n5.c) this.f15525b).f17151a, new rb.b(24), new pb.a(24), 3);
    }

    @Override
    public void h(y2.i iVar, long j10, long j11, int i10) {
        u2.u uVar;
        y2.o oVar = (y2.o) iVar;
        l2.h hVar = (l2.h) this.f15525b;
        if (i10 == 0) {
            long j12 = oVar.f49937a;
            uVar = new u2.u(oVar.f49938b, j10);
        } else {
            long j13 = oVar.f49937a;
            g2.m mVar = oVar.f49938b;
            g2.b0 b0Var = oVar.d;
            uVar = new u2.u(mVar, b0Var.f10764c, b0Var.d, j10, j11, b0Var.f10763b);
        }
        hVar.f15853q.v(uVar, oVar.f49939c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override
    public void invalidate() {
        ((org.telegram.ui.Cells.u1) ((org.telegram.ui.Cells.h1) this.f15525b).f22327b).invalidate();
    }

    @Override
    public int j(View view) {
        return s4.n0.z(view) - ((ViewGroup.MarginLayoutParams) ((s4.o0) view.getLayoutParams())).topMargin;
    }

    @Override
    public void k(y2.i iVar, long j10, long j11) {
        int size;
        long j12;
        y2.o oVar = (y2.o) iVar;
        l2.h hVar = (l2.h) this.f15525b;
        long j13 = oVar.f49937a;
        g2.m mVar = oVar.f49938b;
        g2.b0 b0Var = oVar.d;
        u2.u uVar = new u2.u(mVar, b0Var.f10764c, b0Var.d, j10, j11, b0Var.f10763b);
        hVar.f15849m.getClass();
        hVar.f15853q.r(uVar, oVar.f49939c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        m2.c cVar = (m2.c) oVar.f49940f;
        m2.c cVar2 = hVar.G;
        if (cVar2 == null) {
            size = 0;
        } else {
            size = cVar2.f16424m.size();
        }
        long j14 = cVar.b(0).f16441b;
        int i10 = 0;
        while (i10 < size && hVar.G.b(i10).f16441b < j14) {
            i10++;
        }
        if (cVar.d) {
            if (size - i10 > cVar.f16424m.size()) {
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
            if (i11 < hVar.f15849m.y3(oVar.f49939c)) {
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
        synchronized (hVar.f15856t) {
            try {
                if (oVar.f49938b.f10791a.equals(hVar.E)) {
                    Uri uri = hVar.G.f16422k;
                    if (uri == null) {
                        uri = u8.a(oVar.d.f10764c);
                    }
                    hVar.E = uri;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m2.c cVar3 = hVar.G;
        if (cVar3.d && hVar.K == j12) {
            m2.t tVar = cVar3.f16420i;
            if (tVar != null) {
                String str = tVar.f16469b;
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
                    hVar.K = e2.m0.V(tVar.f16470c) - hVar.J;
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
    public int l() {
        return ((s4.n0) this.f15525b).G();
    }

    @Override
    public void o(Object obj) {
        ((g8.c) obj).onLocationAvailability((LocationAvailability) this.f15525b);
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        el0 el0Var = (el0) this.f15525b;
        if (z10 && el0Var.f25927n.n() >= 0) {
            el0Var.f25930w = true;
        }
        bh0 bh0Var = el0Var.f25926f;
        rc0 rc0Var = el0Var.f25931x;
        bh0Var.a(z10, true);
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
        l.e eVar = (l.e) this.f15525b;
        Handler handler = eVar.f15735f;
        l.d dVar = null;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = eVar.f15736n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (kVar == ((l.d) arrayList.get(i10)).f15730b) {
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
    public int r() {
        s4.n0 n0Var = (s4.n0) this.f15525b;
        return n0Var.f46022n - n0Var.C();
    }

    public void s() {
        qg.d1 d1Var = ((qg.f1) this.f15525b).d;
        if (d1Var != null) {
            qg.c1 c1Var = d1Var.f44496s;
            if (c1Var != null) {
                d1Var.cancelRunnable(c1Var);
                d1Var.f44496s = null;
            }
            qg.c1 c1Var2 = new qg.c1(d1Var, 1);
            d1Var.f44496s = c1Var2;
            d1Var.postRunnable(c1Var2, 1L);
        }
    }

    @Override
    public void setParameters(Bundle bundle) {
        ((MediaCodec) this.f15525b).setParameters(bundle);
    }

    @Override
    public Paint.FontMetricsInt t() {
        return ((ti) this.f15525b).H0.getEditText().getPaint().getFontMetricsInt();
    }

    @Override
    public Cursor u(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f15525b;
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
    public void v() {
        nf0 nf0Var = ((of0) this.f15525b).f29039a;
        if (nf0Var != null) {
            ((zr0) nf0Var).f43801a.f33282e0.invalidate();
        }
    }

    @Override
    public n9 w() {
        m4 m4Var = ((o4) this.f15525b).G;
        if (m4Var != null) {
            return ((s3) m4Var).f15501a.getTextSelectionHelper();
        }
        return null;
    }

    @Override
    public View x(int i10) {
        return ((s4.n0) this.f15525b).q(i10);
    }

    @Override
    public a0.h y() {
        switch (this.f15524a) {
            case 18:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void z(CharSequence charSequence) {
        m4 m4Var = ((o4) this.f15525b).G;
        if (m4Var != null) {
            s3 s3Var = (s3) m4Var;
            s3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                s3Var.f15501a.u4(charSequence.toString());
            }
        }
    }

    public t1(s6.g gVar, s6.a aVar) {
        this.f15524a = 29;
        this.f15525b = aVar;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public t1(int i10) {
        this.f15524a = i10;
        switch (i10) {
            case 10:
                this.f15525b = new o2.d(1.0f, 5, 0, false);
                return;
            case 15:
                return;
            default:
                this.f15525b = new ArrayDeque(16);
                return;
        }
    }

    public t1(int i10, int i11, int[] iArr) {
        this.f15524a = 12;
        t60[] t60VarArr = new t60[(iArr.length / 2) + 1];
        this.f15525b = t60VarArr;
        t60 t60Var = new t60(i10, i11);
        int i12 = 0;
        t60VarArr[0] = t60Var;
        while (i12 < iArr.length / 2) {
            int i13 = i12 + 1;
            int i14 = i12 * 2;
            ((t60[]) this.f15525b)[i13] = new t60(iArr[i14], iArr[i14 + 1]);
            i12 = i13;
        }
    }

    @Override
    public float get() {
        rg.w0 w0Var = (rg.w0) this.f15525b;
        int i10 = w0Var.f45682a;
        qg.m currentBrush = w0Var.e.getCurrentBrush();
        if (currentBrush == null) {
            return qg.v0.e(i10).f44685i;
        }
        return qg.v0.e(i10).f("-1", currentBrush.d());
    }

    public t1(ArrayList arrayList) {
        this.f15524a = 26;
        this.f15525b = DesugarCollections.unmodifiableList(arrayList);
    }

    public t1(Context context, Uri uri) {
        this.f15524a = 9;
        this.f15525b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    private final void T(ArrayList arrayList) {
    }

    private final void V(ArrayList arrayList) {
    }

    @Override
    public void L(String str) {
    }

    @Override
    public void flush() {
    }

    @Override
    public void m(int i10) {
    }

    @Override
    public void n() {
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
    public void q(int i10) {
    }

    @Override
    public void shutdown() {
    }

    @Override
    public void start() {
    }

    @Override
    public void onError(c81 c81Var, Exception exc) {
    }

    @Override
    public void A(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override
    public void i(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
