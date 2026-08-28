package org.telegram.messenger;

import java.util.ArrayList;
public final class g9 implements Runnable {
    public final int f20364a = 1;
    public final MediaDataController f20365b;
    public final boolean f20366c;
    public final int d;
    public final ArrayList f20367e;

    public g9(MediaDataController mediaDataController, boolean z10, int i9, ArrayList arrayList) {
        this.f20365b = mediaDataController;
        this.f20366c = z10;
        this.d = i9;
        this.f20367e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20364a) {
            case 0:
                this.f20365b.lambda$loadRecents$48(this.f20366c, this.f20367e, this.d);
                return;
            default:
                this.f20365b.lambda$processLoadedRecentDocuments$53(this.f20366c, this.d, this.f20367e);
                return;
        }
    }

    public g9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i9) {
        this.f20365b = mediaDataController;
        this.f20366c = z10;
        this.f20367e = arrayList;
        this.d = i9;
    }
}
