package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebResourceResponse;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.net.HttpURLConnection;
import java.net.IDN;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;
public abstract class qw0 extends FrameLayout implements jm7, vlb {
    public static boolean R0 = true;
    public static int S0;
    public static HashMap T0;
    public float A0;
    public int B0;
    public boolean C0;
    public int D0;
    public int E;
    public Runnable E0;
    public int F;
    public boolean F0;
    public String G;
    public rwc G0;
    public String H;
    public String H0;
    public int I;
    public final Rect I0;
    public int J;
    public int J0;
    public String K;
    public ow0 K0;
    public String L;
    public final bv0 L0;
    public String M;
    public int M0;
    public int N;
    public int N0;
    public boolean O;
    public long O0;
    public boolean P;
    public final int P0;
    public long Q;
    public nac Q0;
    public long R;
    public boolean S;
    public boolean T;
    public boolean U;
    public TLRPC.User V;
    public op6 W;
    public mw0 a;
    public Activity a0;
    public String b;
    public boolean b0;
    public uv0 c;
    public String c0;
    public pw0 d;
    public he d0;
    public final ylb e;
    public int e0;
    public final TextView f;
    public long f0;
    public long g0;
    public boolean h;
    public hb1 h0;
    public boolean i0;
    public String j0;
    public up0 k0;
    public tr0 l0;
    public mq0 m0;
    public final ef1 n;
    public ou0 n0;
    public ou0 o0;
    public final boolean p0;
    public int q0;
    public meb r;
    public boolean r0;
    public final kc0 s;
    public BotWebViewContainer$BotWebViewProxy s0;
    public long t0;
    public boolean u0;
    public BotWebViewContainer$WebViewProxy v0;
    public boolean w;
    public mw0 w0;
    public gu2 x;
    public int x0;
    public ValueCallback y;
    public boolean y0;
    public boolean z0;

    public qw0(int i, ylb ylbVar, Context context, boolean z) {
        super(context);
        ef1 ef1Var = new ef1();
        this.n = ef1Var;
        int i2 = cmb.Ei;
        this.E = h(i2);
        int i3 = cmb.Ii;
        this.F = h(i3);
        this.G = "";
        this.I = h(i2);
        this.J = h(i3);
        this.K = "";
        this.L = "";
        this.N = z8c.t0;
        this.B0 = -1;
        this.I0 = new Rect(0, 0, 0, 0);
        this.J0 = 0;
        this.L0 = new bv0(this, (byte) 2);
        this.M0 = -1;
        this.N0 = 0;
        int i4 = S0;
        S0 = i4 + 1;
        this.P0 = i4;
        this.p0 = z;
        this.e = ylbVar;
        e("created new webview container");
        if (context instanceof Activity) {
            this.a0 = (Activity) context;
        }
        ef1Var.k = false;
        ef1Var.b(i, 153);
        kc0 kc0Var = new kc0(this, context);
        this.s = kc0Var;
        int h = h(cmb.Aj);
        this.q0 = h;
        kc0Var.setColorFilter(new PorterDuffColorFilter(h, PorterDuff.Mode.SRC_IN));
        kc0Var.getImageReceiver().S0 = true;
        addView(kc0Var, qoe.e(-1, -2, 48));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setText(jb6.M0(2131752866, null));
        anb.X(textView, cmb.x6, ylbVar);
        textView.setTextSize(1, 15.0f);
        textView.setGravity(17);
        textView.setVisibility(8);
        int L = gm.L(16.0f);
        textView.setPadding(L, L, L, L);
        addView(textView, qoe.e(-1, -2, 17));
        setFocusable(false);
    }

    public static WebResourceResponse K(String str, String str2, Map map) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(l11.x(Uri.parse(str2), "https", null, Q(gm.J0(str2, false)), null)).openConnection();
            httpURLConnection.setRequestMethod(str);
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            httpURLConnection.connect();
            return new WebResourceResponse(httpURLConnection.getContentType().split(";", 2)[0], httpURLConnection.getContentEncoding(), httpURLConnection.getInputStream());
        } catch (Exception e) {
            fc4.g(e, true);
            return null;
        }
    }

    public static String Q(String str) {
        try {
            str = IDN.toASCII(str, 1);
        } catch (Exception e) {
            fc4.g(e, true);
        }
        String[] split = str.split("\\.");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            if (i > 0) {
                sb.append("-d");
            }
            sb.append(split[i].replaceAll("\\-", "-h"));
        }
        sb.append(".");
        sb.append(oc7.r1(z8c.t0).l4.t2.f);
        return sb.toString();
    }

    public static String X(String str) {
        if (str == null) {
            return str;
        }
        if (n(Uri.parse(str))) {
            String J0 = gm.J0(str, false);
            try {
                J0 = IDN.toASCII(J0, 1);
            } catch (Exception unused) {
            }
            String Q = Q(J0);
            HashMap hashMap = T0;
            if (hashMap == null) {
                hashMap = new HashMap();
                T0 = hashMap;
            }
            hashMap.put(Q, J0);
            return l11.x(Uri.parse(str), "https", null, Q, null);
        }
        return str;
    }

    public static String i(String str) {
        if (str != null && !str.isEmpty()) {
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String host = parse.getHost();
            int port = parse.getPort();
            if (scheme != null && host != null) {
                StringBuilder p = wi8.p(scheme, "://", host);
                if (port != -1 && ((!scheme.equalsIgnoreCase("http") || port != 80) && (!scheme.equalsIgnoreCase("https") || port != 443))) {
                    p.append(":");
                    p.append(port);
                }
                return p.toString();
            }
        }
        return null;
    }

    public static boolean n(Uri uri) {
        if ("tonsite".equals(uri.getScheme())) {
            return true;
        }
        String authority = uri.getAuthority();
        if (authority == null && uri.getScheme() == null) {
            authority = Uri.parse("http://" + uri.toString()).getAuthority();
        }
        if (authority != null) {
            if (authority.endsWith(".ton") || authority.endsWith(".adnl")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static String r(String str) {
        String str2;
        if (T0 == null || str == null) {
            return str;
        }
        String J0 = gm.J0(str, false);
        if (J0 != null) {
            if (J0.endsWith("." + oc7.r1(z8c.t0).l4.t2.f) && (str2 = (String) T0.get(J0)) != null) {
                return l11.x(Uri.parse(str), "tonsite", null, str2, null);
            }
            return str;
        }
        return str;
    }

    private void setupFlickerParams(boolean z) {
        int i;
        this.w = z;
        kc0 kc0Var = this.s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kc0Var.getLayoutParams();
        if (z) {
            i = 17;
        } else {
            i = 48;
        }
        layoutParams.gravity = i;
        if (z) {
            int L = gm.L(100.0f);
            layoutParams.height = L;
            layoutParams.width = L;
        } else {
            layoutParams.width = -1;
            layoutParams.height = -2;
        }
        kc0Var.requestLayout();
    }

    private void setupWebView(mw0 mw0Var) {
        V(mw0Var, null);
    }

    public static void t(int i, mw0 mw0Var, ow0 ow0Var, String str, JSONObject jSONObject) {
        if (mw0Var == null) {
            return;
        }
        nm7.f(i).d(new l97(mw0Var, ow0Var, str, jSONObject, (byte) 15));
    }

    public static JSONObject x(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, obj);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static JSONObject y(String str, Object obj, String str2, Object obj2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, obj);
            jSONObject.put(str2, obj2);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static JSONObject z(String str, Object obj, String str2, Object obj2, String str3, Object obj3, String str4, Object obj4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, obj);
            jSONObject.put(str2, obj2);
            jSONObject.put(str3, obj3);
            jSONObject.put(str4, obj4);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public final boolean A() {
        if (this.a != null && this.S) {
            v("back_button_pressed", null);
            return true;
        }
        return false;
    }

    public final void C(org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy r57, final defpackage.ow0 r58, java.lang.String r59, java.lang.String r60) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qw0.C(org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy, ow0, java.lang.String, java.lang.String):void");
    }

    public final void D(String str, String str2, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("slug", str);
            jSONObject.put("status", str2);
            v("invoice_closed", jSONObject);
            fc4.b("invoice_closed " + jSONObject);
            if (!z && Objects.equals(this.c0, str)) {
                this.c0 = null;
            }
        } catch (JSONException e) {
            fc4.g(e, true);
        }
    }

    public final void E(Uri uri, String str, boolean z, boolean z2, boolean z3) {
        if (System.currentTimeMillis() - this.Q > 10000 && z2) {
            return;
        }
        this.Q = 0L;
        boolean[] zArr = {false};
        if (l11.g(uri, false, zArr) && !zArr[0] && this.c != null) {
            setKeyboardFocusable(false);
        }
        l11.t(getContext(), uri, true, z, false, null, str, false, true, z3, false);
    }

    public abstract void H(mw0 mw0Var);

    public final void J() {
        e("preserveWebView");
        this.C0 = true;
        if (this.p0) {
            v("visibility_changed", x(Boolean.FALSE, "is_visible"));
            this.t0++;
        }
        mw0 mw0Var = this.a;
        if (mw0Var != null) {
            mw0Var.f(null, null);
            this.a.setCloseListener(null);
        }
        BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = this.s0;
        if (botWebViewContainer$BotWebViewProxy != null) {
            botWebViewContainer$BotWebViewProxy.a = null;
        }
        BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = this.v0;
        if (botWebViewContainer$WebViewProxy != null) {
            botWebViewContainer$WebViewProxy.a = null;
        }
    }

    public final void L(int i, mw0 mw0Var, Object obj, String str, boolean z) {
        String str2;
        this.N = i;
        this.C0 = false;
        boolean z2 = this.p0;
        if (z2) {
            this.t0++;
            this.u0 = z;
            if (z) {
                str2 = i(str);
            } else {
                str2 = null;
            }
            this.H0 = str2;
        }
        V(mw0Var, obj);
        if (z2) {
            v("visibility_changed", x(Boolean.TRUE, "is_visible"));
        }
    }

    public final void M(int i, boolean z) {
        if (!z && i == this.J0) {
            return;
        }
        v("content_safe_area_changed", z("left", 0, "top", Float.valueOf(i / gm.p), "right", 0, "bottom", 0));
        this.J0 = i;
    }

    public final void N(Rect rect, boolean z) {
        if (rect != null) {
            Rect rect2 = this.I0;
            if (z || !rect2.equals(rect)) {
                v("safe_area_changed", z("left", Float.valueOf(rect.left / gm.p), "top", Float.valueOf(rect.top / gm.p), "right", Float.valueOf(rect.right / gm.p), "bottom", Float.valueOf(rect.bottom / gm.p)));
                rect2.set(rect);
            }
        }
    }

    public final void O() {
        try {
            if (this.H != null) {
                C(this.s0, d(), "web_app_setup_main_button", this.H);
            }
            if (this.M != null) {
                C(this.s0, d(), "web_app_setup_secondary_button", this.M);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void P(ow0 ow0Var, ou0 ou0Var, String str) {
        ylb ylbVar;
        boolean z;
        boolean z2;
        if (ou0Var != null && this.V != null) {
            boolean z3 = true;
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("req_id");
                try {
                    String optString = jSONObject.optString("key");
                    if (optString == null) {
                        u(ow0Var, "secure_storage_failed", y("req_id", string, "error", "KEY_INVALID"));
                        return;
                    }
                    try {
                        ArrayList h = ou0Var.h(optString);
                        if (h.isEmpty()) {
                            u(ow0Var, "secure_storage_failed", y("req_id", string, "error", "RESTORE_UNAVAILABLE"));
                            return;
                        }
                        Context context = getContext();
                        hv0 hv0Var = new hv0(this, ow0Var, string, ou0Var, optString);
                        d S = LaunchActivity.S();
                        if (S != null) {
                            ylbVar = S.getResourceProvider();
                        } else {
                            ylbVar = null;
                        }
                        String[] strArr = new String[1];
                        boolean[] zArr = new boolean[1];
                        my0 h2 = hg9.h(1, ylbVar, context, false);
                        LinearLayout i = hg9.i(context, 1);
                        bf0 bf0Var = new bf0(context);
                        TLRPC.User W1 = oc7.r1(ou0Var.a).W1(Long.valueOf(ou0Var.b));
                        pc0 pc0Var = new pc0((ylb) null);
                        pc0Var.q(W1);
                        bf0Var.f(W1, pc0Var);
                        i.addView(bf0Var, qoe.t(80, 80, 49, 0, 21, 0, 13));
                        int i2 = cmb.F6;
                        TextView b = jxe.b(context, 20.0f, i2, true, null);
                        b.setText(jb6.M0(2131752943, null));
                        b.setGravity(17);
                        i.addView(b, qoe.t(-1, -2, 7, 32, 0, 32, 10));
                        TextView b2 = jxe.b(context, 14.0f, i2, false, null);
                        hg9.q(null, null, 2131752944, new Object[]{pg3.G(null, null, W1)}, b2);
                        b2.setGravity(17);
                        i.addView(b2, qoe.t(-1, -2, 7, 32, 0, 32, 19));
                        njb njbVar = new njb(context, ylbVar);
                        int i3 = -1;
                        ColorDrawable colorDrawable = new ColorDrawable(-1);
                        njbVar.setBackground(new sn2(colorDrawable, cmb.V0(context, 2131231233, cmb.v0(cmb.a7, ylbVar))));
                        anb.x(njbVar, colorDrawable, cmb.Z6, ylbVar, PorterDuff.Mode.SRC_IN);
                        njbVar.setFixedSize(12);
                        i.addView(njbVar, qoe.t(-1, 12, 7, 0, 0, 0, 0));
                        jf5 jf5Var = new jf5(context, ylbVar);
                        jf5Var.setText(jb6.M0(2131752945, null));
                        i.addView(jf5Var, qoe.t(-1, -2, 7, 0, 0, 0, 0));
                        b61 b61Var = new b61(ylbVar, context, true);
                        ArrayList arrayList = new ArrayList();
                        int i4 = 0;
                        while (i4 < h.size()) {
                            nu0 nu0Var = (nu0) h.get(i4);
                            boolean z4 = z3;
                            if (i4 < h.size() - 1) {
                                z2 = z4;
                            } else {
                                z2 = false;
                            }
                            mu0 mu0Var = new mu0(nu0Var, z2, context);
                            int i5 = cmb.h6;
                            hv0 hv0Var2 = hv0Var;
                            fg0 f0 = cmb.f0(cmb.v0(i5, ylbVar), 2, i3);
                            wmb M = anb.M(i5);
                            mu0Var.setBackground(f0);
                            anb.j(mu0Var, f0, null, M, ylbVar);
                            int i6 = i3;
                            mu0Var.setOnClickListener(new ef(strArr, nu0Var, arrayList, b61Var, (byte) 5));
                            i.addView(mu0Var, qoe.o(i6, 56));
                            arrayList.add(mu0Var);
                            i4++;
                            hv0Var = hv0Var2;
                            i3 = i6;
                            z3 = z4;
                        }
                        hv0 hv0Var3 = hv0Var;
                        b61Var.i(jb6.M0(2131752947, null), false, z3);
                        if (strArr[0] != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        b61Var.setEnabled(z);
                        i.addView(b61Var, qoe.t(-1, 48, 7, 8, 8, 8, 4));
                        h2.O = i;
                        h2.L(cmb.g5);
                        b61Var.setOnClickListener(new ef(zArr, hv0Var3, strArr, h2, (byte) 6));
                        h2.setOnDismissListener(new dg(zArr, hv0Var3, (byte) 6));
                        h2.show();
                    } catch (Exception e) {
                        u(ow0Var, "secure_storage_failed", y("req_id", string, "error", e.getMessage()));
                    }
                } catch (Exception unused) {
                    u(ow0Var, "secure_storage_failed", y("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e2) {
                fc4.g(e2, true);
            }
        }
    }

    public final void R(String[] strArr, gu2 gu2Var) {
        for (String str : strArr) {
            if (getContext().checkSelfPermission(str) != 0) {
                this.W = new op6(this, gu2Var, strArr, (byte) 29);
                Activity activity = this.a0;
                if (activity != null) {
                    activity.requestPermissions(strArr, 4000);
                    return;
                }
                return;
            }
        }
        gu2Var.accept(Boolean.TRUE);
    }

    public void S(String str, boolean z) {
        boolean z2;
        boolean z3;
        mw0 mw0Var = this.a;
        if (mw0Var != null && mw0Var.canGoBack()) {
            z2 = false;
        } else {
            z2 = true;
        }
        mw0 mw0Var2 = this.a;
        if (mw0Var2 != null && mw0Var2.canGoForward()) {
            z3 = false;
        } else {
            z3 = true;
        }
        G(z2, z3);
        mw0 mw0Var3 = this.a;
        if (mw0Var3 != null) {
            mw0Var3.b = true;
        }
        if (this.O) {
            e("setPageLoaded: already loaded");
            return;
        }
        kc0 kc0Var = this.s;
        if (z && mw0Var3 != null && kc0Var != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.a, property, 1.0f), ObjectAnimator.ofFloat(kc0Var, property, 0.0f));
            animatorSet.addListener(new g0(this, (byte) 26));
            animatorSet.start();
        } else {
            if (mw0Var3 != null) {
                mw0Var3.setAlpha(1.0f);
            }
            if (kc0Var != null) {
                kc0Var.setAlpha(0.0f);
                kc0Var.setVisibility(8);
            }
        }
        this.b = str;
        e("setPageLoaded: isPageLoaded = true!");
        this.O = true;
        this.c.getClass();
    }

    public final void T(ow0 ow0Var, ou0 ou0Var, String str, String str2, String str3) {
        if (ou0Var != null && this.V != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("req_id");
                try {
                    String optString = jSONObject.optString("key");
                    if (optString == null) {
                        u(ow0Var, str3, y("req_id", string, "error", "KEY_INVALID"));
                        return;
                    }
                    try {
                        try {
                            ou0Var.n(optString, jSONObject.optString("value"));
                            u(ow0Var, str2, x(string, "req_id"));
                        } catch (RuntimeException e) {
                            u(ow0Var, str3, y("req_id", string, "error", e.getMessage()));
                        }
                    } catch (Exception unused) {
                        u(ow0Var, str3, y("req_id", string, "error", "VALUE_INVALID"));
                    }
                } catch (Exception unused2) {
                    u(ow0Var, str3, y("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e2) {
                fc4.g(e2, true);
            }
        }
    }

    public final void U() {
        mw0 mw0Var = this.a;
        if (mw0Var != null && this.p0) {
            mw0Var.removeJavascriptInterface("TelegramWebviewProxy");
            if (!nwc.a("WEB_MESSAGE_LISTENER")) {
                e("Bot WebMessageListener is unsupported; native bridge disabled");
                return;
            }
            Set singleton = Collections.singleton("*");
            mw0 mw0Var2 = this.a;
            if (!mw0Var2.S) {
                kwc.a(mw0Var2, "TelegramWebviewProxyMessage", singleton, new xg0(mw0Var2, (byte) 15));
                this.a.S = true;
            }
            if (nwc.a("DOCUMENT_START_SCRIPT")) {
                mw0 mw0Var3 = this.a;
                if (mw0Var3.T == null) {
                    boolean z = kwc.a;
                    if (nwc.d.b()) {
                        mw0Var3.T = new cf9((ScriptHandlerBoundaryInterface) oz0.a(ScriptHandlerBoundaryInterface.class, kwc.c(mw0Var3).a.addDocumentStartJavaScript("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};", (String[]) singleton.toArray(new String[0]))), (byte) 4);
                        return;
                    }
                    rjb.j("This method is not supported by the current version of the framework and the current WebView APK");
                }
            }
        }
    }

    public final void V(defpackage.mw0 r12, java.lang.Object r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qw0.V(mw0, java.lang.Object):void");
    }

    public final void W(int i, he heVar, Runnable runnable) {
        if (heVar != null && !k(i)) {
            heVar.setOnDismissListener(new dg(this, runnable, (byte) 7));
            this.d0 = heVar;
            heVar.k0 = false;
            heVar.show();
            if (this.M0 != i) {
                this.M0 = i;
                this.N0 = 0;
                this.O0 = 0L;
            }
            this.N0++;
        }
    }

    public final void Y(String str) {
        String str2;
        String M0 = jb6.M0(2131743566, "UnknownError");
        if (str != null) {
            str2 = ": ".concat(str);
        } else {
            str2 = "";
        }
        g(M0.concat(str2));
    }

    public final void a() {
        if (this.a == null && !this.h) {
            try {
                setupWebView(null);
            } catch (Throwable th) {
                fc4.g(th, true);
                this.s.setVisibility(8);
                this.h = true;
                this.f.setVisibility(0);
                mw0 mw0Var = this.a;
                if (mw0Var != null) {
                    removeView(mw0Var);
                }
            }
        }
    }

    public final void b(ow0 ow0Var, ou0 ou0Var, String str, String str2, String str3) {
        if (ou0Var != null && this.V != null) {
            try {
                String string = new JSONObject(str).getString("req_id");
                try {
                    ou0Var.m(new JSONObject());
                    u(ow0Var, str2, x(string, "req_id"));
                } catch (RuntimeException e) {
                    u(ow0Var, str3, y("req_id", string, "error", e.getMessage()));
                }
            } catch (Exception e2) {
                fc4.g(e2, true);
            }
        }
    }

    public final void c() {
        if (this.V == null) {
            return;
        }
        up0 up0Var = this.k0;
        if (up0Var == null) {
            this.k0 = up0.b(getContext(), this.N, this.V.id);
        } else {
            up0Var.f();
        }
    }

    public final ow0 d() {
        mw0 mw0Var = this.a;
        long j = this.t0;
        boolean z = this.u0;
        String str = this.H0;
        ?? obj = new Object();
        obj.c = this;
        obj.d = mw0Var;
        obj.a = j;
        obj.b = z;
        obj.e = str;
        return obj;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        op6 op6Var;
        Uri[] uriArr;
        if (i == nm7.r4) {
            mw0 mw0Var = this.a;
            if (mw0Var != null) {
                mw0Var.setBackgroundColor(h(cmb.c6));
            }
            if (!this.r0) {
                int i3 = cmb.Aj;
                int h = h(i3);
                this.q0 = h;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(h, PorterDuff.Mode.SRC_IN);
                kc0 kc0Var = this.s;
                kc0Var.setColorFilter(porterDuffColorFilter);
                meb mebVar = this.r;
                if (mebVar != null) {
                    mebVar.n = Integer.valueOf(this.q0);
                    this.r.e(i3, this.e, 1.0f, false);
                }
                kc0Var.invalidate();
            }
            w();
        } else if (i == nm7.g5) {
            int intValue = ((Integer) objArr[0]).intValue();
            int intValue2 = ((Integer) objArr[1]).intValue();
            Intent intent = (Intent) objArr[2];
            if (intValue == 3000 && this.y != null) {
                if (intValue2 == -1 && intent != null) {
                    if (intent.getClipData() != null) {
                        ClipData clipData = intent.getClipData();
                        uriArr = new Uri[clipData.getItemCount()];
                        for (int i4 = 0; i4 < clipData.getItemCount(); i4++) {
                            uriArr[i4] = clipData.getItemAt(i4).getUri();
                        }
                    } else if (intent.getData() != null) {
                        uriArr = new Uri[]{intent.getData()};
                    }
                    this.y.onReceiveValue(uriArr);
                    this.y = null;
                }
                uriArr = null;
                this.y.onReceiveValue(uriArr);
                this.y = null;
            }
        } else if (i == nm7.h5) {
            int intValue3 = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue3 == 4000 && (op6Var = this.W) != null) {
                op6Var.run();
                this.W = null;
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.s) {
            if (this.w) {
                canvas.save();
                canvas.translate(0.0f, (a.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            }
            boolean drawChild = super.drawChild(canvas, view, j);
            if (this.w) {
                canvas.restore();
            }
            if (!this.w) {
                RectF rectF = gm.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                this.n.a(0.0f, canvas, rectF, this);
                invalidate();
            }
            return drawChild;
        } else if (view == this.f) {
            canvas.save();
            canvas.translate(0.0f, (a.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            boolean drawChild2 = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild2;
        } else {
            if (view == this.a) {
                if (!gm.m0) {
                    if (getLayerType() == 2 && !canvas.isHardwareAccelerated()) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
            return super.drawChild(canvas, view, j);
        }
    }

    public final void e(String str) {
        fc4.b("[webviewcontainer] #" + this.P0 + " " + str);
    }

    public final void f() {
        e("destroyWebView preserving=" + this.C0);
        mw0 mw0Var = this.a;
        if (mw0Var != null) {
            if (mw0Var.getParent() != null) {
                removeView(this.a);
            }
            if (!this.C0) {
                this.a.destroy();
                I(this.a);
            }
            this.O = false;
            if (this.k0 != null) {
                this.k0 = null;
            }
            if (this.n0 != null) {
                this.n0 = null;
            }
            if (this.o0 != null) {
                this.o0 = null;
            }
            tr0 tr0Var = this.l0;
            if (tr0Var != null) {
                tr0Var.f.remove(this.L0);
                this.l0 = null;
                this.K0 = null;
            }
        }
    }

    public final void g(String str) {
        new c41(this, this.e).Q(2131624012, 36, str).j();
    }

    public BotWebViewContainer$BotWebViewProxy getBotProxy() {
        return this.s0;
    }

    public int getMinHeight() {
        if (getParent() instanceof d32) {
            d32 d32Var = (d32) getParent();
            if (d32Var.K) {
                return (int) ((d32Var.getMeasuredHeight() - d32Var.getOffsetY()) + this.A0);
            }
            return 0;
        }
        return 0;
    }

    public String getOriginHost() {
        mw0 mw0Var = this.a;
        if (mw0Var == null) {
            return null;
        }
        return i(mw0Var.getUrl());
    }

    public BotWebViewContainer$WebViewProxy getProxy() {
        return this.v0;
    }

    public String getTrustedOrigin() {
        return this.H0;
    }

    public String getUrlLoaded() {
        return this.b;
    }

    public mw0 getWebView() {
        return this.a;
    }

    public final int h(int i) {
        ylb ylbVar = this.e;
        if (ylbVar != null) {
            return ylbVar.h(i);
        }
        return cmb.w0(null, i, false);
    }

    public final void j(ow0 ow0Var, ou0 ou0Var, String str, String str2, String str3) {
        Object obj;
        JSONObject jSONObject;
        if (ou0Var != null && this.V != null) {
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                String string = jSONObject2.getString("req_id");
                try {
                    String optString = jSONObject2.optString("key");
                    if (optString == null) {
                        u(ow0Var, str3, y("req_id", string, "error", "KEY_INVALID"));
                        return;
                    }
                    try {
                        Pair f = ou0Var.f(optString);
                        if (ou0Var.d && (obj = f.first) == null) {
                            Object obj2 = f.second;
                            try {
                                jSONObject = new JSONObject();
                                jSONObject.put("req_id", string);
                                jSONObject.put("value", obj);
                                jSONObject.put("can_restore", obj2);
                            } catch (Exception unused) {
                                jSONObject = null;
                            }
                            u(ow0Var, str2, jSONObject);
                            return;
                        }
                        u(ow0Var, str2, y("req_id", string, "value", f.first));
                    } catch (RuntimeException e) {
                        u(ow0Var, str3, y("req_id", string, "error", e.getMessage()));
                    }
                } catch (Exception unused2) {
                    u(ow0Var, str3, y("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e2) {
                fc4.g(e2, true);
            }
        }
    }

    public final boolean k(int i) {
        if (this.d0 != null || (this.O0 > 0 && System.currentTimeMillis() < this.O0)) {
            return true;
        }
        if (this.M0 != i || this.N0 <= 3) {
            return false;
        }
        this.O0 = System.currentTimeMillis() + 3000;
        this.N0 = 0;
        return true;
    }

    public final void l(boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        invalidate();
        if ((this.O || z2) && (z3 = this.p0) && (getParent() instanceof d32)) {
            d32 d32Var = (d32) getParent();
            if (z) {
                if (d32Var.getSwipeOffsetY() == d32Var.getTopActionBarOffsetY() + (-d32Var.getOffsetY())) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.P = z4;
            }
            int max = Math.max(getMinHeight(), (int) (d32Var.getTopActionBarOffsetY() + ((d32Var.getMeasuredHeight() - d32Var.getOffsetY()) - d32Var.getSwipeOffsetY()) + this.A0));
            if (z2 || max != this.x0 || this.y0 != z || this.z0 != this.P) {
                this.x0 = max;
                this.y0 = z;
                this.z0 = this.P;
                String str = "{height:" + (max / gm.p) + ",is_state_stable:" + z + ",is_expanded:" + this.P + "}";
                if (z3 && !o()) {
                    e("notifyEvent viewport_changed dropped for untrusted document");
                } else {
                    nm7.f(this.N).d(new mv0(this, kt6.o("window.Telegram.WebView.receiveEvent('viewport_changed', ", str, ");"), (byte) 0));
                }
            }
        }
    }

    public final boolean m(ow0 ow0Var) {
        boolean z;
        if (ow0Var != null) {
            String str = (String) ow0Var.e;
            if (((qw0) ow0Var.c) == this && ((mw0) ow0Var.d) == this.a && ow0Var.a == this.t0 && (z = ow0Var.b) == this.u0) {
                if (z) {
                    if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.H0) && TextUtils.equals(str, getOriginHost())) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean o() {
        if (this.a == null) {
            return false;
        }
        if (this.u0) {
            if (TextUtils.isEmpty(this.H0) || !TextUtils.equals(this.H0, getOriginHost())) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e("attached");
        nm7.e().b(this, nm7.r4);
        nm7.e().b(this, nm7.g5);
        nm7.e().b(this, nm7.h5);
        setTag(2131296353, new s20(this, (byte) 1));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e("detached");
        nm7.e().n(this, nm7.r4);
        nm7.e().n(this, nm7.g5);
        nm7.e().n(this, nm7.h5);
        setTag(2131296353, null);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3 = this.B0;
        if (i3 >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
        this.n.f = getMeasuredWidth();
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (!this.b0) {
            l(true, false);
        }
    }

    public final void p(int i, long j) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon;
        TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(j));
        TLRPC.UserFull X1 = oc7.r1(i).X1(j);
        String p = m9c.p(W1);
        kc0 kc0Var = this.s;
        if (p != null && p.equals("DurgerKingBot")) {
            kc0Var.setVisibility(0);
            kc0Var.setAlpha(1.0f);
            kc0Var.o(null, null, neb.g(2131624006, Integer.valueOf(h(cmb.Z6))));
            setupFlickerParams(false);
            return;
        }
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = hs6.d0(i).b.bots;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i2);
                i2++;
                tL_attachMenuBot = tL_attachMenuBot2;
                if (tL_attachMenuBot.bot_id == j) {
                    break;
                }
            } else {
                tL_attachMenuBot = null;
                break;
            }
        }
        boolean z = true;
        if (tL_attachMenuBot != null) {
            ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList2 = tL_attachMenuBot.icons;
            int size2 = arrayList2.size();
            int i3 = 0;
            while (true) {
                if (i3 < size2) {
                    TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon2 = arrayList2.get(i3);
                    i3++;
                    tL_attachMenuBotIcon = tL_attachMenuBotIcon2;
                    if (tL_attachMenuBotIcon.name.equals("placeholder_static")) {
                        break;
                    }
                } else {
                    tL_attachMenuBotIcon = null;
                    break;
                }
            }
            if (tL_attachMenuBotIcon == null) {
                tL_attachMenuBotIcon = hs6.l0(tL_attachMenuBot);
            } else {
                z = false;
            }
            if (tL_attachMenuBotIcon != null) {
                kc0Var.setVisibility(0);
                kc0Var.setAlpha(1.0f);
                kc0Var.m(gn5.b(tL_attachMenuBotIcon.icon), null, null, tL_attachMenuBot);
                setupFlickerParams(z);
                return;
            }
            return;
        }
        ylb ylbVar = this.e;
        if (X1 != null && (botInfo = X1.bot_info) != null && (botappsettings = botInfo.app_settings) != null && botappsettings.placeholder_svg_path != null) {
            kc0Var.setVisibility(0);
            kc0Var.setAlpha(1.0f);
            meb i4 = neb.i(512, 512, X1.bot_info.app_settings.placeholder_svg_path);
            this.r = i4;
            if (i4 != null) {
                i4.n = Integer.valueOf(this.q0);
                this.r.e(cmb.Aj, ylbVar, 1.0f, false);
            }
            kc0Var.o(null, null, this.r);
            setupFlickerParams(true);
            return;
        }
        Path path = new Path();
        RectF rectF = gm.P;
        rectF.set(106.66499f, 106.66499f, 240.355f, 240.355f);
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, 18.0f, 18.0f, direction);
        rectF.set(271.645f, 106.66499f, 405.335f, 240.355f);
        path.addRoundRect(rectF, 18.0f, 18.0f, direction);
        rectF.set(106.66499f, 271.645f, 240.355f, 405.335f);
        path.addRoundRect(rectF, 18.0f, 18.0f, direction);
        rectF.set(271.645f, 271.645f, 405.335f, 405.335f);
        path.addRoundRect(rectF, 18.0f, 18.0f, direction);
        kc0Var.setVisibility(0);
        kc0Var.setAlpha(1.0f);
        meb i5 = neb.i(512, 512, path);
        this.r = i5;
        if (i5 != null) {
            i5.n = Integer.valueOf(this.q0);
            this.r.e(cmb.Aj, ylbVar, 1.0f, false);
        }
        kc0Var.o(null, null, this.r);
        setupFlickerParams(true);
    }

    public final void q(int i, String str, boolean z) {
        String str2;
        this.N = i;
        if (this.p0) {
            this.t0++;
            this.u0 = z;
            if (z) {
                str2 = i(str);
            } else {
                str2 = null;
            }
            this.H0 = str2;
            if (this.a != null) {
                U();
            }
        }
        nm7.f(i).d(new mv0(this, str, (byte) 1));
    }

    public final void s(ow0 ow0Var) {
        if (this.V != null) {
            c();
            up0 up0Var = this.k0;
            if (up0Var == null) {
                return;
            }
            try {
                u(ow0Var, "biometry_info_received", up0Var.e());
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    public void setBotUser(TLRPC.User user) {
        this.V = user;
    }

    public void setDelegate(uv0 uv0Var) {
        this.c = uv0Var;
    }

    public void setFlickerViewColor(int i) {
        int a;
        if (gm.B(i) > 0.7f) {
            a = cmb.a(0.0f, -0.15f, i);
        } else {
            a = cmb.a(0.025f, 0.15f, i);
        }
        if (this.q0 == a) {
            return;
        }
        this.q0 = a;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(a, PorterDuff.Mode.SRC_IN);
        kc0 kc0Var = this.s;
        kc0Var.setColorFilter(porterDuffColorFilter);
        meb mebVar = this.r;
        if (mebVar != null) {
            mebVar.n = Integer.valueOf(this.q0);
            this.r.e(cmb.Aj, this.e, 1.0f, false);
        }
        this.r0 = true;
        kc0Var.invalidate();
        invalidate();
    }

    public void setForceHeight(int i) {
        if (this.B0 == i) {
            return;
        }
        this.B0 = i;
        requestLayout();
    }

    public void setIsBackButtonVisible(boolean z) {
        this.S = z;
    }

    public void setOnCloseRequestedListener(Runnable runnable) {
        this.E0 = runnable;
        mw0 mw0Var = this.a;
        if (mw0Var != null) {
            mw0Var.setCloseListener(runnable);
        }
    }

    public void setOnVerifiedAge(nac nacVar) {
        this.Q0 = nacVar;
    }

    public void setOpener(mw0 mw0Var) {
        mw0 mw0Var2;
        this.w0 = mw0Var;
        if (!this.p0 && (mw0Var2 = this.a) != null) {
            mw0Var2.f = mw0Var;
        }
    }

    public void setParentActivity(Activity activity) {
        this.a0 = activity;
    }

    public void setViewPortByMeasureSuppressed(boolean z) {
        this.b0 = z;
    }

    public void setViewPortHeightOffset(float f) {
        this.A0 = f;
    }

    public void setWasOpenedByBot(rwc rwcVar) {
        this.G0 = rwcVar;
    }

    public void setWasOpenedByLinkIntent(boolean z) {
        this.F0 = z;
    }

    public void setWebViewProgressListener(gu2 gu2Var) {
        this.x = gu2Var;
    }

    public void setWebViewScrollListener(pw0 pw0Var) {
        this.d = pw0Var;
        mw0 mw0Var = this.a;
        if (mw0Var != null) {
            mw0Var.f(this, pw0Var);
        }
    }

    public final void u(ow0 ow0Var, String str, JSONObject jSONObject) {
        if (!m(ow0Var)) {
            e("notifyEvent " + str + " dropped after document change");
            return;
        }
        v(str, jSONObject);
    }

    @Override
    public final void updateColors() {
        kc0 kc0Var;
        int h;
        try {
            if (this.a != null && (h = h(cmb.c6)) != this.D0) {
                this.D0 = h;
                this.a.setBackgroundColor(h);
            }
            if (!this.r0 && (kc0Var = this.s) != null) {
                int i = this.q0;
                int i2 = cmb.Aj;
                if (i != h(i2)) {
                    int h2 = h(i2);
                    this.q0 = h2;
                    kc0Var.setColorFilter(new PorterDuffColorFilter(h2, PorterDuff.Mode.SRC_IN));
                    meb mebVar = this.r;
                    if (mebVar != null) {
                        mebVar.n = Integer.valueOf(this.q0);
                    }
                    kc0Var.invalidate();
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void v(String str, JSONObject jSONObject) {
        if (this.p0 && !o()) {
            e("notifyEvent " + str + " dropped for untrusted document");
            return;
        }
        e("notifyEvent " + str);
        nm7.f(this.N).d(new mv0(this, "window.Telegram.WebView.receiveEvent('" + str + "', " + jSONObject + ");", (byte) 0));
    }

    public final void w() {
        JSONObject jSONObject;
        JSONObject u;
        try {
            u = wx0.u(this.e, true);
        } catch (Exception e) {
            fc4.g(e, true);
        }
        if (u != null) {
            jSONObject = new JSONObject().put("theme_params", u);
            v("theme_changed", jSONObject);
        }
        jSONObject = new JSONObject();
        v("theme_changed", jSONObject);
    }

    public void F() {
    }

    public void I(mw0 mw0Var) {
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setKeyboardFocusable(boolean z) {
    }

    public void B(boolean z, String str) {
    }

    public void G(boolean z, boolean z2) {
    }
}
