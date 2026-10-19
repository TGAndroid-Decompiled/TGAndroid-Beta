package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class k8 implements Runnable {
    public final int f18767a = 0;
    public final ArrayList f18768b;
    public final long f18769c;
    public final int d;
    public final int e;
    public final boolean f18770f;
    public final BaseController h;
    public final Object f18771n;

    public k8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j10, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f18770f = z10;
        this.f18768b = arrayList;
        this.d = i10;
        this.f18769c = j10;
        this.e = i11;
        this.f18771n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18767a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f18770f, this.f18768b, this.d, this.f18769c, this.e, (Runnable) this.f18771n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$22((LongSparseIntArray) this.f18771n, this.f18768b, this.f18769c, this.d, this.e, this.f18770f);
                return;
        }
    }

    public k8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j10, int i10, int i11, boolean z10) {
        this.h = notificationsController;
        this.f18771n = longSparseIntArray;
        this.f18768b = arrayList;
        this.f18769c = j10;
        this.d = i10;
        this.e = i11;
        this.f18770f = z10;
    }
}
