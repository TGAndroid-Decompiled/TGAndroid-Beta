package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class q8 implements Runnable {
    public final int f21012a = 0;
    public final ArrayList f21013b;
    public final long f21014c;
    public final int d;
    public final int e;
    public final boolean f21015f;
    public final BaseController h;
    public final Object f21016n;

    public q8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j10, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f21015f = z10;
        this.f21013b = arrayList;
        this.d = i10;
        this.f21014c = j10;
        this.e = i11;
        this.f21016n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f21012a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f21015f, this.f21013b, this.d, this.f21014c, this.e, (Runnable) this.f21016n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$22((LongSparseIntArray) this.f21016n, this.f21013b, this.f21014c, this.d, this.e, this.f21015f);
                return;
        }
    }

    public q8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j10, int i10, int i11, boolean z10) {
        this.h = notificationsController;
        this.f21016n = longSparseIntArray;
        this.f21013b = arrayList;
        this.f21014c = j10;
        this.d = i10;
        this.e = i11;
        this.f21015f = z10;
    }
}
