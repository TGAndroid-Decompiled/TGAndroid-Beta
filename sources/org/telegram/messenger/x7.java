package org.telegram.messenger;

import java.util.ArrayList;
public final class x7 implements Runnable {
    public final int f18957a;
    public final MediaDataController f18958b;
    public final ArrayList f18959c;

    public x7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
        this.f18957a = i10;
        this.f18958b = mediaDataController;
        this.f18959c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18957a) {
            case 0:
                this.f18958b.lambda$loadRepliesOfDraftReplies$0(this.f18959c);
                return;
            default:
                this.f18958b.lambda$broadcastPinnedMessage$168(this.f18959c);
                return;
        }
    }
}
