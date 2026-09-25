package org.telegram.messenger;

import java.util.ArrayList;
public final class u7 implements Runnable {
    public final int f17668a;
    public final MediaDataController f17669b;
    public final ArrayList f17670c;

    public u7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
        this.f17668a = i10;
        this.f17669b = mediaDataController;
        this.f17670c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17668a) {
            case 0:
                this.f17669b.lambda$loadRepliesOfDraftReplies$0(this.f17670c);
                return;
            default:
                this.f17669b.lambda$broadcastPinnedMessage$168(this.f17670c);
                return;
        }
    }
}
