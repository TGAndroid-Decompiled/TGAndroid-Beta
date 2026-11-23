package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class ro {
    public final TL_communities.CommunityPeer f26604a;
    public final TLRPC.Chat f26605b;
    public final TLRPC.User f26606c;
    public final TLRPC.Dialog d;

    public ro(TLRPC.Chat chat, TLRPC.Dialog dialog, TLRPC.User user, TL_communities.CommunityPeer communityPeer) {
        this.f26604a = communityPeer;
        this.f26605b = chat;
        this.f26606c = user;
        this.d = dialog;
    }
}
