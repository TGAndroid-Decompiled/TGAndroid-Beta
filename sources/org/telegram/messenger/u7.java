package org.telegram.messenger;

import java.util.ArrayList;
public final class u7 implements Runnable {
    public final int f17621a;
    public final MediaDataController f17622b;
    public final ArrayList f17623c;

    public u7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
        this.f17621a = i10;
        this.f17622b = mediaDataController;
        this.f17623c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17621a) {
            case 0:
                this.f17622b.lambda$loadRepliesOfDraftReplies$0(this.f17623c);
                return;
            default:
                this.f17622b.lambda$broadcastPinnedMessage$168(this.f17623c);
                return;
        }
    }
}
