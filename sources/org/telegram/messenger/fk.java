package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class fk implements RequestDelegate {
    public final int f22506a;
    public final hp f22507b;
    public final int f22508c;
    public final long d;
    public final long f22509e;

    public fk(int i3, long j10, long j11, hp hpVar) {
        this.f22506a = 0;
        this.f22507b = hpVar;
        this.d = j10;
        this.f22508c = i3;
        this.f22509e = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Chat chat;
        switch (this.f22506a) {
            case 0:
                hp hpVar = this.f22507b;
                long j10 = this.d;
                long j11 = this.f22509e;
                if (tLObject != null) {
                    TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) tLObject;
                    a0.h hVar = new a0.h();
                    int i3 = 0;
                    for (int i10 = 0; i10 < updates_channeldifference.users.size(); i10++) {
                        TLRPC.User user = updates_channeldifference.users.get(i10);
                        hVar.k(user, user.f27150id);
                    }
                    int i11 = 0;
                    while (true) {
                        if (i11 < updates_channeldifference.chats.size()) {
                            chat = updates_channeldifference.chats.get(i11);
                            if (chat.f27001id != j10) {
                                i11++;
                            }
                        } else {
                            chat = null;
                        }
                    }
                    TLRPC.Chat chat2 = chat;
                    ArrayList arrayList = new ArrayList();
                    if (!updates_channeldifference.other_updates.isEmpty()) {
                        while (i3 < updates_channeldifference.other_updates.size()) {
                            TLRPC.Update update = updates_channeldifference.other_updates.get(i3);
                            if (update instanceof TL_update.TL_updateMessageID) {
                                arrayList.add((TL_update.TL_updateMessageID) update);
                                updates_channeldifference.other_updates.remove(i3);
                                i3--;
                            }
                            i3++;
                        }
                    }
                    hpVar.getMessagesStorage().m1(updates_channeldifference.users, updates_channeldifference.chats, true, true);
                    g0.h3(new yh(16, hpVar, updates_channeldifference));
                    hpVar.getMessagesStorage().f24934a.c(new hk(hpVar, arrayList, j10, updates_channeldifference, chat2, hVar, this.f22508c, j11));
                    return;
                } else if (tL_error != null) {
                    g0.h3(new pl(hpVar, tL_error, j10, 0));
                    hpVar.f22955a1.e(j10);
                    if (j11 != 0) {
                        hpVar.getMessagesStorage().q1(j11);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 1:
                g0.h3(new mk(this.f22507b, this.f22508c, this.d, this.f22509e, 0));
                return;
            default:
                g0.h3(new mk(this.f22507b, this.f22508c, this.d, this.f22509e, 2));
                return;
        }
    }

    public fk(hp hpVar, int i3, long j10, long j11, int i10) {
        this.f22506a = i10;
        this.f22507b = hpVar;
        this.f22508c = i3;
        this.d = j10;
        this.f22509e = j11;
    }
}
