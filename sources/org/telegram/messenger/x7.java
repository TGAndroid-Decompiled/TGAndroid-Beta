package org.telegram.messenger;

import java.util.ArrayList;
public final class x7 implements Runnable {
    public final int f20058a;
    public final MediaDataController f20059b;
    public final ArrayList f20060c;

    public x7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
        this.f20058a = i10;
        this.f20059b = mediaDataController;
        this.f20060c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20058a) {
            case 0:
                this.f20059b.lambda$loadRepliesOfDraftReplies$0(this.f20060c);
                return;
            default:
                this.f20059b.lambda$broadcastPinnedMessage$168(this.f20060c);
                return;
        }
    }
}
