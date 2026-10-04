package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class k8 implements Runnable {
    public final int f18341a = 0;
    public final ArrayList f18342b;
    public final long f18343c;
    public final int d;
    public final int f18344e;
    public final boolean f18345f;
    public final BaseController h;
    public final Object f18346n;

    public k8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f18345f = z10;
        this.f18342b = arrayList;
        this.d = i10;
        this.f18343c = j3;
        this.f18344e = i11;
        this.f18346n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18341a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f18345f, this.f18342b, this.d, this.f18343c, this.f18344e, (Runnable) this.f18346n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$21((LongSparseIntArray) this.f18346n, this.f18342b, this.f18343c, this.d, this.f18344e, this.f18345f);
                return;
        }
    }

    public k8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j3, int i10, int i11, boolean z10) {
        this.h = notificationsController;
        this.f18346n = longSparseIntArray;
        this.f18342b = arrayList;
        this.f18343c = j3;
        this.d = i10;
        this.f18344e = i11;
        this.f18345f = z10;
    }
}
