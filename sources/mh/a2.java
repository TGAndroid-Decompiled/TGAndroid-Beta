package mh;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a2 implements RequestDelegate {
    public final int f13679a;
    public final long f13680b;
    public final long f13681c;
    public final Object d;
    public final Object f13682e;

    public a2(Object obj, Object obj2, long j10, long j11, int i10) {
        this.f13679a = i10;
        this.d = obj;
        this.f13682e = obj2;
        this.f13680b = j10;
        this.f13681c = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f13679a) {
            case 0:
                g5.J0(this.f13680b, this.f13681c, (g5) this.d, (Utilities.Callback) this.f13682e, tLObject, tL_error);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$loadPinnedMessageInternal$164(this.f13680b, this.f13681c, (TLRPC.TL_channels_getMessages) this.f13682e, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.d).lambda$getMediaCounts$129((int[]) this.f13682e, this.f13680b, this.f13681c, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.d).lambda$requestContactToken$476((Utilities.Callback) this.f13682e, this.f13680b, this.f13681c, tLObject, tL_error);
                return;
            default:
                ((TopicsController) this.d).lambda$getTopicRepliesCount$30((TLRPC.TL_forumTopic) this.f13682e, this.f13680b, this.f13681c, tLObject, tL_error);
                return;
        }
    }

    public a2(MediaDataController mediaDataController, long j10, long j11, TLRPC.TL_channels_getMessages tL_channels_getMessages) {
        this.f13679a = 1;
        this.d = mediaDataController;
        this.f13680b = j10;
        this.f13681c = j11;
        this.f13682e = tL_channels_getMessages;
    }
}
