package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class r8 implements Runnable {
    public final int f21093a = 0;
    public final ArrayList f21094b;
    public final long f21095c;
    public final int d;
    public final int e;
    public final boolean f21096f;
    public final BaseController h;
    public final Object f21097n;

    public r8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j10, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f21096f = z10;
        this.f21094b = arrayList;
        this.d = i10;
        this.f21095c = j10;
        this.e = i11;
        this.f21097n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f21093a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f21096f, this.f21094b, this.d, this.f21095c, this.e, (Runnable) this.f21097n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$22((LongSparseIntArray) this.f21097n, this.f21094b, this.f21095c, this.d, this.e, this.f21096f);
                return;
        }
    }

    public r8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j10, int i10, int i11, boolean z10) {
        this.h = notificationsController;
        this.f21097n = longSparseIntArray;
        this.f21094b = arrayList;
        this.f21095c = j10;
        this.d = i10;
        this.e = i11;
        this.f21096f = z10;
    }
}
