package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y6 implements RequestDelegate {
    public final int f19737a;
    public final Object f19738b;
    public final long f19739c;
    public final long d;
    public final Object f19740e;

    public y6(Object obj, Object obj2, long j3, long j10, int i10) {
        this.f19737a = i10;
        this.f19738b = obj;
        this.f19740e = obj2;
        this.f19739c = j3;
        this.d = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19737a) {
            case 0:
                ((MediaDataController) this.f19738b).lambda$loadPinnedMessageInternal$164(this.f19739c, this.d, (TLRPC.TL_channels_getMessages) this.f19740e, tLObject, tL_error);
                return;
            case 1:
                ((MediaDataController) this.f19738b).lambda$getMediaCounts$129((int[]) this.f19740e, this.f19739c, this.d, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f19738b).lambda$requestContactToken$476((Utilities.Callback) this.f19740e, this.f19739c, this.d, tLObject, tL_error);
                return;
            case 3:
                ((TopicsController) this.f19738b).lambda$getTopicRepliesCount$30((TLRPC.TL_forumTopic) this.f19740e, this.f19739c, this.d, tLObject, tL_error);
                return;
            default:
                zh.w3 w3Var = (zh.w3) this.f19738b;
                zh.w3.J0(this.f19739c, this.d, (Utilities.Callback) this.f19740e, tLObject, tL_error, w3Var);
                return;
        }
    }

    public y6(MediaDataController mediaDataController, long j3, long j10, TLRPC.TL_channels_getMessages tL_channels_getMessages) {
        this.f19737a = 0;
        this.f19738b = mediaDataController;
        this.f19739c = j3;
        this.d = j10;
        this.f19740e = tL_channels_getMessages;
    }
}
