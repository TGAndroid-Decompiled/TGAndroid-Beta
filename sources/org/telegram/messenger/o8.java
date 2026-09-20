package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class o8 implements Runnable {
    public final int f17140a = 0;
    public final ArrayList f17141b;
    public final long f17142c;
    public final int d;
    public final int e;
    public final boolean f17143f;
    public final BaseController h;
    public final Object f17144n;

    public o8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f17143f = z10;
        this.f17141b = arrayList;
        this.d = i10;
        this.f17142c = j3;
        this.e = i11;
        this.f17144n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17140a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f17143f, this.f17141b, this.d, this.f17142c, this.e, (Runnable) this.f17144n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$21((LongSparseIntArray) this.f17144n, this.f17141b, this.f17142c, this.d, this.e, this.f17143f);
                return;
        }
    }

    public o8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j3, int i10, int i11, boolean z10) {
        this.h = notificationsController;
        this.f17144n = longSparseIntArray;
        this.f17141b = arrayList;
        this.f17142c = j3;
        this.d = i10;
        this.e = i11;
        this.f17143f = z10;
    }
}
