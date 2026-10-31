package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
public final class oi implements Runnable {
    public final int f17272a;
    public final Object f17273b;
    public final Object f17274c;

    public oi(int i10, Object obj, Object obj2) {
        this.f17272a = i10;
        this.f17274c = obj;
        this.f17273b = obj2;
    }

    @Override
    public final void run() {
        SQLiteCursor queryFinalized;
        TLRPC.ChatFull chatFull;
        NativeByteBuffer byteBufferValue;
        int i10 = this.f17272a;
        SQLiteCursor sQLiteCursor = null;
        Object obj = this.f17273b;
        Object obj2 = this.f17274c;
        switch (i10) {
            case 0:
                ui uiVar = (ui) ((j9.u) obj2).f9767c;
                uiVar.A0.clear();
                uiVar.A0.addAll((ArrayList) obj);
                return;
            case 1:
                ArrayList arrayList = ((ui) ((androidx.activity.g) obj2).f933c).A0;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                zs.e().k(297, new Object[0]);
                return;
            case 2:
                jj jjVar = (jj) obj2;
                jjVar.f16347n = (TLRPC.Document) obj;
                zs.f(jjVar.I1).k(116, jjVar);
                return;
            case 3:
                vp vpVar = (vp) obj2;
                TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) obj;
                long[] a2 = vpVar.getMessagesStorage().a2(tL_updateMessageID.random_id, 0L, null, tL_updateMessageID.f20050id, 0, -1, 0);
                if (a2 != null) {
                    i0.g3(new kg(vpVar, a2, tL_updateMessageID, 7));
                    return;
                }
                return;
            case 4:
                TL_update.TL_updateServiceNotification tL_updateServiceNotification = (TL_update.TL_updateServiceNotification) obj;
                ((vp) obj2).getNotificationCenter().k(75, 2, tL_updateServiceNotification.message, tL_updateServiceNotification.type);
                return;
            case 5:
                TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) obj;
                ((vp) obj2).getNotificationCenter().k(177, Long.valueOf(tL_updateGroupCallMessage.call.f19810id), tL_updateGroupCallMessage, Boolean.FALSE);
                return;
            case 6:
                TL_update.TL_updateDeleteGroupCallMessages tL_updateDeleteGroupCallMessages = (TL_update.TL_updateDeleteGroupCallMessages) obj;
                ((vp) obj2).getNotificationCenter().k(177, Long.valueOf(tL_updateDeleteGroupCallMessages.call.f19810id), tL_updateDeleteGroupCallMessages, Boolean.FALSE);
                return;
            case 7:
                TL_update.TL_updateUserTyping tL_updateUserTyping = (TL_update.TL_updateUserTyping) obj;
                ((vp) obj2).getNotificationCenter().k(296, Long.valueOf(tL_updateUserTyping.user_id), tL_updateUserTyping.action);
                return;
            case 8:
                TL_update.TL_updateChatUserTyping tL_updateChatUserTyping = (TL_update.TL_updateChatUserTyping) obj;
                ((vp) obj2).getNotificationCenter().k(296, Long.valueOf(-tL_updateChatUserTyping.chat_id), tL_updateChatUserTyping.action);
                return;
            case 9:
                vp vpVar2 = (vp) obj2;
                TLRPC.updates_Difference updates_difference = (TLRPC.updates_Difference) obj;
                vpVar2.f18885r1.clear();
                vpVar2.f18932w1.clear();
                vpVar2.V3(updates_difference.users, false);
                vpVar2.P3(updates_difference.chats, false);
                return;
            case 10:
                vp vpVar3 = (vp) obj2;
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                }
                vpVar3.getNotificationCenter().k(2, 2);
                vpVar3.getNotificationCenter().k(39, new Object[0]);
                return;
            case 11:
                vp vpVar4 = (vp) obj2;
                TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) obj;
                vpVar4.getClass();
                vpVar4.V3(updates_channeldifference.users, false);
                vpVar4.P3(updates_channeldifference.chats, false);
                return;
            case 12:
                vp vpVar5 = (vp) obj2;
                TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers = (TLRPC.TL_channels_sendAsPeers) obj;
                vpVar5.getClass();
                vpVar5.V3(tL_channels_sendAsPeers.users, false);
                vpVar5.P3(tL_channels_sendAsPeers.chats, false);
                return;
            case 13:
                vp vpVar6 = (vp) obj2;
                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                vpVar6.getClass();
                vpVar6.V3(tL_channels_channelParticipant.users, false);
                vpVar6.P3(tL_channels_channelParticipant.chats, false);
                return;
            case 14:
                ((vp) obj2).getNotificationCenter().k(75, 4, ((TLRPC.TL_help_termsOfServiceUpdate) obj).terms_of_service);
                return;
            case 15:
                vp vpVar7 = (vp) obj2;
                vpVar7.getClass();
                vpVar7.I0(((TL_update.TL_updateChannel) obj).channel_id, 1, 0L, null);
                return;
            case 16:
                vp vpVar8 = (vp) obj2;
                TLRPC.messages_SponsoredMessages messages_sponsoredmessages = (TLRPC.messages_SponsoredMessages) obj;
                vpVar8.getClass();
                vpVar8.V3(messages_sponsoredmessages.users, false);
                vpVar8.P3(messages_sponsoredmessages.chats, false);
                return;
            case 17:
                vp vpVar9 = (vp) obj2;
                TLRPC.TL_help_appConfig tL_help_appConfig = (TLRPC.TL_help_appConfig) obj;
                zj zjVar = vpVar9.J7;
                if (tL_help_appConfig != null) {
                    TLRPC.JSONValue jSONValue = tL_help_appConfig.config;
                    if (jSONValue instanceof TLRPC.TL_jsonObject) {
                        vpVar9.q((TLRPC.TL_jsonObject) jSONValue);
                    }
                }
                i0.r(zjVar);
                i0.h3(zjVar, 240010L);
                return;
            case 18:
                vp vpVar10 = (vp) obj2;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                vpVar10.V3(updates.users, false);
                vpVar10.P3(updates.chats, false);
                ArrayList<TLRPC.Chat> arrayList2 = updates.chats;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    vpVar10.getNotificationCenter().k(28, Long.valueOf(updates.chats.get(0).f19793id));
                    return;
                } else {
                    vpVar10.getNotificationCenter().k(29, new Object[0]);
                    return;
                }
            case 19:
                q20 q20Var = (q20) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (q20Var != null) {
                    q20Var.a(null);
                }
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 20:
                q20 q20Var2 = (q20) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (q20Var2 != null) {
                    q20Var2.a(tL_error);
                    return;
                }
                return;
            case 21:
                ((j20) obj2).a(0, (TLRPC.TL_error) obj);
                return;
            case 22:
                vp vpVar11 = (vp) obj2;
                ((ph.h1) obj).a(vpVar11.Y7);
                vpVar11.X7 = false;
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
                vp vpVar12 = (vp) obj2;
                jj jjVar2 = (jj) obj;
                vpVar12.getClass();
                long B0 = jj.B0(jjVar2.f16337k);
                int f12 = jjVar2.f1();
                a0.h hVar = vpVar12.J0;
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
                op opVar = (op) obj2;
                TLObject tLObject = (TLObject) obj;
                opVar.f17291c = false;
                opVar.d = true;
                if (tLObject instanceof TL_account.TL_savedMusicIds) {
                    opVar.f17290b.addAll(((TL_account.TL_savedMusicIds) tLObject).ids);
                }
                zs.f(opVar.f17289a).k(245, new Object[0]);
                return;
            case 26:
                ((x3) obj2).a((ArrayList) obj);
                return;
            case 27:
                l00.a((k00) obj2);
                ((jr) obj).run();
                return;
            case 28:
                hs hsVar = (hs) obj2;
                TLRPC.ChatParticipants chatParticipants = (TLRPC.ChatParticipants) obj;
                try {
                    try {
                        queryFinalized = hsVar.f15940b.queryFinalized("SELECT info, pinned, online, inviter FROM chat_settings_v2 WHERE uid = " + chatParticipants.chat_id, new Object[0]);
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
                        i0.g3(new ar(hsVar, chatFull, 1));
                        SQLitePreparedStatement executeFast = hsVar.f15940b.executeFast("REPLACE INTO chat_settings_v2 VALUES(?, ?, ?, ?, ?, ?, ?)");
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(chatFull.getObjectSize());
                        chatFull.serializeToStream(nativeByteBuffer);
                        executeFast.bindLong(1, chatFull.f19794id);
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
                    hsVar.o(e, true);
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
                ((hs) obj2).C((ap) obj);
                return;
        }
    }
}
