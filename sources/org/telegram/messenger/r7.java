package org.telegram.messenger;

import java.util.ArrayList;
public final class r7 implements Runnable {
    public final int f19058a;
    public final MediaDataController f19059b;
    public final ArrayList f19060c;

    public r7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
        this.f19058a = i10;
        this.f19059b = mediaDataController;
        this.f19060c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19058a) {
            case 0:
                this.f19059b.lambda$loadRepliesOfDraftReplies$0(this.f19060c);
                return;
            default:
                this.f19059b.lambda$broadcastPinnedMessage$168(this.f19060c);
                return;
        }
    }
}
