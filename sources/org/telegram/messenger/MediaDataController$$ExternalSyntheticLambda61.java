package org.telegram.messenger;

import java.util.ArrayList;

public final class MediaDataController$$ExternalSyntheticLambda61 implements Runnable {
    public final int $r8$classId = 1;
    public final MediaDataController f$0;
    public final boolean f$1;
    public final ArrayList f$2;
    public final int f$3;

    public MediaDataController$$ExternalSyntheticLambda61(MediaDataController mediaDataController, boolean z, int i, ArrayList arrayList) {
        this.f$0 = mediaDataController;
        this.f$1 = z;
        this.f$3 = i;
        this.f$2 = arrayList;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadRecents$48(this.f$1, this.f$2, this.f$3);
                break;
            default:
                this.f$0.lambda$processLoadedRecentDocuments$53(this.f$1, this.f$3, this.f$2);
                break;
        }
    }

    public MediaDataController$$ExternalSyntheticLambda61(MediaDataController mediaDataController, boolean z, ArrayList arrayList, int i) {
        this.f$0 = mediaDataController;
        this.f$1 = z;
        this.f$2 = arrayList;
        this.f$3 = i;
    }
}
