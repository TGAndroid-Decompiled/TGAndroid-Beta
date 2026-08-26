package org.telegram.messenger;

import java.util.ArrayList;

public final class TopicsController$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId;
    public final TopicsController f$0;
    public final long f$1;
    public final ArrayList f$2;
    public final boolean f$3;
    public final long f$4;

    public TopicsController$$ExternalSyntheticLambda4(TopicsController topicsController, long j, ArrayList arrayList, boolean z, long j2, int i) {
        this.$r8$classId = i;
        this.f$0 = topicsController;
        this.f$1 = j;
        this.f$2 = arrayList;
        this.f$3 = z;
        this.f$4 = j2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$updateTopicsWithDeletedMessages$12(this.f$1, this.f$2, this.f$3, this.f$4);
                break;
            default:
                this.f$0.lambda$updateTopicsWithDeletedMessages$11(this.f$1, this.f$2, this.f$3, this.f$4);
                break;
        }
    }
}
