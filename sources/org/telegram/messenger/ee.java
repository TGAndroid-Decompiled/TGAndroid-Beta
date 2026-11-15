package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.bp0;
import org.telegram.ui.Components.ys0;
public final class ee implements RequestDelegate {
    public final int f23295a;
    public final int f23296b;
    public final int f23297c;
    public final is d;

    public ee(is isVar, int i7, int i10, int i11) {
        this.f23295a = i11;
        this.d = isVar;
        this.f23296b = i7;
        this.f23297c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f23295a;
        is isVar = this.d;
        switch (i7) {
            case 0:
                String[] strArr = MediaController.W1;
                g0.h3(new jg.o1(this.f23296b, this.f23297c, 7, (MediaController) isVar, tLObject, tL_error));
                return;
            case 1:
                np npVar = (np) isVar;
                LongSparseIntArray longSparseIntArray = npVar.Z0;
                int i10 = 0;
                if (tL_error == null) {
                    TLRPC.updates_Difference updates_difference = (TLRPC.updates_Difference) tLObject;
                    if (updates_difference instanceof TLRPC.TL_updates_differenceTooLong) {
                        g0.h3(new l2.x(npVar, updates_difference, this.f23296b, this.f23297c, 4));
                        return;
                    }
                    if (updates_difference instanceof TLRPC.TL_updates_differenceSlice) {
                        TLRPC.TL_updates_state tL_updates_state = updates_difference.intermediate_state;
                        npVar.Y0(tL_updates_state.pts, tL_updates_state.date, tL_updates_state.qts, true);
                    }
                    a0.h hVar = new a0.h();
                    a0.h hVar2 = new a0.h();
                    for (int i11 = 0; i11 < updates_difference.users.size(); i11++) {
                        TLRPC.User user = updates_difference.users.get(i11);
                        hVar.k(user, user.f28200id);
                    }
                    for (int i12 = 0; i12 < updates_difference.chats.size(); i12++) {
                        TLRPC.Chat chat = updates_difference.chats.get(i12);
                        hVar2.k(chat, chat.f28051id);
                    }
                    ArrayList arrayList = new ArrayList();
                    if (!updates_difference.other_updates.isEmpty()) {
                        while (i10 < updates_difference.other_updates.size()) {
                            TLRPC.Update update = updates_difference.other_updates.get(i10);
                            if (update instanceof TL_update.TL_updateMessageID) {
                                arrayList.add((TL_update.TL_updateMessageID) update);
                                updates_difference.other_updates.remove(i10);
                            } else {
                                if (np.Y1(update) == 2) {
                                    long V1 = np.V1(update);
                                    int i13 = longSparseIntArray.get(V1);
                                    if (i13 == 0 && (i13 = npVar.getMessagesStorage().N(V1)) != 0) {
                                        longSparseIntArray.put(V1, i13);
                                    }
                                    if (i13 != 0 && np.W1(update) <= i13) {
                                        updates_difference.other_updates.remove(i10);
                                    }
                                }
                                i10++;
                            }
                            i10--;
                            i10++;
                        }
                    }
                    g0.h3(new fi(26, npVar, updates_difference));
                    npVar.getMessagesStorage().f27219a.c(new jn(npVar, updates_difference, arrayList, hVar, hVar2, 10));
                    return;
                }
                npVar.f25287g2 = false;
                npVar.getConnectionsManager().setIsUpdating(false);
                a8.b("received: isUpdating = false");
                return;
            default:
                g0.h3(new bp0((ys0) isVar, tL_error, this.f23296b, this.f23297c, tLObject, 0));
                return;
        }
    }
}
