package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class x9 implements Utilities.Callback2 {
    public final int f20067a;
    public final MessagesController f20068b;
    public final Utilities.Callback2 f20069c;

    public x9(MessagesController messagesController, Utilities.Callback2 callback2, int i10) {
        this.f20067a = i10;
        this.f20068b = messagesController;
        this.f20069c = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f20067a) {
            case 0:
                this.f20068b.lambda$toggleChatNoForwards$277(this.f20069c, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f20068b.lambda$fetchCommunityPendingJoinRequests$245(this.f20069c, (TL_communities.PeerLinkRequests) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                this.f20068b.lambda$fetchCommunityJoinedChats$246(this.f20069c, (TL_communities.ParticipantJoinedChats) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f20068b.lambda$fetchChatsToAddToCommunity$251(this.f20069c, (TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
