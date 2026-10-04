package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class k8 implements Runnable {
    public final int f18342a = 0;
    public final ArrayList f18343b;
    public final long f18344c;
    public final int d;
    public final int f18345e;
    public final boolean f18346f;
    public final BaseController h;
    public final Object f18347n;

    public k8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f18346f = z10;
        this.f18343b = arrayList;
        this.d = i10;
        this.f18344c = j3;
        this.f18345e = i11;
        this.f18347n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18342a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f18346f, this.f18343b, this.d, this.f18344c, this.f18345e, (Runnable) this.f18347n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$21((LongSparseIntArray) this.f18347n, this.f18343b, this.f18344c, this.d, this.f18345e, this.f18346f);
                return;
        }
    }

    public k8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j3, int i10, int i11, boolean z10) {
        this.h = notificationsController;
        this.f18347n = longSparseIntArray;
        this.f18343b = arrayList;
        this.f18344c = j3;
        this.d = i10;
        this.f18345e = i11;
        this.f18346f = z10;
    }
}
