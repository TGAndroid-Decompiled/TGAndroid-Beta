package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
public final class jq1 implements s69 {
    public final zu1 a;

    public jq1(zu1 zu1Var) {
        this.a = zu1Var;
    }

    @Override
    public final boolean C(View view) {
        boolean z;
        boolean z2;
        r47 messageObject;
        a aVar;
        TLRPC.ChatFull chatFull;
        zu1 zu1Var = this.a;
        if (!zu1Var.b8() && (!((z = view instanceof wb2)) || !((wb2) view).S2())) {
            String S = zu1Var.getMediaDataController().S();
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) zu1Var.getMediaDataController().r.get(S);
            if (tL_availableReaction != null || (S != null && S.startsWith("animated_"))) {
                if (zu1Var.l6 >= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2 && (chatFull = zu1Var.r8) != null) {
                    if (tL_availableReaction != null) {
                        S = tL_availableReaction.reaction;
                    }
                    z2 = xc2.w0(chatFull, S);
                }
                if (z2) {
                    if (z) {
                        messageObject = ((wb2) view).getPrimaryMessageObject();
                    } else if (view instanceof dl1) {
                        messageObject = ((dl1) view).getMessageObject();
                    }
                    if (messageObject != null && !messageObject.l0 && !messageObject.n4() && messageObject.z() && !messageObject.Y2()) {
                        aVar = ((e) zu1Var).actionBar;
                        if (!aVar.z() && !zu1Var.y() && !zu1Var.X7() && !messageObject.q4()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void d(float f, float f2, int i, View view) {
        boolean z;
        a aVar;
        wb2 wb2Var;
        r47 messageObject;
        r47 messageObject2;
        int i2;
        vnb vnbVar;
        zu1 zu1Var = this.a;
        z = ((e) zu1Var).inPreviewMode;
        if (!z) {
            zu1Var.R4 = true;
            boolean z2 = view instanceof dl1;
            if (z2 && (messageObject2 = ((dl1) view).getMessageObject()) != null) {
                TLRPC.MessageAction messageAction = messageObject2.k.action;
                if (messageAction instanceof TLRPC.TL_messageActionWalletTonConnectRequest) {
                    TLRPC.TL_messageActionWalletTonConnectRequest tL_messageActionWalletTonConnectRequest = (TLRPC.TL_messageActionWalletTonConnectRequest) messageAction;
                    if (tL_messageActionWalletTonConnectRequest.expires > zu1Var.getConnectionsManager().getCurrentTime() && !messageObject2.N3() && r47.B0(messageObject2.k) == 777000) {
                        Activity parentActivity = zu1Var.getParentActivity();
                        i2 = ((e) zu1Var).currentAccount;
                        long j = tL_messageActionWalletTonConnectRequest.session_id;
                        int e1 = messageObject2.e1();
                        vnbVar = ((e) zu1Var).resourceProvider;
                        a55.q(parentActivity, i2, j, e1, vnbVar, null);
                        return;
                    }
                    return;
                }
            }
            boolean z3 = false;
            if (z2) {
                dl1 dl1Var = (dl1) view;
                if (dl1Var.getMessageObject().l0) {
                    if (!zu1Var.mb) {
                        Bundle bundle = new Bundle();
                        int i3 = dl1Var.getMessageObject().k.date;
                        bundle.putLong("dialog_id", zu1Var.l6);
                        bundle.putLong("topic_id", zu1Var.c());
                        bundle.putInt("type", 0);
                        j81 j81Var = new j81(0, i3, bundle);
                        j81Var.O = zu1Var;
                        zu1Var.presentFragment(j81Var);
                        return;
                    }
                    return;
                } else if (dl1Var.getMessageObject() != null && (dl1Var.getMessageObject().k.action instanceof TLRPC.TL_messageActionBoostApply)) {
                    zu1Var.getNotificationCenter().k(jn7.p3, Long.valueOf(zu1Var.l6));
                    return;
                }
            }
            if (z2) {
                dl1 dl1Var2 = (dl1) view;
                if (dl1Var2.getMessageObject() != null && (dl1Var2.getMessageObject().k.action instanceof TLRPC.TL_messageActionSetSameChatWallPaper)) {
                    hl.d3(new zd(this, dl1Var2.getMessageObject().N1(), (byte) 15), 16L);
                    return;
                }
            }
            aVar = ((e) zu1Var).actionBar;
            if (!aVar.z() && !zu1Var.c8()) {
                if ((view instanceof wb2) && (messageObject = (wb2Var = (wb2) view).getMessageObject()) != null && messageObject.D == 27) {
                    messageObject.X5();
                    messageObject.M1 = true;
                    wb2Var.J1();
                    view.requestLayout();
                    if (i >= 0) {
                        zu1Var.D0.g(i);
                        return;
                    }
                    return;
                }
                zu1Var.Y5(view, true, false, f, f2, true, false, false);
                return;
            }
            if (view instanceof wb2) {
                ot1 ot1Var = zu1Var.u9;
                wb2 wb2Var2 = (wb2) view;
                if (ot1Var.y(wb2Var2.getMessageObject())) {
                    return;
                }
                z3 = !wb2Var2.E2(f);
            }
            zu1Var.Sa(view, f, f2, z3);
        }
    }

    @Override
    public final void u(View view, float f, float f2) {
        r47 messageObject;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        zu1 zu1Var = this.a;
        if (zu1Var.getParentActivity() != null && !zu1Var.y() && !zu1Var.X7() && !zu1Var.isInPreviewMode() && !zu1Var.b8()) {
            if (view instanceof wb2) {
                messageObject = ((wb2) view).getPrimaryMessageObject();
            } else if (view instanceof dl1) {
                messageObject = ((dl1) view).getMessageObject();
                if (messageObject.l0) {
                    return;
                }
            } else {
                return;
            }
            r47 r47Var = messageObject;
            if (!(r47Var.k instanceof TLRPC.TL_message_secret) && r47Var.z() && !r47Var.g3() && r47Var.D != 27) {
                TLRPC.Chat chat = zu1Var.e;
                if (chat == null || xc2.V(chat) || xc2.w(26, zu1Var.e)) {
                    boolean z = false;
                    s49.b(false);
                    String S = zu1Var.getMediaDataController().S();
                    if (S.startsWith("animated_")) {
                        if (zu1Var.l6 >= 0) {
                            z = true;
                        }
                        if (!z && (chatFull2 = zu1Var.r8) != null) {
                            z = xc2.w0(chatFull2, S);
                        }
                        if (z) {
                            zu1Var.wb(view, r47Var, null, null, f, f2, w49.b(S), true, false, false, false);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) zu1Var.getMediaDataController().r.get(S);
                    if (tL_availableReaction != null && !r47Var.q4()) {
                        if (zu1Var.l6 >= 0) {
                            z = true;
                        }
                        if (!z && (chatFull = zu1Var.r8) != null) {
                            z = xc2.w0(chatFull, tL_availableReaction.reaction);
                        }
                        if (z) {
                            zu1Var.wb(view, r47Var, null, null, f, f2, w49.c(tL_availableReaction), true, false, false, false);
                        }
                    }
                }
            }
        }
    }
}
