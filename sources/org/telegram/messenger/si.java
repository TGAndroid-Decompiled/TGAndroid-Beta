package org.telegram.messenger;

import android.text.TextUtils;
import android.util.LongSparseArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class si extends c1 {
    public static final si[] f26914b = new si[4];
    public final LongSparseArray f26915a;

    public si(int i7) {
        super(i7);
        this.f26915a = new LongSparseArray();
    }

    public static si b(int i7) {
        si siVar;
        si[] siVarArr = f26914b;
        si siVar2 = siVarArr[i7];
        if (siVar2 == null) {
            synchronized (si.class) {
                try {
                    siVar = siVarArr[i7];
                    if (siVar == null) {
                        siVar = new si(i7);
                        siVarArr[i7] = siVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return siVar;
        }
        return siVar2;
    }

    public final int a(long j3, String str, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, LongSparseArray longSparseArray, di.x3 x3Var) {
        boolean isEmpty = TextUtils.isEmpty(str);
        TLRPC.TL_messages_getChatInviteImporters tL_messages_getChatInviteImporters = new TLRPC.TL_messages_getChatInviteImporters();
        tL_messages_getChatInviteImporters.peer = mp.u1(this.currentAccount).l1(-j3);
        tL_messages_getChatInviteImporters.requested = true;
        tL_messages_getChatInviteImporters.limit = 30;
        if (!isEmpty) {
            tL_messages_getChatInviteImporters.f28581q = str;
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
        long j3 = -fj.B1(tL_updatePendingJoinRequests.peer);
        this.f26915a.put(j3, null);
        TLRPC.ChatFull P0 = getMessagesController().P0(j3);
        if (P0 != null) {
            P0.requests_pending = tL_updatePendingJoinRequests.requests_pending;
            P0.recent_requesters = tL_updatePendingJoinRequests.recent_requesters;
            P0.flags |= 131072;
            getMessagesStorage().N1(P0, false);
            ks notificationCenter = getNotificationCenter();
            Boolean bool = Boolean.FALSE;
            notificationCenter.k(ks.T, P0, 0, bool, bool);
        }
    }
}
