package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class lo {
    public final TL_communities.CommunityPeer f24091a;
    public final TLRPC.Chat f24092b;
    public final TLRPC.User f24093c;
    public final TLRPC.Dialog d;

    public lo(TLRPC.Chat chat, TLRPC.Dialog dialog, TLRPC.User user, TL_communities.CommunityPeer communityPeer) {
        this.f24091a = communityPeer;
        this.f24092b = chat;
        this.f24093c = user;
        this.d = dialog;
    }
}
