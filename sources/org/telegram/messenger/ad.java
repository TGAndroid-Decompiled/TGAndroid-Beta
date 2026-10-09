package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ad implements Utilities.Callback2 {
    public final int f17329a;
    public final MessagesController f17330b;
    public final long f17331c;
    public final Utilities.Callback2 d;

    public ad(MessagesController messagesController, long j3, Utilities.Callback2 callback2, int i10) {
        this.f17329a = i10;
        this.f17330b = messagesController;
        this.f17331c = j3;
        this.d = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f17329a) {
            case 0:
                this.f17330b.lambda$resolveCommunityAllJoinPendingRequests$249(this.f17331c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f17330b.lambda$resolveCommunityJoinPendingRequest$248(this.f17331c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f17330b.lambda$toggleCommunityParticipantBanned$247(this.f17331c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
