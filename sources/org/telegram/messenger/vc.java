package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class vc implements Utilities.Callback2 {
    public final int f17535a;
    public final MessagesController f17536b;
    public final long f17537c;
    public final Utilities.Callback2 d;

    public vc(MessagesController messagesController, long j3, Utilities.Callback2 callback2, int i10) {
        this.f17535a = i10;
        this.f17536b = messagesController;
        this.f17537c = j3;
        this.d = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f17535a) {
            case 0:
                this.f17536b.lambda$resolveCommunityAllJoinPendingRequests$250(this.f17537c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f17536b.lambda$resolveCommunityJoinPendingRequest$249(this.f17537c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f17536b.lambda$toggleCommunityParticipantBanned$248(this.f17537c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
