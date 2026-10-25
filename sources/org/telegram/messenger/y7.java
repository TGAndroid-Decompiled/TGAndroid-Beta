package org.telegram.messenger;

import java.util.ArrayList;
public final class y7 implements Runnable {
    public final int f21891a;
    public final MediaDataController f21892b;
    public final ArrayList f21893c;

    public y7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
        this.f21891a = i10;
        this.f21892b = mediaDataController;
        this.f21893c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f21891a) {
            case 0:
                this.f21892b.lambda$loadRepliesOfDraftReplies$0(this.f21893c);
                return;
            default:
                this.f21892b.lambda$broadcastPinnedMessage$168(this.f21893c);
                return;
        }
    }
}
