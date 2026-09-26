package a6;

import a3.m0;
import ai.d5;
import ai.fc;
import ai.g6;
import ai.gc;
import ai.h6;
import ai.q4;
import ai.q5;
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
import ci.b7;
import ci.z6;
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
import fb.n;
import i2.j0;
import ii.e2;
import ii.e6;
import ii.i1;
import ii.i2;
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
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import m.p3;
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
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.q71;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.xa0;
import org.telegram.ui.Components.z70;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.d01;
import org.telegram.ui.iz0;
import r0.i0;
import r0.l1;
import v7.u7;
public final class i implements m0, s, fc, a0, androidx.activity.result.b, p, xa0, q71, k0, v0, OnCompleteListener, n, r0.n, db.n, ii.k0, v3 {
    public static i f301c;
    public final int f302a;
    public Object f303b;

    public i(int i10, boolean z10) {
        this.f302a = i10;
    }

    public static synchronized i T(Context context) {
        i V;
        synchronized (i.class) {
            V = V(context.getApplicationContext());
        }
        return V;
    }

    public static synchronized i V(Context context) {
        synchronized (i.class) {
            i iVar = f301c;
            if (iVar != null) {
                return iVar;
            }
            i iVar2 = new i(context);
            f301c = iVar2;
            return iVar2;
        }
    }

    @Override
    public void B() {
        a3.n nVar = (a3.n) this.f303b;
        if (nVar.f160n1 != null) {
            nVar.N0(0, 1);
        }
    }

    @Override
    public q9 C() {
        switch (this.f302a) {
            case 25:
                r3 r3Var = ((z) this.f303b).O;
                if (r3Var != null) {
                    return r3Var.f11584a.getTextSelectionHelper();
                }
                return null;
            default:
                q3 q3Var = ((v4) this.f303b).N;
                if (q3Var != null) {
                    return q3Var.f11569a.getTextSelectionHelper();
                }
                return null;
        }
    }

    @Override
    public void D() {
        j0 j0Var = ((a3.n) this.f303b).W;
        if (j0Var != null) {
            j0Var.a();
        }
    }

    @Override
    public void E(CharSequence charSequence) {
        switch (this.f302a) {
            case 25:
                r3 r3Var = ((z) this.f303b).O;
                if (r3Var != null) {
                    r3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        r3Var.f11584a.t4(charSequence.toString());
                        return;
                    }
                    return;
                }
                return;
            default:
                q3 q3Var = ((v4) this.f303b).N;
                if (q3Var != null) {
                    q3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        q3Var.f11569a.t4(charSequence.toString());
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public z70 F(View view) {
        return z70.H((e2) this.f303b, view);
    }

    @Override
    public void G() {
        e2 e2Var = (e2) this.f303b;
        e2Var.z0();
        e2Var.C0();
    }

    @Override
    public boolean H() {
        return true;
    }

    @Override
    public p9 I() {
        switch (this.f302a) {
            case 25:
                return (z) this.f303b;
            default:
                return (v4) this.f303b;
        }
    }

    @Override
    public void J(u3 u3Var, View view) {
        e2 e2Var = (e2) this.f303b;
        z70 H = z70.H(e2Var, view);
        H.Q = true;
        e2Var.f11338x0 = k4.c(H, e2Var, e2Var.getParentActivity(), e2Var.getResourceProvider(), u3Var, false);
    }

    @Override
    public com.google.android.gms.common.api.internal.e L(com.google.android.gms.common.api.internal.e eVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override
    public ii.a M() {
        switch (this.f302a) {
            case 25:
                return ((z) this.f303b).f11207a;
            default:
                return ((v4) this.f303b).f11207a;
        }
    }

    @Override
    public boolean N() {
        switch (this.f302a) {
            case 25:
                z zVar = (z) this.f303b;
                r3 r3Var = zVar.O;
                if (r3Var != null) {
                    ii.a aVar = zVar.f11207a;
                    if (r3Var.f11584a.S4()) {
                        return true;
                    }
                }
                return false;
            default:
                v4 v4Var = (v4) this.f303b;
                q3 q3Var = v4Var.N;
                if (q3Var != null) {
                    ii.a aVar2 = v4Var.f11207a;
                    if (q3Var.f11569a.S4()) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override
    public void O(int i10, int i11, CharSequence charSequence, boolean z10) {
        ci.g gVar = ((ci.m) this.f303b).f5121f;
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
    public void Q(int i10, int i11) {
        switch (this.f302a) {
            case 25:
                z zVar = (z) this.f303b;
                r3 r3Var = zVar.O;
                if (r3Var != null) {
                    ii.a aVar = zVar.f11207a;
                    i2 i2Var = r3Var.f11584a.J3;
                    if (i2Var != null) {
                        i2Var.f(i10, i11);
                        return;
                    }
                    return;
                }
                return;
            default:
                v4 v4Var = (v4) this.f303b;
                q3 q3Var = v4Var.N;
                if (q3Var != null) {
                    ii.a aVar2 = v4Var.f11207a;
                    i2 i2Var2 = q3Var.f11569a.J3;
                    if (i2Var2 != null) {
                        i2Var2.f(i10, i11);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public l1 Q0(View view, l1 l1Var) {
        boolean z10;
        l1 l1Var2;
        int b10;
        int c10;
        boolean z11;
        int c11;
        int d = l1Var.d();
        g.s sVar = (g.s) this.f303b;
        Context context = sVar.e;
        int d10 = l1Var.d();
        ActionBarContextView actionBarContextView = sVar.f9296y;
        int i10 = 8;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sVar.f9296y.getLayoutParams();
            boolean z12 = true;
            if (sVar.f9296y.isShown()) {
                if (sVar.f9287l0 == null) {
                    sVar.f9287l0 = new Rect();
                    sVar.m0 = new Rect();
                }
                Rect rect = sVar.f9287l0;
                Rect rect2 = sVar.m0;
                rect.set(l1Var.b(), l1Var.d(), l1Var.c(), l1Var.a());
                ViewGroup viewGroup = sVar.J;
                Method method = s3.f14551a;
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
                l1 f7 = i0.f(sVar.J);
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
                sVar.f9296y.setLayoutParams(marginLayoutParams);
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
        return i0.h(view, l1Var2);
    }

    public da.a R(JSONObject jSONObject) {
        da.c bVar;
        int i10 = jSONObject.getInt("settings_version");
        if (i10 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.", null);
            bVar = new ob.a(7);
        } else {
            bVar = new qb.b(7);
        }
        return bVar.s2((na.d) this.f303b, jSONObject);
    }

    public db.i S(Object obj) {
        db.g gVar = ((gb.a0) this.f303b).f9516b;
        gVar.getClass();
        if (obj == null) {
            return db.k.f7591a;
        }
        Class<?> cls = obj.getClass();
        gb.n nVar = new gb.n();
        gVar.f(obj, cls, nVar);
        return nVar.u();
    }

    public synchronized void U() {
        synchronized (this) {
            b bVar = (b) this.f303b;
            ReentrantLock reentrantLock = bVar.f285a;
            reentrantLock.lock();
            bVar.f286b.edit().clear().apply();
            reentrantLock.unlock();
        }
    }

    @Override
    public void W() {
        switch (this.f302a) {
            case 25:
                z zVar = (z) this.f303b;
                r3 r3Var = zVar.O;
                if (r3Var != null) {
                    ii.a aVar = zVar.f11207a;
                    x3 x3Var = r3Var.f11584a;
                    i2 i2Var = x3Var.J3;
                    if (i2Var != null) {
                        i2Var.g();
                    }
                    x3Var.f11728h3.onContentChanged();
                    return;
                }
                return;
            default:
                v4 v4Var = (v4) this.f303b;
                q3 q3Var = v4Var.N;
                if (q3Var != null) {
                    ii.a aVar2 = v4Var.f11207a;
                    x3 x3Var2 = q3Var.f11569a;
                    i2 i2Var2 = x3Var2.J3;
                    if (i2Var2 != null) {
                        i2Var2.g();
                    }
                    x3Var2.f11728h3.onContentChanged();
                    return;
                }
                return;
        }
    }

    @Override
    public void Z(long j3, int i10, d5 d5Var) {
        int i11 = ProfileStoriesView.f31803s0;
        ((iz0) this.f303b).f(true, false);
        d5Var.run();
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f302a) {
            case 2:
                a8.e eVar = new a8.e(1, (TaskCompletionSource) obj2);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i10 = a8.a.f308a;
                obtain.writeStrongBinder(eVar);
                obtain.writeInt(1);
                ((l8.c) this.f303b).writeToParcel(obtain, 0);
                ((a8.c) ((a8.g) obj).u()).G0(obtain, 1);
                return;
            case 22:
                h7.f fVar = new h7.f(0, (TaskCompletionSource) obj2);
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i11 = q7.a.f41455a;
                obtain2.writeStrongBinder(fVar);
                q7.a.b(obtain2, (g7.f) this.f303b);
                q7.a.b(obtain2, gVar);
                ((h7.b) ((h7.d) ((h7.e) obj).u())).G0(obtain2, 6);
                return;
            default:
                l lVar = new l((TaskCompletionSource) obj2);
                i7.i iVar = (i7.i) ((i7.c) obj).u();
                Parcel K0 = iVar.K0();
                int i12 = i7.f.f11008a;
                K0.writeStrongBinder(lVar);
                i7.f.c(K0, (x5.e) this.f303b);
                iVar.L0(K0, 1);
                return;
        }
    }

    @Override
    public void c(i1 i1Var) {
        switch (this.f302a) {
            case 25:
                r3 r3Var = ((z) this.f303b).O;
                if (r3Var != null) {
                    x3 x3Var = r3Var.f11584a;
                    x3.M1(x3Var, i1Var);
                    x3Var.f11728h3.t(i1Var, true);
                    return;
                }
                return;
            default:
                q3 q3Var = ((v4) this.f303b).N;
                if (q3Var != null) {
                    x3 x3Var2 = q3Var.f11569a;
                    x3.M1(x3Var2, i1Var);
                    x3Var2.f11728h3.t(i1Var, true);
                    return;
                }
                return;
        }
    }

    @Override
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) se.b.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f303b).createWebView(webView));
    }

    @Override
    public void d(w3 w3Var, View view) {
        e2 e2Var = (e2) this.f303b;
        z70 H = z70.H(e2Var, view);
        H.Q = true;
        e2Var.getParentActivity();
        e2Var.getResourceProvider();
        e2Var.f11338x0 = k4.b(H, e2Var, w3Var, false);
    }

    @Override
    public boolean e(float f7) {
        boolean z10;
        e2 e2Var = (e2) this.f303b;
        FrameLayout frameLayout = e2Var.f11334v0;
        if (frameLayout != null) {
            int[] iArr = new int[2];
            frameLayout.getLocationOnScreen(iArr);
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
    public boolean f1(long j3, int i10, int i11, int i12, gc gcVar) {
        ImageReceiver imageReceiver;
        h6 h6Var;
        h6 h6Var2;
        h6 h6Var3;
        h6 h6Var4;
        gcVar.f914b = null;
        gcVar.f915c = null;
        iz0 iz0Var = (iz0) this.f303b;
        d01 d01Var = iz0Var.h;
        ArrayList arrayList = iz0Var.f31828w;
        if (iz0Var.N < 0.2f) {
            gcVar.f914b = d01Var.getImageReceiver();
            gcVar.f915c = null;
            gcVar.f913a = d01Var;
            gcVar.h = 0.0f;
            gcVar.f918i = AndroidUtilities.displaySize.y;
            gcVar.f917g = (View) iz0Var.getParent();
            gcVar.d = iz0Var.f31830y;
            gcVar.f923n = true;
            return true;
        }
        int i13 = 0;
        while (true) {
            if (i13 < arrayList.size()) {
                h6 h6Var5 = (h6) arrayList.get(i13);
                if (h6Var5.e >= 1.0f && h6Var5.f945a == i11) {
                    int i14 = i13 - 1;
                    if (i14 >= 0) {
                        h6Var3 = (h6) arrayList.get(i14);
                    } else {
                        h6Var3 = null;
                    }
                    int i15 = i13 - 2;
                    if (i15 >= 0) {
                        h6Var4 = (h6) arrayList.get(i15);
                    } else {
                        h6Var4 = null;
                    }
                    h6 d = ProfileStoriesView.d(h6Var3, h6Var4, h6Var5);
                    imageReceiver = h6Var5.f946b;
                    h6Var2 = d;
                    h6Var = h6Var5;
                }
                i13++;
            } else {
                imageReceiver = null;
                h6Var = null;
                h6Var2 = null;
                break;
            }
        }
        if (imageReceiver == null) {
            return false;
        }
        gcVar.f915c = imageReceiver;
        gcVar.f914b = null;
        gcVar.f913a = iz0Var;
        gcVar.h = 0.0f;
        gcVar.f918i = AndroidUtilities.displaySize.y;
        gcVar.f917g = (View) iz0Var.getParent();
        if (h6Var != null && h6Var2 != null) {
            gcVar.f916f = new g6(this, new RectF(h6Var.f954m), h6Var, new RectF(h6Var2.f954m), h6Var2);
            return true;
        }
        gcVar.f916f = null;
        return true;
    }

    @Override
    public void g(e6 e6Var, String str) {
        e2 e2Var = (e2) this.f303b;
        if (e2Var.f11341z0 == null) {
            e2Var.f11341z0 = new p3(new ei.d5(this, 15), e2Var.getResourceProvider());
        }
        e2Var.f11341z0.d(e6Var, str);
    }

    @Override
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) se.b.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f303b).getStatics());
    }

    @Override
    public void h() {
        switch (this.f302a) {
            case 25:
                z zVar = (z) this.f303b;
                r3 r3Var = zVar.O;
                if (r3Var != null) {
                    x3.P1(r3Var.f11584a, zVar.f11207a);
                    return;
                }
                return;
            default:
                v4 v4Var = (v4) this.f303b;
                q3 q3Var = v4Var.N;
                if (q3Var != null) {
                    x3.P1(q3Var.f11569a, v4Var.f11207a);
                    return;
                }
                return;
        }
    }

    @Override
    public void i(int i10) {
        ((e2) this.f303b).o0(74, i10);
    }

    @Override
    public void j() {
        com.google.android.gms.common.api.internal.m0 m0Var = (com.google.android.gms.common.api.internal.m0) this.f303b;
        m0Var.f6108a.lock();
        try {
            m0Var.f6116m = new g0(m0Var, m0Var.f6113j, m0Var.f6114k, m0Var.d, m0Var.f6115l, m0Var.f6108a, m0Var.f6110c);
            m0Var.f6116m.y();
            m0Var.f6109b.signalAll();
        } finally {
            m0Var.f6108a.unlock();
        }
    }

    @Override
    public void k(Object obj) {
        int i10;
        Bundle extras;
        switch (this.f302a) {
            case 5:
                Map map = (Map) obj;
                androidx.fragment.app.k0 k0Var = (androidx.fragment.app.k0) this.f303b;
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
                String str = g0Var.f2408a;
                if (k0Var.f2419c.l(str) == null) {
                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    return;
                }
                return;
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f303b;
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar.f1914b;
                int i12 = aVar.f1913a;
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
                int i13 = u.e("ProxyBillingActivityV2", intent).f3886a;
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
    public void k0() {
        switch (this.f302a) {
            case 25:
                z zVar = (z) this.f303b;
                r3 r3Var = zVar.O;
                if (r3Var != null) {
                    ii.a aVar = zVar.f11207a;
                    x3.O1(r3Var.f11584a);
                    return;
                }
                return;
            default:
                v4 v4Var = (v4) this.f303b;
                q3 q3Var = v4Var.N;
                if (q3Var != null) {
                    ii.a aVar2 = v4Var.f11207a;
                    x3.O1(q3Var.f11569a);
                    return;
                }
                return;
        }
    }

    @Override
    public void l() {
        int i10;
        e2 e2Var = (e2) this.f303b;
        k3 k3Var = e2Var.P.f11738n3;
        if (k3Var != null && k3Var.y() && e2Var.P.C4()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        e2Var.x0(i10, true);
        e2Var.y0();
        e2Var.w0();
    }

    @Override
    public void m(k6.a aVar) {
        x xVar = (x) this.f303b;
        xVar.f6180o.lock();
        try {
            xVar.f6178m = aVar;
            x.l(xVar);
        } finally {
            xVar.f6180o.unlock();
        }
    }

    @Override
    public void m0(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        e0 e0Var = (e0) this.f303b;
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
    public String[] n() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f303b).getSupportedFeatures();
    }

    @Override
    public void o() {
        e2 e2Var = (e2) this.f303b;
        e2Var.I0 = e2Var.K0;
        e2.Z(e2Var, false, false);
        e2Var.x0(2, true);
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f302a) {
            case 15:
                d6.c.h((d6.c) ((d6.j) this.f303b).f7532c, "launchApplication", task);
                return;
            default:
                zd.m mVar = (zd.m) this.f303b;
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
        e2 e2Var = (e2) this.f303b;
        if (e2Var.f11340y0 != null) {
            boolean m32 = e2Var.P.m3();
            e2Var.L0 = m32;
            e2Var.f11340y0.h(m32);
            e2Var.f11340y0.invalidate();
        }
        e2Var.C0();
        Runnable runnable = e2Var.M0;
        AndroidUtilities.cancelRunOnUIThread(runnable);
        AndroidUtilities.runOnUIThread(runnable, 1000L);
    }

    @Override
    public void onFirstFrameRendered() {
        a3.n nVar = (a3.n) this.f303b;
        Surface surface = nVar.f160n1;
        if (surface != null) {
            nVar.Z0.S(surface);
            nVar.f163q1 = true;
        }
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        b7 b7Var = (b7) this.f303b;
        z6 z6Var = b7Var.L;
        AndroidUtilities.cancelRunOnUIThread(z6Var);
        t71 t71Var = b7Var.f4409y;
        if (t71Var != null && t71Var.y()) {
            AndroidUtilities.runOnUIThread(z6Var);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((b7) this.f303b).i();
    }

    @Override
    public void p(ii.a aVar) {
        e2 e2Var = (e2) this.f303b;
        if (aVar != null && (aVar.f11191b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(e2Var)) {
            wi wiVar = new wi(e2Var.getParentActivity(), e2Var, false, false, false, e2Var.getResourceProvider());
            wiVar.Z1 = new qb.b(11);
            wiVar.P = true;
            wiVar.f30078x1.setVisibility(8);
            wiVar.f30065t2 = new q5(e2Var, aVar, wiVar, 11);
            wiVar.r1();
            wiVar.show();
        }
    }

    @Override
    public Object p2() {
        Class cls = (Class) this.f303b;
        try {
            return fb.s.f9035a.a(cls);
        } catch (Exception e) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
        }
    }

    @Override
    public void q(int i10) {
        x xVar = (x) this.f303b;
        Lock lock = xVar.f6180o;
        lock.lock();
        try {
            if (xVar.f6179n) {
                xVar.f6179n = false;
                x.k(xVar, i10);
            } else {
                xVar.f6179n = true;
                xVar.d.onConnectionSuspended(i10);
            }
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override
    public void r(Bundle bundle) {
        x xVar = (x) this.f303b;
        xVar.f6180o.lock();
        try {
            xVar.f6178m = k6.a.e;
            x.l(xVar);
        } finally {
            xVar.f6180o.unlock();
        }
    }

    @Override
    public Paint.FontMetricsInt w() {
        return ((ci.m) this.f303b).f5121f.getEditText().getPaint().getFontMetricsInt();
    }

    @Override
    public void y() {
        com.google.android.gms.common.api.internal.m0 m0Var = (com.google.android.gms.common.api.internal.m0) this.f303b;
        for (com.google.android.gms.common.api.c cVar : m0Var.f6111f.values()) {
            cVar.disconnect();
        }
        m0Var.f6118o.F = Collections.EMPTY_SET;
    }

    @Override
    public void z() {
        e2 e2Var = (e2) this.f303b;
        int i10 = 0;
        e2.Z(e2Var, false, true);
        int i11 = e2Var.I0;
        if (i11 != 2) {
            i10 = i11;
        }
        e2Var.x0(i10, true);
    }

    public i(i7.b bVar, x5.e eVar) {
        this.f302a = 24;
        this.f303b = eVar;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public i(Object obj, int i10) {
        this.f302a = i10;
        this.f303b = obj;
    }

    public i(Context context) {
        String d;
        this.f302a = 0;
        b a2 = b.a(context);
        this.f303b = a2;
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
        this.f302a = i10;
        switch (i10) {
            case 8:
                this.f303b = new v(10);
                return;
            default:
                this.f303b = new LinkedHashMap(0, 0.75f, true);
                return;
        }
    }

    @Override
    public void K() {
    }

    @Override
    public void s() {
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
    public void x(int i10) {
    }

    @Override
    public void onError(t71 t71Var, Exception exc) {
    }

    @Override
    public void t(i1 i1Var, boolean z10) {
    }

    @Override
    public void A(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override
    public void f(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }

    @Override
    public void v(k6.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
