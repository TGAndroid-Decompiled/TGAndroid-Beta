package org.telegram.messenger;

import java.util.ArrayList;
public final class s7 implements Runnable {
    public final int f19473a;
    public final MediaDataController f19474b;
    public final ArrayList f19475c;

    public s7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
        this.f19473a = i10;
        this.f19474b = mediaDataController;
        this.f19475c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19473a) {
            case 0:
                this.f19474b.lambda$loadRepliesOfDraftReplies$0(this.f19475c);
                return;
            default:
                this.f19474b.lambda$broadcastPinnedMessage$168(this.f19475c);
                return;
        }
    }
}
