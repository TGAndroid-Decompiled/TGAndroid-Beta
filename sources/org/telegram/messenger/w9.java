package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class w9 implements Utilities.Callback2 {
    public final int f18019a;
    public final MessagesController f18020b;
    public final Utilities.Callback2 f18021c;

    public w9(MessagesController messagesController, Utilities.Callback2 callback2, int i10) {
        this.f18019a = i10;
        this.f18020b = messagesController;
        this.f18021c = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18019a) {
            case 0:
                this.f18020b.lambda$toggleChatNoForwards$278(this.f18021c, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f18020b.lambda$fetchCommunityPendingJoinRequests$246(this.f18021c, (TL_communities.PeerLinkRequests) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                this.f18020b.lambda$fetchCommunityJoinedChats$247(this.f18021c, (TL_communities.ParticipantJoinedChats) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f18020b.lambda$fetchChatsToAddToCommunity$252(this.f18021c, (TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
