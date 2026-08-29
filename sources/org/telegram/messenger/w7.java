package org.telegram.messenger;

import java.util.ArrayList;
public final class w7 implements Runnable {
    public final int f22064a;
    public final MediaDataController f22065b;
    public final ArrayList f22066c;

    public w7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
        this.f22064a = i10;
        this.f22065b = mediaDataController;
        this.f22066c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f22064a) {
            case 0:
                this.f22065b.lambda$loadRepliesOfDraftReplies$0(this.f22066c);
                return;
            default:
                this.f22065b.lambda$broadcastPinnedMessage$168(this.f22066c);
                return;
        }
    }
}
