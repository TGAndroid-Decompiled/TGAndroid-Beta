package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class p8 implements Runnable {
    public final int f17267a = 0;
    public final ArrayList f17268b;
    public final long f17269c;
    public final int d;
    public final int e;
    public final boolean f17270f;
    public final BaseController h;
    public final Object f17271n;

    public p8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f17270f = z10;
        this.f17268b = arrayList;
        this.d = i10;
        this.f17269c = j3;
        this.e = i11;
        this.f17271n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17267a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f17270f, this.f17268b, this.d, this.f17269c, this.e, (Runnable) this.f17271n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$21((LongSparseIntArray) this.f17271n, this.f17268b, this.f17269c, this.d, this.e, this.f17270f);
                return;
        }
    }

    public p8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j3, int i10, int i11, boolean z10) {
        this.h = notificationsController;
        this.f17271n = longSparseIntArray;
        this.f17268b = arrayList;
        this.f17269c = j3;
        this.d = i10;
        this.e = i11;
        this.f17270f = z10;
    }
}
