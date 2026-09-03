package lh;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b2 implements RequestDelegate {
    public final int f12124a;
    public final long f12125b;
    public final long f12126c;
    public final Object d;
    public final Object e;

    public b2(Object obj, Object obj2, long j10, long j11, int i10) {
        this.f12124a = i10;
        this.d = obj;
        this.e = obj2;
        this.f12125b = j10;
        this.f12126c = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f12124a) {
            case 0:
                g5.J0(this.f12125b, this.f12126c, (g5) this.d, (Utilities.Callback) this.e, tLObject, tL_error);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$loadPinnedMessageInternal$164(this.f12125b, this.f12126c, (TLRPC.TL_channels_getMessages) this.e, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.d).lambda$getMediaCounts$129((int[]) this.e, this.f12125b, this.f12126c, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.d).lambda$requestContactToken$476((Utilities.Callback) this.e, this.f12125b, this.f12126c, tLObject, tL_error);
                return;
            default:
                ((TopicsController) this.d).lambda$getTopicRepliesCount$30((TLRPC.TL_forumTopic) this.e, this.f12125b, this.f12126c, tLObject, tL_error);
                return;
        }
    }

    public b2(MediaDataController mediaDataController, long j10, long j11, TLRPC.TL_channels_getMessages tL_channels_getMessages) {
        this.f12124a = 1;
        this.d = mediaDataController;
        this.f12125b = j10;
        this.f12126c = j11;
        this.e = tL_channels_getMessages;
    }
}
