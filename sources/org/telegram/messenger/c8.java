package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c8 implements RequestDelegate {
    public final int f17505a;
    public final Object f17506b;
    public final long f17507c;
    public final long d;
    public final Object f17508e;

    public c8(Object obj, Object obj2, long j3, long j10, int i10) {
        this.f17505a = i10;
        this.f17506b = obj;
        this.f17508e = obj2;
        this.f17507c = j3;
        this.d = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17505a) {
            case 0:
                ((MediaDataController) this.f17506b).lambda$getMediaCounts$129((int[]) this.f17508e, this.f17507c, this.d, tLObject, tL_error);
                return;
            case 1:
                ((MediaDataController) this.f17506b).lambda$loadPinnedMessageInternal$164(this.f17507c, this.d, (TLRPC.TL_channels_getMessages) this.f17508e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f17506b).lambda$requestContactToken$479((Utilities.Callback) this.f17508e, this.f17507c, this.d, tLObject, tL_error);
                return;
            case 3:
                ((TopicsController) this.f17506b).lambda$getTopicRepliesCount$30((TLRPC.TL_forumTopic) this.f17508e, this.f17507c, this.d, tLObject, tL_error);
                return;
            default:
                yh.s3 s3Var = (yh.s3) this.f17506b;
                yh.s3.K0(this.f17507c, this.d, (Utilities.Callback) this.f17508e, tLObject, tL_error, s3Var);
                return;
        }
    }

    public c8(MediaDataController mediaDataController, long j3, long j10, TLRPC.TL_channels_getMessages tL_channels_getMessages) {
        this.f17505a = 1;
        this.f17506b = mediaDataController;
        this.f17507c = j3;
        this.d = j10;
        this.f17508e = tL_channels_getMessages;
    }
}
