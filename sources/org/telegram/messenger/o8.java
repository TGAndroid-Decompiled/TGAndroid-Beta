package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class o8 implements Runnable {
    public final int f18543a = 0;
    public final ArrayList f18544b;
    public final long f18545c;
    public final int d;
    public final int f18546e;
    public final boolean f18547f;
    public final BaseController h;
    public final Object f18548n;

    public o8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f18547f = z10;
        this.f18544b = arrayList;
        this.d = i10;
        this.f18545c = j3;
        this.f18546e = i11;
        this.f18548n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18543a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f18547f, this.f18544b, this.d, this.f18545c, this.f18546e, (Runnable) this.f18548n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$21((LongSparseIntArray) this.f18548n, this.f18544b, this.f18545c, this.d, this.f18546e, this.f18547f);
                return;
        }
    }

    public o8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j3, int i10, int i11, boolean z10) {
        this.h = notificationsController;
        this.f18548n = longSparseIntArray;
        this.f18544b = arrayList;
        this.f18545c = j3;
        this.d = i10;
        this.f18546e = i11;
        this.f18547f = z10;
    }
}
