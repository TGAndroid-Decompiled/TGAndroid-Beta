package org.telegram.messenger;

import java.util.ArrayList;
public final class e9 implements Runnable {
    public final int f17740a = 1;
    public final MediaDataController f17741b;
    public final boolean f17742c;
    public final int d;
    public final ArrayList f17743e;

    public e9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList) {
        this.f17741b = mediaDataController;
        this.f17742c = z10;
        this.d = i10;
        this.f17743e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17740a) {
            case 0:
                this.f17741b.lambda$loadRecents$48(this.f17742c, this.f17743e, this.d);
                return;
            default:
                this.f17741b.lambda$processLoadedRecentDocuments$53(this.f17742c, this.d, this.f17743e);
                return;
        }
    }

    public e9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10) {
        this.f17741b = mediaDataController;
        this.f17742c = z10;
        this.f17743e = arrayList;
        this.d = i10;
    }
}
