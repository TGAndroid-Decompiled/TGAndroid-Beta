package ai;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b3 implements RequestDelegate {
    public final int f1028a;
    public final long f1029b;
    public final long f1030c;
    public final Object d;
    public final Object e;

    public b3(Object obj, Object obj2, long j10, long j11, int i10) {
        this.f1028a = i10;
        this.d = obj;
        this.e = obj2;
        this.f1029b = j10;
        this.f1030c = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1028a) {
            case 0:
                l7.G0(this.f1029b, this.f1030c, (l7) this.d, (Utilities.Callback) this.e, tLObject, tL_error);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$getMediaCounts$129((int[]) this.e, this.f1029b, this.f1030c, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.d).lambda$loadPinnedMessageInternal$164(this.f1029b, this.f1030c, (TLRPC.TL_channels_getMessages) this.e, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.d).lambda$requestContactToken$479((Utilities.Callback) this.e, this.f1029b, this.f1030c, tLObject, tL_error);
                return;
            default:
                ((TopicsController) this.d).lambda$getTopicRepliesCount$30((TLRPC.TL_forumTopic) this.e, this.f1029b, this.f1030c, tLObject, tL_error);
                return;
        }
    }

    public b3(MediaDataController mediaDataController, long j10, long j11, TLRPC.TL_channels_getMessages tL_channels_getMessages) {
        this.f1028a = 2;
        this.d = mediaDataController;
        this.f1029b = j10;
        this.f1030c = j11;
        this.e = tL_channels_getMessages;
    }
}
