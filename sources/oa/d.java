package oa;

import a3.n0;
import ah.t;
import android.content.Context;
import android.text.style.CharacterStyle;
import android.util.Log;
import b2.a2;
import b2.w0;
import c3.j0;
import c3.q;
import c5.c0;
import com.google.android.gms.internal.cast.z5;
import g2.j;
import g2.u;
import g2.x;
import gb.n;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import l.w;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.ri;
import org.telegram.ui.vu0;
import si.z;
import z3.k;
import z3.m;
public final class d implements n0, androidx.car.app.messaging.model.b, q, cg.a, dg.a, ea.c, n, ri, w, r9.d, l1, n5.b, r4.d, k {
    public static d f17721b;
    public static d f17722c;
    public final int f17723a;

    public d(int i10) {
        this.f17723a = i10;
    }

    public static String K3(cd.c cVar) {
        String str = cVar.f5103a;
        if ("br".equals(str)) {
            return "\n";
        }
        if ("img".equals(str)) {
            String str2 = (String) cVar.a().get("alt");
            if (str2 != null && str2.length() != 0) {
                return str2;
            }
            return "￼";
        } else if ("iframe".equals(str)) {
            return " ";
        } else {
            return null;
        }
    }

    public static void N3(String str) {
        if (str != null && str.length() != 0) {
            if (!str.startsWith("sk_")) {
                return;
            }
            throw new vc.g("Invalid Publishable Key: You are using a secret key to create a token, instead of the publishable one. For more info, see https://stripe.com/docs/stripe.js", null);
        }
        throw new vc.g("Invalid Publishable Key: You must use a valid publishable key to create a token.  For more info, see https://stripe.com/docs/stripe.js.", null);
    }

    public static Calendar w3() {
        if (f17722c == null) {
            f17722c = new d(28);
        }
        f17722c.getClass();
        return Calendar.getInstance();
    }

    public static k4.d x3(z zVar, c0 c0Var) {
        IOException iOException = (IOException) c0Var.f4726c;
        if (iOException instanceof x) {
            int i10 = ((x) iOException).f10824c;
            if (i10 == 403 || i10 == 404 || i10 == 410 || i10 == 416 || i10 == 500 || i10 == 503) {
                if (zVar.a(1)) {
                    return new k4.d(1, 300000L);
                }
                if (zVar.a(2)) {
                    return new k4.d(2, 60000L);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static long z3(c0 c0Var) {
        for (Throwable th2 = (IOException) c0Var.f4726c; th2 != null; th2 = th2.getCause()) {
            if (!(th2 instanceof w0) && !(th2 instanceof FileNotFoundException) && !(th2 instanceof u) && !(th2 instanceof y2.k)) {
                if ((th2 instanceof j) && ((j) th2).f10783a == 2008) {
                    return -9223372036854775807L;
                }
            } else {
                return -9223372036854775807L;
            }
        }
        return Math.min((c0Var.f4725b - 1) * 1000, 5000);
    }

    @Override
    public void A(u1 u1Var) {
        int i10 = this.f17723a;
    }

    @Override
    public void A0(u1 u1Var, float f7, float f10) {
        int i10 = this.f17723a;
    }

    @Override
    public void A1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f17723a;
    }

    @Override
    public void B(u1 u1Var) {
        int i10 = this.f17723a;
    }

    @Override
    public boolean B1() {
        switch (this.f17723a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void C(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 >= i11) {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalArgumentException(i2.e.j(i12, "Illegal use of DownsampleAudioResampler. Channels:"));
            }
            int remaining = shortBuffer.remaining() / i12;
            int ceil = (int) Math.ceil((i11 / i10) * remaining);
            int i13 = remaining - ceil;
            float f7 = ceil;
            float f10 = f7 / f7;
            float f11 = i13;
            float f12 = f11 / f11;
            while (ceil > 0 && i13 > 0) {
                if (f10 >= f12) {
                    shortBuffer2.put(shortBuffer.get());
                    if (i12 == 2) {
                        shortBuffer2.put(shortBuffer.get());
                    }
                    ceil--;
                    f10 = ceil / f7;
                } else {
                    shortBuffer.position(shortBuffer.position() + i12);
                    i13--;
                    f12 = i13 / f11;
                }
            }
            return;
        }
        throw new IllegalArgumentException("Illegal use of DownsampleAudioResampler");
    }

    @Override
    public void C0(u1 u1Var) {
        int i10 = this.f17723a;
    }

    @Override
    public void D(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.f17723a;
    }

    @Override
    public void D1(u1 u1Var) {
        int i10 = this.f17723a;
    }

    @Override
    public void E0(u1 u1Var) {
        int i10 = this.f17723a;
    }

    @Override
    public void F(u1 u1Var) {
        int i10 = this.f17723a;
    }

    @Override
    public void F1(MessageObject messageObject) {
        int i10 = this.f17723a;
    }

    @Override
    public void G(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.f17723a;
    }

    @Override
    public void G0(u1 u1Var) {
        int i10 = this.f17723a;
    }

    @Override
    public void G1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.f17723a) {
            case 17:
            default:
                pf.d.r(u1Var.getContext(), str);
                return;
        }
    }

    @Override
    public void H() {
        throw new UnsupportedOperationException();
    }

    @Override
    public CharacterStyle H1(u1 u1Var) {
        switch (this.f17723a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void I(u1 u1Var) {
        int i10 = this.f17723a;
    }

    @Override
    public void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.f17723a;
    }

    @Override
    public boolean J0(long j10) {
        switch (this.f17723a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean J1(u1 u1Var, MessageObject messageObject) {
        switch (this.f17723a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void K(int i10, u1 u1Var) {
        int i11 = this.f17723a;
    }

    @Override
    public void K0(u1 u1Var) {
        int i10 = this.f17723a;
    }

    @Override
    public void K1(u1 u1Var, t tVar) {
        int i10 = this.f17723a;
    }

    @Override
    public int L(b2.w wVar) {
        return 1;
    }

    @Override
    public void L1() {
        int i10 = this.f17723a;
    }

    @Override
    public void M(MessageObject messageObject) {
        int i10 = this.f17723a;
    }

    @Override
    public void M0(int i10, u1 u1Var) {
        int i11 = this.f17723a;
    }

    @Override
    public void M1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.f17723a;
    }

    @Override
    public boolean N(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.f17723a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void N1(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.f17723a;
    }

    @Override
    public void O0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.f17723a;
    }

    @Override
    public boolean O1(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f17723a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean P() {
        switch (this.f17723a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void P0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        shortBuffer2.put(shortBuffer);
    }

    @Override
    public vu0 P1() {
        switch (this.f17723a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean Q(u1 u1Var) {
        switch (this.f17723a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean Q1(long j10) {
        switch (this.f17723a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean R() {
        switch (this.f17723a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void R0(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.f17723a;
    }

    @Override
    public void R1(u1 u1Var, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f17723a;
    }

    @Override
    public void S(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f17723a;
    }

    @Override
    public boolean S0(u1 u1Var, boolean z10) {
        switch (this.f17723a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean S1(u1 u1Var, TLRPC.TodoItem todoItem) {
        switch (this.f17723a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void T(u1 u1Var) {
        int i10 = this.f17723a;
    }

    @Override
    public void T0(u1 u1Var) {
        int i10 = this.f17723a;
    }

    @Override
    public void U1(u1 u1Var) {
        int i10 = this.f17723a;
    }

    @Override
    public int V() {
        switch (this.f17723a) {
            case 17:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void V0(u1 u1Var) {
        int i10 = this.f17723a;
    }

    @Override
    public ih.a W() {
        switch (this.f17723a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void W1(u1 u1Var, long j10) {
        int i10 = this.f17723a;
    }

    @Override
    public boolean Z(u1 u1Var) {
        switch (this.f17723a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean Z0(int i10, u1 u1Var) {
        switch (this.f17723a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean a0(b2.w wVar) {
        return false;
    }

    @Override
    public boolean b2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f17723a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean c() {
        switch (this.f17723a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean c0(u1 u1Var, TLRPC.User user) {
        switch (this.f17723a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void c2(u1 u1Var) {
        int i10 = this.f17723a;
    }

    @Override
    public void d0(int i10) {
        int i11 = this.f17723a;
    }

    @Override
    public boolean d1(MessageObject messageObject) {
        int i10 = this.f17723a;
        return c1.a(messageObject);
    }

    @Override
    public boolean e() {
        switch (this.f17723a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public boolean e0() {
        switch (this.f17723a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void f0(u1 u1Var, float f7, float f10) {
        int i10 = this.f17723a;
    }

    @Override
    public void f1() {
        int i10 = this.f17723a;
    }

    @Override
    public Object f2() {
        switch (this.f17723a) {
            case 9:
                return new TreeSet();
            default:
                return new ConcurrentHashMap();
        }
    }

    @Override
    public String g(u1 u1Var) {
        switch (this.f17723a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void g0(c3.c0 c0Var) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void g2() {
        int i10 = this.f17723a;
    }

    @Override
    public Object mo27get() {
        rb.b bVar = new rb.b(24);
        HashMap hashMap = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            hashMap.put(i5.d.f12710a, new r5.b(30000L, 86400000L, set));
            if (set != null) {
                hashMap.put(i5.d.f12712c, new r5.b(1000L, 86400000L, set));
                if (set != null) {
                    Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(r5.c.f45015b)));
                    if (unmodifiableSet != null) {
                        hashMap.put(i5.d.f12711b, new r5.b(86400000L, 86400000L, unmodifiableSet));
                        if (hashMap.keySet().size() >= i5.d.values().length) {
                            new HashMap();
                            return new r5.a(bVar, hashMap);
                        }
                        throw new IllegalStateException("Not all priorities have been configured");
                    }
                    throw new NullPointerException("Null flags");
                }
                throw new NullPointerException("Null flags");
            }
            throw new NullPointerException("Null flags");
        }
        throw new NullPointerException("Null flags");
    }

    @Override
    public int h0(u1 u1Var) {
        switch (this.f17723a) {
            case 17:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void h1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f17723a;
    }

    @Override
    public void i(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.f17723a;
    }

    @Override
    public void i0(u1 u1Var) {
        int i10 = this.f17723a;
    }

    @Override
    public void i2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        int i10 = this.f17723a;
    }

    @Override
    public void j() {
        int i10 = this.f17723a;
    }

    @Override
    public j0 j0(int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object j2(z5 z5Var) {
        switch (this.f17723a) {
            case 15:
                rb.g gVar = (rb.g) z5Var.a(rb.g.class);
                return new sb.a(0);
            case 16:
                rb.a aVar = (rb.a) z5Var.a(rb.a.class);
                return new rb.b(0);
            default:
                return new rb.k((Context) z5Var.a(Context.class));
        }
    }

    @Override
    public void k1(u1 u1Var, TLRPC.Document document) {
        int i10 = this.f17723a;
    }

    @Override
    public void l(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.f17723a;
    }

    @Override
    public boolean l0() {
        switch (this.f17723a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean l2(int i10) {
        switch (this.f17723a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void m(u1 u1Var) {
        int i10 = this.f17723a;
    }

    @Override
    public void n() {
        int i10 = this.f17723a;
    }

    @Override
    public void n0(String str) {
        int i10 = this.f17723a;
    }

    @Override
    public void n2() {
        int i10 = this.f17723a;
    }

    @Override
    public boolean o0(a6 a6Var) {
        switch (this.f17723a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void o2(u1 u1Var, int i10, int i11) {
        int i12 = this.f17723a;
    }

    @Override
    public void p(u1 u1Var) {
        int i10 = this.f17723a;
    }

    @Override
    public boolean p0() {
        return false;
    }

    @Override
    public void p1(u1 u1Var, float f7, float f10) {
        int i10 = this.f17723a;
    }

    @Override
    public o9 p2() {
        switch (this.f17723a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void q() {
        int i10 = this.f17723a;
    }

    @Override
    public void q0(u1 u1Var, float f7, float f10) {
        int i10 = this.f17723a;
    }

    @Override
    public boolean r(l.k kVar) {
        return false;
    }

    @Override
    public void s(u1 u1Var) {
        int i10 = this.f17723a;
    }

    @Override
    public ea.a s0(t7.u uVar, JSONObject jSONObject) {
        com.google.android.gms.internal.cast.a aVar;
        long currentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        if (jSONObject.has("session")) {
            aVar = new com.google.android.gms.internal.cast.a(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8));
        } else {
            aVar = new com.google.android.gms.internal.cast.a(new JSONObject().optInt("max_custom_exception_events", 8));
        }
        com.google.android.gms.internal.cast.a aVar2 = aVar;
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        bc.d dVar = new bc.d(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j10 = optInt;
        if (jSONObject.has("expires_at")) {
            currentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            currentTimeMillis = (j10 * 1000) + System.currentTimeMillis();
        }
        return new ea.a(currentTimeMillis, aVar2, dVar, optDouble, optDouble2, optInt2);
    }

    @Override
    public void t(u1 u1Var) {
        int i10 = this.f17723a;
    }

    @Override
    public void u(gh ghVar) {
        ghVar.run();
    }

    @Override
    public void u0(u1 u1Var, TLRPC.User user, float f7, float f10) {
        int i10 = this.f17723a;
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    public void v0(u1 u1Var, float f7, float f10, boolean z10) {
        int i10 = this.f17723a;
    }

    @Override
    public boolean v1() {
        switch (this.f17723a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public String w(long j10) {
        switch (this.f17723a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean w0(MessageObject messageObject) {
        switch (this.f17723a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void w1(u1 u1Var) {
        int i10 = this.f17723a;
    }

    @Override
    public void x() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override
    public void x0(u1 u1Var) {
        int i10 = this.f17723a;
    }

    @Override
    public void x1(u1 u1Var, boolean z10) {
        int i10 = this.f17723a;
    }

    @Override
    public m y(b2.w wVar) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override
    public void y0() {
        int i10 = this.f17723a;
    }

    public int y3(int i10) {
        if (i10 == 7) {
            return 6;
        }
        return 3;
    }

    @Override
    public void z(int i10, Object obj) {
        String str;
        switch (i10) {
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
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
    }

    @Override
    public void z0(u1 u1Var, TLObject tLObject, boolean z10) {
        int i10 = this.f17723a;
    }

    @Override
    public boolean z1(u1 u1Var, TLRPC.Chat chat) {
        switch (this.f17723a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    private final void A3() {
    }

    private final void B3() {
    }

    private final void D0() {
    }

    private final void E3() {
    }

    private final void F0() {
    }

    private final void F3() {
    }

    private final void I3() {
    }

    private final void J3() {
    }

    private final void O2() {
    }

    private final void O3() {
    }

    private final void P2() {
    }

    private final void P3() {
    }

    private final void Y() {
    }

    private final void o() {
    }

    private final void q2() {
    }

    private final void r2() {
    }

    @Override
    public void E() {
    }

    @Override
    public void J() {
    }

    @Override
    public void U() {
    }

    @Override
    public void k() {
    }

    @Override
    public void onFirstFrameRendered() {
    }

    private final void A2(u1 u1Var) {
    }

    private final void B0(u1 u1Var) {
    }

    private final void B2(u1 u1Var) {
    }

    private final void E2(u1 u1Var) {
    }

    private final void F2(u1 u1Var) {
    }

    private final void G2(u1 u1Var) {
    }

    private final void G3(int i10) {
    }

    private final void H0(u1 u1Var) {
    }

    private final void H2(u1 u1Var) {
    }

    private final void H3(int i10) {
    }

    private final void I0(u1 u1Var) {
    }

    private final void I2(u1 u1Var) {
    }

    private final void J2(u1 u1Var) {
    }

    private final void L3(MessageObject messageObject) {
    }

    private final void M2(u1 u1Var) {
    }

    private final void M3(MessageObject messageObject) {
    }

    private final void N2(u1 u1Var) {
    }

    private final void Q0(u1 u1Var) {
    }

    private final void U0(u1 u1Var) {
    }

    private final void W2(String str) {
    }

    private final void X2(String str) {
    }

    private final void Y1(u1 u1Var) {
    }

    private final void Z1(u1 u1Var) {
    }

    private final void a2(u1 u1Var) {
    }

    private final void b1(u1 u1Var) {
    }

    private final void c1(u1 u1Var) {
    }

    private final void c3(u1 u1Var) {
    }

    private final void d2(u1 u1Var) {
    }

    private final void d3(u1 u1Var) {
    }

    private final void e1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void g1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void g3(u1 u1Var) {
    }

    private final void h3(u1 u1Var) {
    }

    private final void i1(u1 u1Var) {
    }

    private final void i3(MessageObject messageObject) {
    }

    private final void j1(u1 u1Var) {
    }

    private final void j3(MessageObject messageObject) {
    }

    private final void k0(u1 u1Var) {
    }

    private final void k3(u1 u1Var) {
    }

    private final void l3(u1 u1Var) {
    }

    private final void m0(u1 u1Var) {
    }

    private final void n1(u1 u1Var) {
    }

    private final void o1(u1 u1Var) {
    }

    private final void o3(u1 u1Var) {
    }

    private final void p3(u1 u1Var) {
    }

    private final void q3(u1 u1Var) {
    }

    private final void s1(u1 u1Var) {
    }

    private final void s3(u1 u1Var) {
    }

    private final void t0(u1 u1Var) {
    }

    private final void t1(u1 u1Var) {
    }

    private final void u3(u1 u1Var) {
    }

    private final void v3(u1 u1Var) {
    }

    @Override
    public void O(Object obj) {
    }

    @Override
    public void X(TLRPC.User user) {
    }

    @Override
    public void onVideoSizeChanged(a2 a2Var) {
    }

    private final void C1(int i10, u1 u1Var) {
    }

    private final void C2(u1 u1Var, TLRPC.Document document) {
    }

    private final void D2(u1 u1Var, TLRPC.Document document) {
    }

    private final void L0(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void N0(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void T1(int i10, u1 u1Var) {
    }

    private final void V1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void X1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void Y2(u1 u1Var, long j10) {
    }

    private final void Z2(u1 u1Var, long j10) {
    }

    private final void f(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void h(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void k2(int i10, u1 u1Var) {
    }

    private final void l1(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void m1(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void m2(int i10, u1 u1Var) {
    }

    private final void m3(u1 u1Var, t tVar) {
    }

    private final void n3(u1 u1Var, t tVar) {
    }

    private final void q1(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void r1(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void r3(u1 u1Var, boolean z10) {
    }

    private final void t3(u1 u1Var, boolean z10) {
    }

    @Override
    public void d(l.k kVar, boolean z10) {
    }

    private final void K2(u1 u1Var, float f7, float f10) {
    }

    private final void L2(u1 u1Var, float f7, float f10) {
    }

    private final void Q2(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void R2(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void Y0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    private final void a(u1 u1Var, float f7, float f10) {
    }

    private final void a1(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    private final void b(u1 u1Var, float f7, float f10) {
    }

    private final void e3(u1 u1Var, float f7, float f10) {
    }

    private final void f3(u1 u1Var, float f7, float f10) {
    }

    private final void s2(u1 u1Var, float f7, float f10) {
    }

    private final void t2(u1 u1Var, float f7, float f10) {
    }

    private final void u1(u1 u1Var, int i10, int i11) {
    }

    private final void y1(u1 u1Var, int i10, int i11) {
    }

    @Override
    public int E1(int i10, int i11, int i12) {
        return i10;
    }

    private final void S2(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void T2(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void U2(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void V2(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void e2(u1 u1Var, float f7, float f10, boolean z10) {
    }

    private final void h2(u1 u1Var, float f7, float f10, boolean z10) {
    }

    private final void u2(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void v2(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void a3(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void b3(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void w2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void x2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void y2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void z2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void W0(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void X0(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void C3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final void D3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override
    public void r0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }

    @Override
    public void b0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
    }
}
