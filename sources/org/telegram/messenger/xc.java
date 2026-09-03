package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class xc implements Utilities.Callback2 {
    public final int f20632a;
    public final MessagesController f20633b;
    public final long f20634c;
    public final Utilities.Callback2 d;

    public xc(MessagesController messagesController, long j10, Utilities.Callback2 callback2, int i10) {
        this.f20632a = i10;
        this.f20633b = messagesController;
        this.f20634c = j10;
        this.d = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f20632a) {
            case 0:
                this.f20633b.lambda$resolveCommunityAllJoinPendingRequests$250(this.f20634c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f20633b.lambda$resolveCommunityJoinPendingRequest$249(this.f20634c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f20633b.lambda$toggleCommunityParticipantBanned$248(this.f20634c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
