package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class n8 implements Runnable {
    public final int f18466a = 0;
    public final ArrayList f18467b;
    public final long f18468c;
    public final int d;
    public final int f18469e;
    public final boolean f18470f;
    public final BaseController h;
    public final Object f18471n;

    public n8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f18470f = z10;
        this.f18467b = arrayList;
        this.d = i10;
        this.f18468c = j3;
        this.f18469e = i11;
        this.f18471n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18466a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f18470f, this.f18467b, this.d, this.f18468c, this.f18469e, (Runnable) this.f18471n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$21((LongSparseIntArray) this.f18471n, this.f18467b, this.f18468c, this.d, this.f18469e, this.f18470f);
                return;
        }
    }

    public n8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j3, int i10, int i11, boolean z10) {
        this.h = notificationsController;
        this.f18471n = longSparseIntArray;
        this.f18467b = arrayList;
        this.f18468c = j3;
        this.d = i10;
        this.f18469e = i11;
        this.f18470f = z10;
    }
}
