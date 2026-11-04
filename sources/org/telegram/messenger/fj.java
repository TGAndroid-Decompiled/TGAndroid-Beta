package org.telegram.messenger;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fj implements RequestDelegate {
    public final int f22503a;
    public final long f22504b;
    public final c1 f22505c;
    public final Object d;

    public fj(c1 c1Var, long j10, Object obj, int i3) {
        this.f22503a = i3;
        this.f22505c = c1Var;
        this.f22504b = j10;
        this.d = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        Integer num;
        Integer num2;
        switch (this.f22503a) {
            case 0:
                hp hpVar = (hp) this.f22505c;
                long j10 = this.f22504b;
                dp dpVar = (dp) this.d;
                hpVar.getClass();
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
                        g0.h3(new yh(11, hpVar, messages_sponsoredmessages));
                        a0.h hVar = new a0.h();
                        a0.h hVar2 = new a0.h();
                        int i3 = 0;
                        for (int i10 = 0; i10 < messages_sponsoredmessages.users.size(); i10++) {
                            TLRPC.User user = messages_sponsoredmessages.users.get(i10);
                            hVar.k(user, user.f27150id);
                        }
                        for (int i11 = 0; i11 < messages_sponsoredmessages.chats.size(); i11++) {
                            TLRPC.Chat chat = messages_sponsoredmessages.chats.get(i11);
                            hVar2.k(chat, chat.f27001id);
                        }
                        int size = messages_sponsoredmessages.messages.size();
                        int i12 = -10000000;
                        while (i3 < size) {
                            TLRPC.TL_sponsoredMessage tL_sponsoredMessage = messages_sponsoredmessages.messages.get(i3);
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            if (!tL_sponsoredMessage.entities.isEmpty()) {
                                tL_message.entities = tL_sponsoredMessage.entities;
                                tL_message.flags |= 128;
                            }
                            tL_message.peer_id = hpVar.z1(j10);
                            tL_message.flags |= 256;
                            tL_message.date = hpVar.getConnectionsManager().getCurrentTime();
                            int i13 = i12 - 1;
                            tL_message.f27022id = i12;
                            tL_message.message = tL_sponsoredMessage.message;
                            TLRPC.MessageMedia messageMedia = tL_sponsoredMessage.media;
                            if (messageMedia != null) {
                                tL_message.flags |= 512;
                            }
                            tL_message.media = messageMedia;
                            zi ziVar = new zi(hpVar.currentAccount, (TLRPC.Message) tL_message, hVar, hVar2, true, true);
                            ziVar.P0 = tL_sponsoredMessage.random_id;
                            ziVar.Q0 = tL_sponsoredMessage.title;
                            ziVar.R0 = tL_sponsoredMessage.url;
                            ziVar.S0 = tL_sponsoredMessage.recommended;
                            ziVar.T0 = tL_sponsoredMessage.photo;
                            ziVar.U0 = tL_sponsoredMessage.sponsor_info;
                            ziVar.V0 = tL_sponsoredMessage.additional_info;
                            ziVar.W0 = tL_sponsoredMessage.button_text;
                            ziVar.Z0 = tL_sponsoredMessage.can_report;
                            ziVar.X0 = tL_sponsoredMessage.color;
                            ziVar.Y0 = tL_sponsoredMessage.media;
                            ziVar.M5();
                            ziVar.f26927z2 = new ArrayList();
                            ziVar.r0(true);
                            arrayList.add(ziVar);
                            i3++;
                            i12 = i13;
                        }
                        num2 = num3;
                        num3 = arrayList;
                    }
                    num = num2;
                } else {
                    num = null;
                }
                g0.h3(new bm(hpVar, num3, j10, dpVar, num, 1));
                return;
            case 1:
                li liVar = (li) this.f22505c;
                long j11 = this.f22504b;
                TLRPC.TL_messages_getMessages tL_messages_getMessages = (TLRPC.TL_messages_getMessages) this.d;
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    li.K1(messages_messages.messages);
                    if (!messages_messages.messages.isEmpty()) {
                        zb.X(messages_messages.messages);
                        liVar.k(messages_messages.messages, messages_messages.users, messages_messages.chats, false, false);
                        liVar.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                        ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
                        if (!arrayList2.isEmpty()) {
                            liVar.getMessagesStorage().f24934a.c(new a4(liVar, arrayList2, j11, 14));
                            return;
                        }
                        return;
                    }
                }
                liVar.getMessagesStorage().c2(j11, tL_messages_getMessages.f27097id, false, -1, 0, false, null);
                return;
            case 2:
                hp hpVar2 = (hp) this.f22505c;
                long j12 = this.f22504b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                if (tLObject != null) {
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    if (!tL_messages_peerDialogs.dialogs.isEmpty() && !tL_messages_peerDialogs.chats.isEmpty()) {
                        TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                        tL_messages_dialogs.dialogs.addAll(tL_messages_peerDialogs.dialogs);
                        tL_messages_dialogs.messages.addAll(tL_messages_peerDialogs.messages);
                        tL_messages_dialogs.users.addAll(tL_messages_peerDialogs.users);
                        tL_messages_dialogs.chats.addAll(tL_messages_peerDialogs.chats);
                        hpVar2.J3(tL_messages_dialogs, null, null, ((TLRPC.TL_dialog) tL_messages_peerDialogs.dialogs.get(0)).folder_id, 0, 1, hpVar2.O7, false, false, false);
                    }
                }
                if (j12 != 0) {
                    hpVar2.getMessagesStorage().q1(j12);
                }
                hpVar2.f22975c1.e(chat2.f27001id);
                return;
            case 3:
                hp hpVar3 = (hp) this.f22505c;
                long j13 = this.f22504b;
                TLRPC.TL_messages_getMessagesViews tL_messages_getMessagesViews = (TLRPC.TL_messages_getMessagesViews) this.d;
                if (tLObject != null) {
                    TLRPC.TL_messages_messageViews tL_messages_messageViews = (TLRPC.TL_messages_messageViews) tLObject;
                    a0.h hVar3 = new a0.h();
                    a0.h hVar4 = new a0.h();
                    a0.h hVar5 = new a0.h();
                    SparseIntArray sparseIntArray = (SparseIntArray) hVar3.f(j13);
                    SparseIntArray sparseIntArray2 = (SparseIntArray) hVar4.f(j13);
                    SparseArray sparseArray = (SparseArray) hVar5.f(j13);
                    for (int i14 = 0; i14 < tL_messages_getMessagesViews.f27099id.size() && i14 < tL_messages_messageViews.views.size(); i14++) {
                        TLRPC.TL_messageViews tL_messageViews = tL_messages_messageViews.views.get(i14);
                        if ((tL_messageViews.flags & 1) != 0) {
                            if (sparseIntArray == null) {
                                sparseIntArray = new SparseIntArray();
                                hVar3.k(sparseIntArray, j13);
                            }
                            sparseIntArray.put(tL_messages_getMessagesViews.f27099id.get(i14).intValue(), tL_messageViews.views);
                        }
                        if ((tL_messageViews.flags & 2) != 0) {
                            if (sparseIntArray2 == null) {
                                sparseIntArray2 = new SparseIntArray();
                                hVar4.k(sparseIntArray2, j13);
                            }
                            sparseIntArray2.put(tL_messages_getMessagesViews.f27099id.get(i14).intValue(), tL_messageViews.forwards);
                        }
                        if ((tL_messageViews.flags & 4) != 0) {
                            if (sparseArray == null) {
                                sparseArray = new SparseArray();
                                hVar5.k(sparseArray, j13);
                            }
                            sparseArray.put(tL_messages_getMessagesViews.f27099id.get(i14).intValue(), tL_messageViews.replies);
                        }
                    }
                    hpVar3.getMessagesStorage().m1(tL_messages_messageViews.users, tL_messages_messageViews.chats, true, true);
                    hpVar3.getMessagesStorage().a1(hVar3, hVar4, hVar5, false);
                    g0.h3(new cn(hpVar3, tL_messages_messageViews, hVar3, hVar4, hVar5, 8));
                    return;
                }
                return;
            case 4:
                hp hpVar4 = (hp) this.f22505c;
                long j14 = this.f22504b;
                TLRPC.TL_messages_setChatAvailableReactions tL_messages_setChatAvailableReactions = (TLRPC.TL_messages_setChatAvailableReactions) this.d;
                if (tLObject != null) {
                    hpVar4.O3((TLRPC.Updates) tLObject, false);
                    TLRPC.ChatFull N0 = hpVar4.N0(j14);
                    if (N0 != null) {
                        if (N0 instanceof TLRPC.TL_chatFull) {
                            N0.flags |= 262144;
                        }
                        if (N0 instanceof TLRPC.TL_channelFull) {
                            N0.flags |= 1073741824;
                        }
                        N0.available_reactions = tL_messages_setChatAvailableReactions.available_reactions;
                        hpVar4.getMessagesStorage().N1(N0, false);
                    }
                    g0.h3(new dk(hpVar4, j14, 16));
                    return;
                }
                return;
            case 5:
                g0.h3(new zl((hp) this.f22505c, tLObject, this.f22504b, (Runnable) this.d, 4));
                return;
            case 6:
                hp hpVar5 = (hp) this.f22505c;
                TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel = (TLRPC.TL_channels_inviteToChannel) this.d;
                long j15 = this.f22504b;
                if (tL_error != null) {
                    g0.h3(new fg(hpVar5, tL_error, tL_channels_inviteToChannel, 1));
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_invitedUsers) {
                    TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) tLObject;
                    hpVar5.O3(tL_messages_invitedUsers.updates, false);
                    g0.h3(new a4(hpVar5, tL_messages_invitedUsers, j15, 4));
                    return;
                } else {
                    return;
                }
            case 7:
                hp hpVar6 = (hp) this.f22505c;
                ai.v2 v2Var = (ai.v2) this.d;
                long j16 = this.f22504b;
                if (tLObject instanceof TLRPC.TL_exportedContactToken) {
                    hpVar6.X7 = (TLRPC.TL_exportedContactToken) tLObject;
                    g0.i3(new yh(22, hpVar6, v2Var), Math.max(0L, 0 - (System.currentTimeMillis() - j16)));
                    return;
                }
                hpVar6.W7 = false;
                return;
            case 8:
                hp hpVar7 = (hp) this.f22505c;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.d;
                long j17 = this.f22504b;
                TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                if (messages_messages2 != null) {
                    int i15 = messages_messages2.count;
                    if (i15 == 0) {
                        i15 = messages_messages2.messages.size();
                    }
                    int i16 = i15;
                    qr messagesStorage = hpVar7.getMessagesStorage();
                    messagesStorage.f24934a.c(new qq(messagesStorage, 0L, -inputPeer.channel_id, i16, 7));
                }
                if (j17 != 0) {
                    hpVar7.getMessagesStorage().q1(j17);
                    return;
                }
                return;
            case 9:
                hp hpVar8 = (hp) this.f22505c;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
                long j18 = this.f22504b;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages3 = (TLRPC.messages_Messages) tLObject;
                    hpVar8.e4(messages_messages3.messages, dialog.f27005id);
                    if (!messages_messages3.messages.isEmpty()) {
                        if (r2.f25040a) {
                            a8.b("checkLastDialogMessage for " + dialog.f27005id + " has message");
                        }
                        TLRPC.TL_messages_dialogs tL_messages_dialogs2 = new TLRPC.TL_messages_dialogs();
                        TLRPC.Message message = messages_messages3.messages.get(0);
                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                        tL_dialog.flags = dialog.flags;
                        tL_dialog.top_message = message.f27022id;
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
                        long j19 = dialog.f27005id;
                        tL_dialog.f27005id = j19;
                        message.dialog_id = j19;
                        tL_messages_dialogs2.users.addAll(messages_messages3.users);
                        tL_messages_dialogs2.chats.addAll(messages_messages3.chats);
                        tL_messages_dialogs2.dialogs.add(tL_dialog);
                        tL_messages_dialogs2.messages.addAll(messages_messages3.messages);
                        tL_messages_dialogs2.count = 1;
                        Utilities.d.c(new qf((Object) hpVar8, (Object) tL_messages_dialogs2, false, 1));
                        hpVar8.getMessagesStorage().j1(messages_messages3.messages, true, true, false, hpVar8.getDownloadController().l(), true, 0, 0L);
                    } else {
                        g0.h3(new jn(hpVar8, dialog, 0));
                    }
                }
                if (j18 != 0) {
                    hpVar8.getMessagesStorage().q1(j18);
                }
                g0.h3(new jn(hpVar8, dialog, 1));
                return;
            case 10:
                c00 c00Var = (c00) this.f22505c;
                c00Var.getClass();
                g0.h3(new zl(c00Var, tLObject, this.f22504b, (org.telegram.ui.Components.ei) this.d, 19));
                return;
            case 11:
                g0.h3(new bm((x00) this.f22505c, (r00) this.d, tLObject, tL_error, this.f22504b, 6));
                return;
            default:
                g0.h3(new bm((x00) this.f22505c, (s00) this.d, tLObject, tL_error, this.f22504b, 5));
                return;
        }
    }

    public fj(c1 c1Var, Object obj, long j10, int i3) {
        this.f22503a = i3;
        this.f22505c = c1Var;
        this.d = obj;
        this.f22504b = j10;
    }
}
