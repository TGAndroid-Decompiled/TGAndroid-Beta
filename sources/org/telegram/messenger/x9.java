package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

public final class x9 implements Utilities.Callback2 {

    public final int f22125a;

    public final MessagesController f22126b;

    public final Utilities.Callback2 f22127c;

    public x9(MessagesController messagesController, Utilities.Callback2 callback2, int i10) {
        this.f22125a = i10;
        this.f22126b = messagesController;
        this.f22127c = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f22125a) {
            case 0:
                this.f22126b.lambda$toggleChatNoForwards$278(this.f22127c, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                this.f22126b.lambda$fetchCommunityPendingJoinRequests$246(this.f22127c, (TL_communities.PeerLinkRequests) obj, (TLRPC.TL_error) obj2);
                break;
            case 2:
                this.f22126b.lambda$fetchCommunityJoinedChats$247(this.f22127c, (TL_communities.ParticipantJoinedChats) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                this.f22126b.lambda$fetchChatsToAddToCommunity$252(this.f22127c, (TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
