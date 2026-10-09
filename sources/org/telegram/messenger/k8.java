package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class k8 implements Runnable {
    public final int f18330a = 0;
    public final ArrayList f18331b;
    public final long f18332c;
    public final int d;
    public final int f18333e;
    public final boolean f18334f;
    public final BaseController h;
    public final Object f18335n;

    public k8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f18334f = z10;
        this.f18331b = arrayList;
        this.d = i10;
        this.f18332c = j3;
        this.f18333e = i11;
        this.f18335n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18330a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f18334f, this.f18331b, this.d, this.f18332c, this.f18333e, (Runnable) this.f18335n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$22((LongSparseIntArray) this.f18335n, this.f18331b, this.f18332c, this.d, this.f18333e, this.f18334f);
                return;
        }
    }

    public k8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j3, int i10, int i11, boolean z10) {
        this.h = notificationsController;
        this.f18335n = longSparseIntArray;
        this.f18331b = arrayList;
        this.f18332c = j3;
        this.d = i10;
        this.f18333e = i11;
        this.f18334f = z10;
    }
}
