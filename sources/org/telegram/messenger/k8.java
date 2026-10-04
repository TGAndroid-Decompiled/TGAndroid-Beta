package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class k8 implements Runnable {
    public final int f18337a = 0;
    public final ArrayList f18338b;
    public final long f18339c;
    public final int d;
    public final int f18340e;
    public final boolean f18341f;
    public final BaseController h;
    public final Object f18342n;

    public k8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f18341f = z10;
        this.f18338b = arrayList;
        this.d = i10;
        this.f18339c = j3;
        this.f18340e = i11;
        this.f18342n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18337a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f18341f, this.f18338b, this.d, this.f18339c, this.f18340e, (Runnable) this.f18342n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$21((LongSparseIntArray) this.f18342n, this.f18338b, this.f18339c, this.d, this.f18340e, this.f18341f);
                return;
        }
    }

    public k8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j3, int i10, int i11, boolean z10) {
        this.h = notificationsController;
        this.f18342n = longSparseIntArray;
        this.f18338b = arrayList;
        this.f18339c = j3;
        this.d = i10;
        this.f18340e = i11;
        this.f18341f = z10;
    }
}
