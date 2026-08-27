package org.telegram.messenger;

import java.util.ArrayList;

public final class u7 implements Runnable {

    public final int f21699a;

    public final MediaDataController f21700b;

    public final ArrayList f21701c;

    public u7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
        this.f21699a = i10;
        this.f21700b = mediaDataController;
        this.f21701c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f21699a) {
            case 0:
                this.f21700b.lambda$loadRepliesOfDraftReplies$0(this.f21701c);
                break;
            default:
                this.f21700b.lambda$broadcastPinnedMessage$168(this.f21701c);
                break;
        }
    }
}
