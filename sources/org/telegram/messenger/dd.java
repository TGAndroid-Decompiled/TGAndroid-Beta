package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class dd implements Utilities.Callback2 {
    public final int f17406a;
    public final MessagesController f17407b;
    public final long f17408c;
    public final Utilities.Callback2 d;

    public dd(MessagesController messagesController, long j3, Utilities.Callback2 callback2, int i10) {
        this.f17406a = i10;
        this.f17407b = messagesController;
        this.f17408c = j3;
        this.d = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f17406a) {
            case 0:
                this.f17407b.lambda$resolveCommunityAllJoinPendingRequests$249(this.f17408c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f17407b.lambda$resolveCommunityJoinPendingRequest$248(this.f17408c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f17407b.lambda$toggleCommunityParticipantBanned$247(this.f17408c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
