package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f8 implements RequestDelegate {
    public final int f17230a;
    public final Object f17231b;
    public final long f17232c;
    public final long d;
    public final Object e;

    public f8(Object obj, Object obj2, long j10, long j11, int i10) {
        this.f17230a = i10;
        this.f17231b = obj;
        this.e = obj2;
        this.f17232c = j10;
        this.d = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17230a) {
            case 0:
                ((MediaDataController) this.f17231b).lambda$getMediaCounts$129((int[]) this.e, this.f17232c, this.d, tLObject, tL_error);
                return;
            case 1:
                ((MediaDataController) this.f17231b).lambda$loadPinnedMessageInternal$164(this.f17232c, this.d, (TLRPC.TL_channels_getMessages) this.e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f17231b).lambda$requestContactToken$479((Utilities.Callback) this.e, this.f17232c, this.d, tLObject, tL_error);
                return;
            case 3:
                ((TopicsController) this.f17231b).lambda$getTopicRepliesCount$30((TLRPC.TL_forumTopic) this.e, this.f17232c, this.d, tLObject, tL_error);
                return;
            default:
                zh.r3 r3Var = (zh.r3) this.f17231b;
                zh.r3.K0(this.f17232c, this.d, (Utilities.Callback) this.e, tLObject, tL_error, r3Var);
                return;
        }
    }

    public f8(MediaDataController mediaDataController, long j10, long j11, TLRPC.TL_channels_getMessages tL_channels_getMessages) {
        this.f17230a = 1;
        this.f17231b = mediaDataController;
        this.f17232c = j10;
        this.d = j11;
        this.e = tL_channels_getMessages;
    }
}
