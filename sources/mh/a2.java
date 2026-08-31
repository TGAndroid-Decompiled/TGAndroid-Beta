package mh;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a2 implements RequestDelegate {
    public final int f13677a;
    public final long f13678b;
    public final long f13679c;
    public final Object d;
    public final Object f13680e;

    public a2(Object obj, Object obj2, long j10, long j11, int i10) {
        this.f13677a = i10;
        this.d = obj;
        this.f13680e = obj2;
        this.f13678b = j10;
        this.f13679c = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f13677a) {
            case 0:
                g5.J0(this.f13678b, this.f13679c, (g5) this.d, (Utilities.Callback) this.f13680e, tLObject, tL_error);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$loadPinnedMessageInternal$164(this.f13678b, this.f13679c, (TLRPC.TL_channels_getMessages) this.f13680e, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.d).lambda$getMediaCounts$129((int[]) this.f13680e, this.f13678b, this.f13679c, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.d).lambda$requestContactToken$476((Utilities.Callback) this.f13680e, this.f13678b, this.f13679c, tLObject, tL_error);
                return;
            default:
                ((TopicsController) this.d).lambda$getTopicRepliesCount$30((TLRPC.TL_forumTopic) this.f13680e, this.f13678b, this.f13679c, tLObject, tL_error);
                return;
        }
    }

    public a2(MediaDataController mediaDataController, long j10, long j11, TLRPC.TL_channels_getMessages tL_channels_getMessages) {
        this.f13677a = 1;
        this.d = mediaDataController;
        this.f13678b = j10;
        this.f13679c = j11;
        this.f13680e = tL_channels_getMessages;
    }
}
