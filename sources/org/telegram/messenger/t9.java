package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class t9 implements Utilities.Callback2 {
    public final int f21554a;
    public final MessagesController f21555b;
    public final Utilities.Callback2 f21556c;

    public t9(MessagesController messagesController, Utilities.Callback2 callback2, int i9) {
        this.f21554a = i9;
        this.f21555b = messagesController;
        this.f21556c = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f21554a) {
            case 0:
                this.f21555b.lambda$toggleChatNoForwards$278(this.f21556c, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f21555b.lambda$fetchCommunityPendingJoinRequests$246(this.f21556c, (TL_communities.PeerLinkRequests) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                this.f21555b.lambda$fetchCommunityJoinedChats$247(this.f21556c, (TL_communities.ParticipantJoinedChats) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f21555b.lambda$fetchChatsToAddToCommunity$252(this.f21556c, (TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
