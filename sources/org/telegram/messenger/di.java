package org.telegram.messenger;

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class di implements RequestDelegate {
    public final int f23519a;
    public final c1 f23520b;
    public final Object f23521c;
    public final Object d;

    public di(c1 c1Var, Object obj, Object obj2, int i7) {
        this.f23519a = i7;
        this.f23520b = c1Var;
        this.f23521c = obj;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        long j3;
        int i7 = this.f23519a;
        Object obj = this.d;
        Object obj2 = this.f23521c;
        c1 c1Var = this.f23520b;
        switch (i7) {
            case 0:
                si siVar = (si) c1Var;
                TLRPC.TL_messages_faveSticker tL_messages_faveSticker = (TLRPC.TL_messages_faveSticker) obj;
                if (tL_error != null && r8.r(tL_error.text) && obj2 != null) {
                    siVar.getFileRefController().u(new Object[]{tL_messages_faveSticker}, obj2);
                    return;
                } else {
                    g0.g3(new fg(siVar, 2));
                    return;
                }
            case 1:
                si siVar2 = (si) c1Var;
                TLRPC.TL_messages_saveRecentSticker tL_messages_saveRecentSticker = (TLRPC.TL_messages_saveRecentSticker) obj;
                siVar2.getClass();
                if (tL_error != null && r8.r(tL_error.text) && obj2 != null) {
                    siVar2.getFileRefController().u(new Object[]{tL_messages_saveRecentSticker}, obj2);
                    return;
                }
                return;
            case 2:
                g0.g3(new gn((np) c1Var, tL_error, tLObject, (Long) obj2, (y10) obj));
                return;
            case 3:
                np npVar = (np) c1Var;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj2;
                TLRPC.TL_messages_createChat tL_messages_createChat = (TLRPC.TL_messages_createChat) obj;
                if (tL_error != null) {
                    g0.g3(new ul(npVar, tL_error, g2Var, tL_messages_createChat, 2));
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_invitedUsers) {
                    TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) tLObject;
                    npVar.V3(tL_messages_invitedUsers.updates, false);
                    g0.g3(new w3(9, npVar, tL_messages_invitedUsers));
                    return;
                } else {
                    return;
                }
            case 4:
                np npVar2 = (np) c1Var;
                org.telegram.ui.ActionBar.g2 g2Var2 = (org.telegram.ui.ActionBar.g2) obj2;
                TLRPC.TL_channels_createChannel tL_channels_createChannel = (TLRPC.TL_channels_createChannel) obj;
                if (tL_error != null) {
                    g0.g3(new ul(npVar2, tL_error, g2Var2, tL_channels_createChannel, 1));
                    return;
                }
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                npVar2.V3(updates, false);
                g0.g3(new gi(21, npVar2, updates));
                return;
            case 5:
                np npVar3 = (np) c1Var;
                TLRPC.TL_messages_saveGif tL_messages_saveGif = (TLRPC.TL_messages_saveGif) obj;
                npVar3.getClass();
                if (tL_error != null && r8.r(tL_error.text)) {
                    npVar3.getFileRefController().u(new Object[]{tL_messages_saveGif}, obj2);
                    return;
                }
                return;
            case 6:
                np npVar4 = (np) c1Var;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (tLObject != null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    if (v3.T(chat)) {
                        npVar4.S3(tL_messages_affectedHistory.pts, tL_messages_affectedHistory.pts_count, chat.f28398id);
                    } else {
                        npVar4.T3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    }
                    new ArrayList();
                    ur messagesStorage = npVar4.getMessagesStorage();
                    if (chat != null) {
                        j3 = -chat.f28398id;
                    } else {
                        j3 = user.f28547id;
                    }
                    messagesStorage.c2(j3, null, false, 0, 0, false, null);
                    return;
                }
                return;
            case 7:
                np npVar5 = (np) c1Var;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) obj2;
                String str = (String) obj;
                if ((tLObject instanceof TLRPC.TL_boolTrue) && chatFull != null) {
                    g0.g3(new lg((Object) npVar5, (Object) chatFull, str, 14));
                    return;
                }
                return;
            case 8:
                np npVar6 = (np) c1Var;
                Runnable runnable = (Runnable) obj2;
                Runnable runnable2 = (Runnable) obj;
                npVar6.getClass();
                if (tLObject != null) {
                    npVar6.V3((TLRPC.Updates) tLObject, false);
                    g0.g3(new rn(npVar6, 2));
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
                g0.g3(new rw((az) c1Var, (String) obj2, (List) obj, 1));
                return;
            case 10:
                g0.g3(new ul((az) c1Var, tLObject, (my) obj2, (String) obj, 23));
                return;
            default:
                az azVar = (az) c1Var;
                org.telegram.ui.ActionBar.g2 g2Var3 = (org.telegram.ui.ActionBar.g2) obj2;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                if (tL_error == null) {
                    azVar.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    g0.g3(new nw(azVar, tL_error, g2Var3, tL_messages_editMessage, 0));
                    return;
                }
        }
    }
}
