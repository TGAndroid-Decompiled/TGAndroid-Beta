package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c8 implements RequestDelegate {
    public final int f16065a;
    public final Object f16066b;
    public final long f16067c;
    public final long d;
    public final Object e;

    public c8(Object obj, Object obj2, long j3, long j10, int i10) {
        this.f16065a = i10;
        this.f16066b = obj;
        this.e = obj2;
        this.f16067c = j3;
        this.d = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16065a) {
            case 0:
                ((MediaDataController) this.f16066b).lambda$getMediaCounts$129((int[]) this.e, this.f16067c, this.d, tLObject, tL_error);
                return;
            case 1:
                ((MediaDataController) this.f16066b).lambda$loadPinnedMessageInternal$164(this.f16067c, this.d, (TLRPC.TL_channels_getMessages) this.e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f16066b).lambda$requestContactToken$476((Utilities.Callback) this.e, this.f16067c, this.d, tLObject, tL_error);
                return;
            case 3:
                ((TopicsController) this.f16066b).lambda$getTopicRepliesCount$30((TLRPC.TL_forumTopic) this.e, this.f16067c, this.d, tLObject, tL_error);
                return;
            default:
                yh.x3 x3Var = (yh.x3) this.f16066b;
                yh.x3.J0(this.f16067c, this.d, (Utilities.Callback) this.e, tLObject, tL_error, x3Var);
                return;
        }
    }

    public c8(MediaDataController mediaDataController, long j3, long j10, TLRPC.TL_channels_getMessages tL_channels_getMessages) {
        this.f16065a = 1;
        this.f16066b = mediaDataController;
        this.f16067c = j3;
        this.d = j10;
        this.e = tL_channels_getMessages;
    }
}
