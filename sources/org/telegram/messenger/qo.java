package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class qo {
    public final TL_communities.CommunityPeer f26541a;
    public final TLRPC.Chat f26542b;
    public final TLRPC.User f26543c;
    public final TLRPC.Dialog d;

    public qo(TLRPC.Chat chat, TLRPC.Dialog dialog, TLRPC.User user, TL_communities.CommunityPeer communityPeer) {
        this.f26541a = communityPeer;
        this.f26542b = chat;
        this.f26543c = user;
        this.d = dialog;
    }
}
