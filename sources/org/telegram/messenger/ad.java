package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ad implements Utilities.Callback2 {
    public final int f17872a;
    public final MessagesController f17873b;
    public final long f17874c;
    public final Utilities.Callback2 d;

    public ad(MessagesController messagesController, long j10, Utilities.Callback2 callback2, int i10) {
        this.f17872a = i10;
        this.f17873b = messagesController;
        this.f17874c = j10;
        this.d = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f17872a) {
            case 0:
                this.f17873b.lambda$resolveCommunityAllJoinPendingRequests$249(this.f17874c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f17873b.lambda$resolveCommunityJoinPendingRequest$248(this.f17874c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f17873b.lambda$toggleCommunityParticipantBanned$247(this.f17874c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
