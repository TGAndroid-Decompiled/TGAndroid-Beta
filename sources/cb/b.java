package cb;

import android.content.Context;
import android.text.style.CharacterStyle;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.ComponentRegistrar;
import dg.u3;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import mg.w;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.jo0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.wg;
import org.telegram.ui.p61;
import org.telegram.ui.vu0;
public final class b implements c9.e, e2.d, g5.l, SuccessContinuation, j9.c, m6.d, p61, c9.f, of.a, jo0, k1, pf.a, r3.c, ra.m, ji {
    public static volatile b f2211b;
    public final int f2212a;

    public b(int i10) {
        this.f2212a = i10;
    }

    public static void h(String str) {
        if (str != null && str.length() != 0) {
            if (!str.startsWith("sk_")) {
                return;
            }
            throw new fc.g("Invalid Publishable Key: You are using a secret key to create a token, instead of the publishable one. For more info, see https://stripe.com/docs/stripe.js", null);
        }
        throw new fc.g("Invalid Publishable Key: You must use a valid publishable key to create a token.  For more info, see https://stripe.com/docs/stripe.js.", null);
    }

    @Override
    public boolean A0(MessageObject messageObject) {
        return true;
    }

    @Override
    public n9 C2() {
        return null;
    }

    @Override
    public boolean D1() {
        return false;
    }

    @Override
    public boolean I1(t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public boolean K1() {
        return false;
    }

    @Override
    public int N1(int i10, int i11, int i12) {
        return (i10 / i11) * i12;
    }

    @Override
    public boolean O0(long j10) {
        return false;
    }

    @Override
    public boolean P(t1 t1Var, TLRPC.TodoItem todoItem, boolean z4) {
        return false;
    }

    @Override
    public void P1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        af.g.s(t1Var.getContext(), str);
    }

    @Override
    public boolean Q() {
        return false;
    }

    @Override
    public boolean R(t1 t1Var) {
        return false;
    }

    @Override
    public CharacterStyle R1(t1 t1Var) {
        return null;
    }

    @Override
    public boolean S() {
        return false;
    }

    @Override
    public boolean T1(t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public void U0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        if (i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("Output must be 2 or 1 channels");
        }
        int min = Math.min(shortBuffer.remaining() / i10, shortBuffer2.remaining() / i11);
        for (int i12 = 0; i12 < min; i12++) {
            short s6 = shortBuffer.get();
            short s9 = shortBuffer.get();
            shortBuffer.position(shortBuffer.position() + 4);
            if (i11 == 2) {
                shortBuffer2.put(s6);
                shortBuffer2.put(s9);
            } else if (i11 == 1) {
                shortBuffer2.put(z9.d.v3(s6, s9));
            }
        }
    }

    @Override
    public boolean V() {
        return false;
    }

    @Override
    public int W() {
        return 0;
    }

    @Override
    public void Y(float f10, boolean z4) {
        u3.f4812b = f10 * 2.0f;
    }

    @Override
    public boolean Y0(t1 t1Var, boolean z4) {
        return false;
    }

    @Override
    public ug.a Z() {
        return null;
    }

    @Override
    public boolean Z1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean a0(t1 t1Var) {
        return false;
    }

    @Override
    public vu0 a2() {
        return null;
    }

    @Override
    public List b(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (c9.b bVar : componentRegistrar.getComponents()) {
            String str = bVar.f2148a;
            if (str != null) {
                bVar = new c9.b(str, bVar.f2149b, bVar.f2150c, bVar.d, bVar.e, new w(5, str, bVar), bVar.f2152g);
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }

    @Override
    public String c() {
        return null;
    }

    @Override
    public g5.m createDataSource() {
        return new g5.g(false);
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public boolean d0(t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public boolean d1(int i10, t1 t1Var) {
        return false;
    }

    @Override
    public boolean d2(long j10) {
        return false;
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public Object f0(c5.j jVar) {
        switch (this.f2212a) {
            case 4:
                return new l((Context) jVar.a(Context.class));
            case 26:
                h hVar = (h) jVar.a(h.class);
                return new db.a(0);
            default:
                a aVar = (a) jVar.a(a.class);
                return new b(0);
        }
    }

    @Override
    public boolean f2(t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public String g(t1 t1Var) {
        return null;
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public boolean h0() {
        return false;
    }

    @Override
    public int j0() {
        return 0;
    }

    @Override
    public boolean j1(MessageObject messageObject) {
        return org.telegram.ui.b.a(messageObject);
    }

    @Override
    public boolean k() {
        return false;
    }

    @Override
    public int k0(t1 t1Var) {
        return 0;
    }

    @Override
    public boolean n0() {
        return false;
    }

    @Override
    public e8.a p(Context context, String str, m6.c cVar) {
        e8.a aVar = new e8.a();
        aVar.f5156a = cVar.C(context, str);
        int i10 = 1;
        int p10 = cVar.p(context, str, true);
        aVar.f5157b = p10;
        int i11 = aVar.f5156a;
        if (i11 == 0) {
            i11 = 0;
            if (p10 == 0) {
                i10 = 0;
                aVar.f5158c = i10;
                return aVar;
            }
        }
        if (p10 < i11) {
            i10 = -1;
        }
        aVar.f5158c = i10;
        return aVar;
    }

    @Override
    public boolean p2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean q0(u5 u5Var) {
        return false;
    }

    @Override
    public Object s2() {
        switch (this.f2212a) {
            case 22:
                return new LinkedHashSet();
            default:
                return new TreeMap();
        }
    }

    @Override
    public Task then(Object obj) {
        Void r12 = (Void) obj;
        return Tasks.forResult(Boolean.TRUE);
    }

    @Override
    public void u0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 < i11) {
            pf.a.f41202u.u0(shortBuffer, i10, shortBuffer2, i11, i12);
        } else if (i10 > i11) {
            pf.a.f41201t.u0(shortBuffer, i10, shortBuffer2, i11, i12);
        } else if (i10 == i11) {
            shortBuffer2.put(shortBuffer);
        } else {
            throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
        }
    }

    @Override
    public String w(long j10) {
        return null;
    }

    @Override
    public void x(wg wgVar) {
        wgVar.run();
    }

    @Override
    public boolean y2(int i10) {
        return false;
    }

    @Override
    public void A2() {
    }

    @Override
    public void B() {
    }

    @Override
    public void C() {
    }

    @Override
    public void C0() {
    }

    @Override
    public void V1() {
    }

    @Override
    public void a() {
    }

    @Override
    public void j() {
    }

    @Override
    public void l() {
    }

    @Override
    public void l1() {
    }

    @Override
    public void o() {
    }

    @Override
    public void r() {
    }

    @Override
    public void s() {
    }

    @Override
    public void t2() {
    }

    @Override
    public void A(t1 t1Var) {
    }

    @Override
    public void B0(t1 t1Var) {
    }

    @Override
    public void D(Object obj) {
    }

    @Override
    public void E1(t1 t1Var) {
    }

    @Override
    public void F(t1 t1Var) {
    }

    @Override
    public void G(TLRPC.User user) {
    }

    @Override
    public void H0(t1 t1Var) {
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void J0(t1 t1Var) {
    }

    @Override
    public void L(t1 t1Var) {
    }

    @Override
    public void L0(t1 t1Var) {
    }

    @Override
    public void M1(t1 t1Var) {
    }

    @Override
    public void O(MessageObject messageObject) {
    }

    @Override
    public void O1(MessageObject messageObject) {
    }

    @Override
    public void P0(t1 t1Var) {
    }

    @Override
    public void U(t1 t1Var) {
    }

    @Override
    public void Z0(t1 t1Var) {
    }

    @Override
    public void a1(t1 t1Var) {
    }

    @Override
    public long f(long j10) {
        return j10;
    }

    @Override
    public void g0(int i10) {
    }

    @Override
    public void i2(t1 t1Var) {
    }

    @Override
    public void l0(t1 t1Var) {
    }

    @Override
    public void n(t1 t1Var) {
    }

    @Override
    public void p0(String str) {
    }

    @Override
    public void q(t1 t1Var) {
    }

    @Override
    public void q2(t1 t1Var) {
    }

    @Override
    public void t(t1 t1Var) {
    }

    @Override
    public void u(t1 t1Var) {
    }

    @Override
    public void y(t1 t1Var) {
    }

    @Override
    public void E(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void G1(t1 t1Var, boolean z4) {
    }

    @Override
    public void J1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void M(t1 t1Var, jh.f fVar) {
    }

    @Override
    public void N(int i10, t1 t1Var) {
    }

    @Override
    public void R0(int i10, t1 t1Var) {
    }

    @Override
    public void T0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void X1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void k2(t1 t1Var, long j10) {
    }

    @Override
    public void o1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void r1(t1 t1Var, TLRPC.Document document) {
    }

    @Override
    public void v(int i10, Object obj) {
    }

    @Override
    public void B2(t1 t1Var, int i10, int i11) {
    }

    @Override
    public void E0(t1 t1Var, TLObject tLObject, boolean z4) {
    }

    @Override
    public void F0(t1 t1Var, float f10, float f11) {
    }

    @Override
    public void W0(t1 t1Var, CharacterStyle characterStyle, boolean z4) {
    }

    @Override
    public void i0(t1 t1Var, float f10, float f11) {
    }

    @Override
    public void s0(t1 t1Var, float f10, float f11) {
    }

    @Override
    public void x1(t1 t1Var, float f10, float f11) {
    }

    @Override
    public void Y1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void m(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void y0(t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void z0(t1 t1Var, float f10, float f11, boolean z4) {
    }

    @Override
    public void e2(t1 t1Var, int i10, float f10, float f11, boolean z4) {
    }

    @Override
    public void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void v2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    @Override
    public void T(t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    @Override
    public void S1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override
    public void X(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }

    @Override
    public void H(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
    }
}
