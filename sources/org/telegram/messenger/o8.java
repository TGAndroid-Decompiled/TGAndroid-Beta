package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class o8 implements Runnable {
    public final int f19113a = 0;
    public final ArrayList f19114b;
    public final long f19115c;
    public final int d;
    public final int e;
    public final boolean f19116f;
    public final BaseController h;
    public final Object f19117n;

    public o8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j10, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f19116f = z10;
        this.f19114b = arrayList;
        this.d = i10;
        this.f19115c = j10;
        this.e = i11;
        this.f19117n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19113a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f19116f, this.f19114b, this.d, this.f19115c, this.e, (Runnable) this.f19117n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$22((LongSparseIntArray) this.f19117n, this.f19114b, this.f19115c, this.d, this.e, this.f19116f);
                return;
        }
    }

    public o8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j10, int i10, int i11, boolean z10) {
        this.h = notificationsController;
        this.f19117n = longSparseIntArray;
        this.f19114b = arrayList;
        this.f19115c = j10;
        this.d = i10;
        this.e = i11;
        this.f19116f = z10;
    }
}
