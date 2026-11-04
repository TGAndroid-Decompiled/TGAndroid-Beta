package org.telegram.messenger;

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uh implements RequestDelegate {
    public final int f25696a;
    public final c1 f25697b;
    public final Object f25698c;
    public final Object d;

    public uh(c1 c1Var, Object obj, Object obj2, int i3) {
        this.f25696a = i3;
        this.f25697b = c1Var;
        this.f25698c = obj;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        long j10;
        int i3 = this.f25696a;
        Object obj = this.d;
        Object obj2 = this.f25698c;
        c1 c1Var = this.f25697b;
        switch (i3) {
            case 0:
                li liVar = (li) c1Var;
                TLRPC.TL_messages_faveSticker tL_messages_faveSticker = (TLRPC.TL_messages_faveSticker) obj;
                if (tL_error != null && r8.r(tL_error.text) && obj2 != null) {
                    liVar.getFileRefController().u(new Object[]{tL_messages_faveSticker}, obj2);
                    return;
                } else {
                    g0.h3(new xf(liVar, 2));
                    return;
                }
            case 1:
                li liVar2 = (li) c1Var;
                TLRPC.TL_messages_saveRecentSticker tL_messages_saveRecentSticker = (TLRPC.TL_messages_saveRecentSticker) obj;
                liVar2.getClass();
                if (tL_error != null && r8.r(tL_error.text) && obj2 != null) {
                    liVar2.getFileRefController().u(new Object[]{tL_messages_saveRecentSticker}, obj2);
                    return;
                }
                return;
            case 2:
                g0.h3(new cn((hp) c1Var, tL_error, tLObject, (Long) obj2, (u10) obj));
                return;
            case 3:
                hp hpVar = (hp) c1Var;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj2;
                TLRPC.TL_messages_createChat tL_messages_createChat = (TLRPC.TL_messages_createChat) obj;
                if (tL_error != null) {
                    g0.h3(new ul(hpVar, tL_error, d2Var, tL_messages_createChat, 2));
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_invitedUsers) {
                    TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) tLObject;
                    hpVar.O3(tL_messages_invitedUsers.updates, false);
                    g0.h3(new b4(9, hpVar, tL_messages_invitedUsers));
                    return;
                } else {
                    return;
                }
            case 4:
                hp hpVar2 = (hp) c1Var;
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) obj2;
                TLRPC.TL_channels_createChannel tL_channels_createChannel = (TLRPC.TL_channels_createChannel) obj;
                if (tL_error != null) {
                    g0.h3(new ul(hpVar2, tL_error, d2Var2, tL_channels_createChannel, 1));
                    return;
                }
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                hpVar2.O3(updates, false);
                g0.h3(new yh(20, hpVar2, updates));
                return;
            case 5:
                hp hpVar3 = (hp) c1Var;
                TLRPC.TL_messages_saveGif tL_messages_saveGif = (TLRPC.TL_messages_saveGif) obj;
                hpVar3.getClass();
                if (tL_error != null && r8.r(tL_error.text)) {
                    hpVar3.getFileRefController().u(new Object[]{tL_messages_saveGif}, obj2);
                    return;
                }
                return;
            case 6:
                hp hpVar4 = (hp) c1Var;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (tLObject != null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    if (t3.T(chat)) {
                        hpVar4.L3(tL_messages_affectedHistory.pts, tL_messages_affectedHistory.pts_count, chat.f27001id);
                    } else {
                        hpVar4.M3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    }
                    new ArrayList();
                    qr messagesStorage = hpVar4.getMessagesStorage();
                    if (chat != null) {
                        j10 = -chat.f27001id;
                    } else {
                        j10 = user.f27150id;
                    }
                    messagesStorage.c2(j10, null, false, 0, 0, false, null);
                    return;
                }
                return;
            case 7:
                hp hpVar5 = (hp) c1Var;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) obj2;
                String str = (String) obj;
                if ((tLObject instanceof TLRPC.TL_boolTrue) && chatFull != null) {
                    g0.h3(new dg((Object) hpVar5, (Object) chatFull, str, 14));
                    return;
                }
                return;
            case 8:
                hp hpVar6 = (hp) c1Var;
                Runnable runnable = (Runnable) obj2;
                Runnable runnable2 = (Runnable) obj;
                hpVar6.getClass();
                if (tLObject != null) {
                    hpVar6.O3((TLRPC.Updates) tLObject, false);
                    g0.h3(new in(hpVar6, 2));
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
                g0.h3(new rw((yy) c1Var, (String) obj2, (List) obj, 1));
                return;
            case 10:
                g0.h3(new ul((yy) c1Var, tLObject, (ky) obj2, (String) obj, 24));
                return;
            default:
                yy yyVar = (yy) c1Var;
                org.telegram.ui.ActionBar.d2 d2Var3 = (org.telegram.ui.ActionBar.d2) obj2;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                if (tL_error == null) {
                    yyVar.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    g0.h3(new mw(yyVar, tL_error, d2Var3, tL_messages_editMessage, 0));
                    return;
                }
        }
    }
}
