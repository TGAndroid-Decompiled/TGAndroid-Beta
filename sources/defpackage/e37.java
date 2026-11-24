package defpackage;

import android.graphics.RectF;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class e37 implements bb2 {
    public final jr a;

    public e37(jr jrVar) {
        this.a = jrVar;
    }

    @Override
    public final boolean A1(gb2 gb2Var, int i) {
        f37 f37Var = (f37) this.a.d;
        if (f37Var.a == 2 && i == 1) {
            o27 o27Var = f37Var.d0.d;
            if (!o27Var.n) {
                TLRPC.WebPage webPage = o27Var.v;
                if (webPage == null || (webPage instanceof TLRPC.TL_webPagePending)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean B2(gb2 gb2Var, k27 k27Var) {
        return false;
    }

    @Override
    public final boolean D0(gb2 gb2Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final gib E2() {
        return ((f37) this.a.d).e;
    }

    @Override
    public final boolean F(gb2 gb2Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final boolean F0(gb2 gb2Var) {
        return false;
    }

    @Override
    public final boolean J0(long j) {
        return false;
    }

    @Override
    public final void K1(gb2 gb2Var, TLRPC.WebPage webPage, String str, boolean z) {
        d01.t(gb2Var.getContext(), str);
    }

    @Override
    public final boolean N() {
        return true;
    }

    @Override
    public final boolean N1() {
        return false;
    }

    @Override
    public final void O(gb2 gb2Var, CharacterStyle characterStyle, boolean z) {
        f37 f37Var = (f37) this.a.d;
        if (f37Var.a == 2 && f37Var.d0.d.w != characterStyle && gb2Var.getMessageObject() != null && (characterStyle instanceof URLSpan)) {
            URLSpan uRLSpan = (URLSpan) characterStyle;
            String url = uRLSpan.getURL();
            l37 l37Var = f37Var.d0;
            o27 o27Var = l37Var.d;
            o27Var.w = uRLSpan;
            o27Var.v = null;
            mu1 mu1Var = l37Var.c;
            if (mu1Var != null && url != null) {
                mu1Var.hb(url, true);
            }
            f37Var.h(gb2Var);
        }
    }

    @Override
    public final boolean P() {
        return false;
    }

    @Override
    public final int Q() {
        return 0;
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
    public final int U(gb2 gb2Var) {
        return 0;
    }

    @Override
    public final vu1 W() {
        return null;
    }

    @Override
    public final ma8 Z1() {
        return null;
    }

    @Override
    public final boolean b() {
        f37 f37Var = (f37) this.a.d;
        if (f37Var.a == 2) {
            o27 o27Var = f37Var.d0.d;
            if (!o27Var.n && !o27Var.i) {
                return true;
            }
            return false;
        }
        return false;
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
    public final boolean d0() {
        return false;
    }

    @Override
    public final CharacterStyle e0(gb2 gb2Var) {
        f37 f37Var = (f37) this.a.d;
        if (f37Var.a == 2) {
            o27 o27Var = f37Var.d0.d;
            if (!o27Var.n) {
                return o27Var.w;
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean g2(k27 k27Var) {
        return true;
    }

    @Override
    public final boolean h0() {
        return b();
    }

    @Override
    public final boolean h1(gb2 gb2Var, TL_iv.PageBlock pageBlock) {
        return false;
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
    public final boolean r0(gb2 gb2Var, boolean z) {
        return false;
    }

    @Override
    public final boolean w0(gb2 gb2Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final String x(long j) {
        return null;
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
    public final boolean z1(k27 k27Var) {
        return oo1.a(k27Var);
    }

    @Override
    public final void B0() {
    }

    @Override
    public final void C2() {
    }

    @Override
    public final void R1() {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void i1() {
    }

    @Override
    public final void p() {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void u2() {
    }

    @Override
    public final void D1(h27 h27Var) {
    }

    @Override
    public final void E(gb2 gb2Var) {
    }

    @Override
    public final void H2(gb2 gb2Var) {
    }

    @Override
    public final void I(gb2 gb2Var) {
    }

    @Override
    public final void M1(gb2 gb2Var) {
    }

    @Override
    public final void N0(gb2 gb2Var) {
    }

    @Override
    public final void S(gb2 gb2Var) {
    }

    @Override
    public final void V(gb2 gb2Var) {
    }

    @Override
    public final void X(k27 k27Var) {
    }

    @Override
    public final void X0(gb2 gb2Var) {
    }

    @Override
    public final void X1(gb2 gb2Var) {
    }

    @Override
    public final void Y1(gb2 gb2Var) {
    }

    @Override
    public final void c0(int i) {
    }

    @Override
    public final void c1(gb2 gb2Var) {
    }

    @Override
    public final void e2(gb2 gb2Var) {
    }

    @Override
    public final void i0(k27 k27Var) {
    }

    @Override
    public final void k0(String str) {
    }

    @Override
    public final void l1(gb2 gb2Var) {
    }

    @Override
    public final void n1(gb2 gb2Var) {
    }

    @Override
    public final void q(gb2 gb2Var) {
    }

    @Override
    public final void q0(gb2 gb2Var) {
    }

    @Override
    public final void q1(gb2 gb2Var) {
    }

    @Override
    public final void v2(gb2 gb2Var) {
    }

    @Override
    public final void x1(gb2 gb2Var) {
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
    public final void Y(gb2 gb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
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
    public final void l0(gb2 gb2Var, int i) {
    }

    @Override
    public final void u0(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void G1(gb2 gb2Var, boolean z, boolean z2) {
    }

    @Override
    public final void H(gb2 gb2Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public final void W1(gb2 gb2Var, TLObject tLObject, boolean z) {
    }

    @Override
    public final void Y0(gb2 gb2Var, float f, float f2) {
    }

    @Override
    public final void s2(gb2 gb2Var, float f, float f2) {
    }

    @Override
    public final void v0(gb2 gb2Var, int i, int i2) {
    }

    @Override
    public final void v1(gb2 gb2Var, float f, float f2) {
    }

    @Override
    public final void x2(gb2 gb2Var, boolean z, boolean z2) {
    }

    @Override
    public final void z(gb2 gb2Var, float f, float f2) {
    }

    @Override
    public final void D(gb2 gb2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void b0(gb2 gb2Var, TLRPC.User user, float f, float f2) {
    }

    @Override
    public final void s(gb2 gb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    @Override
    public final void z0(gb2 gb2Var, float f, float f2, boolean z) {
    }

    @Override
    public final void M(gb2 gb2Var, int i, float f, float f2, boolean z) {
    }

    @Override
    public final void m1(gb2 gb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
    }

    @Override
    public final void r1(gb2 gb2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    @Override
    public final void i2(gb2 gb2Var, TLRPC.Chat chat, int i, float f, float f2, boolean z) {
    }

    @Override
    public final void I1(k27 k27Var, String str, String str2, String str3, String str4, int i, int i2) {
    }
}
