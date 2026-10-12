package org.telegram.messenger;

import java.util.ArrayList;
public final class u7 implements Runnable {
    public final int f19071a;
    public final MediaDataController f19072b;
    public final ArrayList f19073c;

    public u7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
        this.f19071a = i10;
        this.f19072b = mediaDataController;
        this.f19073c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19071a) {
            case 0:
                this.f19072b.lambda$loadRepliesOfDraftReplies$0(this.f19073c);
                return;
            default:
                this.f19072b.lambda$broadcastPinnedMessage$168(this.f19073c);
                return;
        }
    }
}
