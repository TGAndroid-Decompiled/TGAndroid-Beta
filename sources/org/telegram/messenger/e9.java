package org.telegram.messenger;

import java.util.ArrayList;
public final class e9 implements Runnable {
    public final int f17746a = 1;
    public final MediaDataController f17747b;
    public final boolean f17748c;
    public final int d;
    public final ArrayList f17749e;

    public e9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList) {
        this.f17747b = mediaDataController;
        this.f17748c = z10;
        this.d = i10;
        this.f17749e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17746a) {
            case 0:
                this.f17747b.lambda$loadRecents$48(this.f17748c, this.f17749e, this.d);
                return;
            default:
                this.f17747b.lambda$processLoadedRecentDocuments$53(this.f17748c, this.d, this.f17749e);
                return;
        }
    }

    public e9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10) {
        this.f17747b = mediaDataController;
        this.f17748c = z10;
        this.f17749e = arrayList;
        this.d = i10;
    }
}
