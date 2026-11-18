package org.telegram.messenger;

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ci implements RequestDelegate {
    public final int f23358a;
    public final c1 f23359b;
    public final Object f23360c;
    public final Object d;

    public ci(c1 c1Var, Object obj, Object obj2, int i7) {
        this.f23358a = i7;
        this.f23359b = c1Var;
        this.f23360c = obj;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        long j3;
        int i7 = this.f23358a;
        Object obj = this.d;
        Object obj2 = this.f23360c;
        c1 c1Var = this.f23359b;
        switch (i7) {
            case 0:
                ri riVar = (ri) c1Var;
                TLRPC.TL_messages_faveSticker tL_messages_faveSticker = (TLRPC.TL_messages_faveSticker) obj;
                if (tL_error != null && r8.r(tL_error.text) && obj2 != null) {
                    riVar.getFileRefController().u(new Object[]{tL_messages_faveSticker}, obj2);
                    return;
                } else {
                    g0.g3(new eg(riVar, 2));
                    return;
                }
            case 1:
                ri riVar2 = (ri) c1Var;
                TLRPC.TL_messages_saveRecentSticker tL_messages_saveRecentSticker = (TLRPC.TL_messages_saveRecentSticker) obj;
                riVar2.getClass();
                if (tL_error != null && r8.r(tL_error.text) && obj2 != null) {
                    riVar2.getFileRefController().u(new Object[]{tL_messages_saveRecentSticker}, obj2);
                    return;
                }
                return;
            case 2:
                g0.g3(new fn((mp) c1Var, tL_error, tLObject, (Long) obj2, (x10) obj));
                return;
            case 3:
                mp mpVar = (mp) c1Var;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) obj2;
                TLRPC.TL_messages_createChat tL_messages_createChat = (TLRPC.TL_messages_createChat) obj;
                if (tL_error != null) {
                    g0.g3(new tl(mpVar, tL_error, h2Var, tL_messages_createChat, 2));
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_invitedUsers) {
                    TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) tLObject;
                    mpVar.V3(tL_messages_invitedUsers.updates, false);
                    g0.g3(new w3(9, mpVar, tL_messages_invitedUsers));
                    return;
                } else {
                    return;
                }
            case 4:
                mp mpVar2 = (mp) c1Var;
                org.telegram.ui.ActionBar.h2 h2Var2 = (org.telegram.ui.ActionBar.h2) obj2;
                TLRPC.TL_channels_createChannel tL_channels_createChannel = (TLRPC.TL_channels_createChannel) obj;
                if (tL_error != null) {
                    g0.g3(new tl(mpVar2, tL_error, h2Var2, tL_channels_createChannel, 1));
                    return;
                }
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                mpVar2.V3(updates, false);
                g0.g3(new fi(21, mpVar2, updates));
                return;
            case 5:
                mp mpVar3 = (mp) c1Var;
                TLRPC.TL_messages_saveGif tL_messages_saveGif = (TLRPC.TL_messages_saveGif) obj;
                mpVar3.getClass();
                if (tL_error != null && r8.r(tL_error.text)) {
                    mpVar3.getFileRefController().u(new Object[]{tL_messages_saveGif}, obj2);
                    return;
                }
                return;
            case 6:
                mp mpVar4 = (mp) c1Var;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (tLObject != null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    if (v3.T(chat)) {
                        mpVar4.S3(tL_messages_affectedHistory.pts, tL_messages_affectedHistory.pts_count, chat.f28405id);
                    } else {
                        mpVar4.T3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    }
                    new ArrayList();
                    tr messagesStorage = mpVar4.getMessagesStorage();
                    if (chat != null) {
                        j3 = -chat.f28405id;
                    } else {
                        j3 = user.f28554id;
                    }
                    messagesStorage.c2(j3, null, false, 0, 0, false, null);
                    return;
                }
                return;
            case 7:
                mp mpVar5 = (mp) c1Var;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) obj2;
                String str = (String) obj;
                if ((tLObject instanceof TLRPC.TL_boolTrue) && chatFull != null) {
                    g0.g3(new kg((Object) mpVar5, (Object) chatFull, str, 14));
                    return;
                }
                return;
            case 8:
                mp mpVar6 = (mp) c1Var;
                Runnable runnable = (Runnable) obj2;
                Runnable runnable2 = (Runnable) obj;
                mpVar6.getClass();
                if (tLObject != null) {
                    mpVar6.V3((TLRPC.Updates) tLObject, false);
                    g0.g3(new qn(mpVar6, 2));
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
                g0.g3(new qw((zy) c1Var, (String) obj2, (List) obj, 1));
                return;
            case 10:
                g0.g3(new tl((zy) c1Var, tLObject, (ly) obj2, (String) obj, 23));
                return;
            default:
                zy zyVar = (zy) c1Var;
                org.telegram.ui.ActionBar.h2 h2Var3 = (org.telegram.ui.ActionBar.h2) obj2;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                if (tL_error == null) {
                    zyVar.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    g0.g3(new mw(zyVar, tL_error, h2Var3, tL_messages_editMessage, 0));
                    return;
                }
        }
    }
}
