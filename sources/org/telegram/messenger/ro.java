package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class ro {
    public final TL_communities.CommunityPeer f26327a;
    public final TLRPC.Chat f26328b;
    public final TLRPC.User f26329c;
    public final TLRPC.Dialog d;

    public ro(TLRPC.Chat chat, TLRPC.Dialog dialog, TLRPC.User user, TL_communities.CommunityPeer communityPeer) {
        this.f26327a = communityPeer;
        this.f26328b = chat;
        this.f26329c = user;
        this.d = dialog;
    }
}
