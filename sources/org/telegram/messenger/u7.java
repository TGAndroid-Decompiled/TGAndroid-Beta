package org.telegram.messenger;

import java.util.ArrayList;
public final class u7 implements Runnable {
    public final int f19150a;
    public final MediaDataController f19151b;
    public final ArrayList f19152c;

    public u7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
        this.f19150a = i10;
        this.f19151b = mediaDataController;
        this.f19152c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19150a) {
            case 0:
                this.f19151b.lambda$loadRepliesOfDraftReplies$0(this.f19152c);
                return;
            default:
                this.f19151b.lambda$broadcastPinnedMessage$168(this.f19152c);
                return;
        }
    }
}
