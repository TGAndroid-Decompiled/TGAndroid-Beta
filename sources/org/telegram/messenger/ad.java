package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ad implements Utilities.Callback2 {
    public final int f17333a;
    public final MessagesController f17334b;
    public final long f17335c;
    public final Utilities.Callback2 d;

    public ad(MessagesController messagesController, long j3, Utilities.Callback2 callback2, int i10) {
        this.f17333a = i10;
        this.f17334b = messagesController;
        this.f17335c = j3;
        this.d = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f17333a) {
            case 0:
                this.f17334b.lambda$resolveCommunityAllJoinPendingRequests$249(this.f17335c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f17334b.lambda$resolveCommunityJoinPendingRequest$248(this.f17335c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f17334b.lambda$toggleCommunityParticipantBanned$247(this.f17335c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
