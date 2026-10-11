package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class v9 implements Utilities.Callback2 {
    public final int f19414a;
    public final MessagesController f19415b;
    public final Utilities.Callback2 f19416c;

    public v9(MessagesController messagesController, Utilities.Callback2 callback2, int i10) {
        this.f19414a = i10;
        this.f19415b = messagesController;
        this.f19416c = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19414a) {
            case 0:
                this.f19415b.lambda$toggleChatNoForwards$277(this.f19416c, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f19415b.lambda$fetchCommunityPendingJoinRequests$245(this.f19416c, (TL_communities.PeerLinkRequests) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                this.f19415b.lambda$fetchCommunityJoinedChats$246(this.f19416c, (TL_communities.ParticipantJoinedChats) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f19415b.lambda$fetchChatsToAddToCommunity$251(this.f19416c, (TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
