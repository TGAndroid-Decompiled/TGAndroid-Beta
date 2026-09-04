package org.telegram.messenger;

import java.util.ArrayList;
public final class i9 implements Runnable {
    public final int f17954a = 1;
    public final MediaDataController f17955b;
    public final boolean f17956c;
    public final int d;
    public final ArrayList f17957e;

    public i9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList) {
        this.f17955b = mediaDataController;
        this.f17956c = z10;
        this.d = i10;
        this.f17957e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17954a) {
            case 0:
                this.f17955b.lambda$loadRecents$48(this.f17956c, this.f17957e, this.d);
                return;
            default:
                this.f17955b.lambda$processLoadedRecentDocuments$53(this.f17956c, this.d, this.f17957e);
                return;
        }
    }

    public i9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10) {
        this.f17955b = mediaDataController;
        this.f17956c = z10;
        this.f17957e = arrayList;
        this.d = i10;
    }
}
