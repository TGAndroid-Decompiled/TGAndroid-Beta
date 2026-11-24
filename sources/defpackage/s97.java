package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class s97 {
    public final TL_communities.CommunityPeer a;
    public final TLRPC.Chat b;
    public final TLRPC.User c;
    public final TLRPC.Dialog d;

    public s97(TLRPC.Chat chat, TLRPC.Dialog dialog, TLRPC.User user, TL_communities.CommunityPeer communityPeer) {
        this.a = communityPeer;
        this.b = chat;
        this.c = user;
        this.d = dialog;
    }
}
