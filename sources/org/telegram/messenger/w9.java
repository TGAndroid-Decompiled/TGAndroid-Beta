package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class w9 implements Utilities.Callback2 {
    public final int f18011a;
    public final MessagesController f18012b;
    public final Utilities.Callback2 f18013c;

    public w9(MessagesController messagesController, Utilities.Callback2 callback2, int i10) {
        this.f18011a = i10;
        this.f18012b = messagesController;
        this.f18013c = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18011a) {
            case 0:
                this.f18012b.lambda$toggleChatNoForwards$278(this.f18013c, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f18012b.lambda$fetchCommunityPendingJoinRequests$246(this.f18013c, (TL_communities.PeerLinkRequests) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                this.f18012b.lambda$fetchCommunityJoinedChats$247(this.f18013c, (TL_communities.ParticipantJoinedChats) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f18012b.lambda$fetchChatsToAddToCommunity$252(this.f18013c, (TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
