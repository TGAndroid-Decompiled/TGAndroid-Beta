package org.telegram.messenger;

import java.util.ArrayList;
public final class x7 implements Runnable {
    public final int f18942a;
    public final MediaDataController f18943b;
    public final ArrayList f18944c;

    public x7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
        this.f18942a = i10;
        this.f18943b = mediaDataController;
        this.f18944c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18942a) {
            case 0:
                this.f18943b.lambda$loadRepliesOfDraftReplies$0(this.f18944c);
                return;
            default:
                this.f18943b.lambda$broadcastPinnedMessage$168(this.f18944c);
                return;
        }
    }
}
