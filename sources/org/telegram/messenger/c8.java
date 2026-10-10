package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c8 implements RequestDelegate {
    public final int f17507a;
    public final Object f17508b;
    public final long f17509c;
    public final long d;
    public final Object f17510e;

    public c8(Object obj, Object obj2, long j3, long j10, int i10) {
        this.f17507a = i10;
        this.f17508b = obj;
        this.f17510e = obj2;
        this.f17509c = j3;
        this.d = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17507a) {
            case 0:
                ((MediaDataController) this.f17508b).lambda$getMediaCounts$129((int[]) this.f17510e, this.f17509c, this.d, tLObject, tL_error);
                return;
            case 1:
                ((MediaDataController) this.f17508b).lambda$loadPinnedMessageInternal$164(this.f17509c, this.d, (TLRPC.TL_channels_getMessages) this.f17510e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f17508b).lambda$requestContactToken$479((Utilities.Callback) this.f17510e, this.f17509c, this.d, tLObject, tL_error);
                return;
            case 3:
                ((TopicsController) this.f17508b).lambda$getTopicRepliesCount$30((TLRPC.TL_forumTopic) this.f17510e, this.f17509c, this.d, tLObject, tL_error);
                return;
            default:
                yh.s3 s3Var = (yh.s3) this.f17508b;
                yh.s3.K0(this.f17509c, this.d, (Utilities.Callback) this.f17510e, tLObject, tL_error, s3Var);
                return;
        }
    }

    public c8(MediaDataController mediaDataController, long j3, long j10, TLRPC.TL_channels_getMessages tL_channels_getMessages) {
        this.f17507a = 1;
        this.f17508b = mediaDataController;
        this.f17509c = j3;
        this.d = j10;
        this.f17510e = tL_channels_getMessages;
    }
}
