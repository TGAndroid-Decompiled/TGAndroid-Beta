package org.telegram.messenger;

import java.util.ArrayList;
public final class w7 implements Runnable {
    public final int f19981a;
    public final MediaDataController f19982b;
    public final ArrayList f19983c;

    public w7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
        this.f19981a = i10;
        this.f19982b = mediaDataController;
        this.f19983c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19981a) {
            case 0:
                this.f19982b.lambda$loadRepliesOfDraftReplies$0(this.f19983c);
                return;
            default:
                this.f19982b.lambda$broadcastPinnedMessage$168(this.f19983c);
                return;
        }
    }
}
