package org.telegram.messenger;

import java.util.ArrayList;
public final class s7 implements Runnable {
    public final int f19476a;
    public final MediaDataController f19477b;
    public final ArrayList f19478c;

    public s7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
        this.f19476a = i10;
        this.f19477b = mediaDataController;
        this.f19478c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19476a) {
            case 0:
                this.f19477b.lambda$loadRepliesOfDraftReplies$0(this.f19478c);
                return;
            default:
                this.f19477b.lambda$broadcastPinnedMessage$168(this.f19478c);
                return;
        }
    }
}
