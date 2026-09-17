package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class v9 implements Utilities.Callback2 {
    public final int f19224a;
    public final MessagesController f19225b;
    public final Utilities.Callback2 f19226c;

    public v9(MessagesController messagesController, Utilities.Callback2 callback2, int i10) {
        this.f19224a = i10;
        this.f19225b = messagesController;
        this.f19226c = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19224a) {
            case 0:
                this.f19225b.lambda$toggleChatNoForwards$278(this.f19226c, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f19225b.lambda$fetchCommunityPendingJoinRequests$246(this.f19226c, (TL_communities.PeerLinkRequests) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                this.f19225b.lambda$fetchCommunityJoinedChats$247(this.f19226c, (TL_communities.ParticipantJoinedChats) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f19225b.lambda$fetchChatsToAddToCommunity$252(this.f19226c, (TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
