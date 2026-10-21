package org.telegram.messenger;

import java.util.ArrayList;
public final class u7 implements Runnable {
    public final int f19645a;
    public final MediaDataController f19646b;
    public final ArrayList f19647c;

    public u7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
        this.f19645a = i10;
        this.f19646b = mediaDataController;
        this.f19647c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19645a) {
            case 0:
                this.f19646b.lambda$loadRepliesOfDraftReplies$0(this.f19647c);
                return;
            default:
                this.f19646b.lambda$broadcastPinnedMessage$168(this.f19647c);
                return;
        }
    }
}
