package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class k8 implements Runnable {
    public final int f18334a = 0;
    public final ArrayList f18335b;
    public final long f18336c;
    public final int d;
    public final int f18337e;
    public final boolean f18338f;
    public final BaseController h;
    public final Object f18339n;

    public k8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f18338f = z10;
        this.f18335b = arrayList;
        this.d = i10;
        this.f18336c = j3;
        this.f18337e = i11;
        this.f18339n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18334a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f18338f, this.f18335b, this.d, this.f18336c, this.f18337e, (Runnable) this.f18339n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$22((LongSparseIntArray) this.f18339n, this.f18335b, this.f18336c, this.d, this.f18337e, this.f18338f);
                return;
        }
    }

    public k8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j3, int i10, int i11, boolean z10) {
        this.h = notificationsController;
        this.f18339n = longSparseIntArray;
        this.f18335b = arrayList;
        this.f18336c = j3;
        this.d = i10;
        this.f18337e = i11;
        this.f18338f = z10;
    }
}
