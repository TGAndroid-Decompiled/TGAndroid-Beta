package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class l8 implements Runnable {
    public final int f18851a = 0;
    public final ArrayList f18852b;
    public final long f18853c;
    public final int d;
    public final int e;
    public final boolean f18854f;
    public final BaseController h;
    public final Object f18855n;

    public l8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j10, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f18854f = z10;
        this.f18852b = arrayList;
        this.d = i10;
        this.f18853c = j10;
        this.e = i11;
        this.f18855n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18851a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f18854f, this.f18852b, this.d, this.f18853c, this.e, (Runnable) this.f18855n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$22((LongSparseIntArray) this.f18855n, this.f18852b, this.f18853c, this.d, this.e, this.f18854f);
                return;
        }
    }

    public l8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j10, int i10, int i11, boolean z10) {
        this.h = notificationsController;
        this.f18855n = longSparseIntArray;
        this.f18852b = arrayList;
        this.f18853c = j10;
        this.d = i10;
        this.e = i11;
        this.f18854f = z10;
    }
}
