package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class x9 implements Utilities.Callback2 {
    public final int f21816a;
    public final MessagesController f21817b;
    public final Utilities.Callback2 f21818c;

    public x9(MessagesController messagesController, Utilities.Callback2 callback2, int i10) {
        this.f21816a = i10;
        this.f21817b = messagesController;
        this.f21818c = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f21816a) {
            case 0:
                this.f21817b.lambda$toggleChatNoForwards$277(this.f21818c, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f21817b.lambda$fetchCommunityPendingJoinRequests$245(this.f21818c, (TL_communities.PeerLinkRequests) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                this.f21817b.lambda$fetchCommunityJoinedChats$246(this.f21818c, (TL_communities.ParticipantJoinedChats) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f21817b.lambda$fetchChatsToAddToCommunity$251(this.f21818c, (TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
