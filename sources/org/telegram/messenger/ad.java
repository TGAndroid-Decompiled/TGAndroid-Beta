package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ad implements Utilities.Callback2 {
    public final int f17328a;
    public final MessagesController f17329b;
    public final long f17330c;
    public final Utilities.Callback2 d;

    public ad(MessagesController messagesController, long j3, Utilities.Callback2 callback2, int i10) {
        this.f17328a = i10;
        this.f17329b = messagesController;
        this.f17330c = j3;
        this.d = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f17328a) {
            case 0:
                this.f17329b.lambda$resolveCommunityAllJoinPendingRequests$249(this.f17330c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f17329b.lambda$resolveCommunityJoinPendingRequest$248(this.f17330c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f17329b.lambda$toggleCommunityParticipantBanned$247(this.f17330c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
