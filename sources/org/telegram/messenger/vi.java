package org.telegram.messenger;

import android.text.TextUtils;
import android.util.LongSparseArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class vi extends f1 {
    public static final vi[] f18536b = new vi[4];
    public final LongSparseArray f18537a;

    public vi(int i10) {
        super(i10);
        this.f18537a = new LongSparseArray();
    }

    public static vi b(int i10) {
        vi viVar;
        vi[] viVarArr = f18536b;
        vi viVar2 = viVarArr[i10];
        if (viVar2 == null) {
            synchronized (vi.class) {
                try {
                    viVar = viVarArr[i10];
                    if (viVar == null) {
                        viVar = new vi(i10);
                        viVarArr[i10] = viVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return viVar;
        }
        return viVar2;
    }

    public final int a(long j10, String str, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, LongSparseArray longSparseArray, oh.g gVar) {
        boolean isEmpty = TextUtils.isEmpty(str);
        TLRPC.TL_messages_getChatInviteImporters tL_messages_getChatInviteImporters = new TLRPC.TL_messages_getChatInviteImporters();
        tL_messages_getChatInviteImporters.peer = vp.r1(this.currentAccount).i1(-j10);
        tL_messages_getChatInviteImporters.requested = true;
        tL_messages_getChatInviteImporters.limit = 30;
        if (!isEmpty) {
            tL_messages_getChatInviteImporters.f19882q = str;
            tL_messages_getChatInviteImporters.flags |= 4;
        }
        if (tL_chatInviteImporter == null) {
            tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
        } else {
            tL_messages_getChatInviteImporters.offset_user = getMessagesController().p1((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id));
            tL_messages_getChatInviteImporters.offset_date = tL_chatInviteImporter.date;
        }
        return getConnectionsManager().sendRequest(tL_messages_getChatInviteImporters, new b4(this, tL_chatInviteImporter, isEmpty, j10, gVar, 1));
    }

    public final void c(TL_update.TL_updatePendingJoinRequests tL_updatePendingJoinRequests) {
        long j10 = -jj.C1(tL_updatePendingJoinRequests.peer);
        this.f18537a.put(j10, null);
        TLRPC.ChatFull M0 = getMessagesController().M0(j10);
        if (M0 != null) {
            M0.requests_pending = tL_updatePendingJoinRequests.requests_pending;
            M0.recent_requesters = tL_updatePendingJoinRequests.recent_requesters;
            M0.flags |= 131072;
            getMessagesStorage().N1(M0, false);
            zs notificationCenter = getNotificationCenter();
            Boolean bool = Boolean.FALSE;
            notificationCenter.k(zs.T, M0, 0, bool, bool);
        }
    }
}
