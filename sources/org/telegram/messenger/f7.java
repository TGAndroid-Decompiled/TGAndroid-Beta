package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f7 implements RequestDelegate {
    public final int f15146a;
    public final Object f15147b;
    public final long f15148c;
    public final long d;
    public final Object e;

    public f7(Object obj, Object obj2, long j3, long j10, int i10) {
        this.f15146a = i10;
        this.f15147b = obj;
        this.e = obj2;
        this.f15148c = j3;
        this.d = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15146a) {
            case 0:
                ((MediaDataController) this.f15147b).lambda$loadPinnedMessageInternal$164(this.f15148c, this.d, (TLRPC.TL_channels_getMessages) this.e, tLObject, tL_error);
                return;
            case 1:
                ((MediaDataController) this.f15147b).lambda$getMediaCounts$129((int[]) this.e, this.f15148c, this.d, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f15147b).lambda$requestContactToken$476((Utilities.Callback) this.e, this.f15148c, this.d, tLObject, tL_error);
                return;
            case 3:
                ((TopicsController) this.f15147b).lambda$getTopicRepliesCount$30((TLRPC.TL_forumTopic) this.e, this.f15148c, this.d, tLObject, tL_error);
                return;
            default:
                xh.x3 x3Var = (xh.x3) this.f15147b;
                xh.x3.J0(this.f15148c, this.d, (Utilities.Callback) this.e, tLObject, tL_error, x3Var);
                return;
        }
    }

    public f7(MediaDataController mediaDataController, long j3, long j10, TLRPC.TL_channels_getMessages tL_channels_getMessages) {
        this.f15146a = 0;
        this.f15147b = mediaDataController;
        this.f15148c = j3;
        this.d = j10;
        this.e = tL_channels_getMessages;
    }
}
