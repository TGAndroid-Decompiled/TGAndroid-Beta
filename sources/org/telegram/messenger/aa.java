package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class aa implements Utilities.Callback2 {
    public final int f18135a;
    public final MessagesController f18136b;
    public final Utilities.Callback2 f18137c;

    public aa(MessagesController messagesController, Utilities.Callback2 callback2, int i10) {
        this.f18135a = i10;
        this.f18136b = messagesController;
        this.f18137c = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18135a) {
            case 0:
                this.f18136b.lambda$toggleChatNoForwards$278(this.f18137c, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f18136b.lambda$fetchCommunityPendingJoinRequests$246(this.f18137c, (TL_communities.PeerLinkRequests) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                this.f18136b.lambda$fetchCommunityJoinedChats$247(this.f18137c, (TL_communities.ParticipantJoinedChats) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f18136b.lambda$fetchChatsToAddToCommunity$252(this.f18137c, (TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
