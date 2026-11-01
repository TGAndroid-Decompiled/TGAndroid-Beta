package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class il implements RequestDelegate {
    public final int f16304a = 0;
    public final wp f16305b;
    public final boolean f16306c;
    public final long d;
    public final TLObject e;

    public il(wp wpVar, TLRPC.Chat chat, boolean z10, long j10) {
        this.f16305b = wpVar;
        this.e = chat;
        this.f16306c = z10;
        this.d = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        long j10;
        ArrayList arrayList;
        switch (this.f16304a) {
            case 0:
                TLRPC.Chat chat = (TLRPC.Chat) this.e;
                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) tLObject;
                if (tL_channels_channelParticipant != null) {
                    TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipant.participant;
                    if (channelParticipant instanceof TLRPC.TL_channelParticipantSelf) {
                        TLRPC.TL_channelParticipantSelf tL_channelParticipantSelf = (TLRPC.TL_channelParticipantSelf) channelParticipant;
                        boolean z10 = chat.megagroup;
                        wp wpVar = this.f16305b;
                        if (z10) {
                            is messagesStorage = wpVar.getMessagesStorage();
                            long j11 = chat.f19794id;
                            messagesStorage.getClass();
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            boolean[] zArr = new boolean[1];
                            messagesStorage.f16331a.c(new mq(messagesStorage, j11, zArr, countDownLatch, 0));
                            try {
                                countDownLatch.await();
                            } catch (Exception e) {
                                messagesStorage.o(e, true);
                            }
                            if (zArr[0]) {
                                return;
                            }
                        }
                        i0.g3(new pi(13, wpVar, tL_channels_channelParticipant));
                        wpVar.getMessagesStorage().m1(tL_channels_channelParticipant.users, tL_channels_channelParticipant.chats, true, true);
                        boolean z11 = this.f16306c;
                        long j12 = this.d;
                        if (z11 && Math.abs(wpVar.getConnectionsManager().getCurrentTime() - tL_channels_channelParticipant.participant.date) < 86400) {
                            is messagesStorage2 = wpVar.getMessagesStorage();
                            messagesStorage2.getClass();
                            j10 = j12;
                            CountDownLatch countDownLatch2 = new CountDownLatch(1);
                            boolean[] zArr2 = new boolean[1];
                            messagesStorage2.f16331a.c(new mq(messagesStorage2, j10, zArr2, countDownLatch2, 1));
                            try {
                                countDownLatch2.await();
                            } catch (Exception e7) {
                                messagesStorage2.o(e7, true);
                            }
                            if (!zArr2[0]) {
                                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                                tL_messageService.flags = 256;
                                int j13 = wpVar.getUserConfig().j();
                                tL_messageService.f19815id = j13;
                                tL_messageService.local_id = j13;
                                tL_messageService.date = tL_channels_channelParticipant.participant.date;
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_messageService.from_id = tL_peerUser;
                                tL_peerUser.user_id = tL_channels_channelParticipant.participant.inviter_id;
                                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                tL_messageService.peer_id = tL_peerChannel;
                                tL_peerChannel.channel_id = j10;
                                tL_messageService.media_unread = true;
                                tL_messageService.unread = true;
                                tL_messageService.post = true;
                                if (tL_channelParticipantSelf.via_invite && tL_channelParticipantSelf.inviter_id == wpVar.getUserConfig().e()) {
                                    tL_messageService.action = new TLRPC.TL_messageActionChatJoinedByRequest();
                                } else {
                                    tL_messageService.action = new TLRPC.TL_messageActionChatAddUser();
                                }
                                tL_messageService.action.users.add(Long.valueOf(wpVar.getUserConfig().e()));
                                tL_messageService.dialog_id = -j10;
                                wpVar.getUserConfig().v(false);
                                arrayList = new ArrayList();
                                ArrayList arrayList2 = new ArrayList();
                                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                for (int i10 = 0; i10 < tL_channels_channelParticipant.users.size(); i10++) {
                                    TLRPC.User user = tL_channels_channelParticipant.users.get(i10);
                                    concurrentHashMap.put(Long.valueOf(user.f19943id), user);
                                }
                                arrayList2.add(tL_messageService);
                                arrayList.add(new kj(wpVar.currentAccount, (TLRPC.Message) tL_messageService, (AbstractMap) concurrentHashMap, (AbstractMap) null, true, false));
                                if (tL_messageService.from_id.user_id != wpVar.getUserConfig().e()) {
                                    wpVar.getMessagesStorage().f16331a.c(new hk(wpVar, arrayList, 2));
                                }
                                wpVar.getMessagesStorage().j1(arrayList2, true, true, false, 0, false, 0, 0L);
                                ArrayList arrayList3 = arrayList;
                                is messagesStorage3 = wpVar.getMessagesStorage();
                                long j14 = j10;
                                messagesStorage3.f16331a.c(new bq(2, tL_channels_channelParticipant.participant.inviter_id, j14, messagesStorage3));
                                i0.g3(new xm(wpVar, j14, arrayList3, tL_channels_channelParticipant, 6));
                                return;
                            }
                        } else {
                            j10 = j12;
                        }
                        arrayList = null;
                        ArrayList arrayList32 = arrayList;
                        is messagesStorage32 = wpVar.getMessagesStorage();
                        long j142 = j10;
                        messagesStorage32.f16331a.c(new bq(2, tL_channels_channelParticipant.participant.inviter_id, j142, messagesStorage32));
                        i0.g3(new xm(wpVar, j142, arrayList32, tL_channels_channelParticipant, 6));
                        return;
                    }
                    return;
                }
                return;
            default:
                TLRPC.User user2 = (TLRPC.User) this.e;
                if (tL_error == null) {
                    boolean z12 = tLObject instanceof TLRPC.Updates;
                    wp wpVar2 = this.f16305b;
                    if (z12) {
                        wpVar2.L3((TLRPC.Updates) tLObject, false);
                    }
                    if (this.f16306c && !i20.B(user2)) {
                        i0.h3(new xk(wpVar2, this.d, 10), 1000L);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public il(wp wpVar, boolean z10, TLRPC.User user, long j10) {
        this.f16305b = wpVar;
        this.f16306c = z10;
        this.e = user;
        this.d = j10;
    }
}
