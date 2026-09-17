package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class uc implements Utilities.Callback2 {
    public final int f19187a;
    public final MessagesController f19188b;
    public final long f19189c;
    public final Utilities.Callback2 d;

    public uc(MessagesController messagesController, long j3, Utilities.Callback2 callback2, int i10) {
        this.f19187a = i10;
        this.f19188b = messagesController;
        this.f19189c = j3;
        this.d = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19187a) {
            case 0:
                this.f19188b.lambda$resolveCommunityAllJoinPendingRequests$250(this.f19189c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f19188b.lambda$resolveCommunityJoinPendingRequest$249(this.f19189c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f19188b.lambda$toggleCommunityParticipantBanned$248(this.f19189c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
