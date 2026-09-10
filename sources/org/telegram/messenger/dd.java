package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class dd implements Utilities.Callback2 {
    public final int f15004a;
    public final MessagesController f15005b;
    public final long f15006c;
    public final Utilities.Callback2 d;

    public dd(MessagesController messagesController, long j3, Utilities.Callback2 callback2, int i10) {
        this.f15004a = i10;
        this.f15005b = messagesController;
        this.f15006c = j3;
        this.d = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f15004a) {
            case 0:
                this.f15005b.lambda$resolveCommunityAllJoinPendingRequests$250(this.f15006c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f15005b.lambda$resolveCommunityJoinPendingRequest$249(this.f15006c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f15005b.lambda$toggleCommunityParticipantBanned$248(this.f15006c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
