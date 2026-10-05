package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class w9 implements Utilities.Callback2 {
    public final int f19677a;
    public final MessagesController f19678b;
    public final Utilities.Callback2 f19679c;

    public w9(MessagesController messagesController, Utilities.Callback2 callback2, int i10) {
        this.f19677a = i10;
        this.f19678b = messagesController;
        this.f19679c = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19677a) {
            case 0:
                this.f19678b.lambda$toggleChatNoForwards$278(this.f19679c, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f19678b.lambda$fetchCommunityPendingJoinRequests$246(this.f19679c, (TL_communities.PeerLinkRequests) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                this.f19678b.lambda$fetchCommunityJoinedChats$247(this.f19679c, (TL_communities.ParticipantJoinedChats) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f19678b.lambda$fetchChatsToAddToCommunity$252(this.f19679c, (TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
