package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class ok implements RequestDelegate {
    public final int f24346a;
    public final qp f24347b;
    public final int f24348c;
    public final long d;
    public final long f24349e;

    public ok(int i7, long j3, long j10, qp qpVar) {
        this.f24346a = 0;
        this.f24347b = qpVar;
        this.d = j3;
        this.f24348c = i7;
        this.f24349e = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Chat chat;
        switch (this.f24346a) {
            case 0:
                qp qpVar = this.f24347b;
                long j3 = this.d;
                long j10 = this.f24349e;
                if (tLObject != null) {
                    TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) tLObject;
                    a0.h hVar = new a0.h();
                    int i7 = 0;
                    for (int i10 = 0; i10 < updates_channeldifference.users.size(); i10++) {
                        TLRPC.User user = updates_channeldifference.users.get(i10);
                        hVar.k(user, user.f27105id);
                    }
                    int i11 = 0;
                    while (true) {
                        if (i11 < updates_channeldifference.chats.size()) {
                            chat = updates_channeldifference.chats.get(i11);
                            if (chat.f26956id != j3) {
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
                    qpVar.getMessagesStorage().m1(updates_channeldifference.users, updates_channeldifference.chats, true, true);
                    g0.h3(new hi(16, qpVar, updates_channeldifference));
                    qpVar.getMessagesStorage().f26719a.c(new qk(qpVar, arrayList, j3, updates_channeldifference, chat2, hVar, this.f24348c, j10));
                    return;
                } else if (tL_error != null) {
                    g0.h3(new zl(qpVar, tL_error, j3, 0));
                    qpVar.Z0.e(j3);
                    if (j10 != 0) {
                        qpVar.getMessagesStorage().q1(j10);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 1:
                g0.h3(new vk(this.f24347b, this.f24348c, this.d, this.f24349e, 0));
                return;
            default:
                g0.h3(new vk(this.f24347b, this.f24348c, this.d, this.f24349e, 2));
                return;
        }
    }

    public ok(qp qpVar, int i7, long j3, long j10, int i10) {
        this.f24346a = i10;
        this.f24347b = qpVar;
        this.f24348c = i7;
        this.d = j3;
        this.f24349e = j10;
    }
}
