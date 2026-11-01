package org.telegram.messenger;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rj implements RequestDelegate {
    public final int f17938a;
    public final long f17939b;
    public final f1 f17940c;
    public final Object d;

    public rj(f1 f1Var, long j10, Object obj, int i10) {
        this.f17938a = i10;
        this.f17940c = f1Var;
        this.f17939b = j10;
        this.d = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        Integer num;
        Integer num2;
        switch (this.f17938a) {
            case 0:
                wp wpVar = (wp) this.f17940c;
                long j10 = this.f17939b;
                sp spVar = (sp) this.d;
                wpVar.getClass();
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
                        i0.g3(new pi(16, wpVar, messages_sponsoredmessages));
                        a0.h hVar = new a0.h();
                        a0.h hVar2 = new a0.h();
                        int i10 = 0;
                        for (int i11 = 0; i11 < messages_sponsoredmessages.users.size(); i11++) {
                            TLRPC.User user = messages_sponsoredmessages.users.get(i11);
                            hVar.k(user, user.f19943id);
                        }
                        for (int i12 = 0; i12 < messages_sponsoredmessages.chats.size(); i12++) {
                            TLRPC.Chat chat = messages_sponsoredmessages.chats.get(i12);
                            hVar2.k(chat, chat.f19794id);
                        }
                        int size = messages_sponsoredmessages.messages.size();
                        int i13 = -10000000;
                        while (i10 < size) {
                            TLRPC.TL_sponsoredMessage tL_sponsoredMessage = messages_sponsoredmessages.messages.get(i10);
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            if (!tL_sponsoredMessage.entities.isEmpty()) {
                                tL_message.entities = tL_sponsoredMessage.entities;
                                tL_message.flags |= 128;
                            }
                            tL_message.peer_id = wpVar.y1(j10);
                            tL_message.flags |= 256;
                            tL_message.date = wpVar.getConnectionsManager().getCurrentTime();
                            int i14 = i13 - 1;
                            tL_message.f19815id = i13;
                            tL_message.message = tL_sponsoredMessage.message;
                            TLRPC.MessageMedia messageMedia = tL_sponsoredMessage.media;
                            if (messageMedia != null) {
                                tL_message.flags |= 512;
                            }
                            tL_message.media = messageMedia;
                            kj kjVar = new kj(wpVar.currentAccount, (TLRPC.Message) tL_message, hVar, hVar2, true, true);
                            kjVar.P0 = tL_sponsoredMessage.random_id;
                            kjVar.Q0 = tL_sponsoredMessage.title;
                            kjVar.R0 = tL_sponsoredMessage.url;
                            kjVar.S0 = tL_sponsoredMessage.recommended;
                            kjVar.T0 = tL_sponsoredMessage.photo;
                            kjVar.U0 = tL_sponsoredMessage.sponsor_info;
                            kjVar.V0 = tL_sponsoredMessage.additional_info;
                            kjVar.W0 = tL_sponsoredMessage.button_text;
                            kjVar.Z0 = tL_sponsoredMessage.can_report;
                            kjVar.X0 = tL_sponsoredMessage.color;
                            kjVar.Y0 = tL_sponsoredMessage.media;
                            kjVar.K5();
                            kjVar.f16750z2 = new ArrayList();
                            kjVar.r0(true);
                            arrayList.add(kjVar);
                            i10++;
                            i13 = i14;
                        }
                        num2 = num3;
                        num3 = arrayList;
                    }
                    num = num2;
                } else {
                    num = null;
                }
                i0.g3(new zm(wpVar, num3, j10, spVar, num, 1));
                return;
            case 1:
                vi viVar = (vi) this.f17940c;
                long j11 = this.f17939b;
                TLRPC.TL_messages_getMessages tL_messages_getMessages = (TLRPC.TL_messages_getMessages) this.d;
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    vi.K1(messages_messages.messages);
                    if (!messages_messages.messages.isEmpty()) {
                        ic.X(messages_messages.messages);
                        viVar.k(messages_messages.messages, messages_messages.users, messages_messages.chats, false, false);
                        viVar.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                        ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
                        if (!arrayList2.isEmpty()) {
                            viVar.getMessagesStorage().f16331a.c(new d4(viVar, arrayList2, j11, 14));
                            return;
                        }
                        return;
                    }
                }
                viVar.getMessagesStorage().c2(j11, tL_messages_getMessages.f19890id, false, -1, 0, false, null);
                return;
            case 2:
                wp wpVar2 = (wp) this.f17940c;
                long j12 = this.f17939b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                if (tLObject != null) {
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    if (!tL_messages_peerDialogs.dialogs.isEmpty() && !tL_messages_peerDialogs.chats.isEmpty()) {
                        TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                        tL_messages_dialogs.dialogs.addAll(tL_messages_peerDialogs.dialogs);
                        tL_messages_dialogs.messages.addAll(tL_messages_peerDialogs.messages);
                        tL_messages_dialogs.users.addAll(tL_messages_peerDialogs.users);
                        tL_messages_dialogs.chats.addAll(tL_messages_peerDialogs.chats);
                        wpVar2.G3(tL_messages_dialogs, null, null, ((TLRPC.TL_dialog) tL_messages_peerDialogs.dialogs.get(0)).folder_id, 0, 1, wpVar2.P7, false, false, false);
                    }
                }
                if (j12 != 0) {
                    wpVar2.getMessagesStorage().q1(j12);
                }
                wpVar2.f19087b1.e(chat2.f19794id);
                return;
            case 3:
                wp wpVar3 = (wp) this.f17940c;
                long j13 = this.f17939b;
                TLRPC.TL_messages_getMessagesViews tL_messages_getMessagesViews = (TLRPC.TL_messages_getMessagesViews) this.d;
                if (tLObject != null) {
                    TLRPC.TL_messages_messageViews tL_messages_messageViews = (TLRPC.TL_messages_messageViews) tLObject;
                    a0.h hVar3 = new a0.h();
                    a0.h hVar4 = new a0.h();
                    a0.h hVar5 = new a0.h();
                    SparseIntArray sparseIntArray = (SparseIntArray) hVar3.f(j13);
                    SparseIntArray sparseIntArray2 = (SparseIntArray) hVar4.f(j13);
                    SparseArray sparseArray = (SparseArray) hVar5.f(j13);
                    for (int i15 = 0; i15 < tL_messages_getMessagesViews.f19892id.size() && i15 < tL_messages_messageViews.views.size(); i15++) {
                        TLRPC.TL_messageViews tL_messageViews = tL_messages_messageViews.views.get(i15);
                        if ((tL_messageViews.flags & 1) != 0) {
                            if (sparseIntArray == null) {
                                sparseIntArray = new SparseIntArray();
                                hVar3.k(sparseIntArray, j13);
                            }
                            sparseIntArray.put(tL_messages_getMessagesViews.f19892id.get(i15).intValue(), tL_messageViews.views);
                        }
                        if ((tL_messageViews.flags & 2) != 0) {
                            if (sparseIntArray2 == null) {
                                sparseIntArray2 = new SparseIntArray();
                                hVar4.k(sparseIntArray2, j13);
                            }
                            sparseIntArray2.put(tL_messages_getMessagesViews.f19892id.get(i15).intValue(), tL_messageViews.forwards);
                        }
                        if ((tL_messageViews.flags & 4) != 0) {
                            if (sparseArray == null) {
                                sparseArray = new SparseArray();
                                hVar5.k(sparseArray, j13);
                            }
                            sparseArray.put(tL_messages_getMessagesViews.f19892id.get(i15).intValue(), tL_messageViews.replies);
                        }
                    }
                    wpVar3.getMessagesStorage().m1(tL_messages_messageViews.users, tL_messages_messageViews.chats, true, true);
                    wpVar3.getMessagesStorage().a1(hVar3, hVar4, hVar5, false);
                    i0.g3(new dn(wpVar3, tL_messages_messageViews, hVar3, hVar4, hVar5, 9));
                    return;
                }
                return;
            case 4:
                wp wpVar4 = (wp) this.f17940c;
                long j14 = this.f17939b;
                TLRPC.TL_messages_setChatAvailableReactions tL_messages_setChatAvailableReactions = (TLRPC.TL_messages_setChatAvailableReactions) this.d;
                if (tLObject != null) {
                    wpVar4.L3((TLRPC.Updates) tLObject, false);
                    TLRPC.ChatFull M0 = wpVar4.M0(j14);
                    if (M0 != null) {
                        if (M0 instanceof TLRPC.TL_chatFull) {
                            M0.flags |= 262144;
                        }
                        if (M0 instanceof TLRPC.TL_channelFull) {
                            M0.flags |= 1073741824;
                        }
                        M0.available_reactions = tL_messages_setChatAvailableReactions.available_reactions;
                        wpVar4.getMessagesStorage().N1(M0, false);
                    }
                    i0.g3(new xk(wpVar4, j14, 17));
                    return;
                }
                return;
            case 5:
                i0.g3(new xm((wp) this.f17940c, tLObject, this.f17939b, (Runnable) this.d, 5));
                return;
            case 6:
                wp wpVar5 = (wp) this.f17940c;
                TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel = (TLRPC.TL_channels_inviteToChannel) this.d;
                long j15 = this.f17939b;
                if (tL_error != null) {
                    i0.g3(new ng(wpVar5, tL_error, tL_channels_inviteToChannel, 1));
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_invitedUsers) {
                    TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) tLObject;
                    wpVar5.L3(tL_messages_invitedUsers.updates, false);
                    i0.g3(new d4(wpVar5, tL_messages_invitedUsers, j15, 4));
                    return;
                } else {
                    return;
                }
            case 7:
                wp wpVar6 = (wp) this.f17940c;
                ph.h1 h1Var = (ph.h1) this.d;
                long j16 = this.f17939b;
                if (tLObject instanceof TLRPC.TL_exportedContactToken) {
                    wpVar6.Y7 = (TLRPC.TL_exportedContactToken) tLObject;
                    i0.h3(new pi(22, wpVar6, h1Var), Math.max(0L, 0 - (System.currentTimeMillis() - j16)));
                    return;
                }
                wpVar6.X7 = false;
                return;
            case 8:
                wp wpVar7 = (wp) this.f17940c;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.d;
                long j17 = this.f17939b;
                TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                if (messages_messages2 != null) {
                    int i16 = messages_messages2.count;
                    if (i16 == 0) {
                        i16 = messages_messages2.messages.size();
                    }
                    int i17 = i16;
                    is messagesStorage = wpVar7.getMessagesStorage();
                    messagesStorage.f16331a.c(new jr(messagesStorage, 0L, -inputPeer.channel_id, i17, 7));
                }
                if (j17 != 0) {
                    wpVar7.getMessagesStorage().q1(j17);
                    return;
                }
                return;
            case 9:
                wp wpVar8 = (wp) this.f17940c;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
                long j18 = this.f17939b;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages3 = (TLRPC.messages_Messages) tLObject;
                    wpVar8.b4(messages_messages3.messages, dialog.f19798id);
                    if (!messages_messages3.messages.isEmpty()) {
                        if (v2.f18578a) {
                            f8.b("checkLastDialogMessage for " + dialog.f19798id + " has message");
                        }
                        TLRPC.TL_messages_dialogs tL_messages_dialogs2 = new TLRPC.TL_messages_dialogs();
                        TLRPC.Message message = messages_messages3.messages.get(0);
                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                        tL_dialog.flags = dialog.flags;
                        tL_dialog.top_message = message.f19815id;
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
                        long j19 = dialog.f19798id;
                        tL_dialog.f19798id = j19;
                        message.dialog_id = j19;
                        tL_messages_dialogs2.users.addAll(messages_messages3.users);
                        tL_messages_dialogs2.chats.addAll(messages_messages3.chats);
                        tL_messages_dialogs2.dialogs.add(tL_dialog);
                        tL_messages_dialogs2.messages.addAll(messages_messages3.messages);
                        tL_messages_dialogs2.count = 1;
                        Utilities.d.c(new xf((Object) wpVar8, (Object) tL_messages_dialogs2, false, 1));
                        wpVar8.getMessagesStorage().j1(messages_messages3.messages, true, true, false, wpVar8.getDownloadController().l(), true, 0, 0L);
                    } else {
                        i0.g3(new xn(wpVar8, dialog, 0));
                    }
                }
                if (j18 != 0) {
                    wpVar8.getMessagesStorage().q1(j18);
                }
                i0.g3(new xn(wpVar8, dialog, 1));
                return;
            case 10:
                y00 y00Var = (y00) this.f17940c;
                y00Var.getClass();
                i0.g3(new xm(y00Var, tLObject, this.f17939b, (org.telegram.ui.Components.vg) this.d, 20));
                return;
            case 11:
                i0.g3(new zm((u10) this.f17940c, (o10) this.d, tLObject, tL_error, this.f17939b, 6));
                return;
            default:
                i0.g3(new zm((u10) this.f17940c, (p10) this.d, tLObject, tL_error, this.f17939b, 5));
                return;
        }
    }

    public rj(f1 f1Var, Object obj, long j10, int i10) {
        this.f17938a = i10;
        this.f17940c = f1Var;
        this.d = obj;
        this.f17939b = j10;
    }
}
