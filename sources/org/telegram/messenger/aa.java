package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class aa implements Utilities.Callback2 {
    public final int f18137a;
    public final MessagesController f18138b;
    public final Utilities.Callback2 f18139c;

    public aa(MessagesController messagesController, Utilities.Callback2 callback2, int i10) {
        this.f18137a = i10;
        this.f18138b = messagesController;
        this.f18139c = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18137a) {
            case 0:
                this.f18138b.lambda$toggleChatNoForwards$278(this.f18139c, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f18138b.lambda$fetchCommunityPendingJoinRequests$246(this.f18139c, (TL_communities.PeerLinkRequests) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                this.f18138b.lambda$fetchCommunityJoinedChats$247(this.f18139c, (TL_communities.ParticipantJoinedChats) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f18138b.lambda$fetchChatsToAddToCommunity$252(this.f18139c, (TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
