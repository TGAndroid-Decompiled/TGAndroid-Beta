package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class n8 implements Runnable {
    public final int f17934a = 0;
    public final ArrayList f17935b;
    public final long f17936c;
    public final int d;
    public final int e;
    public final boolean f17937f;
    public final BaseController h;
    public final Object f17938n;

    public n8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j10, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f17937f = z10;
        this.f17935b = arrayList;
        this.d = i10;
        this.f17936c = j10;
        this.e = i11;
        this.f17938n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17934a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f17937f, this.f17935b, this.d, this.f17936c, this.e, (Runnable) this.f17938n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$22((LongSparseIntArray) this.f17938n, this.f17935b, this.f17936c, this.d, this.e, this.f17937f);
                return;
        }
    }

    public n8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j10, int i10, int i11, boolean z10) {
        this.h = notificationsController;
        this.f17938n = longSparseIntArray;
        this.f17935b = arrayList;
        this.f17936c = j10;
        this.d = i10;
        this.e = i11;
        this.f17937f = z10;
    }
}
