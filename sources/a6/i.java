package a6;

import a3.m0;
import a3.n;
import ai.e5;
import ai.gc;
import ai.h6;
import ai.hc;
import ai.i6;
import ai.r4;
import ai.r5;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.RectF;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.biometric.e0;
import androidx.fragment.app.g0;
import androidx.lifecycle.a0;
import b5.p;
import ci.i0;
import ci.nb;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.internal.cast.v;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import ei.c5;
import fi.s0;
import g.r;
import g6.q;
import gg.a2;
import gg.j1;
import i2.j0;
import ii.e2;
import ii.e6;
import ii.i1;
import ii.i2;
import ii.k0;
import ii.k3;
import ii.k4;
import ii.q3;
import ii.r3;
import ii.u3;
import ii.v3;
import ii.v4;
import ii.w3;
import ii.x3;
import ii.z;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import l.w;
import lg.o;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.lh;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.eo;
import org.telegram.ui.n01;
import org.telegram.ui.tz0;
import pg.r1;
import pg.t0;
import qg.v1;
import v7.i5;
import v7.z6;
public final class i implements m0, s, gc, a0, androidx.activity.result.b, p, o, v1, v0, OnSuccessListener, SuccessContinuation, s0, w, a2, yi, k0, v3 {
    public static i f324c;
    public final int f325a;
    public Object f326b;

    public i(int i10, boolean z10) {
        this.f325a = i10;
    }

    public static FingerprintManager Q(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 23) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        if (i10 > 23 && context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        return null;
    }

    public static synchronized i Y(Context context) {
        i c02;
        synchronized (i.class) {
            c02 = c0(context.getApplicationContext());
        }
        return c02;
    }

    public static synchronized i c0(Context context) {
        synchronized (i.class) {
            i iVar = f324c;
            if (iVar != null) {
                return iVar;
            }
            i iVar2 = new i(context);
            f324c = iVar2;
            return iVar2;
        }
    }

    public static com.google.android.gms.common.api.internal.p s(Looper looper, Object obj, String str) {
        n6.m.i(obj, "Listener must not be null");
        n6.m.i(looper, "Looper must not be null");
        return new com.google.android.gms.common.api.internal.p(looper, obj, str);
    }

    @Override
    public void A(int i10) {
        k6.a aVar;
        x xVar = (x) this.f326b;
        Lock lock = xVar.f6709o;
        lock.lock();
        try {
            if (!xVar.f6708n && (aVar = xVar.f6707m) != null && aVar.c()) {
                xVar.f6708n = true;
                xVar.f6701e.onConnectionSuspended(i10);
                lock.unlock();
            }
            xVar.f6708n = false;
            x.k(xVar, i10);
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    public ic.a B(float f7, float f10, int i10, int i11) {
        int i12;
        ic.a b10;
        ic.a b11;
        int i13 = (int) (f10 * f7);
        int max = Math.max(0, i10 - i13);
        dc.b bVar = (dc.b) this.f326b;
        int min = Math.min(bVar.f8269a - 1, i10 + i13) - max;
        float f11 = 3.0f * f7;
        if (min >= f11) {
            int max2 = Math.max(0, i11 - i13);
            int min2 = Math.min(bVar.f8270b - 1, i11 + i13) - max2;
            if (min2 >= f11) {
                dc.b bVar2 = (dc.b) this.f326b;
                ic.b bVar3 = new ic.b(bVar2, max, max2, min, min2, f7);
                int i14 = bVar3.f12095e;
                int i15 = bVar3.f12094c;
                int i16 = i14 + i15;
                int i17 = bVar3.f12096f;
                int i18 = (i17 / 2) + bVar3.d;
                int[] iArr = new int[3];
                for (int i19 = 0; i19 < i17; i19++) {
                    if ((i19 & 1) == 0) {
                        i12 = (i19 + 1) / 2;
                    } else {
                        i12 = -((i19 + 1) / 2);
                    }
                    int i20 = i12 + i18;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    iArr[2] = 0;
                    int i21 = i15;
                    while (i21 < i16 && !bVar2.b(i21, i20)) {
                        i21++;
                    }
                    int i22 = 0;
                    while (i21 < i16) {
                        if (bVar2.b(i21, i20)) {
                            if (i22 == 1) {
                                iArr[1] = iArr[1] + 1;
                            } else if (i22 == 2) {
                                if (bVar3.a(iArr) && (b11 = bVar3.b(i20, i21, iArr)) != null) {
                                    return b11;
                                }
                                iArr[0] = iArr[2];
                                iArr[1] = 1;
                                iArr[2] = 0;
                                i22 = 1;
                            } else {
                                i22++;
                                iArr[i22] = iArr[i22] + 1;
                            }
                        } else {
                            if (i22 == 1) {
                                i22++;
                            }
                            iArr[i22] = iArr[i22] + 1;
                        }
                        i21++;
                    }
                    if (bVar3.a(iArr) && (b10 = bVar3.b(i20, i16, iArr)) != null) {
                        return b10;
                    }
                }
                ArrayList arrayList = bVar3.f12093b;
                if (!arrayList.isEmpty()) {
                    return (ic.a) arrayList.get(0);
                }
                throw cc.e.a();
            }
            throw cc.e.a();
        }
        throw cc.e.a();
    }

    @Override
    public void C() {
        n nVar = (n) this.f326b;
        if (nVar.f172m1 != null) {
            nVar.N0(0, 1);
        }
    }

    @Override
    public void D() {
        e2 e2Var = (e2) this.f326b;
        int i10 = 0;
        e2.Z(e2Var, false, true);
        int i11 = e2Var.I0;
        if (i11 != 2) {
            i10 = i11;
        }
        e2Var.x0(i10, true);
    }

    @Override
    public o9 E() {
        switch (this.f325a) {
            case 26:
                r3 r3Var = ((z) this.f326b).O;
                if (r3Var != null) {
                    return r3Var.f12657a.getTextSelectionHelper();
                }
                return null;
            default:
                q3 q3Var = ((v4) this.f326b).N;
                if (q3Var != null) {
                    return q3Var.f12642a.getTextSelectionHelper();
                }
                return null;
        }
    }

    @Override
    public void F(Bundle bundle) {
        x xVar = (x) this.f326b;
        xVar.f6709o.lock();
        try {
            Bundle bundle2 = xVar.f6705k;
            if (bundle2 == null) {
                xVar.f6705k = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            xVar.f6706l = k6.a.f14692e;
            x.l(xVar);
        } finally {
            xVar.f6709o.unlock();
        }
    }

    @Override
    public a0.i G() {
        return null;
    }

    @Override
    public void H() {
        j0 j0Var = ((n) this.f326b).W;
        if (j0Var != null) {
            j0Var.a();
        }
    }

    @Override
    public void I(CharSequence charSequence) {
        switch (this.f325a) {
            case 26:
                r3 r3Var = ((z) this.f326b).O;
                if (r3Var != null) {
                    r3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        r3Var.f12657a.u4(charSequence.toString());
                        return;
                    }
                    return;
                }
                return;
            default:
                q3 q3Var = ((v4) this.f326b).N;
                if (q3Var != null) {
                    q3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        q3Var.f12642a.u4(charSequence.toString());
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public s80 J(View view) {
        return s80.H((e2) this.f326b, view);
    }

    @Override
    public n9 L() {
        switch (this.f325a) {
            case 26:
                return (z) this.f326b;
            default:
                return (v4) this.f326b;
        }
    }

    @Override
    public void M() {
        e2 e2Var = (e2) this.f326b;
        e2Var.z0();
        e2Var.C0();
    }

    @Override
    public ii.a N() {
        switch (this.f325a) {
            case 26:
                return ((z) this.f326b).f12249a;
            default:
                return ((v4) this.f326b).f12249a;
        }
    }

    @Override
    public void O(u3 u3Var, View view) {
        e2 e2Var = (e2) this.f326b;
        s80 H = s80.H(e2Var, view);
        H.Q = true;
        e2Var.f12392x0 = k4.c(H, e2Var, e2Var.getParentActivity(), e2Var.getResourceProvider(), u3Var, false);
    }

    @Override
    public boolean P() {
        switch (this.f325a) {
            case 26:
                z zVar = (z) this.f326b;
                r3 r3Var = zVar.O;
                if (r3Var != null) {
                    ii.a aVar = zVar.f12249a;
                    if (r3Var.f12657a.T4()) {
                        return true;
                    }
                }
                return false;
            default:
                v4 v4Var = (v4) this.f326b;
                q3 q3Var = v4Var.N;
                if (q3Var != null) {
                    ii.a aVar2 = v4Var.f12249a;
                    if (q3Var.f12642a.T4()) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override
    public void R(int i10, int i11) {
        switch (this.f325a) {
            case 26:
                z zVar = (z) this.f326b;
                r3 r3Var = zVar.O;
                if (r3Var != null) {
                    ii.a aVar = zVar.f12249a;
                    i2 i2Var = r3Var.f12657a.H3;
                    if (i2Var != null) {
                        i2Var.f(i10, i11);
                        return;
                    }
                    return;
                }
                return;
            default:
                v4 v4Var = (v4) this.f326b;
                q3 q3Var = v4Var.N;
                if (q3Var != null) {
                    ii.a aVar2 = v4Var.f12249a;
                    i2 i2Var2 = q3Var.f12642a.H3;
                    if (i2Var2 != null) {
                        i2Var2.f(i10, i11);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public float S(int i10, int i11, int i12, int i13) {
        boolean z10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z11;
        i iVar;
        int i22;
        boolean z12 = true;
        if (Math.abs(i13 - i11) > Math.abs(i12 - i10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i15 = i10;
            i14 = i11;
            i17 = i12;
            i16 = i13;
        } else {
            i14 = i10;
            i15 = i11;
            i16 = i12;
            i17 = i13;
        }
        int abs = Math.abs(i16 - i14);
        int abs2 = Math.abs(i17 - i15);
        int i23 = 2;
        int i24 = (-abs) / 2;
        int i25 = -1;
        if (i14 < i16) {
            i18 = 1;
        } else {
            i18 = -1;
        }
        if (i15 < i17) {
            i25 = 1;
        }
        int i26 = i16 + i18;
        int i27 = i14;
        int i28 = i15;
        int i29 = 0;
        while (true) {
            if (i27 != i26) {
                if (z10) {
                    i20 = i28;
                } else {
                    i20 = i27;
                }
                if (z10) {
                    i21 = i27;
                } else {
                    i21 = i28;
                }
                boolean z13 = z10;
                if (i29 == z12) {
                    z11 = z12;
                    i22 = abs;
                    iVar = this;
                } else {
                    z11 = false;
                    iVar = this;
                    i22 = abs;
                }
                if (z11 == ((dc.b) iVar.f326b).b(i20, i21)) {
                    if (i29 == 2) {
                        return z6.b(i27, i28, i14, i15);
                    }
                    i29++;
                }
                i24 += abs2;
                if (i24 > 0) {
                    if (i28 == i17) {
                        i19 = 2;
                        break;
                    }
                    i28 += i25;
                    i24 -= i22;
                }
                i27 += i18;
                abs = i22;
                z10 = z13;
                z12 = true;
                i23 = 2;
            } else {
                i19 = i23;
                break;
            }
        }
        if (i29 == i19) {
            return z6.b(i26, i17, i14, i15);
        }
        return Float.NaN;
    }

    public float U(int i10, int i11, int i12, int i13) {
        float f7;
        float f10;
        dc.b bVar = (dc.b) this.f326b;
        float S = S(i10, i11, i12, i13);
        int i14 = i10 - (i12 - i10);
        int i15 = 0;
        if (i14 < 0) {
            f7 = i10 / (i10 - i14);
            i14 = 0;
        } else {
            int i16 = bVar.f8269a;
            if (i14 >= i16) {
                int i17 = i16 - 1;
                f7 = ((i16 - 1) - i10) / (i14 - i10);
                i14 = i17;
            } else {
                f7 = 1.0f;
            }
        }
        float f11 = i11;
        int i18 = (int) (f11 - ((i13 - i11) * f7));
        if (i18 < 0) {
            f10 = f11 / (i11 - i18);
        } else {
            int i19 = bVar.f8270b;
            if (i18 >= i19) {
                f10 = ((i19 - 1) - i11) / (i18 - i11);
                i15 = i19 - 1;
            } else {
                i15 = i18;
                f10 = 1.0f;
            }
        }
        return (S(i10, i11, (int) (((i14 - i10) * f10) + i10), i15) + S) - 1.0f;
    }

    @Override
    public void V() {
        switch (this.f325a) {
            case 26:
                z zVar = (z) this.f326b;
                r3 r3Var = zVar.O;
                if (r3Var != null) {
                    ii.a aVar = zVar.f12249a;
                    x3 x3Var = r3Var.f12657a;
                    i2 i2Var = x3Var.H3;
                    if (i2Var != null) {
                        i2Var.g();
                    }
                    x3Var.f12807f3.onContentChanged();
                    return;
                }
                return;
            default:
                v4 v4Var = (v4) this.f326b;
                q3 q3Var = v4Var.N;
                if (q3Var != null) {
                    ii.a aVar2 = v4Var.f12249a;
                    x3 x3Var2 = q3Var.f12642a;
                    i2 i2Var2 = x3Var2.H3;
                    if (i2Var2 != null) {
                        i2Var2.g();
                    }
                    x3Var2.f12807f3.onContentChanged();
                    return;
                }
                return;
        }
    }

    @Override
    public a0.i W() {
        return null;
    }

    @Override
    public boolean Y1() {
        return false;
    }

    @Override
    public void Z(long j3, int i10, e5 e5Var) {
        int i11 = ProfileStoriesView.f34336s0;
        ((tz0) this.f326b).f(true, false);
        e5Var.run();
    }

    @Override
    public void a(long j3) {
        ((fi.s) this.f326b).presentFragment(eo.W9(j3));
    }

    public synchronized void a0() {
        synchronized (this) {
            b bVar = (b) this.f326b;
            ReentrantLock reentrantLock = bVar.f307a;
            reentrantLock.lock();
            bVar.f308b.edit().clear().apply();
            reentrantLock.unlock();
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f325a) {
            case 2:
                a8.e eVar = new a8.e(1, (TaskCompletionSource) obj2);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i10 = a8.a.f331a;
                obtain.writeStrongBinder(eVar);
                obtain.writeInt(1);
                ((l8.c) this.f326b).writeToParcel(obtain, 0);
                ((a8.c) ((a8.g) obj).u()).F0(obtain, 1);
                return;
            default:
                q qVar = new q(2, (TaskCompletionSource) obj2);
                g6.i iVar = (g6.i) ((g6.s) obj).u();
                Parcel N0 = iVar.N0();
                v.d(N0, qVar);
                N0.writeStringArray((String[]) this.f326b);
                iVar.S0(N0, 7);
                return;
        }
    }

    @Override
    public boolean b0(int i10) {
        return true;
    }

    @Override
    public void c(i1 i1Var) {
        switch (this.f325a) {
            case 26:
                r3 r3Var = ((z) this.f326b).O;
                if (r3Var != null) {
                    x3 x3Var = r3Var.f12657a;
                    x3.N1(x3Var, i1Var);
                    x3Var.f12807f3.w(i1Var, true);
                    return;
                }
                return;
            default:
                q3 q3Var = ((v4) this.f326b).N;
                if (q3Var != null) {
                    x3 x3Var2 = q3Var.f12642a;
                    x3.N1(x3Var2, i1Var);
                    x3Var2.f12807f3.w(i1Var, true);
                    return;
                }
                return;
        }
    }

    @Override
    public void close() {
        ((fi.s) this.f326b).finishFragment();
    }

    @Override
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) te.b.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f326b).createWebView(webView));
    }

    @Override
    public void d(l.k kVar, boolean z10) {
        boolean z11;
        int i10;
        g.q qVar;
        r rVar = (r) this.f326b;
        l.k k10 = kVar.k();
        int i11 = 0;
        if (k10 != kVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            kVar = k10;
        }
        g.q[] qVarArr = rVar.U;
        if (qVarArr != null) {
            i10 = qVarArr.length;
        } else {
            i10 = 0;
        }
        while (true) {
            if (i11 < i10) {
                qVar = qVarArr[i11];
                if (qVar != null && qVar.h == kVar) {
                    break;
                }
                i11++;
            } else {
                qVar = null;
                break;
            }
        }
        if (qVar != null) {
            if (z11) {
                rVar.f(qVar.f10148a, qVar, k10);
                rVar.h(qVar, true);
                return;
            }
            rVar.h(qVar, z10);
        }
    }

    @Override
    public void d0(lh lhVar) {
        NotificationCenter.getInstance(hg.n.a0((hg.n) this.f326b)).doOnIdle(lhVar);
    }

    @Override
    public boolean d1(long j3, int i10, int i11, int i12, hc hcVar) {
        ImageReceiver imageReceiver;
        i6 i6Var;
        i6 i6Var2;
        i6 i6Var3;
        i6 i6Var4;
        hcVar.f1104b = null;
        hcVar.f1105c = null;
        tz0 tz0Var = (tz0) this.f326b;
        n01 n01Var = tz0Var.h;
        ArrayList arrayList = tz0Var.f34362w;
        if (tz0Var.N < 0.2f) {
            hcVar.f1104b = n01Var.getImageReceiver();
            hcVar.f1105c = null;
            hcVar.f1103a = n01Var;
            hcVar.h = 0.0f;
            hcVar.f1109i = AndroidUtilities.displaySize.y;
            hcVar.f1108g = (View) tz0Var.getParent();
            hcVar.d = tz0Var.f34364y;
            hcVar.f1114n = true;
            return true;
        }
        int i13 = 0;
        while (true) {
            if (i13 < arrayList.size()) {
                i6 i6Var5 = (i6) arrayList.get(i13);
                if (i6Var5.f1141e >= 1.0f && i6Var5.f1138a == i11) {
                    int i14 = i13 - 1;
                    if (i14 >= 0) {
                        i6Var3 = (i6) arrayList.get(i14);
                    } else {
                        i6Var3 = null;
                    }
                    int i15 = i13 - 2;
                    if (i15 >= 0) {
                        i6Var4 = (i6) arrayList.get(i15);
                    } else {
                        i6Var4 = null;
                    }
                    i6 d = ProfileStoriesView.d(i6Var3, i6Var4, i6Var5);
                    imageReceiver = i6Var5.f1139b;
                    i6Var2 = d;
                    i6Var = i6Var5;
                } else {
                    i13++;
                }
            } else {
                imageReceiver = null;
                i6Var = null;
                i6Var2 = null;
                break;
            }
        }
        if (imageReceiver == null) {
            return false;
        }
        hcVar.f1105c = imageReceiver;
        hcVar.f1104b = null;
        hcVar.f1103a = tz0Var;
        hcVar.h = 0.0f;
        hcVar.f1109i = AndroidUtilities.displaySize.y;
        hcVar.f1108g = (View) tz0Var.getParent();
        if (i6Var != null && i6Var2 != null) {
            hcVar.f1107f = new h6(this, new RectF(i6Var.f1148m), i6Var, new RectF(i6Var2.f1148m), i6Var2);
            return true;
        }
        hcVar.f1107f = null;
        return true;
    }

    @Override
    public void e(w3 w3Var, View view) {
        e2 e2Var = (e2) this.f326b;
        s80 H = s80.H(e2Var, view);
        H.Q = true;
        e2Var.getParentActivity();
        e2Var.getResourceProvider();
        e2Var.f12392x0 = k4.b(H, e2Var, w3Var, false);
    }

    @Override
    public void e0() {
        switch (this.f325a) {
            case 26:
                z zVar = (z) this.f326b;
                r3 r3Var = zVar.O;
                if (r3Var != null) {
                    ii.a aVar = zVar.f12249a;
                    x3.P1(r3Var.f12657a);
                    return;
                }
                return;
            default:
                v4 v4Var = (v4) this.f326b;
                q3 q3Var = v4Var.N;
                if (q3Var != null) {
                    ii.a aVar2 = v4Var.f12249a;
                    x3.P1(q3Var.f12642a);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean f(float f7) {
        boolean z10;
        int[] iArr;
        e2 e2Var = (e2) this.f326b;
        FrameLayout frameLayout = e2Var.f12388v0;
        if (frameLayout != null) {
            frameLayout.getLocationOnScreen(new int[2]);
            if (f7 >= iArr[1]) {
                z10 = true;
                e2.Z(e2Var, z10, true);
                return z10;
            }
        }
        z10 = false;
        e2.Z(e2Var, z10, true);
        return z10;
    }

    @Override
    public void g() {
        switch (this.f325a) {
            case 26:
                z zVar = (z) this.f326b;
                r3 r3Var = zVar.O;
                if (r3Var != null) {
                    x3.Q1(r3Var.f12657a, zVar.f12249a);
                    return;
                }
                return;
            default:
                v4 v4Var = (v4) this.f326b;
                q3 q3Var = v4Var.N;
                if (q3Var != null) {
                    x3.Q1(q3Var.f12642a, v4Var.f12249a);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean g0() {
        return false;
    }

    @Override
    public float get() {
        nb nbVar = (nb) this.f326b;
        int i10 = nbVar.F1;
        pg.m currentBrush = nbVar.O0.getCurrentBrush();
        if (currentBrush == null) {
            return t0.e(i10).f45690i;
        }
        return t0.e(i10).f(String.valueOf(pg.m.f45587a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) te.b.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f326b).getStatics());
    }

    @Override
    public void h(int i10) {
        ((j1) this.f326b).l();
    }

    @Override
    public void h0(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        e0 e0Var = (e0) this.f326b;
        Handler handler = e0Var.A0;
        r4 r4Var = e0Var.B0;
        handler.removeCallbacks(r4Var);
        TextView textView = e0Var.G0;
        if (textView != null) {
            textView.setText(charSequence);
        }
        handler.postDelayed(r4Var, 2000L);
    }

    @Override
    public void i() {
        boolean z10;
        fi.s sVar = (fi.s) this.f326b;
        me.b bVar = sVar.f10038a;
        fi.t0 t0Var = sVar.v;
        if (t0Var.f10059n && t0Var.f10057l == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        bVar.a(z10, true);
        sVar.d.W2.N(true);
    }

    @Override
    public void i0(ArrayList arrayList) {
        j1 j1Var = (j1) this.f326b;
        String str = j1Var.Z;
        if (str != null) {
            j1Var.U(str, j1Var.f10667c0, j1Var.f10668d0, j1Var.f10665b0, j1Var.f10664a0);
        }
    }

    @Override
    public String[] j() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f326b).getSupportedFeatures();
    }

    @Override
    public void k(Object obj) {
        int i10;
        Bundle extras;
        switch (this.f325a) {
            case 5:
                Map map = (Map) obj;
                androidx.fragment.app.k0 k0Var = (androidx.fragment.app.k0) this.f326b;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    if (((Boolean) arrayList.get(i11)).booleanValue()) {
                        i10 = 0;
                    } else {
                        i10 = -1;
                    }
                    iArr[i11] = i10;
                }
                g0 g0Var = (g0) k0Var.F.pollFirst();
                if (g0Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    return;
                }
                String str = g0Var.f2686a;
                if (k0Var.f2697c.l(str) == null) {
                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    return;
                }
                return;
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f326b;
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar.f2159b;
                int i12 = aVar.f2158a;
                if (intent == null) {
                    extras = null;
                } else {
                    extras = intent.getExtras();
                }
                if (i12 != -1) {
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    u.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i12);
                    extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                    extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i12);
                }
                int i13 = u.e("ProxyBillingActivityV2", intent).f4252a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.O;
                if (resultReceiver != null) {
                    resultReceiver.send(i13, extras);
                } else {
                    u.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                }
                if (i13 != 0) {
                    u.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i13);
                }
                proxyBillingActivityV2.finish();
                return;
        }
    }

    @Override
    public void l(e6 e6Var, String str) {
        e2 e2Var = (e2) this.f326b;
        if (e2Var.f12395z0 == null) {
            e2Var.f12395z0 = new m.r3(new c5(this, 15), e2Var.getResourceProvider());
        }
        e2Var.f12395z0.f(e6Var, str);
    }

    @Override
    public void l0(float f7) {
        nb nbVar = (nb) this.f326b;
        t0.e(nbVar.F1).k(String.valueOf(pg.m.f45587a.indexOf(nbVar.O0.getCurrentBrush())), f7);
        r1 r1Var = nbVar.A1;
        r1Var.f45658c = f7;
        nbVar.D0(r1Var, null, false);
    }

    @Override
    public void m(int i10) {
        ((e2) this.f326b).o0(74, i10);
    }

    @Override
    public void n() {
        int i10;
        e2 e2Var = (e2) this.f326b;
        k3 k3Var = e2Var.P.f12818l3;
        if (k3Var != null && k3Var.x() && e2Var.P.D4()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        e2Var.x0(i10, true);
        e2Var.y0();
        e2Var.w0();
    }

    public void o(aa.a aVar, b2.p pVar, m mVar) {
        CancellationSignal cancellationSignal;
        CancellationSignal cancellationSignal2;
        FingerprintManager.CryptoObject cryptoObject = null;
        if (pVar != null) {
            synchronized (pVar) {
                try {
                    if (((CancellationSignal) pVar.f3504c) == null) {
                        CancellationSignal cancellationSignal3 = new CancellationSignal();
                        pVar.f3504c = cancellationSignal3;
                        if (pVar.f3503b) {
                            cancellationSignal3.cancel();
                        }
                    }
                    cancellationSignal2 = (CancellationSignal) pVar.f3504c;
                } finally {
                }
            }
            cancellationSignal = cancellationSignal2;
        } else {
            cancellationSignal = null;
        }
        FingerprintManager Q = Q((Context) this.f326b);
        if (Q != null) {
            if (aVar != null) {
                Mac mac = (Mac) aVar.d;
                Signature signature = (Signature) aVar.f386b;
                Cipher cipher = (Cipher) aVar.f387c;
                if (cipher != null) {
                    cryptoObject = new FingerprintManager.CryptoObject(cipher);
                } else if (signature != null) {
                    cryptoObject = new FingerprintManager.CryptoObject(signature);
                } else if (mac != null) {
                    cryptoObject = new FingerprintManager.CryptoObject(mac);
                }
            }
            Q.authenticate(cryptoObject, cancellationSignal, 0, new k0.a(mVar), null);
        }
    }

    @Override
    public void onContentChanged() {
        e2 e2Var = (e2) this.f326b;
        if (e2Var.f12394y0 != null) {
            boolean n32 = e2Var.P.n3();
            e2Var.L0 = n32;
            e2Var.f12394y0.h(n32);
            e2Var.f12394y0.invalidate();
        }
        e2Var.C0();
        Runnable runnable = e2Var.M0;
        AndroidUtilities.cancelRunOnUIThread(runnable);
        AndroidUtilities.runOnUIThread(runnable, 1000L);
    }

    @Override
    public void onFirstFrameRendered() {
        n nVar = (n) this.f326b;
        Surface surface = nVar.f172m1;
        if (surface != null) {
            nVar.Y0.T(surface);
            nVar.f175p1 = true;
        }
    }

    @Override
    public void onSuccess(Object obj) {
        ((d6.a) this.f326b).getClass();
        i5.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    @Override
    public void p() {
        e2 e2Var = (e2) this.f326b;
        e2Var.I0 = e2Var.K0;
        e2.Z(e2Var, false, false);
        e2Var.x0(2, true);
    }

    @Override
    public void q(ii.a aVar) {
        e2 e2Var = (e2) this.f326b;
        if (aVar != null && (aVar.f12232b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(e2Var)) {
            aj ajVar = new aj(e2Var.getParentActivity(), e2Var, false, false, false, e2Var.getResourceProvider());
            ajVar.f24329c2 = new qb.b(11);
            ajVar.P = true;
            ajVar.A1.setVisibility(8);
            ajVar.f24393w2 = new r5(e2Var, aVar, ajVar, 11);
            ajVar.t1();
            ajVar.show();
        }
    }

    public float r(ic.c cVar, ic.c cVar2) {
        int i10 = (int) cVar.f4603b;
        int i11 = (int) cVar2.f4603b;
        float U = U((int) cVar.f4602a, i10, (int) cVar2.f4602a, i11);
        float U2 = U((int) cVar2.f4602a, i11, (int) cVar.f4602a, i10);
        if (Float.isNaN(U)) {
            return U2 / 7.0f;
        }
        if (Float.isNaN(U2)) {
            return U / 7.0f;
        }
        return (U + U2) / 14.0f;
    }

    @Override
    public void t(k6.a aVar) {
        x xVar = (x) this.f326b;
        xVar.f6709o.lock();
        try {
            xVar.f6706l = aVar;
            x.l(xVar);
        } finally {
            xVar.f6709o.unlock();
        }
    }

    @Override
    public Task then(Object obj) {
        JSONObject jSONObject;
        FileWriter fileWriter;
        Void r13 = (Void) obj;
        da.c cVar = (da.c) this.f326b;
        da.a aVar = (da.a) cVar.f8233f;
        da.e eVar = (da.e) cVar.f8230b;
        String str = aVar.f8223b;
        FileWriter fileWriter2 = null;
        try {
            HashMap b10 = da.a.b(eVar);
            aa.a aVar2 = new aa.a(str, b10);
            aVar2.r("User-Agent", "Crashlytics Android SDK/18.6.0");
            aVar2.r("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            da.a.a(aVar2, eVar);
            String str2 = "Requesting settings from " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            String str3 = "Settings query params were: " + b10;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str3, null);
            }
            jSONObject = aVar.c(aVar2.j());
        } catch (IOException e7) {
            Log.e("FirebaseCrashlytics", "Settings request failed.", e7);
            jSONObject = null;
        }
        if (jSONObject != null) {
            da.b l02 = ((a4.l) cVar.f8231c).l0(jSONObject);
            m mVar = (m) cVar.f8232e;
            long j3 = l02.f8226c;
            mVar.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j3);
                fileWriter = new FileWriter((File) mVar.f330b);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Exception e10) {
                        e = e10;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        w9.h.c(fileWriter, "Failed to close settings writer.");
                        da.c.f("Loaded settings: ", jSONObject);
                        String str4 = eVar.f8240f;
                        SharedPreferences.Editor edit = ((Context) cVar.f8229a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                        edit.putString("existing_instance_identifier", str4);
                        edit.apply();
                        ((AtomicReference) cVar.h).set(l02);
                        ((TaskCompletionSource) ((AtomicReference) cVar.f8235i).get()).trySetResult(l02);
                        return Tasks.forResult(null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter2 = fileWriter;
                    w9.h.c(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                fileWriter = null;
            } catch (Throwable th3) {
                th = th3;
                w9.h.c(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            w9.h.c(fileWriter, "Failed to close settings writer.");
            da.c.f("Loaded settings: ", jSONObject);
            String str42 = eVar.f8240f;
            SharedPreferences.Editor edit2 = ((Context) cVar.f8229a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            edit2.putString("existing_instance_identifier", str42);
            edit2.apply();
            ((AtomicReference) cVar.h).set(l02);
            ((TaskCompletionSource) ((AtomicReference) cVar.f8235i).get()).trySetResult(l02);
        }
        return Tasks.forResult(null);
    }

    @Override
    public void u() {
        ((i0) this.f326b).d.invalidate();
    }

    @Override
    public boolean x(l.k kVar) {
        Window.Callback callback;
        r rVar = (r) this.f326b;
        if (kVar == kVar.k() && rVar.O && (callback = rVar.f10171f.getCallback()) != null && !rVar.Z) {
            callback.onMenuOpened(108, kVar);
            return true;
        }
        return true;
    }

    public i(g6.r rVar, String[] strArr) {
        this.f325a = 21;
        this.f326b = strArr;
    }

    public i(Object obj, int i10) {
        this.f325a = i10;
        this.f326b = obj;
    }

    public i(Context context) {
        String d;
        this.f325a = 0;
        b a2 = b.a(context);
        this.f326b = a2;
        a2.b();
        String d10 = a2.d("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(d10) || (d = a2.d(b.f("googleSignInOptions", d10))) == null) {
            return;
        }
        try {
            GoogleSignInOptions.b(d);
        } catch (JSONException unused) {
        }
    }

    public i(int i10) {
        this.f325a = i10;
        switch (i10) {
            case 8:
                this.f326b = new e2.v(10);
                return;
            case 13:
                this.f326b = Collections.newSetFromMap(new WeakHashMap());
                return;
            default:
                this.f326b = new LinkedHashMap(0, 0.75f, true);
                return;
        }
    }

    @Override
    public void A0() {
    }

    @Override
    public void K() {
    }

    @Override
    public void P0() {
    }

    @Override
    public void X() {
    }

    @Override
    public void v() {
    }

    @Override
    public void T(boolean z10) {
    }

    @Override
    public void Z0(Object obj) {
    }

    @Override
    public void b(boolean z10) {
    }

    @Override
    public void p1(TLRPC.User user) {
    }

    @Override
    public void y(int i10) {
    }

    @Override
    public void z(boolean z10) {
    }

    @Override
    public void w(i1 i1Var, boolean z10) {
    }

    @Override
    public void c2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }

    @Override
    public void I1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
    }
}
