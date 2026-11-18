package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class qo {
    public final TL_communities.CommunityPeer f26429a;
    public final TLRPC.Chat f26430b;
    public final TLRPC.User f26431c;
    public final TLRPC.Dialog d;

    public qo(TLRPC.Chat chat, TLRPC.Dialog dialog, TLRPC.User user, TL_communities.CommunityPeer communityPeer) {
        this.f26429a = communityPeer;
        this.f26430b = chat;
        this.f26431c = user;
        this.d = dialog;
    }
}
