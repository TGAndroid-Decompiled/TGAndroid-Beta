package org.telegram.messenger;

import java.util.ArrayList;
public final class r7 implements Runnable {
    public final int f19015a;
    public final MediaDataController f19016b;
    public final ArrayList f19017c;

    public r7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
        this.f19015a = i10;
        this.f19016b = mediaDataController;
        this.f19017c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19015a) {
            case 0:
                this.f19016b.lambda$loadRepliesOfDraftReplies$0(this.f19017c);
                return;
            default:
                this.f19016b.lambda$broadcastPinnedMessage$168(this.f19017c);
                return;
        }
    }
}
