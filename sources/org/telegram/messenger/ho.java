package org.telegram.messenger;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.u01;
public final class ho implements RequestDelegate {
    public final int f24481a;
    public final long f24482b;
    public final c1 f24483c;
    public final Object d;

    public ho(c1 c1Var, long j3, Object obj, int i7) {
        this.f24481a = i7;
        this.f24483c = c1Var;
        this.f24482b = j3;
        this.d = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        Integer num;
        Integer num2;
        switch (this.f24481a) {
            case 0:
                np npVar = (np) this.f24483c;
                long j3 = this.f24482b;
                jp jpVar = (jp) this.d;
                npVar.getClass();
                Integer num3 = null;
                if (tLObject instanceof TLRPC.messages_SponsoredMessages) {
                    TLRPC.messages_SponsoredMessages messages_sponsoredmessages = (TLRPC.messages_SponsoredMessages) tLObject;
                    if (messages_sponsoredmessages.messages.isEmpty()) {
                        num2 = null;
                    } else {
                        if ((messages_sponsoredmessages instanceof TLRPC.TL_messages_sponsoredMessages) && (messages_sponsoredmessages.flags & 1) > 0) {
                            num3 = Integer.valueOf(messages_sponsoredmessages.posts_between);
                        }
                        ArrayList arrayList = new ArrayList();
                        g0.g3(new gi(12, npVar, messages_sponsoredmessages));
                        a0.h hVar = new a0.h();
                        a0.h hVar2 = new a0.h();
                        int i7 = 0;
                        for (int i10 = 0; i10 < messages_sponsoredmessages.users.size(); i10++) {
                            TLRPC.User user = messages_sponsoredmessages.users.get(i10);
                            hVar.k(user, user.f28547id);
                        }
                        for (int i11 = 0; i11 < messages_sponsoredmessages.chats.size(); i11++) {
                            TLRPC.Chat chat = messages_sponsoredmessages.chats.get(i11);
                            hVar2.k(chat, chat.f28398id);
                        }
                        int size = messages_sponsoredmessages.messages.size();
                        int i12 = -10000000;
                        while (i7 < size) {
                            TLRPC.TL_sponsoredMessage tL_sponsoredMessage = messages_sponsoredmessages.messages.get(i7);
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            if (!tL_sponsoredMessage.entities.isEmpty()) {
                                tL_message.entities = tL_sponsoredMessage.entities;
                                tL_message.flags |= 128;
                            }
                            tL_message.peer_id = npVar.B1(j3);
                            tL_message.flags |= 256;
                            tL_message.date = npVar.getConnectionsManager().getCurrentTime();
                            int i13 = i12 - 1;
                            tL_message.f28419id = i12;
                            tL_message.message = tL_sponsoredMessage.message;
                            TLRPC.MessageMedia messageMedia = tL_sponsoredMessage.media;
                            if (messageMedia != null) {
                                tL_message.flags |= 512;
                            }
                            tL_message.media = messageMedia;
                            gj gjVar = new gj(npVar.currentAccount, (TLRPC.Message) tL_message, hVar, hVar2, true, true);
                            gjVar.R0 = tL_sponsoredMessage.random_id;
                            gjVar.S0 = tL_sponsoredMessage.title;
                            gjVar.T0 = tL_sponsoredMessage.url;
                            gjVar.U0 = tL_sponsoredMessage.recommended;
                            gjVar.V0 = tL_sponsoredMessage.photo;
                            gjVar.W0 = tL_sponsoredMessage.sponsor_info;
                            gjVar.X0 = tL_sponsoredMessage.additional_info;
                            gjVar.Y0 = tL_sponsoredMessage.button_text;
                            gjVar.f24138b1 = tL_sponsoredMessage.can_report;
                            gjVar.Z0 = tL_sponsoredMessage.color;
                            gjVar.f24133a1 = tL_sponsoredMessage.media;
                            gjVar.L5();
                            gjVar.B2 = new ArrayList();
                            gjVar.r0(true);
                            arrayList.add(gjVar);
                            i7++;
                            i12 = i13;
                        }
                        num2 = num3;
                        num3 = arrayList;
                    }
                    num = num2;
                } else {
                    num = null;
                }
                g0.g3(new im(npVar, num3, j3, jpVar, num, 1));
                return;
            case 1:
                si siVar = (si) this.f24483c;
                long j10 = this.f24482b;
                TLRPC.TL_messages_getMessages tL_messages_getMessages = (TLRPC.TL_messages_getMessages) this.d;
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    si.P1(messages_messages.messages);
                    if (!messages_messages.messages.isEmpty()) {
                        fc.X(messages_messages.messages);
                        siVar.m(messages_messages.messages, messages_messages.users, messages_messages.chats, false, false);
                        siVar.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                        ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
                        if (!arrayList2.isEmpty()) {
                            siVar.getMessagesStorage().f27214a.c(new d4(siVar, arrayList2, j10, 14));
                            return;
                        }
                        return;
                    }
                }
                siVar.getMessagesStorage().c2(j10, tL_messages_getMessages.f28494id, false, -1, 0, false, null);
                return;
            case 2:
                np npVar2 = (np) this.f24483c;
                long j11 = this.f24482b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                if (tLObject != null) {
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    if (!tL_messages_peerDialogs.dialogs.isEmpty() && !tL_messages_peerDialogs.chats.isEmpty()) {
                        TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                        tL_messages_dialogs.dialogs.addAll(tL_messages_peerDialogs.dialogs);
                        tL_messages_dialogs.messages.addAll(tL_messages_peerDialogs.messages);
                        tL_messages_dialogs.users.addAll(tL_messages_peerDialogs.users);
                        tL_messages_dialogs.chats.addAll(tL_messages_peerDialogs.chats);
                        npVar2.Q3(tL_messages_dialogs, null, null, ((TLRPC.TL_dialog) tL_messages_peerDialogs.dialogs.get(0)).folder_id, 0, 1, npVar2.U7, false, false, false);
                    }
                }
                if (j11 != 0) {
                    npVar2.getMessagesStorage().q1(j11);
                }
                npVar2.f25778c1.e(chat2.f28398id);
                return;
            case 3:
                np npVar3 = (np) this.f24483c;
                long j12 = this.f24482b;
                TLRPC.TL_messages_getMessagesViews tL_messages_getMessagesViews = (TLRPC.TL_messages_getMessagesViews) this.d;
                if (tLObject != null) {
                    TLRPC.TL_messages_messageViews tL_messages_messageViews = (TLRPC.TL_messages_messageViews) tLObject;
                    a0.h hVar3 = new a0.h();
                    a0.h hVar4 = new a0.h();
                    a0.h hVar5 = new a0.h();
                    SparseIntArray sparseIntArray = (SparseIntArray) hVar3.f(j12);
                    SparseIntArray sparseIntArray2 = (SparseIntArray) hVar4.f(j12);
                    SparseArray sparseArray = (SparseArray) hVar5.f(j12);
                    for (int i14 = 0; i14 < tL_messages_getMessagesViews.f28496id.size() && i14 < tL_messages_messageViews.views.size(); i14++) {
                        TLRPC.TL_messageViews tL_messageViews = tL_messages_messageViews.views.get(i14);
                        if ((tL_messageViews.flags & 1) != 0) {
                            if (sparseIntArray == null) {
                                sparseIntArray = new SparseIntArray();
                                hVar3.k(sparseIntArray, j12);
                            }
                            sparseIntArray.put(tL_messages_getMessagesViews.f28496id.get(i14).intValue(), tL_messageViews.views);
                        }
                        if ((tL_messageViews.flags & 2) != 0) {
                            if (sparseIntArray2 == null) {
                                sparseIntArray2 = new SparseIntArray();
                                hVar4.k(sparseIntArray2, j12);
                            }
                            sparseIntArray2.put(tL_messages_getMessagesViews.f28496id.get(i14).intValue(), tL_messageViews.forwards);
                        }
                        if ((tL_messageViews.flags & 4) != 0) {
                            if (sparseArray == null) {
                                sparseArray = new SparseArray();
                                hVar5.k(sparseArray, j12);
                            }
                            sparseArray.put(tL_messages_getMessagesViews.f28496id.get(i14).intValue(), tL_messageViews.replies);
                        }
                    }
                    npVar3.getMessagesStorage().m1(tL_messages_messageViews.users, tL_messages_messageViews.chats, true, true);
                    npVar3.getMessagesStorage().a1(hVar3, hVar4, hVar5, false);
                    g0.g3(new gn(npVar3, tL_messages_messageViews, hVar3, hVar4, hVar5, 10));
                    return;
                }
                return;
            case 4:
                np npVar4 = (np) this.f24483c;
                long j13 = this.f24482b;
                TLRPC.TL_messages_setChatAvailableReactions tL_messages_setChatAvailableReactions = (TLRPC.TL_messages_setChatAvailableReactions) this.d;
                if (tLObject != null) {
                    npVar4.V3((TLRPC.Updates) tLObject, false);
                    TLRPC.ChatFull P0 = npVar4.P0(j13);
                    if (P0 != null) {
                        if (P0 instanceof TLRPC.TL_chatFull) {
                            P0.flags |= 262144;
                        }
                        if (P0 instanceof TLRPC.TL_channelFull) {
                            P0.flags |= 1073741824;
                        }
                        P0.available_reactions = tL_messages_setChatAvailableReactions.available_reactions;
                        npVar4.getMessagesStorage().N1(P0, false);
                    }
                    g0.g3(new jk(npVar4, j13, 16));
                    return;
                }
                return;
            case 5:
                g0.g3(new gm((np) this.f24483c, tLObject, this.f24482b, (Runnable) this.d, 7));
                return;
            case 6:
                np npVar5 = (np) this.f24483c;
                TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel = (TLRPC.TL_channels_inviteToChannel) this.d;
                long j14 = this.f24482b;
                if (tL_error != null) {
                    g0.g3(new zf(npVar5, tL_error, tL_channels_inviteToChannel, 1));
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_invitedUsers) {
                    TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) tLObject;
                    npVar5.V3(tL_messages_invitedUsers.updates, false);
                    g0.g3(new d4(npVar5, tL_messages_invitedUsers, j14, 4));
                    return;
                } else {
                    return;
                }
            case 7:
                np npVar6 = (np) this.f24483c;
                ai.c0 c0Var = (ai.c0) this.d;
                long j15 = this.f24482b;
                if (tLObject instanceof TLRPC.TL_exportedContactToken) {
                    npVar6.f25793d8 = (TLRPC.TL_exportedContactToken) tLObject;
                    g0.h3(new gi(24, npVar6, c0Var), Math.max(0L, 0 - (System.currentTimeMillis() - j15)));
                    return;
                }
                npVar6.f25785c8 = false;
                return;
            case 8:
                np npVar7 = (np) this.f24483c;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.d;
                long j16 = this.f24482b;
                TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                if (messages_messages2 != null) {
                    int i15 = messages_messages2.count;
                    if (i15 == 0) {
                        i15 = messages_messages2.messages.size();
                    }
                    int i16 = i15;
                    ur messagesStorage = npVar7.getMessagesStorage();
                    messagesStorage.f27214a.c(new vq(messagesStorage, 0L, -inputPeer.channel_id, i16, 7));
                }
                if (j16 != 0) {
                    npVar7.getMessagesStorage().q1(j16);
                    return;
                }
                return;
            case 9:
                np npVar8 = (np) this.f24483c;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
                long j17 = this.f24482b;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages3 = (TLRPC.messages_Messages) tLObject;
                    npVar8.m4(messages_messages3.messages, dialog.f28402id);
                    if (!messages_messages3.messages.isEmpty()) {
                        if (s2.f26694a) {
                            a8.b("checkLastDialogMessage for " + dialog.f28402id + " has message");
                        }
                        TLRPC.TL_messages_dialogs tL_messages_dialogs2 = new TLRPC.TL_messages_dialogs();
                        TLRPC.Message message = messages_messages3.messages.get(0);
                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                        tL_dialog.flags = dialog.flags;
                        tL_dialog.top_message = message.f28419id;
                        tL_dialog.last_message_date = message.date;
                        tL_dialog.notify_settings = dialog.notify_settings;
                        tL_dialog.pts = dialog.pts;
                        tL_dialog.unread_count = dialog.unread_count;
                        tL_dialog.unread_mark = dialog.unread_mark;
                        tL_dialog.unread_mentions_count = dialog.unread_mentions_count;
                        tL_dialog.unread_reactions_count = dialog.unread_reactions_count;
                        tL_dialog.unread_poll_votes_count = dialog.unread_poll_votes_count;
                        tL_dialog.read_inbox_max_id = dialog.read_inbox_max_id;
                        tL_dialog.read_outbox_max_id = dialog.read_outbox_max_id;
                        tL_dialog.pinned = dialog.pinned;
                        tL_dialog.pinnedNum = dialog.pinnedNum;
                        tL_dialog.folder_id = dialog.folder_id;
                        long j18 = dialog.f28402id;
                        tL_dialog.f28402id = j18;
                        message.dialog_id = j18;
                        tL_messages_dialogs2.users.addAll(messages_messages3.users);
                        tL_messages_dialogs2.chats.addAll(messages_messages3.chats);
                        tL_messages_dialogs2.dialogs.add(tL_dialog);
                        tL_messages_dialogs2.messages.addAll(messages_messages3.messages);
                        tL_messages_dialogs2.count = 1;
                        Utilities.d.c(new yf((Object) npVar8, (Object) tL_messages_dialogs2, false, 1));
                        npVar8.getMessagesStorage().j1(messages_messages3.messages, true, true, false, npVar8.getDownloadController().l(), true, 0, 0L);
                    } else {
                        g0.g3(new nn(npVar8, dialog, 0));
                    }
                }
                if (j17 != 0) {
                    npVar8.getMessagesStorage().q1(j17);
                }
                g0.g3(new nn(npVar8, dialog, 1));
                return;
            case 10:
                f00 f00Var = (f00) this.f24483c;
                f00Var.getClass();
                g0.g3(new gm(f00Var, tLObject, this.f24482b, (u01) this.d, 19));
                return;
            case 11:
                g0.g3(new im((a10) this.f24483c, (u00) this.d, tLObject, tL_error, this.f24482b, 6));
                return;
            default:
                g0.g3(new im((a10) this.f24483c, (v00) this.d, tLObject, tL_error, this.f24482b, 5));
                return;
        }
    }

    public ho(c1 c1Var, Object obj, long j3, int i7) {
        this.f24481a = i7;
        this.f24483c = c1Var;
        this.d = obj;
        this.f24482b = j3;
    }
}
