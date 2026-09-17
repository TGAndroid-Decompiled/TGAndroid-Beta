package k2;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import androidx.recyclerview.widget.RecyclerView;
import b2.r0;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.io.EOFException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import m.x0;
import n7.a1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.g1;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.fg0;
import org.telegram.ui.Components.ka0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.y50;
import org.telegram.ui.cu0;
import pg.q1;
import qg.y1;
import r0.l1;
import s4.h1;
public class c0 implements y2.n, x0, n5.b, o0.b, w61, b5, ka0, r0.n, y1, r2.k, com.google.android.gms.common.api.internal.o, h1, com.google.android.gms.common.api.internal.s, s0 {
    public final int f13236a;
    public Object f13237b;

    public c0(int i10) {
        this.f13236a = i10;
    }

    public static float[] j(ArrayList arrayList) {
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
            arrayList2.add((PointF) hg.k0.h(1, arrayList));
        }
        float f20 = ((PointF) arrayList2.get(0)).x;
        if (f20 > f10) {
            for (int i23 = (int) f20; i23 >= 0; i23--) {
                arrayList2.add(0, new PointF(i23, 0.0f));
            }
        }
        float f21 = ((PointF) hg.k0.h(1, arrayList2)).x;
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

    public static c0 m(float f7, int i10) {
        boolean z10;
        Point point = AndroidUtilities.displaySize;
        int i11 = (int) (point.x * f7);
        int i12 = (int) (point.y * f7);
        if (i11 == i12) {
            return new c0(i11, i12, new int[0]);
        }
        if (i10 == 3) {
            return new c0(i11, i12, new int[]{i12, i11});
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
            return new c0(i11, i12, new int[0]);
        }
        return new c0(i12, i11, new int[0]);
    }

    @Override
    public Cursor G(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f13237b;
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
    public p0 H(Class cls, v1.b bVar) {
        androidx.lifecycle.m0 m0Var = null;
        for (v1.c cVar : (v1.c[]) this.f13237b) {
            if (cVar.f43847a.equals(cls)) {
                m0Var = new androidx.lifecycle.m0();
            }
        }
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    @Override
    public View I(int i10) {
        return ((s4.o0) this.f13237b).q(i10);
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        ((ChatActivityEnterView) this.f13237b).T0(i10, z10, 0, true, 0L);
    }

    @Override
    public void L(int i10, int i11, CharSequence charSequence, boolean z10) {
        vi viVar = (vi) this.f13237b;
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
    public int N(View view) {
        return s4.o0.v(view) + ((ViewGroup.MarginLayoutParams) ((s4.p0) view.getLayoutParams())).bottomMargin;
    }

    @Override
    public l1 Q0(View view, l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        bm0 bm0Var = (bm0) this.f13237b;
        bm0Var.v.setPadding(defaultWindowInsets.f10591a, defaultWindowInsets.f10592b, defaultWindowInsets.f10593c, defaultWindowInsets.d);
        bm0Var.f22771s.requestLayout();
        return l1.f41876b;
    }

    @Override
    public void a() {
        l2.g gVar = (l2.g) this.f13237b;
        gVar.A.a();
        com.google.android.gms.internal.cast.b5 b5Var = gVar.C;
        if (b5Var == null) {
            return;
        }
        throw b5Var;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        s6.f fVar = new s6.f(1, (TaskCompletionSource) obj2);
        s6.e eVar = (s6.e) ((s6.h) obj).u();
        Parcel I0 = eVar.I0();
        k7.a.d(I0, fVar);
        k7.a.c(I0, (s6.a) this.f13237b);
        I0.writeStrongBinder(null);
        eVar.J0(I0, 2);
    }

    @Override
    public p0 b(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override
    public void c(Object obj) {
        ((g8.c) obj).onLocationResult((LocationResult) this.f13237b);
    }

    @Override
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f13237b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override
    public int d(View view) {
        return s4.o0.z(view) - ((ViewGroup.MarginLayoutParams) ((s4.p0) view.getLayoutParams())).topMargin;
    }

    @Override
    public Object mo28get() {
        return new lf.i((Context) ((a9.r) this.f13237b).f353a, new rb.a(23), new qb.b(23), 4);
    }

    public void h(int i10, int i11, c3.p pVar) {
        char c10;
        char c11;
        long j3;
        int i12;
        int i13;
        int i14;
        int i15;
        byte[] bArr;
        int i16;
        u3.d dVar = (u3.d) this.f13237b;
        u3.e eVar = dVar.f43599b;
        SparseArray sparseArray = dVar.f43601c;
        e2.v vVar = dVar.f43609k;
        e2.v vVar2 = dVar.f43607i;
        int i17 = 1;
        int i18 = 0;
        if (i10 != 161 && i10 != 163) {
            if (i10 != 165) {
                if (i10 != 16877) {
                    if (i10 != 16981) {
                        if (i10 != 18402) {
                            if (i10 != 21419) {
                                if (i10 != 25506) {
                                    if (i10 == 30322) {
                                        dVar.d(i10);
                                        byte[] bArr2 = new byte[i11];
                                        dVar.f43621x.f43588x = bArr2;
                                        pVar.readFully(bArr2, 0, i11);
                                        return;
                                    }
                                    throw b2.s0.a(null, "Unexpected id: " + i10);
                                }
                                dVar.d(i10);
                                byte[] bArr3 = new byte[i11];
                                dVar.f43621x.f43577l = bArr3;
                                pVar.readFully(bArr3, 0, i11);
                                return;
                            }
                            Arrays.fill(vVar.f7934a, (byte) 0);
                            pVar.readFully(vVar.f7934a, 4 - i11, i11);
                            vVar.J(0);
                            dVar.f43623z = (int) vVar.z();
                            return;
                        }
                        byte[] bArr4 = new byte[i11];
                        pVar.readFully(bArr4, 0, i11);
                        dVar.d(i10);
                        dVar.f43621x.f43576k = new c3.g0(1, 0, 0, bArr4);
                        return;
                    }
                    dVar.d(i10);
                    byte[] bArr5 = new byte[i11];
                    dVar.f43621x.f43575j = bArr5;
                    pVar.readFully(bArr5, 0, i11);
                    return;
                }
                dVar.d(i10);
                u3.c cVar = dVar.f43621x;
                int i19 = cVar.h;
                if (i19 != 1685485123 && i19 != 1685480259) {
                    pVar.q(i11);
                    return;
                }
                byte[] bArr6 = new byte[i11];
                cVar.P = bArr6;
                pVar.readFully(bArr6, 0, i11);
                return;
            } else if (dVar.J == 2) {
                u3.c cVar2 = (u3.c) sparseArray.get(dVar.P);
                int i20 = dVar.S;
                e2.v vVar3 = dVar.f43614p;
                if (i20 == 4 && "V_VP9".equals(cVar2.f43571c)) {
                    vVar3.G(i11);
                    pVar.readFully(vVar3.f7934a, 0, i11);
                    return;
                }
                pVar.q(i11);
                return;
            } else {
                return;
            }
        }
        if (dVar.J == 0) {
            dVar.P = (int) eVar.b(pVar, false, true, 8);
            dVar.Q = eVar.f43626c;
            dVar.L = -9223372036854775807L;
            dVar.J = 1;
            vVar2.G(0);
        }
        u3.c cVar3 = (u3.c) sparseArray.get(dVar.P);
        if (cVar3 == null) {
            pVar.q(i11 - dVar.Q);
            dVar.J = 0;
            return;
        }
        cVar3.Z.getClass();
        if (dVar.J == 1) {
            dVar.j(pVar, 3);
            int i21 = (vVar2.f7934a[2] & 6) >> 1;
            byte b10 = 255;
            if (i21 == 0) {
                dVar.N = 1;
                int[] iArr = dVar.O;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                dVar.O = iArr;
                iArr[0] = (i11 - dVar.Q) - 3;
            } else {
                dVar.j(pVar, 4);
                int i22 = (vVar2.f7934a[3] & 255) + 1;
                dVar.N = i22;
                int[] iArr2 = dVar.O;
                if (iArr2 == null) {
                    iArr2 = new int[i22];
                } else if (iArr2.length < i22) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i22)];
                }
                dVar.O = iArr2;
                if (i21 == 2) {
                    int i23 = dVar.N;
                    Arrays.fill(iArr2, 0, i23, ((i11 - dVar.Q) - 4) / i23);
                } else if (i21 == 1) {
                    int i24 = 0;
                    int i25 = 0;
                    int i26 = 4;
                    while (true) {
                        i13 = dVar.N - 1;
                        if (i24 >= i13) {
                            break;
                        }
                        dVar.O[i24] = 0;
                        while (true) {
                            i14 = i26 + 1;
                            dVar.j(pVar, i14);
                            int i27 = vVar2.f7934a[i26] & 255;
                            int[] iArr3 = dVar.O;
                            i15 = iArr3[i24] + i27;
                            iArr3[i24] = i15;
                            if (i27 != 255) {
                                break;
                            }
                            i26 = i14;
                        }
                        i25 += i15;
                        i24++;
                        i26 = i14;
                    }
                    dVar.O[i13] = ((i11 - dVar.Q) - i26) - i25;
                } else if (i21 == 3) {
                    int i28 = 0;
                    int i29 = 0;
                    int i30 = 4;
                    while (true) {
                        int i31 = dVar.N - i17;
                        if (i28 < i31) {
                            dVar.O[i28] = i18;
                            int i32 = i30 + 1;
                            dVar.j(pVar, i32);
                            if (vVar2.f7934a[i30] != 0) {
                                int i33 = 0;
                                while (true) {
                                    if (i33 < 8) {
                                        int i34 = 1 << (7 - i33);
                                        if ((vVar2.f7934a[i30] & i34) != 0) {
                                            i12 = i32 + i33;
                                            dVar.j(pVar, i12);
                                            j3 = vVar2.f7934a[i30] & b10 & (~i34);
                                            while (i32 < i12) {
                                                j3 = (j3 << 8) | (vVar2.f7934a[i32] & b10);
                                                i32++;
                                                b10 = 255;
                                            }
                                            if (i28 > 0) {
                                                j3 -= (1 << ((i33 * 7) + 6)) - 1;
                                            }
                                        } else {
                                            i33++;
                                            b10 = 255;
                                        }
                                    } else {
                                        j3 = 0;
                                        i12 = i32;
                                        break;
                                    }
                                }
                                if (j3 < -2147483648L || j3 > 2147483647L) {
                                    break;
                                }
                                int i35 = (int) j3;
                                int[] iArr4 = dVar.O;
                                if (i28 != 0) {
                                    i35 += iArr4[i28 - 1];
                                }
                                iArr4[i28] = i35;
                                i29 += i35;
                                i28++;
                                i30 = i12;
                                b10 = 255;
                                i17 = 1;
                                i18 = 0;
                            } else {
                                throw b2.s0.a(null, "No valid varint length mask found");
                            }
                        } else {
                            c10 = 1;
                            c11 = 0;
                            dVar.O[i31] = ((i11 - dVar.Q) - i30) - i29;
                            break;
                        }
                    }
                    throw b2.s0.a(null, "EBML lacing sample size out of range.");
                } else {
                    throw b2.s0.a(null, "Unexpected lacing value: " + i21);
                }
            }
            c10 = 1;
            c11 = 0;
            int i36 = vVar2.f7934a[c10] & 255;
            dVar.K = dVar.l(i36 | (bArr[c11] << 8)) + dVar.E;
            if (cVar3.e != 2 && (i10 != 163 || (vVar2.f7934a[2] & 128) != 128)) {
                i16 = 0;
            } else {
                i16 = 1;
            }
            dVar.R = i16;
            dVar.J = 2;
            dVar.M = 0;
        }
        if (i10 == 163) {
            while (true) {
                int i37 = dVar.M;
                if (i37 < dVar.N) {
                    dVar.e(cVar3, ((dVar.M * cVar3.f43572f) / 1000) + dVar.K, dVar.R, dVar.n(pVar, cVar3, dVar.O[i37], false), 0);
                    dVar.M++;
                } else {
                    dVar.J = 0;
                    return;
                }
            }
        } else {
            while (true) {
                int i38 = dVar.M;
                if (i38 < dVar.N) {
                    int[] iArr5 = dVar.O;
                    iArr5[i38] = dVar.n(pVar, cVar3, iArr5[i38], true);
                    dVar.M++;
                } else {
                    return;
                }
            }
        }
    }

    public p4.r i() {
        if (((ArrayList) this.f13237b) == null) {
            return p4.r.f40664c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", (ArrayList) this.f13237b);
        return new p4.r(bundle, (ArrayList) this.f13237b);
    }

    @Override
    public void invalidate() {
        switch (this.f13236a) {
            case 9:
                ((t1) ((g1) this.f13237b).f20138b).invalidate();
                return;
            default:
                ((fg0) this.f13237b).h.invalidate();
                return;
        }
    }

    public void k(int i10, long j3) {
        u3.d dVar = (u3.d) this.f13237b;
        if (i10 != 20529) {
            if (i10 != 20530) {
                boolean z10 = false;
                switch (i10) {
                    case 131:
                        dVar.d(i10);
                        dVar.f43621x.e = (int) j3;
                        return;
                    case 136:
                        dVar.d(i10);
                        u3.c cVar = dVar.f43621x;
                        if (j3 == 1) {
                            z10 = true;
                        }
                        cVar.X = z10;
                        return;
                    case 155:
                        dVar.L = dVar.l(j3);
                        return;
                    case 159:
                        dVar.d(i10);
                        dVar.f43621x.Q = (int) j3;
                        return;
                    case 176:
                        dVar.d(i10);
                        dVar.f43621x.f43579n = (int) j3;
                        return;
                    case 179:
                        dVar.b(i10);
                        dVar.F.b(dVar.l(j3));
                        return;
                    case 186:
                        dVar.d(i10);
                        dVar.f43621x.f43580o = (int) j3;
                        return;
                    case 215:
                        dVar.d(i10);
                        dVar.f43621x.d = (int) j3;
                        return;
                    case 231:
                        dVar.E = dVar.l(j3);
                        return;
                    case 238:
                        dVar.S = (int) j3;
                        return;
                    case 241:
                        if (!dVar.H) {
                            dVar.b(i10);
                            dVar.G.b(j3);
                            dVar.H = true;
                            return;
                        }
                        return;
                    case 251:
                        dVar.T = true;
                        return;
                    case 16871:
                        dVar.d(i10);
                        dVar.f43621x.h = (int) j3;
                        return;
                    case 16980:
                        if (j3 != 3) {
                            throw b2.s0.a(null, "ContentCompAlgo " + j3 + " not supported");
                        }
                        return;
                    case 17029:
                        if (j3 < 1 || j3 > 2) {
                            throw b2.s0.a(null, "DocTypeReadVersion " + j3 + " not supported");
                        }
                        return;
                    case 17143:
                        if (j3 != 1) {
                            throw b2.s0.a(null, "EBMLReadVersion " + j3 + " not supported");
                        }
                        return;
                    case 18401:
                        if (j3 != 5) {
                            throw b2.s0.a(null, "ContentEncAlgo " + j3 + " not supported");
                        }
                        return;
                    case 18408:
                        if (j3 != 1) {
                            throw b2.s0.a(null, "AESSettingsCipherMode " + j3 + " not supported");
                        }
                        return;
                    case 21420:
                        dVar.A = j3 + dVar.f43617s;
                        return;
                    case 21432:
                        int i11 = (int) j3;
                        dVar.d(i10);
                        if (i11 != 0) {
                            if (i11 != 1) {
                                if (i11 != 3) {
                                    if (i11 == 15) {
                                        dVar.f43621x.f43589y = 3;
                                        return;
                                    }
                                    return;
                                }
                                dVar.f43621x.f43589y = 1;
                                return;
                            }
                            dVar.f43621x.f43589y = 2;
                            return;
                        }
                        dVar.f43621x.f43589y = 0;
                        return;
                    case 21680:
                        dVar.d(i10);
                        dVar.f43621x.f43582q = (int) j3;
                        return;
                    case 21682:
                        dVar.d(i10);
                        dVar.f43621x.f43584s = (int) j3;
                        return;
                    case 21690:
                        dVar.d(i10);
                        dVar.f43621x.f43583r = (int) j3;
                        return;
                    case 21930:
                        dVar.d(i10);
                        u3.c cVar2 = dVar.f43621x;
                        if (j3 == 1) {
                            z10 = true;
                        }
                        cVar2.W = z10;
                        return;
                    case 21938:
                        dVar.d(i10);
                        u3.c cVar3 = dVar.f43621x;
                        cVar3.f43590z = true;
                        cVar3.f43581p = (int) j3;
                        return;
                    case 21998:
                        dVar.d(i10);
                        dVar.f43621x.f43573g = (int) j3;
                        return;
                    case 22186:
                        dVar.d(i10);
                        dVar.f43621x.T = j3;
                        return;
                    case 22203:
                        dVar.d(i10);
                        dVar.f43621x.U = j3;
                        return;
                    case 25188:
                        dVar.d(i10);
                        dVar.f43621x.R = (int) j3;
                        return;
                    case 30114:
                        dVar.U = j3;
                        return;
                    case 30321:
                        dVar.d(i10);
                        int i12 = (int) j3;
                        if (i12 != 0) {
                            if (i12 != 1) {
                                if (i12 != 2) {
                                    if (i12 == 3) {
                                        dVar.f43621x.f43585t = 3;
                                        return;
                                    }
                                    return;
                                }
                                dVar.f43621x.f43585t = 2;
                                return;
                            }
                            dVar.f43621x.f43585t = 1;
                            return;
                        }
                        dVar.f43621x.f43585t = 0;
                        return;
                    case 2352003:
                        dVar.d(i10);
                        dVar.f43621x.f43572f = (int) j3;
                        return;
                    case 2807729:
                        dVar.f43618t = j3;
                        return;
                    default:
                        switch (i10) {
                            case 21945:
                                dVar.d(i10);
                                int i13 = (int) j3;
                                if (i13 != 1) {
                                    if (i13 == 2) {
                                        dVar.f43621x.C = 1;
                                        return;
                                    }
                                    return;
                                }
                                dVar.f43621x.C = 2;
                                return;
                            case 21946:
                                dVar.d(i10);
                                int g10 = b2.j.g((int) j3);
                                if (g10 != -1) {
                                    dVar.f43621x.B = g10;
                                    return;
                                }
                                return;
                            case 21947:
                                dVar.d(i10);
                                dVar.f43621x.f43590z = true;
                                int f7 = b2.j.f((int) j3);
                                if (f7 != -1) {
                                    dVar.f43621x.A = f7;
                                    return;
                                }
                                return;
                            case 21948:
                                dVar.d(i10);
                                dVar.f43621x.D = (int) j3;
                                return;
                            case 21949:
                                dVar.d(i10);
                                dVar.f43621x.E = (int) j3;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j3 != 1) {
                throw b2.s0.a(null, "ContentEncodingScope " + j3 + " not supported");
            }
        } else if (j3 == 0) {
        } else {
            throw b2.s0.a(null, "ContentEncodingOrder " + j3 + " not supported");
        }
    }

    @Override
    public void l(float f7) {
        cu0 cu0Var = (cu0) this.f13237b;
        pg.s0.e(cu0Var.P1).k(String.valueOf(pg.m.f40934a.indexOf(cu0Var.W0.getCurrentBrush())), f7);
        q1 q1Var = cu0Var.K1;
        q1Var.f40994c = f7;
        cu0Var.s0(q1Var, null);
    }

    public void n(p4.p pVar, p4.m mVar, Collection collection) {
        p4.e eVar = (p4.e) this.f13237b;
        if (pVar == eVar.f40594y && mVar != null) {
            p4.u uVar = eVar.f40593x.f40685a;
            String d = mVar.d();
            p4.v vVar = new p4.v(uVar, d, eVar.b(uVar, d), false);
            vVar.i(mVar);
            if (eVar.d != vVar) {
                eVar.h(eVar, vVar, eVar.f40594y, 3, eVar.f40593x, collection);
                eVar.f40593x = null;
                eVar.f40594y = null;
            }
        } else if (pVar == eVar.e) {
            if (mVar != null) {
                eVar.n(eVar.d, mVar);
            }
            eVar.d.n(collection);
        }
    }

    public byte o() {
        int read = ((com.google.firebase.messaging.d) this.f13237b).read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    public int p() {
        return ((o() & 255) << 24) | ((o() & 255) << 16) | ((o() & 255) << 8) | (o() & 255);
    }

    public int q() {
        return ((o() & Byte.MAX_VALUE) << 21) | ((o() & Byte.MAX_VALUE) << 14) | ((o() & Byte.MAX_VALUE) << 7) | (o() & Byte.MAX_VALUE);
    }

    public void r(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.f13237b;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            recyclerView.s(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }

    public void s(long j3) {
        long j10 = 0;
        while (j10 < j3) {
            long skip = ((com.google.firebase.messaging.d) this.f13237b).skip(j3 - j10);
            if (skip > 0) {
                j10 += skip;
            } else {
                throw new EOFException();
            }
        }
    }

    public String toString() {
        switch (this.f13236a) {
            case 23:
                re.b bVar = re.b.e;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("method-execution".substring(7));
                stringBuffer.append("(");
                stringBuffer.append(((ra.a) this.f13237b).n());
                stringBuffer.append(")");
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    @Override
    public int u() {
        return ((s4.o0) this.f13237b).G();
    }

    @Override
    public r2.l v(com.google.firebase.messaging.n nVar) {
        Context context;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23 && (i10 >= 31 || ((context = (Context) this.f13237b) != null && i10 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            int h = r0.h(((b2.s) nVar.f7338c).f3309r);
            e2.a.i("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + e2.d0.G(h));
            return new a1(14, new r2.b(h, 0), new r2.b(h, 1)).v(nVar);
        }
        return new rb.a(20).v(nVar);
    }

    @Override
    public Paint.FontMetricsInt w() {
        return ((vi) this.f13237b).E0.getEditText().getPaint().getFontMetricsInt();
    }

    @Override
    public int x() {
        s4.o0 o0Var = (s4.o0) this.f13237b;
        return o0Var.f42799n - o0Var.C();
    }

    public c0(Object obj, int i10) {
        this.f13236a = i10;
        this.f13237b = obj;
    }

    public c0(s6.g gVar, s6.a aVar) {
        this.f13236a = 27;
        this.f13237b = aVar;
    }

    public c0() {
        this.f13236a = 8;
        this.f13237b = new LinkedHashMap(5, 1.0f, false);
    }

    public c0(int i10, int i11, int[] iArr) {
        this.f13236a = 10;
        y50[] y50VarArr = new y50[(iArr.length / 2) + 1];
        this.f13237b = y50VarArr;
        y50 y50Var = new y50(i10, i11);
        int i12 = 0;
        y50VarArr[0] = y50Var;
        while (i12 < iArr.length / 2) {
            int i13 = i12 + 1;
            int i14 = i12 * 2;
            ((y50[]) this.f13237b)[i13] = new y50(iArr[i14], iArr[i14 + 1]);
            i12 = i13;
        }
    }

    @Override
    public float get() {
        cu0 cu0Var = (cu0) this.f13237b;
        int i10 = cu0Var.P1;
        pg.m currentBrush = cu0Var.W0.getCurrentBrush();
        if (currentBrush == null) {
            return pg.s0.e(i10).f41019i;
        }
        return pg.s0.e(i10).f(String.valueOf(pg.m.f40934a.indexOf(currentBrush)), currentBrush.d());
    }

    public c0(v1.c[] initializers) {
        this.f13236a = 29;
        kotlin.jvm.internal.i.e(initializers, "initializers");
        this.f13237b = initializers;
    }

    public c0(ArrayList arrayList) {
        this.f13236a = 24;
        this.f13237b = DesugarCollections.unmodifiableList(arrayList);
    }

    public c0(EditText editText) {
        this.f13236a = 19;
        this.f13237b = new a1(editText);
    }

    public c0(Context context, Uri uri) {
        this.f13236a = 7;
        this.f13237b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    @Override
    public void O(String str) {
    }

    @Override
    public void e(int i10) {
    }

    @Override
    public void g(int i10) {
    }

    @Override
    public void A(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override
    public void f(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }
}
