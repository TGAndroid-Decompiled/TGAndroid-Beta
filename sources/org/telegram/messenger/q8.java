package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class q8 implements Runnable {
    public final int f21317a = 0;
    public final ArrayList f21318b;
    public final long f21319c;
    public final int d;
    public final int f21320e;
    public final boolean f21321f;
    public final BaseController h;
    public final Object f21322n;

    public q8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j10, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f21321f = z10;
        this.f21318b = arrayList;
        this.d = i10;
        this.f21319c = j10;
        this.f21320e = i11;
        this.f21322n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f21317a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f21321f, this.f21318b, this.d, this.f21319c, this.f21320e, (Runnable) this.f21322n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$21((LongSparseIntArray) this.f21322n, this.f21318b, this.f21319c, this.d, this.f21320e, this.f21321f);
                return;
        }
    }

    public q8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j10, int i10, int i11, boolean z10) {
        this.h = notificationsController;
        this.f21322n = longSparseIntArray;
        this.f21318b = arrayList;
        this.f21319c = j10;
        this.d = i10;
        this.f21320e = i11;
        this.f21321f = z10;
    }
}
