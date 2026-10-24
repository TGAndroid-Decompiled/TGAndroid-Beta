package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class aa implements Utilities.Callback2 {
    public final int f17917a;
    public final MessagesController f17918b;
    public final Utilities.Callback2 f17919c;

    public aa(MessagesController messagesController, Utilities.Callback2 callback2, int i10) {
        this.f17917a = i10;
        this.f17918b = messagesController;
        this.f17919c = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f17917a) {
            case 0:
                this.f17918b.lambda$toggleChatNoForwards$277(this.f17919c, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f17918b.lambda$fetchCommunityPendingJoinRequests$245(this.f17919c, (TL_communities.PeerLinkRequests) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                this.f17918b.lambda$fetchCommunityJoinedChats$246(this.f17919c, (TL_communities.ParticipantJoinedChats) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f17918b.lambda$fetchChatsToAddToCommunity$251(this.f17919c, (TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
