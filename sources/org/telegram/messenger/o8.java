package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class o8 implements Runnable {
    public final int f16917a = 0;
    public final ArrayList f16918b;
    public final long f16919c;
    public final int d;
    public final int e;
    public final boolean f16920f;
    public final BaseController h;
    public final Object f16921n;

    public o8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f16920f = z10;
        this.f16918b = arrayList;
        this.d = i10;
        this.f16919c = j3;
        this.e = i11;
        this.f16921n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16917a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f16920f, this.f16918b, this.d, this.f16919c, this.e, (Runnable) this.f16921n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$21((LongSparseIntArray) this.f16921n, this.f16918b, this.f16919c, this.d, this.e, this.f16920f);
                return;
        }
    }

    public o8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j3, int i10, int i11, boolean z10) {
        this.h = notificationsController;
        this.f16921n = longSparseIntArray;
        this.f16918b = arrayList;
        this.f16919c = j3;
        this.d = i10;
        this.e = i11;
        this.f16920f = z10;
    }
}
