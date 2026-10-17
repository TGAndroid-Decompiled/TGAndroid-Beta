package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class v9 implements Utilities.Callback2 {
    public final int f19731a;
    public final MessagesController f19732b;
    public final Utilities.Callback2 f19733c;

    public v9(MessagesController messagesController, Utilities.Callback2 callback2, int i10) {
        this.f19731a = i10;
        this.f19732b = messagesController;
        this.f19733c = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19731a) {
            case 0:
                this.f19732b.lambda$toggleChatNoForwards$277(this.f19733c, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f19732b.lambda$fetchCommunityPendingJoinRequests$245(this.f19733c, (TL_communities.PeerLinkRequests) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                this.f19732b.lambda$fetchCommunityJoinedChats$246(this.f19733c, (TL_communities.ParticipantJoinedChats) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f19732b.lambda$fetchChatsToAddToCommunity$251(this.f19733c, (TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
