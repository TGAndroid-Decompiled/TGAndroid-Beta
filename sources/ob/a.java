package ob;

import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.text.style.CharacterStyle;
import android.view.View;
import b2.s;
import b4.i;
import c3.b0;
import c3.h0;
import c3.q;
import ci.u5;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import da.b;
import da.d;
import e2.d0;
import f4.e;
import fb.n;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import n2.g;
import n2.j;
import n2.l;
import n2.m;
import of.f;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.jh;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.wi;
import org.telegram.ui.pn;
import org.telegram.ui.pv0;
import r0.r;
import sc.v;
import x9.c;
import z3.k;
public final class a implements bg.a, q, cg.a, d, n, wi, y2.n, m, q9.d, qg, l1, t0, r, u5.a, Continuation, c, y6.d, k {
    public static a f17187b;
    public final int f17188a;

    public a(int i10) {
        this.f17188a = i10;
    }

    public static String G2(bd.c cVar) {
        String str = cVar.f3866a;
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

    @Override
    public boolean A2(int i10) {
        return false;
    }

    @Override
    public boolean C1() {
        return false;
    }

    @Override
    public b D(rb.a aVar, JSONObject jSONObject) {
        com.google.android.gms.internal.cast.a aVar2;
        long currentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        if (jSONObject.has("session")) {
            aVar2 = new com.google.android.gms.internal.cast.a(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8));
        } else {
            aVar2 = new com.google.android.gms.internal.cast.a(new JSONObject().optInt("max_custom_exception_events", 8));
        }
        com.google.android.gms.internal.cast.a aVar3 = aVar2;
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        ac.d dVar = new ac.d(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j3 = optInt;
        if (jSONObject.has("expires_at")) {
            currentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            currentTimeMillis = (j3 * 1000) + System.currentTimeMillis();
        }
        return new b(currentTimeMillis, aVar3, dVar, optDouble, optDouble2, optInt2);
    }

    @Override
    public boolean D0(MessageObject messageObject) {
        return true;
    }

    @Override
    public boolean D1(s sVar) {
        String str = sVar.f3643r;
        if (!Objects.equals(str, "text/x-ssa") && !Objects.equals(str, "text/vtt") && !Objects.equals(str, "application/x-mp4-vtt") && !Objects.equals(str, "application/x-subrip") && !Objects.equals(str, "application/x-quicktime-tx3g") && !Objects.equals(str, "application/pgs") && !Objects.equals(str, "application/vobsub") && !Objects.equals(str, "application/dvbsubs") && !Objects.equals(str, "application/ttml+xml")) {
            return false;
        }
        return true;
    }

    @Override
    public p9 E2() {
        return null;
    }

    @Override
    public String H() {
        return null;
    }

    @Override
    public boolean H1() {
        return false;
    }

    @Override
    public boolean I0() {
        return true;
    }

    @Override
    public boolean M1(u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public boolean O(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public boolean O1() {
        return false;
    }

    @Override
    public TLRPC.TL_channels_sendAsPeers P() {
        return null;
    }

    @Override
    public boolean Q() {
        return false;
    }

    @Override
    public int Q0(s sVar) {
        if (sVar.v != null) {
            return 1;
        }
        return 0;
    }

    @Override
    public boolean R(u1 u1Var) {
        return false;
    }

    @Override
    public boolean R0(long j3) {
        return false;
    }

    @Override
    public boolean S() {
        return false;
    }

    @Override
    public m2 T0() {
        return null;
    }

    @Override
    public void T1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        f.s(u1Var.getContext(), str);
    }

    @Override
    public int U0(s sVar) {
        String str = sVar.f3643r;
        if (str != null) {
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c10 = '\b';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                case 1:
                case 2:
                    return 2;
                case 3:
                    return 1;
                case 4:
                    return 2;
                case 5:
                    return 1;
                case 6:
                    return 2;
                case 7:
                case '\b':
                    return 1;
            }
        }
        throw new IllegalArgumentException(v.i("Unsupported MIME type: ", str));
    }

    @Override
    public CharacterStyle U1(u1 u1Var) {
        return null;
    }

    @Override
    public int W() {
        return 0;
    }

    @Override
    public boolean W1(u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public hh.a Y() {
        return null;
    }

    @Override
    public void Y0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        shortBuffer2.put(shortBuffer);
    }

    @Override
    public boolean Y1() {
        return false;
    }

    @Override
    public long Z() {
        return System.currentTimeMillis();
    }

    @Override
    public long a() {
        return 0L;
    }

    @Override
    public boolean b0(u1 u1Var) {
        return false;
    }

    @Override
    public boolean b2(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean c1(u1 u1Var, boolean z10) {
        return false;
    }

    @Override
    public long d() {
        return 0L;
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public boolean e0(u1 u1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public g e1(j jVar, s sVar) {
        if (sVar.v == null) {
            return null;
        }
        return new n2.n(new n2.f(6001, new Exception()));
    }

    @Override
    public pv0 e2() {
        return null;
    }

    @Override
    public boolean f() {
        switch (this.f17188a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void f0(jh jhVar) {
        jhVar.run();
    }

    @Override
    public h0 f2(int i10, int i11) {
        return new c3.n();
    }

    @Override
    public String g(u1 u1Var) {
        return null;
    }

    @Override
    public boolean g2(long j3) {
        return false;
    }

    @Override
    public boolean h0() {
        return false;
    }

    @Override
    public int h1() {
        return 0;
    }

    @Override
    public boolean i0() {
        return false;
    }

    @Override
    public boolean i1(int i10, u1 u1Var) {
        return false;
    }

    @Override
    public boolean i2(u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public TL_stories.StoryItem j1() {
        return null;
    }

    @Override
    public int l0(u1 u1Var) {
        return 0;
    }

    @Override
    public boolean l1(long j3) {
        return false;
    }

    @Override
    public boolean m() {
        return false;
    }

    @Override
    public l n0(j jVar, s sVar) {
        return l.f16603u;
    }

    @Override
    public boolean n1(MessageObject messageObject) {
        return c1.a(messageObject);
    }

    @Override
    public boolean o1() {
        return false;
    }

    @Override
    public boolean p0() {
        return false;
    }

    @Override
    public a3.l q(Context context, String str, y6.c cVar) {
        a3.l lVar = new a3.l();
        lVar.f155a = cVar.q(context, str);
        int i10 = 1;
        int l4 = cVar.l(context, str, true);
        lVar.f156b = l4;
        int i11 = lVar.f155a;
        if (i11 == 0) {
            i11 = 0;
            if (l4 == 0) {
                i10 = 0;
                lVar.f157c = i10;
                return lVar;
            }
        }
        if (l4 < i11) {
            i10 = -1;
        }
        lVar.f157c = i10;
        return lVar;
    }

    @Override
    public boolean r2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public z3.m s0(s sVar) {
        String str = sVar.f3643r;
        List list = sVar.f3646u;
        if (str != null) {
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c10 = '\b';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    return new i(list);
                case 1:
                    return new com.google.firebase.messaging.s(2);
                case 2:
                    return new a4.l();
                case 3:
                    return new pf.b(19);
                case 4:
                    return new g4.a(list);
                case 5:
                    return new d4.a(list);
                case 6:
                    return new com.google.firebase.messaging.s(list);
                case 7:
                    return new e4.a();
                case '\b':
                    return new e();
            }
        }
        throw new IllegalArgumentException(v.i("Unsupported MIME type: ", str));
    }

    @Override
    public boolean t0(b6 b6Var) {
        return false;
    }

    @Override
    public Object t2(Uri uri, g2.k kVar) {
        return Long.valueOf(d0.S(new BufferedReader(new InputStreamReader(kVar)).readLine()));
    }

    @Override
    public Object then(Task task) {
        return null;
    }

    @Override
    public pn u0() {
        return null;
    }

    @Override
    public boolean u1() {
        return false;
    }

    @Override
    public int v() {
        return 0;
    }

    @Override
    public Object v2() {
        switch (this.f17188a) {
            case 8:
                return new LinkedHashSet();
            default:
                return new TreeMap();
        }
    }

    @Override
    public String w(long j3) {
        return null;
    }

    @Override
    public TLRPC.Peer x() {
        return null;
    }

    @Override
    public void x0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 < i11) {
            cg.a.f4658q.x0(shortBuffer, i10, shortBuffer2, i11, i12);
        } else if (i10 > i11) {
            cg.a.f4657p.x0(shortBuffer, i10, shortBuffer2, i11, i12);
        } else if (i10 == i11) {
            shortBuffer2.put(shortBuffer);
        } else {
            throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
        }
    }

    @Override
    public boolean x2(w0 w0Var, float f7, float f10) {
        return false;
    }

    @Override
    public Object y0(u5 u5Var) {
        switch (this.f17188a) {
            case 14:
                qb.g gVar = (qb.g) u5Var.a(qb.g.class);
                return new rb.a(0);
            default:
                qb.a aVar = (qb.a) u5Var.a(qb.a.class);
                return new qb.b(0);
        }
    }

    @Override
    public void B0() {
    }

    @Override
    public void B2() {
    }

    @Override
    public void C2() {
    }

    @Override
    public void F0() {
    }

    @Override
    public void F2() {
    }

    @Override
    public void G1() {
    }

    @Override
    public void J() {
    }

    @Override
    public void L1() {
    }

    @Override
    public void M0() {
    }

    @Override
    public void O0() {
    }

    @Override
    public void P0() {
    }

    @Override
    public void X1() {
    }

    @Override
    public void Z0() {
    }

    @Override
    public void a0() {
    }

    @Override
    public void b() {
    }

    @Override
    public void c() {
    }

    @Override
    public void h() {
    }

    @Override
    public void j2() {
    }

    @Override
    public void k() {
    }

    @Override
    public void k1() {
    }

    @Override
    public void l() {
    }

    @Override
    public void o2() {
    }

    @Override
    public void p() {
    }

    @Override
    public void q0() {
    }

    @Override
    public void q1() {
    }

    @Override
    public void release() {
    }

    @Override
    public void s() {
    }

    @Override
    public void t1() {
    }

    @Override
    public void u2() {
    }

    @Override
    public void w1() {
    }

    @Override
    public void w2() {
    }

    @Override
    public void x1() {
    }

    @Override
    public void y() {
    }

    @Override
    public void y1() {
    }

    @Override
    public void z0() {
    }

    @Override
    public void A(u1 u1Var) {
    }

    @Override
    public void B(u1 u1Var) {
    }

    @Override
    public void B1(CharSequence charSequence) {
    }

    @Override
    public void C(boolean z10) {
    }

    @Override
    public void E0(u1 u1Var) {
    }

    @Override
    public void E1(long j3) {
    }

    @Override
    public void F1(w0 w0Var) {
    }

    @Override
    public void G(u1 u1Var) {
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void J0(u1 u1Var) {
    }

    @Override
    public void J1(u1 u1Var) {
    }

    @Override
    public void L(u1 u1Var) {
    }

    @Override
    public void L0(u1 u1Var) {
    }

    @Override
    public void N(MessageObject messageObject) {
    }

    @Override
    public void N0(u1 u1Var) {
    }

    @Override
    public void Q1(u1 u1Var) {
    }

    @Override
    public void S0(u1 u1Var) {
    }

    @Override
    public void S1(MessageObject messageObject) {
    }

    @Override
    public void U(u1 u1Var) {
    }

    @Override
    public void W0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override
    public void a1(Object obj) {
    }

    @Override
    public void c0(boolean z10) {
    }

    @Override
    public void d0(w0 w0Var) {
    }

    @Override
    public void d1(u1 u1Var) {
    }

    @Override
    public void d2(b0 b0Var) {
    }

    @Override
    public void f1(u1 u1Var) {
    }

    @Override
    public void g0(int i10) {
    }

    @Override
    public void g1(int i10) {
    }

    @Override
    public void k2(u1 u1Var) {
    }

    @Override
    public void l2(int i10) {
    }

    @Override
    public void m0(u1 u1Var) {
    }

    @Override
    public void o(u1 u1Var) {
    }

    @Override
    public void o0(w0 w0Var) {
    }

    @Override
    public void p1(TLRPC.User user) {
    }

    @Override
    public void p2(boolean z10) {
    }

    @Override
    public void r(u1 u1Var) {
    }

    @Override
    public void r0(String str) {
    }

    @Override
    public void s2(u1 u1Var) {
    }

    @Override
    public void t(u1 u1Var) {
    }

    @Override
    public void u(u1 u1Var) {
    }

    @Override
    public void w0(w0 w0Var) {
    }

    @Override
    public void z(float f7) {
    }

    @Override
    public void E(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void F(Looper looper, j2.k kVar) {
    }

    @Override
    public void K0(int i10, int i11) {
    }

    @Override
    public void K1(u1 u1Var, boolean z10) {
    }

    @Override
    public void M(int i10, u1 u1Var) {
    }

    @Override
    public void N1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void V(float f7, int i10) {
    }

    @Override
    public void V0(int i10, u1 u1Var) {
    }

    @Override
    public void X(w0 w0Var, int i10) {
    }

    @Override
    public void X0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void Z1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void i(u1 u1Var, bi.f fVar) {
    }

    @Override
    public void m2(u1 u1Var, long j3) {
    }

    @Override
    public void n2(w0 w0Var, String str) {
    }

    @Override
    public void s1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void v1(u1 u1Var, TLRPC.Document document) {
    }

    @Override
    public void A1(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void D2(u1 u1Var, int i10, int i11) {
    }

    @Override
    public void G0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void H0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void P1(w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override
    public int R1(int i10, int i11, int i12) {
        return i10;
    }

    @Override
    public void b1(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void j0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void k0(w0 w0Var, int i10, int i11) {
    }

    @Override
    public void m1(w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override
    public void r1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override
    public void v0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void z1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public void A0(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void C0(u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void a2(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void n(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
    }

    @Override
    public void onScrollProgress(int i10, int i11, int i12, int i13) {
    }

    @Override
    public void K(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
    }

    @Override
    public void h2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void j(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void y2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void z2(w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void T(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void q2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
    }

    @Override
    public void V1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override
    public void c2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }

    @Override
    public void I1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
    }
}
