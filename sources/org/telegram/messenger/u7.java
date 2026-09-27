package org.telegram.messenger;

import java.util.ArrayList;
public final class u7 implements Runnable {
    public final int f17662a;
    public final MediaDataController f17663b;
    public final ArrayList f17664c;

    public u7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
        this.f17662a = i10;
        this.f17663b = mediaDataController;
        this.f17664c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17662a) {
            case 0:
                this.f17663b.lambda$loadRepliesOfDraftReplies$0(this.f17664c);
                return;
            default:
                this.f17663b.lambda$broadcastPinnedMessage$168(this.f17664c);
                return;
        }
    }
}
