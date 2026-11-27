package defpackage;

import android.util.LongSparseArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class u07 extends rf0 {
    public static final u07[] b = new u07[4];
    public final LongSparseArray a;

    public u07(int i) {
        super(i);
        this.a = new LongSparseArray();
    }

    public static u07 a(int i) {
        u07 u07Var;
        u07[] u07VarArr = b;
        u07 u07Var2 = u07VarArr[i];
        if (u07Var2 == null) {
            synchronized (u07.class) {
                u07Var = u07VarArr[i];
                if (u07Var == null) {
                    u07Var = new u07(i);
                    u07VarArr[i] = u07Var;
                }
            }
            return u07Var;
        }
        return u07Var2;
    }

    public final void b(TL_update.TL_updatePendingJoinRequests tL_updatePendingJoinRequests) {
        long j = -r47.B1(tL_updatePendingJoinRequests.peer);
        this.a.put(j, null);
        TLRPC.ChatFull N0 = getMessagesController().N0(j);
        if (N0 != null) {
            N0.requests_pending = tL_updatePendingJoinRequests.requests_pending;
            N0.recent_requesters = tL_updatePendingJoinRequests.recent_requesters;
            N0.flags |= 131072;
            getMessagesStorage().P1(N0, false);
            jn7 notificationCenter = getNotificationCenter();
            Boolean bool = Boolean.FALSE;
            notificationCenter.k(jn7.T, N0, 0, bool, bool);
        }
    }
}
