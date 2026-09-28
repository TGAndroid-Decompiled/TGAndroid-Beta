package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class k8 implements Runnable {
    public final int f16807a = 0;
    public final ArrayList f16808b;
    public final long f16809c;
    public final int d;
    public final int e;
    public final boolean f16810f;
    public final BaseController h;
    public final Object f16811n;

    public k8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f16810f = z10;
        this.f16808b = arrayList;
        this.d = i10;
        this.f16809c = j3;
        this.e = i11;
        this.f16811n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16807a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f16810f, this.f16808b, this.d, this.f16809c, this.e, (Runnable) this.f16811n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$21((LongSparseIntArray) this.f16811n, this.f16808b, this.f16809c, this.d, this.e, this.f16810f);
                return;
        }
    }

    public k8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j3, int i10, int i11, boolean z10) {
        this.h = notificationsController;
        this.f16811n = longSparseIntArray;
        this.f16808b = arrayList;
        this.f16809c = j3;
        this.d = i10;
        this.e = i11;
        this.f16810f = z10;
    }
}
