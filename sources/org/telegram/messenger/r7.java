package org.telegram.messenger;

import java.util.ArrayList;
public final class r7 implements Runnable {
    public final int f19055a;
    public final MediaDataController f19056b;
    public final ArrayList f19057c;

    public r7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
        this.f19055a = i10;
        this.f19056b = mediaDataController;
        this.f19057c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19055a) {
            case 0:
                this.f19056b.lambda$loadRepliesOfDraftReplies$0(this.f19057c);
                return;
            default:
                this.f19056b.lambda$broadcastPinnedMessage$168(this.f19057c);
                return;
        }
    }
}
