package org.telegram.messenger;

import java.util.ArrayList;
public final class e9 implements Runnable {
    public final int f17741a = 1;
    public final MediaDataController f17742b;
    public final boolean f17743c;
    public final int d;
    public final ArrayList f17744e;

    public e9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList) {
        this.f17742b = mediaDataController;
        this.f17743c = z10;
        this.d = i10;
        this.f17744e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17741a) {
            case 0:
                this.f17742b.lambda$loadRecents$48(this.f17743c, this.f17744e, this.d);
                return;
            default:
                this.f17742b.lambda$processLoadedRecentDocuments$53(this.f17743c, this.d, this.f17744e);
                return;
        }
    }

    public e9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10) {
        this.f17742b = mediaDataController;
        this.f17743c = z10;
        this.f17744e = arrayList;
        this.d = i10;
    }
}
