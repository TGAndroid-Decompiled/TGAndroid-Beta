package org.telegram.messenger;

import java.util.ArrayList;
public final class r7 implements Runnable {
    public final int f21380a;
    public final MediaDataController f21381b;
    public final ArrayList f21382c;

    public r7(MediaDataController mediaDataController, ArrayList arrayList, int i9) {
        this.f21380a = i9;
        this.f21381b = mediaDataController;
        this.f21382c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f21380a) {
            case 0:
                this.f21381b.lambda$loadRepliesOfDraftReplies$0(this.f21382c);
                return;
            default:
                this.f21381b.lambda$broadcastPinnedMessage$168(this.f21382c);
                return;
        }
    }
}
