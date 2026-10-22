package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class p8 implements Runnable {
    public final int f19181a = 0;
    public final ArrayList f19182b;
    public final long f19183c;
    public final int d;
    public final int e;
    public final boolean f19184f;
    public final BaseController h;
    public final Object f19185n;

    public p8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j10, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f19184f = z10;
        this.f19182b = arrayList;
        this.d = i10;
        this.f19183c = j10;
        this.e = i11;
        this.f19185n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19181a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f19184f, this.f19182b, this.d, this.f19183c, this.e, (Runnable) this.f19185n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$22((LongSparseIntArray) this.f19185n, this.f19182b, this.f19183c, this.d, this.e, this.f19184f);
                return;
        }
    }

    public p8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j10, int i10, int i11, boolean z10) {
        this.h = notificationsController;
        this.f19185n = longSparseIntArray;
        this.f19182b = arrayList;
        this.f19183c = j10;
        this.d = i10;
        this.e = i11;
        this.f19184f = z10;
    }
}
