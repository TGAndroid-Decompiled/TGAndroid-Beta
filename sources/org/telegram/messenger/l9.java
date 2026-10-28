package org.telegram.messenger;

import java.util.ArrayList;
public final class l9 implements Runnable {
    public final int f20593a = 1;
    public final MediaDataController f20594b;
    public final boolean f20595c;
    public final int d;
    public final ArrayList e;

    public l9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList) {
        this.f20594b = mediaDataController;
        this.f20595c = z10;
        this.d = i10;
        this.e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20593a) {
            case 0:
                this.f20594b.lambda$loadRecents$48(this.f20595c, this.e, this.d);
                return;
            default:
                this.f20594b.lambda$processLoadedRecentDocuments$53(this.f20595c, this.d, this.e);
                return;
        }
    }

    public l9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10) {
        this.f20594b = mediaDataController;
        this.f20595c = z10;
        this.e = arrayList;
        this.d = i10;
    }
}
