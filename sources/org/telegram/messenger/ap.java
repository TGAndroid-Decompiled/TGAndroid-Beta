package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class ap {
    public final TL_communities.CommunityPeer f14664a;
    public final TLRPC.Chat f14665b;
    public final TLRPC.User f14666c;
    public final TLRPC.Dialog d;

    public ap(TLRPC.Chat chat, TLRPC.Dialog dialog, TLRPC.User user, TL_communities.CommunityPeer communityPeer) {
        this.f14664a = communityPeer;
        this.f14665b = chat;
        this.f14666c = user;
        this.d = dialog;
    }
}
