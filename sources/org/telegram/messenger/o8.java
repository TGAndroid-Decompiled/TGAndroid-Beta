package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class o8 implements Runnable {
    public final int f16913a = 0;
    public final ArrayList f16914b;
    public final long f16915c;
    public final int d;
    public final int e;
    public final boolean f16916f;
    public final BaseController h;
    public final Object f16917n;

    public o8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f16916f = z10;
        this.f16914b = arrayList;
        this.d = i10;
        this.f16915c = j3;
        this.e = i11;
        this.f16917n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16913a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f16916f, this.f16914b, this.d, this.f16915c, this.e, (Runnable) this.f16917n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$21((LongSparseIntArray) this.f16917n, this.f16914b, this.f16915c, this.d, this.e, this.f16916f);
                return;
        }
    }

    public o8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j3, int i10, int i11, boolean z10) {
        this.h = notificationsController;
        this.f16917n = longSparseIntArray;
        this.f16914b = arrayList;
        this.f16915c = j3;
        this.d = i10;
        this.e = i11;
        this.f16916f = z10;
    }
}
