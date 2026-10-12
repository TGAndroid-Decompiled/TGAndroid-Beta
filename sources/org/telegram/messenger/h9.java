package org.telegram.messenger;

import java.util.ArrayList;
public final class h9 implements Runnable {
    public final int f17778a = 1;
    public final MediaDataController f17779b;
    public final boolean f17780c;
    public final int d;
    public final ArrayList f17781e;

    public h9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList) {
        this.f17779b = mediaDataController;
        this.f17780c = z10;
        this.d = i10;
        this.f17781e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17778a) {
            case 0:
                this.f17779b.lambda$loadRecents$48(this.f17780c, this.f17781e, this.d);
                return;
            default:
                this.f17779b.lambda$processLoadedRecentDocuments$53(this.f17780c, this.d, this.f17781e);
                return;
        }
    }

    public h9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10) {
        this.f17779b = mediaDataController;
        this.f17780c = z10;
        this.f17781e = arrayList;
        this.d = i10;
    }
}
