package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
public final class fi implements Runnable {
    public final int f23936a;
    public final Object f23937b;
    public final Object f23938c;

    public fi(int i7, Object obj, Object obj2) {
        this.f23936a = i7;
        this.f23937b = obj;
        this.f23938c = obj2;
    }

    @Override
    public final void run() {
        int i7 = this.f23936a;
        Object obj = this.f23938c;
        Object obj2 = this.f23937b;
        switch (i7) {
            case 0:
                x10 x10Var = (x10) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (x10Var != null) {
                    x10Var.a(arrayList);
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
                ri riVar = (ri) ((m9.u) obj2).f20984c;
                riVar.B0.clear();
                riVar.B0.addAll((ArrayList) obj);
                return;
            case 3:
                ArrayList arrayList2 = ((ri) ((androidx.activity.g) obj2).f1781c).B0;
                arrayList2.clear();
                arrayList2.addAll((ArrayList) obj);
                ks.e().k(300, new Object[0]);
                return;
            case 4:
                fj fjVar = (fj) obj2;
                fjVar.f24005n = (TLRPC.Document) obj;
                ks.f(fjVar.K1).k(116, fjVar);
                return;
            case 5:
                mp mpVar = (mp) obj2;
                TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) obj;
                long[] a22 = mpVar.getMessagesStorage().a2(tL_updateMessageID.random_id, 0L, null, tL_updateMessageID.f28689id, 0, -1, 0);
                if (a22 != null) {
                    g0.g3(new kg(mpVar, a22, tL_updateMessageID, 7));
                    return;
                }
                return;
            case 6:
                TL_update.TL_updateServiceNotification tL_updateServiceNotification = (TL_update.TL_updateServiceNotification) obj;
                ((mp) obj2).getNotificationCenter().k(75, 2, tL_updateServiceNotification.message, tL_updateServiceNotification.type);
                return;
            case 7:
                TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) obj;
                ((mp) obj2).getNotificationCenter().k(177, Long.valueOf(tL_updateGroupCallMessage.call.f28448id), tL_updateGroupCallMessage, Boolean.FALSE);
                return;
            case 8:
                TL_update.TL_updateDeleteGroupCallMessages tL_updateDeleteGroupCallMessages = (TL_update.TL_updateDeleteGroupCallMessages) obj;
                ((mp) obj2).getNotificationCenter().k(177, Long.valueOf(tL_updateDeleteGroupCallMessages.call.f28448id), tL_updateDeleteGroupCallMessages, Boolean.FALSE);
                return;
            case 9:
                TL_update.TL_updateUserTyping tL_updateUserTyping = (TL_update.TL_updateUserTyping) obj;
                ((mp) obj2).getNotificationCenter().k(299, Long.valueOf(tL_updateUserTyping.user_id), tL_updateUserTyping.action);
                return;
            case 10:
                TL_update.TL_updateChatUserTyping tL_updateChatUserTyping = (TL_update.TL_updateChatUserTyping) obj;
                ((mp) obj2).getNotificationCenter().k(299, Long.valueOf(-tL_updateChatUserTyping.chat_id), tL_updateChatUserTyping.action);
                return;
            case 11:
                mp mpVar2 = (mp) obj2;
                TLRPC.updates_Difference updates_difference = (TLRPC.updates_Difference) obj;
                mpVar2.f25784s1.clear();
                mpVar2.f25848z1.clear();
                mpVar2.f4(updates_difference.users, false);
                mpVar2.Z3(updates_difference.chats, false);
                return;
            case 12:
                mp mpVar3 = (mp) obj2;
                TLRPC.messages_SponsoredMessages messages_sponsoredmessages = (TLRPC.messages_SponsoredMessages) obj;
                mpVar3.getClass();
                mpVar3.f4(messages_sponsoredmessages.users, false);
                mpVar3.Z3(messages_sponsoredmessages.chats, false);
                return;
            case 13:
                mp mpVar4 = (mp) obj2;
                TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers = (TLRPC.TL_channels_sendAsPeers) obj;
                mpVar4.getClass();
                mpVar4.f4(tL_channels_sendAsPeers.users, false);
                mpVar4.Z3(tL_channels_sendAsPeers.chats, false);
                return;
            case 14:
                mp mpVar5 = (mp) obj2;
                mpVar5.getClass();
                mpVar5.L0(((TL_update.TL_updateChannel) obj).channel_id, 1, 0L, null);
                return;
            case 15:
                mp mpVar6 = (mp) obj2;
                TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) obj;
                mpVar6.getClass();
                mpVar6.f4(updates_channeldifference.users, false);
                mpVar6.Z3(updates_channeldifference.chats, false);
                return;
            case 16:
                mp mpVar7 = (mp) obj2;
                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                mpVar7.getClass();
                mpVar7.f4(tL_channels_channelParticipant.users, false);
                mpVar7.Z3(tL_channels_channelParticipant.chats, false);
                return;
            case 17:
                mp mpVar8 = (mp) obj2;
                TLRPC.TL_help_appConfig tL_help_appConfig = (TLRPC.TL_help_appConfig) obj;
                rj rjVar = mpVar8.O7;
                if (tL_help_appConfig != null) {
                    TLRPC.JSONValue jSONValue = tL_help_appConfig.config;
                    if (jSONValue instanceof TLRPC.TL_jsonObject) {
                        mpVar8.q((TLRPC.TL_jsonObject) jSONValue);
                    }
                }
                g0.r(rjVar);
                g0.h3(rjVar, 240010L);
                return;
            case 18:
                mp mpVar9 = (mp) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (runnable2 != null) {
                    runnable2.run();
                }
                mpVar9.getNotificationCenter().k(2, 2);
                mpVar9.getNotificationCenter().k(39, new Object[0]);
                return;
            case 19:
                ((mp) obj2).getNotificationCenter().k(75, 4, ((TLRPC.TL_help_termsOfServiceUpdate) obj).terms_of_service);
                return;
            case 20:
                x10 x10Var2 = (x10) obj2;
                Runnable runnable3 = (Runnable) obj;
                if (x10Var2 != null) {
                    x10Var2.a(null);
                }
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 21:
                mp mpVar10 = (mp) obj2;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                mpVar10.f4(updates.users, false);
                mpVar10.Z3(updates.chats, false);
                ArrayList<TLRPC.Chat> arrayList3 = updates.chats;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    mpVar10.getNotificationCenter().k(28, Long.valueOf(updates.chats.get(0).f28431id));
                    return;
                } else {
                    mpVar10.getNotificationCenter().k(29, new Object[0]);
                    return;
                }
            case 22:
                x10 x10Var3 = (x10) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (x10Var3 != null) {
                    x10Var3.a(tL_error);
                    return;
                }
                return;
            case 23:
                ((q10) obj2).a(0, (TLRPC.TL_error) obj);
                return;
            case 24:
                mp mpVar11 = (mp) obj2;
                ((ai.h0) obj).a(mpVar11.f25658d8);
                mpVar11.f25650c8 = false;
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
                mp mpVar12 = (mp) obj2;
                fj fjVar2 = (fj) obj;
                mpVar12.getClass();
                long B0 = fj.B0(fjVar2.f23993k);
                int e12 = fjVar2.e1();
                a0.h hVar = mpVar12.K0;
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
                fp fpVar = (fp) obj2;
                TLObject tLObject = (TLObject) obj;
                fpVar.f24075c = false;
                fpVar.d = true;
                if (tLObject instanceof TL_account.TL_savedMusicIds) {
                    fpVar.f24074b.addAll(((TL_account.TL_savedMusicIds) tLObject).ids);
                }
                ks.f(fpVar.f24073a).k(248, new Object[0]);
                return;
            case 28:
                ((a4) obj2).a((ArrayList) obj);
                return;
            default:
                ((ym) obj2).a(((int[]) obj)[0]);
                return;
        }
    }
}
