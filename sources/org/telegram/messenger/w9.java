package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class w9 implements Utilities.Callback2 {
    public final int f18005a;
    public final MessagesController f18006b;
    public final Utilities.Callback2 f18007c;

    public w9(MessagesController messagesController, Utilities.Callback2 callback2, int i10) {
        this.f18005a = i10;
        this.f18006b = messagesController;
        this.f18007c = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18005a) {
            case 0:
                this.f18006b.lambda$toggleChatNoForwards$278(this.f18007c, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f18006b.lambda$fetchCommunityPendingJoinRequests$246(this.f18007c, (TL_communities.PeerLinkRequests) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                this.f18006b.lambda$fetchCommunityJoinedChats$247(this.f18007c, (TL_communities.ParticipantJoinedChats) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f18006b.lambda$fetchChatsToAddToCommunity$252(this.f18007c, (TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
