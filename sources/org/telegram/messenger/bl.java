package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bl implements RequestDelegate {
    public final int f22730a = 0;
    public final np f22731b;
    public final boolean f22732c;
    public final long d;
    public final TLObject f22733e;

    public bl(np npVar, TLRPC.Chat chat, boolean z10, long j3) {
        this.f22731b = npVar;
        this.f22733e = chat;
        this.f22732c = z10;
        this.d = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        long j3;
        ArrayList arrayList;
        switch (this.f22730a) {
            case 0:
                TLRPC.Chat chat = (TLRPC.Chat) this.f22733e;
                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) tLObject;
                if (tL_channels_channelParticipant != null) {
                    TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipant.participant;
                    if (channelParticipant instanceof TLRPC.TL_channelParticipantSelf) {
                        TLRPC.TL_channelParticipantSelf tL_channelParticipantSelf = (TLRPC.TL_channelParticipantSelf) channelParticipant;
                        boolean z10 = chat.megagroup;
                        np npVar = this.f22731b;
                        if (z10) {
                            vr messagesStorage = npVar.getMessagesStorage();
                            long j10 = chat.f28051id;
                            messagesStorage.getClass();
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            boolean[] zArr = new boolean[1];
                            messagesStorage.f27219a.c(new bq(messagesStorage, j10, zArr, countDownLatch, 0));
                            try {
                                countDownLatch.await();
                            } catch (Exception e10) {
                                messagesStorage.o(e10, true);
                            }
                            if (zArr[0]) {
                                return;
                            }
                        }
                        g0.h3(new fi(12, npVar, tL_channels_channelParticipant));
                        npVar.getMessagesStorage().m1(tL_channels_channelParticipant.users, tL_channels_channelParticipant.chats, true, true);
                        boolean z11 = this.f22732c;
                        long j11 = this.d;
                        if (z11 && Math.abs(npVar.getConnectionsManager().getCurrentTime() - tL_channels_channelParticipant.participant.date) < 86400) {
                            vr messagesStorage2 = npVar.getMessagesStorage();
                            messagesStorage2.getClass();
                            j3 = j11;
                            CountDownLatch countDownLatch2 = new CountDownLatch(1);
                            boolean[] zArr2 = new boolean[1];
                            messagesStorage2.f27219a.c(new bq(messagesStorage2, j3, zArr2, countDownLatch2, 1));
                            try {
                                countDownLatch2.await();
                            } catch (Exception e11) {
                                messagesStorage2.o(e11, true);
                            }
                            if (!zArr2[0]) {
                                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                                tL_messageService.flags = 256;
                                int j12 = npVar.getUserConfig().j();
                                tL_messageService.f28072id = j12;
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
                                if (tL_channelParticipantSelf.via_invite && tL_channelParticipantSelf.inviter_id == npVar.getUserConfig().e()) {
                                    tL_messageService.action = new TLRPC.TL_messageActionChatJoinedByRequest();
                                } else {
                                    tL_messageService.action = new TLRPC.TL_messageActionChatAddUser();
                                }
                                tL_messageService.action.users.add(Long.valueOf(npVar.getUserConfig().e()));
                                tL_messageService.dialog_id = -j3;
                                npVar.getUserConfig().v(false);
                                arrayList = new ArrayList();
                                ArrayList arrayList2 = new ArrayList();
                                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                for (int i7 = 0; i7 < tL_channels_channelParticipant.users.size(); i7++) {
                                    TLRPC.User user = tL_channels_channelParticipant.users.get(i7);
                                    concurrentHashMap.put(Long.valueOf(user.f28200id), user);
                                }
                                arrayList2.add(tL_messageService);
                                arrayList.add(new gj(npVar.currentAccount, (TLRPC.Message) tL_messageService, (AbstractMap) concurrentHashMap, (AbstractMap) null, true, false));
                                if (tL_messageService.from_id.user_id != npVar.getUserConfig().e()) {
                                    npVar.getMessagesStorage().f27219a.c(new oj(npVar, arrayList, 2));
                                }
                                npVar.getMessagesStorage().j1(arrayList2, true, true, false, 0, false, 0, 0L);
                                ArrayList arrayList3 = arrayList;
                                vr messagesStorage3 = npVar.getMessagesStorage();
                                long j13 = j3;
                                messagesStorage3.f27219a.c(new pp(2, tL_channels_channelParticipant.participant.inviter_id, j13, messagesStorage3));
                                g0.h3(new gm(npVar, j13, arrayList3, tL_channels_channelParticipant, 5));
                                return;
                            }
                        } else {
                            j3 = j11;
                        }
                        arrayList = null;
                        ArrayList arrayList32 = arrayList;
                        vr messagesStorage32 = npVar.getMessagesStorage();
                        long j132 = j3;
                        messagesStorage32.f27219a.c(new pp(2, tL_channels_channelParticipant.participant.inviter_id, j132, messagesStorage32));
                        g0.h3(new gm(npVar, j132, arrayList32, tL_channels_channelParticipant, 5));
                        return;
                    }
                    return;
                }
                return;
            default:
                TLRPC.User user2 = (TLRPC.User) this.f22733e;
                if (tL_error == null) {
                    boolean z12 = tLObject instanceof TLRPC.Updates;
                    np npVar2 = this.f22731b;
                    if (z12) {
                        npVar2.O3((TLRPC.Updates) tLObject, false);
                    }
                    if (this.f22732c && !q10.B(user2)) {
                        g0.i3(new kk(npVar2, this.d, 10), 1000L);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public bl(np npVar, boolean z10, TLRPC.User user, long j3) {
        this.f22731b = npVar;
        this.f22732c = z10;
        this.f22733e = user;
        this.d = j3;
    }
}
