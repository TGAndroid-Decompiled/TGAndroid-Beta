package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class o8 implements Runnable {
    public final int f17155a = 0;
    public final ArrayList f17156b;
    public final long f17157c;
    public final int d;
    public final int e;
    public final boolean f17158f;
    public final BaseController h;
    public final Object f17159n;

    public o8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f17158f = z10;
        this.f17156b = arrayList;
        this.d = i10;
        this.f17157c = j3;
        this.e = i11;
        this.f17159n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17155a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f17158f, this.f17156b, this.d, this.f17157c, this.e, (Runnable) this.f17159n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$21((LongSparseIntArray) this.f17159n, this.f17156b, this.f17157c, this.d, this.e, this.f17158f);
                return;
        }
    }

    public o8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j3, int i10, int i11, boolean z10) {
        this.h = notificationsController;
        this.f17159n = longSparseIntArray;
        this.f17156b = arrayList;
        this.f17157c = j3;
        this.d = i10;
        this.e = i11;
        this.f17158f = z10;
    }
}
