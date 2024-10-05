package org.telegram.messenger;

import android.text.TextUtils;
import android.util.LongSparseArray;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$TL_chatInviteImporter;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputUserEmpty;
import org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters;
import org.telegram.tgnet.TLRPC$TL_messages_getChatInviteImporters;
import org.telegram.tgnet.TLRPC$TL_updatePendingJoinRequests;
import org.telegram.tgnet.TLRPC$User;

public class MemberRequestsController extends BaseController {
    private static final MemberRequestsController[] instances = new MemberRequestsController[4];
    private final LongSparseArray<TLRPC$TL_messages_chatInviteImporters> firstImportersCache;

    public MemberRequestsController(int i) {
        super(i);
        this.firstImportersCache = new LongSparseArray<>();
    }

    public static MemberRequestsController getInstance(int i) {
        MemberRequestsController[] memberRequestsControllerArr = instances;
        MemberRequestsController memberRequestsController = memberRequestsControllerArr[i];
        if (memberRequestsController == null) {
            synchronized (MemberRequestsController.class) {
                try {
                    memberRequestsController = memberRequestsControllerArr[i];
                    if (memberRequestsController == null) {
                        memberRequestsController = new MemberRequestsController(i);
                        memberRequestsControllerArr[i] = memberRequestsController;
                    }
                } finally {
                }
            }
        }
        return memberRequestsController;
    }

    public void lambda$getImporters$0(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject, TLRPC$TL_chatInviteImporter tLRPC$TL_chatInviteImporter, boolean z, long j, RequestDelegate requestDelegate) {
        if (tLRPC$TL_error == null) {
            TLRPC$TL_messages_chatInviteImporters tLRPC$TL_messages_chatInviteImporters = (TLRPC$TL_messages_chatInviteImporters) tLObject;
            if (tLRPC$TL_chatInviteImporter == null && z) {
                this.firstImportersCache.put(j, tLRPC$TL_messages_chatInviteImporters);
            }
        }
        requestDelegate.run(tLObject, tLRPC$TL_error);
    }

    public void lambda$getImporters$1(final TLRPC$TL_chatInviteImporter tLRPC$TL_chatInviteImporter, final boolean z, final long j, final RequestDelegate requestDelegate, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MemberRequestsController.this.lambda$getImporters$0(tLRPC$TL_error, tLObject, tLRPC$TL_chatInviteImporter, z, j, requestDelegate);
            }
        });
    }

    public TLRPC$TL_messages_chatInviteImporters getCachedImporters(long j) {
        return this.firstImportersCache.get(j);
    }

    public int getImporters(final long j, String str, final TLRPC$TL_chatInviteImporter tLRPC$TL_chatInviteImporter, LongSparseArray<TLRPC$User> longSparseArray, final RequestDelegate requestDelegate) {
        final boolean isEmpty = TextUtils.isEmpty(str);
        TLRPC$TL_messages_getChatInviteImporters tLRPC$TL_messages_getChatInviteImporters = new TLRPC$TL_messages_getChatInviteImporters();
        tLRPC$TL_messages_getChatInviteImporters.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(-j);
        tLRPC$TL_messages_getChatInviteImporters.requested = true;
        tLRPC$TL_messages_getChatInviteImporters.limit = 30;
        if (!isEmpty) {
            tLRPC$TL_messages_getChatInviteImporters.q = str;
            tLRPC$TL_messages_getChatInviteImporters.flags |= 4;
        }
        if (tLRPC$TL_chatInviteImporter == null) {
            tLRPC$TL_messages_getChatInviteImporters.offset_user = new TLRPC$TL_inputUserEmpty();
        } else {
            tLRPC$TL_messages_getChatInviteImporters.offset_user = getMessagesController().getInputUser(longSparseArray.get(tLRPC$TL_chatInviteImporter.user_id));
            tLRPC$TL_messages_getChatInviteImporters.offset_date = tLRPC$TL_chatInviteImporter.date;
        }
        return getConnectionsManager().sendRequest(tLRPC$TL_messages_getChatInviteImporters, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MemberRequestsController.this.lambda$getImporters$1(tLRPC$TL_chatInviteImporter, isEmpty, j, requestDelegate, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void onPendingRequestsUpdated(TLRPC$TL_updatePendingJoinRequests tLRPC$TL_updatePendingJoinRequests) {
        long j = -MessageObject.getPeerId(tLRPC$TL_updatePendingJoinRequests.peer);
        this.firstImportersCache.put(j, null);
        TLRPC$ChatFull chatFull = getMessagesController().getChatFull(j);
        if (chatFull != null) {
            chatFull.requests_pending = tLRPC$TL_updatePendingJoinRequests.requests_pending;
            chatFull.recent_requesters = tLRPC$TL_updatePendingJoinRequests.recent_requesters;
            chatFull.flags |= 131072;
            getMessagesStorage().updateChatInfo(chatFull, false);
            NotificationCenter notificationCenter = getNotificationCenter();
            int i = NotificationCenter.chatInfoDidLoad;
            Boolean bool = Boolean.FALSE;
            notificationCenter.lambda$postNotificationNameOnUIThread$1(i, chatFull, 0, bool, bool);
        }
    }
}
