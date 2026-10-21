package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class m8 implements Runnable {
    public final int f18937a = 0;
    public final ArrayList f18938b;
    public final long f18939c;
    public final int d;
    public final int e;
    public final boolean f18940f;
    public final BaseController h;
    public final Object f18941n;

    public m8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j10, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f18940f = z10;
        this.f18938b = arrayList;
        this.d = i10;
        this.f18939c = j10;
        this.e = i11;
        this.f18941n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18937a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f18940f, this.f18938b, this.d, this.f18939c, this.e, (Runnable) this.f18941n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$22((LongSparseIntArray) this.f18941n, this.f18938b, this.f18939c, this.d, this.e, this.f18940f);
                return;
        }
    }

    public m8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j10, int i10, int i11, boolean z10) {
        this.h = notificationsController;
        this.f18941n = longSparseIntArray;
        this.f18938b = arrayList;
        this.f18939c = j10;
        this.d = i10;
        this.e = i11;
        this.f18940f = z10;
    }
}
