package ob;

import a3.l;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.style.CharacterStyle;
import android.view.View;
import androidx.car.app.messaging.model.b;
import b2.s;
import bi.u6;
import da.c;
import e2.d0;
import fb.n;
import g2.k;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import n2.j;
import n2.m;
import n2.o;
import nf.f;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.em;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.jh;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.y5;
import org.telegram.ui.rv0;
import org.telegram.ui.tn;
import q9.d;
import r0.r;
import tc.g;
import y2.p;
public final class a implements ag.a, b, bg.a, c, n, wi, p, n2.n, d, qg, k1, t0, r, x9.c, y6.d {
    public static a f14285b;
    public final int f14286a;

    public a(int i10) {
        this.f14286a = i10;
    }

    public static Calendar A2() {
        if (f14285b == null) {
            f14285b = new a(25);
        }
        f14285b.getClass();
        return Calendar.getInstance();
    }

    public static short B2(short s10, short s11) {
        int i10;
        int i11 = s10 + 32768;
        int i12 = s11 + 32768;
        int i13 = 65535;
        if (i11 >= 32768 && i12 >= 32768) {
            i10 = (((i11 + i12) * 2) - ((i11 * i12) / 32768)) - 65535;
        } else {
            i10 = (i11 * i12) / 32768;
        }
        if (i10 != 65536) {
            i13 = i10;
        }
        return (short) (i13 - 32768);
    }

    public static void C2(String str) {
        if (str != null && str.length() != 0) {
            if (!str.startsWith("sk_")) {
                return;
            }
            throw new g("Invalid Publishable Key: You are using a secret key to create a token, instead of the publishable one. For more info, see https://stripe.com/docs/stripe.js", null);
        }
        throw new g("Invalid Publishable Key: You must use a valid publishable key to create a token.  For more info, see https://stripe.com/docs/stripe.js.", null);
    }

    public static da.a z2(na.d dVar) {
        return new da.a(System.currentTimeMillis() + 3600000, new com.google.android.gms.internal.cast.a(8), new ac.d(true, false, false), 10.0d, 1.2d, 60);
    }

    @Override
    public boolean D0() {
        return true;
    }

    @Override
    public boolean E1(t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public String F() {
        return null;
    }

    @Override
    public boolean G1() {
        return false;
    }

    @Override
    public TLRPC.TL_channels_sendAsPeers J() {
        return null;
    }

    @Override
    public int J1(int i10, int i11, int i12) {
        return i10 / 2;
    }

    @Override
    public int L0(s sVar) {
        if (sVar.v != null) {
            return 1;
        }
        return 0;
    }

    @Override
    public void L1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        f.s(t1Var.getContext(), str);
    }

    @Override
    public boolean M0(long j3) {
        return false;
    }

    @Override
    public CharacterStyle M1(t1 t1Var) {
        return null;
    }

    @Override
    public boolean N(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public boolean O() {
        return false;
    }

    @Override
    public p2 O0() {
        return null;
    }

    @Override
    public boolean O1(t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public boolean P(t1 t1Var) {
        return false;
    }

    @Override
    public Object P1(u6 u6Var) {
        switch (this.f14286a) {
            case 14:
                qb.g gVar = (qb.g) u6Var.a(qb.g.class);
                return new rb.a(0);
            default:
                qb.a aVar = (qb.a) u6Var.a(qb.a.class);
                return new qb.b(0);
        }
    }

    @Override
    public boolean Q() {
        return false;
    }

    @Override
    public boolean R1() {
        return false;
    }

    @Override
    public void S0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        int min = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i12 = 0; i12 < min; i12++) {
            shortBuffer2.put(B2(shortBuffer.get(), shortBuffer.get()));
        }
    }

    @Override
    public int U() {
        return 0;
    }

    @Override
    public boolean V1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean W0(t1 t1Var, boolean z10) {
        return false;
    }

    @Override
    public gh.a X() {
        return null;
    }

    @Override
    public rv0 X1() {
        return null;
    }

    @Override
    public boolean Y(t1 t1Var) {
        return false;
    }

    @Override
    public n2.g Y0(j jVar, s sVar) {
        if (sVar.v == null) {
            return null;
        }
        return new o(new n2.f(6001, new Exception()));
    }

    @Override
    public boolean Y1(long j3) {
        return false;
    }

    @Override
    public long a() {
        return 0L;
    }

    @Override
    public boolean a2(t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public boolean b0(t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public int b1() {
        return 0;
    }

    @Override
    public boolean c1(int i10, t1 t1Var) {
        return false;
    }

    @Override
    public long d() {
        return 0L;
    }

    @Override
    public boolean d0() {
        return false;
    }

    @Override
    public TL_stories.StoryItem d1() {
        return null;
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public boolean e0() {
        return false;
    }

    @Override
    public boolean e1(long j3) {
        return false;
    }

    @Override
    public boolean f() {
        switch (this.f14286a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public String g(t1 t1Var) {
        return null;
    }

    @Override
    public boolean g1(MessageObject messageObject) {
        return em.a(messageObject);
    }

    @Override
    public int h0(t1 t1Var) {
        return 0;
    }

    @Override
    public boolean h1() {
        return false;
    }

    @Override
    public m j0(j jVar, s sVar) {
        return m.f13738u;
    }

    @Override
    public boolean j2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean l() {
        return false;
    }

    @Override
    public boolean l0() {
        return false;
    }

    @Override
    public Object l2(Uri uri, k kVar) {
        return Long.valueOf(d0.T(new BufferedReader(new InputStreamReader(kVar)).readLine()));
    }

    @Override
    public boolean n1() {
        return false;
    }

    @Override
    public Object n2() {
        switch (this.f14286a) {
            case 8:
                return new LinkedHashSet();
            default:
                return new TreeMap();
        }
    }

    @Override
    public boolean o0(y5 y5Var) {
        return false;
    }

    @Override
    public l p(Context context, String str, y6.c cVar) {
        l lVar = new l();
        lVar.f140a = cVar.F(context, str);
        int i10 = 1;
        int h = cVar.h(context, str, true);
        lVar.f141b = h;
        int i11 = lVar.f140a;
        if (i11 == 0) {
            i11 = 0;
            if (h == 0) {
                i10 = 0;
                lVar.f142c = i10;
                return lVar;
            }
        }
        if (h < i11) {
            i10 = -1;
        }
        lVar.f142c = i10;
        return lVar;
    }

    @Override
    public tn p0() {
        return null;
    }

    @Override
    public boolean p2(w0 w0Var, float f7, float f10) {
        return false;
    }

    @Override
    public da.a q2(na.d dVar, JSONObject jSONObject) {
        return z2(dVar);
    }

    @Override
    public void s0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 == i11) {
            shortBuffer2.put(shortBuffer);
            return;
        }
        throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
    }

    @Override
    public boolean t2(int i10) {
        return false;
    }

    @Override
    public int u() {
        return 0;
    }

    @Override
    public String v(long j3) {
        return null;
    }

    @Override
    public boolean v1() {
        return false;
    }

    @Override
    public TLRPC.Peer w() {
        return null;
    }

    @Override
    public boolean x0(MessageObject messageObject) {
        return true;
    }

    @Override
    public t9 x2() {
        return null;
    }

    @Override
    public void y0(jh jhVar) {
        jhVar.run();
    }

    @Override
    public boolean z1() {
        return false;
    }

    public a() {
        this.f14286a = 11;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    @Override
    public void A0() {
    }

    @Override
    public void D1() {
    }

    @Override
    public void G() {
    }

    @Override
    public void H0() {
    }

    @Override
    public void J0() {
    }

    @Override
    public void K0() {
    }

    @Override
    public void Q1() {
    }

    @Override
    public void T0() {
    }

    @Override
    public void W() {
    }

    @Override
    public void b() {
    }

    @Override
    public void b2() {
    }

    @Override
    public void c() {
    }

    @Override
    public void g2() {
    }

    @Override
    public void h() {
    }

    @Override
    public void j() {
    }

    @Override
    public void j1() {
    }

    @Override
    public void k() {
    }

    @Override
    public void m0() {
    }

    @Override
    public void m1() {
    }

    @Override
    public void m2() {
    }

    @Override
    public void o() {
    }

    @Override
    public void o2() {
    }

    @Override
    public void p1() {
    }

    @Override
    public void q1() {
    }

    @Override
    public void r() {
    }

    @Override
    public void r1() {
    }

    @Override
    public void release() {
    }

    @Override
    public void t0() {
    }

    @Override
    public void u2() {
    }

    @Override
    public void v0() {
    }

    @Override
    public void v2() {
    }

    @Override
    public void x() {
    }

    @Override
    public void y1() {
    }

    @Override
    public void y2() {
    }

    @Override
    public void A(t1 t1Var) {
    }

    @Override
    public void B(boolean z10) {
    }

    @Override
    public void B1(t1 t1Var) {
    }

    @Override
    public void E(t1 t1Var) {
    }

    @Override
    public void E0(t1 t1Var) {
    }

    @Override
    public void G0(t1 t1Var) {
    }

    @Override
    public void H(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void I0(t1 t1Var) {
    }

    @Override
    public void I1(t1 t1Var) {
    }

    @Override
    public void K(t1 t1Var) {
    }

    @Override
    public void K1(MessageObject messageObject) {
    }

    @Override
    public void M(MessageObject messageObject) {
    }

    @Override
    public void N0(t1 t1Var) {
    }

    @Override
    public void Q0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override
    public void S(t1 t1Var) {
    }

    @Override
    public void U0(Object obj) {
    }

    @Override
    public void X0(t1 t1Var) {
    }

    @Override
    public void Z(boolean z10) {
    }

    @Override
    public void Z0(t1 t1Var) {
    }

    @Override
    public void a0(w0 w0Var) {
    }

    @Override
    public void a1(int i10) {
    }

    @Override
    public void c0(int i10) {
    }

    @Override
    public void c2(t1 t1Var) {
    }

    @Override
    public void d2(int i10) {
    }

    @Override
    public void h2(boolean z10) {
    }

    @Override
    public void i0(t1 t1Var) {
    }

    @Override
    public void i1(TLRPC.User user) {
    }

    @Override
    public void k0(w0 w0Var) {
    }

    @Override
    public void k2(t1 t1Var) {
    }

    @Override
    public void n(t1 t1Var) {
    }

    @Override
    public void n0(String str) {
    }

    @Override
    public void q(t1 t1Var) {
    }

    @Override
    public void r0(w0 w0Var) {
    }

    @Override
    public void s(t1 t1Var) {
    }

    @Override
    public void t(t1 t1Var) {
    }

    @Override
    public void u1(CharSequence charSequence) {
    }

    @Override
    public void w1(long j3) {
    }

    @Override
    public void x1(w0 w0Var) {
    }

    @Override
    public void y(float f7) {
    }

    @Override
    public void z(t1 t1Var) {
    }

    @Override
    public void z0(t1 t1Var) {
    }

    @Override
    public void C(Looper looper, j2.k kVar) {
    }

    @Override
    public void C1(t1 t1Var, boolean z10) {
    }

    @Override
    public void D(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void F0(int i10, int i11) {
    }

    @Override
    public void F1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void L(int i10, t1 t1Var) {
    }

    @Override
    public void P0(int i10, t1 t1Var) {
    }

    @Override
    public void R0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void S1(t1 t1Var, ai.j jVar) {
    }

    @Override
    public void T(float f7, int i10) {
    }

    @Override
    public void T1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void V(w0 w0Var, int i10) {
    }

    @Override
    public void e2(t1 t1Var, long j3) {
    }

    @Override
    public void f2(w0 w0Var, String str) {
    }

    @Override
    public void l1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void o1(t1 t1Var, TLRPC.Document document) {
    }

    @Override
    public void B0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void C0(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void H1(w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override
    public void V0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void f0(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void f1(w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override
    public void g0(w0 w0Var, int i10, int i11) {
    }

    @Override
    public void k1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override
    public void q0(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void s1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public void t1(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void w2(t1 t1Var, int i10, int i11) {
    }

    @Override
    public void U1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void m(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
    }

    @Override
    public void onScrollProgress(int i10, int i11, int i12, int i13) {
    }

    @Override
    public void u0(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void w0(t1 t1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void I(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
    }

    @Override
    public void Z1(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void r2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void s2(w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void R(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void i2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
    }

    @Override
    public void N1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override
    public void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }

    @Override
    public void A1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
    }
}
