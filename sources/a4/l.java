package a4;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.Editable;
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
import androidx.fragment.app.j0;
import androidx.fragment.app.u;
import androidx.lifecycle.a0;
import androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer;
import bi.jb;
import bi.q5;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import di.i0;
import di.mb;
import e9.l1;
import fi.x4;
import g.r;
import gi.s0;
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
import ji.d3;
import ji.g1;
import ji.h1;
import ji.h2;
import ji.u5;
import ji.x3;
import k2.t;
import k2.t0;
import k2.x;
import m.w3;
import mg.o;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.json.JSONObject;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.f5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fo;
import org.telegram.ui.rv0;
import qg.m;
import qg.q1;
import r0.b0;
import r0.n;
import rg.x1;
import v7.j5;
import v7.u6;
public final class l implements z3.e, a0, androidx.activity.result.b, WebMessageListenerBoundaryInterface, rv0, v0, OnSuccessListener, o, x1, l1, n, s0, s, f5, g1, x {
    public final int f278a;
    public Object f279b;

    public l(i7.b bVar, x5.e eVar) {
        this.f278a = 26;
        this.f279b = eVar;
    }

    public static p M(Looper looper, Object obj, String str) {
        n6.l.i(obj, "Listener must not be null");
        n6.l.i(looper, "Looper must not be null");
        return new p(looper, obj, str);
    }

    @Override
    public void A() {
        ((i0) this.f279b).d.invalidate();
    }

    @Override
    public void B() {
        ((FfmpegAudioRenderer) this.f279b).Z = true;
    }

    @Override
    public void C(Editable editable) {
        u5 u5Var = (u5) this.f279b;
        ji.a aVar = u5Var.f13123a;
        if (aVar != null) {
            aVar.f13121s = true;
            aVar.f13120r = u5Var.f13564r.E;
        }
        u5Var.u();
        d3 d3Var = u5Var.E;
        if (d3Var != null && u5Var.f13123a != null) {
            d3Var.a();
        }
    }

    @Override
    public void C0(MessageObject messageObject) {
        ((jb) ((q5) this.f279b).Q1).f(true);
    }

    @Override
    public void D(t0 t0Var) {
        qf.b bVar = ((FfmpegAudioRenderer) this.f279b).I;
        Handler handler = (Handler) bVar.f43097b;
        if (handler != null) {
            handler.post(new t(bVar, t0Var, 1));
        }
    }

    @Override
    public boolean E(boolean z10) {
        return false;
    }

    @Override
    public void F(t0 t0Var) {
        qf.b bVar = ((FfmpegAudioRenderer) this.f279b).I;
        Handler handler = (Handler) bVar.f43097b;
        if (handler != null) {
            handler.post(new t(bVar, t0Var, 0));
        }
    }

    @Override
    public void G0(float f7) {
        mb mbVar = (mb) this.f279b;
        qg.s0.e(mbVar.F1).k(String.valueOf(m.f43227a.indexOf(mbVar.O0.getCurrentBrush())), f7);
        q1 q1Var = mbVar.A1;
        q1Var.f43287c = f7;
        mbVar.D0(q1Var, null, false);
    }

    @Override
    public void H(MessageObject messageObject) {
        ((jb) ((q5) this.f279b).Q1).f(false);
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        ((d2) this.f279b).s0(i10, i11, z10);
    }

    public void K(StringBuilder sb2, Iterator it) {
        d9.l lVar = (d9.l) this.f279b;
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb2.append(d9.l.d(entry.getKey()));
            sb2.append("=");
            sb2.append(d9.l.d(entry.getValue()));
            while (it.hasNext()) {
                sb2.append((CharSequence) lVar.f6439a);
                Map.Entry entry2 = (Map.Entry) it.next();
                sb2.append(d9.l.d(entry2.getKey()));
                sb2.append("=");
                sb2.append(d9.l.d(entry2.getValue()));
            }
        }
    }

    public void L(j6.l lVar, v vVar) {
        j0 j0Var = (j0) this.f279b;
        if (j0Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
        } else if (j0Var.P()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
        } else {
            j0 j0Var2 = (j0) this.f279b;
            q qVar = (q) j0Var2.D("androidx.biometric.BiometricFragment");
            if (qVar == null) {
                qVar = new q();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(j0Var2);
                aVar.f(0, qVar, "androidx.biometric.BiometricFragment");
                aVar.e(true, true);
                j0Var2.A(true);
                j0Var2.E();
            }
            u k10 = qVar.k();
            if (k10 == null) {
                Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
                return;
            }
            z zVar = qVar.f1218l0;
            zVar.f1228f = lVar;
            int i10 = lVar.f12876a;
            if (i10 == 0) {
                if (vVar != null) {
                    i10 = 15;
                } else {
                    i10 = 255;
                }
            }
            if (Build.VERSION.SDK_INT < 30 && i10 == 15 && vVar == null) {
                zVar.f1229g = v7.m.a();
            } else {
                zVar.f1229g = vVar;
            }
            if (qVar.Q()) {
                qVar.f1218l0.f1232k = qVar.q(2131689576);
            } else {
                qVar.f1218l0.f1232k = null;
            }
            if (qVar.Q() && new androidx.biometric.e(new androidx.biometric.t(k10, 0)).f(255) != 0) {
                qVar.f1218l0.f1235n = true;
                qVar.S();
            } else if (qVar.f1218l0.f1237p) {
                qVar.f1217k0.postDelayed(new androidx.biometric.p(qVar), 600L);
            } else {
                qVar.X();
            }
        }
    }

    public androidx.biometric.e N(n4.s r41) {
        throw new UnsupportedOperationException("Method not decompiled: a4.l.N(n4.s):androidx.biometric.e");
    }

    public ea.a O(JSONObject jSONObject) {
        ea.c dVar;
        int i10 = jSONObject.getInt("settings_version");
        if (i10 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.", null);
            dVar = new t7.u(7);
        } else {
            dVar = new oa.d(8);
        }
        return dVar.t0((t7.u) this.f279b, jSONObject);
    }

    public b2.u0 P(c3.p r12, q3.g r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: a4.l.P(c3.p, q3.g, int):b2.u0");
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
        r rVar = (r) this.f279b;
        Context context = rVar.e;
        int d10 = l1Var.d();
        ActionBarContextView actionBarContextView = rVar.f9819y;
        int i10 = 8;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) rVar.f9819y.getLayoutParams();
            boolean z12 = true;
            if (rVar.f9819y.isShown()) {
                if (rVar.f9810l0 == null) {
                    rVar.f9810l0 = new Rect();
                    rVar.m0 = new Rect();
                }
                Rect rect = rVar.f9810l0;
                Rect rect2 = rVar.m0;
                rect.set(l1Var.b(), l1Var.d(), l1Var.c(), l1Var.a());
                ViewGroup viewGroup = rVar.J;
                Method method = w3.f15007a;
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
                WeakHashMap weakHashMap = r0.i0.f43485a;
                r0.l1 a2 = b0.a(viewGroup2);
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
                rVar.f9819y.setLayoutParams(marginLayoutParams);
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
        return r0.i0.g(view, l1Var2);
    }

    @Override
    public void a(h1 h1Var) {
        d3 d3Var = ((u5) this.f279b).E;
        if (d3Var != null) {
            x3 x3Var = d3Var.f13235a;
            x3.N1(x3Var, h1Var);
            x3Var.f13630f3.V(h1Var, true);
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        a6.l lVar = new a6.l((TaskCompletionSource) obj2);
        i7.i iVar = (i7.i) ((i7.c) obj).u();
        Parcel J0 = iVar.J0();
        int i10 = i7.f.f11348a;
        J0.writeStrongBinder(lVar);
        i7.f.c(J0, (x5.e) this.f279b);
        iVar.K0(J0, 1);
    }

    @Override
    public void b(long j10) {
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.f279b;
        ffmpegAudioRenderer.f1811g0 = true;
        qf.b bVar = ffmpegAudioRenderer.I;
        Handler handler = (Handler) bVar.f43097b;
        if (handler != null) {
            handler.post(new bi.g(bVar, j10, 13));
        }
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
        ((gi.s) this.f279b).finishFragment();
    }

    @Override
    public boolean d() {
        u5 u5Var = (u5) this.f279b;
        d3 d3Var = u5Var.E;
        if (d3Var != null && u5Var.f13123a != null) {
            return d3Var.f13235a.T4();
        }
        return false;
    }

    @Override
    public boolean e(h1 h1Var) {
        return false;
    }

    @Override
    public void f(int i10, int i11) {
        h2 h2Var;
        u5 u5Var = (u5) this.f279b;
        d3 d3Var = u5Var.E;
        if (d3Var != null && u5Var.f13123a != null && (h2Var = d3Var.f13235a.H3) != null) {
            h2Var.f(i10, i11);
        }
    }

    @Override
    public void g() {
        ((FfmpegAudioRenderer) this.f279b).f1810f0 = true;
    }

    @Override
    public TextureView g0() {
        return null;
    }

    @Override
    public float get() {
        mb mbVar = (mb) this.f279b;
        int i10 = mbVar.F1;
        m currentBrush = mbVar.O0.getCurrentBrush();
        if (currentBrush == null) {
            return qg.s0.e(i10).f43312i;
        }
        return qg.s0.e(i10).f(String.valueOf(m.f43227a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override
    public long h(int i10) {
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
    public void j(Object obj) {
        Bundle extras;
        switch (this.f278a) {
            case 6:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                androidx.fragment.app.i0 i0Var = (androidx.fragment.app.i0) this.f279b;
                e0 e0Var = (e0) i0Var.F.pollFirst();
                if (e0Var == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    return;
                }
                String str = e0Var.f1563a;
                int i10 = e0Var.f1564b;
                androidx.fragment.app.r f7 = i0Var.f1577c.f(str);
                if (f7 == null) {
                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                    return;
                }
                f7.x(i10, aVar.f1064a, aVar.f1065b);
                return;
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f279b;
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar2.f1065b;
                int i11 = aVar2.f1064a;
                if (intent == null) {
                    extras = null;
                } else {
                    extras = intent.getExtras();
                }
                if (i11 != -1) {
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i11);
                    extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                    extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i11);
                }
                int i12 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).f4384a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.O;
                if (resultReceiver != null) {
                    resultReceiver.send(i12, extras);
                } else {
                    com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                }
                if (i12 != 0) {
                    com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i12);
                }
                proxyBillingActivityV2.finish();
                return;
        }
    }

    @Override
    public Object k(Object obj, Object obj2) {
        return ((d9.k) this.f279b).apply(obj2);
    }

    @Override
    public void l(k6.a aVar) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.f279b;
        xVar.f5063o.lock();
        try {
            xVar.f5060l = aVar;
            com.google.android.gms.common.api.internal.x.l(xVar);
        } finally {
            xVar.f5063o.unlock();
        }
    }

    @Override
    public boolean m(h1 h1Var) {
        return false;
    }

    @Override
    public void n(long j10) {
        ((gi.s) this.f279b).presentFragment(fo.W9(j10));
    }

    @Override
    public void n0(Object obj) {
        switch (this.f278a) {
            case 3:
                q qVar = (q) this.f279b;
                if (((Boolean) obj).booleanValue()) {
                    if (qVar.R()) {
                        qVar.W(qVar.q(2131689613));
                    }
                    z zVar = qVar.f1218l0;
                    if (!zVar.f1235n) {
                        Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                    } else {
                        Executor executor = zVar.d;
                        if (executor == null) {
                            executor = new androidx.biometric.o(1);
                        }
                        executor.execute(new androidx.biometric.h(qVar, 0));
                    }
                    z zVar2 = qVar.f1218l0;
                    if (zVar2.f1242u == null) {
                        zVar2.f1242u = new androidx.lifecycle.z();
                    }
                    z.h(zVar2.f1242u, Boolean.FALSE);
                    return;
                }
                return;
            default:
                androidx.lifecycle.t tVar = (androidx.lifecycle.t) obj;
                androidx.fragment.app.o oVar = (androidx.fragment.app.o) this.f279b;
                if (tVar != null && oVar.f1630r0) {
                    oVar.getClass();
                    throw new IllegalStateException("Fragment " + oVar + " did not return a View from onCreateView() or this was called before onCreateView().");
                }
                return;
        }
    }

    @Override
    public List o(long j10) {
        if (j10 >= 0) {
            return (List) this.f279b;
        }
        return Collections.EMPTY_LIST;
    }

    @Override
    public void onAudioSessionIdChanged(int i10) {
        qf.b bVar = ((FfmpegAudioRenderer) this.f279b).I;
        Handler handler = (Handler) bVar.f43097b;
        if (handler != null) {
            handler.post(new ah.g(bVar, i10, 13));
        }
    }

    @Override
    public void onPostMessage(android.webkit.WebView r8, java.lang.reflect.InvocationHandler r9, android.net.Uri r10, boolean r11, java.lang.reflect.InvocationHandler r12) {
        throw new UnsupportedOperationException("Method not decompiled: a4.l.onPostMessage(android.webkit.WebView, java.lang.reflect.InvocationHandler, android.net.Uri, boolean, java.lang.reflect.InvocationHandler):void");
    }

    @Override
    public void onSkipSilenceEnabledChanged(boolean z10) {
        qf.b bVar = ((FfmpegAudioRenderer) this.f279b).I;
        Handler handler = (Handler) bVar.f43097b;
        if (handler != null) {
            handler.post(new ah.t(9, bVar, z10));
        }
    }

    @Override
    public void onSuccess(Object obj) {
        ((d6.a) this.f279b).getClass();
        j5.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    @Override
    public void p() {
        boolean z10;
        gi.s sVar = (gi.s) this.f279b;
        ne.b bVar = sVar.f10249a;
        gi.t0 t0Var = sVar.v;
        if (t0Var.f10268n && t0Var.f10266l == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        bVar.a(z10, true);
        sVar.d.W2.N(true);
    }

    @Override
    public void q(h1 h1Var, int i10, int i11) {
        d3 d3Var;
        o9 textSelectionHelper;
        u5 u5Var = (u5) this.f279b;
        if (!u5Var.G && i10 != i11 && (d3Var = u5Var.E) != null && (textSelectionHelper = d3Var.f13235a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.x() || textSelectionHelper.W != u5Var) {
                u5Var.post(new x4(this, h1Var, i11, textSelectionHelper, i10, 4));
            }
        }
    }

    @Override
    public void s(int i10) {
        k6.a aVar;
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.f279b;
        Lock lock = xVar.f5063o;
        lock.lock();
        try {
            if (!xVar.f5062n && (aVar = xVar.f5061m) != null && aVar.c()) {
                xVar.f5062n = true;
                xVar.e.onConnectionSuspended(i10);
                lock.unlock();
            }
            xVar.f5062n = false;
            com.google.android.gms.common.api.internal.x.k(xVar, i10);
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override
    public void t(int i10, long j10, long j11) {
        qf.b bVar = ((FfmpegAudioRenderer) this.f279b).I;
        Handler handler = (Handler) bVar.f43097b;
        if (handler != null) {
            handler.post(new k2.s(bVar, i10, j10, j11, 0));
        }
    }

    @Override
    public int u() {
        return 1;
    }

    @Override
    public void v(Bundle bundle) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.f279b;
        xVar.f5063o.lock();
        try {
            Bundle bundle2 = xVar.f5059k;
            if (bundle2 == null) {
                xVar.f5059k = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            xVar.f5060l = k6.a.e;
            com.google.android.gms.common.api.internal.x.l(xVar);
        } finally {
            xVar.f5063o.unlock();
        }
    }

    @Override
    public void w() {
        x2.n nVar;
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.f279b;
        synchronized (ffmpegAudioRenderer.f10919a) {
            nVar = ffmpegAudioRenderer.H;
        }
        if (nVar != null) {
            nVar.m();
        }
    }

    @Override
    public void x(Exception exc) {
        e2.a.d("DecoderAudioRenderer", "Audio sink error", exc);
        qf.b bVar = ((FfmpegAudioRenderer) this.f279b).I;
        Handler handler = (Handler) bVar.f43097b;
        if (handler != null) {
            handler.post(new k2.q(bVar, exc, 1));
        }
    }

    @Override
    public void y(CharSequence charSequence) {
        d3 d3Var = ((u5) this.f279b).E;
        if (d3Var != null && charSequence != null && charSequence.length() > 0) {
            d3Var.f13235a.u4(charSequence.toString());
        }
    }

    public l(Object obj, int i10) {
        this.f278a = i10;
        this.f279b = obj;
    }

    public l(int i10) {
        this.f278a = i10;
        switch (i10) {
            case 9:
                this.f279b = new e2.x(10);
                return;
            case 10:
                return;
            case 12:
                this.f279b = Collections.newSetFromMap(new WeakHashMap());
                return;
            case 24:
                this.f279b = new a6.m();
                return;
            case 25:
                this.f279b = new HashMap();
                return;
            default:
                this.f279b = new n4.s[ag.b.values().length];
                return;
        }
    }

    public l(LaunchActivity launchActivity, Executor executor, v7.l lVar) {
        this.f278a = 4;
        if (launchActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor != null) {
            j0 s10 = launchActivity.s();
            z zVar = (z) new androidx.biometric.e(launchActivity).k(z.class);
            this.f279b = s10;
            zVar.d = executor;
            zVar.e = lVar;
            return;
        }
        throw new IllegalArgumentException("Executor must not be null.");
    }

    @Override
    public void G() {
    }

    @Override
    public void h0() {
    }

    @Override
    public void i() {
    }

    @Override
    public void r() {
    }

    @Override
    public void I(boolean z10) {
    }

    @Override
    public void d0(boolean z10) {
    }

    @Override
    public void z(h1 h1Var) {
    }
}
