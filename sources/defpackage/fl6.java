package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class fl6 implements RequestDelegate {
    public final byte a;
    public final int b;
    public final int c;
    public final gk7 d;

    public fl6(gk7 gk7Var, int i, int i2, byte b) {
        this.a = b;
        this.d = gk7Var;
        this.b = i;
        this.c = i2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        gk7 gk7Var = this.d;
        switch (b) {
            case 0:
                String[] strArr = MediaController.W1;
                gl.c3(new zy0((MediaController) gk7Var, this.b, tL_error, tLObject, this.c));
                return;
            case 1:
                na7 na7Var = (na7) gk7Var;
                LongSparseIntArray longSparseIntArray = na7Var.P0;
                int i = 0;
                if (tL_error == null) {
                    TLRPC.updates_Difference updates_difference = (TLRPC.updates_Difference) tLObject;
                    if (updates_difference instanceof TLRPC.TL_updates_differenceTooLong) {
                        gl.c3(new mp1(na7Var, updates_difference, this.b, this.c, (byte) 7));
                        return;
                    }
                    if (updates_difference instanceof TLRPC.TL_updates_differenceSlice) {
                        TLRPC.TL_updates_state tL_updates_state = updates_difference.intermediate_state;
                        na7Var.W0(tL_updates_state.pts, tL_updates_state.date, tL_updates_state.qts, true);
                    }
                    vf6 vf6Var = new vf6();
                    vf6 vf6Var2 = new vf6();
                    for (int i2 = 0; i2 < updates_difference.users.size(); i2++) {
                        TLRPC.User user = updates_difference.users.get(i2);
                        vf6Var.k(user, user.id);
                    }
                    for (int i3 = 0; i3 < updates_difference.chats.size(); i3++) {
                        TLRPC.Chat chat = updates_difference.chats.get(i3);
                        vf6Var2.k(chat, chat.id);
                    }
                    ArrayList arrayList = new ArrayList();
                    if (!updates_difference.other_updates.isEmpty()) {
                        while (i < updates_difference.other_updates.size()) {
                            TLRPC.Update update = updates_difference.other_updates.get(i);
                            if (update instanceof TL_update.TL_updateMessageID) {
                                arrayList.add((TL_update.TL_updateMessageID) update);
                                updates_difference.other_updates.remove(i);
                            } else {
                                if (na7.T1(update) == 2) {
                                    long Q1 = na7.Q1(update);
                                    int i4 = longSparseIntArray.get(Q1);
                                    if (i4 == 0 && (i4 = na7Var.getMessagesStorage().M(Q1)) != 0) {
                                        longSparseIntArray.put(Q1, i4);
                                    }
                                    if (i4 != 0 && na7.R1(update) <= i4) {
                                        updates_difference.other_updates.remove(i);
                                    }
                                }
                                i++;
                            }
                            i--;
                            i++;
                        }
                    }
                    gl.c3(new oh6(na7Var, updates_difference, (byte) 23));
                    na7Var.getMessagesStorage().a.c(new vz4(na7Var, updates_difference, arrayList, vf6Var, vf6Var2, (byte) 21));
                    return;
                }
                na7Var.Y1 = false;
                na7Var.getConnectionsManager().setIsUpdating(false);
                fa4.b("received: isUpdating = false");
                return;
            default:
                gl.c3(new tba((nfa) gk7Var, tL_error, this.b, this.c, tLObject, (byte) 0));
                return;
        }
    }
}
