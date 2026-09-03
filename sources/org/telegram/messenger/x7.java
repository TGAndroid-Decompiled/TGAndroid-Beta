package org.telegram.messenger;

import java.util.ArrayList;
public final class x7 implements Runnable {
    public final int f20608a;
    public final MediaDataController f20609b;
    public final ArrayList f20610c;

    public x7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
        this.f20608a = i10;
        this.f20609b = mediaDataController;
        this.f20610c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20608a) {
            case 0:
                this.f20609b.lambda$loadRepliesOfDraftReplies$0(this.f20610c);
                return;
            default:
                this.f20609b.lambda$broadcastPinnedMessage$168(this.f20610c);
                return;
        }
    }
}
