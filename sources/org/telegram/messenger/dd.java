package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class dd implements Utilities.Callback2 {
    public final int f18173a;
    public final MessagesController f18174b;
    public final long f18175c;
    public final Utilities.Callback2 d;

    public dd(MessagesController messagesController, long j10, Utilities.Callback2 callback2, int i10) {
        this.f18173a = i10;
        this.f18174b = messagesController;
        this.f18175c = j10;
        this.d = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18173a) {
            case 0:
                this.f18174b.lambda$resolveCommunityAllJoinPendingRequests$249(this.f18175c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f18174b.lambda$resolveCommunityJoinPendingRequest$248(this.f18175c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f18174b.lambda$toggleCommunityParticipantBanned$247(this.f18175c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
