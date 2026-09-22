package org.telegram.messenger;

import java.util.ArrayList;
public final class u7 implements Runnable {
    public final int f17436a;
    public final MediaDataController f17437b;
    public final ArrayList f17438c;

    public u7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
        this.f17436a = i10;
        this.f17437b = mediaDataController;
        this.f17438c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17436a) {
            case 0:
                this.f17437b.lambda$loadRepliesOfDraftReplies$0(this.f17438c);
                return;
            default:
                this.f17437b.lambda$broadcastPinnedMessage$168(this.f17438c);
                return;
        }
    }
}
