package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class qo {
    public final TL_communities.CommunityPeer f26431a;
    public final TLRPC.Chat f26432b;
    public final TLRPC.User f26433c;
    public final TLRPC.Dialog d;

    public qo(TLRPC.Chat chat, TLRPC.Dialog dialog, TLRPC.User user, TL_communities.CommunityPeer communityPeer) {
        this.f26431a = communityPeer;
        this.f26432b = chat;
        this.f26433c = user;
        this.d = dialog;
    }
}
