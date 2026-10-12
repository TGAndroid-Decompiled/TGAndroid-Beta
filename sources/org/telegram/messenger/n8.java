package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class n8 implements Runnable {
    public final int f18360a = 0;
    public final ArrayList f18361b;
    public final long f18362c;
    public final int d;
    public final int f18363e;
    public final boolean f18364f;
    public final BaseController h;
    public final Object f18365n;

    public n8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f18364f = z10;
        this.f18361b = arrayList;
        this.d = i10;
        this.f18362c = j3;
        this.f18363e = i11;
        this.f18365n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18360a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f18364f, this.f18361b, this.d, this.f18362c, this.f18363e, (Runnable) this.f18365n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$22((LongSparseIntArray) this.f18365n, this.f18361b, this.f18362c, this.d, this.f18363e, this.f18364f);
                return;
        }
    }

    public n8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j3, int i10, int i11, boolean z10) {
        this.h = notificationsController;
        this.f18365n = longSparseIntArray;
        this.f18361b = arrayList;
        this.f18362c = j3;
        this.d = i10;
        this.f18363e = i11;
        this.f18364f = z10;
    }
}
