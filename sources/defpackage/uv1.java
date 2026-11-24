package defpackage;

import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class uv1 implements Runnable {
    public final byte a;
    public final ChatActivityEnterView b;

    public uv1(ChatActivityEnterView chatActivityEnterView, byte b) {
        this.a = b;
        this.b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (b) {
            case 0:
                int i = ChatActivityEnterView.r7;
                ex1 ex1Var = chatActivityEnterView.F0;
                if (ex1Var != null) {
                    ex1Var.setText("");
                    return;
                }
                return;
            case 1:
                int i2 = ChatActivityEnterView.r7;
                ex1 ex1Var2 = chatActivityEnterView.F0;
                if (ex1Var2 != null) {
                    ex1Var2.setText("");
                }
                chatActivityEnterView.N(true);
                return;
            case 2:
                int i3 = ChatActivityEnterView.r7;
                j47 j47Var = chatActivityEnterView.M0;
                if (j47Var != null) {
                    j47Var.f(false);
                    chatActivityEnterView.M0 = null;
                }
                gl.d3(new av1(chatActivityEnterView, (byte) 5), 600L);
                return;
            case 3:
                int i4 = ChatActivityEnterView.r7;
                ij.J(chatActivityEnterView.E3, chatActivityEnterView.F3.a(), new tw1(chatActivityEnterView), chatActivityEnterView.L4);
                return;
            case 4:
                int i5 = ChatActivityEnterView.r7;
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                chatActivityEnterView2.v1(true, 2147483646, 0, 0L, true);
                j47 j47Var2 = chatActivityEnterView2.M0;
                if (j47Var2 != null) {
                    j47Var2.f(false);
                    chatActivityEnterView2.M0 = null;
                    return;
                }
                return;
            case 5:
                int i6 = ChatActivityEnterView.r7;
                mu1 mu1Var = chatActivityEnterView.F3;
                TL_iv.RichMessage richMessage = chatActivityEnterView.u2;
                if (richMessage != null && chatActivityEnterView.F0 != null && mu1Var != null) {
                    na7.q1(chatActivityEnterView.R);
                    boolean z = w01.a;
                    hd9 hd9Var = new hd9(richMessage);
                    hd9Var.e = true;
                    hd9Var.setResourceProvider(chatActivityEnterView.L4);
                    hd9Var.K = mu1Var;
                    hd9Var.s = mu1Var.U;
                    hd9Var.w = mu1Var.a0;
                    hd9Var.M = new uv1(chatActivityEnterView, (byte) 12);
                    hd9Var.L = new uv1(chatActivityEnterView, (byte) 13);
                    mu1Var.presentFragment(hd9Var);
                    return;
                }
                return;
            case 6:
                int i7 = ChatActivityEnterView.r7;
                mu1 mu1Var2 = chatActivityEnterView.F3;
                if (mu1Var2 != null) {
                    mu1Var2.showDialog(new jh8((d) mu1Var2, 43, true));
                    return;
                }
                return;
            case 7:
                chatActivityEnterView.e2();
                return;
            case 8:
                int i8 = ChatActivityEnterView.r7;
                if (!chatActivityEnterView.O2 && !chatActivityEnterView.v3) {
                    chatActivityEnterView.N(true);
                    return;
                }
                return;
            case 9:
                int i9 = ChatActivityEnterView.r7;
                chatActivityEnterView.b2(true, true);
                chatActivityEnterView.W = null;
                return;
            case 10:
                int i10 = ChatActivityEnterView.r7;
                chatActivityEnterView.C2();
                return;
            case 11:
                int i11 = ChatActivityEnterView.r7;
                j47 j47Var3 = chatActivityEnterView.M0;
                if (j47Var3 != null) {
                    j47Var3.f(chatActivityEnterView.d6);
                    chatActivityEnterView.M0 = null;
                    return;
                }
                return;
            case 12:
                int i12 = ChatActivityEnterView.r7;
                ex1 ex1Var3 = chatActivityEnterView.F0;
                if (ex1Var3 != null) {
                    ex1Var3.setText("");
                    return;
                }
                return;
            case 13:
                int i13 = ChatActivityEnterView.r7;
                ex1 ex1Var4 = chatActivityEnterView.F0;
                if (ex1Var4 != null) {
                    ex1Var4.setText("");
                }
                chatActivityEnterView.N(true);
                return;
            case 14:
                int i14 = ChatActivityEnterView.r7;
                chatActivityEnterView.x1();
                return;
            case 15:
                int i15 = ChatActivityEnterView.r7;
                chatActivityEnterView.b4 = false;
                chatActivityEnterView.i1();
                return;
            case 16:
                int i16 = ChatActivityEnterView.r7;
                chatActivityEnterView.G();
                return;
            case 17:
                int i17 = ChatActivityEnterView.r7;
                chatActivityEnterView.m();
                return;
            default:
                int i18 = ChatActivityEnterView.r7;
                chatActivityEnterView.p0();
                return;
        }
    }
}
