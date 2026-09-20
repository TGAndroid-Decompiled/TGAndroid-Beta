package org.telegram.messenger;

import java.util.ArrayList;
public final class u7 implements Runnable {
    public final int f17658a;
    public final MediaDataController f17659b;
    public final ArrayList f17660c;

    public u7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
        this.f17658a = i10;
        this.f17659b = mediaDataController;
        this.f17660c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17658a) {
            case 0:
                this.f17659b.lambda$loadRepliesOfDraftReplies$0(this.f17660c);
                return;
            default:
                this.f17659b.lambda$broadcastPinnedMessage$168(this.f17660c);
                return;
        }
    }
}
