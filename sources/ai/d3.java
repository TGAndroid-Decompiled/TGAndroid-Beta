package ai;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d3 implements RequestDelegate {
    public final int f1128a;
    public final long f1129b;
    public final long f1130c;
    public final Object d;
    public final Object e;

    public d3(Object obj, Object obj2, long j10, long j11, int i10) {
        this.f1128a = i10;
        this.d = obj;
        this.e = obj2;
        this.f1129b = j10;
        this.f1130c = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1128a) {
            case 0:
                k7.W(this.f1129b, this.f1130c, (k7) this.d, (Utilities.Callback) this.e, tLObject, tL_error);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$getMediaCounts$129((int[]) this.e, this.f1129b, this.f1130c, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.d).lambda$loadPinnedMessageInternal$164(this.f1129b, this.f1130c, (TLRPC.TL_channels_getMessages) this.e, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.d).lambda$requestContactToken$479((Utilities.Callback) this.e, this.f1129b, this.f1130c, tLObject, tL_error);
                return;
            default:
                ((TopicsController) this.d).lambda$getTopicRepliesCount$30((TLRPC.TL_forumTopic) this.e, this.f1129b, this.f1130c, tLObject, tL_error);
                return;
        }
    }

    public d3(MediaDataController mediaDataController, long j10, long j11, TLRPC.TL_channels_getMessages tL_channels_getMessages) {
        this.f1128a = 2;
        this.d = mediaDataController;
        this.f1129b = j10;
        this.f1130c = j11;
        this.e = tL_channels_getMessages;
    }
}
