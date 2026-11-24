package defpackage;

import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.text.Editable;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import java.io.Serializable;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.json.JSONObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.xml.sax.Attributes;
public final class vi2 implements rw2, puc, aq2, rzd, yyb, d30, hy1, i30, kt8, bb2, rn5, cr8, al0, i8a, k13 {
    public final byte a;
    public static final vi2 b = new vi2((byte) 1);
    public static final String[] c = new String[0];
    public static final vi2 d = new vi2((byte) 3);
    public static final vi2 e = new vi2((byte) 4);
    public static final vi2 f = new vi2((byte) 5);
    public static final vi2 h = new vi2((byte) 6);
    public static final vi2 n = new vi2((byte) 7);
    public static final vi2 r = new vi2((byte) 8);
    public static final vi2 s = new vi2((byte) 9);
    public static final vi2 w = new vi2((byte) 10);
    public static final vi2 x = new vi2((byte) 11);
    public static final vi2 y = new vi2((byte) 12);
    public static final vi2 E = new vi2((byte) 13);

    public vi2() {
        this.a = (byte) 18;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    public static mw2 u1(Editable editable, int i) {
        Object[] objArr = (mw2[]) editable.getSpans(0, editable.length(), mw2.class);
        if (objArr.length != 0) {
            for (int length = objArr.length; length > 0; length--) {
                int i2 = length - 1;
                if (editable.getSpanFlags(objArr[i2]) == 17) {
                    mw2 mw2Var = objArr[i2];
                    if (mw2Var.a == i) {
                        return mw2Var;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static boolean w1(boolean z, String str, Editable editable, Attributes attributes) {
        byte b2;
        Object obj = null;
        boolean z2 = false;
        if (str.startsWith("animated-emoji")) {
            if (z) {
                String a = lw2.a("data-document-id", attributes);
                if (a != null) {
                    editable.setSpan(new gm(Long.parseLong(a), (Paint.FontMetricsInt) null), editable.length(), editable.length(), 17);
                    return true;
                }
            } else {
                Object[] spans = editable.getSpans(0, editable.length(), gm.class);
                if (spans.length != 0) {
                    int length = spans.length;
                    while (true) {
                        if (length <= 0) {
                            break;
                        }
                        int i = length - 1;
                        if (editable.getSpanFlags(spans[i]) == 17) {
                            obj = spans[i];
                            break;
                        }
                        length--;
                    }
                }
                Object obj2 = (gm) obj;
                if (obj2 != null) {
                    int spanStart = editable.getSpanStart(obj2);
                    editable.removeSpan(obj2);
                    if (spanStart != editable.length()) {
                        editable.setSpan(obj2, spanStart, editable.length(), 33);
                        return true;
                    }
                    return true;
                }
            }
            return false;
        } else if (str.equals("spoiler")) {
            if (z) {
                editable.setSpan(new mw2(0), editable.length(), editable.length(), 17);
                return true;
            }
            Object u1 = u1(editable, 0);
            if (u1 != null) {
                int spanStart2 = editable.getSpanStart(u1);
                editable.removeSpan(u1);
                if (spanStart2 != editable.length()) {
                    editable.setSpan(u1, spanStart2, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        } else if (str.equals("pre")) {
            if (z) {
                String a2 = lw2.a("language", attributes);
                if (a2 == null) {
                    a2 = lw2.a("lang", attributes);
                }
                if (a2 == null) {
                    a2 = lw2.a("lng", attributes);
                }
                editable.setSpan(new mw2(a2), editable.length(), editable.length(), 17);
                return true;
            }
            Object u12 = u1(editable, 1);
            if (u12 != null) {
                int spanStart3 = editable.getSpanStart(u12);
                editable.removeSpan(u12);
                if (spanStart3 != editable.length()) {
                    editable.setSpan(u12, spanStart3, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        } else {
            int i2 = 3;
            if (str.equals("blockquote")) {
                if (z) {
                    String a3 = lw2.a("class", attributes);
                    if (lw2.a("data-collapsed", attributes) != null || (a3 != null && a3.contains("telegram-collapsed-quote"))) {
                        z2 = true;
                    }
                    if (!z2) {
                        i2 = 2;
                    }
                    editable.setSpan(new mw2(i2), editable.length(), editable.length(), 17);
                    return true;
                }
                mw2[] mw2VarArr = (mw2[]) editable.getSpans(0, editable.length(), mw2.class);
                for (int length2 = mw2VarArr.length - 1; length2 >= 0; length2--) {
                    mw2 mw2Var = mw2VarArr[length2];
                    if (editable.getSpanFlags(mw2Var) == 17 && ((b2 = mw2Var.a) == 2 || b2 == 3)) {
                        obj = mw2Var;
                        break;
                    }
                }
                if (obj != null) {
                    int spanStart4 = editable.getSpanStart(obj);
                    editable.removeSpan(obj);
                    if (spanStart4 != editable.length()) {
                        editable.setSpan(obj, spanStart4, editable.length(), 33);
                        return true;
                    }
                    return true;
                }
                return false;
            }
            if (str.equals("details")) {
                if (z) {
                    editable.setSpan(new mw2(3), editable.length(), editable.length(), 17);
                    return true;
                }
                Object u13 = u1(editable, 3);
                if (u13 != null) {
                    int spanStart5 = editable.getSpanStart(u13);
                    editable.removeSpan(u13);
                    if (spanStart5 != editable.length()) {
                        editable.setSpan(u13, spanStart5, editable.length(), 33);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    @Override
    public final boolean A1(gb2 gb2Var, int i) {
        return false;
    }

    @Override
    public final boolean B2(gb2 gb2Var, k27 k27Var) {
        return false;
    }

    @Override
    public final void C() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override
    public final bu1 D() {
        return null;
    }

    @Override
    public final boolean D0(gb2 gb2Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final gib E2() {
        return null;
    }

    @Override
    public final boolean F0(gb2 gb2Var) {
        return false;
    }

    @Override
    public final boolean G(gb2 gb2Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final boolean H0() {
        return false;
    }

    @Override
    public final boolean J0(long j) {
        return false;
    }

    @Override
    public final int K() {
        return 872415231;
    }

    @Override
    public final void K1(gb2 gb2Var, TLRPC.WebPage webPage, String str, boolean z) {
        d01.t(gb2Var.getContext(), str);
    }

    @Override
    public final Object L(gl2 gl2Var) {
        return new ghd((ltd) gl2Var.a(ltd.class), (u44) gl2Var.a(u44.class));
    }

    @Override
    public final boolean M() {
        return true;
    }

    @Override
    public final boolean N1() {
        return false;
    }

    @Override
    public final boolean O() {
        return false;
    }

    @Override
    public final boolean Q() {
        return false;
    }

    @Override
    public final boolean Q0() {
        return false;
    }

    @Override
    public final int R() {
        return 0;
    }

    @Override
    public final qn5 S0(wk4 wk4Var) {
        return new sn5(wk4Var);
    }

    @Override
    public final boolean T0(gb2 gb2Var, TLRPC.TodoItem todoItem, boolean z) {
        return false;
    }

    @Override
    public final boolean T1(gm gmVar) {
        return false;
    }

    @Override
    public final float U0() {
        return 0.0f;
    }

    @Override
    public final int V(gb2 gb2Var) {
        return 0;
    }

    @Override
    public final vu1 X() {
        return null;
    }

    @Override
    public final int Z0(int i, int i2, int i3) {
        i30 i30Var;
        switch (this.a) {
            case 17:
                if (i2 == 6) {
                    i30Var = i30.l;
                } else if (i2 > i3) {
                    i30Var = i30.i;
                } else if (i2 < i3) {
                    i30Var = i30.j;
                } else {
                    i30Var = i30.k;
                }
                return i30Var.Z0(i, i2, i3);
            default:
                return (i / i2) * i3;
        }
    }

    @Override
    public final ma8 Z1() {
        return null;
    }

    @Override
    public final void a0(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2) {
        i30 i30Var;
        switch (this.a) {
            case 17:
                if (i == 6) {
                    i30Var = i30.l;
                } else if (i > i2) {
                    i30Var = i30.i;
                } else if (i < i2) {
                    i30Var = i30.j;
                } else {
                    i30Var = i30.k;
                }
                i30Var.a0(shortBuffer, i, shortBuffer2, i2);
                return;
            default:
                if (i2 != 1 && i2 != 2) {
                    w26.j("Output must be 2 or 1 channels");
                    return;
                }
                int min = Math.min(shortBuffer.remaining() / i, shortBuffer2.remaining() / i2);
                for (int i3 = 0; i3 < min; i3++) {
                    short s2 = shortBuffer.get();
                    short s3 = shortBuffer.get();
                    shortBuffer.position(shortBuffer.position() + 4);
                    if (i2 == 2) {
                        shortBuffer2.put(s2);
                        shortBuffer2.put(s3);
                    } else if (i2 == 1) {
                        shortBuffer2.put(i2f.z3(s2, s3));
                    }
                }
                return;
        }
    }

    @Override
    public final int a1() {
        return 0;
    }

    @Override
    public final Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final int b0() {
        return 0;
    }

    @Override
    public final String b1(gb2 gb2Var) {
        return null;
    }

    @Override
    public final boolean c2(long j) {
        return false;
    }

    @Override
    public final WebViewProviderBoundaryInterface createWebView(WebView webView) {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override
    public final int d1() {
        return 0;
    }

    @Override
    public final boolean e0() {
        return false;
    }

    @Override
    public final void f(int i, Serializable serializable) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i != 6 && i != 7 && i != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        }
    }

    @Override
    public final CharacterStyle f0(gb2 gb2Var) {
        return null;
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final boolean g2(k27 k27Var) {
        return true;
    }

    @Override
    public final Object mo9get() {
        return v8c.a;
    }

    @Override
    public final StaticsBoundaryInterface getStatics() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override
    public final int h() {
        return 0;
    }

    @Override
    public final q7a h0(ize izeVar, JSONObject jSONObject) {
        g30 g30Var;
        long currentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        if (jSONObject.has("session")) {
            g30Var = new g30(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8));
        } else {
            g30Var = new g30(new JSONObject().optInt("max_custom_exception_events", 8));
        }
        g30 g30Var2 = g30Var;
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        j00 j00Var = new j00(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j = optInt;
        if (jSONObject.has("expires_at")) {
            currentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            currentTimeMillis = (j * 1000) + System.currentTimeMillis();
        }
        return new q7a(currentTimeMillis, g30Var2, j00Var, optDouble, optDouble2, optInt2);
    }

    @Override
    public final boolean h1(gb2 gb2Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final TLRPC.Peer i() {
        return null;
    }

    @Override
    public final boolean i0() {
        return false;
    }

    @Override
    public final int k0() {
        return 352321535;
    }

    @Override
    public final boolean k2(gb2 gb2Var, TLRPC.User user) {
        return false;
    }

    @Override
    public final boolean l() {
        return true;
    }

    @Override
    public final boolean l2(gb2 gb2Var) {
        return false;
    }

    @Override
    public final int o0() {
        return 0;
    }

    @Override
    public final float p0() {
        return -1.0f;
    }

    @Override
    public final float q0() {
        return -1.0f;
    }

    @Override
    public final boolean s0(gb2 gb2Var, boolean z) {
        return false;
    }

    @Override
    public final TL_stories.StoryItem t0() {
        return null;
    }

    @Override
    public final int t1() {
        return 1711276032;
    }

    @Override
    public final boolean u0(long j) {
        return false;
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers v() {
        return null;
    }

    @Override
    public final String x(long j) {
        return null;
    }

    @Override
    public final boolean x0(gb2 gb2Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final boolean y0() {
        return false;
    }

    @Override
    public final boolean y1() {
        return false;
    }

    @Override
    public final boolean y2(int i) {
        return false;
    }

    @Override
    public final String[] z0() {
        return c;
    }

    @Override
    public final boolean z1(k27 k27Var) {
        return oo1.a(k27Var);
    }

    @Override
    public final Object zza() {
        throw new IllegalStateException();
    }

    public vi2(byte b2) {
        this.a = b2;
    }

    @Override
    public final void B() {
    }

    @Override
    public final void B0() {
    }

    @Override
    public final void C2() {
    }

    @Override
    public final void G0() {
    }

    @Override
    public final void H() {
    }

    @Override
    public final void I0() {
    }

    @Override
    public final void K0() {
    }

    @Override
    public final void L0() {
    }

    @Override
    public final void R0() {
    }

    @Override
    public final void R1() {
    }

    @Override
    public final void S() {
    }

    @Override
    public final void U() {
    }

    @Override
    public final void W0() {
    }

    @Override
    public final void a() {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void e() {
    }

    @Override
    public final void e1() {
    }

    @Override
    public final void g0() {
    }

    @Override
    public final void g1() {
    }

    @Override
    public final void i1() {
    }

    @Override
    public final void j() {
    }

    @Override
    public final void n() {
    }

    @Override
    public final void o1() {
    }

    @Override
    public final void p() {
    }

    @Override
    public final void p1() {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void s1() {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void u2() {
    }

    @Override
    public final void y() {
    }

    @Override
    public final void D1(h27 h27Var) {
    }

    @Override
    public final void F(gb2 gb2Var) {
    }

    @Override
    public final void H2(gb2 gb2Var) {
    }

    @Override
    public final void J(gb2 gb2Var) {
    }

    @Override
    public final void M1(gb2 gb2Var) {
    }

    @Override
    public final void N0(gb2 gb2Var) {
    }

    @Override
    public final void P0(CharSequence charSequence) {
    }

    @Override
    public final void T(gb2 gb2Var) {
    }

    @Override
    public final void W(gb2 gb2Var) {
    }

    @Override
    public final void X0(gb2 gb2Var) {
    }

    @Override
    public final void X1(gb2 gb2Var) {
    }

    @Override
    public final void Y(k27 k27Var) {
    }

    @Override
    public final void Y1(gb2 gb2Var) {
    }

    @Override
    public final void c1(gb2 gb2Var) {
    }

    @Override
    public final void d(String str) {
    }

    @Override
    public final void d0(int i) {
    }

    @Override
    public final void e2(gb2 gb2Var) {
    }

    @Override
    public final void f1(int i) {
    }

    @Override
    public final void j0(k27 k27Var) {
    }

    @Override
    public final void j1(boolean z) {
    }

    @Override
    public final void k(float f2) {
    }

    @Override
    public final void l0(String str) {
    }

    @Override
    public final void l1(gb2 gb2Var) {
    }

    @Override
    public final void m(boolean z) {
    }

    @Override
    public final void n0(int i) {
    }

    @Override
    public final void n1(gb2 gb2Var) {
    }

    @Override
    public final void q(gb2 gb2Var) {
    }

    @Override
    public final void q1(gb2 gb2Var) {
    }

    @Override
    public final void r0(gb2 gb2Var) {
    }

    @Override
    public final void v2(gb2 gb2Var) {
    }

    @Override
    public final void x1(gb2 gb2Var) {
    }

    @Override
    public final void z(boolean z) {
    }

    @Override
    public final void C1(gb2 gb2Var, boolean z) {
    }

    @Override
    public final void E0(gb2 gb2Var, long j) {
    }

    @Override
    public final void F1(gb2 gb2Var, int i) {
    }

    @Override
    public final void M0(gb2 gb2Var, boolean z) {
    }

    @Override
    public final void O1(gb2 gb2Var, iq0 iq0Var) {
    }

    @Override
    public final void V0(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void Z(gb2 gb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void b2(String str, String str2) {
    }

    @Override
    public final void d2(gb2 gb2Var, k08 k08Var) {
    }

    @Override
    public final void j2(gb2 gb2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void m0(gb2 gb2Var, int i) {
    }

    @Override
    public final void o(String str, Throwable th) {
    }

    @Override
    public final void v0(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void w(float f2, int i) {
    }

    @Override
    public final void A(gb2 gb2Var, float f2, float f3) {
    }

    @Override
    public final void C0(CharSequence charSequence, boolean z, boolean z2) {
    }

    @Override
    public final void G1(gb2 gb2Var, boolean z, boolean z2) {
    }

    @Override
    public final void I(gb2 gb2Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public final void O0(View view, CharSequence charSequence, boolean z) {
    }

    @Override
    public final void P(gb2 gb2Var, CharacterStyle characterStyle, boolean z) {
    }

    @Override
    public final void W1(gb2 gb2Var, TLObject tLObject, boolean z) {
    }

    @Override
    public final void Y0(gb2 gb2Var, float f2, float f3) {
    }

    @Override
    public final void s2(gb2 gb2Var, float f2, float f3) {
    }

    @Override
    public final void v1(gb2 gb2Var, float f2, float f3) {
    }

    @Override
    public final void w0(gb2 gb2Var, int i, int i2) {
    }

    @Override
    public final void x2(gb2 gb2Var, boolean z, boolean z2) {
    }

    @Override
    public final void A0(gb2 gb2Var, float f2, float f3, boolean z) {
    }

    @Override
    public final void E(gb2 gb2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void c0(gb2 gb2Var, TLRPC.User user, float f2, float f3) {
    }

    @Override
    public final void s(gb2 gb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    @Override
    public final void N(gb2 gb2Var, int i, float f2, float f3, boolean z) {
    }

    @Override
    public final void m1(gb2 gb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f2, float f3) {
    }

    @Override
    public final void r1(gb2 gb2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    @Override
    public final void u(CharSequence charSequence, boolean z, int i, int i2, long j) {
    }

    @Override
    public final void i2(gb2 gb2Var, TLRPC.Chat chat, int i, float f2, float f3, boolean z) {
    }

    @Override
    public final void k1(int i, int i2, int i3, long j, long j2, boolean z) {
    }

    @Override
    public final void I1(k27 k27Var, String str, String str2, String str3, String str4, int i, int i2) {
    }
}
