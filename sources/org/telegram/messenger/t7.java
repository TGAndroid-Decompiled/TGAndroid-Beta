package org.telegram.messenger;

import java.util.ArrayList;
public final class t7 implements Runnable {
    public final int f19078a;
    public final MediaDataController f19079b;
    public final ArrayList f19080c;

    public t7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
        this.f19078a = i10;
        this.f19079b = mediaDataController;
        this.f19080c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19078a) {
            case 0:
                this.f19079b.lambda$loadRepliesOfDraftReplies$0(this.f19080c);
                return;
            default:
                this.f19079b.lambda$broadcastPinnedMessage$168(this.f19080c);
                return;
        }
    }
}
