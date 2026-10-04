package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c8 implements RequestDelegate {
    public final int f17514a;
    public final Object f17515b;
    public final long f17516c;
    public final long d;
    public final Object f17517e;

    public c8(Object obj, Object obj2, long j3, long j10, int i10) {
        this.f17514a = i10;
        this.f17515b = obj;
        this.f17517e = obj2;
        this.f17516c = j3;
        this.d = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17514a) {
            case 0:
                ((MediaDataController) this.f17515b).lambda$getMediaCounts$129((int[]) this.f17517e, this.f17516c, this.d, tLObject, tL_error);
                return;
            case 1:
                ((MediaDataController) this.f17515b).lambda$loadPinnedMessageInternal$164(this.f17516c, this.d, (TLRPC.TL_channels_getMessages) this.f17517e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f17515b).lambda$requestContactToken$476((Utilities.Callback) this.f17517e, this.f17516c, this.d, tLObject, tL_error);
                return;
            case 3:
                ((TopicsController) this.f17515b).lambda$getTopicRepliesCount$30((TLRPC.TL_forumTopic) this.f17517e, this.f17516c, this.d, tLObject, tL_error);
                return;
            default:
                yh.x3 x3Var = (yh.x3) this.f17515b;
                yh.x3.J0(this.f17516c, this.d, (Utilities.Callback) this.f17517e, tLObject, tL_error, x3Var);
                return;
        }
    }

    public c8(MediaDataController mediaDataController, long j3, long j10, TLRPC.TL_channels_getMessages tL_channels_getMessages) {
        this.f17514a = 1;
        this.f17515b = mediaDataController;
        this.f17516c = j3;
        this.d = j10;
        this.f17517e = tL_channels_getMessages;
    }
}
