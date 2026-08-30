package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class r8 implements Runnable {
    public final int f18279a = 0;
    public final ArrayList f18280b;
    public final long f18281c;
    public final int d;
    public final int e;
    public final boolean f18282f;
    public final BaseController h;
    public final Object f18283n;

    public r8(MediaDataController mediaDataController, boolean z4, ArrayList arrayList, int i10, long j10, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f18282f = z4;
        this.f18280b = arrayList;
        this.d = i10;
        this.f18281c = j10;
        this.e = i11;
        this.f18283n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18279a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f18282f, this.f18280b, this.d, this.f18281c, this.e, (Runnable) this.f18283n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$21((LongSparseIntArray) this.f18283n, this.f18280b, this.f18281c, this.d, this.e, this.f18282f);
                return;
        }
    }

    public r8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j10, int i10, int i11, boolean z4) {
        this.h = notificationsController;
        this.f18283n = longSparseIntArray;
        this.f18280b = arrayList;
        this.f18281c = j10;
        this.d = i10;
        this.e = i11;
        this.f18282f = z4;
    }
}
