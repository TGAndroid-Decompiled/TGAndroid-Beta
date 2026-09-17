package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class o8 implements Runnable {
    public final int f16926a = 0;
    public final ArrayList f16927b;
    public final long f16928c;
    public final int d;
    public final int e;
    public final boolean f16929f;
    public final BaseController h;
    public final Object f16930n;

    public o8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f16929f = z10;
        this.f16927b = arrayList;
        this.d = i10;
        this.f16928c = j3;
        this.e = i11;
        this.f16930n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16926a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f16929f, this.f16927b, this.d, this.f16928c, this.e, (Runnable) this.f16930n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$21((LongSparseIntArray) this.f16930n, this.f16927b, this.f16928c, this.d, this.e, this.f16929f);
                return;
        }
    }

    public o8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j3, int i10, int i11, boolean z10) {
        this.h = notificationsController;
        this.f16930n = longSparseIntArray;
        this.f16927b = arrayList;
        this.f16928c = j3;
        this.d = i10;
        this.e = i11;
        this.f16929f = z10;
    }
}
