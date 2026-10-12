package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f8 implements RequestDelegate {
    public final int f17589a;
    public final Object f17590b;
    public final long f17591c;
    public final long d;
    public final Object f17592e;

    public f8(Object obj, Object obj2, long j3, long j10, int i10) {
        this.f17589a = i10;
        this.f17590b = obj;
        this.f17592e = obj2;
        this.f17591c = j3;
        this.d = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17589a) {
            case 0:
                ((MediaDataController) this.f17590b).lambda$getMediaCounts$129((int[]) this.f17592e, this.f17591c, this.d, tLObject, tL_error);
                return;
            case 1:
                ((MediaDataController) this.f17590b).lambda$loadPinnedMessageInternal$164(this.f17591c, this.d, (TLRPC.TL_channels_getMessages) this.f17592e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f17590b).lambda$requestContactToken$479((Utilities.Callback) this.f17592e, this.f17591c, this.d, tLObject, tL_error);
                return;
            case 3:
                ((TopicsController) this.f17590b).lambda$getTopicRepliesCount$30((TLRPC.TL_forumTopic) this.f17592e, this.f17591c, this.d, tLObject, tL_error);
                return;
            default:
                yh.s3 s3Var = (yh.s3) this.f17590b;
                yh.s3.K0(this.f17591c, this.d, (Utilities.Callback) this.f17592e, tLObject, tL_error, s3Var);
                return;
        }
    }

    public f8(MediaDataController mediaDataController, long j3, long j10, TLRPC.TL_channels_getMessages tL_channels_getMessages) {
        this.f17589a = 1;
        this.f17590b = mediaDataController;
        this.f17591c = j3;
        this.d = j10;
        this.f17592e = tL_channels_getMessages;
    }
}
