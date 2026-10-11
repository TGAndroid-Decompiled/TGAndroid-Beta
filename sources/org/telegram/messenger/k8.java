package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class k8 implements Runnable {
    public final int f18332a = 0;
    public final ArrayList f18333b;
    public final long f18334c;
    public final int d;
    public final int f18335e;
    public final boolean f18336f;
    public final BaseController h;
    public final Object f18337n;

    public k8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f18336f = z10;
        this.f18333b = arrayList;
        this.d = i10;
        this.f18334c = j3;
        this.f18335e = i11;
        this.f18337n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18332a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f18336f, this.f18333b, this.d, this.f18334c, this.f18335e, (Runnable) this.f18337n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$22((LongSparseIntArray) this.f18337n, this.f18333b, this.f18334c, this.d, this.f18335e, this.f18336f);
                return;
        }
    }

    public k8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j3, int i10, int i11, boolean z10) {
        this.h = notificationsController;
        this.f18337n = longSparseIntArray;
        this.f18333b = arrayList;
        this.f18334c = j3;
        this.d = i10;
        this.f18335e = i11;
        this.f18336f = z10;
    }
}
