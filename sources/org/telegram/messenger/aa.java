package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class aa implements Utilities.Callback2 {
    public final int f16741a;
    public final MessagesController f16742b;
    public final Utilities.Callback2 f16743c;

    public aa(MessagesController messagesController, Utilities.Callback2 callback2, int i10) {
        this.f16741a = i10;
        this.f16742b = messagesController;
        this.f16743c = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f16741a) {
            case 0:
                this.f16742b.lambda$toggleChatNoForwards$278(this.f16743c, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f16742b.lambda$fetchCommunityPendingJoinRequests$246(this.f16743c, (TL_communities.PeerLinkRequests) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                this.f16742b.lambda$fetchCommunityJoinedChats$247(this.f16743c, (TL_communities.ParticipantJoinedChats) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f16742b.lambda$fetchChatsToAddToCommunity$252(this.f16743c, (TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
