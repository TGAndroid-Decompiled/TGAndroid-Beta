package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class uo {
    public final TL_communities.CommunityPeer f25880a;
    public final TLRPC.Chat f25881b;
    public final TLRPC.User f25882c;
    public final TLRPC.Dialog d;

    public uo(TLRPC.Chat chat, TLRPC.Dialog dialog, TLRPC.User user, TL_communities.CommunityPeer communityPeer) {
        this.f25880a = communityPeer;
        this.f25881b = chat;
        this.f25882c = user;
        this.d = dialog;
    }
}
