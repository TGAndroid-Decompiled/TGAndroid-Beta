package org.telegram.messenger;

import java.util.ArrayList;
public final class r7 implements Runnable {
    public final int f19050a;
    public final MediaDataController f19051b;
    public final ArrayList f19052c;

    public r7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
        this.f19050a = i10;
        this.f19051b = mediaDataController;
        this.f19052c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19050a) {
            case 0:
                this.f19051b.lambda$loadRepliesOfDraftReplies$0(this.f19052c);
                return;
            default:
                this.f19051b.lambda$broadcastPinnedMessage$168(this.f19052c);
                return;
        }
    }
}
