package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

public final class MessagesController$$ExternalSyntheticLambda57 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final MessagesController f$0;
    public final Utilities.Callback2 f$1;

    public MessagesController$$ExternalSyntheticLambda57(MessagesController messagesController, Utilities.Callback2 callback2, int i) {
        this.$r8$classId = i;
        this.f$0 = messagesController;
        this.f$1 = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$fetchChatsToAddToCommunity$252(this.f$1, (TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                this.f$0.lambda$toggleChatNoForwards$278(this.f$1, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 2:
                this.f$0.lambda$fetchCommunityPendingJoinRequests$246(this.f$1, (TL_communities.PeerLinkRequests) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                this.f$0.lambda$fetchCommunityJoinedChats$247(this.f$1, (TL_communities.ParticipantJoinedChats) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
