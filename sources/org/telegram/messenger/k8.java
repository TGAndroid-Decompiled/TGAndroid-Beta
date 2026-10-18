package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class k8 implements Runnable {
    public final int f18770a = 0;
    public final ArrayList f18771b;
    public final long f18772c;
    public final int d;
    public final int e;
    public final boolean f18773f;
    public final BaseController h;
    public final Object f18774n;

    public k8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j10, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f18773f = z10;
        this.f18771b = arrayList;
        this.d = i10;
        this.f18772c = j10;
        this.e = i11;
        this.f18774n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18770a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f18773f, this.f18771b, this.d, this.f18772c, this.e, (Runnable) this.f18774n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$22((LongSparseIntArray) this.f18774n, this.f18771b, this.f18772c, this.d, this.e, this.f18773f);
                return;
        }
    }

    public k8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j10, int i10, int i11, boolean z10) {
        this.h = notificationsController;
        this.f18774n = longSparseIntArray;
        this.f18771b = arrayList;
        this.f18772c = j10;
        this.d = i10;
        this.e = i11;
        this.f18773f = z10;
    }
}
