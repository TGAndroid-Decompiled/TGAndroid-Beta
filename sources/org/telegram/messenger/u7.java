package org.telegram.messenger;

import java.util.ArrayList;
public final class u7 implements Runnable {
    public final int f17653a;
    public final MediaDataController f17654b;
    public final ArrayList f17655c;

    public u7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
        this.f17653a = i10;
        this.f17654b = mediaDataController;
        this.f17655c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17653a) {
            case 0:
                this.f17654b.lambda$loadRepliesOfDraftReplies$0(this.f17655c);
                return;
            default:
                this.f17654b.lambda$broadcastPinnedMessage$168(this.f17655c);
                return;
        }
    }
}
