package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.aq0;
import org.telegram.ui.Components.au0;
public final class ee implements RequestDelegate {
    public final int f15553a;
    public final int f15554b;
    public final int f15555c;
    public final vs d;

    public ee(vs vsVar, int i10, int i11, int i12) {
        this.f15553a = i12;
        this.d = vsVar;
        this.f15554b = i10;
        this.f15555c = i11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f15553a;
        vs vsVar = this.d;
        switch (i10) {
            case 0:
                String[] strArr = MediaController.U1;
                i0.g3(new bi.u0(this.f15554b, this.f15555c, 5, (MediaController) vsVar, tLObject, tL_error));
                return;
            case 1:
                wp wpVar = (wp) vsVar;
                LongSparseIntArray longSparseIntArray = wpVar.Y0;
                int i11 = 0;
                if (tL_error == null) {
                    TLRPC.updates_Difference updates_difference = (TLRPC.updates_Difference) tLObject;
                    if (updates_difference instanceof TLRPC.TL_updates_differenceTooLong) {
                        i0.g3(new i2.a0(wpVar, updates_difference, this.f15554b, this.f15555c, 4));
                        return;
                    }
                    if (updates_difference instanceof TLRPC.TL_updates_differenceSlice) {
                        TLRPC.TL_updates_state tL_updates_state = updates_difference.intermediate_state;
                        wpVar.X0(tL_updates_state.pts, tL_updates_state.date, tL_updates_state.qts, true);
                    }
                    a0.h hVar = new a0.h();
                    a0.h hVar2 = new a0.h();
                    for (int i12 = 0; i12 < updates_difference.users.size(); i12++) {
                        TLRPC.User user = updates_difference.users.get(i12);
                        hVar.k(user, user.f19943id);
                    }
                    for (int i13 = 0; i13 < updates_difference.chats.size(); i13++) {
                        TLRPC.Chat chat = updates_difference.chats.get(i13);
                        hVar2.k(chat, chat.f19794id);
                    }
                    ArrayList arrayList = new ArrayList();
                    if (!updates_difference.other_updates.isEmpty()) {
                        while (i11 < updates_difference.other_updates.size()) {
                            TLRPC.Update update = updates_difference.other_updates.get(i11);
                            if (update instanceof TL_update.TL_updateMessageID) {
                                arrayList.add((TL_update.TL_updateMessageID) update);
                                updates_difference.other_updates.remove(i11);
                            } else {
                                if (wp.X1(update) == 2) {
                                    long U1 = wp.U1(update);
                                    int i14 = longSparseIntArray.get(U1);
                                    if (i14 == 0 && (i14 = wpVar.getMessagesStorage().N(U1)) != 0) {
                                        longSparseIntArray.put(U1, i14);
                                    }
                                    if (i14 != 0 && wp.V1(update) <= i14) {
                                        updates_difference.other_updates.remove(i11);
                                    }
                                }
                                i11++;
                            }
                            i11--;
                            i11++;
                        }
                    }
                    i0.g3(new pi(9, wpVar, updates_difference));
                    wpVar.getMessagesStorage().f16331a.c(new dn(wpVar, updates_difference, arrayList, hVar, hVar2, 7));
                    return;
                }
                wpVar.f19125f2 = false;
                wpVar.getConnectionsManager().setIsUpdating(false);
                f8.b("received: isUpdating = false");
                return;
            default:
                i0.g3(new aq0((au0) vsVar, tL_error, this.f15554b, this.f15555c, tLObject, 0));
                return;
        }
    }
}
