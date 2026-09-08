package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class o8 implements Runnable {
    public final int f18570a = 0;
    public final ArrayList f18571b;
    public final long f18572c;
    public final int d;
    public final int f18573e;
    public final boolean f18574f;
    public final BaseController h;
    public final Object f18575n;

    public o8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f18574f = z10;
        this.f18571b = arrayList;
        this.d = i10;
        this.f18572c = j3;
        this.f18573e = i11;
        this.f18575n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18570a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f18574f, this.f18571b, this.d, this.f18572c, this.f18573e, (Runnable) this.f18575n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$21((LongSparseIntArray) this.f18575n, this.f18571b, this.f18572c, this.d, this.f18573e, this.f18574f);
                return;
        }
    }

    public o8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j3, int i10, int i11, boolean z10) {
        this.h = notificationsController;
        this.f18575n = longSparseIntArray;
        this.f18571b = arrayList;
        this.f18572c = j3;
        this.d = i10;
        this.f18573e = i11;
        this.f18574f = z10;
    }
}
