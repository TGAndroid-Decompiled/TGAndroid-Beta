package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class xk implements RequestDelegate {
    public final int f19260a;
    public final vp f19261b;
    public final int f19262c;
    public final long d;
    public final long e;

    public xk(int i10, long j10, long j11, vp vpVar) {
        this.f19260a = 0;
        this.f19261b = vpVar;
        this.d = j10;
        this.f19262c = i10;
        this.e = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Chat chat;
        switch (this.f19260a) {
            case 0:
                vp vpVar = this.f19261b;
                long j10 = this.d;
                long j11 = this.e;
                if (tLObject != null) {
                    TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) tLObject;
                    a0.h hVar = new a0.h();
                    int i10 = 0;
                    for (int i11 = 0; i11 < updates_channeldifference.users.size(); i11++) {
                        TLRPC.User user = updates_channeldifference.users.get(i11);
                        hVar.k(user, user.f19942id);
                    }
                    int i12 = 0;
                    while (true) {
                        if (i12 < updates_channeldifference.chats.size()) {
                            chat = updates_channeldifference.chats.get(i12);
                            if (chat.f19793id != j10) {
                                i12++;
                            }
                        } else {
                            chat = null;
                        }
                    }
                    TLRPC.Chat chat2 = chat;
                    ArrayList arrayList = new ArrayList();
                    if (!updates_channeldifference.other_updates.isEmpty()) {
                        while (i10 < updates_channeldifference.other_updates.size()) {
                            TLRPC.Update update = updates_channeldifference.other_updates.get(i10);
                            if (update instanceof TL_update.TL_updateMessageID) {
                                arrayList.add((TL_update.TL_updateMessageID) update);
                                updates_channeldifference.other_updates.remove(i10);
                                i10--;
                            }
                            i10++;
                        }
                    }
                    vpVar.getMessagesStorage().m1(updates_channeldifference.users, updates_channeldifference.chats, true, true);
                    i0.g3(new oi(11, vpVar, updates_channeldifference));
                    vpVar.getMessagesStorage().f15938a.c(new zk(vpVar, arrayList, j10, updates_channeldifference, chat2, hVar, this.f19262c, j11));
                    return;
                } else if (tL_error != null) {
                    i0.g3(new nl(vpVar, tL_error, j10, 0));
                    vpVar.Z0.e(j10);
                    if (j11 != 0) {
                        vpVar.getMessagesStorage().q1(j11);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 1:
                i0.g3(new fk(this.f19261b, this.f19262c, this.d, this.e, 2));
                return;
            default:
                i0.g3(new fk(this.f19261b, this.f19262c, this.d, this.e, 0));
                return;
        }
    }

    public xk(vp vpVar, int i10, long j10, long j11, int i11) {
        this.f19260a = i11;
        this.f19261b = vpVar;
        this.f19262c = i10;
        this.d = j10;
        this.e = j11;
    }
}
