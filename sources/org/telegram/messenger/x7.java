package org.telegram.messenger;

import java.util.ArrayList;
public final class x7 implements Runnable {
    public final int f20606a;
    public final MediaDataController f20607b;
    public final ArrayList f20608c;

    public x7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
        this.f20606a = i10;
        this.f20607b = mediaDataController;
        this.f20608c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20606a) {
            case 0:
                this.f20607b.lambda$loadRepliesOfDraftReplies$0(this.f20608c);
                return;
            default:
                this.f20607b.lambda$broadcastPinnedMessage$168(this.f20608c);
                return;
        }
    }
}
