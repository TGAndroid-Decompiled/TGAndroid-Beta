package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class qo {
    public final TL_communities.CommunityPeer f26457a;
    public final TLRPC.Chat f26458b;
    public final TLRPC.User f26459c;
    public final TLRPC.Dialog d;

    public qo(TLRPC.Chat chat, TLRPC.Dialog dialog, TLRPC.User user, TL_communities.CommunityPeer communityPeer) {
        this.f26457a = communityPeer;
        this.f26458b = chat;
        this.f26459c = user;
        this.d = dialog;
    }
}
