package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c8 implements RequestDelegate {
    public final int f17513a;
    public final Object f17514b;
    public final long f17515c;
    public final long d;
    public final Object f17516e;

    public c8(Object obj, Object obj2, long j3, long j10, int i10) {
        this.f17513a = i10;
        this.f17514b = obj;
        this.f17516e = obj2;
        this.f17515c = j3;
        this.d = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17513a) {
            case 0:
                ((MediaDataController) this.f17514b).lambda$getMediaCounts$129((int[]) this.f17516e, this.f17515c, this.d, tLObject, tL_error);
                return;
            case 1:
                ((MediaDataController) this.f17514b).lambda$loadPinnedMessageInternal$164(this.f17515c, this.d, (TLRPC.TL_channels_getMessages) this.f17516e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f17514b).lambda$requestContactToken$476((Utilities.Callback) this.f17516e, this.f17515c, this.d, tLObject, tL_error);
                return;
            case 3:
                ((TopicsController) this.f17514b).lambda$getTopicRepliesCount$30((TLRPC.TL_forumTopic) this.f17516e, this.f17515c, this.d, tLObject, tL_error);
                return;
            default:
                yh.x3 x3Var = (yh.x3) this.f17514b;
                yh.x3.J0(this.f17515c, this.d, (Utilities.Callback) this.f17516e, tLObject, tL_error, x3Var);
                return;
        }
    }

    public c8(MediaDataController mediaDataController, long j3, long j10, TLRPC.TL_channels_getMessages tL_channels_getMessages) {
        this.f17513a = 1;
        this.f17514b = mediaDataController;
        this.f17515c = j3;
        this.d = j10;
        this.f17516e = tL_channels_getMessages;
    }
}
