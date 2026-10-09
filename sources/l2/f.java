package l2;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.media.Rating;
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
import android.widget.TextView;
import androidx.lifecycle.m0;
import androidx.lifecycle.s0;
import androidx.recyclerview.widget.RecyclerView;
import ci.u5;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.v;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import k2.g0;
import m.x0;
import m2.t;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.h1;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.mr0;
import org.telegram.ui.Components.uf0;
import org.telegram.ui.Components.vf0;
import org.telegram.ui.Components.yi;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Wallet.a5;
import org.telegram.ui.Wallet.f3;
import org.telegram.ui.ec0;
import org.telegram.ui.k9;
import org.telegram.ui.ts0;
import org.telegram.ui.u9;
import pg.u0;
import qg.v1;
import qg.w0;
import s4.d1;
import s4.g1;
import s4.j1;
import s4.p0;
import s4.q0;
import v7.g5;
public class f implements x0, n5.b, o0.a, a81, f5, mb0, lg.o, ah.j, u9, v1, com.google.android.gms.common.api.internal.o, j1, s, s0 {
    public final int f15330a;
    public Object f15331b;

    public f(int i10, boolean z10) {
        this.f15330a = i10;
    }

    public static float[] q(ArrayList arrayList) {
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
            arrayList2.add((PointF) hg.c.g(1, arrayList));
        }
        int i29 = i10;
        float f22 = ((PointF) arrayList2.get(i29)).x;
        if (f22 > f11) {
            for (int i30 = (int) f22; i30 >= 0; i30--) {
                arrayList2.add(i29, new PointF(i30, f11));
            }
        }
        float f23 = ((PointF) hg.c.g(1, arrayList2)).x;
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

    public static f s(float f7, int i10) {
        boolean z10;
        Point point = AndroidUtilities.displaySize;
        int i11 = (int) (point.x * f7);
        int i12 = (int) (point.y * f7);
        if (i11 == i12) {
            return new f(i11, i12, new int[0]);
        }
        if (i10 == 3) {
            return new f(i11, i12, new int[]{i12, i11});
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
            return new f(i11, i12, new int[0]);
        }
        return new f(i12, i11, new int[0]);
    }

    public void A(String str, String str2) {
        Integer num = (Integer) n4.m.f16583c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(a1.g.q("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.f15331b).putCharSequence(str, str2);
    }

    public void B(CharSequence charSequence, String str) {
        Integer num = (Integer) n4.m.f16583c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(a1.g.q("The ", str, " key cannot be used to put a CharSequence"));
        }
        ((Bundle) this.f15331b).putCharSequence(str, charSequence);
    }

    @Override
    public void B0(ah.a aVar) {
        aVar.a(((mr0) this.f15331b).getThemedColor(i6.f20797d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    public void C(d1 d1Var) {
        RecyclerView recyclerView = (RecyclerView) this.f15331b;
        p0 p0Var = recyclerView.f3169x;
        View view = d1Var.f47658a;
        pf.e eVar = recyclerView.f3140b;
        la.h hVar = p0Var.f47763a;
        g0 g0Var = (g0) hVar.f15462b;
        int indexOfChild = ((RecyclerView) g0Var.f14470b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((e6.n) hVar.f15463c).F(indexOfChild)) {
                hVar.Z(view);
            }
            g0Var.Z0(indexOfChild);
        }
        eVar.g(view);
    }

    @Override
    public void D(boolean z10) {
        ((vf0) this.f15331b).f31769c.setAspectLock(z10);
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        ((ChatActivityEnterView) this.f15331b).R0(i10, z10, 0, true, 0L);
    }

    @Override
    public void K(String str) {
        String trim;
        a5 a5Var = (a5) this.f15331b;
        if (str == null) {
            trim = "";
        } else {
            try {
                trim = str.trim();
            } catch (Throwable unused) {
                AndroidUtilities.runOnUIThread(new f3(a5Var, 7));
                return;
            }
        }
        Uri parse = Uri.parse(trim);
        String scheme = parse.getScheme();
        if (("ton".equalsIgnoreCase(scheme) || "tc".equalsIgnoreCase(scheme)) && (a5Var.getParentActivity() instanceof LaunchActivity) && new ec0((LaunchActivity) a5Var.getParentActivity(), a5.g0(a5Var), null, false).g(parse)) {
            return;
        }
        AndroidUtilities.runOnUIThread(new f3(a5Var, 7));
    }

    @Override
    public void S(boolean z10) {
        vf0 vf0Var = (vf0) this.f15331b;
        vf0Var.getClass();
        uf0 uf0Var = vf0Var.f31767a;
        if (uf0Var != null) {
            ((ts0) uf0Var).a(z10);
        }
    }

    @Override
    public void W() {
        uf0 uf0Var = ((vf0) this.f15331b).f31767a;
        if (uf0Var != null) {
            PhotoViewer photoViewer = ((ts0) uf0Var).f42119a;
            if (photoViewer.f33887c2 == 1) {
                photoViewer.H2 = true;
                photoViewer.q3();
            }
        }
    }

    @Override
    public Cursor X(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f15331b;
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
    public boolean Z0(String str, k9 k9Var) {
        return false;
    }

    @Override
    public androidx.lifecycle.p0 a(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f15330a) {
            case 25:
                s6.f fVar = new s6.f(0, (TaskCompletionSource) obj2);
                s6.e eVar = (s6.e) ((s6.h) obj).u();
                Parcel H0 = eVar.H0();
                k7.a.d(H0, fVar);
                k7.a.c(H0, (s6.a) this.f15331b);
                eVar.I0(H0, 1);
                return;
            default:
                v8.e eVar2 = (v8.e) this.f15331b;
                e8.b bVar = (e8.b) obj;
                bVar.getClass();
                e8.a aVar = new e8.a(1, (TaskCompletionSource) obj2);
                try {
                    e8.i iVar = (e8.i) bVar.u();
                    Bundle G = bVar.G();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i10 = e8.c.f8701a;
                    obtain.writeInt(1);
                    eVar2.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    G.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(aVar);
                    iVar.f8709a.transact(14, obtain, null, 1);
                    obtain.recycle();
                    return;
                } catch (RemoteException e7) {
                    Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e7);
                    Bundle bundle = Bundle.EMPTY;
                    g5.a(Status.h, Boolean.FALSE, aVar.f8700b);
                    return;
                }
        }
    }

    @Override
    public int b(View view) {
        return p0.x(view) - ((ViewGroup.MarginLayoutParams) ((q0) view.getLayoutParams())).leftMargin;
    }

    @Override
    public int c() {
        return ((p0) this.f15331b).D();
    }

    @Override
    public int c0() {
        p0 p0Var = (p0) this.f15331b;
        return p0Var.f47773m - p0Var.E();
    }

    @Override
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f15331b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override
    public Paint.FontMetricsInt f() {
        return ((yi) this.f15331b).H0.getEditText().getPaint().getFontMetricsInt();
    }

    @Override
    public Object mo27get() {
        return new la.h((Context) ((g0) this.f15331b).f14470b, new ob.a(24), new na.d(24), 4);
    }

    @Override
    public androidx.lifecycle.p0 h(Class cls, v1.b bVar) {
        m0 m0Var = null;
        for (v1.c cVar : (v1.c[]) this.f15331b) {
            if (cVar.f49030a.equals(cls)) {
                m0Var = new m0();
            }
        }
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    @Override
    public void invalidate() {
        ((u1) ((h1) this.f15331b).f22190b).invalidate();
    }

    public void j(int i10, int i11, c3.p pVar) {
        int i12;
        int i13;
        int i14;
        long j3;
        int i15;
        int i16;
        int i17;
        int i18;
        byte[] bArr;
        int i19;
        u3.d dVar = (u3.d) this.f15331b;
        u3.e eVar = dVar.f48806b;
        SparseArray sparseArray = dVar.f48808c;
        v vVar = dVar.f48817k;
        v vVar2 = dVar.f48815i;
        int i20 = 1;
        int i21 = 0;
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
                                        dVar.f48829x.f48795x = bArr2;
                                        pVar.readFully(bArr2, 0, i11);
                                        return;
                                    }
                                    throw b2.s0.a(null, "Unexpected id: " + i10);
                                }
                                dVar.d(i10);
                                byte[] bArr3 = new byte[i11];
                                dVar.f48829x.f48784l = bArr3;
                                pVar.readFully(bArr3, 0, i11);
                                return;
                            }
                            Arrays.fill(vVar.f8584a, (byte) 0);
                            pVar.readFully(vVar.f8584a, 4 - i11, i11);
                            vVar.J(0);
                            dVar.f48831z = (int) vVar.z();
                            return;
                        }
                        byte[] bArr4 = new byte[i11];
                        pVar.readFully(bArr4, 0, i11);
                        dVar.d(i10);
                        dVar.f48829x.f48783k = new c3.g0(1, 0, 0, bArr4);
                        return;
                    }
                    dVar.d(i10);
                    byte[] bArr5 = new byte[i11];
                    dVar.f48829x.f48782j = bArr5;
                    pVar.readFully(bArr5, 0, i11);
                    return;
                }
                dVar.d(i10);
                u3.c cVar = dVar.f48829x;
                int i22 = cVar.h;
                if (i22 != 1685485123 && i22 != 1685480259) {
                    pVar.r(i11);
                    return;
                }
                byte[] bArr6 = new byte[i11];
                cVar.P = bArr6;
                pVar.readFully(bArr6, 0, i11);
                return;
            } else if (dVar.J == 2) {
                u3.c cVar2 = (u3.c) sparseArray.get(dVar.P);
                int i23 = dVar.S;
                v vVar3 = dVar.f48822p;
                if (i23 == 4 && "V_VP9".equals(cVar2.f48777c)) {
                    vVar3.G(i11);
                    pVar.readFully(vVar3.f8584a, 0, i11);
                    return;
                }
                pVar.r(i11);
                return;
            } else {
                return;
            }
        }
        if (dVar.J == 0) {
            dVar.P = (int) eVar.b(pVar, false, true, 8);
            dVar.Q = eVar.f48834c;
            dVar.L = -9223372036854775807L;
            dVar.J = 1;
            vVar2.G(0);
        }
        u3.c cVar3 = (u3.c) sparseArray.get(dVar.P);
        if (cVar3 == null) {
            pVar.r(i11 - dVar.Q);
            dVar.J = 0;
            return;
        }
        cVar3.Z.getClass();
        if (dVar.J == 1) {
            dVar.j(pVar, 3);
            int i24 = (vVar2.f8584a[2] & 6) >> 1;
            int i25 = 255;
            if (i24 == 0) {
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
                int i26 = (vVar2.f8584a[3] & 255) + 1;
                dVar.N = i26;
                int[] iArr2 = dVar.O;
                if (iArr2 == null) {
                    iArr2 = new int[i26];
                } else if (iArr2.length < i26) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i26)];
                }
                dVar.O = iArr2;
                if (i24 == 2) {
                    int i27 = dVar.N;
                    Arrays.fill(iArr2, 0, i27, ((i11 - dVar.Q) - 4) / i27);
                } else if (i24 == 1) {
                    int i28 = 0;
                    int i29 = 0;
                    int i30 = 4;
                    while (true) {
                        i16 = dVar.N - 1;
                        if (i28 >= i16) {
                            break;
                        }
                        dVar.O[i28] = 0;
                        while (true) {
                            i17 = i30 + 1;
                            dVar.j(pVar, i17);
                            int i31 = vVar2.f8584a[i30] & 255;
                            int[] iArr3 = dVar.O;
                            i18 = iArr3[i28] + i31;
                            iArr3[i28] = i18;
                            if (i31 != 255) {
                                break;
                            }
                            i30 = i17;
                        }
                        i29 += i18;
                        i28++;
                        i30 = i17;
                    }
                    dVar.O[i16] = ((i11 - dVar.Q) - i30) - i29;
                } else if (i24 == 3) {
                    int i32 = 0;
                    int i33 = 0;
                    int i34 = 4;
                    while (true) {
                        int i35 = dVar.N - i20;
                        if (i32 < i35) {
                            dVar.O[i32] = i21;
                            int i36 = i34 + 1;
                            dVar.j(pVar, i36);
                            if (vVar2.f8584a[i34] != 0) {
                                int i37 = i20;
                                int i38 = i21;
                                while (true) {
                                    if (i38 < 8) {
                                        int i39 = i37 << (7 - i38);
                                        i14 = i21;
                                        if ((vVar2.f8584a[i34] & i39) != 0) {
                                            i15 = i36 + i38;
                                            dVar.j(pVar, i15);
                                            j3 = vVar2.f8584a[i34] & i25 & (~i39);
                                            while (i36 < i15) {
                                                j3 = (j3 << 8) | (vVar2.f8584a[i36] & i25);
                                                i36++;
                                                i25 = 255;
                                            }
                                            if (i32 > 0) {
                                                j3 -= (1 << ((i38 * 7) + 6)) - 1;
                                            }
                                        } else {
                                            i38++;
                                            i21 = i14;
                                            i25 = 255;
                                        }
                                    } else {
                                        i14 = i21;
                                        j3 = 0;
                                        i15 = i36;
                                        break;
                                    }
                                }
                                if (j3 < -2147483648L || j3 > 2147483647L) {
                                    break;
                                }
                                int i40 = (int) j3;
                                int[] iArr4 = dVar.O;
                                if (i32 != 0) {
                                    i40 += iArr4[i32 - 1];
                                }
                                iArr4[i32] = i40;
                                i33 += i40;
                                i32++;
                                i34 = i15;
                                i20 = i37;
                                i21 = i14;
                                i25 = 255;
                            } else {
                                throw b2.s0.a(null, "No valid varint length mask found");
                            }
                        } else {
                            i12 = i20;
                            i13 = i21;
                            dVar.O[i35] = ((i11 - dVar.Q) - i34) - i33;
                            break;
                        }
                    }
                    throw b2.s0.a(null, "EBML lacing sample size out of range.");
                } else {
                    throw b2.s0.a(null, "Unexpected lacing value: " + i24);
                }
            }
            i12 = 1;
            i13 = 0;
            int i41 = vVar2.f8584a[i12] & 255;
            dVar.K = dVar.l(i41 | (bArr[i13] << 8)) + dVar.E;
            if (cVar3.f48778e != 2 && (i10 != 163 || (vVar2.f8584a[2] & 128) != 128)) {
                i19 = i13;
            } else {
                i19 = i12;
            }
            dVar.R = i19;
            dVar.J = 2;
            dVar.M = i13;
        } else {
            i12 = 1;
        }
        if (i10 == 163) {
            while (true) {
                int i42 = dVar.M;
                if (i42 < dVar.N) {
                    dVar.e(cVar3, ((dVar.M * cVar3.f48779f) / 1000) + dVar.K, dVar.R, dVar.n(pVar, cVar3, dVar.O[i42], false), 0);
                    dVar.M++;
                } else {
                    dVar.J = 0;
                    return;
                }
            }
        } else {
            while (true) {
                int i43 = dVar.M;
                if (i43 < dVar.N) {
                    int[] iArr5 = dVar.O;
                    boolean z10 = i12;
                    iArr5[i43] = dVar.n(pVar, cVar3, iArr5[i43], z10);
                    dVar.M += z10 ? 1 : 0;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public void k(int i10, int i11, CharSequence charSequence, boolean z10) {
        yi yiVar = (yi) this.f15331b;
        if (yiVar.o1() == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(yiVar.o1().getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                Emoji.replaceEmoji(spannableStringBuilder, yiVar.o1().getEditText().getPaint().getFontMetricsInt(), false);
            }
            yiVar.o1().setText(spannableStringBuilder);
            yiVar.o1().setSelection(i10 + charSequence.length());
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public void l(Canvas canvas) {
        mr0 mr0Var = (mr0) this.f15331b;
        canvas.drawColor(mr0Var.getThemedColor(i6.f20797d6));
        if (SharedConfig.chatBlurEnabled()) {
            mr0Var.O0.b(canvas, -3);
        }
    }

    public l5.j n() {
        Context context = (Context) this.f15331b;
        if (context != null) {
            ?? obj = new Object();
            obj.f15414a = n5.a.a(l5.m.f15421a);
            g0 g0Var = new g0(context, 7);
            obj.f15415b = g0Var;
            obj.f15416c = n5.a.a(new pf.b(g0Var, new f(g0Var, 3), false, 26));
            g0 g0Var2 = obj.f15415b;
            obj.d = new t(g0Var2, 16);
            gd.a a2 = n5.a.a(new b5(obj.d, n5.a.a(new m.f3(g0Var2, 20)), false, 15));
            obj.f15417e = a2;
            qb.b bVar = new qb.b(19);
            g0 g0Var3 = obj.f15415b;
            la.h hVar = new la.h(g0Var3, a2, bVar, 23);
            gd.a aVar = obj.f15414a;
            gd.a aVar2 = obj.f15416c;
            u5 u5Var = new u5(aVar, aVar2, hVar, a2, a2);
            ?? obj2 = new Object();
            obj2.f15795a = g0Var3;
            obj2.f15796b = aVar2;
            obj2.f15797c = a2;
            obj2.d = hVar;
            obj2.f15798e = aVar;
            obj2.f15799f = a2;
            obj2.h = a2;
            ?? obj3 = new Object();
            obj3.f17175a = aVar;
            obj3.f17176b = a2;
            obj3.f17177c = hVar;
            obj3.d = a2;
            obj.f15418f = n5.a.a(new aa.a(u5Var, obj2, obj3, false, 29));
            return obj;
        }
        throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
    }

    public s0.d o(int i10) {
        return null;
    }

    public s0.d p(int i10) {
        return null;
    }

    @Override
    public void q0(float f7) {
        w0 w0Var = (w0) this.f15331b;
        u0.e(w0Var.f46587a).k("-1", f7);
        w0Var.f46590e.setBrushSize(f7);
    }

    public void r(int i10, long j3) {
        u3.d dVar = (u3.d) this.f15331b;
        if (i10 != 20529) {
            if (i10 != 20530) {
                boolean z10 = false;
                switch (i10) {
                    case 131:
                        dVar.d(i10);
                        dVar.f48829x.f48778e = (int) j3;
                        return;
                    case 136:
                        dVar.d(i10);
                        u3.c cVar = dVar.f48829x;
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
                        dVar.f48829x.Q = (int) j3;
                        return;
                    case 176:
                        dVar.d(i10);
                        dVar.f48829x.f48786n = (int) j3;
                        return;
                    case 179:
                        dVar.b(i10);
                        dVar.F.c(dVar.l(j3));
                        return;
                    case 186:
                        dVar.d(i10);
                        dVar.f48829x.f48787o = (int) j3;
                        return;
                    case 215:
                        dVar.d(i10);
                        dVar.f48829x.d = (int) j3;
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
                            dVar.G.c(j3);
                            dVar.H = true;
                            return;
                        }
                        return;
                    case 251:
                        dVar.T = true;
                        return;
                    case 16871:
                        dVar.d(i10);
                        dVar.f48829x.h = (int) j3;
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
                        dVar.A = j3 + dVar.f48825s;
                        return;
                    case 21432:
                        int i11 = (int) j3;
                        dVar.d(i10);
                        if (i11 != 0) {
                            if (i11 != 1) {
                                if (i11 != 3) {
                                    if (i11 == 15) {
                                        dVar.f48829x.f48796y = 3;
                                        return;
                                    }
                                    return;
                                }
                                dVar.f48829x.f48796y = 1;
                                return;
                            }
                            dVar.f48829x.f48796y = 2;
                            return;
                        }
                        dVar.f48829x.f48796y = 0;
                        return;
                    case 21680:
                        dVar.d(i10);
                        dVar.f48829x.f48789q = (int) j3;
                        return;
                    case 21682:
                        dVar.d(i10);
                        dVar.f48829x.f48791s = (int) j3;
                        return;
                    case 21690:
                        dVar.d(i10);
                        dVar.f48829x.f48790r = (int) j3;
                        return;
                    case 21930:
                        dVar.d(i10);
                        u3.c cVar2 = dVar.f48829x;
                        if (j3 == 1) {
                            z10 = true;
                        }
                        cVar2.W = z10;
                        return;
                    case 21938:
                        dVar.d(i10);
                        u3.c cVar3 = dVar.f48829x;
                        cVar3.f48797z = true;
                        cVar3.f48788p = (int) j3;
                        return;
                    case 21998:
                        dVar.d(i10);
                        dVar.f48829x.f48780g = (int) j3;
                        return;
                    case 22186:
                        dVar.d(i10);
                        dVar.f48829x.T = j3;
                        return;
                    case 22203:
                        dVar.d(i10);
                        dVar.f48829x.U = j3;
                        return;
                    case 25188:
                        dVar.d(i10);
                        dVar.f48829x.R = (int) j3;
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
                                        dVar.f48829x.f48792t = 3;
                                        return;
                                    }
                                    return;
                                }
                                dVar.f48829x.f48792t = 2;
                                return;
                            }
                            dVar.f48829x.f48792t = 1;
                            return;
                        }
                        dVar.f48829x.f48792t = 0;
                        return;
                    case 2352003:
                        dVar.d(i10);
                        dVar.f48829x.f48779f = (int) j3;
                        return;
                    case 2807729:
                        dVar.f48826t = j3;
                        return;
                    default:
                        switch (i10) {
                            case 21945:
                                dVar.d(i10);
                                int i13 = (int) j3;
                                if (i13 != 1) {
                                    if (i13 == 2) {
                                        dVar.f48829x.C = 1;
                                        return;
                                    }
                                    return;
                                }
                                dVar.f48829x.C = 2;
                                return;
                            case 21946:
                                dVar.d(i10);
                                int g10 = b2.j.g((int) j3);
                                if (g10 != -1) {
                                    dVar.f48829x.B = g10;
                                    return;
                                }
                                return;
                            case 21947:
                                dVar.d(i10);
                                dVar.f48829x.f48797z = true;
                                int f7 = b2.j.f((int) j3);
                                if (f7 != -1) {
                                    dVar.f48829x.A = f7;
                                    return;
                                }
                                return;
                            case 21948:
                                dVar.d(i10);
                                dVar.f48829x.D = (int) j3;
                                return;
                            case 21949:
                                dVar.d(i10);
                                dVar.f48829x.E = (int) j3;
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

    public boolean t(int i10, int i11, Bundle bundle) {
        return false;
    }

    public void u(d1 d1Var, b2.q0 q0Var, b2.q0 q0Var2) {
        int i10;
        int i11;
        boolean z10;
        d1 T;
        int i12;
        RecyclerView recyclerView = (RecyclerView) this.f15331b;
        recyclerView.f3140b.k(d1Var);
        recyclerView.h(d1Var);
        d1Var.q(false);
        g1 g1Var = (g1) recyclerView.f3143c0;
        g1Var.getClass();
        int i13 = q0Var.f3533a;
        int i14 = q0Var.f3534b;
        View view = d1Var.f47658a;
        if (q0Var2 == null) {
            i10 = view.getLeft();
        } else {
            i10 = q0Var2.f3533a;
        }
        int i15 = i10;
        if (q0Var2 == null) {
            i11 = view.getTop();
        } else {
            i11 = q0Var2.f3534b;
        }
        int i16 = i11;
        if (!d1Var.j() && (i13 != i15 || i14 != i16)) {
            view.layout(i15, i16, view.getWidth() + i15, view.getHeight() + i16);
            z10 = g1Var.r(d1Var, q0Var, i13, i14, i15, i16);
        } else {
            int i17 = d1Var.h;
            int i18 = -1;
            if (i17 != -1) {
                for (int i19 = 0; i19 < recyclerView.getChildCount(); i19++) {
                    View childAt = recyclerView.getChildAt(i19);
                    if (childAt != null && (T = recyclerView.T(childAt)) != null && !T.j() && (i12 = T.h) >= 0 && i12 < i17 && i12 > i18) {
                        i18 = i12;
                    }
                }
            }
            d1Var.f47664i = (d1Var.h - i18) + (i18 * 1000);
            g1Var.s(d1Var, q0Var);
            z10 = true;
        }
        if (z10) {
            recyclerView.l0();
        }
    }

    @Override
    public View u0(int i10) {
        return ((p0) this.f15331b).q(i10);
    }

    public void v(String str, Bitmap bitmap) {
        Integer num = (Integer) n4.m.f16583c.get(str);
        if (num != null && num.intValue() != 2) {
            throw new IllegalArgumentException(a1.g.q("The ", str, " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.f15331b).putParcelable(str, bitmap);
    }

    @Override
    public void w() {
        uf0 uf0Var = ((vf0) this.f15331b).f31767a;
        if (uf0Var != null) {
            ((ts0) uf0Var).f42119a.f33904e0.invalidate();
        }
    }

    @Override
    public int w0(View view) {
        return p0.y(view) + ((ViewGroup.MarginLayoutParams) ((q0) view.getLayoutParams())).rightMargin;
    }

    @Override
    public void x(Object obj) {
        ((g8.c) obj).onLocationAvailability((LocationAvailability) this.f15331b);
    }

    public void y(long j3, String str) {
        Integer num = (Integer) n4.m.f16583c.get(str);
        if (num != null && num.intValue() != 0) {
            throw new IllegalArgumentException(a1.g.q("The ", str, " key cannot be used to put a long"));
        }
        ((Bundle) this.f15331b).putLong(str, j3);
    }

    public void z(String str, n4.g0 g0Var) {
        Rating rating;
        float f7 = g0Var.f16568b;
        int i10 = g0Var.f16567a;
        Integer num = (Integer) n4.m.f16583c.get(str);
        if (num != null && num.intValue() != 3) {
            throw new IllegalArgumentException(a1.g.q("The ", str, " key cannot be used to put a Rating"));
        }
        Bundle bundle = (Bundle) this.f15331b;
        if (g0Var.f16569c == null) {
            if (g0Var.b()) {
                boolean z10 = true;
                switch (i10) {
                    case 1:
                        if (i10 != 1 || f7 != 1.0f) {
                            z10 = false;
                        }
                        g0Var.f16569c = Rating.newHeartRating(z10);
                        break;
                    case 2:
                        if (i10 != 2 || f7 != 1.0f) {
                            z10 = false;
                        }
                        g0Var.f16569c = Rating.newThumbRating(z10);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        g0Var.f16569c = Rating.newStarRating(i10, g0Var.a());
                        break;
                    case 6:
                        g0Var.f16569c = Rating.newPercentageRating((i10 == 6 && g0Var.b()) ? -1.0f : -1.0f);
                        break;
                    default:
                        rating = null;
                        break;
                }
                bundle.putParcelable(str, rating);
            }
            g0Var.f16569c = Rating.newUnratedRating(i10);
        }
        rating = g0Var.f16569c;
        bundle.putParcelable(str, rating);
    }

    @Override
    public String z0() {
        return null;
    }

    public f(Object obj, int i10) {
        this.f15330a = i10;
        this.f15331b = obj;
    }

    public f(s6.g gVar, s6.a aVar) {
        this.f15330a = 25;
        this.f15331b = aVar;
    }

    public f(int i10, int i11, int[] iArr) {
        this.f15330a = 9;
        a70[] a70VarArr = new a70[(iArr.length / 2) + 1];
        this.f15331b = a70VarArr;
        a70 a70Var = new a70(i10, i11);
        int i12 = 0;
        a70VarArr[0] = a70Var;
        while (i12 < iArr.length / 2) {
            int i13 = i12 + 1;
            int i14 = i12 * 2;
            ((a70[]) this.f15331b)[i13] = new a70(iArr[i14], iArr[i14 + 1]);
            i12 = i13;
        }
    }

    public f(v1.c[] initializers) {
        this.f15330a = 28;
        kotlin.jvm.internal.i.e(initializers, "initializers");
        this.f15331b = initializers;
    }

    @Override
    public float get() {
        w0 w0Var = (w0) this.f15331b;
        int i10 = w0Var.f46587a;
        pg.m currentBrush = w0Var.f46590e.getCurrentBrush();
        if (currentBrush == null) {
            return u0.e(i10).f45806i;
        }
        return u0.e(i10).f("-1", currentBrush.d());
    }

    public f(TextView textView) {
        this.f15330a = 18;
        this.f15331b = new q1.g(textView);
    }

    public f(Context context, Uri uri) {
        this.f15330a = 6;
        this.f15331b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public f(int i10) {
        this.f15330a = i10;
        switch (i10) {
            case 7:
                this.f15331b = new LinkedHashMap(5, 1.0f, false);
                return;
            case 22:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f15331b = new ei0(this);
                    return;
                } else {
                    this.f15331b = new ei0(this);
                    return;
                }
            default:
                this.f15331b = new Bundle();
                return;
        }
    }

    @Override
    public void onDismiss() {
    }

    @Override
    public void P0(MrzRecognizer.Result result) {
    }

    @Override
    public void d(int i10) {
    }

    @Override
    public void g(int i10) {
    }

    @Override
    public void m(String str) {
    }

    @Override
    public void e(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }

    @Override
    public void i(TLRPC.TL_document tL_document, String str, Object obj) {
    }
}
