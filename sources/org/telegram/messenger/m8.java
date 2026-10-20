package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class m8 implements Runnable {
    public final int f18941a = 0;
    public final ArrayList f18942b;
    public final long f18943c;
    public final int d;
    public final int e;
    public final boolean f18944f;
    public final BaseController h;
    public final Object f18945n;

    public m8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j10, int i11, Runnable runnable) {
        this.h = mediaDataController;
        this.f18944f = z10;
        this.f18942b = arrayList;
        this.d = i10;
        this.f18943c = j10;
        this.e = i11;
        this.f18945n = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18941a) {
            case 0:
                ((MediaDataController) this.h).lambda$processLoadedStickers$107(this.f18944f, this.f18942b, this.d, this.f18943c, this.e, (Runnable) this.f18945n);
                return;
            default:
                ((NotificationsController) this.h).lambda$processReadMessages$22((LongSparseIntArray) this.f18945n, this.f18942b, this.f18943c, this.d, this.e, this.f18944f);
                return;
        }
    }

    public m8(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, long j10, int i10, int i11, boolean z10) {
        this.h = notificationsController;
        this.f18945n = longSparseIntArray;
        this.f18942b = arrayList;
        this.f18943c = j10;
        this.d = i10;
        this.e = i11;
        this.f18944f = z10;
    }
}
