package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class k8 implements Runnable {
    public final int f16808a = 0;
    public final ArrayList f16809b;
    public final long f16810c;
    public final int d;
    public final int e;
    public final boolean f16811f;
    public final BaseController h;
    public final Object f16812n;

    public k8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f16811f = z10;
        this.f16809b = arrayList;
        this.d = i10;
        this.f16810c = j3;
        this.e = i11;
        this.f16812n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16808a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f16811f, this.f16809b, this.d, this.f16810c, this.e, (Runnable) this.f16812n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$21((LongSparseIntArray) this.f16812n, this.f16809b, this.f16810c, this.d, this.e, this.f16811f);
                return;
        }
    }

    public k8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j3, int i10, int i11, boolean z10) {
        this.h = notificationsController;
        this.f16812n = longSparseIntArray;
        this.f16809b = arrayList;
        this.f16810c = j3;
        this.d = i10;
        this.e = i11;
        this.f16811f = z10;
    }
}
