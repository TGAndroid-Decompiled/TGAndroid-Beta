package org.telegram.messenger;

import java.util.ArrayList;
public final class w7 implements Runnable {
    public final int f20046a;
    public final MediaDataController f20047b;
    public final ArrayList f20048c;

    public w7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
        this.f20046a = i10;
        this.f20047b = mediaDataController;
        this.f20048c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20046a) {
            case 0:
                this.f20047b.lambda$loadRepliesOfDraftReplies$0(this.f20048c);
                return;
            default:
                this.f20047b.lambda$broadcastPinnedMessage$168(this.f20048c);
                return;
        }
    }
}
