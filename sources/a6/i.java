package a6;

import a3.m0;
import ai.e5;
import ai.fc;
import ai.gc;
import ai.h6;
import ai.i6;
import ai.q4;
import ai.r5;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.biometric.e0;
import androidx.lifecycle.a0;
import b5.p;
import ci.a7;
import ci.d7;
import ci.m;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.internal.g0;
import com.google.android.gms.common.api.internal.k0;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.v;
import ei.d5;
import i2.i0;
import ii.d2;
import ii.d6;
import ii.h2;
import ii.i1;
import ii.j3;
import ii.j4;
import ii.p3;
import ii.q3;
import ii.t3;
import ii.u3;
import ii.u4;
import ii.v3;
import ii.w3;
import ii.z;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import m.s3;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.v71;
import org.telegram.ui.Components.va0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.y70;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.m01;
import org.telegram.ui.rz0;
import r0.l1;
import r0.n;
import v7.u7;
public final class i implements m0, s, fc, a0, androidx.activity.result.b, p, va0, s71, k0, v0, OnCompleteListener, n, db.n, he.c, ii.k0, u3 {
    public static i f300c;
    public final int f301a;
    public Object f302b;

    public i(int i10, boolean z10) {
        this.f301a = i10;
    }

    public static synchronized i S(Context context) {
        i W;
        synchronized (i.class) {
            W = W(context.getApplicationContext());
        }
        return W;
    }

    public static synchronized i W(Context context) {
        synchronized (i.class) {
            i iVar = f300c;
            if (iVar != null) {
                return iVar;
            }
            i iVar2 = new i(context);
            f300c = iVar2;
            return iVar2;
        }
    }

    @Override
    public r9 A() {
        switch (this.f301a) {
            case 25:
                q3 q3Var = ((z) this.f302b).O;
                if (q3Var != null) {
                    return q3Var.f11574a.getTextSelectionHelper();
                }
                return null;
            default:
                p3 p3Var = ((u4) this.f302b).N;
                if (p3Var != null) {
                    return p3Var.f11563a.getTextSelectionHelper();
                }
                return null;
        }
    }

    @Override
    public void B() {
        a3.n nVar = (a3.n) this.f302b;
        if (nVar.f160n1 != null) {
            nVar.N0(0, 1);
        }
    }

    @Override
    public void C(CharSequence charSequence) {
        switch (this.f301a) {
            case 25:
                q3 q3Var = ((z) this.f302b).O;
                if (q3Var != null) {
                    q3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        q3Var.f11574a.u4(charSequence.toString());
                        return;
                    }
                    return;
                }
                return;
            default:
                p3 p3Var = ((u4) this.f302b).N;
                if (p3Var != null) {
                    p3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        p3Var.f11563a.u4(charSequence.toString());
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void D() {
        d2 d2Var = (d2) this.f302b;
        int i10 = 0;
        d2.Z(d2Var, false, true);
        int i11 = d2Var.I0;
        if (i11 != 2) {
            i10 = i11;
        }
        d2Var.x0(i10, true);
    }

    @Override
    public boolean E() {
        return true;
    }

    @Override
    public q9 F() {
        switch (this.f301a) {
            case 25:
                return (z) this.f302b;
            default:
                return (u4) this.f302b;
        }
    }

    @Override
    public y70 G(View view) {
        return y70.H((d2) this.f302b, view);
    }

    @Override
    public ii.a H() {
        switch (this.f301a) {
            case 25:
                return ((z) this.f302b).f11221a;
            default:
                return ((u4) this.f302b).f11221a;
        }
    }

    @Override
    public void I() {
        d2 d2Var = (d2) this.f302b;
        d2Var.z0();
        d2Var.C0();
    }

    @Override
    public void J() {
        i0 i0Var = ((a3.n) this.f302b).W;
        if (i0Var != null) {
            i0Var.a();
        }
    }

    @Override
    public boolean K() {
        switch (this.f301a) {
            case 25:
                z zVar = (z) this.f302b;
                q3 q3Var = zVar.O;
                if (q3Var != null) {
                    ii.a aVar = zVar.f11221a;
                    if (q3Var.f11574a.T4()) {
                        return true;
                    }
                }
                return false;
            default:
                u4 u4Var = (u4) this.f302b;
                p3 p3Var = u4Var.N;
                if (p3Var != null) {
                    ii.a aVar2 = u4Var.f11221a;
                    if (p3Var.f11563a.T4()) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override
    public void L(t3 t3Var, View view) {
        d2 d2Var = (d2) this.f302b;
        y70 H = y70.H(d2Var, view);
        H.Q = true;
        d2Var.f11330x0 = j4.c(H, d2Var, d2Var.getParentActivity(), d2Var.getResourceProvider(), t3Var, false);
    }

    @Override
    public void M(int i10, int i11, CharSequence charSequence, boolean z10) {
        ci.g gVar = ((m) this.f302b).f4994f;
        if (gVar == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gVar.getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                Emoji.replaceEmoji(spannableStringBuilder, gVar.getEditText().getPaint().getFontMetricsInt(), false);
            }
            gVar.setText(spannableStringBuilder);
            gVar.setSelection(i10 + charSequence.length());
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public void N(int i10, int i11) {
        switch (this.f301a) {
            case 25:
                z zVar = (z) this.f302b;
                q3 q3Var = zVar.O;
                if (q3Var != null) {
                    ii.a aVar = zVar.f11221a;
                    h2 h2Var = q3Var.f11574a.J3;
                    if (h2Var != null) {
                        h2Var.f(i10, i11);
                        return;
                    }
                    return;
                }
                return;
            default:
                u4 u4Var = (u4) this.f302b;
                p3 p3Var = u4Var.N;
                if (p3Var != null) {
                    ii.a aVar2 = u4Var.f11221a;
                    h2 h2Var2 = p3Var.f11563a.J3;
                    if (h2Var2 != null) {
                        h2Var2.f(i10, i11);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public com.google.android.gms.common.api.internal.e O(com.google.android.gms.common.api.internal.e eVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override
    public l1 P0(View view, l1 l1Var) {
        boolean z10;
        l1 l1Var2;
        int b10;
        int c10;
        boolean z11;
        int c11;
        int d = l1Var.d();
        g.s sVar = (g.s) this.f302b;
        Context context = sVar.e;
        int d10 = l1Var.d();
        ActionBarContextView actionBarContextView = sVar.f9314y;
        int i10 = 8;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sVar.f9314y.getLayoutParams();
            boolean z12 = true;
            if (sVar.f9314y.isShown()) {
                if (sVar.f9305l0 == null) {
                    sVar.f9305l0 = new Rect();
                    sVar.m0 = new Rect();
                }
                Rect rect = sVar.f9305l0;
                Rect rect2 = sVar.m0;
                rect.set(l1Var.b(), l1Var.d(), l1Var.c(), l1Var.a());
                ViewGroup viewGroup = sVar.J;
                Method method = s3.f14546a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                    }
                }
                int i11 = rect.top;
                int i12 = rect.left;
                int i13 = rect.right;
                l1 f7 = r0.i0.f(sVar.J);
                if (f7 == null) {
                    b10 = 0;
                } else {
                    b10 = f7.b();
                }
                if (f7 == null) {
                    c10 = 0;
                } else {
                    c10 = f7.c();
                }
                if (marginLayoutParams.topMargin == i11 && marginLayoutParams.leftMargin == i12 && marginLayoutParams.rightMargin == i13) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i11;
                    marginLayoutParams.leftMargin = i12;
                    marginLayoutParams.rightMargin = i13;
                    z11 = true;
                }
                if (i11 > 0 && sVar.L == null) {
                    View view2 = new View(context);
                    sVar.L = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b10;
                    layoutParams.rightMargin = c10;
                    sVar.J.addView(sVar.L, -1, layoutParams);
                } else {
                    View view3 = sVar.L;
                    if (view3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        int i14 = marginLayoutParams2.height;
                        int i15 = marginLayoutParams.topMargin;
                        if (i14 != i15 || marginLayoutParams2.leftMargin != b10 || marginLayoutParams2.rightMargin != c10) {
                            marginLayoutParams2.height = i15;
                            marginLayoutParams2.leftMargin = b10;
                            marginLayoutParams2.rightMargin = c10;
                            sVar.L.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view4 = sVar.L;
                if (view4 == null) {
                    z12 = false;
                }
                if (z12 && view4.getVisibility() != 0) {
                    View view5 = sVar.L;
                    if ((view5.getWindowSystemUiVisibility() & 8192) != 0) {
                        c11 = f0.e.c(context, 2131099654);
                    } else {
                        c11 = f0.e.c(context, 2131099653);
                    }
                    view5.setBackgroundColor(c11);
                }
                if (!sVar.Q && z12) {
                    d10 = 0;
                }
                z10 = z12;
                z12 = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                z12 = false;
            }
            if (z12) {
                sVar.f9314y.setLayoutParams(marginLayoutParams);
            }
        } else {
            z10 = false;
        }
        View view6 = sVar.L;
        if (view6 != null) {
            if (z10) {
                i10 = 0;
            }
            view6.setVisibility(i10);
        }
        if (d != d10) {
            l1Var2 = l1Var.f(l1Var.b(), d10, l1Var.c(), l1Var.a());
        } else {
            l1Var2 = l1Var;
        }
        return r0.i0.h(view, l1Var2);
    }

    public da.a Q(JSONObject jSONObject) {
        da.c bVar;
        int i10 = jSONObject.getInt("settings_version");
        if (i10 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.", null);
            bVar = new ob.a(7);
        } else {
            bVar = new qb.b(7);
        }
        return bVar.s2((na.d) this.f302b, jSONObject);
    }

    public db.i R(Object obj) {
        db.g gVar = ((gb.a0) this.f302b).f9535b;
        gVar.getClass();
        if (obj == null) {
            return db.k.f7608a;
        }
        Class<?> cls = obj.getClass();
        gb.n nVar = new gb.n();
        gVar.f(obj, cls, nVar);
        return nVar.u();
    }

    @Override
    public void T() {
        switch (this.f301a) {
            case 25:
                z zVar = (z) this.f302b;
                q3 q3Var = zVar.O;
                if (q3Var != null) {
                    ii.a aVar = zVar.f11221a;
                    w3 w3Var = q3Var.f11574a;
                    h2 h2Var = w3Var.J3;
                    if (h2Var != null) {
                        h2Var.g();
                    }
                    w3Var.f11715h3.onContentChanged();
                    return;
                }
                return;
            default:
                u4 u4Var = (u4) this.f302b;
                p3 p3Var = u4Var.N;
                if (p3Var != null) {
                    ii.a aVar2 = u4Var.f11221a;
                    w3 w3Var2 = p3Var.f11563a;
                    h2 h2Var2 = w3Var2.J3;
                    if (h2Var2 != null) {
                        h2Var2.g();
                    }
                    w3Var2.f11715h3.onContentChanged();
                    return;
                }
                return;
        }
    }

    public synchronized void V() {
        synchronized (this) {
            b bVar = (b) this.f302b;
            ReentrantLock reentrantLock = bVar.f284a;
            reentrantLock.lock();
            bVar.f285b.edit().clear().apply();
            reentrantLock.unlock();
        }
    }

    @Override
    public void Z(long j3, int i10, e5 e5Var) {
        int i11 = ProfileStoriesView.f31823s0;
        ((rz0) this.f302b).f(true, false);
        e5Var.run();
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f301a) {
            case 2:
                a8.e eVar = new a8.e(1, (TaskCompletionSource) obj2);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i10 = a8.a.f305a;
                obtain.writeStrongBinder(eVar);
                obtain.writeInt(1);
                ((l8.c) this.f302b).writeToParcel(obtain, 0);
                ((a8.c) ((a8.g) obj).u()).G0(obtain, 1);
                return;
            case 21:
                h7.f fVar = new h7.f(0, (TaskCompletionSource) obj2);
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i11 = q7.a.f41490a;
                obtain2.writeStrongBinder(fVar);
                q7.a.b(obtain2, (g7.f) this.f302b);
                q7.a.b(obtain2, gVar);
                ((h7.b) ((h7.d) ((h7.e) obj).u())).G0(obtain2, 6);
                return;
            default:
                l lVar = new l((TaskCompletionSource) obj2);
                i7.i iVar = (i7.i) ((i7.c) obj).u();
                Parcel K0 = iVar.K0();
                int i12 = i7.f.f11022a;
                K0.writeStrongBinder(lVar);
                i7.f.c(K0, (x5.e) this.f302b);
                iVar.L0(K0, 1);
                return;
        }
    }

    @Override
    public void c(i1 i1Var) {
        switch (this.f301a) {
            case 25:
                q3 q3Var = ((z) this.f302b).O;
                if (q3Var != null) {
                    w3 w3Var = q3Var.f11574a;
                    w3.N1(w3Var, i1Var);
                    w3Var.f11715h3.x(i1Var, true);
                    return;
                }
                return;
            default:
                p3 p3Var = ((u4) this.f302b).N;
                if (p3Var != null) {
                    w3 w3Var2 = p3Var.f11563a;
                    w3.N1(w3Var2, i1Var);
                    w3Var2.f11715h3.x(i1Var, true);
                    return;
                }
                return;
        }
    }

    @Override
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) se.b.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f302b).createWebView(webView));
    }

    @Override
    public void d(v3 v3Var, View view) {
        d2 d2Var = (d2) this.f302b;
        y70 H = y70.H(d2Var, view);
        H.Q = true;
        d2Var.getParentActivity();
        d2Var.getResourceProvider();
        d2Var.f11330x0 = j4.b(H, d2Var, v3Var, false);
    }

    @Override
    public boolean e(float f7) {
        boolean z10;
        d2 d2Var = (d2) this.f302b;
        FrameLayout frameLayout = d2Var.f11326v0;
        if (frameLayout != null) {
            int[] iArr = new int[2];
            frameLayout.getLocationOnScreen(iArr);
            if (f7 >= iArr[1]) {
                z10 = true;
                d2.Z(d2Var, z10, true);
                return z10;
            }
        }
        z10 = false;
        d2.Z(d2Var, z10, true);
        return z10;
    }

    @Override
    public boolean f1(long j3, int i10, int i11, int i12, gc gcVar) {
        ImageReceiver imageReceiver;
        i6 i6Var;
        i6 i6Var2;
        i6 i6Var3;
        i6 i6Var4;
        gcVar.f913b = null;
        gcVar.f914c = null;
        rz0 rz0Var = (rz0) this.f302b;
        m01 m01Var = rz0Var.h;
        ArrayList arrayList = rz0Var.f31848w;
        if (rz0Var.N < 0.2f) {
            gcVar.f913b = m01Var.getImageReceiver();
            gcVar.f914c = null;
            gcVar.f912a = m01Var;
            gcVar.h = 0.0f;
            gcVar.f917i = AndroidUtilities.displaySize.y;
            gcVar.f916g = (View) rz0Var.getParent();
            gcVar.d = rz0Var.f31850y;
            gcVar.f922n = true;
            return true;
        }
        int i13 = 0;
        while (true) {
            if (i13 < arrayList.size()) {
                i6 i6Var5 = (i6) arrayList.get(i13);
                if (i6Var5.e >= 1.0f && i6Var5.f981a == i11) {
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
                    imageReceiver = i6Var5.f982b;
                    i6Var2 = d;
                    i6Var = i6Var5;
                }
                i13++;
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
        gcVar.f914c = imageReceiver;
        gcVar.f913b = null;
        gcVar.f912a = rz0Var;
        gcVar.h = 0.0f;
        gcVar.f917i = AndroidUtilities.displaySize.y;
        gcVar.f916g = (View) rz0Var.getParent();
        if (i6Var != null && i6Var2 != null) {
            gcVar.f915f = new h6(this, new RectF(i6Var.f990m), i6Var, new RectF(i6Var2.f990m), i6Var2);
            return true;
        }
        gcVar.f915f = null;
        return true;
    }

    @Override
    public void g() {
        com.google.android.gms.common.api.internal.m0 m0Var = (com.google.android.gms.common.api.internal.m0) this.f302b;
        m0Var.f6124a.lock();
        try {
            m0Var.f6132m = new g0(m0Var, m0Var.f6129j, m0Var.f6130k, m0Var.d, m0Var.f6131l, m0Var.f6124a, m0Var.f6126c);
            m0Var.f6132m.v();
            m0Var.f6125b.signalAll();
        } finally {
            m0Var.f6124a.unlock();
        }
    }

    @Override
    public void g0() {
        switch (this.f301a) {
            case 25:
                z zVar = (z) this.f302b;
                q3 q3Var = zVar.O;
                if (q3Var != null) {
                    ii.a aVar = zVar.f11221a;
                    w3.P1(q3Var.f11574a);
                    return;
                }
                return;
            default:
                u4 u4Var = (u4) this.f302b;
                p3 p3Var = u4Var.N;
                if (p3Var != null) {
                    ii.a aVar2 = u4Var.f11221a;
                    w3.P1(p3Var.f11563a);
                    return;
                }
                return;
        }
    }

    @Override
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) se.b.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f302b).getStatics());
    }

    @Override
    public void h() {
        switch (this.f301a) {
            case 25:
                z zVar = (z) this.f302b;
                q3 q3Var = zVar.O;
                if (q3Var != null) {
                    w3.Q1(q3Var.f11574a, zVar.f11221a);
                    return;
                }
                return;
            default:
                u4 u4Var = (u4) this.f302b;
                p3 p3Var = u4Var.N;
                if (p3Var != null) {
                    w3.Q1(p3Var.f11563a, u4Var.f11221a);
                    return;
                }
                return;
        }
    }

    @Override
    public void i(k6.a aVar) {
        x xVar = (x) this.f302b;
        xVar.f6196o.lock();
        try {
            xVar.f6194m = aVar;
            x.l(xVar);
        } finally {
            xVar.f6196o.unlock();
        }
    }

    @Override
    public void i0(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        e0 e0Var = (e0) this.f302b;
        Handler handler = e0Var.A0;
        q4 q4Var = e0Var.B0;
        handler.removeCallbacks(q4Var);
        TextView textView = e0Var.G0;
        if (textView != null) {
            textView.setText(charSequence);
        }
        handler.postDelayed(q4Var, 2000L);
    }

    @Override
    public void j(Object obj) {
        int i10;
        Bundle extras;
        switch (this.f301a) {
            case 5:
                Map map = (Map) obj;
                androidx.fragment.app.k0 k0Var = (androidx.fragment.app.k0) this.f302b;
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
                androidx.fragment.app.g0 g0Var = (androidx.fragment.app.g0) k0Var.F.pollFirst();
                if (g0Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    return;
                }
                String str = g0Var.f2415a;
                if (k0Var.f2426c.l(str) == null) {
                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    return;
                }
                return;
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f302b;
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar.f1921b;
                int i12 = aVar.f1920a;
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
                int i13 = u.e("ProxyBillingActivityV2", intent).f3895a;
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
    public void k(int i10) {
        x xVar = (x) this.f302b;
        Lock lock = xVar.f6196o;
        lock.lock();
        try {
            if (xVar.f6195n) {
                xVar.f6195n = false;
                x.k(xVar, i10);
            } else {
                xVar.f6195n = true;
                xVar.d.onConnectionSuspended(i10);
            }
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override
    public void l(d6 d6Var, String str) {
        d2 d2Var = (d2) this.f302b;
        if (d2Var.f11333z0 == null) {
            d2Var.f11333z0 = new m.p3(new d5(this, 16), d2Var.getResourceProvider());
        }
        d2Var.f11333z0.d(d6Var, str);
    }

    @Override
    public void m(int i10) {
        ((d2) this.f302b).o0(74, i10);
    }

    @Override
    public void n() {
        int i10;
        d2 d2Var = (d2) this.f302b;
        j3 j3Var = d2Var.P.f11725n3;
        if (j3Var != null && j3Var.y() && d2Var.P.D4()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        d2Var.x0(i10, true);
        d2Var.y0();
        d2Var.w0();
    }

    @Override
    public void o(Bundle bundle) {
        x xVar = (x) this.f302b;
        xVar.f6196o.lock();
        try {
            xVar.f6194m = k6.a.e;
            x.l(xVar);
        } finally {
            xVar.f6196o.unlock();
        }
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f301a) {
            case 15:
                d6.c.h((d6.c) ((d6.j) this.f302b).f7548c, "launchApplication", task);
                return;
            default:
                zd.m mVar = (zd.m) this.f302b;
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
                mVar.resumeWith(u7.a(exception));
                return;
        }
    }

    @Override
    public void onContentChanged() {
        d2 d2Var = (d2) this.f302b;
        if (d2Var.f11332y0 != null) {
            boolean n32 = d2Var.P.n3();
            d2Var.L0 = n32;
            d2Var.f11332y0.h(n32);
            d2Var.f11332y0.invalidate();
        }
        d2Var.C0();
        Runnable runnable = d2Var.M0;
        AndroidUtilities.cancelRunOnUIThread(runnable);
        AndroidUtilities.runOnUIThread(runnable, 1000L);
    }

    @Override
    public void onFirstFrameRendered() {
        a3.n nVar = (a3.n) this.f302b;
        Surface surface = nVar.f160n1;
        if (surface != null) {
            nVar.Z0.V(surface);
            nVar.f163q1 = true;
        }
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        d7 d7Var = (d7) this.f302b;
        a7 a7Var = d7Var.L;
        AndroidUtilities.cancelRunOnUIThread(a7Var);
        v71 v71Var = d7Var.f4535y;
        if (v71Var != null && v71Var.y()) {
            AndroidUtilities.runOnUIThread(a7Var);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((d7) this.f302b).i();
    }

    @Override
    public void p() {
        d2 d2Var = (d2) this.f302b;
        d2Var.I0 = d2Var.K0;
        d2.Z(d2Var, false, false);
        d2Var.x0(2, true);
    }

    @Override
    public void q(ii.a aVar) {
        d2 d2Var = (d2) this.f302b;
        if (aVar != null && (aVar.f11205b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(d2Var)) {
            vi viVar = new vi(d2Var.getParentActivity(), d2Var, false, false, false, d2Var.getResourceProvider());
            viVar.Z1 = new qb.b(11);
            viVar.P = true;
            viVar.f29154x1.setVisibility(8);
            viVar.f29141t2 = new r5(d2Var, aVar, viVar, 11);
            viVar.r1();
            viVar.show();
        }
    }

    @Override
    public String[] r() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f302b).getSupportedFeatures();
    }

    @Override
    public Paint.FontMetricsInt t() {
        return ((m) this.f302b).f4994f.getEditText().getPaint().getFontMetricsInt();
    }

    @Override
    public void v() {
        com.google.android.gms.common.api.internal.m0 m0Var = (com.google.android.gms.common.api.internal.m0) this.f302b;
        for (com.google.android.gms.common.api.c cVar : m0Var.f6127f.values()) {
            cVar.disconnect();
        }
        m0Var.f6134o.F = Collections.EMPTY_SET;
    }

    public i(i7.b bVar, x5.e eVar) {
        this.f301a = 24;
        this.f302b = eVar;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public i(Object obj, int i10) {
        this.f301a = i10;
        this.f302b = obj;
    }

    public i(Context context) {
        String d;
        this.f301a = 0;
        b a2 = b.a(context);
        this.f302b = a2;
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
        this.f301a = i10;
        switch (i10) {
            case 8:
                this.f302b = new v(10);
                return;
            default:
                this.f302b = new LinkedHashMap(0, 0.75f, true);
                return;
        }
    }

    @Override
    public void U() {
    }

    @Override
    public void w() {
    }

    @Override
    public void P(String str) {
    }

    @Override
    public void a(Bundle bundle) {
    }

    @Override
    public void b(boolean z10) {
    }

    @Override
    public void onSeekFinished(j2.a aVar) {
    }

    @Override
    public void onSeekStarted(j2.a aVar) {
    }

    @Override
    public void u(int i10) {
    }

    @Override
    public void y(int i10) {
    }

    @Override
    public void onError(v71 v71Var, Exception exc) {
    }

    @Override
    public void x(i1 i1Var, boolean z10) {
    }

    @Override
    public void f(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }

    @Override
    public void s(k6.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
    }

    @Override
    public void z(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
