package ai;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a3 implements RequestDelegate {
    public final int f952a;
    public final long f953b;
    public final long f954c;
    public final Object d;
    public final Object e;

    public a3(Object obj, Object obj2, long j10, long j11, int i10) {
        this.f952a = i10;
        this.d = obj;
        this.e = obj2;
        this.f953b = j10;
        this.f954c = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f952a) {
            case 0:
                k7.f1(this.f953b, this.f954c, (k7) this.d, (Utilities.Callback) this.e, tLObject, tL_error);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$getMediaCounts$129((int[]) this.e, this.f953b, this.f954c, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.d).lambda$loadPinnedMessageInternal$164(this.f953b, this.f954c, (TLRPC.TL_channels_getMessages) this.e, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.d).lambda$requestContactToken$479((Utilities.Callback) this.e, this.f953b, this.f954c, tLObject, tL_error);
                return;
            default:
                ((TopicsController) this.d).lambda$getTopicRepliesCount$30((TLRPC.TL_forumTopic) this.e, this.f953b, this.f954c, tLObject, tL_error);
                return;
        }
    }

    public a3(MediaDataController mediaDataController, long j10, long j11, TLRPC.TL_channels_getMessages tL_channels_getMessages) {
        this.f952a = 2;
        this.d = mediaDataController;
        this.f953b = j10;
        this.f954c = j11;
        this.e = tL_channels_getMessages;
    }
}
