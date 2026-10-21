package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class x9 implements Utilities.Callback2 {
    public final int f20064a;
    public final MessagesController f20065b;
    public final Utilities.Callback2 f20066c;

    public x9(MessagesController messagesController, Utilities.Callback2 callback2, int i10) {
        this.f20064a = i10;
        this.f20065b = messagesController;
        this.f20066c = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f20064a) {
            case 0:
                this.f20065b.lambda$toggleChatNoForwards$277(this.f20066c, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f20065b.lambda$fetchCommunityPendingJoinRequests$245(this.f20066c, (TL_communities.PeerLinkRequests) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                this.f20065b.lambda$fetchCommunityJoinedChats$246(this.f20066c, (TL_communities.ParticipantJoinedChats) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f20065b.lambda$fetchChatsToAddToCommunity$251(this.f20066c, (TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
