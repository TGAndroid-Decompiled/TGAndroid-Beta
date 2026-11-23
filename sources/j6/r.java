package j6;

import a8.h7;
import ai.u0;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.b0;
import androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer;
import bi.e4;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.internal.cast.f4;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import h2.l0;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import li.i0;
import m1.e1;
import n2.t0;
import oi.b2;
import oi.f1;
import oi.g2;
import oi.h0;
import oi.m3;
import oi.s4;
import oi.t3;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.au;
import org.telegram.messenger.bu;
import org.telegram.messenger.d20;
import org.telegram.messenger.ev;
import org.telegram.messenger.fj;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.o0;
import org.telegram.messenger.q10;
import org.telegram.messenger.ra;
import org.telegram.messenger.w10;
import org.telegram.messenger.ya;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.j0;
import org.telegram.ui.Cells.m1;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Cells.z8;
import org.telegram.ui.Components.e8;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.fh;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.hd;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.r40;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.Components.z40;
import org.telegram.ui.Components.zm0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.a61;
import org.telegram.ui.bn;
public final class r implements com.google.android.gms.common.api.internal.q, OnCompleteListener, ri, i0, l.i, n2.v, o0.a, b3.k, wm0, z4, h0, ra, ya, ue.a, zm0, f61 {
    public final int f17371a;
    public Object f17372b;

    public r(int i7) {
        this.f17371a = i7;
    }

    public static float[] y(ArrayList arrayList) {
        float f10;
        int i7;
        int i10;
        float f11;
        double d;
        double d2;
        double[] dArr;
        ArrayList arrayList2;
        float f12;
        float f13;
        int i11;
        float f14;
        int size = arrayList.size();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            f10 = 255.0f;
            if (i13 >= size) {
                break;
            }
            PointF pointF = (PointF) arrayList.get(i13);
            pointF.x *= 255.0f;
            pointF.y *= 255.0f;
            i13++;
        }
        int size2 = arrayList.size();
        int i14 = 1;
        double d10 = 1.0d;
        if (size2 <= 0 || size2 == 1) {
            i7 = 0;
            i10 = 1;
            f11 = 255.0f;
            d = 1.0d;
            d2 = 6.0d;
            dArr = null;
        } else {
            char c10 = 2;
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size2, 3);
            double[] dArr3 = new double[size2];
            double[] dArr4 = dArr2[0];
            dArr4[1] = 1.0d;
            double d11 = 0.0d;
            dArr4[0] = 0.0d;
            dArr4[2] = 0.0d;
            int i15 = 1;
            while (true) {
                i11 = size2 - 1;
                if (i15 >= i11) {
                    break;
                }
                PointF pointF2 = (PointF) arrayList.get(i15 - 1);
                PointF pointF3 = (PointF) arrayList.get(i15);
                int i16 = i15 + 1;
                double d12 = d10;
                PointF pointF4 = (PointF) arrayList.get(i16);
                double[] dArr5 = dArr2[i15];
                char c11 = c10;
                float f15 = pointF3.x;
                double d13 = d11;
                int i17 = i12;
                int i18 = i14;
                double d14 = f15 - pointF2.x;
                dArr5[i17] = d14 / 6.0d;
                float f16 = pointF4.x;
                float f17 = f10;
                dArr5[i18] = (f16 - f14) / 3.0d;
                double d15 = f16 - f15;
                dArr5[c11] = d15 / 6.0d;
                float f18 = pointF4.y;
                float f19 = pointF3.y;
                dArr3[i15] = ((f18 - f19) / d15) - ((f19 - pointF2.y) / d14);
                i15 = i16;
                c10 = c11;
                d10 = d12;
                d11 = d13;
                i12 = i17;
                i14 = i18;
                f10 = f17;
            }
            i7 = i12;
            i10 = i14;
            f11 = f10;
            d = d10;
            char c12 = c10;
            double d16 = d11;
            d2 = 6.0d;
            dArr3[i7] = d16;
            dArr3[i11] = d16;
            double[] dArr6 = dArr2[i11];
            dArr6[i10] = d;
            dArr6[i7] = d16;
            dArr6[c12] = d16;
            for (int i19 = i10; i19 < size2; i19++) {
                double[] dArr7 = dArr2[i19];
                double d17 = dArr7[i7];
                int i20 = i19 - 1;
                double[] dArr8 = dArr2[i20];
                double d18 = d17 / dArr8[i10];
                dArr7[i10] = dArr7[i10] - (dArr8[c12] * d18);
                dArr7[i7] = d16;
                dArr3[i19] = dArr3[i19] - (d18 * dArr3[i20]);
            }
            for (int i21 = size2 - 2; i21 >= 0; i21--) {
                double[] dArr9 = dArr2[i21];
                double d19 = dArr9[c12];
                int i22 = i21 + 1;
                double[] dArr10 = dArr2[i22];
                double d20 = d19 / dArr10[i10];
                dArr9[i10] = dArr9[i10] - (dArr10[i7] * d20);
                dArr9[c12] = d16;
                dArr3[i21] = dArr3[i21] - (d20 * dArr3[i22]);
            }
            dArr = new double[size2];
            for (int i23 = i7; i23 < size2; i23++) {
                dArr[i23] = dArr3[i23] / dArr2[i23][i10];
            }
        }
        int length = dArr.length;
        if (length < i10) {
            arrayList2 = null;
            f12 = 0.0f;
        } else {
            arrayList2 = new ArrayList(length + 1);
            int i24 = i7;
            while (i24 < length - 1) {
                PointF pointF5 = (PointF) arrayList.get(i24);
                int i25 = i24 + 1;
                PointF pointF6 = (PointF) arrayList.get(i25);
                int i26 = (int) pointF5.x;
                while (true) {
                    float f20 = pointF6.x;
                    if (i26 < ((int) f20)) {
                        float f21 = i26;
                        PointF pointF7 = pointF5;
                        double d21 = f20 - pointF5.x;
                        double d22 = (f21 - f13) / d21;
                        double d23 = d - d22;
                        int i27 = length;
                        double[] dArr11 = dArr;
                        float f22 = (float) (((((((d22 * d22) * d22) - d22) * dArr11[i25]) + ((((d23 * d23) * d23) - d23) * dArr11[i24])) * ((d21 * d21) / d2)) + (pointF6.y * d22) + (pointF7.y * d23));
                        if (f22 > f11) {
                            f22 = f11;
                        } else if (f22 < 0.0f) {
                            f22 = 0.0f;
                        }
                        arrayList2.add(new PointF(f21, f22));
                        i26++;
                        dArr = dArr11;
                        pointF5 = pointF7;
                        length = i27;
                    }
                }
                i24 = i25;
            }
            f12 = 0.0f;
            arrayList2.add((PointF) i5.c.h(1, arrayList));
        }
        int i28 = i7;
        float f23 = ((PointF) arrayList2.get(i28)).x;
        if (f23 > f12) {
            for (int i29 = (int) f23; i29 >= 0; i29--) {
                arrayList2.add(i28, new PointF(i29, f12));
            }
        }
        float f24 = ((PointF) i5.c.h(1, arrayList2)).x;
        if (f24 < f11) {
            for (int i30 = ((int) f24) + 1; i30 <= 255; i30++) {
                arrayList2.add(new PointF(i30, f11));
            }
        }
        float[] fArr = new float[arrayList2.size()];
        int size3 = arrayList2.size();
        while (i28 < size3) {
            PointF pointF8 = (PointF) arrayList2.get(i28);
            float sqrt = (float) Math.sqrt(Math.pow(pointF8.x - pointF8.y, 2.0d));
            if (pointF8.x > pointF8.y) {
                sqrt = -sqrt;
            }
            fArr[i28] = sqrt;
            i28++;
        }
        return fArr;
    }

    @Override
    public Cursor C(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f17372b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e10) {
            Log.w("FontsProvider", "Unable to query the content provider", e10);
            return null;
        }
    }

    @Override
    public void D0() {
        bu buVar = (bu) this.f17372b;
        bu.j0(buVar, buVar.f23256b0);
    }

    public void E(m1.e1 r7) {
        throw new UnsupportedOperationException("Method not decompiled: j6.r.E(m1.e1):void");
    }

    @Override
    public void I(int i7, int i10, boolean z10) {
        switch (this.f17371a) {
            case 14:
                ((b2) this.f17372b).x0(i7, i10, z10);
                return;
            default:
                ((hd) this.f17372b).a(Boolean.valueOf(z10), Integer.valueOf(i7), Integer.valueOf(i10));
                return;
        }
    }

    @Override
    public i9 K() {
        m3 m3Var = ((s4) this.f17372b).O;
        if (m3Var != null) {
            return m3Var.f22306a.getTextSelectionHelper();
        }
        return null;
    }

    @Override
    public void M(CharSequence charSequence) {
        m3 m3Var = ((s4) this.f17372b).O;
        if (m3Var != null) {
            m3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                m3Var.f22306a.w4(charSequence.toString());
            }
        }
    }

    @Override
    public void N() {
        a3.s sVar;
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.f17372b;
        synchronized (ffmpegAudioRenderer.f19346a) {
            sVar = ffmpegAudioRenderer.I;
        }
        if (sVar != null) {
            sVar.m();
        }
    }

    @Override
    public h9 P() {
        return (s4) this.f17372b;
    }

    @Override
    public void P0() {
        bu buVar = (bu) this.f17372b;
        bu.j0(buVar, null);
        buVar.f23256b0 = null;
    }

    @Override
    public void Q(Exception exc) {
        h2.a.d("DecoderAudioRenderer", "Audio sink error", exc);
        jb.m mVar = ((FfmpegAudioRenderer) this.f17372b).J;
        Handler handler = (Handler) mVar.f17464b;
        if (handler != null) {
            handler.post(new n2.p(mVar, exc, 1));
        }
    }

    @Override
    public void S(fh fhVar) {
        ks.f(kg.n.f0((kg.n) this.f17372b)).d(fhVar);
    }

    @Override
    public boolean T() {
        return false;
    }

    @Override
    public void U(float f10, float f11) {
        ev evVar;
        m1 m1Var;
        bu buVar = (bu) this.f17372b;
        au auVar = buVar.f23256b0;
        if (auVar != null && (m1Var = (evVar = buVar.f28441a).F) != null) {
            m1Var.m1(evVar.E, auVar.f23059c);
        }
    }

    @Override
    public oi.a V() {
        return ((s4) this.f17372b).f22598a;
    }

    @Override
    public boolean V1() {
        return false;
    }

    @Override
    public boolean W() {
        s4 s4Var = (s4) this.f17372b;
        m3 m3Var = s4Var.O;
        if (m3Var != null) {
            oi.a aVar = s4Var.f22598a;
            if (m3Var.f22306a.V4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void Y(int i7, int i10) {
        s4 s4Var = (s4) this.f17372b;
        m3 m3Var = s4Var.O;
        if (m3Var != null) {
            oi.a aVar = s4Var.f22598a;
            g2 g2Var = m3Var.f22306a.R3;
            if (g2Var != null) {
                g2Var.f(i7, i10);
            }
        }
    }

    @Override
    public void a(int i7) {
        jb.m mVar = ((FfmpegAudioRenderer) this.f17372b).J;
        Handler handler = (Handler) mVar.f17464b;
        if (handler != null) {
            handler.post(new u0(mVar, i7, 20));
        }
    }

    @Override
    public int a0() {
        switch (this.f17371a) {
            case 23:
                return 0;
            case 24:
                s7 s7Var = ((t7) this.f17372b).f31935r;
                if (s7Var == null) {
                    return 0;
                }
                int[] iArr = s7Var.f31865c;
                if (iArr != null) {
                    return s7Var.d * (iArr.length - 1);
                }
                return s7Var.a() - s7Var.b();
            default:
                return 0;
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f17371a) {
            case 0:
                s sVar = new s(0, (TaskCompletionSource) obj2);
                i iVar = (i) ((u) obj).n();
                Parcel p12 = iVar.p1();
                com.google.android.gms.internal.cast.t.d(p12, sVar);
                p12.writeStringArray((String[]) this.f17372b);
                iVar.u1(p12, 5);
                return;
            default:
                k7.f fVar = new k7.f(1, (TaskCompletionSource) obj2);
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true), false);
                gVar.f6198c = false;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i7 = t7.a.f57742a;
                obtain.writeStrongBinder(fVar);
                t7.a.b(obtain, (GetCredentialRequest) this.f17372b);
                t7.a.b(obtain, gVar);
                ((k7.b) ((k7.d) ((k7.e) obj).n())).h1(obtain, 1);
                return;
        }
    }

    @Override
    public void b(long j3) {
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.f17372b;
        ffmpegAudioRenderer.f2569h0 = true;
        jb.m mVar = ffmpegAudioRenderer.J;
        Handler handler = (Handler) mVar.f17464b;
        if (handler != null) {
            handler.post(new e4(mVar, j3, 14));
        }
    }

    @Override
    public void c(boolean z10) {
        jb.m mVar = ((FfmpegAudioRenderer) this.f17372b).J;
        Handler handler = (Handler) mVar.f17464b;
        if (handler != null) {
            handler.post(new ch.k(12, mVar, z10));
        }
    }

    @Override
    public void c0() {
        ((FfmpegAudioRenderer) this.f17372b).f2562a0 = true;
    }

    @Override
    public void close() {
        switch (this.f17371a) {
            case 5:
                ((li.r) this.f17372b).finishFragment();
                return;
            default:
                ContentProviderClient contentProviderClient = (ContentProviderClient) this.f17372b;
                if (contentProviderClient != null) {
                    if (contentProviderClient instanceof AutoCloseable) {
                        contentProviderClient.close();
                        return;
                    } else if (contentProviderClient instanceof ExecutorService) {
                        f4.e((ExecutorService) contentProviderClient);
                        return;
                    } else {
                        contentProviderClient.release();
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void d(f1 f1Var) {
        m3 m3Var = ((s4) this.f17372b).O;
        if (m3Var != null) {
            t3 t3Var = m3Var.f22306a;
            t3.Q1(t3Var, f1Var);
            t3Var.f22495p3.b(f1Var, true);
        }
    }

    @Override
    public void e(float f10) {
        oi.x xVar = (oi.x) this.f17372b;
        fj fjVar = xVar.Q;
        if (fjVar == null) {
            return;
        }
        fjVar.f24033b0 = f10;
        MediaController.B().i0(xVar.Q, f10);
    }

    @Override
    public void f(t0 t0Var) {
        jb.m mVar = ((FfmpegAudioRenderer) this.f17372b).J;
        Handler handler = (Handler) mVar.f17464b;
        if (handler != null) {
            handler.post(new n2.r(mVar, t0Var, 0));
        }
    }

    @Override
    public void g() {
        s4 s4Var = (s4) this.f17372b;
        m3 m3Var = s4Var.O;
        if (m3Var != null) {
            t3.T1(m3Var.f22306a, s4Var.f22598a);
        }
    }

    @Override
    public CharSequence getContentDescription() {
        q10 q10Var;
        switch (this.f17371a) {
            case 23:
                return " ";
            case 24:
                t7 t7Var = (t7) this.f17372b;
                try {
                    StringBuilder sb2 = new StringBuilder();
                    if (!TextUtils.isEmpty(t7Var.f31936s)) {
                        sb2.append(t7Var.f31936s);
                    }
                    s7 s7Var = t7Var.f31935r;
                    if (s7Var != null && (q10Var = s7Var.f31866e) != null) {
                        CharSequence charSequence = (CharSequence) q10Var.d(0, Integer.valueOf(t7Var.f31933f));
                        if (!TextUtils.isEmpty(charSequence)) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(charSequence);
                        }
                        CharSequence charSequence2 = (CharSequence) t7Var.f31935r.f31866e.d(-1, Integer.valueOf(t7Var.f31935r.b()));
                        CharSequence charSequence3 = (CharSequence) t7Var.f31935r.f31866e.d(1, Integer.valueOf(t7Var.f31935r.a()));
                        if (!TextUtils.isEmpty(charSequence2) && !TextUtils.isEmpty(charSequence3)) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(charSequence2);
                            sb2.append(" – ");
                            sb2.append(charSequence3);
                        }
                    }
                    if (sb2.length() <= 0) {
                        return null;
                    }
                    return sb2.toString();
                } catch (Throwable th2) {
                    a8.g(th2, true);
                    return t7Var.f31936s;
                }
            default:
                StringBuilder sb3 = new StringBuilder();
                e8 e8Var = (e8) this.f17372b;
                sb3.append(gd.G(e8Var.f34625x2 / 60, "Minutes", new Object[0]));
                sb3.append(' ');
                sb3.append(gd.G(e8Var.f34625x2 % 60, "Seconds", new Object[0]));
                String sb4 = sb3.toString();
                return gd.a0("AccDescrPlayerDuration", null, 2131754805, sb4, gd.G(e8Var.f34627y2 / 60, "Minutes", new Object[0]) + ' ' + gd.G(e8Var.f34627y2 % 60, "Seconds", new Object[0]));
        }
    }

    @Override
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override
    public void h(float f10) {
        fj fjVar = ((oi.x) this.f17372b).Q;
        if (fjVar == null) {
            return;
        }
        fjVar.f24033b0 = f10;
    }

    @Override
    public void h0() {
        s4 s4Var = (s4) this.f17372b;
        m3 m3Var = s4Var.O;
        if (m3Var != null) {
            oi.a aVar = s4Var.f22598a;
            t3 t3Var = m3Var.f22306a;
            g2 g2Var = t3Var.R3;
            if (g2Var != null) {
                g2Var.g();
            }
            t3Var.f22495p3.onContentChanged();
        }
    }

    @Override
    public void i(l.k kVar) {
        switch (this.f17371a) {
            case 6:
                r rVar = ((ActionMenuView) this.f17372b).L;
                if (rVar != null) {
                    rVar.i(kVar);
                    return;
                }
                return;
            default:
                Toolbar toolbar = (Toolbar) this.f17372b;
                m.h hVar = toolbar.f1887a.K;
                if (hVar == null || !hVar.g()) {
                    Iterator it = ((CopyOnWriteArrayList) toolbar.f1888a0.f35959c).iterator();
                    while (it.hasNext()) {
                        ((b0) it.next()).f2292a.t();
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void j(boolean z10, float f10) {
        int[] iArr;
        int round;
        switch (this.f17371a) {
            case 23:
                a61 a61Var = (a61) ((j0) this.f17372b);
                int i7 = (int) (n6.f29684q * 100.0f);
                int i10 = (int) (f10 * 100.0f);
                n6.f29684q = f10;
                if (i7 != i10) {
                    ThemeActivity themeActivity = a61Var.f45607f.f47460e;
                    mj0 mj0Var = (mj0) themeActivity.f43958b.K(themeActivity.f43967g0);
                    if (mj0Var != null) {
                        ((z8) mj0Var.f59245a).setText(gd.a0("AutoNightBrightnessInfo", null, 2131753791, Integer.valueOf((int) (n6.f29684q * 100.0f))));
                    }
                    n6.F(true);
                    return;
                }
                return;
            case 24:
                t7 t7Var = (t7) this.f17372b;
                s7 s7Var = t7Var.f31935r;
                if (s7Var != null && t7Var.f31934n != null) {
                    if (s7Var.f31865c != null) {
                        double length = f10 * (iArr.length - 1);
                        int j3 = Utilities.j((int) Math.floor(length), t7Var.f31935r.f31865c.length - 1, 0);
                        int j10 = Utilities.j((int) Math.ceil(length), t7Var.f31935r.f31865c.length - 1, 0);
                        int[] iArr2 = t7Var.f31935r.f31865c;
                        round = Math.round(g0.W1(Math.round(((float) (length - Math.floor(length))) * t7Var.f31935r.d) / t7Var.f31935r.d, iArr2[j3], iArr2[j10]));
                    } else {
                        round = Math.round(((t7Var.f31935r.a() - t7Var.f31935r.b()) * f10) + s7Var.b());
                    }
                    int i11 = t7Var.h;
                    if (i11 != Integer.MIN_VALUE) {
                        round = Math.max(round, i11);
                    }
                    int i12 = t7Var.f31933f;
                    if (i12 != round) {
                        if (t7Var.c(i12) != t7Var.c(round)) {
                            g0.a4(t7Var.f31932e);
                        }
                        t7Var.f31933f = round;
                        t7Var.e(round, true);
                        w10 w10Var = t7Var.f31934n;
                        if (w10Var != null) {
                            w10Var.a(Integer.valueOf(t7Var.f31933f));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                if (z10) {
                    MediaController.B().i0(MediaController.B().f22838v0, f10);
                }
                fj fjVar = MediaController.B().f22838v0;
                if (fjVar != null && fjVar.I3()) {
                    ((e8) this.f17372b).c1(fjVar, false);
                    return;
                }
                return;
        }
    }

    @Override
    public b3.i k(b3.m mVar, long j3, long j10, IOException iOException, int i7) {
        long min;
        b3.i iVar;
        b3.s sVar = (b3.s) mVar;
        o2.h hVar = (o2.h) this.f17372b;
        long j11 = sVar.f2888a;
        j2.m mVar2 = sVar.f2889b;
        j2.b0 b0Var = sVar.d;
        x2.u uVar = new x2.u(mVar2, b0Var.f17244c, b0Var.d, j3, j10, b0Var.f17243b);
        int i10 = sVar.f2890c;
        hVar.f21722m.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof e2.t0) || (th2 instanceof FileNotFoundException) || (th2 instanceof j2.u) || (th2 instanceof b3.o) || ((th2 instanceof j2.j) && ((j2.j) th2).f17264a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i7 - 1) * 1000, 5000);
        if (min == -9223372036854775807L) {
            iVar = b3.p.f2884f;
        } else {
            iVar = new b3.i(0, min, false);
        }
        hVar.f21726q.q(uVar, i10, iOException, !iVar.a());
        return iVar;
    }

    @Override
    public void k0(long j3, int i7, long j10) {
        jb.m mVar = ((FfmpegAudioRenderer) this.f17372b).J;
        Handler handler = (Handler) mVar.f17464b;
        if (handler != null) {
            handler.post(new b3.b(mVar, i7, j3, j10, 1));
        }
    }

    @Override
    public void l() {
        ((FfmpegAudioRenderer) this.f17372b).f2568g0 = true;
    }

    @Override
    public void m(b3.m mVar, long j3, long j10, boolean z10) {
        ((o2.h) this.f17372b).x((b3.s) mVar, j3, j10);
    }

    @Override
    public void n(long j3) {
        ((li.r) this.f17372b).presentFragment(bn.ua(j3));
    }

    @Override
    public void o() {
        boolean z10;
        li.r rVar = (li.r) this.f17372b;
        te.a aVar = rVar.f20085a;
        li.j0 j0Var = rVar.f20093w;
        if (j0Var.f20053n && j0Var.f20051l == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        aVar.a(z10, true);
        rVar.d.f35323g3.O(true);
    }

    @Override
    public void onComplete(Task task) {
        zd.m mVar = (zd.m) this.f17372b;
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
        mVar.resumeWith(c8.z.a(exception));
    }

    @Override
    public void onError(h61 h61Var, Exception exc) {
        a8.g(exc, true);
    }

    @Override
    public void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i7) {
        z40 z40Var;
        d20 d20Var;
        r40 r40Var = (r40) this.f17372b;
        h61 h61Var = r40Var.I0.T;
        if (h61Var != null && h61Var.d0() && i7 == 4 && (d20Var = (z40Var = r40Var.I0).S) != null) {
            h61 h61Var2 = z40Var.T;
            long j3 = d20Var.f23587a;
            if (j3 <= 0) {
                j3 = 0;
            }
            h61Var2.p0(j3);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public boolean p(l.k kVar, MenuItem menuItem) {
        switch (this.f17371a) {
            case 6:
                m.k kVar2 = ((ActionMenuView) this.f17372b).Q;
                if (kVar2 != null) {
                    Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((hi.u0) kVar2).f15482b).f1888a0.f35959c).iterator();
                    while (it.hasNext()) {
                        if (((b0) it.next()).f2292a.p()) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                ((Toolbar) this.f17372b).getClass();
                return false;
        }
    }

    @Override
    public boolean q1(float f10, float f11) {
        bu buVar = (bu) this.f17372b;
        au i02 = bu.i0(buVar, f10, f11);
        i02 = (i02 == null || i02.f23058b) ? null : null;
        buVar.f23256b0 = i02;
        if (i02 != null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean r1(View view, float f10, float f11) {
        bu buVar = (bu) this.f17372b;
        if (buVar.f23256b0 != null) {
            au i02 = bu.i0(buVar, f10, f11);
            au auVar = buVar.f23256b0;
            if (i02 == auVar) {
                ev evVar = buVar.f28441a;
                m1 m1Var = evVar.F;
                if (m1Var != null) {
                    m1Var.I1(evVar.E, auVar.f23059c);
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public boolean r2() {
        return true;
    }

    @Override
    public void s(t0 t0Var) {
        jb.m mVar = ((FfmpegAudioRenderer) this.f17372b).J;
        Handler handler = (Handler) mVar.f17464b;
        if (handler != null) {
            handler.post(new n2.r(mVar, t0Var, 1));
        }
    }

    @Override
    public boolean s0() {
        return true;
    }

    @Override
    public void t(b3.m mVar, long j3, long j10, int i7) {
        x2.u uVar;
        b3.s sVar = (b3.s) mVar;
        o2.h hVar = (o2.h) this.f17372b;
        if (i7 == 0) {
            long j11 = sVar.f2888a;
            uVar = new x2.u(sVar.f2889b, j3);
        } else {
            long j12 = sVar.f2888a;
            j2.m mVar2 = sVar.f2889b;
            j2.b0 b0Var = sVar.d;
            uVar = new x2.u(mVar2, b0Var.f17244c, b0Var.d, j3, j10, b0Var.f17243b);
        }
        hVar.f21726q.s(uVar, sVar.f2890c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i7);
    }

    @Override
    public void u(float f10, float f11) {
        bu buVar = (bu) this.f17372b;
        au i02 = bu.i0(buVar, f10, f11);
        au auVar = buVar.f23256b0;
        if (i02 != auVar) {
            auVar = null;
        }
        bu.j0(buVar, auVar);
    }

    public e1 v() {
        ce.w wVar = (ce.w) this.f17372b;
        wVar.getClass();
        Object obj = ce.w.f5260e.get(wVar);
        if (obj == de.g.f8342a) {
            obj = null;
        }
        return (e1) obj;
    }

    @Override
    public void w() {
        int i7 = this.f17371a;
    }

    @Override
    public void w0() {
        s4 s4Var = (s4) this.f17372b;
        m3 m3Var = s4Var.O;
        if (m3Var != null) {
            oi.a aVar = s4Var.f22598a;
            t3.S1(m3Var.f22306a);
        }
    }

    @Override
    public void x(b3.m mVar, long j3, long j10) {
        int size;
        long j11;
        b3.s sVar = (b3.s) mVar;
        o2.h hVar = (o2.h) this.f17372b;
        long j12 = sVar.f2888a;
        j2.m mVar2 = sVar.f2889b;
        j2.b0 b0Var = sVar.d;
        x2.u uVar = new x2.u(mVar2, b0Var.f17244c, b0Var.d, j3, j10, b0Var.f17243b);
        hVar.f21722m.getClass();
        hVar.f21726q.o(uVar, sVar.f2890c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        p2.c cVar = (p2.c) sVar.f2892f;
        p2.c cVar2 = hVar.G;
        if (cVar2 == null) {
            size = 0;
        } else {
            size = cVar2.f55220m.size();
        }
        long j13 = cVar.b(0).f55239b;
        int i7 = 0;
        while (i7 < size && hVar.G.b(i7).f55239b < j13) {
            i7++;
        }
        if (cVar.d) {
            if (size - i7 > cVar.f55220m.size()) {
                h2.a.l("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j14 = hVar.M;
                j11 = -9223372036854775807L;
                if (j14 != -9223372036854775807L && cVar.h * 1000 <= j14) {
                    h2.a.l("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.h + ", " + hVar.M);
                } else {
                    hVar.L = 0;
                }
            }
            int i10 = hVar.L;
            hVar.L = i10 + 1;
            if (i10 < hVar.f21722m.R4(sVar.f2890c)) {
                hVar.D.postDelayed(hVar.v, Math.min((hVar.L - 1) * 1000, 5000));
                return;
            }
            hVar.C = new IOException();
            return;
        }
        j11 = -9223372036854775807L;
        hVar.G = cVar;
        hVar.H = cVar.d & hVar.H;
        hVar.I = j3 - j10;
        hVar.J = j3;
        hVar.N += i7;
        synchronized (hVar.f21729t) {
            try {
                if (sVar.f2889b.f17276a.equals(hVar.E)) {
                    Uri uri = hVar.G.f55218k;
                    if (uri == null) {
                        uri = h7.a(sVar.d.f17244c);
                    }
                    hVar.E = uri;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        p2.c cVar3 = hVar.G;
        if (cVar3.d && hVar.K == j11) {
            f5.a aVar = cVar3.f55216i;
            if (aVar != null) {
                String str = aVar.f11238b;
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
                        hVar.A(aVar, new nb.a(16));
                        return;
                    }
                    hVar.A(aVar, new Object());
                    return;
                }
                try {
                    hVar.K = l0.V(aVar.f11239c) - hVar.J;
                    hVar.z(true);
                    return;
                } catch (e2.t0 e10) {
                    hVar.y(e10);
                    return;
                }
            }
            hVar.w();
            return;
        }
        hVar.z(true);
    }

    public r(t tVar, String[] strArr) {
        this.f17371a = 0;
        this.f17372b = strArr;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public r(Object obj, int i7) {
        this.f17371a = i7;
        this.f17372b = obj;
    }

    public r() {
        this.f17371a = 8;
        this.f17372b = new ce.w(m1.f1.f20428b);
    }

    public r(String str, long j3) {
        this.f17371a = 18;
        this.f17372b = new org.telegram.messenger.l0(str, j3);
    }

    public r(Context context, Uri uri) {
        this.f17371a = 11;
        this.f17372b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public r(String str, Set set) {
        this.f17371a = 19;
        this.f17372b = new o0(str, set);
    }

    public r(String str, boolean z10) {
        this.f17371a = 17;
        this.f17372b = new org.telegram.messenger.h0(str, z10);
    }

    private final void A() {
    }

    private final void D() {
    }

    private final void z() {
    }

    @Override
    public void B0() {
    }

    @Override
    public void f0() {
    }

    @Override
    public void l0() {
    }

    @Override
    public void q() {
    }

    @Override
    public void O0(Object obj) {
    }

    @Override
    public void h1(TLRPC.User user) {
    }

    @Override
    public void onSeekFinished(m2.a aVar) {
    }

    @Override
    public void onSeekStarted(m2.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void B(View view, float f10, float f11) {
    }

    @Override
    public void X1(View view, float f10, float f11) {
    }

    @Override
    public void r(View view, float f10, float f11) {
    }

    @Override
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
    }

    @Override
    public void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
    }

    @Override
    public void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
