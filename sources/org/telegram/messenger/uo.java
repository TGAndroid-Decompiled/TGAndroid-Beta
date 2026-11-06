package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class uo {
    public final TL_communities.CommunityPeer f25870a;
    public final TLRPC.Chat f25871b;
    public final TLRPC.User f25872c;
    public final TLRPC.Dialog d;

    public uo(TLRPC.Chat chat, TLRPC.Dialog dialog, TLRPC.User user, TL_communities.CommunityPeer communityPeer) {
        this.f25870a = communityPeer;
        this.f25871b = chat;
        this.f25872c = user;
        this.d = dialog;
    }
}
