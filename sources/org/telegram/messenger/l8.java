package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class l8 implements Runnable {
    public final int f20852a = 0;
    public final ArrayList f20853b;
    public final long f20854c;
    public final int d;
    public final int f20855e;
    public final boolean f20856f;
    public final BaseController h;
    public final Object f20857n;

    public l8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i9, long j10, int i10, Runnable runnable) {
        this.h = mediaDataController;
        this.f20856f = z10;
        this.f20853b = arrayList;
        this.d = i9;
        this.f20854c = j10;
        this.f20855e = i10;
        this.f20857n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f20852a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f20856f, this.f20853b, this.d, this.f20854c, this.f20855e, (Runnable) this.f20857n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$21((LongSparseIntArray) this.f20857n, this.f20853b, this.f20854c, this.d, this.f20855e, this.f20856f);
                return;
        }
    }

    public l8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j10, int i9, int i10, boolean z10) {
        this.h = notificationsController;
        this.f20857n = longSparseIntArray;
        this.f20853b = arrayList;
        this.f20854c = j10;
        this.d = i9;
        this.f20855e = i10;
        this.f20856f = z10;
    }
}
