package org.telegram.messenger;

import android.text.TextUtils;
import android.util.LongSparseArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class ti extends c1 {
    public static final ti[] f27041b = new ti[4];
    public final LongSparseArray f27042a;

    public ti(int i7) {
        super(i7);
        this.f27042a = new LongSparseArray();
    }

    public static ti b(int i7) {
        ti tiVar;
        ti[] tiVarArr = f27041b;
        ti tiVar2 = tiVarArr[i7];
        if (tiVar2 == null) {
            synchronized (ti.class) {
                try {
                    tiVar = tiVarArr[i7];
                    if (tiVar == null) {
                        tiVar = new ti(i7);
                        tiVarArr[i7] = tiVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return tiVar;
        }
        return tiVar2;
    }

    public final int a(long j3, String str, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, LongSparseArray longSparseArray, di.x3 x3Var) {
        boolean isEmpty = TextUtils.isEmpty(str);
        TLRPC.TL_messages_getChatInviteImporters tL_messages_getChatInviteImporters = new TLRPC.TL_messages_getChatInviteImporters();
        tL_messages_getChatInviteImporters.peer = np.u1(this.currentAccount).l1(-j3);
        tL_messages_getChatInviteImporters.requested = true;
        tL_messages_getChatInviteImporters.limit = 30;
        if (!isEmpty) {
            tL_messages_getChatInviteImporters.f28523q = str;
            tL_messages_getChatInviteImporters.flags |= 4;
        }
        if (tL_chatInviteImporter == null) {
            tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
        } else {
            tL_messages_getChatInviteImporters.offset_user = getMessagesController().s1((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id));
            tL_messages_getChatInviteImporters.offset_date = tL_chatInviteImporter.date;
        }
        return getConnectionsManager().sendRequest(tL_messages_getChatInviteImporters, new b4(this, tL_chatInviteImporter, isEmpty, j3, x3Var, 1));
    }

    public final void c(TL_update.TL_updatePendingJoinRequests tL_updatePendingJoinRequests) {
        long j3 = -gj.B1(tL_updatePendingJoinRequests.peer);
        this.f27042a.put(j3, null);
        TLRPC.ChatFull P0 = getMessagesController().P0(j3);
        if (P0 != null) {
            P0.requests_pending = tL_updatePendingJoinRequests.requests_pending;
            P0.recent_requesters = tL_updatePendingJoinRequests.recent_requesters;
            P0.flags |= 131072;
            getMessagesStorage().N1(P0, false);
            ls notificationCenter = getNotificationCenter();
            Boolean bool = Boolean.FALSE;
            notificationCenter.k(ls.T, P0, 0, bool, bool);
        }
    }
}
