package org.telegram.messenger;

import java.util.ArrayList;
public final class i9 implements Runnable {
    public final int f16578a = 1;
    public final MediaDataController f16579b;
    public final boolean f16580c;
    public final int d;
    public final ArrayList e;

    public i9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList) {
        this.f16579b = mediaDataController;
        this.f16580c = z10;
        this.d = i10;
        this.e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16578a) {
            case 0:
                this.f16579b.lambda$loadRecents$48(this.f16580c, this.e, this.d);
                return;
            default:
                this.f16579b.lambda$processLoadedRecentDocuments$53(this.f16580c, this.d, this.e);
                return;
        }
    }

    public i9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10) {
        this.f16579b = mediaDataController;
        this.f16580c = z10;
        this.e = arrayList;
        this.d = i10;
    }
}
