package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class w9 implements Utilities.Callback2 {
    public final int f17996a;
    public final MessagesController f17997b;
    public final Utilities.Callback2 f17998c;

    public w9(MessagesController messagesController, Utilities.Callback2 callback2, int i10) {
        this.f17996a = i10;
        this.f17997b = messagesController;
        this.f17998c = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f17996a) {
            case 0:
                this.f17997b.lambda$toggleChatNoForwards$278(this.f17998c, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f17997b.lambda$fetchCommunityPendingJoinRequests$246(this.f17998c, (TL_communities.PeerLinkRequests) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                this.f17997b.lambda$fetchCommunityJoinedChats$247(this.f17998c, (TL_communities.ParticipantJoinedChats) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f17997b.lambda$fetchChatsToAddToCommunity$252(this.f17998c, (TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
