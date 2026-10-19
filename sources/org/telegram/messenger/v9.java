package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class v9 implements Utilities.Callback2 {
    public final int f19729a;
    public final MessagesController f19730b;
    public final Utilities.Callback2 f19731c;

    public v9(MessagesController messagesController, Utilities.Callback2 callback2, int i10) {
        this.f19729a = i10;
        this.f19730b = messagesController;
        this.f19731c = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19729a) {
            case 0:
                this.f19730b.lambda$toggleChatNoForwards$277(this.f19731c, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f19730b.lambda$fetchCommunityPendingJoinRequests$245(this.f19731c, (TL_communities.PeerLinkRequests) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                this.f19730b.lambda$fetchCommunityJoinedChats$246(this.f19731c, (TL_communities.ParticipantJoinedChats) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f19730b.lambda$fetchChatsToAddToCommunity$251(this.f19731c, (TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
