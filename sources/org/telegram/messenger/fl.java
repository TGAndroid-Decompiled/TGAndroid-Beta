package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fl implements RequestDelegate {
    public final int f22414a = 0;
    public final qp f22415b;
    public final boolean f22416c;
    public final long d;
    public final TLObject f22417e;

    public fl(qp qpVar, TLRPC.Chat chat, boolean z9, long j3) {
        this.f22415b = qpVar;
        this.f22417e = chat;
        this.f22416c = z9;
        this.d = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        long j3;
        ArrayList arrayList;
        switch (this.f22414a) {
            case 0:
                TLRPC.Chat chat = (TLRPC.Chat) this.f22417e;
                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) tLObject;
                if (tL_channels_channelParticipant != null) {
                    TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipant.participant;
                    if (channelParticipant instanceof TLRPC.TL_channelParticipantSelf) {
                        TLRPC.TL_channelParticipantSelf tL_channelParticipantSelf = (TLRPC.TL_channelParticipantSelf) channelParticipant;
                        boolean z9 = chat.megagroup;
                        qp qpVar = this.f22415b;
                        if (z9) {
                            yr messagesStorage = qpVar.getMessagesStorage();
                            long j10 = chat.f26953id;
                            messagesStorage.getClass();
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            boolean[] zArr = new boolean[1];
                            messagesStorage.f26696a.c(new fq(messagesStorage, j10, zArr, countDownLatch, 0));
                            try {
                                countDownLatch.await();
                            } catch (Exception e10) {
                                messagesStorage.o(e10, true);
                            }
                            if (zArr[0]) {
                                return;
                            }
                        }
                        g0.h3(new hi(12, qpVar, tL_channels_channelParticipant));
                        qpVar.getMessagesStorage().m1(tL_channels_channelParticipant.users, tL_channels_channelParticipant.chats, true, true);
                        boolean z10 = this.f22416c;
                        long j11 = this.d;
                        if (z10 && Math.abs(qpVar.getConnectionsManager().getCurrentTime() - tL_channels_channelParticipant.participant.date) < 86400) {
                            yr messagesStorage2 = qpVar.getMessagesStorage();
                            messagesStorage2.getClass();
                            j3 = j11;
                            CountDownLatch countDownLatch2 = new CountDownLatch(1);
                            boolean[] zArr2 = new boolean[1];
                            messagesStorage2.f26696a.c(new fq(messagesStorage2, j3, zArr2, countDownLatch2, 1));
                            try {
                                countDownLatch2.await();
                            } catch (Exception e11) {
                                messagesStorage2.o(e11, true);
                            }
                            if (!zArr2[0]) {
                                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                                tL_messageService.flags = 256;
                                int j12 = qpVar.getUserConfig().j();
                                tL_messageService.f26974id = j12;
                                tL_messageService.local_id = j12;
                                tL_messageService.date = tL_channels_channelParticipant.participant.date;
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_messageService.from_id = tL_peerUser;
                                tL_peerUser.user_id = tL_channels_channelParticipant.participant.inviter_id;
                                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                tL_messageService.peer_id = tL_peerChannel;
                                tL_peerChannel.channel_id = j3;
                                tL_messageService.media_unread = true;
                                tL_messageService.unread = true;
                                tL_messageService.post = true;
                                if (tL_channelParticipantSelf.via_invite && tL_channelParticipantSelf.inviter_id == qpVar.getUserConfig().e()) {
                                    tL_messageService.action = new TLRPC.TL_messageActionChatJoinedByRequest();
                                } else {
                                    tL_messageService.action = new TLRPC.TL_messageActionChatAddUser();
                                }
                                tL_messageService.action.users.add(Long.valueOf(qpVar.getUserConfig().e()));
                                tL_messageService.dialog_id = -j3;
                                qpVar.getUserConfig().v(false);
                                arrayList = new ArrayList();
                                ArrayList arrayList2 = new ArrayList();
                                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                for (int i7 = 0; i7 < tL_channels_channelParticipant.users.size(); i7++) {
                                    TLRPC.User user = tL_channels_channelParticipant.users.get(i7);
                                    concurrentHashMap.put(Long.valueOf(user.f27102id), user);
                                }
                                arrayList2.add(tL_messageService);
                                arrayList.add(new ij(qpVar.currentAccount, (TLRPC.Message) tL_messageService, (AbstractMap) concurrentHashMap, (AbstractMap) null, true, false));
                                if (tL_messageService.from_id.user_id != qpVar.getUserConfig().e()) {
                                    qpVar.getMessagesStorage().f26696a.c(new qj(qpVar, arrayList, 2));
                                }
                                qpVar.getMessagesStorage().j1(arrayList2, true, true, false, 0, false, 0, 0L);
                                ArrayList arrayList3 = arrayList;
                                yr messagesStorage3 = qpVar.getMessagesStorage();
                                long j13 = j3;
                                messagesStorage3.f26696a.c(new vp(2, tL_channels_channelParticipant.participant.inviter_id, j13, messagesStorage3));
                                g0.h3(new jm(qpVar, j13, arrayList3, tL_channels_channelParticipant, 5));
                                return;
                            }
                        } else {
                            j3 = j11;
                        }
                        arrayList = null;
                        ArrayList arrayList32 = arrayList;
                        yr messagesStorage32 = qpVar.getMessagesStorage();
                        long j132 = j3;
                        messagesStorage32.f26696a.c(new vp(2, tL_channels_channelParticipant.participant.inviter_id, j132, messagesStorage32));
                        g0.h3(new jm(qpVar, j132, arrayList32, tL_channels_channelParticipant, 5));
                        return;
                    }
                    return;
                }
                return;
            default:
                TLRPC.User user2 = (TLRPC.User) this.f22417e;
                if (tL_error == null) {
                    boolean z11 = tLObject instanceof TLRPC.Updates;
                    qp qpVar2 = this.f22415b;
                    if (z11) {
                        qpVar2.O3((TLRPC.Updates) tLObject, false);
                    }
                    if (this.f22416c && !t10.B(user2)) {
                        g0.i3(new nk(qpVar2, this.d, 10), 1000L);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public fl(qp qpVar, boolean z9, TLRPC.User user, long j3) {
        this.f22415b = qpVar;
        this.f22416c = z9;
        this.f22417e = user;
        this.d = j3;
    }
}
