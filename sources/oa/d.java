package oa;

import a3.n0;
import ah.t;
import android.text.style.CharacterStyle;
import android.util.Log;
import b2.b2;
import b2.x0;
import c3.b0;
import c3.i0;
import c3.q;
import c5.c0;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.tasks.OnFailureListener;
import g2.j;
import g2.u;
import g2.x;
import gb.p;
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
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.hh;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Wallet.k5;
import org.telegram.ui.vv0;
import y2.k;
import z3.l;
import z3.n;
public final class d implements n0, androidx.car.app.messaging.model.b, q, cg.a, dg.a, ea.c, p, ti, w, r9.d, l1, n5.b, r4.c, OnFailureListener, l {
    public static d f16321b;
    public static d f16322c;
    public final int f16323a;

    public d(int i10) {
        this.f16323a = i10;
    }

    public static String K3(cd.c cVar) {
        String str = cVar.f4733a;
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
        if (f16322c == null) {
            f16322c = new d(28);
        }
        f16322c.getClass();
        return Calendar.getInstance();
    }

    public static k4.d x3(k5 k5Var, c0 c0Var) {
        IOException iOException = (IOException) c0Var.f4356c;
        if (iOException instanceof x) {
            int i10 = ((x) iOException).f9917c;
            if (i10 == 403 || i10 == 404 || i10 == 410 || i10 == 416 || i10 == 500 || i10 == 503) {
                if (k5Var.b(1)) {
                    return new k4.d(1, 300000L);
                }
                if (k5Var.b(2)) {
                    return new k4.d(2, 60000L);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static long z3(c0 c0Var) {
        for (Throwable th2 = (IOException) c0Var.f4356c; th2 != null; th2 = th2.getCause()) {
            if (!(th2 instanceof x0) && !(th2 instanceof FileNotFoundException) && !(th2 instanceof u) && !(th2 instanceof k)) {
                if ((th2 instanceof j) && ((j) th2).f9876a == 2008) {
                    return -9223372036854775807L;
                }
            } else {
                return -9223372036854775807L;
            }
        }
        return Math.min((c0Var.f4355b - 1) * 1000, 5000);
    }

    @Override
    public void A(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 >= i11) {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalArgumentException(i2.d.j(i12, "Illegal use of DownsampleAudioResampler. Channels:"));
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
    public void A0(u1 u1Var, TLObject tLObject, boolean z10) {
        int i10 = this.f16323a;
    }

    @Override
    public boolean A1(u1 u1Var, TLRPC.Chat chat) {
        switch (this.f16323a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void B(u1 u1Var) {
        int i10 = this.f16323a;
    }

    @Override
    public void B0(u1 u1Var, float f7, float f10) {
        int i10 = this.f16323a;
    }

    @Override
    public void B1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f16323a;
    }

    @Override
    public void C(u1 u1Var) {
        int i10 = this.f16323a;
    }

    @Override
    public boolean C1() {
        switch (this.f16323a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void D() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void D0(u1 u1Var) {
        int i10 = this.f16323a;
    }

    @Override
    public void E(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.f16323a;
    }

    @Override
    public void E1(u1 u1Var) {
        int i10 = this.f16323a;
    }

    @Override
    public void F0(u1 u1Var) {
        int i10 = this.f16323a;
    }

    @Override
    public void G(u1 u1Var) {
        int i10 = this.f16323a;
    }

    @Override
    public int H(b2.x xVar) {
        return 1;
    }

    @Override
    public void H0(u1 u1Var) {
        int i10 = this.f16323a;
    }

    @Override
    public void H1(MessageObject messageObject) {
        int i10 = this.f16323a;
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.f16323a;
    }

    @Override
    public void J1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.f16323a) {
            case 17:
            default:
                pf.d.r(u1Var.getContext(), str);
                return;
        }
    }

    @Override
    public void K(b0 b0Var) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean K0(long j10) {
        switch (this.f16323a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public CharacterStyle K1(u1 u1Var) {
        switch (this.f16323a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void L(u1 u1Var) {
        int i10 = this.f16323a;
    }

    @Override
    public void L0(u1 u1Var) {
        int i10 = this.f16323a;
    }

    @Override
    public void L1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.f16323a;
    }

    @Override
    public void M(int i10, u1 u1Var) {
        int i11 = this.f16323a;
    }

    @Override
    public boolean M1(u1 u1Var, MessageObject messageObject) {
        switch (this.f16323a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void N(MessageObject messageObject) {
        int i10 = this.f16323a;
    }

    @Override
    public void N0(int i10, u1 u1Var) {
        int i11 = this.f16323a;
    }

    @Override
    public void N1(u1 u1Var, t tVar) {
        int i10 = this.f16323a;
    }

    @Override
    public boolean O(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.f16323a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void O1() {
        int i10 = this.f16323a;
    }

    @Override
    public boolean P() {
        switch (this.f16323a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void P0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.f16323a;
    }

    @Override
    public void P1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.f16323a;
    }

    @Override
    public boolean Q(u1 u1Var) {
        switch (this.f16323a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Q0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        shortBuffer2.put(shortBuffer);
    }

    @Override
    public void Q1(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.f16323a;
    }

    @Override
    public boolean R() {
        switch (this.f16323a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean R1(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f16323a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void S(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f16323a;
    }

    @Override
    public void S0(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.f16323a;
    }

    @Override
    public vv0 S1() {
        switch (this.f16323a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void T(u1 u1Var) {
        int i10 = this.f16323a;
    }

    @Override
    public boolean T0(u1 u1Var, boolean z10) {
        switch (this.f16323a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean T1(long j10) {
        switch (this.f16323a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void U0(u1 u1Var) {
        int i10 = this.f16323a;
    }

    @Override
    public void U1(u1 u1Var, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f16323a;
    }

    @Override
    public int V() {
        switch (this.f16323a) {
            case 17:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public boolean V1(u1 u1Var, TLRPC.TodoItem todoItem) {
        switch (this.f16323a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public i0 W(int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void W0(u1 u1Var) {
        int i10 = this.f16323a;
    }

    @Override
    public void X1(u1 u1Var) {
        int i10 = this.f16323a;
    }

    @Override
    public ih.a Y() {
        switch (this.f16323a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean Z(u1 u1Var) {
        switch (this.f16323a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Z1(u1 u1Var, long j10) {
        int i10 = this.f16323a;
    }

    @Override
    public boolean a0(b2.x xVar) {
        return false;
    }

    @Override
    public boolean a1(int i10, u1 u1Var) {
        switch (this.f16323a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean c() {
        switch (this.f16323a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean c0(u1 u1Var, TLRPC.User user) {
        switch (this.f16323a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void d0(int i10) {
        int i11 = this.f16323a;
    }

    @Override
    public boolean e() {
        switch (this.f16323a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public boolean e0() {
        switch (this.f16323a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean e1(MessageObject messageObject) {
        int i10 = this.f16323a;
        return c1.a(messageObject);
    }

    @Override
    public boolean e2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f16323a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void f0(u1 u1Var, float f7, float f10) {
        int i10 = this.f16323a;
    }

    @Override
    public void f2(u1 u1Var) {
        int i10 = this.f16323a;
    }

    @Override
    public String g(u1 u1Var) {
        switch (this.f16323a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void g1() {
        int i10 = this.f16323a;
    }

    @Override
    public Object mo27get() {
        rb.b bVar = new rb.b(24);
        HashMap hashMap = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            hashMap.put(i5.d.f11323a, new r5.b(30000L, 86400000L, set));
            if (set != null) {
                hashMap.put(i5.d.f11325c, new r5.b(1000L, 86400000L, set));
                if (set != null) {
                    Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(r5.c.f43687b)));
                    if (unmodifiableSet != null) {
                        hashMap.put(i5.d.f11324b, new r5.b(86400000L, 86400000L, unmodifiableSet));
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
        switch (this.f16323a) {
            case 17:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void i(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.f16323a;
    }

    @Override
    public void i0(u1 u1Var) {
        int i10 = this.f16323a;
    }

    @Override
    public void i1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f16323a;
    }

    @Override
    public Object i2() {
        switch (this.f16323a) {
            case 9:
                return new TreeSet();
            default:
                return new ConcurrentHashMap();
        }
    }

    @Override
    public void j() {
        int i10 = this.f16323a;
    }

    @Override
    public void j2() {
        int i10 = this.f16323a;
    }

    @Override
    public boolean l0() {
        switch (this.f16323a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void l1(u1 u1Var, TLRPC.Document document) {
        int i10 = this.f16323a;
    }

    @Override
    public void l2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        int i10 = this.f16323a;
    }

    @Override
    public void m(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.f16323a;
    }

    @Override
    public void n(u1 u1Var) {
        int i10 = this.f16323a;
    }

    @Override
    public void n0(String str) {
        int i10 = this.f16323a;
    }

    @Override
    public Object n2(z5 z5Var) {
        switch (this.f16323a) {
            case 15:
                rb.g gVar = (rb.g) z5Var.a(rb.g.class);
                return new sb.a(0);
            default:
                rb.a aVar = (rb.a) z5Var.a(rb.a.class);
                return new rb.b(0);
        }
    }

    @Override
    public void o() {
        int i10 = this.f16323a;
    }

    @Override
    public boolean o0(b6 b6Var) {
        switch (this.f16323a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
    }

    @Override
    public boolean p2(int i10) {
        switch (this.f16323a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean q(l.k kVar) {
        return false;
    }

    @Override
    public void q0(u1 u1Var, float f7, float f10) {
        int i10 = this.f16323a;
    }

    @Override
    public void q1(u1 u1Var, float f7, float f10) {
        int i10 = this.f16323a;
    }

    @Override
    public void r(u1 u1Var) {
        int i10 = this.f16323a;
    }

    @Override
    public boolean r0() {
        return false;
    }

    @Override
    public void r2() {
        int i10 = this.f16323a;
    }

    @Override
    public void s() {
        int i10 = this.f16323a;
    }

    @Override
    public void s2(u1 u1Var, int i10, int i11) {
        int i12 = this.f16323a;
    }

    @Override
    public void t(u1 u1Var) {
        int i10 = this.f16323a;
    }

    @Override
    public ea.a t0(t7.u uVar, JSONObject jSONObject) {
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
    public p9 t2() {
        switch (this.f16323a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void u(u1 u1Var) {
        int i10 = this.f16323a;
    }

    @Override
    public void u0(u1 u1Var, TLRPC.User user, float f7, float f10) {
        int i10 = this.f16323a;
    }

    @Override
    public void v(hh hhVar) {
        hhVar.run();
    }

    @Override
    public void v0(u1 u1Var, float f7, float f10, boolean z10) {
        int i10 = this.f16323a;
    }

    @Override
    public boolean w() {
        return false;
    }

    @Override
    public boolean w1() {
        switch (this.f16323a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public String x(long j10) {
        switch (this.f16323a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean x0(MessageObject messageObject) {
        switch (this.f16323a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void x1(u1 u1Var) {
        int i10 = this.f16323a;
    }

    @Override
    public n y(b2.x xVar) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override
    public void y0(u1 u1Var) {
        int i10 = this.f16323a;
    }

    @Override
    public void y1(u1 u1Var, boolean z10) {
        int i10 = this.f16323a;
    }

    public int y3(int i10) {
        if (i10 == 7) {
            return 6;
        }
        return 3;
    }

    @Override
    public void z0() {
        int i10 = this.f16323a;
    }

    private final void A3() {
    }

    private final void B3() {
    }

    private final void C0() {
    }

    private final void E0() {
    }

    private final void E3() {
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

    private final void g0() {
    }

    private final void j0() {
    }

    private final void k2() {
    }

    private final void m2() {
    }

    @Override
    public void F() {
    }

    @Override
    public void b() {
    }

    @Override
    public void h() {
    }

    @Override
    public void k() {
    }

    @Override
    public void onFirstFrameRendered() {
    }

    @Override
    public void z() {
    }

    private final void A2(u1 u1Var) {
    }

    private final void B2(u1 u1Var) {
    }

    private final void E2(u1 u1Var) {
    }

    private final void F2(u1 u1Var) {
    }

    private final void G0(u1 u1Var) {
    }

    private final void G2(u1 u1Var) {
    }

    private final void G3(int i10) {
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

    private final void O0(u1 u1Var) {
    }

    private final void R0(u1 u1Var) {
    }

    private final void W1(u1 u1Var) {
    }

    private final void W2(String str) {
    }

    private final void X2(String str) {
    }

    private final void Y1(u1 u1Var) {
    }

    private final void a2(u1 u1Var) {
    }

    private final void b1(u1 u1Var) {
    }

    private final void b2(u1 u1Var) {
    }

    private final void c1(u1 u1Var) {
    }

    private final void c3(u1 u1Var) {
    }

    private final void d1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void d3(u1 u1Var) {
    }

    private final void f1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void g3(u1 u1Var) {
    }

    private final void h1(u1 u1Var) {
    }

    private final void h3(u1 u1Var) {
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

    private final void p0(u1 u1Var) {
    }

    private final void p3(u1 u1Var) {
    }

    private final void q3(u1 u1Var) {
    }

    private final void s1(u1 u1Var) {
    }

    private final void s3(u1 u1Var) {
    }

    private final void t1(u1 u1Var) {
    }

    private final void u3(u1 u1Var) {
    }

    private final void v3(u1 u1Var) {
    }

    private final void w0(u1 u1Var) {
    }

    @Override
    public void J(Object obj) {
    }

    @Override
    public void U(TLRPC.User user) {
    }

    @Override
    public void onVideoSizeChanged(b2 b2Var) {
    }

    private final void C2(u1 u1Var, TLRPC.Document document) {
    }

    private final void D1(int i10, u1 u1Var) {
    }

    private final void D2(u1 u1Var, TLRPC.Document document) {
    }

    private final void G1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void I1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void J0(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void M0(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void X(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void Y2(u1 u1Var, long j10) {
    }

    private final void Z2(u1 u1Var, long j10) {
    }

    private final void g2(int i10, u1 u1Var) {
    }

    private final void h2(int i10, u1 u1Var) {
    }

    private final void k1(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void l(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void m1(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void m3(u1 u1Var, t tVar) {
    }

    private final void n3(u1 u1Var, t tVar) {
    }

    private final void p1(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void r1(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void r3(u1 u1Var, boolean z10) {
    }

    private final void t3(u1 u1Var, boolean z10) {
    }

    private final void z1(int i10, u1 u1Var) {
    }

    @Override
    public void d(l.k kVar, boolean z10) {
    }

    @Override
    public void p(int i10, Object obj) {
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

    private final void Z0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    private final void a(u1 u1Var, float f7, float f10) {
    }

    private final void e3(u1 u1Var, float f7, float f10) {
    }

    private final void f(u1 u1Var, float f7, float f10) {
    }

    private final void f3(u1 u1Var, float f7, float f10) {
    }

    private final void o2(u1 u1Var, float f7, float f10) {
    }

    private final void q2(u1 u1Var, float f7, float f10) {
    }

    private final void u1(u1 u1Var, int i10, int i11) {
    }

    private final void v1(u1 u1Var, int i10, int i11) {
    }

    @Override
    public int F1(int i10, int i11, int i12) {
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

    private final void c2(u1 u1Var, float f7, float f10, boolean z10) {
    }

    private final void d2(u1 u1Var, float f7, float f10, boolean z10) {
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

    private final void V0(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void X0(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void C3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final void D3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override
    public void s0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }

    @Override
    public void b0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
    }
}
