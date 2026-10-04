package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class w9 implements Utilities.Callback2 {
    public final int f19683a;
    public final MessagesController f19684b;
    public final Utilities.Callback2 f19685c;

    public w9(MessagesController messagesController, Utilities.Callback2 callback2, int i10) {
        this.f19683a = i10;
        this.f19684b = messagesController;
        this.f19685c = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19683a) {
            case 0:
                this.f19684b.lambda$toggleChatNoForwards$278(this.f19685c, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f19684b.lambda$fetchCommunityPendingJoinRequests$246(this.f19685c, (TL_communities.PeerLinkRequests) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                this.f19684b.lambda$fetchCommunityJoinedChats$247(this.f19685c, (TL_communities.ParticipantJoinedChats) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f19684b.lambda$fetchChatsToAddToCommunity$252(this.f19685c, (TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
