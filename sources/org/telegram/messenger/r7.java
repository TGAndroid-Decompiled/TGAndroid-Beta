package org.telegram.messenger;

import java.util.ArrayList;
public final class r7 implements Runnable {
    public final int f17463a;
    public final MediaDataController f17464b;
    public final ArrayList f17465c;

    public r7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
        this.f17463a = i10;
        this.f17464b = mediaDataController;
        this.f17465c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17463a) {
            case 0:
                this.f17464b.lambda$loadRepliesOfDraftReplies$0(this.f17465c);
                return;
            default:
                this.f17464b.lambda$broadcastPinnedMessage$168(this.f17465c);
                return;
        }
    }
}
