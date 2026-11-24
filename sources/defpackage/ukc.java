package defpackage;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.c;
public final class ukc implements Runnable {
    public final byte a;
    public final ykc b;

    public ukc(ykc ykcVar, byte b) {
        this.a = b;
        this.b = ykcVar;
    }

    @Override
    public final void run() {
        ykc ykcVar;
        ry ryVar;
        int i;
        byte b = this.a;
        ykc ykcVar2 = this.b;
        switch (b) {
            case 0:
                if (!ykcVar2.R && ykcVar2.W <= 0.0f && (ykcVar = ((glc) ykcVar2.a.e).K) != null) {
                    gm.B2(ykcVar);
                    return;
                }
                return;
            default:
                if (ykcVar2.f0 == 0) {
                    ykcVar2.f0 = -1;
                    ykcVar2.invalidate();
                    try {
                        ykcVar2.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    glc glcVar = (glc) ykcVar2.a.e;
                    String trim = glcVar.n.trim();
                    if (!trim.isEmpty() && glcVar.c == 4) {
                        c cVar = glcVar.b;
                        blc blcVar = new blc(glcVar, (byte) 3);
                        ykc ykcVar3 = glcVar.K;
                        ChatActivityEnterView chatActivityEnterView = cVar.a;
                        int i2 = ChatActivityEnterView.z7;
                        ylb ylbVar = chatActivityEnterView.L4;
                        yv1 yv1Var = chatActivityEnterView.F3;
                        by1 by1Var = chatActivityEnterView.K0;
                        if (by1Var != null && by1Var.getWidth() > 0) {
                            j67 j67Var = chatActivityEnterView.M0;
                            if (j67Var != null) {
                                j67Var.f(false);
                            }
                            gm.r(chatActivityEnterView.e6);
                            wy1 wy1Var = new wy1(chatActivityEnterView, chatActivityEnterView.getContext(), ylbVar, ykcVar3);
                            chatActivityEnterView.M0 = wy1Var;
                            wy1Var.setOnDismissListener(new pw1(chatActivityEnterView, (byte) 0));
                            if (ykcVar3 != null) {
                                ryVar = new ry(ykcVar3);
                            } else {
                                ryVar = null;
                            }
                            boolean z = true;
                            ry ryVar2 = ryVar;
                            boolean[] zArr = new boolean[1];
                            if (ryVar2 != null) {
                                j67 j67Var2 = chatActivityEnterView.M0;
                                ?? obj = new Object();
                                obj.c = zArr;
                                obj.d = ryVar2;
                                obj.b = new float[4];
                                j67Var2.m0 = obj;
                                j67Var2.n0 = ryVar2;
                            }
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.out = true;
                            tL_message.peer_id = oc7.r1(chatActivityEnterView.R).x1(chatActivityEnterView.G3);
                            tL_message.from_id = oc7.r1(chatActivityEnterView.R).x1(z8c.h(chatActivityEnterView.R).e());
                            CharSequence[] charSequenceArr = {new SpannableStringBuilder(trim)};
                            k47.d(charSequenceArr[0], true);
                            tL_message.entities.addAll(hs6.d0(chatActivityEnterView.R).Y(charSequenceArr, true, true));
                            tL_message.message = charSequenceArr[0].toString();
                            k47 k47Var = chatActivityEnterView.J3;
                            if (k47Var != null && !k47Var.p) {
                                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                k47 k47Var2 = chatActivityEnterView.K3;
                                if (k47Var2 != null) {
                                    tL_messageReplyHeader.flags |= 2;
                                    tL_messageReplyHeader.reply_to_top_id = k47Var2.e1();
                                }
                                tL_messageReplyHeader.flags |= 16;
                                tL_messageReplyHeader.reply_to_msg_id = chatActivityEnterView.J3.e1();
                                tL_message.reply_to = tL_messageReplyHeader;
                            }
                            k47 k47Var3 = new k47(chatActivityEnterView.R, tL_message, false, false);
                            k47 k47Var4 = chatActivityEnterView.J3;
                            if (k47Var4 != null && !k47Var4.p) {
                                k47Var3.C = k47Var4;
                            }
                            k47Var3.B0 = true;
                            k47Var3.W2 = Boolean.TRUE;
                            k47Var3.D = 0;
                            k47Var3.n0(null);
                            k47Var3.w1 = true;
                            chatActivityEnterView.M0.r(td4.u(k47Var3));
                            qw1 qw1Var = new qw1(chatActivityEnterView, zArr, blcVar, trim, (byte) 0);
                            chatActivityEnterView.M0.s(by1Var, true, new k81(qw1Var, (byte) 11));
                            if (chatActivityEnterView.G3 >= 0) {
                                chatActivityEnterView.M0.a(yv1Var);
                                chatActivityEnterView.M0.p(chatActivityEnterView.W6);
                            }
                            bu5 G = bu5.G(chatActivityEnterView, ylbVar, by1Var);
                            if (yv1Var == null || !m9c.D(yv1Var.h())) {
                                z = false;
                            }
                            if (yv1Var != null && yv1Var.M4()) {
                                if (z) {
                                    i = 2131745248;
                                } else {
                                    i = 2131745593;
                                }
                                G.b(2131232083, jb6.M0(i, null), new uj1(chatActivityEnterView, qw1Var, (byte) 26), false);
                            }
                            if (!z && (chatActivityEnterView.H0 <= 0 || chatActivityEnterView.c())) {
                                G.b(2131231513, jb6.M0(2131745317, null), new fo1(qw1Var, (byte) 11), false);
                            }
                            G.Z();
                            chatActivityEnterView.M0.q(G);
                            chatActivityEnterView.M0.show();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
