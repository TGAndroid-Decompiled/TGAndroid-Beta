package org.telegram.messenger;

import java.util.ArrayList;
public final class x7 implements Runnable {
    public final int f20123a;
    public final MediaDataController f20124b;
    public final ArrayList f20125c;

    public x7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
        this.f20123a = i10;
        this.f20124b = mediaDataController;
        this.f20125c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20123a) {
            case 0:
                this.f20124b.lambda$loadRepliesOfDraftReplies$0(this.f20125c);
                return;
            default:
                this.f20124b.lambda$broadcastPinnedMessage$168(this.f20125c);
                return;
        }
    }
}
