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
public final class rj2 implements lx2, fzc, tq2, h4e, y2c, e30, xy1, j30, tw8, rb2, up5, mu8, bl0, zba, d23 {
    public final byte a;
    public static final rj2 b = new rj2((byte) 1);
    public static final String[] c = new String[0];
    public static final rj2 d = new rj2((byte) 3);
    public static final rj2 e = new rj2((byte) 4);
    public static final rj2 f = new rj2((byte) 5);
    public static final rj2 h = new rj2((byte) 6);
    public static final rj2 n = new rj2((byte) 7);
    public static final rj2 r = new rj2((byte) 8);
    public static final rj2 s = new rj2((byte) 9);
    public static final rj2 w = new rj2((byte) 10);
    public static final rj2 x = new rj2((byte) 11);
    public static final rj2 y = new rj2((byte) 12);
    public static final rj2 E = new rj2((byte) 13);

    public rj2() {
        this.a = (byte) 18;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    public static gx2 X1(Editable editable, int i) {
        Object[] objArr = (gx2[]) editable.getSpans(0, editable.length(), gx2.class);
        if (objArr.length != 0) {
            for (int length = objArr.length; length > 0; length--) {
                int i2 = length - 1;
                if (editable.getSpanFlags(objArr[i2]) == 17) {
                    gx2 gx2Var = objArr[i2];
                    if (gx2Var.a == i) {
                        return gx2Var;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static boolean Y1(boolean z, String str, Editable editable, Attributes attributes) {
        byte b2;
        Object obj = null;
        boolean z2 = false;
        if (str.startsWith("animated-emoji")) {
            if (z) {
                String a = fx2.a("data-document-id", attributes);
                if (a != null) {
                    editable.setSpan(new hm(Long.parseLong(a), (Paint.FontMetricsInt) null), editable.length(), editable.length(), 17);
                    return true;
                }
            } else {
                Object[] spans = editable.getSpans(0, editable.length(), hm.class);
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
                Object obj2 = (hm) obj;
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
                editable.setSpan(new gx2(0), editable.length(), editable.length(), 17);
                return true;
            }
            Object X1 = X1(editable, 0);
            if (X1 != null) {
                int spanStart2 = editable.getSpanStart(X1);
                editable.removeSpan(X1);
                if (spanStart2 != editable.length()) {
                    editable.setSpan(X1, spanStart2, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        } else if (str.equals("pre")) {
            if (z) {
                String a2 = fx2.a("language", attributes);
                if (a2 == null) {
                    a2 = fx2.a("lang", attributes);
                }
                if (a2 == null) {
                    a2 = fx2.a("lng", attributes);
                }
                editable.setSpan(new gx2(a2), editable.length(), editable.length(), 17);
                return true;
            }
            Object X12 = X1(editable, 1);
            if (X12 != null) {
                int spanStart3 = editable.getSpanStart(X12);
                editable.removeSpan(X12);
                if (spanStart3 != editable.length()) {
                    editable.setSpan(X12, spanStart3, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        } else {
            int i2 = 3;
            if (str.equals("blockquote")) {
                if (z) {
                    String a3 = fx2.a("class", attributes);
                    if (fx2.a("data-collapsed", attributes) != null || (a3 != null && a3.contains("telegram-collapsed-quote"))) {
                        z2 = true;
                    }
                    if (!z2) {
                        i2 = 2;
                    }
                    editable.setSpan(new gx2(i2), editable.length(), editable.length(), 17);
                    return true;
                }
                gx2[] gx2VarArr = (gx2[]) editable.getSpans(0, editable.length(), gx2.class);
                for (int length2 = gx2VarArr.length - 1; length2 >= 0; length2--) {
                    gx2 gx2Var = gx2VarArr[length2];
                    if (editable.getSpanFlags(gx2Var) == 17 && ((b2 = gx2Var.a) == 2 || b2 == 3)) {
                        obj = gx2Var;
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
                    editable.setSpan(new gx2(3), editable.length(), editable.length(), 17);
                    return true;
                }
                Object X13 = X1(editable, 3);
                if (X13 != null) {
                    int spanStart5 = editable.getSpanStart(X13);
                    editable.removeSpan(X13);
                    if (spanStart5 != editable.length()) {
                        editable.setSpan(X13, spanStart5, editable.length(), 33);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    @Override
    public final boolean A1(hm hmVar) {
        return false;
    }

    @Override
    public final float B0() {
        return -1.0f;
    }

    @Override
    public final float D0() {
        return -1.0f;
    }

    @Override
    public final boolean E(wb2 wb2Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final int E0() {
        return 0;
    }

    @Override
    public final TL_stories.StoryItem F0() {
        return null;
    }

    @Override
    public final boolean G0(wb2 wb2Var, TLRPC.TodoItem todoItem, boolean z) {
        return false;
    }

    @Override
    public final boolean H0(long j) {
        return false;
    }

    @Override
    public final void I() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override
    public final de8 J1() {
        return null;
    }

    @Override
    public final boolean K() {
        return false;
    }

    @Override
    public final boolean L0() {
        return false;
    }

    @Override
    public final boolean L1(long j) {
        return false;
    }

    @Override
    public final boolean M() {
        return false;
    }

    @Override
    public final String M0(wb2 wb2Var) {
        return null;
    }

    @Override
    public final int N() {
        return 0;
    }

    @Override
    public final String[] O0() {
        return c;
    }

    @Override
    public final int P(wb2 wb2Var) {
        return 0;
    }

    @Override
    public final boolean P0(wb2 wb2Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final int Q1() {
        return 1711276032;
    }

    @Override
    public final ou1 R() {
        return null;
    }

    @Override
    public final boolean R1(r47 r47Var) {
        return true;
    }

    @Override
    public final iv1 S() {
        return null;
    }

    @Override
    public final boolean T0() {
        return false;
    }

    @Override
    public final boolean V1(wb2 wb2Var, TLRPC.User user) {
        return false;
    }

    @Override
    public final boolean W1(wb2 wb2Var) {
        return false;
    }

    @Override
    public final int X() {
        return 872415231;
    }

    @Override
    public final boolean Z() {
        return false;
    }

    @Override
    public final CharacterStyle a0(wb2 wb2Var) {
        return null;
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
    public final Object b0(am2 am2Var) {
        return new xld((byd) am2Var.a(byd.class), (q54) am2Var.a(q54.class));
    }

    @Override
    public final boolean c0() {
        return false;
    }

    @Override
    public final WebViewProviderBoundaryInterface createWebView(WebView webView) {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override
    public final boolean e0() {
        return true;
    }

    @Override
    public final boolean e1() {
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
    public final boolean g() {
        return false;
    }

    @Override
    public final Object mo21get() {
        return vcc.a;
    }

    @Override
    public final StaticsBoundaryInterface getStatics() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final boolean i1() {
        return false;
    }

    @Override
    public final boolean i2(int i) {
        return false;
    }

    @Override
    public final int j() {
        return 0;
    }

    @Override
    public final boolean j1(r47 r47Var) {
        return bp1.a(r47Var);
    }

    @Override
    public final boolean j2(wb2 wb2Var, r47 r47Var) {
        return false;
    }

    @Override
    public final TLRPC.Peer k() {
        return null;
    }

    @Override
    public final boolean k0(wb2 wb2Var, boolean z) {
        return false;
    }

    @Override
    public final boolean k1(wb2 wb2Var, int i) {
        return false;
    }

    @Override
    public final bmb l2() {
        return null;
    }

    @Override
    public final int m0() {
        return 0;
    }

    @Override
    public final float m1() {
        return 0.0f;
    }

    @Override
    public final boolean o0(wb2 wb2Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final int o1() {
        return 0;
    }

    @Override
    public final void p0(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2) {
        j30 j30Var;
        switch (this.a) {
            case 17:
                if (i == 6) {
                    j30Var = j30.l;
                } else if (i > i2) {
                    j30Var = j30.i;
                } else if (i < i2) {
                    j30Var = j30.j;
                } else {
                    j30Var = j30.k;
                }
                j30Var.p0(shortBuffer, i, shortBuffer2, i2);
                return;
            default:
                if (i2 != 1 && i2 != 2) {
                    lq5.j("Output must be 2 or 1 channels");
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
                        shortBuffer2.put(z6f.z3(s2, s3));
                    }
                }
                return;
        }
    }

    @Override
    public final tp5 q(um4 um4Var) {
        return new vp5(um4Var);
    }

    @Override
    public final boolean s0(wb2 wb2Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final int s1(int i, int i2, int i3) {
        j30 j30Var;
        switch (this.a) {
            case 17:
                if (i2 == 6) {
                    j30Var = j30.l;
                } else if (i2 > i3) {
                    j30Var = j30.i;
                } else if (i2 < i3) {
                    j30Var = j30.j;
                } else {
                    j30Var = j30.k;
                }
                return j30Var.s1(i, i2, i3);
            default:
                return (i / i2) * i3;
        }
    }

    @Override
    public final String u(long j) {
        return null;
    }

    @Override
    public final void u1(wb2 wb2Var, TLRPC.WebPage webPage, String str, boolean z) {
        m01.u(wb2Var.getContext(), str);
    }

    @Override
    public final hba v0(z3f z3fVar, JSONObject jSONObject) {
        h30 h30Var;
        long currentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        if (jSONObject.has("session")) {
            h30Var = new h30(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8));
        } else {
            h30Var = new h30(new JSONObject().optInt("max_custom_exception_events", 8));
        }
        h30 h30Var2 = h30Var;
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        k00 k00Var = new k00(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j = optInt;
        if (jSONObject.has("expires_at")) {
            currentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            currentTimeMillis = (j * 1000) + System.currentTimeMillis();
        }
        return new hba(currentTimeMillis, h30Var2, k00Var, optDouble, optDouble2, optInt2);
    }

    @Override
    public final boolean w0(wb2 wb2Var) {
        return false;
    }

    @Override
    public final boolean w1() {
        return false;
    }

    @Override
    public final int x0() {
        return 352321535;
    }

    @Override
    public final int x1() {
        return 0;
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers y() {
        return null;
    }

    @Override
    public final boolean y0(long j) {
        return false;
    }

    @Override
    public final Object zza() {
        throw new IllegalStateException();
    }

    public rj2(byte b2) {
        this.a = b2;
    }

    @Override
    public final void B1() {
    }

    @Override
    public final void C() {
    }

    @Override
    public final void D1() {
    }

    @Override
    public final void J() {
    }

    @Override
    public final void O1() {
    }

    @Override
    public final void P1() {
    }

    @Override
    public final void Q0() {
    }

    @Override
    public final void S0() {
    }

    @Override
    public final void S1() {
    }

    @Override
    public final void V() {
    }

    @Override
    public final void W0() {
    }

    @Override
    public final void X0() {
    }

    @Override
    public final void Z0() {
    }

    @Override
    public final void a() {
    }

    @Override
    public final void d() {
    }

    @Override
    public final void d2() {
    }

    @Override
    public final void e() {
    }

    @Override
    public final void f0() {
    }

    @Override
    public final void g1() {
    }

    @Override
    public final void i() {
    }

    @Override
    public final void i0() {
    }

    @Override
    public final void k2() {
    }

    @Override
    public final void n() {
    }

    @Override
    public final void p1() {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void r0() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void t0() {
    }

    @Override
    public final void w() {
    }

    @Override
    public final void z1() {
    }

    @Override
    public final void A(wb2 wb2Var) {
    }

    @Override
    public final void C0(wb2 wb2Var) {
    }

    @Override
    public final void C1(int i) {
    }

    @Override
    public final void D(boolean z) {
    }

    @Override
    public final void E1(boolean z) {
    }

    @Override
    public final void G(wb2 wb2Var) {
    }

    @Override
    public final void G1(wb2 wb2Var) {
    }

    @Override
    public final void I1(wb2 wb2Var) {
    }

    @Override
    public final void J0(wb2 wb2Var) {
    }

    @Override
    public final void N0(wb2 wb2Var) {
    }

    @Override
    public final void N1(wb2 wb2Var) {
    }

    @Override
    public final void O(wb2 wb2Var) {
    }

    @Override
    public final void Q(wb2 wb2Var) {
    }

    @Override
    public final void T(r47 r47Var) {
    }

    @Override
    public final void U0(wb2 wb2Var) {
    }

    @Override
    public final void Y(int i) {
    }

    @Override
    public final void Y0(wb2 wb2Var) {
    }

    @Override
    public final void a1(wb2 wb2Var) {
    }

    @Override
    public final void c(String str) {
    }

    @Override
    public final void d0(r47 r47Var) {
    }

    @Override
    public final void d1(CharSequence charSequence) {
    }

    @Override
    public final void e2(wb2 wb2Var) {
    }

    @Override
    public final void g0(String str) {
    }

    @Override
    public final void h1(wb2 wb2Var) {
    }

    @Override
    public final void j0(wb2 wb2Var) {
    }

    @Override
    public final void l(wb2 wb2Var) {
    }

    @Override
    public final void m2(wb2 wb2Var) {
    }

    @Override
    public final void n1(o47 o47Var) {
    }

    @Override
    public final void o(float f2) {
    }

    @Override
    public final void p(boolean z) {
    }

    @Override
    public final void v1(wb2 wb2Var) {
    }

    @Override
    public final void z0(int i) {
    }

    @Override
    public final void A0(wb2 wb2Var, boolean z) {
    }

    @Override
    public final void B(float f2, int i) {
    }

    @Override
    public final void I0(wb2 wb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void K1(String str, String str2) {
    }

    @Override
    public final void M1(wb2 wb2Var, q38 q38Var) {
    }

    @Override
    public final void U(wb2 wb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void U1(wb2 wb2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void h0(wb2 wb2Var, int i) {
    }

    @Override
    public final void l0(wb2 wb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void l1(wb2 wb2Var, boolean z) {
    }

    @Override
    public final void q1(wb2 wb2Var, int i) {
    }

    @Override
    public final void t(String str, Throwable th) {
    }

    @Override
    public final void u0(wb2 wb2Var, long j) {
    }

    @Override
    public final void y1(wb2 wb2Var, iq0 iq0Var) {
    }

    @Override
    public final void F(wb2 wb2Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public final void F1(wb2 wb2Var, TLObject tLObject, boolean z) {
    }

    @Override
    public final void K0(wb2 wb2Var, float f2, float f3) {
    }

    @Override
    public final void L(wb2 wb2Var, CharacterStyle characterStyle, boolean z) {
    }

    @Override
    public final void R0(CharSequence charSequence, boolean z, boolean z2) {
    }

    @Override
    public final void a2(wb2 wb2Var, float f2, float f3) {
    }

    @Override
    public final void b1(View view, CharSequence charSequence, boolean z) {
    }

    @Override
    public final void f1(wb2 wb2Var, float f2, float f3) {
    }

    @Override
    public final void h2(wb2 wb2Var, boolean z, boolean z2) {
    }

    @Override
    public final void n0(wb2 wb2Var, int i, int i2) {
    }

    @Override
    public final void r1(wb2 wb2Var, boolean z, boolean z2) {
    }

    @Override
    public final void v(wb2 wb2Var, float f2, float f3) {
    }

    @Override
    public final void W(wb2 wb2Var, TLRPC.User user, float f2, float f3) {
    }

    @Override
    public final void m(wb2 wb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    @Override
    public final void q0(wb2 wb2Var, float f2, float f3, boolean z) {
    }

    @Override
    public final void z(wb2 wb2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void H(wb2 wb2Var, int i, float f2, float f3, boolean z) {
    }

    @Override
    public final void V0(wb2 wb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f2, float f3) {
    }

    @Override
    public final void c1(wb2 wb2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    @Override
    public final void x(CharSequence charSequence, boolean z, int i, int i2, long j) {
    }

    @Override
    public final void H1(int i, int i2, int i3, long j, long j2, boolean z) {
    }

    @Override
    public final void T1(wb2 wb2Var, TLRPC.Chat chat, int i, float f2, float f3, boolean z) {
    }

    @Override
    public final void t1(r47 r47Var, String str, String str2, String str3, String str4, int i, int i2) {
    }
}
