package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class vp1 implements d39 {
    public final mu1 a;

    public vp1(mu1 mu1Var) {
        this.a = mu1Var;
    }

    @Override
    public final void e(float f, float f2, int i, View view) {
        boolean z;
        a aVar;
        gb2 gb2Var;
        k27 messageObject;
        k27 messageObject2;
        int i2;
        wjb wjbVar;
        mu1 mu1Var = this.a;
        z = ((d) mu1Var).inPreviewMode;
        if (!z) {
            mu1Var.R4 = true;
            boolean z2 = view instanceof uk1;
            if (z2 && (messageObject2 = ((uk1) view).getMessageObject()) != null) {
                TLRPC.MessageAction messageAction = messageObject2.k.action;
                if (messageAction instanceof TLRPC.TL_messageActionWalletTonConnectRequest) {
                    TLRPC.TL_messageActionWalletTonConnectRequest tL_messageActionWalletTonConnectRequest = (TLRPC.TL_messageActionWalletTonConnectRequest) messageAction;
                    if (tL_messageActionWalletTonConnectRequest.expires > mu1Var.getConnectionsManager().getCurrentTime() && !messageObject2.N3() && k27.B0(messageObject2.k) == 777000) {
                        Activity parentActivity = mu1Var.getParentActivity();
                        i2 = ((d) mu1Var).currentAccount;
                        long j = tL_messageActionWalletTonConnectRequest.session_id;
                        int e1 = messageObject2.e1();
                        wjbVar = ((d) mu1Var).resourceProvider;
                        w25.q(parentActivity, i2, j, e1, wjbVar, null);
                        return;
                    }
                    return;
                }
            }
            boolean z3 = false;
            if (z2) {
                uk1 uk1Var = (uk1) view;
                if (uk1Var.getMessageObject().l0) {
                    if (!mu1Var.mb) {
                        Bundle bundle = new Bundle();
                        int i3 = uk1Var.getMessageObject().k.date;
                        bundle.putLong("dialog_id", mu1Var.l6);
                        bundle.putLong("topic_id", mu1Var.d());
                        bundle.putInt("type", 0);
                        b81 b81Var = new b81(0, i3, bundle);
                        b81Var.O = mu1Var;
                        mu1Var.presentFragment(b81Var);
                        return;
                    }
                    return;
                } else if (uk1Var.getMessageObject() != null && (uk1Var.getMessageObject().k.action instanceof TLRPC.TL_messageActionBoostApply)) {
                    mu1Var.getNotificationCenter().k(kk7.o3, Long.valueOf(mu1Var.l6));
                    return;
                }
            }
            if (z2) {
                uk1 uk1Var2 = (uk1) view;
                if (uk1Var2.getMessageObject() != null && (uk1Var2.getMessageObject().k.action instanceof TLRPC.TL_messageActionSetSameChatWallPaper)) {
                    gl.d3(new eg(this, uk1Var2.getMessageObject().N1(), (byte) 16), 16L);
                    return;
                }
            }
            aVar = ((d) mu1Var).actionBar;
            if (!aVar.y() && !mu1Var.T7()) {
                if ((view instanceof gb2) && (messageObject = (gb2Var = (gb2) view).getMessageObject()) != null && messageObject.D == 27) {
                    messageObject.X5();
                    messageObject.M1 = true;
                    gb2Var.J1();
                    view.requestLayout();
                    if (i >= 0) {
                        mu1Var.D0.g(i);
                        return;
                    }
                    return;
                }
                mu1Var.R5(view, true, false, f, f2, true, false, false);
                return;
            }
            if (view instanceof gb2) {
                bt1 bt1Var = mu1Var.u9;
                gb2 gb2Var2 = (gb2) view;
                if (bt1Var.y(gb2Var2.getMessageObject())) {
                    return;
                }
                z3 = !gb2Var2.E2(f);
            }
            mu1Var.Ha(view, f, f2, z3);
        }
    }

    @Override
    public final void l(View view, float f, float f2) {
        k27 messageObject;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        mu1 mu1Var = this.a;
        if (mu1Var.getParentActivity() != null && !mu1Var.y() && !mu1Var.P7() && !mu1Var.isInPreviewMode() && !mu1Var.S7()) {
            if (view instanceof gb2) {
                messageObject = ((gb2) view).getPrimaryMessageObject();
            } else if (view instanceof uk1) {
                messageObject = ((uk1) view).getMessageObject();
                if (messageObject.l0) {
                    return;
                }
            } else {
                return;
            }
            k27 k27Var = messageObject;
            if (!(k27Var.k instanceof TLRPC.TL_message_secret) && k27Var.z() && !k27Var.g3() && k27Var.D != 27) {
                TLRPC.Chat chat = mu1Var.e;
                if (chat == null || hc2.V(chat) || hc2.w(26, mu1Var.e)) {
                    boolean z = false;
                    d19.b(false);
                    String S = mu1Var.getMediaDataController().S();
                    if (S.startsWith("animated_")) {
                        if (mu1Var.l6 >= 0) {
                            z = true;
                        }
                        if (!z && (chatFull2 = mu1Var.r8) != null) {
                            z = hc2.w0(chatFull2, S);
                        }
                        if (z) {
                            mu1Var.lb(view, k27Var, null, null, f, f2, h19.b(S), true, false, false, false);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) mu1Var.getMediaDataController().r.get(S);
                    if (tL_availableReaction != null && !k27Var.q4()) {
                        if (mu1Var.l6 >= 0) {
                            z = true;
                        }
                        if (!z && (chatFull = mu1Var.r8) != null) {
                            z = hc2.w0(chatFull, tL_availableReaction.reaction);
                        }
                        if (z) {
                            mu1Var.lb(view, k27Var, null, null, f, f2, h19.c(tL_availableReaction), true, false, false, false);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final boolean q(View view) {
        boolean z;
        boolean z2;
        k27 messageObject;
        a aVar;
        TLRPC.ChatFull chatFull;
        mu1 mu1Var = this.a;
        if (!mu1Var.S7() && (!((z = view instanceof gb2)) || !((gb2) view).S2())) {
            String S = mu1Var.getMediaDataController().S();
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) mu1Var.getMediaDataController().r.get(S);
            if (tL_availableReaction != null || (S != null && S.startsWith("animated_"))) {
                if (mu1Var.l6 >= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2 && (chatFull = mu1Var.r8) != null) {
                    if (tL_availableReaction != null) {
                        S = tL_availableReaction.reaction;
                    }
                    z2 = hc2.w0(chatFull, S);
                }
                if (z2) {
                    if (z) {
                        messageObject = ((gb2) view).getPrimaryMessageObject();
                    } else if (view instanceof uk1) {
                        messageObject = ((uk1) view).getMessageObject();
                    }
                    if (messageObject != null && !messageObject.l0 && !messageObject.n4() && messageObject.z() && !messageObject.Y2()) {
                        aVar = ((d) mu1Var).actionBar;
                        if (!aVar.y() && !mu1Var.y() && !mu1Var.P7() && !messageObject.q4()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
