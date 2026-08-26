package org.telegram.messenger;

import java.util.ArrayList;

public final class MediaDataController$$ExternalSyntheticLambda70 implements Runnable {
    public final int $r8$classId;
    public final MediaDataController f$0;
    public final ArrayList f$1;

    public MediaDataController$$ExternalSyntheticLambda70(MediaDataController mediaDataController, ArrayList arrayList, int i) {
        this.$r8$classId = i;
        this.f$0 = mediaDataController;
        this.f$1 = arrayList;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$broadcastPinnedMessage$168(this.f$1);
                break;
            default:
                this.f$0.lambda$loadRepliesOfDraftReplies$0(this.f$1);
                break;
        }
    }
}
