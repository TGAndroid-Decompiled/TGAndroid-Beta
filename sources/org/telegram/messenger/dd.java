package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class dd implements Utilities.Callback2 {
    public final int f16773a;
    public final MessagesController f16774b;
    public final long f16775c;
    public final Utilities.Callback2 d;

    public dd(MessagesController messagesController, long j10, Utilities.Callback2 callback2, int i10) {
        this.f16773a = i10;
        this.f16774b = messagesController;
        this.f16775c = j10;
        this.d = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f16773a) {
            case 0:
                this.f16774b.lambda$resolveCommunityAllJoinPendingRequests$249(this.f16775c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f16774b.lambda$resolveCommunityJoinPendingRequest$248(this.f16775c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f16774b.lambda$toggleCommunityParticipantBanned$247(this.f16775c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
