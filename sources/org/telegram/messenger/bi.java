package org.telegram.messenger;

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bi implements RequestDelegate {
    public final int f22704a;
    public final c1 f22705b;
    public final Object f22706c;
    public final Object d;

    public bi(c1 c1Var, Object obj, Object obj2, int i7) {
        this.f22704a = i7;
        this.f22705b = c1Var;
        this.f22706c = obj;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        long j3;
        int i7 = this.f22704a;
        Object obj = this.d;
        Object obj2 = this.f22706c;
        c1 c1Var = this.f22705b;
        switch (i7) {
            case 0:
                si siVar = (si) c1Var;
                TLRPC.TL_messages_faveSticker tL_messages_faveSticker = (TLRPC.TL_messages_faveSticker) obj;
                if (tL_error != null && r8.r(tL_error.text) && obj2 != null) {
                    siVar.getFileRefController().u(new Object[]{tL_messages_faveSticker}, obj2);
                    return;
                } else {
                    g0.h3(new eg(siVar, 2));
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
                g0.h3(new jn((np) c1Var, tL_error, tLObject, (Long) obj2, (z10) obj));
                return;
            case 3:
                np npVar = (np) c1Var;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj2;
                TLRPC.TL_messages_createChat tL_messages_createChat = (TLRPC.TL_messages_createChat) obj;
                if (tL_error != null) {
                    g0.h3(new bm(npVar, tL_error, e2Var, tL_messages_createChat, 2));
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_invitedUsers) {
                    TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) tLObject;
                    npVar.O3(tL_messages_invitedUsers.updates, false);
                    g0.h3(new b4(9, npVar, tL_messages_invitedUsers));
                    return;
                } else {
                    return;
                }
            case 4:
                np npVar2 = (np) c1Var;
                org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) obj2;
                TLRPC.TL_channels_createChannel tL_channels_createChannel = (TLRPC.TL_channels_createChannel) obj;
                if (tL_error != null) {
                    g0.h3(new bm(npVar2, tL_error, e2Var2, tL_channels_createChannel, 1));
                    return;
                }
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                npVar2.O3(updates, false);
                g0.h3(new fi(20, npVar2, updates));
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
                    if (t3.T(chat)) {
                        npVar4.L3(tL_messages_affectedHistory.pts, tL_messages_affectedHistory.pts_count, chat.f28051id);
                    } else {
                        npVar4.M3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    }
                    new ArrayList();
                    vr messagesStorage = npVar4.getMessagesStorage();
                    if (chat != null) {
                        j3 = -chat.f28051id;
                    } else {
                        j3 = user.f28200id;
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
                    g0.h3(new kg((Object) npVar5, (Object) chatFull, str, 14));
                    return;
                }
                return;
            case 8:
                np npVar6 = (np) c1Var;
                Runnable runnable = (Runnable) obj2;
                Runnable runnable2 = (Runnable) obj;
                npVar6.getClass();
                if (tLObject != null) {
                    npVar6.O3((TLRPC.Updates) tLObject, false);
                    g0.h3(new pn(npVar6, 3));
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
                g0.h3(new vw((ez) c1Var, (String) obj2, (List) obj, 1));
                return;
            case 10:
                g0.h3(new bm((ez) c1Var, tLObject, (qy) obj2, (String) obj, 23));
                return;
            default:
                ez ezVar = (ez) c1Var;
                org.telegram.ui.ActionBar.e2 e2Var3 = (org.telegram.ui.ActionBar.e2) obj2;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                if (tL_error == null) {
                    ezVar.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    g0.h3(new rw(ezVar, tL_error, e2Var3, tL_messages_editMessage, 0));
                    return;
                }
        }
    }
}
