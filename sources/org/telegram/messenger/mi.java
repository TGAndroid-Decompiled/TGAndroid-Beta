package org.telegram.messenger;

import android.text.TextUtils;
import android.util.LongSparseArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class mi extends c1 {
    public static final mi[] f24211b = new mi[4];
    public final LongSparseArray f24212a;

    public mi(int i3) {
        super(i3);
        this.f24212a = new LongSparseArray();
    }

    public static mi b(int i3) {
        mi miVar;
        mi[] miVarArr = f24211b;
        mi miVar2 = miVarArr[i3];
        if (miVar2 == null) {
            synchronized (mi.class) {
                try {
                    miVar = miVarArr[i3];
                    if (miVar == null) {
                        miVar = new mi(i3);
                        miVarArr[i3] = miVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return miVar;
        }
        return miVar2;
    }

    public final int a(long j10, String str, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, LongSparseArray longSparseArray, ci.d4 d4Var) {
        boolean isEmpty = TextUtils.isEmpty(str);
        TLRPC.TL_messages_getChatInviteImporters tL_messages_getChatInviteImporters = new TLRPC.TL_messages_getChatInviteImporters();
        tL_messages_getChatInviteImporters.peer = hp.s1(this.currentAccount).j1(-j10);
        tL_messages_getChatInviteImporters.requested = true;
        tL_messages_getChatInviteImporters.limit = 30;
        if (!isEmpty) {
            tL_messages_getChatInviteImporters.f27090q = str;
            tL_messages_getChatInviteImporters.flags |= 4;
        }
        if (tL_chatInviteImporter == null) {
            tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
        } else {
            tL_messages_getChatInviteImporters.offset_user = getMessagesController().q1((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id));
            tL_messages_getChatInviteImporters.offset_date = tL_chatInviteImporter.date;
        }
        return getConnectionsManager().sendRequest(tL_messages_getChatInviteImporters, new y3(this, tL_chatInviteImporter, isEmpty, j10, d4Var, 1));
    }

    public final void c(TL_update.TL_updatePendingJoinRequests tL_updatePendingJoinRequests) {
        long j10 = -zi.C1(tL_updatePendingJoinRequests.peer);
        this.f24212a.put(j10, null);
        TLRPC.ChatFull N0 = getMessagesController().N0(j10);
        if (N0 != null) {
            N0.requests_pending = tL_updatePendingJoinRequests.requests_pending;
            N0.recent_requesters = tL_updatePendingJoinRequests.recent_requesters;
            N0.flags |= 131072;
            getMessagesStorage().N1(N0, false);
            hs notificationCenter = getNotificationCenter();
            Boolean bool = Boolean.FALSE;
            notificationCenter.k(hs.T, N0, 0, bool, bool);
        }
    }
}
