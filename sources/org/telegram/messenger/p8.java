package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class p8 implements Runnable {
    public final int f17252a = 0;
    public final ArrayList f17253b;
    public final long f17254c;
    public final int d;
    public final int e;
    public final boolean f17255f;
    public final BaseController h;
    public final Object f17256n;

    public p8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f17255f = z10;
        this.f17253b = arrayList;
        this.d = i10;
        this.f17254c = j3;
        this.e = i11;
        this.f17256n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17252a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f17255f, this.f17253b, this.d, this.f17254c, this.e, (Runnable) this.f17256n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$21((LongSparseIntArray) this.f17256n, this.f17253b, this.f17254c, this.d, this.e, this.f17255f);
                return;
        }
    }

    public p8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j3, int i10, int i11, boolean z10) {
        this.h = notificationsController;
        this.f17256n = longSparseIntArray;
        this.f17253b = arrayList;
        this.f17254c = j3;
        this.d = i10;
        this.e = i11;
        this.f17255f = z10;
    }
}
