package k6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.biometric.q;
import androidx.biometric.v;
import androidx.biometric.z;
import androidx.fragment.app.e0;
import androidx.lifecycle.a0;
import bi.jb;
import bi.q5;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import di.i0;
import di.mb;
import e9.l1;
import g.r;
import gb.t;
import gi.s0;
import gi.t0;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import ji.d2;
import m.t3;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.json.JSONObject;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.f5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fo;
import org.telegram.ui.sv0;
import qg.q1;
import r0.c0;
import r0.j0;
import rg.x1;
import v7.j5;
import v7.u6;
public final class h implements z3.e, a0, androidx.activity.result.b, WebMessageListenerBoundaryInterface, sv0, v0, OnSuccessListener, mg.o, x1, l1, r0.o, gb.o, s0, s, f5 {
    public static h f14174c;
    public final int f14175a;
    public Object f14176b;

    public h(i7.b bVar, x5.e eVar) {
        this.f14175a = 28;
        this.f14176b = eVar;
    }

    public static p m(Looper looper, Object obj, String str) {
        n6.l.i(obj, "Listener must not be null");
        n6.l.i(looper, "Looper must not be null");
        return new p(looper, obj, str);
    }

    public static h p(Context context) {
        n6.l.h(context);
        synchronized (h.class) {
            try {
                if (f14174c == null) {
                    o.a(context);
                    f14174c = new h(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f14174c;
    }

    public static final l s(PackageInfo packageInfo, l... lVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            m mVar = new m(packageInfo.signatures[0].toByteArray());
            for (int i10 = 0; i10 < lVarArr.length; i10++) {
                if (lVarArr[i10].equals(mVar)) {
                    return lVarArr[i10];
                }
            }
        }
        return null;
    }

    public static final boolean t(android.content.pm.PackageInfo r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: k6.h.t(android.content.pm.PackageInfo, boolean):boolean");
    }

    @Override
    public void A() {
        ((i0) this.f14176b).d.invalidate();
    }

    @Override
    public void B0(float f7) {
        mb mbVar = (mb) this.f14176b;
        qg.s0.e(mbVar.F1).k(String.valueOf(qg.m.f43485a.indexOf(mbVar.O0.getCurrentBrush())), f7);
        q1 q1Var = mbVar.A1;
        q1Var.f43545c = f7;
        mbVar.D0(q1Var, null, false);
    }

    @Override
    public void D0(MessageObject messageObject) {
        ((jb) ((q5) this.f14176b).Q1).f(true);
    }

    @Override
    public void H(MessageObject messageObject) {
        ((jb) ((q5) this.f14176b).Q1).f(false);
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        ((d2) this.f14176b).s0(i10, i11, z10);
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        boolean z10;
        r0.l1 l1Var2;
        int b10;
        int c10;
        boolean z11;
        int color;
        int d = l1Var.d();
        r rVar = (r) this.f14176b;
        Context context = rVar.e;
        int d10 = l1Var.d();
        ActionBarContextView actionBarContextView = rVar.f9816y;
        int i10 = 8;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) rVar.f9816y.getLayoutParams();
            boolean z12 = true;
            if (rVar.f9816y.isShown()) {
                if (rVar.f9807l0 == null) {
                    rVar.f9807l0 = new Rect();
                    rVar.m0 = new Rect();
                }
                Rect rect = rVar.f9807l0;
                Rect rect2 = rVar.m0;
                rect.set(l1Var.b(), l1Var.d(), l1Var.c(), l1Var.a());
                ViewGroup viewGroup = rVar.J;
                Method method = t3.f15245a;
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
                ViewGroup viewGroup2 = rVar.J;
                WeakHashMap weakHashMap = j0.f43732a;
                r0.l1 a2 = c0.a(viewGroup2);
                if (a2 == null) {
                    b10 = 0;
                } else {
                    b10 = a2.b();
                }
                if (a2 == null) {
                    c10 = 0;
                } else {
                    c10 = a2.c();
                }
                if (marginLayoutParams.topMargin == i11 && marginLayoutParams.leftMargin == i12 && marginLayoutParams.rightMargin == i13) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i11;
                    marginLayoutParams.leftMargin = i12;
                    marginLayoutParams.rightMargin = i13;
                    z11 = true;
                }
                if (i11 > 0 && rVar.L == null) {
                    View view2 = new View(context);
                    rVar.L = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b10;
                    layoutParams.rightMargin = c10;
                    rVar.J.addView(rVar.L, -1, layoutParams);
                } else {
                    View view3 = rVar.L;
                    if (view3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        int i14 = marginLayoutParams2.height;
                        int i15 = marginLayoutParams.topMargin;
                        if (i14 != i15 || marginLayoutParams2.leftMargin != b10 || marginLayoutParams2.rightMargin != c10) {
                            marginLayoutParams2.height = i15;
                            marginLayoutParams2.leftMargin = b10;
                            marginLayoutParams2.rightMargin = c10;
                            rVar.L.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view4 = rVar.L;
                if (view4 == null) {
                    z12 = false;
                }
                if (z12 && view4.getVisibility() != 0) {
                    View view5 = rVar.L;
                    if ((view5.getWindowSystemUiVisibility() & 8192) != 0) {
                        color = context.getColor(2131099654);
                    } else {
                        color = context.getColor(2131099653);
                    }
                    view5.setBackgroundColor(color);
                }
                if (!rVar.Q && z12) {
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
                rVar.f9816y.setLayoutParams(marginLayoutParams);
            }
        } else {
            z10 = false;
        }
        View view6 = rVar.L;
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
        return j0.g(view, l1Var2);
    }

    @Override
    public void a(long j10) {
        ((gi.s) this.f14176b).presentFragment(fo.W9(j10));
    }

    @Override
    public void accept(Object obj, Object obj2) {
        a6.l lVar = new a6.l((TaskCompletionSource) obj2);
        i7.i iVar = (i7.i) ((i7.c) obj).u();
        Parcel J0 = iVar.J0();
        int i10 = i7.f.f11344a;
        J0.writeStrongBinder(lVar);
        i7.f.c(J0, (x5.e) this.f14176b);
        iVar.K0(J0, 1);
    }

    @Override
    public void b() {
        boolean z10;
        gi.s sVar = (gi.s) this.f14176b;
        ne.b bVar = sVar.f10245a;
        t0 t0Var = sVar.v;
        if (t0Var.f10264n && t0Var.f10262l == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        bVar.a(z10, true);
        sVar.d.W2.N(true);
    }

    @Override
    public int c(long j10) {
        if (j10 < 0) {
            return 0;
        }
        return -1;
    }

    @Override
    public void close() {
        ((gi.s) this.f14176b).finishFragment();
    }

    @Override
    public long d(int i10) {
        boolean z10;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        return 0L;
    }

    @Override
    public Object e(Object obj, Object obj2) {
        return ((d9.k) this.f14176b).apply(obj2);
    }

    @Override
    public List f(long j10) {
        if (j10 >= 0) {
            return (List) this.f14176b;
        }
        return Collections.EMPTY_LIST;
    }

    @Override
    public Object f2() {
        Class cls = (Class) this.f14176b;
        try {
            return t.f10077a.a(cls);
        } catch (Exception e) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
        }
    }

    public void g(StringBuilder sb2, Iterator it) {
        d9.l lVar = (d9.l) this.f14176b;
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb2.append(d9.l.d(entry.getKey()));
            sb2.append("=");
            sb2.append(d9.l.d(entry.getValue()));
            while (it.hasNext()) {
                sb2.append((CharSequence) lVar.f6436a);
                Map.Entry entry2 = (Map.Entry) it.next();
                sb2.append(d9.l.d(entry2.getKey()));
                sb2.append("=");
                sb2.append(d9.l.d(entry2.getValue()));
            }
        }
    }

    @Override
    public TextureView g0() {
        return null;
    }

    @Override
    public float get() {
        mb mbVar = (mb) this.f14176b;
        int i10 = mbVar.F1;
        qg.m currentBrush = mbVar.O0.getCurrentBrush();
        if (currentBrush == null) {
            return qg.s0.e(i10).f43570i;
        }
        return qg.s0.e(i10).f(String.valueOf(qg.m.f43485a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override
    public void h(a aVar) {
        x xVar = (x) this.f14176b;
        xVar.f5060o.lock();
        try {
            xVar.f5057l = aVar;
            x.l(xVar);
        } finally {
            xVar.f5060o.unlock();
        }
    }

    @Override
    public void i(Object obj) {
        Bundle extras;
        switch (this.f14175a) {
            case 7:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                androidx.fragment.app.i0 i0Var = (androidx.fragment.app.i0) this.f14176b;
                e0 e0Var = (e0) i0Var.F.pollFirst();
                if (e0Var == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    return;
                }
                String str = e0Var.f1559a;
                int i10 = e0Var.f1560b;
                androidx.fragment.app.r f7 = i0Var.f1573c.f(str);
                if (f7 == null) {
                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                    return;
                }
                f7.x(i10, aVar.f1060a, aVar.f1061b);
                return;
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f14176b;
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar2.f1061b;
                int i11 = aVar2.f1060a;
                if (intent == null) {
                    extras = null;
                } else {
                    extras = intent.getExtras();
                }
                if (i11 != -1) {
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    u.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i11);
                    extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                    extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i11);
                }
                int i12 = u.e("ProxyBillingActivityV2", intent).f4381a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.O;
                if (resultReceiver != null) {
                    resultReceiver.send(i12, extras);
                } else {
                    u.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                }
                if (i12 != 0) {
                    u.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i12);
                }
                proxyBillingActivityV2.finish();
                return;
        }
    }

    @Override
    public int j() {
        return 1;
    }

    public void k(j6.l lVar, v vVar) {
        androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) this.f14176b;
        if (j0Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
        } else if (j0Var.P()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
        } else {
            androidx.fragment.app.j0 j0Var2 = (androidx.fragment.app.j0) this.f14176b;
            q qVar = (q) j0Var2.D("androidx.biometric.BiometricFragment");
            if (qVar == null) {
                qVar = new q();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(j0Var2);
                aVar.f(0, qVar, "androidx.biometric.BiometricFragment");
                aVar.e(true, true);
                j0Var2.A(true);
                j0Var2.E();
            }
            androidx.fragment.app.u k10 = qVar.k();
            if (k10 == null) {
                Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
                return;
            }
            z zVar = qVar.f1214l0;
            zVar.f1224f = lVar;
            int i10 = lVar.f12872a;
            if (i10 == 0) {
                if (vVar != null) {
                    i10 = 15;
                } else {
                    i10 = 255;
                }
            }
            if (Build.VERSION.SDK_INT < 30 && i10 == 15 && vVar == null) {
                zVar.f1225g = v7.m.a();
            } else {
                zVar.f1225g = vVar;
            }
            if (qVar.Q()) {
                qVar.f1214l0.f1228k = qVar.q(2131689576);
            } else {
                qVar.f1214l0.f1228k = null;
            }
            if (qVar.Q() && new androidx.biometric.e(new androidx.biometric.t(k10, 0)).h(255) != 0) {
                qVar.f1214l0.f1231n = true;
                qVar.S();
            } else if (qVar.f1214l0.f1233p) {
                qVar.f1213k0.postDelayed(new androidx.biometric.p(qVar), 600L);
            } else {
                qVar.X();
            }
        }
    }

    @Override
    public void l(int i10) {
        a aVar;
        x xVar = (x) this.f14176b;
        Lock lock = xVar.f5060o;
        lock.lock();
        try {
            if (!xVar.f5059n && (aVar = xVar.f5058m) != null && aVar.c()) {
                xVar.f5059n = true;
                xVar.e.onConnectionSuspended(i10);
                lock.unlock();
            }
            xVar.f5059n = false;
            x.k(xVar, i10);
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    public androidx.biometric.e n(n4.s r41) {
        throw new UnsupportedOperationException("Method not decompiled: k6.h.n(n4.s):androidx.biometric.e");
    }

    @Override
    public void o(Bundle bundle) {
        x xVar = (x) this.f14176b;
        xVar.f5060o.lock();
        try {
            Bundle bundle2 = xVar.f5056k;
            if (bundle2 == null) {
                xVar.f5056k = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            xVar.f5057l = a.e;
            x.l(xVar);
        } finally {
            xVar.f5060o.unlock();
        }
    }

    @Override
    public void onPostMessage(android.webkit.WebView r8, java.lang.reflect.InvocationHandler r9, android.net.Uri r10, boolean r11, java.lang.reflect.InvocationHandler r12) {
        throw new UnsupportedOperationException("Method not decompiled: k6.h.onPostMessage(android.webkit.WebView, java.lang.reflect.InvocationHandler, android.net.Uri, boolean, java.lang.reflect.InvocationHandler):void");
    }

    @Override
    public void onSuccess(Object obj) {
        ((d6.a) this.f14176b).getClass();
        j5.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    public ea.a q(JSONObject jSONObject) {
        ea.c dVar;
        int i10 = jSONObject.getInt("settings_version");
        if (i10 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.", null);
            dVar = new t7.u(7);
        } else {
            dVar = new oa.d(8);
        }
        return dVar.B0((t7.u) this.f14176b, jSONObject);
    }

    public b2.u0 r(c3.p r12, q3.g r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: k6.h.r(c3.p, q3.g, int):b2.u0");
    }

    @Override
    public void v0(Object obj) {
        switch (this.f14175a) {
            case 4:
                q qVar = (q) this.f14176b;
                if (((Boolean) obj).booleanValue()) {
                    if (qVar.R()) {
                        qVar.W(qVar.q(2131689613));
                    }
                    z zVar = qVar.f1214l0;
                    if (!zVar.f1231n) {
                        Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                    } else {
                        Executor executor = zVar.d;
                        if (executor == null) {
                            executor = new androidx.biometric.o(1);
                        }
                        executor.execute(new androidx.biometric.h(qVar, 0));
                    }
                    z zVar2 = qVar.f1214l0;
                    if (zVar2.f1238u == null) {
                        zVar2.f1238u = new androidx.lifecycle.z();
                    }
                    z.h(zVar2.f1238u, Boolean.FALSE);
                    return;
                }
                return;
            default:
                androidx.lifecycle.t tVar = (androidx.lifecycle.t) obj;
                androidx.fragment.app.o oVar = (androidx.fragment.app.o) this.f14176b;
                if (tVar != null && oVar.f1626r0) {
                    oVar.getClass();
                    throw new IllegalStateException("Fragment " + oVar + " did not return a View from onCreateView() or this was called before onCreateView().");
                }
                return;
        }
    }

    public h(Object obj, int i10) {
        this.f14175a = i10;
        this.f14176b = obj;
    }

    public h(Context context) {
        this.f14175a = 0;
        this.f14176b = context.getApplicationContext();
    }

    public h(int i10) {
        this.f14175a = i10;
        switch (i10) {
            case 10:
                this.f14176b = new e2.x(10);
                return;
            case 11:
                return;
            case 13:
                this.f14176b = Collections.newSetFromMap(new WeakHashMap());
                return;
            case 26:
                this.f14176b = new qb.c();
                return;
            case 27:
                this.f14176b = new HashMap();
                return;
            default:
                this.f14176b = new n4.s[ag.b.values().length];
                return;
        }
    }

    public h(LaunchActivity launchActivity, Executor executor, v7.l lVar) {
        this.f14175a = 5;
        if (launchActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor != null) {
            androidx.fragment.app.j0 s10 = launchActivity.s();
            z zVar = (z) new androidx.biometric.e(launchActivity).m(z.class);
            this.f14176b = s10;
            zVar.d = executor;
            zVar.e = lVar;
            return;
        }
        throw new IllegalArgumentException("Executor must not be null.");
    }

    @Override
    public void k0() {
    }

    @Override
    public void M(boolean z10) {
    }

    @Override
    public void i0(boolean z10) {
    }
}
