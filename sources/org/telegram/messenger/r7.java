package org.telegram.messenger;

import java.util.ArrayList;
public final class r7 implements Runnable {
    public final int f19060a;
    public final MediaDataController f19061b;
    public final ArrayList f19062c;

    public r7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
        this.f19060a = i10;
        this.f19061b = mediaDataController;
        this.f19062c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19060a) {
            case 0:
                this.f19061b.lambda$loadRepliesOfDraftReplies$0(this.f19062c);
                return;
            default:
                this.f19061b.lambda$broadcastPinnedMessage$168(this.f19062c);
                return;
        }
    }
}
