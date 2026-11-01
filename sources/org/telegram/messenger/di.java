package org.telegram.messenger;

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class di implements RequestDelegate {
    public final int f15392a;
    public final f1 f15393b;
    public final Object f15394c;
    public final Object d;

    public di(f1 f1Var, Object obj, Object obj2, int i10) {
        this.f15392a = i10;
        this.f15393b = f1Var;
        this.f15394c = obj;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        long j10;
        int i10 = this.f15392a;
        Object obj = this.d;
        Object obj2 = this.f15394c;
        f1 f1Var = this.f15393b;
        switch (i10) {
            case 0:
                vi viVar = (vi) f1Var;
                TLRPC.TL_messages_faveSticker tL_messages_faveSticker = (TLRPC.TL_messages_faveSticker) obj;
                if (tL_error != null && w8.r(tL_error.text) && obj2 != null) {
                    viVar.getFileRefController().u(new Object[]{tL_messages_faveSticker}, obj2);
                    return;
                } else {
                    i0.g3(new fg(viVar, 2));
                    return;
                }
            case 1:
                vi viVar2 = (vi) f1Var;
                TLRPC.TL_messages_saveRecentSticker tL_messages_saveRecentSticker = (TLRPC.TL_messages_saveRecentSticker) obj;
                viVar2.getClass();
                if (tL_error != null && w8.r(tL_error.text) && obj2 != null) {
                    viVar2.getFileRefController().u(new Object[]{tL_messages_saveRecentSticker}, obj2);
                    return;
                }
                return;
            case 2:
                i0.g3(new dn((wp) f1Var, tL_error, tLObject, (Long) obj2, (r20) obj));
                return;
            case 3:
                wp wpVar = (wp) f1Var;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj2;
                TLRPC.TL_messages_createChat tL_messages_createChat = (TLRPC.TL_messages_createChat) obj;
                if (tL_error != null) {
                    i0.g3(new vl(wpVar, tL_error, k2Var, tL_messages_createChat, 1));
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_invitedUsers) {
                    TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) tLObject;
                    wpVar.L3(tL_messages_invitedUsers.updates, false);
                    i0.g3(new e4(7, wpVar, tL_messages_invitedUsers));
                    return;
                } else {
                    return;
                }
            case 4:
                wp wpVar2 = (wp) f1Var;
                org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) obj2;
                TLRPC.TL_channels_createChannel tL_channels_createChannel = (TLRPC.TL_channels_createChannel) obj;
                if (tL_error != null) {
                    i0.g3(new vl(wpVar2, tL_error, k2Var2, tL_channels_createChannel, 2));
                    return;
                }
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                wpVar2.L3(updates, false);
                i0.g3(new pi(18, wpVar2, updates));
                return;
            case 5:
                wp wpVar3 = (wp) f1Var;
                TLRPC.TL_messages_saveGif tL_messages_saveGif = (TLRPC.TL_messages_saveGif) obj;
                wpVar3.getClass();
                if (tL_error != null && w8.r(tL_error.text)) {
                    wpVar3.getFileRefController().u(new Object[]{tL_messages_saveGif}, obj2);
                    return;
                }
                return;
            case 6:
                wp wpVar4 = (wp) f1Var;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (tLObject != null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    if (w3.T(chat)) {
                        wpVar4.I3(tL_messages_affectedHistory.pts, tL_messages_affectedHistory.pts_count, chat.f19794id);
                    } else {
                        wpVar4.J3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    }
                    new ArrayList();
                    is messagesStorage = wpVar4.getMessagesStorage();
                    if (chat != null) {
                        j10 = -chat.f19794id;
                    } else {
                        j10 = user.f19943id;
                    }
                    messagesStorage.c2(j10, null, false, 0, 0, false, null);
                    return;
                }
                return;
            case 7:
                wp wpVar5 = (wp) f1Var;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) obj2;
                String str = (String) obj;
                if ((tLObject instanceof TLRPC.TL_boolTrue) && chatFull != null) {
                    i0.g3(new lg((f1) wpVar5, (TLObject) chatFull, str, 14));
                    return;
                }
                return;
            case 8:
                wp wpVar6 = (wp) f1Var;
                Runnable runnable = (Runnable) obj2;
                Runnable runnable2 = (Runnable) obj;
                wpVar6.getClass();
                if (tLObject != null) {
                    wpVar6.L3((TLRPC.Updates) tLObject, false);
                    i0.g3(new fo(wpVar6, 1));
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
                i0.g3(new lx((rz) f1Var, (String) obj2, (List) obj, 1));
                return;
            case 10:
                i0.g3(new vl((rz) f1Var, tLObject, (dz) obj2, (String) obj, 24));
                return;
            default:
                rz rzVar = (rz) f1Var;
                org.telegram.ui.ActionBar.k2 k2Var3 = (org.telegram.ui.ActionBar.k2) obj2;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                if (tL_error == null) {
                    rzVar.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    i0.g3(new gx(rzVar, tL_error, k2Var3, tL_messages_editMessage, 0));
                    return;
                }
        }
    }
}
