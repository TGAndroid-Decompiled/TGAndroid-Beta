package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class p8 implements Runnable {
    public final int f19248a = 0;
    public final ArrayList f19249b;
    public final long f19250c;
    public final int d;
    public final int e;
    public final boolean f19251f;
    public final BaseController h;
    public final Object f19252n;

    public p8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j10, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f19251f = z10;
        this.f19249b = arrayList;
        this.d = i10;
        this.f19250c = j10;
        this.e = i11;
        this.f19252n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19248a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f19251f, this.f19249b, this.d, this.f19250c, this.e, (Runnable) this.f19252n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$22((LongSparseIntArray) this.f19252n, this.f19249b, this.f19250c, this.d, this.e, this.f19251f);
                return;
        }
    }

    public p8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j10, int i10, int i11, boolean z10) {
        this.h = notificationsController;
        this.f19252n = longSparseIntArray;
        this.f19249b = arrayList;
        this.f19250c = j10;
        this.d = i10;
        this.e = i11;
        this.f19251f = z10;
    }
}
