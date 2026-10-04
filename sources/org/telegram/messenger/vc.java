package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class vc implements Utilities.Callback2 {
    public final int f19413a;
    public final MessagesController f19414b;
    public final long f19415c;
    public final Utilities.Callback2 d;

    public vc(MessagesController messagesController, long j3, Utilities.Callback2 callback2, int i10) {
        this.f19413a = i10;
        this.f19414b = messagesController;
        this.f19415c = j3;
        this.d = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19413a) {
            case 0:
                this.f19414b.lambda$resolveCommunityAllJoinPendingRequests$250(this.f19415c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f19414b.lambda$resolveCommunityJoinPendingRequest$249(this.f19415c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f19414b.lambda$toggleCommunityParticipantBanned$248(this.f19415c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
