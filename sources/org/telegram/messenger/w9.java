package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class w9 implements Utilities.Callback2 {
    public final int f19672a;
    public final MessagesController f19673b;
    public final Utilities.Callback2 f19674c;

    public w9(MessagesController messagesController, Utilities.Callback2 callback2, int i10) {
        this.f19672a = i10;
        this.f19673b = messagesController;
        this.f19674c = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19672a) {
            case 0:
                this.f19673b.lambda$toggleChatNoForwards$278(this.f19674c, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f19673b.lambda$fetchCommunityPendingJoinRequests$246(this.f19674c, (TL_communities.PeerLinkRequests) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                this.f19673b.lambda$fetchCommunityJoinedChats$247(this.f19674c, (TL_communities.ParticipantJoinedChats) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f19673b.lambda$fetchChatsToAddToCommunity$252(this.f19674c, (TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
