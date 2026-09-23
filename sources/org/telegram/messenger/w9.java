package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class w9 implements Utilities.Callback2 {
    public final int f17751a;
    public final MessagesController f17752b;
    public final Utilities.Callback2 f17753c;

    public w9(MessagesController messagesController, Utilities.Callback2 callback2, int i10) {
        this.f17751a = i10;
        this.f17752b = messagesController;
        this.f17753c = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f17751a) {
            case 0:
                this.f17752b.lambda$toggleChatNoForwards$278(this.f17753c, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f17752b.lambda$fetchCommunityPendingJoinRequests$246(this.f17753c, (TL_communities.PeerLinkRequests) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                this.f17752b.lambda$fetchCommunityJoinedChats$247(this.f17753c, (TL_communities.ParticipantJoinedChats) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f17752b.lambda$fetchChatsToAddToCommunity$252(this.f17753c, (TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
