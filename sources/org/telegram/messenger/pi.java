package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
public final class pi implements Runnable {
    public final int f17605a;
    public final Object f17606b;
    public final Object f17607c;

    public pi(int i10, Object obj, Object obj2) {
        this.f17605a = i10;
        this.f17607c = obj;
        this.f17606b = obj2;
    }

    @Override
    public final void run() {
        SQLiteCursor queryFinalized;
        TLRPC.ChatFull chatFull;
        NativeByteBuffer byteBufferValue;
        int i10 = this.f17605a;
        SQLiteCursor sQLiteCursor = null;
        Object obj = this.f17606b;
        Object obj2 = this.f17607c;
        switch (i10) {
            case 0:
                vi viVar = (vi) ((j9.u) obj2).f9768c;
                viVar.A0.clear();
                viVar.A0.addAll((ArrayList) obj);
                return;
            case 1:
                ArrayList arrayList = ((vi) ((androidx.activity.g) obj2).f933c).A0;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                at.e().k(297, new Object[0]);
                return;
            case 2:
                kj kjVar = (kj) obj2;
                kjVar.f16700n = (TLRPC.Document) obj;
                at.f(kjVar.I1).k(116, kjVar);
                return;
            case 3:
                wp wpVar = (wp) obj2;
                TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) obj;
                long[] a2 = wpVar.getMessagesStorage().a2(tL_updateMessageID.random_id, 0L, null, tL_updateMessageID.f20051id, 0, -1, 0);
                if (a2 != null) {
                    i0.g3(new lg(wpVar, a2, tL_updateMessageID, 7));
                    return;
                }
                return;
            case 4:
                TL_update.TL_updateServiceNotification tL_updateServiceNotification = (TL_update.TL_updateServiceNotification) obj;
                ((wp) obj2).getNotificationCenter().k(75, 2, tL_updateServiceNotification.message, tL_updateServiceNotification.type);
                return;
            case 5:
                TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) obj;
                ((wp) obj2).getNotificationCenter().k(177, Long.valueOf(tL_updateGroupCallMessage.call.f19811id), tL_updateGroupCallMessage, Boolean.FALSE);
                return;
            case 6:
                TL_update.TL_updateDeleteGroupCallMessages tL_updateDeleteGroupCallMessages = (TL_update.TL_updateDeleteGroupCallMessages) obj;
                ((wp) obj2).getNotificationCenter().k(177, Long.valueOf(tL_updateDeleteGroupCallMessages.call.f19811id), tL_updateDeleteGroupCallMessages, Boolean.FALSE);
                return;
            case 7:
                TL_update.TL_updateUserTyping tL_updateUserTyping = (TL_update.TL_updateUserTyping) obj;
                ((wp) obj2).getNotificationCenter().k(296, Long.valueOf(tL_updateUserTyping.user_id), tL_updateUserTyping.action);
                return;
            case 8:
                TL_update.TL_updateChatUserTyping tL_updateChatUserTyping = (TL_update.TL_updateChatUserTyping) obj;
                ((wp) obj2).getNotificationCenter().k(296, Long.valueOf(-tL_updateChatUserTyping.chat_id), tL_updateChatUserTyping.action);
                return;
            case 9:
                wp wpVar2 = (wp) obj2;
                TLRPC.updates_Difference updates_difference = (TLRPC.updates_Difference) obj;
                wpVar2.f19228r1.clear();
                wpVar2.f19275w1.clear();
                wpVar2.V3(updates_difference.users, false);
                wpVar2.P3(updates_difference.chats, false);
                return;
            case 10:
                wp wpVar3 = (wp) obj2;
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                }
                wpVar3.getNotificationCenter().k(2, 2);
                wpVar3.getNotificationCenter().k(39, new Object[0]);
                return;
            case 11:
                wp wpVar4 = (wp) obj2;
                TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) obj;
                wpVar4.getClass();
                wpVar4.V3(updates_channeldifference.users, false);
                wpVar4.P3(updates_channeldifference.chats, false);
                return;
            case 12:
                wp wpVar5 = (wp) obj2;
                TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers = (TLRPC.TL_channels_sendAsPeers) obj;
                wpVar5.getClass();
                wpVar5.V3(tL_channels_sendAsPeers.users, false);
                wpVar5.P3(tL_channels_sendAsPeers.chats, false);
                return;
            case 13:
                wp wpVar6 = (wp) obj2;
                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                wpVar6.getClass();
                wpVar6.V3(tL_channels_channelParticipant.users, false);
                wpVar6.P3(tL_channels_channelParticipant.chats, false);
                return;
            case 14:
                ((wp) obj2).getNotificationCenter().k(75, 4, ((TLRPC.TL_help_termsOfServiceUpdate) obj).terms_of_service);
                return;
            case 15:
                wp wpVar7 = (wp) obj2;
                wpVar7.getClass();
                wpVar7.I0(((TL_update.TL_updateChannel) obj).channel_id, 1, 0L, null);
                return;
            case 16:
                wp wpVar8 = (wp) obj2;
                TLRPC.messages_SponsoredMessages messages_sponsoredmessages = (TLRPC.messages_SponsoredMessages) obj;
                wpVar8.getClass();
                wpVar8.V3(messages_sponsoredmessages.users, false);
                wpVar8.P3(messages_sponsoredmessages.chats, false);
                return;
            case 17:
                wp wpVar9 = (wp) obj2;
                TLRPC.TL_help_appConfig tL_help_appConfig = (TLRPC.TL_help_appConfig) obj;
                ak akVar = wpVar9.J7;
                if (tL_help_appConfig != null) {
                    TLRPC.JSONValue jSONValue = tL_help_appConfig.config;
                    if (jSONValue instanceof TLRPC.TL_jsonObject) {
                        wpVar9.q((TLRPC.TL_jsonObject) jSONValue);
                    }
                }
                i0.r(akVar);
                i0.h3(akVar, 240010L);
                return;
            case 18:
                wp wpVar10 = (wp) obj2;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                wpVar10.V3(updates.users, false);
                wpVar10.P3(updates.chats, false);
                ArrayList<TLRPC.Chat> arrayList2 = updates.chats;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    wpVar10.getNotificationCenter().k(28, Long.valueOf(updates.chats.get(0).f19794id));
                    return;
                } else {
                    wpVar10.getNotificationCenter().k(29, new Object[0]);
                    return;
                }
            case 19:
                r20 r20Var = (r20) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (r20Var != null) {
                    r20Var.a(null);
                }
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 20:
                r20 r20Var2 = (r20) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (r20Var2 != null) {
                    r20Var2.a(tL_error);
                    return;
                }
                return;
            case 21:
                ((k20) obj2).a(0, (TLRPC.TL_error) obj);
                return;
            case 22:
                wp wpVar11 = (wp) obj2;
                ((ph.h1) obj).a(wpVar11.Y7);
                wpVar11.X7 = false;
                return;
            case 23:
                q0.a aVar = (q0.a) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (aVar != null) {
                    aVar.accept(user);
                    return;
                }
                return;
            case 24:
                wp wpVar12 = (wp) obj2;
                kj kjVar2 = (kj) obj;
                wpVar12.getClass();
                long B0 = kj.B0(kjVar2.f16690k);
                int f12 = kjVar2.f1();
                a0.h hVar = wpVar12.J0;
                ArrayList arrayList3 = (ArrayList) hVar.f(B0);
                if (arrayList3 == null) {
                    arrayList3 = m5.i(hVar, B0);
                }
                if (!arrayList3.contains(Integer.valueOf(f12))) {
                    arrayList3.add(Integer.valueOf(f12));
                    return;
                }
                return;
            case 25:
                pp ppVar = (pp) obj2;
                TLObject tLObject = (TLObject) obj;
                ppVar.f17624c = false;
                ppVar.d = true;
                if (tLObject instanceof TL_account.TL_savedMusicIds) {
                    ppVar.f17623b.addAll(((TL_account.TL_savedMusicIds) tLObject).ids);
                }
                at.f(ppVar.f17622a).k(245, new Object[0]);
                return;
            case 26:
                ((x3) obj2).a((ArrayList) obj);
                return;
            case 27:
                m00.a((l00) obj2);
                ((kr) obj).run();
                return;
            case 28:
                is isVar = (is) obj2;
                TLRPC.ChatParticipants chatParticipants = (TLRPC.ChatParticipants) obj;
                try {
                    try {
                        queryFinalized = isVar.f16333b.queryFinalized("SELECT info, pinned, online, inviter FROM chat_settings_v2 WHERE uid = " + chatParticipants.chat_id, new Object[0]);
                    } catch (Exception e) {
                        e = e;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    new ArrayList();
                    if (queryFinalized.next() && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                        TLRPC.ChatFull TLdeserialize = TLRPC.ChatFull.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                        TLdeserialize.pinned_msg_id = queryFinalized.intValue(1);
                        TLdeserialize.online_count = queryFinalized.intValue(2);
                        TLdeserialize.inviterId = queryFinalized.longValue(3);
                        chatFull = TLdeserialize;
                    } else {
                        chatFull = null;
                    }
                    queryFinalized.dispose();
                    if (chatFull instanceof TLRPC.TL_chatFull) {
                        chatFull.participants = chatParticipants;
                        i0.g3(new br(isVar, chatFull, 1));
                        SQLitePreparedStatement executeFast = isVar.f16333b.executeFast("REPLACE INTO chat_settings_v2 VALUES(?, ?, ?, ?, ?, ?, ?)");
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(chatFull.getObjectSize());
                        chatFull.serializeToStream(nativeByteBuffer);
                        executeFast.bindLong(1, chatFull.f19795id);
                        executeFast.bindByteBuffer(2, nativeByteBuffer);
                        executeFast.bindInteger(3, chatFull.pinned_msg_id);
                        executeFast.bindInteger(4, chatFull.online_count);
                        executeFast.bindLong(5, chatFull.inviterId);
                        executeFast.bindInteger(6, chatFull.invitesCount);
                        executeFast.bindInteger(7, chatFull.participants_count);
                        executeFast.step();
                        executeFast.dispose();
                        nativeByteBuffer.reuse();
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    e = e7;
                    sQLiteCursor = queryFinalized;
                    isVar.o(e, true);
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = queryFinalized;
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th;
                }
            default:
                ((is) obj2).C((bp) obj);
                return;
        }
    }
}
