package org.telegram.messenger;

import java.util.ArrayList;
public final class h9 implements Runnable {
    public final int f17901a = 1;
    public final MediaDataController f17902b;
    public final boolean f17903c;
    public final int d;
    public final ArrayList f17904e;

    public h9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList) {
        this.f17902b = mediaDataController;
        this.f17903c = z10;
        this.d = i10;
        this.f17904e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17901a) {
            case 0:
                this.f17902b.lambda$loadRecents$48(this.f17903c, this.f17904e, this.d);
                return;
            default:
                this.f17902b.lambda$processLoadedRecentDocuments$53(this.f17903c, this.d, this.f17904e);
                return;
        }
    }

    public h9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10) {
        this.f17902b = mediaDataController;
        this.f17903c = z10;
        this.f17904e = arrayList;
        this.d = i10;
    }
}
