package org.telegram.messenger;

import java.util.ArrayList;
public final class e9 implements Runnable {
    public final int f18259a = 1;
    public final MediaDataController f18260b;
    public final boolean f18261c;
    public final int d;
    public final ArrayList e;

    public e9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList) {
        this.f18260b = mediaDataController;
        this.f18261c = z10;
        this.d = i10;
        this.e = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18259a) {
            case 0:
                this.f18260b.lambda$loadRecents$48(this.f18261c, this.e, this.d);
                return;
            default:
                this.f18260b.lambda$processLoadedRecentDocuments$53(this.f18261c, this.d, this.e);
                return;
        }
    }

    public e9(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10) {
        this.f18260b = mediaDataController;
        this.f18261c = z10;
        this.e = arrayList;
        this.d = i10;
    }
}
