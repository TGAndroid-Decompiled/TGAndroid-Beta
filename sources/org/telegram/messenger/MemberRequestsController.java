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

    public void lambda$getImporters$0(TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, long j3, RequestDelegate requestDelegate) {
        if (tL_error == null) {
            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
            if (tL_chatInviteImporter == null && z10) {
                this.firstImportersCache.put(j3, tL_messages_chatInviteImporters);
            }
        }
        requestDelegate.run(tLObject, tL_error);
    }

    public void lambda$getImporters$1(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, long j3, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new wk(j3, this, requestDelegate, tLObject, tL_chatInviteImporter, tL_error, z10));
    }

    public TLRPC.TL_messages_chatInviteImporters getCachedImporters(long j3) {
        return this.firstImportersCache.get(j3);
    }

    public int getImporters(long j3, String str, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, LongSparseArray<TLRPC.User> longSparseArray, RequestDelegate requestDelegate) {
        boolean isEmpty = TextUtils.isEmpty(str);
        TLRPC.TL_messages_getChatInviteImporters tL_messages_getChatInviteImporters = new TLRPC.TL_messages_getChatInviteImporters();
        tL_messages_getChatInviteImporters.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(-j3);
        tL_messages_getChatInviteImporters.requested = true;
        tL_messages_getChatInviteImporters.limit = 30;
        if (!isEmpty) {
            tL_messages_getChatInviteImporters.f19956q = str;
            tL_messages_getChatInviteImporters.flags |= 4;
        }
        if (tL_chatInviteImporter == null) {
            tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
        } else {
            tL_messages_getChatInviteImporters.offset_user = getMessagesController().getInputUser(longSparseArray.get(tL_chatInviteImporter.user_id));
            tL_messages_getChatInviteImporters.offset_date = tL_chatInviteImporter.date;
        }
        return getConnectionsManager().sendRequest(tL_messages_getChatInviteImporters, new na(this, tL_chatInviteImporter, isEmpty, j3, requestDelegate, 3));
    }

    public void onPendingRequestsUpdated(TL_update.TL_updatePendingJoinRequests tL_updatePendingJoinRequests) {
        long j3 = -MessageObject.getPeerId(tL_updatePendingJoinRequests.peer);
        this.firstImportersCache.put(j3, null);
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j3);
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
