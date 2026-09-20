package org.telegram.messenger;

import java.util.ArrayList;
public final class i9 implements Runnable {
    public final int f16626a = 1;
    public final MediaDataController f16627b;
    public final boolean f16628c;
    public final int d;
    public final ArrayList e;

    public i9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList) {
        this.f16627b = mediaDataController;
        this.f16628c = z10;
        this.d = i10;
        this.e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16626a) {
            case 0:
                this.f16627b.lambda$loadRecents$48(this.f16628c, this.e, this.d);
                return;
            default:
                this.f16627b.lambda$processLoadedRecentDocuments$53(this.f16628c, this.d, this.e);
                return;
        }
    }

    public i9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10) {
        this.f16627b = mediaDataController;
        this.f16628c = z10;
        this.e = arrayList;
        this.d = i10;
    }
}
