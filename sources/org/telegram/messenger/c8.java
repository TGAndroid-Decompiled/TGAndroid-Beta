package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c8 implements RequestDelegate {
    public final int f17511a;
    public final Object f17512b;
    public final long f17513c;
    public final long d;
    public final Object f17514e;

    public c8(Object obj, Object obj2, long j3, long j10, int i10) {
        this.f17511a = i10;
        this.f17512b = obj;
        this.f17514e = obj2;
        this.f17513c = j3;
        this.d = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17511a) {
            case 0:
                ((MediaDataController) this.f17512b).lambda$getMediaCounts$129((int[]) this.f17514e, this.f17513c, this.d, tLObject, tL_error);
                return;
            case 1:
                ((MediaDataController) this.f17512b).lambda$loadPinnedMessageInternal$164(this.f17513c, this.d, (TLRPC.TL_channels_getMessages) this.f17514e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f17512b).lambda$requestContactToken$476((Utilities.Callback) this.f17514e, this.f17513c, this.d, tLObject, tL_error);
                return;
            case 3:
                ((TopicsController) this.f17512b).lambda$getTopicRepliesCount$30((TLRPC.TL_forumTopic) this.f17514e, this.f17513c, this.d, tLObject, tL_error);
                return;
            default:
                yh.x3 x3Var = (yh.x3) this.f17512b;
                yh.x3.J0(this.f17513c, this.d, (Utilities.Callback) this.f17514e, tLObject, tL_error, x3Var);
                return;
        }
    }

    public c8(MediaDataController mediaDataController, long j3, long j10, TLRPC.TL_channels_getMessages tL_channels_getMessages) {
        this.f17511a = 1;
        this.f17512b = mediaDataController;
        this.f17513c = j3;
        this.d = j10;
        this.f17514e = tL_channels_getMessages;
    }
}
