package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class uo {
    public final TL_communities.CommunityPeer f25884a;
    public final TLRPC.Chat f25885b;
    public final TLRPC.User f25886c;
    public final TLRPC.Dialog d;

    public uo(TLRPC.Chat chat, TLRPC.Dialog dialog, TLRPC.User user, TL_communities.CommunityPeer communityPeer) {
        this.f25884a = communityPeer;
        this.f25885b = chat;
        this.f25886c = user;
        this.d = dialog;
    }
}
