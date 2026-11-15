package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class mk implements RequestDelegate {
    public final int f25054a;
    public final np f25055b;
    public final int f25056c;
    public final long d;
    public final long f25057e;

    public mk(int i7, long j3, long j10, np npVar) {
        this.f25054a = 0;
        this.f25055b = npVar;
        this.d = j3;
        this.f25056c = i7;
        this.f25057e = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Chat chat;
        switch (this.f25054a) {
            case 0:
                np npVar = this.f25055b;
                long j3 = this.d;
                long j10 = this.f25057e;
                if (tLObject != null) {
                    TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) tLObject;
                    a0.h hVar = new a0.h();
                    int i7 = 0;
                    for (int i10 = 0; i10 < updates_channeldifference.users.size(); i10++) {
                        TLRPC.User user = updates_channeldifference.users.get(i10);
                        hVar.k(user, user.f28200id);
                    }
                    int i11 = 0;
                    while (true) {
                        if (i11 < updates_channeldifference.chats.size()) {
                            chat = updates_channeldifference.chats.get(i11);
                            if (chat.f28051id != j3) {
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
                    g0.h3(new fi(16, npVar, updates_channeldifference));
                    npVar.getMessagesStorage().f27219a.c(new ok(npVar, arrayList, j3, updates_channeldifference, chat2, hVar, this.f25056c, j10));
                    return;
                } else if (tL_error != null) {
                    g0.h3(new wl(npVar, tL_error, j3, 0));
                    npVar.f25229a1.e(j3);
                    if (j10 != 0) {
                        npVar.getMessagesStorage().q1(j10);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 1:
                g0.h3(new tk(this.f25055b, this.f25056c, this.d, this.f25057e, 0));
                return;
            default:
                g0.h3(new tk(this.f25055b, this.f25056c, this.d, this.f25057e, 2));
                return;
        }
    }

    public mk(np npVar, int i7, long j3, long j10, int i10) {
        this.f25054a = i10;
        this.f25055b = npVar;
        this.f25056c = i7;
        this.d = j3;
        this.f25057e = j10;
    }
}
