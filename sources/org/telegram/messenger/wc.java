package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class wc implements Utilities.Callback2 {
    public final int f22088a;
    public final MessagesController f22089b;
    public final long f22090c;
    public final Utilities.Callback2 d;

    public wc(MessagesController messagesController, long j10, Utilities.Callback2 callback2, int i10) {
        this.f22088a = i10;
        this.f22089b = messagesController;
        this.f22090c = j10;
        this.d = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f22088a) {
            case 0:
                this.f22089b.lambda$resolveCommunityAllJoinPendingRequests$250(this.f22090c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f22089b.lambda$resolveCommunityJoinPendingRequest$249(this.f22090c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f22089b.lambda$toggleCommunityParticipantBanned$248(this.f22090c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
