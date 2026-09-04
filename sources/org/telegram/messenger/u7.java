package org.telegram.messenger;

import java.util.ArrayList;
public final class u7 implements Runnable {
    public final int f19123a;
    public final MediaDataController f19124b;
    public final ArrayList f19125c;

    public u7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
        this.f19123a = i10;
        this.f19124b = mediaDataController;
        this.f19125c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19123a) {
            case 0:
                this.f19124b.lambda$loadRepliesOfDraftReplies$0(this.f19125c);
                return;
            default:
                this.f19124b.lambda$broadcastPinnedMessage$168(this.f19125c);
                return;
        }
    }
}
