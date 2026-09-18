package org.telegram.messenger;

import java.util.ArrayList;
public final class u7 implements Runnable {
    public final int f17447a;
    public final MediaDataController f17448b;
    public final ArrayList f17449c;

    public u7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
        this.f17447a = i10;
        this.f17448b = mediaDataController;
        this.f17449c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17447a) {
            case 0:
                this.f17448b.lambda$loadRepliesOfDraftReplies$0(this.f17449c);
                return;
            default:
                this.f17448b.lambda$broadcastPinnedMessage$168(this.f17449c);
                return;
        }
    }
}
