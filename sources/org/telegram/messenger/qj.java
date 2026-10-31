package org.telegram.messenger;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qj implements RequestDelegate {
    public final int f17592a;
    public final long f17593b;
    public final f1 f17594c;
    public final Object d;

    public qj(f1 f1Var, long j10, Object obj, int i10) {
        this.f17592a = i10;
        this.f17594c = f1Var;
        this.f17593b = j10;
        this.d = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        Integer num;
        Integer num2;
        Integer num3;
        switch (this.f17592a) {
            case 0:
                vp vpVar = (vp) this.f17594c;
                long j10 = this.f17593b;
                rp rpVar = (rp) this.d;
                vpVar.getClass();
                Integer num4 = null;
                if (tLObject instanceof TLRPC.messages_SponsoredMessages) {
                    TLRPC.messages_SponsoredMessages messages_sponsoredmessages = (TLRPC.messages_SponsoredMessages) tLObject;
                    if (messages_sponsoredmessages.messages.isEmpty()) {
                        num3 = null;
                    } else {
                        if ((messages_sponsoredmessages instanceof TLRPC.TL_messages_sponsoredMessages) && (messages_sponsoredmessages.flags & 1) > 0) {
                            num4 = Integer.valueOf(messages_sponsoredmessages.posts_between);
                        }
                        ArrayList arrayList = new ArrayList();
                        i0.g3(new oi(16, vpVar, messages_sponsoredmessages));
                        a0.h hVar = new a0.h();
                        a0.h hVar2 = new a0.h();
                        int i10 = 0;
                        for (int i11 = 0; i11 < messages_sponsoredmessages.users.size(); i11++) {
                            TLRPC.User user = messages_sponsoredmessages.users.get(i11);
                            hVar.k(user, user.f19942id);
                        }
                        for (int i12 = 0; i12 < messages_sponsoredmessages.chats.size(); i12++) {
                            TLRPC.Chat chat = messages_sponsoredmessages.chats.get(i12);
                            hVar2.k(chat, chat.f19793id);
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
                            tL_message.peer_id = vpVar.y1(j10);
                            tL_message.flags |= 256;
                            tL_message.date = vpVar.getConnectionsManager().getCurrentTime();
                            int i14 = i13 - 1;
                            tL_message.f19814id = i13;
                            tL_message.message = tL_sponsoredMessage.message;
                            TLRPC.MessageMedia messageMedia = tL_sponsoredMessage.media;
                            if (messageMedia != null) {
                                tL_message.flags |= 512;
                            }
                            tL_message.media = messageMedia;
                            jj jjVar = new jj(vpVar.currentAccount, (TLRPC.Message) tL_message, hVar, hVar2, true, true);
                            jjVar.P0 = tL_sponsoredMessage.random_id;
                            jjVar.Q0 = tL_sponsoredMessage.title;
                            jjVar.R0 = tL_sponsoredMessage.url;
                            jjVar.S0 = tL_sponsoredMessage.recommended;
                            jjVar.T0 = tL_sponsoredMessage.photo;
                            jjVar.U0 = tL_sponsoredMessage.sponsor_info;
                            jjVar.V0 = tL_sponsoredMessage.additional_info;
                            jjVar.W0 = tL_sponsoredMessage.button_text;
                            jjVar.Z0 = tL_sponsoredMessage.can_report;
                            jjVar.X0 = tL_sponsoredMessage.color;
                            jjVar.Y0 = tL_sponsoredMessage.media;
                            jjVar.K5();
                            jjVar.f16397z2 = new ArrayList();
                            jjVar.r0(true);
                            arrayList.add(jjVar);
                            i10++;
                            i13 = i14;
                        }
                        num3 = num4;
                        num4 = arrayList;
                    }
                    num2 = num3;
                    num = num4;
                } else {
                    num = null;
                    num2 = null;
                }
                i0.g3(new ym(vpVar, num, j10, rpVar, num2, 1));
                return;
            case 1:
                ui uiVar = (ui) this.f17594c;
                long j11 = this.f17593b;
                TLRPC.TL_messages_getMessages tL_messages_getMessages = (TLRPC.TL_messages_getMessages) this.d;
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    ui.K1(messages_messages.messages);
                    if (!messages_messages.messages.isEmpty()) {
                        hc.X(messages_messages.messages);
                        uiVar.k(messages_messages.messages, messages_messages.users, messages_messages.chats, false, false);
                        uiVar.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                        ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
                        if (!arrayList2.isEmpty()) {
                            uiVar.getMessagesStorage().f15938a.c(new d4(uiVar, arrayList2, j11, 14));
                            return;
                        }
                        return;
                    }
                }
                uiVar.getMessagesStorage().c2(j11, tL_messages_getMessages.f19889id, false, -1, 0, false, null);
                return;
            case 2:
                vp vpVar2 = (vp) this.f17594c;
                long j12 = this.f17593b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                if (tLObject != null) {
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    if (!tL_messages_peerDialogs.dialogs.isEmpty() && !tL_messages_peerDialogs.chats.isEmpty()) {
                        TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                        tL_messages_dialogs.dialogs.addAll(tL_messages_peerDialogs.dialogs);
                        tL_messages_dialogs.messages.addAll(tL_messages_peerDialogs.messages);
                        tL_messages_dialogs.users.addAll(tL_messages_peerDialogs.users);
                        tL_messages_dialogs.chats.addAll(tL_messages_peerDialogs.chats);
                        vpVar2.G3(tL_messages_dialogs, null, null, ((TLRPC.TL_dialog) tL_messages_peerDialogs.dialogs.get(0)).folder_id, 0, 1, vpVar2.P7, false, false, false);
                    }
                }
                if (j12 != 0) {
                    vpVar2.getMessagesStorage().q1(j12);
                }
                vpVar2.f18744b1.e(chat2.f19793id);
                return;
            case 3:
                vp vpVar3 = (vp) this.f17594c;
                long j13 = this.f17593b;
                TLRPC.TL_messages_getMessagesViews tL_messages_getMessagesViews = (TLRPC.TL_messages_getMessagesViews) this.d;
                if (tLObject != null) {
                    TLRPC.TL_messages_messageViews tL_messages_messageViews = (TLRPC.TL_messages_messageViews) tLObject;
                    a0.h hVar3 = new a0.h();
                    a0.h hVar4 = new a0.h();
                    a0.h hVar5 = new a0.h();
                    SparseIntArray sparseIntArray = (SparseIntArray) hVar3.f(j13);
                    SparseIntArray sparseIntArray2 = (SparseIntArray) hVar4.f(j13);
                    SparseArray sparseArray = (SparseArray) hVar5.f(j13);
                    for (int i15 = 0; i15 < tL_messages_getMessagesViews.f19891id.size() && i15 < tL_messages_messageViews.views.size(); i15++) {
                        TLRPC.TL_messageViews tL_messageViews = tL_messages_messageViews.views.get(i15);
                        if ((tL_messageViews.flags & 1) != 0) {
                            if (sparseIntArray == null) {
                                sparseIntArray = new SparseIntArray();
                                hVar3.k(sparseIntArray, j13);
                            }
                            sparseIntArray.put(tL_messages_getMessagesViews.f19891id.get(i15).intValue(), tL_messageViews.views);
                        }
                        if ((tL_messageViews.flags & 2) != 0) {
                            if (sparseIntArray2 == null) {
                                sparseIntArray2 = new SparseIntArray();
                                hVar4.k(sparseIntArray2, j13);
                            }
                            sparseIntArray2.put(tL_messages_getMessagesViews.f19891id.get(i15).intValue(), tL_messageViews.forwards);
                        }
                        if ((tL_messageViews.flags & 4) != 0) {
                            if (sparseArray == null) {
                                sparseArray = new SparseArray();
                                hVar5.k(sparseArray, j13);
                            }
                            sparseArray.put(tL_messages_getMessagesViews.f19891id.get(i15).intValue(), tL_messageViews.replies);
                        }
                    }
                    vpVar3.getMessagesStorage().m1(tL_messages_messageViews.users, tL_messages_messageViews.chats, true, true);
                    vpVar3.getMessagesStorage().a1(hVar3, hVar4, hVar5, false);
                    i0.g3(new cn(vpVar3, tL_messages_messageViews, hVar3, hVar4, hVar5, 9));
                    return;
                }
                return;
            case 4:
                vp vpVar4 = (vp) this.f17594c;
                long j14 = this.f17593b;
                TLRPC.TL_messages_setChatAvailableReactions tL_messages_setChatAvailableReactions = (TLRPC.TL_messages_setChatAvailableReactions) this.d;
                if (tLObject != null) {
                    vpVar4.L3((TLRPC.Updates) tLObject, false);
                    TLRPC.ChatFull M0 = vpVar4.M0(j14);
                    if (M0 != null) {
                        if (M0 instanceof TLRPC.TL_chatFull) {
                            M0.flags |= 262144;
                        }
                        if (M0 instanceof TLRPC.TL_channelFull) {
                            M0.flags |= 1073741824;
                        }
                        M0.available_reactions = tL_messages_setChatAvailableReactions.available_reactions;
                        vpVar4.getMessagesStorage().N1(M0, false);
                    }
                    i0.g3(new wk(vpVar4, j14, 17));
                    return;
                }
                return;
            case 5:
                i0.g3(new wm((vp) this.f17594c, tLObject, this.f17593b, (Runnable) this.d, 5));
                return;
            case 6:
                vp vpVar5 = (vp) this.f17594c;
                TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel = (TLRPC.TL_channels_inviteToChannel) this.d;
                long j15 = this.f17593b;
                if (tL_error != null) {
                    i0.g3(new mg(vpVar5, tL_error, tL_channels_inviteToChannel, 1));
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_invitedUsers) {
                    TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) tLObject;
                    vpVar5.L3(tL_messages_invitedUsers.updates, false);
                    i0.g3(new d4(vpVar5, tL_messages_invitedUsers, j15, 4));
                    return;
                } else {
                    return;
                }
            case 7:
                vp vpVar6 = (vp) this.f17594c;
                ph.h1 h1Var = (ph.h1) this.d;
                long j16 = this.f17593b;
                if (tLObject instanceof TLRPC.TL_exportedContactToken) {
                    vpVar6.Y7 = (TLRPC.TL_exportedContactToken) tLObject;
                    i0.h3(new oi(22, vpVar6, h1Var), Math.max(0L, 0 - (System.currentTimeMillis() - j16)));
                    return;
                }
                vpVar6.X7 = false;
                return;
            case 8:
                vp vpVar7 = (vp) this.f17594c;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.d;
                long j17 = this.f17593b;
                TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                if (messages_messages2 != null) {
                    int i16 = messages_messages2.count;
                    if (i16 == 0) {
                        i16 = messages_messages2.messages.size();
                    }
                    int i17 = i16;
                    hs messagesStorage = vpVar7.getMessagesStorage();
                    messagesStorage.f15938a.c(new ir(messagesStorage, 0L, -inputPeer.channel_id, i17, 7));
                }
                if (j17 != 0) {
                    vpVar7.getMessagesStorage().q1(j17);
                    return;
                }
                return;
            case 9:
                vp vpVar8 = (vp) this.f17594c;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
                long j18 = this.f17593b;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages3 = (TLRPC.messages_Messages) tLObject;
                    vpVar8.b4(messages_messages3.messages, dialog.f19797id);
                    if (!messages_messages3.messages.isEmpty()) {
                        if (v2.f18448a) {
                            f8.b("checkLastDialogMessage for " + dialog.f19797id + " has message");
                        }
                        TLRPC.TL_messages_dialogs tL_messages_dialogs2 = new TLRPC.TL_messages_dialogs();
                        TLRPC.Message message = messages_messages3.messages.get(0);
                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                        tL_dialog.flags = dialog.flags;
                        tL_dialog.top_message = message.f19814id;
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
                        long j19 = dialog.f19797id;
                        tL_dialog.f19797id = j19;
                        message.dialog_id = j19;
                        tL_messages_dialogs2.users.addAll(messages_messages3.users);
                        tL_messages_dialogs2.chats.addAll(messages_messages3.chats);
                        tL_messages_dialogs2.dialogs.add(tL_dialog);
                        tL_messages_dialogs2.messages.addAll(messages_messages3.messages);
                        tL_messages_dialogs2.count = 1;
                        Utilities.d.c(new wf((Object) vpVar8, (Object) tL_messages_dialogs2, false, 1));
                        vpVar8.getMessagesStorage().j1(messages_messages3.messages, true, true, false, vpVar8.getDownloadController().l(), true, 0, 0L);
                    } else {
                        i0.g3(new wn(vpVar8, dialog, 0));
                    }
                }
                if (j18 != 0) {
                    vpVar8.getMessagesStorage().q1(j18);
                }
                i0.g3(new wn(vpVar8, dialog, 1));
                return;
            case 10:
                i0.g3(new ym((t10) this.f17594c, (n10) this.d, tLObject, tL_error, this.f17593b, 6));
                return;
            default:
                i0.g3(new ym((t10) this.f17594c, (o10) this.d, tLObject, tL_error, this.f17593b, 5));
                return;
        }
    }

    public qj(f1 f1Var, Object obj, long j10, int i10) {
        this.f17592a = i10;
        this.f17594c = f1Var;
        this.d = obj;
        this.f17593b = j10;
    }
}
