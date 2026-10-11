package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class k8 implements Runnable {
    public final int f18368a = 0;
    public final ArrayList f18369b;
    public final long f18370c;
    public final int d;
    public final int f18371e;
    public final boolean f18372f;
    public final BaseController h;
    public final Object f18373n;

    public k8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f18372f = z10;
        this.f18369b = arrayList;
        this.d = i10;
        this.f18370c = j3;
        this.f18371e = i11;
        this.f18373n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18368a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f18372f, this.f18369b, this.d, this.f18370c, this.f18371e, (Runnable) this.f18373n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$22((LongSparseIntArray) this.f18373n, this.f18369b, this.f18370c, this.d, this.f18371e, this.f18372f);
                return;
        }
    }

    public k8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j3, int i10, int i11, boolean z10) {
        this.h = notificationsController;
        this.f18373n = longSparseIntArray;
        this.f18369b = arrayList;
        this.f18370c = j3;
        this.d = i10;
        this.f18371e = i11;
        this.f18372f = z10;
    }
}
