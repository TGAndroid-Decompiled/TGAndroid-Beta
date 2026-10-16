package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class n8 implements Runnable {
    public final int f17631a = 0;
    public final ArrayList f17632b;
    public final long f17633c;
    public final int d;
    public final int e;
    public final boolean f17634f;
    public final BaseController h;
    public final Object f17635n;

    public n8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j10, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f17634f = z10;
        this.f17632b = arrayList;
        this.d = i10;
        this.f17633c = j10;
        this.e = i11;
        this.f17635n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17631a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f17634f, this.f17632b, this.d, this.f17633c, this.e, (Runnable) this.f17635n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$22((LongSparseIntArray) this.f17635n, this.f17632b, this.f17633c, this.d, this.e, this.f17634f);
                return;
        }
    }

    public n8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j10, int i10, int i11, boolean z10) {
        this.h = notificationsController;
        this.f17635n = longSparseIntArray;
        this.f17632b = arrayList;
        this.f17633c = j10;
        this.d = i10;
        this.e = i11;
        this.f17634f = z10;
    }
}
