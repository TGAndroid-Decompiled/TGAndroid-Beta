package defpackage;

import android.util.LongSparseArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class n07 extends pg0 {
    public static final n07[] b = new n07[4];
    public final LongSparseArray a;

    public n07(int i) {
        super(i);
        this.a = new LongSparseArray();
    }

    public static n07 a(int i) {
        n07 n07Var;
        n07[] n07VarArr = b;
        n07 n07Var2 = n07VarArr[i];
        if (n07Var2 == null) {
            synchronized (n07.class) {
                n07Var = n07VarArr[i];
                if (n07Var == null) {
                    n07Var = new n07(i);
                    n07VarArr[i] = n07Var;
                }
            }
            return n07Var;
        }
        return n07Var2;
    }

    public final void b(TL_update.TL_updatePendingJoinRequests tL_updatePendingJoinRequests) {
        long j = -k47.B1(tL_updatePendingJoinRequests.peer);
        this.a.put(j, null);
        TLRPC.ChatFull M0 = getMessagesController().M0(j);
        if (M0 != null) {
            M0.requests_pending = tL_updatePendingJoinRequests.requests_pending;
            M0.recent_requesters = tL_updatePendingJoinRequests.recent_requesters;
            M0.flags |= 131072;
            getMessagesStorage().K1(M0, false);
            nm7 notificationCenter = getNotificationCenter();
            Boolean bool = Boolean.FALSE;
            notificationCenter.k(nm7.T, M0, 0, bool, bool);
        }
    }
}
