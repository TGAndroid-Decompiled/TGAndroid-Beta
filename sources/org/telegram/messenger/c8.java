package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c8 implements RequestDelegate {
    public final int f17516a;
    public final Object f17517b;
    public final long f17518c;
    public final long d;
    public final Object f17519e;

    public c8(Object obj, Object obj2, long j3, long j10, int i10) {
        this.f17516a = i10;
        this.f17517b = obj;
        this.f17519e = obj2;
        this.f17518c = j3;
        this.d = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17516a) {
            case 0:
                ((MediaDataController) this.f17517b).lambda$getMediaCounts$129((int[]) this.f17519e, this.f17518c, this.d, tLObject, tL_error);
                return;
            case 1:
                ((MediaDataController) this.f17517b).lambda$loadPinnedMessageInternal$164(this.f17518c, this.d, (TLRPC.TL_channels_getMessages) this.f17519e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f17517b).lambda$requestContactToken$476((Utilities.Callback) this.f17519e, this.f17518c, this.d, tLObject, tL_error);
                return;
            case 3:
                ((TopicsController) this.f17517b).lambda$getTopicRepliesCount$30((TLRPC.TL_forumTopic) this.f17519e, this.f17518c, this.d, tLObject, tL_error);
                return;
            default:
                yh.y3 y3Var = (yh.y3) this.f17517b;
                yh.y3.J0(this.f17518c, this.d, (Utilities.Callback) this.f17519e, tLObject, tL_error, y3Var);
                return;
        }
    }

    public c8(MediaDataController mediaDataController, long j3, long j10, TLRPC.TL_channels_getMessages tL_channels_getMessages) {
        this.f17516a = 1;
        this.f17517b = mediaDataController;
        this.f17518c = j3;
        this.d = j10;
        this.f17519e = tL_channels_getMessages;
    }
}
