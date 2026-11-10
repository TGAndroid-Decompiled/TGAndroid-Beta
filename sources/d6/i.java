package d6;

import a8.ia;
import a8.l8;
import ai.h0;
import ai.l1;
import ai.s0;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.fragment.app.i0;
import androidx.fragment.app.r;
import androidx.lifecycle.a0;
import bi.ab;
import bi.dd;
import bi.ec;
import ch.o0;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.internal.b0;
import com.google.android.gms.common.api.internal.e0;
import com.google.android.gms.common.api.internal.g0;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.internal.cast.t;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import di.j4;
import e5.n;
import f6.d0;
import fi.e7;
import fi.j0;
import fi.j5;
import fi.ja;
import fi.la;
import fi.va;
import fi.x9;
import fi.y5;
import fi.za;
import gb.l0;
import gb.v0;
import j6.w;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONArray;
import org.json.JSONException;
import org.telegram.ui.Components.co0;
import org.telegram.ui.Components.ft0;
import org.telegram.ui.Components.hi0;
import org.telegram.ui.Components.t51;
import org.telegram.ui.q00;
import q4.q;
import sg.u0;
import tg.r1;
public final class i implements SuccessContinuation, h0, a0, androidx.activity.result.b, ft0, ce.c, hi0, e0, c4.d, p, co0, n, og.n, u0, za, OnSuccessListener, ib.b {
    public static i f8210c;
    public final int f8211a;
    public Object f8212b;

    public i(int i7, boolean z9) {
        this.f8211a = i7;
    }

    public static boolean l0(Bundle bundle) {
        if (!"1".equals(bundle.getString("gcm.n.e")) && !"1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")))) {
            return false;
        }
        return true;
    }

    public static String n0(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    public static synchronized i o0(Context context) {
        i q02;
        synchronized (i.class) {
            q02 = q0(context.getApplicationContext());
        }
        return q02;
    }

    public static synchronized i q0(Context context) {
        synchronized (i.class) {
            i iVar = f8210c;
            if (iVar != null) {
                return iVar;
            }
            i iVar2 = new i(context);
            f8210c = iVar2;
            return iVar2;
        }
    }

    @Override
    public java.lang.Object B(ce.d r7, kd.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: d6.i.B(ce.d, kd.c):java.lang.Object");
    }

    @Override
    public void C(float f10, int i7) {
        ArrayList arrayList;
        y5 y5Var = (y5) this.f8212b;
        e7 e7Var = y5Var.d;
        if (e7Var != null && (arrayList = e7Var.T) != null && i7 >= 0 && i7 < arrayList.size()) {
            ((e7) y5Var.d.T.get(i7)).P = f10;
        }
    }

    @Override
    public void C0() {
        j4.h0((j4) this.f8212b);
    }

    @Override
    public String[] D() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f8212b).getSupportedFeatures();
    }

    @Override
    public boolean E() {
        return false;
    }

    @Override
    public void F(boolean z9) {
        dd ddVar = (dd) this.f8212b;
        te.a aVar = ddVar.Y;
        if (aVar != null) {
            aVar.a(z9, true);
        }
        q00 q00Var = ddVar.f49194s;
        if (q00Var != null) {
            q00Var.invalidate();
        }
    }

    @Override
    public void G(float f10) {
        y5 y5Var = (y5) this.f8212b;
        e7 e7Var = y5Var.d;
        if (e7Var == null) {
            return;
        }
        e7Var.P = f10;
        y5Var.c();
    }

    @Override
    public boolean I() {
        return true;
    }

    @Override
    public void J(long j3) {
        y5 y5Var = (y5) this.f8212b;
        e7 e7Var = y5Var.d;
        if (e7Var == null) {
            return;
        }
        e7Var.f11917r0 = j3;
        e7Var.f11901j = true;
        y5Var.y(true);
    }

    @Override
    public void K(boolean z9) {
        r1 r1Var;
        va vaVar = ((ja) ((y5) this.f8212b)).C0;
        x9 x9Var = vaVar.f13004v1;
        if (x9Var != null) {
            r1 r1Var2 = null;
            if (!z9 && (x9Var.getSelectedEntity() instanceof r1)) {
                vaVar.f13004v1.A0(null, true);
            } else if (z9 && !(vaVar.f13004v1.getSelectedEntity() instanceof r1)) {
                j5 j5Var = vaVar.f13004v1.A0;
                int i7 = 0;
                int i10 = 0;
                while (true) {
                    if (i10 < j5Var.getChildCount()) {
                        View childAt = j5Var.getChildAt(i10);
                        if (childAt instanceof r1) {
                            r1Var = (r1) childAt;
                            break;
                        }
                        i10++;
                    } else {
                        r1Var = null;
                        break;
                    }
                }
                if (r1Var != null) {
                    x9 x9Var2 = vaVar.f13004v1;
                    j5 j5Var2 = x9Var2.A0;
                    while (true) {
                        if (i7 >= j5Var2.getChildCount()) {
                            break;
                        }
                        View childAt2 = j5Var2.getChildAt(i7);
                        if (childAt2 instanceof r1) {
                            r1Var2 = (r1) childAt2;
                            break;
                        }
                        i7++;
                    }
                    x9Var2.A0(r1Var2, true);
                }
            }
        }
    }

    @Override
    public void N(float f10, int i7) {
        ArrayList arrayList;
        y5 y5Var = (y5) this.f8212b;
        e7 e7Var = y5Var.d;
        if (e7Var != null && (arrayList = e7Var.T) != null && i7 >= 0 && i7 < arrayList.size()) {
            ((e7) y5Var.d.T.get(i7)).V = f10;
        }
    }

    @Override
    public void O(float f10) {
        y5 y5Var = (y5) this.f8212b;
        e7 e7Var = y5Var.d;
        if (e7Var == null) {
            return;
        }
        e7Var.F = f10;
        e7Var.f11901j = true;
        y5Var.w(true);
    }

    @Override
    public void Q(float f10) {
        y5 y5Var = (y5) this.f8212b;
        e7 e7Var = y5Var.d;
        if (e7Var == null) {
            return;
        }
        e7Var.E = f10;
        e7Var.f11901j = true;
        y5Var.w(true);
    }

    @Override
    public void R() {
        g0 g0Var = (g0) this.f8212b;
        for (com.google.android.gms.common.api.c cVar : g0Var.f6630f.values()) {
            cVar.a();
        }
        g0Var.f6637o.F = Collections.EMPTY_SET;
    }

    @Override
    public void S(float f10, int i7) {
        ArrayList arrayList;
        y5 y5Var = (y5) this.f8212b;
        e7 e7Var = y5Var.d;
        if (e7Var != null && (arrayList = e7Var.T) != null && i7 >= 0 && i7 < arrayList.size()) {
            ((e7) y5Var.d.T.get(i7)).W = f10;
        }
    }

    @Override
    public void T(float f10) {
        e7 e7Var = ((y5) this.f8212b).d;
        if (e7Var == null) {
            return;
        }
        e7Var.f11881a0 = f10;
        e7Var.f11901j = true;
    }

    @Override
    public boolean U() {
        return false;
    }

    @Override
    public void V() {
        ((y5) this.f8212b).q(null);
    }

    @Override
    public void X(java.lang.Object r12) {
        throw new UnsupportedOperationException("Method not decompiled: d6.i.X(java.lang.Object):void");
    }

    @Override
    public void Y() {
        x9 x9Var = (x9) this.f8212b;
        x9Var.m0.f55146a.f();
        x9Var.M0.setViewHidden(false);
    }

    @Override
    public float Y0() {
        return jg.g.e(9.66f, oi.a.d(((dd) this.f8212b).f3709b0), 0);
    }

    @Override
    public void a() {
        g0 g0Var = (g0) this.f8212b;
        Lock lock = g0Var.f6626a;
        lock.lock();
        try {
            g0Var.f6635m = new b0(g0Var, g0Var.f6632j, g0Var.f6633k, g0Var.d, g0Var.f6634l, lock, g0Var.f6628c);
            g0Var.f6635m.R();
            g0Var.f6627b.signalAll();
        } finally {
            g0Var.f6626a.unlock();
        }
    }

    @Override
    public void a0(float f10) {
        y5 y5Var = (y5) this.f8212b;
        e7 e7Var = y5Var.d;
        if (e7Var == null) {
            return;
        }
        e7Var.f11921t0 = f10;
        e7Var.f11901j = true;
        y5Var.y(true);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f8211a) {
            case 17:
                d8.d dVar = new d8.d(1, (TaskCompletionSource) obj2);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i7 = d8.a.f8215a;
                obtain.writeStrongBinder(dVar);
                obtain.writeInt(1);
                ((o8.c) this.f8212b).writeToParcel(obtain, 0);
                ((d8.c) ((d8.f) obj).n()).h1(obtain, 1);
                return;
            default:
                w wVar = (w) obj;
                j6.f fVar = (j6.f) wVar.n();
                d0 d0Var = ((f6.e0) this.f8212b).f11255l;
                Parcel p12 = fVar.p1();
                t.d(p12, d0Var);
                fVar.u1(p12, 18);
                j6.f fVar2 = (j6.f) wVar.n();
                fVar2.u1(fVar2.p1(), 17);
                ((TaskCompletionSource) obj2).setResult(null);
                return;
        }
    }

    @Override
    public com.google.android.gms.common.api.internal.d b(com.google.android.gms.common.api.internal.d dVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override
    public void b0(int i7, long j3) {
        ArrayList arrayList;
        y5 y5Var = (y5) this.f8212b;
        e7 e7Var = y5Var.d;
        if (e7Var != null && (arrayList = e7Var.T) != null && i7 >= 0 && i7 < arrayList.size()) {
            ((e7) y5Var.d.T.get(i7)).X = j3;
        }
    }

    @Override
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) af.b.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f8212b).createWebView(webView));
    }

    @Override
    public int d(long j3) {
        if (j3 < 0) {
            return 0;
        }
        return -1;
    }

    @Override
    public void d0() {
        x9 x9Var = (x9) this.f8212b;
        if (x9Var.f12547s0 != null) {
            x9Var.A0(null, true);
        }
        x9Var.M0.setViewHidden(true);
    }

    @Override
    public void e(int i7) {
        fi.e0 e0Var = ((y5) this.f8212b).E;
        if (e0Var != null) {
            ArrayList arrayList = e0Var.h;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                fi.d0 d0Var = (fi.d0) obj;
                if (d0Var.f11772a == i7) {
                    d0Var.f11773b.e(true, 1.0f);
                    e0Var.invalidate();
                    return;
                }
            }
        }
    }

    @Override
    public void e0(long j3) {
        y5 y5Var = (y5) this.f8212b;
        e7 e7Var = y5Var.d;
        if (e7Var == null) {
            return;
        }
        e7Var.D = j3;
        e7Var.f11901j = true;
        y5Var.w(true);
    }

    @Override
    public int e1() {
        return ((dd) this.f8212b).f3710c0;
    }

    @Override
    public void f(Object obj) {
        Bundle extras;
        switch (this.f8211a) {
            case 8:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                i0 i0Var = (i0) this.f8212b;
                androidx.fragment.app.e0 e0Var = (androidx.fragment.app.e0) i0Var.F.pollLast();
                if (e0Var == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    return;
                }
                String str = e0Var.f2384a;
                int i7 = e0Var.f2385b;
                r o4 = i0Var.f2398c.o(str);
                if (o4 == null) {
                    Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                    return;
                }
                o4.x(i7, aVar.f1858a, aVar.f1859b);
                return;
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f8212b;
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar2.f1859b;
                int i10 = u.e("ProxyBillingActivityV2", intent).f11156a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.N;
                if (resultReceiver != null) {
                    if (intent == null) {
                        extras = null;
                    } else {
                        extras = intent.getExtras();
                    }
                    resultReceiver.send(i10, extras);
                }
                int i11 = aVar2.f1858a;
                if (i11 != -1 || i10 != 0) {
                    u.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i11 + " and billing's responseCode: " + i10);
                }
                proxyBillingActivityV2.finish();
                return;
        }
    }

    public SparseIntArray f0(long j3) {
        return (SparseIntArray) ((a0.h) this.f8212b).f(j3);
    }

    @Override
    public void g(float f10) {
        y5 y5Var = (y5) this.f8212b;
        e7 e7Var = y5Var.d;
        if (e7Var == null) {
            return;
        }
        e7Var.f11923u0 = f10;
        e7Var.f11901j = true;
        y5Var.c();
    }

    public boolean g0(String str) {
        String k02 = k0(str);
        if (!"1".equals(k02) && !Boolean.parseBoolean(k02)) {
            return false;
        }
        return true;
    }

    @Override
    public Object mo24get() {
        return new l0((v0) ((ib.c) this.f8212b).mo24get());
    }

    @Override
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) af.b.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f8212b).getStatics());
    }

    @Override
    public void h(float f10) {
        y5 y5Var = (y5) this.f8212b;
        e7 e7Var = y5Var.d;
        if (e7Var == null) {
            return;
        }
        e7Var.G = f10;
        e7Var.f11901j = true;
        y5Var.c();
    }

    public Integer h0(String str) {
        String k02 = k0(str);
        if (!TextUtils.isEmpty(k02)) {
            try {
                return Integer.valueOf(Integer.parseInt(k02));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + n0(str) + "(" + k02 + ") into an int");
                return null;
            }
        }
        return null;
    }

    @Override
    public void i(View view, o0 o0Var, boolean z9, boolean z10) {
        ch.r rVar = (ch.r) this.f8212b;
        rVar.f6387a.Db(null, rVar.f6390e, rVar.f6388b, view, 0.0f, 0.0f, o0Var, false, z9, z10, false);
        org.telegram.messenger.g0.h3(new ab(this, 8));
    }

    public JSONArray i0(String str) {
        String k02 = k0(str);
        if (!TextUtils.isEmpty(k02)) {
            try {
                return new JSONArray(k02);
            } catch (JSONException unused) {
                Log.w("NotificationParams", "Malformed JSON for key " + n0(str) + ": " + k02 + ", falling back to default");
                return null;
            }
        }
        return null;
    }

    @Override
    public void j(long j3, boolean z9) {
        y5 y5Var = (y5) this.f8212b;
        if (!z9) {
            y5Var.m(j3);
            return;
        }
        t51 t51Var = y5Var.f13171e;
        if (t51Var != null) {
            t51Var.q0(j3, true);
        } else if (y5Var.j()) {
            y5Var.E.m(j3, true);
        } else {
            t51 t51Var2 = y5Var.D;
            if (t51Var2 != null) {
                t51Var2.q0(j3, false);
            }
        }
    }

    public String j0(Resources resources, String str, String str2) {
        String[] strArr;
        String k02 = k0(str2);
        if (!TextUtils.isEmpty(k02)) {
            return k02;
        }
        String k03 = k0(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(k03)) {
            return null;
        }
        int identifier = resources.getIdentifier(k03, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", n0(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray i02 = i0(str2.concat("_loc_args"));
        if (i02 == null) {
            strArr = null;
        } else {
            int length = i02.length();
            strArr = new String[length];
            for (int i7 = 0; i7 < length; i7++) {
                strArr[i7] = i02.optString(i7);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e10) {
            Log.w("NotificationParams", "Missing format argument for " + n0(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e10);
            return null;
        }
    }

    @Override
    public long k(int i7) {
        boolean z9;
        if (i7 == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.f(z9);
        return 0L;
    }

    public String k0(String str) {
        String replace;
        Bundle bundle = (Bundle) this.f8212b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            if (!str.startsWith("gcm.n.")) {
                replace = str;
            } else {
                replace = str.replace("gcm.n.", "gcm.notification.");
            }
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    @Override
    public void l(ai.i0 i0Var) {
        s0 s0Var = (s0) this.f8212b;
        FrameLayout frameLayout = s0Var.f1622f;
        if (frameLayout != null) {
            frameLayout.removeView(i0Var);
        }
        if (s0Var.F == i0Var) {
            s0Var.F = null;
        }
        l1 l1Var = s0Var.d;
        if (l1Var != null) {
            l1Var.setScanHidden(false);
        }
    }

    @Override
    public void m(String str) {
        s0 s0Var = (s0) this.f8212b;
        if (s0Var.getParentActivity() != null) {
            vf.c.t(s0Var.getParentActivity(), str);
        }
    }

    public Bundle m0() {
        Bundle bundle = (Bundle) this.f8212b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    @Override
    public void o() {
        ec ecVar = ((x9) this.f8212b).f12559y0;
        if (ecVar != null) {
            ecVar.invalidate();
        }
    }

    @Override
    public void onSuccess(Object obj) {
        ((g6.a) this.f8212b).getClass();
        l8.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    @Override
    public void p() {
        x9 x9Var = (x9) this.f8212b;
        if (x9Var.L0) {
            x9Var.L0 = false;
            return;
        }
        x9Var.T0.b(1);
        x9Var.w((sg.h) sg.h.f55073a.get(0));
    }

    public synchronized void p0() {
        synchronized (this) {
            b bVar = (b) this.f8212b;
            ReentrantLock reentrantLock = bVar.f8193a;
            reentrantLock.lock();
            bVar.f8194b.edit().clear().apply();
            reentrantLock.unlock();
        }
    }

    @Override
    public void r() {
        y5 y5Var = (y5) this.f8212b;
        y5Var.s(null, null, true);
        va vaVar = ((ja) y5Var).C0;
        ja jaVar = vaVar.X0;
        if (jaVar != null) {
            jaVar.s(null, null, true);
        }
        x9 x9Var = vaVar.f13004v1;
        if (x9Var != null) {
            x9Var.n0();
        }
        la laVar = vaVar.f12946c1;
        if (laVar != null) {
            laVar.setHasRoundVideo(false);
        }
        e7 e7Var = vaVar.K1;
        if (e7Var != null) {
            File file = e7Var.f11911o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                vaVar.K1.f11911o0 = null;
            }
            if (vaVar.K1.f11913p0 != null) {
                try {
                    new File(vaVar.K1.f11913p0).delete();
                } catch (Exception unused2) {
                }
                vaVar.K1.f11913p0 = null;
            }
        }
    }

    @Override
    public List s(long j3) {
        if (j3 >= 0) {
            return (List) this.f8212b;
        }
        return Collections.EMPTY_LIST;
    }

    @Override
    public void t(boolean z9, float f10) {
        y5 y5Var = (y5) this.f8212b;
        e7 e7Var = y5Var.d;
        if (e7Var != null) {
            e7Var.Z = f10;
            e7Var.f11901j = true;
            t51 t51Var = y5Var.f13171e;
            if (t51Var != null && t51Var.U() != -9223372036854775807L) {
                y5Var.m(f10 * ((float) y5Var.f13171e.U()));
            }
        }
    }

    @Override
    public Task then(Object obj) {
        ia.b bVar = (ia.b) obj;
        q qVar = (q) this.f8212b;
        if (bVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        aa.q qVar2 = (aa.q) qVar.f53816c;
        aa.q.b((aa.q) qVar.f53816c);
        qVar2.f844m.h(null, qVar2.f837e.f3135a);
        qVar2.f848q.trySetResult(null);
        return Tasks.forResult(null);
    }

    @Override
    public void u(float f10) {
        y5 y5Var = (y5) this.f8212b;
        e7 e7Var = y5Var.d;
        if (e7Var == null) {
            return;
        }
        e7Var.f11919s0 = f10;
        e7Var.f11901j = true;
        y5Var.y(true);
    }

    @Override
    public boolean v() {
        return true;
    }

    @Override
    public void w() {
        ((j0) this.f8212b).d.invalidate();
    }

    @Override
    public void x(boolean z9) {
        y5 y5Var = (y5) this.f8212b;
        if (y5Var.j()) {
            y5Var.E.getClass();
        }
        y5Var.x(-4, z9);
    }

    @Override
    public int y() {
        return 1;
    }

    @Override
    public boolean z() {
        boolean z9;
        x9 x9Var = (x9) this.f8212b;
        if (x9Var.f12547s0 == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            x9Var.A0(null, true);
        }
        return z9;
    }

    public i(Object obj, int i7) {
        this.f8211a = i7;
        this.f8212b = obj;
    }

    public i(Context context) {
        String e10;
        this.f8211a = 0;
        b a10 = b.a(context);
        this.f8212b = a10;
        a10.b();
        String e11 = a10.e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(e11) || (e10 = a10.e(b.f("googleSignInOptions", e11))) == null) {
            return;
        }
        try {
            GoogleSignInOptions.b(e10);
        } catch (JSONException unused) {
        }
    }

    public i(int i7) {
        this.f8211a = i7;
        switch (i7) {
            case 10:
                this.f8212b = new a0.h();
                return;
            default:
                this.f8212b = new LinkedHashMap(0, 0.75f, true);
                return;
        }
    }

    public i(Bundle bundle) {
        this.f8211a = 3;
        this.f8212b = new Bundle(bundle);
    }

    public i(rd.p pVar) {
        this.f8211a = 12;
        this.f8212b = (kd.j) pVar;
    }

    @Override
    public void M() {
    }

    @Override
    public void W() {
    }

    @Override
    public void c0() {
    }

    @Override
    public void n() {
    }

    @Override
    public void A(int i7) {
    }

    @Override
    public void H(boolean z9) {
    }

    @Override
    public void Z(boolean z9) {
    }

    @Override
    public void c(Bundle bundle) {
    }

    @Override
    public void q(n6.a aVar, com.google.android.gms.common.api.e eVar, boolean z9) {
    }

    @Override
    public void L(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z9) {
    }
}
