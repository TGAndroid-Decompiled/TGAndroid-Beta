package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class p8 implements Runnable {
    public final int f17014a = 0;
    public final ArrayList f17015b;
    public final long f17016c;
    public final int d;
    public final int e;
    public final boolean f17017f;
    public final BaseController h;
    public final Object f17018n;

    public p8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f17017f = z10;
        this.f17015b = arrayList;
        this.d = i10;
        this.f17016c = j3;
        this.e = i11;
        this.f17018n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17014a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f17017f, this.f17015b, this.d, this.f17016c, this.e, (Runnable) this.f17018n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$21((LongSparseIntArray) this.f17018n, this.f17015b, this.f17016c, this.d, this.e, this.f17017f);
                return;
        }
    }

    public p8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j3, int i10, int i11, boolean z10) {
        this.h = notificationsController;
        this.f17018n = longSparseIntArray;
        this.f17015b = arrayList;
        this.f17016c = j3;
        this.d = i10;
        this.e = i11;
        this.f17017f = z10;
    }
}
