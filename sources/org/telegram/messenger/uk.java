package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class uk implements Runnable {
    public final int f21469a;
    public final BaseController f21470b;
    public final long f21471c;
    public final Object d;

    public uk(BaseController baseController, long j10, Object obj, int i10) {
        this.f21469a = i10;
        this.f21470b = baseController;
        this.f21471c = j10;
        this.d = obj;
    }

    @Override
    public final void run() {
        switch (this.f21469a) {
            case 0:
                ((TopicsController) this.f21470b).lambda$loadTopics$4(this.f21471c, (TLRPC.TL_messages_savedDialogsNotModified) this.d);
                return;
            case 1:
                ((TopicsController) this.f21470b).lambda$updateTopicsWithDeletedMessages$10((ArrayList) this.d, this.f21471c);
                return;
            case 2:
                ((TranslateController) this.f21470b).lambda$setDialogTranslateTo$0(this.f21471c, (String) this.d);
                return;
            default:
                ((TranslateController) this.f21470b).lambda$invalidateTranslation$9((MessageObject) this.d, this.f21471c);
                return;
        }
    }

    public uk(BaseController baseController, Object obj, long j10, int i10) {
        this.f21469a = i10;
        this.f21470b = baseController;
        this.d = obj;
        this.f21471c = j10;
    }
}
