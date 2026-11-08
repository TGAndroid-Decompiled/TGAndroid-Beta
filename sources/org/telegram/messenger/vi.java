package org.telegram.messenger;

import android.text.TextUtils;
import android.util.LongSparseArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class vi extends c1 {
    public static final vi[] f25990b = new vi[4];
    public final LongSparseArray f25991a;

    public vi(int i7) {
        super(i7);
        this.f25991a = new LongSparseArray();
    }

    public static vi b(int i7) {
        vi viVar;
        vi[] viVarArr = f25990b;
        vi viVar2 = viVarArr[i7];
        if (viVar2 == null) {
            synchronized (vi.class) {
                try {
                    viVar = viVarArr[i7];
                    if (viVar == null) {
                        viVar = new vi(i7);
                        viVarArr[i7] = viVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return viVar;
        }
        return viVar2;
    }

    public final int a(long j3, String str, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, LongSparseArray longSparseArray, bi.t4 t4Var) {
        boolean isEmpty = TextUtils.isEmpty(str);
        TLRPC.TL_messages_getChatInviteImporters tL_messages_getChatInviteImporters = new TLRPC.TL_messages_getChatInviteImporters();
        tL_messages_getChatInviteImporters.peer = qp.s1(this.currentAccount).j1(-j3);
        tL_messages_getChatInviteImporters.requested = true;
        tL_messages_getChatInviteImporters.limit = 30;
        if (!isEmpty) {
            tL_messages_getChatInviteImporters.f27045q = str;
            tL_messages_getChatInviteImporters.flags |= 4;
        }
        if (tL_chatInviteImporter == null) {
            tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
        } else {
            tL_messages_getChatInviteImporters.offset_user = getMessagesController().q1((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id));
            tL_messages_getChatInviteImporters.offset_date = tL_chatInviteImporter.date;
        }
        return getConnectionsManager().sendRequest(tL_messages_getChatInviteImporters, new y3(this, tL_chatInviteImporter, isEmpty, j3, t4Var, 1));
    }

    public final void c(TL_update.TL_updatePendingJoinRequests tL_updatePendingJoinRequests) {
        long j3 = -ij.C1(tL_updatePendingJoinRequests.peer);
        this.f25991a.put(j3, null);
        TLRPC.ChatFull N0 = getMessagesController().N0(j3);
        if (N0 != null) {
            N0.requests_pending = tL_updatePendingJoinRequests.requests_pending;
            N0.recent_requesters = tL_updatePendingJoinRequests.recent_requesters;
            N0.flags |= 131072;
            getMessagesStorage().N1(N0, false);
            qs notificationCenter = getNotificationCenter();
            Boolean bool = Boolean.FALSE;
            notificationCenter.k(qs.T, N0, 0, bool, bool);
        }
    }
}
