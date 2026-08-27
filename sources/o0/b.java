package o0;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import com.google.android.exoplayer2.upstream.w;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.tasks.TaskCompletionSource;
import h7.w6;
import j4.c1;
import j4.j1;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import n2.v;
import nh.j4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.b61;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.m50;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.sf0;
import org.telegram.ui.Components.x4;
import org.telegram.ui.Components.x90;
import org.telegram.ui.ni0;
import org.telegram.ui.rx;
import pf.h1;
import pf.i1;
import r0.m1;
import r0.o;
import r5.r;
import r5.t;
import rh.b2;
import rh.d1;
import rh.g5;
import rh.p;
import rh.p3;
import rh.w2;
import rh.x1;
import yf.r0;
import zf.v0;
import zf.v1;

public final class b implements a, c1, oa.m, b61, x4, x90, o, p5.a, i1, s, rh.c1, ud.b, v1 {

    public final int f19087a;

    public Object f19088b;

    public b(Object obj, int i10) {
        this.f19087a = i10;
        this.f19088b = obj;
    }

    public static float[] f(ArrayList arrayList) {
        double d;
        double d10;
        float f10;
        double[] dArr;
        ArrayList arrayList2;
        float f11;
        int i10;
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
            f10 = 255.0f;
            dArr = null;
        } else {
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size2, 3);
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
                float f12 = pointF3.x;
                double d14 = d12;
                float f13 = pointF2.x;
                double d15 = f12 - f13;
                dArr5[0] = d15 / 6.0d;
                float f14 = pointF4.x;
                dArr5[1] = ((double) (f14 - f13)) / 3.0d;
                double d16 = f14 - f12;
                dArr5[2] = d16 / 6.0d;
                float f15 = pointF4.y;
                float f16 = pointF3.y;
                dArr3[i12] = (((double) (f15 - f16)) / d16) - (((double) (f16 - pointF2.y)) / d15);
                i12 = i13;
                d11 = d13;
                d12 = d14;
            }
            d = d11;
            double d17 = d12;
            d10 = 6.0d;
            f10 = 255.0f;
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
            f11 = 0.0f;
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
                        float f19 = pointF5.x;
                        PointF pointF7 = pointF5;
                        double d22 = f17 - f19;
                        double d23 = ((double) (f18 - f19)) / d22;
                        double d24 = d - d23;
                        int i22 = length;
                        double[] dArr11 = dArr;
                        float f20 = (float) (((((((d23 * d23) * d23) - d23) * dArr11[i20]) + ((((d24 * d24) * d24) - d24) * dArr11[i19])) * ((d22 * d22) / d10)) + (((double) pointF6.y) * d23) + (((double) pointF7.y) * d24));
                        if (f20 > f10) {
                            f20 = 255.0f;
                        } else if (f20 < 0.0f) {
                            f20 = 0.0f;
                        }
                        arrayList2.add(new PointF(f18, f20));
                        i21++;
                        dArr = dArr11;
                        pointF5 = pointF7;
                        length = i22;
                    }
                }
                i19 = i20;
            }
            f11 = 0.0f;
            arrayList2.add((PointF) i0.a.i(1, arrayList));
        }
        float f21 = ((PointF) arrayList2.get(0)).x;
        if (f21 > f11) {
            for (int i23 = (int) f21; i23 >= 0; i23--) {
                arrayList2.add(0, new PointF(i23, 0.0f));
            }
        }
        float f22 = ((PointF) i0.a.i(1, arrayList2)).x;
        if (f22 < f10) {
            for (int i24 = ((int) f22) + 1; i24 <= 255; i24++) {
                arrayList2.add(new PointF(i24, 255.0f));
            }
        }
        float[] fArr = new float[arrayList2.size()];
        int size3 = arrayList2.size();
        for (int i25 = 0; i25 < size3; i25++) {
            PointF pointF8 = (PointF) arrayList2.get(i25);
            float fSqrt = (float) Math.sqrt(Math.pow(pointF8.x - pointF8.y, 2.0d));
            if (pointF8.x > pointF8.y) {
                fSqrt = -fSqrt;
            }
            fArr[i25] = fSqrt;
        }
        return fArr;
    }

    public static b h(float f10, int i10) {
        Point point = AndroidUtilities.displaySize;
        int i11 = (int) (point.x * f10);
        int i12 = (int) (point.y * f10);
        if (i11 == i12) {
            return new b(i11, i12, new int[0]);
        }
        if (i10 == 3) {
            return new b(i11, i12, new int[]{i12, i11});
        }
        return (i10 == 1) == (i11 < i12) ? new b(i11, i12, new int[0]) : new b(i12, i11, new int[0]);
    }

    @Override
    public void A(float f10, int i10) {
        ((ud.h) this.f19088b).i(f10);
    }

    @Override
    public void B(int i10, int i11) {
        b2 b2Var;
        g5 g5Var = (g5) this.f19088b;
        w2 w2Var = g5Var.A;
        if (w2Var == null || g5Var.f47594a == null || (b2Var = w2Var.f47536a.F3) == null) {
            return;
        }
        b2Var.f(i10, i11);
    }

    @Override
    public boolean D0(int i10) {
        switch (this.f19087a) {
            case 12:
                return i10 == ((cn0) this.f19088b).Z;
            default:
                return true;
        }
    }

    @Override
    public void H(int i10, int i11, CharSequence charSequence, boolean z10) {
        gi giVar = (gi) this.f19088b;
        if (giVar.m1() == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(giVar.m1().getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                Emoji.replaceEmoji(spannableStringBuilder, giVar.m1().getEditText().getPaint().getFontMetricsInt(), false);
            }
            giVar.m1().setText(spannableStringBuilder);
            giVar.m1().setSelection(i10 + charSequence.length());
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        switch (this.f19087a) {
            case 5:
                ((ChatActivityEnterView) this.f19088b).T0(i10, z10, 0, true, 0L);
                break;
            case 16:
                ((p) this.f19088b).I(i10, z10, i11, false, 0L);
                p pVar = (p) this.f19088b;
                ni0 ni0Var = pVar.K;
                if (ni0Var != null) {
                    ni0Var.i();
                    pVar.K = null;
                }
                break;
            default:
                ((x1) this.f19088b).s0(i10, i11, z10);
                break;
        }
    }

    @Override
    public m1 I0(View view, m1 m1Var) {
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        ol0 ol0Var = (ol0) this.f19088b;
        ol0Var.v.setPadding(defaultWindowInsets.f10489a, defaultWindowInsets.f10490b, defaultWindowInsets.f10491c, defaultWindowInsets.d);
        ol0Var.f31355s.requestLayout();
        return m1.f46618b;
    }

    @Override
    public a0.h J() {
        switch (this.f19087a) {
        }
        return null;
    }

    @Override
    public void N1(d1 d1Var, int i10, int i11) {
        w2 w2Var;
        j9 textSelectionHelper;
        g5 g5Var = (g5) this.f19088b;
        if (g5Var.C || i10 == i11 || (w2Var = g5Var.A) == null || (textSelectionHelper = w2Var.f47536a.getTextSelectionHelper()) == null) {
            return;
        }
        if (textSelectionHelper.y() && textSelectionHelper.W == g5Var) {
            return;
        }
        g5Var.post(new j4(this, d1Var, i11, textSelectionHelper, i10, 6));
    }

    @Override
    public boolean T1(boolean z10) {
        return false;
    }

    @Override
    public void V0(ArrayList arrayList) {
        switch (this.f19087a) {
            case 12:
                cn0 cn0Var = (cn0) this.f19088b;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    cn0Var.F.add(((h1) arrayList.get(i10)).f45821a);
                }
                rx rxVar = cn0Var.Q;
                if (rxVar != null) {
                    rxVar.d(cn0Var.f46012z0 > 0, false);
                }
                cn0Var.l();
                break;
        }
    }

    @Override
    public void a(j4.d1 d1Var) {
        o4.l lVar = (o4.l) this.f19088b;
        lVar.C.a(lVar);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        r rVar = new r(0, (TaskCompletionSource) obj2);
        r5.i iVar = (r5.i) ((t) obj).u();
        String[] strArr = (String[]) this.f19088b;
        Parcel parcelM0 = iVar.M0();
        com.google.android.gms.internal.cast.t.d(parcelM0, rVar);
        parcelM0.writeStringArray(strArr);
        iVar.R0(parcelM0, 5);
    }

    public mb.d b(com.google.firebase.messaging.l lVar) throws lb.c, lb.a {
        int iE;
        qb.d dVar;
        qb.b bVar;
        int i10;
        int i11;
        mb.c cVar;
        int i12;
        ArrayList arrayList;
        int iE2;
        qb.e eVarO = lVar.o();
        qb.b bVar2 = lVar.n().f46184a;
        qb.c cVarN = lVar.n();
        qb.e eVarO2 = lVar.o();
        int i13 = m1.j.c(8)[cVarN.f46185b];
        mb.b bVar3 = (mb.b) lVar.f4600b;
        int i14 = bVar3.f17920b;
        for (int i15 = 0; i15 < i14; i15++) {
            for (int i16 = 0; i16 < i14; i16++) {
                if (pa.a(i13, i15, i16)) {
                    bVar3.a(i16, i15);
                }
            }
        }
        int i17 = eVarO2.f46198a * 4;
        int i18 = i17 + 17;
        int i19 = eVarO2.d;
        mb.b bVar4 = new mb.b(i18, i18);
        bVar4.c(0, 0, 9, 9);
        int i20 = i17 + 9;
        bVar4.c(i20, 0, 8, 9);
        bVar4.c(0, i20, 9, 8);
        int[] iArr = eVarO2.f46199b;
        int length = iArr.length;
        for (int i21 = 0; i21 < length; i21++) {
            int i22 = iArr[i21] - 2;
            for (int i23 = 0; i23 < length; i23++) {
                if ((i21 != 0 || (i23 != 0 && i23 != length - 1)) && (i21 != length - 1 || i23 != 0)) {
                    bVar4.c(iArr[i23] - 2, i22, 5, 5);
                }
            }
        }
        int i24 = 6;
        bVar4.c(6, 9, 1, i17);
        bVar4.c(9, 6, i17, 1);
        if (eVarO2.f46198a > 6) {
            int i25 = i17 + 6;
            bVar4.c(i25, 0, 3, 6);
            bVar4.c(0, i25, 6, 3);
        }
        byte[] bArr = new byte[i19];
        int i26 = i14 - 1;
        int i27 = i26;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        boolean z10 = true;
        while (i27 > 0) {
            if (i27 == i24) {
                i27--;
            }
            for (int i31 = 0; i31 < i14; i31++) {
                int i32 = z10 ? i26 - i31 : i31;
                for (int i33 = 0; i33 < 2; i33++) {
                    int i34 = i27 - i33;
                    if (!bVar4.b(i34, i32)) {
                        i29++;
                        i30 <<= 1;
                        if (bVar3.b(i34, i32)) {
                            i30 |= 1;
                        }
                        if (i29 == 8) {
                            bArr[i28] = (byte) i30;
                            i28++;
                            i29 = 0;
                            i30 = 0;
                        }
                    }
                }
            }
            z10 = !z10;
            i27 -= 2;
            i24 = 6;
        }
        if (i28 != i19) {
            throw lb.c.a();
        }
        if (i19 != eVarO.d) {
            throw new IllegalArgumentException();
        }
        v vVar = eVarO.f46200c[bVar2.ordinal()];
        d5.p[] pVarArr = (d5.p[]) vVar.f18187c;
        int i35 = vVar.f18186b;
        int i36 = 0;
        for (d5.p pVar : pVarArr) {
            i36 += pVar.f4821a;
        }
        g9.l[] lVarArr = new g9.l[i36];
        int i37 = 0;
        for (d5.p pVar2 : pVarArr) {
            int i38 = 0;
            while (i38 < pVar2.f4821a) {
                int i39 = pVar2.f4822b;
                lVarArr[i37] = new g9.l(i39, new byte[i35 + i39]);
                i38++;
                i37++;
            }
        }
        int length2 = lVarArr[0].f6821b.length;
        int i40 = i36 - 1;
        while (i40 >= 0 && lVarArr[i40].f6821b.length != length2) {
            i40--;
        }
        int i41 = i40 + 1;
        int i42 = length2 - i35;
        int i43 = 0;
        int i44 = 0;
        while (i43 < i42) {
            int i45 = i44;
            int i46 = 0;
            while (i46 < i37) {
                lVarArr[i46].f6821b[i43] = bArr[i45];
                i46++;
                i45++;
            }
            i43++;
            i44 = i45;
        }
        int i47 = i41;
        while (i47 < i37) {
            lVarArr[i47].f6821b[i42] = bArr[i44];
            i47++;
            i44++;
        }
        boolean z11 = false;
        int length3 = lVarArr[0].f6821b.length;
        while (i42 < length3) {
            int i48 = i44;
            int i49 = 0;
            while (i49 < i37) {
                lVarArr[i49].f6821b[i49 < i41 ? i42 : i42 + 1] = bArr[i48];
                i49++;
                i48++;
            }
            i42++;
            i44 = i48;
        }
        int i50 = 0;
        for (int i51 = 0; i51 < i36; i51++) {
            i50 += lVarArr[i51].f6820a;
        }
        byte[] bArr2 = new byte[i50];
        int i52 = 0;
        int i53 = 0;
        int i54 = 0;
        while (i53 < i36) {
            g9.l lVar2 = lVarArr[i53];
            byte[] bArr3 = lVar2.f6821b;
            int i55 = lVar2.f6820a;
            int length4 = bArr3.length;
            int[] iArr2 = new int[length4];
            for (int i56 = 0; i56 < length4; i56++) {
                iArr2[i56] = bArr3[i56] & 255;
            }
            try {
                int iK = ((n1.d) this.f19088b).K(bArr3.length - i55, iArr2);
                for (int i57 = 0; i57 < i55; i57++) {
                    bArr3[i57] = (byte) iArr2[i57];
                }
                i52 += iK;
                int i58 = i54;
                int i59 = 0;
                while (i59 < i55) {
                    bArr2[i58] = bArr3[i59];
                    i59++;
                    i58++;
                }
                i53++;
                i54 = i58;
            } catch (ob.c unused) {
                lb.a aVar = lb.a.f15506c;
                if (lb.h.f15522a) {
                    throw new lb.a();
                }
                throw lb.a.f15506c;
            }
        }
        char[] cArr = qb.a.f46178a;
        w wVar = new w(bArr2);
        StringBuilder sb2 = new StringBuilder(50);
        ArrayList arrayList2 = new ArrayList(1);
        int iE3 = -1;
        int iE4 = -1;
        boolean z12 = false;
        boolean z13 = false;
        mb.c cVar2 = null;
        while (true) {
            try {
                int iD = wVar.d();
                qb.d dVar2 = qb.d.TERMINATOR;
                if (iD < 4 || (iE = wVar.e(4)) == 0) {
                    dVar = dVar2;
                } else if (iE == 1) {
                    dVar = qb.d.NUMERIC;
                } else if (iE == 2) {
                    dVar = qb.d.ALPHANUMERIC;
                } else if (iE == 3) {
                    dVar = qb.d.STRUCTURED_APPEND;
                } else if (iE == 4) {
                    dVar = qb.d.BYTE;
                } else if (iE == 5) {
                    dVar = qb.d.FNC1_FIRST_POSITION;
                } else if (iE == 7) {
                    dVar = qb.d.ECI;
                } else if (iE == 8) {
                    dVar = qb.d.KANJI;
                } else if (iE == 9) {
                    dVar = qb.d.FNC1_SECOND_POSITION;
                } else {
                    if (iE != 13) {
                        throw new IllegalArgumentException();
                    }
                    dVar = qb.d.HANZI;
                }
                int iOrdinal = dVar.ordinal();
                if (iOrdinal != 0) {
                    bVar = bVar2;
                    if (iOrdinal != 3) {
                        if (iOrdinal == 5) {
                            i10 = i52;
                            i11 = 1;
                            int iE5 = wVar.e(8);
                            if ((iE5 & 128) == 0) {
                                iE2 = iE5 & 127;
                            } else if ((iE5 & 192) == 128) {
                                iE2 = ((iE5 & 63) << 8) | wVar.e(8);
                            } else {
                                if ((iE5 & 224) != 192) {
                                    throw lb.c.a();
                                }
                                iE2 = ((iE5 & 31) << 16) | wVar.e(16);
                            }
                            HashMap map = mb.c.f17922c;
                            if (iE2 < 0 || iE2 >= 900) {
                                throw lb.c.a();
                            }
                            mb.c cVar3 = (mb.c) mb.c.f17922c.get(Integer.valueOf(iE2));
                            if (cVar3 == null) {
                                throw lb.c.a();
                            }
                            cVar = cVar3;
                        } else if (iOrdinal == 7) {
                            i10 = i52;
                            i11 = 1;
                            cVar = cVar2;
                            z12 = true;
                            z11 = true;
                        } else if (iOrdinal == 8) {
                            i10 = i52;
                            i11 = 1;
                            cVar = cVar2;
                            z12 = true;
                            z13 = true;
                        } else if (iOrdinal != 9) {
                            int iE6 = wVar.e(dVar.a(eVarO));
                            int iOrdinal2 = dVar.ordinal();
                            i10 = i52;
                            if (iOrdinal2 == 1) {
                                qb.a.e(wVar, sb2, iE6);
                            } else if (iOrdinal2 == 2) {
                                qb.a.a(wVar, sb2, iE6, z12);
                            } else if (iOrdinal2 == 4) {
                                qb.a.b(wVar, sb2, iE6, cVar2, arrayList2);
                            } else {
                                if (iOrdinal2 != 6) {
                                    throw lb.c.a();
                                }
                                qb.a.d(wVar, sb2, iE6);
                            }
                        } else {
                            i10 = i52;
                            int iE7 = wVar.e(4);
                            int iE8 = wVar.e(dVar.a(eVarO));
                            i11 = 1;
                            if (iE7 == 1) {
                                qb.a.c(wVar, sb2, iE8);
                            }
                        }
                        i12 = iE3;
                        if (dVar == dVar2) {
                            if (cVar != null) {
                                if (z11) {
                                    i11 = 4;
                                } else if (z13) {
                                    i11 = 6;
                                } else {
                                    i11 = 2;
                                }
                            } else if (z11) {
                                i11 = 3;
                            } else if (z13) {
                                i11 = 5;
                            }
                            int i60 = iE4;
                            String string = sb2.toString();
                            if (arrayList2.isEmpty()) {
                                arrayList = null;
                            } else {
                                arrayList = arrayList2;
                            }
                            mb.d dVar3 = new mb.d(bArr2, string, arrayList, bVar.toString(), i12, i60, i11);
                            dVar3.d = Integer.valueOf(i10);
                            return dVar3;
                        }
                        iE3 = i12;
                        bVar2 = bVar;
                        cVar2 = cVar;
                        i52 = i10;
                    } else {
                        i10 = i52;
                        i11 = 1;
                        if (wVar.d() < 16) {
                            throw lb.c.a();
                        }
                        iE3 = wVar.e(8);
                        iE4 = wVar.e(8);
                    }
                    cVar = cVar2;
                    i12 = iE3;
                    if (dVar == dVar2) {
                        if (cVar != null) {
                            if (z11) {
                                i11 = 4;
                            } else if (z13) {
                                i11 = 6;
                            } else {
                                i11 = 2;
                            }
                        } else if (z11) {
                            i11 = 3;
                        } else if (z13) {
                            i11 = 5;
                        }
                        int i61 = iE4;
                        String string2 = sb2.toString();
                        if (arrayList2.isEmpty()) {
                            arrayList = null;
                        } else {
                            arrayList = arrayList2;
                        }
                        mb.d dVar4 = new mb.d(bArr2, string2, arrayList, bVar.toString(), i12, i61, i11);
                        dVar4.d = Integer.valueOf(i10);
                        return dVar4;
                    }
                    iE3 = i12;
                    bVar2 = bVar;
                    cVar2 = cVar;
                    i52 = i10;
                } else {
                    bVar = bVar2;
                    i10 = i52;
                }
                i11 = 1;
                cVar = cVar2;
                i12 = iE3;
                if (dVar == dVar2) {
                    if (cVar != null) {
                        if (z11) {
                            i11 = 4;
                        } else if (z13) {
                            i11 = 6;
                        } else {
                            i11 = 2;
                        }
                    } else if (z11) {
                        i11 = 3;
                    } else if (z13) {
                        i11 = 5;
                    }
                    int i62 = iE4;
                    String string3 = sb2.toString();
                    if (arrayList2.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = arrayList2;
                    }
                    mb.d dVar5 = new mb.d(bArr2, string3, arrayList, bVar.toString(), i12, i62, i11);
                    dVar5.d = Integer.valueOf(i10);
                    return dVar5;
                }
                iE3 = i12;
                bVar2 = bVar;
                cVar2 = cVar;
                i52 = i10;
            } catch (IllegalArgumentException unused2) {
                throw lb.c.a();
            }
        }
    }

    @Override
    public void c0(float f10) {
        v0 v0Var = (v0) this.f19088b;
        r0.e(v0Var.f50723a).k("-1", f10);
        v0Var.f50726e.setBrushSize(f10);
    }

    @Override
    public void close() throws Exception {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f19088b;
        if (contentProviderClient != 0) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                a9.b.g((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }

    @Override
    public Cursor d(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f19088b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e9) {
            Log.w("FontsProvider", "Unable to query the content provider", e9);
            return null;
        }
    }

    @Override
    public boolean f1(d1 d1Var) {
        return false;
    }

    @Override
    public Object f2() {
        Constructor constructor = (Constructor) this.f19088b;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e9) {
            w6 w6Var = ra.c.f46882a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e9);
        } catch (InstantiationException e10) {
            throw new RuntimeException("Failed to invoke constructor '" + ra.c.b(constructor) + "' with no args", e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException("Failed to invoke constructor '" + ra.c.b(constructor) + "' with no args", e11.getCause());
        }
    }

    @Override
    public void g(d1 d1Var) {
        w2 w2Var = ((g5) this.f19088b).A;
        if (w2Var != null) {
            p3 p3Var = w2Var.f47536a;
            p3.M1(p3Var, d1Var);
            p3Var.f47340d3.n0(d1Var, true);
        }
    }

    @Override
    public void g1(CharSequence charSequence) {
        w2 w2Var = ((g5) this.f19088b).A;
        if (w2Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        w2Var.f47536a.t4(charSequence.toString());
    }

    @Override
    public float get() {
        v0 v0Var = (v0) this.f19088b;
        int i10 = v0Var.f50723a;
        yf.m currentBrush = v0Var.f50726e.getCurrentBrush();
        return currentBrush == null ? r0.e(i10).f50060i : r0.e(i10).f("-1", currentBrush.d());
    }

    @Override
    public a0.h h0() {
        switch (this.f19087a) {
        }
        return null;
    }

    @Override
    public void i(int i10) {
        switch (this.f19087a) {
            case 12:
                cn0 cn0Var = (cn0) this.f19088b;
                cn0Var.f46012z0--;
                cn0Var.f45979a0 = i10;
                if (cn0Var.f45980b0 != i10) {
                    cn0Var.f46001s.clear();
                }
                if (cn0Var.f45982c0 != i10) {
                    cn0Var.E.clear();
                }
                cn0Var.J = true;
                rx rxVar = cn0Var.Q;
                if (rxVar != null) {
                    rxVar.d(cn0Var.f46012z0 > 0, true);
                }
                cn0Var.l();
                rx rxVar2 = cn0Var.Q;
                if (rxVar2 != null) {
                    rxVar2.c();
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new qf.b(this, 3));
                break;
        }
    }

    @Override
    public void invalidate() {
        switch (this.f19087a) {
            case 3:
                ((s1) ((f1) this.f19088b).f24326b).invalidate();
                break;
            default:
                ((sf0) this.f19088b).h.invalidate();
                break;
        }
    }

    public void j() {
        o4.l lVar = (o4.l) this.f19088b;
        int i10 = lVar.D - 1;
        lVar.D = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (o4.r rVar : lVar.F) {
            rVar.e();
            i11 += rVar.U.f12593a;
        }
        j4.i1[] i1VarArr = new j4.i1[i11];
        int i12 = 0;
        for (o4.r rVar2 : lVar.F) {
            rVar2.e();
            int i13 = rVar2.U.f12593a;
            int i14 = 0;
            while (i14 < i13) {
                rVar2.e();
                i1VarArr[i12] = rVar2.U.a(i14);
                i14++;
                i12++;
            }
        }
        lVar.E = new j1(i1VarArr);
        lVar.C.e(lVar);
    }

    public void l() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f19088b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + p());
    }

    public void m(long j10) throws IOException {
        long jP = p();
        if (jP != j10) {
            if (jP != -1) {
                if (jP != -2) {
                    return;
                } else {
                    jP = -2;
                }
            }
            StringBuilder sbQ = a9.p.q(j10, "expected non-string scope or scope ", " but found ");
            sbQ.append(jP);
            throw new IOException(sbQ.toString());
        }
    }

    @Override
    public boolean n() {
        g5 g5Var = (g5) this.f19088b;
        w2 w2Var = g5Var.A;
        if (w2Var == null || g5Var.f47594a == null) {
            return false;
        }
        return w2Var.f47536a.S4();
    }

    @Override
    public void o(int i10, float f10, float f11, ud.c cVar) {
        ((ud.h) this.f19088b).i(f10);
    }

    @Override
    public boolean o0(d1 d1Var) {
        return false;
    }

    public long p() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f19088b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override
    public void r1(Editable editable) {
        g5 g5Var = (g5) this.f19088b;
        rh.a aVar = g5Var.f47594a;
        if (aVar != null) {
            aVar.f47043s = true;
            aVar.f47042r = g5Var.f47164r.A;
        }
        g5Var.u();
        w2 w2Var = g5Var.A;
        if (w2Var == null || g5Var.f47594a == null) {
            return;
        }
        w2Var.a();
    }

    @Override
    public Paint.FontMetricsInt u() {
        return ((gi) this.f19088b).A0.getEditText().getPaint().getFontMetricsInt();
    }

    @Override
    public void z0(Bitmap bitmap) {
        r5.b bVar = p5.h.v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f10 = width;
            int height = bitmap.getHeight();
            int iD = (int) a9.p.d(f10, 9.0f, 16.0f, 0.5f);
            float f11 = (iD - height) / 2.0f;
            RectF rectF = new RectF(0.0f, f11, f10, height + f11);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, iD, config);
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = bitmapCreateBitmap;
        }
        ((p5.h) this.f19088b).e(bitmap2, 0);
    }

    public b(r5.s sVar, String[] strArr) {
        this.f19087a = 15;
        this.f19088b = strArr;
    }

    public b(int i10) {
        this.f19087a = i10;
        switch (i10) {
            case 13:
                this.f19088b = new n1.d(ob.a.h, 7);
                break;
            case 21:
                this.f19088b = new ArrayDeque(16);
                break;
        }
    }

    public b(int i10, int i11, int[] iArr) {
        this.f19087a = 4;
        m50[] m50VarArr = new m50[(iArr.length / 2) + 1];
        this.f19088b = m50VarArr;
        m50 m50Var = new m50(i10, i11);
        int i12 = 0;
        m50VarArr[0] = m50Var;
        while (i12 < iArr.length / 2) {
            int i13 = i12 + 1;
            int i14 = i12 * 2;
            ((m50[]) this.f19088b)[i13] = new m50(iArr[i14], iArr[i14 + 1]);
            i12 = i13;
        }
    }

    public b(Context context, Uri uri) {
        this.f19087a = 0;
        this.f19088b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    @Override
    public void K0() {
    }

    private final void k(ArrayList arrayList) {
    }

    @Override
    public void K(String str) {
    }

    @Override
    public void w1(d1 d1Var) {
    }

    @Override
    public void c(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }

    @Override
    public void x(TLRPC.TL_document tL_document, String str, Object obj) {
    }
}
