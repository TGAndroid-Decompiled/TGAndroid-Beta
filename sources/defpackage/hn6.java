package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class hn6 implements RequestDelegate {
    public final byte a;
    public final int b;
    public final int c;
    public final jm7 d;

    public hn6(jm7 jm7Var, int i, int i2, byte b) {
        this.a = b;
        this.d = jm7Var;
        this.b = i;
        this.c = i2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        jm7 jm7Var = this.d;
        switch (b) {
            case 0:
                String[] strArr = MediaController.W1;
                gm.c3(new g01((MediaController) jm7Var, this.b, tL_error, tLObject, this.c));
                return;
            case 1:
                oc7 oc7Var = (oc7) jm7Var;
                LongSparseIntArray longSparseIntArray = oc7Var.P0;
                int i = 0;
                if (tL_error == null) {
                    TLRPC.updates_Difference updates_difference = (TLRPC.updates_Difference) tLObject;
                    if (updates_difference instanceof TLRPC.TL_updates_differenceTooLong) {
                        gm.c3(new zq1(oc7Var, updates_difference, this.b, this.c, (byte) 7));
                        return;
                    }
                    if (updates_difference instanceof TLRPC.TL_updates_differenceSlice) {
                        TLRPC.TL_updates_state tL_updates_state = updates_difference.intermediate_state;
                        oc7Var.X0(tL_updates_state.pts, tL_updates_state.date, tL_updates_state.qts, true);
                    }
                    vh6 vh6Var = new vh6();
                    vh6 vh6Var2 = new vh6();
                    for (int i2 = 0; i2 < updates_difference.users.size(); i2++) {
                        TLRPC.User user = updates_difference.users.get(i2);
                        vh6Var.k(user, user.id);
                    }
                    for (int i3 = 0; i3 < updates_difference.chats.size(); i3++) {
                        TLRPC.Chat chat = updates_difference.chats.get(i3);
                        vh6Var2.k(chat, chat.id);
                    }
                    ArrayList arrayList = new ArrayList();
                    if (!updates_difference.other_updates.isEmpty()) {
                        while (i < updates_difference.other_updates.size()) {
                            TLRPC.Update update = updates_difference.other_updates.get(i);
                            if (update instanceof TL_update.TL_updateMessageID) {
                                arrayList.add((TL_update.TL_updateMessageID) update);
                                updates_difference.other_updates.remove(i);
                            } else {
                                if (oc7.U1(update) == 2) {
                                    long R1 = oc7.R1(update);
                                    int i4 = longSparseIntArray.get(R1);
                                    if (i4 == 0 && (i4 = oc7Var.getMessagesStorage().M(R1)) != 0) {
                                        longSparseIntArray.put(R1, i4);
                                    }
                                    if (i4 != 0 && oc7.S1(update) <= i4) {
                                        updates_difference.other_updates.remove(i);
                                    }
                                }
                                i++;
                            }
                            i--;
                            i++;
                        }
                    }
                    gm.c3(new lj6(oc7Var, updates_difference, (byte) 23));
                    oc7Var.getMessagesStorage().a.c(new v15(oc7Var, updates_difference, arrayList, vh6Var, vh6Var2, (byte) 21));
                    return;
                }
                oc7Var.Y1 = false;
                oc7Var.getConnectionsManager().setIsUpdating(false);
                fc4.b("received: isUpdating = false");
                return;
            default:
                gm.c3(new uda((nha) jm7Var, tL_error, this.b, this.c, tLObject, (byte) 0));
                return;
        }
    }
}
