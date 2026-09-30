package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class k8 implements Runnable {
    public final int f16824a = 0;
    public final ArrayList f16825b;
    public final long f16826c;
    public final int d;
    public final int e;
    public final boolean f16827f;
    public final BaseController h;
    public final Object f16828n;

    public k8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f16827f = z10;
        this.f16825b = arrayList;
        this.d = i10;
        this.f16826c = j3;
        this.e = i11;
        this.f16828n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16824a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f16827f, this.f16825b, this.d, this.f16826c, this.e, (Runnable) this.f16828n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$21((LongSparseIntArray) this.f16828n, this.f16825b, this.f16826c, this.d, this.e, this.f16827f);
                return;
        }
    }

    public k8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j3, int i10, int i11, boolean z10) {
        this.h = notificationsController;
        this.f16828n = longSparseIntArray;
        this.f16825b = arrayList;
        this.f16826c = j3;
        this.d = i10;
        this.e = i11;
        this.f16827f = z10;
    }
}
