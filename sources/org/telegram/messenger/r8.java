package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class r8 implements Runnable {
    public final int f19843a = 0;
    public final ArrayList f19844b;
    public final long f19845c;
    public final int d;
    public final int f19846e;
    public final boolean f19847f;
    public final BaseController h;
    public final Object f19848n;

    public r8(MediaDataController mediaDataController, boolean z4, ArrayList arrayList, int i10, long j10, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f19847f = z4;
        this.f19844b = arrayList;
        this.d = i10;
        this.f19845c = j10;
        this.f19846e = i11;
        this.f19848n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19843a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f19847f, this.f19844b, this.d, this.f19845c, this.f19846e, (Runnable) this.f19848n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$21((LongSparseIntArray) this.f19848n, this.f19844b, this.f19845c, this.d, this.f19846e, this.f19847f);
                return;
        }
    }

    public r8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j10, int i10, int i11, boolean z4) {
        this.h = notificationsController;
        this.f19848n = longSparseIntArray;
        this.f19844b = arrayList;
        this.f19845c = j10;
        this.d = i10;
        this.f19846e = i11;
        this.f19847f = z4;
    }
}
