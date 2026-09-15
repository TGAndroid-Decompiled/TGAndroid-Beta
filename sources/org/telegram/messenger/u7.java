package org.telegram.messenger;

import java.util.ArrayList;
public final class u7 implements Runnable {
    public final int f17438a;
    public final MediaDataController f17439b;
    public final ArrayList f17440c;

    public u7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
        this.f17438a = i10;
        this.f17439b = mediaDataController;
        this.f17440c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17438a) {
            case 0:
                this.f17439b.lambda$loadRepliesOfDraftReplies$0(this.f17440c);
                return;
            default:
                this.f17439b.lambda$broadcastPinnedMessage$168(this.f17440c);
                return;
        }
    }
}
