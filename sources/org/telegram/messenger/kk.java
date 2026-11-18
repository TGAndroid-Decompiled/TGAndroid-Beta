package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class kk implements RequestDelegate {
    public final int f25042a;
    public final mp f25043b;
    public final int f25044c;
    public final long d;
    public final long f25045e;

    public kk(int i7, long j3, long j10, mp mpVar) {
        this.f25042a = 0;
        this.f25043b = mpVar;
        this.d = j3;
        this.f25044c = i7;
        this.f25045e = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Chat chat;
        switch (this.f25042a) {
            case 0:
                mp mpVar = this.f25043b;
                long j3 = this.d;
                long j10 = this.f25045e;
                if (tLObject != null) {
                    TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) tLObject;
                    a0.h hVar = new a0.h();
                    int i7 = 0;
                    for (int i10 = 0; i10 < updates_channeldifference.users.size(); i10++) {
                        TLRPC.User user = updates_channeldifference.users.get(i10);
                        hVar.k(user, user.f28552id);
                    }
                    int i11 = 0;
                    while (true) {
                        if (i11 < updates_channeldifference.chats.size()) {
                            chat = updates_channeldifference.chats.get(i11);
                            if (chat.f28403id != j3) {
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
                    mpVar.getMessagesStorage().m1(updates_channeldifference.users, updates_channeldifference.chats, true, true);
                    g0.g3(new fi(15, mpVar, updates_channeldifference));
                    mpVar.getMessagesStorage().f27052a.c(new mk(mpVar, arrayList, j3, updates_channeldifference, chat2, hVar, this.f25044c, j10));
                    return;
                } else if (tL_error != null) {
                    g0.g3(new rl(mpVar, tL_error, j3, 0));
                    mpVar.f25595a1.e(j3);
                    if (j10 != 0) {
                        mpVar.getMessagesStorage().q1(j10);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 1:
                g0.g3(new uj(this.f25043b, this.f25044c, this.d, this.f25045e, 0));
                return;
            default:
                g0.g3(new uj(this.f25043b, this.f25044c, this.d, this.f25045e, 1));
                return;
        }
    }

    public kk(mp mpVar, int i7, long j3, long j10, int i10) {
        this.f25042a = i10;
        this.f25043b = mpVar;
        this.f25044c = i7;
        this.d = j3;
        this.f25045e = j10;
    }
}
