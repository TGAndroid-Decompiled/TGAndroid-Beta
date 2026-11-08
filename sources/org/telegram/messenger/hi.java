package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
public final class hi implements Runnable {
    public final int f22914a;
    public final Object f22915b;
    public final Object f22916c;

    public hi(int i7, Object obj, Object obj2) {
        this.f22914a = i7;
        this.f22915b = obj;
        this.f22916c = obj2;
    }

    @Override
    public final void run() {
        SQLiteCursor queryFinalized;
        TLRPC.ChatFull chatFull;
        NativeByteBuffer byteBufferValue;
        int i7 = this.f22914a;
        SQLiteCursor sQLiteCursor = null;
        Object obj = this.f22916c;
        Object obj2 = this.f22915b;
        switch (i7) {
            case 0:
                c20 c20Var = (c20) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (c20Var != null) {
                    c20Var.a(arrayList);
                    return;
                }
                return;
            case 1:
                Runnable runnable = (Runnable) obj;
                if (((AtomicInteger) obj2).decrementAndGet() == 0 && runnable != null) {
                    g0.h3(runnable);
                    return;
                }
                return;
            case 2:
                ui uiVar = (ui) ((m9.u) obj2).f19998c;
                uiVar.A0.clear();
                uiVar.A0.addAll((ArrayList) obj);
                return;
            case 3:
                ArrayList arrayList2 = ((ui) ((androidx.activity.g) obj2).f1827c).A0;
                arrayList2.clear();
                arrayList2.addAll((ArrayList) obj);
                qs.e().k(297, new Object[0]);
                return;
            case 4:
                ij ijVar = (ij) obj2;
                ijVar.f23272n = (TLRPC.Document) obj;
                qs.f(ijVar.I1).k(116, ijVar);
                return;
            case 5:
                qp qpVar = (qp) obj2;
                TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) obj;
                long[] a22 = qpVar.getMessagesStorage().a2(tL_updateMessageID.random_id, 0L, null, tL_updateMessageID.f27214id, 0, -1, 0);
                if (a22 != null) {
                    g0.h3(new lg(qpVar, a22, tL_updateMessageID, 8));
                    return;
                }
                return;
            case 6:
                TL_update.TL_updateServiceNotification tL_updateServiceNotification = (TL_update.TL_updateServiceNotification) obj;
                ((qp) obj2).getNotificationCenter().k(75, 2, tL_updateServiceNotification.message, tL_updateServiceNotification.type);
                return;
            case 7:
                TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) obj;
                ((qp) obj2).getNotificationCenter().k(177, Long.valueOf(tL_updateGroupCallMessage.call.f26973id), tL_updateGroupCallMessage, Boolean.FALSE);
                return;
            case 8:
                TL_update.TL_updateDeleteGroupCallMessages tL_updateDeleteGroupCallMessages = (TL_update.TL_updateDeleteGroupCallMessages) obj;
                ((qp) obj2).getNotificationCenter().k(177, Long.valueOf(tL_updateDeleteGroupCallMessages.call.f26973id), tL_updateDeleteGroupCallMessages, Boolean.FALSE);
                return;
            case 9:
                TL_update.TL_updateUserTyping tL_updateUserTyping = (TL_update.TL_updateUserTyping) obj;
                ((qp) obj2).getNotificationCenter().k(296, Long.valueOf(tL_updateUserTyping.user_id), tL_updateUserTyping.action);
                return;
            case 10:
                TL_update.TL_updateChatUserTyping tL_updateChatUserTyping = (TL_update.TL_updateChatUserTyping) obj;
                ((qp) obj2).getNotificationCenter().k(296, Long.valueOf(-tL_updateChatUserTyping.chat_id), tL_updateChatUserTyping.action);
                return;
            case 11:
                qp qpVar2 = (qp) obj2;
                TLRPC.messages_SponsoredMessages messages_sponsoredmessages = (TLRPC.messages_SponsoredMessages) obj;
                qpVar2.getClass();
                qpVar2.Y3(messages_sponsoredmessages.users, false);
                qpVar2.S3(messages_sponsoredmessages.chats, false);
                return;
            case 12:
                qp qpVar3 = (qp) obj2;
                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                qpVar3.getClass();
                qpVar3.Y3(tL_channels_channelParticipant.users, false);
                qpVar3.S3(tL_channels_channelParticipant.chats, false);
                return;
            case 13:
                qp qpVar4 = (qp) obj2;
                qpVar4.getClass();
                qpVar4.J0(((TL_update.TL_updateChannel) obj).channel_id, 1, 0L, null);
                return;
            case 14:
                ((qp) obj2).getNotificationCenter().k(75, 4, ((TLRPC.TL_help_termsOfServiceUpdate) obj).terms_of_service);
                return;
            case 15:
                qp qpVar5 = (qp) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (runnable2 != null) {
                    runnable2.run();
                }
                qpVar5.getNotificationCenter().k(2, 2);
                qpVar5.getNotificationCenter().k(39, new Object[0]);
                return;
            case 16:
                qp qpVar6 = (qp) obj2;
                TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) obj;
                qpVar6.getClass();
                qpVar6.Y3(updates_channeldifference.users, false);
                qpVar6.S3(updates_channeldifference.chats, false);
                return;
            case 17:
                qp qpVar7 = (qp) obj2;
                TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers = (TLRPC.TL_channels_sendAsPeers) obj;
                qpVar7.getClass();
                qpVar7.Y3(tL_channels_sendAsPeers.users, false);
                qpVar7.S3(tL_channels_sendAsPeers.chats, false);
                return;
            case 18:
                qp qpVar8 = (qp) obj2;
                TLRPC.TL_help_appConfig tL_help_appConfig = (TLRPC.TL_help_appConfig) obj;
                vj vjVar = qpVar8.I7;
                if (tL_help_appConfig != null) {
                    TLRPC.JSONValue jSONValue = tL_help_appConfig.config;
                    if (jSONValue instanceof TLRPC.TL_jsonObject) {
                        qpVar8.q((TLRPC.TL_jsonObject) jSONValue);
                    }
                }
                g0.r(vjVar);
                g0.i3(vjVar, 240010L);
                return;
            case 19:
                c20 c20Var2 = (c20) obj2;
                Runnable runnable3 = (Runnable) obj;
                if (c20Var2 != null) {
                    c20Var2.a(null);
                }
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 20:
                qp qpVar9 = (qp) obj2;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                qpVar9.Y3(updates.users, false);
                qpVar9.S3(updates.chats, false);
                ArrayList<TLRPC.Chat> arrayList3 = updates.chats;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    qpVar9.getNotificationCenter().k(28, Long.valueOf(updates.chats.get(0).f26956id));
                    return;
                } else {
                    qpVar9.getNotificationCenter().k(29, new Object[0]);
                    return;
                }
            case 21:
                c20 c20Var3 = (c20) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (c20Var3 != null) {
                    c20Var3.a(tL_error);
                    return;
                }
                return;
            case 22:
                qp qpVar10 = (qp) obj2;
                ((ai.i) obj).a(qpVar10.X7);
                qpVar10.W7 = false;
                return;
            case 23:
                ((v10) obj2).a(0, (TLRPC.TL_error) obj);
                return;
            case 24:
                q0.a aVar = (q0.a) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (aVar != null) {
                    aVar.accept(user);
                    return;
                }
                return;
            case 25:
                qp qpVar11 = (qp) obj2;
                ij ijVar2 = (ij) obj;
                qpVar11.getClass();
                long B0 = ij.B0(ijVar2.f23262k);
                int f12 = ijVar2.f1();
                a0.h hVar = qpVar11.J0;
                ArrayList arrayList4 = (ArrayList) hVar.f(B0);
                if (arrayList4 == null) {
                    arrayList4 = k5.j(hVar, B0);
                }
                if (!arrayList4.contains(Integer.valueOf(f12))) {
                    arrayList4.add(Integer.valueOf(f12));
                    return;
                }
                return;
            case 26:
                qp qpVar12 = (qp) obj2;
                TLRPC.updates_Difference updates_difference = (TLRPC.updates_Difference) obj;
                qpVar12.f24881r1.clear();
                qpVar12.f24926w1.clear();
                qpVar12.Y3(updates_difference.users, false);
                qpVar12.S3(updates_difference.chats, false);
                return;
            case 27:
                jp jpVar = (jp) obj2;
                TLObject tLObject = (TLObject) obj;
                jpVar.f23590c = false;
                jpVar.d = true;
                if (tLObject instanceof TL_account.TL_savedMusicIds) {
                    jpVar.f23589b.addAll(((TL_account.TL_savedMusicIds) tLObject).ids);
                }
                qs.f(jpVar.f23588a).k(245, new Object[0]);
                return;
            case 28:
                a00.a((zz) obj2);
                ((cr) obj).run();
                return;
            default:
                yr yrVar = (yr) obj2;
                TLRPC.ChatParticipants chatParticipants = (TLRPC.ChatParticipants) obj;
                try {
                    try {
                        queryFinalized = yrVar.f26721b.queryFinalized("SELECT info, pinned, online, inviter FROM chat_settings_v2 WHERE uid = " + chatParticipants.chat_id, new Object[0]);
                    } catch (Exception e10) {
                        e = e10;
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
                        g0.h3(new uq(yrVar, chatFull, 1));
                        SQLitePreparedStatement executeFast = yrVar.f26721b.executeFast("REPLACE INTO chat_settings_v2 VALUES(?, ?, ?, ?, ?, ?, ?)");
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(chatFull.getObjectSize());
                        chatFull.serializeToStream(nativeByteBuffer);
                        executeFast.bindLong(1, chatFull.f26957id);
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
                } catch (Exception e11) {
                    e = e11;
                    sQLiteCursor = queryFinalized;
                    yrVar.o(e, true);
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
        }
    }
}
