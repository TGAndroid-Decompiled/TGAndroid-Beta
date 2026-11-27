package defpackage;

import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class fw1 implements Runnable {
    public final byte a;
    public final ChatActivityEnterView b;

    public fw1(ChatActivityEnterView chatActivityEnterView, byte b) {
        this.a = b;
        this.b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (b) {
            case 0:
                int i = ChatActivityEnterView.X7;
                xy1 xy1Var = chatActivityEnterView.O3;
                if (xy1Var != null) {
                    xy1Var.o(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            case 1:
            case 23:
                chatActivityEnterView.q2();
                return;
            case 2:
                int i2 = ChatActivityEnterView.X7;
                hl.B2(chatActivityEnterView.O);
                return;
            case 3:
                int i3 = ChatActivityEnterView.X7;
                if (!chatActivityEnterView.Y2 && !chatActivityEnterView.N2 && chatActivityEnterView.Q3 != null) {
                    chatActivityEnterView.E0().u();
                    return;
                }
                return;
            case 4:
                int i4 = ChatActivityEnterView.X7;
                chatActivityEnterView.a4 = false;
                chatActivityEnterView.p1();
                return;
            case 5:
                int i5 = ChatActivityEnterView.X7;
                d31.b0(chatActivityEnterView.E3).T(ob6.M0(2131752692, null)).j();
                return;
            case 6:
                int i6 = ChatActivityEnterView.X7;
                if (chatActivityEnterView.k7 != 0 && !chatActivityEnterView.v1()) {
                    chatActivityEnterView.P(true);
                    return;
                }
                return;
            case 7:
                int i7 = ChatActivityEnterView.X7;
                tx1 tx1Var = chatActivityEnterView.F0;
                if (tx1Var != null) {
                    tx1Var.setText("");
                    return;
                }
                return;
            case 8:
                int i8 = ChatActivityEnterView.X7;
                tx1 tx1Var2 = chatActivityEnterView.F0;
                if (tx1Var2 != null) {
                    tx1Var2.setText("");
                }
                chatActivityEnterView.P(true);
                return;
            case 9:
                int i9 = ChatActivityEnterView.X7;
                zu1 zu1Var = chatActivityEnterView.E3;
                if (zu1Var == null || zu1Var.isLastFragment()) {
                    chatActivityEnterView.U();
                }
                chatActivityEnterView.i7 = null;
                return;
            case 10:
                int i10 = ChatActivityEnterView.X7;
                q67 q67Var = chatActivityEnterView.M0;
                if (q67Var != null) {
                    q67Var.f(false);
                    chatActivityEnterView.M0 = null;
                }
                hl.d3(new mv1(chatActivityEnterView, (byte) 1), 120L);
                return;
            case 11:
                int i11 = ChatActivityEnterView.X7;
                jj.J(chatActivityEnterView.D3, chatActivityEnterView.E3.a(), new fx1(chatActivityEnterView), chatActivityEnterView.K4);
                return;
            case 12:
                int i12 = ChatActivityEnterView.X7;
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                chatActivityEnterView2.F1(true, 2147483646, 0, 0L, true);
                q67 q67Var2 = chatActivityEnterView2.M0;
                if (q67Var2 != null) {
                    q67Var2.f(false);
                    chatActivityEnterView2.M0 = null;
                    return;
                }
                return;
            case 13:
                int i13 = ChatActivityEnterView.X7;
                q67 q67Var3 = chatActivityEnterView.M0;
                if (q67Var3 != null) {
                    q67Var3.f(false);
                    chatActivityEnterView.M0 = null;
                }
                hl.d3(new mv1(chatActivityEnterView, (byte) 6), 600L);
                return;
            case 14:
                int i14 = ChatActivityEnterView.X7;
                q67 q67Var4 = chatActivityEnterView.M0;
                if (q67Var4 != null) {
                    q67Var4.f(false);
                    chatActivityEnterView.M0 = null;
                }
                fc.e(chatActivityEnterView.R, chatActivityEnterView.l(), null);
                chatActivityEnterView.q2();
                hl.d3(new mv1(chatActivityEnterView, (byte) 2), 320L);
                return;
            case 15:
                int i15 = ChatActivityEnterView.X7;
                zu1 zu1Var2 = chatActivityEnterView.E3;
                TL_iv.RichMessage richMessage = chatActivityEnterView.t2;
                if (richMessage != null && chatActivityEnterView.F0 != null && zu1Var2 != null) {
                    uc7.s1(chatActivityEnterView.R);
                    boolean z = f11.a;
                    yg9 yg9Var = new yg9(richMessage);
                    yg9Var.e = true;
                    yg9Var.setResourceProvider(chatActivityEnterView.K4);
                    yg9Var.K = zu1Var2;
                    yg9Var.s = zu1Var2.U;
                    yg9Var.w = zu1Var2.a0;
                    yg9Var.M = new fw1(chatActivityEnterView, (byte) 21);
                    yg9Var.L = new fw1(chatActivityEnterView, (byte) 22);
                    zu1Var2.presentFragment(yg9Var);
                    return;
                }
                return;
            case 16:
                int i16 = ChatActivityEnterView.X7;
                zu1 zu1Var3 = chatActivityEnterView.E3;
                if (zu1Var3 != null) {
                    zu1Var3.showDialog(new xk8((e) zu1Var3, 43, true));
                    return;
                }
                return;
            case 17:
                int i17 = ChatActivityEnterView.X7;
                if (!chatActivityEnterView.N2 && !chatActivityEnterView.u3) {
                    chatActivityEnterView.P(true);
                    return;
                }
                return;
            case 18:
                int i18 = ChatActivityEnterView.X7;
                chatActivityEnterView.n2(true, true);
                chatActivityEnterView.W = null;
                return;
            case 19:
                int i19 = ChatActivityEnterView.X7;
                chatActivityEnterView.s1();
                return;
            case 20:
                int i20 = ChatActivityEnterView.X7;
                chatActivityEnterView.A0(false);
                return;
            case 21:
                int i21 = ChatActivityEnterView.X7;
                tx1 tx1Var3 = chatActivityEnterView.F0;
                if (tx1Var3 != null) {
                    tx1Var3.setText("");
                    return;
                }
                return;
            case 22:
                int i22 = ChatActivityEnterView.X7;
                tx1 tx1Var4 = chatActivityEnterView.F0;
                if (tx1Var4 != null) {
                    tx1Var4.setText("");
                }
                chatActivityEnterView.P(true);
                return;
            case 24:
                int i23 = ChatActivityEnterView.X7;
                chatActivityEnterView.removeView(chatActivityEnterView.M);
                return;
            case 25:
                int i24 = ChatActivityEnterView.X7;
                chatActivityEnterView.H();
                return;
            case 26:
                int i25 = ChatActivityEnterView.X7;
                chatActivityEnterView.m();
                return;
            default:
                int i26 = ChatActivityEnterView.X7;
                chatActivityEnterView.s0();
                return;
        }
    }
}
