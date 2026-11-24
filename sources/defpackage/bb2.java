package defpackage;

import android.graphics.RectF;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public interface bb2 {
    boolean A1(gb2 gb2Var, int i);

    void B0();

    boolean B2(gb2 gb2Var, k27 k27Var);

    void C1(gb2 gb2Var, boolean z);

    void C2();

    void D(gb2 gb2Var, TLRPC.User user, TLRPC.Document document, String str);

    boolean D0(gb2 gb2Var, TLRPC.PollAnswer pollAnswer);

    void D1(h27 h27Var);

    void E(gb2 gb2Var);

    void E0(gb2 gb2Var, long j);

    gib E2();

    boolean F(gb2 gb2Var, TLRPC.TodoItem todoItem);

    boolean F0(gb2 gb2Var);

    void F1(gb2 gb2Var, int i);

    void G1(gb2 gb2Var, boolean z, boolean z2);

    void H(gb2 gb2Var, TLRPC.Document document, RectF rectF);

    void H2(gb2 gb2Var);

    void I(gb2 gb2Var);

    void I1(k27 k27Var, String str, String str2, String str3, String str4, int i, int i2);

    boolean J0(long j);

    void K1(gb2 gb2Var, TLRPC.WebPage webPage, String str, boolean z);

    void M(gb2 gb2Var, int i, float f, float f2, boolean z);

    void M0(gb2 gb2Var, boolean z);

    void M1(gb2 gb2Var);

    boolean N();

    void N0(gb2 gb2Var);

    boolean N1();

    void O(gb2 gb2Var, CharacterStyle characterStyle, boolean z);

    void O1(gb2 gb2Var, iq0 iq0Var);

    boolean P();

    int Q();

    void R1();

    void S(gb2 gb2Var);

    boolean T0(gb2 gb2Var, TLRPC.TodoItem todoItem, boolean z);

    boolean T1(gm gmVar);

    int U(gb2 gb2Var);

    void V(gb2 gb2Var);

    void V0(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    vu1 W();

    void W1(gb2 gb2Var, TLObject tLObject, boolean z);

    void X(k27 k27Var);

    void X0(gb2 gb2Var);

    void X1(gb2 gb2Var);

    void Y(gb2 gb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia);

    void Y0(gb2 gb2Var, float f, float f2);

    void Y1(gb2 gb2Var);

    ma8 Z1();

    boolean b();

    void b0(gb2 gb2Var, TLRPC.User user, float f, float f2);

    String b1(gb2 gb2Var);

    void b2(String str, String str2);

    void c();

    void c0(int i);

    void c1(gb2 gb2Var);

    boolean c2(long j);

    boolean d0();

    void d2(gb2 gb2Var, k08 k08Var);

    CharacterStyle e0(gb2 gb2Var);

    void e2(gb2 gb2Var);

    boolean g2(k27 k27Var);

    boolean h0();

    boolean h1(gb2 gb2Var, TL_iv.PageBlock pageBlock);

    void i0(k27 k27Var);

    void i1();

    void i2(gb2 gb2Var, TLRPC.Chat chat, int i, float f, float f2, boolean z);

    void j2(gb2 gb2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton);

    void k0(String str);

    boolean k2(gb2 gb2Var, TLRPC.User user);

    boolean l();

    void l0(gb2 gb2Var, int i);

    void l1(gb2 gb2Var);

    boolean l2(gb2 gb2Var);

    void m1(gb2 gb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2);

    void n1(gb2 gb2Var);

    void p();

    void q(gb2 gb2Var);

    void q0(gb2 gb2Var);

    void q1(gb2 gb2Var);

    boolean r0(gb2 gb2Var, boolean z);

    void r1(gb2 gb2Var, ArrayList arrayList, int i, int i2, int i3);

    void s(gb2 gb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i);

    void s2(gb2 gb2Var, float f, float f2);

    void t();

    void u0(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

    void u2();

    void v0(gb2 gb2Var, int i, int i2);

    void v1(gb2 gb2Var, float f, float f2);

    void v2(gb2 gb2Var);

    boolean w0(gb2 gb2Var, TLRPC.Chat chat);

    String x(long j);

    void x1(gb2 gb2Var);

    void x2(gb2 gb2Var, boolean z, boolean z2);

    boolean y1();

    boolean y2(int i);

    void z(gb2 gb2Var, float f, float f2);

    void z0(gb2 gb2Var, float f, float f2, boolean z);

    boolean z1(k27 k27Var);
}
