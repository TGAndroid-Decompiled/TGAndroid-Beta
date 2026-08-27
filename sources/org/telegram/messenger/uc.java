package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class uc implements Utilities.Callback2 {

    public final int f21723a;

    public final MessagesController f21724b;

    public final long f21725c;
    public final Utilities.Callback2 d;

    public uc(MessagesController messagesController, long j10, Utilities.Callback2 callback2, int i10) {
        this.f21723a = i10;
        this.f21724b = messagesController;
        this.f21725c = j10;
        this.d = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f21723a) {
            case 0:
                this.f21724b.lambda$resolveCommunityAllJoinPendingRequests$250(this.f21725c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                this.f21724b.lambda$resolveCommunityJoinPendingRequest$249(this.f21725c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                this.f21724b.lambda$toggleCommunityParticipantBanned$248(this.f21725c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
