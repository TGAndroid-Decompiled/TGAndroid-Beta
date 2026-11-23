package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class lk implements RequestDelegate {
    public final int f25200a;
    public final np f25201b;
    public final int f25202c;
    public final long d;
    public final long f25203e;

    public lk(int i7, long j3, long j10, np npVar) {
        this.f25200a = 0;
        this.f25201b = npVar;
        this.d = j3;
        this.f25202c = i7;
        this.f25203e = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Chat chat;
        switch (this.f25200a) {
            case 0:
                np npVar = this.f25201b;
                long j3 = this.d;
                long j10 = this.f25203e;
                if (tLObject != null) {
                    TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) tLObject;
                    a0.h hVar = new a0.h();
                    int i7 = 0;
                    for (int i10 = 0; i10 < updates_channeldifference.users.size(); i10++) {
                        TLRPC.User user = updates_channeldifference.users.get(i10);
                        hVar.k(user, user.f28547id);
                    }
                    int i11 = 0;
                    while (true) {
                        if (i11 < updates_channeldifference.chats.size()) {
                            chat = updates_channeldifference.chats.get(i11);
                            if (chat.f28398id != j3) {
                                i11++;
                            }
                        } else {
                            chat = null;
                        }
                    }
                    TLRPC.Chat chat2 = chat;
                    ArrayList arrayList = new ArrayList();
                    if (!updates_channeldifference.other_updates.isEmpty()) {
                        while (i7 < updates_channeldifference.other_updates.size()) {
                            TLRPC.Update update = updates_channeldifference.other_updates.get(i7);
                            if (update instanceof TL_update.TL_updateMessageID) {
                                arrayList.add((TL_update.TL_updateMessageID) update);
                                updates_channeldifference.other_updates.remove(i7);
                                i7--;
                            }
                            i7++;
                        }
                    }
                    npVar.getMessagesStorage().m1(updates_channeldifference.users, updates_channeldifference.chats, true, true);
                    g0.g3(new gi(15, npVar, updates_channeldifference));
                    npVar.getMessagesStorage().f27214a.c(new nk(npVar, arrayList, j3, updates_channeldifference, chat2, hVar, this.f25202c, j10));
                    return;
                } else if (tL_error != null) {
                    g0.g3(new sl(npVar, tL_error, j3, 0));
                    npVar.f25758a1.e(j3);
                    if (j10 != 0) {
                        npVar.getMessagesStorage().q1(j10);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 1:
                g0.g3(new vj(this.f25201b, this.f25202c, this.d, this.f25203e, 0));
                return;
            default:
                g0.g3(new vj(this.f25201b, this.f25202c, this.d, this.f25203e, 1));
                return;
        }
    }

    public lk(np npVar, int i7, long j3, long j10, int i10) {
        this.f25200a = i10;
        this.f25201b = npVar;
        this.f25202c = i7;
        this.d = j3;
        this.f25203e = j10;
    }
}
