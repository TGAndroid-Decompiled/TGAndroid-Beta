package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class j87 implements RequestDelegate {
    public final byte a;
    public final boolean b;
    public final long c;
    public final Object d;
    public final Object e;

    public j87(ew5 ew5Var, long j, boolean z, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.a = (byte) 2;
        this.d = ew5Var;
        this.c = j;
        this.b = z;
        this.e = tL_messages_importChatInvite;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ArrayList arrayList;
        TLRPC.MessageAction tL_messageActionChatAddUser;
        byte b = this.a;
        boolean z = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                oc7 oc7Var = (oc7) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) tLObject;
                if (tL_channels_channelParticipant != null) {
                    TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipant.participant;
                    if (channelParticipant instanceof TLRPC.TL_channelParticipantSelf) {
                        TLRPC.TL_channelParticipantSelf tL_channelParticipantSelf = (TLRPC.TL_channelParticipantSelf) channelParticipant;
                        if (chat.megagroup) {
                            cf7 messagesStorage = oc7Var.getMessagesStorage();
                            long j = chat.id;
                            messagesStorage.getClass();
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            boolean[] zArr = new boolean[1];
                            messagesStorage.a.c(new hd7(messagesStorage, j, zArr, countDownLatch, (byte) 0));
                            try {
                                countDownLatch.await();
                            } catch (Exception e) {
                                messagesStorage.n(e, true);
                            }
                            if (zArr[0]) {
                                return;
                            }
                        }
                        gm.c3(new q87(oc7Var, tL_channels_channelParticipant, (byte) 1));
                        oc7Var.getMessagesStorage().j1(tL_channels_channelParticipant.users, tL_channels_channelParticipant.chats, true, true);
                        long j2 = this.c;
                        if (z && Math.abs(oc7Var.getConnectionsManager().getCurrentTime() - tL_channels_channelParticipant.participant.date) < 86400) {
                            cf7 messagesStorage2 = oc7Var.getMessagesStorage();
                            messagesStorage2.getClass();
                            CountDownLatch countDownLatch2 = new CountDownLatch(1);
                            boolean[] zArr2 = new boolean[1];
                            messagesStorage2.a.c(new hd7(messagesStorage2, j2, zArr2, countDownLatch2, (byte) 1));
                            try {
                                countDownLatch2.await();
                            } catch (Exception e2) {
                                messagesStorage2.n(e2, true);
                            }
                            if (!zArr2[0]) {
                                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                                tL_messageService.flags = 256;
                                int i = oc7Var.getUserConfig().i();
                                tL_messageService.id = i;
                                tL_messageService.local_id = i;
                                tL_messageService.date = tL_channels_channelParticipant.participant.date;
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_messageService.from_id = tL_peerUser;
                                tL_peerUser.user_id = tL_channels_channelParticipant.participant.inviter_id;
                                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                tL_messageService.peer_id = tL_peerChannel;
                                tL_peerChannel.channel_id = j2;
                                tL_messageService.media_unread = true;
                                tL_messageService.unread = true;
                                tL_messageService.post = true;
                                if (tL_channelParticipantSelf.via_invite && tL_channelParticipantSelf.inviter_id == oc7Var.getUserConfig().e()) {
                                    tL_messageActionChatAddUser = new TLRPC.TL_messageActionChatJoinedByRequest();
                                    tL_messageService.action = tL_messageActionChatAddUser;
                                } else {
                                    tL_messageActionChatAddUser = new TLRPC.TL_messageActionChatAddUser();
                                    tL_messageService.action = tL_messageActionChatAddUser;
                                }
                                tL_messageActionChatAddUser.users.add(Long.valueOf(oc7Var.getUserConfig().e()));
                                tL_messageService.dialog_id = -j2;
                                oc7Var.getUserConfig().u(false);
                                arrayList = new ArrayList();
                                ArrayList arrayList2 = new ArrayList();
                                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                for (int i2 = 0; i2 < tL_channels_channelParticipant.users.size(); i2++) {
                                    TLRPC.User user = tL_channels_channelParticipant.users.get(i2);
                                    concurrentHashMap.put(Long.valueOf(user.id), user);
                                }
                                arrayList2.add(tL_messageService);
                                arrayList.add(new k47(oc7Var.currentAccount, (TLRPC.Message) tL_messageService, (AbstractMap) concurrentHashMap, (AbstractMap) null, true, false));
                                if (tL_messageService.from_id.user_id != oc7Var.getUserConfig().e()) {
                                    oc7Var.getMessagesStorage().a.c(new h77(oc7Var, arrayList, (byte) 1));
                                }
                                oc7Var.getMessagesStorage().g1(arrayList2, true, true, false, 0, false, 0, 0L);
                                ArrayList arrayList3 = arrayList;
                                cf7 messagesStorage3 = oc7Var.getMessagesStorage();
                                messagesStorage3.a.c(new tc7(messagesStorage3, tL_channels_channelParticipant.participant.inviter_id, j2, (byte) 2));
                                gm.c3(new p97(oc7Var, j2, arrayList3, tL_channels_channelParticipant, (byte) 16));
                                return;
                            }
                        }
                        arrayList = null;
                        ArrayList arrayList32 = arrayList;
                        cf7 messagesStorage32 = oc7Var.getMessagesStorage();
                        messagesStorage32.a.c(new tc7(messagesStorage32, tL_channels_channelParticipant.participant.inviter_id, j2, (byte) 2));
                        gm.c3(new p97(oc7Var, j2, arrayList32, tL_channels_channelParticipant, (byte) 16));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                au0 au0Var = (au0) obj2;
                au0Var.getClass();
                gm.c3(new ut0(au0Var, tL_error, tLObject, (TwoStepVerificationActivity) obj, this.b, this.c));
                return;
            case 2:
                ew5 ew5Var = (ew5) obj2;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) obj;
                if (tLObject instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    oc7.r1(ew5Var.a).T3(((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates, false);
                } else if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                    gm.c3(new zv5(ew5Var, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, this.c, (byte) 0));
                }
                gm.c3(new rh(ew5Var, tL_error, this.b, tL_messages_importChatInvite, (byte) 22));
                return;
            case 3:
                gm.c3(new ut0((a66) obj2, tLObject, this.c, (String) obj, this.b, tL_error));
                return;
            default:
                oc7 oc7Var2 = (oc7) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                if (tL_error == null) {
                    if (tLObject instanceof TLRPC.Updates) {
                        oc7Var2.T3((TLRPC.Updates) tLObject, false);
                    }
                    if (z && !m9c.D(user2)) {
                        gm.d3(new r77(oc7Var2, this.c, (byte) 11), 1000L);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public j87(byte b, long j, jm7 jm7Var, Object obj, boolean z) {
        this.a = b;
        this.d = jm7Var;
        this.e = obj;
        this.b = z;
        this.c = j;
    }

    public j87(a66 a66Var, long j, String str, boolean z) {
        this.a = (byte) 3;
        this.d = a66Var;
        this.c = j;
        this.e = str;
        this.b = z;
    }

    public j87(oc7 oc7Var, boolean z, TLRPC.User user, long j) {
        this.a = (byte) 4;
        this.d = oc7Var;
        this.b = z;
        this.e = user;
        this.c = j;
    }
}
