package org.telegram.messenger;

import java.util.ArrayList;
public final class u7 implements Runnable {
    public final int f17673a;
    public final MediaDataController f17674b;
    public final ArrayList f17675c;

    public u7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
        this.f17673a = i10;
        this.f17674b = mediaDataController;
        this.f17675c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17673a) {
            case 0:
                this.f17674b.lambda$loadRepliesOfDraftReplies$0(this.f17675c);
                return;
            default:
                this.f17674b.lambda$broadcastPinnedMessage$168(this.f17675c);
                return;
        }
    }
}
