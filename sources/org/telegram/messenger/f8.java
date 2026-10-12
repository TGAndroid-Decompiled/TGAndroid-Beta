package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f8 implements RequestDelegate {
    public final int f17588a;
    public final Object f17589b;
    public final long f17590c;
    public final long d;
    public final Object f17591e;

    public f8(Object obj, Object obj2, long j3, long j10, int i10) {
        this.f17588a = i10;
        this.f17589b = obj;
        this.f17591e = obj2;
        this.f17590c = j3;
        this.d = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17588a) {
            case 0:
                ((MediaDataController) this.f17589b).lambda$getMediaCounts$129((int[]) this.f17591e, this.f17590c, this.d, tLObject, tL_error);
                return;
            case 1:
                ((MediaDataController) this.f17589b).lambda$loadPinnedMessageInternal$164(this.f17590c, this.d, (TLRPC.TL_channels_getMessages) this.f17591e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f17589b).lambda$requestContactToken$479((Utilities.Callback) this.f17591e, this.f17590c, this.d, tLObject, tL_error);
                return;
            case 3:
                ((TopicsController) this.f17589b).lambda$getTopicRepliesCount$30((TLRPC.TL_forumTopic) this.f17591e, this.f17590c, this.d, tLObject, tL_error);
                return;
            default:
                yh.s3 s3Var = (yh.s3) this.f17589b;
                yh.s3.K0(this.f17590c, this.d, (Utilities.Callback) this.f17591e, tLObject, tL_error, s3Var);
                return;
        }
    }

    public f8(MediaDataController mediaDataController, long j3, long j10, TLRPC.TL_channels_getMessages tL_channels_getMessages) {
        this.f17588a = 1;
        this.f17589b = mediaDataController;
        this.f17590c = j3;
        this.d = j10;
        this.f17591e = tL_channels_getMessages;
    }
}
