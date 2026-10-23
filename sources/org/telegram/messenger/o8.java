package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class o8 implements Runnable {
    public final int f19179a = 0;
    public final ArrayList f19180b;
    public final long f19181c;
    public final int d;
    public final int e;
    public final boolean f19182f;
    public final BaseController h;
    public final Object f19183n;

    public o8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j10, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f19182f = z10;
        this.f19180b = arrayList;
        this.d = i10;
        this.f19181c = j10;
        this.e = i11;
        this.f19183n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19179a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f19182f, this.f19180b, this.d, this.f19181c, this.e, (Runnable) this.f19183n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$22((LongSparseIntArray) this.f19183n, this.f19180b, this.f19181c, this.d, this.e, this.f19182f);
                return;
        }
    }

    public o8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j10, int i10, int i11, boolean z10) {
        this.h = notificationsController;
        this.f19183n = longSparseIntArray;
        this.f19180b = arrayList;
        this.f19181c = j10;
        this.d = i10;
        this.e = i11;
        this.f19182f = z10;
    }
}
