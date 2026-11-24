package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class ir1 implements g59 {
    public final yv1 a;

    public ir1(yv1 yv1Var) {
        this.a = yv1Var;
    }

    @Override
    public final void d(float f, float f2, int i, View view) {
        boolean z;
        a aVar;
        rc2 rc2Var;
        k47 messageObject;
        k47 messageObject2;
        int i2;
        ylb ylbVar;
        yv1 yv1Var = this.a;
        z = ((d) yv1Var).inPreviewMode;
        if (!z) {
            yv1Var.R4 = true;
            boolean z2 = view instanceof cm1;
            if (z2 && (messageObject2 = ((cm1) view).getMessageObject()) != null) {
                TLRPC.MessageAction messageAction = messageObject2.k.action;
                if (messageAction instanceof TLRPC.TL_messageActionWalletTonConnectRequest) {
                    TLRPC.TL_messageActionWalletTonConnectRequest tL_messageActionWalletTonConnectRequest = (TLRPC.TL_messageActionWalletTonConnectRequest) messageAction;
                    if (tL_messageActionWalletTonConnectRequest.expires > yv1Var.getConnectionsManager().getCurrentTime() && !messageObject2.N3() && k47.B0(messageObject2.k) == 777000) {
                        Activity parentActivity = yv1Var.getParentActivity();
                        i2 = ((d) yv1Var).currentAccount;
                        long j = tL_messageActionWalletTonConnectRequest.session_id;
                        int e1 = messageObject2.e1();
                        ylbVar = ((d) yv1Var).resourceProvider;
                        w45.q(parentActivity, i2, j, e1, ylbVar, null);
                        return;
                    }
                    return;
                }
            }
            boolean z3 = false;
            if (z2) {
                cm1 cm1Var = (cm1) view;
                if (cm1Var.getMessageObject().l0) {
                    if (!yv1Var.mb) {
                        Bundle bundle = new Bundle();
                        int i3 = cm1Var.getMessageObject().k.date;
                        bundle.putLong("dialog_id", yv1Var.l6);
                        bundle.putLong("topic_id", yv1Var.d());
                        bundle.putInt("type", 0);
                        k91 k91Var = new k91(0, i3, bundle);
                        k91Var.O = yv1Var;
                        yv1Var.presentFragment(k91Var);
                        return;
                    }
                    return;
                } else if (cm1Var.getMessageObject() != null && (cm1Var.getMessageObject().k.action instanceof TLRPC.TL_messageActionBoostApply)) {
                    yv1Var.getNotificationCenter().k(nm7.p3, Long.valueOf(yv1Var.l6));
                    return;
                }
            }
            if (z2) {
                cm1 cm1Var2 = (cm1) view;
                if (cm1Var2.getMessageObject() != null && (cm1Var2.getMessageObject().k.action instanceof TLRPC.TL_messageActionSetSameChatWallPaper)) {
                    gm.d3(new eh(this, cm1Var2.getMessageObject().N1(), (byte) 15), 16L);
                    return;
                }
            }
            aVar = ((d) yv1Var).actionBar;
            if (!aVar.y() && !yv1Var.c8()) {
                if ((view instanceof rc2) && (messageObject = (rc2Var = (rc2) view).getMessageObject()) != null && messageObject.D == 27) {
                    messageObject.X5();
                    messageObject.M1 = true;
                    rc2Var.J1();
                    view.requestLayout();
                    if (i >= 0) {
                        yv1Var.D0.g(i);
                        return;
                    }
                    return;
                }
                yv1Var.Y5(view, true, false, f, f2, true, false, false);
                return;
            }
            if (view instanceof rc2) {
                nu1 nu1Var = yv1Var.u9;
                rc2 rc2Var2 = (rc2) view;
                if (nu1Var.y(rc2Var2.getMessageObject())) {
                    return;
                }
                z3 = !rc2Var2.E2(f);
            }
            yv1Var.Ra(view, f, f2, z3);
        }
    }

    @Override
    public final void p(View view, float f, float f2) {
        k47 messageObject;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        yv1 yv1Var = this.a;
        if (yv1Var.getParentActivity() != null && !yv1Var.x() && !yv1Var.X7() && !yv1Var.isInPreviewMode() && !yv1Var.b8()) {
            if (view instanceof rc2) {
                messageObject = ((rc2) view).getPrimaryMessageObject();
            } else if (view instanceof cm1) {
                messageObject = ((cm1) view).getMessageObject();
                if (messageObject.l0) {
                    return;
                }
            } else {
                return;
            }
            k47 k47Var = messageObject;
            if (!(k47Var.k instanceof TLRPC.TL_message_secret) && k47Var.z() && !k47Var.g3() && k47Var.D != 27) {
                TLRPC.Chat chat = yv1Var.e;
                if (chat == null || sd2.V(chat) || sd2.w(26, yv1Var.e)) {
                    boolean z = false;
                    g39.b(false);
                    String S = yv1Var.getMediaDataController().S();
                    if (S.startsWith("animated_")) {
                        if (yv1Var.l6 >= 0) {
                            z = true;
                        }
                        if (!z && (chatFull2 = yv1Var.r8) != null) {
                            z = sd2.w0(chatFull2, S);
                        }
                        if (z) {
                            yv1Var.vb(view, k47Var, null, null, f, f2, k39.b(S), true, false, false, false);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) yv1Var.getMediaDataController().r.get(S);
                    if (tL_availableReaction != null && !k47Var.q4()) {
                        if (yv1Var.l6 >= 0) {
                            z = true;
                        }
                        if (!z && (chatFull = yv1Var.r8) != null) {
                            z = sd2.w0(chatFull, tL_availableReaction.reaction);
                        }
                        if (z) {
                            yv1Var.vb(view, k47Var, null, null, f, f2, k39.c(tL_availableReaction), true, false, false, false);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final boolean u(View view) {
        boolean z;
        boolean z2;
        k47 messageObject;
        a aVar;
        TLRPC.ChatFull chatFull;
        yv1 yv1Var = this.a;
        if (!yv1Var.b8() && (!((z = view instanceof rc2)) || !((rc2) view).S2())) {
            String S = yv1Var.getMediaDataController().S();
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) yv1Var.getMediaDataController().r.get(S);
            if (tL_availableReaction != null || (S != null && S.startsWith("animated_"))) {
                if (yv1Var.l6 >= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2 && (chatFull = yv1Var.r8) != null) {
                    if (tL_availableReaction != null) {
                        S = tL_availableReaction.reaction;
                    }
                    z2 = sd2.w0(chatFull, S);
                }
                if (z2) {
                    if (z) {
                        messageObject = ((rc2) view).getPrimaryMessageObject();
                    } else if (view instanceof cm1) {
                        messageObject = ((cm1) view).getMessageObject();
                    }
                    if (messageObject != null && !messageObject.l0 && !messageObject.n4() && messageObject.z() && !messageObject.Y2()) {
                        aVar = ((d) yv1Var).actionBar;
                        if (!aVar.y() && !yv1Var.x() && !yv1Var.X7() && !messageObject.q4()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
