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
public abstract class hv0 extends FrameLayout implements gk7, tjb {
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
    public quc G0;
    public String H;
    public String H0;
    public int I;
    public final Rect I0;
    public int J;
    public int J0;
    public String K;
    public ev0 K0;
    public String L;
    public final st0 L0;
    public String M;
    public int M0;
    public int N;
    public int N0;
    public boolean O;
    public long O0;
    public boolean P;
    public final int P0;
    public long Q;
    public m8c Q0;
    public long R;
    public boolean S;
    public boolean T;
    public boolean U;
    public TLRPC.User V;
    public nn6 W;
    public cv0 a;
    public Activity a0;
    public String b;
    public boolean b0;
    public ku0 c;
    public String c0;
    public gv0 d;
    public hd d0;
    public final wjb e;
    public int e0;
    public final TextView f;
    public long f0;
    public long g0;
    public boolean h;
    public z91 h0;
    public boolean i0;
    public String j0;
    public uo0 k0;
    public tq0 l0;
    public mp0 m0;
    public final wd1 n;
    public gt0 n0;
    public gt0 o0;
    public final boolean p0;
    public int q0;
    public kcb r;
    public boolean r0;
    public final kb0 s;
    public BotWebViewContainer$BotWebViewProxy s0;
    public long t0;
    public boolean u0;
    public BotWebViewContainer$WebViewProxy v0;
    public boolean w;
    public cv0 w0;
    public vs2 x;
    public int x0;
    public ValueCallback y;
    public boolean y0;
    public boolean z0;

    public hv0(int i, wjb wjbVar, Context context, boolean z) {
        super(context);
        wd1 wd1Var = new wd1();
        this.n = wd1Var;
        int i2 = bkb.Ei;
        this.E = h(i2);
        int i3 = bkb.Ii;
        this.F = h(i3);
        this.G = "";
        this.I = h(i2);
        this.J = h(i3);
        this.K = "";
        this.L = "";
        this.N = y6c.t0;
        this.B0 = -1;
        this.I0 = new Rect(0, 0, 0, 0);
        this.J0 = 0;
        this.L0 = new st0(this, (byte) 2);
        this.M0 = -1;
        this.N0 = 0;
        int i4 = S0;
        S0 = i4 + 1;
        this.P0 = i4;
        this.p0 = z;
        this.e = wjbVar;
        e("created new webview container");
        if (context instanceof Activity) {
            this.a0 = (Activity) context;
        }
        wd1Var.k = false;
        wd1Var.b(i, 153);
        kb0 kb0Var = new kb0(this, context);
        this.s = kb0Var;
        int h = h(bkb.Aj);
        this.q0 = h;
        kb0Var.setColorFilter(new PorterDuffColorFilter(h, PorterDuff.Mode.SRC_IN));
        kb0Var.getImageReceiver().S0 = true;
        addView(kb0Var, nme.e(-1, -2, 48));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setText(k96.M0(2131752901, null));
        zkb.X(textView, bkb.x6, wjbVar);
        textView.setTextSize(1, 15.0f);
        textView.setGravity(17);
        textView.setVisibility(8);
        int L = gl.L(16.0f);
        textView.setPadding(L, L, L, L);
        addView(textView, nme.e(-1, -2, 17));
        setFocusable(false);
    }

    public static WebResourceResponse K(String str, String str2, Map map) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(d01.w(Uri.parse(str2), "https", null, Q(gl.J0(str2, false)), null)).openConnection();
            httpURLConnection.setRequestMethod(str);
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            httpURLConnection.connect();
            return new WebResourceResponse(httpURLConnection.getContentType().split(";", 2)[0], httpURLConnection.getContentEncoding(), httpURLConnection.getInputStream());
        } catch (Exception e) {
            fa4.g(e, true);
            return null;
        }
    }

    public static String Q(String str) {
        try {
            str = IDN.toASCII(str, 1);
        } catch (Exception e) {
            fa4.g(e, true);
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
        sb.append(na7.q1(y6c.t0).k4.t2.f);
        return sb.toString();
    }

    public static String X(String str) {
        if (str == null) {
            return str;
        }
        if (n(Uri.parse(str))) {
            String J0 = gl.J0(str, false);
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
            return d01.w(Uri.parse(str), "https", null, Q, null);
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
                StringBuilder p = ug8.p(scheme, "://", host);
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
        String J0 = gl.J0(str, false);
        if (J0 != null) {
            if (J0.endsWith("." + na7.q1(y6c.t0).k4.t2.f) && (str2 = (String) T0.get(J0)) != null) {
                return d01.w(Uri.parse(str), "tonsite", null, str2, null);
            }
            return str;
        }
        return str;
    }

    private void setupFlickerParams(boolean z) {
        int i;
        this.w = z;
        kb0 kb0Var = this.s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kb0Var.getLayoutParams();
        if (z) {
            i = 17;
        } else {
            i = 48;
        }
        layoutParams.gravity = i;
        if (z) {
            int L = gl.L(100.0f);
            layoutParams.height = L;
            layoutParams.width = L;
        } else {
            layoutParams.width = -1;
            layoutParams.height = -2;
        }
        kb0Var.requestLayout();
    }

    private void setupWebView(cv0 cv0Var) {
        V(cv0Var, null);
    }

    public static void t(int i, cv0 cv0Var, ev0 ev0Var, String str, JSONObject jSONObject) {
        if (cv0Var == null) {
            return;
        }
        kk7.f(i).d(new s67(cv0Var, ev0Var, str, jSONObject, (byte) 15));
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

    public final void C(org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy r57, final defpackage.ev0 r58, java.lang.String r59, java.lang.String r60) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv0.C(org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy, ev0, java.lang.String, java.lang.String):void");
    }

    public final void D(String str, String str2, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("slug", str);
            jSONObject.put("status", str2);
            v("invoice_closed", jSONObject);
            fa4.b("invoice_closed " + jSONObject);
            if (!z && Objects.equals(this.c0, str)) {
                this.c0 = null;
            }
        } catch (JSONException e) {
            fa4.g(e, true);
        }
    }

    public final void E(Uri uri, String str, boolean z, boolean z2, boolean z3) {
        if (System.currentTimeMillis() - this.Q > 10000 && z2) {
            return;
        }
        this.Q = 0L;
        boolean[] zArr = {false};
        if (d01.g(uri, false, zArr) && !zArr[0] && this.c != null) {
            setKeyboardFocusable(false);
        }
        d01.s(getContext(), uri, true, z, false, null, str, false, true, z3, false);
    }

    public abstract void H(cv0 cv0Var);

    public final void J() {
        e("preserveWebView");
        this.C0 = true;
        if (this.p0) {
            v("visibility_changed", x(Boolean.FALSE, "is_visible"));
            this.t0++;
        }
        cv0 cv0Var = this.a;
        if (cv0Var != null) {
            cv0Var.f(null, null);
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

    public final void L(int i, cv0 cv0Var, Object obj, String str, boolean z) {
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
        V(cv0Var, obj);
        if (z2) {
            v("visibility_changed", x(Boolean.TRUE, "is_visible"));
        }
    }

    public final void M(int i, boolean z) {
        if (!z && i == this.J0) {
            return;
        }
        v("content_safe_area_changed", z("left", 0, "top", Float.valueOf(i / gl.p), "right", 0, "bottom", 0));
        this.J0 = i;
    }

    public final void N(Rect rect, boolean z) {
        if (rect != null) {
            Rect rect2 = this.I0;
            if (z || !rect2.equals(rect)) {
                v("safe_area_changed", z("left", Float.valueOf(rect.left / gl.p), "top", Float.valueOf(rect.top / gl.p), "right", Float.valueOf(rect.right / gl.p), "bottom", Float.valueOf(rect.bottom / gl.p)));
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
            fa4.g(e, true);
        }
    }

    public final void P(ev0 ev0Var, gt0 gt0Var, String str) {
        wjb wjbVar;
        boolean z;
        boolean z2;
        if (gt0Var != null && this.V != null) {
            boolean z3 = true;
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("req_id");
                try {
                    String optString = jSONObject.optString("key");
                    if (optString == null) {
                        u(ev0Var, "secure_storage_failed", y("req_id", string, "error", "KEY_INVALID"));
                        return;
                    }
                    try {
                        ArrayList h = gt0Var.h(optString);
                        if (h.isEmpty()) {
                            u(ev0Var, "secure_storage_failed", y("req_id", string, "error", "RESTORE_UNAVAILABLE"));
                            return;
                        }
                        Context context = getContext();
                        yt0 yt0Var = new yt0(this, ev0Var, string, gt0Var, optString);
                        d S = LaunchActivity.S();
                        if (S != null) {
                            wjbVar = S.getResourceProvider();
                        } else {
                            wjbVar = null;
                        }
                        String[] strArr = new String[1];
                        boolean[] zArr = new boolean[1];
                        fx0 h2 = de9.h(1, wjbVar, context, false);
                        LinearLayout j = de9.j(context, 1);
                        be0 be0Var = new be0(context);
                        TLRPC.User V1 = na7.q1(gt0Var.a).V1(Long.valueOf(gt0Var.b));
                        pb0 pb0Var = new pb0((wjb) null);
                        pb0Var.q(V1);
                        be0Var.f(V1, pb0Var);
                        j.addView(be0Var, nme.t(80, 80, 49, 0, 21, 0, 13));
                        int i = bkb.F6;
                        TextView b = hve.b(context, 20.0f, i, true, null);
                        b.setText(k96.M0(2131752978, null));
                        b.setGravity(17);
                        j.addView(b, nme.t(-1, -2, 7, 32, 0, 32, 10));
                        TextView b2 = hve.b(context, 14.0f, i, false, null);
                        de9.r(null, null, 2131752979, new Object[]{cf3.G(null, null, V1)}, b2);
                        b2.setGravity(17);
                        j.addView(b2, nme.t(-1, -2, 7, 32, 0, 32, 19));
                        mhb mhbVar = new mhb(context, wjbVar);
                        int i2 = -1;
                        ColorDrawable colorDrawable = new ColorDrawable(-1);
                        mhbVar.setBackground(new fm2(colorDrawable, bkb.V0(context, 2131231232, bkb.v0(bkb.a7, wjbVar))));
                        zkb.x(mhbVar, colorDrawable, bkb.Z6, wjbVar, PorterDuff.Mode.SRC_IN);
                        mhbVar.setFixedSize(12);
                        j.addView(mhbVar, nme.t(-1, 12, 7, 0, 0, 0, 0));
                        ld5 ld5Var = new ld5(context, wjbVar);
                        ld5Var.setText(k96.M0(2131752980, null));
                        j.addView(ld5Var, nme.t(-1, -2, 7, 0, 0, 0, 0));
                        u41 u41Var = new u41(wjbVar, context, true);
                        ArrayList arrayList = new ArrayList();
                        int i3 = 0;
                        while (i3 < h.size()) {
                            ft0 ft0Var = (ft0) h.get(i3);
                            boolean z4 = z3;
                            if (i3 < h.size() - 1) {
                                z2 = z4;
                            } else {
                                z2 = false;
                            }
                            et0 et0Var = new et0(ft0Var, z2, context);
                            int i4 = bkb.h6;
                            yt0 yt0Var2 = yt0Var;
                            ff0 f0 = bkb.f0(bkb.v0(i4, wjbVar), 2, i2);
                            vkb M = zkb.M(i4);
                            et0Var.setBackground(f0);
                            zkb.j(et0Var, f0, null, M, wjbVar);
                            int i5 = i2;
                            et0Var.setOnClickListener(new ee(strArr, ft0Var, arrayList, u41Var, (byte) 5));
                            j.addView(et0Var, nme.o(i5, 56));
                            arrayList.add(et0Var);
                            i3++;
                            yt0Var = yt0Var2;
                            i2 = i5;
                            z3 = z4;
                        }
                        yt0 yt0Var3 = yt0Var;
                        u41Var.i(k96.M0(2131752982, null), false, z3);
                        if (strArr[0] != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        u41Var.setEnabled(z);
                        j.addView(u41Var, nme.t(-1, 48, 7, 8, 8, 8, 4));
                        h2.O = j;
                        h2.M(bkb.g5);
                        u41Var.setOnClickListener(new ee(zArr, yt0Var3, strArr, h2, (byte) 6));
                        h2.setOnDismissListener(new cf(zArr, yt0Var3, (byte) 6));
                        h2.show();
                    } catch (Exception e) {
                        u(ev0Var, "secure_storage_failed", y("req_id", string, "error", e.getMessage()));
                    }
                } catch (Exception unused) {
                    u(ev0Var, "secure_storage_failed", y("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e2) {
                fa4.g(e2, true);
            }
        }
    }

    public final void R(String[] strArr, vs2 vs2Var) {
        for (String str : strArr) {
            if (getContext().checkSelfPermission(str) != 0) {
                this.W = new nn6(this, vs2Var, strArr, (byte) 28);
                Activity activity = this.a0;
                if (activity != null) {
                    activity.requestPermissions(strArr, 4000);
                    return;
                }
                return;
            }
        }
        vs2Var.accept(Boolean.TRUE);
    }

    public void S(String str, boolean z) {
        boolean z2;
        boolean z3;
        cv0 cv0Var = this.a;
        if (cv0Var != null && cv0Var.canGoBack()) {
            z2 = false;
        } else {
            z2 = true;
        }
        cv0 cv0Var2 = this.a;
        if (cv0Var2 != null && cv0Var2.canGoForward()) {
            z3 = false;
        } else {
            z3 = true;
        }
        G(z2, z3);
        cv0 cv0Var3 = this.a;
        if (cv0Var3 != null) {
            cv0Var3.b = true;
        }
        if (this.O) {
            e("setPageLoaded: already loaded");
            return;
        }
        kb0 kb0Var = this.s;
        if (z && cv0Var3 != null && kb0Var != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.a, property, 1.0f), ObjectAnimator.ofFloat(kb0Var, property, 0.0f));
            animatorSet.addListener(new g0(this, (byte) 24));
            animatorSet.start();
        } else {
            if (cv0Var3 != null) {
                cv0Var3.setAlpha(1.0f);
            }
            if (kb0Var != null) {
                kb0Var.setAlpha(0.0f);
                kb0Var.setVisibility(8);
            }
        }
        this.b = str;
        e("setPageLoaded: isPageLoaded = true!");
        this.O = true;
        this.c.getClass();
    }

    public final void T(ev0 ev0Var, gt0 gt0Var, String str, String str2, String str3) {
        if (gt0Var != null && this.V != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("req_id");
                try {
                    String optString = jSONObject.optString("key");
                    if (optString == null) {
                        u(ev0Var, str3, y("req_id", string, "error", "KEY_INVALID"));
                        return;
                    }
                    try {
                        try {
                            gt0Var.n(optString, jSONObject.optString("value"));
                            u(ev0Var, str2, x(string, "req_id"));
                        } catch (RuntimeException e) {
                            u(ev0Var, str3, y("req_id", string, "error", e.getMessage()));
                        }
                    } catch (Exception unused) {
                        u(ev0Var, str3, y("req_id", string, "error", "VALUE_INVALID"));
                    }
                } catch (Exception unused2) {
                    u(ev0Var, str3, y("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e2) {
                fa4.g(e2, true);
            }
        }
    }

    public final void U() {
        cv0 cv0Var = this.a;
        if (cv0Var != null && this.p0) {
            cv0Var.removeJavascriptInterface("TelegramWebviewProxy");
            if (!muc.a("WEB_MESSAGE_LISTENER")) {
                e("Bot WebMessageListener is unsupported; native bridge disabled");
                return;
            }
            Set singleton = Collections.singleton("*");
            cv0 cv0Var2 = this.a;
            if (!cv0Var2.S) {
                juc.a(cv0Var2, "TelegramWebviewProxyMessage", singleton, new sg0(cv0Var2, (byte) 12));
                this.a.S = true;
            }
            if (muc.a("DOCUMENT_START_SCRIPT")) {
                cv0 cv0Var3 = this.a;
                if (cv0Var3.T == null) {
                    boolean z = juc.a;
                    if (muc.d.b()) {
                        cv0Var3.T = new ln8((ScriptHandlerBoundaryInterface) hy0.a(ScriptHandlerBoundaryInterface.class, juc.c(cv0Var3).a.addDocumentStartJavaScript("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};", (String[]) singleton.toArray(new String[0]))), (byte) 11);
                        return;
                    }
                    fyb.i("This method is not supported by the current version of the framework and the current WebView APK");
                }
            }
        }
    }

    public final void V(defpackage.cv0 r12, java.lang.Object r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv0.V(cv0, java.lang.Object):void");
    }

    public final void W(int i, hd hdVar, Runnable runnable) {
        if (hdVar != null && !k(i)) {
            hdVar.setOnDismissListener(new cf(this, runnable, (byte) 7));
            this.d0 = hdVar;
            hdVar.k0 = false;
            hdVar.show();
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
        String M0 = k96.M0(2131743640, "UnknownError");
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
                fa4.g(th, true);
                this.s.setVisibility(8);
                this.h = true;
                this.f.setVisibility(0);
                cv0 cv0Var = this.a;
                if (cv0Var != null) {
                    removeView(cv0Var);
                }
            }
        }
    }

    public final void b(ev0 ev0Var, gt0 gt0Var, String str, String str2, String str3) {
        if (gt0Var != null && this.V != null) {
            try {
                String string = new JSONObject(str).getString("req_id");
                try {
                    gt0Var.m(new JSONObject());
                    u(ev0Var, str2, x(string, "req_id"));
                } catch (RuntimeException e) {
                    u(ev0Var, str3, y("req_id", string, "error", e.getMessage()));
                }
            } catch (Exception e2) {
                fa4.g(e2, true);
            }
        }
    }

    public final void c() {
        if (this.V == null) {
            return;
        }
        uo0 uo0Var = this.k0;
        if (uo0Var == null) {
            this.k0 = uo0.b(getContext(), this.N, this.V.id);
        } else {
            uo0Var.f();
        }
    }

    public final ev0 d() {
        cv0 cv0Var = this.a;
        long j = this.t0;
        boolean z = this.u0;
        String str = this.H0;
        ?? obj = new Object();
        obj.c = this;
        obj.d = cv0Var;
        obj.a = j;
        obj.b = z;
        obj.e = str;
        return obj;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        nn6 nn6Var;
        Uri[] uriArr;
        if (i == kk7.p4) {
            cv0 cv0Var = this.a;
            if (cv0Var != null) {
                cv0Var.setBackgroundColor(h(bkb.c6));
            }
            if (!this.r0) {
                int i3 = bkb.Aj;
                int h = h(i3);
                this.q0 = h;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(h, PorterDuff.Mode.SRC_IN);
                kb0 kb0Var = this.s;
                kb0Var.setColorFilter(porterDuffColorFilter);
                kcb kcbVar = this.r;
                if (kcbVar != null) {
                    kcbVar.n = Integer.valueOf(this.q0);
                    this.r.e(i3, this.e, 1.0f, false);
                }
                kb0Var.invalidate();
            }
            w();
        } else if (i == kk7.e5) {
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
        } else if (i == kk7.f5) {
            int intValue3 = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue3 == 4000 && (nn6Var = this.W) != null) {
                nn6Var.run();
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
                RectF rectF = gl.P;
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
                if (!gl.m0) {
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
        fa4.b("[webviewcontainer] #" + this.P0 + " " + str);
    }

    public final void f() {
        e("destroyWebView preserving=" + this.C0);
        cv0 cv0Var = this.a;
        if (cv0Var != null) {
            if (cv0Var.getParent() != null) {
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
            tq0 tq0Var = this.l0;
            if (tq0Var != null) {
                tq0Var.f.remove(this.L0);
                this.l0 = null;
                this.K0 = null;
            }
        }
    }

    public final void g(String str) {
        new u21(this, this.e).Q(2131624012, 36, str).j();
    }

    public BotWebViewContainer$BotWebViewProxy getBotProxy() {
        return this.s0;
    }

    public int getMinHeight() {
        if (getParent() instanceof r12) {
            r12 r12Var = (r12) getParent();
            if (r12Var.K) {
                return (int) ((r12Var.getMeasuredHeight() - r12Var.getOffsetY()) + this.A0);
            }
            return 0;
        }
        return 0;
    }

    public String getOriginHost() {
        cv0 cv0Var = this.a;
        if (cv0Var == null) {
            return null;
        }
        return i(cv0Var.getUrl());
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

    public cv0 getWebView() {
        return this.a;
    }

    public final int h(int i) {
        wjb wjbVar = this.e;
        if (wjbVar != null) {
            return wjbVar.h(i);
        }
        return bkb.w0(null, i, false);
    }

    public final void j(ev0 ev0Var, gt0 gt0Var, String str, String str2, String str3) {
        Object obj;
        JSONObject jSONObject;
        if (gt0Var != null && this.V != null) {
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                String string = jSONObject2.getString("req_id");
                try {
                    String optString = jSONObject2.optString("key");
                    if (optString == null) {
                        u(ev0Var, str3, y("req_id", string, "error", "KEY_INVALID"));
                        return;
                    }
                    try {
                        Pair f = gt0Var.f(optString);
                        if (gt0Var.d && (obj = f.first) == null) {
                            Object obj2 = f.second;
                            try {
                                jSONObject = new JSONObject();
                                jSONObject.put("req_id", string);
                                jSONObject.put("value", obj);
                                jSONObject.put("can_restore", obj2);
                            } catch (Exception unused) {
                                jSONObject = null;
                            }
                            u(ev0Var, str2, jSONObject);
                            return;
                        }
                        u(ev0Var, str2, y("req_id", string, "value", f.first));
                    } catch (RuntimeException e) {
                        u(ev0Var, str3, y("req_id", string, "error", e.getMessage()));
                    }
                } catch (Exception unused2) {
                    u(ev0Var, str3, y("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e2) {
                fa4.g(e2, true);
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
        if ((this.O || z2) && (z3 = this.p0) && (getParent() instanceof r12)) {
            r12 r12Var = (r12) getParent();
            if (z) {
                if (r12Var.getSwipeOffsetY() == r12Var.getTopActionBarOffsetY() + (-r12Var.getOffsetY())) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.P = z4;
            }
            int max = Math.max(getMinHeight(), (int) (r12Var.getTopActionBarOffsetY() + ((r12Var.getMeasuredHeight() - r12Var.getOffsetY()) - r12Var.getSwipeOffsetY()) + this.A0));
            if (z2 || max != this.x0 || this.y0 != z || this.z0 != this.P) {
                this.x0 = max;
                this.y0 = z;
                this.z0 = this.P;
                String str = "{height:" + (max / gl.p) + ",is_state_stable:" + z + ",is_expanded:" + this.P + "}";
                if (z3 && !o()) {
                    e("notifyEvent viewport_changed dropped for untrusted document");
                } else {
                    kk7.f(this.N).d(new du0(this, tb4.y("window.Telegram.WebView.receiveEvent('viewport_changed', ", str, ");"), (byte) 0));
                }
            }
        }
    }

    public final boolean m(ev0 ev0Var) {
        boolean z;
        if (ev0Var != null) {
            String str = (String) ev0Var.e;
            if (((hv0) ev0Var.c) == this && ((cv0) ev0Var.d) == this.a && ev0Var.a == this.t0 && (z = ev0Var.b) == this.u0) {
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
        kk7.e().b(this, kk7.p4);
        kk7.e().b(this, kk7.e5);
        kk7.e().b(this, kk7.f5);
        setTag(2131296353, new s10(this, (byte) 1));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e("detached");
        kk7.e().n(this, kk7.p4);
        kk7.e().n(this, kk7.e5);
        kk7.e().n(this, kk7.f5);
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
        TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(j));
        TLRPC.UserFull W1 = na7.q1(i).W1(j);
        String o = l7c.o(V1);
        kb0 kb0Var = this.s;
        if (o != null && o.equals("DurgerKingBot")) {
            kb0Var.setVisibility(0);
            kb0Var.setAlpha(1.0f);
            kb0Var.o(null, null, lcb.g(2131624006, Integer.valueOf(h(bkb.Z6))));
            setupFlickerParams(false);
            return;
        }
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = hq6.d0(i).b.bots;
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
                tL_attachMenuBotIcon = hq6.l0(tL_attachMenuBot);
            } else {
                z = false;
            }
            if (tL_attachMenuBotIcon != null) {
                kb0Var.setVisibility(0);
                kb0Var.setAlpha(1.0f);
                kb0Var.m(gl5.b(tL_attachMenuBotIcon.icon), null, null, tL_attachMenuBot);
                setupFlickerParams(z);
                return;
            }
            return;
        }
        wjb wjbVar = this.e;
        if (W1 != null && (botInfo = W1.bot_info) != null && (botappsettings = botInfo.app_settings) != null && botappsettings.placeholder_svg_path != null) {
            kb0Var.setVisibility(0);
            kb0Var.setAlpha(1.0f);
            kcb i4 = lcb.i(512, 512, W1.bot_info.app_settings.placeholder_svg_path);
            this.r = i4;
            if (i4 != null) {
                i4.n = Integer.valueOf(this.q0);
                this.r.e(bkb.Aj, wjbVar, 1.0f, false);
            }
            kb0Var.o(null, null, this.r);
            setupFlickerParams(true);
            return;
        }
        Path path = new Path();
        RectF rectF = gl.P;
        rectF.set(106.66499f, 106.66499f, 240.355f, 240.355f);
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, 18.0f, 18.0f, direction);
        rectF.set(271.645f, 106.66499f, 405.335f, 240.355f);
        path.addRoundRect(rectF, 18.0f, 18.0f, direction);
        rectF.set(106.66499f, 271.645f, 240.355f, 405.335f);
        path.addRoundRect(rectF, 18.0f, 18.0f, direction);
        rectF.set(271.645f, 271.645f, 405.335f, 405.335f);
        path.addRoundRect(rectF, 18.0f, 18.0f, direction);
        kb0Var.setVisibility(0);
        kb0Var.setAlpha(1.0f);
        kcb i5 = lcb.i(512, 512, path);
        this.r = i5;
        if (i5 != null) {
            i5.n = Integer.valueOf(this.q0);
            this.r.e(bkb.Aj, wjbVar, 1.0f, false);
        }
        kb0Var.o(null, null, this.r);
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
        kk7.f(i).d(new du0(this, str, (byte) 1));
    }

    public final void s(ev0 ev0Var) {
        if (this.V != null) {
            c();
            uo0 uo0Var = this.k0;
            if (uo0Var == null) {
                return;
            }
            try {
                u(ev0Var, "biometry_info_received", uo0Var.e());
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    public void setBotUser(TLRPC.User user) {
        this.V = user;
    }

    public void setDelegate(ku0 ku0Var) {
        this.c = ku0Var;
    }

    public void setFlickerViewColor(int i) {
        int a;
        if (gl.B(i) > 0.7f) {
            a = bkb.a(0.0f, -0.15f, i);
        } else {
            a = bkb.a(0.025f, 0.15f, i);
        }
        if (this.q0 == a) {
            return;
        }
        this.q0 = a;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(a, PorterDuff.Mode.SRC_IN);
        kb0 kb0Var = this.s;
        kb0Var.setColorFilter(porterDuffColorFilter);
        kcb kcbVar = this.r;
        if (kcbVar != null) {
            kcbVar.n = Integer.valueOf(this.q0);
            this.r.e(bkb.Aj, this.e, 1.0f, false);
        }
        this.r0 = true;
        kb0Var.invalidate();
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
        cv0 cv0Var = this.a;
        if (cv0Var != null) {
            cv0Var.setCloseListener(runnable);
        }
    }

    public void setOnVerifiedAge(m8c m8cVar) {
        this.Q0 = m8cVar;
    }

    public void setOpener(cv0 cv0Var) {
        cv0 cv0Var2;
        this.w0 = cv0Var;
        if (!this.p0 && (cv0Var2 = this.a) != null) {
            cv0Var2.f = cv0Var;
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

    public void setWasOpenedByBot(quc qucVar) {
        this.G0 = qucVar;
    }

    public void setWasOpenedByLinkIntent(boolean z) {
        this.F0 = z;
    }

    public void setWebViewProgressListener(vs2 vs2Var) {
        this.x = vs2Var;
    }

    public void setWebViewScrollListener(gv0 gv0Var) {
        this.d = gv0Var;
        cv0 cv0Var = this.a;
        if (cv0Var != null) {
            cv0Var.f(this, gv0Var);
        }
    }

    public final void u(ev0 ev0Var, String str, JSONObject jSONObject) {
        if (!m(ev0Var)) {
            e("notifyEvent " + str + " dropped after document change");
            return;
        }
        v(str, jSONObject);
    }

    @Override
    public final void updateColors() {
        kb0 kb0Var;
        int h;
        try {
            if (this.a != null && (h = h(bkb.c6)) != this.D0) {
                this.D0 = h;
                this.a.setBackgroundColor(h);
            }
            if (!this.r0 && (kb0Var = this.s) != null) {
                int i = this.q0;
                int i2 = bkb.Aj;
                if (i != h(i2)) {
                    int h2 = h(i2);
                    this.q0 = h2;
                    kb0Var.setColorFilter(new PorterDuffColorFilter(h2, PorterDuff.Mode.SRC_IN));
                    kcb kcbVar = this.r;
                    if (kcbVar != null) {
                        kcbVar.n = Integer.valueOf(this.q0);
                    }
                    kb0Var.invalidate();
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void v(String str, JSONObject jSONObject) {
        if (this.p0 && !o()) {
            e("notifyEvent " + str + " dropped for untrusted document");
            return;
        }
        e("notifyEvent " + str);
        kk7.f(this.N).d(new du0(this, "window.Telegram.WebView.receiveEvent('" + str + "', " + jSONObject + ");", (byte) 0));
    }

    public final void w() {
        JSONObject jSONObject;
        JSONObject u;
        try {
            u = ow0.u(this.e, true);
        } catch (Exception e) {
            fa4.g(e, true);
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

    public void I(cv0 cv0Var) {
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
