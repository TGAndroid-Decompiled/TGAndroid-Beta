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
public final class jk2 implements by2, qwc, lr2, u1e, z0c, d40, uz1, i40, lv8, mc2, rp5, ft8, am0, iaa, w23 {
    public final byte a;
    public static final jk2 b = new jk2((byte) 1);
    public static final String[] c = new String[0];
    public static final jk2 d = new jk2((byte) 3);
    public static final jk2 e = new jk2((byte) 4);
    public static final jk2 f = new jk2((byte) 5);
    public static final jk2 h = new jk2((byte) 6);
    public static final jk2 n = new jk2((byte) 7);
    public static final jk2 r = new jk2((byte) 8);
    public static final jk2 s = new jk2((byte) 9);
    public static final jk2 w = new jk2((byte) 10);
    public static final jk2 x = new jk2((byte) 11);
    public static final jk2 y = new jk2((byte) 12);
    public static final jk2 E = new jk2((byte) 13);

    public jk2() {
        this.a = (byte) 18;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    public static wx2 S1(Editable editable, int i) {
        Object[] objArr = (wx2[]) editable.getSpans(0, editable.length(), wx2.class);
        if (objArr.length != 0) {
            for (int length = objArr.length; length > 0; length--) {
                int i2 = length - 1;
                if (editable.getSpanFlags(objArr[i2]) == 17) {
                    wx2 wx2Var = objArr[i2];
                    if (wx2Var.a == i) {
                        return wx2Var;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static boolean T1(boolean z, String str, Editable editable, Attributes attributes) {
        byte b2;
        Object obj = null;
        boolean z2 = false;
        if (str.startsWith("animated-emoji")) {
            if (z) {
                String a = vx2.a("data-document-id", attributes);
                if (a != null) {
                    editable.setSpan(new gn(Long.parseLong(a), (Paint.FontMetricsInt) null), editable.length(), editable.length(), 17);
                    return true;
                }
            } else {
                Object[] spans = editable.getSpans(0, editable.length(), gn.class);
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
                Object obj2 = (gn) obj;
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
                editable.setSpan(new wx2(0), editable.length(), editable.length(), 17);
                return true;
            }
            Object S1 = S1(editable, 0);
            if (S1 != null) {
                int spanStart2 = editable.getSpanStart(S1);
                editable.removeSpan(S1);
                if (spanStart2 != editable.length()) {
                    editable.setSpan(S1, spanStart2, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        } else if (str.equals("pre")) {
            if (z) {
                String a2 = vx2.a("language", attributes);
                if (a2 == null) {
                    a2 = vx2.a("lang", attributes);
                }
                if (a2 == null) {
                    a2 = vx2.a("lng", attributes);
                }
                editable.setSpan(new wx2(a2), editable.length(), editable.length(), 17);
                return true;
            }
            Object S12 = S1(editable, 1);
            if (S12 != null) {
                int spanStart3 = editable.getSpanStart(S12);
                editable.removeSpan(S12);
                if (spanStart3 != editable.length()) {
                    editable.setSpan(S12, spanStart3, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        } else {
            int i2 = 3;
            if (str.equals("blockquote")) {
                if (z) {
                    String a3 = vx2.a("class", attributes);
                    if (vx2.a("data-collapsed", attributes) != null || (a3 != null && a3.contains("telegram-collapsed-quote"))) {
                        z2 = true;
                    }
                    if (!z2) {
                        i2 = 2;
                    }
                    editable.setSpan(new wx2(i2), editable.length(), editable.length(), 17);
                    return true;
                }
                wx2[] wx2VarArr = (wx2[]) editable.getSpans(0, editable.length(), wx2.class);
                for (int length2 = wx2VarArr.length - 1; length2 >= 0; length2--) {
                    wx2 wx2Var = wx2VarArr[length2];
                    if (editable.getSpanFlags(wx2Var) == 17 && ((b2 = wx2Var.a) == 2 || b2 == 3)) {
                        obj = wx2Var;
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
                    editable.setSpan(new wx2(3), editable.length(), editable.length(), 17);
                    return true;
                }
                Object S13 = S1(editable, 3);
                if (S13 != null) {
                    int spanStart5 = editable.getSpanStart(S13);
                    editable.removeSpan(S13);
                    if (spanStart5 != editable.length()) {
                        editable.setSpan(S13, spanStart5, editable.length(), 33);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    @Override
    public final boolean A0(long j) {
        return false;
    }

    @Override
    public final int B0() {
        return 0;
    }

    @Override
    public final TL_stories.StoryItem C0() {
        return null;
    }

    @Override
    public final void D() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override
    public final boolean D1(gn gnVar) {
        return false;
    }

    @Override
    public final boolean E(rc2 rc2Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final boolean E0(long j) {
        return false;
    }

    @Override
    public final boolean G0() {
        return false;
    }

    @Override
    public final nv1 J() {
        return null;
    }

    @Override
    public final boolean J0(rc2 rc2Var, TLRPC.TodoItem todoItem, boolean z) {
        return false;
    }

    @Override
    public final boolean K() {
        return false;
    }

    @Override
    public final boolean K0() {
        return false;
    }

    @Override
    public final int K1() {
        return 1711276032;
    }

    @Override
    public final pc8 M1() {
        return null;
    }

    @Override
    public final boolean N() {
        return false;
    }

    @Override
    public final int O() {
        return 0;
    }

    @Override
    public final boolean O1(long j) {
        return false;
    }

    @Override
    public final String P0(rc2 rc2Var) {
        return null;
    }

    @Override
    public final int Q(rc2 rc2Var) {
        return 0;
    }

    @Override
    public final String[] R0() {
        return c;
    }

    @Override
    public final hw1 S() {
        return null;
    }

    @Override
    public final boolean S0(rc2 rc2Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final boolean U1(k47 k47Var) {
        return true;
    }

    @Override
    public final int V() {
        return 872415231;
    }

    @Override
    public final Object X(sm2 sm2Var) {
        return new hjd((ovd) sm2Var.a(ovd.class), (f64) sm2Var.a(f64.class));
    }

    @Override
    public final boolean Y1(rc2 rc2Var, TLRPC.User user) {
        return false;
    }

    @Override
    public final boolean Z() {
        return false;
    }

    @Override
    public final boolean Z1(rc2 rc2Var) {
        return false;
    }

    @Override
    public final CharacterStyle a0(rc2 rc2Var) {
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
    public final boolean b0() {
        return true;
    }

    @Override
    public final WebViewProviderBoundaryInterface createWebView(WebView webView) {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override
    public final boolean d0() {
        return false;
    }

    @Override
    public final boolean d1() {
        return false;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final qp5 f1(wm4 wm4Var) {
        return new sp5(wm4Var);
    }

    @Override
    public final void g(int i, Serializable serializable) {
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
    public final int g0() {
        return 0;
    }

    @Override
    public final float g1() {
        return 0.0f;
    }

    @Override
    public final Object mo8get() {
        return wac.a;
    }

    @Override
    public final StaticsBoundaryInterface getStatics() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override
    public final boolean h() {
        return false;
    }

    @Override
    public final int h1() {
        return 0;
    }

    @Override
    public final int j() {
        return 0;
    }

    @Override
    public final void j0(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2) {
        i40 i40Var;
        switch (this.a) {
            case 17:
                if (i == 6) {
                    i40Var = i40.l;
                } else if (i > i2) {
                    i40Var = i40.i;
                } else if (i < i2) {
                    i40Var = i40.j;
                } else {
                    i40Var = i40.k;
                }
                i40Var.j0(shortBuffer, i, shortBuffer2, i2);
                return;
            default:
                if (i2 != 1 && i2 != 2) {
                    u36.j("Output must be 2 or 1 channels");
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
                        shortBuffer2.put(k4f.z3(s2, s3));
                    }
                }
                return;
        }
    }

    @Override
    public final TLRPC.Peer l() {
        return null;
    }

    @Override
    public final boolean l0(rc2 rc2Var, boolean z) {
        return false;
    }

    @Override
    public final boolean l1() {
        return false;
    }

    @Override
    public final boolean m1(k47 k47Var) {
        return aq1.a(k47Var);
    }

    @Override
    public final boolean m2(int i) {
        return false;
    }

    @Override
    public final boolean n1(rc2 rc2Var, int i) {
        return false;
    }

    @Override
    public final boolean n2(rc2 rc2Var, k47 k47Var) {
        return false;
    }

    @Override
    public final boolean p0(rc2 rc2Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final int p1(int i, int i2, int i3) {
        i40 i40Var;
        switch (this.a) {
            case 17:
                if (i2 == 6) {
                    i40Var = i40.l;
                } else if (i2 > i3) {
                    i40Var = i40.i;
                } else if (i2 < i3) {
                    i40Var = i40.j;
                } else {
                    i40Var = i40.k;
                }
                return i40Var.p1(i, i2, i3);
            default:
                return (i / i2) * i3;
        }
    }

    @Override
    public final hkb p2() {
        return null;
    }

    @Override
    public final r9a q0(k1f k1fVar, JSONObject jSONObject) {
        g40 g40Var;
        long currentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        if (jSONObject.has("session")) {
            g40Var = new g40(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8));
        } else {
            g40Var = new g40(new JSONObject().optInt("max_custom_exception_events", 8));
        }
        g40 g40Var2 = g40Var;
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        j10 j10Var = new j10(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j = optInt;
        if (jSONObject.has("expires_at")) {
            currentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            currentTimeMillis = (j * 1000) + System.currentTimeMillis();
        }
        return new r9a(currentTimeMillis, g40Var2, j10Var, optDouble, optDouble2, optInt2);
    }

    @Override
    public final int r1() {
        return 0;
    }

    @Override
    public final String t(long j) {
        return null;
    }

    @Override
    public final boolean t0(rc2 rc2Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final int u0() {
        return 352321535;
    }

    @Override
    public final float w0() {
        return -1.0f;
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers x() {
        return null;
    }

    @Override
    public final boolean x0(rc2 rc2Var) {
        return false;
    }

    @Override
    public final void x1(rc2 rc2Var, TLRPC.WebPage webPage, String str, boolean z) {
        l11.u(rc2Var.getContext(), str);
    }

    @Override
    public final float y0() {
        return -1.0f;
    }

    @Override
    public final boolean z1() {
        return false;
    }

    @Override
    public final Object zza() {
        throw new IllegalStateException();
    }

    public jk2(byte b2) {
        this.a = b2;
    }

    @Override
    public final void A1() {
    }

    @Override
    public final void B() {
    }

    @Override
    public final void C1() {
    }

    @Override
    public final void G1() {
    }

    @Override
    public final void H1() {
    }

    @Override
    public final void I() {
    }

    @Override
    public final void I0() {
    }

    @Override
    public final void L() {
    }

    @Override
    public final void O0() {
    }

    @Override
    public final void R1() {
    }

    @Override
    public final void T0() {
    }

    @Override
    public final void W0() {
    }

    @Override
    public final void Y0() {
    }

    @Override
    public final void a() {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void c0() {
    }

    @Override
    public final void e() {
    }

    @Override
    public final void e1() {
    }

    @Override
    public final void f0() {
    }

    @Override
    public final void g2() {
    }

    @Override
    public final void i() {
    }

    @Override
    public final void j1() {
    }

    @Override
    public final void n() {
    }

    @Override
    public final void n0() {
    }

    @Override
    public final void o2() {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void s0() {
    }

    @Override
    public final void s1() {
    }

    @Override
    public final void v() {
    }

    @Override
    public final void A(rc2 rc2Var) {
    }

    @Override
    public final void C(boolean z) {
    }

    @Override
    public final void E1(boolean z) {
    }

    @Override
    public final void F0(rc2 rc2Var) {
    }

    @Override
    public final void G(rc2 rc2Var) {
    }

    @Override
    public final void J1(rc2 rc2Var) {
    }

    @Override
    public final void L1(rc2 rc2Var) {
    }

    @Override
    public final void M0(rc2 rc2Var) {
    }

    @Override
    public final void P(rc2 rc2Var) {
    }

    @Override
    public final void Q0(rc2 rc2Var) {
    }

    @Override
    public final void Q1(rc2 rc2Var) {
    }

    @Override
    public final void R(rc2 rc2Var) {
    }

    @Override
    public final void T(k47 k47Var) {
    }

    @Override
    public final void U0(rc2 rc2Var) {
    }

    @Override
    public final void X0(rc2 rc2Var) {
    }

    @Override
    public final void Y(int i) {
    }

    @Override
    public final void Z0(rc2 rc2Var) {
    }

    @Override
    public final void c1(CharSequence charSequence) {
    }

    @Override
    public final void d(String str) {
    }

    @Override
    public final void e0(k47 k47Var) {
    }

    @Override
    public final void h0(String str) {
    }

    @Override
    public final void i2(rc2 rc2Var) {
    }

    @Override
    public final void k(rc2 rc2Var) {
    }

    @Override
    public final void k0(rc2 rc2Var) {
    }

    @Override
    public final void k1(rc2 rc2Var) {
    }

    @Override
    public final void o(float f2) {
    }

    @Override
    public final void p(boolean z) {
    }

    @Override
    public final void q1(h47 h47Var) {
    }

    @Override
    public final void q2(rc2 rc2Var) {
    }

    @Override
    public final void v1(int i) {
    }

    @Override
    public final void y1(rc2 rc2Var) {
    }

    @Override
    public final void z0(int i) {
    }

    @Override
    public final void B1(rc2 rc2Var, ir0 ir0Var) {
    }

    @Override
    public final void D0(rc2 rc2Var, boolean z) {
    }

    @Override
    public final void L0(rc2 rc2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void N1(String str, String str2) {
    }

    @Override
    public final void P1(rc2 rc2Var, n28 n28Var) {
    }

    @Override
    public final void U(rc2 rc2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void X1(rc2 rc2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void i0(rc2 rc2Var, int i) {
    }

    @Override
    public final void m0(rc2 rc2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void o1(rc2 rc2Var, boolean z) {
    }

    @Override
    public final void s(String str, Throwable th) {
    }

    @Override
    public final void t1(rc2 rc2Var, int i) {
    }

    @Override
    public final void v0(rc2 rc2Var, long j) {
    }

    @Override
    public final void y(float f2, int i) {
    }

    @Override
    public final void F(rc2 rc2Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public final void H0(CharSequence charSequence, boolean z, boolean z2) {
    }

    @Override
    public final void I1(rc2 rc2Var, TLObject tLObject, boolean z) {
    }

    @Override
    public final void M(rc2 rc2Var, CharacterStyle characterStyle, boolean z) {
    }

    @Override
    public final void N0(rc2 rc2Var, float f2, float f3) {
    }

    @Override
    public final void a1(View view, CharSequence charSequence, boolean z) {
    }

    @Override
    public final void d2(rc2 rc2Var, float f2, float f3) {
    }

    @Override
    public final void i1(rc2 rc2Var, float f2, float f3) {
    }

    @Override
    public final void l2(rc2 rc2Var, boolean z, boolean z2) {
    }

    @Override
    public final void o0(rc2 rc2Var, int i, int i2) {
    }

    @Override
    public final void u(rc2 rc2Var, float f2, float f3) {
    }

    @Override
    public final void u1(rc2 rc2Var, boolean z, boolean z2) {
    }

    @Override
    public final void W(rc2 rc2Var, TLRPC.User user, float f2, float f3) {
    }

    @Override
    public final void m(rc2 rc2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    @Override
    public final void r0(rc2 rc2Var, float f2, float f3, boolean z) {
    }

    @Override
    public final void z(rc2 rc2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void H(rc2 rc2Var, int i, float f2, float f3, boolean z) {
    }

    @Override
    public final void V0(rc2 rc2Var, TLRPC.ReactionCount reactionCount, boolean z, float f2, float f3) {
    }

    @Override
    public final void b1(rc2 rc2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    @Override
    public final void w(CharSequence charSequence, boolean z, int i, int i2, long j) {
    }

    @Override
    public final void F1(int i, int i2, int i3, long j, long j2, boolean z) {
    }

    @Override
    public final void W1(rc2 rc2Var, TLRPC.Chat chat, int i, float f2, float f3, boolean z) {
    }

    @Override
    public final void w1(k47 k47Var, String str, String str2, String str3, String str4, int i, int i2) {
    }
}
