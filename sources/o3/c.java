package o3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Parcel;
import android.util.Log;
import android.util.SparseArray;
import android.widget.EditText;
import b7.q1;
import b7.r1;
import cg.f1;
import cg.f2;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import dg.s2;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k7.p7;
import n7.qa;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.k0;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.z8;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.io0;
import org.telegram.ui.Components.lq0;
import org.telegram.ui.Components.ng0;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.ye0;
import org.telegram.ui.Components.ze0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.es0;
import org.telegram.ui.o9;
import org.telegram.ui.ob1;
import org.telegram.ui.ui0;
import org.telegram.ui.w9;
import org.telegram.ui.web.c1;
import ph.h9;
import tf.i1;
import vh.d2;
import vh.e1;
import vh.h0;
import vh.h4;
import vh.j4;
import vh.o3;
import vh.s3;
import vh.y1;
public final class c implements com.google.android.gms.common.api.internal.s, io0, xd.d, yf.m, f71, i1, w9, s2, OnCompleteListener, ra.m, t5.a, v0.i, eo0, y4, h0, v4.f {
    public final int f16227a;
    public Object f16228b;

    public c() {
        this.f16227a = 22;
    }

    @Override
    public void A(float f10) {
        h9 h9Var = (h9) this.f16228b;
        f1.e(h9Var.C1).k(String.valueOf(cg.m.f2430a.indexOf(h9Var.L0.getCurrentBrush())), f10);
        f2 f2Var = h9Var.f41410x1;
        f2Var.f2386c = f10;
        h9Var.E0(f2Var, null, false);
    }

    @Override
    public String C0() {
        return ((c1) this.f16228b).f39390f0;
    }

    @Override
    public void G1(boolean z4) {
        ze0 ze0Var = (ze0) this.f16228b;
        ze0Var.getClass();
        ye0 ye0Var = ze0Var.f31371a;
        if (ye0Var != null) {
            ((es0) ye0Var).a(z4);
        }
    }

    @Override
    public a0.h H0() {
        return null;
    }

    @Override
    public void J(int i10, int i11, boolean z4) {
        y1 y1Var = (y1) this.f16228b;
        y1Var.s0(i10, i11, z4);
        ui0 ui0Var = y1Var.L0;
        if (ui0Var != null) {
            ui0Var.i();
            y1Var.L0 = null;
        }
    }

    @Override
    public l9 J0() {
        h4 h4Var = ((j4) this.f16228b).D;
        if (h4Var != null) {
            return ((o3) h4Var).f46123a.getTextSelectionHelper();
        }
        return null;
    }

    @Override
    public void K(String str) {
        c1 c1Var = (c1) this.f16228b;
        try {
            c1Var.M = System.currentTimeMillis();
            c1Var.y("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e) {
            FileLog.e(e);
        }
    }

    @Override
    public void L0(CharSequence charSequence) {
        h4 h4Var = ((j4) this.f16228b).D;
        if (h4Var != null) {
            o3 o3Var = (o3) h4Var;
            o3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                o3Var.f46123a.s4(charSequence.toString());
            }
        }
    }

    @Override
    public void M0(boolean z4) {
        ((ze0) this.f16228b).f31373c.setAspectLock(z4);
    }

    @Override
    public k9 O0() {
        return (j4) this.f16228b;
    }

    @Override
    public vh.a T0() {
        return ((j4) this.f16228b).f46414a;
    }

    @Override
    public a0.h X0() {
        return null;
    }

    @Override
    public void Y(float f10, boolean z4) {
        ob1 ob1Var = (ob1) ((k0) this.f16228b);
        int i10 = (int) (j6.f20108q * 100.0f);
        int i11 = (int) (f10 * 100.0f);
        j6.f20108q = f10;
        if (i10 != i11) {
            ThemeActivity themeActivity = ob1Var.e.e;
            dl0 dl0Var = (dl0) themeActivity.f32307b.K(themeActivity.f32310c0);
            if (dl0Var != null) {
                ((z8) dl0Var.f5774a).setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (j6.f20108q * 100.0f))));
            }
            j6.E(true);
        }
    }

    @Override
    public boolean Y0() {
        j4 j4Var = (j4) this.f16228b;
        h4 h4Var = j4Var.D;
        if (h4Var != null) {
            vh.a aVar = j4Var.f46414a;
            if (((o3) h4Var).f46123a.R4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public boolean a1(String str, o9 o9Var) {
        return false;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f16227a) {
            case 1:
                o7.d dVar = new o7.d(0, (TaskCompletionSource) obj2);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i10 = o7.a.f16442a;
                obtain.writeStrongBinder(dVar);
                obtain.writeInt(1);
                ((z7.a) this.f16228b).writeToParcel(obtain, 0);
                ((o7.c) ((o7.f) obj).u()).E0(obtain, 2);
                return;
            case 10:
                p6.b bVar = new p6.b(0, (TaskCompletionSource) obj2);
                r1 r1Var = (r1) ((q1) obj).u();
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(r1Var.f1737b);
                int i11 = b7.l.f1709a;
                obtain2.writeStrongBinder(bVar);
                obtain2.writeInt(1);
                ((q6.v) this.f16228b).writeToParcel(obtain2, 0);
                Parcel obtain3 = Parcel.obtain();
                try {
                    r1Var.f1736a.transact(1, obtain2, obtain3, 0);
                    obtain3.readException();
                    return;
                } finally {
                    obtain2.recycle();
                    obtain3.recycle();
                }
            case 21:
                u5.r rVar = new u5.r(1, (TaskCompletionSource) obj2);
                u5.i iVar = (u5.i) ((u5.t) obj).u();
                Parcel M0 = iVar.M0();
                com.google.android.gms.internal.cast.t.d(M0, rVar);
                M0.writeStringArray((String[]) this.f16228b);
                iVar.R0(M0, 6);
                return;
            default:
                v6.f fVar = new v6.f(0, (TaskCompletionSource) obj2);
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain4 = Parcel.obtain();
                obtain4.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i12 = e7.a.f5158a;
                obtain4.writeStrongBinder(fVar);
                e7.a.b(obtain4, (u6.f) this.f16228b);
                e7.a.b(obtain4, gVar);
                ((v6.b) ((v6.d) ((v6.e) obj).u())).E0(obtain4, 6);
                return;
        }
    }

    @Override
    public void b(float f10) {
        vh.y yVar = (vh.y) this.f16228b;
        MessageObject messageObject = yVar.M;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f10;
        MediaController.getInstance().seekToProgress(yVar.M, f10);
    }

    @Override
    public void c(e1 e1Var) {
        h4 h4Var = ((j4) this.f16228b).D;
        if (h4Var != null) {
            s3 s3Var = ((o3) h4Var).f46123a;
            s3.L1(s3Var, e1Var);
            s3Var.f46209e3.d(e1Var, true);
        }
    }

    @Override
    public void d(float f10) {
        MessageObject messageObject = ((vh.y) this.f16228b).M;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f10;
    }

    @Override
    public void d2() {
        ye0 ye0Var = ((ze0) this.f16228b).f31371a;
        if (ye0Var != null) {
            PhotoViewer photoViewer = ((es0) ye0Var).f33848a;
            if (photoViewer.Z1 == 1) {
                photoViewer.E2 = true;
                photoViewer.q3();
            }
        }
    }

    @Override
    public int e(long j10) {
        if (j10 < 0) {
            return 0;
        }
        return -1;
    }

    @Override
    public void f1(int i10, int i11) {
        j4 j4Var = (j4) this.f16228b;
        h4 h4Var = j4Var.D;
        if (h4Var != null) {
            vh.a aVar = j4Var.f46414a;
            d2 d2Var = ((o3) h4Var).f46123a.G3;
            if (d2Var != null) {
                d2Var.f(i10, i11);
            }
        }
    }

    @Override
    public boolean g() {
        return false;
    }

    @Override
    public float get() {
        h9 h9Var = (h9) this.f16228b;
        int i10 = h9Var.C1;
        cg.m currentBrush = h9Var.L0.getCurrentBrush();
        if (currentBrush == null) {
            return f1.e(i10).f2380i;
        }
        return f1.e(i10).f(String.valueOf(cg.m.f2430a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override
    public CharSequence getContentDescription() {
        return " ";
    }

    @Override
    public long h(int i10) {
        boolean z4;
        if (i10 == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.f(z4);
        return 0L;
    }

    @Override
    public void h2() {
        j4 j4Var = (j4) this.f16228b;
        h4 h4Var = j4Var.D;
        if (h4Var != null) {
            vh.a aVar = j4Var.f46414a;
            s3.N1(((o3) h4Var).f46123a);
        }
    }

    @Override
    public boolean i(float f10) {
        return false;
    }

    @Override
    public int j0() {
        return 0;
    }

    @Override
    public void k(int i10) {
        hq0 hq0Var = (hq0) this.f16228b;
        lq0 lq0Var = hq0Var.H;
        hq0Var.f25480s = i10;
        if (hq0Var.v != i10) {
            hq0Var.d.clear();
        }
        int i11 = hq0Var.G;
        if (hq0Var.h() == 0 && !hq0Var.e.e() && !hq0Var.F) {
            lq0Var.N.e(false, true);
        } else {
            lq0Var.f26857u0.b(i11);
        }
        hq0Var.l();
        int i12 = lq0.X0;
        lq0Var.K0(true);
    }

    @Override
    public void l() {
        j4 j4Var = (j4) this.f16228b;
        h4 h4Var = j4Var.D;
        if (h4Var != null) {
            s3.O1(((o3) h4Var).f46123a, j4Var.f46414a);
        }
    }

    public void m(HashMap hashMap) {
        if (((SparseArray) this.f16228b) == null) {
            this.f16228b = new SparseArray(hashMap.size());
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            ((SparseArray) this.f16228b).put(((String) entry.getKey()).hashCode(), (String) entry.getValue());
        }
    }

    public void n(int i10, int i11, r3.l lVar) {
        char c3;
        char c10;
        long j10;
        int i12;
        int i13;
        int i14;
        int i15;
        byte[] bArr;
        int i16;
        x3.d dVar = (x3.d) this.f16228b;
        x3.e eVar = dVar.f46810b;
        SparseArray sparseArray = dVar.f46812c;
        h5.w wVar = dVar.f46815i;
        h5.w wVar2 = dVar.f46814g;
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
                                        dVar.b(i10);
                                        byte[] bArr2 = new byte[i11];
                                        dVar.f46827u.v = bArr2;
                                        lVar.readFully(bArr2, 0, i11);
                                        return;
                                    }
                                    throw j3.r1.a("Unexpected id: " + i10, null);
                                }
                                dVar.b(i10);
                                byte[] bArr3 = new byte[i11];
                                dVar.f46827u.f46787k = bArr3;
                                lVar.readFully(bArr3, 0, i11);
                                return;
                            }
                            Arrays.fill(wVar.f6987a, (byte) 0);
                            lVar.readFully(wVar.f6987a, 4 - i11, i11);
                            wVar.F(0);
                            dVar.f46828w = (int) wVar.v();
                            return;
                        }
                        byte[] bArr4 = new byte[i11];
                        lVar.readFully(bArr4, 0, i11);
                        dVar.b(i10);
                        dVar.f46827u.f46786j = new r3.u(1, 0, 0, bArr4);
                        return;
                    }
                    dVar.b(i10);
                    byte[] bArr5 = new byte[i11];
                    dVar.f46827u.f46785i = bArr5;
                    lVar.readFully(bArr5, 0, i11);
                    return;
                }
                dVar.b(i10);
                x3.c cVar = dVar.f46827u;
                int i19 = cVar.f46784g;
                if (i19 != 1685485123 && i19 != 1685480259) {
                    lVar.n(i11);
                    return;
                }
                byte[] bArr6 = new byte[i11];
                cVar.N = bArr6;
                lVar.readFully(bArr6, 0, i11);
                return;
            } else if (dVar.G == 2) {
                x3.c cVar2 = (x3.c) sparseArray.get(dVar.M);
                int i20 = dVar.P;
                h5.w wVar3 = dVar.f46820n;
                if (i20 == 4 && "V_VP9".equals(cVar2.f46781b)) {
                    wVar3.C(i11);
                    lVar.readFully(wVar3.f6987a, 0, i11);
                    return;
                }
                lVar.n(i11);
                return;
            } else {
                return;
            }
        }
        if (dVar.G == 0) {
            dVar.M = (int) eVar.b(lVar, false, true, 8);
            dVar.N = eVar.f46834c;
            dVar.I = -9223372036854775807L;
            dVar.G = 1;
            wVar2.C(0);
        }
        x3.c cVar3 = (x3.c) sparseArray.get(dVar.M);
        if (cVar3 == null) {
            lVar.n(i11 - dVar.N);
            dVar.G = 0;
            return;
        }
        cVar3.X.getClass();
        if (dVar.G == 1) {
            dVar.g(lVar, 3);
            int i21 = (wVar2.f6987a[2] & 6) >> 1;
            byte b10 = 255;
            if (i21 == 0) {
                dVar.K = 1;
                int[] iArr = dVar.L;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                dVar.L = iArr;
                iArr[0] = (i11 - dVar.N) - 3;
            } else {
                dVar.g(lVar, 4);
                int i22 = (wVar2.f6987a[3] & 255) + 1;
                dVar.K = i22;
                int[] iArr2 = dVar.L;
                if (iArr2 == null) {
                    iArr2 = new int[i22];
                } else if (iArr2.length < i22) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i22)];
                }
                dVar.L = iArr2;
                if (i21 == 2) {
                    int i23 = dVar.K;
                    Arrays.fill(iArr2, 0, i23, ((i11 - dVar.N) - 4) / i23);
                } else if (i21 == 1) {
                    int i24 = 0;
                    int i25 = 0;
                    int i26 = 4;
                    while (true) {
                        i13 = dVar.K - 1;
                        if (i24 >= i13) {
                            break;
                        }
                        dVar.L[i24] = 0;
                        while (true) {
                            i14 = i26 + 1;
                            dVar.g(lVar, i14);
                            int i27 = wVar2.f6987a[i26] & 255;
                            int[] iArr3 = dVar.L;
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
                    dVar.L[i13] = ((i11 - dVar.N) - i26) - i25;
                } else if (i21 == 3) {
                    int i28 = 0;
                    int i29 = 0;
                    int i30 = 4;
                    while (true) {
                        int i31 = dVar.K - i17;
                        if (i28 < i31) {
                            dVar.L[i28] = i18;
                            int i32 = i30 + 1;
                            dVar.g(lVar, i32);
                            if (wVar2.f6987a[i30] != 0) {
                                int i33 = 0;
                                while (true) {
                                    if (i33 < 8) {
                                        int i34 = 1 << (7 - i33);
                                        if ((wVar2.f6987a[i30] & i34) != 0) {
                                            i12 = i32 + i33;
                                            dVar.g(lVar, i12);
                                            j10 = wVar2.f6987a[i30] & b10 & (~i34);
                                            while (i32 < i12) {
                                                j10 = (j10 << 8) | (wVar2.f6987a[i32] & b10);
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
                                int[] iArr4 = dVar.L;
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
                                throw j3.r1.a("No valid varint length mask found", null);
                            }
                        } else {
                            c3 = 1;
                            c10 = 0;
                            dVar.L[i31] = ((i11 - dVar.N) - i30) - i29;
                            break;
                        }
                    }
                    throw j3.r1.a("EBML lacing sample size out of range.", null);
                } else {
                    throw j3.r1.a("Unexpected lacing value: " + i21, null);
                }
            }
            c3 = 1;
            c10 = 0;
            int i36 = wVar2.f6987a[c3] & 255;
            dVar.H = dVar.k(i36 | (bArr[c10] << 8)) + dVar.B;
            if (cVar3.d != 2 && (i10 != 163 || (wVar2.f6987a[2] & 128) != 128)) {
                i16 = 0;
            } else {
                i16 = 1;
            }
            dVar.O = i16;
            dVar.G = 2;
            dVar.J = 0;
        }
        if (i10 == 163) {
            while (true) {
                int i37 = dVar.J;
                if (i37 < dVar.K) {
                    dVar.c(cVar3, ((dVar.J * cVar3.e) / 1000) + dVar.H, dVar.O, dVar.l(lVar, cVar3, dVar.L[i37], false), 0);
                    dVar.J++;
                } else {
                    dVar.G = 0;
                    return;
                }
            }
        } else {
            while (true) {
                int i38 = dVar.J;
                if (i38 < dVar.K) {
                    int[] iArr5 = dVar.L;
                    iArr5[i38] = dVar.l(lVar, cVar3, iArr5[i38], true);
                    dVar.J++;
                } else {
                    return;
                }
            }
        }
    }

    public void o(int i10, long j10) {
        x3.d dVar = (x3.d) this.f16228b;
        if (i10 != 20529) {
            if (i10 != 20530) {
                boolean z4 = false;
                switch (i10) {
                    case 131:
                        dVar.b(i10);
                        dVar.f46827u.d = (int) j10;
                        return;
                    case 136:
                        dVar.b(i10);
                        x3.c cVar = dVar.f46827u;
                        if (j10 == 1) {
                            z4 = true;
                        }
                        cVar.V = z4;
                        return;
                    case 155:
                        dVar.I = dVar.k(j10);
                        return;
                    case 159:
                        dVar.b(i10);
                        dVar.f46827u.O = (int) j10;
                        return;
                    case 176:
                        dVar.b(i10);
                        dVar.f46827u.f46789m = (int) j10;
                        return;
                    case 179:
                        dVar.a(i10);
                        dVar.C.e(dVar.k(j10));
                        return;
                    case 186:
                        dVar.b(i10);
                        dVar.f46827u.f46790n = (int) j10;
                        return;
                    case 215:
                        dVar.b(i10);
                        dVar.f46827u.f46782c = (int) j10;
                        return;
                    case 231:
                        dVar.B = dVar.k(j10);
                        return;
                    case 238:
                        dVar.P = (int) j10;
                        return;
                    case 241:
                        if (!dVar.E) {
                            dVar.a(i10);
                            dVar.D.e(j10);
                            dVar.E = true;
                            return;
                        }
                        return;
                    case 251:
                        dVar.Q = true;
                        return;
                    case 16871:
                        dVar.b(i10);
                        dVar.f46827u.f46784g = (int) j10;
                        return;
                    case 16980:
                        if (j10 != 3) {
                            throw j3.r1.a("ContentCompAlgo " + j10 + " not supported", null);
                        }
                        return;
                    case 17029:
                        if (j10 < 1 || j10 > 2) {
                            throw j3.r1.a("DocTypeReadVersion " + j10 + " not supported", null);
                        }
                        return;
                    case 17143:
                        if (j10 != 1) {
                            throw j3.r1.a("EBMLReadVersion " + j10 + " not supported", null);
                        }
                        return;
                    case 18401:
                        if (j10 != 5) {
                            throw j3.r1.a("ContentEncAlgo " + j10 + " not supported", null);
                        }
                        return;
                    case 18408:
                        if (j10 != 1) {
                            throw j3.r1.a("AESSettingsCipherMode " + j10 + " not supported", null);
                        }
                        return;
                    case 21420:
                        dVar.f46829x = j10 + dVar.f46823q;
                        return;
                    case 21432:
                        int i11 = (int) j10;
                        dVar.b(i10);
                        if (i11 != 0) {
                            if (i11 != 1) {
                                if (i11 != 3) {
                                    if (i11 == 15) {
                                        dVar.f46827u.f46798w = 3;
                                        return;
                                    }
                                    return;
                                }
                                dVar.f46827u.f46798w = 1;
                                return;
                            }
                            dVar.f46827u.f46798w = 2;
                            return;
                        }
                        dVar.f46827u.f46798w = 0;
                        return;
                    case 21680:
                        dVar.b(i10);
                        dVar.f46827u.f46791o = (int) j10;
                        return;
                    case 21682:
                        dVar.b(i10);
                        dVar.f46827u.f46793q = (int) j10;
                        return;
                    case 21690:
                        dVar.b(i10);
                        dVar.f46827u.f46792p = (int) j10;
                        return;
                    case 21930:
                        dVar.b(i10);
                        x3.c cVar2 = dVar.f46827u;
                        if (j10 == 1) {
                            z4 = true;
                        }
                        cVar2.U = z4;
                        return;
                    case 21998:
                        dVar.b(i10);
                        dVar.f46827u.f46783f = (int) j10;
                        return;
                    case 22186:
                        dVar.b(i10);
                        dVar.f46827u.R = j10;
                        return;
                    case 22203:
                        dVar.b(i10);
                        dVar.f46827u.S = j10;
                        return;
                    case 25188:
                        dVar.b(i10);
                        dVar.f46827u.P = (int) j10;
                        return;
                    case 30114:
                        dVar.R = j10;
                        return;
                    case 30321:
                        dVar.b(i10);
                        int i12 = (int) j10;
                        if (i12 != 0) {
                            if (i12 != 1) {
                                if (i12 != 2) {
                                    if (i12 == 3) {
                                        dVar.f46827u.f46794r = 3;
                                        return;
                                    }
                                    return;
                                }
                                dVar.f46827u.f46794r = 2;
                                return;
                            }
                            dVar.f46827u.f46794r = 1;
                            return;
                        }
                        dVar.f46827u.f46794r = 0;
                        return;
                    case 2352003:
                        dVar.b(i10);
                        dVar.f46827u.e = (int) j10;
                        return;
                    case 2807729:
                        dVar.f46824r = j10;
                        return;
                    default:
                        switch (i10) {
                            case 21945:
                                dVar.b(i10);
                                int i13 = (int) j10;
                                if (i13 != 1) {
                                    if (i13 == 2) {
                                        dVar.f46827u.A = 1;
                                        return;
                                    }
                                    return;
                                }
                                dVar.f46827u.A = 2;
                                return;
                            case 21946:
                                dVar.b(i10);
                                int c3 = i5.b.c((int) j10);
                                if (c3 != -1) {
                                    dVar.f46827u.f46801z = c3;
                                    return;
                                }
                                return;
                            case 21947:
                                dVar.b(i10);
                                dVar.f46827u.f46799x = true;
                                int b10 = i5.b.b((int) j10);
                                if (b10 != -1) {
                                    dVar.f46827u.f46800y = b10;
                                    return;
                                }
                                return;
                            case 21948:
                                dVar.b(i10);
                                dVar.f46827u.B = (int) j10;
                                return;
                            case 21949:
                                dVar.b(i10);
                                dVar.f46827u.C = (int) j10;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j10 != 1) {
                throw j3.r1.a("ContentEncodingScope " + j10 + " not supported", null);
            }
        } else if (j10 == 0) {
        } else {
            throw j3.r1.a("ContentEncodingOrder " + j10 + " not supported", null);
        }
    }

    @Override
    public void onComplete(Task task) {
        r5.c.h((r5.c) ((r5.j) this.f16228b).f43397c, "launchApplication", task);
    }

    @Override
    public void onDismiss() {
        c1 c1Var = (c1) this.f16228b;
        c1Var.y("scan_qr_popup_closed", null);
        c1Var.f39388e0 = false;
    }

    @Override
    public void onError(i71 i71Var, Exception exc) {
    }

    @Override
    public void onRenderedFirstFrame(k3.a aVar) {
    }

    @Override
    public void onResult(Object obj) {
        v0.c result = (v0.c) obj;
        kotlin.jvm.internal.j.e(result, "result");
        ld.m mVar = (ld.m) this.f16228b;
        if (mVar.w()) {
            mVar.resumeWith(result);
        }
    }

    @Override
    public void onStateChanged(boolean z4, int i10) {
        qk0 qk0Var = (qk0) this.f16228b;
        if (z4 && qk0Var.f28204n.n() >= 0) {
            qk0Var.f28207w = true;
        }
        ng0 ng0Var = qk0Var.f28203f;
        dc0 dc0Var = qk0Var.f28208x;
        ng0Var.a(z4, true);
        AndroidUtilities.cancelRunOnUIThread(dc0Var);
        if (z4) {
            AndroidUtilities.runOnUIThread(dc0Var, 16L);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void p(Bitmap bitmap) {
        u5.b bVar = t5.h.v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f10 = width;
            int height = bitmap.getHeight();
            int d = (int) android.support.v4.media.a.d(f10, 9.0f, 16.0f, 0.5f);
            float f11 = (d - height) / 2.0f;
            RectF rectF = new RectF(0.0f, f11, f10, height + f11);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, d, config);
            new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = createBitmap;
        }
        ((t5.h) this.f16228b).e(bitmap2, 0);
    }

    @Override
    public List q(long j10) {
        if (j10 >= 0) {
            return (List) this.f16228b;
        }
        return Collections.EMPTY_LIST;
    }

    @Override
    public int r() {
        return 1;
    }

    @Override
    public void r0() {
        ye0 ye0Var = ((ze0) this.f16228b).f31371a;
        if (ye0Var != null) {
            ((es0) ye0Var).f33848a.f31679b0.invalidate();
        }
    }

    public p9.b s(JSONObject jSONObject) {
        p9.c uVar;
        int i10 = jSONObject.getInt("settings_version");
        if (i10 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.", null);
            uVar = new db.a(19);
        } else {
            uVar = new h7.u(19);
        }
        return uVar.K((cb.b) this.f16228b, jSONObject);
    }

    @Override
    public void s1() {
        j4 j4Var = (j4) this.f16228b;
        h4 h4Var = j4Var.D;
        if (h4Var != null) {
            vh.a aVar = j4Var.f46414a;
            s3 s3Var = ((o3) h4Var).f46123a;
            d2 d2Var = s3Var.G3;
            if (d2Var != null) {
                d2Var.g();
            }
            s3Var.f46209e3.onContentChanged();
        }
    }

    public void t() {
        s5.h hVar = (s5.h) this.f16228b;
        Iterator it = hVar.h.iterator();
        if (!it.hasNext()) {
            Iterator it2 = hVar.f44142i.iterator();
            while (it2.hasNext()) {
                ((s5.g) it2.next()).a();
            }
            return;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override
    public boolean t1(int i10) {
        if (i10 == ((hq0) this.f16228b).f25479r) {
            return true;
        }
        return false;
    }

    public String toString() {
        switch (this.f16227a) {
            case 14:
                return "<" + ((String) this.f16228b) + '>';
            default:
                return super.toString();
        }
    }

    @Override
    public Object u2() {
        Type type = (Type) this.f16228b;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return new EnumMap((Class) type2);
            }
            throw new RuntimeException("Invalid EnumMap type: " + type.toString());
        }
        throw new RuntimeException("Invalid EnumMap type: " + type.toString());
    }

    @Override
    public void x() {
        ((f9) this.f16228b).f24821a.invalidate();
    }

    public c(com.google.android.gms.common.api.j jVar, Object obj, int i10) {
        this.f16227a = i10;
        this.f16228b = obj;
    }

    @Override
    public void onError(Object obj) {
        w0.d e = (w0.d) obj;
        kotlin.jvm.internal.j.e(e, "e");
        ld.m mVar = (ld.m) this.f16228b;
        if (mVar.w()) {
            mVar.resumeWith(p7.a(e));
        }
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public c(Object obj, int i10) {
        this.f16227a = i10;
        this.f16228b = obj;
    }

    public c(tp0 tp0Var) {
        this.f16227a = 9;
        this.f16228b = (com.google.android.gms.internal.play_billing.r) tp0Var.f29015b;
    }

    public c(EditText editText) {
        this.f16227a = 13;
        this.f16228b = new qa(editText);
    }

    @Override
    public void B() {
    }

    @Override
    public void a() {
    }

    @Override
    public void j() {
    }

    @Override
    public void J1(ArrayList arrayList) {
    }

    @Override
    public void P0(MrzRecognizer.Result result) {
    }

    @Override
    public void f(boolean z4) {
    }

    @Override
    public void onSeekFinished(k3.a aVar) {
    }

    @Override
    public void onSeekStarted(k3.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
    }
}
