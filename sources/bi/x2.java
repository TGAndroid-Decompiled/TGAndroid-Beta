package bi;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x2 implements RequestDelegate {
    public final int f5667a;
    public final long f5668b;
    public final long f5669c;
    public final Object d;
    public final Object e;

    public x2(Object obj, Object obj2, long j10, long j11, int i10) {
        this.f5667a = i10;
        this.d = obj;
        this.e = obj2;
        this.f5668b = j10;
        this.f5669c = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f5667a) {
            case 0:
                h7.F0(this.f5668b, this.f5669c, (h7) this.d, (Utilities.Callback) this.e, tLObject, tL_error);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$getMediaCounts$129((int[]) this.e, this.f5668b, this.f5669c, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.d).lambda$loadPinnedMessageInternal$164(this.f5668b, this.f5669c, (TLRPC.TL_channels_getMessages) this.e, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.d).lambda$requestContactToken$482((Utilities.Callback) this.e, this.f5668b, this.f5669c, tLObject, tL_error);
                return;
            default:
                ((TopicsController) this.d).lambda$getTopicRepliesCount$30((TLRPC.TL_forumTopic) this.e, this.f5668b, this.f5669c, tLObject, tL_error);
                return;
        }
    }

    public x2(MediaDataController mediaDataController, long j10, long j11, TLRPC.TL_channels_getMessages tL_channels_getMessages) {
        this.f5667a = 2;
        this.d = mediaDataController;
        this.f5668b = j10;
        this.f5669c = j11;
        this.e = tL_channels_getMessages;
    }
}
