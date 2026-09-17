package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class n8 implements Runnable {
    public final int f18493a = 0;
    public final ArrayList f18494b;
    public final long f18495c;
    public final int d;
    public final int f18496e;
    public final boolean f18497f;
    public final BaseController h;
    public final Object f18498n;

    public n8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f18497f = z10;
        this.f18494b = arrayList;
        this.d = i10;
        this.f18495c = j3;
        this.f18496e = i11;
        this.f18498n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18493a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f18497f, this.f18494b, this.d, this.f18495c, this.f18496e, (Runnable) this.f18498n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$21((LongSparseIntArray) this.f18498n, this.f18494b, this.f18495c, this.d, this.f18496e, this.f18497f);
                return;
        }
    }

    public n8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j3, int i10, int i11, boolean z10) {
        this.h = notificationsController;
        this.f18498n = longSparseIntArray;
        this.f18494b = arrayList;
        this.f18495c = j3;
        this.d = i10;
        this.f18496e = i11;
        this.f18497f = z10;
    }
}
