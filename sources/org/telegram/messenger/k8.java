package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class k8 implements Runnable {
    public final int f18763a = 0;
    public final ArrayList f18764b;
    public final long f18765c;
    public final int d;
    public final int e;
    public final boolean f18766f;
    public final BaseController h;
    public final Object f18767n;

    public k8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j10, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f18766f = z10;
        this.f18764b = arrayList;
        this.d = i10;
        this.f18765c = j10;
        this.e = i11;
        this.f18767n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18763a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f18766f, this.f18764b, this.d, this.f18765c, this.e, (Runnable) this.f18767n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$22((LongSparseIntArray) this.f18767n, this.f18764b, this.f18765c, this.d, this.e, this.f18766f);
                return;
        }
    }

    public k8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j10, int i10, int i11, boolean z10) {
        this.h = notificationsController;
        this.f18767n = longSparseIntArray;
        this.f18764b = arrayList;
        this.f18765c = j10;
        this.d = i10;
        this.e = i11;
        this.f18766f = z10;
    }
}
