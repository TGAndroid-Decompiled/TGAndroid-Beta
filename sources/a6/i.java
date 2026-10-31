package a6;

import a3.n;
import a3.n0;
import ag.d3;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
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
import androidx.biometric.f0;
import androidx.fragment.app.j0;
import androidx.lifecycle.a0;
import b2.b2;
import b5.p;
import bi.a4;
import bi.b0;
import bi.b4;
import bi.c4;
import bi.d4;
import bi.f5;
import bi.k2;
import bi.m0;
import bi.n1;
import bi.o2;
import bi.q3;
import bi.q6;
import bi.t4;
import bi.w3;
import bi.x3;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.internal.g0;
import com.google.android.gms.common.api.internal.l0;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.w0;
import com.google.android.gms.internal.cast.u;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import e9.j1;
import g.r;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import k2.q;
import k2.t;
import k2.v;
import k2.x0;
import k2.z;
import k2.z0;
import l.x;
import m.p3;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.i0;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.Components.z60;
import org.telegram.ui.er0;
import td.m;
import v7.k5;
import x2.o;
import zf.l1;
public final class i implements n0, s, l1, a0, androidx.activity.result.b, p, be.a, m0, b4, l0, w0, OnSuccessListener, OnCompleteListener, d9.k, SuccessContinuation, mn0, x, jg.c, z {
    public static i f305c;
    public final int f306a;
    public Object f307b;

    public i(com.google.android.gms.common.api.j jVar, Object obj, int i10) {
        this.f306a = i10;
        this.f307b = obj;
    }

    public static synchronized i n0(Context context) {
        i q02;
        synchronized (i.class) {
            q02 = q0(context.getApplicationContext());
        }
        return q02;
    }

    public static synchronized i q0(Context context) {
        synchronized (i.class) {
            i iVar = f305c;
            if (iVar != null) {
                return iVar;
            }
            i iVar2 = new i(context);
            f305c = iVar2;
            return iVar2;
        }
    }

    @Override
    public boolean B(l.l lVar) {
        Window.Callback callback;
        r rVar = (r) this.f307b;
        if (lVar == lVar.k() && rVar.O && (callback = rVar.f7228f.getCallback()) != null && !rVar.Z) {
            callback.onMenuOpened(108, lVar);
            return true;
        }
        return true;
    }

    @Override
    public void D(q6 q6Var, String str) {
        k2 k2Var = (k2) this.f307b;
        if (k2Var.f3168z0 == null) {
            k2Var.f3168z0 = new p3(new a1.c(this, 9), k2Var.getResourceProvider());
        }
        k2Var.f3168z0.g(q6Var, str);
    }

    @Override
    public void F(CharSequence charSequence) {
        switch (this.f306a) {
            case 9:
                x3 x3Var = ((b0) this.f307b).O;
                if (x3Var != null) {
                    x3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        x3Var.f3450a.w4(charSequence.toString());
                        return;
                    }
                    return;
                }
                return;
            default:
                w3 w3Var = ((f5) this.f307b).N;
                if (w3Var != null) {
                    w3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        w3Var.f3436a.w4(charSequence.toString());
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public String[] G() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f307b).getSupportedFeatures();
    }

    @Override
    public void H() {
        o oVar;
        z0 z0Var = (z0) this.f307b;
        synchronized (z0Var.f7807a) {
            oVar = z0Var.H;
        }
        if (oVar != null) {
            oVar.m();
        }
    }

    @Override
    public j9 J() {
        switch (this.f306a) {
            case 9:
                return (b0) this.f307b;
            default:
                return (f5) this.f307b;
        }
    }

    @Override
    public bi.a L() {
        switch (this.f306a) {
            case 9:
                return ((b0) this.f307b).f2881a;
            default:
                return ((f5) this.f307b).f2881a;
        }
    }

    @Override
    public a0.h M() {
        return null;
    }

    @Override
    public void N(c4 c4Var, View view) {
        k2 k2Var = (k2) this.f307b;
        z60 H = z60.H(k2Var, view);
        H.Q = true;
        k2Var.getParentActivity();
        k2Var.getResourceProvider();
        k2Var.f3165x0 = t4.b(H, k2Var, c4Var, false);
    }

    @Override
    public boolean O() {
        switch (this.f306a) {
            case 9:
                b0 b0Var = (b0) this.f307b;
                x3 x3Var = b0Var.O;
                if (x3Var != null) {
                    bi.a aVar = b0Var.f2881a;
                    if (x3Var.f3450a.V4()) {
                        return true;
                    }
                }
                return false;
            default:
                f5 f5Var = (f5) this.f307b;
                w3 w3Var = f5Var.N;
                if (w3Var != null) {
                    bi.a aVar2 = f5Var.f2881a;
                    if (w3Var.f3436a.V4()) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override
    public void P(Exception exc) {
        e2.a.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        hf.b bVar = ((z0) this.f307b).f10813a1;
        Handler handler = (Handler) bVar.f7657b;
        if (handler != null) {
            handler.post(new q(bVar, exc, 1));
        }
    }

    @Override
    public void Q() {
        com.google.android.gms.common.api.internal.n0 n0Var = (com.google.android.gms.common.api.internal.n0) this.f307b;
        for (com.google.android.gms.common.api.c cVar : n0Var.f4446f.values()) {
            cVar.j();
        }
        n0Var.f4453o.F = Collections.EMPTY_SET;
    }

    @Override
    public void R(int i10, int i11) {
        switch (this.f306a) {
            case 9:
                b0 b0Var = (b0) this.f307b;
                x3 x3Var = b0Var.O;
                if (x3Var != null) {
                    bi.a aVar = b0Var.f2881a;
                    o2 o2Var = x3Var.f3450a.Q3;
                    if (o2Var != null) {
                        o2Var.f(i10, i11);
                        return;
                    }
                    return;
                }
                return;
            default:
                f5 f5Var = (f5) this.f307b;
                w3 w3Var = f5Var.N;
                if (w3Var != null) {
                    bi.a aVar2 = f5Var.f2881a;
                    o2 o2Var2 = w3Var.f3436a.Q3;
                    if (o2Var2 != null) {
                        o2Var2.f(i10, i11);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void S() {
        ((z0) this.f307b).f10822j1 = true;
    }

    @Override
    public void T() {
        k2 k2Var = (k2) this.f307b;
        int i10 = 0;
        k2.d0(k2Var, false, true);
        int i11 = k2Var.I0;
        if (i11 != 2) {
            i10 = i11;
        }
        k2Var.B0(i10, true);
    }

    @Override
    public z60 U(View view) {
        return z60.H((k2) this.f307b, view);
    }

    @Override
    public void V() {
        n nVar = (n) this.f307b;
        if (nVar.f163r1 != null) {
            nVar.R0(0, 1);
        }
    }

    @Override
    public void W() {
        switch (this.f306a) {
            case 9:
                b0 b0Var = (b0) this.f307b;
                x3 x3Var = b0Var.O;
                if (x3Var != null) {
                    bi.a aVar = b0Var.f2881a;
                    d4 d4Var = x3Var.f3450a;
                    o2 o2Var = d4Var.Q3;
                    if (o2Var != null) {
                        o2Var.g();
                    }
                    d4Var.f2938o3.onContentChanged();
                    return;
                }
                return;
            default:
                f5 f5Var = (f5) this.f307b;
                w3 w3Var = f5Var.N;
                if (w3Var != null) {
                    bi.a aVar2 = f5Var.f2881a;
                    d4 d4Var2 = w3Var.f3436a;
                    o2 o2Var2 = d4Var2.Q3;
                    if (o2Var2 != null) {
                        o2Var2.g();
                    }
                    d4Var2.f2938o3.onContentChanged();
                    return;
                }
                return;
        }
    }

    @Override
    public void X() {
        i2.m0 m0Var = ((n) this.f307b).Y;
        if (m0Var != null) {
            m0Var.a();
        }
    }

    @Override
    public boolean Y(int i10) {
        return true;
    }

    @Override
    public void Z() {
        k2 k2Var = (k2) this.f307b;
        k2Var.D0();
        k2Var.G0();
    }

    @Override
    public void a(int i10) {
        r2.j jVar;
        z0 z0Var = (z0) this.f307b;
        if (Build.VERSION.SDK_INT >= 35 && (jVar = z0Var.f10815c1) != null) {
            jVar.d(i10);
        }
        hf.b bVar = z0Var.f10813a1;
        Handler handler = (Handler) bVar.f7657b;
        if (handler != null) {
            handler.post(new d3(bVar, i10, 9));
        }
    }

    @Override
    public void a0(x0 x0Var) {
        hf.b bVar = ((z0) this.f307b).f10813a1;
        Handler handler = (Handler) bVar.f7657b;
        if (handler != null) {
            handler.post(new t(bVar, x0Var, 1));
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f306a) {
            case 2:
                a8.e eVar = new a8.e(1, (TaskCompletionSource) obj2);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i10 = a8.a.f310a;
                obtain.writeStrongBinder(eVar);
                obtain.writeInt(1);
                ((l8.c) this.f307b).writeToParcel(obtain, 0);
                ((a8.c) ((a8.g) obj).v()).H0(obtain, 1);
                return;
            case 24:
                g6.q qVar = new g6.q(2, (TaskCompletionSource) obj2);
                g6.i iVar = (g6.i) ((g6.s) obj).v();
                Parcel P0 = iVar.P0();
                u.d(P0, qVar);
                P0.writeStringArray((String[]) this.f307b);
                iVar.U0(P0, 7);
                return;
            default:
                l lVar = new l((TaskCompletionSource) obj2);
                i7.i iVar2 = (i7.i) ((i7.c) obj).v();
                Parcel L0 = iVar2.L0();
                int i11 = i7.f.f8231a;
                L0.writeStrongBinder(lVar);
                i7.f.c(L0, (x5.e) this.f307b);
                iVar2.M0(L0, 1);
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        e9.l1 l1Var = (e9.l1) this.f307b;
        l1Var.getClass();
        entry.getClass();
        return new j1(entry, l1Var);
    }

    @Override
    public void b(n1 n1Var) {
        switch (this.f306a) {
            case 9:
                x3 x3Var = ((b0) this.f307b).O;
                if (x3Var != null) {
                    d4 d4Var = x3Var.f3450a;
                    d4.P1(d4Var, n1Var);
                    d4Var.f2938o3.h(n1Var, true);
                    return;
                }
                return;
            default:
                w3 w3Var = ((f5) this.f307b).N;
                if (w3Var != null) {
                    d4 d4Var2 = w3Var.f3436a;
                    d4.P1(d4Var2, n1Var);
                    d4Var2.f2938o3.h(n1Var, true);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean b0() {
        return true;
    }

    @Override
    public boolean c(float f7) {
        boolean z10;
        int[] iArr;
        k2 k2Var = (k2) this.f307b;
        FrameLayout frameLayout = k2Var.f3161v0;
        if (frameLayout != null) {
            frameLayout.getLocationOnScreen(new int[2]);
            if (f7 >= iArr[1]) {
                z10 = true;
                k2.d0(k2Var, z10, true);
                return z10;
            }
        }
        z10 = false;
        k2.d0(k2Var, z10, true);
        return z10;
    }

    @Override
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) me.b.b(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f307b).createWebView(webView));
    }

    @Override
    public void d0(bi.a aVar) {
        k2 k2Var = (k2) this.f307b;
        if (aVar != null && (aVar.f2818b instanceof TL_iv.pageBlockMap) && i0.J1(k2Var)) {
            bi biVar = new bi(k2Var.getParentActivity(), k2Var, false, false, false, k2Var.getResourceProvider());
            biVar.T3 = new oa.d(3);
            biVar.G1 = true;
            biVar.f24718r3.setVisibility(8);
            biVar.f24715q4 = new androidx.car.app.utils.a(k2Var, aVar, biVar, 3);
            biVar.d1();
            biVar.show();
        }
    }

    @Override
    public void e(boolean z10) {
        hf.b bVar = ((z0) this.f307b).f10813a1;
        Handler handler = (Handler) bVar.f7657b;
        if (handler != null) {
            handler.post(new v(0, bVar, z10));
        }
    }

    @Override
    public void e0(x0 x0Var) {
        hf.b bVar = ((z0) this.f307b).f10813a1;
        Handler handler = (Handler) bVar.f7657b;
        if (handler != null) {
            handler.post(new t(bVar, x0Var, 0));
        }
    }

    @Override
    public void f(long j10) {
        z0 z0Var = (z0) this.f307b;
        z0Var.f10824m1 = true;
        hf.b bVar = z0Var.f10813a1;
        Handler handler = (Handler) bVar.f7657b;
        if (handler != null) {
            handler.post(new bi.e(bVar, j10, 2));
        }
    }

    @Override
    public void f0() {
        i2.m0 m0Var = ((z0) this.f307b).Y;
        if (m0Var != null) {
            m0Var.a();
        }
    }

    @Override
    public void g(l.l lVar, boolean z10) {
        boolean z11;
        int i10;
        g.q qVar;
        r rVar = (r) this.f307b;
        l.l k10 = lVar.k();
        int i11 = 0;
        if (k10 != lVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            lVar = k10;
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
                if (qVar != null && qVar.h == lVar) {
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
                rVar.f(qVar.f7207a, qVar, k10);
                rVar.h(qVar, true);
                return;
            }
            rVar.h(qVar, z10);
        }
    }

    @Override
    public jg.j g0() {
        return ((er0) this.f307b).B0;
    }

    @Override
    public CharSequence getContentDescription() {
        fg.k kVar = (fg.k) this.f307b;
        float f7 = kVar.f7081b;
        return String.valueOf(Math.round((kVar.f7080a.getProgress() * (kVar.f7082c - f7)) + f7));
    }

    @Override
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) me.b.b(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f307b).getStatics());
    }

    @Override
    public void h0() {
        switch (this.f306a) {
            case 9:
                b0 b0Var = (b0) this.f307b;
                x3 x3Var = b0Var.O;
                if (x3Var != null) {
                    bi.a aVar = b0Var.f2881a;
                    d4.R1(x3Var.f3450a);
                    return;
                }
                return;
            default:
                f5 f5Var = (f5) this.f307b;
                w3 w3Var = f5Var.N;
                if (w3Var != null) {
                    bi.a aVar2 = f5Var.f2881a;
                    d4.R1(w3Var.f3436a);
                    return;
                }
                return;
        }
    }

    @Override
    public void i(int i10) {
        i0.g3(new a3.d(this, 6));
    }

    @Override
    public void i0(long j10, int i10, long j11) {
        hf.b bVar = ((z0) this.f307b).f10813a1;
        Handler handler = (Handler) bVar.f7657b;
        if (handler != null) {
            handler.post(new k2.s(bVar, i10, j10, j11, 0));
        }
    }

    @Override
    public void j() {
        switch (this.f306a) {
            case 9:
                b0 b0Var = (b0) this.f307b;
                x3 x3Var = b0Var.O;
                if (x3Var != null) {
                    d4.S1(x3Var.f3450a, b0Var.f2881a);
                    return;
                }
                return;
            default:
                f5 f5Var = (f5) this.f307b;
                w3 w3Var = f5Var.N;
                if (w3Var != null) {
                    d4.S1(w3Var.f3436a, f5Var.f2881a);
                    return;
                }
                return;
        }
    }

    @Override
    public com.google.android.gms.common.api.internal.e j0(com.google.android.gms.common.api.internal.e eVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override
    public void k(boolean z10, float f7) {
        fg.k kVar = (fg.k) this.f307b;
        float f10 = kVar.f7081b;
        float z11 = c3.i0.z(kVar.f7082c, f10, f7, f10);
        kVar.d = z11;
        if (z10) {
            h6 h6Var = kVar.e;
            h6Var.getClass();
            h6Var.c(null, z11);
        }
        kVar.invalidate();
    }

    @Override
    public void k0(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        f0 f0Var = (f0) this.f307b;
        Handler handler = f0Var.A0;
        androidx.activity.i iVar = f0Var.B0;
        handler.removeCallbacks(iVar);
        TextView textView = f0Var.G0;
        if (textView != null) {
            textView.setText(charSequence);
        }
        handler.postDelayed(iVar, 2000L);
    }

    public void l0(StringBuilder sb2, Iterator it) {
        com.google.android.gms.internal.clearcut.e eVar = (com.google.android.gms.internal.clearcut.e) this.f307b;
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb2.append(com.google.android.gms.internal.clearcut.e.c(entry.getKey()));
            sb2.append("=");
            sb2.append(com.google.android.gms.internal.clearcut.e.c(entry.getValue()));
            while (it.hasNext()) {
                sb2.append((CharSequence) eVar.f4910a);
                Map.Entry entry2 = (Map.Entry) it.next();
                sb2.append(com.google.android.gms.internal.clearcut.e.c(entry2.getKey()));
                sb2.append("=");
                sb2.append(com.google.android.gms.internal.clearcut.e.c(entry2.getValue()));
            }
        }
    }

    @Override
    public void m(Object obj) {
        int i10;
        Bundle extras;
        switch (this.f306a) {
            case 5:
                Map map = (Map) obj;
                j0 j0Var = (j0) this.f307b;
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
                androidx.fragment.app.f0 f0Var = (androidx.fragment.app.f0) j0Var.F.pollFirst();
                if (f0Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    return;
                }
                String str = f0Var.f1464a;
                if (j0Var.f1478c.s(str) == null) {
                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    return;
                }
                return;
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f307b;
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar.f965b;
                int i12 = aVar.f964a;
                if (intent == null) {
                    extras = null;
                } else {
                    extras = intent.getExtras();
                }
                if (i12 != -1) {
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i12);
                    extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                    extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i12);
                }
                int i13 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).f3785a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.O;
                if (resultReceiver != null) {
                    resultReceiver.send(i13, extras);
                } else {
                    com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                }
                if (i13 != 0) {
                    com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i13);
                }
                proxyBillingActivityV2.finish();
                return;
        }
    }

    public b2.u0 m0(c3.p r12, q3.g r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: a6.i.m0(c3.p, q3.g, int):b2.u0");
    }

    @Override
    public void n() {
        ((z0) this.f307b).l1 = true;
    }

    @Override
    public void o() {
        i2.m0 m0Var = ((z0) this.f307b).Y;
        if (m0Var != null) {
            m0Var.f7968a.f8059i0 = true;
        }
    }

    public synchronized void o0() {
        synchronized (this) {
            b bVar = (b) this.f307b;
            ReentrantLock reentrantLock = bVar.f289a;
            reentrantLock.lock();
            bVar.f290b.edit().clear().apply();
            reentrantLock.unlock();
        }
    }

    @Override
    public void onComplete(Task task) {
        m mVar = (m) this.f307b;
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
        mVar.resumeWith(l9.b.a(exception));
    }

    @Override
    public void onContentChanged() {
        k2 k2Var = (k2) this.f307b;
        if (k2Var.f3167y0 != null) {
            boolean p32 = k2Var.P.p3();
            k2Var.L0 = p32;
            k2Var.f3167y0.h(p32);
            k2Var.f3167y0.invalidate();
        }
        k2Var.G0();
        Runnable runnable = k2Var.M0;
        i0.r(runnable);
        i0.h3(runnable, 1000L);
    }

    @Override
    public void onFirstFrameRendered() {
        n nVar = (n) this.f307b;
        Surface surface = nVar.f163r1;
        if (surface != null) {
            nVar.f148b1.k0(surface);
            nVar.f166u1 = true;
        }
    }

    @Override
    public void onSuccess(Object obj) {
        ((d6.a) this.f307b).getClass();
        k5.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    @Override
    public void p(int i10) {
        ((k2) this.f307b).s0(74, i10);
    }

    @Override
    public int p0() {
        return 0;
    }

    @Override
    public void q() {
        com.google.android.gms.common.api.internal.n0 n0Var = (com.google.android.gms.common.api.internal.n0) this.f307b;
        n0Var.f4443a.lock();
        try {
            n0Var.f4451m = new g0(n0Var, n0Var.f4448j, n0Var.f4449k, n0Var.d, n0Var.f4450l, n0Var.f4443a, n0Var.f4445c);
            n0Var.f4451m.Q();
            n0Var.f4444b.signalAll();
        } finally {
            n0Var.f4443a.unlock();
        }
    }

    @Override
    public void r() {
        int i10;
        k2 k2Var = (k2) this.f307b;
        q3 q3Var = k2Var.P.f2950u3;
        if (q3Var != null && q3Var.x() && k2Var.P.F4()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        k2Var.B0(i10, true);
        k2Var.C0();
        k2Var.A0();
    }

    @Override
    public void s() {
        ((er0) this.f307b).q0(null, true);
    }

    @Override
    public void t(k6.a aVar) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.f307b;
        xVar.f4512o.lock();
        try {
            xVar.f4510m = aVar;
            com.google.android.gms.common.api.internal.x.l(xVar);
        } finally {
            xVar.f4512o.unlock();
        }
    }

    @Override
    public Task then(Object obj) {
        JSONObject jSONObject;
        FileWriter fileWriter;
        Void r13 = (Void) obj;
        ea.d dVar = (ea.d) this.f307b;
        ea.a aVar = (ea.a) dVar.f6469f;
        ea.f fVar = (ea.f) dVar.f6467b;
        String str = aVar.f6458b;
        FileWriter fileWriter2 = null;
        try {
            HashMap b10 = ea.a.b(fVar);
            android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(str, b10);
            a0Var.t("User-Agent", "Crashlytics Android SDK/18.6.0");
            a0Var.t("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            ea.a.a(a0Var, fVar);
            String str2 = "Requesting settings from " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            String str3 = "Settings query params were: " + b10;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str3, null);
            }
            jSONObject = aVar.c(a0Var.l());
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Settings request failed.", e);
            jSONObject = null;
        }
        if (jSONObject != null) {
            ea.c z10 = ((a4.l) dVar.f6468c).z(jSONObject);
            k6.h hVar = (k6.h) dVar.e;
            long j10 = z10.f6464c;
            hVar.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j10);
                fileWriter = new FileWriter((File) hVar.f10943b);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Exception e7) {
                        e = e7;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        x9.h.c(fileWriter, "Failed to close settings writer.");
                        ea.d.f("Loaded settings: ", jSONObject);
                        SharedPreferences.Editor edit = ((Context) dVar.f6466a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                        edit.putString("existing_instance_identifier", (String) fVar.f6476f);
                        edit.apply();
                        ((AtomicReference) dVar.h).set(z10);
                        ((TaskCompletionSource) ((AtomicReference) dVar.f6471i).get()).trySetResult(z10);
                        return Tasks.forResult(null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter2 = fileWriter;
                    x9.h.c(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e10) {
                e = e10;
                fileWriter = null;
            } catch (Throwable th3) {
                th = th3;
                x9.h.c(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            x9.h.c(fileWriter, "Failed to close settings writer.");
            ea.d.f("Loaded settings: ", jSONObject);
            SharedPreferences.Editor edit2 = ((Context) dVar.f6466a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            edit2.putString("existing_instance_identifier", (String) fVar.f6476f);
            edit2.apply();
            ((AtomicReference) dVar.h).set(z10);
            ((TaskCompletionSource) ((AtomicReference) dVar.f6471i).get()).trySetResult(z10);
        }
        return Tasks.forResult(null);
    }

    @Override
    public void u() {
        k2 k2Var = (k2) this.f307b;
        k2Var.I0 = k2Var.K0;
        k2.d0(k2Var, false, false);
        k2Var.B0(2, true);
    }

    @Override
    public void v(a4 a4Var, View view) {
        k2 k2Var = (k2) this.f307b;
        z60 H = z60.H(k2Var, view);
        H.Q = true;
        k2Var.f3165x0 = t4.c(H, k2Var, k2Var.getParentActivity(), k2Var.getResourceProvider(), a4Var, false);
    }

    @Override
    public void w(int i10) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.f307b;
        Lock lock = xVar.f4512o;
        lock.lock();
        try {
            if (xVar.f4511n) {
                xVar.f4511n = false;
                com.google.android.gms.common.api.internal.x.k(xVar, i10);
            } else {
                xVar.f4511n = true;
                xVar.d.onConnectionSuspended(i10);
            }
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override
    public a0.h x() {
        return null;
    }

    @Override
    public k9 y() {
        switch (this.f306a) {
            case 9:
                x3 x3Var = ((b0) this.f307b).O;
                if (x3Var != null) {
                    return x3Var.f3450a.getTextSelectionHelper();
                }
                return null;
            default:
                w3 w3Var = ((f5) this.f307b).N;
                if (w3Var != null) {
                    return w3Var.f3436a.getTextSelectionHelper();
                }
                return null;
        }
    }

    @Override
    public void z(Bundle bundle) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.f307b;
        xVar.f4512o.lock();
        try {
            xVar.f4510m = k6.a.e;
            com.google.android.gms.common.api.internal.x.l(xVar);
        } finally {
            xVar.f4512o.unlock();
        }
    }

    public i(Object obj, int i10) {
        this.f306a = i10;
        this.f307b = obj;
    }

    public i(Context context) {
        String d;
        this.f306a = 0;
        b a2 = b.a(context);
        this.f307b = a2;
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
        this.f306a = i10;
        switch (i10) {
            case 12:
                this.f307b = new e2.x(10);
                return;
            case 13:
                return;
            case 26:
                this.f307b = new HashMap();
                return;
            default:
                this.f307b = new LinkedHashMap(0, 0.75f, true);
                return;
        }
    }

    @Override
    public void A() {
    }

    @Override
    public void C() {
    }

    @Override
    public void E(int i10) {
    }

    @Override
    public void K(int i10) {
    }

    @Override
    public void c0(ArrayList arrayList) {
    }

    @Override
    public void d(b2 b2Var) {
    }

    @Override
    public void l(Bundle bundle) {
    }

    @Override
    public void h(n1 n1Var, boolean z10) {
    }

    @Override
    public void I(k6.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
    }
}
