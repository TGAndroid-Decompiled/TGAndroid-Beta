package org.telegram.messenger;

import java.util.ArrayList;
public final class p9 implements Runnable {
    public final int f16041a = 1;
    public final MediaDataController f16042b;
    public final boolean f16043c;
    public final int d;
    public final ArrayList e;

    public p9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList) {
        this.f16042b = mediaDataController;
        this.f16043c = z10;
        this.d = i10;
        this.e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16041a) {
            case 0:
                this.f16042b.lambda$loadRecents$48(this.f16043c, this.e, this.d);
                return;
            default:
                this.f16042b.lambda$processLoadedRecentDocuments$53(this.f16043c, this.d, this.e);
                return;
        }
    }

    public p9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10) {
        this.f16042b = mediaDataController;
        this.f16043c = z10;
        this.e = arrayList;
        this.d = i10;
    }
}
