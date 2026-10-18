package org.telegram.messenger;

import java.util.ArrayList;
public final class t7 implements Runnable {
    public final int f19558a;
    public final MediaDataController f19559b;
    public final ArrayList f19560c;

    public t7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
        this.f19558a = i10;
        this.f19559b = mediaDataController;
        this.f19560c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19558a) {
            case 0:
                this.f19559b.lambda$loadRepliesOfDraftReplies$0(this.f19560c);
                return;
            default:
                this.f19559b.lambda$broadcastPinnedMessage$168(this.f19560c);
                return;
        }
    }
}
