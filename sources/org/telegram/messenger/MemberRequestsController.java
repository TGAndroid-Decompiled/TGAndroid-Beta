package org.telegram.messenger;

import android.text.TextUtils;
import android.util.LongSparseArray;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public class MemberRequestsController extends BaseController {
    private static final MemberRequestsController[] instances = new MemberRequestsController[4];
    private final LongSparseArray<TLRPC.TL_messages_chatInviteImporters> firstImportersCache;

    public MemberRequestsController(int i10) {
        super(i10);
        this.firstImportersCache = new LongSparseArray<>();
    }

    public static MemberRequestsController getInstance(int i10) {
        MemberRequestsController memberRequestsController;
        MemberRequestsController[] memberRequestsControllerArr = instances;
        MemberRequestsController memberRequestsController2 = memberRequestsControllerArr[i10];
        if (memberRequestsController2 == null) {
            synchronized (MemberRequestsController.class) {
                try {
                    memberRequestsController = memberRequestsControllerArr[i10];
                    if (memberRequestsController == null) {
                        memberRequestsController = new MemberRequestsController(i10);
                        memberRequestsControllerArr[i10] = memberRequestsController;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return memberRequestsController;
        }
        return memberRequestsController2;
    }

    public void lambda$getImporters$0(TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z4, long j10, RequestDelegate requestDelegate) {
        if (tL_error == null) {
            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
            if (tL_chatInviteImporter == null && z4) {
                this.firstImportersCache.put(j10, tL_messages_chatInviteImporters);
            }
        }
        requestDelegate.run(tLObject, tL_error);
    }

    public void lambda$getImporters$1(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z4, long j10, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new zk(j10, this, requestDelegate, tLObject, tL_chatInviteImporter, tL_error, z4));
    }

    public TLRPC.TL_messages_chatInviteImporters getCachedImporters(long j10) {
        return this.firstImportersCache.get(j10);
    }

    public int getImporters(long j10, String str, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, LongSparseArray<TLRPC.User> longSparseArray, RequestDelegate requestDelegate) {
        boolean isEmpty = TextUtils.isEmpty(str);
        TLRPC.TL_messages_getChatInviteImporters tL_messages_getChatInviteImporters = new TLRPC.TL_messages_getChatInviteImporters();
        tL_messages_getChatInviteImporters.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(-j10);
        tL_messages_getChatInviteImporters.requested = true;
        tL_messages_getChatInviteImporters.limit = 30;
        if (!isEmpty) {
            tL_messages_getChatInviteImporters.f19271q = str;
            tL_messages_getChatInviteImporters.flags |= 4;
        }
        if (tL_chatInviteImporter == null) {
            tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
        } else {
            tL_messages_getChatInviteImporters.offset_user = getMessagesController().getInputUser(longSparseArray.get(tL_chatInviteImporter.user_id));
            tL_messages_getChatInviteImporters.offset_date = tL_chatInviteImporter.date;
        }
        return getConnectionsManager().sendRequest(tL_messages_getChatInviteImporters, new ra(this, tL_chatInviteImporter, isEmpty, j10, requestDelegate, 3));
    }

    public void onPendingRequestsUpdated(TL_update.TL_updatePendingJoinRequests tL_updatePendingJoinRequests) {
        long j10 = -MessageObject.getPeerId(tL_updatePendingJoinRequests.peer);
        this.firstImportersCache.put(j10, null);
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j10);
        if (chatFull != null) {
            chatFull.requests_pending = tL_updatePendingJoinRequests.requests_pending;
            chatFull.recent_requesters = tL_updatePendingJoinRequests.recent_requesters;
            chatFull.flags |= 131072;
            getMessagesStorage().updateChatInfo(chatFull, false);
            NotificationCenter notificationCenter = getNotificationCenter();
            int i10 = NotificationCenter.chatInfoDidLoad;
            Boolean bool = Boolean.FALSE;
            notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, chatFull, 0, bool, bool);
        }
    }
}
