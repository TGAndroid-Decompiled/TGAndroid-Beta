package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
public final class gi implements Runnable {
    public final int f24120a;
    public final Object f24121b;
    public final Object f24122c;

    public gi(int i7, Object obj, Object obj2) {
        this.f24120a = i7;
        this.f24121b = obj;
        this.f24122c = obj2;
    }

    @Override
    public final void run() {
        int i7 = this.f24120a;
        Object obj = this.f24122c;
        Object obj2 = this.f24121b;
        switch (i7) {
            case 0:
                y10 y10Var = (y10) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (y10Var != null) {
                    y10Var.a(arrayList);
                    return;
                }
                return;
            case 1:
                Runnable runnable = (Runnable) obj;
                if (((AtomicInteger) obj2).decrementAndGet() == 0 && runnable != null) {
                    g0.g3(runnable);
                    return;
                }
                return;
            case 2:
                si siVar = (si) ((m9.u) obj2).f20953c;
                siVar.B0.clear();
                siVar.B0.addAll((ArrayList) obj);
                return;
            case 3:
                ArrayList arrayList2 = ((si) ((androidx.activity.g) obj2).f1739c).B0;
                arrayList2.clear();
                arrayList2.addAll((ArrayList) obj);
                ls.e().k(300, new Object[0]);
                return;
            case 4:
                gj gjVar = (gj) obj2;
                gjVar.f24189n = (TLRPC.Document) obj;
                ls.f(gjVar.K1).k(116, gjVar);
                return;
            case 5:
                np npVar = (np) obj2;
                TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) obj;
                long[] a22 = npVar.getMessagesStorage().a2(tL_updateMessageID.random_id, 0L, null, tL_updateMessageID.f28656id, 0, -1, 0);
                if (a22 != null) {
                    g0.g3(new lg(npVar, a22, tL_updateMessageID, 7));
                    return;
                }
                return;
            case 6:
                TL_update.TL_updateServiceNotification tL_updateServiceNotification = (TL_update.TL_updateServiceNotification) obj;
                ((np) obj2).getNotificationCenter().k(75, 2, tL_updateServiceNotification.message, tL_updateServiceNotification.type);
                return;
            case 7:
                TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) obj;
                ((np) obj2).getNotificationCenter().k(177, Long.valueOf(tL_updateGroupCallMessage.call.f28415id), tL_updateGroupCallMessage, Boolean.FALSE);
                return;
            case 8:
                TL_update.TL_updateDeleteGroupCallMessages tL_updateDeleteGroupCallMessages = (TL_update.TL_updateDeleteGroupCallMessages) obj;
                ((np) obj2).getNotificationCenter().k(177, Long.valueOf(tL_updateDeleteGroupCallMessages.call.f28415id), tL_updateDeleteGroupCallMessages, Boolean.FALSE);
                return;
            case 9:
                TL_update.TL_updateUserTyping tL_updateUserTyping = (TL_update.TL_updateUserTyping) obj;
                ((np) obj2).getNotificationCenter().k(299, Long.valueOf(tL_updateUserTyping.user_id), tL_updateUserTyping.action);
                return;
            case 10:
                TL_update.TL_updateChatUserTyping tL_updateChatUserTyping = (TL_update.TL_updateChatUserTyping) obj;
                ((np) obj2).getNotificationCenter().k(299, Long.valueOf(-tL_updateChatUserTyping.chat_id), tL_updateChatUserTyping.action);
                return;
            case 11:
                np npVar2 = (np) obj2;
                TLRPC.updates_Difference updates_difference = (TLRPC.updates_Difference) obj;
                npVar2.f25919s1.clear();
                npVar2.f25983z1.clear();
                npVar2.f4(updates_difference.users, false);
                npVar2.Z3(updates_difference.chats, false);
                return;
            case 12:
                np npVar3 = (np) obj2;
                TLRPC.messages_SponsoredMessages messages_sponsoredmessages = (TLRPC.messages_SponsoredMessages) obj;
                npVar3.getClass();
                npVar3.f4(messages_sponsoredmessages.users, false);
                npVar3.Z3(messages_sponsoredmessages.chats, false);
                return;
            case 13:
                np npVar4 = (np) obj2;
                TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers = (TLRPC.TL_channels_sendAsPeers) obj;
                npVar4.getClass();
                npVar4.f4(tL_channels_sendAsPeers.users, false);
                npVar4.Z3(tL_channels_sendAsPeers.chats, false);
                return;
            case 14:
                np npVar5 = (np) obj2;
                npVar5.getClass();
                npVar5.L0(((TL_update.TL_updateChannel) obj).channel_id, 1, 0L, null);
                return;
            case 15:
                np npVar6 = (np) obj2;
                TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) obj;
                npVar6.getClass();
                npVar6.f4(updates_channeldifference.users, false);
                npVar6.Z3(updates_channeldifference.chats, false);
                return;
            case 16:
                np npVar7 = (np) obj2;
                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                npVar7.getClass();
                npVar7.f4(tL_channels_channelParticipant.users, false);
                npVar7.Z3(tL_channels_channelParticipant.chats, false);
                return;
            case 17:
                np npVar8 = (np) obj2;
                TLRPC.TL_help_appConfig tL_help_appConfig = (TLRPC.TL_help_appConfig) obj;
                sj sjVar = npVar8.O7;
                if (tL_help_appConfig != null) {
                    TLRPC.JSONValue jSONValue = tL_help_appConfig.config;
                    if (jSONValue instanceof TLRPC.TL_jsonObject) {
                        npVar8.q((TLRPC.TL_jsonObject) jSONValue);
                    }
                }
                g0.r(sjVar);
                g0.h3(sjVar, 240010L);
                return;
            case 18:
                np npVar9 = (np) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (runnable2 != null) {
                    runnable2.run();
                }
                npVar9.getNotificationCenter().k(2, 2);
                npVar9.getNotificationCenter().k(39, new Object[0]);
                return;
            case 19:
                ((np) obj2).getNotificationCenter().k(75, 4, ((TLRPC.TL_help_termsOfServiceUpdate) obj).terms_of_service);
                return;
            case 20:
                y10 y10Var2 = (y10) obj2;
                Runnable runnable3 = (Runnable) obj;
                if (y10Var2 != null) {
                    y10Var2.a(null);
                }
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 21:
                np npVar10 = (np) obj2;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                npVar10.f4(updates.users, false);
                npVar10.Z3(updates.chats, false);
                ArrayList<TLRPC.Chat> arrayList3 = updates.chats;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    npVar10.getNotificationCenter().k(28, Long.valueOf(updates.chats.get(0).f28398id));
                    return;
                } else {
                    npVar10.getNotificationCenter().k(29, new Object[0]);
                    return;
                }
            case 22:
                y10 y10Var3 = (y10) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (y10Var3 != null) {
                    y10Var3.a(tL_error);
                    return;
                }
                return;
            case 23:
                ((r10) obj2).a(0, (TLRPC.TL_error) obj);
                return;
            case 24:
                np npVar11 = (np) obj2;
                ((ai.c0) obj).a(npVar11.f25793d8);
                npVar11.f25785c8 = false;
                return;
            case 25:
                q0.a aVar = (q0.a) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (aVar != null) {
                    aVar.accept(user);
                    return;
                }
                return;
            case 26:
                np npVar12 = (np) obj2;
                gj gjVar2 = (gj) obj;
                npVar12.getClass();
                long B0 = gj.B0(gjVar2.f24177k);
                int e12 = gjVar2.e1();
                a0.h hVar = npVar12.K0;
                ArrayList arrayList4 = (ArrayList) hVar.f(B0);
                if (arrayList4 == null) {
                    arrayList4 = f3.h(hVar, B0);
                }
                if (!arrayList4.contains(Integer.valueOf(e12))) {
                    arrayList4.add(Integer.valueOf(e12));
                    return;
                }
                return;
            case 27:
                gp gpVar = (gp) obj2;
                TLObject tLObject = (TLObject) obj;
                gpVar.f24259c = false;
                gpVar.d = true;
                if (tLObject instanceof TL_account.TL_savedMusicIds) {
                    gpVar.f24258b.addAll(((TL_account.TL_savedMusicIds) tLObject).ids);
                }
                ls.f(gpVar.f24257a).k(248, new Object[0]);
                return;
            case 28:
                ((a4) obj2).a((ArrayList) obj);
                return;
            default:
                ((zm) obj2).a(((int[]) obj)[0]);
                return;
        }
    }
}
