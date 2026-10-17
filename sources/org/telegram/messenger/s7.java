package org.telegram.messenger;

import java.util.ArrayList;
public final class s7 implements Runnable {
    public final int f19475a;
    public final MediaDataController f19476b;
    public final ArrayList f19477c;

    public s7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
        this.f19475a = i10;
        this.f19476b = mediaDataController;
        this.f19477c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19475a) {
            case 0:
                this.f19476b.lambda$loadRepliesOfDraftReplies$0(this.f19477c);
                return;
            default:
                this.f19476b.lambda$broadcastPinnedMessage$168(this.f19477c);
                return;
        }
    }
}
