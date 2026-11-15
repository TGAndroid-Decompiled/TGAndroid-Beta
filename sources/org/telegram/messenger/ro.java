package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class ro {
    public final TL_communities.CommunityPeer f26319a;
    public final TLRPC.Chat f26320b;
    public final TLRPC.User f26321c;
    public final TLRPC.Dialog d;

    public ro(TLRPC.Chat chat, TLRPC.Dialog dialog, TLRPC.User user, TL_communities.CommunityPeer communityPeer) {
        this.f26319a = communityPeer;
        this.f26320b = chat;
        this.f26321c = user;
        this.d = dialog;
    }
}
