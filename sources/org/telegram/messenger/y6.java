package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y6 implements RequestDelegate {
    public final int f19710a;
    public final Object f19711b;
    public final long f19712c;
    public final long d;
    public final Object f19713e;

    public y6(Object obj, Object obj2, long j3, long j10, int i10) {
        this.f19710a = i10;
        this.f19711b = obj;
        this.f19713e = obj2;
        this.f19712c = j3;
        this.d = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19710a) {
            case 0:
                ((MediaDataController) this.f19711b).lambda$loadPinnedMessageInternal$164(this.f19712c, this.d, (TLRPC.TL_channels_getMessages) this.f19713e, tLObject, tL_error);
                return;
            case 1:
                ((MediaDataController) this.f19711b).lambda$getMediaCounts$129((int[]) this.f19713e, this.f19712c, this.d, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f19711b).lambda$requestContactToken$476((Utilities.Callback) this.f19713e, this.f19712c, this.d, tLObject, tL_error);
                return;
            case 3:
                ((TopicsController) this.f19711b).lambda$getTopicRepliesCount$30((TLRPC.TL_forumTopic) this.f19713e, this.f19712c, this.d, tLObject, tL_error);
                return;
            default:
                zh.w3 w3Var = (zh.w3) this.f19711b;
                zh.w3.J0(this.f19712c, this.d, (Utilities.Callback) this.f19713e, tLObject, tL_error, w3Var);
                return;
        }
    }

    public y6(MediaDataController mediaDataController, long j3, long j10, TLRPC.TL_channels_getMessages tL_channels_getMessages) {
        this.f19710a = 0;
        this.f19711b = mediaDataController;
        this.f19712c = j3;
        this.d = j10;
        this.f19713e = tL_channels_getMessages;
    }
}
