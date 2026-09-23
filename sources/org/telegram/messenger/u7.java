package org.telegram.messenger;

import java.util.ArrayList;
public final class u7 implements Runnable {
    public final int f17421a;
    public final MediaDataController f17422b;
    public final ArrayList f17423c;

    public u7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
        this.f17421a = i10;
        this.f17422b = mediaDataController;
        this.f17423c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17421a) {
            case 0:
                this.f17422b.lambda$loadRepliesOfDraftReplies$0(this.f17423c);
                return;
            default:
                this.f17422b.lambda$broadcastPinnedMessage$168(this.f17423c);
                return;
        }
    }
}
