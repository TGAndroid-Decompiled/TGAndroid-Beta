package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class da implements Utilities.Callback2 {
    public final int f14995a;
    public final MessagesController f14996b;
    public final Utilities.Callback2 f14997c;

    public da(MessagesController messagesController, Utilities.Callback2 callback2, int i10) {
        this.f14995a = i10;
        this.f14996b = messagesController;
        this.f14997c = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f14995a) {
            case 0:
                this.f14996b.lambda$toggleChatNoForwards$278(this.f14997c, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f14996b.lambda$fetchCommunityPendingJoinRequests$246(this.f14997c, (TL_communities.PeerLinkRequests) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                this.f14996b.lambda$fetchCommunityJoinedChats$247(this.f14997c, (TL_communities.ParticipantJoinedChats) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f14996b.lambda$fetchChatsToAddToCommunity$252(this.f14997c, (TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
