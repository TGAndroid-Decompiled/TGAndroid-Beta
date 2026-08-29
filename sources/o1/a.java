package o1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.exoplayer2.upstream.l0;
import com.google.android.exoplayer2.upstream.t0;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.internal.cast.a0;
import com.google.android.gms.internal.cast.e1;
import com.google.android.gms.internal.cast.e2;
import com.google.android.gms.internal.cast.u;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import f5.d0;
import i7.c7;
import i7.r7;
import j3.t1;
import j7.l1;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import l4.p;
import m.s3;
import nh.d6;
import o5.y;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.bg0;
import org.telegram.ui.Components.ha0;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.u50;
import org.telegram.ui.Components.voip.w1;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.tn;
import pa.m;
import q5.n;
import qh.n0;
import qh.o0;
import qh.q;
import r0.m1;
import r0.o;
import rf.j1;
import rf.v0;
import s5.r;
import s5.t;
import sf.f1;
import th.b2;
import th.b4;
import th.d1;
import th.d3;
import th.g0;
import th.i3;
import th.j3;
import th.m3;
import th.m4;
import th.n3;
import th.o3;
import th.p3;
import th.t5;
import th.x;
import th.x1;
public final class a implements l0, m61, b5, ha0, o, androidx.activity.result.b, OnSuccessListener, m, s5.o, n0, j1, s, OnCompleteListener, g0, n3, s0 {
    public final int f19013a;
    public Object f19014b;

    public a(Object obj, int i10) {
        this.f19013a = i10;
        this.f19014b = obj;
    }

    public static a F(float f9, int i10) {
        boolean z10;
        Point point = AndroidUtilities.displaySize;
        int i11 = (int) (point.x * f9);
        int i12 = (int) (point.y * f9);
        if (i11 == i12) {
            return new a(i11, i12, new int[0]);
        }
        if (i10 == 3) {
            return new a(i11, i12, new int[]{i12, i11});
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
            return new a(i11, i12, new int[0]);
        }
        return new a(i12, i11, new int[0]);
    }

    public static float[] z(ArrayList arrayList) {
        double d;
        double d10;
        float f9;
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
            f9 = 255.0f;
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
            f9 = 255.0f;
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
                        if (f19 > f9) {
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
            arrayList2.add((PointF) l1.i(1, arrayList));
        }
        float f20 = ((PointF) arrayList2.get(0)).x;
        if (f20 > f10) {
            for (int i23 = (int) f20; i23 >= 0; i23--) {
                arrayList2.add(0, new PointF(i23, 0.0f));
            }
        }
        float f21 = ((PointF) l1.i(1, arrayList2)).x;
        if (f21 < f9) {
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
    public boolean A(int i10) {
        switch (this.f19013a) {
            case 19:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void B(CharSequence charSequence) {
        switch (this.f19013a) {
            case 23:
                j3 j3Var = ((x) this.f19014b).K;
                if (j3Var != null) {
                    j3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        j3Var.f48523a.t4(charSequence.toString());
                        return;
                    }
                    return;
                }
                return;
            default:
                i3 i3Var = ((m4) this.f19014b).J;
                if (i3Var != null) {
                    i3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        i3Var.f48491a.t4(charSequence.toString());
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public void C(int i10, long j10) {
        u3.e eVar = (u3.e) this.f19014b;
        if (i10 != 20529) {
            if (i10 != 20530) {
                boolean z10 = false;
                int i11 = 3;
                switch (i10) {
                    case 131:
                        eVar.b(i10);
                        eVar.f49018u.d = (int) j10;
                        return;
                    case 136:
                        eVar.b(i10);
                        u3.d dVar = eVar.f49018u;
                        if (j10 == 1) {
                            z10 = true;
                        }
                        dVar.V = z10;
                        return;
                    case 155:
                        eVar.I = eVar.k(j10);
                        return;
                    case 159:
                        eVar.b(i10);
                        eVar.f49018u.O = (int) j10;
                        return;
                    case 176:
                        eVar.b(i10);
                        eVar.f49018u.f48979m = (int) j10;
                        return;
                    case 179:
                        eVar.a(i10);
                        eVar.C.c(eVar.k(j10));
                        return;
                    case 186:
                        eVar.b(i10);
                        eVar.f49018u.f48980n = (int) j10;
                        return;
                    case 215:
                        eVar.b(i10);
                        eVar.f49018u.f48971c = (int) j10;
                        return;
                    case 231:
                        eVar.B = eVar.k(j10);
                        return;
                    case 238:
                        eVar.P = (int) j10;
                        return;
                    case 241:
                        if (!eVar.E) {
                            eVar.a(i10);
                            eVar.D.c(j10);
                            eVar.E = true;
                            return;
                        }
                        return;
                    case 251:
                        eVar.Q = true;
                        return;
                    case 16871:
                        eVar.b(i10);
                        eVar.f49018u.f48974g = (int) j10;
                        return;
                    case 16980:
                        if (j10 != 3) {
                            throw t1.a("ContentCompAlgo " + j10 + " not supported", null);
                        }
                        return;
                    case 17029:
                        if (j10 < 1 || j10 > 2) {
                            throw t1.a("DocTypeReadVersion " + j10 + " not supported", null);
                        }
                        return;
                    case 17143:
                        if (j10 != 1) {
                            throw t1.a("EBMLReadVersion " + j10 + " not supported", null);
                        }
                        return;
                    case 18401:
                        if (j10 != 5) {
                            throw t1.a("ContentEncAlgo " + j10 + " not supported", null);
                        }
                        return;
                    case 18408:
                        if (j10 != 1) {
                            throw t1.a("AESSettingsCipherMode " + j10 + " not supported", null);
                        }
                        return;
                    case 21420:
                        eVar.f49020x = j10 + eVar.f49014q;
                        return;
                    case 21432:
                        int i12 = (int) j10;
                        eVar.b(i10);
                        if (i12 != 0) {
                            if (i12 != 1) {
                                if (i12 != 3) {
                                    if (i12 == 15) {
                                        eVar.f49018u.f48988w = 3;
                                        return;
                                    }
                                    return;
                                }
                                eVar.f49018u.f48988w = 1;
                                return;
                            }
                            eVar.f49018u.f48988w = 2;
                            return;
                        }
                        eVar.f49018u.f48988w = 0;
                        return;
                    case 21680:
                        eVar.b(i10);
                        eVar.f49018u.f48981o = (int) j10;
                        return;
                    case 21682:
                        eVar.b(i10);
                        eVar.f49018u.f48983q = (int) j10;
                        return;
                    case 21690:
                        eVar.b(i10);
                        eVar.f49018u.f48982p = (int) j10;
                        return;
                    case 21930:
                        eVar.b(i10);
                        u3.d dVar2 = eVar.f49018u;
                        if (j10 == 1) {
                            z10 = true;
                        }
                        dVar2.U = z10;
                        return;
                    case 21998:
                        eVar.b(i10);
                        eVar.f49018u.f48973f = (int) j10;
                        return;
                    case 22186:
                        eVar.b(i10);
                        eVar.f49018u.R = j10;
                        return;
                    case 22203:
                        eVar.b(i10);
                        eVar.f49018u.S = j10;
                        return;
                    case 25188:
                        eVar.b(i10);
                        eVar.f49018u.P = (int) j10;
                        return;
                    case 30114:
                        eVar.R = j10;
                        return;
                    case 30321:
                        eVar.b(i10);
                        int i13 = (int) j10;
                        if (i13 != 0) {
                            if (i13 != 1) {
                                if (i13 != 2) {
                                    if (i13 == 3) {
                                        eVar.f49018u.f48984r = 3;
                                        return;
                                    }
                                    return;
                                }
                                eVar.f49018u.f48984r = 2;
                                return;
                            }
                            eVar.f49018u.f48984r = 1;
                            return;
                        }
                        eVar.f49018u.f48984r = 0;
                        return;
                    case 2352003:
                        eVar.b(i10);
                        eVar.f49018u.f48972e = (int) j10;
                        return;
                    case 2807729:
                        eVar.f49015r = j10;
                        return;
                    default:
                        switch (i10) {
                            case 21945:
                                eVar.b(i10);
                                int i14 = (int) j10;
                                if (i14 != 1) {
                                    if (i14 == 2) {
                                        eVar.f49018u.A = 1;
                                        return;
                                    }
                                    return;
                                }
                                eVar.f49018u.A = 2;
                                return;
                            case 21946:
                                eVar.b(i10);
                                int i15 = (int) j10;
                                String str = g5.b.f7024f;
                                if (i15 != 1) {
                                    if (i15 != 16) {
                                        if (i15 != 18) {
                                            if (i15 != 6 && i15 != 7) {
                                                i11 = -1;
                                            }
                                        } else {
                                            i11 = 7;
                                        }
                                    } else {
                                        i11 = 6;
                                    }
                                }
                                if (i11 != -1) {
                                    eVar.f49018u.f48991z = i11;
                                    return;
                                }
                                return;
                            case 21947:
                                eVar.b(i10);
                                eVar.f49018u.f48989x = true;
                                int a2 = g5.b.a((int) j10);
                                if (a2 != -1) {
                                    eVar.f49018u.f48990y = a2;
                                    return;
                                }
                                return;
                            case 21948:
                                eVar.b(i10);
                                eVar.f49018u.B = (int) j10;
                                return;
                            case 21949:
                                eVar.b(i10);
                                eVar.f49018u.C = (int) j10;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j10 != 1) {
                throw t1.a("ContentEncodingScope " + j10 + " not supported", null);
            }
        } else if (j10 == 0) {
        } else {
            throw t1.a("ContentEncodingOrder " + j10 + " not supported", null);
        }
    }

    @Override
    public j9 D() {
        switch (this.f19013a) {
            case 23:
                return (x) this.f19014b;
            default:
                return (m4) this.f19014b;
        }
    }

    @Override
    public void E(ArrayList arrayList) {
        switch (this.f19013a) {
            case 19:
                v0 v0Var = (v0) this.f19014b;
                String str = v0Var.V;
                if (str != null) {
                    v0Var.U(str, v0Var.Y, v0Var.Z, v0Var.X, v0Var.W);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public th.a G() {
        switch (this.f19013a) {
            case 23:
                return ((x) this.f19014b).f48892a;
            default:
                return ((m4) this.f19014b).f48892a;
        }
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        ((ChatActivityEnterView) this.f19014b).T0(i10, z10, 0, true, 0L);
    }

    @Override
    public m1 I0(View view, m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        yl0 yl0Var = (yl0) this.f19014b;
        yl0Var.v.setPadding(defaultWindowInsets.f8186a, defaultWindowInsets.f8187b, defaultWindowInsets.f8188c, defaultWindowInsets.d);
        yl0Var.f35097s.requestLayout();
        return m1.f46842b;
    }

    @Override
    public void J(th.a aVar) {
        x1 x1Var = (x1) this.f19014b;
        if (aVar != null && (aVar.f48328b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(x1Var)) {
            ni niVar = new ni(x1Var.getParentActivity(), x1Var, false, false, false, x1Var.getResourceProvider());
            niVar.V1 = new ab.b(23);
            niVar.L = true;
            niVar.f31049t1.setVisibility(8);
            niVar.f31036p2 = new w1(x1Var, aVar, niVar, 6);
            niVar.r1();
            niVar.show();
        }
    }

    @Override
    public boolean M() {
        switch (this.f19013a) {
            case 23:
                x xVar = (x) this.f19014b;
                j3 j3Var = xVar.K;
                if (j3Var != null) {
                    th.a aVar = xVar.f48892a;
                    if (j3Var.f48523a.S4()) {
                        return true;
                    }
                }
                return false;
            default:
                m4 m4Var = (m4) this.f19014b;
                i3 i3Var = m4Var.J;
                if (i3Var != null) {
                    th.a aVar2 = m4Var.f48892a;
                    if (i3Var.f48491a.S4()) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override
    public void Q0(m3 m3Var, View view) {
        x1 x1Var = (x1) this.f19014b;
        j70 H = j70.H(x1Var, view);
        H.Q = true;
        x1Var.f48871t0 = b4.c(H, x1Var, x1Var.getParentActivity(), x1Var.getResourceProvider(), m3Var, false);
    }

    @Override
    public void U0(o3 o3Var, View view) {
        x1 x1Var = (x1) this.f19014b;
        j70 H = j70.H(x1Var, view);
        H.Q = true;
        x1Var.getParentActivity();
        x1Var.getResourceProvider();
        x1Var.f48871t0 = b4.b(H, x1Var, o3Var, false);
    }

    @Override
    public void W(int i10) {
        ((x1) this.f19014b).o0(74, i10);
    }

    @Override
    public p0 Z0(Class cls, v1.b bVar) {
        m0 m0Var = null;
        for (v1.c cVar : (v1.c[]) this.f19014b) {
            if (cVar.f49322a.equals(cls)) {
                m0Var = new m0();
            }
        }
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    @Override
    public void a(long j10) {
        ((q) this.f19014b).presentFragment(tn.R9(j10));
    }

    @Override
    public void a1(t5 t5Var, String str) {
        x1 x1Var = (x1) this.f19014b;
        if (x1Var.f48873v0 == null) {
            x1Var.f48873v0 = new s3(new f1(this, 5), x1Var.getResourceProvider());
        }
        x1Var.f48873v0.f(t5Var, str);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        r rVar = new r(0, (TaskCompletionSource) obj2);
        s5.i iVar = (s5.i) ((t) obj).u();
        Parcel M0 = iVar.M0();
        u.d(M0, rVar);
        M0.writeStringArray((String[]) this.f19014b);
        iVar.R0(M0, 5);
    }

    @Override
    public void b0() {
        int i10;
        x1 x1Var = (x1) this.f19014b;
        d3 d3Var = x1Var.L.f48650j3;
        if (d3Var != null && d3Var.y() && x1Var.L.C4()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        x1Var.x0(i10, true);
        x1Var.y0();
        x1Var.w0();
    }

    @Override
    public void c(String str, long j10, long j11, long j12) {
        n nVar = (n) this.f19014b;
        try {
            nVar.a(new q5.m(new Status(2103, null, null, null), 1));
        } catch (IllegalStateException e10) {
            s5.b bVar = q5.h.f46390k;
            Log.e(bVar.f47580a, bVar.d("Result already set when calling onRequestReplaced", new Object[0]), e10);
        }
        Iterator it = nVar.f46411q.f46397i.iterator();
        while (it.hasNext()) {
            ((q5.g) it.next()).h(str, j10, 2103, j11, j12);
        }
    }

    @Override
    public void close() {
        ((q) this.f19014b).finishFragment();
    }

    @Override
    public boolean d(float f9) {
        boolean z10;
        x1 x1Var = (x1) this.f19014b;
        FrameLayout frameLayout = x1Var.f48868r0;
        if (frameLayout != null) {
            int[] iArr = new int[2];
            frameLayout.getLocationOnScreen(iArr);
            if (f9 >= iArr[1]) {
                z10 = true;
                x1.Z(x1Var, z10, true);
                return z10;
            }
        }
        z10 = false;
        x1.Z(x1Var, z10, true);
        return z10;
    }

    @Override
    public void e(d1 d1Var) {
        switch (this.f19013a) {
            case 23:
                j3 j3Var = ((x) this.f19014b).K;
                if (j3Var != null) {
                    p3 p3Var = j3Var.f48523a;
                    p3.M1(p3Var, d1Var);
                    p3Var.f48638d3.U(d1Var, true);
                    return;
                }
                return;
            default:
                i3 i3Var = ((m4) this.f19014b).J;
                if (i3Var != null) {
                    p3 p3Var2 = i3Var.f48491a;
                    p3.M1(p3Var2, d1Var);
                    p3Var2.f48638d3.U(d1Var, true);
                    return;
                }
                return;
        }
    }

    @Override
    public void f(int i10) {
        switch (this.f19013a) {
            case 19:
                ((v0) this.f19014b).l();
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.t1(this, 17));
                return;
        }
    }

    @Override
    public void g(com.google.android.exoplayer2.upstream.n0 n0Var, long j10, long j11, boolean z10) {
        t0 t0Var = (t0) n0Var;
        o4.h hVar = (o4.h) this.f19014b;
        long j12 = t0Var.f3620a;
        Uri uri = t0Var.d.f3667c;
        ?? obj = new Object();
        hVar.f19165n.getClass();
        hVar.f19168q.d(obj, t0Var.f3622c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override
    public p0 h(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override
    public void h0(int i10, int i11) {
        switch (this.f19013a) {
            case 23:
                x xVar = (x) this.f19014b;
                j3 j3Var = xVar.K;
                if (j3Var != null) {
                    th.a aVar = xVar.f48892a;
                    b2 b2Var = j3Var.f48523a.F3;
                    if (b2Var != null) {
                        b2Var.f(i10, i11);
                        return;
                    }
                    return;
                }
                return;
            default:
                m4 m4Var = (m4) this.f19014b;
                i3 i3Var = m4Var.J;
                if (i3Var != null) {
                    th.a aVar2 = m4Var.f48892a;
                    b2 b2Var2 = i3Var.f48491a.F3;
                    if (b2Var2 != null) {
                        b2Var2.f(i10, i11);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void i() {
        switch (this.f19013a) {
            case 23:
                x xVar = (x) this.f19014b;
                j3 j3Var = xVar.K;
                if (j3Var != null) {
                    p3.P1(j3Var.f48523a, xVar.f48892a);
                    return;
                }
                return;
            default:
                m4 m4Var = (m4) this.f19014b;
                i3 i3Var = m4Var.J;
                if (i3Var != null) {
                    p3.P1(i3Var.f48491a, m4Var.f48892a);
                    return;
                }
                return;
        }
    }

    @Override
    public void i0() {
        switch (this.f19013a) {
            case 23:
                x xVar = (x) this.f19014b;
                j3 j3Var = xVar.K;
                if (j3Var != null) {
                    th.a aVar = xVar.f48892a;
                    p3 p3Var = j3Var.f48523a;
                    b2 b2Var = p3Var.F3;
                    if (b2Var != null) {
                        b2Var.g();
                    }
                    p3Var.f48638d3.onContentChanged();
                    return;
                }
                return;
            default:
                m4 m4Var = (m4) this.f19014b;
                i3 i3Var = m4Var.J;
                if (i3Var != null) {
                    th.a aVar2 = m4Var.f48892a;
                    p3 p3Var2 = i3Var.f48491a;
                    b2 b2Var2 = p3Var2.F3;
                    if (b2Var2 != null) {
                        b2Var2.g();
                    }
                    p3Var2.f48638d3.onContentChanged();
                    return;
                }
                return;
        }
    }

    @Override
    public void invalidate() {
        switch (this.f19013a) {
            case 4:
                ((s1) ((org.telegram.ui.Cells.f1) this.f19014b).f24305b).invalidate();
                return;
            default:
                ((bg0) this.f19014b).h.invalidate();
                return;
        }
    }

    @Override
    public com.google.android.exoplayer2.upstream.k0 j(com.google.android.exoplayer2.upstream.n0 r8, java.io.IOException r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: o1.a.j(com.google.android.exoplayer2.upstream.n0, java.io.IOException, int):com.google.android.exoplayer2.upstream.k0");
    }

    @Override
    public void k() {
        boolean z10;
        q qVar = (q) this.f19014b;
        vd.a aVar = qVar.f46766a;
        o0 o0Var = qVar.v;
        if (o0Var.f46759n && o0Var.f46757l == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        aVar.a(z10, true);
        qVar.d.U2.N(true);
    }

    @Override
    public void k0() {
        x1 x1Var = (x1) this.f19014b;
        x1Var.E0 = x1Var.G0;
        x1.Z(x1Var, false, false);
        x1Var.x0(2, true);
    }

    @Override
    public void l(Object obj) {
        Bundle extras;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f19014b;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f894b;
        int i10 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).f45457a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.I;
        if (resultReceiver != null) {
            if (intent == null) {
                extras = null;
            } else {
                extras = intent.getExtras();
            }
            resultReceiver.send(i10, extras);
        }
        int i11 = aVar.f893a;
        if (i11 != -1 || i10 != 0) {
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i11 + " and billing's responseCode: " + i10);
        }
        proxyBillingActivityV2.finish();
    }

    @Override
    public void l0() {
        switch (this.f19013a) {
            case 23:
                x xVar = (x) this.f19014b;
                j3 j3Var = xVar.K;
                if (j3Var != null) {
                    th.a aVar = xVar.f48892a;
                    p3.O1(j3Var.f48523a);
                    return;
                }
                return;
            default:
                m4 m4Var = (m4) this.f19014b;
                i3 i3Var = m4Var.J;
                if (i3Var != null) {
                    th.a aVar2 = m4Var.f48892a;
                    p3.O1(i3Var.f48491a);
                    return;
                }
                return;
        }
    }

    @Override
    public void l1() {
        x1 x1Var = (x1) this.f19014b;
        int i10 = 0;
        x1.Z(x1Var, false, true);
        int i11 = x1Var.E0;
        if (i11 != 2) {
            i10 = i11;
        }
        x1Var.x0(i10, true);
    }

    @Override
    public void m(com.google.android.exoplayer2.upstream.n0 n0Var, long j10, long j11) {
        int size;
        t0 t0Var = (t0) n0Var;
        o4.h hVar = (o4.h) this.f19014b;
        long j12 = t0Var.f3620a;
        Uri uri = t0Var.d.f3667c;
        ?? obj = new Object();
        hVar.f19165n.getClass();
        hVar.f19168q.f(obj, t0Var.f3622c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        p4.c cVar = (p4.c) t0Var.f3624f;
        p4.c cVar2 = hVar.H;
        if (cVar2 == null) {
            size = 0;
        } else {
            size = cVar2.f45549m.size();
        }
        long j13 = cVar.b(0).f45567b;
        int i10 = 0;
        while (i10 < size && hVar.H.b(i10).f45567b < j13) {
            i10++;
        }
        if (cVar.d) {
            if (size - i10 > cVar.f45549m.size()) {
                f5.a.K("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j14 = hVar.N;
                if (j14 != -9223372036854775807L && cVar.h * 1000 <= j14) {
                    f5.a.K("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.h + ", " + hVar.N);
                } else {
                    hVar.M = 0;
                }
            }
            int i11 = hVar.M;
            hVar.M = i11 + 1;
            if (i11 < hVar.f19165n.B(t0Var.f3622c)) {
                hVar.D.postDelayed(hVar.v, Math.min((hVar.M - 1) * 1000, 5000));
                return;
            }
            hVar.C = new IOException();
            return;
        }
        hVar.H = cVar;
        hVar.I = cVar.d & hVar.I;
        hVar.J = j10 - j11;
        hVar.K = j10;
        synchronized (hVar.f19171t) {
            try {
                if (t0Var.f3621b.f3599a == hVar.F) {
                    Uri uri2 = hVar.H.f45547k;
                    if (uri2 == null) {
                        uri2 = t0Var.d.f3667c;
                    }
                    hVar.F = uri2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (size == 0) {
            p4.c cVar3 = hVar.H;
            if (cVar3.d) {
                d9.c cVar4 = cVar3.f45545i;
                if (cVar4 != null) {
                    String str = cVar4.f5536b;
                    if (!d0.a(str, "urn:mpeg:dash:utc:direct:2014") && !d0.a(str, "urn:mpeg:dash:utc:direct:2012")) {
                        if (!d0.a(str, "urn:mpeg:dash:utc:http-iso:2014") && !d0.a(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                            if (!d0.a(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !d0.a(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                                if (!d0.a(str, "urn:mpeg:dash:utc:ntp:2014") && !d0.a(str, "urn:mpeg:dash:utc:ntp:2012")) {
                                    f5.a.p("DashMediaSource", "Failed to resolve time offset.", new IOException("Unsupported UTC timing scheme"));
                                    hVar.u(true);
                                    return;
                                }
                                hVar.t();
                                return;
                            }
                            t0 t0Var2 = new t0(hVar.f19176z, Uri.parse(cVar4.f5537c), 5, new bb.a(16));
                            hVar.A.f(t0Var2, new o4.d(hVar), 1);
                            hVar.f19168q.k(new p(t0Var2.f3621b), t0Var2.f3622c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
                            return;
                        }
                        t0 t0Var3 = new t0(hVar.f19176z, Uri.parse(cVar4.f5537c), 5, new Object());
                        hVar.A.f(t0Var3, new o4.d(hVar), 1);
                        hVar.f19168q.k(new p(t0Var3.f3621b), t0Var3.f3622c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
                        return;
                    }
                    try {
                        hVar.L = d0.K(cVar4.f5537c) - hVar.K;
                        hVar.u(true);
                        return;
                    } catch (t1 e10) {
                        f5.a.p("DashMediaSource", "Failed to resolve time offset.", e10);
                        hVar.u(true);
                        return;
                    }
                }
                hVar.t();
                return;
            }
            hVar.u(true);
            return;
        }
        hVar.O += i10;
        hVar.u(true);
    }

    @Override
    public Paint.FontMetricsInt n() {
        return ((ni) this.f19014b).A0.getEditText().getPaint().getFontMetricsInt();
    }

    @Override
    public void o(java.lang.String r14, long r15, int r17, java.lang.Object r18, long r19, long r21) {
        throw new UnsupportedOperationException("Method not decompiled: o1.a.o(java.lang.String, long, int, java.lang.Object, long, long):void");
    }

    @Override
    public void onComplete(Task task) {
        jd.m mVar = (jd.m) this.f19014b;
        Exception exception = task.getException();
        if (exception == null) {
            if (task.isCanceled()) {
                mVar.n(null);
                return;
            } else {
                mVar.resumeWith(task.getResult());
                return;
            }
        }
        mVar.resumeWith(c7.a(exception));
    }

    @Override
    public void onContentChanged() {
        x1 x1Var = (x1) this.f19014b;
        if (x1Var.f48872u0 != null) {
            boolean m32 = x1Var.L.m3();
            x1Var.H0 = m32;
            x1Var.f48872u0.h(m32);
            x1Var.f48872u0.invalidate();
        }
        x1Var.C0();
        Runnable runnable = x1Var.I0;
        AndroidUtilities.cancelRunOnUIThread(runnable);
        AndroidUtilities.runOnUIThread(runnable, 1000L);
    }

    @Override
    public void onSuccess(Object obj) {
        int i10;
        int i11;
        e2 e2Var;
        e1 b10;
        p5.a aVar = (p5.a) this.f19014b;
        Bundle bundle = (Bundle) obj;
        if (com.google.android.gms.internal.cast.p0.f4225j) {
            Context context = aVar.f45601a;
            s5.s sVar = aVar.f45605f;
            com.google.android.gms.internal.cast.p0 p0Var = new com.google.android.gms.internal.cast.p0(context, sVar, aVar.f45603c, aVar.f45608j, aVar.f45606g);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE")) {
                i10 = bundle.getInt("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", 0);
            } else if (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", false)) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            boolean z10 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", false);
            if (i10 == 0) {
                if (z10) {
                    i10 = 0;
                    z10 = true;
                } else {
                    return;
                }
            }
            String packageName = context.getPackageName();
            Locale locale = Locale.ROOT;
            String k9 = u3.c.k(packageName, ".client_cast_analytics_data");
            if (bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            p0Var.h = i11;
            y2.q.b(context);
            p0Var.f4231g = y2.q.a().c(w2.a.f49622e).a("CAST_SENDER_SDK", new v2.c("proto"), a0.f3998a);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                p0Var.f4229e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(k9, 0);
            if (i10 != 0) {
                v b11 = w.b();
                b11.f3928c = new d6(sVar, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"}, 22);
                b11.d = new w5.c[]{y.f19349c};
                b11.f3927b = false;
                b11.f3926a = 8426;
                Task e10 = sVar.e(0, b11.b());
                ?? obj2 = new Object();
                obj2.f6632b = p0Var;
                obj2.f6633c = packageName;
                obj2.f6631a = i10;
                obj2.d = sharedPreferences;
                e10.addOnSuccessListener(obj2);
            }
            if (z10) {
                z5.l.h(sharedPreferences);
                s5.b bVar = e2.f4117i;
                synchronized (e2.class) {
                    try {
                        if (e2.f4119k == null) {
                            e2.f4119k = new e2(sharedPreferences, p0Var, packageName);
                        }
                        e2Var = e2.f4119k;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                String str = e2Var.f4122c;
                SharedPreferences sharedPreferences2 = e2Var.f4121b;
                HashSet hashSet = e2Var.f4124f;
                String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                hashSet.clear();
                HashSet hashSet2 = e2Var.f4125g;
                hashSet2.clear();
                e2Var.h = 0L;
                String str2 = e2.f4118j;
                if (str2.equals(string) && str.equals(string2)) {
                    e2Var.h = sharedPreferences2.getLong("feature_usage_last_report_time", 0L);
                    long currentTimeMillis = System.currentTimeMillis();
                    HashSet hashSet3 = new HashSet();
                    for (String str3 : sharedPreferences2.getAll().keySet()) {
                        if (str3.startsWith("feature_usage_timestamp_")) {
                            long j10 = sharedPreferences2.getLong(str3, 0L);
                            if (j10 != 0 && currentTimeMillis - j10 > 1209600000) {
                                hashSet3.add(str3);
                            } else if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                                e1 b12 = e2.b(str3.substring(41));
                                if (b12 != null) {
                                    hashSet2.add(b12);
                                    hashSet.add(b12);
                                }
                            } else if (str3.startsWith("feature_usage_timestamp_detected_feature_") && (b10 = e2.b(str3.substring(41))) != null) {
                                hashSet.add(b10);
                            }
                        }
                    }
                    e2Var.c(hashSet3);
                    z5.l.h(e2Var.f4123e);
                    z5.l.h(e2Var.d);
                    e2Var.f4123e.post(e2Var.d);
                } else {
                    HashSet hashSet4 = new HashSet();
                    for (String str4 : sharedPreferences2.getAll().keySet()) {
                        if (str4.startsWith("feature_usage_timestamp_")) {
                            hashSet4.add(str4);
                        }
                    }
                    hashSet4.add("feature_usage_last_report_time");
                    e2Var.c(hashSet4);
                    sharedPreferences2.edit().putString("feature_usage_sdk_version", str2).putString("feature_usage_package_name", str).apply();
                }
                e2.a(e1.CAST_CONTEXT);
            }
        }
    }

    @Override
    public Object p2() {
        Constructor constructor = (Constructor) this.f19014b;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e10) {
            r7 r7Var = sa.c.f47694a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Failed to invoke constructor '" + sa.c.b(constructor) + "' with no args", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("Failed to invoke constructor '" + sa.c.b(constructor) + "' with no args", e12.getCause());
        }
    }

    @Override
    public a0.h q() {
        switch (this.f19013a) {
            case 19:
                return null;
            default:
                return null;
        }
    }

    @Override
    public j70 q1(View view) {
        return j70.H((x1) this.f19014b, view);
    }

    @Override
    public void r(int i10, int i11, CharSequence charSequence, boolean z10) {
        ni niVar = (ni) this.f19014b;
        if (niVar.m1() == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(niVar.m1().getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                Emoji.replaceEmoji(spannableStringBuilder, niVar.m1().getEditText().getPaint().getFontMetricsInt(), false);
            }
            niVar.m1().setText(spannableStringBuilder);
            niVar.m1().setSelection(i10 + charSequence.length());
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public void s1() {
        x1 x1Var = (x1) this.f19014b;
        x1Var.z0();
        x1Var.C0();
    }

    @Override
    public a0.h t() {
        switch (this.f19013a) {
            case 19:
                return null;
            default:
                return null;
        }
    }

    public void u(int i10, int i11, o3.l lVar) {
        char c3;
        char c6;
        long j10;
        int i12;
        int i13;
        int i14;
        int i15;
        byte[] bArr;
        int i16;
        u3.e eVar = (u3.e) this.f19014b;
        u3.f fVar = eVar.f49000b;
        SparseArray sparseArray = eVar.f49002c;
        f5.w wVar = eVar.f49006i;
        f5.w wVar2 = eVar.f49005g;
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
                                        eVar.b(i10);
                                        byte[] bArr2 = new byte[i11];
                                        eVar.f49018u.v = bArr2;
                                        lVar.readFully(bArr2, 0, i11);
                                        return;
                                    }
                                    throw t1.a("Unexpected id: " + i10, null);
                                }
                                eVar.b(i10);
                                byte[] bArr3 = new byte[i11];
                                eVar.f49018u.f48977k = bArr3;
                                lVar.readFully(bArr3, 0, i11);
                                return;
                            }
                            Arrays.fill(wVar.f6640a, (byte) 0);
                            lVar.readFully(wVar.f6640a, 4 - i11, i11);
                            wVar.C(0);
                            eVar.f49019w = (int) wVar.s();
                            return;
                        }
                        byte[] bArr4 = new byte[i11];
                        lVar.readFully(bArr4, 0, i11);
                        eVar.b(i10);
                        eVar.f49018u.f48976j = new o3.v(1, 0, 0, bArr4);
                        return;
                    }
                    eVar.b(i10);
                    byte[] bArr5 = new byte[i11];
                    eVar.f49018u.f48975i = bArr5;
                    lVar.readFully(bArr5, 0, i11);
                    return;
                }
                eVar.b(i10);
                u3.d dVar = eVar.f49018u;
                int i19 = dVar.f48974g;
                if (i19 != 1685485123 && i19 != 1685480259) {
                    lVar.t(i11);
                    return;
                }
                byte[] bArr6 = new byte[i11];
                dVar.N = bArr6;
                lVar.readFully(bArr6, 0, i11);
                return;
            } else if (eVar.G == 2) {
                u3.d dVar2 = (u3.d) sparseArray.get(eVar.M);
                int i20 = eVar.P;
                f5.w wVar3 = eVar.f49011n;
                if (i20 == 4 && "V_VP9".equals(dVar2.f48970b)) {
                    wVar3.z(i11);
                    lVar.readFully(wVar3.f6640a, 0, i11);
                    return;
                }
                lVar.t(i11);
                return;
            } else {
                return;
            }
        }
        if (eVar.G == 0) {
            eVar.M = (int) fVar.b(lVar, false, true, 8);
            eVar.N = fVar.f49025c;
            eVar.I = -9223372036854775807L;
            eVar.G = 1;
            wVar2.z(0);
        }
        u3.d dVar3 = (u3.d) sparseArray.get(eVar.M);
        if (dVar3 == null) {
            lVar.t(i11 - eVar.N);
            eVar.G = 0;
            return;
        }
        dVar3.X.getClass();
        if (eVar.G == 1) {
            eVar.h(lVar, 3);
            int i21 = (wVar2.f6640a[2] & 6) >> 1;
            byte b10 = 255;
            if (i21 == 0) {
                eVar.K = 1;
                int[] iArr = eVar.L;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                eVar.L = iArr;
                iArr[0] = (i11 - eVar.N) - 3;
            } else {
                eVar.h(lVar, 4);
                int i22 = (wVar2.f6640a[3] & 255) + 1;
                eVar.K = i22;
                int[] iArr2 = eVar.L;
                if (iArr2 == null) {
                    iArr2 = new int[i22];
                } else if (iArr2.length < i22) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i22)];
                }
                eVar.L = iArr2;
                if (i21 == 2) {
                    int i23 = eVar.K;
                    Arrays.fill(iArr2, 0, i23, ((i11 - eVar.N) - 4) / i23);
                } else if (i21 == 1) {
                    int i24 = 0;
                    int i25 = 0;
                    int i26 = 4;
                    while (true) {
                        i13 = eVar.K - 1;
                        if (i24 >= i13) {
                            break;
                        }
                        eVar.L[i24] = 0;
                        while (true) {
                            i14 = i26 + 1;
                            eVar.h(lVar, i14);
                            int i27 = wVar2.f6640a[i26] & 255;
                            int[] iArr3 = eVar.L;
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
                    eVar.L[i13] = ((i11 - eVar.N) - i26) - i25;
                } else if (i21 == 3) {
                    int i28 = 0;
                    int i29 = 0;
                    int i30 = 4;
                    while (true) {
                        int i31 = eVar.K - i17;
                        if (i28 < i31) {
                            eVar.L[i28] = i18;
                            int i32 = i30 + 1;
                            eVar.h(lVar, i32);
                            if (wVar2.f6640a[i30] != 0) {
                                int i33 = 0;
                                while (true) {
                                    if (i33 < 8) {
                                        int i34 = 1 << (7 - i33);
                                        if ((wVar2.f6640a[i30] & i34) != 0) {
                                            i12 = i32 + i33;
                                            eVar.h(lVar, i12);
                                            j10 = wVar2.f6640a[i30] & b10 & (~i34);
                                            while (i32 < i12) {
                                                j10 = (j10 << 8) | (wVar2.f6640a[i32] & b10);
                                                i32++;
                                                b10 = 255;
                                            }
                                            if (i28 > 0) {
                                                j10 -= (1 << ((i33 * 7) + 6)) - 1;
                                            }
                                        } else {
                                            i33++;
                                            b10 = 255;
                                        }
                                    } else {
                                        j10 = 0;
                                        i12 = i32;
                                        break;
                                    }
                                }
                                if (j10 < -2147483648L || j10 > 2147483647L) {
                                    break;
                                }
                                int i35 = (int) j10;
                                int[] iArr4 = eVar.L;
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
                                throw t1.a("No valid varint length mask found", null);
                            }
                        } else {
                            c3 = 1;
                            c6 = 0;
                            eVar.L[i31] = ((i11 - eVar.N) - i30) - i29;
                            break;
                        }
                    }
                    throw t1.a("EBML lacing sample size out of range.", null);
                } else {
                    throw t1.a("Unexpected lacing value: " + i21, null);
                }
            }
            c3 = 1;
            c6 = 0;
            int i36 = wVar2.f6640a[c3] & 255;
            eVar.H = eVar.k(i36 | (bArr[c6] << 8)) + eVar.B;
            if (dVar3.d != 2 && (i10 != 163 || (wVar2.f6640a[2] & 128) != 128)) {
                i16 = 0;
            } else {
                i16 = 1;
            }
            eVar.O = i16;
            eVar.G = 2;
            eVar.J = 0;
        }
        if (i10 == 163) {
            while (true) {
                int i37 = eVar.J;
                if (i37 < eVar.K) {
                    eVar.c(dVar3, ((eVar.J * dVar3.f48972e) / 1000) + eVar.H, eVar.O, eVar.l(lVar, dVar3, eVar.L[i37], false), 0);
                    eVar.J++;
                } else {
                    eVar.G = 0;
                    return;
                }
            }
        } else {
            while (true) {
                int i38 = eVar.J;
                if (i38 < eVar.K) {
                    int[] iArr5 = eVar.L;
                    iArr5[i38] = eVar.l(lVar, dVar3, iArr5[i38], true);
                    eVar.J++;
                } else {
                    return;
                }
            }
        }
    }

    public o5.o v() {
        o5.o oVar = (o5.o) this.f19014b;
        if (oVar.f19304a != null) {
            if (!Double.isNaN(oVar.d) && oVar.d < 0.0d) {
                throw new IllegalArgumentException("startTime cannot be negative or NaN.");
            }
            if (!Double.isNaN(oVar.f19307e)) {
                if (!Double.isNaN(oVar.f19308f) && oVar.f19308f >= 0.0d) {
                    return oVar;
                }
                throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
            }
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public nb.d w(ab.m r24) {
        throw new UnsupportedOperationException("Method not decompiled: o1.a.w(ab.m):nb.d");
    }

    @Override
    public k9 x() {
        switch (this.f19013a) {
            case 23:
                j3 j3Var = ((x) this.f19014b).K;
                if (j3Var != null) {
                    return j3Var.f48523a.getTextSelectionHelper();
                }
                return null;
            default:
                i3 i3Var = ((m4) this.f19014b).J;
                if (i3Var != null) {
                    return i3Var.f48491a.getTextSelectionHelper();
                }
                return null;
        }
    }

    public String y(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            u9.d dVar = (u9.d) this.f19014b;
            u9.e eVar = new u9.e(stringWriter, dVar.f49155a, dVar.f49156b, dVar.f49157c, dVar.d);
            eVar.h(obj);
            eVar.j();
            eVar.f49159b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    public a(s5.s sVar, String[] strArr) {
        this.f19013a = 20;
        this.f19014b = strArr;
    }

    public a(MediaInfo mediaInfo) {
        this.f19013a = 3;
        o5.o oVar = new o5.o(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo != null) {
            this.f19014b = oVar;
            return;
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public a(JSONObject jSONObject) {
        this.f19013a = 3;
        this.f19014b = new o5.o(jSONObject);
    }

    public a(int i10) {
        this.f19013a = i10;
        switch (i10) {
            case 8:
                return;
            case 18:
                this.f19014b = new o4.g(pb.a.h, 11);
                return;
            default:
                this.f19014b = new f5.w(10);
                return;
        }
    }

    public a(int i10, int i11, int[] iArr) {
        this.f19013a = 5;
        u50[] u50VarArr = new u50[(iArr.length / 2) + 1];
        this.f19014b = u50VarArr;
        u50 u50Var = new u50(i10, i11);
        int i12 = 0;
        u50VarArr[0] = u50Var;
        while (i12 < iArr.length / 2) {
            int i13 = i12 + 1;
            int i14 = i12 * 2;
            ((u50[]) this.f19014b)[i13] = new u50(iArr[i14], iArr[i14 + 1]);
            i12 = i13;
        }
    }

    public a(v1.c[] initializers) {
        this.f19013a = 28;
        kotlin.jvm.internal.j.e(initializers, "initializers");
        this.f19014b = initializers;
    }

    public a(UUID uuid, int i10, byte[] bArr) {
        this.f19013a = 29;
        this.f19014b = uuid;
    }

    @Override
    public void G0() {
    }

    private final void H(ArrayList arrayList) {
    }

    @Override
    public void K0(int i10) {
    }

    @Override
    public void s(String str) {
    }

    @Override
    public void U(d1 d1Var, boolean z10) {
    }

    @Override
    public void b(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }

    @Override
    public void p(TLRPC.TL_document tL_document, String str, Object obj) {
    }
}
