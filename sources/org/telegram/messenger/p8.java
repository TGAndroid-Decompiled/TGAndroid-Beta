package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class p8 implements Runnable {
    public final int f17264a = 0;
    public final ArrayList f17265b;
    public final long f17266c;
    public final int d;
    public final int e;
    public final boolean f17267f;
    public final BaseController h;
    public final Object f17268n;

    public p8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f17267f = z10;
        this.f17265b = arrayList;
        this.d = i10;
        this.f17266c = j3;
        this.e = i11;
        this.f17268n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17264a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f17267f, this.f17265b, this.d, this.f17266c, this.e, (Runnable) this.f17268n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$21((LongSparseIntArray) this.f17268n, this.f17265b, this.f17266c, this.d, this.e, this.f17267f);
                return;
        }
    }

    public p8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j3, int i10, int i11, boolean z10) {
        this.h = notificationsController;
        this.f17268n = longSparseIntArray;
        this.f17265b = arrayList;
        this.f17266c = j3;
        this.d = i10;
        this.e = i11;
        this.f17267f = z10;
    }
}
