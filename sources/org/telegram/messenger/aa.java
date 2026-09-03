package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class aa implements Utilities.Callback2 {
    public final int f16722a;
    public final MessagesController f16723b;
    public final Utilities.Callback2 f16724c;

    public aa(MessagesController messagesController, Utilities.Callback2 callback2, int i10) {
        this.f16722a = i10;
        this.f16723b = messagesController;
        this.f16724c = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f16722a) {
            case 0:
                this.f16723b.lambda$toggleChatNoForwards$278(this.f16724c, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f16723b.lambda$fetchCommunityPendingJoinRequests$246(this.f16724c, (TL_communities.PeerLinkRequests) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                this.f16723b.lambda$fetchCommunityJoinedChats$247(this.f16724c, (TL_communities.ParticipantJoinedChats) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f16723b.lambda$fetchChatsToAddToCommunity$252(this.f16724c, (TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
