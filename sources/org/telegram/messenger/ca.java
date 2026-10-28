package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class ca implements Utilities.Callback2 {
    public final int f19773a;
    public final MessagesController f19774b;
    public final Utilities.Callback2 f19775c;

    public ca(MessagesController messagesController, Utilities.Callback2 callback2, int i10) {
        this.f19773a = i10;
        this.f19774b = messagesController;
        this.f19775c = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19773a) {
            case 0:
                this.f19774b.lambda$toggleChatNoForwards$277(this.f19775c, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f19774b.lambda$fetchCommunityPendingJoinRequests$245(this.f19775c, (TL_communities.PeerLinkRequests) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                this.f19774b.lambda$fetchCommunityJoinedChats$246(this.f19775c, (TL_communities.ParticipantJoinedChats) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f19774b.lambda$fetchChatsToAddToCommunity$251(this.f19775c, (TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
