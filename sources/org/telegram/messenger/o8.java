package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;

public final class o8 implements Runnable {

    public final int f21133a = 0;

    public final ArrayList f21134b;

    public final long f21135c;
    public final int d;

    public final int f21136e;

    public final boolean f21137f;
    public final BaseController h;

    public final Object f21138n;

    public o8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j10, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f21137f = z10;
        this.f21134b = arrayList;
        this.d = i10;
        this.f21135c = j10;
        this.f21136e = i11;
        this.f21138n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f21133a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f21137f, this.f21134b, this.d, this.f21135c, this.f21136e, (Runnable) this.f21138n);
                break;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$21((LongSparseIntArray) this.f21138n, this.f21134b, this.f21135c, this.d, this.f21136e, this.f21137f);
                break;
        }
    }

    public o8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j10, int i10, int i11, boolean z10) {
        this.h = notificationsController;
        this.f21138n = longSparseIntArray;
        this.f21134b = arrayList;
        this.f21135c = j10;
        this.d = i10;
        this.f21136e = i11;
        this.f21137f = z10;
    }
}
