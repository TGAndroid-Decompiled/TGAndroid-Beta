package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class r8 implements Runnable {
    public final int f19845a = 0;
    public final ArrayList f19846b;
    public final long f19847c;
    public final int d;
    public final int f19848e;
    public final boolean f19849f;
    public final BaseController h;
    public final Object f19850n;

    public r8(MediaDataController mediaDataController, boolean z4, ArrayList arrayList, int i10, long j10, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f19849f = z4;
        this.f19846b = arrayList;
        this.d = i10;
        this.f19847c = j10;
        this.f19848e = i11;
        this.f19850n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19845a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f19849f, this.f19846b, this.d, this.f19847c, this.f19848e, (Runnable) this.f19850n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$21((LongSparseIntArray) this.f19850n, this.f19846b, this.f19847c, this.d, this.f19848e, this.f19849f);
                return;
        }
    }

    public r8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j10, int i10, int i11, boolean z4) {
        this.h = notificationsController;
        this.f19850n = longSparseIntArray;
        this.f19846b = arrayList;
        this.f19847c = j10;
        this.d = i10;
        this.f19848e = i11;
        this.f19849f = z4;
    }
}
