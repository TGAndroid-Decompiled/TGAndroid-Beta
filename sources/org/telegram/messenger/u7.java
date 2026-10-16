package org.telegram.messenger;

import java.util.ArrayList;
public final class u7 implements Runnable {
    public final int f18261a;
    public final MediaDataController f18262b;
    public final ArrayList f18263c;

    public u7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
        this.f18261a = i10;
        this.f18262b = mediaDataController;
        this.f18263c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18261a) {
            case 0:
                this.f18262b.lambda$loadRepliesOfDraftReplies$0(this.f18263c);
                return;
            default:
                this.f18262b.lambda$broadcastPinnedMessage$168(this.f18263c);
                return;
        }
    }
}
