package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class n8 implements Runnable {
    public final int f18361a = 0;
    public final ArrayList f18362b;
    public final long f18363c;
    public final int d;
    public final int f18364e;
    public final boolean f18365f;
    public final BaseController h;
    public final Object f18366n;

    public n8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f18365f = z10;
        this.f18362b = arrayList;
        this.d = i10;
        this.f18363c = j3;
        this.f18364e = i11;
        this.f18366n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18361a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f18365f, this.f18362b, this.d, this.f18363c, this.f18364e, (Runnable) this.f18366n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$22((LongSparseIntArray) this.f18366n, this.f18362b, this.f18363c, this.d, this.f18364e, this.f18365f);
                return;
        }
    }

    public n8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j3, int i10, int i11, boolean z10) {
        this.h = notificationsController;
        this.f18366n = longSparseIntArray;
        this.f18362b = arrayList;
        this.f18363c = j3;
        this.d = i10;
        this.f18364e = i11;
        this.f18365f = z10;
    }
}
