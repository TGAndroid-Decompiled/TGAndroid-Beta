package org.telegram.messenger;

import java.util.ArrayList;
public final class r7 implements Runnable {
    public final int f19022a;
    public final MediaDataController f19023b;
    public final ArrayList f19024c;

    public r7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
        this.f19022a = i10;
        this.f19023b = mediaDataController;
        this.f19024c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19022a) {
            case 0:
                this.f19023b.lambda$loadRepliesOfDraftReplies$0(this.f19024c);
                return;
            default:
                this.f19023b.lambda$broadcastPinnedMessage$168(this.f19024c);
                return;
        }
    }
}
