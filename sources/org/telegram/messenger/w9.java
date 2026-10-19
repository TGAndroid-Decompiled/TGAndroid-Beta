package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class w9 implements Utilities.Callback2 {
    public final int f19969a;
    public final MessagesController f19970b;
    public final Utilities.Callback2 f19971c;

    public w9(MessagesController messagesController, Utilities.Callback2 callback2, int i10) {
        this.f19969a = i10;
        this.f19970b = messagesController;
        this.f19971c = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19969a) {
            case 0:
                this.f19970b.lambda$toggleChatNoForwards$277(this.f19971c, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f19970b.lambda$fetchCommunityPendingJoinRequests$245(this.f19971c, (TL_communities.PeerLinkRequests) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                this.f19970b.lambda$fetchCommunityJoinedChats$246(this.f19971c, (TL_communities.ParticipantJoinedChats) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f19970b.lambda$fetchChatsToAddToCommunity$251(this.f19971c, (TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
