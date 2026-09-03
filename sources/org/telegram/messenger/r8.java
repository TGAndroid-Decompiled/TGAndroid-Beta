package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class r8 implements Runnable {
    public final int f18253a = 0;
    public final ArrayList f18254b;
    public final long f18255c;
    public final int d;
    public final int e;
    public final boolean f18256f;
    public final BaseController h;
    public final Object f18257n;

    public r8(MediaDataController mediaDataController, boolean z4, ArrayList arrayList, int i10, long j10, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f18256f = z4;
        this.f18254b = arrayList;
        this.d = i10;
        this.f18255c = j10;
        this.e = i11;
        this.f18257n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18253a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f18256f, this.f18254b, this.d, this.f18255c, this.e, (Runnable) this.f18257n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$21((LongSparseIntArray) this.f18257n, this.f18254b, this.f18255c, this.d, this.e, this.f18256f);
                return;
        }
    }

    public r8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j10, int i10, int i11, boolean z4) {
        this.h = notificationsController;
        this.f18257n = longSparseIntArray;
        this.f18254b = arrayList;
        this.f18255c = j10;
        this.d = i10;
        this.e = i11;
        this.f18256f = z4;
    }
}
