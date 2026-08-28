package gh;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d2 implements RequestDelegate {
    public final int f7952a;
    public final long f7953b;
    public final long f7954c;
    public final Object d;
    public final Object f7955e;

    public d2(Object obj, Object obj2, long j10, long j11, int i9) {
        this.f7952a = i9;
        this.d = obj;
        this.f7955e = obj2;
        this.f7953b = j10;
        this.f7954c = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f7952a) {
            case 0:
                k5.I0(this.f7953b, this.f7954c, (k5) this.d, (Utilities.Callback) this.f7955e, tLObject, tL_error);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$loadPinnedMessageInternal$164(this.f7953b, this.f7954c, (TLRPC.TL_channels_getMessages) this.f7955e, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.d).lambda$getMediaCounts$129((int[]) this.f7955e, this.f7953b, this.f7954c, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.d).lambda$requestContactToken$476((Utilities.Callback) this.f7955e, this.f7953b, this.f7954c, tLObject, tL_error);
                return;
            default:
                ((TopicsController) this.d).lambda$getTopicRepliesCount$30((TLRPC.TL_forumTopic) this.f7955e, this.f7953b, this.f7954c, tLObject, tL_error);
                return;
        }
    }

    public d2(MediaDataController mediaDataController, long j10, long j11, TLRPC.TL_channels_getMessages tL_channels_getMessages) {
        this.f7952a = 1;
        this.d = mediaDataController;
        this.f7953b = j10;
        this.f7954c = j11;
        this.f7955e = tL_channels_getMessages;
    }
}
