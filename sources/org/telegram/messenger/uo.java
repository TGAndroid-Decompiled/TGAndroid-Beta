package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class uo {
    public final TL_communities.CommunityPeer f25878a;
    public final TLRPC.Chat f25879b;
    public final TLRPC.User f25880c;
    public final TLRPC.Dialog d;

    public uo(TLRPC.Chat chat, TLRPC.Dialog dialog, TLRPC.User user, TL_communities.CommunityPeer communityPeer) {
        this.f25878a = communityPeer;
        this.f25879b = chat;
        this.f25880c = user;
        this.d = dialog;
    }
}
