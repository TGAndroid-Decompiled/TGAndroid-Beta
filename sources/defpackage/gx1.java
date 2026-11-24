package defpackage;

import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class gx1 implements Runnable {
    public final byte a;
    public final ChatActivityEnterView b;

    public gx1(ChatActivityEnterView chatActivityEnterView, byte b) {
        this.a = b;
        this.b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (b) {
            case 0:
                int i = ChatActivityEnterView.z7;
                chatActivityEnterView.n1();
                return;
            case 1:
                int i2 = ChatActivityEnterView.z7;
                chatActivityEnterView.b4 = false;
                chatActivityEnterView.k1();
                return;
            case 2:
                int i3 = ChatActivityEnterView.z7;
                c41.b0(chatActivityEnterView.F3).T(jb6.M0(2131752664, null)).j();
                return;
            case 3:
                int i4 = ChatActivityEnterView.z7;
                sy1 sy1Var = chatActivityEnterView.F0;
                if (sy1Var != null) {
                    sy1Var.setText("");
                    return;
                }
                return;
            case 4:
                int i5 = ChatActivityEnterView.z7;
                sy1 sy1Var2 = chatActivityEnterView.F0;
                if (sy1Var2 != null) {
                    sy1Var2.setText("");
                }
                chatActivityEnterView.M(true);
                return;
            case 5:
                int i6 = ChatActivityEnterView.z7;
                j67 j67Var = chatActivityEnterView.M0;
                if (j67Var != null) {
                    j67Var.f(false);
                    chatActivityEnterView.M0 = null;
                }
                gm.d3(new mw1(chatActivityEnterView, (byte) 8), 600L);
                return;
            case 6:
                int i7 = ChatActivityEnterView.z7;
                ik.J(chatActivityEnterView.E3, chatActivityEnterView.F3.a(), new gy1(chatActivityEnterView), chatActivityEnterView.L4);
                return;
            case 7:
                int i8 = ChatActivityEnterView.z7;
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                chatActivityEnterView2.x1(true, 2147483646, 0, 0L, true);
                j67 j67Var2 = chatActivityEnterView2.M0;
                if (j67Var2 != null) {
                    j67Var2.f(false);
                    chatActivityEnterView2.M0 = null;
                    return;
                }
                return;
            case 8:
                int i9 = ChatActivityEnterView.z7;
                yv1 yv1Var = chatActivityEnterView.F3;
                TL_iv.RichMessage richMessage = chatActivityEnterView.u2;
                if (richMessage != null && chatActivityEnterView.F0 != null && yv1Var != null) {
                    oc7.r1(chatActivityEnterView.R);
                    boolean z = e21.a;
                    jf9 jf9Var = new jf9(richMessage);
                    jf9Var.e = true;
                    jf9Var.setResourceProvider(chatActivityEnterView.L4);
                    jf9Var.K = yv1Var;
                    jf9Var.s = yv1Var.U;
                    jf9Var.w = yv1Var.a0;
                    jf9Var.M = new gx1(chatActivityEnterView, (byte) 14);
                    jf9Var.L = new gx1(chatActivityEnterView, (byte) 15);
                    yv1Var.presentFragment(jf9Var);
                    return;
                }
                return;
            case 9:
                int i10 = ChatActivityEnterView.z7;
                yv1 yv1Var2 = chatActivityEnterView.F3;
                if (yv1Var2 != null) {
                    yv1Var2.showDialog(new kj8((d) yv1Var2, 43, true));
                    return;
                }
                return;
            case 10:
                chatActivityEnterView.j2();
                return;
            case 11:
                int i11 = ChatActivityEnterView.z7;
                if (!chatActivityEnterView.O2 && !chatActivityEnterView.v3) {
                    chatActivityEnterView.M(true);
                    return;
                }
                return;
            case 12:
                int i12 = ChatActivityEnterView.z7;
                chatActivityEnterView.e2(true, true);
                chatActivityEnterView.W = null;
                return;
            case 13:
                int i13 = ChatActivityEnterView.z7;
                chatActivityEnterView.H2();
                return;
            case 14:
                int i14 = ChatActivityEnterView.z7;
                sy1 sy1Var3 = chatActivityEnterView.F0;
                if (sy1Var3 != null) {
                    sy1Var3.setText("");
                    return;
                }
                return;
            case 15:
                int i15 = ChatActivityEnterView.z7;
                sy1 sy1Var4 = chatActivityEnterView.F0;
                if (sy1Var4 != null) {
                    sy1Var4.setText("");
                }
                chatActivityEnterView.M(true);
                return;
            case 16:
                int i16 = ChatActivityEnterView.z7;
                chatActivityEnterView.A1();
                return;
            case 17:
                int i17 = ChatActivityEnterView.z7;
                chatActivityEnterView.F();
                return;
            case 18:
                int i18 = ChatActivityEnterView.z7;
                chatActivityEnterView.m();
                return;
            default:
                int i19 = ChatActivityEnterView.z7;
                chatActivityEnterView.p0();
                return;
        }
    }
}
