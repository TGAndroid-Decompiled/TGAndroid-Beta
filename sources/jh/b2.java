package jh;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b2 implements RequestDelegate {
    public final int f11784a;
    public final long f11785b;
    public final long f11786c;
    public final Object d;
    public final Object f11787e;

    public b2(Object obj, Object obj2, long j10, long j11, int i10) {
        this.f11784a = i10;
        this.d = obj;
        this.f11787e = obj2;
        this.f11785b = j10;
        this.f11786c = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f11784a) {
            case 0:
                h5.J0(this.f11785b, this.f11786c, (h5) this.d, (Utilities.Callback) this.f11787e, tLObject, tL_error);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$loadPinnedMessageInternal$164(this.f11785b, this.f11786c, (TLRPC.TL_channels_getMessages) this.f11787e, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.d).lambda$getMediaCounts$129((int[]) this.f11787e, this.f11785b, this.f11786c, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.d).lambda$requestContactToken$476((Utilities.Callback) this.f11787e, this.f11785b, this.f11786c, tLObject, tL_error);
                return;
            default:
                ((TopicsController) this.d).lambda$getTopicRepliesCount$30((TLRPC.TL_forumTopic) this.f11787e, this.f11785b, this.f11786c, tLObject, tL_error);
                return;
        }
    }

    public b2(MediaDataController mediaDataController, long j10, long j11, TLRPC.TL_channels_getMessages tL_channels_getMessages) {
        this.f11784a = 1;
        this.d = mediaDataController;
        this.f11785b = j10;
        this.f11786c = j11;
        this.f11787e = tL_channels_getMessages;
    }
}
