package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class w9 implements Utilities.Callback2 {
    public final int f19966a;
    public final MessagesController f19967b;
    public final Utilities.Callback2 f19968c;

    public w9(MessagesController messagesController, Utilities.Callback2 callback2, int i10) {
        this.f19966a = i10;
        this.f19967b = messagesController;
        this.f19968c = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19966a) {
            case 0:
                this.f19967b.lambda$toggleChatNoForwards$277(this.f19968c, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f19967b.lambda$fetchCommunityPendingJoinRequests$245(this.f19968c, (TL_communities.PeerLinkRequests) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                this.f19967b.lambda$fetchCommunityJoinedChats$246(this.f19968c, (TL_communities.ParticipantJoinedChats) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f19967b.lambda$fetchChatsToAddToCommunity$251(this.f19968c, (TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
