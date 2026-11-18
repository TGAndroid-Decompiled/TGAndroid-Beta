package org.telegram.messenger;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.t01;
public final class go implements RequestDelegate {
    public final int f24289a;
    public final long f24290b;
    public final c1 f24291c;
    public final Object d;

    public go(c1 c1Var, long j3, Object obj, int i7) {
        this.f24289a = i7;
        this.f24291c = c1Var;
        this.f24290b = j3;
        this.d = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        Integer num;
        Integer num2;
        switch (this.f24289a) {
            case 0:
                mp mpVar = (mp) this.f24291c;
                long j3 = this.f24290b;
                ip ipVar = (ip) this.d;
                mpVar.getClass();
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
                        g0.g3(new fi(12, mpVar, messages_sponsoredmessages));
                        a0.h hVar = new a0.h();
                        a0.h hVar2 = new a0.h();
                        int i7 = 0;
                        for (int i10 = 0; i10 < messages_sponsoredmessages.users.size(); i10++) {
                            TLRPC.User user = messages_sponsoredmessages.users.get(i10);
                            hVar.k(user, user.f28554id);
                        }
                        for (int i11 = 0; i11 < messages_sponsoredmessages.chats.size(); i11++) {
                            TLRPC.Chat chat = messages_sponsoredmessages.chats.get(i11);
                            hVar2.k(chat, chat.f28405id);
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
                            tL_message.peer_id = mpVar.B1(j3);
                            tL_message.flags |= 256;
                            tL_message.date = mpVar.getConnectionsManager().getCurrentTime();
                            int i13 = i12 - 1;
                            tL_message.f28426id = i12;
                            tL_message.message = tL_sponsoredMessage.message;
                            TLRPC.MessageMedia messageMedia = tL_sponsoredMessage.media;
                            if (messageMedia != null) {
                                tL_message.flags |= 512;
                            }
                            tL_message.media = messageMedia;
                            fj fjVar = new fj(mpVar.currentAccount, (TLRPC.Message) tL_message, hVar, hVar2, true, true);
                            fjVar.R0 = tL_sponsoredMessage.random_id;
                            fjVar.S0 = tL_sponsoredMessage.title;
                            fjVar.T0 = tL_sponsoredMessage.url;
                            fjVar.U0 = tL_sponsoredMessage.recommended;
                            fjVar.V0 = tL_sponsoredMessage.photo;
                            fjVar.W0 = tL_sponsoredMessage.sponsor_info;
                            fjVar.X0 = tL_sponsoredMessage.additional_info;
                            fjVar.Y0 = tL_sponsoredMessage.button_text;
                            fjVar.f23929b1 = tL_sponsoredMessage.can_report;
                            fjVar.Z0 = tL_sponsoredMessage.color;
                            fjVar.f23924a1 = tL_sponsoredMessage.media;
                            fjVar.L5();
                            fjVar.B2 = new ArrayList();
                            fjVar.r0(true);
                            arrayList.add(fjVar);
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
                g0.g3(new hm(mpVar, num3, j3, ipVar, num, 1));
                return;
            case 1:
                ri riVar = (ri) this.f24291c;
                long j10 = this.f24290b;
                TLRPC.TL_messages_getMessages tL_messages_getMessages = (TLRPC.TL_messages_getMessages) this.d;
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    ri.P1(messages_messages.messages);
                    if (!messages_messages.messages.isEmpty()) {
                        ec.X(messages_messages.messages);
                        riVar.m(messages_messages.messages, messages_messages.users, messages_messages.chats, false, false);
                        riVar.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                        ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
                        if (!arrayList2.isEmpty()) {
                            riVar.getMessagesStorage().f27054a.c(new d4(riVar, arrayList2, j10, 14));
                            return;
                        }
                        return;
                    }
                }
                riVar.getMessagesStorage().c2(j10, tL_messages_getMessages.f28501id, false, -1, 0, false, null);
                return;
            case 2:
                mp mpVar2 = (mp) this.f24291c;
                long j11 = this.f24290b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                if (tLObject != null) {
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    if (!tL_messages_peerDialogs.dialogs.isEmpty() && !tL_messages_peerDialogs.chats.isEmpty()) {
                        TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                        tL_messages_dialogs.dialogs.addAll(tL_messages_peerDialogs.dialogs);
                        tL_messages_dialogs.messages.addAll(tL_messages_peerDialogs.messages);
                        tL_messages_dialogs.users.addAll(tL_messages_peerDialogs.users);
                        tL_messages_dialogs.chats.addAll(tL_messages_peerDialogs.chats);
                        mpVar2.Q3(tL_messages_dialogs, null, null, ((TLRPC.TL_dialog) tL_messages_peerDialogs.dialogs.get(0)).folder_id, 0, 1, mpVar2.U7, false, false, false);
                    }
                }
                if (j11 != 0) {
                    mpVar2.getMessagesStorage().q1(j11);
                }
                mpVar2.f25617c1.e(chat2.f28405id);
                return;
            case 3:
                mp mpVar3 = (mp) this.f24291c;
                long j12 = this.f24290b;
                TLRPC.TL_messages_getMessagesViews tL_messages_getMessagesViews = (TLRPC.TL_messages_getMessagesViews) this.d;
                if (tLObject != null) {
                    TLRPC.TL_messages_messageViews tL_messages_messageViews = (TLRPC.TL_messages_messageViews) tLObject;
                    a0.h hVar3 = new a0.h();
                    a0.h hVar4 = new a0.h();
                    a0.h hVar5 = new a0.h();
                    SparseIntArray sparseIntArray = (SparseIntArray) hVar3.f(j12);
                    SparseIntArray sparseIntArray2 = (SparseIntArray) hVar4.f(j12);
                    SparseArray sparseArray = (SparseArray) hVar5.f(j12);
                    for (int i14 = 0; i14 < tL_messages_getMessagesViews.f28503id.size() && i14 < tL_messages_messageViews.views.size(); i14++) {
                        TLRPC.TL_messageViews tL_messageViews = tL_messages_messageViews.views.get(i14);
                        if ((tL_messageViews.flags & 1) != 0) {
                            if (sparseIntArray == null) {
                                sparseIntArray = new SparseIntArray();
                                hVar3.k(sparseIntArray, j12);
                            }
                            sparseIntArray.put(tL_messages_getMessagesViews.f28503id.get(i14).intValue(), tL_messageViews.views);
                        }
                        if ((tL_messageViews.flags & 2) != 0) {
                            if (sparseIntArray2 == null) {
                                sparseIntArray2 = new SparseIntArray();
                                hVar4.k(sparseIntArray2, j12);
                            }
                            sparseIntArray2.put(tL_messages_getMessagesViews.f28503id.get(i14).intValue(), tL_messageViews.forwards);
                        }
                        if ((tL_messageViews.flags & 4) != 0) {
                            if (sparseArray == null) {
                                sparseArray = new SparseArray();
                                hVar5.k(sparseArray, j12);
                            }
                            sparseArray.put(tL_messages_getMessagesViews.f28503id.get(i14).intValue(), tL_messageViews.replies);
                        }
                    }
                    mpVar3.getMessagesStorage().m1(tL_messages_messageViews.users, tL_messages_messageViews.chats, true, true);
                    mpVar3.getMessagesStorage().a1(hVar3, hVar4, hVar5, false);
                    g0.g3(new fn(mpVar3, tL_messages_messageViews, hVar3, hVar4, hVar5, 10));
                    return;
                }
                return;
            case 4:
                mp mpVar4 = (mp) this.f24291c;
                long j13 = this.f24290b;
                TLRPC.TL_messages_setChatAvailableReactions tL_messages_setChatAvailableReactions = (TLRPC.TL_messages_setChatAvailableReactions) this.d;
                if (tLObject != null) {
                    mpVar4.V3((TLRPC.Updates) tLObject, false);
                    TLRPC.ChatFull P0 = mpVar4.P0(j13);
                    if (P0 != null) {
                        if (P0 instanceof TLRPC.TL_chatFull) {
                            P0.flags |= 262144;
                        }
                        if (P0 instanceof TLRPC.TL_channelFull) {
                            P0.flags |= 1073741824;
                        }
                        P0.available_reactions = tL_messages_setChatAvailableReactions.available_reactions;
                        mpVar4.getMessagesStorage().N1(P0, false);
                    }
                    g0.g3(new ik(mpVar4, j13, 16));
                    return;
                }
                return;
            case 5:
                g0.g3(new fm((mp) this.f24291c, tLObject, this.f24290b, (Runnable) this.d, 7));
                return;
            case 6:
                mp mpVar5 = (mp) this.f24291c;
                TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel = (TLRPC.TL_channels_inviteToChannel) this.d;
                long j14 = this.f24290b;
                if (tL_error != null) {
                    g0.g3(new yf(mpVar5, tL_error, tL_channels_inviteToChannel, 1));
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_invitedUsers) {
                    TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) tLObject;
                    mpVar5.V3(tL_messages_invitedUsers.updates, false);
                    g0.g3(new d4(mpVar5, tL_messages_invitedUsers, j14, 4));
                    return;
                } else {
                    return;
                }
            case 7:
                mp mpVar6 = (mp) this.f24291c;
                ai.g0 g0Var = (ai.g0) this.d;
                long j15 = this.f24290b;
                if (tLObject instanceof TLRPC.TL_exportedContactToken) {
                    mpVar6.f25632d8 = (TLRPC.TL_exportedContactToken) tLObject;
                    g0.h3(new fi(24, mpVar6, g0Var), Math.max(0L, 0 - (System.currentTimeMillis() - j15)));
                    return;
                }
                mpVar6.f25624c8 = false;
                return;
            case 8:
                mp mpVar7 = (mp) this.f24291c;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.d;
                long j16 = this.f24290b;
                TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                if (messages_messages2 != null) {
                    int i15 = messages_messages2.count;
                    if (i15 == 0) {
                        i15 = messages_messages2.messages.size();
                    }
                    int i16 = i15;
                    tr messagesStorage = mpVar7.getMessagesStorage();
                    messagesStorage.f27054a.c(new uq(messagesStorage, 0L, -inputPeer.channel_id, i16, 7));
                }
                if (j16 != 0) {
                    mpVar7.getMessagesStorage().q1(j16);
                    return;
                }
                return;
            case 9:
                mp mpVar8 = (mp) this.f24291c;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
                long j17 = this.f24290b;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages3 = (TLRPC.messages_Messages) tLObject;
                    mpVar8.m4(messages_messages3.messages, dialog.f28409id);
                    if (!messages_messages3.messages.isEmpty()) {
                        if (s2.f26723a) {
                            a8.b("checkLastDialogMessage for " + dialog.f28409id + " has message");
                        }
                        TLRPC.TL_messages_dialogs tL_messages_dialogs2 = new TLRPC.TL_messages_dialogs();
                        TLRPC.Message message = messages_messages3.messages.get(0);
                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                        tL_dialog.flags = dialog.flags;
                        tL_dialog.top_message = message.f28426id;
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
                        long j18 = dialog.f28409id;
                        tL_dialog.f28409id = j18;
                        message.dialog_id = j18;
                        tL_messages_dialogs2.users.addAll(messages_messages3.users);
                        tL_messages_dialogs2.chats.addAll(messages_messages3.chats);
                        tL_messages_dialogs2.dialogs.add(tL_dialog);
                        tL_messages_dialogs2.messages.addAll(messages_messages3.messages);
                        tL_messages_dialogs2.count = 1;
                        Utilities.d.c(new xf((Object) mpVar8, (Object) tL_messages_dialogs2, false, 1));
                        mpVar8.getMessagesStorage().j1(messages_messages3.messages, true, true, false, mpVar8.getDownloadController().l(), true, 0, 0L);
                    } else {
                        g0.g3(new mn(mpVar8, dialog, 0));
                    }
                }
                if (j17 != 0) {
                    mpVar8.getMessagesStorage().q1(j17);
                }
                g0.g3(new mn(mpVar8, dialog, 1));
                return;
            case 10:
                e00 e00Var = (e00) this.f24291c;
                e00Var.getClass();
                g0.g3(new fm(e00Var, tLObject, this.f24290b, (t01) this.d, 19));
                return;
            case 11:
                g0.g3(new hm((z00) this.f24291c, (t00) this.d, tLObject, tL_error, this.f24290b, 6));
                return;
            default:
                g0.g3(new hm((z00) this.f24291c, (u00) this.d, tLObject, tL_error, this.f24290b, 5));
                return;
        }
    }

    public go(c1 c1Var, Object obj, long j3, int i7) {
        this.f24289a = i7;
        this.f24291c = c1Var;
        this.d = obj;
        this.f24290b = j3;
    }
}
