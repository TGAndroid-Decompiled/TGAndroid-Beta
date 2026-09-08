package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class w9 implements Utilities.Callback2 {
    public final int f19510a;
    public final MessagesController f19511b;
    public final Utilities.Callback2 f19512c;

    public w9(MessagesController messagesController, Utilities.Callback2 callback2, int i10) {
        this.f19510a = i10;
        this.f19511b = messagesController;
        this.f19512c = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19510a) {
            case 0:
                this.f19511b.lambda$toggleChatNoForwards$278(this.f19512c, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f19511b.lambda$fetchCommunityPendingJoinRequests$246(this.f19512c, (TL_communities.PeerLinkRequests) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                this.f19511b.lambda$fetchCommunityJoinedChats$247(this.f19512c, (TL_communities.ParticipantJoinedChats) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f19511b.lambda$fetchChatsToAddToCommunity$252(this.f19512c, (TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
