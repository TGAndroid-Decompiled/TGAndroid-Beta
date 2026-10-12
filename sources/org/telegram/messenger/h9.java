package org.telegram.messenger;

import java.util.ArrayList;
public final class h9 implements Runnable {
    public final int f17777a = 1;
    public final MediaDataController f17778b;
    public final boolean f17779c;
    public final int d;
    public final ArrayList f17780e;

    public h9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList) {
        this.f17778b = mediaDataController;
        this.f17779c = z10;
        this.d = i10;
        this.f17780e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17777a) {
            case 0:
                this.f17778b.lambda$loadRecents$48(this.f17779c, this.f17780e, this.d);
                return;
            default:
                this.f17778b.lambda$processLoadedRecentDocuments$53(this.f17779c, this.d, this.f17780e);
                return;
        }
    }

    public h9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10) {
        this.f17778b = mediaDataController;
        this.f17779c = z10;
        this.f17780e = arrayList;
        this.d = i10;
    }
}
