package org.telegram.messenger;

import java.util.ArrayList;
public final class t7 implements Runnable {
    public final int f19051a;
    public final MediaDataController f19052b;
    public final ArrayList f19053c;

    public t7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
        this.f19051a = i10;
        this.f19052b = mediaDataController;
        this.f19053c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19051a) {
            case 0:
                this.f19052b.lambda$loadRepliesOfDraftReplies$0(this.f19053c);
                return;
            default:
                this.f19052b.lambda$broadcastPinnedMessage$168(this.f19053c);
                return;
        }
    }
}
