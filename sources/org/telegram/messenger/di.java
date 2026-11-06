package org.telegram.messenger;

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class di implements RequestDelegate {
    public final int f22006a;
    public final c1 f22007b;
    public final Object f22008c;
    public final Object d;

    public di(c1 c1Var, Object obj, Object obj2, int i7) {
        this.f22006a = i7;
        this.f22007b = c1Var;
        this.f22008c = obj;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        long j3;
        int i7 = this.f22006a;
        Object obj = this.d;
        Object obj2 = this.f22008c;
        c1 c1Var = this.f22007b;
        switch (i7) {
            case 0:
                ui uiVar = (ui) c1Var;
                TLRPC.TL_messages_faveSticker tL_messages_faveSticker = (TLRPC.TL_messages_faveSticker) obj;
                if (tL_error != null && r8.r(tL_error.text) && obj2 != null) {
                    uiVar.getFileRefController().u(new Object[]{tL_messages_faveSticker}, obj2);
                    return;
                } else {
                    g0.h3(new fg(uiVar, 2));
                    return;
                }
            case 1:
                ui uiVar2 = (ui) c1Var;
                TLRPC.TL_messages_saveRecentSticker tL_messages_saveRecentSticker = (TLRPC.TL_messages_saveRecentSticker) obj;
                uiVar2.getClass();
                if (tL_error != null && r8.r(tL_error.text) && obj2 != null) {
                    uiVar2.getFileRefController().u(new Object[]{tL_messages_saveRecentSticker}, obj2);
                    return;
                }
                return;
            case 2:
                g0.h3(new mn((qp) c1Var, tL_error, tLObject, (Long) obj2, (c20) obj));
                return;
            case 3:
                qp qpVar = (qp) c1Var;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj2;
                TLRPC.TL_messages_createChat tL_messages_createChat = (TLRPC.TL_messages_createChat) obj;
                if (tL_error != null) {
                    g0.h3(new em(qpVar, tL_error, f2Var, tL_messages_createChat, 2));
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_invitedUsers) {
                    TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) tLObject;
                    qpVar.O3(tL_messages_invitedUsers.updates, false);
                    g0.h3(new b4(9, qpVar, tL_messages_invitedUsers));
                    return;
                } else {
                    return;
                }
            case 4:
                qp qpVar2 = (qp) c1Var;
                org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) obj2;
                TLRPC.TL_channels_createChannel tL_channels_createChannel = (TLRPC.TL_channels_createChannel) obj;
                if (tL_error != null) {
                    g0.h3(new em(qpVar2, tL_error, f2Var2, tL_channels_createChannel, 1));
                    return;
                }
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                qpVar2.O3(updates, false);
                g0.h3(new hi(20, qpVar2, updates));
                return;
            case 5:
                qp qpVar3 = (qp) c1Var;
                TLRPC.TL_messages_saveGif tL_messages_saveGif = (TLRPC.TL_messages_saveGif) obj;
                qpVar3.getClass();
                if (tL_error != null && r8.r(tL_error.text)) {
                    qpVar3.getFileRefController().u(new Object[]{tL_messages_saveGif}, obj2);
                    return;
                }
                return;
            case 6:
                qp qpVar4 = (qp) c1Var;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (tLObject != null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    if (t3.T(chat)) {
                        qpVar4.L3(tL_messages_affectedHistory.pts, tL_messages_affectedHistory.pts_count, chat.f26953id);
                    } else {
                        qpVar4.M3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    }
                    new ArrayList();
                    yr messagesStorage = qpVar4.getMessagesStorage();
                    if (chat != null) {
                        j3 = -chat.f26953id;
                    } else {
                        j3 = user.f27102id;
                    }
                    messagesStorage.c2(j3, null, false, 0, 0, false, null);
                    return;
                }
                return;
            case 7:
                qp qpVar5 = (qp) c1Var;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) obj2;
                String str = (String) obj;
                if ((tLObject instanceof TLRPC.TL_boolTrue) && chatFull != null) {
                    g0.h3(new lg((Object) qpVar5, (Object) chatFull, str, 14));
                    return;
                }
                return;
            case 8:
                qp qpVar6 = (qp) c1Var;
                Runnable runnable = (Runnable) obj2;
                Runnable runnable2 = (Runnable) obj;
                qpVar6.getClass();
                if (tLObject != null) {
                    qpVar6.O3((TLRPC.Updates) tLObject, false);
                    g0.h3(new sn(qpVar6, 2));
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                } else if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                    if (runnable2 != null) {
                        runnable2.run();
                        return;
                    }
                    return;
                } else if (runnable != null) {
                    runnable.run();
                    return;
                } else {
                    return;
                }
            case 9:
                g0.h3(new yw((gz) c1Var, (String) obj2, (List) obj, 1));
                return;
            case 10:
                g0.h3(new em((gz) c1Var, tLObject, (sy) obj2, (String) obj, 24));
                return;
            default:
                gz gzVar = (gz) c1Var;
                org.telegram.ui.ActionBar.f2 f2Var3 = (org.telegram.ui.ActionBar.f2) obj2;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                if (tL_error == null) {
                    gzVar.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    g0.h3(new uw(gzVar, tL_error, f2Var3, tL_messages_editMessage, 0));
                    return;
                }
        }
    }
}
