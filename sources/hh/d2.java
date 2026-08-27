package hh;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class d2 implements RequestDelegate {

    public final int f9115a;

    public final long f9116b;

    public final long f9117c;
    public final Object d;

    public final Object f9118e;

    public d2(Object obj, Object obj2, long j10, long j11, int i10) {
        this.f9115a = i10;
        this.d = obj;
        this.f9118e = obj2;
        this.f9116b = j10;
        this.f9117c = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9115a) {
            case 0:
                i5.J0(this.f9116b, this.f9117c, (i5) this.d, (Utilities.Callback) this.f9118e, tLObject, tL_error);
                break;
            case 1:
                ((MediaDataController) this.d).lambda$loadPinnedMessageInternal$164(this.f9116b, this.f9117c, (TLRPC.TL_channels_getMessages) this.f9118e, tLObject, tL_error);
                break;
            case 2:
                ((MediaDataController) this.d).lambda$getMediaCounts$129((int[]) this.f9118e, this.f9116b, this.f9117c, tLObject, tL_error);
                break;
            case 3:
                ((MessagesController) this.d).lambda$requestContactToken$476((Utilities.Callback) this.f9118e, this.f9116b, this.f9117c, tLObject, tL_error);
                break;
            default:
                ((TopicsController) this.d).lambda$getTopicRepliesCount$30((TLRPC.TL_forumTopic) this.f9118e, this.f9116b, this.f9117c, tLObject, tL_error);
                break;
        }
    }

    public d2(MediaDataController mediaDataController, long j10, long j11, TLRPC.TL_channels_getMessages tL_channels_getMessages) {
        this.f9115a = 1;
        this.d = mediaDataController;
        this.f9116b = j10;
        this.f9117c = j11;
        this.f9118e = tL_channels_getMessages;
    }
}
