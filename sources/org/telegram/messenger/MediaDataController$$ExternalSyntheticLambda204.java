package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;

public final class MediaDataController$$ExternalSyntheticLambda204 implements Runnable {
    public final int $r8$classId = 0;
    public final BaseController f$0;
    public final boolean f$1;
    public final ArrayList f$2;
    public final int f$3;
    public final long f$4;
    public final int f$5;
    public final Object f$6;

    public MediaDataController$$ExternalSyntheticLambda204(MediaDataController mediaDataController, boolean z, ArrayList arrayList, int i, long j, int i2, Runnable runnable) {
        this.f$0 = mediaDataController;
        this.f$1 = z;
        this.f$2 = arrayList;
        this.f$3 = i;
        this.f$4 = j;
        this.f$5 = i2;
        this.f$6 = runnable;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((MediaDataController) this.f$0).lambda$processLoadedStickers$107(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (Runnable) this.f$6);
                break;
            default:
                ((NotificationsController) this.f$0).lambda$processReadMessages$21((LongSparseIntArray) this.f$6, this.f$2, this.f$4, this.f$3, this.f$5, this.f$1);
                break;
        }
    }

    public MediaDataController$$ExternalSyntheticLambda204(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j, int i, int i2, boolean z) {
        this.f$0 = notificationsController;
        this.f$6 = longSparseIntArray;
        this.f$2 = arrayList;
        this.f$4 = j;
        this.f$3 = i;
        this.f$5 = i2;
        this.f$1 = z;
    }
}
