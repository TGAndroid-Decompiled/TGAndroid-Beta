package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class w9 implements Utilities.Callback2 {
    public final int f19684a;
    public final MessagesController f19685b;
    public final Utilities.Callback2 f19686c;

    public w9(MessagesController messagesController, Utilities.Callback2 callback2, int i10) {
        this.f19684a = i10;
        this.f19685b = messagesController;
        this.f19686c = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19684a) {
            case 0:
                this.f19685b.lambda$toggleChatNoForwards$278(this.f19686c, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f19685b.lambda$fetchCommunityPendingJoinRequests$246(this.f19686c, (TL_communities.PeerLinkRequests) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                this.f19685b.lambda$fetchCommunityJoinedChats$247(this.f19686c, (TL_communities.ParticipantJoinedChats) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f19685b.lambda$fetchChatsToAddToCommunity$252(this.f19686c, (TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
