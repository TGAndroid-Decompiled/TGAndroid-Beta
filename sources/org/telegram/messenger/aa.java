package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class aa implements Utilities.Callback2 {
    public final int f17854a;
    public final MessagesController f17855b;
    public final Utilities.Callback2 f17856c;

    public aa(MessagesController messagesController, Utilities.Callback2 callback2, int i10) {
        this.f17854a = i10;
        this.f17855b = messagesController;
        this.f17856c = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f17854a) {
            case 0:
                this.f17855b.lambda$toggleChatNoForwards$277(this.f17856c, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f17855b.lambda$fetchCommunityPendingJoinRequests$245(this.f17856c, (TL_communities.PeerLinkRequests) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                this.f17855b.lambda$fetchCommunityJoinedChats$246(this.f17856c, (TL_communities.ParticipantJoinedChats) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f17855b.lambda$fetchChatsToAddToCommunity$251(this.f17856c, (TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
