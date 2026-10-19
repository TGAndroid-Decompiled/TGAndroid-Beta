package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class l8 implements Runnable {
    public final int f18854a = 0;
    public final ArrayList f18855b;
    public final long f18856c;
    public final int d;
    public final int e;
    public final boolean f18857f;
    public final BaseController h;
    public final Object f18858n;

    public l8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j10, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f18857f = z10;
        this.f18855b = arrayList;
        this.d = i10;
        this.f18856c = j10;
        this.e = i11;
        this.f18858n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18854a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f18857f, this.f18855b, this.d, this.f18856c, this.e, (Runnable) this.f18858n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$22((LongSparseIntArray) this.f18858n, this.f18855b, this.f18856c, this.d, this.e, this.f18857f);
                return;
        }
    }

    public l8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j10, int i10, int i11, boolean z10) {
        this.h = notificationsController;
        this.f18858n = longSparseIntArray;
        this.f18855b = arrayList;
        this.f18856c = j10;
        this.d = i10;
        this.e = i11;
        this.f18857f = z10;
    }
}
