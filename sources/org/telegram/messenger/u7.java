package org.telegram.messenger;

import java.util.ArrayList;
public final class u7 implements Runnable {
    public final int f19072a;
    public final MediaDataController f19073b;
    public final ArrayList f19074c;

    public u7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
        this.f19072a = i10;
        this.f19073b = mediaDataController;
        this.f19074c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19072a) {
            case 0:
                this.f19073b.lambda$loadRepliesOfDraftReplies$0(this.f19074c);
                return;
            default:
                this.f19073b.lambda$broadcastPinnedMessage$168(this.f19074c);
                return;
        }
    }
}
