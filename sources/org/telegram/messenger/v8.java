package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class v8 implements Runnable {
    public final int f16571a = 0;
    public final ArrayList f16572b;
    public final long f16573c;
    public final int d;
    public final int e;
    public final boolean f16574f;
    public final BaseController h;
    public final Object f16575n;

    public v8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f16574f = z10;
        this.f16572b = arrayList;
        this.d = i10;
        this.f16573c = j3;
        this.e = i11;
        this.f16575n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16571a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f16574f, this.f16572b, this.d, this.f16573c, this.e, (Runnable) this.f16575n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$21((LongSparseIntArray) this.f16575n, this.f16572b, this.f16573c, this.d, this.e, this.f16574f);
                return;
        }
    }

    public v8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j3, int i10, int i11, boolean z10) {
        this.h = notificationsController;
        this.f16575n = longSparseIntArray;
        this.f16572b = arrayList;
        this.f16573c = j3;
        this.d = i10;
        this.e = i11;
        this.f16574f = z10;
    }
}
