package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class o8 implements Runnable {
    public final int f17093a = 0;
    public final ArrayList f17094b;
    public final long f17095c;
    public final int d;
    public final int e;
    public final boolean f17096f;
    public final BaseController h;
    public final Object f17097n;

    public o8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f17096f = z10;
        this.f17094b = arrayList;
        this.d = i10;
        this.f17095c = j3;
        this.e = i11;
        this.f17097n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17093a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f17096f, this.f17094b, this.d, this.f17095c, this.e, (Runnable) this.f17097n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$21((LongSparseIntArray) this.f17097n, this.f17094b, this.f17095c, this.d, this.e, this.f17096f);
                return;
        }
    }

    public o8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j3, int i10, int i11, boolean z10) {
        this.h = notificationsController;
        this.f17097n = longSparseIntArray;
        this.f17094b = arrayList;
        this.f17095c = j3;
        this.d = i10;
        this.e = i11;
        this.f17096f = z10;
    }
}
