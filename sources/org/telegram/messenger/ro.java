package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class ro {
    public final TL_communities.CommunityPeer f26640a;
    public final TLRPC.Chat f26641b;
    public final TLRPC.User f26642c;
    public final TLRPC.Dialog d;

    public ro(TLRPC.Chat chat, TLRPC.Dialog dialog, TLRPC.User user, TL_communities.CommunityPeer communityPeer) {
        this.f26640a = communityPeer;
        this.f26641b = chat;
        this.f26642c = user;
        this.d = dialog;
    }
}
