package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class kk implements RequestDelegate {
    public final int f25070a;
    public final mp f25071b;
    public final int f25072c;
    public final long d;
    public final long f25073e;

    public kk(int i7, long j3, long j10, mp mpVar) {
        this.f25070a = 0;
        this.f25071b = mpVar;
        this.d = j3;
        this.f25072c = i7;
        this.f25073e = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Chat chat;
        switch (this.f25070a) {
            case 0:
                mp mpVar = this.f25071b;
                long j3 = this.d;
                long j10 = this.f25073e;
                if (tLObject != null) {
                    TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) tLObject;
                    a0.h hVar = new a0.h();
                    int i7 = 0;
                    for (int i10 = 0; i10 < updates_channeldifference.users.size(); i10++) {
                        TLRPC.User user = updates_channeldifference.users.get(i10);
                        hVar.k(user, user.f28580id);
                    }
                    int i11 = 0;
                    while (true) {
                        if (i11 < updates_channeldifference.chats.size()) {
                            chat = updates_channeldifference.chats.get(i11);
                            if (chat.f28431id != j3) {
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
                    mpVar.getMessagesStorage().f27080a.c(new mk(mpVar, arrayList, j3, updates_channeldifference, chat2, hVar, this.f25072c, j10));
                    return;
                } else if (tL_error != null) {
                    g0.g3(new rl(mpVar, tL_error, j3, 0));
                    mpVar.f25623a1.e(j3);
                    if (j10 != 0) {
                        mpVar.getMessagesStorage().q1(j10);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 1:
                g0.g3(new uj(this.f25071b, this.f25072c, this.d, this.f25073e, 0));
                return;
            default:
                g0.g3(new uj(this.f25071b, this.f25072c, this.d, this.f25073e, 1));
                return;
        }
    }

    public kk(mp mpVar, int i7, long j3, long j10, int i10) {
        this.f25070a = i10;
        this.f25071b = mpVar;
        this.f25072c = i7;
        this.d = j3;
        this.f25073e = j10;
    }
}
