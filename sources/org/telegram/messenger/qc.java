package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class qc implements Utilities.Callback2 {
    public final int f21323a;
    public final MessagesController f21324b;
    public final long f21325c;
    public final Utilities.Callback2 d;

    public qc(MessagesController messagesController, long j10, Utilities.Callback2 callback2, int i9) {
        this.f21323a = i9;
        this.f21324b = messagesController;
        this.f21325c = j10;
        this.d = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f21323a) {
            case 0:
                this.f21324b.lambda$resolveCommunityAllJoinPendingRequests$250(this.f21325c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f21324b.lambda$resolveCommunityJoinPendingRequest$249(this.f21325c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f21324b.lambda$toggleCommunityParticipantBanned$248(this.f21325c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
