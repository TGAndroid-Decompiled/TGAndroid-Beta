package cb;

import android.content.Context;
import android.text.style.CharacterStyle;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.ComponentRegistrar;
import eg.s3;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import ng.w;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.ko0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.q61;
import org.telegram.ui.xu0;
public final class b implements c9.e, e2.d, g5.l, SuccessContinuation, j9.c, m6.d, q61, c9.f, of.a, ko0, k1, pf.a, r3.c, ra.m, s0 {
    public static volatile b f2402b;
    public final int f2403a;

    public b(int i10) {
        this.f2403a = i10;
    }

    public static void l(String str) {
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
    public p0 C(Class cls, v1.b bVar) {
        return h(cls);
    }

    @Override
    public boolean E2(int i10) {
        return false;
    }

    @Override
    public boolean H1() {
        return false;
    }

    @Override
    public n9 I2() {
        return null;
    }

    @Override
    public boolean N(t1 t1Var, TLRPC.TodoItem todoItem, boolean z4) {
        return false;
    }

    @Override
    public boolean N1(t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public boolean O() {
        return false;
    }

    @Override
    public boolean P(t1 t1Var) {
        return false;
    }

    @Override
    public boolean P1() {
        return false;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public boolean R0(long j10) {
        return false;
    }

    @Override
    public int S1(int i10, int i11, int i12) {
        return (i10 / i11) * i12;
    }

    @Override
    public void U1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        af.g.s(t1Var.getContext(), str);
    }

    @Override
    public int V() {
        return 0;
    }

    @Override
    public CharacterStyle W1(t1 t1Var) {
        return null;
    }

    @Override
    public void X(float f10, boolean z4) {
        s3.f5476b = f10 * 2.0f;
    }

    @Override
    public void X0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
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
                shortBuffer2.put(z9.d.z3(s6, s9));
            }
        }
    }

    @Override
    public boolean Y1(t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public vg.a Z() {
        return null;
    }

    @Override
    public boolean a0(t1 t1Var) {
        return false;
    }

    @Override
    public List b(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (c9.b bVar : componentRegistrar.getComponents()) {
            String str = bVar.f2336a;
            if (str != null) {
                bVar = new c9.b(str, bVar.f2337b, bVar.f2338c, bVar.d, bVar.f2339e, new w(1, str, bVar), bVar.f2341g);
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }

    @Override
    public boolean b1(t1 t1Var, boolean z4) {
        return false;
    }

    @Override
    public String c() {
        return null;
    }

    @Override
    public boolean c0(t1 t1Var, TLRPC.User user) {
        return false;
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
    public boolean e() {
        return true;
    }

    @Override
    public Object e0(c5.j jVar) {
        switch (this.f2403a) {
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
    public boolean e2(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public String g(t1 t1Var) {
        return null;
    }

    @Override
    public boolean g0() {
        return false;
    }

    @Override
    public boolean g1(int i10, t1 t1Var) {
        return false;
    }

    @Override
    public xu0 g2() {
        return null;
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public p0 h(Class cls) {
        return new w1.b();
    }

    @Override
    public boolean j2(long j10) {
        return false;
    }

    @Override
    public e8.a k(Context context, String str, m6.c cVar) {
        e8.a aVar = new e8.a();
        aVar.f4995a = cVar.G(context, str);
        int i10 = 1;
        int u10 = cVar.u(context, str, true);
        aVar.f4996b = u10;
        int i11 = aVar.f4995a;
        if (i11 == 0) {
            i11 = 0;
            if (u10 == 0) {
                i10 = 0;
                aVar.f4997c = i10;
                return aVar;
            }
        }
        if (u10 < i11) {
            i10 = -1;
        }
        aVar.f4997c = i10;
        return aVar;
    }

    @Override
    public int k0(t1 t1Var) {
        return 0;
    }

    @Override
    public boolean l2(t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public int m0() {
        return 0;
    }

    @Override
    public boolean m1(MessageObject messageObject) {
        return org.telegram.ui.b.a(messageObject);
    }

    @Override
    public boolean n0() {
        return false;
    }

    @Override
    public boolean q0(u5 u5Var) {
        return false;
    }

    @Override
    public Task then(Object obj) {
        Void r12 = (Void) obj;
        return Tasks.forResult(Boolean.TRUE);
    }

    @Override
    public void u0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 < i11) {
            pf.a.f44370u.u0(shortBuffer, i10, shortBuffer2, i11, i12);
        } else if (i10 > i11) {
            pf.a.f44369t.u0(shortBuffer, i10, shortBuffer2, i11, i12);
        } else if (i10 == i11) {
            shortBuffer2.put(shortBuffer);
        } else {
            throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
        }
    }

    @Override
    public String v(long j10) {
        return null;
    }

    @Override
    public boolean v2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public Object y2() {
        switch (this.f2403a) {
            case 22:
                return new LinkedHashSet();
            default:
                return new TreeMap();
        }
    }

    @Override
    public void A() {
    }

    @Override
    public void D0() {
    }

    @Override
    public void G2() {
    }

    @Override
    public void a() {
    }

    @Override
    public void a2() {
    }

    @Override
    public void j() {
    }

    @Override
    public void o() {
    }

    @Override
    public void p() {
    }

    @Override
    public void p1() {
    }

    @Override
    public void r() {
    }

    @Override
    public void z2() {
    }

    @Override
    public void C0(t1 t1Var) {
    }

    @Override
    public void E(t1 t1Var) {
    }

    @Override
    public void H(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void I0(t1 t1Var) {
    }

    @Override
    public void J1(t1 t1Var) {
    }

    @Override
    public void K(t1 t1Var) {
    }

    @Override
    public void K0(t1 t1Var) {
    }

    @Override
    public void M(MessageObject messageObject) {
    }

    @Override
    public void N0(t1 t1Var) {
    }

    @Override
    public void R1(t1 t1Var) {
    }

    @Override
    public void S0(t1 t1Var) {
    }

    @Override
    public void T(t1 t1Var) {
    }

    @Override
    public void T1(MessageObject messageObject) {
    }

    @Override
    public void c1(t1 t1Var) {
    }

    @Override
    public void d1(t1 t1Var) {
    }

    @Override
    public long f(long j10) {
        return j10;
    }

    @Override
    public void f0(int i10) {
    }

    @Override
    public void l0(t1 t1Var) {
    }

    @Override
    public void n(t1 t1Var) {
    }

    @Override
    public void o2(t1 t1Var) {
    }

    @Override
    public void p0(String str) {
    }

    @Override
    public void q(t1 t1Var) {
    }

    @Override
    public void s(t1 t1Var) {
    }

    @Override
    public void t(t1 t1Var) {
    }

    @Override
    public void w2(t1 t1Var) {
    }

    @Override
    public void y(t1 t1Var) {
    }

    @Override
    public void z(t1 t1Var) {
    }

    @Override
    public void D(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void L(int i10, t1 t1Var) {
    }

    @Override
    public void L1(t1 t1Var, boolean z4) {
    }

    @Override
    public void O1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void Q(t1 t1Var, kh.f fVar) {
    }

    @Override
    public void U0(int i10, t1 t1Var) {
    }

    @Override
    public void W0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void c2(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void q2(t1 t1Var, long j10) {
    }

    @Override
    public void s1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void u(int i10, Object obj) {
    }

    @Override
    public void v1(t1 t1Var, TLRPC.Document document) {
    }

    @Override
    public void B1(t1 t1Var, float f10, float f11) {
    }

    @Override
    public void F0(t1 t1Var, TLObject tLObject, boolean z4) {
    }

    @Override
    public void G0(t1 t1Var, float f10, float f11) {
    }

    @Override
    public void H2(t1 t1Var, int i10, int i11) {
    }

    @Override
    public void a1(t1 t1Var, CharacterStyle characterStyle, boolean z4) {
    }

    @Override
    public void i0(t1 t1Var, float f10, float f11) {
    }

    @Override
    public void s0(t1 t1Var, float f10, float f11) {
    }

    @Override
    public void d2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void m(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void x0(t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void z0(t1 t1Var, float f10, float f11, boolean z4) {
    }

    @Override
    public void B2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    @Override
    public void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void k2(t1 t1Var, int i10, float f10, float f11, boolean z4) {
    }

    @Override
    public void S(t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    @Override
    public void X1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
