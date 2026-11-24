package defpackage;

import android.graphics.RectF;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public interface bb2 {
    void A(gb2 gb2Var, float f, float f2);

    void A0(gb2 gb2Var, float f, float f2, boolean z);

    boolean A1(gb2 gb2Var, int i);

    void B0();

    boolean B2(gb2 gb2Var, k27 k27Var);

    void C1(gb2 gb2Var, boolean z);

    void C2();

    boolean D0(gb2 gb2Var, TLRPC.PollAnswer pollAnswer);

    void D1(h27 h27Var);

    void E(gb2 gb2Var, TLRPC.User user, TLRPC.Document document, String str);

    void E0(gb2 gb2Var, long j);

    gib E2();

    void F(gb2 gb2Var);

    boolean F0(gb2 gb2Var);

    void F1(gb2 gb2Var, int i);

    boolean G(gb2 gb2Var, TLRPC.TodoItem todoItem);

    void G1(gb2 gb2Var, boolean z, boolean z2);

    void H2(gb2 gb2Var);

    void I(gb2 gb2Var, TLRPC.Document document, RectF rectF);

    void I1(k27 k27Var, String str, String str2, String str3, String str4, int i, int i2);

    void J(gb2 gb2Var);

    boolean J0(long j);

    void K1(gb2 gb2Var, TLRPC.WebPage webPage, String str, boolean z);

    void M0(gb2 gb2Var, boolean z);

    void M1(gb2 gb2Var);

    void N(gb2 gb2Var, int i, float f, float f2, boolean z);

    void N0(gb2 gb2Var);

    boolean N1();

    boolean O();

    void O1(gb2 gb2Var, iq0 iq0Var);

    void P(gb2 gb2Var, CharacterStyle characterStyle, boolean z);

    boolean Q();

    int R();

    void R1();

    void T(gb2 gb2Var);

    boolean T0(gb2 gb2Var, TLRPC.TodoItem todoItem, boolean z);

    boolean T1(gm gmVar);

    int V(gb2 gb2Var);

    void V0(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    void W(gb2 gb2Var);

    void W1(gb2 gb2Var, TLObject tLObject, boolean z);

    vu1 X();

    void X0(gb2 gb2Var);

    void X1(gb2 gb2Var);

    void Y(k27 k27Var);

    void Y0(gb2 gb2Var, float f, float f2);

    void Y1(gb2 gb2Var);

    void Z(gb2 gb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia);

    ma8 Z1();

    boolean b();

    String b1(gb2 gb2Var);

    void b2(String str, String str2);

    void c();

    void c0(gb2 gb2Var, TLRPC.User user, float f, float f2);

    void c1(gb2 gb2Var);

    boolean c2(long j);

    void d0(int i);

    void d2(gb2 gb2Var, k08 k08Var);

    boolean e0();

    void e2(gb2 gb2Var);

    CharacterStyle f0(gb2 gb2Var);

    boolean g2(k27 k27Var);

    boolean h1(gb2 gb2Var, TL_iv.PageBlock pageBlock);

    boolean i0();

    void i1();

    void i2(gb2 gb2Var, TLRPC.Chat chat, int i, float f, float f2, boolean z);

    void j0(k27 k27Var);

    void j2(gb2 gb2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton);

    boolean k2(gb2 gb2Var, TLRPC.User user);

    boolean l();

    void l0(String str);

    void l1(gb2 gb2Var);

    boolean l2(gb2 gb2Var);

    void m0(gb2 gb2Var, int i);

    void m1(gb2 gb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2);

    void n1(gb2 gb2Var);

    void p();

    void q(gb2 gb2Var);

    void q1(gb2 gb2Var);

    void r0(gb2 gb2Var);

    void r1(gb2 gb2Var, ArrayList arrayList, int i, int i2, int i3);

    void s(gb2 gb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i);

    boolean s0(gb2 gb2Var, boolean z);

    void s2(gb2 gb2Var, float f, float f2);

    void t();

    void u2();

    void v0(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    void v1(gb2 gb2Var, float f, float f2);

    void v2(gb2 gb2Var);

    void w0(gb2 gb2Var, int i, int i2);

    String x(long j);

    boolean x0(gb2 gb2Var, TLRPC.Chat chat);

    void x1(gb2 gb2Var);

    void x2(gb2 gb2Var, boolean z, boolean z2);

    boolean y1();

    boolean y2(int i);

    boolean z1(k27 k27Var);
}
