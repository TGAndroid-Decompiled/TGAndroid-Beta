package org.telegram.messenger;

import java.util.ArrayList;
public final class u7 implements Runnable {
    public final int f19648a;
    public final MediaDataController f19649b;
    public final ArrayList f19650c;

    public u7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
        this.f19648a = i10;
        this.f19649b = mediaDataController;
        this.f19650c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19648a) {
            case 0:
                this.f19649b.lambda$loadRepliesOfDraftReplies$0(this.f19650c);
                return;
            default:
                this.f19649b.lambda$broadcastPinnedMessage$168(this.f19650c);
                return;
        }
    }
}
