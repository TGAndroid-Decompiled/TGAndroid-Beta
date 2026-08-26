package org.telegram.messenger;

import java.util.ArrayList;

public final class MediaDataController$$ExternalSyntheticLambda221 implements Runnable {
    public final int $r8$classId;
    public final MediaDataController f$0;
    public final ArrayList f$1;
    public final int f$2;
    public final int f$3;

    public MediaDataController$$ExternalSyntheticLambda221(MediaDataController mediaDataController, ArrayList arrayList, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = mediaDataController;
        this.f$1 = arrayList;
        this.f$2 = i;
        this.f$3 = i2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadReactions$11(this.f$1, this.f$2, this.f$3);
                break;
            default:
                this.f$0.lambda$putReactionsToCache$16(this.f$1, this.f$2, this.f$3);
                break;
        }
    }
}
