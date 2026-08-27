package n2;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.text.Editable;
import android.util.Log;
import android.util.SparseArray;
import android.widget.TextView;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.tasks.OnSuccessListener;
import g7.i5;
import h3.t1;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import nh.j4;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k0;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.x8;
import org.telegram.ui.Components.d9;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.fe0;
import org.telegram.ui.Components.ge0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.l6;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.op0;
import org.telegram.ui.Components.pn0;
import org.telegram.ui.Components.sg;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.k9;
import org.telegram.ui.qa1;
import org.telegram.ui.rr0;
import org.telegram.ui.s9;
import org.telegram.ui.web.z0;
import org.telegram.ui.ys0;
import pf.i1;
import rh.b2;
import rh.c1;
import rh.d1;
import rh.g0;
import rh.i2;
import rh.k3;
import rh.p3;
import rh.v2;
import rh.w0;
import rh.w4;
import rh.y4;
import yf.p1;
import yf.r0;
import zf.v1;

public final class b0 implements androidx.activity.result.b, OnSuccessListener, o0.a, oa.m, pn0, ud.d, uf.m, j61, i1, s9, ei, g0, c1, v1 {

    public final int f18129a;

    public Object f18130b;

    public b0(Object obj, int i10) {
        this.f18129a = i10;
        this.f18130b = obj;
    }

    @Override
    public void C(String str) {
        z0 z0Var = (z0) this.f18130b;
        try {
            z0Var.L = System.currentTimeMillis();
            z0Var.v("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public void D(boolean z10) {
        ge0 ge0Var = (ge0) this.f18130b;
        ge0Var.getClass();
        fe0 fe0Var = ge0Var.f28601a;
        if (fe0Var != null) {
            ((rr0) fe0Var).a(z10);
        }
    }

    @Override
    public boolean D0(int i10) {
        return i10 == ((op0) this.f18130b).f31378r;
    }

    @Override
    public boolean E() {
        return false;
    }

    @Override
    public boolean G(float f10) {
        return false;
    }

    @Override
    public void H() {
        fe0 fe0Var = ((ge0) this.f18130b).f28601a;
        if (fe0Var != null) {
            PhotoViewer photoViewer = ((rr0) fe0Var).f42322a;
            if (photoViewer.Y1 == 1) {
                photoViewer.D2 = true;
                photoViewer.q3();
            }
        }
    }

    @Override
    public void I0() {
        w0 w0Var = (w0) this.f18130b;
        k3 k3Var = w0Var.O;
        if (k3Var != null) {
            rh.a aVar = w0Var.f47594a;
            p3 p3Var = k3Var.f47246a;
            b2 b2Var = p3Var.F3;
            if (b2Var != null) {
                b2Var.g();
            }
            p3Var.f47340d3.onContentChanged();
        }
    }

    @Override
    public a0.h J() {
        return null;
    }

    @Override
    public j9 N() {
        k3 k3Var = ((w0) this.f18130b).O;
        if (k3Var == null) {
            return null;
        }
        return k3Var.f47246a.getTextSelectionHelper();
    }

    @Override
    public boolean N0() {
        return false;
    }

    @Override
    public void N1(d1 d1Var, int i10, int i11) {
        w4 w4Var;
        j9 textSelectionHelper;
        y4 y4Var = (y4) this.f18130b;
        if (y4Var.f47611w || i10 == i11 || (w4Var = y4Var.f47610s) == null || (textSelectionHelper = ((v2) w4Var).f47519a.getTextSelectionHelper()) == null) {
            return;
        }
        d1Var.post(new j4(this, d1Var, i11, textSelectionHelper, i10, 5));
    }

    @Override
    public void P(float f10, boolean z10) {
        switch (this.f18129a) {
            case 7:
                qa1 qa1Var = (qa1) ((k0) this.f18130b);
                int i10 = (int) (g6.f23277q * 100.0f);
                int i11 = (int) (f10 * 100.0f);
                g6.f23277q = f10;
                if (i10 != i11) {
                    ThemeActivity themeActivity = qa1Var.f41589e.f43398e;
                    lk0 lk0Var = (lk0) themeActivity.f36230b.K(themeActivity.f36231b0);
                    if (lk0Var != null) {
                        ((x8) lk0Var.f5789a).setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (g6.f23277q * 100.0f))));
                    }
                    g6.E(true);
                }
                break;
            default:
                vf.h hVar = (vf.h) this.f18130b;
                float f11 = hVar.f48901b;
                float fZ = com.google.android.recaptcha.internal.a.z(hVar.f48902c, f11, f10, f11);
                hVar.d = fZ;
                if (z10) {
                    l6 l6Var = hVar.f48903e;
                    l6Var.getClass();
                    l6Var.c(null, fZ);
                }
                hVar.invalidate();
                break;
        }
    }

    @Override
    public void S(CharSequence charSequence) {
        k3 k3Var = ((w0) this.f18130b).O;
        if (k3Var != null) {
            k3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            k3Var.f47246a.t4(charSequence.toString());
        }
    }

    @Override
    public boolean T1(boolean z10) {
        return false;
    }

    @Override
    public void X0() {
        w0 w0Var = (w0) this.f18130b;
        k3 k3Var = w0Var.O;
        if (k3Var != null) {
            rh.a aVar = w0Var.f47594a;
            p3.O1(k3Var.f47246a);
        }
    }

    @Override
    public void a(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f18130b;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f907b;
        int i10 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).f18147a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.J;
        if (resultReceiver != null) {
            resultReceiver.send(i10, intent == null ? null : intent.getExtras());
        }
        int i11 = aVar.f906a;
        if (i11 != -1 || i10 != 0) {
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i11 + " and billing's responseCode: " + i10);
        }
        proxyBillingActivityV2.finish();
    }

    @Override
    public int a0() {
        switch (this.f18129a) {
        }
        return 0;
    }

    public void c(HashMap map) {
        if (((SparseArray) this.f18130b) == null) {
            this.f18130b = new SparseArray(map.size());
        }
        for (Map.Entry entry : map.entrySet()) {
            ((SparseArray) this.f18130b).put(((String) entry.getKey()).hashCode(), (String) entry.getValue());
        }
    }

    @Override
    public void c0(float f10) {
        ys0 ys0Var = (ys0) this.f18130b;
        r0.e(ys0Var.L1).k(String.valueOf(yf.m.f49979a.indexOf(ys0Var.S0.getCurrentBrush())), f10);
        p1 p1Var = ys0Var.G1;
        p1Var.f50036c = f10;
        ys0Var.s0(p1Var, null);
    }

    @Override
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f18130b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override
    public Cursor d(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f18130b;
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

    public void e(int i10, int i11, m3.l lVar) throws t1 {
        char c10;
        char c11;
        long j10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        s3.e eVar = (s3.e) this.f18130b;
        s3.f fVar = eVar.f47700b;
        SparseArray sparseArray = eVar.f47702c;
        d5.z zVar = eVar.f47706i;
        d5.z zVar2 = eVar.f47705g;
        int i17 = 1;
        int i18 = 0;
        if (i10 != 161 && i10 != 163) {
            if (i10 == 165) {
                if (eVar.G != 2) {
                    return;
                }
                s3.d dVar = (s3.d) sparseArray.get(eVar.M);
                int i19 = eVar.P;
                d5.z zVar3 = eVar.f47711n;
                if (i19 != 4 || !"V_VP9".equals(dVar.f47670b)) {
                    lVar.t(i11);
                    return;
                } else {
                    zVar3.z(i11);
                    lVar.readFully(zVar3.f4858a, 0, i11);
                    return;
                }
            }
            if (i10 == 16877) {
                eVar.d(i10);
                s3.d dVar2 = eVar.f47718u;
                int i20 = dVar2.f47674g;
                if (i20 != 1685485123 && i20 != 1685480259) {
                    lVar.t(i11);
                    return;
                }
                byte[] bArr = new byte[i11];
                dVar2.N = bArr;
                lVar.readFully(bArr, 0, i11);
                return;
            }
            if (i10 == 16981) {
                eVar.d(i10);
                byte[] bArr2 = new byte[i11];
                eVar.f47718u.f47675i = bArr2;
                lVar.readFully(bArr2, 0, i11);
                return;
            }
            if (i10 == 18402) {
                byte[] bArr3 = new byte[i11];
                lVar.readFully(bArr3, 0, i11);
                eVar.d(i10);
                eVar.f47718u.f47676j = new m3.v(1, 0, 0, bArr3);
                return;
            }
            if (i10 == 21419) {
                Arrays.fill(zVar.f4858a, (byte) 0);
                lVar.readFully(zVar.f4858a, 4 - i11, i11);
                zVar.C(0);
                eVar.f47719w = (int) zVar.s();
                return;
            }
            if (i10 == 25506) {
                eVar.d(i10);
                byte[] bArr4 = new byte[i11];
                eVar.f47718u.f47677k = bArr4;
                lVar.readFully(bArr4, 0, i11);
                return;
            }
            if (i10 != 30322) {
                throw t1.a("Unexpected id: " + i10, null);
            }
            eVar.d(i10);
            byte[] bArr5 = new byte[i11];
            eVar.f47718u.v = bArr5;
            lVar.readFully(bArr5, 0, i11);
            return;
        }
        if (eVar.G == 0) {
            eVar.M = (int) fVar.b(lVar, false, true, 8);
            eVar.N = fVar.f47725c;
            eVar.I = -9223372036854775807L;
            eVar.G = 1;
            zVar2.z(0);
        }
        s3.d dVar3 = (s3.d) sparseArray.get(eVar.M);
        if (dVar3 == null) {
            lVar.t(i11 - eVar.N);
            eVar.G = 0;
            return;
        }
        dVar3.X.getClass();
        if (eVar.G == 1) {
            eVar.i(lVar, 3);
            int i21 = (zVar2.f4858a[2] & 6) >> 1;
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
                eVar.i(lVar, 4);
                int i22 = (zVar2.f4858a[3] & 255) + 1;
                eVar.K = i22;
                int[] iArr2 = eVar.L;
                if (iArr2 == null) {
                    iArr2 = new int[i22];
                } else if (iArr2.length < i22) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i22)];
                }
                eVar.L = iArr2;
                if (i21 == 2) {
                    int i23 = (i11 - eVar.N) - 4;
                    int i24 = eVar.K;
                    Arrays.fill(iArr2, 0, i24, i23 / i24);
                } else {
                    if (i21 == 1) {
                        int i25 = 0;
                        int i26 = 0;
                        int i27 = 4;
                        while (true) {
                            i13 = eVar.K - 1;
                            if (i25 >= i13) {
                                break;
                            }
                            eVar.L[i25] = 0;
                            while (true) {
                                i14 = i27 + 1;
                                eVar.i(lVar, i14);
                                int i28 = zVar2.f4858a[i27] & 255;
                                int[] iArr3 = eVar.L;
                                i15 = iArr3[i25] + i28;
                                iArr3[i25] = i15;
                                if (i28 != 255) {
                                    break;
                                } else {
                                    i27 = i14;
                                }
                            }
                            i26 += i15;
                            i25++;
                            i27 = i14;
                        }
                        eVar.L[i13] = ((i11 - eVar.N) - i27) - i26;
                    } else {
                        if (i21 != 3) {
                            throw t1.a("Unexpected lacing value: " + i21, null);
                        }
                        int i29 = 0;
                        int i30 = 0;
                        int i31 = 4;
                        while (true) {
                            int i32 = eVar.K - i17;
                            if (i29 >= i32) {
                                c10 = 1;
                                c11 = 0;
                                eVar.L[i32] = ((i11 - eVar.N) - i31) - i30;
                                break;
                            }
                            eVar.L[i29] = i18;
                            int i33 = i31 + 1;
                            eVar.i(lVar, i33);
                            if (zVar2.f4858a[i31] == 0) {
                                throw t1.a("No valid varint length mask found", null);
                            }
                            int i34 = 0;
                            while (true) {
                                if (i34 >= 8) {
                                    j10 = 0;
                                    i12 = i33;
                                    break;
                                }
                                int i35 = 1 << (7 - i34);
                                if ((zVar2.f4858a[i31] & i35) != 0) {
                                    i12 = i33 + i34;
                                    eVar.i(lVar, i12);
                                    j10 = zVar2.f4858a[i31] & b10 & (~i35);
                                    while (i33 < i12) {
                                        j10 = (j10 << 8) | ((long) (zVar2.f4858a[i33] & b10));
                                        i33++;
                                        b10 = 255;
                                    }
                                    if (i29 <= 0) {
                                        break;
                                    }
                                    j10 -= (1 << ((i34 * 7) + 6)) - 1;
                                    break;
                                }
                                i34++;
                                b10 = 255;
                            }
                            if (j10 < -2147483648L || j10 > 2147483647L) {
                                throw t1.a("EBML lacing sample size out of range.", null);
                            }
                            int i36 = (int) j10;
                            int[] iArr4 = eVar.L;
                            if (i29 != 0) {
                                i36 += iArr4[i29 - 1];
                            }
                            iArr4[i29] = i36;
                            i30 += i36;
                            i29++;
                            i31 = i12;
                            b10 = 255;
                            i17 = 1;
                            i18 = 0;
                        }
                    }
                    byte[] bArr6 = zVar2.f4858a;
                    eVar.H = eVar.k((bArr6[c10] & 255) | (bArr6[c11] << 8)) + eVar.B;
                    if (dVar3.d != 2 || (i10 == 163 && (zVar2.f4858a[2] & 128) == 128)) {
                        i16 = 1;
                    } else {
                        i16 = 0;
                    }
                    eVar.O = i16;
                    eVar.G = 2;
                    eVar.J = 0;
                }
            }
            c10 = 1;
            c11 = 0;
            byte[] bArr7 = zVar2.f4858a;
            eVar.H = eVar.k((bArr7[c10] & 255) | (bArr7[c11] << 8)) + eVar.B;
            if (dVar3.d != 2) {
                i16 = 1;
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
                if (i37 >= eVar.K) {
                    eVar.G = 0;
                    return;
                }
                eVar.e(dVar3, ((long) ((eVar.J * dVar3.f47672e) / 1000)) + eVar.H, eVar.O, eVar.l(lVar, dVar3, eVar.L[i37], false), 0);
                eVar.J++;
            }
        } else {
            while (true) {
                int i38 = eVar.J;
                if (i38 >= eVar.K) {
                    return;
                }
                int[] iArr5 = eVar.L;
                iArr5[i38] = eVar.l(lVar, dVar3, iArr5[i38], true);
                eVar.J++;
            }
        }
    }

    public j9.a f(g5.b bVar) throws lb.c, lb.a, lb.e {
        ArrayList arrayList;
        rb.c cVar;
        rb.c cVar2;
        rb.c cVar3;
        float f10;
        float f11;
        rb.a aVarV;
        float f12;
        float f13;
        float f14;
        float f15;
        int i10;
        int i11;
        lb.j[] jVarArr;
        lb.a aVar;
        mb.b bVar2;
        int i12;
        mb.d dVarB;
        int i13;
        int i14;
        boolean z10;
        double d;
        char c10;
        int iAbs;
        o0.b bVar3 = (o0.b) this.f18130b;
        mb.b bVarN = bVar.n();
        m5.o oVar = new m5.o(bVarN, 17);
        rb.e eVar = new rb.e(bVarN);
        int i15 = bVarN.f17920b;
        int i16 = bVarN.f17919a;
        int i17 = (i15 * 3) / 388;
        if (i17 < 3) {
            i17 = 3;
        }
        int[] iArr = new int[5];
        int i18 = i17 - 1;
        int i19 = 0;
        boolean zD = false;
        while (true) {
            int i20 = 1;
            arrayList = eVar.f46893b;
            if (i18 >= i15 || zD) {
                break;
            }
            Arrays.fill(iArr, i19);
            int i21 = 0;
            while (i21 < i16) {
                if (bVarN.b(i21, i18)) {
                    if ((i19 & 1) == i20) {
                        i19++;
                    }
                    iArr[i19] = iArr[i19] + i20;
                    i15 = i15;
                } else {
                    if ((i19 & 1) != 0) {
                        i15 = i15;
                        iArr[i19] = iArr[i19] + 1;
                    } else if (i19 != 4) {
                        i15 = i15;
                        int i22 = i19 + 1;
                        iArr[i22] = iArr[i22] + 1;
                        i19 = i22;
                    } else if (rb.e.b(iArr) && eVar.c(i18, i21, iArr)) {
                        if (eVar.f46894c) {
                            zD = eVar.d();
                            i15 = i15;
                        } else {
                            if (arrayList.size() > i20) {
                                int size = arrayList.size();
                                int i23 = 0;
                                rb.c cVar4 = null;
                                while (true) {
                                    if (i23 >= size) {
                                        i15 = i15;
                                        c10 = 2;
                                        iAbs = 0;
                                        break;
                                    }
                                    Object obj = arrayList.get(i23);
                                    i23++;
                                    rb.c cVar5 = (rb.c) obj;
                                    i15 = i15;
                                    if (cVar5.d >= 2) {
                                        if (cVar4 != null) {
                                            eVar.f46894c = true;
                                            c10 = 2;
                                            iAbs = ((int) (Math.abs(cVar4.f15529a - cVar5.f15529a) - Math.abs(cVar4.f15530b - cVar5.f15530b))) / 2;
                                            break;
                                        }
                                        cVar4 = cVar5;
                                    }
                                    i15 = i15;
                                }
                            } else {
                                i15 = i15;
                                iAbs = 0;
                                c10 = 2;
                            }
                            int i24 = iArr[c10];
                            if (iAbs > i24) {
                                i18 += (iAbs - i24) - 2;
                                i21 = i16 - 1;
                            }
                        }
                        Arrays.fill(iArr, 0);
                        i17 = 2;
                        i19 = 0;
                    } else {
                        iArr[0] = iArr[2];
                        iArr[1] = iArr[3];
                        iArr[2] = iArr[4];
                        iArr[3] = 1;
                        iArr[4] = 0;
                        i19 = 3;
                    }
                    i21++;
                    i15 = i15;
                    i20 = 1;
                }
                i21++;
                i15 = i15;
                i20 = 1;
            }
            int i25 = i15;
            if (rb.e.b(iArr) && eVar.c(i18, i16, iArr)) {
                int i26 = iArr[0];
                if (eVar.f46894c) {
                    i17 = i26;
                    zD = eVar.d();
                } else {
                    i17 = i26;
                }
            }
            i18 += i17;
            i15 = i25;
            i19 = 0;
        }
        if (arrayList.size() < 3) {
            throw lb.e.a();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((rb.c) it.next()).d < 2) {
                it.remove();
            }
        }
        Collections.sort(arrayList, rb.e.f46891e);
        rb.c[] cVarArr = new rb.c[3];
        int i27 = 0;
        double d10 = Double.MAX_VALUE;
        for (int i28 = 2; i27 < arrayList.size() - i28; i28 = 2) {
            rb.c cVar6 = (rb.c) arrayList.get(i27);
            float f16 = cVar6.f46890c;
            i27++;
            int i29 = i27;
            while (i29 < arrayList.size() - 1) {
                rb.c cVar7 = (rb.c) arrayList.get(i29);
                double dE = rb.e.e(cVar6, cVar7);
                i29++;
                for (int i30 = i29; i30 < arrayList.size(); i30++) {
                    rb.c cVar8 = (rb.c) arrayList.get(i30);
                    if (cVar8.f46890c <= 1.4f * f16) {
                        double dE2 = rb.e.e(cVar7, cVar8);
                        double dE3 = rb.e.e(cVar6, cVar8);
                        if (dE < dE2) {
                            if (dE2 <= dE3) {
                                dE3 = dE2;
                                dE2 = dE3;
                            } else if (dE >= dE3) {
                                d = dE3;
                                dE3 = dE;
                            }
                            d = dE;
                        } else {
                            if (dE2 >= dE3) {
                                d = dE3;
                                dE3 = dE2;
                            } else if (dE < dE3) {
                                d = dE2;
                                dE2 = dE3;
                                dE3 = dE;
                            } else {
                                d = dE2;
                            }
                            dE2 = dE;
                        }
                        double dAbs = Math.abs(dE2 - (d * 2.0d)) + Math.abs(dE2 - (dE3 * 2.0d));
                        if (dAbs < d10) {
                            cVarArr[0] = cVar6;
                            cVarArr[1] = cVar7;
                            cVarArr[2] = cVar8;
                            d10 = dAbs;
                        }
                    }
                }
            }
        }
        if (d10 == Double.MAX_VALUE) {
            throw lb.e.a();
        }
        float fA = lb.j.a(cVarArr[0], cVarArr[1]);
        float fA2 = lb.j.a(cVarArr[1], cVarArr[2]);
        float fA3 = lb.j.a(cVarArr[0], cVarArr[2]);
        if (fA2 >= fA && fA2 >= fA3) {
            cVar = cVarArr[0];
            cVar2 = cVarArr[1];
            cVar3 = cVarArr[2];
        } else if (fA3 < fA2 || fA3 < fA) {
            cVar = cVarArr[2];
            cVar2 = cVarArr[0];
            cVar3 = cVarArr[1];
        } else {
            cVar = cVarArr[1];
            cVar2 = cVarArr[0];
            cVar3 = cVarArr[2];
        }
        float f17 = cVar.f15529a;
        float f18 = cVar.f15530b;
        if (pa.b(cVar2.f15529a, f17, cVar3.f15530b - f18, (cVar2.f15530b - f18) * (cVar3.f15529a - f17)) < 0.0f) {
            rb.c cVar9 = cVar3;
            cVar3 = cVar2;
            cVar2 = cVar9;
        }
        cVarArr[0] = cVar2;
        cVarArr[1] = cVar;
        cVarArr[2] = cVar3;
        float fO = oVar.o(cVar, cVar3);
        float f19 = cVar.f15529a;
        float f20 = cVar3.f15530b;
        float f21 = cVar3.f15529a;
        float fO2 = oVar.o(cVar, cVar2);
        float f22 = cVar2.f15530b;
        float f23 = cVar2.f15529a;
        float f24 = (fO2 + fO) / 2.0f;
        if (f24 < 1.0f) {
            throw lb.e.a();
        }
        float fA4 = lb.j.a(cVar, cVar3) / f24;
        int i31 = (int) (fA4 + (fA4 < 0.0f ? -0.5f : 0.5f));
        float fA5 = lb.j.a(cVar, cVar2) / f24;
        int i32 = (((int) (fA5 + (fA5 >= 0.0f ? 0.5f : -0.5f))) + i31) / 2;
        int i33 = i32 + 7;
        int i34 = i33 & 3;
        if (i34 == 0) {
            i33 = i32 + 8;
        } else if (i34 == 2) {
            i33 = i32 + 6;
        } else if (i34 == 3) {
            i33 = i32 + 5;
        }
        int i35 = i33;
        int[] iArr2 = qb.e.f46196e;
        if (i35 % 4 != 1) {
            throw lb.c.a();
        }
        try {
            qb.e eVarC = qb.e.c((i35 - 17) / 4);
            int i36 = (eVarC.f46198a * 4) + 10;
            if (eVarC.f46199b.length > 0) {
                float f25 = (f21 - f19) + f23;
                f11 = f21;
                float f26 = (f20 - f18) + f22;
                float f27 = 1.0f - (3.0f / i36);
                int iZ = (int) com.google.android.recaptcha.internal.a.z(f25, f19, f27, f19);
                int iZ2 = (int) com.google.android.recaptcha.internal.a.z(f26, f18, f27, f18);
                f10 = f19;
                int i37 = 4;
                while (true) {
                    if (i37 <= 16) {
                        try {
                            aVarV = oVar.v(f24, i37, iZ, iZ2);
                            break;
                        } catch (lb.e unused) {
                            i37 <<= 1;
                        }
                    }
                }
                f12 = i35 - 3.5f;
                if (aVarV != null) {
                    f13 = aVarV.f15529a;
                    f14 = aVarV.f15530b;
                    f15 = f12 - 3.0f;
                } else {
                    f13 = (f11 - f10) + f23;
                    f14 = (f20 - f18) + f22;
                    f15 = f12;
                }
                float f28 = f14;
                float f29 = cVar.f15529a;
                float f30 = cVar.f15530b;
                float f31 = cVar3.f15529a;
                float f32 = cVar3.f15530b;
                float f33 = cVar2.f15529a;
                float f34 = cVar2.f15530b;
                mb.g gVarA = mb.g.a(3.5f, 3.5f, f12, 3.5f, f15, f15, 3.5f, f12);
                rb.a aVar2 = aVarV;
                float f35 = gVarA.f17941e;
                float f36 = gVarA.f17944i;
                float f37 = f35 * f36;
                float f38 = gVarA.f17942f;
                float f39 = gVarA.h;
                float f40 = f37 - (f38 * f39);
                float f41 = gVarA.f17943g;
                float f42 = f38 * f41;
                float f43 = gVarA.d;
                float f44 = f42 - (f43 * f36);
                float f45 = (f43 * f39) - (f35 * f41);
                float f46 = gVarA.f17940c;
                float f47 = f46 * f39;
                float f48 = gVarA.f17939b;
                float f49 = f47 - (f48 * f36);
                float f50 = gVarA.f17938a;
                float f51 = (f36 * f50) - (f46 * f41);
                float f52 = (f41 * f48) - (f39 * f50);
                float f53 = (f48 * f38) - (f46 * f35);
                float f54 = (f46 * f43) - (f38 * f50);
                float f55 = (f50 * f35) - (f48 * f43);
                mb.g gVarA2 = mb.g.a(f29, f30, f31, f32, f13, f28, f33, f34);
                float f56 = gVarA2.f17938a;
                float f57 = gVarA2.d;
                float f58 = gVarA2.f17943g;
                float f59 = (f58 * f53) + (f57 * f49) + (f56 * f40);
                float f60 = (f58 * f54) + (f57 * f51) + (f56 * f44);
                float f61 = (f58 * f55) + (f57 * f52) + (f56 * f45);
                float f62 = gVarA2.f17939b;
                float f63 = gVarA2.f17941e;
                float f64 = gVarA2.h;
                float f65 = (f64 * f53) + (f63 * f49) + (f62 * f40);
                float f66 = (f64 * f54) + (f63 * f51) + (f62 * f44);
                float f67 = (f64 * f55) + (f63 * f52) + (f62 * f45);
                float f68 = gVarA2.f17940c;
                float f69 = gVarA2.f17942f;
                float f70 = gVarA2.f17944i;
                float f71 = (f53 * f70) + (f49 * f69) + (f40 * f68);
                float f72 = (f54 * f70) + (f51 * f69) + (f44 * f68);
                float f73 = (f70 * f55) + (f69 * f52) + (f68 * f45);
                if (i35 > 0 || i35 <= 0) {
                    throw lb.e.a();
                }
                mb.b bVar4 = new mb.b(i35, i35);
                int i38 = i35 * 2;
                rb.c cVar10 = cVar;
                float[] fArr = new float[i38];
                int i39 = 0;
                while (i39 < i35) {
                    int i40 = i35;
                    float f74 = i39 + 0.5f;
                    int i41 = 0;
                    while (i41 < i38) {
                        int i42 = i41;
                        fArr[i42] = (i42 / 2) + 0.5f;
                        fArr[i42 + 1] = f74;
                        i41 = i42 + 2;
                    }
                    int i43 = i38 - 1;
                    int i44 = i39;
                    int i45 = 0;
                    while (i45 < i43) {
                        float f75 = fArr[i45];
                        int i46 = i45 + 1;
                        int i47 = i45;
                        float f76 = fArr[i46];
                        rb.c cVar11 = cVar2;
                        float fD = com.google.android.recaptcha.internal.a.d(f72, f76, f71 * f75, f73);
                        fArr[i47] = (((f60 * f76) + (f59 * f75)) + f61) / fD;
                        fArr[i46] = (((f76 * f66) + (f75 * f65)) + f67) / fD;
                        i45 = i47 + 2;
                        cVar2 = cVar11;
                    }
                    rb.c cVar12 = cVar2;
                    int i48 = bVarN.f17920b;
                    float f77 = f72;
                    int i49 = 0;
                    boolean z11 = true;
                    while (i49 < i43 && z11) {
                        int i50 = (int) fArr[i49];
                        int i51 = i49 + 1;
                        int i52 = i43;
                        int i53 = (int) fArr[i51];
                        int i54 = i49;
                        if (i50 < -1 || i50 > i16 || i53 < -1 || i53 > i48) {
                            throw lb.e.a();
                        }
                        if (i50 == -1) {
                            fArr[i54] = 0.0f;
                        } else {
                            if (i50 == i16) {
                                fArr[i54] = i16 - 1;
                            } else {
                                z10 = false;
                            }
                            if (i53 == -1) {
                                fArr[i51] = 0.0f;
                            } else {
                                if (i53 == i48) {
                                    fArr[i51] = i48 - 1;
                                } else {
                                    z11 = z10;
                                }
                                i49 = i54 + 2;
                                i43 = i52;
                            }
                            z11 = true;
                            i49 = i54 + 2;
                            i43 = i52;
                        }
                        z10 = true;
                        if (i53 == -1) {
                            fArr[i51] = 0.0f;
                        } else {
                            if (i53 == i48) {
                                fArr[i51] = i48 - 1;
                            } else {
                                z11 = z10;
                            }
                            i49 = i54 + 2;
                            i43 = i52;
                        }
                        z11 = true;
                        i49 = i54 + 2;
                        i43 = i52;
                    }
                    int i55 = i38 - 2;
                    boolean z12 = true;
                    while (i55 >= 0 && z12) {
                        int i56 = (int) fArr[i55];
                        int i57 = i55 + 1;
                        int i58 = i55;
                        int i59 = (int) fArr[i57];
                        if (i56 < -1 || i56 > i16 || i59 < -1 || i59 > i48) {
                            throw lb.e.a();
                        }
                        if (i56 == -1) {
                            fArr[i58] = 0.0f;
                        } else {
                            if (i56 == i16) {
                                fArr[i58] = i16 - 1;
                            } else {
                                z12 = false;
                            }
                            if (i59 == -1) {
                                fArr[i57] = 0.0f;
                            } else {
                                if (i59 == i48) {
                                    fArr[i57] = i48 - 1;
                                }
                                i55 = i58 - 2;
                            }
                            z12 = true;
                            i55 = i58 - 2;
                        }
                        z12 = true;
                        if (i59 == -1) {
                            fArr[i57] = 0.0f;
                        } else {
                            if (i59 == i48) {
                                fArr[i57] = i48 - 1;
                            }
                            i55 = i58 - 2;
                        }
                        z12 = true;
                        i55 = i58 - 2;
                    }
                    for (int i60 = 0; i60 < i38; i60 += 2) {
                        try {
                            if (bVarN.b((int) fArr[i60], (int) fArr[i60 + 1])) {
                                int i61 = i60 / 2;
                                int i62 = (i61 / 32) + (bVar4.f17921c * i44);
                                int[] iArr3 = bVar4.d;
                                iArr3[i62] = iArr3[i62] | (1 << (i61 & 31));
                            }
                        } catch (ArrayIndexOutOfBoundsException unused2) {
                            throw lb.e.a();
                        }
                    }
                    i39 = i44 + 1;
                    i35 = i40;
                    f72 = f77;
                    cVar2 = cVar12;
                }
                rb.c cVar13 = cVar2;
                if (aVar2 == null) {
                    i11 = 3;
                    i10 = 1;
                    jVarArr = new lb.j[]{cVar13, cVar10, cVar3};
                } else {
                    i10 = 1;
                    i11 = 3;
                    jVarArr = new lb.j[]{cVar13, cVar10, cVar3, aVar2};
                }
                lb.j[] jVarArr2 = jVarArr;
                bVar3.getClass();
                com.google.firebase.messaging.l lVar = new com.google.firebase.messaging.l();
                int i63 = bVar4.f17920b;
                int i64 = 21;
                if (i63 < 21 || (i63 & i11) != i10) {
                    throw lb.c.a();
                }
                lVar.f4600b = bVar4;
                try {
                    dVarB = bVar3.b(lVar);
                } catch (lb.a e9) {
                    aVar = e9;
                    e = null;
                    try {
                        lVar.p();
                        lVar.f4601c = null;
                        lVar.d = null;
                        lVar.f4599a = true;
                        lVar.o();
                        lVar.n();
                        bVar2 = (mb.b) lVar.f4600b;
                        i12 = 0;
                        while (i12 < bVar2.f17919a) {
                            int i65 = i12 + 1;
                            for (i13 = i65; i13 < bVar2.f17920b; i13++) {
                                if (bVar2.b(i12, i13) != bVar2.b(i13, i12)) {
                                    bVar2.a(i13, i12);
                                    bVar2.a(i12, i13);
                                }
                            }
                            i12 = i65;
                        }
                        mb.d dVarB2 = bVar3.b(lVar);
                        dVarB2.f17929e = new w9.d(i64);
                        dVarB = dVarB2;
                    } catch (lb.a | lb.c unused3) {
                        if (e != null) {
                            throw e;
                        }
                        throw aVar;
                    }
                } catch (lb.c e10) {
                    e = e10;
                    aVar = null;
                    lVar.p();
                    lVar.f4601c = null;
                    lVar.d = null;
                    lVar.f4599a = true;
                    lVar.o();
                    lVar.n();
                    bVar2 = (mb.b) lVar.f4600b;
                    i12 = 0;
                    while (i12 < bVar2.f17919a) {
                        int i66 = i12 + 1;
                        while (i13 < bVar2.f17920b) {
                            if (bVar2.b(i12, i13) != bVar2.b(i13, i12)) {
                                bVar2.a(i13, i12);
                                bVar2.a(i12, i13);
                            }
                        }
                        i12 = i66;
                    }
                    mb.d dVarB3 = bVar3.b(lVar);
                    dVarB3.f17929e = new w9.d(i64);
                    dVarB = dVarB3;
                }
                int i67 = dVarB.f17930f;
                if (com.google.android.recaptcha.internal.a.u(dVarB.f17929e) && jVarArr2.length >= 3) {
                    lb.j jVar = jVarArr2[0];
                    jVarArr2[0] = jVarArr2[2];
                    jVarArr2[2] = jVar;
                }
                j9.a aVar3 = new j9.a(dVarB.f17926a, jVarArr2);
                List list = dVarB.f17927b;
                if (list != null) {
                    aVar3.H(lb.i.f15524a, list);
                }
                String str = dVarB.f17928c;
                if (str != null) {
                    aVar3.H(lb.i.f15525b, str);
                }
                if (i67 >= 0 && (i14 = dVarB.f17931g) >= 0) {
                    aVar3.H(lb.i.d, Integer.valueOf(i14));
                    aVar3.H(lb.i.f15527e, Integer.valueOf(i67));
                }
                aVar3.H(lb.i.f15526c, dVarB.d);
                aVar3.H(lb.i.f15528f, "]Q" + dVarB.h);
                return aVar3;
            }
            f10 = f19;
            f11 = f21;
            aVarV = null;
            f12 = i35 - 3.5f;
            if (aVarV != null) {
                f13 = aVarV.f15529a;
                f14 = aVarV.f15530b;
                f15 = f12 - 3.0f;
            } else {
                f13 = (f11 - f10) + f23;
                f14 = (f20 - f18) + f22;
                f15 = f12;
            }
            float f210 = f14;
            float f211 = cVar.f15529a;
            float f310 = cVar.f15530b;
            float f311 = cVar3.f15529a;
            float f312 = cVar3.f15530b;
            float f313 = cVar2.f15529a;
            float f314 = cVar2.f15530b;
            mb.g gVarA3 = mb.g.a(3.5f, 3.5f, f12, 3.5f, f15, f15, 3.5f, f12);
            rb.a aVar4 = aVarV;
            float f315 = gVarA3.f17941e;
            float f316 = gVarA3.f17944i;
            float f317 = f315 * f316;
            float f318 = gVarA3.f17942f;
            float f319 = gVarA3.h;
            float f410 = f317 - (f318 * f319);
            float f411 = gVarA3.f17943g;
            float f412 = f318 * f411;
            float f413 = gVarA3.d;
            float f414 = f412 - (f413 * f316);
            float f415 = (f413 * f319) - (f315 * f411);
            float f416 = gVarA3.f17940c;
            float f417 = f416 * f319;
            float f418 = gVarA3.f17939b;
            float f419 = f417 - (f418 * f316);
            float f510 = gVarA3.f17938a;
            float f511 = (f316 * f510) - (f416 * f411);
            float f512 = (f411 * f418) - (f319 * f510);
            float f513 = (f418 * f318) - (f416 * f315);
            float f514 = (f416 * f413) - (f318 * f510);
            float f515 = (f510 * f315) - (f418 * f413);
            mb.g gVarA4 = mb.g.a(f211, f310, f311, f312, f13, f210, f313, f314);
            float f516 = gVarA4.f17938a;
            float f517 = gVarA4.d;
            float f518 = gVarA4.f17943g;
            float f519 = (f518 * f513) + (f517 * f419) + (f516 * f410);
            float f610 = (f518 * f514) + (f517 * f511) + (f516 * f414);
            float f611 = (f518 * f515) + (f517 * f512) + (f516 * f415);
            float f612 = gVarA4.f17939b;
            float f613 = gVarA4.f17941e;
            float f614 = gVarA4.h;
            float f615 = (f614 * f513) + (f613 * f419) + (f612 * f410);
            float f616 = (f614 * f514) + (f613 * f511) + (f612 * f414);
            float f617 = (f614 * f515) + (f613 * f512) + (f612 * f415);
            float f618 = gVarA4.f17940c;
            float f619 = gVarA4.f17942f;
            float f78 = gVarA4.f17944i;
            float f79 = (f513 * f78) + (f419 * f619) + (f410 * f618);
            float f710 = (f514 * f78) + (f511 * f619) + (f414 * f618);
            float f711 = (f78 * f515) + (f619 * f512) + (f618 * f415);
            if (i35 > 0) {
            }
            throw lb.e.a();
        } catch (IllegalArgumentException unused4) {
            throw lb.c.a();
        }
    }

    @Override
    public boolean f1(d1 d1Var) {
        return false;
    }

    @Override
    public Object f2() {
        switch (this.f18129a) {
            case 5:
                Class cls = (Class) this.f18130b;
                try {
                    return oa.r.f19414a.a(cls);
                } catch (Exception e9) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e9);
                }
            default:
                throw new ma.j((String) this.f18130b);
        }
    }

    @Override
    public void g(d1 d1Var) {
        switch (this.f18129a) {
            case 18:
                k3 k3Var = ((w0) this.f18130b).O;
                if (k3Var != null) {
                    p3 p3Var = k3Var.f47246a;
                    p3.M1(p3Var, d1Var);
                    p3Var.f47340d3.n0(d1Var, true);
                }
                break;
            default:
                w4 w4Var = ((y4) this.f18130b).f47610s;
                if (w4Var != null) {
                    p3 p3Var2 = ((v2) w4Var).f47519a;
                    p3.M1(p3Var2, d1Var);
                    p3Var2.f47340d3.n0(d1Var, true);
                }
                break;
        }
    }

    @Override
    public float get() {
        ys0 ys0Var = (ys0) this.f18130b;
        int i10 = ys0Var.L1;
        yf.m currentBrush = ys0Var.S0.getCurrentBrush();
        return currentBrush == null ? r0.e(i10).f50060i : r0.e(i10).f(String.valueOf(yf.m.f49979a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f18129a) {
            case 7:
                return " ";
            default:
                vf.h hVar = (vf.h) this.f18130b;
                float f10 = hVar.f48901b;
                return String.valueOf(Math.round((hVar.f48900a.getProgress() * (hVar.f48902c - f10)) + f10));
        }
    }

    public String h(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            t9.d dVar = (t9.d) this.f18130b;
            t9.e eVar = new t9.e(stringWriter, dVar.f48143a, dVar.f48144b, dVar.f48145c, dVar.d);
            eVar.h(obj);
            eVar.j();
            eVar.f48147b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override
    public a0.h h0() {
        return null;
    }

    @Override
    public void i(int i10) {
        op0 op0Var = (op0) this.f18130b;
        sp0 sp0Var = op0Var.G;
        op0Var.f31379s = i10;
        if (op0Var.v != i10) {
            op0Var.d.clear();
        }
        int i11 = op0Var.F;
        if (op0Var.h() != 0 || op0Var.f31375e.e() || op0Var.E) {
            sp0Var.f32544t0.b(i11);
        } else {
            sp0Var.M.e(false, true);
        }
        op0Var.l();
        int i12 = sp0.W0;
        sp0Var.K0(true);
    }

    @Override
    public boolean i1(String str, k9 k9Var) {
        return false;
    }

    public void j(int i10, long j10) throws t1 {
        s3.e eVar = (s3.e) this.f18130b;
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            throw t1.a("ContentEncodingOrder " + j10 + " not supported", null);
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            throw t1.a("ContentEncodingScope " + j10 + " not supported", null);
        }
        int i11 = 3;
        switch (i10) {
            case 131:
                eVar.d(i10);
                eVar.f47718u.d = (int) j10;
                return;
            case 136:
                eVar.d(i10);
                eVar.f47718u.V = j10 == 1;
                return;
            case 155:
                eVar.I = eVar.k(j10);
                return;
            case 159:
                eVar.d(i10);
                eVar.f47718u.O = (int) j10;
                return;
            case 176:
                eVar.d(i10);
                eVar.f47718u.f47679m = (int) j10;
                return;
            case 179:
                eVar.a(i10);
                eVar.C.c(eVar.k(j10));
                return;
            case 186:
                eVar.d(i10);
                eVar.f47718u.f47680n = (int) j10;
                return;
            case 215:
                eVar.d(i10);
                eVar.f47718u.f47671c = (int) j10;
                return;
            case 231:
                eVar.B = eVar.k(j10);
                return;
            case 238:
                eVar.P = (int) j10;
                return;
            case 241:
                if (eVar.E) {
                    return;
                }
                eVar.a(i10);
                eVar.D.c(j10);
                eVar.E = true;
                return;
            case 251:
                eVar.Q = true;
                return;
            case 16871:
                eVar.d(i10);
                eVar.f47718u.f47674g = (int) j10;
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                throw t1.a("ContentCompAlgo " + j10 + " not supported", null);
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    throw t1.a("DocTypeReadVersion " + j10 + " not supported", null);
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                throw t1.a("EBMLReadVersion " + j10 + " not supported", null);
            case 18401:
                if (j10 == 5) {
                    return;
                }
                throw t1.a("ContentEncAlgo " + j10 + " not supported", null);
            case 18408:
                if (j10 == 1) {
                    return;
                }
                throw t1.a("AESSettingsCipherMode " + j10 + " not supported", null);
            case 21420:
                eVar.f47720x = j10 + eVar.f47714q;
                return;
            case 21432:
                int i12 = (int) j10;
                eVar.d(i10);
                if (i12 == 0) {
                    eVar.f47718u.f47688w = 0;
                    return;
                }
                if (i12 == 1) {
                    eVar.f47718u.f47688w = 2;
                    return;
                } else if (i12 == 3) {
                    eVar.f47718u.f47688w = 1;
                    return;
                } else {
                    if (i12 != 15) {
                        return;
                    }
                    eVar.f47718u.f47688w = 3;
                    return;
                }
            case 21680:
                eVar.d(i10);
                eVar.f47718u.f47681o = (int) j10;
                return;
            case 21682:
                eVar.d(i10);
                eVar.f47718u.f47683q = (int) j10;
                return;
            case 21690:
                eVar.d(i10);
                eVar.f47718u.f47682p = (int) j10;
                return;
            case 21930:
                eVar.d(i10);
                eVar.f47718u.U = j10 == 1;
                return;
            case 21998:
                eVar.d(i10);
                eVar.f47718u.f47673f = (int) j10;
                return;
            case 22186:
                eVar.d(i10);
                eVar.f47718u.R = j10;
                return;
            case 22203:
                eVar.d(i10);
                eVar.f47718u.S = j10;
                return;
            case 25188:
                eVar.d(i10);
                eVar.f47718u.P = (int) j10;
                return;
            case 30114:
                eVar.R = j10;
                return;
            case 30321:
                eVar.d(i10);
                int i13 = (int) j10;
                if (i13 == 0) {
                    eVar.f47718u.f47684r = 0;
                    return;
                }
                if (i13 == 1) {
                    eVar.f47718u.f47684r = 1;
                    return;
                } else if (i13 == 2) {
                    eVar.f47718u.f47684r = 2;
                    return;
                } else {
                    if (i13 != 3) {
                        return;
                    }
                    eVar.f47718u.f47684r = 3;
                    return;
                }
            case 2352003:
                eVar.d(i10);
                eVar.f47718u.f47672e = (int) j10;
                return;
            case 2807729:
                eVar.f47715r = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        eVar.d(i10);
                        int i14 = (int) j10;
                        if (i14 == 1) {
                            eVar.f47718u.A = 2;
                            return;
                        } else {
                            if (i14 != 2) {
                                return;
                            }
                            eVar.f47718u.A = 1;
                            return;
                        }
                    case 21946:
                        eVar.d(i10);
                        int i15 = (int) j10;
                        String str = e5.b.f5227f;
                        if (i15 != 1) {
                            if (i15 == 16) {
                                i11 = 6;
                            } else if (i15 == 18) {
                                i11 = 7;
                            } else if (i15 != 6 && i15 != 7) {
                                i11 = -1;
                            }
                        }
                        if (i11 != -1) {
                            eVar.f47718u.f47691z = i11;
                            return;
                        }
                        return;
                    case 21947:
                        eVar.d(i10);
                        eVar.f47718u.f47689x = true;
                        int iA = e5.b.a((int) j10);
                        if (iA != -1) {
                            eVar.f47718u.f47690y = iA;
                            return;
                        }
                        return;
                    case 21948:
                        eVar.d(i10);
                        eVar.f47718u.B = (int) j10;
                        return;
                    case 21949:
                        eVar.d(i10);
                        eVar.f47718u.C = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    @Override
    public void k() {
        fe0 fe0Var = ((ge0) this.f18130b).f28601a;
        if (fe0Var != null) {
            ((rr0) fe0Var).f42322a.f35583a0.invalidate();
        }
    }

    @Override
    public void l1() {
        ((d9) this.f18130b).f27673a.invalidate();
    }

    @Override
    public void m() {
        w0 w0Var = (w0) this.f18130b;
        k3 k3Var = w0Var.O;
        if (k3Var != null) {
            p3.P1(k3Var.f47246a, w0Var.f47594a);
        }
    }

    @Override
    public boolean n() {
        return false;
    }

    @Override
    public boolean o0(d1 d1Var) {
        return false;
    }

    @Override
    public void onDismiss() {
        z0 z0Var = (z0) this.f18130b;
        z0Var.v("scan_qr_popup_closed", null);
        z0Var.f44063d0 = false;
    }

    @Override
    public void onRenderedFirstFrame(i3.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        xj0 xj0Var = (xj0) this.f18130b;
        if (z10 && xj0Var.f34635n.o() >= 0) {
            xj0Var.f34638w = true;
        }
        tf0 tf0Var = xj0Var.f34634f;
        mb0 mb0Var = xj0Var.f34639x;
        tf0Var.a(z10, true);
        AndroidUtilities.cancelRunOnUIThread(mb0Var);
        if (z10) {
            AndroidUtilities.runOnUIThread(mb0Var, 16L);
        }
    }

    @Override
    public void onSuccess(Object obj) {
        ((n5.a) this.f18130b).getClass();
        i5.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public Object p() {
        if (y6.a.f49712b == null) {
            y6.a.f49712b = new com.google.firebase.messaging.s();
        }
        synchronized (y6.a.f49711a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    @Override
    public void q(boolean z10) {
        ((ge0) this.f18130b).f28603c.setAspectLock(z10);
    }

    @Override
    public i9 q0() {
        return (w0) this.f18130b;
    }

    @Override
    public void r() {
        int i10 = this.f18129a;
    }

    @Override
    public void r1(Editable editable) {
        ((y4) this.f18130b).h();
    }

    @Override
    public boolean s() {
        return false;
    }

    public void t() {
        o5.h hVar = (o5.h) this.f18130b;
        Iterator it = hVar.h.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        Iterator it2 = hVar.f19337i.iterator();
        while (it2.hasNext()) {
            ((o5.g) it2.next()).a();
        }
    }

    @Override
    public rh.a u0() {
        return ((w0) this.f18130b).f47594a;
    }

    @Override
    public boolean w0() {
        w0 w0Var = (w0) this.f18130b;
        k3 k3Var = w0Var.O;
        if (k3Var == null) {
            return false;
        }
        rh.a aVar = w0Var.f47594a;
        return k3Var.f47246a.S4();
    }

    @Override
    public void w1(d1 d1Var) {
        rh.a aVar;
        y4 y4Var = (y4) this.f18130b;
        w4 w4Var = y4Var.f47610s;
        if (w4Var == null || (aVar = y4Var.f47594a) == null) {
            return;
        }
        p3 p3Var = ((v2) w4Var).f47519a;
        ArrayList arrayList = p3Var.f47348h3;
        long j10 = aVar.f47044t;
        if (j10 == 0) {
            return;
        }
        int i10 = -1;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((rh.a) arrayList.get(i11)).f47035k.contains(Long.valueOf(j10))) {
                i10 = i11;
            }
        }
        if (i10 < 0) {
            return;
        }
        b2 b2Var = p3Var.F3;
        if (b2Var != null) {
            b2Var.d();
        }
        rh.a aVar2 = new rh.a(new TL_iv.pageBlockParagraph(), 0, 0);
        ArrayList arrayList2 = aVar.f47035k;
        ArrayList arrayList3 = aVar2.f47035k;
        arrayList3.addAll(arrayList2);
        if (!arrayList3.isEmpty()) {
            a9.p.s(1, arrayList3);
        }
        arrayList.add(i10 + 1, aVar2);
        p3Var.s4();
        p3Var.U2.N(false);
        b2 b2Var2 = p3Var.F3;
        if (b2Var2 != null) {
            b2Var2.h();
        }
        p3Var.post(new i2(p3Var, aVar2, 26));
    }

    @Override
    public void y(sg sgVar) {
        NotificationCenter.getInstance(((n2) ((qf.m) this.f18130b)).currentAccount).doOnIdle(sgVar);
    }

    @Override
    public void y0(int i10, int i11) {
        w0 w0Var = (w0) this.f18130b;
        k3 k3Var = w0Var.O;
        if (k3Var != null) {
            rh.a aVar = w0Var.f47594a;
            b2 b2Var = k3Var.f47246a.F3;
            if (b2Var != null) {
                b2Var.f(i10, i11);
            }
        }
    }

    @Override
    public String z0() {
        return ((z0) this.f18130b).f44065e0;
    }

    public b0(i6.a aVar) {
        this.f18129a = 23;
        y5.l.h(aVar);
        this.f18130b = aVar;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public b0(int i10) {
        this.f18129a = i10;
        switch (i10) {
            case 14:
                this.f18130b = new o0.b(13);
                break;
            case 17:
                break;
            default:
                this.f18130b = new o4.d(5, 1.0f, false);
                break;
        }
    }

    public b0(TextView textView) {
        this.f18129a = 15;
        this.f18130b = new q1.g(textView);
    }

    public b0(Context context, Uri uri) {
        this.f18129a = 2;
        this.f18130b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    private final void l() {
    }

    private final void o() {
    }

    @Override
    public void F() {
    }

    @Override
    public void K() {
    }

    @Override
    public void K0() {
    }

    @Override
    public void b() {
    }

    @Override
    public void w() {
    }

    @Override
    public void A(boolean z10) {
    }

    @Override
    public void I(Object obj) {
    }

    @Override
    public void T0(MrzRecognizer.Result result) {
    }

    @Override
    public void V0(ArrayList arrayList) {
    }

    @Override
    public void g0(TLRPC.User user) {
    }

    @Override
    public void g1(CharSequence charSequence) {
    }

    @Override
    public void onSeekFinished(i3.a aVar) {
    }

    @Override
    public void onSeekStarted(i3.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void B(int i10, int i11) {
    }

    @Override
    public void onError(m61 m61Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
    }

    @Override
    public void P0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }

    @Override
    public void n0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
    }
}
